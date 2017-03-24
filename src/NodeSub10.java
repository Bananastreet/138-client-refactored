public class NodeSub10 extends Node {

	public static String[] staticStringArray6;
	public static String staticString28;
	int anInt248;
	int anInt247;
	int[] anIntArray65;
	int[][] anIntArrayArray11;

	NodeSub10(int var1, byte[] var2) {
		anInt248 = var1;
		ByteBuf var4 = new ByteBuf(var2);
		anInt247 = var4.readUByte();
		anIntArray65 = new int[anInt247];
		anIntArrayArray11 = new int[anInt247][];

		int var5;
		for (var5 = 0; var5 < anInt247; var5++) {
			anIntArray65[var5] = var4.readUByte();
		}

		for (var5 = 0; var5 < anInt247; var5++) {
			anIntArrayArray11[var5] = new int[var4.readUByte()];
		}

		for (var5 = 0; var5 < anInt247; var5++) {
			for (int var3 = 0; var3 < anIntArrayArray11[var5].length; var3++) {
				anIntArrayArray11[var5][var3] = var4.readUByte();
			}
		}

	}

}
