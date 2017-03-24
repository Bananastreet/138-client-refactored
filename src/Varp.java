public class Varp extends Cacheable {

	public static int staticInt323;
	static FileStore staticJs5Index27;
	public static Cache staticCache25 = new Cache(64);
	public int anInt525 = 0;

	void method534(ByteBuf var1) {
		while (true) {
			int var2 = var1.method367();
			if (var2 == 0) {
				return;
			}

			method535(var1, var2);
		}
	}

	void method535(ByteBuf var1, int var2) {
		if (var2 == 5) {
			anInt525 = var1.method370();
		}

	}

}
