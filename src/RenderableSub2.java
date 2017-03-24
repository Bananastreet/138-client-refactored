public final class RenderableSub2 extends Entity {

	static Rasterizer2DSub3[] staticRasterizer2DSub3Array8;
	protected static String staticString35;
	static Js5IndexImpl staticJs5IndexImpl16;
	int anInt641 = 0;
	int anInt635 = 0;
	boolean aBool78 = false;
	int anInt640;
	int anInt637;
	int anInt638;
	int anInt639;
	int anInt642;
	int anInt636;
	AnimationDefintion anAnimDef2;

	final void method568(int var1) {
		if (!aBool78) {
			anInt641 += var1;

			while (anInt641 > anAnimDef2.anIntArray119[anInt635]) {
				anInt641 -= anAnimDef2.anIntArray119[anInt635];
				++anInt635;
				if (anInt635 >= anAnimDef2.anIntArray121.length) {
					aBool78 = true;
					break;
				}
			}
		}

	}

	protected final Model method434() {
		SpotAnim var1 = Static.staticMethod322(anInt640);
		Model var2;
		if (!aBool78) {
			var2 = var1.method548(anInt635);
		} else {
			var2 = var1.method548(-1);
		}

		return var2 == null ? null : var2;
	}

	RenderableSub2(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		anInt640 = var1;
		anInt637 = var2;
		anInt638 = var3;
		anInt639 = var4;
		anInt642 = var5;
		anInt636 = var6 + var7;
		int var8 = Static.staticMethod322(anInt640).anInt556;
		if (var8 != -1) {
			aBool78 = false;
			anAnimDef2 = Static.staticMethod210(var8);
		} else {
			aBool78 = true;
		}

	}

}
