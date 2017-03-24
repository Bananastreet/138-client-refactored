public class SoundEffect {

	SoundInstrument[] aClass17Array1 = new SoundInstrument[10];
	int anInt20;
	int anInt21;

	public NodeSub6Sub1 method25() {
		byte[] var1 = method27();
		return new NodeSub6Sub1(22050, var1, anInt20 * 22050 / 1000, anInt21 * 22050 / 1000);
	}

	SoundEffect(ByteBuf var1) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = var1.readUByte();
			if (var3 != 0) {
				--var1.position;
				aClass17Array1[var2] = new SoundInstrument();
				aClass17Array1[var2].method60(var1);
			}
		}

		anInt20 = var1.readUShort();
		anInt21 = var1.readUShort();
	}

	public final int method26() {
		int var1 = 9999999;

		int var2;
		for (var2 = 0; var2 < 10; var2++) {
			if (aClass17Array1[var2] != null && aClass17Array1[var2].anInt46 / 20 < var1) {
				var1 = aClass17Array1[var2].anInt46 / 20;
			}
		}

		if (anInt20 < anInt21 && anInt20 / 20 < var1) {
			var1 = anInt20 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (var2 = 0; var2 < 10; var2++) {
				if (aClass17Array1[var2] != null) {
					aClass17Array1[var2].anInt46 -= var1 * 20;
				}
			}

			if (anInt20 < anInt21) {
				anInt20 -= var1 * 20;
				anInt21 -= var1 * 20;
			}

			return var1;
		} else {
			return 0;
		}
	}

	final byte[] method27() {
		int var1 = 0;

		int var2;
		for (var2 = 0; var2 < 10; var2++) {
			if (aClass17Array1[var2] != null && aClass17Array1[var2].anInt47 + aClass17Array1[var2].anInt46 > var1) {
				var1 = aClass17Array1[var2].anInt47 + aClass17Array1[var2].anInt46;
			}
		}

		if (var1 == 0) {
			return new byte[0];
		} else {
			var2 = var1 * 22050 / 1000;
			byte[] var3 = new byte[var2];

			for (int var7 = 0; var7 < 10; var7++) {
				if (aClass17Array1[var7] != null) {
					int var8 = aClass17Array1[var7].anInt47 * 22050 / 1000;
					int var5 = aClass17Array1[var7].anInt46 * 22050 / 1000;
					int[] var9 = aClass17Array1[var7].method59(var8, aClass17Array1[var7].anInt47);

					for (int var4 = 0; var4 < var8; var4++) {
						int var6 = var3[var4 + var5] + (var9[var4] >> 8);
						if ((var6 + 128 & 0xffffff00) != 0) {
							var6 = var6 >> 31 ^ 127;
						}

						var3[var4 + var5] = (byte) var6;
					}
				}
			}

			return var3;
		}
	}

}
