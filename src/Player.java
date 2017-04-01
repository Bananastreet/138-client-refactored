public final class Player extends Mob {

	int anInt682;
	int anInt686;
	int anInt687;
	int anInt689;
	int anInt690;
	int anInt692;
	int anInt693;
	int anInt694;
	int anInt695;
	int anInt696;
	int anInt698;
	int anInt700;
	int anInt683 = -1;
	int anInt684 = -1;
	int anInt697;
	String aString40;
	int anInt685;
	int anInt691;
	boolean aBool81;
	Class49 aClass49_1;
	Model aModel1;
	String[] aStringArray11 = new String[3];
	int anInt688;
	int anInt699;
	boolean aBool83;
	boolean aBool82;

	final void decodeAppearance(ByteBuf buffer) {		
		buffer.position = 0;
		int var8 = buffer.readUByte();
		anInt683 = buffer.readByte();
		anInt684 = buffer.readByte();
		int var2 = -1;
		anInt697 = 0;
		int[] var3 = new int[12];

		int var5;
		int var6;
		for (int var9 = 0; var9 < 12; var9++) {
			var5 = buffer.readUByte();
			if (var5 == 0) {
				var3[var9] = 0;
			} else {
				var6 = buffer.readUByte();
				var3[var9] = (var5 << 8) + var6;
				if (var9 == 0 && var3[0] == '\uffff') {
					var2 = buffer.readUShort();
					break;
				}

				if (var3[var9] >= 512) {
					int var7 = Static.staticMethod153(var3[var9] - 512).team;
					if (var7 != 0) {
						anInt697 = var7;
					}
				}
			}
		}

		int[] var91 = new int[5];

		for (var5 = 0; var5 < 5; var5++) {
			var6 = buffer.readUByte();
			if (var6 < 0 || var6 >= Class60.staticShortArrayArray4[var5].length) {
				var6 = 0;
			}

			var91[var5] = var6;
		}

		anInt594 = buffer.readUShort();
		if (anInt594 == '\uffff') {
			anInt594 = -1;
		}

		anInt634 = buffer.readUShort();
		if (anInt634 == '\uffff') {
			anInt634 = -1;
		}

		anInt595 = -anInt634;
		anInt621 = buffer.readUShort();
		if (anInt621 == '\uffff') {
			anInt621 = -1;
		}

		anInt597 = buffer.readUShort();
		if (anInt597 == '\uffff') {
			anInt597 = -1;
		}

		anInt598 = buffer.readUShort();
		if (anInt598 == '\uffff') {
			anInt598 = -1;
		}

		anInt622 = buffer.readUShort();
		if (anInt622 == '\uffff') {
			anInt622 = -1;
		}

		anInt607 = buffer.readUShort();
		if (anInt607 == '\uffff') {
			anInt607 = -1;
		}

		aString40 = buffer.readString();
		if (AbstractClass2Sub1.staticPlayer1 == this) {
			RuntimeExceptionSub1.staticString22 = aString40;
		}

		anInt685 = buffer.readUByte();
		anInt691 = buffer.readUShort();
		aBool81 = buffer.readUByte() == 1;
		if (Client.staticInt207 == 0 && Client.myRights >= 2) {
			aBool81 = false;
		}

		if (aClass49_1 == null) {
			aClass49_1 = new Class49();
		}

		aClass49_1.method252(var3, var91, var8 == 1, var2);
	}

	int method659() {
		return aClass49_1 != null && aClass49_1.anInt198 != -1 ? Static.staticMethod85(aClass49_1.anInt198).anInt538
				: 1;
	}

	protected final Model method434() {
		if (aClass49_1 == null) {
			return null;
		} else {
			AnimationDefintion var2 = anInt612 != -1 && anInt615 == 0 ? Static.staticMethod210(anInt612) : null;
			AnimationDefintion var4 = anInt590 != -1 && !aBool83 && (anInt594 != anInt590 || var2 == null)
					? Static.staticMethod210(anInt590) : null;
			Model var3 = aClass49_1.method248(var2, anInt613, var4, anInt610);
			if (var3 == null) {
				return null;
			} else {
				var3.method592();
				anInt609 = var3.anInt421;
				Model var1;
				Model[] var5;
				if (!aBool83 && anInt596 != -1 && anInt616 != -1) {
					var1 = Static.staticMethod322(anInt596).method548(anInt616);
					if (var1 != null) {
						var1.method601(0, -anInt620, 0);
						var5 = new Model[] { var3, var1 };
						var3 = new Model(var5, 2);
					}
				}

				if (!aBool83 && aModel1 != null) {
					if (Client.staticInt166 >= anInt699) {
						aModel1 = null;
					}

					if (Client.staticInt166 >= anInt688 && Client.staticInt166 < anInt699) {
						var1 = aModel1;
						var1.method601(anInt690 - anInt628, anInt689 - anInt687, anInt696 - anInt591);
						if (anInt630 == 512) {
							var1.method607();
							var1.method607();
							var1.method607();
						} else if (anInt630 == 1024) {
							var1.method607();
							var1.method607();
						} else if (anInt630 == 1536) {
							var1.method607();
						}

						var5 = new Model[] { var3, var1 };
						var3 = new Model(var5, 2);
						if (anInt630 == 512) {
							var1.method607();
						} else if (anInt630 == 1024) {
							var1.method607();
							var1.method607();
						} else if (anInt630 == 1536) {
							var1.method607();
							var1.method607();
							var1.method607();
						}

						var1.method601(anInt628 - anInt690, anInt687 - anInt689, anInt591 - anInt696);
					}
				}

				var3.aBool80 = true;
				return var3;
			}
		}
	}

	final void method660(int var1, int var2, byte var3) {
		if (anInt612 != -1 && Static.staticMethod210(anInt612).anInt567 == 1) {
			anInt612 = -1;
		}

		anInt608 = -1;
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (anIntArray127[0] >= 0 && anIntArray127[0] < 104 && anIntArray122[0] >= 0 && anIntArray122[0] < 104) {
				if (var3 == 2) {
					Player var4 = this;
					int var7 = anIntArray127[0];
					int var5 = anIntArray122[0];
					int var6 = method659();
					if (var7 >= var6 && var7 < 104 - var6 && var5 >= var6 && var5 < 104 - var6 && var1 >= var6
							&& var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) {
						int var11 = method659();
						Client.staticAbstractClass2Sub1_1.anInt153 = var1;
						Client.staticAbstractClass2Sub1_1.anInt152 = var2;
						Client.staticAbstractClass2Sub1_1.anInt154 = 1;
						Client.staticAbstractClass2Sub1_1.anInt155 = 1;
						AbstractClass2Sub1 var12 = Client.staticAbstractClass2Sub1_1;
						int var13 = Static.staticMethod98(var7, var5, var11, var12, Client.staticClass38Array1[anInt698],
								true, Client.staticIntArray122, Client.staticIntArray123);
						if (var13 >= 1) {
							for (int var9 = 0; var9 < var13 - 1; var9++) {
								var4.method662(Client.staticIntArray122[var9], Client.staticIntArray123[var9], (byte) 2);
							}
						}
					}
				}

				method662(var1, var2, var3);
			} else {
				method661(var1, var2);
			}
		} else {
			method661(var1, var2);
		}

	}

	void method661(int var1, int var2) {
		anInt632 = 0;
		anInt599 = 0;
		anInt633 = 0;
		anIntArray127[0] = var1;
		anIntArray122[0] = var2;
		int var3 = method659();
		anInt628 = anIntArray127[0] * 128 + var3 * 64;
		anInt591 = anIntArray122[0] * 128 + var3 * 64;
	}

	final void method662(int var1, int var2, byte var3) {
		if (anInt632 < 9) {
			++anInt632;
		}

		for (int var4 = anInt632; var4 > 0; --var4) {
			anIntArray127[var4] = anIntArray127[var4 - 1];
			anIntArray122[var4] = anIntArray122[var4 - 1];
			aByteArray24[var4] = aByteArray24[var4 - 1];
		}

		anIntArray127[0] = var1;
		anIntArray122[0] = var2;
		aByteArray24[0] = var3;
	}

	final boolean method565() {
		return aClass49_1 != null;
	}

	Player() {
		for (int var1 = 0; var1 < 3; var1++) {
			aStringArray11[var1] = "";
		}

		anInt685 = 0;
		anInt691 = 0;
		anInt688 = 0;
		anInt699 = 0;
		aBool83 = false;
		anInt697 = 0;
		aBool81 = false;
		aBool82 = false;
	}

}
