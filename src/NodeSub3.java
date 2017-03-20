public class NodeSub3 extends Node {

	static int staticInt152;
	static int staticInt153;
	static Widget staticWidget5;
	static int staticInt154;
	Class36 aClass36_2 = new Class36();
	CacheableSub6 aCacheableSub6_1;

	void method292(int var1, int var2, int var3, int var4) {
		NodeSub2 var5 = null;
		int var7 = 0;

		for (NodeSub2 var6 = (NodeSub2) aClass36_2.method160(); var6 != null; var6 = (NodeSub2) aClass36_2
				.method164()) {
			++var7;
			if (var1 == var6.anInt220) {
				var6.method291(var1, var2, var3, var4);
				return;
			}

			if (var6.anInt220 <= var1) {
				var5 = var6;
			}
		}

		if (var5 == null) {
			if (var7 < 4) {
				aClass36_2.method163(new NodeSub2(var1, var2, var3, var4));
			}
		} else {
			Static.staticMethod122(new NodeSub2(var1, var2, var3, var4), var5);
			if (var7 >= 4) {
				aClass36_2.method160().method174();
			}
		}

	}

	NodeSub2 method293(int var1) {
		NodeSub2 var2 = (NodeSub2) aClass36_2.method160();
		if (var2 != null && var2.anInt220 <= var1) {
			for (NodeSub2 var3 = (NodeSub2) aClass36_2.method164(); var3 != null
					&& var3.anInt220 <= var1; var3 = (NodeSub2) aClass36_2.method164()) {
				var2.method174();
				var2 = var3;
			}

			if (aCacheableSub6_1.anInt513 + var2.anInt220 + var2.anInt221 > var1) {
				return var2;
			} else {
				var2.method174();
				return null;
			}
		} else {
			return null;
		}
	}

	boolean method294() {
		return aClass36_2.method162();
	}

	NodeSub3(CacheableSub6 var1) {
		aCacheableSub6_1 = var1;
	}

}
