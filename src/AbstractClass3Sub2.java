public class AbstractClass3Sub2 extends AbstractClass3 {

	long aLong19 = System.nanoTime();

	int method215(int var1, int var2) {
		long var3 = var2 * 1000000L;
		long var6 = aLong19 - System.nanoTime();
		if (var6 < var3) {
			var6 = var3;
		}

		Static.staticMethod303(var6 / 1000000L);
		long var8 = System.nanoTime();

		int var5;
		for (var5 = 0; var5 < 10 && (var5 < 1 || aLong19 < var8); aLong19 += var1 * 1000000L) {
			++var5;
		}

		if (aLong19 < var8) {
			aLong19 = var8;
		}

		return var5;
	}

	public void method214() {
		aLong19 = System.nanoTime();
	}

}
