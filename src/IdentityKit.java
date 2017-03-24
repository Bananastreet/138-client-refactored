public class IdentityKit extends Cacheable {

	static FileStore staticJs5Index12;
	static FileStore staticJs5Index13;
	static Js5IndexImpl staticJs5IndexImpl12;
	static Cache staticCache8 = new Cache(64);
	public int anInt433 = -1;
	int[] anIntArray104 = new int[] { -1, -1, -1, -1, -1 };
	public boolean aBool54 = false;
	int[] anIntArray103;
	short[] aShortArray4;
	short[] aShortArray5;
	short[] aShortArray3;
	short[] aShortArray2;

	void method480(ByteBuf var1) {
		while (true) {
			int var2 = var1.readUByte();
			if (var2 == 0) {
				return;
			}

			method484(var1, var2);
		}
	}

	public boolean method481() {
		boolean var1 = true;

		for (int var2 = 0; var2 < 5; var2++) {
			if (anIntArray104[var2] != -1 && !staticJs5Index13.method276(anIntArray104[var2], 0)) {
				var1 = false;
			}
		}

		return var1;
	}

	public boolean method482() {
		if (anIntArray103 == null) {
			return true;
		} else {
			boolean var1 = true;

			for (int var2 = 0; var2 < anIntArray103.length; var2++) {
				if (!staticJs5Index13.method276(anIntArray103[var2], 0)) {
					var1 = false;
				}
			}

			return var1;
		}
	}

	public RenderableSub3 method483() {
		if (anIntArray103 == null) {
			return null;
		} else {
			RenderableSub3[] var3 = new RenderableSub3[anIntArray103.length];

			for (int var4 = 0; var4 < anIntArray103.length; var4++) {
				var3[var4] = Static.staticMethod434(staticJs5Index13, anIntArray103[var4], 0);
			}

			RenderableSub3 var41;
			if (var3.length == 1) {
				var41 = var3[0];
			} else {
				var41 = new RenderableSub3(var3, var3.length);
			}

			int var2;
			if (aShortArray4 != null) {
				for (var2 = 0; var2 < aShortArray4.length; var2++) {
					var41.method585(aShortArray4[var2], aShortArray5[var2]);
				}
			}

			if (aShortArray3 != null) {
				for (var2 = 0; var2 < aShortArray3.length; var2++) {
					var41.method579(aShortArray3[var2], aShortArray2[var2]);
				}
			}

			return var41;
		}
	}

	void method484(ByteBuf var1, int var2) {
		if (var2 == 1) {
			anInt433 = var1.readUByte();
		} else {
			int var3;
			int var4;
			if (var2 == 2) {
				var4 = var1.readUByte();
				anIntArray103 = new int[var4];

				for (var3 = 0; var3 < var4; var3++) {
					anIntArray103[var3] = var1.readUShort();
				}
			} else if (var2 == 3) {
				aBool54 = true;
			} else if (var2 == 40) {
				var4 = var1.readUByte();
				aShortArray4 = new short[var4];
				aShortArray5 = new short[var4];

				for (var3 = 0; var3 < var4; var3++) {
					aShortArray4[var3] = (short) var1.readUShort();
					aShortArray5[var3] = (short) var1.readUShort();
				}
			} else if (var2 == 41) {
				var4 = var1.readUByte();
				aShortArray3 = new short[var4];
				aShortArray2 = new short[var4];

				for (var3 = 0; var3 < var4; var3++) {
					aShortArray3[var3] = (short) var1.readUShort();
					aShortArray2[var3] = (short) var1.readUShort();
				}
			} else if (var2 >= 60 && var2 < 70) {
				anIntArray104[var2 - 60] = var1.readUShort();
			}
		}

	}

	public RenderableSub3 method485() {
		RenderableSub3[] var1 = new RenderableSub3[5];
		int var2 = 0;

		for (int var5 = 0; var5 < 5; var5++) {
			if (anIntArray104[var5] != -1) {
				var1[var2++] = Static.staticMethod434(staticJs5Index13, anIntArray104[var5], 0);
			}
		}

		RenderableSub3 var51 = new RenderableSub3(var1, var2);
		int var4;
		if (aShortArray4 != null) {
			for (var4 = 0; var4 < aShortArray4.length; var4++) {
				var51.method585(aShortArray4[var4], aShortArray5[var4]);
			}
		}

		if (aShortArray3 != null) {
			for (var4 = 0; var4 < aShortArray3.length; var4++) {
				var51.method579(aShortArray3[var4], aShortArray2[var4]);
			}
		}

		return var51;
	}

}
