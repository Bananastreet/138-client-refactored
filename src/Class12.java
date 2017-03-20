public class Class12 {

	int anInt25;
	int anInt26;
	int[] anIntArray12;
	int[] anIntArray13;
	float[][] aFloatArrayArray1;
	int[] anIntArray14;

	Class12() {
		Static.staticMethod288(24);
		anInt25 = Static.staticMethod288(16);
		anInt26 = Static.staticMethod288(24);
		anIntArray12 = new int[anInt26];
		boolean var2 = Static.staticMethod287() != 0;
		int var4;
		int var6;
		int var7;
		if (var2) {
			var4 = 0;

			for (var7 = Static.staticMethod288(5) + 1; var4 < anInt26; var7++) {
				int var16 = Static.staticMethod288(Static.staticMethod96(anInt26 - var4));

				for (var6 = 0; var6 < var16; var6++) {
					anIntArray12[var4++] = var7;
				}
			}
		} else {
			boolean var151 = Static.staticMethod287() != 0;

			for (var7 = 0; var7 < anInt26; var7++) {
				if (var151 && Static.staticMethod287() == 0) {
					anIntArray12[var7] = 0;
				} else {
					anIntArray12[var7] = Static.staticMethod288(5) + 1;
				}
			}
		}

		method39();
		var4 = Static.staticMethod288(4);
		if (var4 > 0) {
			float var161 = Static.staticMethod292(Static.staticMethod288(32));
			float var15 = Static.staticMethod292(Static.staticMethod288(32));
			var6 = Static.staticMethod288(4) + 1;
			boolean var1 = Static.staticMethod287() != 0;
			int var11;
			if (var4 == 1) {
				var11 = Static.staticMethod56(anInt26, anInt25);
			} else {
				var11 = anInt26 * anInt25;
			}

			anIntArray13 = new int[var11];

			int var9;
			for (var9 = 0; var9 < var11; var9++) {
				anIntArray13[var9] = Static.staticMethod288(var6);
			}

			aFloatArrayArray1 = new float[anInt26][anInt25];
			float var3;
			int var8;
			int var12;
			if (var4 == 1) {
				for (var9 = 0; var9 < anInt26; var9++) {
					var3 = 0.0F;
					var8 = 1;

					for (var12 = 0; var12 < anInt25; var12++) {
						int var17 = var9 / var8 % var11;
						float var10 = anIntArray13[var17] * var15 + var161 + var3;
						aFloatArrayArray1[var9][var12] = var10;
						if (var1) {
							var3 = var10;
						}

						var8 *= var11;
					}
				}
			} else {
				for (var9 = 0; var9 < anInt26; var9++) {
					var3 = 0.0F;
					var8 = var9 * anInt25;

					for (var12 = 0; var12 < anInt25; var12++) {
						float var171 = anIntArray13[var8] * var15 + var161 + var3;
						aFloatArrayArray1[var9][var12] = var171;
						if (var1) {
							var3 = var171;
						}

						++var8;
					}
				}
			}
		}

	}

	void method39() {
		int[] var1 = new int[anInt26];
		int[] var5 = new int[33];

		int var2;
		int var3;
		int var4;
		int var6;
		int var7;
		int var8;
		int var10;
		int var11;
		for (var2 = 0; var2 < anInt26; var2++) {
			var3 = anIntArray12[var2];
			if (var3 != 0) {
				var6 = 1 << 32 - var3;
				var4 = var5[var3];
				var1[var2] = var4;
				if ((var4 & var6) != 0) {
					var7 = var5[var3 - 1];
				} else {
					var7 = var4 | var6;

					for (var8 = var3 - 1; var8 >= 1; --var8) {
						var11 = var5[var8];
						if (var11 != var4) {
							break;
						}

						var10 = 1 << 32 - var8;
						if ((var11 & var10) != 0) {
							var5[var8] = var5[var8 - 1];
							break;
						}

						var5[var8] = var11 | var10;
					}
				}

				var5[var3] = var7;

				for (var8 = var3 + 1; var8 <= 32; var8++) {
					var11 = var5[var8];
					if (var11 == var4) {
						var5[var8] = var7;
					}
				}
			}
		}

		anIntArray14 = new int[8];
		var11 = 0;

		for (var2 = 0; var2 < anInt26; var2++) {
			var3 = anIntArray12[var2];
			if (var3 != 0) {
				var6 = var1[var2];
				var4 = 0;

				for (var7 = 0; var7 < var3; var7++) {
					var8 = Integer.MIN_VALUE >>> var7;
					if ((var6 & var8) != 0) {
						if (anIntArray14[var4] == 0) {
							anIntArray14[var4] = var11;
						}

						var4 = anIntArray14[var4];
					} else {
						++var4;
					}

					if (var4 >= anIntArray14.length) {
						int[] var12 = new int[anIntArray14.length * 2];

						for (var10 = 0; var10 < anIntArray14.length; var10++) {
							var12[var10] = anIntArray14[var10];
						}

						anIntArray14 = var12;
					}

					var8 >>>= 1;
				}

				anIntArray14[var4] = ~var2;
				if (var4 >= var11) {
					var11 = var4 + 1;
				}
			}
		}

	}

	float[] method40() {
		return aFloatArrayArray1[method41()];
	}

	int method41() {
		int var1;
		for (var1 = 0; anIntArray14[var1] >= 0; var1 = Static.staticMethod287() != 0 ? anIntArray14[var1] : var1 + 1) {
			;
		}

		return ~anIntArray14[var1];
	}

}
