import java.util.Comparator;

final class Class51 implements Comparator {

	static int staticInt140;

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return method277((Class23) var1, (Class23) var2);
	}

	int method277(Class23 var1, Class23 var2) {
		return var1.aClass61_1.price < var2.aClass61_1.price ? -1
				: var2.aClass61_1.price == var1.aClass61_1.price ? 0 : 1;
	}

}
