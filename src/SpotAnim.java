public class SpotAnim extends Cacheable {

	int anInt554;
	static Js5Index staticJs5Index30;
	static Rasterizer2DSub3[] staticRasterizer2DSub3Array7;
	public static Cache staticCache30 = new Cache(64);
	public static Cache staticCache29 = new Cache(30);
	public int anInt556 = -1;
	int anInt553 = 128;
	int anInt558 = 128;
	int anInt559 = 0;
	int anInt560 = 0;
	int anInt557 = 0;
	int anInt555;
	short[] aShortArray19;
	short[] aShortArray21;
	short[] aShortArray20;
	short[] aShortArray18;

	void method547(ByteBuf var1) {
		while (true) {
			int var2 = var1.method367();
			if (var2 == 0) {
				return;
			}

			method549(var1, var2);
		}
	}

	public final Model method548(int var1) {
		Model var2 = (Model) staticCache29.get(anInt554);
		if (var2 == null) {
			RenderableSub3 var5 = Static.staticMethod434(staticJs5Index30, anInt555, 0);
			if (var5 == null) {
				return null;
			}

			int var4;
			if (aShortArray19 != null) {
				for (var4 = 0; var4 < aShortArray19.length; var4++) {
					var5.method585(aShortArray19[var4], aShortArray21[var4]);
				}
			}

			if (aShortArray20 != null) {
				for (var4 = 0; var4 < aShortArray20.length; var4++) {
					var5.method579(aShortArray20[var4], aShortArray18[var4]);
				}
			}

			var2 = var5.method583(anInt560 + 64, anInt557 + 850, -30, -50, -30);
			staticCache29.method170(var2, anInt554);
		}

		Model var51;
		if (anInt556 != -1 && var1 != -1) {
			var51 = Static.staticMethod210(anInt556).method552(var2, var1);
		} else {
			var51 = var2.method590(true);
		}

		if (anInt553 != 128 || anInt558 != 128) {
			var51.method599(anInt553, anInt558, anInt553);
		}

		if (anInt559 != 0) {
			if (anInt559 == 90) {
				var51.method607();
			}

			if (anInt559 == 180) {
				var51.method607();
				var51.method607();
			}

			if (anInt559 == 270) {
				var51.method607();
				var51.method607();
				var51.method607();
			}
		}

		return var51;
	}

	void method549(ByteBuf var1, int var2) {
		if (var2 == 1) {
			anInt555 = var1.method370();
		} else if (var2 == 2) {
			anInt556 = var1.method370();
		} else if (var2 == 4) {
			anInt553 = var1.method370();
		} else if (var2 == 5) {
			anInt558 = var1.method370();
		} else if (var2 == 6) {
			anInt559 = var1.method370();
		} else if (var2 == 7) {
			anInt560 = var1.method367();
		} else if (var2 == 8) {
			anInt557 = var1.method367();
		} else {
			int var3;
			int var4;
			if (var2 == 40) {
				var4 = var1.method367();
				aShortArray19 = new short[var4];
				aShortArray21 = new short[var4];

				for (var3 = 0; var3 < var4; var3++) {
					aShortArray19[var3] = (short) var1.method370();
					aShortArray21[var3] = (short) var1.method370();
				}
			} else if (var2 == 41) {
				var4 = var1.method367();
				aShortArray20 = new short[var4];
				aShortArray18 = new short[var4];

				for (var3 = 0; var3 < var4; var3++) {
					aShortArray20[var3] = (short) var1.method370();
					aShortArray18[var3] = (short) var1.method370();
				}
			}
		}

	}

}
