
public class BZip2Decompressor {
	
	static BZip2DState staticBZip2DState1 = new BZip2DState();
	
	public static int staticMethod166(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		synchronized (staticBZip2DState1) {
			staticBZip2DState1.aByteArray6 = var2;
			staticBZip2DState1.anInt166 = var4;
			staticBZip2DState1.aByteArray7 = var0;
			staticBZip2DState1.anInt175 = 0;
			staticBZip2DState1.anInt168 = var1;
			staticBZip2DState1.anInt171 = 0;
			staticBZip2DState1.anInt170 = 0;
			staticBZip2DState1.anInt160 = 0;
			staticBZip2DState1.anInt177 = 0;
			staticMethod168(staticBZip2DState1);
			var1 -= staticBZip2DState1.anInt168;
			staticBZip2DState1.aByteArray6 = null;
			staticBZip2DState1.aByteArray7 = null;
			return var1;
		}
	}
	
	static void staticMethod168(BZip2DState var0) {
		int var19 = 0;
		int[] var16 = null;
		int[] var29 = null;
		int[] var18 = null;
		var0.anInt178 = 1;
		if (DataClass8.staticIntArray59 == null) {
			DataClass8.staticIntArray59 = new int[var0.anInt178 * 100000];
		}

		boolean var22 = true;

		while (true) {
			while (var22) {
				byte var20 = staticMethod171(var0);
				if (var20 == 23) {
					return;
				}

				var20 = staticMethod171(var0);
				var20 = staticMethod171(var0);
				var20 = staticMethod171(var0);
				var20 = staticMethod171(var0);
				var20 = staticMethod171(var0);
				var20 = staticMethod171(var0);
				var20 = staticMethod171(var0);
				var20 = staticMethod171(var0);
				var20 = staticMethod171(var0);
				var20 = staticMethod169(var0);
				if (var20 != 0) {
					;
				}

				var0.anInt172 = 0;
				var20 = staticMethod171(var0);
				var0.anInt172 = var0.anInt172 << 8 | var20 & 0xff;
				var20 = staticMethod171(var0);
				var0.anInt172 = var0.anInt172 << 8 | var20 & 0xff;
				var20 = staticMethod171(var0);
				var0.anInt172 = var0.anInt172 << 8 | var20 & 0xff;

				int var35;
				for (var35 = 0; var35 < 16; var35++) {
					var20 = staticMethod169(var0);
					if (var20 == 1) {
						var0.aBoolArray3[var35] = true;
					} else {
						var0.aBoolArray3[var35] = false;
					}
				}

				for (var35 = 0; var35 < 256; var35++) {
					var0.aBoolArray4[var35] = false;
				}

				int var52;
				for (var35 = 0; var35 < 16; var35++) {
					if (var0.aBoolArray3[var35]) {
						for (var52 = 0; var52 < 16; var52++) {
							var20 = staticMethod169(var0);
							if (var20 == 1) {
								var0.aBoolArray4[var35 * 16 + var52] = true;
							}
						}
					}
				}

				staticMethod170(var0);
				int var39 = var0.anInt179 + 2;
				int var40 = staticMethod173(3, var0);
				int var53 = staticMethod173(15, var0);

				for (var35 = 0; var35 < var53; var35++) {
					var52 = 0;

					while (true) {
						var20 = staticMethod169(var0);
						if (var20 == 0) {
							var0.aByteArray11[var35] = (byte) var52;
							break;
						}

						++var52;
					}
				}

				byte[] var7 = new byte[6];

				byte var21;
				for (var21 = 0; var21 < var40; var7[var21] = var21++) {
					;
				}

				for (var35 = 0; var35 < var53; var35++) {
					var21 = var0.aByteArray11[var35];

					byte var37;
					for (var37 = var7[var21]; var21 > 0; --var21) {
						var7[var21] = var7[var21 - 1];
					}

					var7[0] = var37;
					var0.aByteArray10[var35] = var37;
				}

				int var41;
				int var501;
				for (var501 = 0; var501 < var40; var501++) {
					var41 = staticMethod173(5, var0);

					for (var35 = 0; var35 < var39; var35++) {
						while (true) {
							var20 = staticMethod169(var0);
							if (var20 == 0) {
								var0.aByteArrayArray1[var501][var35] = (byte) var41;
								break;
							}

							var20 = staticMethod169(var0);
							if (var20 == 0) {
								++var41;
							} else {
								--var41;
							}
						}
					}
				}

				for (var501 = 0; var501 < var40; var501++) {
					byte var51 = 32;
					byte var55 = 0;

					for (var35 = 0; var35 < var39; var35++) {
						if (var0.aByteArrayArray1[var501][var35] > var55) {
							var55 = var0.aByteArrayArray1[var501][var35];
						}

						if (var0.aByteArrayArray1[var501][var35] < var51) {
							var51 = var0.aByteArrayArray1[var501][var35];
						}
					}

					staticMethod172(var0.anIntArrayArray7[var501], var0.anIntArrayArray6[var501],
							var0.anIntArrayArray8[var501], var0.aByteArrayArray1[var501], var51, var55, var39);
					var0.anIntArray39[var501] = var51;
				}

				var41 = var0.anInt179 + 1;
				int var521 = -1;
				byte var36 = 0;

				for (var35 = 0; var35 <= 255; var35++) {
					var0.anIntArray36[var35] = 0;
				}

				int var49 = 4095;

				int var42;
				int var50;
				for (var42 = 15; var42 >= 0; --var42) {
					for (var50 = 15; var50 >= 0; --var50) {
						var0.aByteArray8[var49] = (byte) (var42 * 16 + var50);
						--var49;
					}

					var0.anIntArray37[var42] = var49 + 1;
				}

				int var43 = 0;
				byte var48;
				if (var36 == 0) {
					++var521;
					var36 = 50;
					var48 = var0.aByteArray10[var521];
					var19 = var0.anIntArray39[var48];
					var16 = var0.anIntArrayArray7[var48];
					var18 = var0.anIntArrayArray8[var48];
					var29 = var0.anIntArrayArray6[var48];
				}

				int var38 = var36 - 1;
				int var46 = var19;

				int var47;
				byte var56;
				for (var47 = staticMethod173(var19, var0); var47 > var16[var46]; var47 = var47 << 1 | var56) {
					++var46;
					var56 = staticMethod169(var0);
				}

				int var54 = var18[var47 - var29[var46]];

				while (true) {
					while (var54 != var41) {
						int var44;
						int var45;
						if (var54 != 0 && var54 != 1) {
							var44 = var54 - 1;
							int var23;
							if (var44 < 16) {
								var45 = var0.anIntArray37[0];

								for (var20 = var0.aByteArray8[var45 + var44]; var44 > 3; var44 -= 4) {
									var23 = var45 + var44;
									var0.aByteArray8[var23] = var0.aByteArray8[var23 - 1];
									var0.aByteArray8[var23 - 1] = var0.aByteArray8[var23 - 2];
									var0.aByteArray8[var23 - 2] = var0.aByteArray8[var23 - 3];
									var0.aByteArray8[var23 - 3] = var0.aByteArray8[var23 - 4];
								}

								while (var44 > 0) {
									var0.aByteArray8[var45 + var44] = var0.aByteArray8[var45 + var44 - 1];
									--var44;
								}

								var0.aByteArray8[var45] = var20;
							} else {
								var23 = var44 / 16;
								int var34 = var44 % 16;
								var45 = var0.anIntArray37[var23] + var34;

								for (var20 = var0.aByteArray8[var45]; var45 > var0.anIntArray37[var23]; --var45) {
									var0.aByteArray8[var45] = var0.aByteArray8[var45 - 1];
								}

								++var0.anIntArray37[var23];

								while (var23 > 0) {
									--var0.anIntArray37[var23];
									var0.aByteArray8[var0.anIntArray37[var23]] = var0.aByteArray8[var0.anIntArray37[var23
											- 1] + 16 - 1];
									--var23;
								}

								--var0.anIntArray37[0];
								var0.aByteArray8[var0.anIntArray37[0]] = var20;
								if (var0.anIntArray37[0] == 0) {
									var49 = 4095;

									for (var42 = 15; var42 >= 0; --var42) {
										for (var50 = 15; var50 >= 0; --var50) {
											var0.aByteArray8[var49] = var0.aByteArray8[var0.anIntArray37[var42]
													+ var50];
											--var49;
										}

										var0.anIntArray37[var42] = var49 + 1;
									}
								}
							}

							++var0.anIntArray36[var0.aByteArray9[var20 & 0xff] & 0xff];
							DataClass8.staticIntArray59[var43] = var0.aByteArray9[var20 & 0xff] & 0xff;
							++var43;
							if (var38 == 0) {
								++var521;
								var38 = 50;
								var48 = var0.aByteArray10[var521];
								var19 = var0.anIntArray39[var48];
								var16 = var0.anIntArrayArray7[var48];
								var18 = var0.anIntArrayArray8[var48];
								var29 = var0.anIntArrayArray6[var48];
							}

							--var38;
							var46 = var19;

							for (var47 = staticMethod173(var19, var0); var47 > var16[var46]; var47 = var47 << 1
									| var56) {
								++var46;
								var56 = staticMethod169(var0);
							}

							var54 = var18[var47 - var29[var46]];
						} else {
							var44 = -1;
							var45 = 1;

							do {
								if (var54 == 0) {
									var44 += var45 * 1;
								} else if (var54 == 1) {
									var44 += var45 * 2;
								}

								var45 *= 2;
								if (var38 == 0) {
									++var521;
									var38 = 50;
									var48 = var0.aByteArray10[var521];
									var19 = var0.anIntArray39[var48];
									var16 = var0.anIntArrayArray7[var48];
									var18 = var0.anIntArrayArray8[var48];
									var29 = var0.anIntArrayArray6[var48];
								}

								--var38;
								var46 = var19;

								for (var47 = staticMethod173(var19, var0); var47 > var16[var46]; var47 = var47 << 1
										| var56) {
									++var46;
									var56 = staticMethod169(var0);
								}

								var54 = var18[var47 - var29[var46]];
							} while (var54 == 0 || var54 == 1);

							++var44;
							var20 = var0.aByteArray9[var0.aByteArray8[var0.anIntArray37[0]] & 0xff];

							for (var0.anIntArray36[var20 & 0xff] += var44; var44 > 0; --var44) {
								DataClass8.staticIntArray59[var43] = var20 & 0xff;
								++var43;
							}
						}
					}

					var0.anInt169 = 0;
					var0.aByte1 = 0;
					var0.anIntArray38[0] = 0;

					for (var35 = 1; var35 <= 256; var35++) {
						var0.anIntArray38[var35] = var0.anIntArray36[var35 - 1];
					}

					for (var35 = 1; var35 <= 256; var35++) {
						var0.anIntArray38[var35] += var0.anIntArray38[var35 - 1];
					}

					for (var35 = 0; var35 < var43; var35++) {
						var20 = (byte) (DataClass8.staticIntArray59[var35] & 0xff);
						DataClass8.staticIntArray59[var0.anIntArray38[var20 & 0xff]] |= var35 << 8;
						++var0.anIntArray38[var20 & 0xff];
					}

					var0.anInt173 = DataClass8.staticIntArray59[var0.anInt172] >> 8;
					var0.anInt162 = 0;
					var0.anInt173 = DataClass8.staticIntArray59[var0.anInt173];
					var0.anInt174 = (byte) (var0.anInt173 & 0xff);
					var0.anInt173 >>= 8;
					++var0.anInt162;
					var0.anInt180 = var43;
					staticMethod167(var0);
					if (var0.anInt162 == var0.anInt180 + 1 && var0.anInt169 == 0) {
						var22 = true;
						break;
					}

					var22 = false;
					break;
				}
			}

			return;
		}
	}
	
	static void staticMethod167(BZip2DState var0) {
		byte var1 = var0.aByte1;
		int var13 = var0.anInt169;
		int var3 = var0.anInt162;
		int var12 = var0.anInt174;
		int[] var4 = DataClass8.staticIntArray59;
		int var5 = var0.anInt173;
		byte[] var6 = var0.aByteArray7;
		int var2 = var0.anInt175;
		int var7 = var0.anInt168;
		int var9 = var0.anInt180 + 1;

		label66: while (true) {
			if (var13 > 0) {
				while (true) {
					if (var7 == 0) {
						break label66;
					}

					if (var13 == 1) {
						if (var7 == 0) {
							var13 = 1;
							break label66;
						}

						var6[var2] = var1;
						++var2;
						--var7;
						break;
					}

					var6[var2] = var1;
					--var13;
					++var2;
					--var7;
				}
			}

			boolean var14 = true;

			byte var11;
			while (var14) {
				var14 = false;
				if (var3 == var9) {
					var13 = 0;
					break label66;
				}

				var1 = (byte) var12;
				var5 = var4[var5];
				var11 = (byte) (var5 & 0xff);
				var5 >>= 8;
				++var3;
				if (var11 != var12) {
					var12 = var11;
					if (var7 == 0) {
						var13 = 1;
						break label66;
					}

					var6[var2] = var1;
					++var2;
					--var7;
					var14 = true;
				} else if (var3 == var9) {
					if (var7 == 0) {
						var13 = 1;
						break label66;
					}

					var6[var2] = var1;
					++var2;
					--var7;
					var14 = true;
				}
			}

			var13 = 2;
			var5 = var4[var5];
			var11 = (byte) (var5 & 0xff);
			var5 >>= 8;
			++var3;
			if (var3 != var9) {
				if (var11 != var12) {
					var12 = var11;
				} else {
					var13 = 3;
					var5 = var4[var5];
					var11 = (byte) (var5 & 0xff);
					var5 >>= 8;
					++var3;
					if (var3 != var9) {
						if (var11 != var12) {
							var12 = var11;
						} else {
							var5 = var4[var5];
							var11 = (byte) (var5 & 0xff);
							var5 >>= 8;
							++var3;
							var13 = (var11 & 0xff) + 4;
							var5 = var4[var5];
							var12 = (byte) (var5 & 0xff);
							var5 >>= 8;
							++var3;
						}
					}
				}
			}
		}

		int var131 = var0.anInt177;
		var0.anInt177 += var7 - var7;
		if (var0.anInt177 < var131) {
			;
		}

		var0.aByte1 = var1;
		var0.anInt169 = var13;
		var0.anInt162 = var3;
		var0.anInt174 = var12;
		DataClass8.staticIntArray59 = var4;
		var0.anInt173 = var5;
		var0.aByteArray7 = var6;
		var0.anInt175 = var2;
		var0.anInt168 = var7;
	}
	
	static void staticMethod172(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
		int var7 = 0;

		int var8;
		int var10;
		for (var8 = var4; var8 <= var5; var8++) {
			for (var10 = 0; var10 < var6; var10++) {
				if (var3[var10] == var8) {
					var2[var7] = var10;
					++var7;
				}
			}
		}

		for (var8 = 0; var8 < 23; var8++) {
			var1[var8] = 0;
		}

		for (var8 = 0; var8 < var6; var8++) {
			++var1[var3[var8] + 1];
		}

		for (var8 = 1; var8 < 23; var8++) {
			var1[var8] += var1[var8 - 1];
		}

		for (var8 = 0; var8 < 23; var8++) {
			var0[var8] = 0;
		}

		var10 = 0;

		for (var8 = var4; var8 <= var5; var8++) {
			var10 += var1[var8 + 1] - var1[var8];
			var0[var8] = var10 - 1;
			var10 <<= 1;
		}

		for (var8 = var4 + 1; var8 <= var5; var8++) {
			var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
		}

	}
	
	static void staticMethod170(BZip2DState var0) {
		var0.anInt179 = 0;

		for (int var1 = 0; var1 < 256; var1++) {
			if (var0.aBoolArray4[var1]) {
				var0.aByteArray9[var0.anInt179] = (byte) var1;
				++var0.anInt179;
			}
		}

	}
	
	static byte staticMethod171(BZip2DState var0) {
		return (byte) staticMethod173(8, var0);
	}
	
	static byte staticMethod169(BZip2DState var0) {
		return (byte) staticMethod173(1, var0);
	}
	
	static int staticMethod173(int var0, BZip2DState var1) {
		while (var1.anInt171 < var0) {
			var1.anInt170 = var1.anInt170 << 8 | var1.aByteArray6[var1.anInt166] & 0xff;
			var1.anInt171 += 8;
			++var1.anInt166;
			++var1.anInt160;
			if (var1.anInt160 == 0) {
				;
			}
		}

		int var2 = var1.anInt170 >> var1.anInt171 - var0 & (1 << var0) - 1;
		var1.anInt171 -= var0;
		return var2;
	}

}
