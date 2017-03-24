public class ObjectDefinition extends Cacheable {

	public static FileStore staticJs5Index19;
	public int anInt483;
	public static FileStore staticJs5Index20;
	static int staticInt322;
	public static boolean staticBool46 = false;
	static Cache staticCache18 = new Cache(64);
	public static Cache staticCache15 = new Cache(500);
	static Cache staticCache16 = new Cache(30);
	static Cache staticCache17 = new Cache(30);
	static RenderableSub3[] staticRenderableSub3Array1 = new RenderableSub3[4];
	public String aString33 = "null";
	public int anInt485 = 1;
	public int anInt486 = 1;
	public int anInt487 = 2;
	public boolean aBool60 = true;
	public int anInt489 = -1;
	int anInt490 = -1;
	boolean aBool58 = false;
	public boolean aBool59 = false;
	public int anInt491 = -1;
	public int anInt492 = 16;
	int anInt497 = 0;
	int anInt484 = 0;
	public int anInt494 = -1;
	boolean aBool61 = false;
	public boolean aBool62 = true;
	int anInt496 = 128;
	int anInt488 = 128;
	int anInt498 = 128;
	public int anInt507 = -1;
	int anInt499 = 0;
	int anInt500 = 0;
	int anInt502 = 0;
	public boolean aBool63 = false;
	boolean aBool57 = false;
	public int anInt493 = 238048809;
	int anInt503 = -1;
	int anInt501 = -1;
	public int anInt504 = -1;
	public int anInt505 = 0;
	public int anInt495 = 0;
	public int anInt506 = 0;
	public String[] aStringArray8 = new String[5];
	int[] anIntArray108;
	int[] anIntArray110;
	short[] aShortArray10;
	short[] aShortArray11;
	short[] aShortArray12;
	short[] aShortArray13;
	public int[] anIntArray109;
	public int[] anIntArray111;

	// TODO obj def decode
	void decode(ByteBuf buffer, int opcode) {		
		int var3;
		int var4;
		if (opcode == 1) {
			var4 = buffer.readUByte();
			if (var4 > 0) {
				if (anIntArray110 != null && !staticBool46) {
					buffer.position += var4 * 3;
				} else {
					anIntArray108 = new int[var4];
					anIntArray110 = new int[var4];

					for (var3 = 0; var3 < var4; var3++) {
						anIntArray110[var3] = buffer.method370();
						anIntArray108[var3] = buffer.readUByte();
					}
				}
			}
		} else if (opcode == 2) {
			aString33 = buffer.readString();
		} else if (opcode == 5) {
			var4 = buffer.readUByte();
			if (var4 > 0) {
				if (anIntArray110 != null && !staticBool46) {
					buffer.position += var4 * 2;
				} else {
					anIntArray108 = null;
					anIntArray110 = new int[var4];

					for (var3 = 0; var3 < var4; var3++) {
						anIntArray110[var3] = buffer.method370();
					}
				}
			}
		} else if (opcode == 14) {
			anInt485 = buffer.readUByte();
		} else if (opcode == 15) {
			anInt486 = buffer.readUByte();
		} else if (opcode == 17) {
			anInt487 = 0;
			aBool60 = false;
		} else if (opcode == 18) {
			aBool60 = false;
		} else if (opcode == 19) {
			anInt489 = buffer.readUByte();
		} else if (opcode == 21) {
			anInt490 = 0;
		} else if (opcode == 22) {
			aBool58 = true;
		} else if (opcode == 23) {
			aBool59 = true;
		} else if (opcode == 24) {
			anInt491 = buffer.method370();
			if (anInt491 == '\uffff') {
				anInt491 = -1;
			}
		} else if (opcode == 27) {
			anInt487 = 1;
		} else if (opcode == 28) {
			anInt492 = buffer.readUByte();
		} else if (opcode == 29) {
			anInt497 = buffer.readByte();
		} else if (opcode == 39) {
			anInt484 = buffer.readByte() * 25;
		} else if (opcode >= 30 && opcode < 35) {
			aStringArray8[opcode - 30] = buffer.readString();
			if (aStringArray8[opcode - 30].equalsIgnoreCase("Hidden")) {
				aStringArray8[opcode - 30] = null;
			}
		} else if (opcode == 40) {
			var4 = buffer.readUByte();
			aShortArray10 = new short[var4];
			aShortArray11 = new short[var4];

			for (var3 = 0; var3 < var4; var3++) {
				aShortArray10[var3] = (short) buffer.method370();
				aShortArray11[var3] = (short) buffer.method370();
			}
		} else if (opcode == 41) {
			var4 = buffer.readUByte();
			aShortArray12 = new short[var4];
			aShortArray13 = new short[var4];

			for (var3 = 0; var3 < var4; var3++) {
				aShortArray12[var3] = (short) buffer.method370();
				aShortArray13[var3] = (short) buffer.method370();
			}
		} else if (opcode == 60) {
			anInt494 = buffer.method370();
		} else if (opcode == 62) {
			aBool61 = true;
		} else if (opcode == 64) {
			aBool62 = false;
		} else if (opcode == 65) {
			anInt496 = buffer.method370();
		} else if (opcode == 66) {
			anInt488 = buffer.method370();
		} else if (opcode == 67) {
			anInt498 = buffer.method370();
		} else if (opcode == 68) {
			anInt507 = buffer.method370();
		} else if (opcode == 69) {
			buffer.readUByte();
		} else if (opcode == 70) {
			anInt499 = buffer.method364();
		} else if (opcode == 71) {
			anInt500 = buffer.method364();
		} else if (opcode == 72) {
			anInt502 = buffer.method364();
		} else if (opcode == 73) {
			aBool63 = true;
		} else if (opcode == 74) {
			aBool57 = true;
		} else if (opcode == 75) {
			anInt493 = buffer.readUByte() * -238048809;
		} else if (opcode != 77 && opcode != 92) {
			if (opcode == 78) {
				anInt504 = buffer.method370();
				anInt505 = buffer.readUByte();
			} else if (opcode == 79) {
				anInt495 = buffer.method370() * -2128966019;
				anInt506 = buffer.method370() * 1408592117;
				anInt505 = buffer.readUByte();
				var4 = buffer.readUByte();
				anIntArray109 = new int[var4];

				for (var3 = 0; var3 < var4; var3++) {
					anIntArray109[var3] = buffer.method370();
				}
			} else if (opcode == 81) {
				anInt490 = buffer.readUByte() * 256;
			}
		} else {
			anInt503 = buffer.method370();
			if (anInt503 == '\uffff') {
				anInt503 = -1;
			}

			anInt501 = buffer.method370();
			if (anInt501 == '\uffff') {
				anInt501 = -1;
			}

			var4 = -1;
			if (opcode == 92) {
				var4 = buffer.method370();
				if (var4 == '\uffff') {
					var4 = -1;
				}
			}

			var3 = buffer.readUByte();
			anIntArray111 = new int[var3 + 2];

			for (int var5 = 0; var5 <= var3; var5++) {
				anIntArray111[var5] = buffer.method370();
				if (anIntArray111[var5] == '\uffff') {
					anIntArray111[var5] = -1;
				}
			}

			anIntArray111[var3 + 1] = var4;
		}

	}

	void method510() {
		if (anInt489 == -1) {
			anInt489 = 0;
			if (anIntArray110 != null && (anIntArray108 == null || anIntArray108[0] == 10)) {
				anInt489 = 1;
			}

			for (int var1 = 0; var1 < 5; var1++) {
				if (aStringArray8[var1] != null) {
					anInt489 = 1;
				}
			}
		}

		if (anInt493 * 582900199 == -1) {
			anInt493 = -238048809 * (anInt487 != 0 ? 1 : 0);
		}

	}

	public final boolean method511(int var1) {
		if (anIntArray108 != null) {
			for (int var4 = 0; var4 < anIntArray108.length; var4++) {
				if (var1 == anIntArray108[var4]) {
					return staticJs5Index19.method276(anIntArray110[var4] & 0xffff, 0);
				}
			}

			return true;
		} else if (anIntArray110 == null) {
			return true;
		} else if (var1 != 10) {
			return true;
		} else {
			boolean var3 = true;

			for (int var2 = 0; var2 < anIntArray110.length; var2++) {
				var3 &= staticJs5Index19.method276(anIntArray110[var2] & 0xffff, 0);
			}

			return var3;
		}
	}

	public final Model method512(int var1, int var2, int[][] var3, int var4, int var5, int var6, AnimationDefintion var7,
			int var8) {
		long var9;
		if (anIntArray108 == null) {
			var9 = var2 + (anInt483 << 10);
		} else {
			var9 = var2 + (anInt483 << 10) + (var1 << 3);
		}

		Model var11 = (Model) staticCache17.get(var9);
		if (var11 == null) {
			RenderableSub3 var12 = method515(var1, var2);
			if (var12 == null) {
				return null;
			}

			var11 = var12.method583(64 + anInt497, 768 + anInt484, -50, -10, -50);
			staticCache17.method170(var11, var9);
		}

		if (var7 == null && anInt490 == -1) {
			return var11;
		} else {
			if (var7 != null) {
				var11 = var7.method553(var11, var8, var2);
			} else {
				var11 = var11.method589(true);
			}

			if (anInt490 >= 0) {
				var11 = var11.method588(var3, var4, var5, var6, false, anInt490);
			}

			return var11;
		}
	}

	public final boolean method513() {
		if (anIntArray110 == null) {
			return true;
		} else {
			boolean var1 = true;

			for (int var2 = 0; var2 < anIntArray110.length; var2++) {
				var1 &= staticJs5Index19.method276(anIntArray110[var2] & 0xffff, 0);
			}

			return var1;
		}
	}

	public final Renderable method514(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var8;
		if (anIntArray108 == null) {
			var8 = (anInt483 << 10) + var2;
		} else {
			var8 = (anInt483 << 10) + (var1 << 3) + var2;
		}

		Object var7 = staticCache16.get(var8);
		if (var7 == null) {
			RenderableSub3 var10 = method515(var1, var2);
			if (var10 == null) {
				return null;
			}

			if (!aBool58) {
				var7 = var10.method583(64 + anInt497, anInt484 + 768, -50, -10, -50);
			} else {
				var10.aShort2 = (short) (anInt497 + 64);
				var10.aShort3 = (short) (768 + anInt484);
				var10.method586();
				var7 = var10;
			}

			staticCache16.method170((Cacheable) var7, var8);
		}

		if (aBool58) {
			var7 = ((RenderableSub3) var7).method581();
		}

		if (anInt490 >= 0) {
			if (var7 instanceof Model) {
				var7 = ((Model) var7).method588(var3, var4, var5, var6, true, anInt490);
			} else if (var7 instanceof RenderableSub3) {
				var7 = ((RenderableSub3) var7).method572(var3, var4, var5, var6, true, anInt490);
			}
		}

		return (Renderable) var7;
	}

	final RenderableSub3 method515(int var1, int var2) {
		RenderableSub3 var3 = null;
		int var4;
		boolean var6;
		int var7;
		int var9;
		if (anIntArray108 == null) {
			if (var1 != 10) {
				return null;
			}

			if (anIntArray110 == null) {
				return null;
			}

			var6 = aBool61;
			if (var1 == 2 && var2 > 3) {
				var6 = !var6;
			}

			var4 = anIntArray110.length;

			for (var9 = 0; var9 < var4; var9++) {
				var7 = anIntArray110[var9];
				if (var6) {
					var7 += 65536;
				}

				var3 = (RenderableSub3) staticCache15.get(var7);
				if (var3 == null) {
					var3 = Static.staticMethod434(staticJs5Index19, var7 & 0xffff, 0);
					if (var3 == null) {
						return null;
					}

					if (var6) {
						var3.method580();
					}

					staticCache15.method170(var3, var7);
				}

				if (var4 > 1) {
					staticRenderableSub3Array1[var9] = var3;
				}
			}

			if (var4 > 1) {
				var3 = new RenderableSub3(staticRenderableSub3Array1, var4);
			}
		} else {
			var9 = -1;

			for (var4 = 0; var4 < anIntArray108.length; var4++) {
				if (var1 == anIntArray108[var4]) {
					var9 = var4;
					break;
				}
			}

			if (var9 == -1) {
				return null;
			}

			var4 = anIntArray110[var9];
			boolean var10 = aBool61 ^ var2 > 3;
			if (var10) {
				var4 += 65536;
			}

			var3 = (RenderableSub3) staticCache15.get(var4);
			if (var3 == null) {
				var3 = Static.staticMethod434(staticJs5Index19, var4 & 0xffff, 0);
				if (var3 == null) {
					return null;
				}

				if (var10) {
					var3.method580();
				}

				staticCache15.method170(var3, var4);
			}
		}

		if (anInt496 == 128 && anInt488 == 128 && anInt498 == 128) {
			var6 = false;
		} else {
			var6 = true;
		}

		boolean var101;
		if (anInt499 == 0 && anInt500 == 0 && anInt502 == 0) {
			var101 = false;
		} else {
			var101 = true;
		}

		RenderableSub3 var91 = new RenderableSub3(var3, var2 == 0 && !var6 && !var101, aShortArray10 == null,
				aShortArray12 == null, true);
		if (var1 == 4 && var2 > 3) {
			var91.method577(256);
			var91.method578(45, 0, -45);
		}

		var2 &= 3;
		if (var2 == 1) {
			var91.method574();
		} else if (var2 == 2) {
			var91.method575();
		} else if (var2 == 3) {
			var91.method576();
		}

		if (aShortArray10 != null) {
			for (var7 = 0; var7 < aShortArray10.length; var7++) {
				var91.method585(aShortArray10[var7], aShortArray11[var7]);
			}
		}

		if (aShortArray12 != null) {
			for (var7 = 0; var7 < aShortArray12.length; var7++) {
				var91.method579(aShortArray12[var7], aShortArray13[var7]);
			}
		}

		if (var6) {
			var91.method587(anInt496, anInt488, anInt498);
		}

		if (var101) {
			var91.method578(anInt499, anInt500, anInt502);
		}

		return var91;
	}

	public final ObjectDefinition method516() {
		int var1 = -1;
		if (anInt503 != -1) {
			var1 = Static.staticMethod82(anInt503);
		} else if (anInt501 != -1) {
			var1 = Static.staticIntArray64[anInt501];
		}

		int var2;
		if (var1 >= 0 && var1 < anIntArray111.length - 1) {
			var2 = anIntArray111[var1];
		} else {
			var2 = anIntArray111[anIntArray111.length - 1];
		}

		return var2 != -1 ? Static.staticMethod394(var2) : null;
	}

	public boolean method517() {
		if (anIntArray111 == null) {
			return anInt504 != -1 || anIntArray109 != null;
		} else {
			for (int var1 = 0; var1 < anIntArray111.length; var1++) {
				if (anIntArray111[var1] != -1) {
					ObjectDefinition var2 = Static.staticMethod394(anIntArray111[var1]);
					if (var2.anInt504 != -1 || var2.anIntArray109 != null) {
						return true;
					}
				}
			}

			return false;
		}
	}

	void method518(ByteBuf var1) {
		while (true) {
			int var2 = var1.readUByte();
			if (var2 == 0) {
				return;
			}

			decode(var1, var2);
		}
	}

	public final Model method519(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var8;
		if (anIntArray108 == null) {
			var8 = var2 + (anInt483 << 10);
		} else {
			var8 = var2 + (var1 << 3) + (anInt483 << 10);
		}

		Model var7 = (Model) staticCache17.get(var8);
		if (var7 == null) {
			RenderableSub3 var10 = method515(var1, var2);
			if (var10 == null) {
				return null;
			}

			var7 = var10.method583(64 + anInt497, anInt484 + 768, -50, -10, -50);
			staticCache17.method170(var7, var8);
		}

		if (anInt490 >= 0) {
			var7 = var7.method588(var3, var4, var5, var6, true, anInt490);
		}

		return var7;
	}

}
