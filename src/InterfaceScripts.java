
public class InterfaceScripts {
	
	private InterfaceScripts() {
		
	}
	
	static final int staticMethod42(Widget var0, int var1) {
		if (var0.anIntArrayArray12 != null && var1 < var0.anIntArrayArray12.length) {
			try {
				int[] var13 = var0.anIntArrayArray12[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;

				while (true) {
					int var6 = var13[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0) {
						return var3;
					}

					if (var6 == 1) {
						var7 = Client.staticIntArray91[var13[var4++]];
					}

					if (var6 == 2) {
						var7 = Client.staticIntArray96[var13[var4++]];
					}

					if (var6 == 3) {
						var7 = Client.staticIntArray108[var13[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var13[var4++] << 16;
						var9 += var13[var4++];
						var10 = Static.staticMethod8(var9);
						var11 = var13[var4++];
						if (var11 != -1 && (!Static.staticMethod153(var11).members || Client.staticBool20)) {
							for (var12 = 0; var12 < var10.anIntArray76.length; var12++) {
								if (var11 + 1 == var10.anIntArray76[var12]) {
									var7 += var10.anIntArray77[var12];
								}
							}
						}
					}

					if (var6 == 5) {
						var7 = Static.staticIntArray64[var13[var4++]];
					}

					if (var6 == 6) {
						var7 = Static.staticIntArray60[Client.staticIntArray96[var13[var4++]] - 1];
					}

					if (var6 == 7) {
						var7 = Static.staticIntArray64[var13[var4++]] * 100 / '\ub71b';
					}

					if (var6 == 8) {
						var7 = AbstractClass2Sub1.staticPlayer1.anInt685;
					}

					if (var6 == 9) {
						for (var9 = 0; var9 < 25; var9++) {
							if (Static.staticBoolArray3[var9]) {
								var7 += Client.staticIntArray96[var9];
							}
						}
					}

					if (var6 == 10) {
						var9 = var13[var4++] << 16;
						var9 += var13[var4++];
						var10 = Static.staticMethod8(var9);
						var11 = var13[var4++];
						if (var11 != -1 && (!Static.staticMethod153(var11).members || Client.staticBool20)) {
							for (var12 = 0; var12 < var10.anIntArray76.length; var12++) {
								if (var10.anIntArray76[var12] == 1 + var11) {
									var7 = 999999999;
									break;
								}
							}
						}
					}

					if (var6 == 11) {
						var7 = Client.staticInt267;
					}

					if (var6 == 12) {
						var7 = Client.staticInt232;
					}

					if (var6 == 13) {
						var9 = Static.staticIntArray64[var13[var4++]];
						int var14 = var13[var4++];
						var7 = (var9 & 1 << var14) != 0 ? 1 : 0;
					}

					if (var6 == 14) {
						var9 = var13[var4++];
						var7 = Static.staticMethod82(var9);
					}

					if (var6 == 15) {
						var8 = 1;
					}

					if (var6 == 16) {
						var8 = 2;
					}

					if (var6 == 17) {
						var8 = 3;
					}

					if (var6 == 18) {
						var7 = NodeSub3.staticInt154 + (AbstractClass2Sub1.staticPlayer1.anInt628 >> 7);
					}

					if (var6 == 19) {
						var7 = (AbstractClass2Sub1.staticPlayer1.anInt591 >> 7) + Class34.staticInt75;
					}

					if (var6 == 20) {
						var7 = var13[var4++];
					}

					if (var8 == 0) {
						if (var5 == 0) {
							var3 += var7;
						}

						if (var5 == 1) {
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) {
							var3 /= var7;
						}

						if (var5 == 3) {
							var3 *= var7;
						}

						var5 = 0;
					} else {
						var5 = var8;
					}
				}
			} catch (Exception var141) {
				return -1;
			}
		} else {
			return -2;
		}
	}

}
