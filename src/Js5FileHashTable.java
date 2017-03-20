public class Js5FileHashTable {

	int[] anIntArray35;

	public Js5FileHashTable(int[] var1) {
		int var3;
		for (var3 = 1; var3 <= var1.length + (var1.length >> 1); var3 <<= 1) {
			;
		}

		anIntArray35 = new int[var3 + var3];

		int var4;
		for (var4 = 0; var4 < var3 + var3; var4++) {
			anIntArray35[var4] = -1;
		}

		int var2;
		for (var4 = 0; var4 < var1.length; anIntArray35[var2 + var2 + 1] = var4++) {
			for (var2 = var1[var4] & var3 - 1; anIntArray35[var2 + var2 + 1] != -1; var2 = var2 + 1 & var3 - 1) {
				;
			}

			anIntArray35[var2 + var2] = var1[var4];
		}

	}

	public int method173(int var1) {
		int var2 = (anIntArray35.length >> 1) - 1;
		int var3 = var1 & var2;

		while (true) {
			int var4 = anIntArray35[var3 + var3 + 1];
			if (var4 == -1) {
				return -1;
			}

			if (anIntArray35[var3 + var3] == var1) {
				return var4;
			}

			var3 = var3 + 1 & var2;
		}
	}

}
