import java.util.Comparator;

final class Class34 implements Comparator {

	static String staticString23;
	static int staticInt75;
	static Widget staticWidget3;
	static Js5IndexImpl staticJs5IndexImpl3;

	public int compare(Object var1, Object var2) {
		return method144((Class23) var1, (Class23) var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	int method144(Class23 var1, Class23 var2) {
		return var1.aClass61_1.itemQuantity < var2.aClass61_1.itemQuantity ? -1
				: var2.aClass61_1.itemQuantity == var1.aClass61_1.itemQuantity ? 0 : 1;
	}

}
