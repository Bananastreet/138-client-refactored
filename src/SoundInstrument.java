import java.util.Random;

public class SoundInstrument {

	static int[] staticIntArray26 = new int['\u8000'];
	static int[] staticIntArray27;
	static int[] staticIntArray25;
	static int[] staticIntArray28;
	static int[] staticIntArray29;
	static int[] staticIntArray30;
	static int[] staticIntArray31;
	static int[] staticIntArray32;
	int anInt44 = 0;
	int anInt45 = 100;
	int anInt47 = 500;
	int anInt46 = 0;
	int[] anIntArray22 = new int[5];
	int[] anIntArray23 = new int[5];
	int[] anIntArray24 = new int[5];
	MidiSequence aClass14_4;
	MidiSequence aClass14_1;
	MidiSequence aClass14_3;
	MidiSequence aClass14_2;
	MidiSequence aClass14_5;
	MidiSequence aClass14_8;
	MidiSequence aClass14_6;
	MidiSequence aClass14_9;
	Class18 aClass18_1;
	MidiSequence aClass14_7;

	static {
		Random var1 = new Random(0L);

		int var0;
		for (var0 = 0; var0 < '\u8000'; var0++) {
			staticIntArray26[var0] = (var1.nextInt() & 0x2) - 1;
		}

		staticIntArray27 = new int['\u8000'];

		for (var0 = 0; var0 < '\u8000'; var0++) {
			staticIntArray27[var0] = (int) (Math.sin(var0 / 5215.1903D) * 16384.0D);
		}

		staticIntArray25 = new int[220500];
		staticIntArray28 = new int[5];
		staticIntArray29 = new int[5];
		staticIntArray30 = new int[5];
		staticIntArray31 = new int[5];
		staticIntArray32 = new int[5];
	}

	final int[] method59(int var1, int var2) {
		Static.staticMethod218(staticIntArray25, 0, var1);
		if (var2 < 10) {
			return staticIntArray25;
		} else {
			double var5 = var1 / (var2 + 0.0D);
			aClass14_4.method50();
			aClass14_1.method50();
			int var15 = 0;
			int var16 = 0;
			int var11 = 0;
			if (aClass14_3 != null) {
				aClass14_3.method50();
				aClass14_2.method50();
				var15 = (int) ((aClass14_3.anInt28 - aClass14_3.anInt30) * 32.768D / var5);
				var16 = (int) (aClass14_3.anInt30 * 32.768D / var5);
			}

			int var12 = 0;
			int var17 = 0;
			int var14 = 0;
			if (aClass14_5 != null) {
				aClass14_5.method50();
				aClass14_8.method50();
				var12 = (int) ((aClass14_5.anInt28 - aClass14_5.anInt30) * 32.768D / var5);
				var17 = (int) (aClass14_5.anInt30 * 32.768D / var5);
			}

			int var13;
			for (var13 = 0; var13 < 5; var13++) {
				if (anIntArray22[var13] != 0) {
					staticIntArray28[var13] = 0;
					staticIntArray29[var13] = (int) (anIntArray24[var13] * var5);
					staticIntArray30[var13] = (anIntArray22[var13] << 14) / 100;
					staticIntArray31[var13] = (int) ((aClass14_4.anInt28 - aClass14_4.anInt30) * 32.768D
							* Math.pow(1.0057929410678534D, anIntArray23[var13]) / var5);
					staticIntArray32[var13] = (int) (aClass14_4.anInt30 * 32.768D / var5);
				}
			}

			int var3;
			int var4;
			int var7;
			int var9;
			for (var13 = 0; var13 < var1; var13++) {
				var3 = aClass14_4.method48(var1);
				var9 = aClass14_1.method48(var1);
				if (aClass14_3 != null) {
					var7 = aClass14_3.method48(var1);
					var4 = aClass14_2.method48(var1);
					var3 += method61(var11, var4, aClass14_3.anInt33) >> 1;
					var11 += (var7 * var15 >> 16) + var16;
				}

				if (aClass14_5 != null) {
					var7 = aClass14_5.method48(var1);
					var4 = aClass14_8.method48(var1);
					var9 = var9 * ((method61(var14, var4, aClass14_5.anInt33) >> 1) + '\u8000') >> 15;
					var14 += (var7 * var12 >> 16) + var17;
				}

				for (var7 = 0; var7 < 5; var7++) {
					if (anIntArray22[var7] != 0) {
						var4 = var13 + staticIntArray29[var7];
						if (var4 < var1) {
							staticIntArray25[var4] += method61(staticIntArray28[var7],
									var9 * staticIntArray30[var7] >> 15, aClass14_4.anInt33);
							staticIntArray28[var7] += (var3 * staticIntArray31[var7] >> 16) + staticIntArray32[var7];
						}
					}
				}
			}

			int var18;
			if (aClass14_6 != null) {
				aClass14_6.method50();
				aClass14_9.method50();
				var13 = 0;
				boolean var10 = true;

				for (var7 = 0; var7 < var1; var7++) {
					var4 = aClass14_6.method48(var1);
					var18 = aClass14_9.method48(var1);
					if (var10) {
						var3 = aClass14_6.anInt30 + ((aClass14_6.anInt28 - aClass14_6.anInt30) * var4 >> 8);
					} else {
						var3 = aClass14_6.anInt30 + ((aClass14_6.anInt28 - aClass14_6.anInt30) * var18 >> 8);
					}

					var13 += 256;
					if (var13 >= var3) {
						var13 = 0;
						var10 = !var10;
					}

					if (var10) {
						staticIntArray25[var7] = 0;
					}
				}
			}

			if (anInt44 > 0 && anInt45 > 0) {
				var13 = (int) (anInt44 * var5);

				for (var3 = var13; var3 < var1; var3++) {
					staticIntArray25[var3] += staticIntArray25[var3 - var13] * anInt45 / 100;
				}
			}

			if (aClass18_1.anIntArray26[0] > 0 || aClass18_1.anIntArray26[1] > 0) {
				aClass14_7.method50();
				var13 = aClass14_7.method48(var1 + 1);
				var3 = aClass18_1.method64(0, var13 / 65536.0F);
				var9 = aClass18_1.method64(1, var13 / 65536.0F);
				if (var1 >= var3 + var9) {
					var7 = 0;
					var4 = var9;
					if (var9 > var1 - var3) {
						var4 = var1 - var3;
					}

					int var19;
					while (var7 < var4) {
						var18 = (int) ((long) staticIntArray25[var7 + var3] * (long) Class18.staticInt34 >> 16);

						for (var19 = 0; var19 < var3; var19++) {
							var18 += (int) ((long) staticIntArray25[var7 + var3 - 1 - var19]
									* (long) Class18.staticIntArrayArray4[0][var19] >> 16);
						}

						for (var19 = 0; var19 < var7; var19++) {
							var18 -= (int) ((long) staticIntArray25[var7 - 1 - var19]
									* (long) Class18.staticIntArrayArray4[1][var19] >> 16);
						}

						staticIntArray25[var7] = var18;
						var13 = aClass14_7.method48(var1 + 1);
						++var7;
					}

					var4 = 128;

					while (true) {
						if (var4 > var1 - var3) {
							var4 = var1 - var3;
						}

						int var20;
						while (var7 < var4) {
							var19 = (int) ((long) staticIntArray25[var7 + var3] * (long) Class18.staticInt34 >> 16);

							for (var20 = 0; var20 < var3; var20++) {
								var19 += (int) ((long) staticIntArray25[var7 + var3 - 1 - var20]
										* (long) Class18.staticIntArrayArray4[0][var20] >> 16);
							}

							for (var20 = 0; var20 < var9; var20++) {
								var19 -= (int) ((long) staticIntArray25[var7 - 1 - var20]
										* (long) Class18.staticIntArrayArray4[1][var20] >> 16);
							}

							staticIntArray25[var7] = var19;
							var13 = aClass14_7.method48(var1 + 1);
							++var7;
						}

						if (var7 >= var1 - var3) {
							while (var7 < var1) {
								var19 = 0;

								for (var20 = var7 + var3 - var1; var20 < var3; var20++) {
									var19 += (int) ((long) staticIntArray25[var7 + var3 - 1 - var20]
											* (long) Class18.staticIntArrayArray4[0][var20] >> 16);
								}

								for (var20 = 0; var20 < var9; var20++) {
									var19 -= (int) ((long) staticIntArray25[var7 - 1 - var20]
											* (long) Class18.staticIntArrayArray4[1][var20] >> 16);
								}

								staticIntArray25[var7] = var19;
								aClass14_7.method48(var1 + 1);
								++var7;
							}
							break;
						}

						var3 = aClass18_1.method64(0, var13 / 65536.0F);
						var9 = aClass18_1.method64(1, var13 / 65536.0F);
						var4 += 128;
					}
				}
			}

			for (var13 = 0; var13 < var1; var13++) {
				if (staticIntArray25[var13] < -32768) {
					staticIntArray25[var13] = -32768;
				}

				if (staticIntArray25[var13] > 32767) {
					staticIntArray25[var13] = 32767;
				}
			}

			return staticIntArray25;
		}
	}

	final void method60(ByteBuf var1) {
		aClass14_4 = new MidiSequence();
		aClass14_4.method49(var1);
		aClass14_1 = new MidiSequence();
		aClass14_1.method49(var1);
		int var2 = var1.readUByte();
		if (var2 != 0) {
			--var1.position;
			aClass14_3 = new MidiSequence();
			aClass14_3.method49(var1);
			aClass14_2 = new MidiSequence();
			aClass14_2.method49(var1);
		}

		var2 = var1.readUByte();
		if (var2 != 0) {
			--var1.position;
			aClass14_5 = new MidiSequence();
			aClass14_5.method49(var1);
			aClass14_8 = new MidiSequence();
			aClass14_8.method49(var1);
		}

		var2 = var1.readUByte();
		if (var2 != 0) {
			--var1.position;
			aClass14_6 = new MidiSequence();
			aClass14_6.method49(var1);
			aClass14_9 = new MidiSequence();
			aClass14_9.method49(var1);
		}

		for (int var4 = 0; var4 < 10; var4++) {
			int var3 = var1.method379();
			if (var3 == 0) {
				break;
			}

			anIntArray22[var4] = var3;
			anIntArray23[var4] = var1.method366();
			anIntArray24[var4] = var1.method379();
		}

		anInt44 = var1.method379();
		anInt45 = var1.method379();
		anInt47 = var1.readUShort();
		anInt46 = var1.readUShort();
		aClass18_1 = new Class18();
		aClass14_7 = new MidiSequence();
		aClass18_1.method65(var1, aClass14_7);
	}

	final int method61(int var1, int var2, int var3) {
		return var3 == 1 ? (var1 & 0x7fff) < 16384 ? var2 : -var2
				: var3 == 2 ? staticIntArray27[var1 & 0x7fff] * var2 >> 14
						: var3 == 3 ? ((var1 & 0x7fff) * var2 >> 14) - var2
								: var3 == 4 ? staticIntArray26[var1 / 2607 & 0x7fff] * var2 : 0;
	}

}
