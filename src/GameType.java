public class GameType implements Enumerable {

	public static MusicFile staticNodeSub11_1;
	static final GameType staticGameType3 = new GameType("runescape", "RuneScape", 0);
	static final GameType staticGameType2 = new GameType("stellardawn", "Stellar Dawn", 1);
	static final GameType staticGameType4 = new GameType("game3", "Game 3", 2);
	static final GameType staticGameType1 = new GameType("game4", "Game 4", 3);
	static final GameType staticGameType5 = new GameType("game5", "Game 5", 4);
	public static final GameType staticGameType6 = new GameType("oldscape", "RuneScape 2007", 5);
	public final String aString9;
	final int anInt197;

	GameType(String var1, String var2, int var3) {
		aString9 = var1;
		anInt197 = var3;
	}

	public int ordinal() {
		return anInt197;
	}

}
