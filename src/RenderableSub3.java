public class RenderableSub3 extends Renderable {

	static int[] staticIntArray132 = new int[10000];
	static int[] staticIntArray133 = new int[10000];
	static int staticInt333 = 0;
	static int[] staticIntArray131;
	static int[] staticIntArray134;
	DataClass2[] aClass27Array2;
	DataClass2[] aClass27Array1;
	DataClass3[] aClass29Array1;
	boolean aBool79 = false;
	byte[] aByteArray30;
	int anInt651 = 0;
	int anInt653 = 0;
	int anInt652;
	int[] anIntArray133;
	int[] anIntArray129;
	int[] anIntArray136;
	int[] anIntArray135;
	int[] anIntArray131;
	int[] anIntArray132;
	int[] anIntArray130;
	byte[] aByteArray26;
	byte aByte6 = 0;
	byte[] aByteArray27;
	byte[] aByteArray25;
	int[] anIntArray134;
	short[] aShortArray24;
	short[] aShortArray22;
	byte[] aByteArray28;
	short[] aShortArray25;
	short[] aShortArray31;
	short[] aShortArray23;
	short[] aShortArray26;
	short[] aShortArray27;
	short[] aShortArray28;
	short[] aShortArray32;
	byte[] aByteArray29;
	short[] aShortArray29;
	short[] aShortArray30;
	int[][] anIntArrayArray14;
	int[][] anIntArrayArray13;
	public short aShort2;
	public short aShort3;
	int anInt655;
	int anInt656;
	int anInt654;
	int anInt657;
	int anInt658;

	static {
		staticIntArray131 = Rasterizer2DSub1.staticIntArray154;
		staticIntArray134 = Rasterizer2DSub1.staticIntArray159;
	}

	void method569() {
		aClass27Array2 = null;
		aClass27Array1 = null;
		aClass29Array1 = null;
		aBool79 = false;
	}

	void method570(byte[] var1) {
		ByteBuf var2 = new ByteBuf(var1);
		ByteBuf var11 = new ByteBuf(var1);
		ByteBuf var6 = new ByteBuf(var1);
		ByteBuf var7 = new ByteBuf(var1);
		ByteBuf var8 = new ByteBuf(var1);
		ByteBuf var9 = new ByteBuf(var1);
		ByteBuf var55 = new ByteBuf(var1);
		var2.position = var1.length - 23;
		int var33 = var2.readUShort();
		int var13 = var2.readUShort();
		int var14 = var2.readUByte();
		int var12 = var2.readUByte();
		int var49 = var2.readUByte();
		int var17 = var2.readUByte();
		int var51 = var2.readUByte();
		int var15 = var2.readUByte();
		int var18 = var2.readUByte();
		int var19 = var2.readUShort();
		int var20 = var2.readUShort();
		int var21 = var2.readUShort();
		int var23 = var2.readUShort();
		int var38 = var2.readUShort();
		int var24 = 0;
		int var25 = 0;
		int var26 = 0;
		int var27;
		if (var14 > 0) {
			aByteArray30 = new byte[var14];
			var2.position = 0;

			for (var27 = 0; var27 < var14; var27++) {
				byte var32 = aByteArray30[var27] = var2.readByte();
				if (var32 == 0) {
					++var24;
				}

				if (var32 >= 1 && var32 <= 3) {
					++var25;
				}

				if (var32 == 2) {
					++var26;
				}
			}
		}

		var27 = var14 + var33;
		int var561 = var27;
		if (var12 == 1) {
			var27 += var13;
		}

		int var34 = var27;
		var27 += var13;
		int var44 = var27;
		if (var49 == 255) {
			var27 += var13;
		}

		int var36 = var27;
		if (var51 == 1) {
			var27 += var13;
		}

		int var53 = var27;
		if (var18 == 1) {
			var27 += var33;
		}

		int var57 = var27;
		if (var17 == 1) {
			var27 += var13;
		}

		int var31 = var27;
		var27 += var23;
		int var39 = var27;
		if (var15 == 1) {
			var27 += var13 * 2;
		}

		int var52 = var27;
		var27 += var38;
		int var41 = var27;
		var27 += var13 * 2;
		int var35 = var27;
		var27 += var19;
		int var43 = var27;
		var27 += var20;
		int var30 = var27;
		var27 += var21;
		int var50 = var27;
		var27 += var24 * 6;
		int var45 = var27;
		var27 += var25 * 6;
		int var46 = var27;
		var27 += var25 * 6;
		int var47 = var27;
		var27 += var25 * 2;
		int var42 = var27;
		var27 += var25;
		int var48 = var27;
		var27 += var25 * 2 + var26 * 2;
		anInt651 = var33;
		anInt653 = var13;
		anInt652 = var14;
		anIntArray133 = new int[var33];
		anIntArray129 = new int[var33];
		anIntArray136 = new int[var33];
		anIntArray135 = new int[var13];
		anIntArray131 = new int[var13];
		anIntArray132 = new int[var13];
		if (var18 == 1) {
			anIntArray130 = new int[var33];
		}

		if (var12 == 1) {
			aByteArray26 = new byte[var13];
		}

		if (var49 == 255) {
			aByteArray27 = new byte[var13];
		} else {
			aByte6 = (byte) var49;
		}

		if (var17 == 1) {
			aByteArray25 = new byte[var13];
		}

		if (var51 == 1) {
			anIntArray134 = new int[var13];
		}

		if (var15 == 1) {
			aShortArray24 = new short[var13];
		}

		if (var15 == 1 && var14 > 0) {
			aByteArray28 = new byte[var13];
		}

		aShortArray22 = new short[var13];
		if (var14 > 0) {
			aShortArray25 = new short[var14];
			aShortArray31 = new short[var14];
			aShortArray23 = new short[var14];
			if (var25 > 0) {
				aShortArray26 = new short[var25];
				aShortArray27 = new short[var25];
				aShortArray28 = new short[var25];
				aShortArray32 = new short[var25];
				aByteArray29 = new byte[var25];
				aShortArray29 = new short[var25];
			}

			if (var26 > 0) {
				aShortArray30 = new short[var26];
			}
		}

		var2.position = var14;
		var11.position = var35;
		var6.position = var43;
		var7.position = var30;
		var8.position = var53;
		int var4 = 0;
		int var54 = 0;
		int var56 = 0;

		int var3;
		int var5;
		int var10;
		int var22;
		int var40;
		for (var3 = 0; var3 < var33; var3++) {
			var22 = var2.readUByte();
			var5 = 0;
			if ((var22 & 0x1) != 0) {
				var5 = var11.method366();
			}

			var40 = 0;
			if ((var22 & 0x2) != 0) {
				var40 = var6.method366();
			}

			var10 = 0;
			if ((var22 & 0x4) != 0) {
				var10 = var7.method366();
			}

			anIntArray133[var3] = var4 + var5;
			anIntArray129[var3] = var54 + var40;
			anIntArray136[var3] = var56 + var10;
			var4 = anIntArray133[var3];
			var54 = anIntArray129[var3];
			var56 = anIntArray136[var3];
			if (var18 == 1) {
				anIntArray130[var3] = var8.readUByte();
			}
		}

		var2.position = var41;
		var11.position = var561;
		var6.position = var44;
		var7.position = var57;
		var8.position = var36;
		var9.position = var39;
		var55.position = var52;

		for (var3 = 0; var3 < var13; var3++) {
			aShortArray22[var3] = (short) var2.readUShort();
			if (var12 == 1) {
				aByteArray26[var3] = var11.readByte();
			}

			if (var49 == 255) {
				aByteArray27[var3] = var6.readByte();
			}

			if (var17 == 1) {
				aByteArray25[var3] = var7.readByte();
			}

			if (var51 == 1) {
				anIntArray134[var3] = var8.readUByte();
			}

			if (var15 == 1) {
				aShortArray24[var3] = (short) (var9.readUShort() - 1);
			}

			if (aByteArray28 != null && aShortArray24[var3] != -1) {
				aByteArray28[var3] = (byte) (var55.readUByte() - 1);
			}
		}

		var2.position = var31;
		var11.position = var34;
		var3 = 0;
		var22 = 0;
		var5 = 0;
		var40 = 0;

		int var29;
		for (var10 = 0; var10 < var13; var10++) {
			var29 = var11.readUByte();
			if (var29 == 1) {
				var3 = var2.method366() + var40;
				var22 = var2.method366() + var3;
				var5 = var2.method366() + var22;
				var40 = var5;
				anIntArray135[var10] = var3;
				anIntArray131[var10] = var22;
				anIntArray132[var10] = var5;
			}

			if (var29 == 2) {
				var22 = var5;
				var5 = var2.method366() + var40;
				var40 = var5;
				anIntArray135[var10] = var3;
				anIntArray131[var10] = var22;
				anIntArray132[var10] = var5;
			}

			if (var29 == 3) {
				var3 = var5;
				var5 = var2.method366() + var40;
				var40 = var5;
				anIntArray135[var10] = var3;
				anIntArray131[var10] = var22;
				anIntArray132[var10] = var5;
			}

			if (var29 == 4) {
				int var16 = var3;
				var3 = var22;
				var22 = var16;
				var5 = var2.method366() + var40;
				var40 = var5;
				anIntArray135[var10] = var3;
				anIntArray131[var10] = var16;
				anIntArray132[var10] = var5;
			}
		}

		var2.position = var50;
		var11.position = var45;
		var6.position = var46;
		var7.position = var47;
		var8.position = var42;
		var9.position = var48;

		for (var10 = 0; var10 < var14; var10++) {
			var29 = aByteArray30[var10] & 0xff;
			if (var29 == 0) {
				aShortArray25[var10] = (short) var2.readUShort();
				aShortArray31[var10] = (short) var2.readUShort();
				aShortArray23[var10] = (short) var2.readUShort();
			}

			if (var29 == 1) {
				aShortArray25[var10] = (short) var11.readUShort();
				aShortArray31[var10] = (short) var11.readUShort();
				aShortArray23[var10] = (short) var11.readUShort();
				aShortArray26[var10] = (short) var6.readUShort();
				aShortArray27[var10] = (short) var6.readUShort();
				aShortArray28[var10] = (short) var6.readUShort();
				aShortArray32[var10] = (short) var7.readUShort();
				aByteArray29[var10] = var8.readByte();
				aShortArray29[var10] = (short) var9.readUShort();
			}

			if (var29 == 2) {
				aShortArray25[var10] = (short) var11.readUShort();
				aShortArray31[var10] = (short) var11.readUShort();
				aShortArray23[var10] = (short) var11.readUShort();
				aShortArray26[var10] = (short) var6.readUShort();
				aShortArray27[var10] = (short) var6.readUShort();
				aShortArray28[var10] = (short) var6.readUShort();
				aShortArray32[var10] = (short) var7.readUShort();
				aByteArray29[var10] = var8.readByte();
				aShortArray29[var10] = (short) var9.readUShort();
				aShortArray30[var10] = (short) var9.readUShort();
			}

			if (var29 == 3) {
				aShortArray25[var10] = (short) var11.readUShort();
				aShortArray31[var10] = (short) var11.readUShort();
				aShortArray23[var10] = (short) var11.readUShort();
				aShortArray26[var10] = (short) var6.readUShort();
				aShortArray27[var10] = (short) var6.readUShort();
				aShortArray28[var10] = (short) var6.readUShort();
				aShortArray32[var10] = (short) var7.readUShort();
				aByteArray29[var10] = var8.readByte();
				aShortArray29[var10] = (short) var9.readUShort();
			}
		}

		var2.position = var27;
		var10 = var2.readUByte();
		if (var10 != 0) {
			new Class25();
			var2.readUShort();
			var2.readUShort();
			var2.readUShort();
			var2.readInt();
		}

	}

	void method571(byte[] var1) {
		boolean var2 = false;
		boolean var27 = false;
		ByteBuf var5 = new ByteBuf(var1);
		ByteBuf var6 = new ByteBuf(var1);
		ByteBuf var7 = new ByteBuf(var1);
		ByteBuf var11 = new ByteBuf(var1);
		ByteBuf var9 = new ByteBuf(var1);
		var5.position = var1.length - 18;
		int var16 = var5.readUShort();
		int var12 = var5.readUShort();
		int var29 = var5.readUByte();
		int var23 = var5.readUByte();
		int var14 = var5.readUByte();
		int var10 = var5.readUByte();
		int var15 = var5.readUByte();
		int var36 = var5.readUByte();
		int var8 = var5.readUShort();
		int var31 = var5.readUShort();
		int var33 = var5.readUShort();
		int var13 = var5.readUShort();
		byte var3 = 0;
		int var45 = var3 + var16;
		int var20 = var45;
		var45 += var12;
		int var4 = var45;
		if (var14 == 255) {
			var45 += var12;
		}

		int var22 = var45;
		if (var15 == 1) {
			var45 += var12;
		}

		int var38 = var45;
		if (var23 == 1) {
			var45 += var12;
		}

		int var24 = var45;
		if (var36 == 1) {
			var45 += var16;
		}

		int var25 = var45;
		if (var10 == 1) {
			var45 += var12;
		}

		int var44 = var45;
		var45 += var13;
		int var26 = var45;
		var45 += var12 * 2;
		int var28 = var45;
		var45 += var29 * 6;
		int var30 = var45;
		var45 += var8;
		int var41 = var45;
		var45 += var31;
		anInt651 = var16;
		anInt653 = var12;
		anInt652 = var29;
		anIntArray133 = new int[var16];
		anIntArray129 = new int[var16];
		anIntArray136 = new int[var16];
		anIntArray135 = new int[var12];
		anIntArray131 = new int[var12];
		anIntArray132 = new int[var12];
		if (var29 > 0) {
			aByteArray30 = new byte[var29];
			aShortArray25 = new short[var29];
			aShortArray31 = new short[var29];
			aShortArray23 = new short[var29];
		}

		if (var36 == 1) {
			anIntArray130 = new int[var16];
		}

		if (var23 == 1) {
			aByteArray26 = new byte[var12];
			aByteArray28 = new byte[var12];
			aShortArray24 = new short[var12];
		}

		if (var14 == 255) {
			aByteArray27 = new byte[var12];
		} else {
			aByte6 = (byte) var14;
		}

		if (var10 == 1) {
			aByteArray25 = new byte[var12];
		}

		if (var15 == 1) {
			anIntArray134 = new int[var12];
		}

		aShortArray22 = new short[var12];
		var5.position = var3;
		var6.position = var30;
		var7.position = var41;
		var11.position = var45;
		var9.position = var24;
		int var39 = 0;
		int var40 = 0;
		int var42 = 0;

		int var17;
		int var21;
		int var34;
		int var35;
		int var37;
		for (var34 = 0; var34 < var16; var34++) {
			var37 = var5.readUByte();
			var17 = 0;
			if ((var37 & 0x1) != 0) {
				var17 = var6.method366();
			}

			var35 = 0;
			if ((var37 & 0x2) != 0) {
				var35 = var7.method366();
			}

			var21 = 0;
			if ((var37 & 0x4) != 0) {
				var21 = var11.method366();
			}

			anIntArray133[var34] = var39 + var17;
			anIntArray129[var34] = var40 + var35;
			anIntArray136[var34] = var42 + var21;
			var39 = anIntArray133[var34];
			var40 = anIntArray129[var34];
			var42 = anIntArray136[var34];
			if (var36 == 1) {
				anIntArray130[var34] = var9.readUByte();
			}
		}

		var5.position = var26;
		var6.position = var38;
		var7.position = var4;
		var11.position = var25;
		var9.position = var22;

		for (var34 = 0; var34 < var12; var34++) {
			aShortArray22[var34] = (short) var5.readUShort();
			if (var23 == 1) {
				var37 = var6.readUByte();
				if ((var37 & 0x1) == 1) {
					aByteArray26[var34] = 1;
					var2 = true;
				} else {
					aByteArray26[var34] = 0;
				}

				if ((var37 & 0x2) == 2) {
					aByteArray28[var34] = (byte) (var37 >> 2);
					aShortArray24[var34] = aShortArray22[var34];
					aShortArray22[var34] = 127;
					if (aShortArray24[var34] != -1) {
						var27 = true;
					}
				} else {
					aByteArray28[var34] = -1;
					aShortArray24[var34] = -1;
				}
			}

			if (var14 == 255) {
				aByteArray27[var34] = var7.readByte();
			}

			if (var10 == 1) {
				aByteArray25[var34] = var11.readByte();
			}

			if (var15 == 1) {
				anIntArray134[var34] = var9.readUByte();
			}
		}

		var5.position = var44;
		var6.position = var20;
		var34 = 0;
		var37 = 0;
		var17 = 0;
		var35 = 0;

		int var18;
		int var43;
		for (var21 = 0; var21 < var12; var21++) {
			var18 = var6.readUByte();
			if (var18 == 1) {
				var34 = var5.method366() + var35;
				var37 = var5.method366() + var34;
				var17 = var5.method366() + var37;
				var35 = var17;
				anIntArray135[var21] = var34;
				anIntArray131[var21] = var37;
				anIntArray132[var21] = var17;
			}

			if (var18 == 2) {
				var37 = var17;
				var17 = var5.method366() + var35;
				var35 = var17;
				anIntArray135[var21] = var34;
				anIntArray131[var21] = var37;
				anIntArray132[var21] = var17;
			}

			if (var18 == 3) {
				var34 = var17;
				var17 = var5.method366() + var35;
				var35 = var17;
				anIntArray135[var21] = var34;
				anIntArray131[var21] = var37;
				anIntArray132[var21] = var17;
			}

			if (var18 == 4) {
				var43 = var34;
				var34 = var37;
				var37 = var43;
				var17 = var5.method366() + var35;
				var35 = var17;
				anIntArray135[var21] = var34;
				anIntArray131[var21] = var43;
				anIntArray132[var21] = var17;
			}
		}

		var5.position = var28;

		for (var21 = 0; var21 < var29; var21++) {
			aByteArray30[var21] = 0;
			aShortArray25[var21] = (short) var5.readUShort();
			aShortArray31[var21] = (short) var5.readUShort();
			aShortArray23[var21] = (short) var5.readUShort();
		}

		if (aByteArray28 != null) {
			boolean var46 = false;

			for (var18 = 0; var18 < var12; var18++) {
				var43 = aByteArray28[var18] & 0xff;
				if (var43 != 255) {
					if ((aShortArray25[var43] & 0xffff) == anIntArray135[var18]
							&& (aShortArray31[var43] & 0xffff) == anIntArray131[var18]
							&& (aShortArray23[var43] & 0xffff) == anIntArray132[var18]) {
						aByteArray28[var18] = -1;
					} else {
						var46 = true;
					}
				}
			}

			if (!var46) {
				aByteArray28 = null;
			}
		}

		if (!var27) {
			aShortArray24 = null;
		}

		if (!var2) {
			aByteArray26 = null;
		}

	}

	public RenderableSub3(RenderableSub3[] var1, int var2) {
		boolean var5 = false;
		boolean var10 = false;
		boolean var4 = false;
		boolean var6 = false;
		boolean var3 = false;
		boolean var11 = false;
		anInt651 = 0;
		anInt653 = 0;
		anInt652 = 0;
		aByte6 = -1;

		RenderableSub3 var7;
		int var9;
		for (var9 = 0; var9 < var2; var9++) {
			var7 = var1[var9];
			if (var7 != null) {
				anInt651 += var7.anInt651;
				anInt653 += var7.anInt653;
				anInt652 += var7.anInt652;
				if (var7.aByteArray27 != null) {
					var10 = true;
				} else {
					if (aByte6 == -1) {
						aByte6 = var7.aByte6;
					}

					if (aByte6 != var7.aByte6) {
						var10 = true;
					}
				}

				var5 |= var7.aByteArray26 != null;
				var4 |= var7.aByteArray25 != null;
				var6 |= var7.anIntArray134 != null;
				var3 |= var7.aShortArray24 != null;
				var11 |= var7.aByteArray28 != null;
			}
		}

		anIntArray133 = new int[anInt651];
		anIntArray129 = new int[anInt651];
		anIntArray136 = new int[anInt651];
		anIntArray130 = new int[anInt651];
		anIntArray135 = new int[anInt653];
		anIntArray131 = new int[anInt653];
		anIntArray132 = new int[anInt653];
		if (var5) {
			aByteArray26 = new byte[anInt653];
		}

		if (var10) {
			aByteArray27 = new byte[anInt653];
		}

		if (var4) {
			aByteArray25 = new byte[anInt653];
		}

		if (var6) {
			anIntArray134 = new int[anInt653];
		}

		if (var3) {
			aShortArray24 = new short[anInt653];
		}

		if (var11) {
			aByteArray28 = new byte[anInt653];
		}

		aShortArray22 = new short[anInt653];
		if (anInt652 > 0) {
			aByteArray30 = new byte[anInt652];
			aShortArray25 = new short[anInt652];
			aShortArray31 = new short[anInt652];
			aShortArray23 = new short[anInt652];
			aShortArray26 = new short[anInt652];
			aShortArray27 = new short[anInt652];
			aShortArray28 = new short[anInt652];
			aShortArray32 = new short[anInt652];
			aByteArray29 = new byte[anInt652];
			aShortArray29 = new short[anInt652];
			aShortArray30 = new short[anInt652];
		}

		anInt651 = 0;
		anInt653 = 0;
		anInt652 = 0;

		for (var9 = 0; var9 < var2; var9++) {
			var7 = var1[var9];
			if (var7 != null) {
				int var8;
				for (var8 = 0; var8 < var7.anInt653; var8++) {
					if (var5 && var7.aByteArray26 != null) {
						aByteArray26[anInt653] = var7.aByteArray26[var8];
					}

					if (var10) {
						if (var7.aByteArray27 != null) {
							aByteArray27[anInt653] = var7.aByteArray27[var8];
						} else {
							aByteArray27[anInt653] = var7.aByte6;
						}
					}

					if (var4 && var7.aByteArray25 != null) {
						aByteArray25[anInt653] = var7.aByteArray25[var8];
					}

					if (var6 && var7.anIntArray134 != null) {
						anIntArray134[anInt653] = var7.anIntArray134[var8];
					}

					if (var3) {
						if (var7.aShortArray24 != null) {
							aShortArray24[anInt653] = var7.aShortArray24[var8];
						} else {
							aShortArray24[anInt653] = -1;
						}
					}

					if (var11) {
						if (var7.aByteArray28 != null && var7.aByteArray28[var8] != -1) {
							aByteArray28[anInt653] = (byte) (var7.aByteArray28[var8] + anInt652);
						} else {
							aByteArray28[anInt653] = -1;
						}
					}

					aShortArray22[anInt653] = var7.aShortArray22[var8];
					anIntArray135[anInt653] = method584(var7, var7.anIntArray135[var8]);
					anIntArray131[anInt653] = method584(var7, var7.anIntArray131[var8]);
					anIntArray132[anInt653] = method584(var7, var7.anIntArray132[var8]);
					++anInt653;
				}

				for (var8 = 0; var8 < var7.anInt652; var8++) {
					byte var12 = aByteArray30[anInt652] = var7.aByteArray30[var8];
					if (var12 == 0) {
						aShortArray25[anInt652] = (short) method584(var7, var7.aShortArray25[var8]);
						aShortArray31[anInt652] = (short) method584(var7, var7.aShortArray31[var8]);
						aShortArray23[anInt652] = (short) method584(var7, var7.aShortArray23[var8]);
					}

					if (var12 >= 1 && var12 <= 3) {
						aShortArray25[anInt652] = var7.aShortArray25[var8];
						aShortArray31[anInt652] = var7.aShortArray31[var8];
						aShortArray23[anInt652] = var7.aShortArray23[var8];
						aShortArray26[anInt652] = var7.aShortArray26[var8];
						aShortArray27[anInt652] = var7.aShortArray27[var8];
						aShortArray28[anInt652] = var7.aShortArray28[var8];
						aShortArray32[anInt652] = var7.aShortArray32[var8];
						aByteArray29[anInt652] = var7.aByteArray29[var8];
						aShortArray29[anInt652] = var7.aShortArray29[var8];
					}

					if (var12 == 2) {
						aShortArray30[anInt652] = var7.aShortArray30[var8];
					}

					++anInt652;
				}
			}
		}

	}

	public RenderableSub3 method572(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		method582();
		int var11 = var2 + anInt656;
		int var13 = var2 + anInt654;
		int var9 = var4 + anInt658;
		int var10 = var4 + anInt657;
		if (var11 >= 0 && var13 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var11 >>= 7;
			var13 = var13 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var1[var11][var9] == var3 && var1[var13][var9] == var3 && var1[var11][var10] == var3
					&& var1[var13][var10] == var3) {
				return this;
			} else {
				RenderableSub3 var7;
				if (var5) {
					var7 = new RenderableSub3();
					var7.anInt651 = anInt651;
					var7.anInt653 = anInt653;
					var7.anInt652 = anInt652;
					var7.anIntArray133 = anIntArray133;
					var7.anIntArray136 = anIntArray136;
					var7.anIntArray135 = anIntArray135;
					var7.anIntArray131 = anIntArray131;
					var7.anIntArray132 = anIntArray132;
					var7.aByteArray26 = aByteArray26;
					var7.aByteArray27 = aByteArray27;
					var7.aByteArray25 = aByteArray25;
					var7.aByteArray28 = aByteArray28;
					var7.aShortArray22 = aShortArray22;
					var7.aShortArray24 = aShortArray24;
					var7.aByte6 = aByte6;
					var7.aByteArray30 = aByteArray30;
					var7.aShortArray25 = aShortArray25;
					var7.aShortArray31 = aShortArray31;
					var7.aShortArray23 = aShortArray23;
					var7.aShortArray26 = aShortArray26;
					var7.aShortArray27 = aShortArray27;
					var7.aShortArray28 = aShortArray28;
					var7.aShortArray32 = aShortArray32;
					var7.aByteArray29 = aByteArray29;
					var7.aShortArray29 = aShortArray29;
					var7.aShortArray30 = aShortArray30;
					var7.anIntArray130 = anIntArray130;
					var7.anIntArray134 = anIntArray134;
					var7.anIntArrayArray14 = anIntArrayArray14;
					var7.anIntArrayArray13 = anIntArrayArray13;
					var7.aShort2 = aShort2;
					var7.aShort3 = aShort3;
					var7.anIntArray129 = new int[var7.anInt651];
				} else {
					var7 = this;
				}

				int var8;
				int var12;
				int var14;
				int var15;
				int var16;
				int var17;
				int var19;
				int var20;
				int var21;
				int var22;
				if (var6 == 0) {
					for (var8 = 0; var8 < var7.anInt651; var8++) {
						var19 = anIntArray133[var8] + var2;
						var12 = anIntArray136[var8] + var4;
						var16 = var19 & 0x7f;
						var20 = var12 & 0x7f;
						var14 = var19 >> 7;
						var15 = var12 >> 7;
						var17 = var1[var14][var15] * (128 - var16) + var1[var14 + 1][var15] * var16 >> 7;
						var21 = var1[var14][var15 + 1] * (128 - var16) + var1[var14 + 1][var15 + 1] * var16 >> 7;
						var22 = var17 * (128 - var20) + var21 * var20 >> 7;
						var7.anIntArray129[var8] = anIntArray129[var8] + var22 - var3;
					}
				} else {
					for (var8 = 0; var8 < var7.anInt651; var8++) {
						var19 = (-anIntArray129[var8] << 16) / anInt421;
						if (var19 < var6) {
							var12 = anIntArray133[var8] + var2;
							var16 = anIntArray136[var8] + var4;
							var20 = var12 & 0x7f;
							var14 = var16 & 0x7f;
							var15 = var12 >> 7;
							var17 = var16 >> 7;
							var21 = var1[var15][var17] * (128 - var20) + var1[var15 + 1][var17] * var20 >> 7;
							var22 = var1[var15][var17 + 1] * (128 - var20) + var1[var15 + 1][var17 + 1] * var20 >> 7;
							int var18 = var21 * (128 - var14) + var22 * var14 >> 7;
							var7.anIntArray129[var8] = anIntArray129[var8] + (var18 - var3) * (var6 - var19) / var6;
						}
					}
				}

				var7.method569();
				return var7;
			}
		} else {
			return this;
		}
	}

	void method573() {
		int var1;
		int var2;
		int var3;
		int[] var4;
		if (anIntArray130 != null) {
			var4 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < anInt651; var3++) {
				var1 = anIntArray130[var3];
				++var4[var1];
				if (var1 > var2) {
					var2 = var1;
				}
			}

			anIntArrayArray14 = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; var3++) {
				anIntArrayArray14[var3] = new int[var4[var3]];
				var4[var3] = 0;
			}

			for (var3 = 0; var3 < anInt651; anIntArrayArray14[var1][var4[var1]++] = var3++) {
				var1 = anIntArray130[var3];
			}

			anIntArray130 = null;
		}

		if (anIntArray134 != null) {
			var4 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < anInt653; var3++) {
				var1 = anIntArray134[var3];
				++var4[var1];
				if (var1 > var2) {
					var2 = var1;
				}
			}

			anIntArrayArray13 = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; var3++) {
				anIntArrayArray13[var3] = new int[var4[var3]];
				var4[var3] = 0;
			}

			for (var3 = 0; var3 < anInt653; anIntArrayArray13[var1][var4[var1]++] = var3++) {
				var1 = anIntArray134[var3];
			}

			anIntArray134 = null;
		}

	}

	public void method574() {
		for (int var1 = 0; var1 < anInt651; var1++) {
			int var2 = anIntArray133[var1];
			anIntArray133[var1] = anIntArray136[var1];
			anIntArray136[var1] = -var2;
		}

		method569();
	}

	public void method575() {
		for (int var1 = 0; var1 < anInt651; var1++) {
			anIntArray133[var1] = -anIntArray133[var1];
			anIntArray136[var1] = -anIntArray136[var1];
		}

		method569();
	}

	public void method576() {
		for (int var1 = 0; var1 < anInt651; var1++) {
			int var2 = anIntArray136[var1];
			anIntArray136[var1] = anIntArray133[var1];
			anIntArray133[var1] = -var2;
		}

		method569();
	}

	public void method577(int var1) {
		int var2 = staticIntArray131[var1];
		int var4 = staticIntArray134[var1];

		for (int var3 = 0; var3 < anInt651; var3++) {
			int var5 = anIntArray136[var3] * var2 + anIntArray133[var3] * var4 >> 16;
			anIntArray136[var3] = anIntArray136[var3] * var4 - anIntArray133[var3] * var2 >> 16;
			anIntArray133[var3] = var5;
		}

		method569();
	}

	public void method578(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < anInt651; var4++) {
			anIntArray133[var4] += var1;
			anIntArray129[var4] += var2;
			anIntArray136[var4] += var3;
		}

		method569();
	}

	public RenderableSub3(RenderableSub3 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		anInt651 = var1.anInt651;
		anInt653 = var1.anInt653;
		anInt652 = var1.anInt652;
		int var6;
		if (var2) {
			anIntArray133 = var1.anIntArray133;
			anIntArray129 = var1.anIntArray129;
			anIntArray136 = var1.anIntArray136;
		} else {
			anIntArray133 = new int[anInt651];
			anIntArray129 = new int[anInt651];
			anIntArray136 = new int[anInt651];

			for (var6 = 0; var6 < anInt651; var6++) {
				anIntArray133[var6] = var1.anIntArray133[var6];
				anIntArray129[var6] = var1.anIntArray129[var6];
				anIntArray136[var6] = var1.anIntArray136[var6];
			}
		}

		if (var3) {
			aShortArray22 = var1.aShortArray22;
		} else {
			aShortArray22 = new short[anInt653];

			for (var6 = 0; var6 < anInt653; var6++) {
				aShortArray22[var6] = var1.aShortArray22[var6];
			}
		}

		if (!var4 && var1.aShortArray24 != null) {
			aShortArray24 = new short[anInt653];

			for (var6 = 0; var6 < anInt653; var6++) {
				aShortArray24[var6] = var1.aShortArray24[var6];
			}
		} else {
			aShortArray24 = var1.aShortArray24;
		}

		if (var5) {
			aByteArray25 = var1.aByteArray25;
		} else {
			aByteArray25 = new byte[anInt653];
			if (var1.aByteArray25 == null) {
				for (var6 = 0; var6 < anInt653; var6++) {
					aByteArray25[var6] = 0;
				}
			} else {
				for (var6 = 0; var6 < anInt653; var6++) {
					aByteArray25[var6] = var1.aByteArray25[var6];
				}
			}
		}

		anIntArray135 = var1.anIntArray135;
		anIntArray131 = var1.anIntArray131;
		anIntArray132 = var1.anIntArray132;
		aByteArray26 = var1.aByteArray26;
		aByteArray27 = var1.aByteArray27;
		aByteArray28 = var1.aByteArray28;
		aByte6 = var1.aByte6;
		aByteArray30 = var1.aByteArray30;
		aShortArray25 = var1.aShortArray25;
		aShortArray31 = var1.aShortArray31;
		aShortArray23 = var1.aShortArray23;
		aShortArray26 = var1.aShortArray26;
		aShortArray27 = var1.aShortArray27;
		aShortArray28 = var1.aShortArray28;
		aShortArray32 = var1.aShortArray32;
		aByteArray29 = var1.aByteArray29;
		aShortArray29 = var1.aShortArray29;
		aShortArray30 = var1.aShortArray30;
		anIntArray130 = var1.anIntArray130;
		anIntArray134 = var1.anIntArray134;
		anIntArrayArray14 = var1.anIntArrayArray14;
		anIntArrayArray13 = var1.anIntArrayArray13;
		aClass27Array2 = var1.aClass27Array2;
		aClass29Array1 = var1.aClass29Array1;
		aClass27Array1 = var1.aClass27Array1;
		aShort2 = var1.aShort2;
		aShort3 = var1.aShort3;
	}

	public void method579(short var1, short var2) {
		if (aShortArray24 != null) {
			for (int var3 = 0; var3 < anInt653; var3++) {
				if (aShortArray24[var3] == var1) {
					aShortArray24[var3] = var2;
				}
			}
		}

	}

	public void method580() {
		int var1;
		for (var1 = 0; var1 < anInt651; var1++) {
			anIntArray136[var1] = -anIntArray136[var1];
		}

		for (var1 = 0; var1 < anInt653; var1++) {
			int var2 = anIntArray135[var1];
			anIntArray135[var1] = anIntArray132[var1];
			anIntArray132[var1] = var2;
		}

		method569();
	}

	public RenderableSub3 method581() {
		RenderableSub3 var1 = new RenderableSub3();
		if (aByteArray26 != null) {
			var1.aByteArray26 = new byte[anInt653];

			for (int var2 = 0; var2 < anInt653; var2++) {
				var1.aByteArray26[var2] = aByteArray26[var2];
			}
		}

		var1.anInt651 = anInt651;
		var1.anInt653 = anInt653;
		var1.anInt652 = anInt652;
		var1.anIntArray133 = anIntArray133;
		var1.anIntArray129 = anIntArray129;
		var1.anIntArray136 = anIntArray136;
		var1.anIntArray135 = anIntArray135;
		var1.anIntArray131 = anIntArray131;
		var1.anIntArray132 = anIntArray132;
		var1.aByteArray27 = aByteArray27;
		var1.aByteArray25 = aByteArray25;
		var1.aByteArray28 = aByteArray28;
		var1.aShortArray22 = aShortArray22;
		var1.aShortArray24 = aShortArray24;
		var1.aByte6 = aByte6;
		var1.aByteArray30 = aByteArray30;
		var1.aShortArray25 = aShortArray25;
		var1.aShortArray31 = aShortArray31;
		var1.aShortArray23 = aShortArray23;
		var1.aShortArray26 = aShortArray26;
		var1.aShortArray27 = aShortArray27;
		var1.aShortArray28 = aShortArray28;
		var1.aShortArray32 = aShortArray32;
		var1.aByteArray29 = aByteArray29;
		var1.aShortArray29 = aShortArray29;
		var1.aShortArray30 = aShortArray30;
		var1.anIntArray130 = anIntArray130;
		var1.anIntArray134 = anIntArray134;
		var1.anIntArrayArray14 = anIntArrayArray14;
		var1.anIntArrayArray13 = anIntArrayArray13;
		var1.aClass27Array2 = aClass27Array2;
		var1.aClass29Array1 = aClass29Array1;
		var1.aShort2 = aShort2;
		var1.aShort3 = aShort3;
		return var1;
	}

	void method582() {
		if (!aBool79) {
			anInt421 = 0;
			anInt655 = 0;
			anInt656 = 999999;
			anInt654 = -999999;
			anInt657 = -99999;
			anInt658 = 99999;

			for (int var2 = 0; var2 < anInt651; var2++) {
				int var4 = anIntArray133[var2];
				int var1 = anIntArray129[var2];
				int var3 = anIntArray136[var2];
				if (var4 < anInt656) {
					anInt656 = var4;
				}

				if (var4 > anInt654) {
					anInt654 = var4;
				}

				if (var3 < anInt658) {
					anInt658 = var3;
				}

				if (var3 > anInt657) {
					anInt657 = var3;
				}

				if (-var1 > anInt421) {
					anInt421 = -var1;
				}

				if (var1 > anInt655) {
					anInt655 = var1;
				}
			}

			aBool79 = true;
		}

	}

	public final Model method583(int var1, int var2, int var3, int var4, int var5) {
		method586();
		int var7 = (int) Math.sqrt(var3 * var3 + var4 * var4 + var5 * var5);
		int var8 = var2 * var7 >> 8;
		Model var6 = new Model();
		var6.anIntArray142 = new int[anInt653];
		var6.anIntArray147 = new int[anInt653];
		var6.anIntArray144 = new int[anInt653];
		if (anInt652 > 0 && aByteArray28 != null) {
			int[] var16 = new int[anInt652];

			int var18;
			for (var18 = 0; var18 < anInt653; var18++) {
				if (aByteArray28[var18] != -1) {
					++var16[aByteArray28[var18] & 0xff];
				}
			}

			var6.anInt662 = 0;

			for (var18 = 0; var18 < anInt652; var18++) {
				if (var16[var18] > 0 && aByteArray30[var18] == 0) {
					++var6.anInt662;
				}
			}

			var6.anIntArray148 = new int[var6.anInt662];
			var6.anIntArray138 = new int[var6.anInt662];
			var6.anIntArray143 = new int[var6.anInt662];
			var18 = 0;

			int var17;
			for (var17 = 0; var17 < anInt652; var17++) {
				if (var16[var17] > 0 && aByteArray30[var17] == 0) {
					var6.anIntArray148[var18] = aShortArray25[var17] & 0xffff;
					var6.anIntArray138[var18] = aShortArray31[var17] & 0xffff;
					var6.anIntArray143[var18] = aShortArray23[var17] & 0xffff;
					var16[var17] = var18++;
				} else {
					var16[var17] = -1;
				}
			}

			var6.aByteArray32 = new byte[anInt653];

			for (var17 = 0; var17 < anInt653; var17++) {
				if (aByteArray28[var17] != -1) {
					var6.aByteArray32[var17] = (byte) var16[aByteArray28[var17] & 0xff];
				} else {
					var6.aByteArray32[var17] = -1;
				}
			}
		}

		for (int var171 = 0; var171 < anInt653; var171++) {
			byte var181;
			if (aByteArray26 == null) {
				var181 = 0;
			} else {
				var181 = aByteArray26[var171];
			}

			byte var191;
			if (aByteArray25 == null) {
				var191 = 0;
			} else {
				var191 = aByteArray25[var171];
			}

			short var15;
			if (aShortArray24 == null) {
				var15 = -1;
			} else {
				var15 = aShortArray24[var171];
			}

			if (var191 == -2) {
				var181 = 3;
			}

			if (var191 == -1) {
				var181 = 2;
			}

			DataClass2 var12;
			int var13;
			DataClass3 var19;
			if (var15 == -1) {
				if (var181 != 0) {
					if (var181 == 1) {
						var19 = aClass29Array1[var171];
						var13 = var1 + (var3 * var19.anInt90 + var4 * var19.anInt88 + var5 * var19.anInt89)
								/ (var8 + var8 / 2);
						var6.anIntArray142[var171] = Static.staticMethod435(aShortArray22[var171] & 0xffff, var13);
						var6.anIntArray144[var171] = -1;
					} else if (var181 == 3) {
						var6.anIntArray142[var171] = 128;
						var6.anIntArray144[var171] = -1;
					} else {
						var6.anIntArray144[var171] = -2;
					}
				} else {
					int var14 = aShortArray22[var171] & 0xffff;
					if (aClass27Array1 != null && aClass27Array1[anIntArray135[var171]] != null) {
						var12 = aClass27Array1[anIntArray135[var171]];
					} else {
						var12 = aClass27Array2[anIntArray135[var171]];
					}

					var13 = var1 + (var3 * var12.anInt79 + var4 * var12.anInt80 + var5 * var12.anInt81)
							/ (var8 * var12.anInt82);
					var6.anIntArray142[var171] = Static.staticMethod435(var14, var13);
					if (aClass27Array1 != null && aClass27Array1[anIntArray131[var171]] != null) {
						var12 = aClass27Array1[anIntArray131[var171]];
					} else {
						var12 = aClass27Array2[anIntArray131[var171]];
					}

					var13 = var1 + (var3 * var12.anInt79 + var4 * var12.anInt80 + var5 * var12.anInt81)
							/ (var8 * var12.anInt82);
					var6.anIntArray147[var171] = Static.staticMethod435(var14, var13);
					if (aClass27Array1 != null && aClass27Array1[anIntArray132[var171]] != null) {
						var12 = aClass27Array1[anIntArray132[var171]];
					} else {
						var12 = aClass27Array2[anIntArray132[var171]];
					}

					var13 = var1 + (var3 * var12.anInt79 + var4 * var12.anInt80 + var5 * var12.anInt81)
							/ (var8 * var12.anInt82);
					var6.anIntArray144[var171] = Static.staticMethod435(var14, var13);
				}
			} else if (var181 != 0) {
				if (var181 == 1) {
					var19 = aClass29Array1[var171];
					var13 = var1
							+ (var3 * var19.anInt90 + var4 * var19.anInt88 + var5 * var19.anInt89) / (var8 + var8 / 2);
					var6.anIntArray142[var171] = Static.staticMethod437(var13);
					var6.anIntArray144[var171] = -1;
				} else {
					var6.anIntArray144[var171] = -2;
				}
			} else {
				if (aClass27Array1 != null && aClass27Array1[anIntArray135[var171]] != null) {
					var12 = aClass27Array1[anIntArray135[var171]];
				} else {
					var12 = aClass27Array2[anIntArray135[var171]];
				}

				var13 = var1
						+ (var3 * var12.anInt79 + var4 * var12.anInt80 + var5 * var12.anInt81) / (var8 * var12.anInt82);
				var6.anIntArray142[var171] = Static.staticMethod437(var13);
				if (aClass27Array1 != null && aClass27Array1[anIntArray131[var171]] != null) {
					var12 = aClass27Array1[anIntArray131[var171]];
				} else {
					var12 = aClass27Array2[anIntArray131[var171]];
				}

				var13 = var1
						+ (var3 * var12.anInt79 + var4 * var12.anInt80 + var5 * var12.anInt81) / (var8 * var12.anInt82);
				var6.anIntArray147[var171] = Static.staticMethod437(var13);
				if (aClass27Array1 != null && aClass27Array1[anIntArray132[var171]] != null) {
					var12 = aClass27Array1[anIntArray132[var171]];
				} else {
					var12 = aClass27Array2[anIntArray132[var171]];
				}

				var13 = var1
						+ (var3 * var12.anInt79 + var4 * var12.anInt80 + var5 * var12.anInt81) / (var8 * var12.anInt82);
				var6.anIntArray144[var171] = Static.staticMethod437(var13);
			}
		}

		method573();
		var6.anInt660 = anInt651;
		var6.anIntArray139 = anIntArray133;
		var6.anIntArray137 = anIntArray129;
		var6.anIntArray145 = anIntArray136;
		var6.anInt666 = anInt653;
		var6.anIntArray140 = anIntArray135;
		var6.anIntArray141 = anIntArray131;
		var6.anIntArray146 = anIntArray132;
		var6.aByteArray33 = aByteArray27;
		var6.aByteArray31 = aByteArray25;
		var6.aByte7 = aByte6;
		var6.anIntArrayArray15 = anIntArrayArray14;
		var6.anIntArrayArray16 = anIntArrayArray13;
		var6.aShortArray33 = aShortArray24;
		return var6;
	}

	final int method584(RenderableSub3 var1, int var2) {
		int var3 = -1;
		int var6 = var1.anIntArray133[var2];
		int var5 = var1.anIntArray129[var2];
		int var7 = var1.anIntArray136[var2];

		for (int var4 = 0; var4 < anInt651; var4++) {
			if (var6 == anIntArray133[var4] && var5 == anIntArray129[var4] && var7 == anIntArray136[var4]) {
				var3 = var4;
				break;
			}
		}

		if (var3 == -1) {
			anIntArray133[anInt651] = var6;
			anIntArray129[anInt651] = var5;
			anIntArray136[anInt651] = var7;
			if (var1.anIntArray130 != null) {
				anIntArray130[anInt651] = var1.anIntArray130[var2];
			}

			var3 = anInt651++;
		}

		return var3;
	}

	public void method585(short var1, short var2) {
		for (int var3 = 0; var3 < anInt653; var3++) {
			if (aShortArray22[var3] == var1) {
				aShortArray22[var3] = var2;
			}
		}

	}

	RenderableSub3(byte[] var1) {
		if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
			method570(var1);
		} else {
			method571(var1);
		}

	}

	public void method586() {
		if (aClass27Array2 == null) {
			aClass27Array2 = new DataClass2[anInt651];

			int var1;
			for (var1 = 0; var1 < anInt651; var1++) {
				aClass27Array2[var1] = new DataClass2();
			}

			for (var1 = 0; var1 < anInt653; var1++) {
				int var7 = anIntArray135[var1];
				int var12 = anIntArray131[var1];
				int var9 = anIntArray132[var1];
				int var5 = anIntArray133[var12] - anIntArray133[var7];
				int var13 = anIntArray129[var12] - anIntArray129[var7];
				int var2 = anIntArray136[var12] - anIntArray136[var7];
				int var3 = anIntArray133[var9] - anIntArray133[var7];
				int var11 = anIntArray129[var9] - anIntArray129[var7];
				int var4 = anIntArray136[var9] - anIntArray136[var7];
				int var8 = var13 * var4 - var11 * var2;
				int var6 = var2 * var3 - var4 * var5;

				int var14;
				for (var14 = var5 * var11 - var3 * var13; var8 > 8192 || var6 > 8192 || var14 > 8192 || var8 < -8192
						|| var6 < -8192 || var14 < -8192; var14 >>= 1) {
					var8 >>= 1;
					var6 >>= 1;
				}

				int var15 = (int) Math.sqrt(var8 * var8 + var6 * var6 + var14 * var14);
				if (var15 <= 0) {
					var15 = 1;
				}

				var8 = var8 * 256 / var15;
				var6 = var6 * 256 / var15;
				var14 = var14 * 256 / var15;
				byte var16;
				if (aByteArray26 == null) {
					var16 = 0;
				} else {
					var16 = aByteArray26[var1];
				}

				if (var16 == 0) {
					DataClass2 var17 = aClass27Array2[var7];
					var17.anInt79 += var8;
					var17.anInt80 += var6;
					var17.anInt81 += var14;
					++var17.anInt82;
					var17 = aClass27Array2[var12];
					var17.anInt79 += var8;
					var17.anInt80 += var6;
					var17.anInt81 += var14;
					++var17.anInt82;
					var17 = aClass27Array2[var9];
					var17.anInt79 += var8;
					var17.anInt80 += var6;
					var17.anInt81 += var14;
					++var17.anInt82;
				} else if (var16 == 1) {
					if (aClass29Array1 == null) {
						aClass29Array1 = new DataClass3[anInt653];
					}

					DataClass3 var171 = aClass29Array1[var1] = new DataClass3();
					var171.anInt90 = var8;
					var171.anInt88 = var6;
					var171.anInt89 = var14;
				}
			}
		}

	}

	public void method587(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < anInt651; var4++) {
			anIntArray133[var4] = anIntArray133[var4] * var1 / 128;
			anIntArray129[var4] = anIntArray129[var4] * var2 / 128;
			anIntArray136[var4] = anIntArray136[var4] * var3 / 128;
		}

		method569();
	}

	RenderableSub3() {
	}

}
