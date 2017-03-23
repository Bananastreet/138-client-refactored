
public class GPI {
	
	
	static String staticString4;
	static String staticString1;
	static String staticString6;
	
	static void staticMethod231(String var0, String var1, String var2) {
		staticString4 = var0;
		staticString1 = var1;
		staticString6 = var2;
	}
	
	static final void initializeGPI(BitBuf var0) {		
		var0.method475();
		int var5 = Client.myPlayerIndex;
		Player var6 = AbstractClass2Sub1.staticPlayer1 = Client.staticPlayerArray1[var5] = new Player();
		var6.anInt686 = var5;
		int var2 = var0.method477(30);
		byte var3 = (byte) (var2 >> 28);
		int var4 = var2 >> 14 & 0x3fff;
		int var7 = var2 & 0x3fff;
		var6.anIntArray127[0] = var4 - NodeSub3.staticInt154;
		var6.anInt628 = (var6.anIntArray127[0] << 7) + (var6.method659() << 6);
		var6.anIntArray122[0] = var7 - Class34.staticInt75;
		var6.anInt591 = (var6.anIntArray122[0] << 7) + (var6.method659() << 6);
		NodeSub4.staticInt155 = var6.anInt698 = var3;
		if (Static.staticStreamArray1[var5] != null) {
			var6.method658(Static.staticStreamArray1[var5]);
		}

		Static.staticInt24 = 0;
		Static.staticIntArray7[++Static.staticInt24 - 1] = var5;
		Static.staticByteArray1[var5] = 0;
		Static.staticInt23 = 0;

		for (int var1 = 1; var1 < 2048; var1++) {
			if (var1 != var5) {
				int var11 = var0.method477(18);
				int var9 = var11 >> 16;
				int var10 = var11 >> 8 & 0x255;
				int var8 = var11 & 0x255;
				Static.staticIntArray9[var1] = var8 + (var9 << 28) + (var10 << 14);
				Static.staticIntArray10[var1] = 0;
				Static.staticIntArray11[var1] = -1;
				Static.staticIntArray8[++Static.staticInt23 - 1] = var1;
				Static.staticByteArray1[var1] = 0;
			}
		}

		var0.method474();
	}

}
