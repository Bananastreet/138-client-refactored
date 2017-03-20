import java.awt.Canvas;

public class Class38 {

	public static Canvas staticCanvas1;
	int anInt156 = 0;
	int anInt157 = 0;
	int anInt158;
	int anInt159;
	public int[][] anIntArrayArray5;

	public void method176(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= anInt156;
		var2 -= anInt157;
		if (var3 == 0) {
			if (var4 == 0) {
				method184(var1, var2, 128);
				method184(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				method184(var1, var2, 2);
				method184(var1, 1 + var2, 32);
			}

			if (var4 == 2) {
				method184(var1, var2, 8);
				method184(1 + var1, var2, 128);
			}

			if (var4 == 3) {
				method184(var1, var2, 32);
				method184(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				method184(var1, var2, 1);
				method184(var1 - 1, 1 + var2, 16);
			}

			if (var4 == 1) {
				method184(var1, var2, 4);
				method184(1 + var1, 1 + var2, 64);
			}

			if (var4 == 2) {
				method184(var1, var2, 16);
				method184(1 + var1, var2 - 1, 1);
			}

			if (var4 == 3) {
				method184(var1, var2, 64);
				method184(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				method184(var1, var2, 130);
				method184(var1 - 1, var2, 8);
				method184(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				method184(var1, var2, 10);
				method184(var1, 1 + var2, 32);
				method184(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				method184(var1, var2, 40);
				method184(var1 + 1, var2, 128);
				method184(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				method184(var1, var2, 160);
				method184(var1, var2 - 1, 2);
				method184(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					method184(var1, var2, 65536);
					method184(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					method184(var1, var2, 1024);
					method184(var1, 1 + var2, 16384);
				}

				if (var4 == 2) {
					method184(var1, var2, 4096);
					method184(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					method184(var1, var2, 16384);
					method184(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					method184(var1, var2, 512);
					method184(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					method184(var1, var2, 2048);
					method184(1 + var1, var2 + 1, '\u8000');
				}

				if (var4 == 2) {
					method184(var1, var2, 8192);
					method184(1 + var1, var2 - 1, 512);
				}

				if (var4 == 3) {
					method184(var1, var2, '\u8000');
					method184(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					method184(var1, var2, 66560);
					method184(var1 - 1, var2, 4096);
					method184(var1, 1 + var2, 16384);
				}

				if (var4 == 1) {
					method184(var1, var2, 5120);
					method184(var1, 1 + var2, 16384);
					method184(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					method184(var1, var2, 20480);
					method184(1 + var1, var2, 65536);
					method184(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					method184(var1, var2, 81920);
					method184(var1, var2 - 1, 1024);
					method184(var1 - 1, var2, 4096);
				}
			}
		}

	}

	public void method177(int var1, int var2, int var3, int var4, boolean var5) {
		int var6 = 256;
		if (var5) {
			var6 += 131072;
		}

		var1 -= anInt156;
		var2 -= anInt157;

		for (int var7 = var1; var7 < var3 + var1; var7++) {
			if (var7 >= 0 && var7 < anInt158) {
				for (int var8 = var2; var8 < var2 + var4; var8++) {
					if (var8 >= 0 && var8 < anInt159) {
						method184(var7, var8, var6);
					}
				}
			}
		}

	}

	public Class38(int var1, int var2) {
		anInt158 = var1;
		anInt159 = var2;
		anIntArrayArray5 = new int[anInt158][anInt159];
		method182();
	}

	public void method178(int var1, int var2, int var3, int var4, int var5, boolean var6) {
		int var7 = 256;
		if (var6) {
			var7 += 131072;
		}

		var1 -= anInt156;
		var2 -= anInt157;
		int var8;
		if (var5 == 1 || var5 == 3) {
			var8 = var3;
			var3 = var4;
			var4 = var8;
		}

		for (var8 = var1; var8 < var1 + var3; var8++) {
			if (var8 >= 0 && var8 < anInt158) {
				for (int var9 = var2; var9 < var4 + var2; var9++) {
					if (var9 >= 0 && var9 < anInt159) {
						method180(var8, var9, var7);
					}
				}
			}
		}

	}

	public void method179(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= anInt156;
		var2 -= anInt157;
		if (var3 == 0) {
			if (var4 == 0) {
				method180(var1, var2, 128);
				method180(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				method180(var1, var2, 2);
				method180(var1, 1 + var2, 32);
			}

			if (var4 == 2) {
				method180(var1, var2, 8);
				method180(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				method180(var1, var2, 32);
				method180(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				method180(var1, var2, 1);
				method180(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				method180(var1, var2, 4);
				method180(1 + var1, 1 + var2, 64);
			}

			if (var4 == 2) {
				method180(var1, var2, 16);
				method180(1 + var1, var2 - 1, 1);
			}

			if (var4 == 3) {
				method180(var1, var2, 64);
				method180(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				method180(var1, var2, 130);
				method180(var1 - 1, var2, 8);
				method180(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				method180(var1, var2, 10);
				method180(var1, 1 + var2, 32);
				method180(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				method180(var1, var2, 40);
				method180(1 + var1, var2, 128);
				method180(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				method180(var1, var2, 160);
				method180(var1, var2 - 1, 2);
				method180(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					method180(var1, var2, 65536);
					method180(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					method180(var1, var2, 1024);
					method180(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					method180(var1, var2, 4096);
					method180(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					method180(var1, var2, 16384);
					method180(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					method180(var1, var2, 512);
					method180(var1 - 1, 1 + var2, 8192);
				}

				if (var4 == 1) {
					method180(var1, var2, 2048);
					method180(var1 + 1, var2 + 1, '\u8000');
				}

				if (var4 == 2) {
					method180(var1, var2, 8192);
					method180(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					method180(var1, var2, '\u8000');
					method180(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					method180(var1, var2, 66560);
					method180(var1 - 1, var2, 4096);
					method180(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					method180(var1, var2, 5120);
					method180(var1, var2 + 1, 16384);
					method180(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					method180(var1, var2, 20480);
					method180(var1 + 1, var2, 65536);
					method180(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					method180(var1, var2, 81920);
					method180(var1, var2 - 1, 1024);
					method180(var1 - 1, var2, 4096);
				}
			}
		}

	}

	void method180(int var1, int var2, int var3) {
		anIntArrayArray5[var1][var2] &= ~var3;
	}

	public void method181(int var1, int var2) {
		var1 -= anInt156;
		var2 -= anInt157;
		anIntArrayArray5[var1][var2] &= -262145;
	}

	public void method182() {
		for (int var1 = 0; var1 < anInt158; var1++) {
			for (int var2 = 0; var2 < anInt159; var2++) {
				if (var1 != 0 && var2 != 0 && var1 < anInt158 - 5 && var2 < anInt159 - 5) {
					anIntArrayArray5[var1][var2] = 16777216;
				} else {
					anIntArrayArray5[var1][var2] = 16777215;
				}
			}
		}

	}

	public void method183(int var1, int var2) {
		var1 -= anInt156;
		var2 -= anInt157;
		anIntArrayArray5[var1][var2] |= 2097152;
	}

	void method184(int var1, int var2, int var3) {
		anIntArrayArray5[var1][var2] |= var3;
	}

	public void method185(int var1, int var2) {
		var1 -= anInt156;
		var2 -= anInt157;
		anIntArrayArray5[var1][var2] |= 262144;
	}

}
