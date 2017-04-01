public class ObjectDefinition extends Cacheable {

	public static AbstractFileStore staticJs5Index19;
	public int anInt483;
	public static AbstractFileStore staticJs5Index20;
	static int staticInt322;
	public static boolean staticBool46 = false;
	static Cache staticCache18 = new Cache(64);
	public static Cache staticCache15 = new Cache(500);
	static Cache staticCache16 = new Cache(30);
	static Cache staticCache17 = new Cache(30);
	static EntitySub3[] staticRenderableSub3Array1 = new EntitySub3[4];
	public String name = "null";
	public int sizeX = 1;
	public int sizeY = 1;
	public int anInt487 = 2;
	public boolean aBool60 = true;
	public int anInt489 = -1;
	int anInt490 = -1;
	boolean nonFlatShading = false;
	public boolean aBool59 = false;
	public int animationID = -1;
	public int anInt492 = 16;
	int ambient = 0;
	int contrast = 0;
	public int mapFunctionID = -1;
	boolean aBool61 = false;
	public boolean aBool62 = true;
	int modelSizeX = 128;
	int modelSizeHeight = 128;
	int modelSizeY = 128;
	public int mapSceneID = -1;
	int offsetX = 0;
	int offsetHeight = 0;
	int offsetY = 0;
	public boolean aBool63 = false;
	boolean isSolid = false;
	public int anInt493 = 238048809;
	int anInt503 = -1;
	int anInt501 = -1;
	public int anInt504 = -1;
	public int anInt505 = 0;
	public int anInt495 = 0;
	public int anInt506 = 0;
	public String[] actions = new String[5];
	int[] objectModels;
	int[] objectTypes;
	short[] recolorToFind;
	short[] recolorToReplace;
	short[] retextureToFind;
	short[] textureToReplace;
	public int[] anIntArray109;
	public int[] anIntArray111;

	// TODO obj def decode
	void decode(ByteBuf buffer, int opcode) {		
		int count;
		int length;
		if (opcode == 1) {
			length = buffer.readUByte();
			if (length > 0) {
				if (objectTypes != null && !staticBool46) {					
					buffer.position += length * 3;
				} else {
					objectModels = new int[length];						
					objectTypes = new int[length];

					for (count = 0; count < length; count++) {						
						objectTypes[count] = buffer.readUShort();
						objectModels[count] = buffer.readUByte();
					}
				}
			}
		} else if (opcode == 2) {
			name = buffer.readString();			
		} else if (opcode == 5) {
			length = buffer.readUByte();
			if (length > 0) {
				if (objectTypes != null && !staticBool46) {
					buffer.position += length * 2;
				} else {
					objectModels = null;
					objectTypes = new int[length];

					for (count = 0; count < length; count++) {
						objectTypes[count] = buffer.readUShort();
					}
				}
			}
		} else if (opcode == 14) {
			sizeX = buffer.readUByte();			
		} else if (opcode == 15) {
			sizeY = buffer.readUByte();			
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
			nonFlatShading = true;			
		} else if (opcode == 23) {
			aBool59 = true;
		} else if (opcode == 24) {
			animationID = buffer.readUShort();			
			if (animationID == '\uffff') {
				animationID = -1;
			}
		} else if (opcode == 27) {
			anInt487 = 1;
		} else if (opcode == 28) {
			anInt492 = buffer.readUByte();
		} else if (opcode == 29) {
			ambient = buffer.readByte();			
		} else if (opcode == 39) {
			contrast = buffer.readByte() * 25;			
		} else if (opcode >= 30 && opcode < 35) {
			actions[opcode - 30] = buffer.readString();
			if (actions[opcode - 30].equalsIgnoreCase("Hidden")) {				
				actions[opcode - 30] = null;
			}
		} else if (opcode == 40) {
			length = buffer.readUByte();
			recolorToFind = new short[length];			
			recolorToReplace = new short[length];			

			for (count = 0; count < length; count++) {
				recolorToFind[count] = (short) buffer.readUShort();
				recolorToReplace[count] = (short) buffer.readUShort();
			}
		} else if (opcode == 41) {
			length = buffer.readUByte();
			retextureToFind = new short[length];			
			textureToReplace = new short[length];

			for (count = 0; count < length; count++) {
				retextureToFind[count] = (short) buffer.readUShort();
				textureToReplace[count] = (short) buffer.readUShort();				
			}
		} else if (opcode == 60) {
			mapFunctionID = buffer.readUShort();			
		} else if (opcode == 62) {
			aBool61 = true;
		} else if (opcode == 64) {
			aBool62 = false;
		} else if (opcode == 65) {
			modelSizeX = buffer.readUShort();			
		} else if (opcode == 66) {
			modelSizeHeight = buffer.readUShort();			
		} else if (opcode == 67) {
			modelSizeY = buffer.readUShort();			
		} else if (opcode == 68) {
			mapSceneID = buffer.readUShort();			
		} else if (opcode == 69) {
			buffer.readUByte();
		} else if (opcode == 70) {
			offsetX = buffer.method364();			
		} else if (opcode == 71) {
			offsetHeight = buffer.method364();			
		} else if (opcode == 72) {
			offsetY = buffer.method364();			
		} else if (opcode == 73) {
			aBool63 = true;
		} else if (opcode == 74) {
			isSolid = true;			
		} else if (opcode == 75) {
			anInt493 = buffer.readUByte() * -238048809;
		} else if (opcode != 77 && opcode != 92) {
			if (opcode == 78) {
				anInt504 = buffer.readUShort();
				anInt505 = buffer.readUByte();
			} else if (opcode == 79) {
				anInt495 = buffer.readUShort() * -2128966019;
				anInt506 = buffer.readUShort() * 1408592117;
				anInt505 = buffer.readUByte();
				length = buffer.readUByte();
				anIntArray109 = new int[length];

				for (count = 0; count < length; count++) {
					anIntArray109[count] = buffer.readUShort();
				}
			} else if (opcode == 81) {
				anInt490 = buffer.readUByte() * 256;
			}
		} else {
			anInt503 = buffer.readUShort();
			if (anInt503 == '\uffff') {
				anInt503 = -1;
			}

			anInt501 = buffer.readUShort();
			if (anInt501 == '\uffff') {
				anInt501 = -1;
			}

			length = -1;
			if (opcode == 92) {
				length = buffer.readUShort();
				if (length == '\uffff') {
					length = -1;
				}
			}

			count = buffer.readUByte();
			anIntArray111 = new int[count + 2];

			for (int var5 = 0; var5 <= count; var5++) {
				anIntArray111[var5] = buffer.readUShort();
				if (anIntArray111[var5] == '\uffff') {
					anIntArray111[var5] = -1;
				}
			}

			anIntArray111[count + 1] = length;
		}

	}

	void method510() {
		if (anInt489 == -1) {
			anInt489 = 0;
			if (objectTypes != null && (objectModels == null || objectModels[0] == 10)) {
				anInt489 = 1;
			}

			for (int var1 = 0; var1 < 5; var1++) {
				if (actions[var1] != null) {
					anInt489 = 1;
				}
			}
		}

		if (anInt493 * 582900199 == -1) {
			anInt493 = -238048809 * (anInt487 != 0 ? 1 : 0);
		}

	}

	public final boolean method511(int var1) {
		if (objectModels != null) {
			for (int var4 = 0; var4 < objectModels.length; var4++) {
				if (var1 == objectModels[var4]) {
					return staticJs5Index19.method276(objectTypes[var4] & 0xffff, 0);
				}
			}

			return true;
		} else if (objectTypes == null) {
			return true;
		} else if (var1 != 10) {
			return true;
		} else {
			boolean var3 = true;

			for (int var2 = 0; var2 < objectTypes.length; var2++) {
				var3 &= staticJs5Index19.method276(objectTypes[var2] & 0xffff, 0);
			}

			return var3;
		}
	}

	public final Model method512(int var1, int var2, int[][] var3, int var4, int var5, int var6, AnimationDefintion var7,
			int var8) {
		long var9;
		if (objectModels == null) {
			var9 = var2 + (anInt483 << 10);
		} else {
			var9 = var2 + (anInt483 << 10) + (var1 << 3);
		}

		Model var11 = (Model) staticCache17.get(var9);
		if (var11 == null) {
			EntitySub3 var12 = method515(var1, var2);
			if (var12 == null) {
				return null;
			}

			var11 = var12.method583(64 + ambient, 768 + contrast, -50, -10, -50);
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
		if (objectTypes == null) {
			return true;
		} else {
			boolean var1 = true;

			for (int var2 = 0; var2 < objectTypes.length; var2++) {
				var1 &= staticJs5Index19.method276(objectTypes[var2] & 0xffff, 0);
			}

			return var1;
		}
	}

	public final Entity method514(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var8;
		if (objectModels == null) {
			var8 = (anInt483 << 10) + var2;
		} else {
			var8 = (anInt483 << 10) + (var1 << 3) + var2;
		}

		Object var7 = staticCache16.get(var8);
		if (var7 == null) {
			EntitySub3 var10 = method515(var1, var2);
			if (var10 == null) {
				return null;
			}

			if (!nonFlatShading) {
				var7 = var10.method583(64 + ambient, contrast + 768, -50, -10, -50);
			} else {
				var10.aShort2 = (short) (ambient + 64);
				var10.aShort3 = (short) (768 + contrast);
				var10.method586();
				var7 = var10;
			}

			staticCache16.method170((Cacheable) var7, var8);
		}

		if (nonFlatShading) {
			var7 = ((EntitySub3) var7).method581();
		}

		if (anInt490 >= 0) {
			if (var7 instanceof Model) {
				var7 = ((Model) var7).method588(var3, var4, var5, var6, true, anInt490);
			} else if (var7 instanceof EntitySub3) {
				var7 = ((EntitySub3) var7).method572(var3, var4, var5, var6, true, anInt490);
			}
		}

		return (Entity) var7;
	}

	final EntitySub3 method515(int var1, int var2) {
		EntitySub3 var3 = null;
		int var4;
		boolean var6;
		int var7;
		int var9;
		if (objectModels == null) {
			if (var1 != 10) {
				return null;
			}

			if (objectTypes == null) {
				return null;
			}

			var6 = aBool61;
			if (var1 == 2 && var2 > 3) {
				var6 = !var6;
			}

			var4 = objectTypes.length;

			for (var9 = 0; var9 < var4; var9++) {
				var7 = objectTypes[var9];
				if (var6) {
					var7 += 65536;
				}

				var3 = (EntitySub3) staticCache15.get(var7);
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
				var3 = new EntitySub3(staticRenderableSub3Array1, var4);
			}
		} else {
			var9 = -1;

			for (var4 = 0; var4 < objectModels.length; var4++) {
				if (var1 == objectModels[var4]) {
					var9 = var4;
					break;
				}
			}

			if (var9 == -1) {
				return null;
			}

			var4 = objectTypes[var9];
			boolean var10 = aBool61 ^ var2 > 3;
			if (var10) {
				var4 += 65536;
			}

			var3 = (EntitySub3) staticCache15.get(var4);
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

		if (modelSizeX == 128 && modelSizeHeight == 128 && modelSizeY == 128) {
			var6 = false;
		} else {
			var6 = true;
		}

		boolean var101;
		if (offsetX == 0 && offsetHeight == 0 && offsetY == 0) {
			var101 = false;
		} else {
			var101 = true;
		}

		EntitySub3 var91 = new EntitySub3(var3, var2 == 0 && !var6 && !var101, recolorToFind == null,
				retextureToFind == null, true);
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

		if (recolorToFind != null) {
			for (var7 = 0; var7 < recolorToFind.length; var7++) {
				var91.method585(recolorToFind[var7], recolorToReplace[var7]);
			}
		}

		if (retextureToFind != null) {
			for (var7 = 0; var7 < retextureToFind.length; var7++) {
				var91.method579(retextureToFind[var7], textureToReplace[var7]);
			}
		}

		if (var6) {
			var91.method587(modelSizeX, modelSizeHeight, modelSizeY);
		}

		if (var101) {
			var91.method578(offsetX, offsetHeight, offsetY);
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
		if (objectModels == null) {
			var8 = var2 + (anInt483 << 10);
		} else {
			var8 = var2 + (var1 << 3) + (anInt483 << 10);
		}

		Model var7 = (Model) staticCache17.get(var8);
		if (var7 == null) {
			EntitySub3 var10 = method515(var1, var2);
			if (var10 == null) {
				return null;
			}

			var7 = var10.method583(64 + ambient, contrast + 768, -50, -10, -50);
			staticCache17.method170(var7, var8);
		}

		if (anInt490 >= 0) {
			var7 = var7.method588(var3, var4, var5, var6, true, anInt490);
		}

		return var7;
	}

}
