public class Class61 {

	static int staticInt146;
	static int[] staticIntArray77;
	static int[][] staticIntArrayArray8;
	byte aByte2;
	public int anInt212;
	public int anInt213;
	public int anInt214;
	public int anInt215;
	public int anInt216;

	public Class61(Stream var1, boolean var2) {
		aByte2 = var1.readByte();
		anInt212 = var1.method370();
		anInt213 = var1.readInt();
		anInt214 = var1.readInt();
		anInt215 = var1.readInt();
		anInt216 = var1.readInt();
		if (var2) {
			int var3 = 0;
			boolean var5 = false;

			while (true) {
				int var6 = var1.method367();
				if (var6 == 255) {
					Integer var71 = var5 ? Integer.valueOf(var3) : null;
					method285(var71);
					break;
				}

				if (var6 != 0) {
					throw new IllegalStateException("");
				}

				while (true) {
					int var7 = var1.method367();
					if (var7 == 255) {
						break;
					}

					--var1.off;
					if (var1.method370() != 0) {
						throw new IllegalStateException("");
					}

					if (var5) {
						throw new IllegalStateException("");
					}

					var3 = var1.readInt();
					var5 = true;
				}
			}
		}

	}

	void method285(Integer var1) {
	}

	public Class61() {
	}

	public int method286() {
		return (aByte2 & 0x8) == 8 ? 1 : 0;
	}

	void method287(int var1) {
		aByte2 &= -8;
		aByte2 = (byte) (aByte2 | var1 & 0x7);
	}

	void method288(int var1) {
		aByte2 &= -9;
		if (var1 == 1) {
			aByte2 = (byte) (aByte2 | 8);
		}

	}

	public int method289() {
		return aByte2 & 0x7;
	}

}
