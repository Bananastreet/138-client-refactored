public class MusicFile extends Node {

	HashTable aHashTable4;
	byte[] aByteArray17;

	void method315() {
		if (aHashTable4 == null) {
			aHashTable4 = new HashTable(16);
			int[] var2 = new int[16];
			int[] var10 = new int[16];
			var10[9] = 128;
			var2[9] = 128;
			Class46 var3 = new Class46(aByteArray17);
			int var5 = var3.method237();

			int var6;
			for (var6 = 0; var6 < var5; var6++) {
				var3.method226(var6);
				var3.method225(var6);
				var3.method227(var6);
			}

			label56: do {
				while (true) {
					var6 = var3.method232();
					int var8 = var3.anIntArray41[var6];

					while (var3.anIntArray41[var6] == var8) {
						var3.method226(var6);
						int var7 = var3.method228(var6);
						if (var7 == 1) {
							var3.method234();
							var3.method227(var6);
							continue label56;
						}

						int var1 = var7 & 0xf0;
						int var9;
						int var11;
						int var12;
						if (var1 == 176) {
							var11 = var7 & 0xf;
							var12 = var7 >> 8 & 0x7f;
							var9 = var7 >> 16 & 0x7f;
							if (var12 == 0) {
								var2[var11] = (var2[var11] & 0xffe03fff) + (var9 << 14);
							}

							if (var12 == 32) {
								var2[var11] = (var2[var11] & 0xffffc07f) + (var9 << 7);
							}
						}

						if (var1 == 192) {
							var11 = var7 & 0xf;
							var12 = var7 >> 8 & 0x7f;
							var10[var11] = var2[var11] + var12;
						}

						if (var1 == 144) {
							var11 = var7 & 0xf;
							var12 = var7 >> 8 & 0x7f;
							var9 = var7 >> 16 & 0x7f;
							if (var9 > 0) {
								int var14 = var10[var11];
								NodeSub13 var4 = (NodeSub13) aHashTable4.method149(var14);
								if (var4 == null) {
									var4 = new NodeSub13(new byte[128]);
									aHashTable4.method148(var4, var14);
								}

								var4.aByteArray18[var12] = 1;
							}
						}

						var3.method225(var6);
						var3.method227(var6);
					}
				}
			} while (!var3.method233());
		}

	}

	void method316() {
		aHashTable4 = null;
	}

	MusicFile(ByteBuf var1) {
		var1.position = var1.buf.length - 3;
		int var6 = var1.readUByte();
		int var5 = var1.readUShort();
		int var7 = 14 + var6 * 10;
		var1.position = 0;
		int var8 = 0;
		int var9 = 0;
		int var10 = 0;
		int var18 = 0;
		int var27 = 0;
		int var23 = 0;
		int var14 = 0;
		int var15 = 0;

		int var12;
		int var13;
		int var16;
		for (var12 = 0; var12 < var6; var12++) {
			var13 = -1;

			while (true) {
				var16 = var1.readUByte();
				if (var16 != var13) {
					++var7;
				}

				var13 = var16 & 0xf;
				if (var16 == 7) {
					break;
				}

				if (var16 == 23) {
					++var8;
				} else if (var13 == 0) {
					++var10;
				} else if (var13 == 1) {
					++var18;
				} else if (var13 == 2) {
					++var9;
				} else if (var13 == 3) {
					++var27;
				} else if (var13 == 4) {
					++var23;
				} else if (var13 == 5) {
					++var14;
				} else {
					if (var13 != 6) {
						throw new RuntimeException();
					}

					++var15;
				}
			}
		}

		var7 += var8 * 5;
		var7 += (var10 + var18 + var9 + var27 + var14) * 2;
		var7 += var23 + var15;
		var12 = var1.position;
		var13 = var6 + var8 + var9 + var10 + var18 + var27 + var23 + var14 + var15;

		for (var16 = 0; var16 < var13; var16++) {
			var1.method339();
		}

		var7 += var1.position - var12;
		var16 = var1.position;
		int var22 = 0;
		int var17 = 0;
		int var29 = 0;
		int var30 = 0;
		int var31 = 0;
		int var32 = 0;
		int var42 = 0;
		int var19 = 0;
		int var26 = 0;
		int var35 = 0;
		int var36 = 0;
		int var37 = 0;
		int var4 = 0;

		int var38;
		for (var38 = 0; var38 < var9; var38++) {
			var4 = var4 + var1.readUByte() & 0x7f;
			if (var4 != 0 && var4 != 32) {
				if (var4 == 1) {
					++var22;
				} else if (var4 == 33) {
					++var17;
				} else if (var4 == 7) {
					++var29;
				} else if (var4 == 39) {
					++var30;
				} else if (var4 == 10) {
					++var31;
				} else if (var4 == 42) {
					++var32;
				} else if (var4 == 99) {
					++var42;
				} else if (var4 == 98) {
					++var19;
				} else if (var4 == 101) {
					++var26;
				} else if (var4 == 100) {
					++var35;
				} else if (var4 != 64 && var4 != 65 && var4 != 120 && var4 != 121 && var4 != 123) {
					++var37;
				} else {
					++var36;
				}
			} else {
				++var15;
			}
		}

		var38 = 0;
		int var43 = var1.position;
		var1.position += var36;
		int var46 = var1.position;
		var1.position += var14;
		int var44 = var1.position;
		var1.position += var23;
		int var49 = var1.position;
		var1.position += var27;
		int var66 = var1.position;
		var1.position += var22;
		int var50 = var1.position;
		var1.position += var29;
		int var51 = var1.position;
		var1.position += var31;
		int var59 = var1.position;
		var1.position += var10 + var18 + var14;
		int var52 = var1.position;
		var1.position += var10;
		int var20 = var1.position;
		var1.position += var37;
		int var34 = var1.position;
		var1.position += var18;
		int var53 = var1.position;
		var1.position += var17;
		int var54 = var1.position;
		var1.position += var30;
		int var58 = var1.position;
		var1.position += var32;
		int var55 = var1.position;
		var1.position += var15;
		int var39 = var1.position;
		var1.position += var27;
		int var48 = var1.position;
		var1.position += var42;
		int var56 = var1.position;
		var1.position += var19;
		int var28 = var1.position;
		var1.position += var26;
		int var57 = var1.position;
		var1.position += var35;
		int var3 = var1.position;
		var1.position += var8 * 3;
		aByteArray17 = new byte[var7];
		ByteBuf var2 = new ByteBuf(aByteArray17);
		var2.writeInt(1297377380);
		var2.writeInt(6);
		var2.writeShort(var6 > 1 ? 1 : 0);
		var2.writeShort(var6);
		var2.writeShort(var5);
		var1.position = var12;
		int var24 = 0;
		int var64 = 0;
		int var61 = 0;
		int var33 = 0;
		int var25 = 0;
		int var62 = 0;
		int var45 = 0;
		int[] var63 = new int[128];
		var4 = 0;

		label221: for (int var41 = 0; var41 < var6; var41++) {
			var2.writeInt(1297379947);
			var2.position += 4;
			int var47 = var2.position;
			int var11 = -1;

			while (true) {
				while (true) {
					int var65 = var1.method339();
					var2.method329(var65);
					int var40 = var1.buf[var38++] & 0xff;
					boolean var60 = var40 != var11;
					var11 = var40 & 0xf;
					if (var40 == 7) {
						if (var60) {
							var2.writeByte(255);
						}

						var2.writeByte(47);
						var2.writeByte(0);
						var2.method375(var2.position - var47);
						continue label221;
					}

					if (var40 == 23) {
						if (var60) {
							var2.writeByte(255);
						}

						var2.writeByte(81);
						var2.writeByte(3);
						var2.writeByte(var1.buf[var3++]);
						var2.writeByte(var1.buf[var3++]);
						var2.writeByte(var1.buf[var3++]);
					} else {
						var24 ^= var40 >> 4;
						if (var11 == 0) {
							if (var60) {
								var2.writeByte(144 + var24);
							}

							var64 += var1.buf[var59++];
							var61 += var1.buf[var52++];
							var2.writeByte(var64 & 0x7f);
							var2.writeByte(var61 & 0x7f);
						} else if (var11 == 1) {
							if (var60) {
								var2.writeByte(128 + var24);
							}

							var64 += var1.buf[var59++];
							var33 += var1.buf[var34++];
							var2.writeByte(var64 & 0x7f);
							var2.writeByte(var33 & 0x7f);
						} else if (var11 == 2) {
							if (var60) {
								var2.writeByte(176 + var24);
							}

							var4 = var4 + var1.buf[var16++] & 0x7f;
							var2.writeByte(var4);
							byte var21;
							if (var4 != 0 && var4 != 32) {
								if (var4 == 1) {
									var21 = var1.buf[var66++];
								} else if (var4 == 33) {
									var21 = var1.buf[var53++];
								} else if (var4 == 7) {
									var21 = var1.buf[var50++];
								} else if (var4 == 39) {
									var21 = var1.buf[var54++];
								} else if (var4 == 10) {
									var21 = var1.buf[var51++];
								} else if (var4 == 42) {
									var21 = var1.buf[var58++];
								} else if (var4 == 99) {
									var21 = var1.buf[var48++];
								} else if (var4 == 98) {
									var21 = var1.buf[var56++];
								} else if (var4 == 101) {
									var21 = var1.buf[var28++];
								} else if (var4 == 100) {
									var21 = var1.buf[var57++];
								} else if (var4 != 64 && var4 != 65 && var4 != 120 && var4 != 121 && var4 != 123) {
									var21 = var1.buf[var20++];
								} else {
									var21 = var1.buf[var43++];
								}
							} else {
								var21 = var1.buf[var55++];
							}

							int var67 = var21 + var63[var4];
							var63[var4] = var67;
							var2.writeByte(var67 & 0x7f);
						} else if (var11 == 3) {
							if (var60) {
								var2.writeByte(224 + var24);
							}

							var25 += var1.buf[var39++];
							var25 += var1.buf[var49++] << 7;
							var2.writeByte(var25 & 0x7f);
							var2.writeByte(var25 >> 7 & 0x7f);
						} else if (var11 == 4) {
							if (var60) {
								var2.writeByte(208 + var24);
							}

							var62 += var1.buf[var44++];
							var2.writeByte(var62 & 0x7f);
						} else if (var11 == 5) {
							if (var60) {
								var2.writeByte(160 + var24);
							}

							var64 += var1.buf[var59++];
							var45 += var1.buf[var46++];
							var2.writeByte(var64 & 0x7f);
							var2.writeByte(var45 & 0x7f);
						} else {
							if (var11 != 6) {
								throw new RuntimeException();
							}

							if (var60) {
								var2.writeByte(192 + var24);
							}

							var2.writeByte(var1.buf[var55++]);
						}
					}
				}
			}
		}

	}

}
