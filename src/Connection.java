import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class Connection implements Runnable {

	static Js5IndexImpl staticJs5IndexImpl4;
	byte[] aByteArray5;
	boolean aBool12 = false;
	int anInt146 = 0;
	boolean aBool11 = false;
	Task aTask5;
	int anInt145 = 0;
	TaskManager aTaskManager2;
	Socket aSocket1;
	InputStream anInputStream1;
	OutputStream anOutputStream1;

	public void run() {
		try {
			while (true) {
				label84: {
					int var11;
					int var4;
					synchronized (this) {
						if (anInt146 == anInt145) {
							if (aBool11) {
								break label84;
							}

							try {
								this.wait();
							} catch (InterruptedException var8) {
								;
							}
						}

						var11 = anInt146;
						if (anInt145 >= anInt146) {
							var4 = anInt145 - anInt146;
						} else {
							var4 = 5000 - anInt146;
						}
					}

					if (var4 <= 0) {
						continue;
					}

					try {
						anOutputStream1.write(aByteArray5, var11, var4);
					} catch (IOException var7) {
						aBool12 = true;
					}

					anInt146 = (anInt146 + var4) % 5000;

					try {
						if (anInt146 == anInt145) {
							anOutputStream1.flush();
						}
					} catch (IOException var6) {
						aBool12 = true;
					}
					continue;
				}

				try {
					if (anInputStream1 != null) {
						anInputStream1.close();
					}

					if (anOutputStream1 != null) {
						anOutputStream1.close();
					}

					if (aSocket1 != null) {
						aSocket1.close();
					}
				} catch (IOException var5) {
					;
				}

				aByteArray5 = null;
				break;
			}
		} catch (Exception var10) {
			Static.staticMethod285((String) null, var10);
		}

	}

	public void shutdown() {		
		if (!aBool11) {
			synchronized (this) {
				aBool11 = true;
				notifyAll();
			}

			if (aTask5 != null) {
				while (aTask5.anInt86 == 0) {
					Static.staticMethod303(1L);
				}

				if (aTask5.anInt86 == 1) {
					try {
						((Thread) aTask5.anObject2).join();
					} catch (InterruptedException var2) {
						;
					}
				}
			}

			aTask5 = null;
		}

	}

	protected void finalize() {
		shutdown();
	}

	public Connection(Socket var1, TaskManager var2) throws IOException {
		aTaskManager2 = var2;
		aSocket1 = var1;
		aSocket1.setSoTimeout(30000);
		aSocket1.setTcpNoDelay(true);
		aSocket1.setReceiveBufferSize(16384);
		aSocket1.setSendBufferSize(16384);
		anInputStream1 = aSocket1.getInputStream();
		anOutputStream1 = aSocket1.getOutputStream();
	}

	public int available() throws IOException {
		return aBool11 ? 0 : anInputStream1.available();
	}

	public void write(byte[] var1, int var2, int var3) throws IOException {		
		if (!aBool11) {
			if (aBool12) {
				aBool12 = false;
				throw new IOException();
			}

			if (aByteArray5 == null) {
				aByteArray5 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < var3; var5++) {
					aByteArray5[anInt145] = var1[var5 + var2];
					anInt145 = (anInt145 + 1) % 5000;
					if (anInt145 == (4900 + anInt146) % 5000) {
						throw new IOException();
					}
				}

				if (aTask5 == null) {
					aTask5 = aTaskManager2.method94(this, 3);
				}

				notifyAll();
			}
		}

	}

	public int read() throws IOException {		
		return aBool11 ? 0 : anInputStream1.read();
	}

	public void read(byte[] var1, int var2, int var3) throws IOException {		
		if (!aBool11) {
			while (var3 > 0) {
				int var4 = anInputStream1.read(var1, var2, var3);
				if (var4 <= 0) {
					throw new EOFException();
				}

				var2 += var4;
				var3 -= var4;
			}
		}

	}

}
