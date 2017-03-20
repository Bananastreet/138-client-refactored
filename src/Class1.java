import java.util.Comparator;

final class Class1 implements Comparator {

	public static int staticInt1;
	final boolean val$preferOwnWorld;

	public int compare(Object var1, Object var2) {
		return method1((Class23) var1, (Class23) var2);
	}

	int method1(Class23 var1, Class23 var2) {
		if (var1.anInt66 == var2.anInt66) {
			return 0;
		} else {
			if (val$preferOwnWorld) {
				if (var1.anInt66 == Client.staticInt309) {
					return -1;
				}

				if (Client.staticInt309 == var2.anInt66) {
					return 1;
				}
			}

			return var1.anInt66 < var2.anInt66 ? -1 : 1;
		}
	}

	Class1(boolean var1) {
		val$preferOwnWorld = var1;
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

}
