public class AnimationDefintion extends Cacheable {

	static FileStore staticJs5Index31;
	static FileStore staticJs5Index32;
	static FileStore staticJs5Index33;
	static Cache staticCache32 = new Cache(64);
	static Cache staticCache31 = new Cache(100);
	public int anInt562 = -1;
	public boolean aBool72 = false;
	public int anInt563 = 5;
	public int anInt564 = -1;
	public int anInt565 = -1;
	public int anInt561 = 99;
	public int anInt566 = -1;
	public int anInt567 = -1;
	public int anInt568 = 2;
	public int[] anIntArray119;
	int[] anIntArray117;
	public int[] anIntArray121;
	int[] anIntArray118;
	public int[] anIntArray120;

	void method550(ByteBuf var1) {
		while (true) {
			int var2 = var1.readUByte();
			if (var2 == 0) {
				return;
			}

			method554(var1, var2);
		}
	}

	public Model method551(Model var1, int var2) {
		var2 = anIntArray121[var2];
		CacheableSub2 var3 = Static.staticMethod343(var2 >> 16);
		var2 &= '\uffff';
		if (var3 == null) {
			return var1.method589(true);
		} else {
			Model var4 = var1.method589(!var3.method436(var2));
			var4.method602(var3, var2);
			return var4;
		}
	}

	Model method552(Model var1, int var2) {
		var2 = anIntArray121[var2];
		CacheableSub2 var4 = Static.staticMethod343(var2 >> 16);
		var2 &= '\uffff';
		if (var4 == null) {
			return var1.method590(true);
		} else {
			Model var3 = var1.method590(!var4.method436(var2));
			var3.method602(var4, var2);
			return var3;
		}
	}

	Model method553(Model var1, int var2, int var3) {
		var2 = anIntArray121[var2];
		CacheableSub2 var5 = Static.staticMethod343(var2 >> 16);
		var2 &= '\uffff';
		if (var5 == null) {
			return var1.method589(true);
		} else {
			Model var4 = var1.method589(!var5.method436(var2));
			var3 &= 3;
			if (var3 == 1) {
				var4.method606();
			} else if (var3 == 2) {
				var4.method597();
			} else if (var3 == 3) {
				var4.method607();
			}

			var4.method602(var5, var2);
			if (var3 == 1) {
				var4.method607();
			} else if (var3 == 2) {
				var4.method597();
			} else if (var3 == 3) {
				var4.method606();
			}

			return var4;
		}
	}

	void method554(ByteBuf var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var4 = var1.method370();
			anIntArray119 = new int[var4];

			for (var3 = 0; var3 < var4; var3++) {
				anIntArray119[var3] = var1.method370();
			}

			anIntArray121 = new int[var4];

			for (var3 = 0; var3 < var4; var3++) {
				anIntArray121[var3] = var1.method370();
			}

			for (var3 = 0; var3 < var4; var3++) {
				anIntArray121[var3] += var1.method370() << 16;
			}
		} else if (var2 == 2) {
			anInt562 = var1.method370();
		} else if (var2 == 3) {
			var4 = var1.readUByte();
			anIntArray117 = new int[1 + var4];

			for (var3 = 0; var3 < var4; var3++) {
				anIntArray117[var3] = var1.readUByte();
			}

			anIntArray117[var4] = 9999999;
		} else if (var2 == 4) {
			aBool72 = true;
		} else if (var2 == 5) {
			anInt563 = var1.readUByte();
		} else if (var2 == 6) {
			anInt564 = var1.method370();
		} else if (var2 == 7) {
			anInt565 = var1.method370();
		} else if (var2 == 8) {
			anInt561 = var1.readUByte();
		} else if (var2 == 9) {
			anInt566 = var1.readUByte();
		} else if (var2 == 10) {
			anInt567 = var1.readUByte();
		} else if (var2 == 11) {
			anInt568 = var1.readUByte();
		} else if (var2 == 12) {
			var4 = var1.readUByte();
			anIntArray118 = new int[var4];

			for (var3 = 0; var3 < var4; var3++) {
				anIntArray118[var3] = var1.method370();
			}

			for (var3 = 0; var3 < var4; var3++) {
				anIntArray118[var3] += var1.method370() << 16;
			}
		} else if (var2 == 13) {
			var4 = var1.readUByte();
			anIntArray120 = new int[var4];

			for (var3 = 0; var3 < var4; var3++) {
				anIntArray120[var3] = var1.readTriByte();
			}
		}

	}

	void method555() {
		if (anInt566 == -1) {
			if (anIntArray117 != null) {
				anInt566 = 2;
			} else {
				anInt566 = 0;
			}
		}

		if (anInt567 == -1) {
			if (anIntArray117 != null) {
				anInt567 = 2;
			} else {
				anInt567 = 0;
			}
		}

	}

	public Model method556(Model var1, int var2, AnimationDefintion var3, int var4) {
		var2 = anIntArray121[var2];
		CacheableSub2 var6 = Static.staticMethod343(var2 >> 16);
		var2 &= '\uffff';
		if (var6 == null) {
			return var3.method551(var1, var4);
		} else {
			var4 = var3.anIntArray121[var4];
			CacheableSub2 var7 = Static.staticMethod343(var4 >> 16);
			var4 &= '\uffff';
			Model var5;
			if (var7 == null) {
				var5 = var1.method589(!var6.method436(var2));
				var5.method602(var6, var2);
				return var5;
			} else {
				var5 = var1.method589(!var6.method436(var2) & !var7.method436(var4));
				var5.method595(var6, var2, var7, var4, anIntArray117);
				return var5;
			}
		}
	}

	public Model method557(Model var1, int var2) {
		int var3 = anIntArray121[var2];
		CacheableSub2 var5 = Static.staticMethod343(var3 >> 16);
		var3 &= '\uffff';
		if (var5 == null) {
			return var1.method589(true);
		} else {
			CacheableSub2 var6 = null;
			int var4 = 0;
			if (anIntArray118 != null && var2 < anIntArray118.length) {
				var4 = anIntArray118[var2];
				var6 = Static.staticMethod343(var4 >> 16);
				var4 &= '\uffff';
			}

			Model var7;
			if (var6 != null && var4 != '\uffff') {
				var7 = var1.method589(!var5.method436(var3) & !var6.method436(var4));
				var7.method602(var5, var3);
				var7.method602(var6, var4);
				return var7;
			} else {
				var7 = var1.method589(!var5.method436(var3));
				var7.method602(var5, var3);
				return var7;
			}
		}
	}

}
