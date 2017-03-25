public class MidiSequence {

	int anInt34 = 2;
	int[] anIntArray20 = new int[2];
	int[] anIntArray21 = new int[2];
	int anInt31;
	int anInt35;
	int anInt36;
	int anInt32;
	int anInt29;
	int anInt33;
	int anInt30;
	int anInt28;

	final void method47(ByteBuf var1) {
		anInt34 = var1.readUByte();
		anIntArray20 = new int[anInt34];
		anIntArray21 = new int[anInt34];

		for (int var2 = 0; var2 < anInt34; var2++) {
			anIntArray20[var2] = var1.readUShort();
			anIntArray21[var2] = var1.readUShort();
		}

	}

	final int method48(int var1) {
		if (anInt36 >= anInt32) {
			anInt35 = anIntArray21[anInt31++] << 15;
			if (anInt31 >= anInt34) {
				anInt31 = anInt34 - 1;
			}

			anInt32 = (int) (anIntArray20[anInt31] / 65536.0D * var1);
			if (anInt32 > anInt36) {
				anInt29 = ((anIntArray21[anInt31] << 15) - anInt35) / (anInt32 - anInt36);
			}
		}

		anInt35 += anInt29;
		++anInt36;
		return anInt35 - anInt29 >> 15;
	}

	final void method49(ByteBuf var1) {
		anInt33 = var1.readUByte();
		anInt30 = var1.readInt();
		anInt28 = var1.readInt();
		method47(var1);
	}

	final void method50() {
		anInt32 = 0;
		anInt31 = 0;
		anInt29 = 0;
		anInt35 = 0;
		anInt36 = 0;
	}

	MidiSequence() {
		anIntArray20[0] = 0;
		anIntArray20[1] = '\uffff';
		anIntArray21[0] = 0;
		anIntArray21[1] = '\uffff';
	}

}
