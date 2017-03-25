public abstract class AbstractFileStore {

	static GZipDecompressor staticGZipDecompressor1 = new GZipDecompressor();
	static int staticInt138 = 0;
	boolean aBool17;
	boolean aBool18;
	public int anInt201;
	int anInt200;
	int[] anIntArray50;
	int[] anIntArray52;
	int[] anIntArray54;
	int[] anIntArray53;
	int[][] anIntArrayArray9;
	Object[] anObjectArray1;
	Object[][] anObjectArrayArray1;
	int[] anIntArray51;
	Js5FileHashTable aJs5FileHashTable1;
	int[][] anIntArrayArray10;
	Js5FileHashTable[] aJs5FileHashTableArray1;

	public void method255(String var1) {
		var1 = var1.toLowerCase();
		int var2 = aJs5FileHashTable1.method173(Static.staticMethod295(var1));
		if (var2 >= 0) {
			method257(var2);
		}

	}

	public byte[] method256(int var1, int var2, int[] var3) {
		if (var1 >= 0 && var1 < anObjectArrayArray1.length && anObjectArrayArray1[var1] != null && var2 >= 0
				&& var2 < anObjectArrayArray1[var1].length) {
			if (anObjectArrayArray1[var1][var2] == null) {
				boolean var5 = method266(var1, var3);
				if (!var5) {
					method275(var1);
					var5 = method266(var1, var3);
					if (!var5) {
						return null;
					}
				}
			}

			byte[] var51 = Static.staticMethod84(anObjectArrayArray1[var1][var2], false);
			if (aBool18) {
				anObjectArrayArray1[var1][var2] = null;
			}

			return var51;
		} else {
			return null;
		}
	}

	void method257(int var1) {
	}

	public boolean method258(int var1) {
		if (anObjectArray1[var1] != null) {
			return true;
		} else {
			method275(var1);
			return anObjectArray1[var1] != null;
		}
	}

	public boolean method259() {
		boolean var1 = true;

		for (int var2 = 0; var2 < anIntArray50.length; var2++) {
			int var3 = anIntArray50[var2];
			if (anObjectArray1[var3] == null) {
				method275(var3);
				if (anObjectArray1[var3] == null) {
					var1 = false;
				}
			}
		}

		return var1;
	}

	public byte[] method260(int var1) {
		if (anObjectArrayArray1.length == 1) {
			return getFile(0, var1);
		} else if (anObjectArrayArray1[var1].length == 1) {
			return getFile(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	public byte[] method261(int var1, int var2) {
		if (var1 >= 0 && var1 < anObjectArrayArray1.length && anObjectArrayArray1[var1] != null && var2 >= 0
				&& var2 < anObjectArrayArray1[var1].length) {
			if (anObjectArrayArray1[var1][var2] == null) {
				boolean var4 = method266(var1, (int[]) null);
				if (!var4) {
					method275(var1);
					var4 = method266(var1, (int[]) null);
					if (!var4) {
						return null;
					}
				}
			}

			byte[] var41 = Static.staticMethod84(anObjectArrayArray1[var1][var2], false);
			return var41;
		} else {
			return null;
		}
	}

	public int[] method262(int var1) {
		return anIntArrayArray9[var1];
	}

	public int method263(int var1) {
		return anObjectArrayArray1[var1].length;
	}

	public int method264() {
		return anObjectArrayArray1.length;
	}

	public void method265(int var1) {
		for (int var2 = 0; var2 < anObjectArrayArray1[var1].length; var2++) {
			anObjectArrayArray1[var1][var2] = null;
		}

	}

	boolean method266(int var1, int[] var2) {
		if (anObjectArray1[var1] == null) {
			return false;
		} else {
			int var3 = anIntArray53[var1];
			int[] var4 = anIntArrayArray9[var1];
			Object[] var5 = anObjectArrayArray1[var1];
			boolean var6 = true;

			for (int var19 = 0; var19 < var3; var19++) {
				if (var5[var4[var19]] == null) {
					var6 = false;
					break;
				}
			}

			if (var6) {
				return true;
			} else {
				byte[] var191;
				if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) {
					var191 = Static.staticMethod84(anObjectArray1[var1], false);
				} else {
					var191 = Static.staticMethod84(anObjectArray1[var1], true);
					ByteBuf var20 = new ByteBuf(var191);
					var20.method380(var2, 5, var20.buf.length);
				}

				byte[] var201;
				try {
					var201 = Static.staticMethod241(var191);
				} catch (RuntimeException var18) {
					throw Static.staticMethod268(var18,
							(var2 != null) + "," + var1 + "," + var191.length + ","
									+ Static.staticMethod23(var191, var191.length) + ","
									+ Static.staticMethod23(var191, var191.length - 2) + "," + anIntArray52[var1] + ","
									+ anInt201);
				}

				if (aBool17) {
					anObjectArray1[var1] = null;
				}

				if (var3 > 1) {
					int var9 = var201.length;
					--var9;
					int var10 = var201[var9] & 0xff;
					var9 -= var10 * var3 * 4;
					ByteBuf var11 = new ByteBuf(var201);
					int[] var12 = new int[var3];
					var11.position = var9;

					int var14;
					int var15;
					for (int var21 = 0; var21 < var10; var21++) {
						var14 = 0;

						for (var15 = 0; var15 < var3; var15++) {
							var14 += var11.readInt();
							var12[var15] += var14;
						}
					}

					byte[][] var211 = new byte[var3][];

					for (var14 = 0; var14 < var3; var14++) {
						var211[var14] = new byte[var12[var14]];
						var12[var14] = 0;
					}

					var11.position = var9;
					var14 = 0;

					for (var15 = 0; var15 < var10; var15++) {
						int var16 = 0;

						for (int var17 = 0; var17 < var3; var17++) {
							var16 += var11.readInt();
							System.arraycopy(var201, var14, var211[var17], var12[var17], var16);
							var12[var17] += var16;
							var14 += var16;
						}
					}

					for (var15 = 0; var15 < var3; var15++) {
						if (!aBool18) {
							var5[var4[var15]] = Static.staticMethod16(var211[var15], false);
						} else {
							var5[var4[var15]] = var211[var15];
						}
					}
				} else if (!aBool18) {
					var5[var4[0]] = Static.staticMethod16(var201, false);
				} else {
					var5[var4[0]] = var201;
				}

				return true;
			}
		}
	}

	public int method267(String var1) {
		var1 = var1.toLowerCase();
		return aJs5FileHashTable1.method173(Static.staticMethod295(var1));
	}

	public int method268(int var1, String var2) {
		var2 = var2.toLowerCase();
		return aJs5FileHashTableArray1[var1].method173(Static.staticMethod295(var2));
	}

	public byte[] method269(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = aJs5FileHashTable1.method173(Static.staticMethod295(var1));
		int var4 = aJs5FileHashTableArray1[var3].method173(Static.staticMethod295(var2));
		return getFile(var3, var4);
	}

	public boolean method270(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = aJs5FileHashTable1.method173(Static.staticMethod295(var1));
		int var4 = aJs5FileHashTableArray1[var3].method173(Static.staticMethod295(var2));
		return method276(var3, var4);
	}

	public boolean method271(String var1) {
		int var2 = method267("");
		return var2 != -1 ? method270("", var1) : method270(var1, "");
	}

	AbstractFileStore(boolean var1, boolean var2) {
		aBool17 = var1;
		aBool18 = var2;
	}

	public byte[] getFile(int var1, int var2) {
		return method256(var1, var2, (int[]) null);
	}

	public void method272() {
		for (int var1 = 0; var1 < anObjectArrayArray1.length; var1++) {
			if (anObjectArrayArray1[var1] != null) {
				for (int var2 = 0; var2 < anObjectArrayArray1[var1].length; var2++) {
					anObjectArrayArray1[var1][var2] = null;
				}
			}
		}

	}

	public byte[] method273(int var1) {
		if (anObjectArrayArray1.length == 1) {
			return method261(0, var1);
		} else if (anObjectArrayArray1[var1].length == 1) {
			return method261(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	void method274(byte[] var1) {
		anInt201 = Static.staticMethod23(var1, var1.length);
		ByteBuf var3 = new ByteBuf(Static.staticMethod241(var1));
		int var4 = var3.readUByte();
		if (var4 >= 5 && var4 <= 7) {
			if (var4 >= 6) {
				var3.readInt();
			}

			int var6 = var3.readUByte();
			if (var4 >= 7) {
				anInt200 = var3.method337();
			} else {
				anInt200 = var3.readUShort();
			}

			int var7 = 0;
			int var5 = -1;
			anIntArray50 = new int[anInt200];
			int var2;
			if (var4 >= 7) {
				for (var2 = 0; var2 < anInt200; var2++) {
					anIntArray50[var2] = var7 += var3.method337();
					if (anIntArray50[var2] > var5) {
						var5 = anIntArray50[var2];
					}
				}
			} else {
				for (var2 = 0; var2 < anInt200; var2++) {
					anIntArray50[var2] = var7 += var3.readUShort();
					if (anIntArray50[var2] > var5) {
						var5 = anIntArray50[var2];
					}
				}
			}

			anIntArray52 = new int[1 + var5];
			anIntArray54 = new int[var5 + 1];
			anIntArray53 = new int[1 + var5];
			anIntArrayArray9 = new int[var5 + 1][];
			anObjectArray1 = new Object[var5 + 1];
			anObjectArrayArray1 = new Object[1 + var5][];
			if (var6 != 0) {
				anIntArray51 = new int[1 + var5];

				for (var2 = 0; var2 < anInt200; var2++) {
					anIntArray51[anIntArray50[var2]] = var3.readInt();
				}

				aJs5FileHashTable1 = new Js5FileHashTable(anIntArray51);
			}

			for (var2 = 0; var2 < anInt200; var2++) {
				anIntArray52[anIntArray50[var2]] = var3.readInt();
			}

			for (var2 = 0; var2 < anInt200; var2++) {
				anIntArray54[anIntArray50[var2]] = var3.readInt();
			}

			for (var2 = 0; var2 < anInt200; var2++) {
				anIntArray53[anIntArray50[var2]] = var3.readUShort();
			}

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			if (var4 >= 7) {
				for (var2 = 0; var2 < anInt200; var2++) {
					var10 = anIntArray50[var2];
					var11 = anIntArray53[var10];
					var7 = 0;
					var9 = -1;
					anIntArrayArray9[var10] = new int[var11];

					for (var8 = 0; var8 < var11; var8++) {
						var12 = anIntArrayArray9[var10][var8] = var7 += var3.method337();
						if (var12 > var9) {
							var9 = var12;
						}
					}

					anObjectArrayArray1[var10] = new Object[var9 + 1];
				}
			} else {
				for (var2 = 0; var2 < anInt200; var2++) {
					var10 = anIntArray50[var2];
					var11 = anIntArray53[var10];
					var7 = 0;
					var9 = -1;
					anIntArrayArray9[var10] = new int[var11];

					for (var8 = 0; var8 < var11; var8++) {
						var12 = anIntArrayArray9[var10][var8] = var7 += var3.readUShort();
						if (var12 > var9) {
							var9 = var12;
						}
					}

					anObjectArrayArray1[var10] = new Object[var9 + 1];
				}
			}

			if (var6 != 0) {
				anIntArrayArray10 = new int[var5 + 1][];
				aJs5FileHashTableArray1 = new Js5FileHashTable[1 + var5];

				for (var2 = 0; var2 < anInt200; var2++) {
					var10 = anIntArray50[var2];
					var11 = anIntArray53[var10];
					anIntArrayArray10[var10] = new int[anObjectArrayArray1[var10].length];

					for (var9 = 0; var9 < var11; var9++) {
						anIntArrayArray10[var10][anIntArrayArray9[var10][var9]] = var3.readInt();
					}

					aJs5FileHashTableArray1[var10] = new Js5FileHashTable(anIntArrayArray10[var10]);
				}
			}

		} else {
			throw new RuntimeException("");
		}
	}

	void method275(int var1) {
	}

	public boolean method276(int var1, int var2) {
		if (var1 >= 0 && var1 < anObjectArrayArray1.length && anObjectArrayArray1[var1] != null && var2 >= 0
				&& var2 < anObjectArrayArray1[var1].length) {
			if (anObjectArrayArray1[var1][var2] != null) {
				return true;
			} else if (anObjectArray1[var1] != null) {
				return true;
			} else {
				method275(var1);
				return anObjectArray1[var1] != null;
			}
		} else {
			return false;
		}
	}

}
