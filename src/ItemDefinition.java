public class ItemDefinition extends Cacheable {

	static Js5Index staticJs5Index14;
	public int anInt437;
	static Js5Index staticJs5Index15;
	static Cache staticCache10 = new Cache(64);
	static Cache staticCache11 = new Cache(50);
	public static Cache staticCache9 = new Cache(200);
	public String aString31 = "null";
	public int anInt444 = 2000;
	public int anInt456 = 0;
	public int anInt466 = 0;
	public int anInt436 = 0;
	public int anInt452 = 0;
	public int anInt442 = 0;
	public int anInt460 = 1;
	public boolean aBool55 = false;
	int anInt446 = -1;
	int anInt447 = 0;
	int anInt438 = -1;
	int anInt448 = -1;
	int anInt450 = 0;
	int anInt449 = -1;
	int anInt443 = -2;
	public boolean aBool56 = false;
	int anInt451 = -1;
	int anInt434 = -1;
	int anInt440 = -1;
	int anInt454 = -1;
	int anInt453 = -1;
	int anInt455 = -1;
	public int anInt468 = 0;
	public int anInt435 = -1;
	public int anInt457 = -1;
	int anInt458 = 128;
	int anInt459 = 128;
	int anInt439 = 128;
	public int anInt461 = 0;
	public int anInt462 = 0;
	public int anInt463 = 0;
	int anInt464 = -1;
	int anInt465 = -1;
	public int anInt445 = -1;
	public int anInt467 = -1;
	public String[] aStringArray7 = new String[] { null, null, "Take", null, null };
	public String[] aStringArray6 = new String[] { null, null, null, null, "Drop" };
	int anInt441;
	short[] aShortArray9;
	short[] aShortArray6;
	short[] aShortArray7;
	short[] aShortArray8;
	int[] anIntArray105;
	int[] anIntArray106;

	void method486() {
	}

	public final RenderableSub3 method487(boolean var1) {
		int var2 = anInt440;
		int var4 = anInt453;
		if (var1) {
			var2 = anInt454;
			var4 = anInt455;
		}

		if (var2 == -1) {
			return null;
		} else {
			RenderableSub3 var3 = Static.staticMethod434(staticJs5Index14, var2, 0);
			if (var4 != -1) {
				RenderableSub3 var7 = Static.staticMethod434(staticJs5Index14, var4, 0);
				RenderableSub3[] var6 = new RenderableSub3[] { var3, var7 };
				var3 = new RenderableSub3(var6, 2);
			}

			int var71;
			if (aShortArray9 != null) {
				for (var71 = 0; var71 < aShortArray9.length; var71++) {
					var3.method585(aShortArray9[var71], aShortArray6[var71]);
				}
			}

			if (aShortArray7 != null) {
				for (var71 = 0; var71 < aShortArray7.length; var71++) {
					var3.method579(aShortArray7[var71], aShortArray8[var71]);
				}
			}

			return var3;
		}
	}

	// TODO item def decode
	void decode(ByteBuf buffer, int opcode) {		
		if (opcode == 1) {
			anInt441 = buffer.method370();
		} else if (opcode == 2) {
			aString31 = buffer.readString();
		} else if (opcode == 4) {
			anInt444 = buffer.method370();
		} else if (opcode == 5) {
			anInt456 = buffer.method370();
		} else if (opcode == 6) {
			anInt466 = buffer.method370();
		} else if (opcode == 7) {
			anInt436 = buffer.method370();
			if (anInt436 > 32767) {
				anInt436 -= 65536;
			}
		} else if (opcode == 8) {
			anInt452 = buffer.method370();
			if (anInt452 > 32767) {
				anInt452 -= 65536;
			}
		} else if (opcode == 11) {
			anInt442 = 1;
		} else if (opcode == 12) {
			anInt460 = buffer.readInt();
		} else if (opcode == 16) {
			aBool55 = true;
		} else if (opcode == 23) {
			anInt446 = buffer.method370();
			anInt447 = buffer.method367();
		} else if (opcode == 24) {
			anInt438 = buffer.method370();
		} else if (opcode == 25) {
			anInt448 = buffer.method370();
			anInt450 = buffer.method367();
		} else if (opcode == 26) {
			anInt449 = buffer.method370();
		} else if (opcode >= 30 && opcode < 35) {
			aStringArray7[opcode - 30] = buffer.readString();
			if (aStringArray7[opcode - 30].equalsIgnoreCase("Hidden")) {
				aStringArray7[opcode - 30] = null;
			}
		} else if (opcode >= 35 && opcode < 40) {
			aStringArray6[opcode - 35] = buffer.readString();
		} else {
			int var3;
			int var4;
			if (opcode == 40) {
				var3 = buffer.method367();
				aShortArray9 = new short[var3];
				aShortArray6 = new short[var3];

				for (var4 = 0; var4 < var3; var4++) {
					aShortArray9[var4] = (short) buffer.method370();
					aShortArray6[var4] = (short) buffer.method370();
				}
			} else if (opcode == 41) {
				var3 = buffer.method367();
				aShortArray7 = new short[var3];
				aShortArray8 = new short[var3];

				for (var4 = 0; var4 < var3; var4++) {
					aShortArray7[var4] = (short) buffer.method370();
					aShortArray8[var4] = (short) buffer.method370();
				}
			} else if (opcode == 42) {
				anInt443 = buffer.readByte();
			} else if (opcode == 65) {
				aBool56 = true;
			} else if (opcode == 78) {
				anInt451 = buffer.method370();
			} else if (opcode == 79) {
				anInt434 = buffer.method370();
			} else if (opcode == 90) {
				anInt440 = buffer.method370();
			} else if (opcode == 91) {
				anInt454 = buffer.method370();
			} else if (opcode == 92) {
				anInt453 = buffer.method370();
			} else if (opcode == 93) {
				anInt455 = buffer.method370();
			} else if (opcode == 95) {
				anInt468 = buffer.method370();
			} else if (opcode == 97) {
				anInt435 = buffer.method370();
			} else if (opcode == 98) {
				anInt457 = buffer.method370();
			} else if (opcode >= 100 && opcode < 110) {
				if (anIntArray105 == null) {
					anIntArray105 = new int[10];
					anIntArray106 = new int[10];
				}

				anIntArray105[opcode - 100] = buffer.method370();
				anIntArray106[opcode - 100] = buffer.method370();
			} else if (opcode == 110) {
				anInt458 = buffer.method370();
			} else if (opcode == 111) {
				anInt459 = buffer.method370();
			} else if (opcode == 112) {
				anInt439 = buffer.method370();
			} else if (opcode == 113) {
				anInt461 = buffer.readByte();
			} else if (opcode == 114) {
				anInt462 = buffer.readByte() * 5;
			} else if (opcode == 115) {
				anInt463 = buffer.method367();
			} else if (opcode == 139) {
				anInt464 = buffer.method370();
			} else if (opcode == 140) {
				anInt465 = buffer.method370();
			} else if (opcode == 148) {
				anInt445 = buffer.method370();
			} else if (opcode == 149) {
				anInt467 = buffer.method370();
			}
		}

	}

	void method489(ItemDefinition var1, ItemDefinition var2) {
		anInt441 = var1.anInt441 * 1;
		anInt444 = var1.anInt444 * 1;
		anInt456 = var1.anInt456 * 1;
		anInt466 = var1.anInt466 * 1;
		anInt468 = var1.anInt468 * 1;
		anInt436 = var1.anInt436 * 1;
		anInt452 = var1.anInt452 * 1;
		aShortArray9 = var1.aShortArray9;
		aShortArray6 = var1.aShortArray6;
		aShortArray7 = var1.aShortArray7;
		aShortArray8 = var1.aShortArray8;
		aString31 = var2.aString31;
		aBool55 = var2.aBool55;
		anInt460 = var2.anInt460 * 1;
		anInt442 = 1;
	}

	void method490(ItemDefinition var1, ItemDefinition var2) {
		anInt441 = var1.anInt441 * 1;
		anInt444 = var1.anInt444 * 1;
		anInt456 = var1.anInt456 * 1;
		anInt466 = var1.anInt466 * 1;
		anInt468 = var1.anInt468 * 1;
		anInt436 = var1.anInt436 * 1;
		anInt452 = var1.anInt452 * 1;
		aShortArray9 = var2.aShortArray9;
		aShortArray6 = var2.aShortArray6;
		aShortArray7 = var2.aShortArray7;
		aShortArray8 = var2.aShortArray8;
		aString31 = var2.aString31;
		aBool55 = var2.aBool55;
		anInt442 = var2.anInt442 * 1;
		anInt446 = var2.anInt446 * 1;
		anInt438 = var2.anInt438 * 1;
		anInt451 = var2.anInt451 * 1;
		anInt448 = var2.anInt448 * 1;
		anInt449 = var2.anInt449 * 1;
		anInt434 = var2.anInt434 * 1;
		anInt440 = var2.anInt440 * 1;
		anInt453 = var2.anInt453 * 1;
		anInt454 = var2.anInt454 * 1;
		anInt455 = var2.anInt455 * 1;
		anInt463 = var2.anInt463 * 1;
		aStringArray7 = var2.aStringArray7;
		aStringArray6 = new String[5];
		if (var2.aStringArray6 != null) {
			for (int var3 = 0; var3 < 4; var3++) {
				aStringArray6[var3] = var2.aStringArray6[var3];
			}
		}

		aStringArray6[4] = "Discard";
		anInt460 = 0;
	}

	public ItemDefinition method491(int var1) {
		if (anIntArray105 != null && var1 > 1) {
			int var3 = -1;

			for (int var2 = 0; var2 < 10; var2++) {
				if (var1 >= anIntArray106[var2] && anIntArray106[var2] != 0) {
					var3 = anIntArray105[var2];
				}
			}

			if (var3 != -1) {
				return Static.staticMethod153(var3);
			}
		}

		return this;
	}

	public final RenderableSub3 method492(boolean var1) {
		int var2 = anInt446;
		int var5 = anInt438;
		int var6 = anInt451;
		if (var1) {
			var2 = anInt448;
			var5 = anInt449;
			var6 = anInt434;
		}

		if (var2 == -1) {
			return null;
		} else {
			RenderableSub3 var3 = Static.staticMethod434(staticJs5Index14, var2, 0);
			if (var5 != -1) {
				RenderableSub3 var9 = Static.staticMethod434(staticJs5Index14, var5, 0);
				if (var6 != -1) {
					RenderableSub3 var10 = Static.staticMethod434(staticJs5Index14, var6, 0);
					RenderableSub3[] var8 = new RenderableSub3[] { var3, var9, var10 };
					var3 = new RenderableSub3(var8, 3);
				} else {
					RenderableSub3[] var101 = new RenderableSub3[] { var3, var9 };
					var3 = new RenderableSub3(var101, 2);
				}
			}

			if (!var1 && anInt447 != 0) {
				var3.method578(0, anInt447, 0);
			}

			if (var1 && anInt450 != 0) {
				var3.method578(0, anInt450, 0);
			}

			int var91;
			if (aShortArray9 != null) {
				for (var91 = 0; var91 < aShortArray9.length; var91++) {
					var3.method585(aShortArray9[var91], aShortArray6[var91]);
				}
			}

			if (aShortArray7 != null) {
				for (var91 = 0; var91 < aShortArray7.length; var91++) {
					var3.method579(aShortArray7[var91], aShortArray8[var91]);
				}
			}

			return var3;
		}
	}

	public final boolean method493(boolean var1) {
		int var2 = anInt440;
		int var4 = anInt453;
		if (var1) {
			var2 = anInt454;
			var4 = anInt455;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var3 = true;
			if (!staticJs5Index14.method276(var2, 0)) {
				var3 = false;
			}

			if (var4 != -1 && !staticJs5Index14.method276(var4, 0)) {
				var3 = false;
			}

			return var3;
		}
	}

	public final Model method494(int var1) {
		if (anIntArray105 != null && var1 > 1) {
			int var5 = -1;

			for (int var6 = 0; var6 < 10; var6++) {
				if (var1 >= anIntArray106[var6] && anIntArray106[var6] != 0) {
					var5 = anIntArray105[var6];
				}
			}

			if (var5 != -1) {
				return Static.staticMethod153(var5).method494(1);
			}
		}

		Model var51 = (Model) staticCache11.get(anInt437);
		if (var51 != null) {
			return var51;
		} else {
			RenderableSub3 var61 = Static.staticMethod434(staticJs5Index14, anInt441, 0);
			if (var61 == null) {
				return null;
			} else {
				if (anInt458 != 128 || anInt459 != 128 || anInt439 != 128) {
					var61.method587(anInt458, anInt459, anInt439);
				}

				int var2;
				if (aShortArray9 != null) {
					for (var2 = 0; var2 < aShortArray9.length; var2++) {
						var61.method585(aShortArray9[var2], aShortArray6[var2]);
					}
				}

				if (aShortArray7 != null) {
					for (var2 = 0; var2 < aShortArray7.length; var2++) {
						var61.method579(aShortArray7[var2], aShortArray8[var2]);
					}
				}

				var51 = var61.method583(anInt461 + 64, anInt462 + 768, -50, -10, -50);
				var51.aBool80 = true;
				staticCache11.method170(var51, anInt437);
				return var51;
			}
		}
	}

	public final boolean method495(boolean var1) {
		int var2 = anInt446;
		int var3 = anInt438;
		int var4 = anInt451;
		if (var1) {
			var2 = anInt448;
			var3 = anInt449;
			var4 = anInt434;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!staticJs5Index14.method276(var2, 0)) {
				var5 = false;
			}

			if (var3 != -1 && !staticJs5Index14.method276(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !staticJs5Index14.method276(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	public final RenderableSub3 method496(int var1) {
		int var2;
		if (anIntArray105 != null && var1 > 1) {
			int var4 = -1;

			for (var2 = 0; var2 < 10; var2++) {
				if (var1 >= anIntArray106[var2] && anIntArray106[var2] != 0) {
					var4 = anIntArray105[var2];
				}
			}

			if (var4 != -1) {
				return Static.staticMethod153(var4).method496(1);
			}
		}

		RenderableSub3 var41 = Static.staticMethod434(staticJs5Index14, anInt441, 0);
		if (var41 == null) {
			return null;
		} else {
			if (anInt458 != 128 || anInt459 != 128 || anInt439 != 128) {
				var41.method587(anInt458, anInt459, anInt439);
			}

			if (aShortArray9 != null) {
				for (var2 = 0; var2 < aShortArray9.length; var2++) {
					var41.method585(aShortArray9[var2], aShortArray6[var2]);
				}
			}

			if (aShortArray7 != null) {
				for (var2 = 0; var2 < aShortArray7.length; var2++) {
					var41.method579(aShortArray7[var2], aShortArray8[var2]);
				}
			}

			return var41;
		}
	}

	void method497(ItemDefinition var1, ItemDefinition var2) {
		anInt441 = var1.anInt441 * 1;
		anInt444 = var1.anInt444 * 1;
		anInt456 = var1.anInt456 * 1;
		anInt466 = var1.anInt466 * 1;
		anInt468 = var1.anInt468 * 1;
		anInt436 = var1.anInt436 * 1;
		anInt452 = var1.anInt452 * 1;
		aShortArray9 = var1.aShortArray9;
		aShortArray6 = var1.aShortArray6;
		aShortArray7 = var1.aShortArray7;
		aShortArray8 = var1.aShortArray8;
		anInt442 = var1.anInt442 * 1;
		aString31 = var2.aString31;
		anInt460 = 0;
		aBool55 = false;
		aBool56 = false;
	}

	void method498(ByteBuf var1) {
		while (true) {
			int var2 = var1.method367();
			if (var2 == 0) {
				return;
			}

			decode(var1, var2);
		}
	}

	public int method499() {
		return anInt443 != -1 && aStringArray6 != null ? anInt443 >= 0 ? aStringArray6[anInt443] != null ? anInt443 : -1
				: "Drop".equalsIgnoreCase(aStringArray6[4]) ? 4 : -1 : -1;
	}

}
