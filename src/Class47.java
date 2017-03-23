public class Class47 {

	protected static int gameHeight;
	
	static byte[][] staticByteArrayArray6;
	int[] anIntArray44;
	byte[] aByteArray14;
	int[] anIntArray45;

	public int method239(byte[] var1, int var2, int var3, byte[] var4, int var5) {
		int var6 = 0;
		int var12 = var5 << 3;

		for (var3 += var2; var2 < var3; var2++) {
			int var9 = var1[var2] & 0xff;
			int var10 = anIntArray44[var9];
			byte var11 = aByteArray14[var9];
			if (var11 == 0) {
				throw new RuntimeException("");
			}

			int var7 = var12 >> 3;
			int var13 = var12 & 0x7;
			var6 &= -var13 >> 31;
			int var8 = var7 + (var11 + var13 - 1 >> 3);
			var13 += 24;
			var4[var7] = (byte) (var6 |= var10 >>> var13);
			if (var7 < var8) {
				++var7;
				var13 -= 8;
				var4[var7] = (byte) (var6 = var10 >>> var13);
				if (var7 < var8) {
					++var7;
					var13 -= 8;
					var4[var7] = (byte) (var6 = var10 >>> var13);
					if (var7 < var8) {
						++var7;
						var13 -= 8;
						var4[var7] = (byte) (var6 = var10 >>> var13);
						if (var7 < var8) {
							++var7;
							var13 -= 8;
							var4[var7] = (byte) (var6 = var10 << -var13);
						}
					}
				}
			}

			var12 += var11;
		}

		return (7 + var12 >> 3) - var5;
	}

	public int method240(byte[] var1, int var2, byte[] var3, int var4, int var5) {
		if (var5 == 0) {
			return 0;
		} else {
			int var6 = 0;
			var5 += var4;
			int var7 = var2;

			while (true) {
				byte var8 = var1[var7];
				if (var8 < 0) {
					var6 = anIntArray45[var6];
				} else {
					++var6;
				}

				int var9;
				if ((var9 = anIntArray45[var6]) < 0) {
					var3[var4++] = (byte) ~var9;
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 0x40) != 0) {
					var6 = anIntArray45[var6];
				} else {
					++var6;
				}

				if ((var9 = anIntArray45[var6]) < 0) {
					var3[var4++] = (byte) ~var9;
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 0x20) != 0) {
					var6 = anIntArray45[var6];
				} else {
					++var6;
				}

				if ((var9 = anIntArray45[var6]) < 0) {
					var3[var4++] = (byte) ~var9;
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 0x10) != 0) {
					var6 = anIntArray45[var6];
				} else {
					++var6;
				}

				if ((var9 = anIntArray45[var6]) < 0) {
					var3[var4++] = (byte) ~var9;
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 0x8) != 0) {
					var6 = anIntArray45[var6];
				} else {
					++var6;
				}

				if ((var9 = anIntArray45[var6]) < 0) {
					var3[var4++] = (byte) ~var9;
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 0x4) != 0) {
					var6 = anIntArray45[var6];
				} else {
					++var6;
				}

				if ((var9 = anIntArray45[var6]) < 0) {
					var3[var4++] = (byte) ~var9;
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 0x2) != 0) {
					var6 = anIntArray45[var6];
				} else {
					++var6;
				}

				if ((var9 = anIntArray45[var6]) < 0) {
					var3[var4++] = (byte) ~var9;
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 0x1) != 0) {
					var6 = anIntArray45[var6];
				} else {
					++var6;
				}

				if ((var9 = anIntArray45[var6]) < 0) {
					var3[var4++] = (byte) ~var9;
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				++var7;
			}

			return 1 + var7 - var2;
		}
	}

	public Class47(byte[] var1) {
		int var6 = var1.length;
		anIntArray44 = new int[var6];
		aByteArray14 = var1;
		int[] var4 = new int[33];
		anIntArray45 = new int[8];
		int var3 = 0;

		for (int var5 = 0; var5 < var6; var5++) {
			byte var7 = var1[var5];
			if (var7 != 0) {
				int var13 = 1 << 32 - var7;
				int var8 = var4[var7];
				anIntArray44[var5] = var8;
				int var2;
				int var9;
				int var10;
				int var11;
				if ((var8 & var13) != 0) {
					var9 = var4[var7 - 1];
				} else {
					var9 = var8 | var13;

					for (var2 = var7 - 1; var2 >= 1; --var2) {
						var10 = var4[var2];
						if (var10 != var8) {
							break;
						}

						var11 = 1 << 32 - var2;
						if ((var10 & var11) != 0) {
							var4[var2] = var4[var2 - 1];
							break;
						}

						var4[var2] = var10 | var11;
					}
				}

				var4[var7] = var9;

				for (var2 = var7 + 1; var2 <= 32; var2++) {
					if (var8 == var4[var2]) {
						var4[var2] = var9;
					}
				}

				var2 = 0;

				for (var10 = 0; var10 < var7; var10++) {
					var11 = Integer.MIN_VALUE >>> var10;
					if ((var8 & var11) != 0) {
						if (anIntArray45[var2] == 0) {
							anIntArray45[var2] = var3;
						}

						var2 = anIntArray45[var2];
					} else {
						++var2;
					}

					if (var2 >= anIntArray45.length) {
						int[] var12 = new int[anIntArray45.length * 2];

						for (int var14 = 0; var14 < anIntArray45.length; var14++) {
							var12[var14] = anIntArray45[var14];
						}

						anIntArray45 = var12;
					}

					var11 >>>= 1;
				}

				anIntArray45[var2] = ~var5;
				if (var2 >= var3) {
					var3 = 1 + var2;
				}
			}
		}

	}

}
