public class Config19 extends Cacheable {

	public static AbstractFileStore staticJs5Index26;
	static Js5IndexImpl staticJs5IndexImpl15;
	public static Cache staticCache24 = new Cache(64);
	public boolean aBool65 = false;

	public void method532(ByteBuf var1) {
		while (true) {
			int var2 = var1.readUByte();
			if (var2 == 0) {
				return;
			}

			method533(var1, var2);
		}
	}

	void method533(ByteBuf var1, int var2) {
		if (var2 == 2) {
			aBool65 = true;
		}

	}

}
