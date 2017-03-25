import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

public final class ProducingGraphicsBuffer extends AbstractGraphicsBuffer implements ImageProducer, ImageObserver {

	static int staticInt316;
	ColorModel aColorModel1;
	ImageConsumer anImageConsumer1;

	final void method278(int var1, int var2, Component var3) {
		anInt203 = var1;
		anInt204 = var2;
		anIntArray55 = new int[1 + var2 * var1];
		aColorModel1 = new DirectColorModel(32, 16711680, '\uff00', 255);
		anImage1 = var3.createImage(this);
		method401();
		var3.prepareImage(anImage1, this);
		method401();
		var3.prepareImage(anImage1, this);
		method401();
		var3.prepareImage(anImage1, this);
		method281();
	}

	public final void method279(Graphics var1, int var2, int var3) {
		method401();
		var1.drawImage(anImage1, var2, var3, this);
	}

	public boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5, int var6) {
		return true;
	}

	public synchronized void addConsumer(ImageConsumer var1) {
		anImageConsumer1 = var1;
		var1.setDimensions(anInt203, anInt204);
		var1.setProperties((Hashtable) null);
		var1.setColorModel(aColorModel1);
		var1.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer var1) {
		return var1 == anImageConsumer1;
	}

	public synchronized void removeConsumer(ImageConsumer var1) {
		if (anImageConsumer1 == var1) {
			anImageConsumer1 = null;
		}

	}

	public void startProduction(ImageConsumer var1) {
		addConsumer(var1);
	}

	public void requestTopDownLeftRightResend(ImageConsumer var1) {
	}

	synchronized void method401() {
		if (anImageConsumer1 != null) {
			anImageConsumer1.setPixels(0, 0, anInt203, anInt204, aColorModel1, anIntArray55, 0, anInt203);
			anImageConsumer1.imageComplete(2);
		}

	}

	synchronized void method402(int var1, int var2, int var3, int var4) {
		if (anImageConsumer1 != null) {
			anImageConsumer1.setPixels(var1, var2, var3, var4, aColorModel1, anIntArray55, var2 * anInt203 + var1,
					anInt203);
			anImageConsumer1.imageComplete(2);
		}

	}

	public final void method280(Graphics var1, int var2, int var3, int var4, int var5) {
		method402(var2, var3, var4, var5);
		Shape var6 = var1.getClip();
		var1.clipRect(var2, var3, var4, var5);
		var1.drawImage(anImage1, 0, 0, this);
		var1.setClip(var6);
	}

}
