import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class TaskManager implements Runnable {

	static int staticInt40;
	boolean aBool8 = false;
	Task aTask2 = null;
	Task aTask3 = null;
	static String staticString19;
	static String staticString20;
	public EventQueue anEventQueue1;
	Thread aThread1;

	final void method91() {
		synchronized (this) {
			aBool8 = true;
			notifyAll();
		}

		try {
			aThread1.join();
		} catch (InterruptedException var2) {
			;
		}

	}

	public final void run() {
		while (true) {
			Task var2;
			synchronized (this) {
				while (true) {
					if (aBool8) {
						return;
					}

					if (aTask2 != null) {
						var2 = aTask2;
						aTask2 = aTask2.aTask4;
						if (aTask2 == null) {
							aTask3 = null;
						}
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var61) {
						;
					}
				}
			}

			try {
				int var6 = var2.anInt87;
				if (var6 == 1) {
					var2.anObject2 = new Socket(InetAddress.getByName((String) var2.anObject1), var2.anInt85);
				} else if (var6 == 2) {
					Thread var9 = new Thread((Runnable) var2.anObject1);
					var9.setDaemon(true);
					var9.start();
					var9.setPriority(var2.anInt85);
					var2.anObject2 = var9;
				} else if (var6 == 4) {
					var2.anObject2 = new DataInputStream(((URL) var2.anObject1).openStream());
				} else if (var6 == 3) {
					String var91 = (var2.anInt85 >> 24 & 0xff) + "." + (var2.anInt85 >> 16 & 0xff) + "."
							+ (var2.anInt85 >> 8 & 0xff) + "." + (var2.anInt85 & 0xff);
					var2.anObject2 = InetAddress.getByName(var91).getHostName();
				}

				var2.anInt86 = 1;
			} catch (ThreadDeath var4) {
				throw var4;
			} catch (Throwable var5) {
				var2.anInt86 = 2;
			}
		}
	}

	final Task method92(int var1, int var2, int var3, Object var4) {
		Task var5 = new Task();
		var5.anInt87 = var1;
		var5.anInt85 = var2;
		var5.anObject1 = var4;
		synchronized (this) {
			if (aTask3 != null) {
				aTask3.aTask4 = var5;
				aTask3 = var5;
			} else {
				aTask3 = aTask2 = var5;
			}

			notify();
			return var5;
		}
	}

	public final Task method93(String var1, int var2) {
		return method92(1, var2, 0, var1);
	}

	public final Task method94(Runnable var1, int var2) {
		return method92(2, var2, 0, var1);
	}

	public final Task method95(int var1) {
		return method92(3, var1, 0, (Object) null);
	}

	TaskManager() {
		staticString19 = "Unknown";
		staticString20 = "1.1";

		try {
			staticString19 = System.getProperty("java.vendor");
			staticString20 = System.getProperty("java.version");
		} catch (Exception var3) {
			;
		}

		try {
			anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var2) {
			;
		}

		aBool8 = false;
		aThread1 = new Thread(this);
		aThread1.setPriority(10);
		aThread1.setDaemon(true);
		aThread1.start();
	}

	public final Task method96(URL var1) {
		return method92(4, 0, 0, var1);
	}

}
