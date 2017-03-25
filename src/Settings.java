import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Settings {

	static int[] staticIntArray13;
	public static Class10 staticClass10_1;
	public static String staticString18;
	static int amount = 4;
	int screenType = 1;
	LinkedHashMap<Integer, Integer> aLinkedHashMap1 = new LinkedHashMap<>();
	boolean hideRoofs;
	boolean muted;

	Settings(ByteBuf var1) {
		if (var1 != null && var1.buf != null) {
			int var2 = var1.readUByte();
			if (var2 >= 0 && var2 <= amount) {
				if (var1.readUByte() == 1) {
					hideRoofs = true;
				}

				if (var2 > 1) {
					muted = var1.readUByte() == 1;
				}

				if (var2 > 3) {
					screenType = var1.readUByte();
				}

				if (var2 > 2) {
					int var3 = var1.readUByte();

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

	ByteBuf method23() {
		ByteBuf var1 = new ByteBuf(100);
		var1.writeByte(amount);		
		var1.writeByte(hideRoofs ? 1 : 0);		
		var1.writeByte(muted ? 1 : 0);		
		var1.writeByte(screenType);		
		var1.writeByte(aLinkedHashMap1.size());
		Iterator<Entry<Integer, Integer>> var3 = aLinkedHashMap1.entrySet().iterator();

		while (var3.hasNext()) {
			Entry<Integer, Integer> var2 = (Entry<Integer, Integer>) var3.next();
			var1.writeInt(((Integer) var2.getKey()).intValue());
			var1.writeInt(((Integer) var2.getValue()).intValue());
		}

		return var1;
	}

	void method24(boolean var1) {
	}

	Settings() {
		method24(true);
	}

}
