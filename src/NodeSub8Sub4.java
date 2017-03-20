public class NodeSub8Sub4 extends NodeSub8 {

	Class39 aClass39_4 = new Class39();
	NodeSub8Sub1 aNodeSub8Sub1_1 = new NodeSub8Sub1();
	NodeSub8Sub3 aNodeSub8Sub3_1;

	protected NodeSub8 method302() {
		NodeSub12 var1 = (NodeSub12) aClass39_4.method195();
		return var1 == null ? null : var1.aNodeSub8Sub2_3 != null ? var1.aNodeSub8Sub2_3 : method303();
	}

	protected NodeSub8 method303() {
		NodeSub12 var1;
		do {
			var1 = (NodeSub12) aClass39_4.method193();
			if (var1 == null) {
				return null;
			}
		} while (var1.aNodeSub8Sub2_3 == null);

		return var1.aNodeSub8Sub2_3;
	}

	protected int method304() {
		return 0;
	}

	protected void method306(int[] var1, int var2, int var3) {
		aNodeSub8Sub1_1.method306(var1, var2, var3);

		for (NodeSub12 var5 = (NodeSub12) aClass39_4.method195(); var5 != null; var5 = (NodeSub12) aClass39_4
				.method193()) {
			if (!aNodeSub8Sub3_1.method456(var5)) {
				int var6 = var2;
				int var4 = var3;

				do {
					if (var4 <= var5.anInt279) {
						method468(var5, var1, var6, var4, var4 + var6);
						var5.anInt279 -= var4;
						break;
					}

					method468(var5, var1, var6, var5.anInt279, var6 + var4);
					var6 += var5.anInt279;
					var4 -= var5.anInt279;
				} while (!aNodeSub8Sub3_1.method465(var5, var1, var6, var4));
			}
		}

	}

	void method468(NodeSub12 var1, int[] var2, int var3, int var4, int var5) {
		if ((aNodeSub8Sub3_1.anIntArray93[var1.anInt266] & 0x4) != 0 && var1.anInt276 < 0) {
			int var8 = aNodeSub8Sub3_1.anIntArray96[var1.anInt266] / Static.staticInt120;

			while (true) {
				int var6 = (var8 + 1048575 - var1.anInt275) / var8;
				if (var6 > var4) {
					var1.anInt275 += var8 * var4;
					break;
				}

				var1.aNodeSub8Sub2_3.method306(var2, var3, var6);
				var3 += var6;
				var4 -= var6;
				var1.anInt275 += var6 * var8 - 1048576;
				int var10 = Static.staticInt120 / 100;
				int var9 = 262144 / var8;
				if (var9 < var10) {
					var10 = var9;
				}

				NodeSub8Sub2 var7 = var1.aNodeSub8Sub2_3;
				if (aNodeSub8Sub3_1.anIntArray95[var1.anInt266] == 0) {
					var1.aNodeSub8Sub2_3 = Static.staticMethod351(var1.aNodeSub6Sub1_1, var7.method425(),
							var7.method417(), var7.method418());
				} else {
					var1.aNodeSub8Sub2_3 = Static.staticMethod351(var1.aNodeSub6Sub1_1, var7.method425(), 0,
							var7.method418());
					aNodeSub8Sub3_1.method458(var1, var1.aNodeSub14_1.aShortArray1[var1.anInt269] < 0);
					var1.aNodeSub8Sub2_3.method421(var10, var7.method417());
				}

				if (var1.aNodeSub14_1.aShortArray1[var1.anInt269] < 0) {
					var1.aNodeSub8Sub2_3.method430(-1);
				}

				var7.method423(var10);
				var7.method306(var2, var3, var5 - var3);
				if (var7.method427()) {
					aNodeSub8Sub1_1.method408(var7);
				}
			}
		}

		var1.aNodeSub8Sub2_3.method306(var2, var3, var4);
	}

	NodeSub8Sub4(NodeSub8Sub3 var1) {
		aNodeSub8Sub3_1 = var1;
	}

	protected void method305(int var1) {
		aNodeSub8Sub1_1.method305(var1);

		for (NodeSub12 var2 = (NodeSub12) aClass39_4.method195(); var2 != null; var2 = (NodeSub12) aClass39_4
				.method193()) {
			if (!aNodeSub8Sub3_1.method456(var2)) {
				int var3 = var1;

				do {
					if (var3 <= var2.anInt279) {
						method469(var2, var3);
						var2.anInt279 -= var3;
						break;
					}

					method469(var2, var2.anInt279);
					var3 -= var2.anInt279;
				} while (!aNodeSub8Sub3_1.method465(var2, (int[]) null, 0, var3));
			}
		}

	}

	void method469(NodeSub12 var1, int var2) {
		if ((aNodeSub8Sub3_1.anIntArray93[var1.anInt266] & 0x4) != 0 && var1.anInt276 < 0) {
			int var3 = aNodeSub8Sub3_1.anIntArray96[var1.anInt266] / Static.staticInt120;
			int var4 = (1048575 + var3 - var1.anInt275) / var3;
			var1.anInt275 = var2 * var3 + var1.anInt275 & 0xfffff;
			if (var4 <= var2) {
				if (aNodeSub8Sub3_1.anIntArray95[var1.anInt266] == 0) {
					var1.aNodeSub8Sub2_3 = Static.staticMethod351(var1.aNodeSub6Sub1_1,
							var1.aNodeSub8Sub2_3.method425(), var1.aNodeSub8Sub2_3.method417(),
							var1.aNodeSub8Sub2_3.method418());
				} else {
					var1.aNodeSub8Sub2_3 = Static.staticMethod351(var1.aNodeSub6Sub1_1,
							var1.aNodeSub8Sub2_3.method425(), 0, var1.aNodeSub8Sub2_3.method418());
					aNodeSub8Sub3_1.method458(var1, var1.aNodeSub14_1.aShortArray1[var1.anInt269] < 0);
				}

				if (var1.aNodeSub14_1.aShortArray1[var1.anInt269] < 0) {
					var1.aNodeSub8Sub2_3.method430(-1);
				}

				var2 = var1.anInt275 / var3;
			}
		}

		var1.aNodeSub8Sub2_3.method305(var2);
	}

}
