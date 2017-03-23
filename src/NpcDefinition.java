public class NpcDefinition extends Cacheable {

	static Js5Index staticJs5Index28;
	static Js5Index staticJs5Index29;
	public int anInt537;
	static int staticInt324;
	static Cache staticCache28 = new Cache(64);
	static Cache staticCache27 = new Cache(50);
	public String aString35 = "null";
	public int anInt538 = 1;
	public int anInt539 = 1;
	public int anInt550 = -1;
	public int anInt552 = -1;
	public int anInt543 = 1;
	public int anInt540 = -1;
	public int anInt536 = -1;
	public int anInt542 = 1;
	public boolean aBool67 = true;
	public int anInt544 = -1;
	int anInt535 = 128;
	int anInt541 = 128;
	public boolean aBool68 = false;
	int anInt546 = 0;
	int anInt547 = 0;
	public int anInt548 = -1;
	public int anInt549 = 1873014688;
	int anInt545 = -1;
	int anInt551 = -1;
	public boolean aBool69 = true;
	public boolean aBool70 = true;
	public boolean aBool71 = false;
	public String[] aStringArray10 = new String[5];
	int[] anIntArray114;
	short[] aShortArray15;
	short[] aShortArray14;
	short[] aShortArray16;
	short[] aShortArray17;
	int[] anIntArray115;
	public int[] anIntArray116;

	void method540(ByteBuf var1) {
		while (true) {
			int var2 = var1.method367();
			if (var2 == 0) {
				return;
			}

			decode(var1, var2);
		}
	}

	public final Model method541(AnimDef var1, int var2, AnimDef var3, int var4) {
		if (anIntArray116 != null) {
			NpcDefinition var11 = method544();
			return var11 == null ? null : var11.method541(var1, var2, var3, var4);
		} else {
			Model var5 = (Model) staticCache27.get(anInt537);
			if (var5 == null) {
				boolean var10 = false;

				for (int var9 = 0; var9 < anIntArray114.length; var9++) {
					if (!staticJs5Index29.method276(anIntArray114[var9], 0)) {
						var10 = true;
					}
				}

				if (var10) {
					return null;
				}

				RenderableSub3[] var121 = new RenderableSub3[anIntArray114.length];

				int var8;
				for (var8 = 0; var8 < anIntArray114.length; var8++) {
					var121[var8] = Static.staticMethod434(staticJs5Index29, anIntArray114[var8], 0);
				}

				RenderableSub3 var12;
				if (var121.length == 1) {
					var12 = var121[0];
				} else {
					var12 = new RenderableSub3(var121, var121.length);
				}

				if (aShortArray15 != null) {
					for (var8 = 0; var8 < aShortArray15.length; var8++) {
						var12.method585(aShortArray15[var8], aShortArray14[var8]);
					}
				}

				if (aShortArray16 != null) {
					for (var8 = 0; var8 < aShortArray16.length; var8++) {
						var12.method579(aShortArray16[var8], aShortArray17[var8]);
					}
				}

				var5 = var12.method583(anInt546 + 64, anInt547 * 5 + 850, -30, -50, -30);
				staticCache27.method170(var5, anInt537);
			}

			Model var101;
			if (var1 != null && var3 != null) {
				var101 = var1.method556(var5, var2, var3, var4);
			} else if (var1 != null) {
				var101 = var1.method551(var5, var2);
			} else if (var3 != null) {
				var101 = var3.method551(var5, var4);
			} else {
				var101 = var5.method589(true);
			}

			if (anInt535 != 128 || anInt541 != 128) {
				var101.method599(anInt535, anInt541, anInt535);
			}

			return var101;
		}
	}

	public final RenderableSub3 method542() {
		if (anIntArray116 != null) {
			NpcDefinition var5 = method544();
			return var5 == null ? null : var5.method542();
		} else if (anIntArray115 == null) {
			return null;
		} else {
			boolean var2 = false;

			for (int var6 = 0; var6 < anIntArray115.length; var6++) {
				if (!staticJs5Index29.method276(anIntArray115[var6], 0)) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			} else {
				RenderableSub3[] var61 = new RenderableSub3[anIntArray115.length];

				for (int var7 = 0; var7 < anIntArray115.length; var7++) {
					var61[var7] = Static.staticMethod434(staticJs5Index29, anIntArray115[var7], 0);
				}

				RenderableSub3 var71;
				if (var61.length == 1) {
					var71 = var61[0];
				} else {
					var71 = new RenderableSub3(var61, var61.length);
				}

				int var1;
				if (aShortArray15 != null) {
					for (var1 = 0; var1 < aShortArray15.length; var1++) {
						var71.method585(aShortArray15[var1], aShortArray14[var1]);
					}
				}

				if (aShortArray16 != null) {
					for (var1 = 0; var1 < aShortArray16.length; var1++) {
						var71.method579(aShortArray16[var1], aShortArray17[var1]);
					}
				}

				return var71;
			}
		}
	}

	public boolean method543() {
		if (anIntArray116 == null) {
			return true;
		} else {
			int var1 = -1;
			if (anInt545 != -1) {
				var1 = Static.staticMethod82(anInt545);
			} else if (anInt551 != -1) {
				var1 = Static.staticIntArray64[anInt551];
			}

			return var1 >= 0 && var1 < anIntArray116.length ? anIntArray116[var1] != -1
					: anIntArray116[anIntArray116.length - 1] != -1;
		}
	}

	public final NpcDefinition method544() {
		int var1 = -1;
		if (anInt545 != -1) {
			var1 = Static.staticMethod82(anInt545);
		} else if (anInt551 != -1) {
			var1 = Static.staticIntArray64[anInt551];
		}

		int var2;
		if (var1 >= 0 && var1 < anIntArray116.length - 1) {
			var2 = anIntArray116[var1];
		} else {
			var2 = anIntArray116[anIntArray116.length - 1];
		}

		return var2 != -1 ? Static.staticMethod85(var2) : null;
	}

	void method545() {
	}

	//TODO npc def decode
	void decode(ByteBuf buffer, int opcode) {		
		int var3;
		int var4;
		if (opcode == 1) {
			var3 = buffer.method367();
			anIntArray114 = new int[var3];

			for (var4 = 0; var4 < var3; var4++) {
				anIntArray114[var4] = buffer.method370();
			}
		} else if (opcode == 2) {
			aString35 = buffer.readString();
		} else if (opcode == 12) {
			anInt538 = buffer.method367();
		} else if (opcode == 13) {
			anInt539 = -buffer.method370();
		} else if (opcode == 14) {
			anInt550 = buffer.method370();
		} else if (opcode == 15) {
			anInt552 = buffer.method370();
		} else if (opcode == 16) {
			anInt543 = -buffer.method370();
		} else if (opcode == 17) {
			anInt550 = buffer.method370();
			anInt540 = buffer.method370();
			anInt536 = buffer.method370();
			anInt542 = -buffer.method370();
		} else if (opcode >= 30 && opcode < 35) {
			aStringArray10[opcode - 30] = buffer.readString();
			if (aStringArray10[opcode - 30].equalsIgnoreCase("Hidden")) {
				aStringArray10[opcode - 30] = null;
			}
		} else if (opcode == 40) {
			var3 = buffer.method367();
			aShortArray15 = new short[var3];
			aShortArray14 = new short[var3];

			for (var4 = 0; var4 < var3; var4++) {
				aShortArray15[var4] = (short) buffer.method370();
				aShortArray14[var4] = (short) buffer.method370();
			}
		} else if (opcode == 41) {
			var3 = buffer.method367();
			aShortArray16 = new short[var3];
			aShortArray17 = new short[var3];

			for (var4 = 0; var4 < var3; var4++) {
				aShortArray16[var4] = (short) buffer.method370();
				aShortArray17[var4] = (short) buffer.method370();
			}
		} else if (opcode == 60) {
			var3 = buffer.method367();
			anIntArray115 = new int[var3];

			for (var4 = 0; var4 < var3; var4++) {
				anIntArray115[var4] = buffer.method370();
			}
		} else if (opcode == 93) {
			aBool67 = false;
		} else if (opcode == 95) {
			anInt544 = buffer.method370();
		} else if (opcode == 97) {
			anInt535 = buffer.method370();
		} else if (opcode == 98) {
			anInt541 = buffer.method370();
		} else if (opcode == 99) {
			aBool68 = true;
		} else if (opcode == 100) {
			anInt546 = buffer.readByte();
		} else if (opcode == 101) {
			anInt547 = buffer.readByte();
		} else if (opcode == 102) {
			anInt548 = buffer.method370();
		} else if (opcode == 103) {
			anInt549 = buffer.method370() * 863838077;
		} else if (opcode != 106 && opcode != 118) {
			if (opcode == 107) {
				aBool69 = false;
			} else if (opcode == 109) {
				aBool70 = false;
			} else if (opcode == 111) {
				aBool71 = true;
			}
		} else {
			anInt545 = buffer.method370();
			if (anInt545 == '\uffff') {
				anInt545 = -1;
			}

			anInt551 = buffer.method370();
			if (anInt551 == '\uffff') {
				anInt551 = -1;
			}

			var3 = -1;
			if (opcode == 118) {
				var3 = buffer.method370();
				if (var3 == '\uffff') {
					var3 = -1;
				}
			}

			var4 = buffer.method367();
			anIntArray116 = new int[2 + var4];

			for (int var5 = 0; var5 <= var4; var5++) {
				anIntArray116[var5] = buffer.method370();
				if (anIntArray116[var5] == '\uffff') {
					anIntArray116[var5] = -1;
				}
			}

			anIntArray116[var4 + 1] = var3;
		}

	}

}
