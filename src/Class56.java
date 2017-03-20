import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Class56 {

	static Js5IndexImpl staticJs5IndexImpl6;
	static Connection staticConnection3;
	static Widget staticWidget4;
	public static Comparator staticComparator1 = new Class57();
	public static Comparator staticComparator4;
	public static Comparator staticComparator3;
	public static Comparator staticComparator2;
	public final List aList1;

	static {
		new Class62();
		staticComparator4 = new Class51();
		staticComparator3 = new Class60();
		staticComparator2 = new Class34();
	}

	public void method282(Comparator var1, boolean var2) {
		if (var2) {
			Collections.sort(aList1, var1);
		} else {
			Collections.sort(aList1, Collections.reverseOrder(var1));
		}

	}

	public Class56(Stream var1, boolean var2) {
		int var7 = var1.method370();
		boolean var4 = var1.method367() == 1;
		byte var6;
		if (var4) {
			var6 = 1;
		} else {
			var6 = 0;
		}

		int var3 = var1.method370();
		aList1 = new ArrayList(var3);

		for (int var5 = 0; var5 < var3; var5++) {
			aList1.add(new Class23(var1, var6, var7));
		}

	}

}
