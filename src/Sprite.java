public final class Sprite extends Rasterizer2D {

	public int anInt676;
	public int[] anIntArray155;
	public int anInt679;
	public byte[] aByteArray35;
	public int anInt677;
	public int anInt678;
	public int anInt681;
	public int anInt680;

	public void method653() {
		if (anInt677 != anInt676 || anInt678 != anInt679) {
			byte[] var3 = new byte[anInt676 * anInt679];
			int var4 = 0;

			for (int var2 = 0; var2 < anInt678; var2++) {
				for (int var1 = 0; var1 < anInt677; var1++) {
					var3[var1 + anInt681 + (var2 + anInt680) * anInt676] = aByteArray35[var4++];
				}
			}

			aByteArray35 = var3;
			anInt677 = anInt676;
			anInt678 = anInt679;
			anInt681 = 0;
			anInt680 = 0;
		}

	}

	public void method654(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < anIntArray155.length; var4++) {
			int var5 = anIntArray155[var4] >> 16 & 0xff;
			var5 += var1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = anIntArray155[var4] >> 8 & 0xff;
			var6 += var2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = anIntArray155[var4] & 0xff;
			var7 += var3;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			anIntArray155[var4] = (var5 << 16) + (var6 << 8) + var7;
		}

	}

	public void method655(int var1, int var2) {
		var1 += anInt681;
		var2 += anInt680;
		int var5 = var1 + var2 * staticInt330;
		int var6 = 0;
		int var8 = anInt678;
		int var3 = anInt677;
		int var7 = staticInt330 - var3;
		int var9 = 0;
		int var4;
		if (var2 < staticInt328) {
			var4 = staticInt328 - var2;
			var8 -= var4;
			var2 = staticInt328;
			var6 += var4 * var3;
			var5 += var4 * staticInt330;
		}

		if (var2 + var8 > staticInt325) {
			var8 -= var2 + var8 - staticInt325;
		}

		if (var1 < staticInt329) {
			var4 = staticInt329 - var1;
			var3 -= var4;
			var1 = staticInt329;
			var6 += var4;
			var5 += var4;
			var9 += var4;
			var7 += var4;
		}

		if (var1 + var3 > staticInt327) {
			var4 = var1 + var3 - staticInt327;
			var3 -= var4;
			var9 += var4;
			var7 += var4;
		}

		if (var3 > 0 && var8 > 0) {
			Static.staticMethod468(staticIntArray130, aByteArray35, anIntArray155, var6, var5, var3, var8, var7, var9);
		}

	}

}
