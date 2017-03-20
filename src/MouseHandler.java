import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {

	public static volatile int staticInt89 = 0;
	static volatile int staticInt92 = 0;
	static volatile int staticInt97 = 0;
	static volatile long staticLong1 = 0L;
	static volatile int staticInt95 = 0;
	static volatile int staticInt90 = 0;
	static volatile int staticInt91 = -1;
	static volatile int staticInt96 = -1;
	public static MouseHandler staticMouseHandler1 = new MouseHandler();
	public static int staticInt93 = 0;
	public static int staticInt94 = 0;
	public static int staticInt88 = 0;
	public static int staticInt98 = 0;
	public static int staticInt99 = 0;
	public static int staticInt100 = 0;
	public static long staticLong2 = 0L;

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void mousePressed(MouseEvent var1) {
		if (staticMouseHandler1 != null) {
			staticInt89 = 0;
			staticInt92 = var1.getX();
			staticInt97 = var1.getY();
			staticLong1 = Static.staticMethod297();
			if (var1.isAltDown()) {
				staticInt95 = 4;
				staticInt90 = 1147573100;
			} else if (var1.isMetaDown()) {
				staticInt95 = 2;
				staticInt90 = -1573697098;
			} else {
				staticInt95 = 1;
				staticInt90 = 1360635099;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (staticMouseHandler1 != null) {
			staticInt89 = 0;
			staticInt90 = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseExited(MouseEvent var1) {
		if (staticMouseHandler1 != null) {
			staticInt89 = 0;
			staticInt91 = -1;
			staticInt96 = -1;
		}

	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		if (staticMouseHandler1 != null) {
			staticInt89 = 0;
			staticInt91 = var1.getX();
			staticInt96 = var1.getY();
		}

	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (staticMouseHandler1 != null) {
			staticInt89 = 0;
			staticInt91 = var1.getX();
			staticInt96 = var1.getY();
		}

	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (staticMouseHandler1 != null) {
			staticInt90 = 0;
		}

	}

	public final synchronized void mouseEntered(MouseEvent var1) {
		if (staticMouseHandler1 != null) {
			staticInt89 = 0;
			staticInt91 = var1.getX();
			staticInt96 = var1.getY();
		}

	}

}
