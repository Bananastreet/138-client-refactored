public class NodeSub5 extends Node {

	static Residue[] staticClass22Array1;
	static byte[] staticByteArray5;
	static int staticInt156;
	static int[] staticIntArray78;
	static int staticInt157;
	static int staticInt158;
	static Class13[] staticClass13Array1;
	static boolean[] staticBoolArray4;
	static int staticInt159;
	static float[] staticFloatArray3;
	static float[] staticFloatArray4;
	static float[] staticFloatArray5;
	static float[] staticFloatArray6;
	static float[] staticFloatArray7;
	static float[] staticFloatArray8;
	static int[] staticIntArray79;
	static int[] staticIntArray80;
	static Class21[] staticClass21Array1;
	static Class12[] staticClass12Array1;
	static boolean staticBool19 = false;
	float[] aFloatArray1;
	static float[] staticFloatArray2;
	int anInt239;
	int anInt237;
	boolean aBool23;
	int anInt232;
	int anInt233;
	int anInt234;
	int anInt235;
	boolean aBool22;
	byte[][] aByteArrayArray2;
	byte[] aByteArray15;
	int anInt236;
	int anInt238;

	float[] method296(int var1) {
		Static.staticMethod293(aByteArrayArray2[var1], 0);
		Static.staticMethod287();
		int var6 = Static.staticMethod288(Static.staticMethod96(staticIntArray78.length - 1));
		boolean var7 = staticBoolArray4[var6];
		int var15 = var7 ? staticInt158 : staticInt157;
		boolean var10 = false;
		boolean var11 = false;
		if (var7) {
			var10 = Static.staticMethod287() != 0;
			var11 = Static.staticMethod287() != 0;
		}

		int var16 = var15 >> 1;
		int var21;
		int var22;
		int var23;
		if (var7 && !var10) {
			var23 = (var15 >> 2) - (staticInt157 >> 2);
			var21 = (var15 >> 2) + (staticInt157 >> 2);
			var22 = staticInt157 >> 1;
		} else {
			var23 = 0;
			var21 = var16;
			var22 = var15 >> 1;
		}

		int var27;
		int var28;
		int var33;
		if (var7 && !var11) {
			var33 = var15 - (var15 >> 2) - (staticInt157 >> 2);
			var27 = var15 - (var15 >> 2) + (staticInt157 >> 2);
			var28 = staticInt157 >> 1;
		} else {
			var33 = var16;
			var27 = var15;
			var28 = var15 >> 1;
		}

		Class21 var19 = staticClass21Array1[staticIntArray78[var6]];
		int var31 = var19.anInt58;
		int var20 = var19.anIntArray28[var31];
		boolean var32 = !staticClass13Array1[var20].method43();
		boolean var54 = var32;

		for (var20 = 0; var20 < var19.anInt59; var20++) {
			Residue var44 = staticClass22Array1[var19.anIntArray29[var20]];
			float[] var53 = staticFloatArray2;
			var44.method83(var53, var15 >> 1, var54);
		}

		int var481;
		if (!var32) {
			var20 = var19.anInt58;
			var481 = var19.anIntArray28[var20];
			staticClass13Array1[var481].method44(staticFloatArray2, var15 >> 1);
		}

		float[] var49;
		int var45;
		int var491;
		if (var32) {
			for (var20 = var15 >> 1; var20 < var15; var20++) {
				staticFloatArray2[var20] = 0.0F;
			}
		} else {
			var20 = var15 >> 1;
			var481 = var15 >> 2;
			var491 = var15 >> 3;
			var49 = staticFloatArray2;

			for (var45 = 0; var45 < var20; var45++) {
				var49[var45] *= 0.5F;
			}

			for (var45 = var20; var45 < var15; var45++) {
				var49[var45] = -var49[var15 - var45 - 1];
			}

			float[] var47 = var7 ? staticFloatArray6 : staticFloatArray3;
			float[] var35 = var7 ? staticFloatArray7 : staticFloatArray4;
			float[] var36 = var7 ? staticFloatArray8 : staticFloatArray5;
			int[] var37 = var7 ? staticIntArray80 : staticIntArray79;

			int var12;
			float var14;
			float var18;
			float var24;
			float var25;
			for (var12 = 0; var12 < var481; var12++) {
				var14 = var49[var12 * 4] - var49[var15 - var12 * 4 - 1];
				var25 = var49[var12 * 4 + 2] - var49[var15 - var12 * 4 - 3];
				var18 = var47[var12 * 2];
				var24 = var47[var12 * 2 + 1];
				var49[var15 - var12 * 4 - 1] = var14 * var18 - var25 * var24;
				var49[var15 - var12 * 4 - 3] = var14 * var24 + var25 * var18;
			}

			float var3;
			float var8;
			for (var12 = 0; var12 < var491; var12++) {
				var14 = var49[var20 + 3 + var12 * 4];
				var25 = var49[var20 + 1 + var12 * 4];
				var18 = var49[var12 * 4 + 3];
				var24 = var49[var12 * 4 + 1];
				var49[var20 + 3 + var12 * 4] = var14 + var18;
				var49[var20 + 1 + var12 * 4] = var25 + var24;
				var3 = var47[var20 - 4 - var12 * 4];
				var8 = var47[var20 - 3 - var12 * 4];
				var49[var12 * 4 + 3] = (var14 - var18) * var3 - (var25 - var24) * var8;
				var49[var12 * 4 + 1] = (var25 - var24) * var3 + (var14 - var18) * var8;
			}

			var12 = Static.staticMethod96(var15 - 1);

			int var46;
			int var48;
			int var50;
			int var51;
			for (var46 = 0; var46 < var12 - 3; var46++) {
				var51 = var15 >> var46 + 2;
				var48 = 8 << var46;

				for (var50 = 0; var50 < 2 << var46; var50++) {
					int var52 = var15 - var51 * 2 * var50;
					int var42 = var15 - var51 * (var50 * 2 + 1);

					for (int var26 = 0; var26 < var15 >> var46 + 4; var26++) {
						int var4 = var26 * 4;
						float var5 = var49[var52 - 1 - var4];
						float var29 = var49[var52 - 3 - var4];
						float var38 = var49[var42 - 1 - var4];
						float var9 = var49[var42 - 3 - var4];
						var49[var52 - 1 - var4] = var5 + var38;
						var49[var52 - 3 - var4] = var29 + var9;
						float var34 = var47[var26 * var48];
						float var39 = var47[var26 * var48 + 1];
						var49[var42 - 1 - var4] = (var5 - var38) * var34 - (var29 - var9) * var39;
						var49[var42 - 3 - var4] = (var29 - var9) * var34 + (var5 - var38) * var39;
					}
				}
			}

			for (var46 = 1; var46 < var491 - 1; var46++) {
				var51 = var37[var46];
				if (var46 < var51) {
					var48 = var46 * 8;
					var50 = var51 * 8;
					var3 = var49[var48 + 1];
					var49[var48 + 1] = var49[var50 + 1];
					var49[var50 + 1] = var3;
					var3 = var49[var48 + 3];
					var49[var48 + 3] = var49[var50 + 3];
					var49[var50 + 3] = var3;
					var3 = var49[var48 + 5];
					var49[var48 + 5] = var49[var50 + 5];
					var49[var50 + 5] = var3;
					var3 = var49[var48 + 7];
					var49[var48 + 7] = var49[var50 + 7];
					var49[var50 + 7] = var3;
				}
			}

			for (var46 = 0; var46 < var20; var46++) {
				var49[var46] = var49[var46 * 2 + 1];
			}

			for (var46 = 0; var46 < var491; var46++) {
				var49[var15 - 1 - var46 * 2] = var49[var46 * 4];
				var49[var15 - 2 - var46 * 2] = var49[var46 * 4 + 1];
				var49[var15 - var481 - 1 - var46 * 2] = var49[var46 * 4 + 2];
				var49[var15 - var481 - 2 - var46 * 2] = var49[var46 * 4 + 3];
			}

			for (var46 = 0; var46 < var491; var46++) {
				var25 = var36[var46 * 2];
				var18 = var36[var46 * 2 + 1];
				var24 = var49[var20 + var46 * 2];
				var3 = var49[var20 + var46 * 2 + 1];
				var8 = var49[var15 - 2 - var46 * 2];
				float var511 = var49[var15 - 1 - var46 * 2];
				float var521 = var18 * (var24 - var8) + var25 * (var3 + var511);
				var49[var20 + var46 * 2] = (var24 + var8 + var521) * 0.5F;
				var49[var15 - 2 - var46 * 2] = (var24 + var8 - var521) * 0.5F;
				var521 = var18 * (var3 + var511) - var25 * (var24 - var8);
				var49[var20 + var46 * 2 + 1] = (var3 - var511 + var521) * 0.5F;
				var49[var15 - 1 - var46 * 2] = (-var3 + var511 + var521) * 0.5F;
			}

			for (var46 = 0; var46 < var481; var46++) {
				var49[var46] = var49[var46 * 2 + var20] * var35[var46 * 2]
						+ var49[var46 * 2 + 1 + var20] * var35[var46 * 2 + 1];
				var49[var20 - 1 - var46] = var49[var46 * 2 + var20] * var35[var46 * 2 + 1]
						- var49[var46 * 2 + 1 + var20] * var35[var46 * 2];
			}

			for (var46 = 0; var46 < var481; var46++) {
				var49[var15 - var481 + var46] = -var49[var46];
			}

			for (var46 = 0; var46 < var481; var46++) {
				var49[var46] = var49[var481 + var46];
			}

			for (var46 = 0; var46 < var481; var46++) {
				var49[var481 + var46] = -var49[var481 - var46 - 1];
			}

			for (var46 = 0; var46 < var481; var46++) {
				var49[var20 + var46] = var49[var15 - var46 - 1];
			}

			for (var46 = var23; var46 < var21; var46++) {
				var25 = (float) Math.sin((var46 - var23 + 0.5D) / var22 * 0.5D * 3.141592653589793D);
				staticFloatArray2[var46] *= (float) Math.sin(1.5707963267948966D * var25 * var25);
			}

			for (var46 = var33; var46 < var27; var46++) {
				var25 = (float) Math
						.sin((var46 - var33 + 0.5D) / var28 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				staticFloatArray2[var46] *= (float) Math.sin(1.5707963267948966D * var25 * var25);
			}
		}

		var49 = null;
		if (anInt239 > 0) {
			var481 = anInt239 + var15 >> 2;
			var49 = new float[var481];
			if (!aBool23) {
				for (var491 = 0; var491 < anInt237; var491++) {
					var45 = (anInt239 >> 1) + var491;
					var49[var491] += aFloatArray1[var45];
				}
			}

			if (!var32) {
				for (var491 = var23; var491 < var15 >> 1; var491++) {
					var45 = var49.length - (var15 >> 1) + var491;
					var49[var45] += staticFloatArray2[var491];
				}
			}
		}

		float[] var501 = aFloatArray1;
		aFloatArray1 = staticFloatArray2;
		staticFloatArray2 = var501;
		anInt239 = var15;
		anInt237 = var27 - (var15 >> 1);
		aBool23 = var32;
		return var49;
	}

	NodeSub5(byte[] var1) {
		method297(var1);
	}

	void method297(byte[] var1) {
		ByteBuf var2 = new ByteBuf(var1);
		anInt232 = var2.readInt();
		anInt233 = var2.readInt();
		anInt234 = var2.readInt();
		anInt235 = var2.readInt();
		if (anInt235 < 0) {
			anInt235 = ~anInt235;
			aBool22 = true;
		}

		int var4 = var2.readInt();
		aByteArrayArray2 = new byte[var4][];

		for (int var3 = 0; var3 < var4; var3++) {
			int var6 = 0;

			int var5;
			do {
				var5 = var2.readUByte();
				var6 += var5;
			} while (var5 >= 255);

			byte[] var7 = new byte[var6];
			var2.readBytes(var7, 0, var6);
			aByteArrayArray2[var3] = var7;
		}

	}

	NodeSub6Sub1 method298(int[] var1) {
		if (var1 != null && var1[0] <= 0) {
			return null;
		} else {
			if (aByteArray15 == null) {
				anInt239 = 0;
				aFloatArray1 = new float[staticInt158];
				aByteArray15 = new byte[anInt233];
				anInt236 = 0;
				anInt238 = 0;
			}

			for (; anInt238 < aByteArrayArray2.length; anInt238++) {
				if (var1 != null && var1[0] <= 0) {
					return null;
				}

				float[] var7 = method296(anInt238);
				if (var7 != null) {
					int var5 = anInt236;
					int var3 = var7.length;
					if (var3 > anInt233 - var5) {
						var3 = anInt233 - var5;
					}

					for (int var6 = 0; var6 < var3; var6++) {
						int var4 = (int) (128.0F + var7[var6] * 128.0F);
						if ((var4 & 0xffffff00) != 0) {
							var4 = ~var4 >> 31;
						}

						aByteArray15[var5++] = (byte) (var4 - 128);
					}

					if (var1 != null) {
						var1[0] -= var5 - anInt236;
					}

					anInt236 = var5;
				}
			}

			aFloatArray1 = null;
			byte[] var71 = aByteArray15;
			aByteArray15 = null;
			return new NodeSub6Sub1(anInt232, var71, anInt234, anInt235, aBool22);
		}
	}

}
