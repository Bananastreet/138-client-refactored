public class ComputerInfo extends Node {

	int anInt369;
	int anInt371;
	int anInt372;
	int anInt377;
	int anInt379;
	int anInt382;
	int[] anIntArray81 = new int[3];
	int anInt368;
	String aString29;
	String aString25;
	String aString26;
	String aString24;
	String aString27;
	String aString28;
	boolean aBool48;
	int anInt370;
	int anInt380;
	int anInt381;
	int anInt373;
	int anInt374;
	boolean aBool49;
	int anInt375;
	int anInt378;
	int anInt376;

	public void method403(Stream var1) {
		var1.writeByte(6);
		var1.writeByte(anInt368);
		var1.writeByte(aBool48 ? 1 : 0);
		var1.writeByte(anInt370);
		var1.writeByte(anInt380);
		var1.writeByte(anInt381);
		var1.writeByte(anInt373);
		var1.writeByte(anInt374);
		var1.writeByte(aBool49 ? 1 : 0);
		var1.writeShort(anInt375);
		var1.writeByte(anInt378);
		var1.writeTriByte(anInt376);
		var1.writeShort(anInt377 * -2138635069);
		var1.method324(aString29);
		var1.method324(aString25);
		var1.method324(aString26);
		var1.method324(aString24);
		var1.writeByte(anInt372 * -292566649);
		var1.writeShort(anInt371 * 1192881109);
		var1.method324(aString27);
		var1.method324(aString28);
		var1.writeByte(anInt379 * -1284761963);
		var1.writeByte(anInt382 * 1661256191);

		for (int var2 = 0; var2 < anIntArray81.length; var2++) {
			var1.writeInt(anIntArray81[var2]);
		}

		var1.writeInt(anInt369 * 1537231629);
	}

	public int method404() {
		byte var1 = 38;
		int var2 = var1 + Static.staticMethod51(aString29);
		var2 += Static.staticMethod51(aString25);
		var2 += Static.staticMethod51(aString26);
		var2 += Static.staticMethod51(aString24);
		var2 += Static.staticMethod51(aString27);
		var2 += Static.staticMethod51(aString28);
		return var2;
	}

	public ComputerInfo(boolean var1) {
		if (var1) {
			if (Static.staticString24.startsWith("win")) {
				anInt368 = 1;
			} else if (Static.staticString24.startsWith("mac")) {
				anInt368 = 2;
			} else if (Static.staticString24.startsWith("linux")) {
				anInt368 = 3;
			} else {
				anInt368 = 4;
			}

			String var2;
			try {
				var2 = System.getProperty("os.arch").toLowerCase();
			} catch (Exception var12) {
				var2 = "";
			}

			String var4;
			try {
				var4 = System.getProperty("os.version").toLowerCase();
			} catch (Exception var11) {
				var4 = "";
			}

			String var3 = "Unknown";
			String var5 = "1.1";

			try {
				var3 = System.getProperty("java.vendor");
				var5 = System.getProperty("java.version");
			} catch (Exception var10) {
				;
			}

			if (!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
				aBool48 = false;
			} else {
				aBool48 = true;
			}

			if (anInt368 == 1) {
				if (var4.indexOf("4.0") != -1) {
					anInt370 = 1;
				} else if (var4.indexOf("4.1") != -1) {
					anInt370 = 2;
				} else if (var4.indexOf("4.9") != -1) {
					anInt370 = 3;
				} else if (var4.indexOf("5.0") != -1) {
					anInt370 = 4;
				} else if (var4.indexOf("5.1") != -1) {
					anInt370 = 5;
				} else if (var4.indexOf("5.2") != -1) {
					anInt370 = 8;
				} else if (var4.indexOf("6.0") != -1) {
					anInt370 = 6;
				} else if (var4.indexOf("6.1") != -1) {
					anInt370 = 7;
				} else if (var4.indexOf("6.2") != -1) {
					anInt370 = 9;
				} else if (var4.indexOf("6.3") != -1) {
					anInt370 = 10;
				}
			} else if (anInt368 == 2) {
				if (var4.indexOf("10.4") != -1) {
					anInt370 = 20;
				} else if (var4.indexOf("10.5") != -1) {
					anInt370 = 21;
				} else if (var4.indexOf("10.6") != -1) {
					anInt370 = 22;
				} else if (var4.indexOf("10.7") != -1) {
					anInt370 = 23;
				} else if (var4.indexOf("10.8") != -1) {
					anInt370 = 24;
				} else if (var4.indexOf("10.9") != -1) {
					anInt370 = 25;
				} else if (var4.indexOf("10.10") != -1) {
					anInt370 = 26;
				}
			}

			if (var3.toLowerCase().indexOf("sun") != -1) {
				anInt380 = 1;
			} else if (var3.toLowerCase().indexOf("microsoft") != -1) {
				anInt380 = 2;
			} else if (var3.toLowerCase().indexOf("apple") != -1) {
				anInt380 = 3;
			} else if (var3.toLowerCase().indexOf("oracle") != -1) {
				anInt380 = 5;
			} else {
				anInt380 = 4;
			}

			int var6 = 2;
			int var7 = 0;

			char var8;
			try {
				while (var6 < var5.length()) {
					var8 = var5.charAt(var6);
					if (var8 < 48 || var8 > 57) {
						break;
					}

					var7 = var8 - 48 + var7 * 10;
					++var6;
				}
			} catch (Exception var15) {
				;
			}

			anInt381 = var7;
			var6 = var5.indexOf(46, 2) + 1;
			var7 = 0;

			try {
				while (var6 < var5.length()) {
					var8 = var5.charAt(var6);
					if (var8 < 48 || var8 > 57) {
						break;
					}

					var7 = var7 * 10 + var8 - 48;
					++var6;
				}
			} catch (Exception var14) {
				;
			}

			anInt373 = var7;
			var6 = var5.indexOf(95, 4) + 1;
			var7 = 0;

			try {
				while (var6 < var5.length()) {
					var8 = var5.charAt(var6);
					if (var8 < 48 || var8 > 57) {
						break;
					}

					var7 = var8 - 48 + var7 * 10;
					++var6;
				}
			} catch (Exception var13) {
				;
			}

			anInt374 = var7;
			aBool49 = false;
			anInt375 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
			if (anInt381 > 3) {
				anInt378 = Runtime.getRuntime().availableProcessors();
			} else {
				anInt378 = 0;
			}

			anInt376 = 0;
		}

		if (aString29 == null) {
			aString29 = "";
		}

		if (aString25 == null) {
			aString25 = "";
		}

		if (aString26 == null) {
			aString26 = "";
		}

		if (aString24 == null) {
			aString24 = "";
		}

		if (aString27 == null) {
			aString27 = "";
		}

		if (aString28 == null) {
			aString28 = "";
		}

		method405();
	}

	void method405() {
		if (aString29.length() > 40) {
			aString29 = aString29.substring(0, 40);
		}

		if (aString25.length() > 40) {
			aString25 = aString25.substring(0, 40);
		}

		if (aString26.length() > 10) {
			aString26 = aString26.substring(0, 10);
		}

		if (aString24.length() > 10) {
			aString24 = aString24.substring(0, 10);
		}

	}

}
