public class Class11 implements Interface2 {

	static Widget[] staticWidgetArray1;
	int anInt23 = 0;
	double aDouble1 = 1.0D;
	Class39 aClass39_1 = new Class39();
	int anInt24 = 128;
	AbstractFileStore aJs5Index3;
	int anInt22;
	NodeSub9[] aNodeSub9Array1;

	public int[] method32(int var1) {
		NodeSub9 var2 = aNodeSub9Array1[var1];
		if (var2 != null) {
			if (var2.anIntArray61 != null) {
				aClass39_1.method192(var2);
				var2.aBool25 = true;
				return var2.anIntArray61;
			}

			boolean var4 = var2.method308(aDouble1, anInt24, aJs5Index3);
			if (var4) {
				if (anInt23 == 0) {
					NodeSub9 var3 = (NodeSub9) aClass39_1.method199();
					var3.method309();
				} else {
					--anInt23;
				}

				aClass39_1.method192(var2);
				var2.aBool25 = true;
				return var2.anIntArray61;
			}
		}

		return null;
	}

	public void method33(double var1) {
		aDouble1 = var1;
		method35();
	}

	public int method34(int var1) {
		return aNodeSub9Array1[var1] != null ? aNodeSub9Array1[var1].anInt244 : 0;
	}

	public void method35() {
		for (int var1 = 0; var1 < aNodeSub9Array1.length; var1++) {
			if (aNodeSub9Array1[var1] != null) {
				aNodeSub9Array1[var1].method309();
			}
		}

		aClass39_1 = new Class39();
		anInt23 = anInt22 * -79300955;
	}

	public void method36(int var1) {
		for (int var2 = 0; var2 < aNodeSub9Array1.length; var2++) {
			NodeSub9 var3 = aNodeSub9Array1[var2];
			if (var3 != null && var3.anInt245 != 0 && var3.aBool25) {
				var3.method310(var1);
				var3.aBool25 = false;
			}
		}

	}

	public Class11(AbstractFileStore var1, AbstractFileStore var2, int var3, double var4, int var6) {
		aJs5Index3 = var2;
		anInt22 = var3 * -734461651;
		anInt23 = anInt22 * -79300955;
		aDouble1 = var4;
		anInt24 = var6;
		int[] var7 = var1.method262(0);
		int var8 = var7.length;
		aNodeSub9Array1 = new NodeSub9[var1.method263(0)];

		for (int var9 = 0; var9 < var8; var9++) {
			ByteBuf var10 = new ByteBuf(var1.getFile(0, var7[var9]));
			aNodeSub9Array1[var7[var9]] = new NodeSub9(var10);
		}

	}

	public boolean method37(int var1) {
		return aNodeSub9Array1[var1].aBool26;
	}

	public boolean method38(int var1) {
		return anInt24 == 64;
	}

}
