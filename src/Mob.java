public abstract class Mob extends Entity {

	int anInt591;
	int anInt592;
	boolean aBool75;
	int anInt604;
	int anInt606;
	int anInt617;
	int anInt619;
	int anInt620;
	int anInt623;
	int anInt624;
	int anInt625;
	int anInt627;
	int anInt628;
	int anInt630;
	static Sprite staticSprite5;
	byte aByte5 = 0;
	boolean aBool74 = false;
	int anInt626 = 1;
	int anInt594 = -1;
	int anInt634 = -1;
	int anInt595 = 1;
	int anInt621 = -1;
	int anInt597 = -1;
	int anInt598 = -1;
	int anInt622 = -1;
	int anInt607 = -1;
	String aString39 = null;
	boolean aBool77 = false;
	int anInt601 = 100;
	int anInt602 = 0;
	int anInt603 = 0;
	int[] anIntArray123 = new int[4];
	int[] anIntArray124 = new int[4];
	int[] anIntArray126 = new int[4];
	int[] anIntArray128 = new int[4];
	int[] anIntArray125 = new int[4];
	Class36 aClass36_3 = new Class36();
	int anInt600 = -1;
	boolean aBool76 = false;
	int anInt608 = -1;
	int anInt590 = -1;
	int anInt610 = 0;
	int anInt611 = 0;
	int anInt612 = -1;
	int anInt613 = 0;
	int anInt614 = 0;
	int anInt615 = 0;
	int anInt593 = 0;
	int anInt596 = -1;
	int anInt616 = 0;
	int anInt618 = 0;
	int anInt605 = 0;
	int anInt609 = 200;
	int anInt629 = 0;
	int anInt631 = 32;
	int anInt632 = 0;
	int[] anIntArray127 = new int[10];
	int[] anIntArray122 = new int[10];
	byte[] aByteArray24 = new byte[10];
	int anInt633 = 0;
	int anInt599 = 0;

	final void method563(int var1) {
		CacheableSub6 var2 = Static.staticMethod387(var1);

		for (NodeSub3 var3 = (NodeSub3) aClass36_3.method160(); var3 != null; var3 = (NodeSub3) aClass36_3
				.method164()) {
			if (var3.aCacheableSub6_1 == var2) {
				var3.method174();
				return;
			}
		}

	}

	final void method564(int var1, int var2, int var3, int var4, int var5, int var6) {
		CacheableSub6 var7 = Static.staticMethod387(var1);
		NodeSub3 var11 = null;
		NodeSub3 var9 = null;
		int var12 = var7.anInt515;
		int var10 = 0;

		NodeSub3 var8;
		for (var8 = (NodeSub3) aClass36_3.method160(); var8 != null; var8 = (NodeSub3) aClass36_3.method164()) {
			++var10;
			if (var7.anInt518 * -545515971 == var8.aCacheableSub6_1.anInt518 * -545515971) {
				var8.method292(var2 + var4, var5, var6, var3);
				return;
			}

			if (var8.aCacheableSub6_1.anInt514 <= var7.anInt514) {
				var11 = var8;
			}

			if (var8.aCacheableSub6_1.anInt515 > var12) {
				var9 = var8;
				var12 = var8.aCacheableSub6_1.anInt515;
			}
		}

		if (var9 != null || var10 < 4) {
			var8 = new NodeSub3(var7);
			if (var11 == null) {
				aClass36_3.method163(var8);
			} else {
				Static.staticMethod122(var8, var11);
			}

			var8.method292(var4 + var2, var5, var6, var3);
			if (var10 >= 4) {
				var9.method174();
			}
		}

	}

	boolean method565() {
		return false;
	}

	final void method566(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		boolean var13 = true;

		int var9;
		for (var9 = 0; var9 < 4; var9++) {
			if (anIntArray126[var9] > var5) {
				var7 = false;
			} else {
				var13 = false;
			}
		}

		var9 = -1;
		int var10 = -1;
		int var11 = 0;
		if (var1 >= 0) {
			CacheableSub5 var14 = Static.staticMethod197(var1);
			var10 = var14.anInt479;
			var11 = var14.anInt473;
		}

		int var141;
		if (var13) {
			if (var10 == -1) {
				return;
			}

			var9 = 0;
			var141 = 0;
			if (var10 == 0) {
				var141 = anIntArray126[0];
			} else if (var10 == 1) {
				var141 = anIntArray124[0];
			}

			for (int var15 = 1; var15 < 4; var15++) {
				if (var10 == 0) {
					if (anIntArray126[var15] < var141) {
						var9 = var15;
						var141 = anIntArray126[var15];
					}
				} else if (var10 == 1 && anIntArray124[var15] < var141) {
					var9 = var15;
					var141 = anIntArray124[var15];
				}
			}

			if (var10 == 1 && var141 >= var2) {
				return;
			}
		} else {
			if (var7) {
				aByte5 = 0;
			}

			for (var141 = 0; var141 < 4; var141++) {
				byte var151 = aByte5;
				aByte5 = (byte) ((aByte5 + 1) % 4);
				if (anIntArray126[var151] <= var5) {
					var9 = var151;
					break;
				}
			}
		}

		if (var9 >= 0) {
			anIntArray123[var9] = var1;
			anIntArray124[var9] = var2;
			anIntArray128[var9] = var3;
			anIntArray125[var9] = var4;
			anIntArray126[var9] = var5 + var11 + var6;
		}

	}

	final void method567() {
		anInt632 = 0;
		anInt599 = 0;
	}

}
