public class Residue {

	int anInt63 = Static.staticMethod288(16);
	int anInt61 = Static.staticMethod288(24);
	int anInt62 = Static.staticMethod288(24);
	int anInt60 = Static.staticMethod288(24) + 1;
	int anInt64 = Static.staticMethod288(6) + 1;
	int anInt65 = Static.staticMethod288(8);
	int[] anIntArray30;

	void method83(float[] var1, int var2, boolean var3) {
		int var4;
		for (var4 = 0; var4 < var2; var4++) {
			var1[var4] = 0.0F;
		}

		if (!var3) {
			var4 = NodeSub5.staticClass12Array1[anInt65].anInt25;
			int var18 = anInt62 - anInt61;
			int var7 = var18 / anInt60;
			int[] var8 = new int[var7];

			for (int var9 = 0; var9 < 8; var9++) {
				int var17 = 0;

				while (var17 < var7) {
					int var6;
					int var16;
					if (var9 == 0) {
						var16 = NodeSub5.staticClass12Array1[anInt65].method41();

						for (var6 = var4 - 1; var6 >= 0; --var6) {
							if (var17 + var6 < var7) {
								var8[var17 + var6] = var16 % anInt64;
							}

							var16 /= anInt64;
						}
					}

					for (var16 = 0; var16 < var4; var16++) {
						var6 = var8[var17];
						int var5 = anIntArray30[var6 * 8 + var9];
						if (var5 >= 0) {
							int var11 = anInt61 + var17 * anInt60;
							Class12 var15 = NodeSub5.staticClass12Array1[var5];
							int var13;
							if (anInt63 == 0) {
								var13 = anInt60 / var15.anInt25;

								for (int var19 = 0; var19 < var13; var19++) {
									float[] var20 = var15.method40();

									for (int var12 = 0; var12 < var15.anInt25; var12++) {
										var1[var11 + var19 + var12 * var13] += var20[var12];
									}
								}
							} else {
								var13 = 0;

								while (var13 < anInt60) {
									float[] var10 = var15.method40();

									for (int var14 = 0; var14 < var15.anInt25; var14++) {
										var1[var11 + var13] += var10[var14];
										++var13;
									}
								}
							}
						}

						++var17;
						if (var17 >= var7) {
							break;
						}
					}
				}
			}
		}

	}

	Residue() {
		int[] var1 = new int[anInt64];

		int var2;
		for (var2 = 0; var2 < anInt64; var2++) {
			int var3 = 0;
			int var5 = Static.staticMethod288(3);
			boolean var4 = Static.staticMethod287() != 0;
			if (var4) {
				var3 = Static.staticMethod288(5);
			}

			var1[var2] = var3 << 3 | var5;
		}

		anIntArray30 = new int[anInt64 * 8];

		for (var2 = 0; var2 < anInt64 * 8; var2++) {
			anIntArray30[var2] = (var1[var2 >> 3] & 1 << (var2 & 0x7)) != 0 ? Static.staticMethod288(8) : -1;
		}

	}

}
