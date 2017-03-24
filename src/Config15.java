public class Config15 extends Cacheable {

	static FileStore staticJs5Index21;
	static Cache staticCache19 = new Cache(64);
	public boolean aBool64 = false;

	void method520(ByteBuf var1) {
		while (true) {
			int var2 = var1.method367();
			if (var2 == 0) {
				return;
			}

			method521(var1, var2);
		}
	}

	void method521(ByteBuf var1, int var2) {
		if (var2 == 2) {
			aBool64 = true;
		}

	}

}
