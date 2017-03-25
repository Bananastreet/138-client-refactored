import java.awt.Font;

//TODO this is an enumerated type
public class EnumerableSub3 implements Enumerable {

	protected static Font staticFont1;
	static int staticInt71;
	public static final EnumerableSub3 staticClass28_2 = new EnumerableSub3(0, 0);
	public static final EnumerableSub3 staticClass28_3 = new EnumerableSub3(2, 1);
	public static final EnumerableSub3 staticClass28_4 = new EnumerableSub3(3, 2);
	public static final EnumerableSub3 staticClass28_5 = new EnumerableSub3(1, 3);
	public final int type;	
	final int anInt83;

	public int ordinal() {
		return anInt83;
	}

	EnumerableSub3(int var1, int var2) {
		type = var1;
		anInt83 = var2;
	}

}
