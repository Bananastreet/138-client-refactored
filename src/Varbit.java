public class Varbit extends Cacheable {

	static FileStore staticJs5Index11;
	public static Cache staticCache7 = new Cache(64);
	public int anInt430;
	public int anInt431;
	public int anInt432;

	void method478(ByteBuf var1) {
		while (true) {
			int var2 = var1.readUByte();
			if (var2 == 0) {
				return;
			}

			method479(var1, var2);
		}
	}

	void method479(ByteBuf var1, int var2) {
		if (var2 == 1) {
			anInt430 = var1.method370();
			anInt431 = var1.readUByte();
			anInt432 = var1.readUByte();
		}

	}

}
