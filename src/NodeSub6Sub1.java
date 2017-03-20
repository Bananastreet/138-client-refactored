public class NodeSub6Sub1 extends NodeSub6 {

	public int anInt420;
	public byte[] aByteArray23;
	public int anInt418;
	int anInt419;
	public boolean aBool52;

	NodeSub6Sub1(int var1, byte[] var2, int var3, int var4, boolean var5) {
		anInt420 = var1;
		aByteArray23 = var2;
		anInt418 = var3;
		anInt419 = var4;
		aBool52 = var5;
	}

	NodeSub6Sub1(int var1, byte[] var2, int var3, int var4) {
		anInt420 = var1;
		aByteArray23 = var2;
		anInt418 = var3;
		anInt419 = var4;
	}

	public NodeSub6Sub1 method433(Class20 var1) {
		aByteArray23 = var1.method80(aByteArray23);
		anInt420 = var1.method81(anInt420);
		if (anInt418 == anInt419) {
			anInt418 = anInt419 = var1.method82(anInt418);
		} else {
			anInt418 = var1.method82(anInt418);
			anInt419 = var1.method82(anInt419);
			if (anInt418 == anInt419) {
				--anInt418;
			}
		}

		return this;
	}

}
