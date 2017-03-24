public class Config5 extends Cacheable {

	static FileStore staticJs5Index34;
	static Rasterizer2DSub3 staticRasterizer2DSub3_6;
	static Cache staticCache33 = new Cache(64);
	public int anInt569 = 0;

	void method558(ByteBuf var1) {
		while (true) {
			int var2 = var1.readUByte();
			if (var2 == 0) {
				return;
			}

			method559(var1, var2);
		}
	}

	void method559(ByteBuf var1, int var2) {
		if (var2 == 2) {
			anInt569 = var1.method370();
		}

	}

}
