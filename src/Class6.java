import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Class6 {

	static int[] staticIntArray13;
	public static Class10 staticClass10_1;
	public static String staticString18;
	static int staticInt25 = 4;
	int anInt15 = 1;
	LinkedHashMap aLinkedHashMap1 = new LinkedHashMap();
	boolean aBool3;
	boolean aBool2;

	Class6(Stream var1) {
		if (var1 != null && var1.buf != null) {
			int var2 = var1.method367();
			if (var2 >= 0 && var2 <= staticInt25) {
				if (var1.method367() == 1) {
					aBool3 = true;
				}

				if (var2 > 1) {
					aBool2 = var1.method367() == 1;
				}

				if (var2 > 3) {
					anInt15 = var1.method367();
				}

				if (var2 > 2) {
					int var3 = var1.method367();

					for (int var5 = 0; var5 < var3; var5++) {
						int var4 = var1.readInt();
						int var6 = var1.readInt();
						aLinkedHashMap1.put(Integer.valueOf(var4), Integer.valueOf(var6));
					}
				}
			} else {
				method24(true);
			}
		} else {
			method24(true);
		}

	}

	Stream method23() {
		Stream var1 = new Stream(100);
		var1.writeByte(staticInt25);
		var1.writeByte(aBool3 ? 1 : 0);
		var1.writeByte(aBool2 ? 1 : 0);
		var1.writeByte(anInt15);
		var1.writeByte(aLinkedHashMap1.size());
		Iterator var3 = aLinkedHashMap1.entrySet().iterator();

		while (var3.hasNext()) {
			Entry var2 = (Entry) var3.next();
			var1.writeInt(((Integer) var2.getKey()).intValue());
			var1.writeInt(((Integer) var2.getValue()).intValue());
		}

		return var1;
	}

	void method24(boolean var1) {
	}

	Class6() {
		method24(true);
	}

}
