import java.io.EOFException;
import java.io.IOException;

public class BufferedFile {

	public static TaskManager staticTaskManager1;
	public static Stream staticStream2;
	long aLong6;
	long aLong3 = -1L;
	long aLong4 = -1L;
	int anInt38 = 0;
	FileOnDisk aFileOnDisk1;
	long aLong8;
	long aLong5;
	byte[] aByteArray3;
	byte[] aByteArray4;
	int anInt37;
	long aLong7;

	public void method51() throws IOException {
		method56();
		aFileOnDisk1.method86();
	}

	public void method52(long var1) throws IOException {
		if (var1 < 0L) {
			throw new IOException("");
		} else {
			aLong6 = var1;
		}
	}

	public void method53(byte[] var1) throws IOException {
		method58(var1, 0, var1.length);
	}

	public BufferedFile(FileOnDisk var1, int var2, int var3) throws IOException {
		aFileOnDisk1 = var1;
		aLong5 = aLong8 = var1.method87();
		aByteArray3 = new byte[var2];
		aByteArray4 = new byte[var3];
		aLong6 = 0L;
	}

	void method54() throws IOException {
		anInt37 = 0;
		if (aLong6 != aLong7) {
			aFileOnDisk1.method85(aLong6);
			aLong7 = aLong6;
		}

		int var1;
		for (aLong3 = aLong6; anInt37 < aByteArray3.length; anInt37 += var1) {
			var1 = aFileOnDisk1.method84(aByteArray3, anInt37, aByteArray3.length - anInt37);
			if (var1 == -1) {
				break;
			}

			aLong7 += var1;
		}

	}

	public void method55(byte[] var1, int var2, int var3) throws IOException {
		try {
			if (var3 + aLong6 > aLong5) {
				aLong5 = aLong6 + var3;
			}

			if (aLong4 != -1L && (aLong6 < aLong4 || aLong6 > aLong4 + anInt38)) {
				method56();
			}

			if (aLong4 != -1L && var3 + aLong6 > aLong4 + aByteArray4.length) {
				int var10 = (int) (aByteArray4.length - (aLong6 - aLong4));
				System.arraycopy(var1, var2, aByteArray4, (int) (aLong6 - aLong4), var10);
				aLong6 += var10;
				var2 += var10;
				var3 -= var10;
				anInt38 = aByteArray4.length;
				method56();
			}

			if (var3 <= aByteArray4.length) {
				if (var3 > 0) {
					if (aLong4 == -1L) {
						aLong4 = aLong6;
					}

					System.arraycopy(var1, var2, aByteArray4, (int) (aLong6 - aLong4), var3);
					aLong6 += var3;
					if (aLong6 - aLong4 > anInt38) {
						anInt38 = (int) (aLong6 - aLong4);
					}
				}
			} else {
				if (aLong6 != aLong7) {
					aFileOnDisk1.method85(aLong6);
					aLong7 = aLong6;
				}

				aFileOnDisk1.method88(var1, var2, var3);
				aLong7 += var3;
				if (aLong7 > aLong8) {
					aLong8 = aLong7;
				}

				long var101 = -1L;
				long var7 = -1L;
				if (aLong6 >= aLong3 && aLong6 < aLong3 + anInt37) {
					var101 = aLong6;
				} else if (aLong3 >= aLong6 && aLong3 < aLong6 + var3) {
					var101 = aLong3;
				}

				if (var3 + aLong6 > aLong3 && aLong6 + var3 <= aLong3 + anInt37) {
					var7 = aLong6 + var3;
				} else if (aLong3 + anInt37 > aLong6 && anInt37 + aLong3 <= aLong6 + var3) {
					var7 = anInt37 + aLong3;
				}

				if (var101 > -1L && var7 > var101) {
					int var9 = (int) (var7 - var101);
					System.arraycopy(var1, (int) (var101 + var2 - aLong6), aByteArray3, (int) (var101 - aLong3), var9);
				}

				aLong6 += var3;
			}

		} catch (IOException var91) {
			aLong7 = -1L;
			throw var91;
		}
	}

	void method56() throws IOException {
		if (aLong4 != -1L) {
			if (aLong7 != aLong4) {
				aFileOnDisk1.method85(aLong4);
				aLong7 = aLong4;
			}

			aFileOnDisk1.method88(aByteArray4, 0, anInt38);
			aLong7 += anInt38;
			if (aLong7 > aLong8) {
				aLong8 = aLong7;
			}

			long var3 = -1L;
			long var1 = -1L;
			if (aLong4 >= aLong3 && aLong4 < aLong3 + anInt37) {
				var3 = aLong4;
			} else if (aLong3 >= aLong4 && aLong3 < aLong4 + anInt38) {
				var3 = aLong3;
			}

			if (aLong4 + anInt38 > aLong3 && aLong4 + anInt38 <= aLong3 + anInt37) {
				var1 = anInt38 + aLong4;
			} else if (anInt37 + aLong3 > aLong4 && aLong3 + anInt37 <= anInt38 + aLong4) {
				var1 = anInt37 + aLong3;
			}

			if (var3 > -1L && var1 > var3) {
				int var5 = (int) (var1 - var3);
				System.arraycopy(aByteArray4, (int) (var3 - aLong4), aByteArray3, (int) (var3 - aLong3), var5);
			}

			aLong4 = -1L;
			anInt38 = 0;
		}

	}

	public long method57() {
		return aLong5;
	}

	public void method58(byte[] var1, int var2, int var3) throws IOException {
		try {
			if (var3 + var2 > var1.length) {
				throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
			}

			if (aLong4 != -1L && aLong6 >= aLong4 && aLong6 + var3 <= anInt38 + aLong4) {
				System.arraycopy(aByteArray4, (int) (aLong6 - aLong4), var1, var2, var3);
				aLong6 += var3;
				return;
			}

			long var15 = aLong6;
			int var7 = var3;
			int var8;
			if (aLong6 >= aLong3 && aLong6 < aLong3 + anInt37) {
				var8 = (int) (anInt37 - (aLong6 - aLong3));
				if (var8 > var3) {
					var8 = var3;
				}

				System.arraycopy(aByteArray3, (int) (aLong6 - aLong3), var1, var2, var8);
				aLong6 += var8;
				var2 += var8;
				var3 -= var8;
			}

			if (var3 > aByteArray3.length) {
				aFileOnDisk1.method85(aLong6);

				for (aLong7 = aLong6; var3 > 0; var3 -= var8) {
					var8 = aFileOnDisk1.method84(var1, var2, var3);
					if (var8 == -1) {
						break;
					}

					aLong7 += var8;
					aLong6 += var8;
					var2 += var8;
				}
			} else if (var3 > 0) {
				method54();
				var8 = var3;
				if (var3 > anInt37) {
					var8 = anInt37;
				}

				System.arraycopy(aByteArray3, 0, var1, var2, var8);
				var2 += var8;
				var3 -= var8;
				aLong6 += var8;
			}

			if (aLong4 != -1L) {
				if (aLong4 > aLong6 && var3 > 0) {
					var8 = (int) (aLong4 - aLong6) + var2;
					if (var8 > var2 + var3) {
						var8 = var3 + var2;
					}

					while (var2 < var8) {
						var1[var2++] = 0;
						--var3;
						++aLong6;
					}
				}

				long var9 = -1L;
				long var11 = -1L;
				if (aLong4 >= var15 && aLong4 < var7 + var15) {
					var9 = aLong4;
				} else if (var15 >= aLong4 && var15 < anInt38 + aLong4) {
					var9 = var15;
				}

				if (aLong4 + anInt38 > var15 && anInt38 + aLong4 <= var15 + var7) {
					var11 = aLong4 + anInt38;
				} else if (var7 + var15 > aLong4 && var7 + var15 <= anInt38 + aLong4) {
					var11 = var15 + var7;
				}

				if (var9 > -1L && var11 > var9) {
					int var13 = (int) (var11 - var9);
					System.arraycopy(aByteArray4, (int) (var9 - aLong4), var1, var2 + (int) (var9 - var15), var13);
					if (var11 > aLong6) {
						var3 = (int) (var3 - (var11 - aLong6));
						aLong6 = var11;
					}
				}
			}
		} catch (IOException var131) {
			aLong7 = -1L;
			throw var131;
		}

		if (var3 > 0) {
			throw new EOFException();
		}
	}

}
