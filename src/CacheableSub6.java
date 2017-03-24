public class CacheableSub6 extends Cacheable {

	public static FileStore staticJs5Index23;
	public static FileStore staticJs5Index24;
	public int anInt518;
	static Cache staticCache21 = new Cache(64);
	static Cache staticCache22 = new Cache(64);
	public int anInt514 = 255;
	public int anInt515 = 255;
	public int anInt516 = -1;
	public int anInt513 = 70;
	int anInt519 = -1;
	int anInt520 = -1;
	public int anInt522 = 30;
	public int anInt521 = 0;
	public int anInt517 = 1;

	void method526(ByteBuf var1) {
		while (true) {
			int var2 = var1.readUByte();
			if (var2 == 0) {
				return;
			}

			method527(var1, var2);
		}
	}

	void method527(ByteBuf var1, int var2) {
		if (var2 == 1) {
			var1.method370();
		} else if (var2 == 2) {
			anInt514 = var1.readUByte();
		} else if (var2 == 3) {
			anInt515 = var1.readUByte();
		} else if (var2 == 4) {
			anInt516 = 0;
		} else if (var2 == 5) {
			anInt513 = var1.method370();
		} else if (var2 == 6) {
			var1.readUByte();
		} else if (var2 == 7) {
			anInt519 = var1.method338();
		} else if (var2 == 8) {
			anInt520 = var1.method338();
		} else if (var2 == 11) {
			anInt516 = var1.method370();
		} else if (var2 == 14) {
			anInt522 = var1.readUByte();
		} else if (var2 == 15) {
			anInt521 = var1.readUByte();
		}

	}

	public Sprite method528() {
		if (anInt519 < 0) {
			return null;
		} else {
			Sprite var1 = (Sprite) staticCache22.get(anInt519);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Static.staticMethod296(staticJs5Index23, anInt519, 0);
				if (var1 != null) {
					staticCache22.method170(var1, anInt519);
				}

				return var1;
			}
		}
	}

	public Sprite method529() {
		if (anInt520 < 0) {
			return null;
		} else {
			Sprite var1 = (Sprite) staticCache22.get(anInt520);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Static.staticMethod296(staticJs5Index23, anInt520, 0);
				if (var1 != null) {
					staticCache22.method170(var1, anInt520);
				}

				return var1;
			}
		}
	}

}
