public class CacheableSub5 extends Cacheable {

	public static AbstractFileStore staticJs5Index16;
	public static AbstractFileStore staticJs5Index17;
	public static AbstractFileStore staticJs5Index18;
	public static Cache staticCache12 = new Cache(64);
	public static Cache staticCache14 = new Cache(64);
	public static Cache staticCache13 = new Cache(20);
	int anInt470 = -1;
	public int anInt472 = 16777215;
	int anInt469 = -1;
	int anInt475 = -1;
	int anInt474 = -1;
	int anInt476 = -1;
	public int anInt477 = 0;
	String aString32 = "";
	public int anInt473 = 70;
	public int anInt478 = 0;
	public int anInt471 = -1;
	public int anInt479 = -1;
	public int anInt480 = 0;
	int anInt481 = -1;
	int anInt482 = -1;
	public int[] anIntArray107;

	void method500(ByteBuf var1) {
		while (true) {
			int var2 = var1.readUByte();
			if (var2 == 0) {
				return;
			}

			method508(var1, var2);
		}
	}

	public final CacheableSub5 method501() {
		int var1 = -1;
		if (anInt481 != -1) {
			var1 = Static.staticMethod82(anInt481);
		} else if (anInt482 != -1) {
			var1 = Static.staticIntArray64[anInt482];
		}

		int var2;
		if (var1 >= 0 && var1 < anIntArray107.length - 1) {
			var2 = anIntArray107[var1];
		} else {
			var2 = anIntArray107[anIntArray107.length - 1];
		}

		return var2 != -1 ? Static.staticMethod197(var2) : null;
	}

	public String method502(int var1) {
		String var2 = aString32;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + Static.staticMethod132(var1, false) + var2.substring(var3 + 2);
		}
	}

	public Picture method503() {
		if (anInt474 < 0) {
			return null;
		} else {
			Picture var1 = (Picture) staticCache14.get(anInt474);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Static.staticMethod296(staticJs5Index16, anInt474, 0);
				if (var1 != null) {
					staticCache14.method170(var1, anInt474);
				}

				return var1;
			}
		}
	}

	public Picture method504() {
		if (anInt475 < 0) {
			return null;
		} else {
			Picture var1 = (Picture) staticCache14.get(anInt475);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Static.staticMethod296(staticJs5Index16, anInt475, 0);
				if (var1 != null) {
					staticCache14.method170(var1, anInt475);
				}

				return var1;
			}
		}
	}

	public Picture method505() {
		if (anInt476 < 0) {
			return null;
		} else {
			Picture var1 = (Picture) staticCache14.get(anInt476);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Static.staticMethod296(staticJs5Index16, anInt476, 0);
				if (var1 != null) {
					staticCache14.method170(var1, anInt476);
				}

				return var1;
			}
		}
	}

	public GameFontSub1 method506() {
		if (anInt470 == -1) {
			return null;
		} else {
			GameFontSub1 var1 = (GameFontSub1) staticCache13.get(anInt470);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Static.staticMethod54(staticJs5Index16, staticJs5Index18, anInt470, 0);
				if (var1 != null) {
					staticCache13.method170(var1, anInt470);
				}

				return var1;
			}
		}
	}

	public Picture method507() {
		if (anInt469 < 0) {
			return null;
		} else {
			Picture var1 = (Picture) staticCache14.get(anInt469);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Static.staticMethod296(staticJs5Index16, anInt469, 0);
				if (var1 != null) {
					staticCache14.method170(var1, anInt469);
				}

				return var1;
			}
		}
	}

	void method508(ByteBuf var1, int var2) {
		if (var2 == 1) {
			anInt470 = var1.method338();
		} else if (var2 == 2) {
			anInt472 = var1.readTriByte();
		} else if (var2 == 3) {
			anInt469 = var1.method338();
		} else if (var2 == 4) {
			anInt475 = var1.method338();
		} else if (var2 == 5) {
			anInt474 = var1.method338();
		} else if (var2 == 6) {
			anInt476 = var1.method338();
		} else if (var2 == 7) {
			anInt477 = var1.method364();
		} else if (var2 == 8) {
			aString32 = var1.method374();
		} else if (var2 == 9) {
			anInt473 = var1.readUShort();
		} else if (var2 == 10) {
			anInt478 = var1.method364();
		} else if (var2 == 11) {
			anInt471 = 0;
		} else if (var2 == 12) {
			anInt479 = var1.readUByte();
		} else if (var2 == 13) {
			anInt480 = var1.method364();
		} else if (var2 == 14) {
			anInt471 = var1.readUShort();
		} else if (var2 == 17 || var2 == 18) {
			anInt481 = var1.readUShort();
			if (anInt481 == '\uffff') {
				anInt481 = -1;
			}

			anInt482 = var1.readUShort();
			if (anInt482 == '\uffff') {
				anInt482 = -1;
			}

			int var4 = -1;
			if (var2 == 18) {
				var4 = var1.readUShort();
				if (var4 == '\uffff') {
					var4 = -1;
				}
			}

			int var3 = var1.readUByte();
			anIntArray107 = new int[2 + var3];

			for (int var5 = 0; var5 <= var3; var5++) {
				anIntArray107[var5] = var1.readUShort();
				if (anIntArray107[var5] == '\uffff') {
					anIntArray107[var5] = -1;
				}
			}

			anIntArray107[var3 + 1] = var4;
		}

	}

}
