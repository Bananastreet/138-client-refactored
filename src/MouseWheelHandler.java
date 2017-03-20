import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MouseWheelHandler extends AbstractClass1 implements MouseWheelListener {

	int anInt264 = 0;

	public void method166(Component var1) {
		var1.addMouseWheelListener(this);
	}

	public void method167(Component var1) {
		var1.removeMouseWheelListener(this);
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		anInt264 += var1.getWheelRotation();
	}

	public synchronized int method168() {
		int var1 = anInt264;
		anInt264 = 0;
		return var1;
	}

}
