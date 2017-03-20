public class MouseCapturer implements Runnable {

	public static int staticInt145;
	int anInt211 = 0;
	boolean aBool21 = true;
	Object anObject3 = new Object();
	int[] anIntArray57 = new int[500];
	int[] anIntArray58 = new int[500];

	public void run() {
		for (; aBool21; Static.staticMethod303(50L)) {
			synchronized (anObject3) {
				if (anInt211 < 500) {
					anIntArray57[anInt211] = MouseHandler.staticInt94;
					anIntArray58[anInt211] = MouseHandler.staticInt88;
					++anInt211;
				}
			}
		}

	}

}
