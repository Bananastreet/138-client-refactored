import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class FileOnDisk {

	static Task staticTask1;
	static int staticInt37;
	public static int staticInt38;
	static int staticInt39;
	long aLong13;
	RandomAccessFile aRandomAccessFile1;
	long aLong12;

	public final int method84(byte[] var1, int var2, int var3) throws IOException {
		int var4 = aRandomAccessFile1.read(var1, var2, var3);
		if (var4 > 0) {
			aLong13 += var4;
		}

		return var4;
	}

	final void method85(long var1) throws IOException {
		aRandomAccessFile1.seek(var1);
		aLong13 = var1;
	}

	public final void method86() throws IOException {
		if (aRandomAccessFile1 != null) {
			aRandomAccessFile1.close();
			aRandomAccessFile1 = null;
		}

	}

	public final long method87() throws IOException {
		return aRandomAccessFile1.length();
	}

	public final void method88(byte[] var1, int var2, int var3) throws IOException {
		if (aLong13 + var3 > aLong12) {
			aRandomAccessFile1.seek(1L + aLong12);
			aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			aRandomAccessFile1.write(var1, var2, var3);
			aLong13 += var3;
		}
	}

	protected void finalize() throws Throwable {
		if (aRandomAccessFile1 != null) {
			System.out.println("");
			method86();
		}

	}

	public FileOnDisk(File var1, String var2, long var3) throws IOException {
		if (var3 == -1L) {
			var3 = Long.MAX_VALUE;
		}

		if (var1.length() >= var3) {
			var1.delete();
		}

		aRandomAccessFile1 = new RandomAccessFile(var1, var2);
		aLong12 = var3;
		aLong13 = 0L;
		int var5 = aRandomAccessFile1.read();
		if (var5 != -1 && !var2.equals("r")) {
			aRandomAccessFile1.seek(0L);
			aRandomAccessFile1.write(var5);
		}

		aRandomAccessFile1.seek(0L);
	}

}
