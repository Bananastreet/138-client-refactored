import java.util.zip.CRC32;

public class Js5IndexImpl extends FileStore {

	static CRC32 staticCRC32_2 = new CRC32();
	volatile boolean aBool46 = false;
	int anInt364;
	int anInt362;
	volatile boolean[] aBoolArray5;
	int anInt365 = -1;
	boolean aBool47 = false;
	IndexedFileSystem aJs5DiskCache3;
	IndexedFileSystem aJs5DiskCache2;
	int anInt363;

	void method394(IndexedFileSystem var1, int var2, byte[] var3, boolean var4) {
		int var8;
		if (var1 == aJs5DiskCache2) {
			if (aBool46) {
				throw new RuntimeException();
			} else if (var3 == null) {
				Static.staticMethod286(this, 255, anInt363, anInt364, (byte) 0, true);
			} else {
				staticCRC32_2.reset();
				staticCRC32_2.update(var3, 0, var3.length);
				var8 = (int) staticCRC32_2.getValue();
				ByteBuf var91 = new ByteBuf(Static.staticMethod241(var3));
				int var7 = var91.method367();
				if (var7 != 5 && var7 != 6) {
					throw new RuntimeException(var7 + "," + anInt363 + "," + var2);
				} else {
					int var6 = 0;
					if (var7 >= 6) {
						var6 = var91.readInt();
					}

					if (var8 != anInt364 || var6 != anInt362) {
						Static.staticMethod286(this, 255, anInt363, anInt364, (byte) 0, true);
					} else {
						method274(var3);
						method400();
					}
				}
			}
		} else {
			if (!var4 && var2 == anInt365) {
				aBool46 = true;
			}

			if (var3 != null && var3.length > 2) {
				staticCRC32_2.reset();
				staticCRC32_2.update(var3, 0, var3.length - 2);
				var8 = (int) staticCRC32_2.getValue();
				int var9 = (var3[var3.length - 1] & 0xff) + ((var3[var3.length - 2] & 0xff) << 8);
				if (anIntArray52[var2] == var8 && anIntArray54[var2] == var9) {
					aBoolArray5[var2] = true;
					if (var4) {
						anObjectArray1[var2] = Static.staticMethod16(var3, false);
					}

				} else {
					aBoolArray5[var2] = false;
					if (aBool47 || var4) {
						Static.staticMethod286(this, anInt363, var2, anIntArray52[var2], (byte) 2, var4);
					}

				}
			} else {
				aBoolArray5[var2] = false;
				if (aBool47 || var4) {
					Static.staticMethod286(this, anInt363, var2, anIntArray52[var2], (byte) 2, var4);
				}

			}
		}
	}

	public int method395() {
		if (aBool46) {
			return 100;
		} else if (anObjectArray1 != null) {
			return 99;
		} else {
			int var1 = anInt363;
			long var3 = var1 + 16711680;
			int var5;
			if (FloorUnderlayDef.staticCacheableSub4_1 != null && var3 == FloorUnderlayDef.staticCacheableSub4_1.id) {
				var5 = 1 + BufferedFile.staticStream2.position * 99
						/ (BufferedFile.staticStream2.buf.length - FloorUnderlayDef.staticCacheableSub4_1.aByte4);
			} else {
				var5 = 0;
			}

			int var2 = var5;
			if (var5 >= 100) {
				var2 = 99;
			}

			return var2;
		}
	}

	void method257(int var1) {
		int var2 = anInt363;
		long var4 = (var2 << 16) + var1;
		CacheableSub4 var3 = (CacheableSub4) Static.staticHashTable4.method149(var4);
		if (var3 != null) {
			Static.staticQueue1.method188(var3);
		}

	}

	void method275(int var1) {
		if (aJs5DiskCache3 != null && aBoolArray5 != null && aBoolArray5[var1]) {
			Static.staticMethod156(var1, aJs5DiskCache3, this);
		} else {
			Static.staticMethod286(this, anInt363, var1, anIntArray52[var1], (byte) 2, true);
		}

	}

	public void method396(int var1, int var2) {
		anInt364 = var1;
		anInt362 = var2;
		if (aJs5DiskCache2 != null) {
			Static.staticMethod156(anInt363, aJs5DiskCache2, this);
		} else {
			Static.staticMethod286(this, 255, anInt363, anInt364, (byte) 0, true);
		}

	}

	public void method397(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (aBool46) {
				throw new RuntimeException();
			}

			if (aJs5DiskCache2 != null) {
				Static.staticMethod275(anInt363, var2, aJs5DiskCache2);
			}

			method274(var2);
			method400();
		} else {
			var2[var2.length - 2] = (byte) (anIntArray54[var1] >> 8);
			var2[var2.length - 1] = (byte) anIntArray54[var1];
			if (aJs5DiskCache3 != null) {
				Static.staticMethod275(var1, var2, aJs5DiskCache3);
				aBoolArray5[var1] = true;
			}

			if (var4) {
				anObjectArray1[var1] = Static.staticMethod16(var2, false);
			}
		}

	}

	int method398(int var1) {
		if (anObjectArray1[var1] != null) {
			return 100;
		} else if (aBoolArray5[var1]) {
			return 100;
		} else {
			int var3 = anInt363;
			long var4 = (var3 << 16) + var1;
			int var2;
			if (FloorUnderlayDef.staticCacheableSub4_1 != null && var4 == FloorUnderlayDef.staticCacheableSub4_1.id) {
				var2 = BufferedFile.staticStream2.position * 99
						/ (BufferedFile.staticStream2.buf.length - FloorUnderlayDef.staticCacheableSub4_1.aByte4) + 1;
			} else {
				var2 = 0;
			}

			return var2;
		}
	}

	public int method399() {
		int var1 = 0;
		int var3 = 0;

		int var2;
		for (var2 = 0; var2 < anObjectArray1.length; var2++) {
			if (anIntArray53[var2] > 0) {
				var1 += 100;
				var3 += method398(var2);
			}
		}

		if (var1 == 0) {
			return 100;
		} else {
			var2 = var3 * 100 / var1;
			return var2;
		}
	}

	void method400() {
		aBoolArray5 = new boolean[anObjectArray1.length];

		int var1;
		for (var1 = 0; var1 < aBoolArray5.length; var1++) {
			aBoolArray5[var1] = false;
		}

		if (aJs5DiskCache3 == null) {
			aBool46 = true;
		} else {
			anInt365 = -1;

			for (var1 = 0; var1 < aBoolArray5.length; var1++) {
				if (anIntArray53[var1] > 0) {
					IndexedFileSystem var2 = aJs5DiskCache3;
					Js5CacheWriteRequest var4 = new Js5CacheWriteRequest();
					var4.anInt290 = 1;
					var4.id = var1;
					var4.aJs5DiskCache1 = var2;
					var4.aJs5IndexImpl1 = this;
					synchronized (FileRequestTask.staticClass39_3) {
						FileRequestTask.staticClass39_3.method198(var4);
					}

					Static.staticMethod298();
					anInt365 = var1;
				}
			}

			if (anInt365 == -1) {
				aBool46 = true;
			}
		}

	}

	public Js5IndexImpl(IndexedFileSystem var1, IndexedFileSystem var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5);
		aJs5DiskCache3 = var1;
		aJs5DiskCache2 = var2;
		anInt363 = var3;
		aBool47 = var6;
		Static.staticMethod373(this, anInt363);
	}

}
