public class ClientScriptMap extends Cacheable {

	public static Js5Index staticJs5Index25;
	static Js5IndexImpl staticJs5IndexImpl14;
	static int[] staticIntArray129;
	static NodeSub8Sub1 staticNodeSub8Sub1_1;
	public static Cache staticCache23 = new Cache(64);
	public String aString34 = "null";
	public int anInt524 = 0;
	public char aChar1;
	public char aChar2;
	public int anInt523;
	public int[] anIntArray112;
	public String[] aStringArray9;
	public int[] anIntArray113;

	void method530(Stream var1, int var2) {
		if (var2 == 1) {
			aChar1 = (char) var1.method367();
		} else if (var2 == 2) {
			aChar2 = (char) var1.method367();
		} else if (var2 == 3) {
			aString34 = var1.method365();
		} else if (var2 == 4) {
			anInt523 = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) {
				anInt524 = var1.method370();
				anIntArray112 = new int[anInt524];
				aStringArray9 = new String[anInt524];

				for (var3 = 0; var3 < anInt524; var3++) {
					anIntArray112[var3] = var1.readInt();
					aStringArray9[var3] = var1.method365();
				}
			} else if (var2 == 6) {
				anInt524 = var1.method370();
				anIntArray112 = new int[anInt524];
				anIntArray113 = new int[anInt524];

				for (var3 = 0; var3 < anInt524; var3++) {
					anIntArray112[var3] = var1.readInt();
					anIntArray113[var3] = var1.readInt();
				}
			}
		}

	}

	public void method531(Stream var1) {
		while (true) {
			int var2 = var1.method367();
			if (var2 == 0) {
				return;
			}

			method530(var1, var2);
		}
	}

}
