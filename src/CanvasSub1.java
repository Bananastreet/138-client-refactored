import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class CanvasSub1 extends Canvas {

	static Js5IndexImpl staticJs5IndexImpl5;
	static byte[][] staticByteArrayArray2;
	Component aComponent1;

	CanvasSub1(Component var1) {
		aComponent1 = var1;
	}

	public final void paint(Graphics var1) {
		aComponent1.paint(var1);
	}

	public final void update(Graphics var1) {
		aComponent1.update(var1);
	}

}
