public final class Isaac {

	int[] anIntArray46 = new int[256];
	int[] anIntArray47 = new int[256];
	int anInt196;
	int anInt195;
	int anInt193;
	int anInt194;

	Isaac(int[] var1) {
		for (int var2 = 0; var2 < var1.length; var2++) {
			anIntArray47[var2] = var1[var2];
		}

		method243();
	}

	final int method241() {
		if (--anInt196 + 1 == 0) {
			method242();
			anInt196 = 255;
		}

		return anIntArray47[anInt196];
	}

	final void method242() {
		anInt193 += (anInt195 += -1468065771) * 1599076157;

		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = anIntArray46[var1];
			if ((var1 & 0x2) == 0) {
				if ((var1 & 0x1) == 0) {
					anInt194 ^= anInt194 << 13;
				} else {
					anInt194 ^= anInt194 >>> 6;
				}
			} else if ((var1 & 0x1) == 0) {
				anInt194 ^= anInt194 << 2;
			} else {
				anInt194 ^= anInt194 >>> 16;
			}

			anInt194 += anIntArray46[128 + var1 & 0xff];
			int var3;
			anIntArray46[var1] = var3 = anInt193 + anInt194 + anIntArray46[(var2 & 0x3fc) >> 2];
			anIntArray47[var1] = anInt193 = anIntArray46[(var3 >> 8 & 0x3fc) >> 2] + var2;
		}

	}

	final void method243() {
		int var1 = -1640531527;
		int var9 = -1640531527;
		int var4 = -1640531527;
		int var2 = -1640531527;
		int var6 = -1640531527;
		int var5 = -1640531527;
		int var7 = -1640531527;
		int var8 = -1640531527;

		int var3;
		for (var3 = 0; var3 < 4; var3++) {
			var8 ^= var7 << 11;
			var6 += var8;
			var7 += var5;
			var7 ^= var5 >>> 2;
			var2 += var7;
			var5 += var6;
			var5 ^= var6 << 8;
			var4 += var5;
			var6 += var2;
			var6 ^= var2 >>> 16;
			var9 += var6;
			var2 += var4;
			var2 ^= var4 << 10;
			var1 += var2;
			var4 += var9;
			var4 ^= var9 >>> 4;
			var8 += var4;
			var9 += var1;
			var9 ^= var1 << 8;
			var7 += var9;
			var1 += var8;
			var1 ^= var8 >>> 9;
			var5 += var1;
			var8 += var7;
		}

		for (var3 = 0; var3 < 256; var3 += 8) {
			var8 += anIntArray47[var3];
			var7 += anIntArray47[var3 + 1];
			var5 += anIntArray47[var3 + 2];
			var6 += anIntArray47[3 + var3];
			var2 += anIntArray47[var3 + 4];
			var4 += anIntArray47[5 + var3];
			var9 += anIntArray47[var3 + 6];
			var1 += anIntArray47[var3 + 7];
			var8 ^= var7 << 11;
			var6 += var8;
			var7 += var5;
			var7 ^= var5 >>> 2;
			var2 += var7;
			var5 += var6;
			var5 ^= var6 << 8;
			var4 += var5;
			var6 += var2;
			var6 ^= var2 >>> 16;
			var9 += var6;
			var2 += var4;
			var2 ^= var4 << 10;
			var1 += var2;
			var4 += var9;
			var4 ^= var9 >>> 4;
			var8 += var4;
			var9 += var1;
			var9 ^= var1 << 8;
			var7 += var9;
			var1 += var8;
			var1 ^= var8 >>> 9;
			var5 += var1;
			var8 += var7;
			anIntArray46[var3] = var8;
			anIntArray46[var3 + 1] = var7;
			anIntArray46[var3 + 2] = var5;
			anIntArray46[var3 + 3] = var6;
			anIntArray46[4 + var3] = var2;
			anIntArray46[var3 + 5] = var4;
			anIntArray46[6 + var3] = var9;
			anIntArray46[var3 + 7] = var1;
		}

		for (var3 = 0; var3 < 256; var3 += 8) {
			var8 += anIntArray46[var3];
			var7 += anIntArray46[1 + var3];
			var5 += anIntArray46[var3 + 2];
			var6 += anIntArray46[3 + var3];
			var2 += anIntArray46[var3 + 4];
			var4 += anIntArray46[var3 + 5];
			var9 += anIntArray46[6 + var3];
			var1 += anIntArray46[var3 + 7];
			var8 ^= var7 << 11;
			var6 += var8;
			var7 += var5;
			var7 ^= var5 >>> 2;
			var2 += var7;
			var5 += var6;
			var5 ^= var6 << 8;
			var4 += var5;
			var6 += var2;
			var6 ^= var2 >>> 16;
			var9 += var6;
			var2 += var4;
			var2 ^= var4 << 10;
			var1 += var2;
			var4 += var9;
			var4 ^= var9 >>> 4;
			var8 += var4;
			var9 += var1;
			var9 ^= var1 << 8;
			var7 += var9;
			var1 += var8;
			var1 ^= var8 >>> 9;
			var5 += var1;
			var8 += var7;
			anIntArray46[var3] = var8;
			anIntArray46[var3 + 1] = var7;
			anIntArray46[2 + var3] = var5;
			anIntArray46[var3 + 3] = var6;
			anIntArray46[4 + var3] = var2;
			anIntArray46[var3 + 5] = var4;
			anIntArray46[var3 + 6] = var9;
			anIntArray46[7 + var3] = var1;
		}

		method242();
		anInt196 = 256;
	}

}
