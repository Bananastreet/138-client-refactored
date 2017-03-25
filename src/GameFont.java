import java.util.Random;

public abstract class GameFont extends Rasterizer2D {

	public static Rasterizer2DSub3[] staticRasterizer2DSub3Array9;
	static int staticInt358 = 0;
	static int staticInt356 = 256;
	static int staticInt350 = 0;
	static int staticInt357 = -1;
	static int staticInt352 = -1;
	static int staticInt354 = -1;
	static int staticInt353 = -1;
	static int staticInt351 = 0;
	static int staticInt355 = 0;
	static Random staticRandom1 = new Random();
	static String[] staticStringArray11 = new String[100];
	int[] anIntArray153;
	public int anInt669 = 0;
	byte[] aByteArray34;
	byte[][] aByteArrayArray3 = new byte[256][];
	int[] anIntArray150;
	int[] anIntArray152;
	int[] anIntArray151;
	int[] anIntArray149;
	public int anInt667;
	public int anInt668;

	void method610(byte[] var1) {
		anIntArray153 = new int[256];
		int var2;
		if (var1.length == 257) {
			for (var2 = 0; var2 < anIntArray153.length; var2++) {
				anIntArray153[var2] = var1[var2] & 0xff;
			}

			anInt669 = var1[256] & 0xff;
		} else {
			var2 = 0;

			for (int var12 = 0; var12 < 256; var12++) {
				anIntArray153[var12] = var1[var2++] & 0xff;
			}

			int[] var121 = new int[256];
			int[] var6 = new int[256];

			int var4;
			for (var4 = 0; var4 < 256; var4++) {
				var121[var4] = var1[var2++] & 0xff;
			}

			for (var4 = 0; var4 < 256; var4++) {
				var6[var4] = var1[var2++] & 0xff;
			}

			byte[][] var11 = new byte[256][];

			int var8;
			for (int var13 = 0; var13 < 256; var13++) {
				var11[var13] = new byte[var121[var13]];
				byte var10 = 0;

				for (var8 = 0; var8 < var11[var13].length; var8++) {
					var10 += var1[var2++];
					var11[var13][var8] = var10;
				}
			}

			byte[][] var131 = new byte[256][];

			int var141;
			for (var141 = 0; var141 < 256; var141++) {
				var131[var141] = new byte[var121[var141]];
				byte var14 = 0;

				for (int var9 = 0; var9 < var131[var141].length; var9++) {
					var14 += var1[var2++];
					var131[var141][var9] = var14;
				}
			}

			aByteArray34 = new byte[65536];

			for (var141 = 0; var141 < 256; var141++) {
				if (var141 != 32 && var141 != 160) {
					for (var8 = 0; var8 < 256; var8++) {
						if (var8 != 32 && var8 != 160) {
							aByteArray34[(var141 << 8) + var8] = (byte) Static.staticMethod461(var11, var131, var6,
									anIntArray153, var121, var141, var8);
						}
					}
				}
			}

			anInt669 = var6[32] + var121[32];
		}

	}

	void method611(String var1, int var2, int var3) {
		var3 -= anInt669;
		int var4 = -1;
		int var5 = -1;

		for (int var6 = 0; var6 < var1.length(); var6++) {
			if (var1.charAt(var6) != 0) {
				char var7 = (char) (Static.staticMethod319(var1.charAt(var6)) & 0xff);
				if (var7 == 60) {
					var4 = var6;
				} else {
					int var9;
					if (var7 == 62 && var4 != -1) {
						String var12 = var1.substring(var4 + 1, var6);
						var4 = -1;
						if (var12.equals("lt")) {
							var7 = 60;
						} else {
							if (!var12.equals("gt")) {
								if (var12.startsWith("img=")) {
									try {
										var9 = Static.staticMethod388(var12.substring(4));
										Rasterizer2DSub3 var13 = staticRasterizer2DSub3Array9[var9];
										var13.method655(var2, var3 + anInt669 - var13.anInt679);
										var2 += var13.anInt676;
										var5 = -1;
									} catch (Exception var11) {
										;
									}
								} else {
									method625(var12);
								}
								continue;
							}

							var7 = 62;
						}
					}

					if (var7 == 160) {
						var7 = 32;
					}

					if (var4 == -1) {
						if (aByteArray34 != null && var5 != -1) {
							var2 += aByteArray34[(var5 << 8) + var7];
						}

						int var121 = anIntArray151[var7];
						var9 = anIntArray149[var7];
						if (var7 != 32) {
							if (staticInt356 == 256) {
								if (staticInt353 != -1) {
									Static.staticMethod457(aByteArrayArray3[var7], var2 + anIntArray150[var7] + 1,
											var3 + anIntArray152[var7] + 1, var121, var9, staticInt353);
								}

								method627(aByteArrayArray3[var7], var2 + anIntArray150[var7],
										var3 + anIntArray152[var7], var121, var9, staticInt355);
							} else {
								if (staticInt353 != -1) {
									Static.staticMethod459(aByteArrayArray3[var7], var2 + anIntArray150[var7] + 1,
											var3 + anIntArray152[var7] + 1, var121, var9, staticInt353, staticInt356);
								}

								method623(aByteArrayArray3[var7], var2 + anIntArray150[var7],
										var3 + anIntArray152[var7], var121, var9, staticInt355, staticInt356);
							}
						} else if (staticInt350 > 0) {
							staticInt358 += staticInt350;
							var2 += staticInt358 >> 8;
							staticInt358 &= 255;
						}

						int var10 = anIntArray153[var7];
						if (staticInt357 != -1) {
							Static.staticMethod413(var2, var3 + (int) (anInt669 * 0.7D), var10, staticInt357);
						}

						if (staticInt352 != -1) {
							Static.staticMethod413(var2, var3 + anInt669 + 1, var10, staticInt352);
						}

						var2 += var10;
						var5 = var7;
					}
				}
			}
		}

	}

	int method612(char var1) {
		if (var1 == 160) {
			var1 = 32;
		}

		return anIntArray153[Static.staticMethod319(var1) & 0xff];
	}

	public int method613(String var1) {
		if (var1 == null) {
			return 0;
		} else {
			int var2 = -1;
			int var3 = -1;
			int var4 = 0;

			for (int var5 = 0; var5 < var1.length(); var5++) {
				char var6 = var1.charAt(var5);
				if (var6 == 60) {
					var2 = var5;
				} else {
					if (var6 == 62 && var2 != -1) {
						String var7 = var1.substring(var2 + 1, var5);
						var2 = -1;
						if (var7.equals("lt")) {
							var6 = 60;
						} else {
							if (!var7.equals("gt")) {
								if (var7.startsWith("img=")) {
									try {
										int var8 = Static.staticMethod388(var7.substring(4));
										var4 += staticRasterizer2DSub3Array9[var8].anInt676;
										var3 = -1;
									} catch (Exception var9) {
										;
									}
								}
								continue;
							}

							var6 = 62;
						}
					}

					if (var6 == 160) {
						var6 = 32;
					}

					if (var2 == -1) {
						var4 += anIntArray153[(char) (Static.staticMethod319(var6) & 0xff)];
						if (aByteArray34 != null && var3 != -1) {
							var4 += aByteArray34[(var3 << 8) + var6];
						}

						var3 = var6;
					}
				}
			}

			return var4;
		}
	}

	int method614(String var1, int[] var2, String[] var3) {
		if (var1 == null) {
			return 0;
		} else {
			int var4 = 0;
			int var5 = 0;
			StringBuilder var6 = new StringBuilder(100);
			int var7 = -1;
			int var8 = 0;
			byte var9 = 0;
			int var10 = -1;
			char var11 = 0;
			int var12 = 0;
			int var13 = var1.length();

			for (int var19 = 0; var19 < var13; var19++) {
				char var15 = var1.charAt(var19);
				if (var15 == 60) {
					var10 = var19;
				} else {
					if (var15 == 62 && var10 != -1) {
						String var16 = var1.substring(var10 + 1, var19);
						var10 = -1;
						var6.append('<');
						var6.append(var16);
						var6.append('>');
						if (var16.equals("br")) {
							var3[var12] = var6.toString().substring(var5, var6.length());
							++var12;
							var5 = var6.length();
							var4 = 0;
							var7 = -1;
							var11 = 0;
						} else if (var16.equals("lt")) {
							var4 += method612('<');
							if (aByteArray34 != null && var11 != -1) {
								var4 += aByteArray34[(var11 << 8) + 60];
							}

							var11 = 60;
						} else if (var16.equals("gt")) {
							var4 += method612('>');
							if (aByteArray34 != null && var11 != -1) {
								var4 += aByteArray34[(var11 << 8) + 62];
							}

							var11 = 62;
						} else if (var16.startsWith("img=")) {
							try {
								int var17 = Static.staticMethod388(var16.substring(4));
								var4 += staticRasterizer2DSub3Array9[var17].anInt676;
								var11 = 0;
							} catch (Exception var18) {
								;
							}
						}

						var15 = 0;
					}

					if (var10 == -1) {
						if (var15 != 0) {
							var6.append(var15);
							var4 += method612(var15);
							if (aByteArray34 != null && var11 != -1) {
								var4 += aByteArray34[(var11 << 8) + var15];
							}

							var11 = var15;
						}

						if (var15 == 32) {
							var7 = var6.length();
							var8 = var4;
							var9 = 1;
						}

						if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
							var3[var12] = var6.toString().substring(var5, var7 - var9);
							++var12;
							var5 = var7;
							var7 = -1;
							var4 -= var8;
							var11 = 0;
						}

						if (var15 == 45) {
							var7 = var6.length();
							var8 = var4;
							var9 = 0;
						}
					}
				}
			}

			String var191 = var6.toString();
			if (var191.length() > var5) {
				var3[var12++] = var191.substring(var5, var191.length());
			}

			return var12;
		}
	}

	public int method615(String var1, int var2) {
		return method614(var1, new int[] { var2 }, staticStringArray11);
	}

	public void method616(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			method629(var4, var5);
			method611(var1, var2, var3);
		}

	}

	public void method617(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			method629(var4, var5);
			staticInt356 = var6;
			method611(var1, var2, var3);
		}

	}

	public void method618(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			method629(var4, var5);
			method611(var1, var2 - method613(var1), var3);
		}

	}

	public void method619(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			method629(var4, var5);
			int[] var7 = new int[var1.length()];
			int[] var9 = new int[var1.length()];

			for (int var8 = 0; var8 < var1.length(); var8++) {
				var7[var8] = (int) (Math.sin(var8 / 5.0D + var6 / 5.0D) * 5.0D);
				var9[var8] = (int) (Math.sin(var8 / 3.0D + var6 / 5.0D) * 5.0D);
			}

			method631(var1, var2 - method613(var1) / 2, var3, var7, var9);
		}

	}

	public void method620(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 != null) {
			method629(var4, var5);
			double var8 = 7.0D - var7 / 8.0D;
			if (var8 < 0.0D) {
				var8 = 0.0D;
			}

			int[] var10 = new int[var1.length()];

			for (int var11 = 0; var11 < var1.length(); var11++) {
				var10[var11] = (int) (Math.sin(var11 / 1.5D + var6 / 1.0D) * var8);
			}

			method631(var1, var2 - method613(var1) / 2, var3, (int[]) null, var10);
		}

	}

	public void method621(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			method629(var4, var5);
			staticRandom1.setSeed(var6);
			staticInt356 = 192 + (staticRandom1.nextInt() & 0x1f);
			int[] var8 = new int[var1.length()];
			int var9 = 0;

			for (int var7 = 0; var7 < var1.length(); var7++) {
				var8[var7] = var9;
				if ((staticRandom1.nextInt() & 0x3) == 0) {
					++var9;
				}
			}

			method631(var1, var2, var3, var8, (int[]) null);
		}

	}

	void method622(String var1, int var2) {
		int var3 = 0;
		boolean var5 = false;

		for (int var4 = 0; var4 < var1.length(); var4++) {
			char var6 = var1.charAt(var4);
			if (var6 == 60) {
				var5 = true;
			} else if (var6 == 62) {
				var5 = false;
			} else if (!var5 && var6 == 32) {
				++var3;
			}
		}

		if (var3 > 0) {
			staticInt350 = (var2 - method613(var1) << 8) / var3;
		}

	}

	abstract void method623(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

	public int method624(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9,
			int var10) {
		if (var1 == null) {
			return 0;
		} else {
			method629(var6, var7);
			if (var10 == 0) {
				var10 = anInt669;
			}

			int[] var13 = new int[] { var4 };
			if (var5 < anInt667 + anInt668 + var10 && var5 < var10 + var10) {
				var13 = null;
			}

			int var12 = method614(var1, var13, staticStringArray11);
			if (var9 == 3 && var12 == 1) {
				var9 = 1;
			}

			int var11;
			int var14;
			if (var9 == 0) {
				var11 = var3 + anInt667;
			} else if (var9 == 1) {
				var11 = var3 + anInt667 + (var5 - anInt667 - anInt668 - (var12 - 1) * var10) / 2;
			} else if (var9 == 2) {
				var11 = var3 + var5 - anInt668 - (var12 - 1) * var10;
			} else {
				var14 = (var5 - anInt667 - anInt668 - (var12 - 1) * var10) / (var12 + 1);
				if (var14 < 0) {
					var14 = 0;
				}

				var11 = var3 + anInt667 + var14;
				var10 += var14;
			}

			for (var14 = 0; var14 < var12; var14++) {
				if (var8 == 0) {
					method611(staticStringArray11[var14], var2, var11);
				} else if (var8 == 1) {
					method611(staticStringArray11[var14], var2 + (var4 - method613(staticStringArray11[var14])) / 2,
							var11);
				} else if (var8 == 2) {
					method611(staticStringArray11[var14], var2 + var4 - method613(staticStringArray11[var14]), var11);
				} else if (var14 == var12 - 1) {
					method611(staticStringArray11[var14], var2, var11);
				} else {
					method622(staticStringArray11[var14], var4);
					method611(staticStringArray11[var14], var2, var11);
					staticInt350 = 0;
				}

				var11 += var10;
			}

			return var12;
		}
	}

	void method625(String var1) {
		try {
			String var2;
			int var3;
			if (var1.startsWith("col=")) {
				var2 = var1.substring(4);
				var3 = Static.staticMethod188(var2, 16, true);
				staticInt355 = var3;
			} else if (var1.equals("/col")) {
				staticInt355 = staticInt351;
			} else if (var1.startsWith("str=")) {
				var2 = var1.substring(4);
				var3 = Static.staticMethod188(var2, 16, true);
				staticInt357 = var3;
			} else if (var1.equals("str")) {
				staticInt357 = 8388608;
			} else if (var1.equals("/str")) {
				staticInt357 = -1;
			} else if (var1.startsWith("u=")) {
				var2 = var1.substring(2);
				var3 = Static.staticMethod188(var2, 16, true);
				staticInt352 = var3;
			} else if (var1.equals("u")) {
				staticInt352 = 0;
			} else if (var1.equals("/u")) {
				staticInt352 = -1;
			} else if (var1.startsWith("shad=")) {
				var2 = var1.substring(5);
				var3 = Static.staticMethod188(var2, 16, true);
				staticInt353 = var3;
			} else if (var1.equals("shad")) {
				staticInt353 = 0;
			} else if (var1.equals("/shad")) {
				staticInt353 = staticInt354;
			} else if (var1.equals("br")) {
				method629(staticInt351, staticInt354);
			}
		} catch (Exception var4) {
			;
		}

	}

	public void method626(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			method629(var4, var5);
			int[] var7 = new int[var1.length()];

			for (int var8 = 0; var8 < var1.length(); var8++) {
				var7[var8] = (int) (Math.sin(var8 / 2.0D + var6 / 5.0D) * 5.0D);
			}

			method631(var1, var2 - method613(var1) / 2, var3, (int[]) null, var7);
		}

	}

	abstract void method627(byte[] var1, int var2, int var3, int var4, int var5, int var6);

	public int method628(String var1, int var2) {
		int var3 = method614(var1, new int[] { var2 }, staticStringArray11);
		int var5 = 0;

		for (int var4 = 0; var4 < var3; var4++) {
			int var6 = method613(staticStringArray11[var4]);
			if (var6 > var5) {
				var5 = var6;
			}
		}

		return var5;
	}

	GameFont(byte[] var1) {
		method610(var1);
	}

	GameFont(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		anIntArray150 = var2;
		anIntArray152 = var3;
		anIntArray151 = var4;
		anIntArray149 = var5;
		method610(var1);
		aByteArrayArray3 = var7;
		int var9 = Integer.MAX_VALUE;
		int var10 = Integer.MIN_VALUE;

		for (int var8 = 0; var8 < 256; var8++) {
			if (anIntArray152[var8] < var9 && anIntArray149[var8] != 0) {
				var9 = anIntArray152[var8];
			}

			if (anIntArray152[var8] + anIntArray149[var8] > var10) {
				var10 = anIntArray152[var8] + anIntArray149[var8];
			}
		}

		anInt667 = anInt669 - var9;
		anInt668 = var10 - anInt669;
	}

	void method629(int var1, int var2) {
		staticInt357 = -1;
		staticInt352 = -1;
		staticInt354 = var2;
		staticInt353 = var2;
		staticInt351 = var1;
		staticInt355 = var1;
		staticInt356 = 256;
		staticInt350 = 0;
		staticInt358 = 0;
	}

	public void method630(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			method629(var4, var5);
			method611(var1, var2 - method613(var1) / 2, var3);
		}

	}

	void method631(String var1, int var2, int var3, int[] var4, int[] var5) {
		var3 -= anInt669;
		int var6 = -1;
		int var7 = -1;
		int var8 = 0;

		for (int var9 = 0; var9 < var1.length(); var9++) {
			if (var1.charAt(var9) != 0) {
				char var10 = (char) (Static.staticMethod319(var1.charAt(var9)) & 0xff);
				if (var10 == 60) {
					var6 = var9;
				} else {
					int var12;
					int var13;
					int var14;
					if (var10 == 62 && var6 != -1) {
						String var17 = var1.substring(var6 + 1, var9);
						var6 = -1;
						if (var17.equals("lt")) {
							var10 = 60;
						} else {
							if (!var17.equals("gt")) {
								if (var17.startsWith("img=")) {
									try {
										if (var4 != null) {
											var12 = var4[var8];
										} else {
											var12 = 0;
										}

										if (var5 != null) {
											var13 = var5[var8];
										} else {
											var13 = 0;
										}

										++var8;
										var14 = Static.staticMethod388(var17.substring(4));
										Rasterizer2DSub3 var18 = staticRasterizer2DSub3Array9[var14];
										var18.method655(var2 + var12, var3 + anInt669 - var18.anInt679 + var13);
										var2 += var18.anInt676;
										var7 = -1;
									} catch (Exception var16) {
										;
									}
								} else {
									method625(var17);
								}
								continue;
							}

							var10 = 62;
						}
					}

					if (var10 == 160) {
						var10 = 32;
					}

					if (var6 == -1) {
						if (aByteArray34 != null && var7 != -1) {
							var2 += aByteArray34[(var7 << 8) + var10];
						}

						int var171 = anIntArray151[var10];
						var12 = anIntArray149[var10];
						if (var4 != null) {
							var13 = var4[var8];
						} else {
							var13 = 0;
						}

						if (var5 != null) {
							var14 = var5[var8];
						} else {
							var14 = 0;
						}

						++var8;
						if (var10 != 32) {
							if (staticInt356 == 256) {
								if (staticInt353 != -1) {
									Static.staticMethod457(aByteArrayArray3[var10],
											var2 + anIntArray150[var10] + 1 + var13,
											var3 + anIntArray152[var10] + 1 + var14, var171, var12, staticInt353);
								}

								method627(aByteArrayArray3[var10], var2 + anIntArray150[var10] + var13,
										var3 + anIntArray152[var10] + var14, var171, var12, staticInt355);
							} else {
								if (staticInt353 != -1) {
									Static.staticMethod459(aByteArrayArray3[var10],
											var2 + anIntArray150[var10] + 1 + var13,
											var3 + anIntArray152[var10] + 1 + var14, var171, var12, staticInt353,
											staticInt356);
								}

								method623(aByteArrayArray3[var10], var2 + anIntArray150[var10] + var13,
										var3 + anIntArray152[var10] + var14, var171, var12, staticInt355, staticInt356);
							}
						} else if (staticInt350 > 0) {
							staticInt358 += staticInt350;
							var2 += staticInt358 >> 8;
							staticInt358 &= 255;
						}

						int var15 = anIntArray153[var10];
						if (staticInt357 != -1) {
							Static.staticMethod413(var2, var3 + (int) (anInt669 * 0.7D), var15, staticInt357);
						}

						if (staticInt352 != -1) {
							Static.staticMethod413(var2, var3 + anInt669, var15, staticInt352);
						}

						var2 += var15;
						var7 = var10;
					}
				}
			}
		}

	}

}
