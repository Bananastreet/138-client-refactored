public abstract class Entity extends Cacheable {

	public int anInt421 = 1000;

	protected Model method434() {
		return null;
	}

	void method435(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		Model var10 = method434();
		if (var10 != null) {
			anInt421 = var10.anInt421 * 1;
			var10.method435(var1, var2, var3, var4, var5, var6, var7, var8, var9);
		}

	}

}
