public final class Class8 {

	static int[] staticIntArray20 = new int[6];
	static int[] staticIntArray21 = new int[6];
	static int[] staticIntArray19 = new int[6];
	static int[] staticIntArray18 = new int[6];
	static int[] staticIntArray17 = new int[6];
	static final int[][] staticIntArrayArray3 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 },
			{ 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 },
			{ 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 },
			{ 1, 3, 5, 7, 13, 14 } };
	static final int[][] staticIntArrayArray2 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 },
			{ 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 },
			{ 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 },
			{ 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 },
			{ 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 },
			{ 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 },
			{ 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 },
			{ 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };
	boolean aBool4 = true;
	int anInt16;
	int anInt17;
	int anInt19;
	int anInt18;
	int[] anIntArray4;
	int[] anIntArray2;
	int[] anIntArray10;
	int[] anIntArray6;
	int[] anIntArray9;
	int[] anIntArray7;
	int[] anIntArray3;
	int[] anIntArray11;
	int[] anIntArray5;
	int[] anIntArray8;

	Class8(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10,
			int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19) {
		if (var6 != var7 || var6 != var8 || var6 != var9) {
			aBool4 = false;
		}

		anInt16 = var1;
		anInt17 = var2;
		anInt19 = var18;
		anInt18 = var19;
		short var22 = 128;
		int var23 = var22 / 2;
		int var27 = var22 / 4;
		int var35 = var22 * 3 / 4;
		int[] var28 = staticIntArrayArray3[var1];
		int var29 = var28.length;
		anIntArray4 = new int[var29];
		anIntArray2 = new int[var29];
		anIntArray10 = new int[var29];
		int[] var33 = new int[var29];
		int[] var34 = new int[var29];
		int var24 = var4 * var22;
		int var31 = var5 * var22;

		int var20;
		int var21;
		int var25;
		int var26;
		int var30;
		int var32;
		for (int var38 = 0; var38 < var29; var38++) {
			var32 = var28[var38];
			if ((var32 & 0x1) == 0 && var32 <= 8) {
				var32 = (var32 - var2 - var2 - 1 & 0x7) + 1;
			}

			if (var32 > 8 && var32 <= 12) {
				var32 = (var32 - 9 - var2 & 0x3) + 9;
			}

			if (var32 > 12 && var32 <= 16) {
				var32 = (var32 - 13 - var2 & 0x3) + 13;
			}

			if (var32 == 1) {
				var25 = var24;
				var21 = var31;
				var20 = var6;
				var30 = var10;
				var26 = var14;
			} else if (var32 == 2) {
				var25 = var24 + var23;
				var21 = var31;
				var20 = var6 + var7 >> 1;
				var30 = var10 + var11 >> 1;
				var26 = var14 + var15 >> 1;
			} else if (var32 == 3) {
				var25 = var24 + var22;
				var21 = var31;
				var20 = var7;
				var30 = var11;
				var26 = var15;
			} else if (var32 == 4) {
				var25 = var24 + var22;
				var21 = var31 + var23;
				var20 = var7 + var8 >> 1;
				var30 = var11 + var12 >> 1;
				var26 = var15 + var16 >> 1;
			} else if (var32 == 5) {
				var25 = var24 + var22;
				var21 = var31 + var22;
				var20 = var8;
				var30 = var12;
				var26 = var16;
			} else if (var32 == 6) {
				var25 = var24 + var23;
				var21 = var31 + var22;
				var20 = var8 + var9 >> 1;
				var30 = var12 + var13 >> 1;
				var26 = var16 + var17 >> 1;
			} else if (var32 == 7) {
				var25 = var24;
				var21 = var31 + var22;
				var20 = var9;
				var30 = var13;
				var26 = var17;
			} else if (var32 == 8) {
				var25 = var24;
				var21 = var31 + var23;
				var20 = var9 + var6 >> 1;
				var30 = var13 + var10 >> 1;
				var26 = var17 + var14 >> 1;
			} else if (var32 == 9) {
				var25 = var24 + var23;
				var21 = var31 + var27;
				var20 = var6 + var7 >> 1;
				var30 = var10 + var11 >> 1;
				var26 = var14 + var15 >> 1;
			} else if (var32 == 10) {
				var25 = var24 + var35;
				var21 = var31 + var23;
				var20 = var7 + var8 >> 1;
				var30 = var11 + var12 >> 1;
				var26 = var15 + var16 >> 1;
			} else if (var32 == 11) {
				var25 = var24 + var23;
				var21 = var31 + var35;
				var20 = var8 + var9 >> 1;
				var30 = var12 + var13 >> 1;
				var26 = var16 + var17 >> 1;
			} else if (var32 == 12) {
				var25 = var24 + var27;
				var21 = var31 + var23;
				var20 = var9 + var6 >> 1;
				var30 = var13 + var10 >> 1;
				var26 = var17 + var14 >> 1;
			} else if (var32 == 13) {
				var25 = var24 + var27;
				var21 = var31 + var27;
				var20 = var6;
				var30 = var10;
				var26 = var14;
			} else if (var32 == 14) {
				var25 = var24 + var35;
				var21 = var31 + var27;
				var20 = var7;
				var30 = var11;
				var26 = var15;
			} else if (var32 == 15) {
				var25 = var24 + var35;
				var21 = var31 + var35;
				var20 = var8;
				var30 = var12;
				var26 = var16;
			} else {
				var25 = var24 + var27;
				var21 = var31 + var35;
				var20 = var9;
				var30 = var13;
				var26 = var17;
			}

			anIntArray4[var38] = var25;
			anIntArray2[var38] = var20;
			anIntArray10[var38] = var21;
			var33[var38] = var30;
			var34[var38] = var26;
		}

		int[] var381 = staticIntArrayArray2[var1];
		var32 = var381.length / 4;
		anIntArray6 = new int[var32];
		anIntArray9 = new int[var32];
		anIntArray7 = new int[var32];
		anIntArray3 = new int[var32];
		anIntArray11 = new int[var32];
		anIntArray5 = new int[var32];
		if (var3 != -1) {
			anIntArray8 = new int[var32];
		}

		var25 = 0;

		for (var21 = 0; var21 < var32; var21++) {
			var20 = var381[var25];
			var30 = var381[var25 + 1];
			var26 = var381[var25 + 2];
			int var37 = var381[var25 + 3];
			var25 += 4;
			if (var30 < 4) {
				var30 = var30 - var2 & 0x3;
			}

			if (var26 < 4) {
				var26 = var26 - var2 & 0x3;
			}

			if (var37 < 4) {
				var37 = var37 - var2 & 0x3;
			}

			anIntArray6[var21] = var30;
			anIntArray9[var21] = var26;
			anIntArray7[var21] = var37;
			if (var20 == 0) {
				anIntArray3[var21] = var33[var30];
				anIntArray11[var21] = var33[var26];
				anIntArray5[var21] = var33[var37];
				if (anIntArray8 != null) {
					anIntArray8[var21] = -1;
				}
			} else {
				anIntArray3[var21] = var34[var30];
				anIntArray11[var21] = var34[var26];
				anIntArray5[var21] = var34[var37];
				if (anIntArray8 != null) {
					anIntArray8[var21] = var3;
				}
			}
		}

		var21 = var6;
		var20 = var7;
		if (var7 < var6) {
			var21 = var7;
		}

		if (var7 > var7) {
			var20 = var7;
		}

		if (var8 < var21) {
			var21 = var8;
		}

		if (var8 > var20) {
			var20 = var8;
		}

		if (var9 < var21) {
			var21 = var9;
		}

		if (var9 > var20) {
			var20 = var9;
		}

		var21 /= 14;
		var20 /= 14;
	}

}
