public abstract class NodeSub8 extends Node {

	NodeSub6 aNodeSub6_1;
	int anInt243;
	NodeSub8 aNodeSub8_2;
	volatile boolean aBool24 = true;

	int method301() {
		return 255;
	}

	protected abstract NodeSub8 method302();

	protected abstract NodeSub8 method303();

	protected abstract int method304();

	protected abstract void method305(int var1);

	protected abstract void method306(int[] var1, int var2, int var3);

	final void method307(int[] var1, int var2, int var3) {
		if (aBool24) {
			method306(var1, var2, var3);
		} else {
			method305(var3);
		}

	}

}
