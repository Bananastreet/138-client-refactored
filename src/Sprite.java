import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public final class Sprite extends Rasterizer2D {

	public int anInt672;
	public int anInt671;
	public int anInt673;
	public int anInt674;
	public int anInt675;
	int anInt670;
	public int[] anIntArray154;

	public Sprite(byte[] var1, Component var2) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(var1);
			MediaTracker var4 = new MediaTracker(var2);
			var4.addImage(var3, 0);
			var4.waitForAll();
			anInt672 = var3.getWidth(var2);
			anInt671 = var3.getHeight(var2);
			anInt673 = anInt672;
			anInt674 = anInt671;
			anInt675 = 0;
			anInt670 = 0;
			anIntArray154 = new int[anInt672 * anInt671];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, anInt672, anInt671, anIntArray154, 0, anInt672);
			var5.grabPixels();
		} catch (InterruptedException var6) {
			;
		}

	}

	public Sprite(int var1, int var2) {
		anIntArray154 = new int[var1 * var2];
		anInt672 = anInt673 = var1;
		anInt671 = anInt674 = var2;
		anInt670 = 0;
		anInt675 = 0;
	}

	public Sprite method632() {
		Sprite var1 = new Sprite(anInt673, anInt674);

		for (int var2 = 0; var2 < anInt671; var2++) {
			for (int var3 = 0; var3 < anInt672; var3++) {
				var1.anIntArray154[(var2 + anInt670) * anInt673 + var3 + anInt675] = anIntArray154[var2 * anInt672
						+ var3];
			}
		}

		return var1;
	}

	public void method633() {
		Static.staticMethod400(anIntArray154, anInt672, anInt671);
	}

	public void method634(int var1) {
		if (anInt672 != anInt673 || anInt671 != anInt674) {
			int var5 = var1;
			if (var1 > anInt675) {
				var5 = anInt675;
			}

			int var6 = var1;
			if (var1 + anInt675 + anInt672 > anInt673) {
				var6 = anInt673 - anInt675 - anInt672;
			}

			int var2 = var1;
			if (var1 > anInt670) {
				var2 = anInt670;
			}

			int var3 = var1;
			if (var1 + anInt670 + anInt671 > anInt674) {
				var3 = anInt674 - anInt670 - anInt671;
			}

			int var7 = anInt672 + var5 + var6;
			int var4 = anInt671 + var2 + var3;
			int[] var9 = new int[var7 * var4];

			for (int var8 = 0; var8 < anInt671; var8++) {
				for (int var10 = 0; var10 < anInt672; var10++) {
					var9[(var8 + var2) * var7 + var10 + var5] = anIntArray154[var8 * anInt672 + var10];
				}
			}

			anIntArray154 = var9;
			anInt672 = var7;
			anInt671 = var4;
			anInt675 -= var5;
			anInt670 -= var2;
		}

	}

	public void method635() {
		int[] var1 = new int[anInt672 * anInt671];
		int var4 = 0;

		for (int var2 = anInt671 - 1; var2 >= 0; --var2) {
			for (int var3 = 0; var3 < anInt672; var3++) {
				var1[var4++] = anIntArray154[var3 + var2 * anInt672];
			}
		}

		anIntArray154 = var1;
		anInt670 = anInt674 - anInt671 - anInt670;
	}

	public void method636(int var1, int var2) {
		var1 += anInt675;
		var2 += anInt670;
		int var3 = var1 + var2 * staticInt330;
		int var5 = 0;
		int var6 = anInt671;
		int var7 = anInt672;
		int var9 = staticInt330 - var7;
		int var8 = 0;
		int var4;
		if (var2 < staticInt328) {
			var4 = staticInt328 - var2;
			var6 -= var4;
			var2 = staticInt328;
			var5 += var4 * var7;
			var3 += var4 * staticInt330;
		}

		if (var2 + var6 > staticInt325) {
			var6 -= var2 + var6 - staticInt325;
		}

		if (var1 < staticInt329) {
			var4 = staticInt329 - var1;
			var7 -= var4;
			var1 = staticInt329;
			var5 += var4;
			var3 += var4;
			var8 += var4;
			var9 += var4;
		}

		if (var1 + var7 > staticInt327) {
			var4 = var1 + var7 - staticInt327;
			var7 -= var4;
			var8 += var4;
			var9 += var4;
		}

		if (var7 > 0 && var6 > 0) {
			Static.staticMethod462(staticIntArray130, anIntArray154, var5, var3, var7, var6, var9, var8);
		}

	}

	public void method637(int var1, int var2) {
		var1 += anInt675;
		var2 += anInt670;
		int var3 = var1 + var2 * staticInt330;
		int var4 = 0;
		int var9 = anInt671;
		int var5 = anInt672;
		int var6 = staticInt330 - var5;
		int var7 = 0;
		int var8;
		if (var2 < staticInt328) {
			var8 = staticInt328 - var2;
			var9 -= var8;
			var2 = staticInt328;
			var4 += var8 * var5;
			var3 += var8 * staticInt330;
		}

		if (var2 + var9 > staticInt325) {
			var9 -= var2 + var9 - staticInt325;
		}

		if (var1 < staticInt329) {
			var8 = staticInt329 - var1;
			var5 -= var8;
			var1 = staticInt329;
			var4 += var8;
			var3 += var8;
			var7 += var8;
			var6 += var8;
		}

		if (var1 + var5 > staticInt327) {
			var8 = var1 + var5 - staticInt327;
			var5 -= var8;
			var7 += var8;
			var6 += var8;
		}

		if (var5 > 0 && var9 > 0) {
			Static.staticMethod463(staticIntArray130, anIntArray154, 0, var4, var3, var5, var9, var6, var7);
		}

	}

	public void method638(int var1, int var2, int var3, int var4) {
		if (var3 > 0 && var4 > 0) {
			int var6 = anInt672;
			int var5 = anInt671;
			int var8 = 0;
			int var9 = 0;
			int var10 = anInt673;
			int var11 = anInt674;
			int var12 = (var10 << 16) / var3;
			int var13 = (var11 << 16) / var4;
			int var7;
			if (anInt675 > 0) {
				var7 = ((anInt675 << 16) + var12 - 1) / var12;
				var1 += var7;
				var8 += var7 * var12 - (anInt675 << 16);
			}

			if (anInt670 > 0) {
				var7 = ((anInt670 << 16) + var13 - 1) / var13;
				var2 += var7;
				var9 += var7 * var13 - (anInt670 << 16);
			}

			if (var6 < var10) {
				var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			if (var5 < var11) {
				var4 = ((var5 << 16) - var9 + var13 - 1) / var13;
			}

			var7 = var1 + var2 * staticInt330;
			int var15 = staticInt330 - var3;
			if (var2 + var4 > staticInt325) {
				var4 -= var2 + var4 - staticInt325;
			}

			int var14;
			if (var2 < staticInt328) {
				var14 = staticInt328 - var2;
				var4 -= var14;
				var7 += var14 * staticInt330;
				var9 += var13 * var14;
			}

			if (var1 + var3 > staticInt327) {
				var14 = var1 + var3 - staticInt327;
				var3 -= var14;
				var15 += var14;
			}

			if (var1 < staticInt329) {
				var14 = staticInt329 - var1;
				var3 -= var14;
				var7 += var14;
				var8 += var12 * var14;
				var15 += var14;
			}

			Static.staticMethod464(staticIntArray130, anIntArray154, 0, var8, var9, var7, var15, var3, var4, var12,
					var13, var6);
		}

	}

	public void method639(int var1, int var2, int var3, int var4) {
		if (var3 == 256) {
			method637(var1, var2);
		} else {
			var1 += anInt675;
			var2 += anInt670;
			int var7 = var1 + var2 * staticInt330;
			int var8 = 0;
			int var5 = anInt671;
			int var6 = anInt672;
			int var9 = staticInt330 - var6;
			int var11 = 0;
			int var10;
			if (var2 < staticInt328) {
				var10 = staticInt328 - var2;
				var5 -= var10;
				var2 = staticInt328;
				var8 += var10 * var6;
				var7 += var10 * staticInt330;
			}

			if (var2 + var5 > staticInt325) {
				var5 -= var2 + var5 - staticInt325;
			}

			if (var1 < staticInt329) {
				var10 = staticInt329 - var1;
				var6 -= var10;
				var1 = staticInt329;
				var8 += var10;
				var7 += var10;
				var11 += var10;
				var9 += var10;
			}

			if (var1 + var6 > staticInt327) {
				var10 = var1 + var6 - staticInt327;
				var6 -= var10;
				var11 += var10;
				var9 += var10;
			}

			if (var6 > 0 && var5 > 0) {
				Static.staticMethod465(staticIntArray130, anIntArray154, 0, var8, var7, var6, var5, var9, var11, var3,
						var4);
			}
		}

	}

	public void method640(int var1, int var2, int var3, int var4, int var5) {
		if (var3 > 0 && var4 > 0) {
			int var15 = anInt672;
			int var8 = anInt671;
			int var9 = 0;
			int var10 = 0;
			int var11 = anInt673;
			int var6 = anInt674;
			int var13 = (var11 << 16) / var3;
			int var7 = (var6 << 16) / var4;
			int var14;
			if (anInt675 > 0) {
				var14 = ((anInt675 << 16) + var13 - 1) / var13;
				var1 += var14;
				var9 += var14 * var13 - (anInt675 << 16);
			}

			if (anInt670 > 0) {
				var14 = ((anInt670 << 16) + var7 - 1) / var7;
				var2 += var14;
				var10 += var14 * var7 - (anInt670 << 16);
			}

			if (var15 < var11) {
				var3 = ((var15 << 16) - var9 + var13 - 1) / var13;
			}

			if (var8 < var6) {
				var4 = ((var8 << 16) - var10 + var7 - 1) / var7;
			}

			var14 = var1 + var2 * staticInt330;
			int var16 = staticInt330 - var3;
			if (var2 + var4 > staticInt325) {
				var4 -= var2 + var4 - staticInt325;
			}

			int var12;
			if (var2 < staticInt328) {
				var12 = staticInt328 - var2;
				var4 -= var12;
				var14 += var12 * staticInt330;
				var10 += var7 * var12;
			}

			if (var1 + var3 > staticInt327) {
				var12 = var1 + var3 - staticInt327;
				var3 -= var12;
				var16 += var12;
			}

			if (var1 < staticInt329) {
				var12 = staticInt329 - var1;
				var3 -= var12;
				var14 += var12;
				var9 += var13 * var12;
				var16 += var12;
			}

			Static.staticMethod467(staticIntArray130, anIntArray154, 0, var9, var10, var14, var16, var3, var4, var13,
					var7, var15, var5);
		}

	}

	public void method641(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
		int var10 = var2 < 0 ? -var2 : 0;
		int var20 = var2 + anInt671 <= var6 ? anInt671 : var6 - var2;
		int var14 = var1 < 0 ? -var1 : 0;
		if (var1 + anInt672 <= var5) {
		} else {
		}

		int var9 = var3 + var1 + var14 + (var4 + var2 + var10) * staticInt330;
		int var16 = var2 + var10;

		for (int var19 = var10; var19 < var20; var19++) {
			int var17 = var7[var16];
			int var18 = var8[var16++];
			int var15 = var9;
			int var13;
			if (var1 < var17) {
				var13 = var17 - var1;
				var15 = var9 + var13 - var14;
			} else {
				var13 = var14;
			}

			int var12;
			if (var1 + anInt672 <= var17 + var18) {
				var12 = anInt672;
			} else {
				var12 = var17 + var18 - var1;
			}

			for (int var11 = var13; var11 < var12; var11++) {
				int var21 = anIntArray154[var11 + var19 * anInt672];
				if (var21 != 0) {
					staticIntArray130[var15++] = var21;
				} else {
					++var15;
				}
			}

			var9 += staticInt330;
		}

	}

	public void method642(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9,
			int[] var10) {
		try {
			int var11 = -var3 / 2;
			int var12 = -var4 / 2;
			int var13 = (int) (Math.sin(var7 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(var7 / 326.11D) * 65536.0D);
			var13 = var13 * var8 >> 8;
			var14 = var14 * var8 >> 8;
			int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
			int var16 = (var6 << 16) + var12 * var14 - var11 * var13;
			int var17 = var1 + var2 * staticInt330;

			for (var2 = 0; var2 < var4; var2++) {
				int var18 = var9[var2];
				int var19 = var17 + var18;
				int var20 = var15 + var14 * var18;
				int var21 = var16 - var13 * var18;

				for (var1 = -var10[var2]; var1 < 0; var1++) {
					staticIntArray130[var19++] = anIntArray154[(var20 >> 16) + (var21 >> 16) * anInt672];
					var20 += var14;
					var21 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += staticInt330;
			}
		} catch (Exception var22) {
			;
		}

	}

	public void method643(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
		try {
			int var10 = -var3 / 2;
			int var11 = -var4 / 2;
			int var12 = (int) (Math.sin(var7) * 65536.0D);
			int var13 = (int) (Math.cos(var7) * 65536.0D);
			var12 = var12 * var9 >> 8;
			var13 = var13 * var9 >> 8;
			int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
			int var15 = (var6 << 16) + var11 * var13 - var10 * var12;
			int var16 = var1 + var2 * staticInt330;

			for (var2 = 0; var2 < var4; var2++) {
				int var17 = var16;
				int var18 = var14;
				int var19 = var15;

				for (var1 = -var3; var1 < 0; var1++) {
					int var20 = anIntArray154[(var18 >> 16) + (var19 >> 16) * anInt672];
					if (var20 != 0) {
						staticIntArray130[var17++] = var20;
					} else {
						++var17;
					}

					var18 += var13;
					var19 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += staticInt330;
			}
		} catch (Exception var21) {
			;
		}

	}

	public void method644(int var1, int var2, int var3, int var4) {
		method645(anInt673 << 3, anInt674 << 3, var1 << 4, var2 << 4, var3, var4);
	}

	void method645(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var6 != 0) {
			var1 -= anInt675 << 4;
			var2 -= anInt670 << 4;
			double var9 = (var5 & 0xffff) * 9.587379924285257E-5D;
			int var11 = (int) Math.floor(Math.sin(var9) * var6 + 0.5D);
			int var12 = (int) Math.floor(Math.cos(var9) * var6 + 0.5D);
			int var13 = -var1 * var12 + -var2 * var11;
			int var25 = -(-var1) * var11 + -var2 * var12;
			int var7 = ((anInt672 << 4) - var1) * var12 + -var2 * var11;
			int var17 = -((anInt672 << 4) - var1) * var11 + -var2 * var12;
			int var18 = -var1 * var12 + ((anInt671 << 4) - var2) * var11;
			int var26 = -(-var1) * var11 + ((anInt671 << 4) - var2) * var12;
			int var20 = ((anInt672 << 4) - var1) * var12 + ((anInt671 << 4) - var2) * var11;
			int var29 = -((anInt672 << 4) - var1) * var11 + ((anInt671 << 4) - var2) * var12;
			int var8;
			int var22;
			if (var13 < var7) {
				var8 = var13;
				var22 = var7;
			} else {
				var8 = var7;
				var22 = var13;
			}

			if (var18 < var8) {
				var8 = var18;
			}

			if (var20 < var8) {
				var8 = var20;
			}

			if (var18 > var22) {
				var22 = var18;
			}

			if (var20 > var22) {
				var22 = var20;
			}

			int var21;
			int var28;
			if (var25 < var17) {
				var21 = var25;
				var28 = var17;
			} else {
				var21 = var17;
				var28 = var25;
			}

			if (var26 < var21) {
				var21 = var26;
			}

			if (var29 < var21) {
				var21 = var29;
			}

			if (var26 > var28) {
				var28 = var26;
			}

			if (var29 > var28) {
				var28 = var29;
			}

			var8 >>= 12;
			var22 = var22 + 4095 >> 12;
			var21 >>= 12;
			var28 = var28 + 4095 >> 12;
			var8 += var3;
			var22 += var3;
			var21 += var4;
			var28 += var4;
			var8 >>= 4;
			var22 = var22 + 15 >> 4;
			var21 >>= 4;
			var28 = var28 + 15 >> 4;
			if (var8 < staticInt329) {
				var8 = staticInt329;
			}

			if (var22 > staticInt327) {
				var22 = staticInt327;
			}

			if (var21 < staticInt328) {
				var21 = staticInt328;
			}

			if (var28 > staticInt325) {
				var28 = staticInt325;
			}

			var22 = var8 - var22;
			if (var22 < 0) {
				var28 = var21 - var28;
				if (var28 < 0) {
					int var30 = var21 * staticInt330 + var8;
					double var32 = 1.6777216E7D / var6;
					int var15 = (int) Math.floor(Math.sin(var9) * var32 + 0.5D);
					int var24 = (int) Math.floor(Math.cos(var9) * var32 + 0.5D);
					int var38 = (var8 << 4) + 8 - var3;
					int var34 = (var21 << 4) + 8 - var4;
					int var35 = (var1 << 8) - (var34 * var15 >> 4);
					int var37 = (var2 << 8) + (var34 * var24 >> 4);
					int var14;
					int var16;
					int var19;
					int var23;
					int var27;
					int var31;
					int var36;
					if (var24 == 0) {
						if (var15 == 0) {
							for (var36 = var28; var36 < 0; var30 += staticInt330) {
								var31 = var30;
								var23 = var35;
								var14 = var37;
								var27 = var22;
								if (var35 >= 0 && var37 >= 0 && var35 - (anInt672 << 12) < 0
										&& var37 - (anInt671 << 12) < 0) {
									for (; var27 < 0; var27++) {
										var19 = anIntArray154[(var14 >> 12) * anInt672 + (var23 >> 12)];
										if (var19 != 0) {
											staticIntArray130[var31++] = var19;
										} else {
											++var31;
										}
									}
								}

								++var36;
							}
						} else if (var15 < 0) {
							for (var36 = var28; var36 < 0; var30 += staticInt330) {
								var31 = var30;
								var23 = var35;
								var14 = var37 + (var38 * var15 >> 4);
								var27 = var22;
								if (var35 >= 0 && var35 - (anInt672 << 12) < 0) {
									if ((var16 = var14 - (anInt671 << 12)) >= 0) {
										var16 = (var15 - var16) / var15;
										var27 = var22 + var16;
										var14 += var15 * var16;
										var31 = var30 + var16;
									}

									if ((var16 = (var14 - var15) / var15) > var27) {
										var27 = var16;
									}

									while (var27 < 0) {
										var19 = anIntArray154[(var14 >> 12) * anInt672 + (var23 >> 12)];
										if (var19 != 0) {
											staticIntArray130[var31++] = var19;
										} else {
											++var31;
										}

										var14 += var15;
										++var27;
									}
								}

								++var36;
								var35 -= var15;
							}
						} else {
							for (var36 = var28; var36 < 0; var30 += staticInt330) {
								var31 = var30;
								var23 = var35;
								var14 = var37 + (var38 * var15 >> 4);
								var27 = var22;
								if (var35 >= 0 && var35 - (anInt672 << 12) < 0) {
									if (var14 < 0) {
										var16 = (var15 - 1 - var14) / var15;
										var27 = var22 + var16;
										var14 += var15 * var16;
										var31 = var30 + var16;
									}

									if ((var16 = (1 + var14 - (anInt671 << 12) - var15) / var15) > var27) {
										var27 = var16;
									}

									while (var27 < 0) {
										var19 = anIntArray154[(var14 >> 12) * anInt672 + (var23 >> 12)];
										if (var19 != 0) {
											staticIntArray130[var31++] = var19;
										} else {
											++var31;
										}

										var14 += var15;
										++var27;
									}
								}

								++var36;
								var35 -= var15;
							}
						}
					} else if (var24 < 0) {
						if (var15 == 0) {
							for (var36 = var28; var36 < 0; var30 += staticInt330) {
								var31 = var30;
								var23 = var35 + (var38 * var24 >> 4);
								var14 = var37;
								var27 = var22;
								if (var37 >= 0 && var37 - (anInt671 << 12) < 0) {
									if ((var16 = var23 - (anInt672 << 12)) >= 0) {
										var16 = (var24 - var16) / var24;
										var27 = var22 + var16;
										var23 += var24 * var16;
										var31 = var30 + var16;
									}

									if ((var16 = (var23 - var24) / var24) > var27) {
										var27 = var16;
									}

									while (var27 < 0) {
										var19 = anIntArray154[(var14 >> 12) * anInt672 + (var23 >> 12)];
										if (var19 != 0) {
											staticIntArray130[var31++] = var19;
										} else {
											++var31;
										}

										var23 += var24;
										++var27;
									}
								}

								++var36;
								var37 += var24;
							}
						} else if (var15 < 0) {
							for (var36 = var28; var36 < 0; var30 += staticInt330) {
								var31 = var30;
								var23 = var35 + (var38 * var24 >> 4);
								var14 = var37 + (var38 * var15 >> 4);
								var27 = var22;
								if ((var16 = var23 - (anInt672 << 12)) >= 0) {
									var16 = (var24 - var16) / var24;
									var27 = var22 + var16;
									var23 += var24 * var16;
									var14 += var15 * var16;
									var31 = var30 + var16;
								}

								if ((var16 = (var23 - var24) / var24) > var27) {
									var27 = var16;
								}

								if ((var16 = var14 - (anInt671 << 12)) >= 0) {
									var16 = (var15 - var16) / var15;
									var27 += var16;
									var23 += var24 * var16;
									var14 += var15 * var16;
									var31 += var16;
								}

								if ((var16 = (var14 - var15) / var15) > var27) {
									var27 = var16;
								}

								while (var27 < 0) {
									var19 = anIntArray154[(var14 >> 12) * anInt672 + (var23 >> 12)];
									if (var19 != 0) {
										staticIntArray130[var31++] = var19;
									} else {
										++var31;
									}

									var23 += var24;
									var14 += var15;
									++var27;
								}

								++var36;
								var35 -= var15;
								var37 += var24;
							}
						} else {
							for (var36 = var28; var36 < 0; var30 += staticInt330) {
								var31 = var30;
								var23 = var35 + (var38 * var24 >> 4);
								var14 = var37 + (var38 * var15 >> 4);
								var27 = var22;
								if ((var16 = var23 - (anInt672 << 12)) >= 0) {
									var16 = (var24 - var16) / var24;
									var27 = var22 + var16;
									var23 += var24 * var16;
									var14 += var15 * var16;
									var31 = var30 + var16;
								}

								if ((var16 = (var23 - var24) / var24) > var27) {
									var27 = var16;
								}

								if (var14 < 0) {
									var16 = (var15 - 1 - var14) / var15;
									var27 += var16;
									var23 += var24 * var16;
									var14 += var15 * var16;
									var31 += var16;
								}

								if ((var16 = (1 + var14 - (anInt671 << 12) - var15) / var15) > var27) {
									var27 = var16;
								}

								while (var27 < 0) {
									var19 = anIntArray154[(var14 >> 12) * anInt672 + (var23 >> 12)];
									if (var19 != 0) {
										staticIntArray130[var31++] = var19;
									} else {
										++var31;
									}

									var23 += var24;
									var14 += var15;
									++var27;
								}

								++var36;
								var35 -= var15;
								var37 += var24;
							}
						}
					} else if (var15 == 0) {
						for (var36 = var28; var36 < 0; var30 += staticInt330) {
							var31 = var30;
							var23 = var35 + (var38 * var24 >> 4);
							var14 = var37;
							var27 = var22;
							if (var37 >= 0 && var37 - (anInt671 << 12) < 0) {
								if (var23 < 0) {
									var16 = (var24 - 1 - var23) / var24;
									var27 = var22 + var16;
									var23 += var24 * var16;
									var31 = var30 + var16;
								}

								if ((var16 = (1 + var23 - (anInt672 << 12) - var24) / var24) > var27) {
									var27 = var16;
								}

								while (var27 < 0) {
									var19 = anIntArray154[(var14 >> 12) * anInt672 + (var23 >> 12)];
									if (var19 != 0) {
										staticIntArray130[var31++] = var19;
									} else {
										++var31;
									}

									var23 += var24;
									++var27;
								}
							}

							++var36;
							var37 += var24;
						}
					} else if (var15 < 0) {
						for (var36 = var28; var36 < 0; var30 += staticInt330) {
							var31 = var30;
							var23 = var35 + (var38 * var24 >> 4);
							var14 = var37 + (var38 * var15 >> 4);
							var27 = var22;
							if (var23 < 0) {
								var16 = (var24 - 1 - var23) / var24;
								var27 = var22 + var16;
								var23 += var24 * var16;
								var14 += var15 * var16;
								var31 = var30 + var16;
							}

							if ((var16 = (1 + var23 - (anInt672 << 12) - var24) / var24) > var27) {
								var27 = var16;
							}

							if ((var16 = var14 - (anInt671 << 12)) >= 0) {
								var16 = (var15 - var16) / var15;
								var27 += var16;
								var23 += var24 * var16;
								var14 += var15 * var16;
								var31 += var16;
							}

							if ((var16 = (var14 - var15) / var15) > var27) {
								var27 = var16;
							}

							while (var27 < 0) {
								var19 = anIntArray154[(var14 >> 12) * anInt672 + (var23 >> 12)];
								if (var19 != 0) {
									staticIntArray130[var31++] = var19;
								} else {
									++var31;
								}

								var23 += var24;
								var14 += var15;
								++var27;
							}

							++var36;
							var35 -= var15;
							var37 += var24;
						}
					} else {
						for (var36 = var28; var36 < 0; var30 += staticInt330) {
							var31 = var30;
							var23 = var35 + (var38 * var24 >> 4);
							var14 = var37 + (var38 * var15 >> 4);
							var27 = var22;
							if (var23 < 0) {
								var16 = (var24 - 1 - var23) / var24;
								var27 = var22 + var16;
								var23 += var24 * var16;
								var14 += var15 * var16;
								var31 = var30 + var16;
							}

							if ((var16 = (1 + var23 - (anInt672 << 12) - var24) / var24) > var27) {
								var27 = var16;
							}

							if (var14 < 0) {
								var16 = (var15 - 1 - var14) / var15;
								var27 += var16;
								var23 += var24 * var16;
								var14 += var15 * var16;
								var31 += var16;
							}

							if ((var16 = (1 + var14 - (anInt671 << 12) - var15) / var15) > var27) {
								var27 = var16;
							}

							while (var27 < 0) {
								var19 = anIntArray154[(var14 >> 12) * anInt672 + (var23 >> 12)];
								if (var19 != 0) {
									staticIntArray130[var31++] = var19;
								} else {
									++var31;
								}

								var23 += var24;
								var14 += var15;
								++var27;
							}

							++var36;
							var35 -= var15;
							var37 += var24;
						}
					}
				}
			}
		}

	}

	Sprite() {
	}

	public void method646(int var1, int var2, int var3) {
		var1 += anInt675;
		var2 += anInt670;
		int var4 = var1 + var2 * staticInt330;
		int var5 = 0;
		int var6 = anInt671;
		int var7 = anInt672;
		int var8 = staticInt330 - var7;
		int var10 = 0;
		int var9;
		if (var2 < staticInt328) {
			var9 = staticInt328 - var2;
			var6 -= var9;
			var2 = staticInt328;
			var5 += var9 * var7;
			var4 += var9 * staticInt330;
		}

		if (var2 + var6 > staticInt325) {
			var6 -= var2 + var6 - staticInt325;
		}

		if (var1 < staticInt329) {
			var9 = staticInt329 - var1;
			var7 -= var9;
			var1 = staticInt329;
			var5 += var9;
			var4 += var9;
			var10 += var9;
			var8 += var9;
		}

		if (var1 + var7 > staticInt327) {
			var9 = var1 + var7 - staticInt327;
			var7 -= var9;
			var10 += var9;
			var8 += var9;
		}

		if (var7 > 0 && var6 > 0) {
			Static.staticMethod466(staticIntArray130, anIntArray154, 0, var5, var4, var7, var6, var8, var10, var3);
		}

	}

	public void method647(int var1) {
		for (int var2 = anInt671 - 1; var2 > 0; --var2) {
			int var4 = var2 * anInt672;

			for (int var3 = anInt672 - 1; var3 > 0; --var3) {
				if (anIntArray154[var3 + var4] == 0 && anIntArray154[var3 + var4 - 1 - anInt672] != 0) {
					anIntArray154[var3 + var4] = var1;
				}
			}
		}

	}

	public void method648() {
		if (anInt672 != anInt673 || anInt671 != anInt674) {
			int[] var3 = new int[anInt673 * anInt674];

			for (int var1 = 0; var1 < anInt671; var1++) {
				for (int var2 = 0; var2 < anInt672; var2++) {
					var3[(var1 + anInt670) * anInt673 + var2 + anInt675] = anIntArray154[var1 * anInt672 + var2];
				}
			}

			anIntArray154 = var3;
			anInt672 = anInt673;
			anInt671 = anInt674;
			anInt675 = 0;
			anInt670 = 0;
		}

	}

	public void method649() {
		int[] var1 = new int[anInt672 * anInt671];
		int var4 = 0;

		for (int var3 = 0; var3 < anInt671; var3++) {
			for (int var2 = anInt672 - 1; var2 >= 0; --var2) {
				var1[var4++] = anIntArray154[var2 + var3 * anInt672];
			}
		}

		anIntArray154 = var1;
		anInt675 = anInt673 - anInt672 - anInt675;
	}

	public Sprite method650() {
		Sprite var1 = new Sprite(anInt672, anInt671);
		var1.anInt673 = anInt673;
		var1.anInt674 = anInt674;
		var1.anInt675 = anInt673 - anInt672 - anInt675;
		var1.anInt670 = anInt670;

		for (int var3 = 0; var3 < anInt671; var3++) {
			for (int var2 = 0; var2 < anInt672; var2++) {
				var1.anIntArray154[var3 * anInt672 + var2] = anIntArray154[var3 * anInt672 + anInt672 - 1 - var2];
			}
		}

		return var1;
	}

	public void method651(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < anIntArray154.length; var4++) {
			int var6 = anIntArray154[var4];
			if (var6 != 0) {
				int var7 = var6 >> 16 & 0xff;
				var7 += var1;
				if (var7 < 1) {
					var7 = 1;
				} else if (var7 > 255) {
					var7 = 255;
				}

				int var5 = var6 >> 8 & 0xff;
				var5 += var2;
				if (var5 < 1) {
					var5 = 1;
				} else if (var5 > 255) {
					var5 = 255;
				}

				int var8 = var6 & 0xff;
				var8 += var3;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}

				anIntArray154[var4] = (var7 << 16) + (var5 << 8) + var8;
			}
		}

	}

	public void method652(int var1) {
		int[] var2 = new int[anInt672 * anInt671];
		int var3 = 0;

		for (int var5 = 0; var5 < anInt671; var5++) {
			for (int var6 = 0; var6 < anInt672; var6++) {
				int var4 = anIntArray154[var3];
				if (var4 == 0) {
					if (var6 > 0 && anIntArray154[var3 - 1] != 0) {
						var4 = var1;
					} else if (var5 > 0 && anIntArray154[var3 - anInt672] != 0) {
						var4 = var1;
					} else if (var6 < anInt672 - 1 && anIntArray154[var3 + 1] != 0) {
						var4 = var1;
					} else if (var5 < anInt671 - 1 && anIntArray154[var3 + anInt672] != 0) {
						var4 = var1;
					}
				}

				var2[var3++] = var4;
			}
		}

		anIntArray154 = var2;
	}

}
