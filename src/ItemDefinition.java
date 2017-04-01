public class ItemDefinition extends Cacheable {

	static AbstractFileStore staticJs5Index14;
	public int anInt437;
	static AbstractFileStore staticJs5Index15;
	static Cache staticCache10 = new Cache(64);
	static Cache staticCache11 = new Cache(50);
	public static Cache staticCache9 = new Cache(200);
	public String name = "null";
	public int zoom2d = 2000;
	public int xan2d = 0;
	public int yan2d = 0;
	public int xOffset2d = 0;
	public int yOffset2d = 0;
	public int stackable = 0;
	public int cost = 1;
	public boolean members = false;
	int maleModel0 = -1;
	int maleOffset = 0;
	int maleModel1 = -1;
	int femaleModel0 = -1;
	int femaleOffset = 0;
	int femaleModel1 = -1;
	int anInt443 = -2;
	public boolean stockMarket = false;
	int maleModel2 = -1;
	int femaleModel2 = -1;
	int maleHeadModel = -1;
	int femaleHeadModel = -1;
	int maleHeadModel2 = -1;
	int femaleHeadModel2 = -1;
	public int zan2d = 0;
	public int notedID = -1;
	public int notedTemplate = -1;
	int resizeX = 128;
	int resizeY = 128;
	int resizeZ = 128;
	public int ambient = 0;
	public int contrast = 0;
	public int team = 0;
	int boughtLink = -1;
	int boughtTemplate = -1;
	public int anInt445 = -1;
	public int anInt467 = -1;
	public String[] options = new String[] { null, null, "Take", null, null };
	public String[] interfaceOptions = new String[] { null, null, null, null, "Drop" };
	int inventoryModel;
	short[] colorFind;
	short[] colorReplace;
	short[] textureFind;
	short[] textureReplace;
	int[] countObj;
	int[] countCo;

	void method486() {
	}

	public final EntitySub3 method487(boolean var1) {
		int var2 = maleHeadModel;
		int var4 = maleHeadModel2;
		if (var1) {
			var2 = femaleHeadModel;
			var4 = femaleHeadModel2;
		}

		if (var2 == -1) {
			return null;
		} else {
			EntitySub3 var3 = Static.staticMethod434(staticJs5Index14, var2, 0);
			if (var4 != -1) {
				EntitySub3 var7 = Static.staticMethod434(staticJs5Index14, var4, 0);
				EntitySub3[] var6 = new EntitySub3[] { var3, var7 };
				var3 = new EntitySub3(var6, 2);
			}

			int var71;
			if (colorFind != null) {
				for (var71 = 0; var71 < colorFind.length; var71++) {
					var3.method585(colorFind[var71], colorReplace[var71]);
				}
			}

			if (textureFind != null) {
				for (var71 = 0; var71 < textureFind.length; var71++) {
					var3.method579(textureFind[var71], textureReplace[var71]);
				}
			}

			return var3;
		}
	}

	// TODO item def decode
	void decode(ByteBuf buffer, int opcode) {		
		if (opcode == 1) {
			inventoryModel = buffer.readUShort();			
		} else if (opcode == 2) {
			name = buffer.readString();			
		} else if (opcode == 4) {
			zoom2d = buffer.readUShort();			
		} else if (opcode == 5) {
			xan2d = buffer.readUShort();			
		} else if (opcode == 6) {
			yan2d = buffer.readUShort();			
		} else if (opcode == 7) {
			xOffset2d = buffer.readUShort();			
			if (xOffset2d > 32767) {
				xOffset2d -= 65536;
			}
		} else if (opcode == 8) {
			yOffset2d = buffer.readUShort();			
			if (yOffset2d > 32767) {
				yOffset2d -= 65536;
			}
		} else if (opcode == 11) {
			stackable = 1;			
		} else if (opcode == 12) {
			cost = buffer.readInt();			
		} else if (opcode == 16) {
			members = true;			
		} else if (opcode == 23) {
			maleModel0 = buffer.readUShort();			
			maleOffset = buffer.readUByte();			
		} else if (opcode == 24) {
			maleModel1 = buffer.readUShort();			
		} else if (opcode == 25) {
			femaleModel0 = buffer.readUShort();			
			femaleOffset = buffer.readUByte();			
		} else if (opcode == 26) {
			femaleModel1 = buffer.readUShort();			
		} else if (opcode >= 30 && opcode < 35) {			
			options[opcode - 30] = buffer.readString();
			if (options[opcode - 30].equalsIgnoreCase("Hidden")) {
				options[opcode - 30] = null;
			}
		} else if (opcode >= 35 && opcode < 40) {
			interfaceOptions[opcode - 35] = buffer.readString();			
		} else {
			int var3;
			int var4;
			if (opcode == 40) {
				var3 = buffer.readUByte();
				colorFind = new short[var3];				
				colorReplace = new short[var3];				

				for (var4 = 0; var4 < var3; var4++) {
					colorFind[var4] = (short) buffer.readUShort();
					colorReplace[var4] = (short) buffer.readUShort();
				}
			} else if (opcode == 41) {
				var3 = buffer.readUByte();
				textureFind = new short[var3];				
				textureReplace = new short[var3];				

				for (var4 = 0; var4 < var3; var4++) {
					textureFind[var4] = (short) buffer.readUShort();
					textureReplace[var4] = (short) buffer.readUShort();
				}
			} else if (opcode == 42) { // #138
				anInt443 = buffer.readByte();
			} else if (opcode == 65) {
				stockMarket = true;				
			} else if (opcode == 78) {
				maleModel2 = buffer.readUShort();				
			} else if (opcode == 79) {
				femaleModel2 = buffer.readUShort();				
			} else if (opcode == 90) {
				maleHeadModel = buffer.readUShort();				
			} else if (opcode == 91) {
				femaleHeadModel = buffer.readUShort();				
			} else if (opcode == 92) {
				maleHeadModel2 = buffer.readUShort();				
			} else if (opcode == 93) {
				femaleHeadModel2 = buffer.readUShort();				
			} else if (opcode == 95) {
				zan2d = buffer.readUShort();				
			} else if (opcode == 97) {
				notedID = buffer.readUShort();				
			} else if (opcode == 98) {
				notedTemplate = buffer.readUShort();				
			} else if (opcode >= 100 && opcode < 110) {
				if (countObj == null) {					
					countObj = new int[10];
					countCo = new int[10];					
				}

				countObj[opcode - 100] = buffer.readUShort();
				countCo[opcode - 100] = buffer.readUShort();
			} else if (opcode == 110) {
				resizeX = buffer.readUShort();				
			} else if (opcode == 111) {
				resizeY = buffer.readUShort();				
			} else if (opcode == 112) {
				resizeZ = buffer.readUShort();				
			} else if (opcode == 113) {
				ambient = buffer.readByte();				
			} else if (opcode == 114) {
				contrast = buffer.readByte() * 5;				
			} else if (opcode == 115) {
				team = buffer.readUByte();				
			} else if (opcode == 139) {
				boughtLink = buffer.readUShort();				
			} else if (opcode == 140) {
				boughtTemplate = buffer.readUShort();				
			} else if (opcode == 148) {
				anInt445 = buffer.readUShort();
			} else if (opcode == 149) {
				anInt467 = buffer.readUShort();
			}
		}

	}

	void method489(ItemDefinition var1, ItemDefinition var2) {
		inventoryModel = var1.inventoryModel * 1;
		zoom2d = var1.zoom2d * 1;
		xan2d = var1.xan2d * 1;
		yan2d = var1.yan2d * 1;
		zan2d = var1.zan2d * 1;
		xOffset2d = var1.xOffset2d * 1;
		yOffset2d = var1.yOffset2d * 1;
		colorFind = var1.colorFind;
		colorReplace = var1.colorReplace;
		textureFind = var1.textureFind;
		textureReplace = var1.textureReplace;
		name = var2.name;
		members = var2.members;
		cost = var2.cost * 1;
		stackable = 1;
	}

	void method490(ItemDefinition var1, ItemDefinition var2) {
		inventoryModel = var1.inventoryModel * 1;
		zoom2d = var1.zoom2d * 1;
		xan2d = var1.xan2d * 1;
		yan2d = var1.yan2d * 1;
		zan2d = var1.zan2d * 1;
		xOffset2d = var1.xOffset2d * 1;
		yOffset2d = var1.yOffset2d * 1;
		colorFind = var2.colorFind;
		colorReplace = var2.colorReplace;
		textureFind = var2.textureFind;
		textureReplace = var2.textureReplace;
		name = var2.name;
		members = var2.members;
		stackable = var2.stackable * 1;
		maleModel0 = var2.maleModel0 * 1;
		maleModel1 = var2.maleModel1 * 1;
		maleModel2 = var2.maleModel2 * 1;
		femaleModel0 = var2.femaleModel0 * 1;
		femaleModel1 = var2.femaleModel1 * 1;
		femaleModel2 = var2.femaleModel2 * 1;
		maleHeadModel = var2.maleHeadModel * 1;
		maleHeadModel2 = var2.maleHeadModel2 * 1;
		femaleHeadModel = var2.femaleHeadModel * 1;
		femaleHeadModel2 = var2.femaleHeadModel2 * 1;
		team = var2.team * 1;
		options = var2.options;
		interfaceOptions = new String[5];
		if (var2.interfaceOptions != null) {
			for (int var3 = 0; var3 < 4; var3++) {
				interfaceOptions[var3] = var2.interfaceOptions[var3];
			}
		}

		interfaceOptions[4] = "Discard";
		cost = 0;
	}

	public ItemDefinition method491(int var1) {
		if (countObj != null && var1 > 1) {
			int var3 = -1;

			for (int var2 = 0; var2 < 10; var2++) {
				if (var1 >= countCo[var2] && countCo[var2] != 0) {
					var3 = countObj[var2];
				}
			}

			if (var3 != -1) {
				return Static.staticMethod153(var3);
			}
		}

		return this;
	}

	public final EntitySub3 method492(boolean var1) {
		int var2 = maleModel0;
		int var5 = maleModel1;
		int var6 = maleModel2;
		if (var1) {
			var2 = femaleModel0;
			var5 = femaleModel1;
			var6 = femaleModel2;
		}

		if (var2 == -1) {
			return null;
		} else {
			EntitySub3 var3 = Static.staticMethod434(staticJs5Index14, var2, 0);
			if (var5 != -1) {
				EntitySub3 var9 = Static.staticMethod434(staticJs5Index14, var5, 0);
				if (var6 != -1) {
					EntitySub3 var10 = Static.staticMethod434(staticJs5Index14, var6, 0);
					EntitySub3[] var8 = new EntitySub3[] { var3, var9, var10 };
					var3 = new EntitySub3(var8, 3);
				} else {
					EntitySub3[] var101 = new EntitySub3[] { var3, var9 };
					var3 = new EntitySub3(var101, 2);
				}
			}

			if (!var1 && maleOffset != 0) {
				var3.method578(0, maleOffset, 0);
			}

			if (var1 && femaleOffset != 0) {
				var3.method578(0, femaleOffset, 0);
			}

			int var91;
			if (colorFind != null) {
				for (var91 = 0; var91 < colorFind.length; var91++) {
					var3.method585(colorFind[var91], colorReplace[var91]);
				}
			}

			if (textureFind != null) {
				for (var91 = 0; var91 < textureFind.length; var91++) {
					var3.method579(textureFind[var91], textureReplace[var91]);
				}
			}

			return var3;
		}
	}

	public final boolean method493(boolean var1) {
		int var2 = maleHeadModel;
		int var4 = maleHeadModel2;
		if (var1) {
			var2 = femaleHeadModel;
			var4 = femaleHeadModel2;
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
		if (countObj != null && var1 > 1) {
			int var5 = -1;

			for (int var6 = 0; var6 < 10; var6++) {
				if (var1 >= countCo[var6] && countCo[var6] != 0) {
					var5 = countObj[var6];
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
			EntitySub3 var61 = Static.staticMethod434(staticJs5Index14, inventoryModel, 0);
			if (var61 == null) {
				return null;
			} else {
				if (resizeX != 128 || resizeY != 128 || resizeZ != 128) {
					var61.method587(resizeX, resizeY, resizeZ);
				}

				int var2;
				if (colorFind != null) {
					for (var2 = 0; var2 < colorFind.length; var2++) {
						var61.method585(colorFind[var2], colorReplace[var2]);
					}
				}

				if (textureFind != null) {
					for (var2 = 0; var2 < textureFind.length; var2++) {
						var61.method579(textureFind[var2], textureReplace[var2]);
					}
				}

				var51 = var61.method583(ambient + 64, contrast + 768, -50, -10, -50);
				var51.aBool80 = true;
				staticCache11.method170(var51, anInt437);
				return var51;
			}
		}
	}

	public final boolean method495(boolean var1) {
		int var2 = maleModel0;
		int var3 = maleModel1;
		int var4 = maleModel2;
		if (var1) {
			var2 = femaleModel0;
			var3 = femaleModel1;
			var4 = femaleModel2;
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

	public final EntitySub3 method496(int var1) {
		int var2;
		if (countObj != null && var1 > 1) {
			int var4 = -1;

			for (var2 = 0; var2 < 10; var2++) {
				if (var1 >= countCo[var2] && countCo[var2] != 0) {
					var4 = countObj[var2];
				}
			}

			if (var4 != -1) {
				return Static.staticMethod153(var4).method496(1);
			}
		}

		EntitySub3 var41 = Static.staticMethod434(staticJs5Index14, inventoryModel, 0);
		if (var41 == null) {
			return null;
		} else {
			if (resizeX != 128 || resizeY != 128 || resizeZ != 128) {
				var41.method587(resizeX, resizeY, resizeZ);
			}

			if (colorFind != null) {
				for (var2 = 0; var2 < colorFind.length; var2++) {
					var41.method585(colorFind[var2], colorReplace[var2]);
				}
			}

			if (textureFind != null) {
				for (var2 = 0; var2 < textureFind.length; var2++) {
					var41.method579(textureFind[var2], textureReplace[var2]);
				}
			}

			return var41;
		}
	}

	void method497(ItemDefinition var1, ItemDefinition var2) {
		inventoryModel = var1.inventoryModel * 1;
		zoom2d = var1.zoom2d * 1;
		xan2d = var1.xan2d * 1;
		yan2d = var1.yan2d * 1;
		zan2d = var1.zan2d * 1;
		xOffset2d = var1.xOffset2d * 1;
		yOffset2d = var1.yOffset2d * 1;
		colorFind = var1.colorFind;
		colorReplace = var1.colorReplace;
		textureFind = var1.textureFind;
		textureReplace = var1.textureReplace;
		stackable = var1.stackable * 1;
		name = var2.name;
		cost = 0;
		members = false;
		stockMarket = false;
	}

	void method498(ByteBuf var1) {
		while (true) {
			int var2 = var1.readUByte();
			if (var2 == 0) {
				return;
			}

			decode(var1, var2);
		}
	}

	public int method499() {
		return anInt443 != -1 && interfaceOptions != null ? anInt443 >= 0 ? interfaceOptions[anInt443] != null ? anInt443 : -1
				: "Drop".equalsIgnoreCase(interfaceOptions[4]) ? 4 : -1 : -1;
	}

}
