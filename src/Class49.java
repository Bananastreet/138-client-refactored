public class Class49 {

	static final int[] staticIntArray66 = new int[] { 8, 11, 4, 6, 9, 7, 10 };
	public static Cache staticCache1 = new Cache(260);
	long aLong17;
	long aLong16;
	int[] anIntArray49;
	int[] anIntArray48;
	public boolean aBool16;
	public int anInt198;

	public void method244(int var1, boolean var2) {
		if (var1 != 1 || !aBool16) {
			int var4 = anIntArray49[staticIntArray66[var1]];
			if (var4 != 0) {
				var4 -= 256;

				IdentityKit var3;
				do {
					do {
						do {
							if (!var2) {
								--var4;
								if (var4 < 0) {
									var4 = Class1.staticInt1 - 1;
								}
							} else {
								++var4;
								if (var4 >= Class1.staticInt1) {
									var4 = 0;
								}
							}

							var3 = Static.staticMethod382(var4);
						} while (var3 == null);
					} while (var3.aBool54);
				} while (var3.anInt433 != var1 + (aBool16 ? 7 : 0));

				anIntArray49[staticIntArray66[var1]] = var4 + 256;
				method247();
			}
		}

	}

	public void method245(int var1, boolean var2) {
		int var3 = anIntArray48[var1];
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = Class60.staticShortArrayArray4[var1].length - 1;
				}
			} while (!Static.staticMethod185(var1, var3));
		} else {
			do {
				++var3;
				if (var3 >= Class60.staticShortArrayArray4[var1].length) {
					var3 = 0;
				}
			} while (!Static.staticMethod185(var1, var3));
		}

		anIntArray48[var1] = var3;
		method247();
	}

	public void method246(boolean var1) {
		if (var1 != aBool16) {
			method252((int[]) null, anIntArray48, var1, -1);
		}

	}

	void method247() {
		long var1 = aLong17 * 1445424957776506923L;
		int var3 = anIntArray49[5];
		int var5 = anIntArray49[9];
		anIntArray49[5] = var5;
		anIntArray49[9] = var3;
		aLong17 = 0L;

		int var4;
		for (var4 = 0; var4 < 12; var4++) {
			aLong17 = (aLong17 * 1445424957776506923L << 4) * 1029057388533681795L;
			if (anIntArray49[var4] >= 256) {
				aLong17 += (anIntArray49[var4] - 256) * 1029057388533681795L;
			}
		}

		if (anIntArray49[0] >= 256) {
			aLong17 += (anIntArray49[0] - 256 >> 4) * 1029057388533681795L;
		}

		if (anIntArray49[1] >= 256) {
			aLong17 += (anIntArray49[1] - 256 >> 8) * 1029057388533681795L;
		}

		for (var4 = 0; var4 < 5; var4++) {
			aLong17 = (aLong17 * 1445424957776506923L << 3) * 1029057388533681795L;
			aLong17 += anIntArray48[var4] * 1029057388533681795L;
		}

		aLong17 = (aLong17 * 1445424957776506923L << 1) * 1029057388533681795L;
		aLong17 += (aBool16 ? 1 : 0) * 1029057388533681795L;
		anIntArray49[5] = var3;
		anIntArray49[9] = var5;
		if (var1 != 0L && var1 != aLong17 * 1445424957776506923L) {
			staticCache1.method169(var1);
		}

	}

	public Model method248(AnimDef var1, int var2, AnimDef var3, int var4) {
		if (anInt198 != -1) {
			return Static.staticMethod85(anInt198).method541(var1, var2, var3, var4);
		} else {
			long var7 = aLong17 * 1445424957776506923L;
			int[] var9 = anIntArray49;
			if (var1 != null && (var1.anInt564 >= 0 || var1.anInt565 >= 0)) {
				var9 = new int[12];

				for (int var15 = 0; var15 < 12; var15++) {
					var9[var15] = anIntArray49[var15];
				}

				if (var1.anInt564 >= 0) {
					var7 += var1.anInt564 - anIntArray49[5] << 40;
					var9[5] = var1.anInt564;
				}

				if (var1.anInt565 >= 0) {
					var7 += var1.anInt565 - anIntArray49[3] << 48;
					var9[3] = var1.anInt565;
				}
			}

			Model var151 = (Model) staticCache1.get(var7);
			if (var151 == null) {
				boolean var16 = false;

				int var13;
				for (int var18 = 0; var18 < 12; var18++) {
					var13 = var9[var18];
					if (var13 >= 256 && var13 < 512 && !Static.staticMethod382(var13 - 256).method482()) {
						var16 = true;
					}

					if (var13 >= 512 && !Static.staticMethod153(var13 - 512).method495(aBool16)) {
						var16 = true;
					}
				}

				if (var16) {
					if (aLong16 != -1L) {
						var151 = (Model) staticCache1.get(aLong16);
					}

					if (var151 == null) {
						return null;
					}
				}

				if (var151 == null) {
					RenderableSub3[] var171 = new RenderableSub3[12];
					var13 = 0;

					int var11;
					for (int var17 = 0; var17 < 12; var17++) {
						var11 = var9[var17];
						RenderableSub3 var14;
						if (var11 >= 256 && var11 < 512) {
							var14 = Static.staticMethod382(var11 - 256).method483();
							if (var14 != null) {
								var171[var13++] = var14;
							}
						}

						if (var11 >= 512) {
							var14 = Static.staticMethod153(var11 - 512).method492(aBool16);
							if (var14 != null) {
								var171[var13++] = var14;
							}
						}
					}

					RenderableSub3 var181 = new RenderableSub3(var171, var13);

					for (var11 = 0; var11 < 5; var11++) {
						if (anIntArray48[var11] < Class60.staticShortArrayArray4[var11].length) {
							var181.method585(CacheableSub3.staticShortArray5[var11],
									Class60.staticShortArrayArray4[var11][anIntArray48[var11]]);
						}

						if (anIntArray48[var11] < Static.staticShortArrayArray1[var11].length) {
							var181.method585(Class59.staticShortArray4[var11],
									Static.staticShortArrayArray1[var11][anIntArray48[var11]]);
						}
					}

					var151 = var181.method583(64, 850, -30, -50, -30);
					staticCache1.method170(var151, var7);
					aLong16 = var7;
				}
			}

			if (var1 == null && var3 == null) {
				return var151;
			} else {
				Model var161;
				if (var1 != null && var3 != null) {
					var161 = var1.method556(var151, var2, var3, var4);
				} else if (var1 != null) {
					var161 = var1.method551(var151, var2);
				} else {
					var161 = var3.method551(var151, var4);
				}

				return var161;
			}
		}
	}

	RenderableSub3 method249() {
		if (anInt198 != -1) {
			return Static.staticMethod85(anInt198).method542();
		} else {
			boolean var5 = false;

			int var4;
			for (int var7 = 0; var7 < 12; var7++) {
				var4 = anIntArray49[var7];
				if (var4 >= 256 && var4 < 512 && !Static.staticMethod382(var4 - 256).method481()) {
					var5 = true;
				}

				if (var4 >= 512 && !Static.staticMethod153(var4 - 512).method493(aBool16)) {
					var5 = true;
				}
			}

			if (var5) {
				return null;
			} else {
				RenderableSub3[] var71 = new RenderableSub3[12];
				var4 = 0;

				int var2;
				for (int var8 = 0; var8 < 12; var8++) {
					var2 = anIntArray49[var8];
					RenderableSub3 var1;
					if (var2 >= 256 && var2 < 512) {
						var1 = Static.staticMethod382(var2 - 256).method485();
						if (var1 != null) {
							var71[var4++] = var1;
						}
					}

					if (var2 >= 512) {
						var1 = Static.staticMethod153(var2 - 512).method487(aBool16);
						if (var1 != null) {
							var71[var4++] = var1;
						}
					}
				}

				RenderableSub3 var81 = new RenderableSub3(var71, var4);

				for (var2 = 0; var2 < 5; var2++) {
					if (anIntArray48[var2] < Class60.staticShortArrayArray4[var2].length) {
						var81.method585(CacheableSub3.staticShortArray5[var2],
								Class60.staticShortArrayArray4[var2][anIntArray48[var2]]);
					}

					if (anIntArray48[var2] < Static.staticShortArrayArray1[var2].length) {
						var81.method585(Class59.staticShortArray4[var2],
								Static.staticShortArrayArray1[var2][anIntArray48[var2]]);
					}
				}

				return var81;
			}
		}
	}

	public int method250() {
		return anInt198 == -1
				? anIntArray49[1] + (anIntArray49[11] << 5) + (anIntArray49[8] << 10) + (anIntArray49[0] << 15)
						+ (anIntArray48[0] << 25) + (anIntArray48[4] << 20)
				: 305419896 + Static.staticMethod85(anInt198).anInt537;
	}

	public void method251(Stream var1) {
		var1.writeByte(aBool16 ? 1 : 0);

		int var2;
		for (var2 = 0; var2 < 7; var2++) {
			int var3 = anIntArray49[staticIntArray66[var2]];
			if (var3 == 0) {
				var1.writeByte(-1);
			} else {
				var1.writeByte(var3 - 256);
			}
		}

		for (var2 = 0; var2 < 5; var2++) {
			var1.writeByte(anIntArray48[var2]);
		}

	}

	public void method252(int[] var1, int[] var2, boolean var3, int var4) {
		if (var1 == null) {
			var1 = new int[12];

			for (int var5 = 0; var5 < 7; var5++) {
				for (int var6 = 0; var6 < Class1.staticInt1; var6++) {
					IdentityKit var7 = Static.staticMethod382(var6);
					if (var7 != null && !var7.aBool54 && var7.anInt433 == (var3 ? 7 : 0) + var5) {
						var1[staticIntArray66[var5]] = 256 + var6;
						break;
					}
				}
			}
		}

		anIntArray49 = var1;
		anIntArray48 = var2;
		aBool16 = var3;
		anInt198 = var4;
		method247();
	}

}
