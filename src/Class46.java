public class Class46 {

	static final byte[] staticByteArray4 = new byte[] { (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1,
			(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
			(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
			(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1,
			(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
			(byte) 0, (byte) 0 };
	ByteBuf aStream1 = new ByteBuf((byte[]) null);
	int anInt190;
	int anInt189;
	int[] anIntArray43;
	long aLong15;
	int[] anIntArray40;
	int[] anIntArray41;
	int[] anIntArray42;

	Class46(byte[] var1) {
		method223(var1);
	}

	void method223(byte[] var1) {
		aStream1.buf = var1;
		aStream1.position = 10;
		int var4 = aStream1.method370();
		anInt190 = aStream1.method370();
		anInt189 = 500000;
		anIntArray43 = new int[var4];

		int var2;
		int var3;
		for (var3 = 0; var3 < var4; aStream1.position += var2) {
			int var5 = aStream1.readInt();
			var2 = aStream1.readInt();
			if (var5 == 1297379947) {
				anIntArray43[var3] = aStream1.position;
				++var3;
			}
		}

		aLong15 = 0L;
		anIntArray40 = new int[var4];

		for (var3 = 0; var3 < var4; var3++) {
			anIntArray40[var3] = anIntArray43[var3];
		}

		anIntArray41 = new int[var4];
		anIntArray42 = new int[var4];
	}

	void method224() {
		aStream1.buf = null;
		anIntArray43 = null;
		anIntArray40 = null;
		anIntArray41 = null;
		anIntArray42 = null;
	}

	void method225(int var1) {
		int var2 = aStream1.method339();
		anIntArray41[var1] += var2;
	}

	void method226(int var1) {
		aStream1.position = anIntArray40[var1];
	}

	void method227(int var1) {
		anIntArray40[var1] = aStream1.position;
	}

	int method228(int var1) {
		int var2 = method229(var1);
		return var2;
	}

	int method229(int var1) {
		byte var2 = aStream1.buf[aStream1.position];
		int var5;
		if (var2 < 0) {
			var5 = var2 & 0xff;
			anIntArray42[var1] = var5;
			++aStream1.position;
		} else {
			var5 = anIntArray42[var1];
		}

		if (var5 != 240 && var5 != 247) {
			return method230(var1, var5);
		} else {
			int var3 = aStream1.method339();
			if (var5 == 247 && var3 > 0) {
				int var4 = aStream1.buf[aStream1.position] & 0xff;
				if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252
						|| var4 == 254) {
					++aStream1.position;
					anIntArray42[var1] = var4;
					return method230(var1, var4);
				}
			}

			aStream1.position += var3;
			return 0;
		}
	}

	int method230(int var1, int var2) {
		int var3;
		if (var2 == 255) {
			int var41 = aStream1.method367();
			var3 = aStream1.method339();
			if (var41 == 47) {
				aStream1.position += var3;
				return 1;
			} else if (var41 == 81) {
				int var5 = aStream1.readTriByte();
				var3 -= 3;
				int var6 = anIntArray41[var1];
				aLong15 += (long) var6 * (long) (anInt189 - var5);
				anInt189 = var5;
				aStream1.position += var3;
				return 2;
			} else {
				aStream1.position += var3;
				return 3;
			}
		} else {
			byte var4 = staticByteArray4[var2 - 128];
			var3 = var2;
			if (var4 >= 1) {
				var3 = var2 | aStream1.method367() << 8;
			}

			if (var4 >= 2) {
				var3 |= aStream1.method367() << 16;
			}

			return var3;
		}
	}

	long method231(int var1) {
		return aLong15 + (long) var1 * (long) anInt189;
	}

	int method232() {
		int var1 = anIntArray40.length;
		int var4 = -1;
		int var3 = Integer.MAX_VALUE;

		for (int var2 = 0; var2 < var1; var2++) {
			if (anIntArray40[var2] >= 0 && anIntArray41[var2] < var3) {
				var4 = var2;
				var3 = anIntArray41[var2];
			}
		}

		return var4;
	}

	boolean method233() {
		int var1 = anIntArray40.length;

		for (int var2 = 0; var2 < var1; var2++) {
			if (anIntArray40[var2] >= 0) {
				return false;
			}
		}

		return true;
	}

	void method234() {
		aStream1.position = -1;
	}

	Class46() {
	}

	boolean method235() {
		return aStream1.buf != null;
	}

	void method236(long var1) {
		aLong15 = var1;
		int var4 = anIntArray40.length;

		for (int var3 = 0; var3 < var4; var3++) {
			anIntArray41[var3] = 0;
			anIntArray42[var3] = 0;
			aStream1.position = anIntArray43[var3];
			method225(var3);
			anIntArray40[var3] = aStream1.position;
		}

	}

	int method237() {
		return anIntArray40.length;
	}

}
