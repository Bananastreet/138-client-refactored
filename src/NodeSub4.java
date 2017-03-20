public final class NodeSub4 extends Node {

	static Rasterizer2DSub2Sub1 staticRasterizer2DSub2Sub1_3;
	int anInt222;
	int anInt223;
	int anInt224;
	int anInt225;
	int anInt230;
	NodeSub8Sub2 aNodeSub8Sub2_2;
	int anInt231;
	static int staticInt155;
	ObjectDefinition anObjectDef1;
	static Class39 staticClass39_4 = new Class39();
	int anInt227;
	int anInt226;
	int anInt228;
	int anInt229;
	int[] anIntArray59;
	NodeSub8Sub2 aNodeSub8Sub2_1;

	void method295() {
		int var1 = anInt227;
		ObjectDefinition var2 = anObjectDef1.method516();
		if (var2 != null) {
			anInt227 = var2.anInt504;
			anInt226 = var2.anInt505 * 128;
			anInt228 = var2.anInt495 * 1973803733;
			anInt229 = var2.anInt506 * 1048704065;
			anIntArray59 = var2.anIntArray109;
		} else {
			anInt227 = -1;
			anInt226 = 0;
			anInt228 = 0;
			anInt229 = 0;
			anIntArray59 = null;
		}

		if (var1 != anInt227 && aNodeSub8Sub2_1 != null) {
			ClientScriptMap.staticNodeSub8Sub1_1.method406(aNodeSub8Sub2_1);
			aNodeSub8Sub2_1 = null;
		}

	}

}
