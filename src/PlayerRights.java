public class PlayerRights implements Enumerable {

	static long staticLong7;
	public static final PlayerRights PLAYER = new PlayerRights(0, -1, true, false, true);
	public static final PlayerRights PLAYER_MOD = new PlayerRights(1, 0, true, true, true);
	public static final PlayerRights JAGEX_MOD = new PlayerRights(2, 1, true, true, false);
	public static final PlayerRights IRONMAN = new PlayerRights(3, 2, false, false, true);
	public static final PlayerRights staticClass48_4 = new PlayerRights(4, 3, false, false, true);
	public static final PlayerRights staticClass48_5 = new PlayerRights(5, 10, false, false, true);
	final int rights;
	public final int sprite;
	public final boolean aBool15;
	public final boolean aBool14;

	public int ordinal() {
		return rights;
	}

	PlayerRights(int rights, int sprite, boolean var3, boolean var4, boolean var5) {		
		this.rights = rights;		
		this.sprite = sprite;		
		aBool15 = var4;
		aBool14 = var5;
	}

}
