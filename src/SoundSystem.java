import java.awt.Component;

public class SoundSystem {

	public static int staticInt35;
	public static boolean staticBool5;
	int anInt51;
	long aLong9 = 0L;
	boolean aBool7 = true;
	int anInt53 = 0;
	long aLong10 = Static.staticMethod297();
	int anInt48 = 0;
	long aLong11 = 0L;
	int anInt55 = 0;
	int anInt54 = 0;
	int anInt49 = 32;
	NodeSub8[] aNodeSub8Array2 = new NodeSub8[8];
	NodeSub8[] aNodeSub8Array1 = new NodeSub8[8];
	int anInt50;
	int anInt52;
	int[] anIntArray27;
	static SoundTask staticClass15_1;
	NodeSub8 aNodeSub8_1;

	public final synchronized void method66() {
		if (anIntArray27 != null) {
			long var1 = Static.staticMethod297();

			try {
				if (aLong9 != 0L) {
					if (var1 < aLong9) {
						return;
					}

					method79(anInt50);
					aLong9 = 0L;
					aBool7 = true;
				}

				int var5 = method72();
				if (anInt48 - var5 > anInt53) {
					anInt53 = anInt48 - var5;
				}

				int var4 = anInt51 + anInt52;
				if (256 + var4 > 16384) {
					var4 = 16128;
				}

				if (256 + var4 > anInt50) {
					anInt50 += 1024;
					if (anInt50 > 16384) {
						anInt50 = 16384;
					}

					method74();
					method79(anInt50);
					var5 = 0;
					aBool7 = true;
					if (var4 + 256 > anInt50) {
						var4 = anInt50 - 256;
						anInt52 = var4 - anInt51;
					}
				}

				while (var5 < var4) {
					method76(anIntArray27, 256);
					method73();
					var5 += 256;
				}

				if (var1 > aLong11) {
					if (!aBool7) {
						if (anInt53 == 0 && anInt55 == 0) {
							method74();
							aLong9 = 2000L + var1;
							return;
						}

						anInt52 = Math.min(anInt55, anInt53);
						anInt55 = anInt53;
					} else {
						aBool7 = false;
					}

					anInt53 = 0;
					aLong11 = var1 + 2000L;
				}

				anInt48 = var5;
			} catch (Exception var6) {
				method74();
				aLong9 = 2000L + var1;
			}

			try {
				if (var1 > 500000L + aLong10) {
					var1 = aLong10;
				}

				while (var1 > 5000L + aLong10) {
					method70(256);
					aLong10 += 256000 / Static.staticInt120;
				}
			} catch (Exception var51) {
				aLong10 = var1;
			}
		}

	}

	public final void method67() {
		aBool7 = true;
	}

	public final synchronized void method68() {
		aBool7 = true;

		try {
			method75();
		} catch (Exception var2) {
			method74();
			aLong9 = Static.staticMethod297() + 2000L;
		}

	}

	public final synchronized void method69() {
		if (staticClass15_1 != null) {
			boolean var2 = true;

			for (int var1 = 0; var1 < 2; var1++) {
				if (this == staticClass15_1.aClass19Array1[var1]) {
					staticClass15_1.aClass19Array1[var1] = null;
				}

				if (staticClass15_1.aClass19Array1[var1] != null) {
					var2 = false;
				}
			}

			if (var2) {
				staticClass15_1.aBool5 = true;

				while (staticClass15_1.aBool6) {
					Static.staticMethod303(50L);
				}

				staticClass15_1 = null;
			}
		}

		method74();
		anIntArray27 = null;
	}

	final void method70(int var1) {
		anInt54 -= var1;
		if (anInt54 < 0) {
			anInt54 = 0;
		}

		if (aNodeSub8_1 != null) {
			aNodeSub8_1.method305(var1);
		}

	}

	void method71(Component var1) throws Exception {
	}

	int method72() throws Exception {
		return anInt50;
	}

	void method73() throws Exception {
	}

	void method74() {
	}

	void method75() throws Exception {
	}

	final void method76(int[] var1, int var2) {
		int var3 = var2;
		if (staticBool5) {
			var3 = var2 << 1;
		}

		Static.staticMethod218(var1, 0, var3);
		anInt54 -= var2;
		if (aNodeSub8_1 != null && anInt54 <= 0) {
			anInt54 += Static.staticInt120 >> 4;
			Static.staticMethod184(aNodeSub8_1);
			method78(aNodeSub8_1, aNodeSub8_1.method301());
			int var7 = 0;
			int var8 = 255;

			NodeSub8 var9;
			int var10;
			label105: for (var10 = 7; var8 != 0; --var10) {
				int var17;
				int var16;
				if (var10 < 0) {
					var16 = var10 & 0x3;
					var17 = -(var10 >> 2);
				} else {
					var16 = var10;
					var17 = 0;
				}

				for (int var14 = var8 >>> var16 & 0x11111111; var14 != 0; var14 >>>= 4) {
					if ((var14 & 0x1) != 0) {
						var8 &= ~(1 << var16);
						var9 = null;
						NodeSub8 var6 = aNodeSub8Array2[var16];

						label99: while (true) {
							while (true) {
								if (var6 == null) {
									break label99;
								}

								NodeSub6 var4 = var6.aNodeSub6_1;
								if (var4 != null && var4.anInt241 > var17) {
									var8 |= 1 << var16;
									var9 = var6;
									var6 = var6.aNodeSub8_2;
								} else {
									var6.aBool24 = true;
									int var15 = var6.method304();
									var7 += var15;
									if (var4 != null) {
										var4.anInt241 += var15;
									}

									if (var7 >= anInt49) {
										break label105;
									}

									NodeSub8 var12 = var6.method302();
									if (var12 != null) {
										for (int var18 = var6.anInt243; var12 != null; var12 = var6.method303()) {
											method78(var12, var18 * var12.method301() >> 8);
										}
									}

									NodeSub8 var181 = var6.aNodeSub8_2;
									var6.aNodeSub8_2 = null;
									if (var9 == null) {
										aNodeSub8Array2[var16] = var181;
									} else {
										var9.aNodeSub8_2 = var181;
									}

									if (var181 == null) {
										aNodeSub8Array1[var16] = var9;
									}

									var6 = var181;
								}
							}
						}
					}

					var16 += 4;
					++var17;
				}
			}

			for (var10 = 0; var10 < 8; var10++) {
				NodeSub8 var161 = aNodeSub8Array2[var10];
				NodeSub8[] var171 = aNodeSub8Array2;
				aNodeSub8Array1[var10] = null;

				for (var171[var10] = null; var161 != null; var161 = var9) {
					var9 = var161.aNodeSub8_2;
					var161.aNodeSub8_2 = null;
				}
			}
		}

		if (anInt54 < 0) {
			anInt54 = 0;
		}

		if (aNodeSub8_1 != null) {
			aNodeSub8_1.method306(var1, 0, var2);
		}

		aLong10 = Static.staticMethod297();
	}

	public final synchronized void method77(NodeSub8 var1) {
		aNodeSub8_1 = var1;
	}

	final void method78(NodeSub8 var1, int var2) {
		int var3 = var2 >> 5;
		NodeSub8 var4 = aNodeSub8Array1[var3];
		if (var4 == null) {
			aNodeSub8Array2[var3] = var1;
		} else {
			var4.aNodeSub8_2 = var1;
		}

		aNodeSub8Array1[var3] = var1;
		var1.anInt243 = var2;
	}

	void method79(int var1) throws Exception {
	}

}
