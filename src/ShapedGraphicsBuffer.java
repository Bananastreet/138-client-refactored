import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class ShapedGraphicsBuffer extends GraphicsBuffer {

	Component aComponent2;

	final void method278(int var1, int var2, Component var3) {
		anInt203 = var1;
		anInt204 = var2;
		anIntArray55 = new int[var1 * var2 + 1];
		DataBufferInt var5 = new DataBufferInt(anIntArray55, anIntArray55.length);
		DirectColorModel var4 = new DirectColorModel(32, 16711680, '\uff00', 255);
		WritableRaster var6 = Raster.createWritableRaster(var4.createCompatibleSampleModel(anInt203, anInt204), var5,
				(Point) null);
		anImage1 = new BufferedImage(var4, var6, false, new Hashtable());
		aComponent2 = var3;
		method281();
	}

	public final void method279(Graphics var1, int var2, int var3) {
		var1.drawImage(anImage1, var2, var3, aComponent2);
	}

	public final void method280(Graphics var1, int var2, int var3, int var4, int var5) {
		Shape var6 = var1.getClip();
		var1.clipRect(var2, var3, var4, var5);
		var1.drawImage(anImage1, 0, 0, aComponent2);
		var1.setClip(var6);
	}

}
