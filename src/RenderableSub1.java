public final class RenderableSub1 extends Renderable {

	boolean aBool73 = false;
	double aDouble9;
	double aDouble3;
	double aDouble6;
	double aDouble2;
	int anInt577;
	int anInt588;
	int anInt579 = 0;
	int anInt589 = 0;
	int anInt586;
	int anInt575;
	int anInt576;
	int anInt587;
	int anInt585;
	int anInt578;
	int anInt580;
	int anInt581;
	int anInt582;
	int anInt583;
	int anInt584;
	AnimationDefintion anAnimDef1;
	double aDouble4;
	double aDouble5;
	double aDouble8;
	double aDouble7;

	final void method561(int var1) {
		aBool73 = true;
		aDouble9 += var1 * aDouble4;
		aDouble3 += aDouble5 * var1;
		aDouble6 += 0.5D * aDouble7 * var1 * var1 + var1 * aDouble2;
		aDouble2 += var1 * aDouble7;
		anInt577 = (int) (Math.atan2(aDouble4, aDouble5) * 325.949D) + 1024 & 0x7ff;
		anInt588 = (int) (Math.atan2(aDouble2, aDouble8) * 325.949D) & 0x7ff;
		if (anAnimDef1 != null) {
			anInt579 += var1;

			while (true) {
				do {
					do {
						if (anInt579 <= anAnimDef1.anIntArray119[anInt589]) {
							return;
						}

						anInt579 -= anAnimDef1.anIntArray119[anInt589];
						++anInt589;
					} while (anInt589 < anAnimDef1.anIntArray121.length);

					anInt589 -= anAnimDef1.anInt562;
				} while (anInt589 >= 0 && anInt589 < anAnimDef1.anIntArray121.length);

				anInt589 = 0;
			}
		}
	}

	RenderableSub1(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10,
			int var11) {
		anInt586 = var1;
		anInt575 = var2;
		anInt576 = var3;
		anInt587 = var4;
		anInt585 = var5;
		anInt578 = var6;
		anInt580 = var7;
		anInt581 = var8;
		anInt582 = var9;
		anInt583 = var10;
		anInt584 = var11;
		aBool73 = false;
		int var12 = Static.staticMethod322(anInt586).anInt556;
		if (var12 != -1) {
			anAnimDef1 = Static.staticMethod210(var12);
		} else {
			anAnimDef1 = null;
		}

	}

	final void method562(int var1, int var2, int var3, int var4) {
		double var9;
		if (!aBool73) {
			var9 = var1 - anInt576;
			double var5 = var2 - anInt587;
			double var7 = Math.sqrt(var9 * var9 + var5 * var5);
			aDouble9 = anInt576 + anInt582 * var9 / var7;
			aDouble3 = anInt587 + anInt582 * var5 / var7;
			aDouble6 = anInt585;
		}

		var9 = anInt580 + 1 - var4;
		aDouble4 = (var1 - aDouble9) / var9;
		aDouble5 = (var2 - aDouble3) / var9;
		aDouble8 = Math.sqrt(aDouble5 * aDouble5 + aDouble4 * aDouble4);
		if (!aBool73) {
			aDouble2 = -aDouble8 * Math.tan(0.02454369D * anInt581);
		}

		aDouble7 = (var3 - aDouble6 - var9 * aDouble2) * 2.0D / (var9 * var9);
	}

	protected final Model method434() {
		SpotAnim var1 = Static.staticMethod322(anInt586);
		Model var2 = var1.method548(anInt589);
		if (var2 == null) {
			return null;
		} else {
			var2.method598(anInt588);
			return var2;
		}
	}

}
