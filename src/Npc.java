public final class Npc extends Mob {

	public static boolean[] staticBoolArray12;
	NpcDefinition aNpcDef1;

	protected final Model method434() {
		if (aNpcDef1 == null) {
			return null;
		} else {
			AnimationDefintion var3 = anInt612 != -1 && anInt615 == 0 ? Static.staticMethod210(anInt612) : null;
			AnimationDefintion var4 = anInt590 != -1 && (anInt594 != anInt590 || var3 == null) ? Static.staticMethod210(anInt590)
					: null;
			Model var1 = aNpcDef1.method541(var3, anInt613, var4, anInt610);
			if (var1 == null) {
				return null;
			} else {
				var1.method592();
				anInt609 = var1.anInt421;
				if (anInt596 != -1 && anInt616 != -1) {
					Model var2 = Static.staticMethod322(anInt596).method548(anInt616);
					if (var2 != null) {
						var2.method601(0, -anInt620, 0);
						Model[] var5 = new Model[] { var1, var2 };
						var1 = new Model(var5, 2);
					}
				}

				if (aNpcDef1.tileSpacesOccupied == 1) {
					var1.aBool80 = true;
				}

				return var1;
			}
		}
	}

	final void method656(int var1, byte var2) {
		int var3 = anIntArray127[0];
		int var4 = anIntArray122[0];
		if (var1 == 0) {
			--var3;
			++var4;
		}

		if (var1 == 1) {
			++var4;
		}

		if (var1 == 2) {
			++var3;
			++var4;
		}

		if (var1 == 3) {
			--var3;
		}

		if (var1 == 4) {
			++var3;
		}

		if (var1 == 5) {
			--var3;
			--var4;
		}

		if (var1 == 6) {
			--var4;
		}

		if (var1 == 7) {
			++var3;
			--var4;
		}

		if (anInt612 != -1 && Static.staticMethod210(anInt612).anInt567 == 1) {
			anInt612 = -1;
		}

		if (anInt632 < 9) {
			++anInt632;
		}

		for (int var5 = anInt632; var5 > 0; --var5) {
			anIntArray127[var5] = anIntArray127[var5 - 1];
			anIntArray122[var5] = anIntArray122[var5 - 1];
			aByteArray24[var5] = aByteArray24[var5 - 1];
		}

		anIntArray127[0] = var3;
		anIntArray122[0] = var4;
		aByteArray24[0] = var2;
	}

	final boolean method565() {
		return aNpcDef1 != null;
	}

	final void method657(int var1, int var2, boolean var3) {
		if (anInt612 != -1 && Static.staticMethod210(anInt612).anInt567 == 1) {
			anInt612 = -1;
		}

		if (!var3) {
			int var5 = var1 - anIntArray127[0];
			int var6 = var2 - anIntArray122[0];
			if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
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
				aByteArray24[0] = 1;
				return;
			}
		}

		anInt632 = 0;
		anInt599 = 0;
		anInt633 = 0;
		anIntArray127[0] = var1;
		anIntArray122[0] = var2;
		anInt628 = anInt626 * 64 + anIntArray127[0] * 128;
		anInt591 = anInt626 * 64 + anIntArray122[0] * 128;
	}

}
