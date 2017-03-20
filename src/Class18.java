public class Class18 {

	static float[][] staticFloatArrayArray1 = new float[2][8];
	static int[][] staticIntArrayArray4 = new int[2][8];
	int[] anIntArray26 = new int[2];
	int[][][] anIntArrayArrayArray1 = new int[2][2][4];
	int[][][] anIntArrayArrayArray2 = new int[2][2][4];
	int[] anIntArray25 = new int[2];
	static float staticFloat1;
	static int staticInt34;

	float method62(int var1, int var2, float var3) {
		float var4 = anIntArrayArrayArray2[var1][0][var2]
				+ var3 * (anIntArrayArrayArray2[var1][1][var2] - anIntArrayArrayArray2[var1][0][var2]);
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	float method63(int var1, int var2, float var3) {
		float var4 = anIntArrayArrayArray1[var1][0][var2]
				+ var3 * (anIntArrayArrayArray1[var1][1][var2] - anIntArrayArrayArray1[var1][0][var2]);
		var4 *= 1.2207031E-4F;
		return Static.staticMethod62(var4);
	}

	int method64(int var1, float var2) {
		float var3;
		if (var1 == 0) {
			var3 = anIntArray25[0] + (anIntArray25[1] - anIntArray25[0]) * var2;
			var3 *= 0.0030517578F;
			staticFloat1 = (float) Math.pow(0.1D, var3 / 20.0F);
			staticInt34 = (int) (staticFloat1 * 65536.0F);
		}

		if (anIntArray26[var1] == 0) {
			return 0;
		} else {
			var3 = method62(var1, 0, var2);
			staticFloatArrayArray1[var1][0] = -2.0F * var3 * (float) Math.cos(method63(var1, 0, var2));
			staticFloatArrayArray1[var1][1] = var3 * var3;

			int var4;
			for (var4 = 1; var4 < anIntArray26[var1]; var4++) {
				var3 = method62(var1, var4, var2);
				float var6 = -2.0F * var3 * (float) Math.cos(method63(var1, var4, var2));
				float var7 = var3 * var3;
				staticFloatArrayArray1[var1][var4 * 2 + 1] = staticFloatArrayArray1[var1][var4 * 2 - 1] * var7;
				staticFloatArrayArray1[var1][var4 * 2] = staticFloatArrayArray1[var1][var4 * 2 - 1] * var6
						+ staticFloatArrayArray1[var1][var4 * 2 - 2] * var7;

				for (int var5 = var4 * 2 - 1; var5 >= 2; --var5) {
					staticFloatArrayArray1[var1][var5] += staticFloatArrayArray1[var1][var5 - 1] * var6
							+ staticFloatArrayArray1[var1][var5 - 2] * var7;
				}

				staticFloatArrayArray1[var1][1] += staticFloatArrayArray1[var1][0] * var6 + var7;
				staticFloatArrayArray1[var1][0] += var6;
			}

			if (var1 == 0) {
				for (var4 = 0; var4 < anIntArray26[0] * 2; var4++) {
					staticFloatArrayArray1[0][var4] *= staticFloat1;
				}
			}

			for (var4 = 0; var4 < anIntArray26[var1] * 2; var4++) {
				staticIntArrayArray4[var1][var4] = (int) (staticFloatArrayArray1[var1][var4] * 65536.0F);
			}

			return anIntArray26[var1] * 2;
		}
	}

	final void method65(Stream var1, Class14 var2) {
		int var3 = var1.method367();
		anIntArray26[0] = var3 >> 4;
		anIntArray26[1] = var3 & 0xf;
		if (var3 != 0) {
			anIntArray25[0] = var1.method370();
			anIntArray25[1] = var1.method370();
			int var7 = var1.method367();

			int var4;
			int var5;
			for (var4 = 0; var4 < 2; var4++) {
				for (var5 = 0; var5 < anIntArray26[var4]; var5++) {
					anIntArrayArrayArray1[var4][0][var5] = var1.method370();
					anIntArrayArrayArray2[var4][0][var5] = var1.method370();
				}
			}

			for (var4 = 0; var4 < 2; var4++) {
				for (var5 = 0; var5 < anIntArray26[var4]; var5++) {
					if ((var7 & 1 << var4 * 4 << var5) != 0) {
						anIntArrayArrayArray1[var4][1][var5] = var1.method370();
						anIntArrayArrayArray2[var4][1][var5] = var1.method370();
					} else {
						anIntArrayArrayArray1[var4][1][var5] = anIntArrayArrayArray1[var4][0][var5];
						anIntArrayArrayArray2[var4][1][var5] = anIntArrayArrayArray2[var4][0][var5];
					}
				}
			}

			if (var7 != 0 || anIntArray25[1] != anIntArray25[0]) {
				var2.method47(var1);
			}
		} else {
			int[] var71 = anIntArray25;
			anIntArray25[1] = 0;
			var71[0] = 0;
		}

	}

}
