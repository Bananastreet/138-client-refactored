public class Class20 {

	static int staticInt36;
	static ContextMenuItem staticContextMenuItem1;
	static Sprite[] staticRasterizer2DSub3Array1;
	int anInt56;
	int anInt57;
	int[][] anIntArrayArray2;

	public Class20(int var1, int var2) {
		if (var1 != var2) {
			int var6 = var1;
			int var4 = var2;
			if (var2 > var1) {
				var6 = var2;
				var4 = var1;
			}

			int var5;
			while (var4 != 0) {
				var5 = var6 % var4;
				var6 = var4;
				var4 = var5;
			}

			var1 /= var6;
			var2 /= var6;
			anInt56 = var1;
			anInt57 = var2;
			anIntArrayArray2 = new int[var1][14];

			for (var5 = 0; var5 < var1; var5++) {
				int[] var15 = anIntArrayArray2[var5];
				double var16 = (double) var5 / (double) var1 + 6.0D;
				int var3 = (int) Math.floor(var16 - 7.0D + 1.0D);
				if (var3 < 0) {
					var3 = 0;
				}

				int var18 = (int) Math.ceil(7.0D + var16);
				if (var18 > 14) {
					var18 = 14;
				}

				for (double var13 = (double) var2 / (double) var1; var3 < var18; var3++) {
					double var11 = 3.141592653589793D * (var3 - var16);
					double var9 = var13;
					if (var11 < -1.0E-4D || var11 > 1.0E-4D) {
						var9 = var13 * (Math.sin(var11) / var11);
					}

					var9 *= 0.54D + 0.46D * Math.cos((var3 - var16) * 0.2243994752564138D);
					var15[var3] = (int) Math.floor(var9 * 65536.0D + 0.5D);
				}
			}
		}

	}

	byte[] method80(byte[] var1) {
		if (anIntArrayArray2 != null) {
			int var3 = 14 + (int) ((long) var1.length * (long) anInt57 / anInt56);
			int[] var4 = new int[var3];
			int var5 = 0;
			int var6 = 0;

			int var2;
			for (var2 = 0; var2 < var1.length; var2++) {
				byte var10 = var1[var2];
				int[] var7 = anIntArrayArray2[var6];

				int var9;
				for (var9 = 0; var9 < 14; var9++) {
					var4[var9 + var5] += var10 * var7[var9];
				}

				var6 += anInt57;
				var9 = var6 / anInt56;
				var5 += var9;
				var6 -= anInt56 * var9;
			}

			var1 = new byte[var3];

			for (var2 = 0; var2 < var3; var2++) {
				int var101 = var4[var2] + '\u8000' >> 16;
				if (var101 < -128) {
					var1[var2] = -128;
				} else if (var101 > 127) {
					var1[var2] = 127;
				} else {
					var1[var2] = (byte) var101;
				}
			}
		}

		return var1;
	}

	int method81(int var1) {
		if (anIntArrayArray2 != null) {
			var1 = (int) ((long) var1 * (long) anInt57 / anInt56);
		}

		return var1;
	}

	int method82(int var1) {
		if (anIntArrayArray2 != null) {
			var1 = (int) ((long) var1 * (long) anInt57 / anInt56) + 6;
		}

		return var1;
	}

}
