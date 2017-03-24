public class Class24 {

	static int[] staticIntArray36 = new int[500];
	static int[] staticIntArray34 = new int[500];
	static int[] staticIntArray33 = new int[500];
	static int[] staticIntArray35 = new int[500];
	NodeSub10 aNodeSub10_1 = null;
	int anInt67 = -1;
	boolean aBool9 = false;
	int[] anIntArray31;
	int[] anIntArray32;
	int[] anIntArray33;
	int[] anIntArray34;

	Class24(byte[] var1, NodeSub10 var2) {
		aNodeSub10_1 = var2;
		ByteBuf var5 = new ByteBuf(var1);
		ByteBuf var6 = new ByteBuf(var1);
		var5.position = 2;
		int var7 = var5.readUByte();
		int var8 = -1;
		int var9 = 0;
		var6.position = var5.position + var7;

		int var3;
		for (var3 = 0; var3 < var7; var3++) {
			int var10 = var5.readUByte();
			if (var10 > 0) {
				if (aNodeSub10_1.anIntArray65[var3] != 0) {
					for (int var11 = var3 - 1; var11 > var8; --var11) {
						if (aNodeSub10_1.anIntArray65[var11] == 0) {
							staticIntArray36[var9] = var11;
							staticIntArray34[var9] = 0;
							staticIntArray33[var9] = 0;
							staticIntArray35[var9] = 0;
							++var9;
							break;
						}
					}
				}

				staticIntArray36[var9] = var3;
				short var111 = 0;
				if (aNodeSub10_1.anIntArray65[var3] == 3) {
					var111 = 128;
				}

				if ((var10 & 0x1) != 0) {
					staticIntArray34[var9] = var6.method366();
				} else {
					staticIntArray34[var9] = var111;
				}

				if ((var10 & 0x2) != 0) {
					staticIntArray33[var9] = var6.method366();
				} else {
					staticIntArray33[var9] = var111;
				}

				if ((var10 & 0x4) != 0) {
					staticIntArray35[var9] = var6.method366();
				} else {
					staticIntArray35[var9] = var111;
				}

				var8 = var3;
				++var9;
				if (aNodeSub10_1.anIntArray65[var3] == 5) {
					aBool9 = true;
				}
			}
		}

		if (var6.position != var1.length) {
			throw new RuntimeException();
		} else {
			anInt67 = var9;
			anIntArray31 = new int[var9];
			anIntArray32 = new int[var9];
			anIntArray33 = new int[var9];
			anIntArray34 = new int[var9];

			for (var3 = 0; var3 < var9; var3++) {
				anIntArray31[var3] = staticIntArray36[var3];
				anIntArray32[var3] = staticIntArray34[var3];
				anIntArray33[var3] = staticIntArray33[var3];
				anIntArray34[var3] = staticIntArray35[var3];
			}

		}
	}

}
