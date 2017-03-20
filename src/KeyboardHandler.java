import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class KeyboardHandler implements KeyListener, FocusListener {

	protected static int staticInt83;
	static int staticInt84;
	static Task staticTask2;
	public static int staticInt85;
	static int staticInt78 = 0;
	static int staticInt80 = 0;
	public static KeyboardHandler staticKeyboardHandler1 = new KeyboardHandler();
	public static boolean[] staticBoolArray2 = new boolean[112];
	static int[] staticIntArray46 = new int[128];
	static int staticInt77 = 0;
	static char[] staticCharArray1 = new char[128];
	static int[] staticIntArray45 = new int[128];
	public static int[] staticIntArray48 = new int[128];
	public static int staticInt76 = 0;
	static int staticInt79 = 0;
	static int staticInt81 = 0;
	static volatile int staticInt82 = 0;
	static int[] staticIntArray47 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82,
			86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1,
			-1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51,
			52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228,
			231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
			-1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	public final synchronized void keyReleased(KeyEvent var1) {
		if (staticKeyboardHandler1 != null) {
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < staticIntArray47.length) {
				var2 = staticIntArray47[var2] & 0xffffff7f;
			} else {
				var2 = -1;
			}

			if (staticInt78 >= 0 && var2 >= 0) {
				staticIntArray46[staticInt78] = ~var2;
				staticInt78 = 1 + staticInt78 & 0x7f;
				if (staticInt78 == staticInt77) {
					staticInt78 = -1;
				}
			}
		}

		var1.consume();
	}

	public final synchronized void keyPressed(KeyEvent var1) {
		if (staticKeyboardHandler1 != null) {
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < staticIntArray47.length) {
				var2 = staticIntArray47[var2];
				if ((var2 & 0x80) != 0) {
					var2 = -1;
				}
			} else {
				var2 = -1;
			}

			if (staticInt78 >= 0 && var2 >= 0) {
				staticIntArray46[staticInt78] = var2;
				staticInt78 = 1 + staticInt78 & 0x7f;
				if (staticInt78 == staticInt77) {
					staticInt78 = -1;
				}
			}

			int var3;
			if (var2 >= 0) {
				var3 = staticInt80 + 1 & 0x7f;
				if (staticInt79 != var3) {
					staticIntArray45[staticInt80] = var2;
					staticCharArray1[staticInt80] = 0;
					staticInt80 = var3;
				}
			}

			var3 = var1.getModifiers();
			if ((var3 & 0xa) != 0 || var2 == 85 || var2 == 10) {
				var1.consume();
			}
		}

	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (staticKeyboardHandler1 != null) {
			staticInt78 = -1;
		}

	}

	public final void keyTyped(KeyEvent var1) {
		if (staticKeyboardHandler1 != null) {
			char var2 = var1.getKeyChar();
			if (var2 != 0 && var2 != '\uffff' && Static.staticMethod200(var2)) {
				int var3 = staticInt80 + 1 & 0x7f;
				if (var3 != staticInt79) {
					staticIntArray45[staticInt80] = -1;
					staticCharArray1[staticInt80] = var2;
					staticInt80 = var3;
				}
			}
		}

		var1.consume();
	}

	public final void focusGained(FocusEvent var1) {
	}

}
