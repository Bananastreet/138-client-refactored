public class CacheableSub3 extends Cacheable {

	public static short[] staticShortArray5;
	public static boolean staticBool45;
	public final int anInt426;
	public final int anInt427;
	public final int[] anIntArray102;
	public final int[] anIntArray101;

	public boolean method470(int var1, int var2) {
		if (var2 >= 0 && var2 < anIntArray101.length) {
			int var3 = anIntArray101[var2];
			if (var1 >= var3 && var1 <= anIntArray102[var2] + var3) {
				return true;
			}
		}

		return false;
	}

	CacheableSub3(int var1, int var2, int[] var3, int[] var4, int var5) {
		anInt426 = var1;
		anInt427 = var2;
		anIntArray102 = var3;
		anIntArray101 = var4;
	}

}
