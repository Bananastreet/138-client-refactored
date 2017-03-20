public class AbstractClass3Sub1 extends AbstractClass3 {

	static Js5IndexImpl staticJs5IndexImpl10;
	static Rasterizer2DSub3[] staticRasterizer2DSub3Array6;
	int anInt249 = 256;
	int anInt250 = 1;
	long aLong18 = Static.staticMethod297();
	int anInt252;
	int anInt251 = 0;
	long[] aLongArray1 = new long[10];

	int method215(int var1, int var2) {
		int var3 = anInt249;
		int var4 = anInt250;
		anInt249 = 300;
		anInt250 = 1;
		aLong18 = Static.staticMethod297();
		if (aLongArray1[anInt252] == 0L) {
			anInt249 = var3;
			anInt250 = var4;
		} else if (aLong18 > aLongArray1[anInt252]) {
			anInt249 = (int) (var1 * 2560 / (aLong18 - aLongArray1[anInt252]));
		}

		if (anInt249 < 25) {
			anInt249 = 25;
		}

		if (anInt249 > 256) {
			anInt249 = 256;
			anInt250 = (int) (var1 - (aLong18 - aLongArray1[anInt252]) / 10L);
		}

		if (anInt250 > var1) {
			anInt250 = var1;
		}

		aLongArray1[anInt252] = aLong18;
		anInt252 = (anInt252 + 1) % 10;
		int var5;
		if (anInt250 > 1) {
			for (var5 = 0; var5 < 10; var5++) {
				if (aLongArray1[var5] != 0L) {
					aLongArray1[var5] += anInt250;
				}
			}
		}

		if (anInt250 < var2) {
			anInt250 = var2;
		}

		Static.staticMethod303(anInt250);

		for (var5 = 0; anInt251 < 256; anInt251 += anInt249) {
			++var5;
		}

		anInt251 &= 255;
		return var5;
	}

	public void method214() {
		for (int var1 = 0; var1 < 10; var1++) {
			aLongArray1[var1] = 0L;
		}

	}

	AbstractClass3Sub1() {
		for (int var1 = 0; var1 < 10; var1++) {
			aLongArray1[var1] = aLong18;
		}

	}

}
