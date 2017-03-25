public class Widget extends Node {

	public static Widget[][] staticWidgetArrayArray1;
	public static AbstractFileStore staticJs5Index9;
	public static AbstractFileStore staticJs5Index10;
	public Object[] anObjectArray18;
	public Object[] anObjectArray19;
	public Object[] anObjectArray20;
	public Object[] anObjectArray21;
	public Object[] anObjectArray22;
	public Object[] anObjectArray23;
	public Object[] anObjectArray24;
	public Object[] anObjectArray25;
	public Object[] anObjectArray26;
	public Object[] anObjectArray27;
	public Widget[] aWidgetArray1;
	public static boolean staticBool44 = false;
	public static Cache staticCache2 = new Cache(200);
	public static Cache staticCache5 = new Cache(50);
	public static Cache staticCache3 = new Cache(20);
	public static Cache staticCache4 = new Cache(8);
	public boolean aBool31;
	public boolean aBool42 = false;
	public int anInt294 = -1;
	public int anInt319 = -1;
	public int anInt331 = 0;
	public int anInt298 = 0;
	public int anInt299 = 0;
	public int anInt300 = 0;
	public int anInt293 = 0;
	public int anInt311 = 0;
	public int anInt302 = 0;
	public int anInt303 = 0;
	public int anInt304 = 0;
	public int anInt305 = 0;
	public int anInt341 = 0;
	public int anInt306 = 0;
	public int anInt307 = 0;
	public int anInt351 = 0;
	public int anInt309 = 1;
	public int anInt346 = 1;
	public int anInt342 = -1;
	public boolean aBool32 = false;
	public int anInt335 = 0;
	public int anInt312 = 0;
	public int anInt344 = 0;
	public int anInt361 = 0;
	public int anInt360 = 0;
	public int anInt313 = 0;
	public int anInt321 = 0;
	public int anInt315 = 0;
	public boolean aBool33 = false;
	public Class54 aClass54_1;
	public int anInt317;
	public int anInt318;
	public int anInt308;
	public boolean aBool34;
	public int anInt320;
	public int anInt349;
	public int anInt350;
	public boolean aBool35;
	public int anInt322;
	public int anInt323;
	public int anInt348;
	public int anInt295;
	int anInt301;
	int anInt326;
	public int anInt327;
	public int anInt328;
	public int anInt329;
	public int anInt330;
	public int anInt325;
	public int anInt332;
	public int anInt324;
	public int anInt334;
	public int anInt291;
	public int anInt336;
	public boolean aBool39;
	public int anInt337;
	public int anInt347;
	public String aString20;
	public String aString19;
	public int anInt338;
	public int anInt339;
	public int anInt340;
	public boolean aBool40;
	public int anInt297;
	public int anInt333;
	public int anInt343;
	public String aString21;
	public Widget aWidget3;
	public int anInt345;
	public int anInt316;
	public boolean aBool41;
	public String aString22;
	public int anInt310;
	public String aString23;
	public String aString18;
	public int anInt352;
	public int anInt353;
	public int anInt354;
	public int anInt314;
	public boolean aBool44;
	public boolean aBool45;
	public int anInt355;
	public int anInt356;
	public int anInt357;
	public int anInt358;
	public int anInt292;
	public int anInt359;
	public boolean aBool43;
	public boolean aBool38;
	public int anInt296;
	public int[] anIntArray73;
	public int[] anIntArray70;
	public int[][] anIntArrayArray12;
	public int[] anIntArray76;
	public int[] anIntArray77;
	public int[] anIntArray75;
	public int[] anIntArray72;
	public int[] anIntArray68;
	public String[] aStringArray3;
	public boolean aBool36;
	public String[] aStringArray4;
	public boolean aBool37;
	public Object[] anObjectArray4;
	public Object[] anObjectArray7;
	public Object[] anObjectArray9;
	public Object[] anObjectArray12;
	public Object[] anObjectArray11;
	public Object[] anObjectArray13;
	public Object[] anObjectArray14;
	public Object[] anObjectArray15;
	public Object[] anObjectArray16;
	public Object[] anObjectArray17;
	public Object[] anObjectArray8;
	public Object[] anObjectArray5;
	public Object[] anObjectArray3;
	public Object[] anObjectArray29;
	public Object[] anObjectArray6;
	public Object[] anObjectArray10;
	public Object[] anObjectArray28;
	public Object[] anObjectArray30;
	public int[] anIntArray74;
	public int[] anIntArray69;
	public int[] anIntArray71;

	public Picture method383(boolean var1) {
		staticBool44 = false;
		int var2;
		if (var1) {
			var2 = anInt349;
		} else {
			var2 = anInt320;
		}

		if (var2 == -1) {
			return null;
		} else {
			long var4 = ((aBool37 ? 1L : 0L) << 39) + ((long) anInt322 << 36) + var2 + ((aBool36 ? 1L : 0L) << 38)
					+ ((long) anInt323 << 40);
			Picture var3 = (Picture) staticCache2.get(var4);
			if (var3 != null) {
				return var3;
			} else {
				var3 = Static.staticMethod296(staticJs5Index9, var2, 0);
				if (var3 == null) {
					staticBool44 = true;
					return null;
				} else {
					if (aBool36) {
						var3.method635();
					}

					if (aBool37) {
						var3.method649();
					}

					if (anInt322 > 0) {
						var3.method634(anInt322);
					}

					if (anInt322 >= 1) {
						var3.method652(1);
					}

					if (anInt322 >= 2) {
						var3.method652(16777215);
					}

					if (anInt323 != 0) {
						var3.method647(anInt323);
					}

					staticCache2.method170(var3, var4);
					return var3;
				}
			}
		}
	}

	public Picture method384(int var1) {
		staticBool44 = false;
		if (var1 >= 0 && var1 < anIntArray68.length) {
			int var3 = anIntArray68[var1];
			if (var3 == -1) {
				return null;
			} else {
				Picture var2 = (Picture) staticCache2.get(var3);
				if (var2 != null) {
					return var2;
				} else {
					var2 = Static.staticMethod296(staticJs5Index9, var3, 0);
					if (var2 != null) {
						staticCache2.method170(var2, var3);
					} else {
						staticBool44 = true;
					}

					return var2;
				}
			}
		} else {
			return null;
		}
	}

	Object[] method385(ByteBuf var1) {
		int var2 = var1.readUByte();
		if (var2 == 0) {
			return null;
		} else {
			Object[] var4 = new Object[var2];

			for (int var3 = 0; var3 < var2; var3++) {
				int var5 = var1.readUByte();
				if (var5 == 0) {
					var4[var3] = new Integer(var1.readInt());
				} else if (var5 == 1) {
					var4[var3] = var1.readString();
				}
			}

			aBool31 = true;
			return var4;
		}
	}

	public void method386(int var1, int var2) {
		int var3 = anIntArray76[var2];
		anIntArray76[var2] = anIntArray76[var1];
		anIntArray76[var1] = var3;
		var3 = anIntArray77[var2];
		anIntArray77[var2] = anIntArray77[var1];
		anIntArray77[var1] = var3;
	}

	public GameFontSub1 method387() {
		staticBool44 = false;
		if (anInt347 == -1) {
			return null;
		} else {
			GameFontSub1 var1 = (GameFontSub1) staticCache3.get(anInt347);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Static.staticMethod54(staticJs5Index9, DataClass3.staticJs5Index2, anInt347, 0);
				if (var1 != null) {
					staticCache3.method170(var1, anInt347);
				} else {
					staticBool44 = true;
				}

				return var1;
			}
		}
	}

	public Widget() {
		aClass54_1 = Class54.staticClass54_5;
		anInt317 = 0;
		anInt318 = 0;
		anInt308 = 1;
		aBool34 = false;
		anInt320 = -1;
		anInt349 = -1;
		anInt350 = 0;
		aBool35 = false;
		anInt322 = 0;
		anInt323 = 0;
		anInt348 = 1;
		anInt295 = -1;
		anInt301 = 1;
		anInt326 = -1;
		anInt327 = -1;
		anInt328 = -1;
		anInt329 = 0;
		anInt330 = 0;
		anInt325 = 0;
		anInt332 = 0;
		anInt324 = 0;
		anInt334 = 100;
		anInt291 = 0;
		anInt336 = 0;
		aBool39 = false;
		anInt337 = 2;
		anInt347 = -1;
		aString20 = "";
		aString19 = "";
		anInt338 = 0;
		anInt339 = 0;
		anInt340 = 0;
		aBool40 = false;
		anInt297 = 0;
		anInt333 = 0;
		anInt343 = 0;
		aString21 = "";
		aWidget3 = null;
		anInt345 = 0;
		anInt316 = 0;
		aBool41 = false;
		aString22 = "";
		aBool31 = false;
		anInt310 = -1;
		aString23 = "";
		aString18 = "Ok";
		anInt352 = -1;
		anInt353 = 0;
		anInt354 = 0;
		anInt314 = 0;
		aBool44 = false;
		aBool45 = false;
		anInt355 = -1;
		anInt356 = 0;
		anInt357 = 0;
		anInt358 = 0;
		anInt292 = -1;
		anInt359 = 1;
		aBool43 = false;
		aBool38 = false;
	}

	public Model method388(AnimationDefintion var1, int var2, boolean var3, Class49 var4) {
		staticBool44 = false;
		int var7;
		int var8;
		if (var3) {
			var7 = anInt301;
			var8 = anInt326;
		} else {
			var7 = anInt348;
			var8 = anInt295;
		}

		if (var7 == 0) {
			return null;
		} else if (var7 == 1 && var8 == -1) {
			return null;
		} else {
			Model var9 = (Model) staticCache5.get((var7 << 16) + var8);
			if (var9 == null) {
				EntitySub3 var6;
				if (var7 == 1) {
					var6 = Static.staticMethod434(Static.staticJs5Index7, var8, 0);
					if (var6 == null) {
						staticBool44 = true;
						return null;
					}

					var9 = var6.method583(64, 768, -50, -10, -50);
				}

				if (var7 == 2) {
					var6 = Static.staticMethod85(var8).method542();
					if (var6 == null) {
						staticBool44 = true;
						return null;
					}

					var9 = var6.method583(64, 768, -50, -10, -50);
				}

				if (var7 == 3) {
					if (var4 == null) {
						return null;
					}

					var6 = var4.method249();
					if (var6 == null) {
						staticBool44 = true;
						return null;
					}

					var9 = var6.method583(64, 768, -50, -10, -50);
				}

				if (var7 == 4) {
					ItemDefinition var5 = Static.staticMethod153(var8);
					var6 = var5.method496(10);
					if (var6 == null) {
						staticBool44 = true;
						return null;
					}

					var9 = var6.method583(var5.anInt461 + 64, var5.anInt462 + 768, -50, -10, -50);
				}

				staticCache5.method170(var9, (var7 << 16) + var8);
			}

			if (var1 != null) {
				var9 = var1.method557(var9, var2);
			}

			return var9;
		}
	}

	public CacheableSub3 method389(boolean var1) {
		if (anInt349 == -1) {
			var1 = false;
		}

		int var4 = var1 ? anInt349 : anInt320;
		if (var4 == -1) {
			return null;
		} else {
			long var5 = ((long) anInt323 << 40) + ((aBool36 ? 1L : 0L) << 38) + var4 + ((long) anInt322 << 36)
					+ ((aBool37 ? 1L : 0L) << 39);
			CacheableSub3 var7 = (CacheableSub3) staticCache4.get(var5);
			if (var7 != null) {
				return var7;
			} else {
				Picture var8 = method383(var1);
				if (var8 == null) {
					return null;
				} else {
					Picture var9 = var8.method632();
					int[] var13 = new int[var9.anInt671];
					int[] var10 = new int[var9.anInt671];

					for (int var2 = 0; var2 < var9.anInt671; var2++) {
						int var11 = 0;
						int var12 = var9.anInt672;

						int var3;
						for (var3 = 0; var3 < var9.anInt672; var3++) {
							if (var9.anIntArray154[var3 + var9.anInt672 * var2] == 0) {
								var11 = var3;
								break;
							}
						}

						for (var3 = var9.anInt672 - 1; var3 >= var11; --var3) {
							if (var9.anIntArray154[var9.anInt672 * var2 + var3] == 0) {
								var12 = var3 + 1;
								break;
							}
						}

						var13[var2] = var11;
						var10[var2] = var12 - var11;
					}

					var7 = new CacheableSub3(var9.anInt672, var9.anInt671, var10, var13, var4);
					staticCache4.method170(var7, var5);
					return var7;
				}
			}
		}
	}

	int[] method390(ByteBuf var1) {
		int var2 = var1.readUByte();
		if (var2 == 0) {
			return null;
		} else {
			int[] var4 = new int[var2];

			for (int var3 = 0; var3 < var2; var3++) {
				var4[var3] = var1.readInt();
			}

			return var4;
		}
	}

	void method391(ByteBuf var1) {
		aBool42 = false;
		anInt296 = var1.readUByte();
		anInt331 = var1.readUByte();
		anInt298 = var1.readUShort();
		anInt302 = var1.method364();
		anInt303 = var1.method364();
		anInt304 = var1.readUShort();
		anInt305 = var1.readUShort();
		anInt317 = var1.readUByte();
		anInt342 = var1.readUShort();
		if (anInt342 == '\uffff') {
			anInt342 = -1;
		} else {
			anInt342 += anInt294 & 0xffff0000;
		}

		anInt310 = var1.readUShort();
		if (anInt310 == '\uffff') {
			anInt310 = -1;
		}

		int var6 = var1.readUByte();
		int var4;
		if (var6 > 0) {
			anIntArray73 = new int[var6];
			anIntArray70 = new int[var6];

			for (var4 = 0; var4 < var6; var4++) {
				anIntArray73[var4] = var1.readUByte();
				anIntArray70[var4] = var1.readUShort();
			}
		}

		var4 = var1.readUByte();
		int var2;
		int var3;
		int var8;
		if (var4 > 0) {
			anIntArrayArray12 = new int[var4][];

			for (var2 = 0; var2 < var4; var2++) {
				var3 = var1.readUShort();
				anIntArrayArray12[var2] = new int[var3];

				for (var8 = 0; var8 < var3; var8++) {
					anIntArrayArray12[var2][var8] = var1.readUShort();
					if (anIntArrayArray12[var2][var8] == '\uffff') {
						anIntArrayArray12[var2][var8] = -1;
					}
				}
			}
		}

		if (anInt296 == 0) {
			anInt361 = var1.readUShort();
			aBool32 = var1.readUByte() == 1;
		}

		if (anInt296 == 1) {
			var1.readUShort();
			var1.readUByte();
		}

		if (anInt296 == 2) {
			anIntArray76 = new int[anInt305 * anInt304];
			anIntArray77 = new int[anInt305 * anInt304];
			var2 = var1.readUByte();
			if (var2 == 1) {
				anInt343 |= 268435456;
			}

			var3 = var1.readUByte();
			if (var3 == 1) {
				anInt343 |= 1073741824;
			}

			var8 = var1.readUByte();
			if (var8 == 1) {
				anInt343 |= Integer.MIN_VALUE;
			}

			int var11 = var1.readUByte();
			if (var11 == 1) {
				anInt343 |= 536870912;
			}

			anInt297 = var1.readUByte();
			anInt333 = var1.readUByte();
			anIntArray75 = new int[20];
			anIntArray72 = new int[20];
			anIntArray68 = new int[20];

			int var7;
			for (var7 = 0; var7 < 20; var7++) {
				int var10 = var1.readUByte();
				if (var10 == 1) {
					anIntArray75[var7] = var1.method364();
					anIntArray72[var7] = var1.method364();
					anIntArray68[var7] = var1.readInt();
				} else {
					anIntArray68[var7] = -1;
				}
			}

			aStringArray3 = new String[5];

			for (var7 = 0; var7 < 5; var7++) {
				String var111 = var1.readString();
				if (var111.length() > 0) {
					aStringArray3[var7] = var111;
					anInt343 |= 1 << 23 + var7;
				}
			}
		}

		if (anInt296 == 3) {
			aBool33 = var1.readUByte() == 1;
		}

		if (anInt296 == 4 || anInt296 == 1) {
			anInt339 = var1.readUByte();
			anInt340 = var1.readUByte();
			anInt338 = var1.readUByte();
			anInt347 = var1.readUShort();
			if (anInt347 == '\uffff') {
				anInt347 = -1;
			}

			aBool40 = var1.readUByte() == 1;
		}

		if (anInt296 == 4) {
			aString20 = var1.readString();
			aString19 = var1.readString();
		}

		if (anInt296 == 1 || anInt296 == 3 || anInt296 == 4) {
			anInt360 = var1.readInt();
		}

		if (anInt296 == 3 || anInt296 == 4) {
			anInt313 = var1.readInt();
			anInt321 = var1.readInt();
			anInt315 = var1.readInt();
		}

		if (anInt296 == 5) {
			anInt320 = var1.readInt();
			anInt349 = var1.readInt();
		}

		if (anInt296 == 6) {
			anInt348 = 1;
			anInt295 = var1.readUShort();
			if (anInt295 == '\uffff') {
				anInt295 = -1;
			}

			anInt301 = 1;
			anInt326 = var1.readUShort();
			if (anInt326 == '\uffff') {
				anInt326 = -1;
			}

			anInt327 = var1.readUShort();
			if (anInt327 == '\uffff') {
				anInt327 = -1;
			}

			anInt328 = var1.readUShort();
			if (anInt328 == '\uffff') {
				anInt328 = -1;
			}

			anInt334 = var1.readUShort();
			anInt325 = var1.readUShort();
			anInt332 = var1.readUShort();
		}

		if (anInt296 == 7) {
			anIntArray76 = new int[anInt304 * anInt305];
			anIntArray77 = new int[anInt305 * anInt304];
			anInt339 = var1.readUByte();
			anInt347 = var1.readUShort();
			if (anInt347 == '\uffff') {
				anInt347 = -1;
			}

			aBool40 = var1.readUByte() == 1;
			anInt360 = var1.readInt();
			anInt297 = var1.method364();
			anInt333 = var1.method364();
			var2 = var1.readUByte();
			if (var2 == 1) {
				anInt343 |= 1073741824;
			}

			aStringArray3 = new String[5];

			for (var3 = 0; var3 < 5; var3++) {
				String var101 = var1.readString();
				if (var101.length() > 0) {
					aStringArray3[var3] = var101;
					anInt343 |= 1 << 23 + var3;
				}
			}
		}

		if (anInt296 == 8) {
			aString20 = var1.readString();
		}

		if (anInt331 == 2 || anInt296 == 2) {
			aString22 = var1.readString();
			aString23 = var1.readString();
			var2 = var1.readUShort() & 0x3f;
			anInt343 |= var2 << 11;
		}

		if (anInt331 == 1 || anInt331 == 4 || anInt331 == 5 || anInt331 == 6) {
			aString18 = var1.readString();
			if (aString18.length() == 0) {
				if (anInt331 == 1) {
					aString18 = "Ok";
				}

				if (anInt331 == 4) {
					aString18 = "Select";
				}

				if (anInt331 == 5) {
					aString18 = "Select";
				}

				if (anInt331 == 6) {
					aString18 = "Continue";
				}
			}
		}

		if (anInt331 == 1 || anInt331 == 4 || anInt331 == 5) {
			anInt343 |= 4194304;
		}

		if (anInt331 == 6) {
			anInt343 |= 1;
		}

	}

	void method392(ByteBuf var1) {
		var1.readUByte();
		aBool42 = true;
		anInt296 = var1.readUByte();
		anInt298 = var1.readUShort();
		anInt302 = var1.method364();
		anInt303 = var1.method364();
		anInt304 = var1.readUShort();
		if (anInt296 == 9) {
			anInt305 = var1.method364();
		} else {
			anInt305 = var1.readUShort();
		}

		anInt293 = var1.readByte();
		anInt311 = var1.readByte();
		anInt299 = var1.readByte();
		anInt300 = var1.readByte();
		anInt342 = var1.readUShort();
		if (anInt342 == '\uffff') {
			anInt342 = -1;
		} else {
			anInt342 += anInt294 & 0xffff0000;
		}

		aBool32 = var1.readUByte() == 1;
		if (anInt296 == 0) {
			anInt344 = var1.readUShort();
			anInt361 = var1.readUShort();
			aBool43 = var1.readUByte() == 1;
		}

		if (anInt296 == 5) {
			anInt320 = var1.readInt();
			anInt350 = var1.readUShort();
			aBool35 = var1.readUByte() == 1;
			anInt317 = var1.readUByte();
			anInt322 = var1.readUByte();
			anInt323 = var1.readInt();
			aBool36 = var1.readUByte() == 1;
			aBool37 = var1.readUByte() == 1;
		}

		if (anInt296 == 6) {
			anInt348 = 1;
			anInt295 = var1.readUShort();
			if (anInt295 == '\uffff') {
				anInt295 = -1;
			}

			anInt329 = var1.method364();
			anInt330 = var1.method364();
			anInt325 = var1.readUShort();
			anInt332 = var1.readUShort();
			anInt324 = var1.readUShort();
			anInt334 = var1.readUShort();
			anInt327 = var1.readUShort();
			if (anInt327 == '\uffff') {
				anInt327 = -1;
			}

			aBool39 = var1.readUByte() == 1;
			var1.readUShort();
			if (anInt293 != 0) {
				anInt291 = var1.readUShort();
			}

			if (anInt311 != 0) {
				var1.readUShort();
			}
		}

		if (anInt296 == 4) {
			anInt347 = var1.readUShort();
			if (anInt347 == '\uffff') {
				anInt347 = -1;
			}

			aString20 = var1.readString();
			anInt338 = var1.readUByte();
			anInt339 = var1.readUByte();
			anInt340 = var1.readUByte();
			aBool40 = var1.readUByte() == 1;
			anInt360 = var1.readInt();
		}

		if (anInt296 == 3) {
			anInt360 = var1.readInt();
			aBool33 = var1.readUByte() == 1;
			anInt317 = var1.readUByte();
		}

		if (anInt296 == 9) {
			anInt308 = var1.readUByte();
			anInt360 = var1.readInt();
			aBool34 = var1.readUByte() == 1;
		}

		anInt343 = var1.readTriByte();
		aString21 = var1.readString();
		int var3 = var1.readUByte();
		if (var3 > 0) {
			aStringArray4 = new String[var3];

			for (int var2 = 0; var2 < var3; var2++) {
				aStringArray4[var2] = var1.readString();
			}
		}

		anInt345 = var1.readUByte();
		anInt316 = var1.readUByte();
		aBool41 = var1.readUByte() == 1;
		aString22 = var1.readString();
		anObjectArray4 = method385(var1);
		anObjectArray7 = method385(var1);
		anObjectArray9 = method385(var1);
		anObjectArray12 = method385(var1);
		anObjectArray11 = method385(var1);
		anObjectArray13 = method385(var1);
		anObjectArray14 = method385(var1);
		anObjectArray15 = method385(var1);
		anObjectArray16 = method385(var1);
		anObjectArray17 = method385(var1);
		anObjectArray8 = method385(var1);
		anObjectArray5 = method385(var1);
		anObjectArray3 = method385(var1);
		anObjectArray29 = method385(var1);
		anObjectArray6 = method385(var1);
		anObjectArray10 = method385(var1);
		anObjectArray28 = method385(var1);
		anObjectArray30 = method385(var1);
		anIntArray74 = method390(var1);
		anIntArray69 = method390(var1);
		anIntArray71 = method390(var1);
	}

	public void method393(int var1, String var2) {
		if (aStringArray4 == null || aStringArray4.length <= var1) {
			String[] var4 = new String[var1 + 1];
			if (aStringArray4 != null) {
				for (int var3 = 0; var3 < aStringArray4.length; var3++) {
					var4[var3] = aStringArray4[var3];
				}
			}

			aStringArray4 = var4;
		}

		aStringArray4[var1] = var2;
	}

}
