public class NodeSub9 extends Node {

	int[] anIntArray61;
	static int[] staticIntArray81;
	boolean aBool25 = false;
	int anInt244;
	boolean aBool26;
	int[] anIntArray60;
	int[] anIntArray62;
	int[] anIntArray64;
	int[] anIntArray63;
	int anInt245;
	int anInt246;

	boolean method308(double var1, int var3, FileStore var4) {
		int var5;
		for (var5 = 0; var5 < anIntArray60.length; var5++) {
			if (var4.method273(anIntArray60[var5]) == null) {
				return false;
			}
		}

		var5 = var3 * var3;
		anIntArray61 = new int[var5];

		for (int var6 = 0; var6 < anIntArray60.length; var6++) {
			Rasterizer2DSub3 var12 = Static.staticMethod193(var4, anIntArray60[var6]);
			var12.method653();
			byte[] var10 = var12.aByteArray35;
			int[] var9 = var12.anIntArray155;
			int var13 = anIntArray63[var6];
			if ((var13 & 0xff000000) == 16777216) {
				;
			}

			if ((var13 & 0xff000000) == 33554432) {
				;
			}

			int var7;
			int var8;
			int var11;
			int var14;
			if ((var13 & 0xff000000) == 50331648) {
				var14 = var13 & 0xff00ff;
				var8 = var13 >> 8 & 0xff;

				for (var11 = 0; var11 < var9.length; var11++) {
					var7 = var9[var11];
					if ((var7 & 0xffff) == var7 >> 8) {
						var7 &= 255;
						var9[var11] = var14 * var7 >> 8 & 0xff00ff | var8 * var7 & 0xff00;
					}
				}
			}

			for (var14 = 0; var14 < var9.length; var14++) {
				var9[var14] = Static.staticMethod447(var9[var14], var1);
			}

			if (var6 == 0) {
				var14 = 0;
			} else {
				var14 = anIntArray62[var6 - 1];
			}

			if (var6 == 0) {
				;
			}

			if (var14 == 0) {
				if (var12.anInt677 == var3) {
					for (var8 = 0; var8 < var5; var8++) {
						anIntArray61[var8] = var9[var10[var8] & 0xff];
					}
				} else if (var12.anInt677 == 64 && var3 == 128) {
					var8 = 0;

					for (var11 = 0; var11 < var3; var11++) {
						for (var7 = 0; var7 < var3; var7++) {
							anIntArray61[var8++] = var9[var10[(var7 >> 1) + (var11 >> 1 << 6)] & 0xff];
						}
					}
				} else {
					if (var12.anInt677 != 128 || var3 != 64) {
						throw new RuntimeException();
					}

					var8 = 0;

					for (var11 = 0; var11 < var3; var11++) {
						for (var7 = 0; var7 < var3; var7++) {
							anIntArray61[var8++] = var9[var10[(var7 << 1) + (var11 << 1 << 7)] & 0xff];
						}
					}
				}
			}

			if (var14 == 1) {
				;
			}

			if (var14 == 2) {
				;
			}

			if (var14 == 3) {
				;
			}
		}

		return true;
	}

	void method309() {
		anIntArray61 = null;
	}

	void method310(int var1) {
		if (anIntArray61 != null) {
			int var2;
			int var3;
			short var4;
			int var5;
			int var6;
			int var7;
			int[] var10;
			if (anInt245 == 1 || anInt245 == 3) {
				if (staticIntArray81 == null || staticIntArray81.length < anIntArray61.length) {
					staticIntArray81 = new int[anIntArray61.length];
				}

				if (anIntArray61.length == 4096) {
					var4 = 64;
				} else {
					var4 = 128;
				}

				var2 = anIntArray61.length;
				var3 = var4 * var1 * anInt246;
				var6 = var2 - 1;
				if (anInt245 == 1) {
					var3 = -var3;
				}

				for (var5 = 0; var5 < var2; var5++) {
					var7 = var5 + var3 & var6;
					staticIntArray81[var5] = anIntArray61[var7];
				}

				var10 = anIntArray61;
				anIntArray61 = staticIntArray81;
				staticIntArray81 = var10;
			}

			if (anInt245 == 2 || anInt245 == 4) {
				if (staticIntArray81 == null || staticIntArray81.length < anIntArray61.length) {
					staticIntArray81 = new int[anIntArray61.length];
				}

				if (anIntArray61.length == 4096) {
					var4 = 64;
				} else {
					var4 = 128;
				}

				var2 = anIntArray61.length;
				var3 = var1 * anInt246;
				var6 = var4 - 1;
				if (anInt245 == 2) {
					var3 = -var3;
				}

				for (var5 = 0; var5 < var2; var5 += var4) {
					for (var7 = 0; var7 < var4; var7++) {
						int var8 = var5 + var7;
						int var9 = var5 + (var7 + var3 & var6);
						staticIntArray81[var8] = anIntArray61[var9];
					}
				}

				var10 = anIntArray61;
				anIntArray61 = staticIntArray81;
				staticIntArray81 = var10;
			}
		}

	}

	NodeSub9(ByteBuf var1) {
		anInt244 = var1.method370();
		aBool26 = var1.method367() == 1;
		int var2 = var1.method367();
		if (var2 >= 1 && var2 <= 4) {
			anIntArray60 = new int[var2];

			int var3;
			for (var3 = 0; var3 < var2; var3++) {
				anIntArray60[var3] = var1.method370();
			}

			if (var2 > 1) {
				anIntArray62 = new int[var2 - 1];

				for (var3 = 0; var3 < var2 - 1; var3++) {
					anIntArray62[var3] = var1.method367();
				}
			}

			if (var2 > 1) {
				anIntArray64 = new int[var2 - 1];

				for (var3 = 0; var3 < var2 - 1; var3++) {
					anIntArray64[var3] = var1.method367();
				}
			}

			anIntArray63 = new int[var2];

			for (var3 = 0; var3 < var2; var3++) {
				anIntArray63[var3] = var1.readInt();
			}

			anInt245 = var1.method367();
			anInt246 = var1.method367();
			anIntArray61 = null;
		} else {
			throw new RuntimeException();
		}
	}

}
