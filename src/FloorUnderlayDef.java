public class FloorUnderlayDef extends Cacheable {

	public static FileStore staticJs5Index22;
	public static CacheableSub4 staticCacheableSub4_1;
	static Widget staticWidget12;
	static Js5IndexImpl staticJs5IndexImpl13;
	public static Cache staticCache20 = new Cache(64);
	int anInt508 = 0;
	public int anInt510;
	public int anInt509;
	public int anInt511;
	public int anInt512;

	void method522() {
		method525(anInt508);
	}

	void method523(ByteBuf var1, int var2) {
		while (true) {
			int var3 = var1.readUByte();
			if (var3 == 0) {
				return;
			}

			method524(var1, var3, var2);
		}
	}

	void method524(ByteBuf var1, int var2, int var3) {
		if (var2 == 1) {
			anInt508 = var1.readTriByte();
		}

	}

	void method525(int var1) {
		double var2 = (var1 >> 16 & 0xff) / 256.0D;
		double var10 = (var1 >> 8 & 0xff) / 256.0D;
		double var14 = (var1 & 0xff) / 256.0D;
		double var6 = var2;
		if (var10 < var2) {
			var6 = var10;
		}

		if (var14 < var6) {
			var6 = var14;
		}

		double var4 = var2;
		if (var10 > var2) {
			var4 = var10;
		}

		if (var14 > var4) {
			var4 = var14;
		}

		double var16 = 0.0D;
		double var8 = 0.0D;
		double var12 = (var6 + var4) / 2.0D;
		if (var6 != var4) {
			if (var12 < 0.5D) {
				var8 = (var4 - var6) / (var4 + var6);
			}

			if (var12 >= 0.5D) {
				var8 = (var4 - var6) / (2.0D - var4 - var6);
			}

			if (var2 == var4) {
				var16 = (var10 - var14) / (var4 - var6);
			} else if (var10 == var4) {
				var16 = 2.0D + (var14 - var2) / (var4 - var6);
			} else if (var14 == var4) {
				var16 = 4.0D + (var2 - var10) / (var4 - var6);
			}
		}

		var16 /= 6.0D;
		anInt510 = (int) (256.0D * var8);
		anInt509 = (int) (var12 * 256.0D);
		if (anInt510 < 0) {
			anInt510 = 0;
		} else if (anInt510 > 255) {
			anInt510 = 255;
		}

		if (anInt509 < 0) {
			anInt509 = 0;
		} else if (anInt509 > 255) {
			anInt509 = 255;
		}

		if (var12 > 0.5D) {
			anInt511 = (int) (512.0D * var8 * (1.0D - var12));
		} else {
			anInt511 = (int) (var12 * var8 * 512.0D);
		}

		if (anInt511 < 1) {
			anInt511 = 1;
		}

		anInt512 = (int) (anInt511 * var16);
	}

}
