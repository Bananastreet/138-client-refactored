import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

public abstract class GameShell extends Applet implements Runnable, FocusListener, WindowListener {

	static int staticInt103 = 0;
	static GameShell staticGameShell1 = null;
	public static volatile boolean staticBool14 = true;
	protected static volatile boolean staticBool11 = false;
	static volatile long staticLong4 = 0L;
	static int staticInt108 = 500;
	protected static int staticInt107 = 0;
	static long staticLong3 = 0L;
	static volatile boolean staticBool12 = true;
	static boolean staticBool13 = false;
	static int staticInt104 = 20;
	static int staticInt105 = 1;
	protected static long[] staticLongArray1 = new long[32];
	protected static long[] staticLongArray2 = new long[32];
	protected static int staticInt106 = 0;
	protected static int staticInt109 = 0;
	protected static boolean staticBool15 = false;
	boolean aBool13 = false;

	protected final void method200(int var1, int var2, int var3) {
		try {
			if (staticGameShell1 != null) {
				++staticInt103;
				if (staticInt103 >= 3) {
					method205("alreadyloaded");
					return;
				}

				getAppletContext().showDocument(getDocumentBase(), "_self");
				return;
			}

			staticGameShell1 = this;
			Static.gameWidth = var1;
			Class47.gameHeight = var2;
			RuntimeExceptionSub1.staticInt74 = var3;
			RuntimeExceptionSub1.staticApplet1 = this;
			if (BufferedFile.staticTaskManager1 == null) {
				BufferedFile.staticTaskManager1 = new TaskManager();
			}

			BufferedFile.staticTaskManager1.method94(this, 1);
		} catch (Exception var5) {
			Static.staticMethod285((String) null, var5);
			method205("crash");
		}

	}

	protected final synchronized void method201() {
		Container var1 = method207();
		if (Class38.staticCanvas1 != null) {
			Class38.staticCanvas1.removeFocusListener(this);
			var1.remove(Class38.staticCanvas1);
		}

		Static.gameWidth = Math.max(var1.getWidth(), Static.staticInt123 * 179870289);
		Class47.gameHeight = Math.max(var1.getHeight(), KeyboardHandler.staticInt83 * 1562169393);
		Insets var2;
		if (Class40Sub1.staticFrame1 != null) {
			var2 = Class40Sub1.staticFrame1.getInsets();
			Static.gameWidth -= var2.left + var2.right;
			Class47.gameHeight -= var2.top + var2.bottom;
		}

		Class38.staticCanvas1 = new GameCanvas(this);
		var1.add(Class38.staticCanvas1);
		Class38.staticCanvas1.setSize(Static.gameWidth, Class47.gameHeight);
		Class38.staticCanvas1.setVisible(true);
		if (Class40Sub1.staticFrame1 == var1) {
			var2 = Class40Sub1.staticFrame1.getInsets();
			Class38.staticCanvas1.setLocation(var2.left + staticInt106, var2.top + staticInt109);
		} else {
			Class38.staticCanvas1.setLocation(staticInt106, staticInt109);
		}

		Class38.staticCanvas1.addFocusListener(this);
		Class38.staticCanvas1.requestFocus();
		staticBool14 = true;
		AbstractGraphicsBuffer var3 = Static.staticMethod390(Static.gameWidth, Class47.gameHeight, Class38.staticCanvas1);
		if (CacheableSub2.staticGraphicsBuffer1 != null) {
			CacheableSub2.staticGraphicsBuffer1.method279(var3.anImage1.getGraphics(), 0, 0);
		}

		CacheableSub2.staticGraphicsBuffer1 = var3;
		staticBool11 = false;
		staticLong4 = Static.staticMethod297();
	}

	protected final boolean method202() {
		String var1 = getDocumentBase().getHost().toLowerCase();
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
				if (!var1.equals("mechscape.com") && !var1.endsWith(".mechscape.com")) {
					if (var1.endsWith("127.0.0.1")) {
						return true;
					} else {
						while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= 48
								&& var1.charAt(var1.length() - 1) <= 57) {
							var1 = var1.substring(0, var1.length() - 1);
						}

						if (var1.endsWith("192.168.1.")) {
							return true;
						} else {
							method205("invalidhost");
							return false;
						}
					}
				} else {
					return true;
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	void method203() {
		Container var1 = method207();
		long var5 = Static.staticMethod297();
		long var2 = staticLongArray1[BitBuf.staticInt321];
		staticLongArray1[BitBuf.staticInt321] = var5;
		BitBuf.staticInt321 = 1 + BitBuf.staticInt321 & 0x1f;
		if (var2 != 0L && var5 > var2) {
			int var7 = (int) (var5 - var2);
			staticInt107 = ((var7 >> 1) + 32000) / var7;
		}

		if (++staticInt108 - 1 > 50) {
			staticInt108 -= 50;
			staticBool14 = true;
			Class38.staticCanvas1.setSize(Static.gameWidth, Class47.gameHeight);
			Class38.staticCanvas1.setVisible(true);
			if (Class40Sub1.staticFrame1 == var1) {
				Insets var71 = Class40Sub1.staticFrame1.getInsets();
				Class38.staticCanvas1.setLocation(staticInt106 + var71.left, var71.top + staticInt109);
			} else {
				Class38.staticCanvas1.setLocation(staticInt106, staticInt109);
			}
		}

		method211();
	}

	public void stop() {
		if (this == staticGameShell1 && !staticBool13) {
			staticLong3 = Static.staticMethod297() + 4000L;
		}

	}

	public final void update(Graphics var1) {
		paint(var1);
	}

	public final void focusLost(FocusEvent var1) {
		staticBool12 = false;
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		destroy();
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public void start() {
		if (this == staticGameShell1 && !staticBool13) {
			staticLong3 = 0L;
		}

	}

	protected abstract void method204();

	protected void method205(String var1) {
		if (!aBool13) {
			aBool13 = true;
			System.out.println("error_game_" + var1);

			try {
				getAppletContext().showDocument(new URL(getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
			} catch (Exception var3) {
				;
			}
		}

	}

	protected abstract void method206();

	protected Container method207() {
		return Class40Sub1.staticFrame1 != null ? Class40Sub1.staticFrame1 : this;
	}

	public abstract void init();

	protected abstract void method208();

	final synchronized void method209() {
		if (!staticBool13) {
			staticBool13 = true;

			try {
				Class38.staticCanvas1.removeFocusListener(this);
			} catch (Exception var5) {
				;
			}

			try {
				method206();
			} catch (Exception var4) {
				;
			}

			if (Class40Sub1.staticFrame1 != null) {
				try {
					System.exit(0);
				} catch (Throwable var3) {
					;
				}
			}

			if (BufferedFile.staticTaskManager1 != null) {
				try {
					BufferedFile.staticTaskManager1.method91();
				} catch (Exception var2) {
					;
				}
			}

			method213();
		}

	}

	public final void focusGained(FocusEvent var1) {
		staticBool12 = true;
		staticBool14 = true;
	}

	void method210() {
		long var1 = Static.staticMethod297();
		long var3 = staticLongArray2[Class51.staticInt140];
		staticLongArray2[Class51.staticInt140] = var1;
		Class51.staticInt140 = 1 + Class51.staticInt140 & 0x1f;
		if (var3 != 0L && var1 > var3) {
			;
		}

		synchronized (this) {
			RuntimeExceptionSub1.staticBool9 = staticBool12;
		}

		method204();
	}

	public void run() {
		try {
			int var6;
			if (TaskManager.staticString19 != null) {
				String var8 = TaskManager.staticString19.toLowerCase();
				if (var8.indexOf("sun") != -1 || var8.indexOf("apple") != -1) {
					String var9 = TaskManager.staticString20;
					if (var9.equals("1.1") || var9.startsWith("1.1.") || var9.equals("1.2") || var9.startsWith("1.2.")
							|| var9.equals("1.3") || var9.startsWith("1.3.") || var9.equals("1.4")
							|| var9.startsWith("1.4.") || var9.equals("1.5") || var9.startsWith("1.5.")
							|| var9.equals("1.6.0")) {
						method205("wrongjava");
						return;
					}

					if (var9.startsWith("1.6.0_")) {
						for (var6 = 6; var6 < var9.length(); var6++) {
							char var7 = var9.charAt(var6);
							boolean var5 = var7 >= 48 && var7 <= 57;
							if (!var5) {
								break;
							}
						}

						String var91 = var9.substring(6, var6);
						if (Static.staticMethod306(var91) && Static.staticMethod388(var91) < 10) {
							method205("wrongjava");
							return;
						}
					}

					staticInt105 = 5;
				}
			}

			setFocusCycleRoot(true);
			method201();
			method208();
			Static.staticAbstractClass3_1 = Static.staticMethod350();

			label80: while (true) {
				TaskManager var71;
				Canvas var81;
				do {
					if (staticLong3 != 0L && Static.staticMethod297() >= staticLong3) {
						break label80;
					}

					DataClass1.staticInt33 = Static.staticAbstractClass3_1.method215(staticInt104, staticInt105);

					for (int var10 = 0; var10 < DataClass1.staticInt33; var10++) {
						method210();
					}

					method203();
					var71 = BufferedFile.staticTaskManager1;
					var81 = Class38.staticCanvas1;
				} while (var71.anEventQueue1 == null);

				for (var6 = 0; var6 < 50 && var71.anEventQueue1.peekEvent() != null; var6++) {
					Static.staticMethod303(1L);
				}

				if (var81 != null) {
					var71.anEventQueue1.postEvent(new ActionEvent(var81, 1001, "dummy"));
				}
			}
		} catch (Exception var61) {
			Static.staticMethod285((String) null, var61);
			method205("crash");
		}

		method209();
	}

	protected abstract void method211();

	public final void windowIconified(WindowEvent var1) {
	}

	protected Dimension method212() {
		Container var1 = method207();
		int var2 = Math.max(var1.getWidth(), Static.staticInt123 * 179870289);
		int var3 = Math.max(var1.getHeight(), KeyboardHandler.staticInt83 * 1562169393);
		if (Class40Sub1.staticFrame1 != null) {
			Insets var4 = Class40Sub1.staticFrame1.getInsets();
			var2 -= var4.right + var4.left;
			var3 -= var4.bottom + var4.top;
		}

		return new Dimension(var2, var3);
	}

	public void destroy() {
		if (staticGameShell1 == this && !staticBool13) {
			staticLong3 = Static.staticMethod297();
			Static.staticMethod303(5000L);
			method209();
		}

	}

	protected abstract void method213();

	public final synchronized void paint(Graphics var1) {
		if (this == staticGameShell1 && !staticBool13) {
			staticBool14 = true;
			if (TaskManager.staticString20 != null && TaskManager.staticString20.startsWith("1.5")
					&& Static.staticMethod297() - staticLong4 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= Static.gameWidth && var2.height >= Class47.gameHeight) {
					staticBool11 = true;
				}
			}
		}

	}

}
