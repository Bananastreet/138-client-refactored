public class Model extends Entity {

	public static int staticInt339 = 0;
	static byte[] staticByteArray8 = new byte[1];
	static byte[] staticByteArray7 = new byte[1];
	static Model staticModel2 = new Model();
	static Model staticModel1 = new Model();
	static boolean[] staticBoolArray10 = new boolean[4700];
	static boolean[] staticBoolArray11 = new boolean[4700];
	static int[] staticIntArray141 = new int[4700];
	static int[] staticIntArray142 = new int[4700];
	static int[] staticIntArray143 = new int[4700];
	static int[] staticIntArray137 = new int[4700];
	static int[] staticIntArray144 = new int[4700];
	static int[] staticIntArray139 = new int[4700];
	static int[] staticIntArray146 = new int[1600];
	static int[][] staticIntArrayArray10 = new int[1600][512];
	static int[] staticIntArray145 = new int[12];
	static int[][] staticIntArrayArray11 = new int[12][2000];
	static int[] staticIntArray148 = new int[2000];
	static int[] staticIntArray149 = new int[2000];
	static int[] staticIntArray150 = new int[12];
	static int[] staticIntArray151 = new int[10];
	static int[] staticIntArray135 = new int[10];
	static int[] staticIntArray152 = new int[10];
	public static boolean staticBool47 = false;
	public static int staticInt337 = 0;
	public static int staticInt338 = 0;
	public static int[] staticIntArray153 = new int[1000];
	static int[] staticIntArray147;
	static int[] staticIntArray138;
	static int[] staticIntArray136;
	static int[] staticIntArray140;
	int anInt660 = 0;
	int anInt666 = 0;
	int anInt662 = 0;
	int[] anIntArray139;
	int[] anIntArray145;
	int[] anIntArray140;
	int[] anIntArray141;
	int[] anIntArray146;
	int[] anIntArray142;
	int[] anIntArray147;
	int[] anIntArray144;
	byte[] aByteArray33;
	byte[] aByteArray31;
	byte[] aByteArray32;
	short[] aShortArray33;
	byte aByte7 = 0;
	int[] anIntArray148;
	int[] anIntArray138;
	int[] anIntArray143;
	int[][] anIntArrayArray15;
	int[][] anIntArrayArray16;
	public boolean aBool80 = false;
	int[] anIntArray137;
	int anInt659;
	int anInt663;
	int anInt661;
	int anInt665;
	int anInt664;
	static int staticInt335;
	static int staticInt334;
	static int staticInt336;

	static {
		staticIntArray147 = Rasterizer2DSub1.staticIntArray154;
		staticIntArray138 = Rasterizer2DSub1.staticIntArray159;
		staticIntArray136 = Rasterizer2DSub1.staticIntArray155;
		staticIntArray140 = Rasterizer2DSub1.staticIntArray157;
	}

	void method435(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		staticIntArray146[0] = -1;
		if (anInt659 != 1) {
			method592();
		}

		int var10 = var8 * var5 - var6 * var4 >> 16;
		int var11 = var7 * var2 + var10 * var3 >> 16;
		int var12 = anInt661 * var3 >> 16;
		int var13 = var11 + var12;
		if (var13 > 50 && var11 < 3500) {
			int var14 = var8 * var4 + var6 * var5 >> 16;
			int var15 = (var14 - anInt661) * Rasterizer2DSub1.staticInt342;
			if (var15 / var13 < Rasterizer2DSub1.staticInt341) {
				int var16 = (var14 + anInt661) * Rasterizer2DSub1.staticInt342;
				if (var16 / var13 > Rasterizer2DSub1.staticInt345) {
					int var17 = var7 * var3 - var10 * var2 >> 16;
					int var18 = anInt661 * var2 >> 16;
					int var19 = (var17 + var18) * Rasterizer2DSub1.staticInt342;
					if (var19 / var13 > Rasterizer2DSub1.staticInt346) {
						int var20 = var18 + (anInt421 * var3 >> 16);
						int var21 = (var17 - var20) * Rasterizer2DSub1.staticInt342;
						if (var21 / var13 < Rasterizer2DSub1.staticInt347) {
							int var22 = var12 + (anInt421 * var2 >> 16);
							boolean var23 = false;
							boolean var24 = false;
							if (var11 - var22 <= 50) {
								var24 = true;
							}

							boolean var25 = var24 || anInt662 > 0;
							boolean var26 = false;
							int var27;
							int var28;
							int var29;
							if (var9 > 0 && staticBool47) {
								var27 = var11 - var12;
								if (var27 <= 50) {
									var27 = 50;
								}

								if (var14 > 0) {
									var15 /= var13;
									var16 /= var27;
								} else {
									var16 /= var13;
									var15 /= var27;
								}

								if (var17 > 0) {
									var21 /= var13;
									var19 /= var27;
								} else {
									var19 /= var13;
									var21 /= var27;
								}

								var28 = staticInt337 - Rasterizer2DSub1.staticInt344;
								var29 = staticInt338 - Rasterizer2DSub1.staticInt349;
								if (var28 > var15 && var28 < var16 && var29 > var21 && var29 < var19) {
									if (aBool80) {
										staticIntArray153[staticInt339++] = var9;
									} else {
										var26 = true;
									}
								}
							}

							var27 = Rasterizer2DSub1.staticInt344;
							var28 = Rasterizer2DSub1.staticInt349;
							var29 = 0;
							int var30 = 0;
							if (var1 != 0) {
								var29 = staticIntArray147[var1];
								var30 = staticIntArray138[var1];
							}

							for (int var31 = 0; var31 < anInt660; var31++) {
								int var32 = anIntArray139[var31];
								int var33 = anIntArray137[var31];
								int var34 = anIntArray145[var31];
								int var35;
								if (var1 != 0) {
									var35 = var34 * var29 + var32 * var30 >> 16;
									var34 = var34 * var30 - var32 * var29 >> 16;
									var32 = var35;
								}

								var32 += var6;
								var33 += var7;
								var34 += var8;
								var35 = var34 * var4 + var32 * var5 >> 16;
								var34 = var34 * var5 - var32 * var4 >> 16;
								var32 = var35;
								var35 = var33 * var3 - var34 * var2 >> 16;
								var34 = var33 * var2 + var34 * var3 >> 16;
								staticIntArray143[var31] = var34 - var11;
								if (var34 >= 50) {
									staticIntArray141[var31] = var27 + var32 * Rasterizer2DSub1.staticInt342 / var34;
									staticIntArray142[var31] = var28 + var35 * Rasterizer2DSub1.staticInt342 / var34;
								} else {
									staticIntArray141[var31] = -5000;
									var23 = true;
								}

								if (var25) {
									staticIntArray137[var31] = var32;
									staticIntArray144[var31] = var35;
									staticIntArray139[var31] = var34;
								}
							}

							try {
								method603(var23, var26, var9);
							} catch (Exception var36) {
								;
							}
						}
					}
				}
			}
		}

	}

	public Model method588(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		method592();
		int var13 = var2 - anInt661;
		int var11 = var2 + anInt661;
		int var15 = var4 - anInt661;
		int var12 = var4 + anInt661;
		if (var13 >= 0 && var11 + 128 >> 7 < var1.length && var15 >= 0 && var12 + 128 >> 7 < var1[0].length) {
			var13 >>= 7;
			var11 = var11 + 127 >> 7;
			var15 >>= 7;
			var12 = var12 + 127 >> 7;
			if (var1[var13][var15] == var3 && var1[var11][var15] == var3 && var1[var13][var12] == var3
					&& var1[var11][var12] == var3) {
				return this;
			} else {
				Model var7;
				if (var5) {
					var7 = new Model();
					var7.anInt660 = anInt660;
					var7.anInt666 = anInt666;
					var7.anInt662 = anInt662;
					var7.anIntArray139 = anIntArray139;
					var7.anIntArray145 = anIntArray145;
					var7.anIntArray140 = anIntArray140;
					var7.anIntArray141 = anIntArray141;
					var7.anIntArray146 = anIntArray146;
					var7.anIntArray142 = anIntArray142;
					var7.anIntArray147 = anIntArray147;
					var7.anIntArray144 = anIntArray144;
					var7.aByteArray33 = aByteArray33;
					var7.aByteArray31 = aByteArray31;
					var7.aByteArray32 = aByteArray32;
					var7.aShortArray33 = aShortArray33;
					var7.aByte7 = aByte7;
					var7.anIntArray148 = anIntArray148;
					var7.anIntArray138 = anIntArray138;
					var7.anIntArray143 = anIntArray143;
					var7.anIntArrayArray15 = anIntArrayArray15;
					var7.anIntArrayArray16 = anIntArrayArray16;
					var7.aBool80 = aBool80;
					var7.anIntArray137 = new int[var7.anInt660];
				} else {
					var7 = this;
				}

				int var8;
				int var10;
				int var14;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				int var22;
				if (var6 == 0) {
					for (var8 = 0; var8 < var7.anInt660; var8++) {
						var10 = anIntArray139[var8] + var2;
						var14 = anIntArray145[var8] + var4;
						var19 = var10 & 0x7f;
						var16 = var14 & 0x7f;
						var17 = var10 >> 7;
						var18 = var14 >> 7;
						var20 = var1[var17][var18] * (128 - var19) + var1[var17 + 1][var18] * var19 >> 7;
						var21 = var1[var17][var18 + 1] * (128 - var19) + var1[var17 + 1][var18 + 1] * var19 >> 7;
						var22 = var20 * (128 - var16) + var21 * var16 >> 7;
						var7.anIntArray137[var8] = anIntArray137[var8] + var22 - var3;
					}
				} else {
					for (var8 = 0; var8 < var7.anInt660; var8++) {
						var10 = (-anIntArray137[var8] << 16) / anInt421;
						if (var10 < var6) {
							var14 = anIntArray139[var8] + var2;
							var19 = anIntArray145[var8] + var4;
							var16 = var14 & 0x7f;
							var17 = var19 & 0x7f;
							var18 = var14 >> 7;
							var20 = var19 >> 7;
							var21 = var1[var18][var20] * (128 - var16) + var1[var18 + 1][var20] * var16 >> 7;
							var22 = var1[var18][var20 + 1] * (128 - var16) + var1[var18 + 1][var20 + 1] * var16 >> 7;
							int var9 = var21 * (128 - var17) + var22 * var17 >> 7;
							var7.anIntArray137[var8] = anIntArray137[var8] + (var9 - var3) * (var6 - var10) / var6;
						}
					}
				}

				var7.anInt659 = 0;
				return var7;
			}
		} else {
			return this;
		}
	}

	public Model method589(boolean var1) {
		if (!var1 && staticByteArray8.length < anInt666) {
			staticByteArray8 = new byte[anInt666 + 100];
		}

		return method591(var1, staticModel2, staticByteArray8);
	}

	public Model method590(boolean var1) {
		if (!var1 && staticByteArray7.length < anInt666) {
			staticByteArray7 = new byte[anInt666 + 100];
		}

		return method591(var1, staticModel1, staticByteArray7);
	}

	Model method591(boolean var1, Model var2, byte[] var3) {
		var2.anInt660 = anInt660;
		var2.anInt666 = anInt666;
		var2.anInt662 = anInt662;
		if (var2.anIntArray139 == null || var2.anIntArray139.length < anInt660) {
			var2.anIntArray139 = new int[anInt660 + 100];
			var2.anIntArray137 = new int[anInt660 + 100];
			var2.anIntArray145 = new int[anInt660 + 100];
		}

		int var4;
		for (var4 = 0; var4 < anInt660; var4++) {
			var2.anIntArray139[var4] = anIntArray139[var4];
			var2.anIntArray137[var4] = anIntArray137[var4];
			var2.anIntArray145[var4] = anIntArray145[var4];
		}

		if (var1) {
			var2.aByteArray31 = aByteArray31;
		} else {
			var2.aByteArray31 = var3;
			if (aByteArray31 == null) {
				for (var4 = 0; var4 < anInt666; var4++) {
					var2.aByteArray31[var4] = 0;
				}
			} else {
				for (var4 = 0; var4 < anInt666; var4++) {
					var2.aByteArray31[var4] = aByteArray31[var4];
				}
			}
		}

		var2.anIntArray140 = anIntArray140;
		var2.anIntArray141 = anIntArray141;
		var2.anIntArray146 = anIntArray146;
		var2.anIntArray142 = anIntArray142;
		var2.anIntArray147 = anIntArray147;
		var2.anIntArray144 = anIntArray144;
		var2.aByteArray33 = aByteArray33;
		var2.aByteArray32 = aByteArray32;
		var2.aShortArray33 = aShortArray33;
		var2.aByte7 = aByte7;
		var2.anIntArray148 = anIntArray148;
		var2.anIntArray138 = anIntArray138;
		var2.anIntArray143 = anIntArray143;
		var2.anIntArrayArray15 = anIntArrayArray15;
		var2.anIntArrayArray16 = anIntArrayArray16;
		var2.aBool80 = aBool80;
		var2.anInt659 = 0;
		return var2;
	}

	public void method592() {
		if (anInt659 != 1) {
			anInt659 = 1;
			anInt421 = 0;
			anInt663 = 0;
			anInt661 = 0;

			for (int var1 = 0; var1 < anInt660; var1++) {
				int var4 = anIntArray139[var1];
				int var2 = anIntArray137[var1];
				int var3 = anIntArray145[var1];
				if (-var2 > anInt421) {
					anInt421 = -var2;
				}

				if (var2 > anInt663) {
					anInt663 = var2;
				}

				int var5 = var4 * var4 + var3 * var3;
				if (var5 > anInt661) {
					anInt661 = var5;
				}
			}

			anInt661 = (int) (Math.sqrt(anInt661) + 0.99D);
			anInt665 = (int) (Math.sqrt(anInt661 * anInt661 + anInt421 * anInt421) + 0.99D);
			anInt664 = anInt665 + (int) (Math.sqrt(anInt661 * anInt661 + anInt663 * anInt663) + 0.99D);
		}

	}

	void method593() {
		if (anInt659 != 2) {
			anInt659 = 2;
			anInt661 = 0;

			for (int var2 = 0; var2 < anInt660; var2++) {
				int var3 = anIntArray139[var2];
				int var4 = anIntArray137[var2];
				int var5 = anIntArray145[var2];
				int var1 = var3 * var3 + var5 * var5 + var4 * var4;
				if (var1 > anInt661) {
					anInt661 = var1;
				}
			}

			anInt661 = (int) (Math.sqrt(anInt661) + 0.99D);
			anInt665 = anInt661;
			anInt664 = anInt661 + anInt661;
		}

	}

	public int method594() {
		method592();
		return anInt661;
	}

	public void method595(CacheableSub2 var1, int var2, CacheableSub2 var3, int var4, int[] var5) {
		if (var2 != -1) {
			if (var5 != null && var4 != -1) {
				AnimationSkeleton var9 = var1.aClass24Array1[var2];
				AnimationSkeleton var8 = var3.aClass24Array1[var4];
				AnimationSkin var10 = var9.aNodeSub10_1;
				staticInt335 = 0;
				staticInt334 = 0;
				staticInt336 = 0;
				byte var6 = 0;
				int var13 = var6 + 1;
				int var11 = var5[var6];

				int var7;
				int var12;
				for (var7 = 0; var7 < var9.anInt67; var7++) {
					for (var12 = var9.anIntArray31[var7]; var12 > var11; var11 = var5[var13++]) {
						;
					}

					if (var12 != var11 || var10.anIntArray65[var12] == 0) {
						method596(var10.anIntArray65[var12], var10.anIntArrayArray11[var12], var9.anIntArray32[var7],
								var9.anIntArray33[var7], var9.anIntArray34[var7]);
					}
				}

				staticInt335 = 0;
				staticInt334 = 0;
				staticInt336 = 0;
				var6 = 0;
				var13 = var6 + 1;
				var11 = var5[var6];

				for (var7 = 0; var7 < var8.anInt67; var7++) {
					for (var12 = var8.anIntArray31[var7]; var12 > var11; var11 = var5[var13++]) {
						;
					}

					if (var12 == var11 || var10.anIntArray65[var12] == 0) {
						method596(var10.anIntArray65[var12], var10.anIntArrayArray11[var12], var8.anIntArray32[var7],
								var8.anIntArray33[var7], var8.anIntArray34[var7]);
					}
				}

				anInt659 = 0;
			} else {
				method602(var1, var2);
			}
		}

	}

	void method596(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length;
		int var7;
		int var11;
		int var12;
		int var13;
		int var10;
		int[] var14;
		if (var1 == 0) {
			var7 = 0;
			staticInt335 = 0;
			staticInt334 = 0;
			staticInt336 = 0;

			for (var13 = 0; var13 < var6; var13++) {
				var10 = var2[var13];
				if (var10 < anIntArrayArray15.length) {
					var14 = anIntArrayArray15[var10];

					for (var11 = 0; var11 < var14.length; var11++) {
						var12 = var14[var11];
						staticInt335 += anIntArray139[var12];
						staticInt334 += anIntArray137[var12];
						staticInt336 += anIntArray145[var12];
						++var7;
					}
				}
			}

			if (var7 > 0) {
				staticInt335 = staticInt335 / var7 + var3;
				staticInt334 = staticInt334 / var7 + var4;
				staticInt336 = staticInt336 / var7 + var5;
			} else {
				staticInt335 = var3;
				staticInt334 = var4;
				staticInt336 = var5;
			}
		} else if (var1 == 1) {
			for (var7 = 0; var7 < var6; var7++) {
				var13 = var2[var7];
				if (var13 < anIntArrayArray15.length) {
					var14 = anIntArrayArray15[var13];

					for (var10 = 0; var10 < var14.length; var10++) {
						var11 = var14[var10];
						anIntArray139[var11] += var3;
						anIntArray137[var11] += var4;
						anIntArray145[var11] += var5;
					}
				}
			}
		} else if (var1 == 2) {
			for (var7 = 0; var7 < var6; var7++) {
				var13 = var2[var7];
				if (var13 < anIntArrayArray15.length) {
					var14 = anIntArrayArray15[var13];

					for (var10 = 0; var10 < var14.length; var10++) {
						var11 = var14[var10];
						anIntArray139[var11] -= staticInt335;
						anIntArray137[var11] -= staticInt334;
						anIntArray145[var11] -= staticInt336;
						var12 = (var3 & 0xff) * 8;
						int var8 = (var4 & 0xff) * 8;
						int var16 = (var5 & 0xff) * 8;
						int var9;
						int var15;
						int var17;
						if (var16 != 0) {
							var9 = staticIntArray147[var16];
							var17 = staticIntArray138[var16];
							var15 = anIntArray137[var11] * var9 + anIntArray139[var11] * var17 >> 16;
							anIntArray137[var11] = anIntArray137[var11] * var17 - anIntArray139[var11] * var9 >> 16;
							anIntArray139[var11] = var15;
						}

						if (var12 != 0) {
							var9 = staticIntArray147[var12];
							var17 = staticIntArray138[var12];
							var15 = anIntArray137[var11] * var17 - anIntArray145[var11] * var9 >> 16;
							anIntArray145[var11] = anIntArray137[var11] * var9 + anIntArray145[var11] * var17 >> 16;
							anIntArray137[var11] = var15;
						}

						if (var8 != 0) {
							var9 = staticIntArray147[var8];
							var17 = staticIntArray138[var8];
							var15 = anIntArray145[var11] * var9 + anIntArray139[var11] * var17 >> 16;
							anIntArray145[var11] = anIntArray145[var11] * var17 - anIntArray139[var11] * var9 >> 16;
							anIntArray139[var11] = var15;
						}

						anIntArray139[var11] += staticInt335;
						anIntArray137[var11] += staticInt334;
						anIntArray145[var11] += staticInt336;
					}
				}
			}
		} else if (var1 == 3) {
			for (var7 = 0; var7 < var6; var7++) {
				var13 = var2[var7];
				if (var13 < anIntArrayArray15.length) {
					var14 = anIntArrayArray15[var13];

					for (var10 = 0; var10 < var14.length; var10++) {
						var11 = var14[var10];
						anIntArray139[var11] -= staticInt335;
						anIntArray137[var11] -= staticInt334;
						anIntArray145[var11] -= staticInt336;
						anIntArray139[var11] = anIntArray139[var11] * var3 / 128;
						anIntArray137[var11] = anIntArray137[var11] * var4 / 128;
						anIntArray145[var11] = anIntArray145[var11] * var5 / 128;
						anIntArray139[var11] += staticInt335;
						anIntArray137[var11] += staticInt334;
						anIntArray145[var11] += staticInt336;
					}
				}
			}
		} else if (var1 == 5 && anIntArrayArray16 != null && aByteArray31 != null) {
			for (var7 = 0; var7 < var6; var7++) {
				var13 = var2[var7];
				if (var13 < anIntArrayArray16.length) {
					var14 = anIntArrayArray16[var13];

					for (var10 = 0; var10 < var14.length; var10++) {
						var11 = var14[var10];
						var12 = (aByteArray31[var11] & 0xff) + var3 * 8;
						if (var12 < 0) {
							var12 = 0;
						} else if (var12 > 255) {
							var12 = 255;
						}

						aByteArray31[var11] = (byte) var12;
					}
				}
			}
		}

	}

	public void method597() {
		for (int var1 = 0; var1 < anInt660; var1++) {
			anIntArray139[var1] = -anIntArray139[var1];
			anIntArray145[var1] = -anIntArray145[var1];
		}

		anInt659 = 0;
	}

	public void method598(int var1) {
		int var2 = staticIntArray147[var1];
		int var4 = staticIntArray138[var1];

		for (int var3 = 0; var3 < anInt660; var3++) {
			int var5 = anIntArray137[var3] * var4 - anIntArray145[var3] * var2 >> 16;
			anIntArray145[var3] = anIntArray137[var3] * var2 + anIntArray145[var3] * var4 >> 16;
			anIntArray137[var3] = var5;
		}

		anInt659 = 0;
	}

	public void method599(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < anInt660; var4++) {
			anIntArray139[var4] = anIntArray139[var4] * var1 / 128;
			anIntArray137[var4] = anIntArray137[var4] * var2 / 128;
			anIntArray145[var4] = anIntArray145[var4] * var3 / 128;
		}

		anInt659 = 0;
	}

	public final void method600(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		staticIntArray146[0] = -1;
		if (anInt659 != 2 && anInt659 != 1) {
			method593();
		}

		int var8 = Rasterizer2DSub1.staticInt344;
		int var9 = Rasterizer2DSub1.staticInt349;
		int var10 = staticIntArray147[var1];
		int var11 = staticIntArray138[var1];
		int var12 = staticIntArray147[var2];
		int var13 = staticIntArray138[var2];
		int var14 = staticIntArray147[var3];
		int var15 = staticIntArray138[var3];
		int var16 = staticIntArray147[var4];
		int var17 = staticIntArray138[var4];
		int var18 = var6 * var16 + var7 * var17 >> 16;

		for (int var19 = 0; var19 < anInt660; var19++) {
			int var20 = anIntArray139[var19];
			int var21 = anIntArray137[var19];
			int var22 = anIntArray145[var19];
			int var23;
			if (var3 != 0) {
				var23 = var21 * var14 + var20 * var15 >> 16;
				var21 = var21 * var15 - var20 * var14 >> 16;
				var20 = var23;
			}

			if (var1 != 0) {
				var23 = var21 * var11 - var22 * var10 >> 16;
				var22 = var21 * var10 + var22 * var11 >> 16;
				var21 = var23;
			}

			if (var2 != 0) {
				var23 = var22 * var12 + var20 * var13 >> 16;
				var22 = var22 * var13 - var20 * var12 >> 16;
				var20 = var23;
			}

			var20 += var5;
			var21 += var6;
			var22 += var7;
			var23 = var21 * var17 - var22 * var16 >> 16;
			var22 = var21 * var16 + var22 * var17 >> 16;
			staticIntArray143[var19] = var22 - var18;
			staticIntArray141[var19] = var8 + var20 * Rasterizer2DSub1.staticInt342 / var22;
			staticIntArray142[var19] = var9 + var23 * Rasterizer2DSub1.staticInt342 / var22;
			if (anInt662 > 0) {
				staticIntArray137[var19] = var20;
				staticIntArray144[var19] = var23;
				staticIntArray139[var19] = var22;
			}
		}

		try {
			method603(false, false, 0);
		} catch (Exception var24) {
			;
		}

	}

	public void method601(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < anInt660; var4++) {
			anIntArray139[var4] += var1;
			anIntArray137[var4] += var2;
			anIntArray145[var4] += var3;
		}

		anInt659 = 0;
	}

	public void method602(CacheableSub2 var1, int var2) {
		if (anIntArrayArray15 != null && var2 != -1) {
			AnimationSkeleton var3 = var1.aClass24Array1[var2];
			AnimationSkin var4 = var3.aNodeSub10_1;
			staticInt335 = 0;
			staticInt334 = 0;
			staticInt336 = 0;

			for (int var6 = 0; var6 < var3.anInt67; var6++) {
				int var5 = var3.anIntArray31[var6];
				method596(var4.anIntArray65[var5], var4.anIntArrayArray11[var5], var3.anIntArray32[var6],
						var3.anIntArray33[var6], var3.anIntArray34[var6]);
			}

			anInt659 = 0;
		}

	}

	final void method603(boolean var1, boolean var2, int var3) {
		if (anInt664 < 1600) {
			int var5;
			for (var5 = 0; var5 < anInt664; var5++) {
				staticIntArray146[var5] = 0;
			}

			int var4;
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var14;
			for (var5 = 0; var5 < anInt666; var5++) {
				if (anIntArray144[var5] != -2) {
					var8 = anIntArray140[var5];
					var6 = anIntArray141[var5];
					var11 = anIntArray146[var5];
					var4 = staticIntArray141[var8];
					var9 = staticIntArray141[var6];
					var12 = staticIntArray141[var11];
					int var24;
					if (!var1 || var4 != -5000 && var9 != -5000 && var12 != -5000) {
						if (var2 && method608(staticInt337, staticInt338, staticIntArray142[var8],
								staticIntArray142[var6], staticIntArray142[var11], var4, var9, var12)) {
							staticIntArray153[staticInt339++] = var3;
							var2 = false;
						}

						if ((var4 - var9) * (staticIntArray142[var11] - staticIntArray142[var6])
								- (staticIntArray142[var8] - staticIntArray142[var6]) * (var12 - var9) > 0) {
							staticBoolArray11[var5] = false;
							if (var4 >= 0 && var9 >= 0 && var12 >= 0 && var4 <= Rasterizer2DSub1.staticInt343
									&& var9 <= Rasterizer2DSub1.staticInt343
									&& var12 <= Rasterizer2DSub1.staticInt343) {
								staticBoolArray10[var5] = false;
							} else {
								staticBoolArray10[var5] = true;
							}

							var24 = (staticIntArray143[var8] + staticIntArray143[var6] + staticIntArray143[var11]) / 3
									+ anInt665;
							staticIntArrayArray10[var24][staticIntArray146[var24]++] = var5;
						}
					} else {
						var24 = staticIntArray137[var8];
						var7 = staticIntArray137[var6];
						var14 = staticIntArray137[var11];
						int var26 = staticIntArray144[var8];
						var10 = staticIntArray144[var6];
						int var28 = staticIntArray144[var11];
						int var27 = staticIntArray139[var8];
						int var17 = staticIntArray139[var6];
						int var18 = staticIntArray139[var11];
						var24 -= var7;
						var14 -= var7;
						var26 -= var10;
						var28 -= var10;
						var27 -= var17;
						var18 -= var17;
						int var20 = var26 * var18 - var27 * var28;
						int var21 = var27 * var14 - var24 * var18;
						int var23 = var24 * var28 - var26 * var14;
						if (var7 * var20 + var10 * var21 + var17 * var23 > 0) {
							staticBoolArray11[var5] = true;
							int var22 = (staticIntArray143[var8] + staticIntArray143[var6] + staticIntArray143[var11])
									/ 3 + anInt665;
							staticIntArrayArray10[var22][staticIntArray146[var22]++] = var5;
						}
					}
				}
			}

			int[] var241;
			if (aByteArray33 == null) {
				for (var5 = anInt664 - 1; var5 >= 0; --var5) {
					var8 = staticIntArray146[var5];
					if (var8 > 0) {
						var241 = staticIntArrayArray10[var5];

						for (var11 = 0; var11 < var8; var11++) {
							method604(var241[var11]);
						}
					}
				}
			} else {
				for (var5 = 0; var5 < 12; var5++) {
					staticIntArray145[var5] = 0;
					staticIntArray150[var5] = 0;
				}

				for (var5 = anInt664 - 1; var5 >= 0; --var5) {
					var8 = staticIntArray146[var5];
					if (var8 > 0) {
						var241 = staticIntArrayArray10[var5];

						for (var11 = 0; var11 < var8; var11++) {
							var4 = var241[var11];
							byte var25 = aByteArray33[var4];
							var12 = staticIntArray145[var25]++;
							staticIntArrayArray11[var25][var12] = var4;
							if (var25 < 10) {
								staticIntArray150[var25] += var5;
							} else if (var25 == 10) {
								staticIntArray148[var12] = var5;
							} else {
								staticIntArray149[var12] = var5;
							}
						}
					}
				}

				var5 = 0;
				if (staticIntArray145[1] > 0 || staticIntArray145[2] > 0) {
					var5 = (staticIntArray150[1] + staticIntArray150[2])
							/ (staticIntArray145[1] + staticIntArray145[2]);
				}

				var8 = 0;
				if (staticIntArray145[3] > 0 || staticIntArray145[4] > 0) {
					var8 = (staticIntArray150[3] + staticIntArray150[4])
							/ (staticIntArray145[3] + staticIntArray145[4]);
				}

				var6 = 0;
				if (staticIntArray145[6] > 0 || staticIntArray145[8] > 0) {
					var6 = (staticIntArray150[6] + staticIntArray150[8])
							/ (staticIntArray145[6] + staticIntArray145[8]);
				}

				var4 = 0;
				var9 = staticIntArray145[10];
				int[] var261 = staticIntArrayArray11[10];
				int[] var271 = staticIntArray148;
				if (var4 == var9) {
					var4 = 0;
					var9 = staticIntArray145[11];
					var261 = staticIntArrayArray11[11];
					var271 = staticIntArray149;
				}

				if (var4 < var9) {
					var11 = var271[var4];
				} else {
					var11 = -1000;
				}

				for (var7 = 0; var7 < 10; var7++) {
					while (var7 == 0 && var11 > var5) {
						method604(var261[var4++]);
						if (var4 == var9 && var261 != staticIntArrayArray11[11]) {
							var4 = 0;
							var9 = staticIntArray145[11];
							var261 = staticIntArrayArray11[11];
							var271 = staticIntArray149;
						}

						if (var4 < var9) {
							var11 = var271[var4];
						} else {
							var11 = -1000;
						}
					}

					while (var7 == 3 && var11 > var8) {
						method604(var261[var4++]);
						if (var4 == var9 && var261 != staticIntArrayArray11[11]) {
							var4 = 0;
							var9 = staticIntArray145[11];
							var261 = staticIntArrayArray11[11];
							var271 = staticIntArray149;
						}

						if (var4 < var9) {
							var11 = var271[var4];
						} else {
							var11 = -1000;
						}
					}

					while (var7 == 5 && var11 > var6) {
						method604(var261[var4++]);
						if (var4 == var9 && var261 != staticIntArrayArray11[11]) {
							var4 = 0;
							var9 = staticIntArray145[11];
							var261 = staticIntArrayArray11[11];
							var271 = staticIntArray149;
						}

						if (var4 < var9) {
							var11 = var271[var4];
						} else {
							var11 = -1000;
						}
					}

					var14 = staticIntArray145[var7];
					int[] var281 = staticIntArrayArray11[var7];

					for (var10 = 0; var10 < var14; var10++) {
						method604(var281[var10]);
					}
				}

				while (var11 != -1000) {
					method604(var261[var4++]);
					if (var4 == var9 && var261 != staticIntArrayArray11[11]) {
						var4 = 0;
						var261 = staticIntArrayArray11[11];
						var9 = staticIntArray145[11];
						var271 = staticIntArray149;
					}

					if (var4 < var9) {
						var11 = var271[var4];
					} else {
						var11 = -1000;
					}
				}
			}
		}

	}

	final void method604(int var1) {
		if (staticBoolArray11[var1]) {
			method605(var1);
		} else {
			int var4 = anIntArray140[var1];
			int var5 = anIntArray141[var1];
			int var6 = anIntArray146[var1];
			Rasterizer2DSub1.staticBool51 = staticBoolArray10[var1];
			if (aByteArray31 == null) {
				Rasterizer2DSub1.staticInt340 = 0;
			} else {
				Rasterizer2DSub1.staticInt340 = aByteArray31[var1] & 0xff;
			}

			if (aShortArray33 != null && aShortArray33[var1] != -1) {
				int var3;
				int var7;
				int var8;
				if (aByteArray32 != null && aByteArray32[var1] != -1) {
					int var2 = aByteArray32[var1] & 0xff;
					var3 = anIntArray148[var2];
					var8 = anIntArray138[var2];
					var7 = anIntArray143[var2];
				} else {
					var3 = var4;
					var8 = var5;
					var7 = var6;
				}

				if (anIntArray144[var1] == -1) {
					Static.staticMethod446(staticIntArray142[var4], staticIntArray142[var5], staticIntArray142[var6],
							staticIntArray141[var4], staticIntArray141[var5], staticIntArray141[var6],
							anIntArray142[var1], anIntArray142[var1], anIntArray142[var1], staticIntArray137[var3],
							staticIntArray137[var8], staticIntArray137[var7], staticIntArray144[var3],
							staticIntArray144[var8], staticIntArray144[var7], staticIntArray139[var3],
							staticIntArray139[var8], staticIntArray139[var7], aShortArray33[var1]);
				} else {
					Static.staticMethod446(staticIntArray142[var4], staticIntArray142[var5], staticIntArray142[var6],
							staticIntArray141[var4], staticIntArray141[var5], staticIntArray141[var6],
							anIntArray142[var1], anIntArray147[var1], anIntArray144[var1], staticIntArray137[var3],
							staticIntArray137[var8], staticIntArray137[var7], staticIntArray144[var3],
							staticIntArray144[var8], staticIntArray144[var7], staticIntArray139[var3],
							staticIntArray139[var8], staticIntArray139[var7], aShortArray33[var1]);
				}
			} else if (anIntArray144[var1] == -1) {
				Static.staticMethod455(staticIntArray142[var4], staticIntArray142[var5], staticIntArray142[var6],
						staticIntArray141[var4], staticIntArray141[var5], staticIntArray141[var6],
						staticIntArray136[anIntArray142[var1]]);
			} else {
				Static.staticMethod444(staticIntArray142[var4], staticIntArray142[var5], staticIntArray142[var6],
						staticIntArray141[var4], staticIntArray141[var5], staticIntArray141[var6], anIntArray142[var1],
						anIntArray147[var1], anIntArray144[var1]);
			}
		}

	}

	final void method605(int var1) {
		int var2 = Rasterizer2DSub1.staticInt344;
		int var14 = Rasterizer2DSub1.staticInt349;
		int var3 = 0;
		int var6 = anIntArray140[var1];
		int var16 = anIntArray141[var1];
		int var8 = anIntArray146[var1];
		int var9 = staticIntArray139[var6];
		int var15 = staticIntArray139[var16];
		int var11 = staticIntArray139[var8];
		if (aByteArray31 == null) {
			Rasterizer2DSub1.staticInt340 = 0;
		} else {
			Rasterizer2DSub1.staticInt340 = aByteArray31[var1] & 0xff;
		}

		int var4;
		int var5;
		int var7;
		int var13;
		if (var9 >= 50) {
			staticIntArray151[var3] = staticIntArray141[var6];
			staticIntArray135[var3] = staticIntArray142[var6];
			staticIntArray152[var3++] = anIntArray142[var1];
		} else {
			var7 = staticIntArray137[var6];
			var13 = staticIntArray144[var6];
			var4 = anIntArray142[var1];
			if (var11 >= 50) {
				var5 = (50 - var9) * staticIntArray140[var11 - var9];
				staticIntArray151[var3] = var2
						+ (var7 + ((staticIntArray137[var8] - var7) * var5 >> 16)) * Rasterizer2DSub1.staticInt342 / 50;
				staticIntArray135[var3] = var14 + (var13 + ((staticIntArray144[var8] - var13) * var5 >> 16))
						* Rasterizer2DSub1.staticInt342 / 50;
				staticIntArray152[var3++] = var4 + ((anIntArray144[var1] - var4) * var5 >> 16);
			}

			if (var15 >= 50) {
				var5 = (50 - var9) * staticIntArray140[var15 - var9];
				staticIntArray151[var3] = var2 + (var7 + ((staticIntArray137[var16] - var7) * var5 >> 16))
						* Rasterizer2DSub1.staticInt342 / 50;
				staticIntArray135[var3] = var14 + (var13 + ((staticIntArray144[var16] - var13) * var5 >> 16))
						* Rasterizer2DSub1.staticInt342 / 50;
				staticIntArray152[var3++] = var4 + ((anIntArray147[var1] - var4) * var5 >> 16);
			}
		}

		if (var15 >= 50) {
			staticIntArray151[var3] = staticIntArray141[var16];
			staticIntArray135[var3] = staticIntArray142[var16];
			staticIntArray152[var3++] = anIntArray147[var1];
		} else {
			var7 = staticIntArray137[var16];
			var13 = staticIntArray144[var16];
			var4 = anIntArray147[var1];
			if (var9 >= 50) {
				var5 = (50 - var15) * staticIntArray140[var9 - var15];
				staticIntArray151[var3] = var2
						+ (var7 + ((staticIntArray137[var6] - var7) * var5 >> 16)) * Rasterizer2DSub1.staticInt342 / 50;
				staticIntArray135[var3] = var14 + (var13 + ((staticIntArray144[var6] - var13) * var5 >> 16))
						* Rasterizer2DSub1.staticInt342 / 50;
				staticIntArray152[var3++] = var4 + ((anIntArray142[var1] - var4) * var5 >> 16);
			}

			if (var11 >= 50) {
				var5 = (50 - var15) * staticIntArray140[var11 - var15];
				staticIntArray151[var3] = var2
						+ (var7 + ((staticIntArray137[var8] - var7) * var5 >> 16)) * Rasterizer2DSub1.staticInt342 / 50;
				staticIntArray135[var3] = var14 + (var13 + ((staticIntArray144[var8] - var13) * var5 >> 16))
						* Rasterizer2DSub1.staticInt342 / 50;
				staticIntArray152[var3++] = var4 + ((anIntArray144[var1] - var4) * var5 >> 16);
			}
		}

		if (var11 >= 50) {
			staticIntArray151[var3] = staticIntArray141[var8];
			staticIntArray135[var3] = staticIntArray142[var8];
			staticIntArray152[var3++] = anIntArray144[var1];
		} else {
			var7 = staticIntArray137[var8];
			var13 = staticIntArray144[var8];
			var4 = anIntArray144[var1];
			if (var15 >= 50) {
				var5 = (50 - var11) * staticIntArray140[var15 - var11];
				staticIntArray151[var3] = var2 + (var7 + ((staticIntArray137[var16] - var7) * var5 >> 16))
						* Rasterizer2DSub1.staticInt342 / 50;
				staticIntArray135[var3] = var14 + (var13 + ((staticIntArray144[var16] - var13) * var5 >> 16))
						* Rasterizer2DSub1.staticInt342 / 50;
				staticIntArray152[var3++] = var4 + ((anIntArray147[var1] - var4) * var5 >> 16);
			}

			if (var9 >= 50) {
				var5 = (50 - var11) * staticIntArray140[var9 - var11];
				staticIntArray151[var3] = var2
						+ (var7 + ((staticIntArray137[var6] - var7) * var5 >> 16)) * Rasterizer2DSub1.staticInt342 / 50;
				staticIntArray135[var3] = var14 + (var13 + ((staticIntArray144[var6] - var13) * var5 >> 16))
						* Rasterizer2DSub1.staticInt342 / 50;
				staticIntArray152[var3++] = var4 + ((anIntArray142[var1] - var4) * var5 >> 16);
			}
		}

		var7 = staticIntArray151[0];
		var13 = staticIntArray151[1];
		var4 = staticIntArray151[2];
		var5 = staticIntArray135[0];
		int var17 = staticIntArray135[1];
		int var18 = staticIntArray135[2];
		Rasterizer2DSub1.staticBool51 = false;
		int var10;
		int var12;
		int var19;
		int var20;
		if (var3 == 3) {
			if (var7 < 0 || var13 < 0 || var4 < 0 || var7 > Rasterizer2DSub1.staticInt343
					|| var13 > Rasterizer2DSub1.staticInt343 || var4 > Rasterizer2DSub1.staticInt343) {
				Rasterizer2DSub1.staticBool51 = true;
			}

			if (aShortArray33 != null && aShortArray33[var1] != -1) {
				if (aByteArray32 != null && aByteArray32[var1] != -1) {
					var10 = aByteArray32[var1] & 0xff;
					var19 = anIntArray148[var10];
					var12 = anIntArray138[var10];
					var20 = anIntArray143[var10];
				} else {
					var19 = var6;
					var12 = var16;
					var20 = var8;
				}

				if (anIntArray144[var1] == -1) {
					Static.staticMethod446(var5, var17, var18, var7, var13, var4, anIntArray142[var1],
							anIntArray142[var1], anIntArray142[var1], staticIntArray137[var19],
							staticIntArray137[var12], staticIntArray137[var20], staticIntArray144[var19],
							staticIntArray144[var12], staticIntArray144[var20], staticIntArray139[var19],
							staticIntArray139[var12], staticIntArray139[var20], aShortArray33[var1]);
				} else {
					Static.staticMethod446(var5, var17, var18, var7, var13, var4, staticIntArray152[0],
							staticIntArray152[1], staticIntArray152[2], staticIntArray137[var19],
							staticIntArray137[var12], staticIntArray137[var20], staticIntArray144[var19],
							staticIntArray144[var12], staticIntArray144[var20], staticIntArray139[var19],
							staticIntArray139[var12], staticIntArray139[var20], aShortArray33[var1]);
				}
			} else if (anIntArray144[var1] == -1) {
				Static.staticMethod455(var5, var17, var18, var7, var13, var4, staticIntArray136[anIntArray142[var1]]);
			} else {
				Static.staticMethod444(var5, var17, var18, var7, var13, var4, staticIntArray152[0],
						staticIntArray152[1], staticIntArray152[2]);
			}
		}

		if (var3 == 4) {
			if (var7 < 0 || var13 < 0 || var4 < 0 || var7 > Rasterizer2DSub1.staticInt343
					|| var13 > Rasterizer2DSub1.staticInt343 || var4 > Rasterizer2DSub1.staticInt343
					|| staticIntArray151[3] < 0 || staticIntArray151[3] > Rasterizer2DSub1.staticInt343) {
				Rasterizer2DSub1.staticBool51 = true;
			}

			if (aShortArray33 != null && aShortArray33[var1] != -1) {
				if (aByteArray32 != null && aByteArray32[var1] != -1) {
					var10 = aByteArray32[var1] & 0xff;
					var19 = anIntArray148[var10];
					var12 = anIntArray138[var10];
					var20 = anIntArray143[var10];
				} else {
					var19 = var6;
					var12 = var16;
					var20 = var8;
				}

				short var21 = aShortArray33[var1];
				if (anIntArray144[var1] == -1) {
					Static.staticMethod446(var5, var17, var18, var7, var13, var4, anIntArray142[var1],
							anIntArray142[var1], anIntArray142[var1], staticIntArray137[var19],
							staticIntArray137[var12], staticIntArray137[var20], staticIntArray144[var19],
							staticIntArray144[var12], staticIntArray144[var20], staticIntArray139[var19],
							staticIntArray139[var12], staticIntArray139[var20], var21);
					Static.staticMethod446(var5, var18, staticIntArray135[3], var7, var4, staticIntArray151[3],
							anIntArray142[var1], anIntArray142[var1], anIntArray142[var1], staticIntArray137[var19],
							staticIntArray137[var12], staticIntArray137[var20], staticIntArray144[var19],
							staticIntArray144[var12], staticIntArray144[var20], staticIntArray139[var19],
							staticIntArray139[var12], staticIntArray139[var20], var21);
				} else {
					Static.staticMethod446(var5, var17, var18, var7, var13, var4, staticIntArray152[0],
							staticIntArray152[1], staticIntArray152[2], staticIntArray137[var19],
							staticIntArray137[var12], staticIntArray137[var20], staticIntArray144[var19],
							staticIntArray144[var12], staticIntArray144[var20], staticIntArray139[var19],
							staticIntArray139[var12], staticIntArray139[var20], var21);
					Static.staticMethod446(var5, var18, staticIntArray135[3], var7, var4, staticIntArray151[3],
							staticIntArray152[0], staticIntArray152[2], staticIntArray152[3], staticIntArray137[var19],
							staticIntArray137[var12], staticIntArray137[var20], staticIntArray144[var19],
							staticIntArray144[var12], staticIntArray144[var20], staticIntArray139[var19],
							staticIntArray139[var12], staticIntArray139[var20], var21);
				}
			} else if (anIntArray144[var1] == -1) {
				var19 = staticIntArray136[anIntArray142[var1]];
				Static.staticMethod455(var5, var17, var18, var7, var13, var4, var19);
				Static.staticMethod455(var5, var18, staticIntArray135[3], var7, var4, staticIntArray151[3], var19);
			} else {
				Static.staticMethod444(var5, var17, var18, var7, var13, var4, staticIntArray152[0],
						staticIntArray152[1], staticIntArray152[2]);
				Static.staticMethod444(var5, var18, staticIntArray135[3], var7, var4, staticIntArray151[3],
						staticIntArray152[0], staticIntArray152[2], staticIntArray152[3]);
			}
		}

	}

	public Model(Model[] var1, int var2) {
		boolean var5 = false;
		boolean var6 = false;
		boolean var9 = false;
		boolean var7 = false;
		anInt660 = 0;
		anInt666 = 0;
		anInt662 = 0;
		aByte7 = -1;

		Model var3;
		int var8;
		for (var8 = 0; var8 < var2; var8++) {
			var3 = var1[var8];
			if (var3 != null) {
				anInt660 += var3.anInt660;
				anInt666 += var3.anInt666;
				anInt662 += var3.anInt662;
				if (var3.aByteArray33 != null) {
					var5 = true;
				} else {
					if (aByte7 == -1) {
						aByte7 = var3.aByte7;
					}

					if (aByte7 != var3.aByte7) {
						var5 = true;
					}
				}

				var6 |= var3.aByteArray31 != null;
				var9 |= var3.aShortArray33 != null;
				var7 |= var3.aByteArray32 != null;
			}
		}

		anIntArray139 = new int[anInt660];
		anIntArray137 = new int[anInt660];
		anIntArray145 = new int[anInt660];
		anIntArray140 = new int[anInt666];
		anIntArray141 = new int[anInt666];
		anIntArray146 = new int[anInt666];
		anIntArray142 = new int[anInt666];
		anIntArray147 = new int[anInt666];
		anIntArray144 = new int[anInt666];
		if (var5) {
			aByteArray33 = new byte[anInt666];
		}

		if (var6) {
			aByteArray31 = new byte[anInt666];
		}

		if (var9) {
			aShortArray33 = new short[anInt666];
		}

		if (var7) {
			aByteArray32 = new byte[anInt666];
		}

		if (anInt662 > 0) {
			anIntArray148 = new int[anInt662];
			anIntArray138 = new int[anInt662];
			anIntArray143 = new int[anInt662];
		}

		anInt660 = 0;
		anInt666 = 0;
		anInt662 = 0;

		for (var8 = 0; var8 < var2; var8++) {
			var3 = var1[var8];
			if (var3 != null) {
				int var4;
				for (var4 = 0; var4 < var3.anInt666; var4++) {
					anIntArray140[anInt666] = var3.anIntArray140[var4] + anInt660;
					anIntArray141[anInt666] = var3.anIntArray141[var4] + anInt660;
					anIntArray146[anInt666] = var3.anIntArray146[var4] + anInt660;
					anIntArray142[anInt666] = var3.anIntArray142[var4];
					anIntArray147[anInt666] = var3.anIntArray147[var4];
					anIntArray144[anInt666] = var3.anIntArray144[var4];
					if (var5) {
						if (var3.aByteArray33 != null) {
							aByteArray33[anInt666] = var3.aByteArray33[var4];
						} else {
							aByteArray33[anInt666] = var3.aByte7;
						}
					}

					if (var6 && var3.aByteArray31 != null) {
						aByteArray31[anInt666] = var3.aByteArray31[var4];
					}

					if (var9) {
						if (var3.aShortArray33 != null) {
							aShortArray33[anInt666] = var3.aShortArray33[var4];
						} else {
							aShortArray33[anInt666] = -1;
						}
					}

					if (var7) {
						if (var3.aByteArray32 != null && var3.aByteArray32[var4] != -1) {
							aByteArray32[anInt666] = (byte) (var3.aByteArray32[var4] + anInt662);
						} else {
							aByteArray32[anInt666] = -1;
						}
					}

					++anInt666;
				}

				for (var4 = 0; var4 < var3.anInt662; var4++) {
					anIntArray148[anInt662] = var3.anIntArray148[var4] + anInt660;
					anIntArray138[anInt662] = var3.anIntArray138[var4] + anInt660;
					anIntArray143[anInt662] = var3.anIntArray143[var4] + anInt660;
					++anInt662;
				}

				for (var4 = 0; var4 < var3.anInt660; var4++) {
					anIntArray139[anInt660] = var3.anIntArray139[var4];
					anIntArray137[anInt660] = var3.anIntArray137[var4];
					anIntArray145[anInt660] = var3.anIntArray145[var4];
					++anInt660;
				}
			}
		}

	}

	public void method606() {
		for (int var1 = 0; var1 < anInt660; var1++) {
			int var2 = anIntArray145[var1];
			anIntArray145[var1] = anIntArray139[var1];
			anIntArray139[var1] = -var2;
		}

		anInt659 = 0;
	}

	Model() {
	}

	public void method607() {
		for (int var1 = 0; var1 < anInt660; var1++) {
			int var2 = anIntArray139[var1];
			anIntArray139[var1] = anIntArray145[var1];
			anIntArray145[var1] = -var2;
		}

		anInt659 = 0;
	}

	final boolean method608(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		return var2 < var3 && var2 < var4 && var2 < var5 ? false
				: var2 > var3 && var2 > var4 && var2 > var5 ? false
						: var1 < var6 && var1 < var7 && var1 < var8 ? false
								: var1 <= var6 || var1 <= var7 || var1 <= var8;
	}

	public final void method609(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		staticIntArray146[0] = -1;
		if (anInt659 != 2 && anInt659 != 1) {
			method593();
		}

		int var9 = Rasterizer2DSub1.staticInt344;
		int var10 = Rasterizer2DSub1.staticInt349;
		int var11 = staticIntArray147[var1];
		int var12 = staticIntArray138[var1];
		int var13 = staticIntArray147[var2];
		int var14 = staticIntArray138[var2];
		int var15 = staticIntArray147[var3];
		int var16 = staticIntArray138[var3];
		int var17 = staticIntArray147[var4];
		int var18 = staticIntArray138[var4];
		int var19 = var6 * var17 + var7 * var18 >> 16;

		for (int var20 = 0; var20 < anInt660; var20++) {
			int var21 = anIntArray139[var20];
			int var22 = anIntArray137[var20];
			int var23 = anIntArray145[var20];
			int var24;
			if (var3 != 0) {
				var24 = var22 * var15 + var21 * var16 >> 16;
				var22 = var22 * var16 - var21 * var15 >> 16;
				var21 = var24;
			}

			if (var1 != 0) {
				var24 = var22 * var12 - var23 * var11 >> 16;
				var23 = var22 * var11 + var23 * var12 >> 16;
				var22 = var24;
			}

			if (var2 != 0) {
				var24 = var23 * var13 + var21 * var14 >> 16;
				var23 = var23 * var14 - var21 * var13 >> 16;
				var21 = var24;
			}

			var21 += var5;
			var22 += var6;
			var23 += var7;
			var24 = var22 * var18 - var23 * var17 >> 16;
			var23 = var22 * var17 + var23 * var18 >> 16;
			staticIntArray143[var20] = var23 - var19;
			staticIntArray141[var20] = var9 + var21 * Rasterizer2DSub1.staticInt342 / var8;
			staticIntArray142[var20] = var10 + var24 * Rasterizer2DSub1.staticInt342 / var8;
			if (anInt662 > 0) {
				staticIntArray137[var20] = var21;
				staticIntArray144[var20] = var24;
				staticIntArray139[var20] = var23;
			}
		}

		try {
			method603(false, false, 0);
		} catch (Exception var25) {
			;
		}

	}

}
