public class NodeSub8Sub3 extends NodeSub8 {

	int anInt422 = 256;
	int anInt423 = 1000000;
	int[] anIntArray97 = new int[16];
	int[] anIntArray86 = new int[16];
	int[] anIntArray87 = new int[16];
	int[] anIntArray88 = new int[16];
	int[] anIntArray89 = new int[16];
	int[] anIntArray99 = new int[16];
	int[] anIntArray90 = new int[16];
	int[] anIntArray91 = new int[16];
	int[] anIntArray98 = new int[16];
	int[] anIntArray93 = new int[16];
	int[] anIntArray100 = new int[16];
	int[] anIntArray92 = new int[16];
	int[] anIntArray95 = new int[16];
	int[] anIntArray94 = new int[16];
	int[] anIntArray96 = new int[16];
	NodeSub12[][] aNodeSub12ArrayArray1 = new NodeSub12[16][128];
	NodeSub12[][] aNodeSub12ArrayArray2 = new NodeSub12[16][128];
	Class46 aClass46_1 = new Class46();
	NodeSub8Sub4 aNodeSub8Sub4_1 = new NodeSub8Sub4(this);
	HashTable aHashTable5 = new HashTable(128);
	boolean aBool53;
	long aLong21;
	int anInt424;
	int anInt425;
	long aLong20;

	public int method437() {
		return anInt422;
	}

	void method438(int var1, int var2, int var3) {
	}

	synchronized void method439() {
		for (NodeSub14 var1 = (NodeSub14) aHashTable5.method146(); var1 != null; var1 = (NodeSub14) aHashTable5
				.method147()) {
			var1.method382();
		}

	}

	public synchronized void method440() {
		aClass46_1.method224();
		method449();
	}

	public synchronized boolean method441() {
		return aClass46_1.method235();
	}

	public synchronized void method442(int var1, int var2) {
		method466(var1, var2);
	}

	int method443(NodeSub12 var1) {
		int var2 = var1.anInt271 + (var1.anInt272 * var1.anInt267 >> 12);
		var2 += anIntArray92[var1.anInt266] * (anIntArray90[var1.anInt266] - 8192) >> 12;
		DataClass8 var4 = var1.aClass43_1;
		int var5;
		if (var4.anInt186 > 0 && (var4.anInt185 > 0 || anIntArray91[var1.anInt266] > 0)) {
			var5 = var4.anInt185 << 2;
			int var3 = var4.anInt182 << 1;
			if (var1.anInt277 < var3) {
				var5 = var5 * var1.anInt277 / var3;
			}

			var5 += anIntArray91[var1.anInt266] >> 7;
			double var6 = Math.sin((var1.anInt265 * -1929043803 & 0x1ff) * 0.01227184630308513D);
			var2 += (int) (var5 * var6);
		}

		var5 = (int) (var1.aNodeSub6Sub1_1.anInt420 * 256 * Math.pow(2.0D, var2 * 3.255208333333333E-4D)
				/ Static.staticInt120 + 0.5D);
		return var5 < 1 ? 1 : var5;
	}

	void method444(int var1, int var2) {
		if (var2 != anIntArray89[var1]) {
			anIntArray89[var1] = var2;

			for (int var3 = 0; var3 < 128; var3++) {
				aNodeSub12ArrayArray2[var1][var3] = null;
			}
		}

	}

	void method445(int var1, int var2, int var3) {
		NodeSub12 var4 = aNodeSub12ArrayArray1[var1][var2];
		if (var4 != null) {
			aNodeSub12ArrayArray1[var1][var2] = null;
			if ((anIntArray93[var1] & 0x2) != 0) {
				for (NodeSub12 var5 = (NodeSub12) aNodeSub8Sub4_1.aClass39_4
						.method195(); var5 != null; var5 = (NodeSub12) aNodeSub8Sub4_1.aClass39_4.method193()) {
					if (var5.anInt266 == var4.anInt266 && var5.anInt276 < 0 && var5 != var4) {
						var4.anInt276 = 0;
						break;
					}
				}
			} else {
				var4.anInt276 = 0;
			}
		}

	}

	void method446(int var1) {
		if ((anIntArray93[var1] & 0x4) != 0) {
			for (NodeSub12 var2 = (NodeSub12) aNodeSub8Sub4_1.aClass39_4
					.method195(); var2 != null; var2 = (NodeSub12) aNodeSub8Sub4_1.aClass39_4.method193()) {
				if (var1 == var2.anInt266) {
					var2.anInt275 = 0;
				}
			}
		}

	}

	public NodeSub8Sub3() {
		method449();
	}

	void method447(int var1) {
		if (var1 >= 0) {
			anIntArray97[var1] = 12800;
			anIntArray86[var1] = 8192;
			anIntArray87[var1] = 16383;
			anIntArray90[var1] = 8192;
			anIntArray91[var1] = 0;
			anIntArray98[var1] = 8192;
			method459(var1);
			method446(var1);
			anIntArray93[var1] = 0;
			anIntArray100[var1] = 32767;
			anIntArray92[var1] = 256;
			anIntArray95[var1] = 0;
			method452(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; var1++) {
				method447(var1);
			}
		}

	}

	void method448(int var1) {
		for (NodeSub12 var2 = (NodeSub12) aNodeSub8Sub4_1.aClass39_4
				.method195(); var2 != null; var2 = (NodeSub12) aNodeSub8Sub4_1.aClass39_4.method193()) {
			if ((var1 < 0 || var2.anInt266 == var1) && var2.anInt276 < 0) {
				aNodeSub12ArrayArray1[var2.anInt266][var2.anInt269] = null;
				var2.anInt276 = 0;
			}
		}

	}

	void method449() {
		method461(-1);
		method447(-1);

		int var1;
		for (var1 = 0; var1 < 16; var1++) {
			anIntArray89[var1] = anIntArray88[var1];
		}

		for (var1 = 0; var1 < 16; var1++) {
			anIntArray99[var1] = anIntArray88[var1] & 0xffffff80;
		}

	}

	synchronized void method450(NodeSub11 var1, boolean var2) {
		method440();
		aClass46_1.method223(var1.aByteArray17);
		aBool53 = var2;
		aLong21 = 0L;
		int var4 = aClass46_1.method237();

		for (int var3 = 0; var3 < var4; var3++) {
			aClass46_1.method226(var3);
			aClass46_1.method225(var3);
			aClass46_1.method227(var3);
		}

		anInt424 = aClass46_1.method232();
		anInt425 = aClass46_1.anIntArray41[anInt424];
		aLong20 = aClass46_1.method231(anInt425);
	}

	void method451(int var1) {
		int var2 = var1 & 0xf0;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 0xf;
			var5 = var1 >> 8 & 0x7f;
			var4 = var1 >> 16 & 0x7f;
			method445(var3, var5, var4);
		} else if (var2 == 144) {
			var3 = var1 & 0xf;
			var5 = var1 >> 8 & 0x7f;
			var4 = var1 >> 16 & 0x7f;
			if (var4 > 0) {
				method463(var3, var5, var4);
			} else {
				method445(var3, var5, 64);
			}
		} else if (var2 == 160) {
			var3 = var1 & 0xf;
			var5 = var1 >> 8 & 0x7f;
			var4 = var1 >> 16 & 0x7f;
			method438(var3, var5, var4);
		} else if (var2 == 176) {
			var3 = var1 & 0xf;
			var5 = var1 >> 8 & 0x7f;
			var4 = var1 >> 16 & 0x7f;
			if (var5 == 0) {
				anIntArray99[var3] = (var4 << 14) + (anIntArray99[var3] & 0xffe03fff);
			}

			if (var5 == 32) {
				anIntArray99[var3] = (anIntArray99[var3] & 0xffffc07f) + (var4 << 7);
			}

			if (var5 == 1) {
				anIntArray91[var3] = (var4 << 7) + (anIntArray91[var3] & 0xffffc07f);
			}

			if (var5 == 33) {
				anIntArray91[var3] = var4 + (anIntArray91[var3] & 0xffffff80);
			}

			if (var5 == 5) {
				anIntArray98[var3] = (var4 << 7) + (anIntArray98[var3] & 0xffffc07f);
			}

			if (var5 == 37) {
				anIntArray98[var3] = (anIntArray98[var3] & 0xffffff80) + var4;
			}

			if (var5 == 7) {
				anIntArray97[var3] = (var4 << 7) + (anIntArray97[var3] & 0xffffc07f);
			}

			if (var5 == 39) {
				anIntArray97[var3] = var4 + (anIntArray97[var3] & 0xffffff80);
			}

			if (var5 == 10) {
				anIntArray86[var3] = (anIntArray86[var3] & 0xffffc07f) + (var4 << 7);
			}

			if (var5 == 42) {
				anIntArray86[var3] = (anIntArray86[var3] & 0xffffff80) + var4;
			}

			if (var5 == 11) {
				anIntArray87[var3] = (anIntArray87[var3] & 0xffffc07f) + (var4 << 7);
			}

			if (var5 == 43) {
				anIntArray87[var3] = var4 + (anIntArray87[var3] & 0xffffff80);
			}

			if (var5 == 64) {
				if (var4 >= 64) {
					anIntArray93[var3] |= 1;
				} else {
					anIntArray93[var3] &= -2;
				}
			}

			if (var5 == 65) {
				if (var4 >= 64) {
					anIntArray93[var3] |= 2;
				} else {
					method459(var3);
					anIntArray93[var3] &= -3;
				}
			}

			if (var5 == 99) {
				anIntArray100[var3] = (var4 << 7) + (anIntArray100[var3] & 0x7f);
			}

			if (var5 == 98) {
				anIntArray100[var3] = (anIntArray100[var3] & 0x3f80) + var4;
			}

			if (var5 == 101) {
				anIntArray100[var3] = (var4 << 7) + 16384 + (anIntArray100[var3] & 0x7f);
			}

			if (var5 == 100) {
				anIntArray100[var3] = (anIntArray100[var3] & 0x3f80) + 16384 + var4;
			}

			if (var5 == 120) {
				method461(var3);
			}

			if (var5 == 121) {
				method447(var3);
			}

			if (var5 == 123) {
				method448(var3);
			}

			int var6;
			if (var5 == 6) {
				var6 = anIntArray100[var3];
				if (var6 == 16384) {
					anIntArray92[var3] = (anIntArray92[var3] & 0xffffc07f) + (var4 << 7);
				}
			}

			if (var5 == 38) {
				var6 = anIntArray100[var3];
				if (var6 == 16384) {
					anIntArray92[var3] = (anIntArray92[var3] & 0xffffff80) + var4;
				}
			}

			if (var5 == 16) {
				anIntArray95[var3] = (var4 << 7) + (anIntArray95[var3] & 0xffffc07f);
			}

			if (var5 == 48) {
				anIntArray95[var3] = var4 + (anIntArray95[var3] & 0xffffff80);
			}

			if (var5 == 81) {
				if (var4 >= 64) {
					anIntArray93[var3] |= 4;
				} else {
					method446(var3);
					anIntArray93[var3] &= -5;
				}
			}

			if (var5 == 17) {
				method452(var3, (anIntArray94[var3] & 0xffffc07f) + (var4 << 7));
			}

			if (var5 == 49) {
				method452(var3, (anIntArray94[var3] & 0xffffff80) + var4);
			}
		} else if (var2 == 192) {
			var3 = var1 & 0xf;
			var5 = var1 >> 8 & 0x7f;
			method444(var3, anIntArray99[var3] + var5);
		} else if (var2 == 208) {
			var3 = var1 & 0xf;
			var5 = var1 >> 8 & 0x7f;
			method454(var3, var5);
		} else if (var2 == 224) {
			var3 = var1 & 0xf;
			var5 = (var1 >> 9 & 0x3f80) + (var1 >> 8 & 0x7f);
			method467(var3, var5);
		} else {
			var2 = var1 & 0xff;
			if (var2 == 255) {
				method449();
			}
		}

	}

	void method452(int var1, int var2) {
		anIntArray94[var1] = var2;
		anIntArray96[var1] = (int) (2097152.0D * Math.pow(2.0D, var2 * 5.4931640625E-4D) + 0.5D);
	}

	int method453(NodeSub12 var1) {
		DataClass8 var2 = var1.aClass43_1;
		int var3 = 4096 + anIntArray97[var1.anInt266] * anIntArray87[var1.anInt266] >> 13;
		var3 = 16384 + var3 * var3 >> 15;
		var3 = var1.anInt270 * var3 + 16384 >> 15;
		var3 = 128 + var3 * anInt422 >> 8;
		if (var2.anInt181 > 0) {
			var3 = (int) (var3 * Math.pow(0.5D, var1.anInt273 * 1.953125E-5D * var2.anInt181) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.aByteArray13 != null) {
			var5 = var1.anInt274;
			var4 = var2.aByteArray13[1 + var1.anInt280];
			if (var1.anInt280 < var2.aByteArray13.length - 2) {
				var7 = (var2.aByteArray13[var1.anInt280] & 0xff) << 8;
				var6 = (var2.aByteArray13[var1.anInt280 + 2] & 0xff) << 8;
				var4 += (var5 - var7) * (var2.aByteArray13[3 + var1.anInt280] - var4) / (var6 - var7);
			}

			var3 = var4 * var3 + 32 >> 6;
		}

		if (var1.anInt276 > 0 && var2.aByteArray12 != null) {
			var5 = var1.anInt276;
			var4 = var2.aByteArray12[var1.anInt278 + 1];
			if (var1.anInt278 < var2.aByteArray12.length - 2) {
				var7 = (var2.aByteArray12[var1.anInt278] & 0xff) << 8;
				var6 = (var2.aByteArray12[var1.anInt278 + 2] & 0xff) << 8;
				var4 += (var2.aByteArray12[var1.anInt278 + 3] - var4) * (var5 - var7) / (var6 - var7);
			}

			var3 = 32 + var4 * var3 >> 6;
		}

		return var3;
	}

	protected synchronized int method304() {
		return 0;
	}

	protected synchronized NodeSub8 method302() {
		return aNodeSub8Sub4_1;
	}

	protected synchronized NodeSub8 method303() {
		return null;
	}

	void method454(int var1, int var2) {
	}

	protected synchronized void method305(int var1) {
		if (aClass46_1.method235()) {
			int var2 = aClass46_1.anInt190 * anInt423 / Static.staticInt120;

			do {
				long var3 = aLong21 + (long) var2 * (long) var1;
				if (aLong20 - var3 >= 0L) {
					aLong21 = var3;
					break;
				}

				int var5 = (int) ((aLong20 - aLong21 + var2 - 1L) / var2);
				aLong21 += (long) var2 * (long) var5;
				aNodeSub8Sub4_1.method305(var5);
				var1 -= var5;
				method455();
			} while (aClass46_1.method235());
		}

		aNodeSub8Sub4_1.method305(var1);
	}

	void method455() {
		int var1 = anInt424;
		int var4 = anInt425;

		long var2;
		for (var2 = aLong20; anInt425 == var4; var2 = aClass46_1.method231(var4)) {
			while (aClass46_1.anIntArray41[var1] == var4) {
				aClass46_1.method226(var1);
				int var5 = aClass46_1.method228(var1);
				if (var5 == 1) {
					aClass46_1.method234();
					aClass46_1.method227(var1);
					if (aClass46_1.method233()) {
						if (!aBool53 || var4 == 0) {
							method449();
							aClass46_1.method224();
							return;
						}

						aClass46_1.method236(var2);
					}
					break;
				}

				if ((var5 & 0x80) != 0) {
					method451(var5);
				}

				aClass46_1.method225(var1);
				aClass46_1.method227(var1);
			}

			var1 = aClass46_1.method232();
			var4 = aClass46_1.anIntArray41[var1];
		}

		anInt424 = var1;
		anInt425 = var4;
		aLong20 = var2;
	}

	boolean method456(NodeSub12 var1) {
		if (var1.aNodeSub8Sub2_3 == null) {
			if (var1.anInt276 >= 0) {
				var1.method174();
				if (var1.anInt268 > 0 && var1 == aNodeSub12ArrayArray2[var1.anInt266][var1.anInt268]) {
					aNodeSub12ArrayArray2[var1.anInt266][var1.anInt268] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	public synchronized void method457(int var1) {
		anInt422 = var1;
	}

	protected synchronized void method306(int[] var1, int var2, int var3) {
		if (aClass46_1.method235()) {
			int var4 = aClass46_1.anInt190 * anInt423 / Static.staticInt120;

			do {
				long var5 = aLong21 + (long) var4 * (long) var3;
				if (aLong20 - var5 >= 0L) {
					aLong21 = var5;
					break;
				}

				int var7 = (int) ((var4 + aLong20 - aLong21 - 1L) / var4);
				aLong21 += (long) var7 * (long) var4;
				aNodeSub8Sub4_1.method306(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				method455();
			} while (aClass46_1.method235());
		}

		aNodeSub8Sub4_1.method306(var1, var2, var3);
	}

	void method458(NodeSub12 var1, boolean var2) {
		int var3 = var1.aNodeSub6Sub1_1.aByteArray23.length;
		int var4;
		if (var2 && var1.aNodeSub6Sub1_1.aBool52) {
			int var5 = var3 + var3 - var1.aNodeSub6Sub1_1.anInt418;
			var4 = (int) ((long) anIntArray95[var1.anInt266] * (long) var5 >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.aNodeSub8Sub2_3.method414(true);
			}
		} else {
			var4 = (int) ((long) anIntArray95[var1.anInt266] * (long) var3 >> 6);
		}

		var1.aNodeSub8Sub2_3.method419(var4);
	}

	void method459(int var1) {
		if ((anIntArray93[var1] & 0x2) != 0) {
			for (NodeSub12 var2 = (NodeSub12) aNodeSub8Sub4_1.aClass39_4
					.method195(); var2 != null; var2 = (NodeSub12) aNodeSub8Sub4_1.aClass39_4.method193()) {
				if (var1 == var2.anInt266 && aNodeSub12ArrayArray1[var1][var2.anInt269] == null && var2.anInt276 < 0) {
					var2.anInt276 = 0;
				}
			}
		}

	}

	synchronized boolean method460(NodeSub11 var1, Js5Index var2, Class10 var3, int var4) {
		var1.method315();
		boolean var9 = true;
		int[] var7 = null;
		if (var4 > 0) {
			var7 = new int[] { var4 };
		}

		for (NodeSub13 var8 = (NodeSub13) var1.aHashTable4
				.method146(); var8 != null; var8 = (NodeSub13) var1.aHashTable4.method147()) {
			int var5 = (int) var8.id;
			NodeSub14 var6 = (NodeSub14) aHashTable5.method149(var5);
			if (var6 == null) {
				var6 = Static.staticMethod86(var2, var5);
				if (var6 == null) {
					var9 = false;
					continue;
				}

				aHashTable5.method148(var6, var5);
			}

			if (!var6.method381(var3, var8.aByteArray18, var7)) {
				var9 = false;
			}
		}

		if (var9) {
			var1.method316();
		}

		return var9;
	}

	void method461(int var1) {
		for (NodeSub12 var2 = (NodeSub12) aNodeSub8Sub4_1.aClass39_4
				.method195(); var2 != null; var2 = (NodeSub12) aNodeSub8Sub4_1.aClass39_4.method193()) {
			if (var1 < 0 || var2.anInt266 == var1) {
				if (var2.aNodeSub8Sub2_3 != null) {
					var2.aNodeSub8Sub2_3.method423(Static.staticInt120 / 100);
					if (var2.aNodeSub8Sub2_3.method427()) {
						aNodeSub8Sub4_1.aNodeSub8Sub1_1.method408(var2.aNodeSub8Sub2_3);
					}

					var2.method317();
				}

				if (var2.anInt276 < 0) {
					aNodeSub12ArrayArray1[var2.anInt266][var2.anInt269] = null;
				}

				var2.method174();
			}
		}

	}

	public synchronized void method462() {
		for (NodeSub14 var1 = (NodeSub14) aHashTable5.method146(); var1 != null; var1 = (NodeSub14) aHashTable5
				.method147()) {
			var1.method174();
		}

	}

	void method463(int var1, int var2, int var3) {
		method445(var1, var2, 64);
		if ((anIntArray93[var1] & 0x2) != 0) {
			for (NodeSub12 var9 = (NodeSub12) aNodeSub8Sub4_1.aClass39_4
					.method196(); var9 != null; var9 = (NodeSub12) aNodeSub8Sub4_1.aClass39_4.method197()) {
				if (var9.anInt266 == var1 && var9.anInt276 < 0) {
					aNodeSub12ArrayArray1[var1][var9.anInt269] = null;
					aNodeSub12ArrayArray1[var1][var2] = var9;
					int var8 = (var9.anInt272 * var9.anInt267 >> 12) + var9.anInt271;
					var9.anInt271 += var2 - var9.anInt269 << 8;
					var9.anInt267 = var8 - var9.anInt271;
					var9.anInt272 = 4096;
					var9.anInt269 = var2;
					return;
				}
			}
		}

		NodeSub14 var91 = (NodeSub14) aHashTable5.method149(anIntArray89[var1]);
		if (var91 != null) {
			NodeSub6Sub1 var81 = var91.aNodeSub6Sub1Array1[var2];
			if (var81 != null) {
				NodeSub12 var4 = new NodeSub12();
				var4.anInt266 = var1;
				var4.aNodeSub14_1 = var91;
				var4.aNodeSub6Sub1_1 = var81;
				var4.aClass43_1 = var91.aClass43Array1[var2];
				var4.anInt268 = var91.aByteArray20[var2];
				var4.anInt269 = var2;
				var4.anInt270 = var3 * var3 * var91.anInt282 * var91.aByteArray21[var2] + 1024 >> 11;
				var4.anInt281 = var91.aByteArray19[var2] & 0xff;
				var4.anInt271 = (var2 << 8) - (var91.aShortArray1[var2] & 0x7fff);
				var4.anInt273 = 0;
				var4.anInt274 = 0;
				var4.anInt280 = 0;
				var4.anInt276 = -1;
				var4.anInt278 = 0;
				if (anIntArray95[var1] == 0) {
					var4.aNodeSub8Sub2_3 = Static.staticMethod351(var81, method443(var4), method453(var4),
							method464(var4));
				} else {
					var4.aNodeSub8Sub2_3 = Static.staticMethod351(var81, method443(var4), 0, method464(var4));
					method458(var4, var91.aShortArray1[var2] < 0);
				}

				if (var91.aShortArray1[var2] < 0) {
					var4.aNodeSub8Sub2_3.method430(-1);
				}

				if (var4.anInt268 >= 0) {
					NodeSub12 var7 = aNodeSub12ArrayArray2[var1][var4.anInt268];
					if (var7 != null && var7.anInt276 < 0) {
						aNodeSub12ArrayArray1[var1][var7.anInt269] = null;
						var7.anInt276 = 0;
					}

					aNodeSub12ArrayArray2[var1][var4.anInt268] = var4;
				}

				aNodeSub8Sub4_1.aClass39_4.method198(var4);
				aNodeSub12ArrayArray1[var1][var2] = var4;
			}
		}

	}

	int method464(NodeSub12 var1) {
		int var2 = anIntArray86[var1.anInt266];
		return var2 < 8192 ? 32 + var2 * var1.anInt281 >> 6
				: 16384 - ((16384 - var2) * (128 - var1.anInt281) + 32 >> 6);
	}

	boolean method465(NodeSub12 var1, int[] var2, int var3, int var4) {
		var1.anInt279 = Static.staticInt120 / 100;
		if (var1.anInt276 < 0 || var1.aNodeSub8Sub2_3 != null && !var1.aNodeSub8Sub2_3.method431()) {
			int var7 = var1.anInt272;
			if (var7 > 0) {
				var7 -= (int) (16.0D * Math.pow(2.0D, 4.921259842519685E-4D * anIntArray98[var1.anInt266]) + 0.5D);
				if (var7 < 0) {
					var7 = 0;
				}

				var1.anInt272 = var7;
			}

			var1.aNodeSub8Sub2_3.method424(method443(var1));
			DataClass8 var8 = var1.aClass43_1;
			boolean var9 = false;
			++var1.anInt277;
			var1.anInt265 += var8.anInt186 * -192559315;
			double var5 = 5.086263020833333E-6D * ((var1.anInt269 - 60 << 8) + (var1.anInt267 * var1.anInt272 >> 12));
			if (var8.anInt181 > 0) {
				if (var8.anInt184 > 0) {
					var1.anInt273 += (int) (128.0D * Math.pow(2.0D, var8.anInt184 * var5) + 0.5D);
				} else {
					var1.anInt273 += 128;
				}
			}

			if (var8.aByteArray13 != null) {
				if (var8.anInt187 > 0) {
					var1.anInt274 += (int) (128.0D * Math.pow(2.0D, var8.anInt187 * var5) + 0.5D);
				} else {
					var1.anInt274 += 128;
				}

				while (var1.anInt280 < var8.aByteArray13.length - 2
						&& var1.anInt274 > (var8.aByteArray13[var1.anInt280 + 2] & 0xff) << 8) {
					var1.anInt280 += 2;
				}

				if (var8.aByteArray13.length - 2 == var1.anInt280 && var8.aByteArray13[1 + var1.anInt280] == 0) {
					var9 = true;
				}
			}

			if (var1.anInt276 >= 0 && var8.aByteArray12 != null && (anIntArray93[var1.anInt266] & 0x1) == 0
					&& (var1.anInt268 < 0 || var1 != aNodeSub12ArrayArray2[var1.anInt266][var1.anInt268])) {
				if (var8.anInt183 > 0) {
					var1.anInt276 += (int) (128.0D * Math.pow(2.0D, var5 * var8.anInt183) + 0.5D);
				} else {
					var1.anInt276 += 128;
				}

				while (var1.anInt278 < var8.aByteArray12.length - 2
						&& var1.anInt276 > (var8.aByteArray12[var1.anInt278 + 2] & 0xff) << 8) {
					var1.anInt278 += 2;
				}

				if (var8.aByteArray12.length - 2 == var1.anInt278) {
					var9 = true;
				}
			}

			if (var9) {
				var1.aNodeSub8Sub2_3.method423(var1.anInt279);
				if (var2 != null) {
					var1.aNodeSub8Sub2_3.method306(var2, var3, var4);
				} else {
					var1.aNodeSub8Sub2_3.method305(var4);
				}

				if (var1.aNodeSub8Sub2_3.method427()) {
					aNodeSub8Sub4_1.aNodeSub8Sub1_1.method408(var1.aNodeSub8Sub2_3);
				}

				var1.method317();
				if (var1.anInt276 >= 0) {
					var1.method174();
					if (var1.anInt268 > 0 && var1 == aNodeSub12ArrayArray2[var1.anInt266][var1.anInt268]) {
						aNodeSub12ArrayArray2[var1.anInt266][var1.anInt268] = null;
					}
				}

				return true;
			} else {
				var1.aNodeSub8Sub2_3.method422(var1.anInt279, method453(var1), method464(var1));
				return false;
			}
		} else {
			var1.method317();
			var1.method174();
			if (var1.anInt268 > 0 && var1 == aNodeSub12ArrayArray2[var1.anInt266][var1.anInt268]) {
				aNodeSub12ArrayArray2[var1.anInt266][var1.anInt268] = null;
			}

			return true;
		}
	}

	void method466(int var1, int var2) {
		anIntArray88[var1] = var2;
		anIntArray99[var1] = var2 & 0xffffff80;
		method444(var1, var2);
	}

	void method467(int var1, int var2) {
		anIntArray90[var1] = var2;
	}

}
