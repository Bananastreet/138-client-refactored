public class Permission implements Enumerable {

	static long staticLong7;
	public static final Permission PLAYER = new Permission(0, -1, true, false, true);
	public static final Permission PLAYER_MOD = new Permission(1, 0, true, true, true);
	public static final Permission JAGEX_MOD = new Permission(2, 1, true, true, false);
	public static final Permission IRONMAN = new Permission(3, 2, false, false, true);
	public static final Permission staticClass48_4 = new Permission(4, 3, false, false, true);
	public static final Permission staticClass48_5 = new Permission(5, 10, false, false, true);
	final int rights;
	public final int sprite;
	public final boolean aBool15;
	public final boolean aBool14;

	public int method12() {
		return rights;
	}

	Permission(int rights, int sprite, boolean var3, boolean var4, boolean var5) {		
		this.rights = rights;		
		this.sprite = sprite;		
		aBool15 = var4;
		aBool14 = var5;
	}

}
