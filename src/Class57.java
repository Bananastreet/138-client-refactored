import java.util.Comparator;

final class Class57 implements Comparator {

	static int[] staticIntArray74;
	static Class5 staticClass5_1;
	static int staticInt144;
	static ComputerInfo staticComputerInfo1;

	int method283(Class23 var1, Class23 var2) {
		return var1.aLong14 < var2.aLong14 ? -1 : var1.aLong14 == var2.aLong14 ? 0 : 1;
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return method283((Class23) var1, (Class23) var2);
	}

}
