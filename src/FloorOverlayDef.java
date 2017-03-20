public class FloorOverlayDef extends Cacheable {

	public static Cache staticCache26 = new Cache(64);
	public int anInt527 = 0;
	public int anInt528 = -1;
	public boolean aBool66 = true;
	public int anInt529 = -1;
	public int anInt533;
	public int anInt534;
	public int anInt526;
	public int anInt530;
	public int anInt531;
	public int anInt532;

	void method536() {
		if (anInt529 != -1) {
			method537(anInt529);
			anInt533 = anInt530 * -615591731;
			anInt534 = anInt531 * -1175374215;
			anInt526 = anInt532 * 2121153871;
		}

		method537(anInt527);
	}

	void method537(int var1) {
		double var2 = (var1 >> 16 & 0xff) / 256.0D;
		double var14 = (var1 >> 8 & 0xff) / 256.0D;
		double var10 = (var1 & 0xff) / 256.0D;
		double var6 = var2;
		if (var14 < var2) {
			var6 = var14;
		}

		if (var10 < var6) {
			var6 = var10;
		}

		double var4 = var2;
		if (var14 > var2) {
			var4 = var14;
		}

		if (var10 > var4) {
			var4 = var10;
		}

		double var16 = 0.0D;
		double var8 = 0.0D;
		double var12 = (var6 + var4) / 2.0D;
		if (var6 != var4) {
			if (var12 < 0.5D) {
				var8 = (var4 - var6) / (var6 + var4);
			}

			if (var12 >= 0.5D) {
				var8 = (var4 - var6) / (2.0D - var4 - var6);
			}

			if (var2 == var4) {
				var16 = (var14 - var10) / (var4 - var6);
			} else if (var4 == var14) {
				var16 = 2.0D + (var10 - var2) / (var4 - var6);
			} else if (var10 == var4) {
				var16 = 4.0D + (var2 - var14) / (var4 - var6);
			}
		}

		var16 /= 6.0D;
		anInt530 = (int) (var16 * 256.0D);
		anInt531 = (int) (256.0D * var8);
		anInt532 = (int) (256.0D * var12);
		if (anInt531 < 0) {
			anInt531 = 0;
		} else if (anInt531 > 255) {
			anInt531 = 255;
		}

		if (anInt532 < 0) {
			anInt532 = 0;
		} else if (anInt532 > 255) {
			anInt532 = 255;
		}

	}

	void method538(Stream var1, int var2, int var3) {
		if (var2 == 1) {
			anInt527 = var1.readTriByte();
		} else if (var2 == 2) {
			anInt528 = var1.method367();
		} else if (var2 == 5) {
			aBool66 = false;
		} else if (var2 == 7) {
			anInt529 = var1.readTriByte();
		} else if (var2 == 8) {
			;
		}

	}

	void method539(Stream var1, int var2) {
		while (true) {
			int var3 = var1.method367();
			if (var3 == 0) {
				return;
			}

			method538(var1, var3, var2);
		}
	}

}
