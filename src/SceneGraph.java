public class SceneGraph {

	static int staticInt51;
	static int staticInt64;
	static int staticInt65;
	static int staticInt66;
	static int staticInt67;
	static int staticInt69;
	public static int staticInt57 = -1;
	public static int staticInt58 = -1;
	static boolean staticBool7 = false;
	static boolean staticBool8 = false;
	static int staticInt43 = 0;
	static int staticInt55 = 0;
	static int staticInt56 = 0;
	static int staticInt46 = 0;
	static int staticInt45 = 0;
	public static boolean staticBool6 = true;
	static DataClass7[] staticClass32Array1 = new DataClass7[100];
	static int staticInt41 = 4;
	static int[] staticIntArray40;
	static DataClass4[][] staticClass30ArrayArray1;
	static int staticInt59;
	static DataClass4[] staticClass30Array1;
	static Class39 staticClass39_1;
	static final int[] staticIntArray42;
	static final int[] staticIntArray43;
	static final int[] staticIntArray39;
	static final int[] staticIntArray44;
	static final int[] staticIntArray37;
	static final int[] staticIntArray41;
	static final int[] staticIntArray38;
	static boolean[][][][] staticBoolArrayArrayArrayArray1;
	int anInt72 = 0;
	int anInt69 = 0;
	DataClass7[] aClass32Array1 = new DataClass7[5000];
	int[][] anIntArrayArray4 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 },
			{ 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };
	int[][] anIntArrayArray3 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 },
			{ 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 },
			{ 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 },
			{ 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };
	int anInt71;
	int anInt70;
	int anInt68;
	Tile[][][] aTileArrayArrayArray1;
	int[][][] anIntArrayArrayArray4;
	int[][][] anIntArrayArrayArray3;
	static int staticInt53;
	static int staticInt68;
	static int staticInt60;
	static int staticInt61;
	static int staticInt49;
	static boolean[][] staticBoolArrayArray1;
	static int staticInt52;
	static int staticInt63;
	static int staticInt44;
	static int staticInt42;
	static int staticInt62;
	static int staticInt50;
	static int staticInt48;
	static int staticInt47;
	static int staticInt54;

	static {
		staticIntArray40 = new int[staticInt41];
		staticClass30ArrayArray1 = new DataClass4[staticInt41][500];
		staticInt59 = 0;
		staticClass30Array1 = new DataClass4[500];
		staticClass39_1 = new Class39();
		staticIntArray42 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
		staticIntArray43 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
		staticIntArray39 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
		staticIntArray44 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
		staticIntArray37 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
		staticIntArray41 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
		staticIntArray38 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
		staticBoolArrayArrayArrayArray1 = new boolean[8][32][51][51];
	}

	void method97(Class26 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9;
		int var10 = var9 = (var7 << 7) - staticInt52;
		int var28;
		int var13 = var28 = (var8 << 7) - staticInt44;
		int var11;
		int var12 = var11 = var10 + 128;
		int var14;
		int var15 = var14 = var13 + 128;
		int var16 = anIntArrayArrayArray3[var2][var7][var8] - staticInt63;
		int var17 = anIntArrayArrayArray3[var2][var7 + 1][var8] - staticInt63;
		int var18 = anIntArrayArrayArray3[var2][var7 + 1][var8 + 1] - staticInt63;
		int var19 = anIntArrayArrayArray3[var2][var7][var8 + 1] - staticInt63;
		int var20 = var13 * var5 + var10 * var6 >> 16;
		var13 = var13 * var6 - var10 * var5 >> 16;
		var10 = var20;
		var20 = var16 * var4 - var13 * var3 >> 16;
		var13 = var16 * var3 + var13 * var4 >> 16;
		var16 = var20;
		if (var13 >= 50) {
			var20 = var28 * var5 + var12 * var6 >> 16;
			var28 = var28 * var6 - var12 * var5 >> 16;
			var12 = var20;
			var20 = var17 * var4 - var28 * var3 >> 16;
			var28 = var17 * var3 + var28 * var4 >> 16;
			var17 = var20;
			if (var28 >= 50) {
				var20 = var15 * var5 + var11 * var6 >> 16;
				var15 = var15 * var6 - var11 * var5 >> 16;
				var11 = var20;
				var20 = var18 * var4 - var15 * var3 >> 16;
				var15 = var18 * var3 + var15 * var4 >> 16;
				var18 = var20;
				if (var15 >= 50) {
					var20 = var14 * var5 + var9 * var6 >> 16;
					var14 = var14 * var6 - var9 * var5 >> 16;
					var9 = var20;
					var20 = var19 * var4 - var14 * var3 >> 16;
					var14 = var19 * var3 + var14 * var4 >> 16;
					if (var14 >= 50) {
						int var29 = Rasterizer2DSub1.staticInt344 + var10 * Rasterizer2DSub1.staticInt342 / var13;
						int var30 = Rasterizer2DSub1.staticInt349 + var16 * Rasterizer2DSub1.staticInt342 / var13;
						int var26 = Rasterizer2DSub1.staticInt344 + var12 * Rasterizer2DSub1.staticInt342 / var28;
						int var23 = Rasterizer2DSub1.staticInt349 + var17 * Rasterizer2DSub1.staticInt342 / var28;
						int var24 = Rasterizer2DSub1.staticInt344 + var11 * Rasterizer2DSub1.staticInt342 / var15;
						int var21 = Rasterizer2DSub1.staticInt349 + var18 * Rasterizer2DSub1.staticInt342 / var15;
						int var25 = Rasterizer2DSub1.staticInt344 + var9 * Rasterizer2DSub1.staticInt342 / var14;
						int var22 = Rasterizer2DSub1.staticInt349 + var20 * Rasterizer2DSub1.staticInt342 / var14;
						Rasterizer2DSub1.staticInt340 = 0;
						int var27;
						if ((var24 - var25) * (var23 - var22) - (var21 - var22) * (var26 - var25) > 0) {
							Rasterizer2DSub1.staticBool51 = false;
							if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > Rasterizer2DSub1.staticInt343
									|| var25 > Rasterizer2DSub1.staticInt343 || var26 > Rasterizer2DSub1.staticInt343) {
								Rasterizer2DSub1.staticBool51 = true;
							}

							if (staticBool7
									&& method127(staticInt55, staticInt56, var21, var22, var23, var24, var25, var26)) {
								staticInt57 = var7;
								staticInt58 = var8;
							}

							if (var1.anInt76 == -1) {
								if (var1.anInt78 != 12345678) {
									Static.staticMethod444(var21, var22, var23, var24, var25, var26, var1.anInt78,
											var1.anInt73, var1.anInt74);
								}
							} else if (!staticBool6) {
								if (var1.aBool10) {
									Static.staticMethod450(var21, var22, var23, var24, var25, var26, var1.anInt78,
											var1.anInt73, var1.anInt74, var10, var12, var9, var16, var17, var20, var13,
											var28, var14, var1.anInt76);
								} else {
									Static.staticMethod450(var21, var22, var23, var24, var25, var26, var1.anInt78,
											var1.anInt73, var1.anInt74, var11, var9, var12, var18, var20, var17, var15,
											var14, var28, var1.anInt76);
								}
							} else {
								var27 = Rasterizer2DSub1.staticInterface2_1.method34(var1.anInt76);
								Static.staticMethod444(var21, var22, var23, var24, var25, var26,
										Static.staticMethod79(var27, var1.anInt78),
										Static.staticMethod79(var27, var1.anInt73),
										Static.staticMethod79(var27, var1.anInt74));
							}
						}

						if ((var29 - var26) * (var22 - var23) - (var30 - var23) * (var25 - var26) > 0) {
							Rasterizer2DSub1.staticBool51 = false;
							if (var29 < 0 || var26 < 0 || var25 < 0 || var29 > Rasterizer2DSub1.staticInt343
									|| var26 > Rasterizer2DSub1.staticInt343 || var25 > Rasterizer2DSub1.staticInt343) {
								Rasterizer2DSub1.staticBool51 = true;
							}

							if (staticBool7
									&& method127(staticInt55, staticInt56, var30, var23, var22, var29, var26, var25)) {
								staticInt57 = var7;
								staticInt58 = var8;
							}

							if (var1.anInt76 == -1) {
								if (var1.anInt75 != 12345678) {
									Static.staticMethod444(var30, var23, var22, var29, var26, var25, var1.anInt75,
											var1.anInt74, var1.anInt73);
								}
							} else if (!staticBool6) {
								Static.staticMethod450(var30, var23, var22, var29, var26, var25, var1.anInt75,
										var1.anInt74, var1.anInt73, var10, var12, var9, var16, var17, var20, var13,
										var28, var14, var1.anInt76);
							} else {
								var27 = Rasterizer2DSub1.staticInterface2_1.method34(var1.anInt76);
								Static.staticMethod444(var30, var23, var22, var29, var26, var25,
										Static.staticMethod79(var27, var1.anInt75),
										Static.staticMethod79(var27, var1.anInt74),
										Static.staticMethod79(var27, var1.anInt73));
							}
						}
					}
				}
			}
		}

	}

	public void method98(int var1, int var2, int var3, int var4) {
		Tile var5 = aTileArrayArrayArray1[var1][var2][var3];
		if (var5 != null) {
			aTileArrayArrayArray1[var1][var2][var3].anInt256 = var4;
		}

	}

	public void method99(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9,
			int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18,
			int var19, int var20) {
		int var21;
		Class26 var22;
		if (var4 == 0) {
			var22 = new Class26(var11, var12, var13, var14, -1, var19, false);

			for (var21 = var1; var21 >= 0; --var21) {
				if (aTileArrayArrayArray1[var21][var2][var3] == null) {
					aTileArrayArrayArray1[var21][var2][var3] = new Tile(var21, var2, var3);
				}
			}

			aTileArrayArrayArray1[var1][var2][var3].aClass26_1 = var22;
		} else if (var4 != 1) {
			DataClass11 var23 = new DataClass11(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14,
					var15, var16, var17, var18, var19, var20);

			for (var21 = var1; var21 >= 0; --var21) {
				if (aTileArrayArrayArray1[var21][var2][var3] == null) {
					aTileArrayArrayArray1[var21][var2][var3] = new Tile(var21, var2, var3);
				}
			}

			aTileArrayArrayArray1[var1][var2][var3].aClass8_1 = var23;
		} else {
			var22 = new Class26(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

			for (var21 = var1; var21 >= 0; --var21) {
				if (aTileArrayArrayArray1[var21][var2][var3] == null) {
					aTileArrayArrayArray1[var21][var2][var3] = new Tile(var21, var2, var3);
				}
			}

			aTileArrayArrayArray1[var1][var2][var3].aClass26_1 = var22;
		}

	}

	public DataClass5 method100(int var1, int var2, int var3) {
		Tile var4 = aTileArrayArrayArray1[var1][var2][var3];
		return var4 == null ? null : var4.aClass31_1;
	}

	public void method101(int var1, int var2, int var3, int var4, Entity var5, Entity var6, int var7, int var8,
			int var9, int var10) {
		if (var5 != null || var6 != null) {
			DataClass5 var11 = new DataClass5();
			var11.anInt114 = var9;
			var11.anInt113 = var10;
			var11.anInt110 = var2 * 128 + 64;
			var11.anInt111 = var3 * 128 + 64;
			var11.anInt109 = var4;
			var11.aRenderable5 = var5;
			var11.aRenderable4 = var6;
			var11.anInt112 = var7;
			var11.anInt115 = var8;

			for (int var12 = var1; var12 >= 0; --var12) {
				if (aTileArrayArrayArray1[var12][var2][var3] == null) {
					aTileArrayArrayArray1[var12][var2][var3] = new Tile(var12, var2, var3);
				}
			}

			aTileArrayArrayArray1[var1][var2][var3].aClass31_1 = var11;
		}

	}

	public boolean method102(int var1, int var2, int var3, int var4, int var5, Entity var6, int var7, int var8,
			boolean var9) {
		if (var6 == null) {
			return true;
		} else {
			int var11 = var2 - var5;
			int var12 = var3 - var5;
			int var10 = var2 + var5;
			int var13 = var3 + var5;
			if (var9) {
				if (var7 > 640 && var7 < 1408) {
					var13 += 128;
				}

				if (var7 > 1152 && var7 < 1920) {
					var10 += 128;
				}

				if (var7 > 1664 || var7 < 384) {
					var12 -= 128;
				}

				if (var7 > 128 && var7 < 896) {
					var11 -= 128;
				}
			}

			var11 /= 128;
			var12 /= 128;
			var10 /= 128;
			var13 /= 128;
			return method141(var1, var11, var12, var10 - var11 + 1, var13 - var12 + 1, var2, var3, var4, var6, var7,
					true, var8, 0);
		}
	}

	boolean method103(int var1, int var2, int var3, int var4) {
		if (!method129(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			return method137(var5 + 1, anIntArrayArrayArray3[var1][var2][var3] - var4, var6 + 1)
					&& method137(var5 + 128 - 1, anIntArrayArrayArray3[var1][var2 + 1][var3] - var4, var6 + 1)
					&& method137(var5 + 128 - 1, anIntArrayArrayArray3[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1)
					&& method137(var5 + 1, anIntArrayArrayArray3[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
		}
	}

	public void method104() {
		for (int var1 = 0; var1 < anInt72; var1++) {
			DataClass7 var2 = aClass32Array1[var1];
			method105(var2);
			aClass32Array1[var1] = null;
		}

		anInt72 = 0;
	}

	void method105(DataClass7 var1) {
		for (int var2 = var1.anInt120; var2 <= var1.anInt128; var2++) {
			for (int var5 = var1.anInt123; var5 <= var1.anInt124; var5++) {
				Tile var4 = aTileArrayArrayArray1[var1.anInt121][var2][var5];
				if (var4 != null) {
					int var3;
					for (var3 = 0; var3 < var4.anInt254; var3++) {
						if (var4.aClass32Array2[var3] == var1) {
							--var4.anInt254;

							for (int var6 = var3; var6 < var4.anInt254; var6++) {
								var4.aClass32Array2[var6] = var4.aClass32Array2[var6 + 1];
								var4.anIntArray66[var6] = var4.anIntArray66[var6 + 1];
							}

							var4.aClass32Array2[var4.anInt254] = null;
							break;
						}
					}

					var4.anInt255 = 0;

					for (var3 = 0; var3 < var4.anInt254; var3++) {
						var4.anInt255 |= var4.anIntArray66[var3];
					}
				}
			}
		}

	}

	public void method106(int var1, int var2, int var3) {
		Tile var4 = aTileArrayArrayArray1[var1][var2][var3];
		if (var4 != null) {
			var4.aClass31_1 = null;
		}

	}

	public void method107(int var1, int var2, int var3) {
		Tile var4 = aTileArrayArrayArray1[var1][var2][var3];
		if (var4 != null) {
			var4.aWallObject1 = null;
		}

	}

	public void method108(int var1, int var2, int var3) {
		Tile var4 = aTileArrayArrayArray1[var1][var2][var3];
		if (var4 != null) {
			for (int var5 = 0; var5 < var4.anInt254; var5++) {
				DataClass7 var6 = var4.aClass32Array2[var5];
				if ((var6.anInt127 >> 29 & 0x3) == 2 && var6.anInt120 == var2 && var6.anInt123 == var3) {
					method105(var6);
					return;
				}
			}
		}

	}

	public SceneGraph(int var1, int var2, int var3, int[][][] var4) {
		anInt71 = var1;
		anInt70 = var2;
		anInt68 = var3;
		aTileArrayArrayArray1 = new Tile[var1][var2][var3];
		anIntArrayArrayArray4 = new int[var1][var2 + 1][var3 + 1];
		anIntArrayArrayArray3 = var4;
		method138();
	}

	public void method109(int var1, int var2, int var3) {
		Tile var4 = aTileArrayArrayArray1[var1][var2][var3];
		if (var4 != null) {
			var4.aClass16_1 = null;
		}

	}

	public WallObject method110(int var1, int var2, int var3) {
		Tile var4 = aTileArrayArrayArray1[var1][var2][var3];
		return var4 == null ? null : var4.aWallObject1;
	}

	public DataClass7 method111(int var1, int var2, int var3) {
		Tile var4 = aTileArrayArrayArray1[var1][var2][var3];
		if (var4 == null) {
			return null;
		} else {
			for (int var5 = 0; var5 < var4.anInt254; var5++) {
				DataClass7 var6 = var4.aClass32Array2[var5];
				if ((var6.anInt127 >> 29 & 0x3) == 2 && var6.anInt120 == var2 && var6.anInt123 == var3) {
					return var6;
				}
			}

			return null;
		}
	}

	public DataClass6 method112(int var1, int var2, int var3) {
		Tile var4 = aTileArrayArrayArray1[var1][var2][var3];
		return var4 != null && var4.aClass33_1 != null ? var4.aClass33_1 : null;
	}

	public void method113(int var1, int var2, int var3, int var4, Entity var5, int var6, Entity var7,
			Entity var8) {
		DataClass1 var9 = new DataClass1();
		var9.aRenderable1 = var5;
		var9.anInt39 = var2 * 128 + 64;
		var9.anInt40 = var3 * 128 + 64;
		var9.anInt41 = var4;
		var9.anInt42 = var6;
		var9.aRenderable3 = var7;
		var9.aRenderable2 = var8;
		int var10 = 0;
		Tile var12 = aTileArrayArrayArray1[var1][var2][var3];
		if (var12 != null) {
			for (int var13 = 0; var13 < var12.anInt254; var13++) {
				if ((var12.aClass32Array2[var13].anInt117 & 0x100) == 256
						&& var12.aClass32Array2[var13].aRenderable6 instanceof Model) {
					Model var11 = (Model) var12.aClass32Array2[var13].aRenderable6;
					var11.method592();
					if (var11.anInt421 > var10) {
						var10 = var11.anInt421;
					}
				}
			}
		}

		var9.anInt43 = var10;
		if (aTileArrayArrayArray1[var1][var2][var3] == null) {
			aTileArrayArrayArray1[var1][var2][var3] = new Tile(var1, var2, var3);
		}

		aTileArrayArrayArray1[var1][var2][var3].aClass16_1 = var9;
	}

	public void method114(int var1, int var2) {
		Tile var3 = aTileArrayArrayArray1[0][var1][var2];

		for (int var5 = 0; var5 < 3; var5++) {
			Tile var6 = aTileArrayArrayArray1[var5][var1][var2] = aTileArrayArrayArray1[var5 + 1][var1][var2];
			if (var6 != null) {
				--var6.anInt257;

				for (int var7 = 0; var7 < var6.anInt254; var7++) {
					DataClass7 var4 = var6.aClass32Array2[var7];
					if ((var4.anInt127 >> 29 & 0x3) == 2 && var4.anInt120 == var1 && var4.anInt123 == var2) {
						--var4.anInt121;
					}
				}
			}
		}

		if (aTileArrayArrayArray1[0][var1][var2] == null) {
			aTileArrayArrayArray1[0][var1][var2] = new Tile(0, var1, var2);
		}

		aTileArrayArrayArray1[0][var1][var2].aTile1 = var3;
		aTileArrayArrayArray1[3][var1][var2] = null;
	}

	void method115(DataClass11 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var1.anIntArray4.length;

		int var12;
		int var15;
		int var16;
		int var17;
		int var18;
		for (var15 = 0; var15 < var8; var15++) {
			var16 = var1.anIntArray4[var15] - staticInt52;
			var17 = var1.anIntArray2[var15] - staticInt63;
			var18 = var1.anIntArray10[var15] - staticInt44;
			var12 = var18 * var4 + var16 * var5 >> 16;
			var18 = var18 * var5 - var16 * var4 >> 16;
			var16 = var12;
			var12 = var17 * var3 - var18 * var2 >> 16;
			var18 = var17 * var2 + var18 * var3 >> 16;
			if (var18 < 50) {
				return;
			}

			if (var1.anIntArray8 != null) {
				DataClass11.staticIntArray19[var15] = var16;
				DataClass11.staticIntArray18[var15] = var12;
				DataClass11.staticIntArray17[var15] = var18;
			}

			DataClass11.staticIntArray20[var15] = Rasterizer2DSub1.staticInt344
					+ var16 * Rasterizer2DSub1.staticInt342 / var18;
			DataClass11.staticIntArray21[var15] = Rasterizer2DSub1.staticInt349
					+ var12 * Rasterizer2DSub1.staticInt342 / var18;
		}

		Rasterizer2DSub1.staticInt340 = 0;
		var8 = var1.anIntArray6.length;

		for (var15 = 0; var15 < var8; var15++) {
			var16 = var1.anIntArray6[var15];
			var17 = var1.anIntArray9[var15];
			var18 = var1.anIntArray7[var15];
			var12 = DataClass11.staticIntArray20[var16];
			int var13 = DataClass11.staticIntArray20[var17];
			int var14 = DataClass11.staticIntArray20[var18];
			int var9 = DataClass11.staticIntArray21[var16];
			int var10 = DataClass11.staticIntArray21[var17];
			int var11 = DataClass11.staticIntArray21[var18];
			if ((var12 - var13) * (var11 - var10) - (var9 - var10) * (var14 - var13) > 0) {
				Rasterizer2DSub1.staticBool51 = false;
				if (var12 < 0 || var13 < 0 || var14 < 0 || var12 > Rasterizer2DSub1.staticInt343
						|| var13 > Rasterizer2DSub1.staticInt343 || var14 > Rasterizer2DSub1.staticInt343) {
					Rasterizer2DSub1.staticBool51 = true;
				}

				if (staticBool7 && method127(staticInt55, staticInt56, var9, var10, var11, var12, var13, var14)) {
					staticInt57 = var6;
					staticInt58 = var7;
				}

				if (var1.anIntArray8 != null && var1.anIntArray8[var15] != -1) {
					if (!staticBool6) {
						if (var1.aBool4) {
							Static.staticMethod450(var9, var10, var11, var12, var13, var14, var1.anIntArray3[var15],
									var1.anIntArray11[var15], var1.anIntArray5[var15], DataClass11.staticIntArray19[0],
									DataClass11.staticIntArray19[1], DataClass11.staticIntArray19[3], DataClass11.staticIntArray18[0],
									DataClass11.staticIntArray18[1], DataClass11.staticIntArray18[3], DataClass11.staticIntArray17[0],
									DataClass11.staticIntArray17[1], DataClass11.staticIntArray17[3], var1.anIntArray8[var15]);
						} else {
							Static.staticMethod450(var9, var10, var11, var12, var13, var14, var1.anIntArray3[var15],
									var1.anIntArray11[var15], var1.anIntArray5[var15], DataClass11.staticIntArray19[var16],
									DataClass11.staticIntArray19[var17], DataClass11.staticIntArray19[var18],
									DataClass11.staticIntArray18[var16], DataClass11.staticIntArray18[var17],
									DataClass11.staticIntArray18[var18], DataClass11.staticIntArray17[var16],
									DataClass11.staticIntArray17[var17], DataClass11.staticIntArray17[var18],
									var1.anIntArray8[var15]);
						}
					} else {
						int var19 = Rasterizer2DSub1.staticInterface2_1.method34(var1.anIntArray8[var15]);
						Static.staticMethod444(var9, var10, var11, var12, var13, var14,
								Static.staticMethod79(var19, var1.anIntArray3[var15]),
								Static.staticMethod79(var19, var1.anIntArray11[var15]),
								Static.staticMethod79(var19, var1.anIntArray5[var15]));
					}
				} else if (var1.anIntArray3[var15] != 12345678) {
					Static.staticMethod444(var9, var10, var11, var12, var13, var14, var1.anIntArray3[var15],
							var1.anIntArray11[var15], var1.anIntArray5[var15]);
				}
			}
		}

	}

	public int method116(int var1, int var2, int var3) {
		Tile var4 = aTileArrayArrayArray1[var1][var2][var3];
		return var4 != null && var4.aClass33_1 != null ? var4.aClass33_1.anInt140 : 0;
	}

	public int method117(int var1, int var2, int var3, int var4) {
		Tile var5 = aTileArrayArrayArray1[var1][var2][var3];
		if (var5 == null) {
			return -1;
		} else if (var5.aClass31_1 != null && var5.aClass31_1.anInt114 == var4) {
			return var5.aClass31_1.anInt113 & 0xff;
		} else if (var5.aWallObject1 != null && var5.aWallObject1.anInt135 == var4) {
			return var5.aWallObject1.anInt136 & 0xff;
		} else if (var5.aClass33_1 != null && var5.aClass33_1.anInt140 == var4) {
			return var5.aClass33_1.anInt142 & 0xff;
		} else {
			for (int var6 = 0; var6 < var5.anInt254; var6++) {
				if (var5.aClass32Array2[var6].anInt127 == var4) {
					return var5.aClass32Array2[var6].anInt117 & 0xff;
				}
			}

			return -1;
		}
	}

	public void method118(int var1, int var2, int var3) {
		Tile var4 = aTileArrayArrayArray1[var1][var2][var3];
		if (var4 != null) {
			var4.aClass33_1 = null;
		}

	}

	public int method119(int var1, int var2, int var3) {
		Tile var4 = aTileArrayArrayArray1[var1][var2][var3];
		if (var4 == null) {
			return 0;
		} else {
			for (int var5 = 0; var5 < var4.anInt254; var5++) {
				DataClass7 var6 = var4.aClass32Array2[var5];
				if ((var6.anInt127 >> 29 & 0x3) == 2 && var6.anInt120 == var2 && var6.anInt123 == var3) {
					return var6.anInt127;
				}
			}

			return 0;
		}
	}

	void method120(RenderableSub3 var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		int var11 = var3;
		int var17 = var3 + var5;
		int var18 = var4 - 1;
		int var15 = var4 + var6;

		for (int var16 = var2; var16 <= var2 + 1; var16++) {
			if (var16 != anInt71) {
				for (int var12 = var11; var12 <= var17; var12++) {
					if (var12 >= 0 && var12 < anInt70) {
						for (int var14 = var18; var14 <= var15; var14++) {
							if (var14 >= 0 && var14 < anInt68
									&& (!var7 || var12 >= var17 || var14 >= var15 || var14 < var4 && var12 != var3)) {
								Tile var8 = aTileArrayArrayArray1[var16][var12][var14];
								if (var8 != null) {
									int var13 = (anIntArrayArrayArray3[var16][var12][var14]
											+ anIntArrayArrayArray3[var16][var12 + 1][var14]
											+ anIntArrayArrayArray3[var16][var12][var14 + 1]
											+ anIntArrayArrayArray3[var16][var12 + 1][var14 + 1]) / 4
											- (anIntArrayArrayArray3[var2][var3][var4]
													+ anIntArrayArrayArray3[var2][var3 + 1][var4]
													+ anIntArrayArrayArray3[var2][var3][var4 + 1]
													+ anIntArrayArrayArray3[var2][var3 + 1][var4 + 1]) / 4;
									DataClass5 var20 = var8.aClass31_1;
									if (var20 != null) {
										RenderableSub3 var23;
										if (var20.aRenderable5 instanceof RenderableSub3) {
											var23 = (RenderableSub3) var20.aRenderable5;
											Static.staticMethod436(var1, var23, (var12 - var3) * 128 + (1 - var5) * 64,
													var13, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}

										if (var20.aRenderable4 instanceof RenderableSub3) {
											var23 = (RenderableSub3) var20.aRenderable4;
											Static.staticMethod436(var1, var23, (var12 - var3) * 128 + (1 - var5) * 64,
													var13, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}
									}

									for (int var231 = 0; var231 < var8.anInt254; var231++) {
										DataClass7 var10 = var8.aClass32Array2[var231];
										if (var10 != null && var10.aRenderable6 instanceof RenderableSub3) {
											RenderableSub3 var21 = (RenderableSub3) var10.aRenderable6;
											int var22 = var10.anInt128 - var10.anInt120 + 1;
											int var19 = var10.anInt124 - var10.anInt123 + 1;
											Static.staticMethod436(var1, var21,
													(var10.anInt120 - var3) * 128 + (var22 - var5) * 64, var13,
													(var10.anInt123 - var4) * 128 + (var19 - var6) * 64, var7);
										}
									}
								}
							}
						}
					}
				}

				--var11;
				var7 = false;
			}
		}

	}

	public void method121(int var1, int var2, int var3, boolean var4) {
		if (!Static.staticMethod80() || var4) {
			staticBool7 = true;
			staticBool8 = var4;
			staticInt43 = var1;
			staticInt55 = var2;
			staticInt56 = var3;
			staticInt57 = -1;
			staticInt58 = -1;
		}

	}

	public void method122() {
		staticBool8 = true;
	}

	boolean method123(int var1, int var2, int var3, int var4) {
		if (!method129(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var7 = var3 << 7;
			int var8 = anIntArrayArrayArray3[var1][var2][var3] - 1;
			int var10 = var8 - 120;
			int var6 = var8 - 230;
			int var9 = var8 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > staticInt52) {
						if (!method137(var5, var8, var7)) {
							return false;
						}

						if (!method137(var5, var8, var7 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!method137(var5, var10, var7)) {
							return false;
						}

						if (!method137(var5, var10, var7 + 128)) {
							return false;
						}
					}

					if (!method137(var5, var6, var7)) {
						return false;
					}

					if (!method137(var5, var6, var7 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var7 < staticInt44) {
						if (!method137(var5, var8, var7 + 128)) {
							return false;
						}

						if (!method137(var5 + 128, var8, var7 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!method137(var5, var10, var7 + 128)) {
							return false;
						}

						if (!method137(var5 + 128, var10, var7 + 128)) {
							return false;
						}
					}

					if (!method137(var5, var6, var7 + 128)) {
						return false;
					}

					if (!method137(var5 + 128, var6, var7 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var5 < staticInt52) {
						if (!method137(var5 + 128, var8, var7)) {
							return false;
						}

						if (!method137(var5 + 128, var8, var7 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!method137(var5 + 128, var10, var7)) {
							return false;
						}

						if (!method137(var5 + 128, var10, var7 + 128)) {
							return false;
						}
					}

					if (!method137(var5 + 128, var6, var7)) {
						return false;
					}

					if (!method137(var5 + 128, var6, var7 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var7 > staticInt44) {
						if (!method137(var5, var8, var7)) {
							return false;
						}

						if (!method137(var5 + 128, var8, var7)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!method137(var5, var10, var7)) {
							return false;
						}

						if (!method137(var5 + 128, var10, var7)) {
							return false;
						}
					}

					if (!method137(var5, var6, var7)) {
						return false;
					}

					if (!method137(var5 + 128, var6, var7)) {
						return false;
					}

					return true;
				}
			}

			return !method137(var5 + 64, var9, var7 + 64) ? false
					: var4 == 16 ? method137(var5, var6, var7 + 128)
							: var4 == 32 ? method137(var5 + 128, var6, var7 + 128)
									: var4 == 64 ? method137(var5 + 128, var6, var7)
											: var4 == 128 ? method137(var5, var6, var7) : true;
		}
	}

	public void method124(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 < 0) {
			var1 = 0;
		} else if (var1 >= anInt70 * 128) {
			var1 = anInt70 * 128 - 1;
		}

		if (var3 < 0) {
			var3 = 0;
		} else if (var3 >= anInt68 * 128) {
			var3 = anInt68 * 128 - 1;
		}

		++staticInt53;
		staticInt68 = Rasterizer2DSub1.staticIntArray154[var4];
		staticInt60 = Rasterizer2DSub1.staticIntArray159[var4];
		staticInt61 = Rasterizer2DSub1.staticIntArray154[var5];
		staticInt49 = Rasterizer2DSub1.staticIntArray159[var5];
		staticBoolArrayArray1 = staticBoolArrayArrayArrayArray1[(var4 - 128) / 32][var5 / 64];
		staticInt52 = var1;
		staticInt63 = var2;
		staticInt44 = var3;
		staticInt42 = var1 / 128;
		staticInt62 = var3 / 128;
		staticInt46 = var6;
		staticInt50 = staticInt42 - 25;
		if (staticInt50 < 0) {
			staticInt50 = 0;
		}

		staticInt48 = staticInt62 - 25;
		if (staticInt48 < 0) {
			staticInt48 = 0;
		}

		staticInt47 = staticInt42 + 25;
		if (staticInt47 > anInt70) {
			staticInt47 = anInt70;
		}

		staticInt54 = staticInt62 + 25;
		if (staticInt54 > anInt68) {
			staticInt54 = anInt68;
		}

		method128();
		staticInt45 = 0;

		int var9;
		int var13;
		int var14;
		Tile[][] var15;
		Tile var7;
		for (var13 = anInt69; var13 < anInt71; var13++) {
			var15 = aTileArrayArrayArray1[var13];

			for (var9 = staticInt50; var9 < staticInt47; var9++) {
				for (var14 = staticInt48; var14 < staticInt54; var14++) {
					var7 = var15[var9][var14];
					if (var7 != null) {
						if (var7.anInt256 > var6
								|| !staticBoolArrayArray1[var9 - staticInt42 + 25][var14 - staticInt62 + 25]
										&& anIntArrayArrayArray3[var13][var9][var14] - var2 < 2000) {
							var7.aBool27 = false;
							var7.aBool28 = false;
							var7.anInt263 = 0;
						} else {
							var7.aBool27 = true;
							var7.aBool28 = true;
							if (var7.anInt254 > 0) {
								var7.aBool29 = true;
							} else {
								var7.aBool29 = false;
							}

							++staticInt45;
						}
					}
				}
			}
		}

		int var10;
		int var11;
		int var12;
		int var16;
		for (var13 = anInt69; var13 < anInt71; var13++) {
			var15 = aTileArrayArrayArray1[var13];

			for (var9 = -25; var9 <= 0; var9++) {
				var14 = staticInt42 + var9;
				var16 = staticInt42 - var9;
				if (var14 >= staticInt50 || var16 < staticInt47) {
					for (var12 = -25; var12 <= 0; var12++) {
						var10 = staticInt62 + var12;
						var11 = staticInt62 - var12;
						if (var14 >= staticInt50) {
							if (var10 >= staticInt48) {
								var7 = var15[var14][var10];
								if (var7 != null && var7.aBool27) {
									method125(var7, true);
								}
							}

							if (var11 < staticInt54) {
								var7 = var15[var14][var11];
								if (var7 != null && var7.aBool27) {
									method125(var7, true);
								}
							}
						}

						if (var16 < staticInt47) {
							if (var10 >= staticInt48) {
								var7 = var15[var16][var10];
								if (var7 != null && var7.aBool27) {
									method125(var7, true);
								}
							}

							if (var11 < staticInt54) {
								var7 = var15[var16][var11];
								if (var7 != null && var7.aBool27) {
									method125(var7, true);
								}
							}
						}

						if (staticInt45 == 0) {
							staticBool7 = false;
							return;
						}
					}
				}
			}
		}

		for (var13 = anInt69; var13 < anInt71; var13++) {
			var15 = aTileArrayArrayArray1[var13];

			for (var9 = -25; var9 <= 0; var9++) {
				var14 = staticInt42 + var9;
				var16 = staticInt42 - var9;
				if (var14 >= staticInt50 || var16 < staticInt47) {
					for (var12 = -25; var12 <= 0; var12++) {
						var10 = staticInt62 + var12;
						var11 = staticInt62 - var12;
						if (var14 >= staticInt50) {
							if (var10 >= staticInt48) {
								var7 = var15[var14][var10];
								if (var7 != null && var7.aBool27) {
									method125(var7, false);
								}
							}

							if (var11 < staticInt54) {
								var7 = var15[var14][var11];
								if (var7 != null && var7.aBool27) {
									method125(var7, false);
								}
							}
						}

						if (var16 < staticInt47) {
							if (var10 >= staticInt48) {
								var7 = var15[var16][var10];
								if (var7 != null && var7.aBool27) {
									method125(var7, false);
								}
							}

							if (var11 < staticInt54) {
								var7 = var15[var16][var11];
								if (var7 != null && var7.aBool27) {
									method125(var7, false);
								}
							}
						}

						if (staticInt45 == 0) {
							staticBool7 = false;
							return;
						}
					}
				}
			}
		}

		staticBool7 = false;
	}

	void method125(Tile var1, boolean var2) {
		staticClass39_1.method198(var1);

		while (true) {
			Tile var3;
			int var4;
			int var5;
			int var6;
			int var7;
			Tile[][] var8;
			Tile var9;
			int var11;
			int var14;
			int var15;
			int var16;
			int var24;
			int var26;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										DataClass5 var29;
										DataClass7 var32;
										int var28;
										int var18;
										int var21;
										boolean var22;
										Tile var33;
										while (true) {
											do {
												var3 = (Tile) staticClass39_1.method194();
												if (var3 == null) {
													return;
												}
											} while (!var3.aBool28);

											var4 = var3.anInt262;
											var5 = var3.anInt253;
											var6 = var3.anInt257;
											var7 = var3.anInt261 * -685245619;
											var8 = aTileArrayArrayArray1[var6];
											if (!var3.aBool27) {
												break;
											}

											if (var2) {
												if (var6 > 0) {
													var9 = aTileArrayArrayArray1[var6 - 1][var4][var5];
													if (var9 != null && var9.aBool28) {
														continue;
													}
												}

												if (var4 <= staticInt42 && var4 > staticInt50) {
													var9 = var8[var4 - 1][var5];
													if (var9 != null && var9.aBool28
															&& (var9.aBool27 || (var3.anInt255 & 0x1) == 0)) {
														continue;
													}
												}

												if (var4 >= staticInt42 && var4 < staticInt47 - 1) {
													var9 = var8[var4 + 1][var5];
													if (var9 != null && var9.aBool28
															&& (var9.aBool27 || (var3.anInt255 & 0x4) == 0)) {
														continue;
													}
												}

												if (var5 <= staticInt62 && var5 > staticInt48) {
													var9 = var8[var4][var5 - 1];
													if (var9 != null && var9.aBool28
															&& (var9.aBool27 || (var3.anInt255 & 0x8) == 0)) {
														continue;
													}
												}

												if (var5 >= staticInt62 && var5 < staticInt54 - 1) {
													var9 = var8[var4][var5 + 1];
													if (var9 != null && var9.aBool28
															&& (var9.aBool27 || (var3.anInt255 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												var2 = true;
											}

											var3.aBool27 = false;
											if (var3.aTile1 != null) {
												var9 = var3.aTile1;
												if (var9.aClass26_1 != null) {
													if (!method129(0, var4, var5)) {
														method97(var9.aClass26_1, 0, staticInt68, staticInt60,
																staticInt61, staticInt49, var4, var5);
													}
												} else if (var9.aClass8_1 != null && !method129(0, var4, var5)) {
													method115(var9.aClass8_1, staticInt68, staticInt60, staticInt61,
															staticInt49, var4, var5);
												}

												var29 = var9.aClass31_1;
												if (var29 != null) {
													var29.aRenderable5.method435(0, staticInt68, staticInt60,
															staticInt61, staticInt49, var29.anInt110 - staticInt52,
															var29.anInt109 - staticInt63, var29.anInt111 - staticInt44,
															var29.anInt114);
												}

												for (var11 = 0; var11 < var9.anInt254; var11++) {
													var32 = var9.aClass32Array2[var11];
													if (var32 != null) {
														var32.aRenderable6.method435(var32.anInt116, staticInt68,
																staticInt60, staticInt61, staticInt49,
																var32.anInt118 - staticInt52,
																var32.anInt122 - staticInt63,
																var32.anInt119 - staticInt44, var32.anInt127);
													}
												}
											}

											var22 = false;
											if (var3.aClass26_1 != null) {
												if (!method129(var7, var4, var5)) {
													var22 = true;
													if (var3.aClass26_1.anInt78 != 12345678
															|| staticBool7 && var6 <= staticInt43) {
														method97(var3.aClass26_1, var7, staticInt68, staticInt60,
																staticInt61, staticInt49, var4, var5);
													}
												}
											} else if (var3.aClass8_1 != null && !method129(var7, var4, var5)) {
												var22 = true;
												method115(var3.aClass8_1, staticInt68, staticInt60, staticInt61,
														staticInt49, var4, var5);
											}

											var21 = 0;
											var11 = 0;
											DataClass5 var20 = var3.aClass31_1;
											WallObject var35 = var3.aWallObject1;
											if (var20 != null || var35 != null) {
												if (staticInt42 == var4) {
													++var21;
												} else if (staticInt42 < var4) {
													var21 += 2;
												}

												if (staticInt62 == var5) {
													var21 += 3;
												} else if (staticInt62 > var5) {
													var21 += 6;
												}

												var11 = staticIntArray42[var21];
												var3.anInt260 = staticIntArray39[var21];
											}

											if (var20 != null) {
												if ((var20.anInt112 & staticIntArray43[var21]) != 0) {
													if (var20.anInt112 == 16) {
														var3.anInt263 = 3;
														var3.anInt258 = staticIntArray44[var21];
														var3.anInt259 = 1566289425 - var3.anInt258 * 522096475;
													} else if (var20.anInt112 == 32) {
														var3.anInt263 = 6;
														var3.anInt258 = staticIntArray37[var21];
														var3.anInt259 = -1162388446 - var3.anInt258 * 522096475;
													} else if (var20.anInt112 == 64) {
														var3.anInt263 = 12;
														var3.anInt258 = staticIntArray41[var21];
														var3.anInt259 = 1970190404 - var3.anInt258 * 522096475;
													} else {
														var3.anInt263 = 9;
														var3.anInt258 = staticIntArray38[var21];
														var3.anInt259 = 403900979 - var3.anInt258 * 522096475;
													}
												} else {
													var3.anInt263 = 0;
												}

												if ((var20.anInt112 & var11) != 0
														&& !method123(var7, var4, var5, var20.anInt112)) {
													var20.aRenderable5.method435(0, staticInt68, staticInt60,
															staticInt61, staticInt49, var20.anInt110 - staticInt52,
															var20.anInt109 - staticInt63, var20.anInt111 - staticInt44,
															var20.anInt114);
												}

												if ((var20.anInt115 & var11) != 0
														&& !method123(var7, var4, var5, var20.anInt115)) {
													var20.aRenderable4.method435(0, staticInt68, staticInt60,
															staticInt61, staticInt49, var20.anInt110 - staticInt52,
															var20.anInt109 - staticInt63, var20.anInt111 - staticInt44,
															var20.anInt114);
												}
											}

											if (var35 != null
													&& !method103(var7, var4, var5, var35.aRenderable8.anInt421)) {
												if ((var35.anInt131 & var11) != 0) {
													var35.aRenderable8.method435(0, staticInt68, staticInt60,
															staticInt61, staticInt49,
															var35.anInt132 - staticInt52 + var35.anInt137,
															var35.anInt134 - staticInt63,
															var35.anInt129 - staticInt44 + var35.anInt133,
															var35.anInt135);
												} else if (var35.anInt131 == 256) {
													var14 = var35.anInt132 - staticInt52;
													var15 = var35.anInt134 - staticInt63;
													var16 = var35.anInt129 - staticInt44;
													var28 = var35.anInt130;
													if (var28 != 1 && var28 != 2) {
														var18 = var14;
													} else {
														var18 = -var14;
													}

													int var36;
													if (var28 != 2 && var28 != 3) {
														var36 = var16;
													} else {
														var36 = -var16;
													}

													if (var36 < var18) {
														var35.aRenderable8.method435(0, staticInt68, staticInt60,
																staticInt61, staticInt49, var14 + var35.anInt137, var15,
																var16 + var35.anInt133, var35.anInt135);
													} else if (var35.aRenderable7 != null) {
														var35.aRenderable7.method435(0, staticInt68, staticInt60,
																staticInt61, staticInt49, var14, var15, var16,
																var35.anInt135);
													}
												}
											}

											if (var22) {
												DataClass6 var34 = var3.aClass33_1;
												if (var34 != null) {
													var34.aRenderable9.method435(0, staticInt68, staticInt60,
															staticInt61, staticInt49, var34.anInt139 - staticInt52,
															var34.anInt141 - staticInt63, var34.anInt138 - staticInt44,
															var34.anInt140);
												}

												DataClass1 var31 = var3.aClass16_1;
												if (var31 != null && var31.anInt43 == 0) {
													if (var31.aRenderable3 != null) {
														var31.aRenderable3.method435(0, staticInt68, staticInt60,
																staticInt61, staticInt49, var31.anInt39 - staticInt52,
																var31.anInt41 - staticInt63,
																var31.anInt40 - staticInt44, var31.anInt42);
													}

													if (var31.aRenderable2 != null) {
														var31.aRenderable2.method435(0, staticInt68, staticInt60,
																staticInt61, staticInt49, var31.anInt39 - staticInt52,
																var31.anInt41 - staticInt63,
																var31.anInt40 - staticInt44, var31.anInt42);
													}

													if (var31.aRenderable1 != null) {
														var31.aRenderable1.method435(0, staticInt68, staticInt60,
																staticInt61, staticInt49, var31.anInt39 - staticInt52,
																var31.anInt41 - staticInt63,
																var31.anInt40 - staticInt44, var31.anInt42);
													}
												}
											}

											var14 = var3.anInt255;
											if (var14 != 0) {
												if (var4 < staticInt42 && (var14 & 0x4) != 0) {
													var33 = var8[var4 + 1][var5];
													if (var33 != null && var33.aBool28) {
														staticClass39_1.method198(var33);
													}
												}

												if (var5 < staticInt62 && (var14 & 0x2) != 0) {
													var33 = var8[var4][var5 + 1];
													if (var33 != null && var33.aBool28) {
														staticClass39_1.method198(var33);
													}
												}

												if (var4 > staticInt42 && (var14 & 0x1) != 0) {
													var33 = var8[var4 - 1][var5];
													if (var33 != null && var33.aBool28) {
														staticClass39_1.method198(var33);
													}
												}

												if (var5 > staticInt62 && (var14 & 0x8) != 0) {
													var33 = var8[var4][var5 - 1];
													if (var33 != null && var33.aBool28) {
														staticClass39_1.method198(var33);
													}
												}
											}
											break;
										}

										if (var3.anInt263 != 0) {
											var22 = true;

											for (var21 = 0; var21 < var3.anInt254; var21++) {
												if (var3.aClass32Array2[var21].anInt126 != staticInt53
														&& (var3.anIntArray66[var21]
																& var3.anInt263) == var3.anInt258) {
													var22 = false;
													break;
												}
											}

											if (var22) {
												var29 = var3.aClass31_1;
												if (!method123(var7, var4, var5, var29.anInt112)) {
													var29.aRenderable5.method435(0, staticInt68, staticInt60,
															staticInt61, staticInt49, var29.anInt110 - staticInt52,
															var29.anInt109 - staticInt63, var29.anInt111 - staticInt44,
															var29.anInt114);
												}

												var3.anInt263 = 0;
											}
										}

										if (!var3.aBool29) {
											break;
										}

										try {
											int var321 = var3.anInt254;
											var3.aBool29 = false;
											var21 = 0;

											label560: for (var11 = 0; var11 < var321; var11++) {
												var32 = var3.aClass32Array2[var11];
												if (var32.anInt126 != staticInt53) {
													for (var26 = var32.anInt120; var26 <= var32.anInt128; var26++) {
														for (var14 = var32.anInt123; var14 <= var32.anInt124; var14++) {
															var33 = var8[var26][var14];
															if (var33.aBool27) {
																var3.aBool29 = true;
																continue label560;
															}

															if (var33.anInt263 != 0) {
																var16 = 0;
																if (var26 > var32.anInt120) {
																	++var16;
																}

																if (var26 < var32.anInt128) {
																	var16 += 4;
																}

																if (var14 > var32.anInt123) {
																	var16 += 8;
																}

																if (var14 < var32.anInt124) {
																	var16 += 2;
																}

																if ((var16 & var33.anInt263) == var3.anInt259
																		* 755960019) {
																	var3.aBool29 = true;
																	continue label560;
																}
															}
														}
													}

													staticClass32Array1[var21++] = var32;
													var26 = staticInt42 - var32.anInt120;
													var14 = var32.anInt128 - staticInt42;
													if (var14 > var26) {
														var26 = var14;
													}

													var15 = staticInt62 - var32.anInt123;
													var16 = var32.anInt124 - staticInt62;
													if (var16 > var15) {
														var32.anInt125 = var26 + var16;
													} else {
														var32.anInt125 = var26 + var15;
													}
												}
											}

											while (var21 > 0) {
												var11 = -50;
												var24 = -1;

												DataClass7 var331;
												for (var26 = 0; var26 < var21; var26++) {
													var331 = staticClass32Array1[var26];
													if (var331.anInt126 != staticInt53) {
														if (var331.anInt125 > var11) {
															var11 = var331.anInt125;
															var24 = var26;
														} else if (var331.anInt125 == var11) {
															var15 = var331.anInt118 - staticInt52;
															var16 = var331.anInt119 - staticInt44;
															var28 = staticClass32Array1[var24].anInt118 - staticInt52;
															var18 = staticClass32Array1[var24].anInt119 - staticInt44;
															if (var15 * var15 + var16 * var16 > var28 * var28
																	+ var18 * var18) {
																var24 = var26;
															}
														}
													}
												}

												if (var24 == -1) {
													break;
												}

												var331 = staticClass32Array1[var24];
												var331.anInt126 = staticInt53;
												if (!method130(var7, var331.anInt120, var331.anInt128, var331.anInt123,
														var331.anInt124, var331.aRenderable6.anInt421)) {
													var331.aRenderable6.method435(var331.anInt116, staticInt68,
															staticInt60, staticInt61, staticInt49,
															var331.anInt118 - staticInt52,
															var331.anInt122 - staticInt63,
															var331.anInt119 - staticInt44, var331.anInt127);
												}

												for (var14 = var331.anInt120; var14 <= var331.anInt128; var14++) {
													for (var15 = var331.anInt123; var15 <= var331.anInt124; var15++) {
														Tile var351 = var8[var14][var15];
														if (var351.anInt263 != 0) {
															staticClass39_1.method198(var351);
														} else if ((var14 != var4 || var15 != var5) && var351.aBool28) {
															staticClass39_1.method198(var351);
														}
													}
												}
											}

											if (!var3.aBool29) {
												break;
											}
										} catch (Exception var27) {
											var3.aBool29 = false;
											break;
										}
									}
								} while (!var3.aBool28);
							} while (var3.anInt263 != 0);

							if (var4 > staticInt42 || var4 <= staticInt50) {
								break;
							}

							var9 = var8[var4 - 1][var5];
						} while (var9 != null && var9.aBool28);

						if (var4 < staticInt42 || var4 >= staticInt47 - 1) {
							break;
						}

						var9 = var8[var4 + 1][var5];
					} while (var9 != null && var9.aBool28);

					if (var5 > staticInt62 || var5 <= staticInt48) {
						break;
					}

					var9 = var8[var4][var5 - 1];
				} while (var9 != null && var9.aBool28);

				if (var5 < staticInt62 || var5 >= staticInt54 - 1) {
					break;
				}

				var9 = var8[var4][var5 + 1];
			} while (var9 != null && var9.aBool28);

			var3.aBool28 = false;
			--staticInt45;
			DataClass1 var281 = var3.aClass16_1;
			if (var281 != null && var281.anInt43 != 0) {
				if (var281.aRenderable3 != null) {
					var281.aRenderable3.method435(0, staticInt68, staticInt60, staticInt61, staticInt49,
							var281.anInt39 - staticInt52, var281.anInt41 - staticInt63 - var281.anInt43,
							var281.anInt40 - staticInt44, var281.anInt42);
				}

				if (var281.aRenderable2 != null) {
					var281.aRenderable2.method435(0, staticInt68, staticInt60, staticInt61, staticInt49,
							var281.anInt39 - staticInt52, var281.anInt41 - staticInt63 - var281.anInt43,
							var281.anInt40 - staticInt44, var281.anInt42);
				}

				if (var281.aRenderable1 != null) {
					var281.aRenderable1.method435(0, staticInt68, staticInt60, staticInt61, staticInt49,
							var281.anInt39 - staticInt52, var281.anInt41 - staticInt63 - var281.anInt43,
							var281.anInt40 - staticInt44, var281.anInt42);
				}
			}

			if (var3.anInt260 != 0) {
				WallObject var291 = var3.aWallObject1;
				if (var291 != null && !method103(var7, var4, var5, var291.aRenderable8.anInt421)) {
					if ((var291.anInt131 & var3.anInt260) != 0) {
						var291.aRenderable8.method435(0, staticInt68, staticInt60, staticInt61, staticInt49,
								var291.anInt132 - staticInt52 + var291.anInt137, var291.anInt134 - staticInt63,
								var291.anInt129 - staticInt44 + var291.anInt133, var291.anInt135);
					} else if (var291.anInt131 == 256) {
						var11 = var291.anInt132 - staticInt52;
						var24 = var291.anInt134 - staticInt63;
						var26 = var291.anInt129 - staticInt44;
						var14 = var291.anInt130;
						if (var14 != 1 && var14 != 2) {
							var15 = var11;
						} else {
							var15 = -var11;
						}

						if (var14 != 2 && var14 != 3) {
							var16 = var26;
						} else {
							var16 = -var26;
						}

						if (var16 >= var15) {
							var291.aRenderable8.method435(0, staticInt68, staticInt60, staticInt61, staticInt49,
									var11 + var291.anInt137, var24, var26 + var291.anInt133, var291.anInt135);
						} else if (var291.aRenderable7 != null) {
							var291.aRenderable7.method435(0, staticInt68, staticInt60, staticInt61, staticInt49, var11,
									var24, var26, var291.anInt135);
						}
					}
				}

				DataClass5 var311 = var3.aClass31_1;
				if (var311 != null) {
					if ((var311.anInt115 & var3.anInt260) != 0 && !method123(var7, var4, var5, var311.anInt115)) {
						var311.aRenderable4.method435(0, staticInt68, staticInt60, staticInt61, staticInt49,
								var311.anInt110 - staticInt52, var311.anInt109 - staticInt63,
								var311.anInt111 - staticInt44, var311.anInt114);
					}

					if ((var311.anInt112 & var3.anInt260) != 0 && !method123(var7, var4, var5, var311.anInt112)) {
						var311.aRenderable5.method435(0, staticInt68, staticInt60, staticInt61, staticInt49,
								var311.anInt110 - staticInt52, var311.anInt109 - staticInt63,
								var311.anInt111 - staticInt44, var311.anInt114);
					}
				}
			}

			Tile var30;
			if (var6 < anInt71 - 1) {
				var30 = aTileArrayArrayArray1[var6 + 1][var4][var5];
				if (var30 != null && var30.aBool28) {
					staticClass39_1.method198(var30);
				}
			}

			if (var4 < staticInt42) {
				var30 = var8[var4 + 1][var5];
				if (var30 != null && var30.aBool28) {
					staticClass39_1.method198(var30);
				}
			}

			if (var5 < staticInt62) {
				var30 = var8[var4][var5 + 1];
				if (var30 != null && var30.aBool28) {
					staticClass39_1.method198(var30);
				}
			}

			if (var4 > staticInt42) {
				var30 = var8[var4 - 1][var5];
				if (var30 != null && var30.aBool28) {
					staticClass39_1.method198(var30);
				}
			}

			if (var5 > staticInt62) {
				var30 = var8[var4][var5 - 1];
				if (var30 != null && var30.aBool28) {
					staticClass39_1.method198(var30);
				}
			}
		}
	}

	public void method126(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < anInt71; var4++) {
			for (int var7 = 0; var7 < anInt70; var7++) {
				for (int var8 = 0; var8 < anInt68; var8++) {
					Tile var6 = aTileArrayArrayArray1[var4][var7][var8];
					if (var6 != null) {
						DataClass5 var5 = var6.aClass31_1;
						RenderableSub3 var10;
						if (var5 != null && var5.aRenderable5 instanceof RenderableSub3) {
							RenderableSub3 var14 = (RenderableSub3) var5.aRenderable5;
							method120(var14, var4, var7, var8, 1, 1);
							if (var5.aRenderable4 instanceof RenderableSub3) {
								var10 = (RenderableSub3) var5.aRenderable4;
								method120(var10, var4, var7, var8, 1, 1);
								Static.staticMethod436(var14, var10, 0, 0, 0, false);
								var5.aRenderable4 = var10.method583(var10.aShort2, var10.aShort3, var1, var2, var3);
							}

							var5.aRenderable5 = var14.method583(var14.aShort2, var14.aShort3, var1, var2, var3);
						}

						for (int var13 = 0; var13 < var6.anInt254; var13++) {
							DataClass7 var12 = var6.aClass32Array2[var13];
							if (var12 != null && var12.aRenderable6 instanceof RenderableSub3) {
								RenderableSub3 var9 = (RenderableSub3) var12.aRenderable6;
								method120(var9, var4, var7, var8, var12.anInt128 - var12.anInt120 + 1,
										var12.anInt124 - var12.anInt123 + 1);
								var12.aRenderable6 = var9.method583(var9.aShort2, var9.aShort3, var1, var2, var3);
							}
						}

						DataClass6 var141 = var6.aClass33_1;
						if (var141 != null && var141.aRenderable9 instanceof RenderableSub3) {
							var10 = (RenderableSub3) var141.aRenderable9;
							method136(var10, var4, var7, var8);
							var141.aRenderable9 = var10.method583(var10.aShort2, var10.aShort3, var1, var2, var3);
						}
					}
				}
			}
		}

	}

	boolean method127(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var2 < var3 && var2 < var4 && var2 < var5) {
			return false;
		} else if (var2 > var3 && var2 > var4 && var2 > var5) {
			return false;
		} else if (var1 < var6 && var1 < var7 && var1 < var8) {
			return false;
		} else if (var1 > var6 && var1 > var7 && var1 > var8) {
			return false;
		} else {
			int var9 = (var2 - var3) * (var7 - var6) - (var1 - var6) * (var4 - var3);
			int var11 = (var2 - var5) * (var6 - var8) - (var1 - var8) * (var3 - var5);
			int var10 = (var2 - var4) * (var8 - var7) - (var1 - var7) * (var5 - var4);
			return var9 * var10 > 0 && var10 * var11 > 0;
		}
	}

	void method128() {
		int var1 = staticIntArray40[staticInt46];
		DataClass4[] var11 = staticClass30ArrayArray1[staticInt46];
		staticInt59 = 0;

		for (int var4 = 0; var4 < var1; var4++) {
			DataClass4 var2 = var11[var4];
			int var3;
			int var5;
			int var6;
			int var7;
			boolean var13;
			if (var2.anInt95 == 1) {
				var6 = var2.anInt92 - staticInt42 + 25;
				if (var6 >= 0 && var6 <= 50) {
					var5 = var2.anInt93 - staticInt62 + 25;
					if (var5 < 0) {
						var5 = 0;
					}

					var7 = var2.anInt96 - staticInt62 + 25;
					if (var7 > 50) {
						var7 = 50;
					}

					var13 = false;

					while (var5 <= var7) {
						if (staticBoolArrayArray1[var6][var5++]) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						var3 = staticInt52 - var2.anInt108;
						if (var3 > 32) {
							var2.anInt102 = 1;
						} else {
							if (var3 >= -32) {
								continue;
							}

							var2.anInt102 = 2;
							var3 = -var3;
						}

						var2.anInt105 = (var2.anInt98 - staticInt44 << 8) / var3;
						var2.anInt106 = (var2.anInt91 - staticInt44 << 8) / var3;
						var2.anInt107 = (var2.anInt100 - staticInt63 << 8) / var3;
						var2.anInt99 = (var2.anInt101 - staticInt63 << 8) / var3;
						staticClass30Array1[staticInt59++] = var2;
					}
				}
			} else if (var2.anInt95 == 2) {
				var6 = var2.anInt93 - staticInt62 + 25;
				if (var6 >= 0 && var6 <= 50) {
					var5 = var2.anInt92 - staticInt42 + 25;
					if (var5 < 0) {
						var5 = 0;
					}

					var7 = var2.anInt103 - staticInt42 + 25;
					if (var7 > 50) {
						var7 = 50;
					}

					var13 = false;

					while (var5 <= var7) {
						if (staticBoolArrayArray1[var5++][var6]) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						var3 = staticInt44 - var2.anInt98;
						if (var3 > 32) {
							var2.anInt102 = 3;
						} else {
							if (var3 >= -32) {
								continue;
							}

							var2.anInt102 = 4;
							var3 = -var3;
						}

						var2.anInt97 = (var2.anInt108 - staticInt52 << 8) / var3;
						var2.anInt104 = (var2.anInt94 - staticInt52 << 8) / var3;
						var2.anInt107 = (var2.anInt100 - staticInt63 << 8) / var3;
						var2.anInt99 = (var2.anInt101 - staticInt63 << 8) / var3;
						staticClass30Array1[staticInt59++] = var2;
					}
				}
			} else if (var2.anInt95 == 4) {
				var6 = var2.anInt100 - staticInt63;
				if (var6 > 128) {
					var5 = var2.anInt93 - staticInt62 + 25;
					if (var5 < 0) {
						var5 = 0;
					}

					var7 = var2.anInt96 - staticInt62 + 25;
					if (var7 > 50) {
						var7 = 50;
					}

					if (var5 <= var7) {
						int var8 = var2.anInt92 - staticInt42 + 25;
						if (var8 < 0) {
							var8 = 0;
						}

						var3 = var2.anInt103 - staticInt42 + 25;
						if (var3 > 50) {
							var3 = 50;
						}

						boolean var9 = false;

						label142: for (int var10 = var8; var10 <= var3; var10++) {
							for (int var12 = var5; var12 <= var7; var12++) {
								if (staticBoolArrayArray1[var10][var12]) {
									var9 = true;
									break label142;
								}
							}
						}

						if (var9) {
							var2.anInt102 = 5;
							var2.anInt97 = (var2.anInt108 - staticInt52 << 8) / var6;
							var2.anInt104 = (var2.anInt94 - staticInt52 << 8) / var6;
							var2.anInt105 = (var2.anInt98 - staticInt44 << 8) / var6;
							var2.anInt106 = (var2.anInt91 - staticInt44 << 8) / var6;
							staticClass30Array1[staticInt59++] = var2;
						}
					}
				}
			}
		}

	}

	boolean method129(int var1, int var2, int var3) {
		int var4 = anIntArrayArrayArray4[var1][var2][var3];
		if (var4 == -staticInt53) {
			return false;
		} else if (var4 == staticInt53) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (method137(var5 + 1, anIntArrayArrayArray3[var1][var2][var3], var6 + 1)
					&& method137(var5 + 128 - 1, anIntArrayArrayArray3[var1][var2 + 1][var3], var6 + 1)
					&& method137(var5 + 128 - 1, anIntArrayArrayArray3[var1][var2 + 1][var3 + 1], var6 + 128 - 1)
					&& method137(var5 + 1, anIntArrayArrayArray3[var1][var2][var3 + 1], var6 + 128 - 1)) {
				anIntArrayArrayArray4[var1][var2][var3] = staticInt53;
				return true;
			} else {
				anIntArrayArrayArray4[var1][var2][var3] = -staticInt53;
				return false;
			}
		}
	}

	boolean method130(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var2 == var3 && var4 == var5) {
			if (!method129(var1, var2, var4)) {
				return false;
			} else {
				var8 = var2 << 7;
				var7 = var4 << 7;
				return method137(var8 + 1, anIntArrayArrayArray3[var1][var2][var4] - var6, var7 + 1)
						&& method137(var8 + 128 - 1, anIntArrayArrayArray3[var1][var2 + 1][var4] - var6, var7 + 1)
						&& method137(var8 + 128 - 1, anIntArrayArrayArray3[var1][var2 + 1][var4 + 1] - var6,
								var7 + 128 - 1)
						&& method137(var8 + 1, anIntArrayArrayArray3[var1][var2][var4 + 1] - var6, var7 + 128 - 1);
			}
		} else {
			for (var8 = var2; var8 <= var3; var8++) {
				for (var7 = var4; var7 <= var5; var7++) {
					if (anIntArrayArrayArray4[var1][var8][var7] == -staticInt53) {
						return false;
					}
				}
			}

			var8 = (var2 << 7) + 1;
			var7 = (var4 << 7) + 2;
			int var10 = anIntArrayArrayArray3[var1][var2][var4] - var6;
			if (!method137(var8, var10, var7)) {
				return false;
			} else {
				int var11 = (var3 << 7) - 1;
				if (!method137(var11, var10, var7)) {
					return false;
				} else {
					int var9 = (var5 << 7) - 1;
					if (!method137(var8, var10, var9)) {
						return false;
					} else if (!method137(var11, var10, var9)) {
						return false;
					} else {
						return true;
					}
				}
			}
		}
	}

	public boolean method131(int var1, int var2, int var3, int var4, int var5, int var6, Entity var7, int var8,
			int var9, int var10) {
		if (var7 == null) {
			return true;
		} else {
			int var12 = var2 * 128 + var5 * 64;
			int var11 = var3 * 128 + var6 * 64;
			return method141(var1, var2, var3, var5, var6, var12, var11, var4, var7, var8, false, var9, var10);
		}
	}

	public void method132(int var1, int var2, int var3, int var4, Entity var5, Entity var6, int var7, int var8,
			int var9, int var10, int var11, int var12) {
		if (var5 != null) {
			WallObject var14 = new WallObject();
			var14.anInt135 = var11;
			var14.anInt136 = var12;
			var14.anInt132 = var2 * 128 + 64;
			var14.anInt129 = var3 * 128 + 64;
			var14.anInt134 = var4;
			var14.aRenderable8 = var5;
			var14.aRenderable7 = var6;
			var14.anInt131 = var7;
			var14.anInt130 = var8;
			var14.anInt137 = var9;
			var14.anInt133 = var10;

			for (int var13 = var1; var13 >= 0; --var13) {
				if (aTileArrayArrayArray1[var13][var2][var3] == null) {
					aTileArrayArrayArray1[var13][var2][var3] = new Tile(var13, var2, var3);
				}
			}

			aTileArrayArrayArray1[var1][var2][var3].aWallObject1 = var14;
		}

	}

	public boolean method133(int var1, int var2, int var3, int var4, int var5, Entity var6, int var7, int var8,
			int var9, int var10, int var11, int var12) {
		return var6 == null ? true
				: method141(var1, var9, var10, var11 - var9 + 1, var12 - var10 + 1, var2, var3, var4, var6, var7, true,
						var8, 0);
	}

	public void method134(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		Tile var7 = aTileArrayArrayArray1[var4][var5][var6];
		if (var7 != null) {
			Class26 var9 = var7.aClass26_1;
			int var12;
			if (var9 != null) {
				int var10 = var9.anInt77;
				if (var10 != 0) {
					for (var12 = 0; var12 < 4; var12++) {
						var1[var2] = var10;
						var1[var2 + 1] = var10;
						var1[var2 + 2] = var10;
						var1[var2 + 3] = var10;
						var2 += var3;
					}
				}
			} else {
				DataClass11 var18 = var7.aClass8_1;
				if (var18 != null) {
					var12 = var18.anInt16;
					int var16 = var18.anInt17;
					int var11 = var18.anInt19;
					int var17 = var18.anInt18;
					int[] var13 = anIntArrayArray4[var12];
					int[] var14 = anIntArrayArray3[var16];
					int var15 = 0;
					int var8;
					if (var11 != 0) {
						for (var8 = 0; var8 < 4; var8++) {
							var1[var2] = var13[var14[var15++]] == 0 ? var11 : var17;
							var1[var2 + 1] = var13[var14[var15++]] == 0 ? var11 : var17;
							var1[var2 + 2] = var13[var14[var15++]] == 0 ? var11 : var17;
							var1[var2 + 3] = var13[var14[var15++]] == 0 ? var11 : var17;
							var2 += var3;
						}
					} else {
						for (var8 = 0; var8 < 4; var8++) {
							if (var13[var14[var15++]] != 0) {
								var1[var2] = var17;
							}

							if (var13[var14[var15++]] != 0) {
								var1[var2 + 1] = var17;
							}

							if (var13[var14[var15++]] != 0) {
								var1[var2 + 2] = var17;
							}

							if (var13[var14[var15++]] != 0) {
								var1[var2 + 3] = var17;
							}

							var2 += var3;
						}
					}
				}
			}
		}

	}

	public void method135(int var1, int var2, int var3, int var4) {
		Tile var5 = aTileArrayArrayArray1[var1][var2][var3];
		if (var5 != null) {
			WallObject var6 = var5.aWallObject1;
			if (var6 != null) {
				var6.anInt137 = var6.anInt137 * var4 / 16;
				var6.anInt133 = var6.anInt133 * var4 / 16;
			}
		}

	}

	void method136(RenderableSub3 var1, int var2, int var3, int var4) {
		Tile var5;
		RenderableSub3 var6;
		if (var3 < anInt70) {
			var5 = aTileArrayArrayArray1[var2][var3 + 1][var4];
			if (var5 != null && var5.aClass33_1 != null && var5.aClass33_1.aRenderable9 instanceof RenderableSub3) {
				var6 = (RenderableSub3) var5.aClass33_1.aRenderable9;
				Static.staticMethod436(var1, var6, 128, 0, 0, true);
			}
		}

		if (var4 < anInt70) {
			var5 = aTileArrayArrayArray1[var2][var3][var4 + 1];
			if (var5 != null && var5.aClass33_1 != null && var5.aClass33_1.aRenderable9 instanceof RenderableSub3) {
				var6 = (RenderableSub3) var5.aClass33_1.aRenderable9;
				Static.staticMethod436(var1, var6, 0, 0, 128, true);
			}
		}

		if (var3 < anInt70 && var4 < anInt68) {
			var5 = aTileArrayArrayArray1[var2][var3 + 1][var4 + 1];
			if (var5 != null && var5.aClass33_1 != null && var5.aClass33_1.aRenderable9 instanceof RenderableSub3) {
				var6 = (RenderableSub3) var5.aClass33_1.aRenderable9;
				Static.staticMethod436(var1, var6, 128, 0, 128, true);
			}
		}

		if (var3 < anInt70 && var4 > 0) {
			var5 = aTileArrayArrayArray1[var2][var3 + 1][var4 - 1];
			if (var5 != null && var5.aClass33_1 != null && var5.aClass33_1.aRenderable9 instanceof RenderableSub3) {
				var6 = (RenderableSub3) var5.aClass33_1.aRenderable9;
				Static.staticMethod436(var1, var6, 128, 0, -128, true);
			}
		}

	}

	boolean method137(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < staticInt59; var4++) {
			DataClass4 var5 = staticClass30Array1[var4];
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.anInt102 == 1) {
				var6 = var5.anInt108 - var1;
				if (var6 > 0) {
					var8 = var5.anInt98 + (var5.anInt105 * var6 >> 8);
					var10 = var5.anInt91 + (var5.anInt106 * var6 >> 8);
					var7 = var5.anInt100 + (var5.anInt107 * var6 >> 8);
					var9 = var5.anInt101 + (var5.anInt99 * var6 >> 8);
					if (var3 >= var8 && var3 <= var10 && var2 >= var7 && var2 <= var9) {
						return true;
					}
				}
			} else if (var5.anInt102 == 2) {
				var6 = var1 - var5.anInt108;
				if (var6 > 0) {
					var8 = var5.anInt98 + (var5.anInt105 * var6 >> 8);
					var10 = var5.anInt91 + (var5.anInt106 * var6 >> 8);
					var7 = var5.anInt100 + (var5.anInt107 * var6 >> 8);
					var9 = var5.anInt101 + (var5.anInt99 * var6 >> 8);
					if (var3 >= var8 && var3 <= var10 && var2 >= var7 && var2 <= var9) {
						return true;
					}
				}
			} else if (var5.anInt102 == 3) {
				var6 = var5.anInt98 - var3;
				if (var6 > 0) {
					var8 = var5.anInt108 + (var5.anInt97 * var6 >> 8);
					var10 = var5.anInt94 + (var5.anInt104 * var6 >> 8);
					var7 = var5.anInt100 + (var5.anInt107 * var6 >> 8);
					var9 = var5.anInt101 + (var5.anInt99 * var6 >> 8);
					if (var1 >= var8 && var1 <= var10 && var2 >= var7 && var2 <= var9) {
						return true;
					}
				}
			} else if (var5.anInt102 == 4) {
				var6 = var3 - var5.anInt98;
				if (var6 > 0) {
					var8 = var5.anInt108 + (var5.anInt97 * var6 >> 8);
					var10 = var5.anInt94 + (var5.anInt104 * var6 >> 8);
					var7 = var5.anInt100 + (var5.anInt107 * var6 >> 8);
					var9 = var5.anInt101 + (var5.anInt99 * var6 >> 8);
					if (var1 >= var8 && var1 <= var10 && var2 >= var7 && var2 <= var9) {
						return true;
					}
				}
			} else if (var5.anInt102 == 5) {
				var6 = var2 - var5.anInt100;
				if (var6 > 0) {
					var8 = var5.anInt108 + (var5.anInt97 * var6 >> 8);
					var10 = var5.anInt94 + (var5.anInt104 * var6 >> 8);
					var7 = var5.anInt98 + (var5.anInt105 * var6 >> 8);
					var9 = var5.anInt91 + (var5.anInt106 * var6 >> 8);
					if (var1 >= var8 && var1 <= var10 && var3 >= var7 && var3 <= var9) {
						return true;
					}
				}
			}
		}

		return false;
	}

	public void method138() {
		int var1;
		int var2;
		for (var1 = 0; var1 < anInt71; var1++) {
			for (var2 = 0; var2 < anInt70; var2++) {
				for (int var3 = 0; var3 < anInt68; var3++) {
					aTileArrayArrayArray1[var1][var2][var3] = null;
				}
			}
		}

		for (var1 = 0; var1 < staticInt41; var1++) {
			for (var2 = 0; var2 < staticIntArray40[var1]; var2++) {
				staticClass30ArrayArray1[var1][var2] = null;
			}

			staticIntArray40[var1] = 0;
		}

		for (var1 = 0; var1 < anInt72; var1++) {
			aClass32Array1[var1] = null;
		}

		anInt72 = 0;

		for (var1 = 0; var1 < staticClass32Array1.length; var1++) {
			staticClass32Array1[var1] = null;
		}

	}

	public void method139(int var1) {
		anInt69 = var1;

		for (int var2 = 0; var2 < anInt70; var2++) {
			for (int var3 = 0; var3 < anInt68; var3++) {
				if (aTileArrayArrayArray1[var1][var2][var3] == null) {
					aTileArrayArrayArray1[var1][var2][var3] = new Tile(var1, var2, var3);
				}
			}
		}

	}

	public void method140(int var1, int var2, int var3, int var4, Entity var5, int var6, int var7) {
		if (var5 != null) {
			DataClass6 var8 = new DataClass6();
			var8.aRenderable9 = var5;
			var8.anInt139 = var2 * 128 + 64;
			var8.anInt138 = var3 * 128 + 64;
			var8.anInt141 = var4;
			var8.anInt140 = var6;
			var8.anInt142 = var7;
			if (aTileArrayArrayArray1[var1][var2][var3] == null) {
				aTileArrayArrayArray1[var1][var2][var3] = new Tile(var1, var2, var3);
			}

			aTileArrayArrayArray1[var1][var2][var3].aClass33_1 = var8;
		}

	}

	boolean method141(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Entity var9,
			int var10, boolean var11, int var12, int var13) {
		int var15;
		for (int var20 = var2; var20 < var2 + var4; var20++) {
			for (var15 = var3; var15 < var3 + var5; var15++) {
				if (var20 < 0 || var15 < 0 || var20 >= anInt70 || var15 >= anInt68) {
					return false;
				}

				Tile var21 = aTileArrayArrayArray1[var1][var20][var15];
				if (var21 != null && var21.anInt254 >= 5) {
					return false;
				}
			}
		}

		DataClass7 var19 = new DataClass7();
		var19.anInt127 = var12;
		var19.anInt117 = var13;
		var19.anInt121 = var1;
		var19.anInt118 = var6;
		var19.anInt119 = var7;
		var19.anInt122 = var8;
		var19.aRenderable6 = var9;
		var19.anInt116 = var10;
		var19.anInt120 = var2;
		var19.anInt123 = var3;
		var19.anInt128 = var2 + var4 - 1;
		var19.anInt124 = var3 + var5 - 1;

		for (var15 = var2; var15 < var2 + var4; var15++) {
			for (int var201 = var3; var201 < var3 + var5; var201++) {
				int var18 = 0;
				if (var15 > var2) {
					++var18;
				}

				if (var15 < var2 + var4 - 1) {
					var18 += 4;
				}

				if (var201 > var3) {
					var18 += 8;
				}

				if (var201 < var3 + var5 - 1) {
					var18 += 2;
				}

				for (int var22 = var1; var22 >= 0; --var22) {
					if (aTileArrayArrayArray1[var22][var15][var201] == null) {
						aTileArrayArrayArray1[var22][var15][var201] = new Tile(var22, var15, var201);
					}
				}

				Tile var211 = aTileArrayArrayArray1[var1][var15][var201];
				var211.aClass32Array2[var211.anInt254] = var19;
				var211.anIntArray66[var211.anInt254] = var18;
				var211.anInt255 |= var18;
				++var211.anInt254;
			}
		}

		if (var11) {
			aClass32Array1[anInt72++] = var19;
		}

		return true;
	}

	public int method142(int var1, int var2, int var3) {
		Tile var4 = aTileArrayArrayArray1[var1][var2][var3];
		return var4 != null && var4.aClass31_1 != null ? var4.aClass31_1.anInt114 : 0;
	}

	public int method143(int var1, int var2, int var3) {
		Tile var4 = aTileArrayArrayArray1[var1][var2][var3];
		return var4 != null && var4.aWallObject1 != null ? var4.aWallObject1.anInt135 : 0;
	}

}
