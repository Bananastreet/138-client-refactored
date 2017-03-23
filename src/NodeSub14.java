public class NodeSub14 extends Node {

	int[] anIntArray67 = new int[128];
	NodeSub6Sub1[] aNodeSub6Sub1Array1 = new NodeSub6Sub1[128];
	short[] aShortArray1 = new short[128];
	byte[] aByteArray21 = new byte[128];
	byte[] aByteArray19 = new byte[128];
	Class43[] aClass43Array1 = new Class43[128];
	byte[] aByteArray20 = new byte[128];
	int anInt282;

	boolean method381(Class10 var1, byte[] var2, int[] var3) {
		boolean var4 = true;
		int var8 = 0;
		NodeSub6Sub1 var6 = null;

		for (int var7 = 0; var7 < 128; var7++) {
			if (var2 == null || var2[var7] != 0) {
				int var5 = anIntArray67[var7];
				if (var5 != 0) {
					if (var5 != var8) {
						var8 = var5--;
						if ((var5 & 0x1) == 0) {
							var6 = var1.method30(var5 >> 2, var3);
						} else {
							var6 = var1.method29(var5 >> 2, var3);
						}

						if (var6 == null) {
							var4 = false;
						}
					}

					if (var6 != null) {
						aNodeSub6Sub1Array1[var7] = var6;
						anIntArray67[var7] = 0;
					}
				}
			}
		}

		return var4;
	}

	void method382() {
		anIntArray67 = null;
	}

	NodeSub14(byte[] var1) {
		ByteBuf var5 = new ByteBuf(var1);

		int var6;
		for (var6 = 0; var5.buf[var5.position + var6] != 0; var6++) {
			;
		}

		byte[] var8 = new byte[var6];

		int var10;
		for (var10 = 0; var10 < var6; var10++) {
			var8[var10] = var5.readByte();
		}

		++var5.position;
		++var6;
		var10 = var5.position;
		var5.position += var6;

		int var13;
		for (var13 = 0; var5.buf[var5.position + var13] != 0; var13++) {
			;
		}

		byte[] var14 = new byte[var13];

		int var9;
		for (var9 = 0; var9 < var13; var9++) {
			var14[var9] = var5.readByte();
		}

		++var5.position;
		++var13;
		var9 = var5.position;
		var5.position += var13;

		int var16;
		for (var16 = 0; var5.buf[var16 + var5.position] != 0; var16++) {
			;
		}

		byte[] var18 = new byte[var16];

		for (int var45 = 0; var45 < var16; var45++) {
			var18[var45] = var5.readByte();
		}

		++var5.position;
		++var16;
		byte[] var421 = new byte[var16];
		int var22;
		int var23;
		if (var16 > 1) {
			var421[1] = 1;
			int var47 = 1;
			var22 = 2;

			for (var23 = 2; var23 < var16; var23++) {
				int var38 = var5.method367();
				if (var38 == 0) {
					var47 = var22++;
				} else {
					if (var38 <= var47) {
						--var38;
					}

					var47 = var38;
				}

				var421[var23] = (byte) var47;
			}
		} else {
			var22 = var16;
		}

		Class43[] var43 = new Class43[var22];

		Class43 var441;
		for (var23 = 0; var23 < var43.length; var23++) {
			var441 = var43[var23] = new Class43();
			int var39 = var5.method367();
			if (var39 > 0) {
				var441.aByteArray13 = new byte[var39 * 2];
			}

			var39 = var5.method367();
			if (var39 > 0) {
				var441.aByteArray12 = new byte[2 + var39 * 2];
				var441.aByteArray12[1] = 64;
			}
		}

		var23 = var5.method367();
		byte[] var451 = var23 > 0 ? new byte[var23 * 2] : null;
		var23 = var5.method367();
		byte[] var42 = var23 > 0 ? new byte[var23 * 2] : null;

		int var31;
		for (var31 = 0; var5.buf[var31 + var5.position] != 0; var31++) {
			;
		}

		byte[] var32 = new byte[var31];

		int var30;
		for (var30 = 0; var30 < var31; var30++) {
			var32[var30] = var5.readByte();
		}

		++var5.position;
		++var31;
		var30 = 0;

		int var15;
		for (var15 = 0; var15 < 128; var15++) {
			var30 += var5.method367();
			aShortArray1[var15] = (short) var30;
		}

		var30 = 0;

		for (var15 = 0; var15 < 128; var15++) {
			var30 += var5.method367();
			aShortArray1[var15] = (short) (aShortArray1[var15] + (var30 << 8));
		}

		var15 = 0;
		int var28 = 0;
		int var36 = 0;

		int var26;
		for (var26 = 0; var26 < 128; var26++) {
			if (var15 == 0) {
				if (var28 < var32.length) {
					var15 = var32[var28++];
				} else {
					var15 = -1;
				}

				var36 = var5.method339();
			}

			aShortArray1[var26] = (short) (aShortArray1[var26] + ((var36 - 1 & 0x2) << 14));
			anIntArray67[var26] = var36;
			--var15;
		}

		var15 = 0;
		var28 = 0;
		var26 = 0;

		int var4;
		for (var4 = 0; var4 < 128; var4++) {
			if (anIntArray67[var4] != 0) {
				if (var15 == 0) {
					if (var28 < var8.length) {
						var15 = var8[var28++];
					} else {
						var15 = -1;
					}

					var26 = var5.buf[var10++] - 1;
				}

				aByteArray20[var4] = (byte) var26;
				--var15;
			}
		}

		var15 = 0;
		var28 = 0;
		var4 = 0;

		for (int var49 = 0; var49 < 128; var49++) {
			if (anIntArray67[var49] != 0) {
				if (var15 == 0) {
					if (var28 < var14.length) {
						var15 = var14[var28++];
					} else {
						var15 = -1;
					}

					var4 = var5.buf[var9++] + 16 << 2;
				}

				aByteArray19[var49] = (byte) var4;
				--var15;
			}
		}

		var15 = 0;
		var28 = 0;
		Class43 var461 = null;

		int var29;
		for (var29 = 0; var29 < 128; var29++) {
			if (anIntArray67[var29] != 0) {
				if (var15 == 0) {
					var461 = var43[var421[var28]];
					if (var28 < var18.length) {
						var15 = var18[var28++];
					} else {
						var15 = -1;
					}
				}

				aClass43Array1[var29] = var461;
				--var15;
			}
		}

		var15 = 0;
		var28 = 0;
		var29 = 0;

		int var17;
		for (var17 = 0; var17 < 128; var17++) {
			if (var15 == 0) {
				if (var28 < var32.length) {
					var15 = var32[var28++];
				} else {
					var15 = -1;
				}

				if (anIntArray67[var17] > 0) {
					var29 = var5.method367() + 1;
				}
			}

			aByteArray21[var17] = (byte) var29;
			--var15;
		}

		anInt282 = var5.method367() + 1;

		int var2;
		Class43 var7;
		for (var17 = 0; var17 < var22; var17++) {
			var7 = var43[var17];
			if (var7.aByteArray13 != null) {
				for (var2 = 1; var2 < var7.aByteArray13.length; var2 += 2) {
					var7.aByteArray13[var2] = var5.readByte();
				}
			}

			if (var7.aByteArray12 != null) {
				for (var2 = 3; var2 < var7.aByteArray12.length - 2; var2 += 2) {
					var7.aByteArray12[var2] = var5.readByte();
				}
			}
		}

		if (var451 != null) {
			for (var17 = 1; var17 < var451.length; var17 += 2) {
				var451[var17] = var5.readByte();
			}
		}

		if (var42 != null) {
			for (var17 = 1; var17 < var42.length; var17 += 2) {
				var42[var17] = var5.readByte();
			}
		}

		for (var17 = 0; var17 < var22; var17++) {
			var7 = var43[var17];
			if (var7.aByteArray12 != null) {
				var30 = 0;

				for (var2 = 2; var2 < var7.aByteArray12.length; var2 += 2) {
					var30 = var30 + 1 + var5.method367();
					var7.aByteArray12[var2] = (byte) var30;
				}
			}
		}

		for (var17 = 0; var17 < var22; var17++) {
			var7 = var43[var17];
			if (var7.aByteArray13 != null) {
				var30 = 0;

				for (var2 = 2; var2 < var7.aByteArray13.length; var2 += 2) {
					var30 = 1 + var30 + var5.method367();
					var7.aByteArray13[var2] = (byte) var30;
				}
			}
		}

		byte var12;
		int var20;
		int var25;
		int var33;
		int var34;
		int var35;
		int var44;
		byte var46;
		if (var451 != null) {
			var30 = var5.method367();
			var451[0] = (byte) var30;

			for (var17 = 2; var17 < var451.length; var17 += 2) {
				var30 = var30 + 1 + var5.method367();
				var451[var17] = (byte) var30;
			}

			var46 = var451[0];
			byte var41 = var451[1];

			for (var2 = 0; var2 < var46; var2++) {
				aByteArray21[var2] = (byte) (32 + var41 * aByteArray21[var2] >> 6);
			}

			for (var2 = 2; var2 < var451.length; var2 += 2) {
				var12 = var451[var2];
				byte var48 = var451[1 + var2];
				var33 = var41 * (var12 - var46) + (var12 - var46) / 2;

				for (var25 = var46; var25 < var12; var25++) {
					var20 = var12 - var46;
					var34 = var33 >>> 31;
					var35 = (var34 + var33) / var20 - var34;
					aByteArray21[var25] = (byte) (aByteArray21[var25] * var35 + 32 >> 6);
					var33 += var48 - var41;
				}

				var46 = var12;
				var41 = var48;
			}

			for (var44 = var46; var44 < 128; var44++) {
				aByteArray21[var44] = (byte) (var41 * aByteArray21[var44] + 32 >> 6);
			}

			var441 = null;
		}

		if (var42 != null) {
			var30 = var5.method367();
			var42[0] = (byte) var30;

			for (var17 = 2; var17 < var42.length; var17 += 2) {
				var30 = var30 + 1 + var5.method367();
				var42[var17] = (byte) var30;
			}

			var46 = var42[0];
			int var471 = var42[1] << 1;

			for (var2 = 0; var2 < var46; var2++) {
				var44 = (aByteArray19[var2] & 0xff) + var471;
				if (var44 < 0) {
					var44 = 0;
				}

				if (var44 > 128) {
					var44 = 128;
				}

				aByteArray19[var2] = (byte) var44;
			}

			int var481;
			for (var2 = 2; var2 < var42.length; var2 += 2) {
				var12 = var42[var2];
				var481 = var42[var2 + 1] << 1;
				var33 = var471 * (var12 - var46) + (var12 - var46) / 2;

				for (var25 = var46; var25 < var12; var25++) {
					var20 = var12 - var46;
					var34 = var33 >>> 31;
					var35 = (var33 + var34) / var20 - var34;
					int var37 = (aByteArray19[var25] & 0xff) + var35;
					if (var37 < 0) {
						var37 = 0;
					}

					if (var37 > 128) {
						var37 = 128;
					}

					aByteArray19[var25] = (byte) var37;
					var33 += var481 - var471;
				}

				var46 = var12;
				var471 = var481;
			}

			for (var44 = var46; var44 < 128; var44++) {
				var481 = (aByteArray19[var44] & 0xff) + var471;
				if (var481 < 0) {
					var481 = 0;
				}

				if (var481 > 128) {
					var481 = 128;
				}

				aByteArray19[var44] = (byte) var481;
			}
		}

		for (var17 = 0; var17 < var22; var17++) {
			var43[var17].anInt181 = var5.method367();
		}

		for (var17 = 0; var17 < var22; var17++) {
			var7 = var43[var17];
			if (var7.aByteArray13 != null) {
				var7.anInt187 = var5.method367();
			}

			if (var7.aByteArray12 != null) {
				var7.anInt183 = var5.method367();
			}

			if (var7.anInt181 > 0) {
				var7.anInt184 = var5.method367();
			}
		}

		for (var17 = 0; var17 < var22; var17++) {
			var43[var17].anInt186 = var5.method367();
		}

		for (var17 = 0; var17 < var22; var17++) {
			var7 = var43[var17];
			if (var7.anInt186 > 0) {
				var7.anInt185 = var5.method367();
			}
		}

		for (var17 = 0; var17 < var22; var17++) {
			var7 = var43[var17];
			if (var7.anInt185 > 0) {
				var7.anInt182 = var5.method367();
			}
		}

	}

}
