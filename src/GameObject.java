public class GameObject extends Renderable {

	static int staticInt332;
	int anInt648;
	int anInt645;
	AnimDef anAnimDef3;
	int anInt643;
	int anInt647;
	int anInt650;
	int anInt649;
	int anInt646;
	int anInt644;

	protected final Model method434() {
		if (anAnimDef3 != null) {
			int var12 = Game.staticInt166 - anInt648;
			if (var12 > 100 && anAnimDef3.anInt562 > 0) {
				var12 = 100;
			}

			label47: {
				do {
					do {
						if (var12 <= anAnimDef3.anIntArray119[anInt645]) {
							break label47;
						}

						var12 -= anAnimDef3.anIntArray119[anInt645];
						++anInt645;
					} while (anInt645 < anAnimDef3.anIntArray121.length);

					anInt645 -= anAnimDef3.anInt562;
				} while (anInt645 >= 0 && anInt645 < anAnimDef3.anIntArray121.length);

				anAnimDef3 = null;
			}

			anInt648 = Game.staticInt166 - var12;
		}

		ObjectDefinition var121 = Static.staticMethod394(anInt643);
		if (var121.anIntArray111 != null) {
			var121 = var121.method516();
		}

		if (var121 == null) {
			return null;
		} else {
			int var2;
			int var4;
			if (anInt650 != 1 && anInt650 != 3) {
				var4 = var121.anInt485;
				var2 = var121.anInt486;
			} else {
				var4 = var121.anInt486;
				var2 = var121.anInt485;
			}

			int var9 = (var4 >> 1) + anInt646;
			int var10 = anInt646 + (var4 + 1 >> 1);
			int var11 = anInt644 + (var2 >> 1);
			int var3 = anInt644 + (1 + var2 >> 1);
			int[][] var5 = Static.staticIntArrayArrayArray1[anInt649];
			int var7 = var5[var10][var3] + var5[var9][var3] + var5[var9][var11] + var5[var10][var11] >> 2;
			int var6 = (anInt646 << 7) + (var4 << 6);
			int var8 = (anInt644 << 7) + (var2 << 6);
			return var121.method512(anInt647, anInt650, var5, var6, var7, var8, anAnimDef3, anInt645);
		}
	}

	GameObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		anInt643 = var1;
		anInt647 = var2;
		anInt650 = var3;
		anInt649 = var4;
		anInt646 = var5;
		anInt644 = var6;
		if (var7 != -1) {
			anAnimDef3 = Static.staticMethod210(var7);
			anInt645 = 0;
			anInt648 = Game.staticInt166 - 1;
			if (anAnimDef3.anInt568 == 0 && var9 != null && var9 instanceof GameObject) {
				GameObject var10 = (GameObject) var9;
				if (var10.anAnimDef3 == anAnimDef3) {
					anInt645 = var10.anInt645 * 1;
					anInt648 = var10.anInt648 * 1;
					return;
				}
			}

			if (var8 && anAnimDef3.anInt562 != -1) {
				anInt645 = (int) (Math.random() * anAnimDef3.anIntArray121.length);
				anInt648 -= (int) (Math.random() * anAnimDef3.anIntArray119[anInt645]);
			}
		}

	}

}
