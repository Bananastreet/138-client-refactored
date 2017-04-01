public class NpcDefinition extends Cacheable {

	static AbstractFileStore staticJs5Index28;
	static AbstractFileStore staticJs5Index29;
	public int anInt537;
	static int staticInt324;
	static Cache staticCache28 = new Cache(64);
	static Cache staticCache27 = new Cache(50);
	public String name = "null";
	public int tileSpacesOccupied = 1;
	public int stanceAnimation = 1;
	public int walkAnimation = -1;
	public int anInt552 = -1;
	public int anInt543 = 1;
	public int rotate180Animation = -1;
	public int rotate90RightAnimation = -1;
	public int rotate90LeftAnimation = 1;
	public boolean renderOnMinimap = true;
	public int combatLevel = -1;
	int resizeX = 128;
	int resizeY = 128;
	public boolean hasRenderPriority = false;
	int ambient = 0;
	int contrast = 0;
	public int headIcon = -1;
	public int anInt549 = 1873014688;
	int anInt545 = -1;
	int anInt551 = -1;
	public boolean isClickable = true;
	public boolean aBool70 = true;
	public boolean aBool71 = false;
	public String[] options = new String[5];
	int[] models;
	short[] recolorToFind;
	short[] recolorToReplace;
	short[] retextureToFind;
	short[] retextureToReplace;
	int[] headModels;
	public int[] anIntArray116;

	void method540(ByteBuf var1) {
		while (true) {
			int var2 = var1.readUByte();
			if (var2 == 0) {
				return;
			}

			decode(var1, var2);
		}
	}

	public final Model method541(AnimationDefintion var1, int var2, AnimationDefintion var3, int var4) {
		if (anIntArray116 != null) {
			NpcDefinition var11 = method544();
			return var11 == null ? null : var11.method541(var1, var2, var3, var4);
		} else {
			Model var5 = (Model) staticCache27.get(anInt537);
			if (var5 == null) {
				boolean var10 = false;

				for (int var9 = 0; var9 < models.length; var9++) {
					if (!staticJs5Index29.method276(models[var9], 0)) {
						var10 = true;
					}
				}

				if (var10) {
					return null;
				}

				EntitySub3[] var121 = new EntitySub3[models.length];

				int var8;
				for (var8 = 0; var8 < models.length; var8++) {
					var121[var8] = Static.staticMethod434(staticJs5Index29, models[var8], 0);
				}

				EntitySub3 var12;
				if (var121.length == 1) {
					var12 = var121[0];
				} else {
					var12 = new EntitySub3(var121, var121.length);
				}

				if (recolorToFind != null) {
					for (var8 = 0; var8 < recolorToFind.length; var8++) {
						var12.method585(recolorToFind[var8], recolorToReplace[var8]);
					}
				}

				if (retextureToFind != null) {
					for (var8 = 0; var8 < retextureToFind.length; var8++) {
						var12.method579(retextureToFind[var8], retextureToReplace[var8]);
					}
				}

				var5 = var12.method583(ambient + 64, contrast * 5 + 850, -30, -50, -30);
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

			if (resizeX != 128 || resizeY != 128) {
				var101.method599(resizeX, resizeY, resizeX);
			}

			return var101;
		}
	}

	public final EntitySub3 method542() {
		if (anIntArray116 != null) {
			NpcDefinition var5 = method544();
			return var5 == null ? null : var5.method542();
		} else if (headModels == null) {
			return null;
		} else {
			boolean var2 = false;

			for (int var6 = 0; var6 < headModels.length; var6++) {
				if (!staticJs5Index29.method276(headModels[var6], 0)) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			} else {
				EntitySub3[] var61 = new EntitySub3[headModels.length];

				for (int var7 = 0; var7 < headModels.length; var7++) {
					var61[var7] = Static.staticMethod434(staticJs5Index29, headModels[var7], 0);
				}

				EntitySub3 var71;
				if (var61.length == 1) {
					var71 = var61[0];
				} else {
					var71 = new EntitySub3(var61, var61.length);
				}

				int var1;
				if (recolorToFind != null) {
					for (var1 = 0; var1 < recolorToFind.length; var1++) {
						var71.method585(recolorToFind[var1], recolorToReplace[var1]);
					}
				}

				if (retextureToFind != null) {
					for (var1 = 0; var1 < retextureToFind.length; var1++) {
						var71.method579(retextureToFind[var1], retextureToReplace[var1]);
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
		int length;
		int count;
		if (opcode == 1) {
			length = buffer.readUByte();
			models = new int[length];			

			for (count = 0; count < length; count++) {					
				models[count] = buffer.readUShort();
			}
		} else if (opcode == 2) {
			name = buffer.readString();			
		} else if (opcode == 12) {
			tileSpacesOccupied = buffer.readUByte();			
		} else if (opcode == 13) {
			stanceAnimation = -buffer.readUShort();			
		} else if (opcode == 14) {
			walkAnimation = buffer.readUShort();			
		} else if (opcode == 15) {
			anInt552 = buffer.readUShort();
		} else if (opcode == 16) {
			anInt543 = -buffer.readUShort();
		} else if (opcode == 17) {
			walkAnimation = buffer.readUShort();
			rotate180Animation = buffer.readUShort();			
			rotate90RightAnimation = buffer.readUShort();			
			rotate90LeftAnimation = -buffer.readUShort();			
		} else if (opcode >= 30 && opcode < 35) {
			options[opcode - 30] = buffer.readString();
			if (options[opcode - 30].equalsIgnoreCase("Hidden")) {				
				options[opcode - 30] = null;
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
			retextureToReplace = new short[length];			

			for (count = 0; count < length; count++) {
				retextureToFind[count] = (short) buffer.readUShort();
				retextureToReplace[count] = (short) buffer.readUShort();
			}
		} else if (opcode == 60) {
			length = buffer.readUByte();
			headModels = new int[length];
			
			for (count = 0; count < length; count++) {
				headModels[count] = buffer.readUShort();
			}
		} else if (opcode == 93) {
			renderOnMinimap = false;			
		} else if (opcode == 95) {
			combatLevel = buffer.readUShort();			
		} else if (opcode == 97) {
			resizeX = buffer.readUShort();			
		} else if (opcode == 98) {
			resizeY = buffer.readUShort();			
		} else if (opcode == 99) {
			hasRenderPriority = true;			
		} else if (opcode == 100) {
			ambient = buffer.readByte();			
		} else if (opcode == 101) {
			contrast = buffer.readByte();			
		} else if (opcode == 102) {
			headIcon = buffer.readUShort();			
		} else if (opcode == 103) {
			anInt549 = buffer.readUShort() * 863838077;
		} else if (opcode != 106 && opcode != 118) {
			if (opcode == 107) {
				isClickable = false;				
			} else if (opcode == 109) {
				aBool70 = false;
			} else if (opcode == 111) {
				aBool71 = true;
			}
		} else {
			anInt545 = buffer.readUShort();
			if (anInt545 == '\uffff') {
				anInt545 = -1;
			}

			anInt551 = buffer.readUShort();
			if (anInt551 == '\uffff') {
				anInt551 = -1;
			}

			length = -1;
			if (opcode == 118) {
				length = buffer.readUShort();
				if (length == '\uffff') {
					length = -1;
				}
			}

			count = buffer.readUByte();
			anIntArray116 = new int[2 + count];

			for (int var5 = 0; var5 <= count; var5++) {
				anIntArray116[var5] = buffer.readUShort();
				if (anIntArray116[var5] == '\uffff') {
					anIntArray116[var5] = -1;
				}
			}

			anIntArray116[count + 1] = length;
		}

	}

}
