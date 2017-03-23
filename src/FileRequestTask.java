public class FileRequestTask implements Runnable {

	static int staticInt128 = 0;
	static Class39 staticClass39_3 = new Class39();
	static Class39 staticClass39_2 = new Class39();
	static Object staticObject1 = new Object();

	public void run() {
		try {
			while (true) {
				Js5CacheWriteRequest var2;
				synchronized (staticClass39_3) {
					var2 = (Js5CacheWriteRequest) staticClass39_3.method195();
				}

				if (var2 != null) {
					if (var2.anInt290 == 0) {
						var2.aJs5DiskCache1.method156((int) var2.id, var2.aByteArray22, var2.aByteArray22.length);
						synchronized (staticClass39_3) {
							var2.method174();
						}
					} else if (var2.anInt290 == 1) {
						var2.aByteArray22 = var2.aJs5DiskCache1.method155((int) var2.id);
						synchronized (staticClass39_3) {
							staticClass39_2.method198(var2);
						}
					}

					synchronized (staticObject1) {
						if (staticInt128 <= 1) {
							staticInt128 = 0;
							staticObject1.notifyAll();
							return;
						}

						staticInt128 = 600;
					}
				} else {
					Static.staticMethod303(100L);
					synchronized (staticObject1) {
						if (staticInt128 <= 1) {
							staticInt128 = 0;
							staticObject1.notifyAll();
							return;
						}

						--staticInt128;
					}
				}
			}
		} catch (Exception var10) {
			Static.staticMethod285((String) null, var10);
		}
	}

}
