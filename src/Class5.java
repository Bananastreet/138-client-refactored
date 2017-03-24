import java.io.EOFException;

public class Class5 {

	boolean aBool1 = false;
	int[] anIntArray1;
	String[] aStringArray1;
	boolean[] aBoolArray1;
	boolean[] aBoolArray2;
	long aLong2;

	void method13(int var1, int var2) {
		anIntArray1[var1] = var2;
		if (aBoolArray1[var1]) {
			aBool1 = true;
		}

	}

	int method14(int var1) {
		return anIntArray1[var1];
	}

	void method15(int var1, String var2) {
		aStringArray1[var1] = var2;
		if (aBoolArray2[var1]) {
			aBool1 = true;
		}

	}

	String method16(int var1) {
		return aStringArray1[var1];
	}

	Class5() {
		anIntArray1 = new int[Class23.staticJs5IndexImpl2.method263(19)];
		aStringArray1 = new String[Class23.staticJs5IndexImpl2.method263(15)];
		aBoolArray1 = new boolean[anIntArray1.length];

		int var1;
		for (var1 = 0; var1 < anIntArray1.length; var1++) {
			Config19 var5 = (Config19) Config19.staticCache24.get(var1);
			Config19 var4;
			if (var5 != null) {
				var4 = var5;
			} else {
				byte[] var3 = Config19.staticJs5Index26.getFile(19, var1);
				var5 = new Config19();
				if (var3 != null) {
					var5.method532(new ByteBuf(var3));
				}

				Config19.staticCache24.method170(var5, var1);
				var4 = var5;
			}

			aBoolArray1[var1] = var4.aBool65;
		}

		aBoolArray2 = new boolean[aStringArray1.length];

		for (var1 = 0; var1 < aStringArray1.length; var1++) {
			Config15 var51 = Static.staticMethod381(var1);
			aBoolArray2[var1] = var51.aBool64;
		}

		for (var1 = 0; var1 < anIntArray1.length; var1++) {
			anIntArray1[var1] = -1;
		}

		method21();
	}

	FileOnDisk method17(boolean var1) {
		return Static.staticMethod70("2", KeyFocusListener.staticGameType7.aString9, var1);
	}

	void method18() {
		FileOnDisk var1 = method17(true);

		try {
			int var2 = 3;
			int var3 = 0;

			int var4;
			for (var4 = 0; var4 < anIntArray1.length; var4++) {
				if (aBoolArray1[var4] && anIntArray1[var4] != -1) {
					var2 += 6;
					++var3;
				}
			}

			var2 += 2;
			var4 = 0;

			for (int var17 = 0; var17 < aStringArray1.length; var17++) {
				if (aBoolArray2[var17] && aStringArray1[var17] != null) {
					var2 += 2 + Static.staticMethod378(aStringArray1[var17]);
					++var4;
				}
			}

			ByteBuf var171 = new ByteBuf(var2);
			var171.writeByte(1);
			var171.writeShort(var3);

			int var6;
			for (var6 = 0; var6 < anIntArray1.length; var6++) {
				if (aBoolArray1[var6] && anIntArray1[var6] != -1) {
					var171.writeShort(var6);
					var171.writeInt(anIntArray1[var6]);
				}
			}

			var171.writeShort(var4);

			for (var6 = 0; var6 < aStringArray1.length; var6++) {
				if (aBoolArray2[var6] && aStringArray1[var6] != null) {
					var171.writeShort(var6);
					var171.writeString(aStringArray1[var6]);
				}
			}

			var1.method88(var171.buf, 0, var171.position);
		} catch (Exception var15) {
			;
		} finally {
			try {
				var1.method86();
			} catch (Exception var14) {
				;
			}

		}

		aBool1 = false;
		aLong2 = Static.staticMethod297();
	}

	void method19() {
		int var1;
		for (var1 = 0; var1 < anIntArray1.length; var1++) {
			if (!aBoolArray1[var1]) {
				anIntArray1[var1] = -1;
			}
		}

		for (var1 = 0; var1 < aStringArray1.length; var1++) {
			if (!aBoolArray2[var1]) {
				aStringArray1[var1] = null;
			}
		}

	}

	void method20() {
		if (aBool1 && aLong2 < Static.staticMethod297() - 60000L) {
			method18();
		}

	}

	void method21() {
		FileOnDisk var1 = method17(false);

		label182: {
			try {
				byte[] var2 = new byte[(int) var1.method87()];

				int var4;
				for (int var23 = 0; var23 < var2.length; var23 += var4) {
					var4 = var1.method84(var2, var23, var2.length - var23);
					if (var4 == -1) {
						throw new EOFException();
					}
				}

				ByteBuf var231 = new ByteBuf(var2);
				if (var231.buf.length - var231.position < 1) {
					return;
				}

				int var5 = var231.readUByte();
				if (var5 >= 0 && var5 <= 1) {
					int var6 = var231.method370();

					int var7;
					int var8;
					int var9;
					for (var7 = 0; var7 < var6; var7++) {
						var8 = var231.method370();
						var9 = var231.readInt();
						if (aBoolArray1[var8]) {
							anIntArray1[var8] = var9;
						}
					}

					var7 = var231.method370();
					var8 = 0;

					while (true) {
						if (var8 >= var7) {
							break label182;
						}

						var9 = var231.method370();
						String var10 = var231.readString();
						if (aBoolArray2[var9]) {
							aStringArray1[var9] = var10;
						}

						++var8;
					}
				}
			} catch (Exception var21) {
				break label182;
			} finally {
				try {
					var1.method86();
				} catch (Exception var20) {
					;
				}

			}

			return;
		}

		aBool1 = false;
	}

	boolean method22() {
		return aBool1;
	}

}
