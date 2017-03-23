import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.StreamCorruptedException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.zip.CRC32;

import netscape.javascript.JSObject;

public class Static {

	static String staticMethod123(int var0) {
		return "<img=" + var0 + ">";
	}

	public static int staticMethod124(int var0) {
		var0 = (var0 >>> 1 & 0x55555555) + (var0 & 0x55555555);
		var0 = (var0 & 0x33333333) + (var0 >>> 2 & 0x33333333);
		var0 = var0 + (var0 >>> 4) & 0xf0f0f0f;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 0xff;
	}

	public static String staticMethod132(int var0, boolean var1) {
		if (var1 && var0 >= 0) {
			int var2 = var0;
			String var4;
			if (var1 && var0 >= 0) {
				int var5 = 2;

				for (int var6 = var0 / 10; var6 != 0; var5++) {
					var6 /= 10;
				}

				char[] var91 = new char[var5];
				var91[0] = 43;

				for (int var8 = var5 - 1; var8 > 0; --var8) {
					int var3 = var2;
					var2 /= 10;
					int var9 = var3 - var2 * 10;
					if (var9 >= 10) {
						var91[var8] = (char) (87 + var9);
					} else {
						var91[var8] = (char) (48 + var9);
					}
				}

				var4 = new String(var91);
			} else {
				var4 = Integer.toString(var0, 10);
			}

			return var4;
		} else {
			return Integer.toString(var0);
		}
	}

	public static boolean staticMethod133(int var0) {
		return (var0 >> 29 & 0x1) != 0;
	}

	static final void staticMethod143(int var0, int var1, int var2, int var3) {
		Client.staticInt187 = 0;
		boolean var12 = false;
		int var15 = -1;
		int var8 = staticInt24;
		int[] var9 = staticIntArray7;

		int var10;
		for (var10 = 0; var10 < var8 + Client.staticInt186; var10++) {
			Object var18;
			if (var10 < var8) {
				var18 = Client.staticPlayerArray1[var9[var10]];
				if (Client.staticInt229 == var9[var10]) {
					var12 = true;
					var15 = var10;
					continue;
				}
			} else {
				var18 = Client.staticNpcArray1[Client.staticIntArray121[var10 - var8]];
			}

			staticMethod209((Actor) var18, var10, var0, var1, var2, var3);
		}

		if (var12) {
			staticMethod209(Client.staticPlayerArray1[Client.staticInt229], var15, var0, var1, var2, var3);
		}

		for (var10 = 0; var10 < Client.staticInt187; var10++) {
			int var181 = Client.staticIntArray101[var10];
			int var11 = Client.staticIntArray102[var10];
			int var6 = Client.staticIntArray85[var10];
			int var16 = Client.staticIntArray87[var10];
			boolean var4 = true;

			while (var4) {
				var4 = false;

				for (int var19 = 0; var19 < var10; var19++) {
					if (2 + var11 > Client.staticIntArray102[var19] - Client.staticIntArray87[var19]
							&& var11 - var16 < Client.staticIntArray102[var19] + 2
							&& var181 - var6 < Client.staticIntArray101[var19] + Client.staticIntArray85[var19]
							&& var181 + var6 > Client.staticIntArray101[var19] - Client.staticIntArray85[var19]
							&& Client.staticIntArray102[var19] - Client.staticIntArray87[var19] < var11) {
						var11 = Client.staticIntArray102[var19] - Client.staticIntArray87[var19];
						var4 = true;
					}
				}
			}

			Client.staticInt189 = Client.staticIntArray101[var10];
			Client.staticInt180 = Client.staticIntArray102[var10] = var11;
			String var191 = Client.staticStringArray10[var10];
			if (Client.staticInt265 == 0) {
				int var14 = 16776960;
				if (Client.staticIntArray89[var10] < 6) {
					var14 = Client.staticIntArray100[Client.staticIntArray89[var10]];
				}

				if (Client.staticIntArray89[var10] == 6) {
					var14 = Client.staticInt292 % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.staticIntArray89[var10] == 7) {
					var14 = Client.staticInt292 % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.staticIntArray89[var10] == 8) {
					var14 = Client.staticInt292 % 20 < 10 ? '\ub000' : 8454016;
				}

				int var13;
				if (Client.staticIntArray89[var10] == 9) {
					var13 = 150 - Client.staticIntArray99[var10];
					if (var13 < 50) {
						var14 = var13 * 1280 + 16711680;
					} else if (var13 < 100) {
						var14 = 16776960 - (var13 - 50) * 327680;
					} else if (var13 < 150) {
						var14 = (var13 - 100) * 5 + '\uff00';
					}
				}

				if (Client.staticIntArray89[var10] == 10) {
					var13 = 150 - Client.staticIntArray99[var10];
					if (var13 < 50) {
						var14 = var13 * 5 + 16711680;
					} else if (var13 < 100) {
						var14 = 16711935 - (var13 - 50) * 327680;
					} else if (var13 < 150) {
						var14 = (var13 - 100) * 327680 + 255 - (var13 - 100) * 5;
					}
				}

				if (Client.staticIntArray89[var10] == 11) {
					var13 = 150 - Client.staticIntArray99[var10];
					if (var13 < 50) {
						var14 = 16777215 - var13 * 327685;
					} else if (var13 < 100) {
						var14 = (var13 - 50) * 327685 + '\uff00';
					} else if (var13 < 150) {
						var14 = 16777215 - (var13 - 100) * 327680;
					}
				}

				if (Client.staticIntArray90[var10] == 0) {
					GraphicsBuffer.staticRasterizer2DSub2Sub1_1.method630(var191, var0 + Client.staticInt189,
							Client.staticInt180 + var1, var14, 0);
				}

				if (Client.staticIntArray90[var10] == 1) {
					GraphicsBuffer.staticRasterizer2DSub2Sub1_1.method626(var191, var0 + Client.staticInt189,
							Client.staticInt180 + var1, var14, 0, Client.staticInt292);
				}

				if (Client.staticIntArray90[var10] == 2) {
					GraphicsBuffer.staticRasterizer2DSub2Sub1_1.method619(var191, Client.staticInt189 + var0,
							var1 + Client.staticInt180, var14, 0, Client.staticInt292);
				}

				if (Client.staticIntArray90[var10] == 3) {
					GraphicsBuffer.staticRasterizer2DSub2Sub1_1.method620(var191, Client.staticInt189 + var0,
							Client.staticInt180 + var1, var14, 0, Client.staticInt292, 150 - Client.staticIntArray99[var10]);
				}

				if (Client.staticIntArray90[var10] == 4) {
					var13 = (150 - Client.staticIntArray99[var10])
							* (GraphicsBuffer.staticRasterizer2DSub2Sub1_1.method613(var191) + 100) / 150;
					staticMethod402(var0 + Client.staticInt189 - 50, var1, 50 + Client.staticInt189 + var0, var3 + var1);
					GraphicsBuffer.staticRasterizer2DSub2Sub1_1.method616(var191, 50 + Client.staticInt189 + var0 - var13,
							var1 + Client.staticInt180, var14, 0);
					staticMethod416(var0, var1, var2 + var0, var3 + var1);
				}

				if (Client.staticIntArray90[var10] == 5) {
					var13 = 150 - Client.staticIntArray99[var10];
					int var17 = 0;
					if (var13 < 25) {
						var17 = var13 - 25;
					} else if (var13 > 125) {
						var17 = var13 - 125;
					}

					staticMethod402(var0,
							var1 + Client.staticInt180 - GraphicsBuffer.staticRasterizer2DSub2Sub1_1.anInt669 - 1,
							var2 + var0, 5 + var1 + Client.staticInt180);
					GraphicsBuffer.staticRasterizer2DSub2Sub1_1.method630(var191, var0 + Client.staticInt189,
							var17 + var1 + Client.staticInt180, var14, 0);
					staticMethod416(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				GraphicsBuffer.staticRasterizer2DSub2Sub1_1.method630(var191, Client.staticInt189 + var0,
						var1 + Client.staticInt180, 16776960, 0);
			}
		}

	}

	static void staticMethod212() {
		staticInt112 = 99;
		staticByteArrayArrayArray1 = new byte[4][104][104];
		staticByteArrayArrayArray5 = new byte[4][104][104];
		staticByteArrayArrayArray3 = new byte[4][104][104];
		staticByteArrayArrayArray6 = new byte[4][104][104];
		NodeSub1.staticIntArrayArrayArray2 = new int[4][105][105];
		staticByteArrayArrayArray2 = new byte[4][105][105];
		staticIntArrayArray7 = new int[105][105];
		staticIntArray55 = new int[104];
		ClientScriptMap.staticIntArray129 = new int[104];
		CacheableSub2.staticIntArray127 = new int[104];
		Class60.staticIntArray76 = new int[104];
		staticIntArray51 = new int[104];
	}

	public static Config5 staticMethod147(int var0) {
		Config5 var1 = (Config5) Config5.staticCache33.get(var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = Config5.staticJs5Index34.getFile(5, var0);
			var1 = new Config5();
			if (var2 != null) {
				var1.method558(new ByteBuf(var2));
			}

			Config5.staticCache33.method170(var1, var0);
			return var1;
		}
	}

	static CacheableSub1 staticMethod148(int var0) {
		CacheableSub1 var1 = (CacheableSub1) CacheableSub1.staticCache6.get(var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var3 = Connection.staticJs5IndexImpl4.getFile(var0, 0);
			if (var3 == null) {
				return null;
			} else {
				var1 = new CacheableSub1();
				ByteBuf var4 = new ByteBuf(var3);
				var4.position = var4.buf.length - 12;
				int var6 = var4.readInt();
				var1.anInt398 = var4.method370();
				var1.anInt399 = var4.method370();
				var1.anInt401 = var4.method370();
				var1.anInt400 = var4.method370();
				var4.position = 0;
				var4.method334();
				var1.anIntArray84 = new int[var6];
				var1.anIntArray85 = new int[var6];
				var1.aStringArray5 = new String[var6];

				int var2;
				for (int var5 = 0; var4.position < var4.buf.length - 12; var1.anIntArray84[var5++] = var2) {
					var2 = var4.method370();
					if (var2 == 3) {
						var1.aStringArray5[var5] = var4.readString();
					} else if (var2 < 100 && var2 != 21 && var2 != 38 && var2 != 39) {
						var1.anIntArray85[var5] = var4.readInt();
					} else {
						var1.anIntArray85[var5] = var4.method367();
					}
				}

				CacheableSub1.staticCache6.method170(var1, var0);
				return var1;
			}
		}
	}

	public static int staticMethod149(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; var3++) {
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}

		return var2;
	}

	public static int staticMethod166(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		synchronized (staticBZip2DState1) {
			staticBZip2DState1.aByteArray6 = var2;
			staticBZip2DState1.anInt166 = var4;
			staticBZip2DState1.aByteArray7 = var0;
			staticBZip2DState1.anInt175 = 0;
			staticBZip2DState1.anInt168 = var1;
			staticBZip2DState1.anInt171 = 0;
			staticBZip2DState1.anInt170 = 0;
			staticBZip2DState1.anInt160 = 0;
			staticBZip2DState1.anInt177 = 0;
			staticMethod168(staticBZip2DState1);
			var1 -= staticBZip2DState1.anInt168;
			staticBZip2DState1.aByteArray6 = null;
			staticBZip2DState1.aByteArray7 = null;
			return var1;
		}
	}

	static void staticMethod167(BZip2DState var0) {
		byte var1 = var0.aByte1;
		int var13 = var0.anInt169;
		int var3 = var0.anInt162;
		int var12 = var0.anInt174;
		int[] var4 = Class43.staticIntArray59;
		int var5 = var0.anInt173;
		byte[] var6 = var0.aByteArray7;
		int var2 = var0.anInt175;
		int var7 = var0.anInt168;
		int var9 = var0.anInt180 + 1;

		label66: while (true) {
			if (var13 > 0) {
				while (true) {
					if (var7 == 0) {
						break label66;
					}

					if (var13 == 1) {
						if (var7 == 0) {
							var13 = 1;
							break label66;
						}

						var6[var2] = var1;
						++var2;
						--var7;
						break;
					}

					var6[var2] = var1;
					--var13;
					++var2;
					--var7;
				}
			}

			boolean var14 = true;

			byte var11;
			while (var14) {
				var14 = false;
				if (var3 == var9) {
					var13 = 0;
					break label66;
				}

				var1 = (byte) var12;
				var5 = var4[var5];
				var11 = (byte) (var5 & 0xff);
				var5 >>= 8;
				++var3;
				if (var11 != var12) {
					var12 = var11;
					if (var7 == 0) {
						var13 = 1;
						break label66;
					}

					var6[var2] = var1;
					++var2;
					--var7;
					var14 = true;
				} else if (var3 == var9) {
					if (var7 == 0) {
						var13 = 1;
						break label66;
					}

					var6[var2] = var1;
					++var2;
					--var7;
					var14 = true;
				}
			}

			var13 = 2;
			var5 = var4[var5];
			var11 = (byte) (var5 & 0xff);
			var5 >>= 8;
			++var3;
			if (var3 != var9) {
				if (var11 != var12) {
					var12 = var11;
				} else {
					var13 = 3;
					var5 = var4[var5];
					var11 = (byte) (var5 & 0xff);
					var5 >>= 8;
					++var3;
					if (var3 != var9) {
						if (var11 != var12) {
							var12 = var11;
						} else {
							var5 = var4[var5];
							var11 = (byte) (var5 & 0xff);
							var5 >>= 8;
							++var3;
							var13 = (var11 & 0xff) + 4;
							var5 = var4[var5];
							var12 = (byte) (var5 & 0xff);
							var5 >>= 8;
							++var3;
						}
					}
				}
			}
		}

		int var131 = var0.anInt177;
		var0.anInt177 += var7 - var7;
		if (var0.anInt177 < var131) {
			;
		}

		var0.aByte1 = var1;
		var0.anInt169 = var13;
		var0.anInt162 = var3;
		var0.anInt174 = var12;
		Class43.staticIntArray59 = var4;
		var0.anInt173 = var5;
		var0.aByteArray7 = var6;
		var0.anInt175 = var2;
		var0.anInt168 = var7;
	}

	static void staticMethod168(BZip2DState var0) {
		int var19 = 0;
		int[] var16 = null;
		int[] var29 = null;
		int[] var18 = null;
		var0.anInt178 = 1;
		if (Class43.staticIntArray59 == null) {
			Class43.staticIntArray59 = new int[var0.anInt178 * 100000];
		}

		boolean var22 = true;

		while (true) {
			while (var22) {
				byte var20 = staticMethod171(var0);
				if (var20 == 23) {
					return;
				}

				var20 = staticMethod171(var0);
				var20 = staticMethod171(var0);
				var20 = staticMethod171(var0);
				var20 = staticMethod171(var0);
				var20 = staticMethod171(var0);
				var20 = staticMethod171(var0);
				var20 = staticMethod171(var0);
				var20 = staticMethod171(var0);
				var20 = staticMethod171(var0);
				var20 = staticMethod169(var0);
				if (var20 != 0) {
					;
				}

				var0.anInt172 = 0;
				var20 = staticMethod171(var0);
				var0.anInt172 = var0.anInt172 << 8 | var20 & 0xff;
				var20 = staticMethod171(var0);
				var0.anInt172 = var0.anInt172 << 8 | var20 & 0xff;
				var20 = staticMethod171(var0);
				var0.anInt172 = var0.anInt172 << 8 | var20 & 0xff;

				int var35;
				for (var35 = 0; var35 < 16; var35++) {
					var20 = staticMethod169(var0);
					if (var20 == 1) {
						var0.aBoolArray3[var35] = true;
					} else {
						var0.aBoolArray3[var35] = false;
					}
				}

				for (var35 = 0; var35 < 256; var35++) {
					var0.aBoolArray4[var35] = false;
				}

				int var52;
				for (var35 = 0; var35 < 16; var35++) {
					if (var0.aBoolArray3[var35]) {
						for (var52 = 0; var52 < 16; var52++) {
							var20 = staticMethod169(var0);
							if (var20 == 1) {
								var0.aBoolArray4[var35 * 16 + var52] = true;
							}
						}
					}
				}

				staticMethod170(var0);
				int var39 = var0.anInt179 + 2;
				int var40 = staticMethod173(3, var0);
				int var53 = staticMethod173(15, var0);

				for (var35 = 0; var35 < var53; var35++) {
					var52 = 0;

					while (true) {
						var20 = staticMethod169(var0);
						if (var20 == 0) {
							var0.aByteArray11[var35] = (byte) var52;
							break;
						}

						++var52;
					}
				}

				byte[] var7 = new byte[6];

				byte var21;
				for (var21 = 0; var21 < var40; var7[var21] = var21++) {
					;
				}

				for (var35 = 0; var35 < var53; var35++) {
					var21 = var0.aByteArray11[var35];

					byte var37;
					for (var37 = var7[var21]; var21 > 0; --var21) {
						var7[var21] = var7[var21 - 1];
					}

					var7[0] = var37;
					var0.aByteArray10[var35] = var37;
				}

				int var41;
				int var501;
				for (var501 = 0; var501 < var40; var501++) {
					var41 = staticMethod173(5, var0);

					for (var35 = 0; var35 < var39; var35++) {
						while (true) {
							var20 = staticMethod169(var0);
							if (var20 == 0) {
								var0.aByteArrayArray1[var501][var35] = (byte) var41;
								break;
							}

							var20 = staticMethod169(var0);
							if (var20 == 0) {
								++var41;
							} else {
								--var41;
							}
						}
					}
				}

				for (var501 = 0; var501 < var40; var501++) {
					byte var51 = 32;
					byte var55 = 0;

					for (var35 = 0; var35 < var39; var35++) {
						if (var0.aByteArrayArray1[var501][var35] > var55) {
							var55 = var0.aByteArrayArray1[var501][var35];
						}

						if (var0.aByteArrayArray1[var501][var35] < var51) {
							var51 = var0.aByteArrayArray1[var501][var35];
						}
					}

					staticMethod172(var0.anIntArrayArray7[var501], var0.anIntArrayArray6[var501],
							var0.anIntArrayArray8[var501], var0.aByteArrayArray1[var501], var51, var55, var39);
					var0.anIntArray39[var501] = var51;
				}

				var41 = var0.anInt179 + 1;
				int var521 = -1;
				byte var36 = 0;

				for (var35 = 0; var35 <= 255; var35++) {
					var0.anIntArray36[var35] = 0;
				}

				int var49 = 4095;

				int var42;
				int var50;
				for (var42 = 15; var42 >= 0; --var42) {
					for (var50 = 15; var50 >= 0; --var50) {
						var0.aByteArray8[var49] = (byte) (var42 * 16 + var50);
						--var49;
					}

					var0.anIntArray37[var42] = var49 + 1;
				}

				int var43 = 0;
				byte var48;
				if (var36 == 0) {
					++var521;
					var36 = 50;
					var48 = var0.aByteArray10[var521];
					var19 = var0.anIntArray39[var48];
					var16 = var0.anIntArrayArray7[var48];
					var18 = var0.anIntArrayArray8[var48];
					var29 = var0.anIntArrayArray6[var48];
				}

				int var38 = var36 - 1;
				int var46 = var19;

				int var47;
				byte var56;
				for (var47 = staticMethod173(var19, var0); var47 > var16[var46]; var47 = var47 << 1 | var56) {
					++var46;
					var56 = staticMethod169(var0);
				}

				int var54 = var18[var47 - var29[var46]];

				while (true) {
					while (var54 != var41) {
						int var44;
						int var45;
						if (var54 != 0 && var54 != 1) {
							var44 = var54 - 1;
							int var23;
							if (var44 < 16) {
								var45 = var0.anIntArray37[0];

								for (var20 = var0.aByteArray8[var45 + var44]; var44 > 3; var44 -= 4) {
									var23 = var45 + var44;
									var0.aByteArray8[var23] = var0.aByteArray8[var23 - 1];
									var0.aByteArray8[var23 - 1] = var0.aByteArray8[var23 - 2];
									var0.aByteArray8[var23 - 2] = var0.aByteArray8[var23 - 3];
									var0.aByteArray8[var23 - 3] = var0.aByteArray8[var23 - 4];
								}

								while (var44 > 0) {
									var0.aByteArray8[var45 + var44] = var0.aByteArray8[var45 + var44 - 1];
									--var44;
								}

								var0.aByteArray8[var45] = var20;
							} else {
								var23 = var44 / 16;
								int var34 = var44 % 16;
								var45 = var0.anIntArray37[var23] + var34;

								for (var20 = var0.aByteArray8[var45]; var45 > var0.anIntArray37[var23]; --var45) {
									var0.aByteArray8[var45] = var0.aByteArray8[var45 - 1];
								}

								++var0.anIntArray37[var23];

								while (var23 > 0) {
									--var0.anIntArray37[var23];
									var0.aByteArray8[var0.anIntArray37[var23]] = var0.aByteArray8[var0.anIntArray37[var23
											- 1] + 16 - 1];
									--var23;
								}

								--var0.anIntArray37[0];
								var0.aByteArray8[var0.anIntArray37[0]] = var20;
								if (var0.anIntArray37[0] == 0) {
									var49 = 4095;

									for (var42 = 15; var42 >= 0; --var42) {
										for (var50 = 15; var50 >= 0; --var50) {
											var0.aByteArray8[var49] = var0.aByteArray8[var0.anIntArray37[var42]
													+ var50];
											--var49;
										}

										var0.anIntArray37[var42] = var49 + 1;
									}
								}
							}

							++var0.anIntArray36[var0.aByteArray9[var20 & 0xff] & 0xff];
							Class43.staticIntArray59[var43] = var0.aByteArray9[var20 & 0xff] & 0xff;
							++var43;
							if (var38 == 0) {
								++var521;
								var38 = 50;
								var48 = var0.aByteArray10[var521];
								var19 = var0.anIntArray39[var48];
								var16 = var0.anIntArrayArray7[var48];
								var18 = var0.anIntArrayArray8[var48];
								var29 = var0.anIntArrayArray6[var48];
							}

							--var38;
							var46 = var19;

							for (var47 = staticMethod173(var19, var0); var47 > var16[var46]; var47 = var47 << 1
									| var56) {
								++var46;
								var56 = staticMethod169(var0);
							}

							var54 = var18[var47 - var29[var46]];
						} else {
							var44 = -1;
							var45 = 1;

							do {
								if (var54 == 0) {
									var44 += var45 * 1;
								} else if (var54 == 1) {
									var44 += var45 * 2;
								}

								var45 *= 2;
								if (var38 == 0) {
									++var521;
									var38 = 50;
									var48 = var0.aByteArray10[var521];
									var19 = var0.anIntArray39[var48];
									var16 = var0.anIntArrayArray7[var48];
									var18 = var0.anIntArrayArray8[var48];
									var29 = var0.anIntArrayArray6[var48];
								}

								--var38;
								var46 = var19;

								for (var47 = staticMethod173(var19, var0); var47 > var16[var46]; var47 = var47 << 1
										| var56) {
									++var46;
									var56 = staticMethod169(var0);
								}

								var54 = var18[var47 - var29[var46]];
							} while (var54 == 0 || var54 == 1);

							++var44;
							var20 = var0.aByteArray9[var0.aByteArray8[var0.anIntArray37[0]] & 0xff];

							for (var0.anIntArray36[var20 & 0xff] += var44; var44 > 0; --var44) {
								Class43.staticIntArray59[var43] = var20 & 0xff;
								++var43;
							}
						}
					}

					var0.anInt169 = 0;
					var0.aByte1 = 0;
					var0.anIntArray38[0] = 0;

					for (var35 = 1; var35 <= 256; var35++) {
						var0.anIntArray38[var35] = var0.anIntArray36[var35 - 1];
					}

					for (var35 = 1; var35 <= 256; var35++) {
						var0.anIntArray38[var35] += var0.anIntArray38[var35 - 1];
					}

					for (var35 = 0; var35 < var43; var35++) {
						var20 = (byte) (Class43.staticIntArray59[var35] & 0xff);
						Class43.staticIntArray59[var0.anIntArray38[var20 & 0xff]] |= var35 << 8;
						++var0.anIntArray38[var20 & 0xff];
					}

					var0.anInt173 = Class43.staticIntArray59[var0.anInt172] >> 8;
					var0.anInt162 = 0;
					var0.anInt173 = Class43.staticIntArray59[var0.anInt173];
					var0.anInt174 = (byte) (var0.anInt173 & 0xff);
					var0.anInt173 >>= 8;
					++var0.anInt162;
					var0.anInt180 = var43;
					staticMethod167(var0);
					if (var0.anInt162 == var0.anInt180 + 1 && var0.anInt169 == 0) {
						var22 = true;
						break;
					}

					var22 = false;
					break;
				}
			}

			return;
		}
	}

	static byte staticMethod169(BZip2DState var0) {
		return (byte) staticMethod173(1, var0);
	}

	static void staticMethod170(BZip2DState var0) {
		var0.anInt179 = 0;

		for (int var1 = 0; var1 < 256; var1++) {
			if (var0.aBoolArray4[var1]) {
				var0.aByteArray9[var0.anInt179] = (byte) var1;
				++var0.anInt179;
			}
		}

	}

	static byte staticMethod171(BZip2DState var0) {
		return (byte) staticMethod173(8, var0);
	}

	static void staticMethod172(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
		int var7 = 0;

		int var8;
		int var10;
		for (var8 = var4; var8 <= var5; var8++) {
			for (var10 = 0; var10 < var6; var10++) {
				if (var3[var10] == var8) {
					var2[var7] = var10;
					++var7;
				}
			}
		}

		for (var8 = 0; var8 < 23; var8++) {
			var1[var8] = 0;
		}

		for (var8 = 0; var8 < var6; var8++) {
			++var1[var3[var8] + 1];
		}

		for (var8 = 1; var8 < 23; var8++) {
			var1[var8] += var1[var8 - 1];
		}

		for (var8 = 0; var8 < 23; var8++) {
			var0[var8] = 0;
		}

		var10 = 0;

		for (var8 = var4; var8 <= var5; var8++) {
			var10 += var1[var8 + 1] - var1[var8];
			var0[var8] = var10 - 1;
			var10 <<= 1;
		}

		for (var8 = var4 + 1; var8 <= var5; var8++) {
			var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
		}

	}

	static int staticMethod173(int var0, BZip2DState var1) {
		while (var1.anInt171 < var0) {
			var1.anInt170 = var1.anInt170 << 8 | var1.aByteArray6[var1.anInt166] & 0xff;
			var1.anInt171 += 8;
			++var1.anInt166;
			++var1.anInt160;
			if (var1.anInt160 == 0) {
				;
			}
		}

		int var2 = var1.anInt170 >> var1.anInt171 - var0 & (1 << var0) - 1;
		var1.anInt171 -= var0;
		return var2;
	}

	public static int staticMethod213(boolean var0, boolean var1) {
		int var2 = 0;
		if (var0) {
			var2 += staticInt136 + staticInt130;
		}

		if (var1) {
			var2 += staticInt133 + staticInt132;
		}

		return var2;
	}

	public static int staticMethod214(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1;

		for (int var7 = 0; var7 < var5; var7++) {
			char var6 = var0.charAt(var7 + var1);
			if ((var6 <= 0 || var6 >= 128) && (var6 < 160 || var6 > 255)) {
				if (var6 == 8364) {
					var3[var4 + var7] = -128;
				} else if (var6 == 8218) {
					var3[var4 + var7] = -126;
				} else if (var6 == 402) {
					var3[var4 + var7] = -125;
				} else if (var6 == 8222) {
					var3[var7 + var4] = -124;
				} else if (var6 == 8230) {
					var3[var4 + var7] = -123;
				} else if (var6 == 8224) {
					var3[var4 + var7] = -122;
				} else if (var6 == 8225) {
					var3[var7 + var4] = -121;
				} else if (var6 == 710) {
					var3[var7 + var4] = -120;
				} else if (var6 == 8240) {
					var3[var4 + var7] = -119;
				} else if (var6 == 352) {
					var3[var7 + var4] = -118;
				} else if (var6 == 8249) {
					var3[var7 + var4] = -117;
				} else if (var6 == 338) {
					var3[var4 + var7] = -116;
				} else if (var6 == 381) {
					var3[var4 + var7] = -114;
				} else if (var6 == 8216) {
					var3[var7 + var4] = -111;
				} else if (var6 == 8217) {
					var3[var7 + var4] = -110;
				} else if (var6 == 8220) {
					var3[var7 + var4] = -109;
				} else if (var6 == 8221) {
					var3[var7 + var4] = -108;
				} else if (var6 == 8226) {
					var3[var4 + var7] = -107;
				} else if (var6 == 8211) {
					var3[var4 + var7] = -106;
				} else if (var6 == 8212) {
					var3[var7 + var4] = -105;
				} else if (var6 == 732) {
					var3[var7 + var4] = -104;
				} else if (var6 == 8482) {
					var3[var7 + var4] = -103;
				} else if (var6 == 353) {
					var3[var7 + var4] = -102;
				} else if (var6 == 8250) {
					var3[var4 + var7] = -101;
				} else if (var6 == 339) {
					var3[var4 + var7] = -100;
				} else if (var6 == 382) {
					var3[var7 + var4] = -98;
				} else if (var6 == 376) {
					var3[var7 + var4] = -97;
				} else {
					var3[var7 + var4] = 63;
				}
			} else {
				var3[var7 + var4] = (byte) var6;
			}
		}

		return var5;
	}

	static void staticMethod215(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; var5++) {
			Widget var6 = var0[var5];
			if (var6 != null && var1 == var6.anInt342) {
				staticMethod175(var6, var2, var3, var4);
				staticMethod72(var6, var2, var3);
				if (var6.anInt335 > var6.anInt344 - var6.anInt307) {
					var6.anInt335 = var6.anInt344 - var6.anInt307;
				}

				if (var6.anInt335 < 0) {
					var6.anInt335 = 0;
				}

				if (var6.anInt312 > var6.anInt361 - var6.anInt351) {
					var6.anInt312 = var6.anInt361 - var6.anInt351;
				}

				if (var6.anInt312 < 0) {
					var6.anInt312 = 0;
				}

				if (var6.anInt296 == 0) {
					staticMethod135(var0, var6, var4);
				}
			}
		}

	}

	public static CacheableSub2 staticMethod216(Js5Index var0, Js5Index var1, int var2, boolean var3) {
		boolean var4 = true;
		int[] var5 = var0.method262(var2);

		for (int var10 = 0; var10 < var5.length; var10++) {
			byte[] var7 = var0.method261(var2, var5[var10]);
			if (var7 == null) {
				var4 = false;
			} else {
				int var8 = (var7[0] & 0xff) << 8 | var7[1] & 0xff;
				byte[] var9;
				if (var3) {
					var9 = var1.method261(0, var8);
				} else {
					var9 = var1.method261(var8, 0);
				}

				if (var9 == null) {
					var4 = false;
				}
			}
		}

		if (!var4) {
			return null;
		} else {
			try {
				return new CacheableSub2(var0, var1, var2, var3);
			} catch (Exception var101) {
				return null;
			}
		}
	}

	public static void staticMethod125(String var0, boolean var1, boolean var2) {
		staticMethod198(var0, var1, "openjs", var2);
	}

	static final void staticMethod126(Actor var0) {
		if (Client.staticInt166 == var0.anInt604 || var0.anInt612 == -1 || var0.anInt615 != 0
				|| 1 + var0.anInt614 > staticMethod210(var0.anInt612).anIntArray119[var0.anInt613]) {
			int var3 = var0.anInt604 - var0.anInt625;
			int var1 = Client.staticInt166 - var0.anInt625;
			int var4 = var0.anInt626 * 64 + var0.anInt606 * 128;
			int var5 = var0.anInt626 * 64 + var0.anInt623 * 128;
			int var2 = var0.anInt626 * 64 + var0.anInt617 * 128;
			int var6 = var0.anInt626 * 64 + var0.anInt624 * 128;
			var0.anInt628 = (var1 * var2 + (var3 - var1) * var4) / var3;
			var0.anInt591 = (var6 * var1 + var5 * (var3 - var1)) / var3;
		}

		var0.anInt633 = 0;
		var0.anInt630 = var0.anInt627 * -1511981417;
		var0.anInt592 = var0.anInt630;
	}

	static final void staticMethod127(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			staticClass6_1.aBool3 = !staticClass6_1.aBool3;
			staticMethod270();
			if (staticClass6_1.aBool3) {
				staticMethod36(99, "", "Roofs are now all hidden");
			} else {
				staticMethod36(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			Client.staticBool23 = !Client.staticBool23;
		}

		if (Client.myRights >= 2) {
			if (var0.equalsIgnoreCase("fpson")) {
				Client.staticBool23 = true;
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				Client.staticBool23 = false;
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				staticMethod329();
			}

			if (var0.equalsIgnoreCase("errortest") && Client.staticInt207 == 2) {
				throw new RuntimeException();
			}
		}

		Client.outBuffer.method471(13);
		Client.outBuffer.writeByte(var0.length() + 1);
		Client.outBuffer.writeString(var0);
	}

	public static String staticMethod5(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var3 = 0;

				for (long var2 = var0; var2 != 0L; var2 /= 37L) {
					++var3;
				}

				StringBuilder var61 = new StringBuilder(var3);

				while (var0 != 0L) {
					long var6 = var0;
					var0 /= 37L;
					var61.append(staticCharArray6[(int) (var6 - var0 * 37L)]);
				}

				return var61.reverse().toString();
			}
		} else {
			return null;
		}
	}

	public static void staticMethod1(boolean var0) {
		if (staticConnection2 != null) {
			try {
				ByteBuf var4 = new ByteBuf(4);
				var4.writeByte(var0 ? 2 : 3);
				var4.writeTriByte(0);
				staticConnection2.write(var4.buf, 0, 4);
			} catch (IOException var41) {
				try {
					staticConnection2.shutdown();
				} catch (Exception var3) {
					;
				}

				++staticInt135;
				staticConnection2 = null;
			}
		}

	}

	static void staticMethod2(int var0) {
		if (var0 != -1 && staticMethod4(var0)) {
			Widget[] var4 = Widget.staticWidgetArrayArray1[var0];

			for (int var1 = 0; var1 < var4.length; var1++) {
				Widget var3 = var4[var1];
				if (var3.anObjectArray4 != null) {
					NodeSub16 var2 = new NodeSub16();
					var2.aWidget1 = var3;
					var2.anObjectArray2 = var3.anObjectArray4;
					staticMethod474(var2, 2000000);
				}
			}
		}

	}

	public static void staticMethod3(Js5Index var0, Js5Index var1, boolean var2, Rasterizer2DSub2Sub1 var3) {
		ItemDefinition.staticJs5Index15 = var0;
		ItemDefinition.staticJs5Index14 = var1;
		staticBool4 = var2;
		KeyboardHandler.staticInt85 = ItemDefinition.staticJs5Index15.method263(10);
		NodeSub19.staticRasterizer2DSub2Sub1_4 = var3;
	}

	public static boolean staticMethod4(int var0) {
		if (Npc.staticBoolArray12[var0]) {
			return true;
		} else if (!Widget.staticJs5Index10.method258(var0)) {
			return false;
		} else {
			int var3 = Widget.staticJs5Index10.method263(var0);
			if (var3 == 0) {
				Npc.staticBoolArray12[var0] = true;
				return true;
			} else {
				if (Widget.staticWidgetArrayArray1[var0] == null) {
					Widget.staticWidgetArrayArray1[var0] = new Widget[var3];
				}

				for (int var1 = 0; var1 < var3; var1++) {
					if (Widget.staticWidgetArrayArray1[var0][var1] == null) {
						byte[] var2 = Widget.staticJs5Index10.getFile(var0, var1);
						if (var2 != null) {
							Widget.staticWidgetArrayArray1[var0][var1] = new Widget();
							Widget.staticWidgetArrayArray1[var0][var1].anInt294 = var1 + (var0 << 16);
							if (var2[0] == -1) {
								Widget.staticWidgetArrayArray1[var0][var1].method392(new ByteBuf(var2));
							} else {
								Widget.staticWidgetArrayArray1[var0][var1].method391(new ByteBuf(var2));
							}
						}
					}
				}

				Npc.staticBoolArray12[var0] = true;
				return true;
			}
		}
	}

	static void staticMethod53() {
		int var0 = GameShell.staticInt106;
		int var1 = GameShell.staticInt109;
		int var2 = Class40Sub1.staticInt317 - gameWidth - var0;
		int var3 = BuildType.staticInt124 - Class47.gameHeight - var1;
		if (var0 > 0 || var2 > 0 || var1 > 0 || var3 > 0) {
			try {
				Container var4 = Client.staticGame1.method207();
				int var5 = 0;
				int var6 = 0;
				if (var4 == Class40Sub1.staticFrame1) {
					Insets var9 = Class40Sub1.staticFrame1.getInsets();
					var5 = var9.left;
					var6 = var9.top;
				}

				Graphics var91 = var4.getGraphics();
				var91.setColor(Color.black);
				if (var0 > 0) {
					var91.fillRect(var5, var6, var0, BuildType.staticInt124);
				}

				if (var1 > 0) {
					var91.fillRect(var5, var6, Class40Sub1.staticInt317, var1);
				}

				if (var2 > 0) {
					var91.fillRect(Class40Sub1.staticInt317 + var5 - var2, var6, var2, BuildType.staticInt124);
				}

				if (var3 > 0) {
					var91.fillRect(var5, var6 + BuildType.staticInt124 - var3, Class40Sub1.staticInt317, var3);
				}
			} catch (Exception var8) {
				;
			}
		}

	}

	public static Rasterizer2DSub2Sub1 staticMethod54(Js5Index var0, Js5Index var1, int var2, int var3) {
		return !staticMethod65(var0, var2, var3) ? null : staticMethod105(var1.getFile(var2, var3));
	}

	public static void staticMethod55() {
		if (KeyboardHandler.staticKeyboardHandler1 != null) {
			synchronized (KeyboardHandler.staticKeyboardHandler1) {
				KeyboardHandler.staticKeyboardHandler1 = null;
			}
		}

	}

	static int staticMethod56(int var0, int var1) {
		int var2 = (int) Math.pow(var0, 1.0D / var1) + 1;

		while (true) {
			int var5 = var2;
			int var3 = var1;

			int var4;
			for (var4 = 1; var3 > 1; var3 >>= 1) {
				if ((var3 & 0x1) != 0) {
					var4 *= var5;
				}

				var5 *= var5;
			}

			int var6;
			if (var3 == 1) {
				var6 = var4 * var5;
			} else {
				var6 = var4;
			}

			if (var6 <= var0) {
				return var2;
			}

			--var2;
		}
	}

	static int staticMethod57(int[] var0, int var1) {
		int var2 = var0[var1];
		int var6 = -1;
		int var4 = Integer.MAX_VALUE;

		for (int var5 = 0; var5 < var1; var5++) {
			int var3 = var0[var5];
			if (var3 > var2 && var3 < var4) {
				var6 = var5;
				var4 = var3;
			}
		}

		return var6;
	}

	static int staticMethod58(int[] var0, int var1) {
		int var2 = var0[var1];
		int var6 = -1;
		int var4 = Integer.MIN_VALUE;

		for (int var3 = 0; var3 < var1; var3++) {
			int var5 = var0[var3];
			if (var5 < var2 && var5 > var4) {
				var6 = var3;
				var4 = var5;
			}
		}

		return var6;
	}

	static void staticMethod59(Class2 var0) {
		if (var0.method10() != Client.staticBool20) {
			Client.staticBool20 = var0.method10();
			boolean var1 = var0.method10();
			if (var1 != staticBool4) {
				staticMethod39();
				staticBool4 = var1;
			}
		}

		Class31.staticString21 = var0.aString1;
		Client.staticInt309 = var0.anInt4;
		Client.staticInt201 = var0.anInt3;
		Class7.staticInt30 = 1568197829 * (Client.staticInt207 == 0 ? '\uaa4a' : var0.anInt4 + '\u9c40');
		Client.staticInt250 = (Client.staticInt207 == 0 ? 443 : var0.anInt4 + '\uc350') * 922916997;
		Class32.staticInt73 = Class7.staticInt30;
	}

	static int staticMethod60(int var0, CacheableSub1 var1, boolean var2) {
		int var4;
		if (var0 == 5504) {
			staticInt27 -= 2;
			var4 = staticIntArray16[staticInt27];
			int var3 = staticIntArray16[staticInt27 + 1];
			if (!Client.staticBool28) {
				Client.staticInt220 = var4;
				Client.staticInt221 = var3;
			}

			return 1;
		} else if (var0 == 5505) {
			staticIntArray16[++staticInt27 - 1] = Client.staticInt220;
			return 1;
		} else if (var0 == 5506) {
			staticIntArray16[++staticInt27 - 1] = Client.staticInt221;
			return 1;
		} else if (var0 == 5530) {
			var4 = staticIntArray16[--staticInt27];
			if (var4 < 0) {
				var4 = 0;
			}

			Client.staticInt225 = var4;
			return 1;
		} else if (var0 == 5531) {
			staticIntArray16[++staticInt27 - 1] = Client.staticInt225;
			return 1;
		} else {
			return 2;
		}
	}

	public static void staticMethod61(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var2 + var3) / 2;
			int var8 = var2;
			String var5 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var5;
			short var6 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var6;

			for (int var7 = var2; var7 < var3; var7++) {
				if (var5 == null || var0[var7] != null && var0[var7].compareTo(var5) < (var7 & 0x1)) {
					String var9 = var0[var7];
					var0[var7] = var0[var8];
					var0[var8] = var9;
					short var10 = var1[var7];
					var1[var7] = var1[var8];
					var1[var8++] = var10;
				}
			}

			var0[var3] = var0[var8];
			var0[var8] = var5;
			var1[var3] = var1[var8];
			var1[var8] = var6;
			staticMethod61(var0, var1, var2, var8 - 1);
			staticMethod61(var0, var1, 1 + var8, var3);
		}

	}

	static float staticMethod62(float var0) {
		float var1 = 32.703197F * (float) Math.pow(2.0D, var0);
		return var1 * 3.1415927F / 11025.0F;
	}

	public static void staticMethod63() {
		staticClass36_1 = new Class36();
	}

	static void staticMethod64(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;

		for (int var5 = 0; var5 < 4; var5++) {
			if (var0 != Class2.staticIntArray1[var5]) {
				var2[var4] = Class2.staticIntArray1[var5];
				var3[var4] = Class2.staticIntArray2[var5];
				++var4;
			}
		}

		Class2.staticIntArray1 = var2;
		Class2.staticIntArray2 = var3;
		staticMethod129(Class2.staticClass2Array1, 0, Class2.staticClass2Array1.length - 1, Class2.staticIntArray1,
				Class2.staticIntArray2);
	}

	static boolean staticMethod6(int var0) {
		return var0 == 57 || var0 == 58 || var0 == 1007 || var0 == 25 || var0 == 30;
	}

	static void staticMethod7() {
		for (NodeSub4 var0 = (NodeSub4) NodeSub4.staticClass39_4
				.method195(); var0 != null; var0 = (NodeSub4) NodeSub4.staticClass39_4.method193()) {
			if (var0.aNodeSub8Sub2_1 != null) {
				ClientScriptMap.staticNodeSub8Sub1_1.method406(var0.aNodeSub8Sub2_1);
				var0.aNodeSub8Sub2_1 = null;
			}

			if (var0.aNodeSub8Sub2_2 != null) {
				ClientScriptMap.staticNodeSub8Sub1_1.method406(var0.aNodeSub8Sub2_2);
				var0.aNodeSub8Sub2_2 = null;
			}
		}

		NodeSub4.staticClass39_4.method191();
	}

	public static Widget staticMethod8(int var0) {
		int var1 = var0 >> 16;
		int var2 = var0 & 0xffff;
		if (Widget.staticWidgetArrayArray1[var1] == null || Widget.staticWidgetArrayArray1[var1][var2] == null) {
			boolean var3 = staticMethod4(var1);
			if (!var3) {
				return null;
			}
		}

		return Widget.staticWidgetArrayArray1[var1][var2];
	}

	public static void staticMethod9(Js5Index var0, Js5Index var1) {
		IdentityKit.staticJs5Index12 = var0;
		IdentityKit.staticJs5Index13 = var1;
		Class1.staticInt1 = IdentityKit.staticJs5Index12.method263(3);
	}

	static final int staticMethod10(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = var1 * (var0 & 0x7f) / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1 + (var0 & 0xff80);
		}
	}

	static boolean staticMethod65(Js5Index var0, int var1, int var2) {
		byte[] var3 = var0.getFile(var1, var2);
		if (var3 == null) {
			return false;
		} else {
			staticMethod385(var3);
			return true;
		}
	}

	static final void staticMethod66(int var0, int var1, int var2, int var3, String var4, String var5, int var6,
			int var7) {
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 31) {
			Client.outBuffer.method471(233);
			Client.outBuffer.method359(var1);
			Client.outBuffer.method369(staticInt102);
			Client.outBuffer.method351(staticInt126);
			Client.outBuffer.method360(GameObject.staticInt332);
			Client.outBuffer.method352(var0);
			Client.outBuffer.method351(var3);
			Client.staticInt241 = 0;
			Tile.staticWidget11 = staticMethod8(var1);
			Client.staticInt228 = var0;
		}

		Player var8;
		if (var2 == 14) {
			var8 = Client.staticPlayerArray1[var3];
			if (var8 != null) {
				Client.staticInt238 = var6;
				Client.staticInt237 = var7;
				Client.staticInt239 = 2;
				Client.staticInt297 = 0;
				Client.staticInt296 = var0;
				Client.staticInt240 = var1;
				Client.outBuffer.method471(146);
				Client.outBuffer.writeByte(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
				Client.outBuffer.writeShort(staticInt126);
				Client.outBuffer.method352(staticInt102);
				Client.outBuffer.writeShort(var3);
				Client.outBuffer.method360(GameObject.staticInt332);
			}
		}

		Npc var16;
		if (var2 == 12) {
			var16 = Client.staticNpcArray1[var3];
			if (var16 != null) {
				Client.staticInt238 = var6;
				Client.staticInt237 = var7;
				Client.staticInt239 = 2;
				Client.staticInt297 = 0;
				Client.staticInt296 = var0;
				Client.staticInt240 = var1;
				Client.outBuffer.method471(199);
				Client.outBuffer.method345(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
				Client.outBuffer.method352(var3);
			}
		}

		if (var2 == 11) {
			var16 = Client.staticNpcArray1[var3];
			if (var16 != null) {
				Client.staticInt238 = var6;
				Client.staticInt237 = var7;
				Client.staticInt239 = 2;
				Client.staticInt297 = 0;
				Client.staticInt296 = var0;
				Client.staticInt240 = var1;
				Client.outBuffer.method471(45);
				Client.outBuffer.method345(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
				Client.outBuffer.method352(var3);
			}
		}

		Widget var17;
		if (var2 == 24) {
			var17 = staticMethod8(var1);
			boolean var19 = true;
			if (var17.anInt298 > 0) {
				var19 = staticMethod282(var17);
			}

			if (var19) {
				Client.outBuffer.method471(62);
				Client.outBuffer.writeInt(var1);
			}
		}

		if (var2 == 30 && Client.staticWidget6 == null) {
			Client.outBuffer.method471(171);
			Client.outBuffer.method351(var0);
			Client.outBuffer.writeInt(var1);
			Client.staticWidget6 = staticMethod32(var1, var0);
			staticMethod73(Client.staticWidget6);
		}

		if (var2 == 48) {
			var8 = Client.staticPlayerArray1[var3];
			if (var8 != null) {
				Client.staticInt238 = var6;
				Client.staticInt237 = var7;
				Client.staticInt239 = 2;
				Client.staticInt297 = 0;
				Client.staticInt296 = var0;
				Client.staticInt240 = var1;
				Client.outBuffer.method471(99);
				Client.outBuffer.writeShort(var3);
				Client.outBuffer.method345(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
			}
		}

		if (var2 == 1002) {
			Client.staticInt238 = var6;
			Client.staticInt237 = var7;
			Client.staticInt239 = 2;
			Client.staticInt297 = 0;
			Client.outBuffer.method471(88);
			Client.outBuffer.method369(var3 >> 14 & 0x7fff);
		}

		if (var2 == 39) {
			Client.outBuffer.method471(29);
			Client.outBuffer.method369(var0);
			Client.outBuffer.method369(var3);
			Client.outBuffer.method360(var1);
			Client.staticInt241 = 0;
			Tile.staticWidget11 = staticMethod8(var1);
			Client.staticInt228 = var0;
		}

		int var191;
		if (var2 == 29) {
			Client.outBuffer.method471(62);
			Client.outBuffer.writeInt(var1);
			var17 = staticMethod8(var1);
			if (var17.anIntArrayArray12 != null && var17.anIntArrayArray12[0][0] == 5) {
				var191 = var17.anIntArrayArray12[0][1];
				if (var17.anIntArray70[0] != staticIntArray64[var191]) {
					staticIntArray64[var191] = var17.anIntArray70[0];
					staticMethod471(var191);
				}
			}
		}

		if (var2 == 15) {
			var8 = Client.staticPlayerArray1[var3];
			if (var8 != null) {
				Client.staticInt238 = var6;
				Client.staticInt237 = var7;
				Client.staticInt239 = 2;
				Client.staticInt297 = 0;
				Client.staticInt296 = var0;
				Client.staticInt240 = var1;
				Client.outBuffer.method471(30);
				Client.outBuffer.writeShort(Client.staticInt260);
				Client.outBuffer.method369(var3);
				Client.outBuffer.method359(Class3.staticInt19);
				Client.outBuffer.writeByte(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
			}
		}

		if (var2 == 23) {
			if (Client.staticBool30) {
				Friend.staticScene1.method122();
			} else {
				Friend.staticScene1.method121(NodeSub4.staticInt155, var0, var1, true);
			}
		}

		if (var2 == 49) {
			var8 = Client.staticPlayerArray1[var3];
			if (var8 != null) {
				Client.staticInt238 = var6;
				Client.staticInt237 = var7;
				Client.staticInt239 = 2;
				Client.staticInt297 = 0;
				Client.staticInt296 = var0;
				Client.staticInt240 = var1;
				Client.outBuffer.method471(240);
				Client.outBuffer.method343(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
				Client.outBuffer.method351(var3);
			}
		}

		if (var2 == 36) {
			Client.outBuffer.method471(249);
			Client.outBuffer.method369(var0);
			Client.outBuffer.method369(var3);
			Client.outBuffer.method361(var1);
			Client.staticInt241 = 0;
			Tile.staticWidget11 = staticMethod8(var1);
			Client.staticInt228 = var0;
		}

		if (var2 == 8) {
			var16 = Client.staticNpcArray1[var3];
			if (var16 != null) {
				Client.staticInt238 = var6;
				Client.staticInt237 = var7;
				Client.staticInt239 = 2;
				Client.staticInt297 = 0;
				Client.staticInt296 = var0;
				Client.staticInt240 = var1;
				Client.outBuffer.method471(241);
				Client.outBuffer.method369(Client.staticInt260);
				Client.outBuffer.writeShort(var3);
				Client.outBuffer.method373(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
				Client.outBuffer.method359(Class3.staticInt19);
			}
		}

		if (var2 == 32) {
			Client.outBuffer.method471(19);
			Client.outBuffer.method359(Class3.staticInt19);
			Client.outBuffer.method369(var3);
			Client.outBuffer.method369(Client.staticInt260);
			Client.outBuffer.method359(var1);
			Client.outBuffer.method352(var0);
			Client.staticInt241 = 0;
			Tile.staticWidget11 = staticMethod8(var1);
			Client.staticInt228 = var0;
		}

		if (var2 == 1003) {
			Client.staticInt238 = var6;
			Client.staticInt237 = var7;
			Client.staticInt239 = 2;
			Client.staticInt297 = 0;
			var16 = Client.staticNpcArray1[var3];
			if (var16 != null) {
				NpcDefinition var22 = var16.aNpcDef1;
				if (var22.anIntArray116 != null) {
					var22 = var22.method544();
				}

				if (var22 != null) {
					Client.outBuffer.method471(229);
					Client.outBuffer.method352(var22.anInt537);
				}
			}
		}

		if (var2 == 16) {
			Client.staticInt238 = var6;
			Client.staticInt237 = var7;
			Client.staticInt239 = 2;
			Client.staticInt297 = 0;
			Client.staticInt296 = var0;
			Client.staticInt240 = var1;
			Client.outBuffer.method471(159);
			Client.outBuffer.method369(staticInt102);
			Client.outBuffer.writeByte(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
			Client.outBuffer.method369(Class34.staticInt75 + var1);
			Client.outBuffer.method360(GameObject.staticInt332);
			Client.outBuffer.writeShort(var0 + NodeSub3.staticInt154);
			Client.outBuffer.writeShort(staticInt126);
			Client.outBuffer.method351(var3);
		}

		if (var2 == 58) {
			var17 = staticMethod32(var1, var0);
			if (var17 != null) {
				Client.outBuffer.method471(91);
				Client.outBuffer.method351(Client.staticInt227);
				Client.outBuffer.method359(Class3.staticInt19);
				Client.outBuffer.method369(Client.staticInt260);
				Client.outBuffer.method351(var0);
				Client.outBuffer.method360(var1);
				Client.outBuffer.method352(var17.anInt352);
			}
		}

		if (var2 == 22) {
			Client.staticInt238 = var6;
			Client.staticInt237 = var7;
			Client.staticInt239 = 2;
			Client.staticInt297 = 0;
			Client.staticInt296 = var0;
			Client.staticInt240 = var1;
			Client.outBuffer.method471(238);
			Client.outBuffer.method352(var3);
			Client.outBuffer.method352(NodeSub3.staticInt154 + var0);
			Client.outBuffer.method345(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
			Client.outBuffer.method351(var1 + Class34.staticInt75);
		}

		if (var2 == 20) {
			Client.staticInt238 = var6;
			Client.staticInt237 = var7;
			Client.staticInt239 = 2;
			Client.staticInt297 = 0;
			Client.staticInt296 = var0;
			Client.staticInt240 = var1;
			Client.outBuffer.method471(27);
			Client.outBuffer.method351(var3);
			Client.outBuffer.method352(Class34.staticInt75 + var1);
			Client.outBuffer.method352(var0 + NodeSub3.staticInt154);
			Client.outBuffer.writeByte(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
		}

		if (var2 == 37) {
			Client.outBuffer.method471(251);
			Client.outBuffer.writeInt(var1);
			Client.outBuffer.method369(var0);
			Client.outBuffer.method351(var3);
			Client.staticInt241 = 0;
			Tile.staticWidget11 = staticMethod8(var1);
			Client.staticInt228 = var0;
		}

		if (var2 == 2) {
			Client.staticInt238 = var6;
			Client.staticInt237 = var7;
			Client.staticInt239 = 2;
			Client.staticInt297 = 0;
			Client.staticInt296 = var0;
			Client.staticInt240 = var1;
			Client.outBuffer.method471(54);
			Client.outBuffer.method352(var0 + NodeSub3.staticInt154);
			Client.outBuffer.method343(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
			Client.outBuffer.method352(var3 >> 14 & 0x7fff);
			Client.outBuffer.method359(Class3.staticInt19);
			Client.outBuffer.method352(Client.staticInt260);
			Client.outBuffer.method352(Class34.staticInt75 + var1);
		}

		if (var2 == 21) {
			Client.staticInt238 = var6;
			Client.staticInt237 = var7;
			Client.staticInt239 = 2;
			Client.staticInt297 = 0;
			Client.staticInt296 = var0;
			Client.staticInt240 = var1;
			Client.outBuffer.method471(28);
			Client.outBuffer.method345(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
			Client.outBuffer.method352(var3);
			Client.outBuffer.method369(var1 + Class34.staticInt75);
			Client.outBuffer.method369(NodeSub3.staticInt154 + var0);
		}

		if (var2 == 25) {
			var17 = staticMethod32(var1, var0);
			if (var17 != null) {
				if (Client.staticBool32) {
					Widget var221 = staticMethod32(Class3.staticInt19, Client.staticInt260);
					if (var221 != null && var221.anObjectArray12 != null) {
						NodeSub16 var15 = new NodeSub16();
						var15.aWidget1 = var221;
						var15.anObjectArray2 = var221.anObjectArray12;
						staticMethod375(var15);
					}

					Client.staticBool32 = false;
					staticMethod73(var221);
				}

				int var222 = staticMethod192(var17);
				var191 = var222 >> 11 & 0x3f;
				int var151 = var17.anInt352;
				Widget var11 = staticMethod32(var1, var0);
				if (var11 != null && var11.anObjectArray11 != null) {
					NodeSub16 var14 = new NodeSub16();
					var14.aWidget1 = var11;
					var14.anObjectArray2 = var11.anObjectArray11;
					staticMethod375(var14);
				}

				Client.staticInt227 = var151;
				Client.staticBool32 = true;
				Class3.staticInt19 = var1;
				Client.staticInt260 = var0;
				Class57.staticInt144 = var191;
				staticMethod73(var11);
				Client.staticInt258 = 0;
				int var141 = staticMethod192(var17);
				int var24 = var141 >> 11 & 0x3f;
				String var21;
				if (var24 == 0) {
					var21 = null;
				} else if (var17.aString22 != null && var17.aString22.trim().length() != 0) {
					var21 = var17.aString22;
				} else {
					var21 = null;
				}

				Client.staticString31 = var21;
				if (Client.staticString31 == null) {
					Client.staticString31 = "Null";
				}

				if (var17.aBool42) {
					Client.staticString30 = var17.aString21 + staticMethod118(16777215);
				} else {
					Client.staticString30 = staticMethod118('\uff00') + var17.aString23 + staticMethod118(16777215);
				}
			}
		} else {
			if (var2 == 35) {
				Client.outBuffer.method471(94);
				Client.outBuffer.method351(var3);
				Client.outBuffer.method352(var0);
				Client.outBuffer.writeInt(var1);
				Client.staticInt241 = 0;
				Tile.staticWidget11 = staticMethod8(var1);
				Client.staticInt228 = var0;
			}

			if (var2 == 10) {
				var16 = Client.staticNpcArray1[var3];
				if (var16 != null) {
					Client.staticInt238 = var6;
					Client.staticInt237 = var7;
					Client.staticInt239 = 2;
					Client.staticInt297 = 0;
					Client.staticInt296 = var0;
					Client.staticInt240 = var1;
					Client.outBuffer.method471(100);
					Client.outBuffer.writeShort(var3);
					Client.outBuffer.method373(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
				}
			}

			if (var2 == 51) {
				var8 = Client.staticPlayerArray1[var3];
				if (var8 != null) {
					Client.staticInt238 = var6;
					Client.staticInt237 = var7;
					Client.staticInt239 = 2;
					Client.staticInt297 = 0;
					Client.staticInt296 = var0;
					Client.staticInt240 = var1;
					Client.outBuffer.method471(131);
					Client.outBuffer.method352(var3);
					Client.outBuffer.method373(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
				}
			}

			if (var2 == 1001) {
				Client.staticInt238 = var6;
				Client.staticInt237 = var7;
				Client.staticInt239 = 2;
				Client.staticInt297 = 0;
				Client.staticInt296 = var0;
				Client.staticInt240 = var1;
				Client.outBuffer.method471(130);
				Client.outBuffer.method369(var0 + NodeSub3.staticInt154);
				Client.outBuffer.method345(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
				Client.outBuffer.method352(Class34.staticInt75 + var1);
				Client.outBuffer.method352(var3 >> 14 & 0x7fff);
			}

			if (var2 == 46) {
				var8 = Client.staticPlayerArray1[var3];
				if (var8 != null) {
					Client.staticInt238 = var6;
					Client.staticInt237 = var7;
					Client.staticInt239 = 2;
					Client.staticInt297 = 0;
					Client.staticInt296 = var0;
					Client.staticInt240 = var1;
					Client.outBuffer.method471(216);
					Client.outBuffer.method351(var3);
					Client.outBuffer.writeByte(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
				}
			}

			if (var2 == 57 || var2 == 1007) {
				var17 = staticMethod32(var1, var0);
				if (var17 != null) {
					staticMethod346(var3, var1, var0, var17.anInt352, var5);
				}
			}

			if (var2 == 42) {
				Client.outBuffer.method471(58);
				Client.outBuffer.method369(var3);
				Client.outBuffer.method361(var1);
				Client.outBuffer.method351(var0);
				Client.staticInt241 = 0;
				Tile.staticWidget11 = staticMethod8(var1);
				Client.staticInt228 = var0;
			}

			if (var2 == 33) {
				Client.outBuffer.method471(132);
				Client.outBuffer.writeShort(var3);
				Client.outBuffer.method352(var0);
				Client.outBuffer.method360(var1);
				Client.staticInt241 = 0;
				Tile.staticWidget11 = staticMethod8(var1);
				Client.staticInt228 = var0;
			}

			if (var2 == 44) {
				var8 = Client.staticPlayerArray1[var3];
				if (var8 != null) {
					Client.staticInt238 = var6;
					Client.staticInt237 = var7;
					Client.staticInt239 = 2;
					Client.staticInt297 = 0;
					Client.staticInt296 = var0;
					Client.staticInt240 = var1;
					Client.outBuffer.method471(197);
					Client.outBuffer.method351(var3);
					Client.outBuffer.method343(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
				}
			}

			if (var2 == 17) {
				Client.staticInt238 = var6;
				Client.staticInt237 = var7;
				Client.staticInt239 = 2;
				Client.staticInt297 = 0;
				Client.staticInt296 = var0;
				Client.staticInt240 = var1;
				Client.outBuffer.method471(67);
				Client.outBuffer.method369(Client.staticInt260);
				Client.outBuffer.method345(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
				Client.outBuffer.writeShort(var0 + NodeSub3.staticInt154);
				Client.outBuffer.method351(var3);
				Client.outBuffer.writeShort(var1 + Class34.staticInt75);
				Client.outBuffer.method360(Class3.staticInt19);
			}

			if (var2 == 41) {
				Client.outBuffer.method471(161);
				Client.outBuffer.method359(var1);
				Client.outBuffer.method351(var3);
				Client.outBuffer.method351(var0);
				Client.staticInt241 = 0;
				Tile.staticWidget11 = staticMethod8(var1);
				Client.staticInt228 = var0;
			}

			if (var2 == 1005) {
				var17 = staticMethod8(var1);
				if (var17 != null && var17.anIntArray77[var0] >= 100000) {
					staticMethod36(27, "", var17.anIntArray77[var0] + " x " + staticMethod153(var3).aString31);
				} else {
					Client.outBuffer.method471(59);
					Client.outBuffer.method351(var3);
				}

				Client.staticInt241 = 0;
				Tile.staticWidget11 = staticMethod8(var1);
				Client.staticInt228 = var0;
			}

			if (var2 == 47) {
				var8 = Client.staticPlayerArray1[var3];
				if (var8 != null) {
					Client.staticInt238 = var6;
					Client.staticInt237 = var7;
					Client.staticInt239 = 2;
					Client.staticInt297 = 0;
					Client.staticInt296 = var0;
					Client.staticInt240 = var1;
					Client.outBuffer.method471(98);
					Client.outBuffer.method343(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
					Client.outBuffer.method369(var3);
				}
			}

			if (var2 == 40) {
				Client.outBuffer.method471(167);
				Client.outBuffer.method369(var3);
				Client.outBuffer.writeInt(var1);
				Client.outBuffer.method352(var0);
				Client.staticInt241 = 0;
				Tile.staticWidget11 = staticMethod8(var1);
				Client.staticInt228 = var0;
			}

			if (var2 == 3) {
				Client.staticInt238 = var6;
				Client.staticInt237 = var7;
				Client.staticInt239 = 2;
				Client.staticInt297 = 0;
				Client.staticInt296 = var0;
				Client.staticInt240 = var1;
				Client.outBuffer.method471(221);
				Client.outBuffer.method352(NodeSub3.staticInt154 + var0);
				Client.outBuffer.method351(var1 + Class34.staticInt75);
				Client.outBuffer.method345(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
				Client.outBuffer.method352(var3 >> 14 & 0x7fff);
			}

			if (var2 == 9) {
				var16 = Client.staticNpcArray1[var3];
				if (var16 != null) {
					Client.staticInt238 = var6;
					Client.staticInt237 = var7;
					Client.staticInt239 = 2;
					Client.staticInt297 = 0;
					Client.staticInt296 = var0;
					Client.staticInt240 = var1;
					Client.outBuffer.method471(39);
					Client.outBuffer.method351(var3);
					Client.outBuffer.method345(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
				}
			}

			if (var2 == 38) {
				staticMethod208();
				var17 = staticMethod8(var1);
				Client.staticInt258 = 1;
				staticInt102 = var0;
				GameObject.staticInt332 = var1;
				staticInt126 = var3;
				staticMethod73(var17);
				Client.staticString32 = staticMethod118(16748608) + staticMethod153(var3).aString31
						+ staticMethod118(16777215);
				if (Client.staticString32 == null) {
					Client.staticString32 = "null";
				}
			} else {
				if (var2 == 1) {
					Client.staticInt238 = var6;
					Client.staticInt237 = var7;
					Client.staticInt239 = 2;
					Client.staticInt297 = 0;
					Client.staticInt296 = var0;
					Client.staticInt240 = var1;
					Client.outBuffer.method471(82);
					Client.outBuffer.method351(Class34.staticInt75 + var1);
					Client.outBuffer.method361(GameObject.staticInt332);
					Client.outBuffer.method373(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
					Client.outBuffer.method352(NodeSub3.staticInt154 + var0);
					Client.outBuffer.method369(staticInt102);
					Client.outBuffer.writeShort(staticInt126);
					Client.outBuffer.method351(var3 >> 14 & 0x7fff);
				}

				if (var2 == 50) {
					var8 = Client.staticPlayerArray1[var3];
					if (var8 != null) {
						Client.staticInt238 = var6;
						Client.staticInt237 = var7;
						Client.staticInt239 = 2;
						Client.staticInt297 = 0;
						Client.staticInt296 = var0;
						Client.staticInt240 = var1;
						Client.outBuffer.method471(101);
						Client.outBuffer.method351(var3);
						Client.outBuffer.writeByte(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
					}
				}

				if (var2 == 34) {
					Client.outBuffer.method471(207);
					Client.outBuffer.writeInt(var1);
					Client.outBuffer.method369(var3);
					Client.outBuffer.writeShort(var0);
					Client.staticInt241 = 0;
					Tile.staticWidget11 = staticMethod8(var1);
					Client.staticInt228 = var0;
				}

				if (var2 == 6) {
					Client.staticInt238 = var6;
					Client.staticInt237 = var7;
					Client.staticInt239 = 2;
					Client.staticInt297 = 0;
					Client.staticInt296 = var0;
					Client.staticInt240 = var1;
					Client.outBuffer.method471(219);
					Client.outBuffer.writeShort(var0 + NodeSub3.staticInt154);
					Client.outBuffer.method351(var1 + Class34.staticInt75);
					Client.outBuffer.method373(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
					Client.outBuffer.writeShort(var3 >> 14 & 0x7fff);
				}

				if (var2 == 26) {
					staticMethod120();
				}

				if (var2 == 5) {
					Client.staticInt238 = var6;
					Client.staticInt237 = var7;
					Client.staticInt239 = 2;
					Client.staticInt297 = 0;
					Client.staticInt296 = var0;
					Client.staticInt240 = var1;
					Client.outBuffer.method471(119);
					Client.outBuffer.method369(NodeSub3.staticInt154 + var0);
					Client.outBuffer.method369(var1 + Class34.staticInt75);
					Client.outBuffer.method373(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
					Client.outBuffer.writeShort(var3 >> 14 & 0x7fff);
				}

				if (var2 == 4) {
					Client.staticInt238 = var6;
					Client.staticInt237 = var7;
					Client.staticInt239 = 2;
					Client.staticInt297 = 0;
					Client.staticInt296 = var0;
					Client.staticInt240 = var1;
					Client.outBuffer.method471(26);
					Client.outBuffer.writeShort(Class34.staticInt75 + var1);
					Client.outBuffer.method352(var3 >> 14 & 0x7fff);
					Client.outBuffer.method345(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
					Client.outBuffer.writeShort(var0 + NodeSub3.staticInt154);
				}

				if (var2 == 19) {
					Client.staticInt238 = var6;
					Client.staticInt237 = var7;
					Client.staticInt239 = 2;
					Client.staticInt297 = 0;
					Client.staticInt296 = var0;
					Client.staticInt240 = var1;
					Client.outBuffer.method471(93);
					Client.outBuffer.writeShort(NodeSub3.staticInt154 + var0);
					Client.outBuffer.method343(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
					Client.outBuffer.method352(var3);
					Client.outBuffer.writeShort(var1 + Class34.staticInt75);
				}

				if (var2 == 43) {
					Client.outBuffer.method471(153);
					Client.outBuffer.writeShort(var0);
					Client.outBuffer.method369(var3);
					Client.outBuffer.writeInt(var1);
					Client.staticInt241 = 0;
					Tile.staticWidget11 = staticMethod8(var1);
					Client.staticInt228 = var0;
				}

				if (var2 == 1004) {
					Client.staticInt238 = var6;
					Client.staticInt237 = var7;
					Client.staticInt239 = 2;
					Client.staticInt297 = 0;
					Client.outBuffer.method471(59);
					Client.outBuffer.method351(var3);
				}

				if (var2 == 28) {
					Client.outBuffer.method471(62);
					Client.outBuffer.writeInt(var1);
					var17 = staticMethod8(var1);
					if (var17.anIntArrayArray12 != null && var17.anIntArrayArray12[0][0] == 5) {
						var191 = var17.anIntArrayArray12[0][1];
						staticIntArray64[var191] = 1 - staticIntArray64[var191];
						staticMethod471(var191);
					}
				}

				if (var2 == 7) {
					var16 = Client.staticNpcArray1[var3];
					if (var16 != null) {
						Client.staticInt238 = var6;
						Client.staticInt237 = var7;
						Client.staticInt239 = 2;
						Client.staticInt297 = 0;
						Client.staticInt296 = var0;
						Client.staticInt240 = var1;
						Client.outBuffer.method471(222);
						Client.outBuffer.method369(staticInt126);
						Client.outBuffer.method361(GameObject.staticInt332);
						Client.outBuffer.method351(staticInt102);
						Client.outBuffer.writeShort(var3);
						Client.outBuffer.method345(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
					}
				}

				if (var2 == 18) {
					Client.staticInt238 = var6;
					Client.staticInt237 = var7;
					Client.staticInt239 = 2;
					Client.staticInt297 = 0;
					Client.staticInt296 = var0;
					Client.staticInt240 = var1;
					Client.outBuffer.method471(254);
					Client.outBuffer.writeByte(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
					Client.outBuffer.method351(var1 + Class34.staticInt75);
					Client.outBuffer.method351(NodeSub3.staticInt154 + var0);
					Client.outBuffer.method351(var3);
				}

				if (var2 == 45) {
					var8 = Client.staticPlayerArray1[var3];
					if (var8 != null) {
						Client.staticInt238 = var6;
						Client.staticInt237 = var7;
						Client.staticInt239 = 2;
						Client.staticInt297 = 0;
						Client.staticInt296 = var0;
						Client.staticInt240 = var1;
						Client.outBuffer.method471(160);
						Client.outBuffer.method369(var3);
						Client.outBuffer.writeByte(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
					}
				}

				if (var2 == 13) {
					var16 = Client.staticNpcArray1[var3];
					if (var16 != null) {
						Client.staticInt238 = var6;
						Client.staticInt237 = var7;
						Client.staticInt239 = 2;
						Client.staticInt297 = 0;
						Client.staticInt296 = var0;
						Client.staticInt240 = var1;
						Client.outBuffer.method471(110);
						Client.outBuffer.writeShort(var3);
						Client.outBuffer.writeByte(KeyboardHandler.staticBoolArray2[82] ? 1 : 0);
					}
				}

				if (Client.staticInt258 != 0) {
					Client.staticInt258 = 0;
					staticMethod73(staticMethod8(GameObject.staticInt332));
				}

				if (Client.staticBool32 && Client.staticBool32) {
					var17 = staticMethod32(Class3.staticInt19, Client.staticInt260);
					if (var17 != null && var17.anObjectArray12 != null) {
						NodeSub16 var223 = new NodeSub16();
						var223.aWidget1 = var17;
						var223.anObjectArray2 = var17.anObjectArray12;
						staticMethod375(var223);
					}

					Client.staticBool32 = false;
					staticMethod73(var17);
				}

				if (Tile.staticWidget11 != null && Client.staticInt241 == 0) {
					staticMethod73(Tile.staticWidget11);
				}
			}
		}

	}

	static int staticMethod68(int var0, CacheableSub1 var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = staticIntArray16[--staticInt27];
			var4 = staticMethod8(var3);
		} else {
			var4 = var2 ? Class3.staticWidget1 : staticWidget2;
		}

		if (var0 == 1100) {
			staticInt27 -= 2;
			var4.anInt335 = staticIntArray16[staticInt27];
			if (var4.anInt335 > var4.anInt344 - var4.anInt307) {
				var4.anInt335 = var4.anInt344 - var4.anInt307;
			}

			if (var4.anInt335 < 0) {
				var4.anInt335 = 0;
			}

			var4.anInt312 = staticIntArray16[1 + staticInt27];
			if (var4.anInt312 > var4.anInt361 - var4.anInt351) {
				var4.anInt312 = var4.anInt361 - var4.anInt351;
			}

			if (var4.anInt312 < 0) {
				var4.anInt312 = 0;
			}

			staticMethod73(var4);
			return 1;
		} else if (var0 == 1101) {
			var4.anInt360 = staticIntArray16[--staticInt27];
			staticMethod73(var4);
			return 1;
		} else if (var0 == 1102) {
			var4.aBool33 = staticIntArray16[--staticInt27] == 1;
			staticMethod73(var4);
			return 1;
		} else if (var0 == 1103) {
			var4.anInt317 = staticIntArray16[--staticInt27];
			staticMethod73(var4);
			return 1;
		} else if (var0 == 1104) {
			var4.anInt308 = staticIntArray16[--staticInt27];
			staticMethod73(var4);
			return 1;
		} else if (var0 == 1105) {
			var4.anInt320 = staticIntArray16[--staticInt27];
			staticMethod73(var4);
			return 1;
		} else if (var0 == 1106) {
			var4.anInt350 = staticIntArray16[--staticInt27];
			staticMethod73(var4);
			return 1;
		} else if (var0 == 1107) {
			var4.aBool35 = staticIntArray16[--staticInt27] == 1;
			staticMethod73(var4);
			return 1;
		} else if (var0 == 1108) {
			var4.anInt348 = 1;
			var4.anInt295 = staticIntArray16[--staticInt27];
			staticMethod73(var4);
			return 1;
		} else if (var0 == 1109) {
			staticInt27 -= 6;
			var4.anInt329 = staticIntArray16[staticInt27];
			var4.anInt330 = staticIntArray16[1 + staticInt27];
			var4.anInt325 = staticIntArray16[2 + staticInt27];
			var4.anInt332 = staticIntArray16[3 + staticInt27];
			var4.anInt324 = staticIntArray16[staticInt27 + 4];
			var4.anInt334 = staticIntArray16[staticInt27 + 5];
			staticMethod73(var4);
			return 1;
		} else {
			int var5;
			if (var0 == 1110) {
				var5 = staticIntArray16[--staticInt27];
				if (var5 != var4.anInt327) {
					var4.anInt327 = var5;
					var4.anInt354 = 0;
					var4.anInt314 = 0;
					staticMethod73(var4);
				}

				return 1;
			} else if (var0 == 1111) {
				var4.aBool39 = staticIntArray16[--staticInt27] == 1;
				staticMethod73(var4);
				return 1;
			} else if (var0 == 1112) {
				String var9 = staticStringArray1[--staticInt148];
				if (!var9.equals(var4.aString20)) {
					var4.aString20 = var9;
					staticMethod73(var4);
				}

				return 1;
			} else if (var0 == 1113) {
				var4.anInt347 = staticIntArray16[--staticInt27];
				staticMethod73(var4);
				return 1;
			} else if (var0 == 1114) {
				staticInt27 -= 3;
				var4.anInt339 = staticIntArray16[staticInt27];
				var4.anInt340 = staticIntArray16[1 + staticInt27];
				var4.anInt338 = staticIntArray16[2 + staticInt27];
				staticMethod73(var4);
				return 1;
			} else if (var0 == 1115) {
				var4.aBool40 = staticIntArray16[--staticInt27] == 1;
				staticMethod73(var4);
				return 1;
			} else if (var0 == 1116) {
				var4.anInt322 = staticIntArray16[--staticInt27];
				staticMethod73(var4);
				return 1;
			} else if (var0 == 1117) {
				var4.anInt323 = staticIntArray16[--staticInt27];
				staticMethod73(var4);
				return 1;
			} else if (var0 == 1118) {
				var4.aBool36 = staticIntArray16[--staticInt27] == 1;
				staticMethod73(var4);
				return 1;
			} else if (var0 == 1119) {
				var4.aBool37 = staticIntArray16[--staticInt27] == 1;
				staticMethod73(var4);
				return 1;
			} else if (var0 == 1120) {
				staticInt27 -= 2;
				var4.anInt344 = staticIntArray16[staticInt27];
				var4.anInt361 = staticIntArray16[1 + staticInt27];
				staticMethod73(var4);
				if (var3 != -1 && var4.anInt296 == 0) {
					staticMethod135(Widget.staticWidgetArrayArray1[var3 >> 16], var4, false);
				}

				return 1;
			} else if (var0 == 1121) {
				var5 = var4.anInt294;
				int var8 = var4.anInt319;
				Client.outBuffer.method471(171);
				Client.outBuffer.method351(var8);
				Client.outBuffer.writeInt(var5);
				Client.staticWidget6 = var4;
				staticMethod73(var4);
				return 1;
			} else if (var0 == 1122) {
				var4.anInt349 = staticIntArray16[--staticInt27];
				staticMethod73(var4);
				return 1;
			} else if (var0 == 1123) {
				var4.anInt313 = staticIntArray16[--staticInt27];
				staticMethod73(var4);
				return 1;
			} else if (var0 == 1124) {
				var4.anInt318 = staticIntArray16[--staticInt27];
				staticMethod73(var4);
				return 1;
			} else if (var0 == 1125) {
				var5 = staticIntArray16[--staticInt27];
				Class54[] var6 = new Class54[] { Class54.staticClass54_4, Class54.staticClass54_1,
						Class54.staticClass54_2, Class54.staticClass54_3, Class54.staticClass54_5 };
				Class54 var7 = (Class54) staticMethod233(var6, var5);
				if (var7 != null) {
					var4.aClass54_1 = var7;
					staticMethod73(var4);
				}

				return 1;
			} else {
				return 2;
			}
		}
	}

	static final void staticMethod69(int var0, int var1, int var2, int var3, Sprite var4, CacheableSub3 var5) {
		int var6 = var2 * var2 + var3 * var3;
		if (var6 > 4225 && var6 < 90000) {
			int var11 = Client.staticInt221 + Client.staticInt209 & 0x7ff;
			int var13 = Rasterizer2DSub1.staticIntArray154[var11];
			int var12 = Rasterizer2DSub1.staticIntArray159[var11];
			var13 = var13 * 256 / (Client.staticInt211 + 256);
			var12 = var12 * 256 / (256 + Client.staticInt211);
			int var14 = var12 * var2 + var3 * var13 >> 16;
			int var15 = var3 * var12 - var13 * var2 >> 16;
			double var9 = Math.atan2(var14, var15);
			int var7 = (int) (Math.sin(var9) * 63.0D);
			int var8 = (int) (Math.cos(var9) * 57.0D);
			CacheableSub2.staticSprite4.method643(4 + var7 + 94 + var0 - 10, var1 + 83 - var8 - 20, 20, 20, 15, 15,
					var9, 256);
		} else {
			staticMethod116(var0, var1, var2, var3, var4, var5);
		}

	}

	public static FileOnDisk staticMethod70(String var0, String var1, boolean var2) {
		File var3 = new File(staticFile3, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				FileOnDisk var41 = new FileOnDisk(var3, "rw", 10000L);
				return var41;
			} catch (IOException var10) {
				;
			}
		}

		String var4 = "";
		if (NodeSub16.staticInt314 == 33) {
			var4 = "_rc";
		} else if (NodeSub16.staticInt314 == 34) {
			var4 = "_wip";
		}

		File var5 = new File(Class6.staticString18, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		FileOnDisk var6;
		if (!var2 && var5.exists()) {
			try {
				var6 = new FileOnDisk(var5, "rw", 10000L);
				return var6;
			} catch (IOException var9) {
				;
			}
		}

		try {
			var6 = new FileOnDisk(var3, "rw", 10000L);
			return var6;
		} catch (IOException var8) {
			throw new RuntimeException();
		}
	}

	public static int staticMethod71(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length();
		int var4 = var1;

		for (int var6 = 0; var6 < var3; var6++) {
			char var5 = var2.charAt(var6);
			if (var5 <= 127) {
				var0[var4++] = (byte) var5;
			} else if (var5 <= 2047) {
				var0[var4++] = (byte) (192 | var5 >> 6);
				var0[var4++] = (byte) (128 | var5 & 0x3f);
			} else {
				var0[var4++] = (byte) (224 | var5 >> 12);
				var0[var4++] = (byte) (128 | var5 >> 6 & 0x3f);
				var0[var4++] = (byte) (128 | var5 & 0x3f);
			}
		}

		return var4 - var1;
	}

	static void staticMethod72(Widget var0, int var1, int var2) {
		if (var0.anInt299 == 0) {
			var0.anInt341 = var0.anInt302;
		} else if (var0.anInt299 == 1) {
			var0.anInt341 = (var1 - var0.anInt307) / 2 + var0.anInt302;
		} else if (var0.anInt299 == 2) {
			var0.anInt341 = var1 - var0.anInt307 - var0.anInt302;
		} else if (var0.anInt299 == 3) {
			var0.anInt341 = var1 * var0.anInt302 >> 14;
		} else if (var0.anInt299 == 4) {
			var0.anInt341 = (var0.anInt302 * var1 >> 14) + (var1 - var0.anInt307) / 2;
		} else {
			var0.anInt341 = var1 - var0.anInt307 - (var1 * var0.anInt302 >> 14);
		}

		if (var0.anInt300 == 0) {
			var0.anInt306 = var0.anInt303;
		} else if (var0.anInt300 == 1) {
			var0.anInt306 = (var2 - var0.anInt351) / 2 + var0.anInt303;
		} else if (var0.anInt300 == 2) {
			var0.anInt306 = var2 - var0.anInt351 - var0.anInt303;
		} else if (var0.anInt300 == 3) {
			var0.anInt306 = var2 * var0.anInt303 >> 14;
		} else if (var0.anInt300 == 4) {
			var0.anInt306 = (var2 - var0.anInt351) / 2 + (var2 * var0.anInt303 >> 14);
		} else {
			var0.anInt306 = var2 - var0.anInt351 - (var2 * var0.anInt303 >> 14);
		}

		if (Client.staticBool40 && var0.anInt296 == 0) {
			if (var0.anInt341 < 0) {
				var0.anInt341 = 0;
			} else if (var0.anInt307 + var0.anInt341 > var1) {
				var0.anInt341 = var1 - var0.anInt307;
			}

			if (var0.anInt306 < 0) {
				var0.anInt306 = 0;
			} else if (var0.anInt351 + var0.anInt306 > var2) {
				var0.anInt306 = var2 - var0.anInt351;
			}
		}

	}

	static void staticMethod73(Widget var0) {
		if (Client.staticInt285 == -var0.anInt359) {
			Client.staticBoolArray8[var0.anInt292] = true;
		}

	}

	static final void staticMethod81(Actor var0) {
		int var1 = var0.anInt625 - Client.staticInt166;
		int var3 = var0.anInt626 * 64 + var0.anInt606 * 128;
		int var2 = var0.anInt623 * 128 + var0.anInt626 * 64;
		var0.anInt628 += (var3 - var0.anInt628) / var1;
		var0.anInt591 += (var2 - var0.anInt591) / var1;
		var0.anInt633 = 0;
		var0.anInt630 = var0.anInt627 * -1511981417;
	}

	public static int staticMethod82(int var0) {
		Varbit var1 = staticMethod181(var0);
		int var3 = var1.anInt430;
		int var2 = var1.anInt431;
		int var5 = var1.anInt432;
		int var4 = staticIntArray65[var5 - var2];
		return staticIntArray64[var3] >> var2 & var4;
	}

	public static void staticMethod83() {
		synchronized (KeyboardHandler.staticKeyboardHandler1) {
			++KeyboardHandler.staticInt82;
			KeyboardHandler.staticInt79 = KeyboardHandler.staticInt81;
			KeyboardHandler.staticInt76 = 0;
			int var11;
			if (KeyboardHandler.staticInt78 < 0) {
				for (var11 = 0; var11 < 112; var11++) {
					KeyboardHandler.staticBoolArray2[var11] = false;
				}

				KeyboardHandler.staticInt78 = KeyboardHandler.staticInt77;
			} else {
				while (KeyboardHandler.staticInt78 != KeyboardHandler.staticInt77) {
					var11 = KeyboardHandler.staticIntArray46[KeyboardHandler.staticInt77];
					KeyboardHandler.staticInt77 = 1 + KeyboardHandler.staticInt77 & 0x7f;
					if (var11 < 0) {
						KeyboardHandler.staticBoolArray2[~var11] = false;
					} else {
						if (!KeyboardHandler.staticBoolArray2[var11]
								&& KeyboardHandler.staticInt76 < KeyboardHandler.staticIntArray48.length - 1) {
							KeyboardHandler.staticIntArray48[++KeyboardHandler.staticInt76 - 1] = var11;
						}

						KeyboardHandler.staticBoolArray2[var11] = true;
					}
				}
			}

			if (KeyboardHandler.staticInt76 > 0) {
				KeyboardHandler.staticInt82 = 0;
			}

			KeyboardHandler.staticInt81 = KeyboardHandler.staticInt80;
		}
	}

	public static byte[] staticMethod84(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var21 = (byte[]) var0;
			return var1 ? staticMethod13(var21) : var21;
		} else if (var0 instanceof AbstractClass4) {
			AbstractClass4 var2 = (AbstractClass4) var0;
			return var2.method254();
		} else {
			throw new IllegalArgumentException();
		}
	}

	public static NpcDefinition staticMethod85(int var0) {
		NpcDefinition var1 = (NpcDefinition) NpcDefinition.staticCache28.get(var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NpcDefinition.staticJs5Index28.getFile(9, var0);
			var1 = new NpcDefinition();
			var1.anInt537 = var0;
			if (var2 != null) {
				var1.method540(new ByteBuf(var2));
			}

			var1.method545();
			NpcDefinition.staticCache28.method170(var1, var0);
			return var1;
		}
	}

	static NodeSub14 staticMethod86(Js5Index var0, int var1) {
		byte[] var2 = var0.method260(var1);
		return var2 == null ? null : new NodeSub14(var2);
	}

	static final void staticMethod87() {
		if (Class56.gameConnection != null) {
			Class56.gameConnection.shutdown();
			Class56.gameConnection = null;
		}

		staticMethod160();
		Friend.staticScene1.method138();

		for (int var0 = 0; var0 < 4; var0++) {
			Client.staticClass38Array1[var0].method182();
		}

		System.gc();
		staticMethod108(2);
		Client.staticInt249 = -1;
		Client.staticBool38 = false;
		staticMethod7();
		staticMethod396(10);
	}

	public static void staticMethod88(Js5Index var0, Js5Index var1, Js5Index var2) {
		AnimDef.staticJs5Index33 = var0;
		AnimDef.staticJs5Index32 = var1;
		AnimDef.staticJs5Index31 = var2;
	}

	public static boolean staticMethod89(int var0, int var1) {
		return (var0 >> 1 + var1 & 0x1) != 0;
	}

	static final void staticMethod90() {
		Scene.staticBool6 = false;
		Client.lowMemory = false;
	}

	public static String staticMethod91(CharSequence var0) {
		long var1 = 0L;
		int var6 = var0.length();

		for (int var5 = 0; var5 < var6; var5++) {
			var1 *= 37L;
			char var3 = var0.charAt(var5);
			if (var3 >= 65 && var3 <= 90) {
				var1 += var3 + 1 - 65;
			} else if (var3 >= 97 && var3 <= 122) {
				var1 += 1 + var3 - 97;
			} else if (var3 >= 48 && var3 <= 57) {
				var1 += var3 + 27 - 48;
			}

			if (var1 >= 177917621779460413L) {
				break;
			}
		}

		while (var1 % 37L == 0L && var1 != 0L) {
			var1 /= 37L;
		}

		String var61 = staticMethod182(var1);
		if (var61 == null) {
			var61 = "";
		}

		return var61;
	}

	static final void staticMethod92(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6,
			int var7, int var8) {
		staticMethod416(var2, var3, var4, var5);
		staticMethod449();

		for (int var9 = 0; var9 < var0.length; var9++) {
			Widget var10 = var0[var9];
			if (var10 != null && (var1 == var10.anInt342 || var1 == -1412584499 && var10 == Client.staticWidget7)) {
				int var13;
				if (var8 == -1) {
					Client.staticIntArray82[Client.staticInt162] = var10.anInt341 + var6;
					Client.staticIntArray88[Client.staticInt162] = var7 + var10.anInt306;
					Client.staticIntArray107[Client.staticInt162] = var10.anInt307;
					Client.staticIntArray106[Client.staticInt162] = var10.anInt351;
					var13 = ++Client.staticInt162 - 1;
				} else {
					var13 = var8;
				}

				var10.anInt292 = var13;
				var10.anInt359 = -Client.staticInt166;
				if (!var10.aBool42 || !staticMethod247(var10)) {
					int var24;
					if (var10.anInt298 > 0) {
						var24 = var10.anInt298;
						if (var24 == 324) {
							if (Client.staticInt197 == -1) {
								Client.staticInt197 = var10.anInt320;
								Client.staticInt312 = var10.anInt349 * -1073985099;
							}

							if (Client.staticClass49_1.aBool16) {
								var10.anInt320 = Client.staticInt197;
							} else {
								var10.anInt320 = Client.staticInt312 * 1740315805;
							}
						} else if (var24 == 325) {
							if (Client.staticInt197 == -1) {
								Client.staticInt197 = var10.anInt320;
								Client.staticInt312 = var10.anInt349 * -1073985099;
							}

							if (Client.staticClass49_1.aBool16) {
								var10.anInt320 = Client.staticInt312 * 1740315805;
							} else {
								var10.anInt320 = Client.staticInt197;
							}
						} else if (var24 == 327) {
							var10.anInt325 = 150;
							var10.anInt332 = (int) (Math.sin(Client.staticInt166 / 40.0D) * 256.0D) & 0x7ff;
							var10.anInt348 = 5;
							var10.anInt295 = 0;
						} else if (var24 == 328) {
							var10.anInt325 = 150;
							var10.anInt332 = (int) (Math.sin(Client.staticInt166 / 40.0D) * 256.0D) & 0x7ff;
							var10.anInt348 = 5;
							var10.anInt295 = 1;
						}
					}

					var24 = var6 + var10.anInt341;
					int var18 = var10.anInt306 + var7;
					int var30 = var10.anInt317;
					int var22;
					int var29;
					if (Client.staticWidget7 == var10) {
						if (var1 != -1412584499 && !var10.aBool41) {
							Class11.staticWidgetArray1 = var0;
							staticInt26 = var6;
							staticInt141 = var7;
							continue;
						}

						if (Client.staticBool25 && Client.staticBool35) {
							var29 = MouseHandler.staticInt94;
							var22 = MouseHandler.staticInt88;
							var29 -= Client.staticInt287;
							var22 -= Client.staticInt261;
							if (var29 < Client.staticInt183) {
								var29 = Client.staticInt183;
							}

							if (var10.anInt307 + var29 > Client.staticInt183 + Client.staticWidget8.anInt307) {
								var29 = Client.staticWidget8.anInt307 + Client.staticInt183 - var10.anInt307;
							}

							if (var22 < Client.staticInt313) {
								var22 = Client.staticInt313;
							}

							if (var22 + var10.anInt351 > Client.staticInt313 + Client.staticWidget8.anInt351) {
								var22 = Client.staticInt313 + Client.staticWidget8.anInt351 - var10.anInt351;
							}

							var24 = var29;
							var18 = var22;
						}

						if (!var10.aBool41) {
							var30 = 128;
						}
					}

					int var16;
					int var20;
					int var23;
					int var25;
					int var31;
					int var32;
					if (var10.anInt296 == 2) {
						var29 = var2;
						var22 = var3;
						var31 = var4;
						var32 = var5;
					} else if (var10.anInt296 == 9) {
						var20 = var24;
						var23 = var18;
						var16 = var24 + var10.anInt307;
						var25 = var10.anInt351 + var18;
						if (var16 < var24) {
							var20 = var16;
							var16 = var24;
						}

						if (var25 < var18) {
							var23 = var25;
							var25 = var18;
						}

						++var16;
						++var25;
						var29 = var20 > var2 ? var20 : var2;
						var22 = var23 > var3 ? var23 : var3;
						var31 = var16 < var4 ? var16 : var4;
						var32 = var25 < var5 ? var25 : var5;
					} else {
						var20 = var24 + var10.anInt307;
						var23 = var18 + var10.anInt351;
						var29 = var24 > var2 ? var24 : var2;
						var22 = var18 > var3 ? var18 : var3;
						var31 = var20 < var4 ? var20 : var4;
						var32 = var23 < var5 ? var23 : var5;
					}

					if (!var10.aBool42 || var29 < var31 && var22 < var32) {
						int var11;
						int var19;
						int var26;
						int var28;
						int var33;
						int var34;
						int var35;
						int var36;
						int var39;
						int var41;
						int var42;
						int var46;
						int var51;
						boolean var45;
						boolean var60;
						if (var10.anInt298 != 0) {
							if (var10.anInt298 == 1336) {
								if (Client.staticBool23) {
									var18 += 15;
									Class59.staticRasterizer2DSub2Sub1_2.method618("Fps:" + GameShell.staticInt107,
											var10.anInt307 + var24, var18, 16776960, -1);
									var18 += 15;
									Runtime var511 = Runtime.getRuntime();
									var23 = (int) ((var511.totalMemory() - var511.freeMemory()) / 1024L);
									var16 = 16776960;
									if (var23 > '\u8000' && Client.lowMemory) {
										var16 = 16711680;
									}

									if (var23 > 65536 && !Client.lowMemory) {
										var16 = 16711680;
									}

									Class59.staticRasterizer2DSub2Sub1_2.method618("Mem:" + var23 + "k",
											var24 + var10.anInt307, var18, var16, -1);
									var18 += 15;
								}
								continue;
							}

							int[] var55;
							if (var10.anInt298 == 1337) {
								Client.staticInt256 = var24;
								Client.staticInt259 = var18;
								var16 = var10.anInt307;
								var25 = var10.anInt351;
								++Client.staticInt292;
								staticMethod312(Class59.staticClass59_1);
								var45 = false;
								if (Client.staticInt229 >= 0) {
									var42 = staticInt24;
									var55 = staticIntArray7;

									for (var41 = 0; var41 < var42; var41++) {
										if (Client.staticInt229 == var55[var41]) {
											var45 = true;
											break;
										}
									}
								}

								if (var45) {
									staticMethod312(Class59.staticClass59_3);
								}

								staticMethod35(true);
								staticMethod312(var45 ? Class59.staticClass59_4 : Class59.staticClass59_2);
								staticMethod35(false);
								staticMethod12();
								staticMethod22();
								staticMethod31(var24, var18, var16, var25, true);
								var20 = Client.staticInt304;
								var23 = Client.staticInt254;
								var16 = Client.staticInt305;
								var25 = Client.staticInt306;
								staticMethod416(var20, var23, var20 + var16, var25 + var23);
								staticMethod449();
								if (!Client.staticBool28) {
									var42 = Client.staticInt220;
									if (Client.staticInt277 / 256 > var42) {
										var42 = Client.staticInt277 / 256;
									}

									if (Client.staticBoolArray7[4] && Client.staticIntArray119[4] + 128 > var42) {
										var42 = 128 + Client.staticIntArray119[4];
									}

									var51 = Client.staticInt206 + Client.staticInt221 & 0x7ff;
									var41 = GraphicsBufferSub1.staticInt316;
									var11 = staticMethod240(AbstractClass2Sub1.staticPlayer1.anInt628,
											AbstractClass2Sub1.staticPlayer1.anInt591, NodeSub4.staticInt155)
											- Client.staticInt225;
									var39 = Class4.staticInt21;
									var33 = var42 * 3 + 600;
									var28 = 2048 - var42 & 0x7ff;
									var26 = 2048 - var51 & 0x7ff;
									var34 = 0;
									var19 = 0;
									var35 = var33;
									int var59;
									int var65;
									if (var28 != 0) {
										var36 = Rasterizer2DSub1.staticIntArray154[var28];
										var59 = Rasterizer2DSub1.staticIntArray159[var28];
										var65 = var59 * var19 - var33 * var36 >> 16;
										var35 = var19 * var36 + var33 * var59 >> 16;
										var19 = var65;
									}

									if (var26 != 0) {
										var36 = Rasterizer2DSub1.staticIntArray154[var26];
										var59 = Rasterizer2DSub1.staticIntArray159[var26];
										var65 = var35 * var36 + var34 * var59 >> 16;
										var35 = var35 * var59 - var36 * var34 >> 16;
										var34 = var65;
									}

									Class20.staticInt36 = var41 - var34;
									staticInt125 = var11 - var19;
									NodeSub3.staticInt153 = var39 - var35;
									NodeSub19.staticInt318 = var42;
									staticInt87 = var51;
								}

								if (!Client.staticBool28) {
									var42 = staticMethod234();
								} else {
									if (staticClass6_1.aBool3) {
										var51 = NodeSub4.staticInt155;
									} else {
										var41 = staticMethod240(Class20.staticInt36, NodeSub3.staticInt153,
												NodeSub4.staticInt155);
										if (var41 - staticInt125 < 800
												&& (staticByteArrayArrayArray4[NodeSub4.staticInt155][Class20.staticInt36 >> 7][NodeSub3.staticInt153 >> 7]
														& 0x4) != 0) {
											var51 = NodeSub4.staticInt155;
										} else {
											var51 = 3;
										}
									}

									var42 = var51;
								}

								var51 = Class20.staticInt36;
								var41 = staticInt125;
								var11 = NodeSub3.staticInt153;
								var39 = NodeSub19.staticInt318;
								var33 = staticInt87;

								for (var28 = 0; var28 < 5; var28++) {
									if (Client.staticBoolArray7[var28]) {
										var26 = (int) (Math.random() * (1 + Client.staticIntArray118[var28] * 2)
												- Client.staticIntArray118[var28]
												+ Math.sin(Client.staticIntArray120[var28]
														* (Client.staticIntArray83[var28] / 100.0D))
														* Client.staticIntArray119[var28]);
										if (var28 == 0) {
											Class20.staticInt36 += var26;
										}

										if (var28 == 1) {
											staticInt125 += var26;
										}

										if (var28 == 2) {
											NodeSub3.staticInt153 += var26;
										}

										if (var28 == 3) {
											staticInt87 = var26 + staticInt87 & 0x7ff;
										}

										if (var28 == 4) {
											NodeSub19.staticInt318 += var26;
											if (NodeSub19.staticInt318 < 128) {
												NodeSub19.staticInt318 = 128;
											}

											if (NodeSub19.staticInt318 > 383) {
												NodeSub19.staticInt318 = 383;
											}
										}
									}
								}

								var28 = MouseHandler.staticInt94;
								var26 = MouseHandler.staticInt88;
								if (MouseHandler.staticInt98 != 0) {
									var28 = MouseHandler.staticInt99;
									var26 = MouseHandler.staticInt100;
								}

								if (var28 >= var20 && var28 < var16 + var20 && var26 >= var23
										&& var26 < var25 + var23) {
									Model.staticBool47 = true;
									Model.staticInt339 = 0;
									Model.staticInt337 = var28 - var20;
									Model.staticInt338 = var26 - var23;
								} else {
									Model.staticBool47 = false;
									Model.staticInt339 = 0;
								}

								staticMethod17();
								staticMethod418(var20, var23, var16, var25, 0);
								staticMethod17();
								var34 = Rasterizer2DSub1.staticInt342;
								Rasterizer2DSub1.staticInt342 = Client.staticInt307;
								Friend.staticScene1.method124(Class20.staticInt36, staticInt125,
										NodeSub3.staticInt153, NodeSub19.staticInt318, staticInt87, var42);
								Rasterizer2DSub1.staticInt342 = var34;
								staticMethod17();
								Friend.staticScene1.method104();
								staticMethod143(var20, var23, var16, var25);
								if (Client.staticInt255 == 2) {
									rasterize((Client.staticInt174 - NodeSub3.staticInt154 << 7) + Client.staticInt177,
											Client.staticInt178 + (Client.staticInt175 - Class34.staticInt75 << 7),
											Client.staticInt176 * 2);
									if (Client.staticInt189 > -1 && Client.staticInt166 % 20 < 10) {
										Class59.staticSpriteArray6[0].method637(Client.staticInt189 + var20 - 12,
												Client.staticInt180 + var23 - 28);
									}
								}

								((Class11) Rasterizer2DSub1.staticInterface2_1).method36(Client.staticInt171);
								if (Client.staticInt239 == 1) {
									Client.staticSpriteArray8[Client.staticInt297 / 100].method637(Client.staticInt238 - 8,
											Client.staticInt237 - 8);
								}

								if (Client.staticInt239 == 2) {
									Client.staticSpriteArray8[4 + Client.staticInt297 / 100]
											.method637(Client.staticInt238 - 8, Client.staticInt237 - 8);
								}

								staticMethod433();
								Class20.staticInt36 = var51;
								staticInt125 = var41;
								NodeSub3.staticInt153 = var11;
								NodeSub19.staticInt318 = var39;
								staticInt87 = var33;
								if (Client.staticBool21 && staticMethod213(true, false) == 0) {
									Client.staticBool21 = false;
								}

								if (Client.staticBool21) {
									staticMethod418(var20, var23, var16, var25, 0);
									staticMethod337("Loading - please wait.", false);
								}

								Client.staticBoolArray8[var10.anInt292] = true;
								staticMethod416(var2, var3, var4, var5);
								continue;
							}

							if (var10.anInt298 == 1338) {
								staticMethod17();
								CacheableSub3 var47 = var10.method389(false);
								if (var47 != null) {
									staticMethod416(var24, var18, var47.anInt426 + var24, var18 + var47.anInt427);
									if (Client.staticInt298 != 2 && Client.staticInt298 != 5) {
										var23 = Client.staticInt209 + Client.staticInt221 & 0x7ff;
										var16 = AbstractClass2Sub1.staticPlayer1.anInt628 / 32 + 48;
										var25 = 464 - AbstractClass2Sub1.staticPlayer1.anInt591 / 32;
										Actor.staticSprite5.method642(var24, var18, var47.anInt426, var47.anInt427,
												var16, var25, var23, Client.staticInt211 + 256, var47.anIntArray101,
												var47.anIntArray102);

										for (var46 = 0; var46 < Client.staticInt311; var46++) {
											var42 = 2 + Client.staticIntArray113[var46] * 4
													- AbstractClass2Sub1.staticPlayer1.anInt628 / 32;
											var51 = 2 + Client.staticIntArray103[var46] * 4
													- AbstractClass2Sub1.staticPlayer1.anInt591 / 32;
											staticMethod116(var24, var18, var42, var51, Client.staticSpriteArray9[var46],
													var47);
										}

										var46 = 0;

										while (true) {
											if (var46 >= 104) {
												for (var46 = 0; var46 < Client.staticInt186; var46++) {
													Npc var54 = Client.staticNpcArray1[Client.staticIntArray121[var46]];
													if (var54 != null && var54.method565()) {
														NpcDefinition var57 = var54.aNpcDef1;
														if (var57 != null && var57.anIntArray116 != null) {
															var57 = var57.method544();
														}

														if (var57 != null && var57.aBool67 && var57.aBool69) {
															var41 = var54.anInt628 / 32
																	- AbstractClass2Sub1.staticPlayer1.anInt628 / 32;
															var11 = var54.anInt591 / 32
																	- AbstractClass2Sub1.staticPlayer1.anInt591 / 32;
															staticMethod116(var24, var18, var41, var11,
																	Class16.staticSpriteArray1[1], var47);
														}
													}
												}

												var46 = staticInt24;
												var55 = staticIntArray7;

												Player var631;
												for (var51 = 0; var51 < var46; var51++) {
													var631 = Client.staticPlayerArray1[var55[var51]];
													if (var631 != null && var631.method565() && !var631.aBool81
															&& AbstractClass2Sub1.staticPlayer1 != var631) {
														var11 = var631.anInt628 / 32
																- AbstractClass2Sub1.staticPlayer1.anInt628 / 32;
														var39 = var631.anInt591 / 32
																- AbstractClass2Sub1.staticPlayer1.anInt591 / 32;
														boolean var50 = false;
														if (staticMethod422(var631.aString40, true)) {
															var50 = true;
														}

														boolean var67 = false;

														for (var26 = 0; var26 < staticInt149; var26++) {
															if (var631.aString40.equals(
																	Class43.staticNodeSub1Array1[var26].aString15)) {
																var67 = true;
																break;
															}
														}

														var60 = false;
														if (AbstractClass2Sub1.staticPlayer1.anInt697 != 0
																&& var631.anInt697 != 0
																&& AbstractClass2Sub1.staticPlayer1.anInt697 == var631.anInt697) {
															var60 = true;
														}

														if (var50) {
															staticMethod116(var24, var18, var11, var39,
																	Class16.staticSpriteArray1[3], var47);
														} else if (var60) {
															staticMethod116(var24, var18, var11, var39,
																	Class16.staticSpriteArray1[4], var47);
														} else if (var67) {
															staticMethod116(var24, var18, var11, var39,
																	Class16.staticSpriteArray1[5], var47);
														} else {
															staticMethod116(var24, var18, var11, var39,
																	Class16.staticSpriteArray1[2], var47);
														}
													}
												}

												if (Client.staticInt255 != 0 && Client.staticInt166 % 20 < 10) {
													if (Client.staticInt255 == 1 && Client.staticInt172 >= 0
															&& Client.staticInt172 < Client.staticNpcArray1.length) {
														Npc var64 = Client.staticNpcArray1[Client.staticInt172];
														if (var64 != null) {
															var41 = var64.anInt628 / 32
																	- AbstractClass2Sub1.staticPlayer1.anInt628 / 32;
															var11 = var64.anInt591 / 32
																	- AbstractClass2Sub1.staticPlayer1.anInt591 / 32;
															staticMethod69(var24, var18, var41, var11,
																	staticSpriteArray2[1], var47);
														}
													}

													if (Client.staticInt255 == 2) {
														var51 = Client.staticInt174 * 4 - NodeSub3.staticInt154 * 4 + 2
																- AbstractClass2Sub1.staticPlayer1.anInt628 / 32;
														var41 = Client.staticInt175 * 4 - Class34.staticInt75 * 4 + 2
																- AbstractClass2Sub1.staticPlayer1.anInt591 / 32;
														staticMethod69(var24, var18, var51, var41,
																staticSpriteArray2[1], var47);
													}

													if (Client.staticInt255 == 10 && Client.staticInt193 >= 0
															&& Client.staticInt193 < Client.staticPlayerArray1.length) {
														var631 = Client.staticPlayerArray1[Client.staticInt193];
														if (var631 != null) {
															var41 = var631.anInt628 / 32
																	- AbstractClass2Sub1.staticPlayer1.anInt628 / 32;
															var11 = var631.anInt591 / 32
																	- AbstractClass2Sub1.staticPlayer1.anInt591 / 32;
															staticMethod69(var24, var18, var41, var11,
																	staticSpriteArray2[1], var47);
														}
													}
												}

												if (Client.staticInt296 != 0) {
													var51 = 2 + Client.staticInt296 * 4
															- AbstractClass2Sub1.staticPlayer1.anInt628 / 32;
													var41 = Client.staticInt240 * 4 + 2
															- AbstractClass2Sub1.staticPlayer1.anInt591 / 32;
													staticMethod116(var24, var18, var51, var41,
															staticSpriteArray2[0], var47);
												}

												if (!AbstractClass2Sub1.staticPlayer1.aBool81) {
													staticMethod418(var24 + var47.anInt426 / 2 - 1,
															var47.anInt427 / 2 + var18 - 1, 3, 3, 16777215);
												}
												break;
											}

											for (var42 = 0; var42 < 104; var42++) {
												Class39 var521 = Client.staticClass39ArrayArrayArray1[NodeSub4.staticInt155][var46][var42];
												if (var521 != null) {
													var41 = var46 * 4 + 2
															- AbstractClass2Sub1.staticPlayer1.anInt628 / 32;
													var11 = 2 + var42 * 4
															- AbstractClass2Sub1.staticPlayer1.anInt591 / 32;
													staticMethod116(var24, var18, var41, var11,
															Class16.staticSpriteArray1[0], var47);
												}
											}

											++var46;
										}
									} else {
										staticMethod421(var24, var18, 0, var47.anIntArray101, var47.anIntArray102);
									}

									Client.staticBoolArray6[var13] = true;
								}

								staticMethod416(var2, var3, var4, var5);
								continue;
							}

							if (var10.anInt298 == 1339) {
								staticMethod117(var10, var24, var18, var13);
								staticMethod416(var2, var3, var4, var5);
								continue;
							}
						}

						if (var10.anInt296 == 0) {
							if (!var10.aBool42 && staticMethod247(var10) && Class56.staticWidget4 != var10) {
								continue;
							}

							if (!var10.aBool42) {
								if (var10.anInt312 > var10.anInt361 - var10.anInt351) {
									var10.anInt312 = var10.anInt361 - var10.anInt351;
								}

								if (var10.anInt312 < 0) {
									var10.anInt312 = 0;
								}
							}

							staticMethod92(var0, var10.anInt294, var29, var22, var31, var32, var24 - var10.anInt335,
									var18 - var10.anInt312, var13);
							if (var10.aWidgetArray1 != null) {
								staticMethod92(var10.aWidgetArray1, var10.anInt294, var29, var22, var31, var32,
										var24 - var10.anInt335, var18 - var10.anInt312, var13);
							}

							KeyFocusListener var14 = (KeyFocusListener) Client.staticHashTable5.method149(var10.anInt294);
							if (var14 != null) {
								staticMethod226(var14.anInt384, var29, var22, var31, var32, var24, var18, var13);
							}

							staticMethod416(var2, var3, var4, var5);
							staticMethod449();
						}

						if (Client.resizable || Client.staticBoolArray9[var13] || Client.staticInt286 > 1) {
							if (var10.anInt296 == 0 && !var10.aBool42 && var10.anInt361 > var10.anInt351) {
								staticMethod136(var24 + var10.anInt307, var18, var10.anInt312, var10.anInt351,
										var10.anInt361);
							}

							if (var10.anInt296 != 1) {
								if (var10.anInt296 == 2) {
									var20 = 0;

									for (var23 = 0; var23 < var10.anInt305; var23++) {
										for (var16 = 0; var16 < var10.anInt304; var16++) {
											var25 = (var10.anInt297 + 32) * var16 + var24;
											var46 = (32 + var10.anInt333) * var23 + var18;
											if (var20 < 20) {
												var25 += var10.anIntArray75[var20];
												var46 += var10.anIntArray72[var20];
											}

											if (var10.anIntArray76[var20] <= 0) {
												if (var10.anIntArray68 != null && var20 < 20) {
													Sprite var461 = var10.method384(var20);
													if (var461 != null) {
														var461.method637(var25, var46);
													} else if (Widget.staticBool44) {
														staticMethod73(var10);
													}
												}
											} else {
												var45 = false;
												var41 = var10.anIntArray76[var20] - 1;
												if (32 + var25 > var2 && var25 < var4 && 32 + var46 > var3
														&& var46 < var5
														|| NodeSub3.staticWidget5 == var10
																&& Client.staticInt161 == var20) {
													Sprite var53;
													if (Client.staticInt258 == 1 && var20 == staticInt102
															&& var10.anInt294 == GameObject.staticInt332) {
														var53 = staticMethod140(var41, var10.anIntArray77[var20], 2, 0,
																2, false);
													} else {
														var53 = staticMethod140(var41, var10.anIntArray77[var20], 1,
																3153952, 2, false);
													}

													if (var53 != null) {
														if (var10 == NodeSub3.staticWidget5
																&& var20 == Client.staticInt161) {
															var42 = MouseHandler.staticInt94 - Client.staticInt242;
															var51 = MouseHandler.staticInt88 - Client.staticInt243;
															if (var42 < 5 && var42 > -5) {
																var42 = 0;
															}

															if (var51 < 5 && var51 > -5) {
																var51 = 0;
															}

															if (Client.staticInt244 < 5) {
																var42 = 0;
																var51 = 0;
															}

															var53.method646(var42 + var25, var51 + var46, 128);
															if (var1 != -1) {
																Widget var481 = var0[var1 & 0xffff];
																if (var46 + var51 < Rasterizer2D.staticInt328
																		&& var481.anInt312 > 0) {
																	var33 = Client.staticInt171
																			* (Rasterizer2D.staticInt328 - var46
																					- var51)
																			/ 3;
																	if (var33 > Client.staticInt171 * 10) {
																		var33 = Client.staticInt171 * 10;
																	}

																	if (var33 > var481.anInt312) {
																		var33 = var481.anInt312;
																	}

																	var481.anInt312 -= var33;
																	Client.staticInt243 += var33;
																	staticMethod73(var481);
																}

																if (var46 + var51 + 32 > Rasterizer2D.staticInt325
																		&& var481.anInt312 < var481.anInt361
																				- var481.anInt351) {
																	var33 = (32 + var46 + var51
																			- Rasterizer2D.staticInt325)
																			* Client.staticInt171 / 3;
																	if (var33 > Client.staticInt171 * 10) {
																		var33 = Client.staticInt171 * 10;
																	}

																	if (var33 > var481.anInt361 - var481.anInt351
																			- var481.anInt312) {
																		var33 = var481.anInt361 - var481.anInt351
																				- var481.anInt312;
																	}

																	var481.anInt312 += var33;
																	Client.staticInt243 -= var33;
																	staticMethod73(var481);
																}
															}
														} else if (Tile.staticWidget11 == var10
																&& Client.staticInt228 == var20) {
															var53.method646(var25, var46, 128);
														} else {
															var53.method637(var25, var46);
														}
													} else {
														staticMethod73(var10);
													}
												}
											}

											++var20;
										}
									}
								} else if (var10.anInt296 == 3) {
									if (staticMethod318(var10)) {
										var20 = var10.anInt313;
										if (Class56.staticWidget4 == var10 && var10.anInt315 != 0) {
											var20 = var10.anInt315;
										}
									} else {
										var20 = var10.anInt360;
										if (var10 == Class56.staticWidget4 && var10.anInt321 != 0) {
											var20 = var10.anInt321;
										}
									}

									if (var10.aBool33) {
										switch (var10.aClass54_1.anInt206) {
										case 1:
											staticMethod406(var24, var18, var10.anInt307, var10.anInt351,
													var10.anInt360, var10.anInt313, 256 - (var10.anInt317 & 0xff),
													256 - (var10.anInt318 & 0xff));
											break;
										case 2:
											staticMethod407(var24, var18, var10.anInt307, var10.anInt351,
													var10.anInt360, var10.anInt313, 256 - (var10.anInt317 & 0xff),
													256 - (var10.anInt318 & 0xff));
											break;
										case 3:
											staticMethod408(var24, var18, var10.anInt307, var10.anInt351,
													var10.anInt360, var10.anInt313, 256 - (var10.anInt317 & 0xff),
													256 - (var10.anInt318 & 0xff));
											break;
										case 4:
											staticMethod409(var24, var18, var10.anInt307, var10.anInt351,
													var10.anInt360, var10.anInt313, 256 - (var10.anInt317 & 0xff),
													256 - (var10.anInt318 & 0xff));
											break;
										default:
											if (var30 == 0) {
												staticMethod418(var24, var18, var10.anInt307, var10.anInt351, var20);
											} else {
												staticMethod405(var24, var18, var10.anInt307, var10.anInt351, var20,
														256 - (var30 & 0xff));
											}
										}
									} else if (var30 == 0) {
										staticMethod411(var24, var18, var10.anInt307, var10.anInt351, var20);
									} else {
										staticMethod412(var24, var18, var10.anInt307, var10.anInt351, var20,
												256 - (var30 & 0xff));
									}
								} else {
									String var15;
									String var43;
									Rasterizer2DSub2Sub1 var52;
									String var441;
									if (var10.anInt296 == 4) {
										var52 = var10.method387();
										if (var52 == null) {
											if (Widget.staticBool44) {
												staticMethod73(var10);
											}
										} else {
											String var62 = var10.aString20;
											if (staticMethod318(var10)) {
												var23 = var10.anInt313;
												if (Class56.staticWidget4 == var10 && var10.anInt315 != 0) {
													var23 = var10.anInt315;
												}

												if (var10.aString19.length() > 0) {
													var62 = var10.aString19;
												}
											} else {
												var23 = var10.anInt360;
												if (var10 == Class56.staticWidget4 && var10.anInt321 != 0) {
													var23 = var10.anInt321;
												}
											}

											if (var10.aBool42 && var10.anInt352 != -1) {
												ItemDefinition var61 = staticMethod153(var10.anInt352);
												var62 = var61.aString31;
												if (var62 == null) {
													var62 = "null";
												}

												if ((var61.anInt442 == 1 || var10.anInt353 != 1)
														&& var10.anInt353 != -1) {
													var43 = staticMethod118(16748608) + var62 + staticString16
															+ " " + 'x';
													var51 = var10.anInt353;
													var441 = Integer.toString(var51);

													for (var11 = var441.length() - 3; var11 > 0; var11 -= 3) {
														var441 = var441.substring(0, var11) + staticString11
																+ var441.substring(var11);
													}

													StringBuilder var68;
													if (var441.length() > 9) {
														var68 = new StringBuilder().append(" ")
																.append(staticMethod118('\uff80'))
																.append(var441.substring(0, var441.length() - 8));
														var15 = var68.append("M").append(" ")
																.append(staticString10).append(var441)
																.append(staticString13)
																.append(staticString16).toString();
													} else if (var441.length() > 6) {
														var68 = new StringBuilder().append(" ")
																.append(staticMethod118(16777215))
																.append(var441.substring(0, var441.length() - 4));
														var15 = var68.append("K").append(" ")
																.append(staticString10).append(var441)
																.append(staticString13)
																.append(staticString16).toString();
													} else {
														var15 = " " + staticMethod118(16776960) + var441
																+ staticString16;
													}

													var62 = var43 + var15;
												}
											}

											if (var10 == Client.staticWidget6) {
												var62 = "Please wait...";
												var23 = var10.anInt360;
											}

											if (!var10.aBool42) {
												var62 = staticMethod158(var62, var10);
											}

											var52.method624(var62, var24, var18, var10.anInt307, var10.anInt351, var23,
													var10.aBool40 ? 0 : -1, var10.anInt339, var10.anInt340,
													var10.anInt338);
										}
									} else if (var10.anInt296 == 5) {
										Sprite var56;
										if (!var10.aBool42) {
											var56 = var10.method383(staticMethod318(var10));
											if (var56 != null) {
												var56.method637(var24, var18);
											} else if (Widget.staticBool44) {
												staticMethod73(var10);
											}
										} else {
											if (var10.anInt352 != -1) {
												var56 = staticMethod140(var10.anInt352, var10.anInt353, var10.anInt322,
														var10.anInt323, var10.anInt337, false);
											} else {
												var56 = var10.method383(false);
											}

											if (var56 == null) {
												if (Widget.staticBool44) {
													staticMethod73(var10);
												}
											} else {
												var23 = var56.anInt673;
												var16 = var56.anInt674;
												if (!var10.aBool35) {
													var25 = var10.anInt307 * 4096 / var23;
													if (var10.anInt350 != 0) {
														var56.method644(var10.anInt307 / 2 + var24,
																var18 + var10.anInt351 / 2, var10.anInt350, var25);
													} else if (var30 != 0) {
														var56.method640(var24, var18, var10.anInt307, var10.anInt351,
																256 - (var30 & 0xff));
													} else if (var23 == var10.anInt307 && var10.anInt351 == var16) {
														var56.method637(var24, var18);
													} else {
														var56.method638(var24, var18, var10.anInt307, var10.anInt351);
													}
												} else {
													staticMethod402(var24, var18, var24 + var10.anInt307,
															var10.anInt351 + var18);
													var25 = (var23 - 1 + var10.anInt307) / var23;
													var46 = (var16 - 1 + var10.anInt351) / var16;

													for (var42 = 0; var42 < var25; var42++) {
														for (var51 = 0; var51 < var46; var51++) {
															if (var10.anInt350 != 0) {
																var56.method644(var23 / 2 + var24 + var23 * var42,
																		var16 / 2 + var51 * var16 + var18,
																		var10.anInt350, 4096);
															} else if (var30 != 0) {
																var56.method646(var23 * var42 + var24,
																		var18 + var16 * var51, 256 - (var30 & 0xff));
															} else {
																var56.method637(var23 * var42 + var24,
																		var16 * var51 + var18);
															}
														}
													}

													staticMethod416(var2, var3, var4, var5);
												}
											}
										}
									} else {
										ItemDefinition var17;
										if (var10.anInt296 == 6) {
											var60 = staticMethod318(var10);
											if (var60) {
												var23 = var10.anInt328;
											} else {
												var23 = var10.anInt327;
											}

											Model var66 = null;
											var25 = 0;
											if (var10.anInt352 != -1) {
												var17 = staticMethod153(var10.anInt352);
												if (var17 != null) {
													var17 = var17.method491(var10.anInt353);
													var66 = var17.method494(1);
													if (var66 != null) {
														var66.method592();
														var25 = var66.anInt421 / 2;
													} else {
														staticMethod73(var10);
													}
												}
											} else if (var10.anInt348 == 5) {
												if (var10.anInt295 == 0) {
													var66 = Client.staticClass49_1.method248((AnimDef) null, -1,
															(AnimDef) null, -1);
												} else {
													var66 = AbstractClass2Sub1.staticPlayer1.method434();
												}
											} else if (var23 == -1) {
												var66 = var10.method388((AnimDef) null, -1, var60,
														AbstractClass2Sub1.staticPlayer1.aClass49_1);
												if (var66 == null && Widget.staticBool44) {
													staticMethod73(var10);
												}
											} else {
												AnimDef var48 = staticMethod210(var23);
												var66 = var10.method388(var48, var10.anInt354, var60,
														AbstractClass2Sub1.staticPlayer1.aClass49_1);
												if (var66 == null && Widget.staticBool44) {
													staticMethod73(var10);
												}
											}

											staticMethod440(var24 + var10.anInt307 / 2, var18 + var10.anInt351 / 2);
											var46 = var10.anInt334
													* Rasterizer2DSub1.staticIntArray154[var10.anInt325] >> 16;
											var42 = var10.anInt334
													* Rasterizer2DSub1.staticIntArray159[var10.anInt325] >> 16;
											if (var66 != null) {
												if (!var10.aBool42) {
													var66.method600(0, var10.anInt332, 0, var10.anInt325, 0, var46,
															var42);
												} else {
													var66.method592();
													if (var10.aBool39) {
														var66.method609(0, var10.anInt332, var10.anInt324,
																var10.anInt325, var10.anInt329,
																var25 + var46 + var10.anInt330, var10.anInt330 + var42,
																var10.anInt334);
													} else {
														var66.method600(0, var10.anInt332, var10.anInt324,
																var10.anInt325, var10.anInt329,
																var10.anInt330 + var46 + var25, var42 + var10.anInt330);
													}
												}
											}

											staticMethod439();
										} else {
											String var63;
											if (var10.anInt296 == 7) {
												var52 = var10.method387();
												if (var52 == null) {
													if (Widget.staticBool44) {
														staticMethod73(var10);
													}
													continue;
												}

												var23 = 0;

												for (var16 = 0; var16 < var10.anInt305; var16++) {
													for (var25 = 0; var25 < var10.anInt304; var25++) {
														if (var10.anIntArray76[var23] > 0) {
															var17 = staticMethod153(var10.anIntArray76[var23] - 1);
															if (var17.anInt442 != 1 && var10.anIntArray77[var23] == 1) {
																var15 = staticMethod118(16748608) + var17.aString31
																		+ staticString16;
															} else {
																String var44 = staticMethod118(16748608)
																		+ var17.aString31 + staticString16 + " "
																		+ 'x';
																var11 = var10.anIntArray77[var23];
																var63 = Integer.toString(var11);

																for (var33 = var63.length()
																		- 3; var33 > 0; var33 -= 3) {
																	var63 = var63.substring(0, var33)
																			+ staticString11
																			+ var63.substring(var33);
																}

																if (var63.length() > 9) {
																	var441 = " " + staticMethod118('\uff80')
																			+ var63.substring(0, var63.length() - 8)
																			+ "M" + " " + staticString10 + var63
																			+ staticString13
																			+ staticString16;
																} else if (var63.length() > 6) {
																	var441 = " " + staticMethod118(16777215)
																			+ var63.substring(0, var63.length() - 4)
																			+ "K" + " " + staticString10 + var63
																			+ staticString13
																			+ staticString16;
																} else {
																	var441 = " " + staticMethod118(16776960) + var63
																			+ staticString16;
																}

																var15 = var44 + var441;
															}

															var51 = (var10.anInt297 + 115) * var25 + var24;
															var41 = var18 + (12 + var10.anInt333) * var16;
															if (var10.anInt339 == 0) {
																var52.method616(var15, var51, var41, var10.anInt360,
																		var10.aBool40 ? 0 : -1);
															} else if (var10.anInt339 == 1) {
																var52.method630(var15, var51 + var10.anInt307 / 2,
																		var41, var10.anInt360, var10.aBool40 ? 0 : -1);
															} else {
																var52.method618(var15, var51 + var10.anInt307 - 1,
																		var41, var10.anInt360, var10.aBool40 ? 0 : -1);
															}
														}

														++var23;
													}
												}
											}

											if (var10.anInt296 == 8 && FloorUnderlayDef.staticWidget12 == var10
													&& Client.staticInt257 == Client.staticInt185) {
												var20 = 0;
												var23 = 0;
												Rasterizer2DSub2Sub1 var58 = Class59.staticRasterizer2DSub2Sub1_2;
												var63 = var10.aString20;

												for (var63 = staticMethod158(var63, var10); var63
														.length() > 0; var23 += var58.anInt669 + 1) {
													var42 = var63.indexOf(staticString17);
													if (var42 != -1) {
														var43 = var63.substring(0, var42);
														var63 = var63.substring(var42 + 4);
													} else {
														var43 = var63;
														var63 = "";
													}

													var51 = var58.method613(var43);
													if (var51 > var20) {
														var20 = var51;
													}
												}

												var20 += 6;
												var23 += 7;
												var42 = var10.anInt307 + var24 - 5 - var20;
												var51 = var10.anInt351 + var18 + 5;
												if (var42 < 5 + var24) {
													var42 = var24 + 5;
												}

												if (var20 + var42 > var4) {
													var42 = var4 - var20;
												}

												if (var23 + var51 > var5) {
													var51 = var5 - var23;
												}

												staticMethod418(var42, var51, var20, var23, 16777120);
												staticMethod411(var42, var51, var20, var23, 0);
												var63 = var10.aString20;
												var41 = var51 + var58.anInt669 + 2;

												for (var63 = staticMethod158(var63, var10); var63
														.length() > 0; var41 += var58.anInt669 + 1) {
													var11 = var63.indexOf(staticString17);
													if (var11 != -1) {
														var43 = var63.substring(0, var11);
														var63 = var63.substring(4 + var11);
													} else {
														var43 = var63;
														var63 = "";
													}

													var58.method616(var43, var42 + 3, var41, 0, -1);
												}
											}

											if (var10.anInt296 == 9) {
												if (var10.anInt308 == 1) {
													if (var10.aBool34) {
														var20 = var24;
														var23 = var18 + var10.anInt351;
														var16 = var24 + var10.anInt307;
														var25 = var18;
													} else {
														var20 = var24;
														var23 = var18;
														var16 = var24 + var10.anInt307;
														var25 = var18 + var10.anInt351;
													}

													staticMethod417(var20, var23, var16, var25, var10.anInt360);
												} else {
													var20 = var10.anInt307 >= 0 ? var10.anInt307 : -var10.anInt307;
													var23 = var10.anInt351 >= 0 ? var10.anInt351 : -var10.anInt351;
													var16 = var20;
													if (var20 < var23) {
														var16 = var23;
													}

													if (var16 != 0) {
														var25 = (var10.anInt307 << 16) / var16;
														var46 = (var10.anInt351 << 16) / var16;
														if (var46 <= var25) {
															var25 = -var25;
														} else {
															var46 = -var46;
														}

														var42 = var46 * var10.anInt308 >> 17;
														var51 = 1 + var46 * var10.anInt308 >> 17;
														var41 = var25 * var10.anInt308 >> 17;
														var11 = var10.anInt308 * var25 + 1 >> 17;
														var39 = var24 + var42;
														var33 = var24 - var51;
														var28 = var10.anInt307 + var24 - var51;
														var26 = var42 + var24 + var10.anInt307;
														var34 = var41 + var18;
														var19 = var18 - var11;
														var35 = var18 + var10.anInt351 - var11;
														var36 = var41 + var10.anInt351 + var18;
														staticMethod445(var39, var33, var28);
														staticMethod455(var34, var19, var35, var39, var33, var28,
																var10.anInt360);
														staticMethod445(var39, var28, var26);
														staticMethod455(var34, var35, var36, var39, var28, var26,
																var10.anInt360);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}

	public static Rasterizer2DSub3 staticMethod25(Js5Index var0, String var1, String var2) {
		int var3 = var0.method267(var1);
		int var4 = var0.method268(var3, var2);
		return staticMethod347(var0, var3, var4);
	}

	static final void staticMethod26(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6,
			int var7) {
		for (int var8 = 0; var8 < var0.length; var8++) {
			Widget var9 = var0[var8];
			if (var9 != null
					&& (!var9.aBool42 || var9.anInt296 == 0 || var9.aBool31 || staticMethod192(var9) != 0
							|| var9 == Client.staticWidget8 || var9.anInt298 == 1338)
					&& var1 == var9.anInt342 && (!var9.aBool42 || !staticMethod247(var9))) {
				int var11 = var9.anInt341 + var6;
				int var14 = var7 + var9.anInt306;
				int var10;
				int var13;
				int var17;
				int var18;
				int var20;
				int var21;
				int var22;
				int var16;
				if (var9.anInt296 == 2) {
					var21 = var2;
					var22 = var3;
					var10 = var4;
					var17 = var5;
				} else if (var9.anInt296 == 9) {
					var13 = var11;
					var18 = var14;
					var16 = var9.anInt307 + var11;
					var20 = var14 + var9.anInt351;
					if (var16 < var11) {
						var13 = var16;
						var16 = var11;
					}

					if (var20 < var14) {
						var18 = var20;
						var20 = var14;
					}

					++var16;
					++var20;
					var21 = var13 > var2 ? var13 : var2;
					var22 = var18 > var3 ? var18 : var3;
					var10 = var16 < var4 ? var16 : var4;
					var17 = var20 < var5 ? var20 : var5;
				} else {
					var13 = var9.anInt307 + var11;
					var18 = var9.anInt351 + var14;
					var21 = var11 > var2 ? var11 : var2;
					var22 = var14 > var3 ? var14 : var3;
					var10 = var13 < var4 ? var13 : var4;
					var17 = var18 < var5 ? var18 : var5;
				}

				if (Client.staticWidget7 == var9) {
					Client.staticBool29 = true;
					Client.staticInt272 = var11;
					Client.staticInt290 = var14;
				}

				if (!var9.aBool42 || var21 < var10 && var22 < var17) {
					var13 = MouseHandler.staticInt94;
					var18 = MouseHandler.staticInt88;
					if (MouseHandler.staticInt98 != 0) {
						var13 = MouseHandler.staticInt99;
						var18 = MouseHandler.staticInt100;
					}

					if (var9.anInt298 == 1337) {
						if (!Client.staticBool21 && !Client.staticBool30 && var13 >= var21 && var18 >= var22
								&& var13 < var10 && var18 < var17) {
							staticMethod249(var13, var18, var21, var22);
						}
					} else {
						int var23;
						int var33;
						if (var9.anInt298 == 1338) {
							if ((Client.staticInt298 == 0 || Client.staticInt298 == 3) && (MouseHandler.staticInt98 == 1
									|| !staticBool18 && MouseHandler.staticInt98 == 4)) {
								CacheableSub3 var301 = var9.method389(true);
								if (var301 != null) {
									var20 = MouseHandler.staticInt99 - var11;
									int var331 = MouseHandler.staticInt100 - var14;
									if (var301.method470(var20, var331)) {
										var20 -= var301.anInt426 / 2;
										var331 -= var301.anInt427 / 2;
										var33 = Client.staticInt221 + Client.staticInt209 & 0x7ff;
										var16 = Rasterizer2DSub1.staticIntArray154[var33];
										var23 = Rasterizer2DSub1.staticIntArray159[var33];
										var16 = (256 + Client.staticInt211) * var16 >> 8;
										var23 = (Client.staticInt211 + 256) * var23 >> 8;
										int var32 = var23 * var20 + var16 * var331 >> 11;
										int var34 = var23 * var331 - var20 * var16 >> 11;
										int var361 = var32 + AbstractClass2Sub1.staticPlayer1.anInt628 >> 7;
										int var35 = AbstractClass2Sub1.staticPlayer1.anInt591 - var34 >> 7;
										Client.outBuffer.method471(95);
										Client.outBuffer.writeByte(18);
										Client.outBuffer.method343(KeyboardHandler.staticBoolArray2[82]
												? KeyboardHandler.staticBoolArray2[81] ? 2 : 1 : 0);
										Client.outBuffer.method369(var35 + Class34.staticInt75);
										Client.outBuffer.method369(var361 + NodeSub3.staticInt154);
										Client.outBuffer.writeByte(var20);
										Client.outBuffer.writeByte(var331);
										Client.outBuffer.writeShort(Client.staticInt221);
										Client.outBuffer.writeByte(57);
										Client.outBuffer.writeByte(Client.staticInt209);
										Client.outBuffer.writeByte(Client.staticInt211);
										Client.outBuffer.writeByte(89);
										Client.outBuffer
												.writeShort(AbstractClass2Sub1.staticPlayer1.anInt628);
										Client.outBuffer
												.writeShort(AbstractClass2Sub1.staticPlayer1.anInt591);
										Client.outBuffer.writeByte(63);
										Client.staticInt296 = var361;
										Client.staticInt240 = var35;
									}
								}
							}
						} else {
							if (!Client.staticBool30 && var13 >= var21 && var18 >= var22 && var13 < var10
									&& var18 < var17) {
								staticMethod260(var9, var13 - var11, var18 - var14);
							}

							if (var9.anInt296 == 0) {
								if (!var9.aBool42 && staticMethod247(var9) && var9 != Class56.staticWidget4) {
									continue;
								}

								staticMethod26(var0, var9.anInt294, var21, var22, var10, var17, var11 - var9.anInt335,
										var14 - var9.anInt312);
								if (var9.aWidgetArray1 != null) {
									staticMethod26(var9.aWidgetArray1, var9.anInt294, var21, var22, var10, var17,
											var11 - var9.anInt335, var14 - var9.anInt312);
								}

								KeyFocusListener var29 = (KeyFocusListener) Client.staticHashTable5.method149(var9.anInt294);
								if (var29 != null) {
									if (var29.anInt383 == 0 && MouseHandler.staticInt94 >= var21
											&& MouseHandler.staticInt88 >= var22 && MouseHandler.staticInt94 < var10
											&& MouseHandler.staticInt88 < var17 && !Client.staticBool30
											&& !Client.staticBool40) {
										for (NodeSub16 var30 = (NodeSub16) Client.staticClass39_8
												.method195(); var30 != null; var30 = (NodeSub16) Client.staticClass39_8
														.method193()) {
											if (var30.aBool30) {
												var30.method174();
												var30.aWidget1.aBool44 = false;
											}
										}

										if (Class2.staticInt4 == 0) {
											Client.staticWidget7 = null;
											Client.staticWidget8 = null;
										}

										if (!Client.staticBool30) {
											Client.staticInt252 = 0;
											Client.staticInt217 = -1;
											Client.staticBool30 = false;
											Client.staticStringArray9[0] = "Cancel";
											Client.staticStringArray8[0] = "";
											Client.staticIntArray98[0] = 1006;
											Client.staticInt252 = 1;
										}
									}

									var20 = var29.anInt384;
									if (staticMethod4(var20)) {
										staticMethod26(Widget.staticWidgetArrayArray1[var20], -1, var21, var22, var10,
												var17, var11, var14);
									}
								}
							}

							if (var9.aBool42) {
								NodeSub16 var291;
								if (!var9.aBool43) {
									if (var9.aBool38 && MouseHandler.staticInt94 >= var21
											&& MouseHandler.staticInt88 >= var22 && MouseHandler.staticInt94 < var10
											&& MouseHandler.staticInt88 < var17) {
										for (var291 = (NodeSub16) Client.staticClass39_8
												.method195(); var291 != null; var291 = (NodeSub16) Client.staticClass39_8
														.method193()) {
											if (var291.aBool30
													&& var291.aWidget1.anObjectArray30 == var291.anObjectArray2) {
												var291.method174();
											}
										}
									}
								} else if (MouseHandler.staticInt94 >= var21 && MouseHandler.staticInt88 >= var22
										&& MouseHandler.staticInt94 < var10 && MouseHandler.staticInt88 < var17) {
									for (var291 = (NodeSub16) Client.staticClass39_8
											.method195(); var291 != null; var291 = (NodeSub16) Client.staticClass39_8
													.method193()) {
										if (var291.aBool30) {
											var291.method174();
											var291.aWidget1.aBool44 = false;
										}
									}

									if (Class2.staticInt4 == 0) {
										Client.staticWidget7 = null;
										Client.staticWidget8 = null;
									}

									if (!Client.staticBool30) {
										Client.staticStringArray9[0] = "Cancel";
										Client.staticStringArray8[0] = "";
										Client.staticIntArray98[0] = 1006;
										Client.staticInt252 = 1;
									}
								}

								boolean var311;
								if (MouseHandler.staticInt94 >= var21 && MouseHandler.staticInt88 >= var22
										&& MouseHandler.staticInt94 < var10 && MouseHandler.staticInt88 < var17) {
									var311 = true;
								} else {
									var311 = false;
								}

								boolean var36 = false;
								if ((MouseHandler.staticInt93 == 1
										|| !staticBool18 && MouseHandler.staticInt93 == 4) && var311) {
									var36 = true;
								}

								boolean var19 = false;
								if ((MouseHandler.staticInt98 == 1
										|| !staticBool18 && MouseHandler.staticInt98 == 4)
										&& MouseHandler.staticInt99 >= var21 && MouseHandler.staticInt100 >= var22
										&& MouseHandler.staticInt99 < var10 && MouseHandler.staticInt100 < var17) {
									var19 = true;
								}

								if (var19) {
									staticMethod242(var9, MouseHandler.staticInt99 - var11,
											MouseHandler.staticInt100 - var14);
								}

								if (Client.staticWidget7 != null && Client.staticWidget7 != var9 && var311
										&& staticMethod251(staticMethod192(var9))) {
									Client.staticWidget9 = var9;
								}

								if (var9 == Client.staticWidget8) {
									Client.staticBool35 = true;
									Client.staticInt183 = var11;
									Client.staticInt313 = var14;
								}

								if (var9.aBool31) {
									NodeSub16 var15;
									if (var311 && Client.staticInt284 != 0 && var9.anObjectArray30 != null) {
										var15 = new NodeSub16();
										var15.aBool30 = true;
										var15.aWidget1 = var9;
										var15.anInt285 = Client.staticInt284;
										var15.anObjectArray2 = var9.anObjectArray30;
										Client.staticClass39_8.method198(var15);
									}

									if (Client.staticWidget7 != null || NodeSub3.staticWidget5 != null
											|| Client.staticBool30) {
										var19 = false;
										var36 = false;
										var311 = false;
									}

									if (!var9.aBool45 && var19) {
										var9.aBool45 = true;
										if (var9.anObjectArray5 != null) {
											var15 = new NodeSub16();
											var15.aBool30 = true;
											var15.aWidget1 = var9;
											var15.anInt284 = MouseHandler.staticInt99 - var11;
											var15.anInt285 = MouseHandler.staticInt100 - var14;
											var15.anObjectArray2 = var9.anObjectArray5;
											Client.staticClass39_8.method198(var15);
										}
									}

									if (var9.aBool45 && var36 && var9.anObjectArray3 != null) {
										var15 = new NodeSub16();
										var15.aBool30 = true;
										var15.aWidget1 = var9;
										var15.anInt284 = MouseHandler.staticInt94 - var11;
										var15.anInt285 = MouseHandler.staticInt88 - var14;
										var15.anObjectArray2 = var9.anObjectArray3;
										Client.staticClass39_8.method198(var15);
									}

									if (var9.aBool45 && !var36) {
										var9.aBool45 = false;
										if (var9.anObjectArray29 != null) {
											var15 = new NodeSub16();
											var15.aBool30 = true;
											var15.aWidget1 = var9;
											var15.anInt284 = MouseHandler.staticInt94 - var11;
											var15.anInt285 = MouseHandler.staticInt88 - var14;
											var15.anObjectArray2 = var9.anObjectArray29;
											Client.staticClass39_10.method198(var15);
										}
									}

									if (var36 && var9.anObjectArray6 != null) {
										var15 = new NodeSub16();
										var15.aBool30 = true;
										var15.aWidget1 = var9;
										var15.anInt284 = MouseHandler.staticInt94 - var11;
										var15.anInt285 = MouseHandler.staticInt88 - var14;
										var15.anObjectArray2 = var9.anObjectArray6;
										Client.staticClass39_8.method198(var15);
									}

									if (!var9.aBool44 && var311) {
										var9.aBool44 = true;
										if (var9.anObjectArray7 != null) {
											var15 = new NodeSub16();
											var15.aBool30 = true;
											var15.aWidget1 = var9;
											var15.anInt284 = MouseHandler.staticInt94 - var11;
											var15.anInt285 = MouseHandler.staticInt88 - var14;
											var15.anObjectArray2 = var9.anObjectArray7;
											Client.staticClass39_8.method198(var15);
										}
									}

									if (var9.aBool44 && var311 && var9.anObjectArray8 != null) {
										var15 = new NodeSub16();
										var15.aBool30 = true;
										var15.aWidget1 = var9;
										var15.anInt284 = MouseHandler.staticInt94 - var11;
										var15.anInt285 = MouseHandler.staticInt88 - var14;
										var15.anObjectArray2 = var9.anObjectArray8;
										Client.staticClass39_8.method198(var15);
									}

									if (var9.aBool44 && !var311) {
										var9.aBool44 = false;
										if (var9.anObjectArray9 != null) {
											var15 = new NodeSub16();
											var15.aBool30 = true;
											var15.aWidget1 = var9;
											var15.anInt284 = MouseHandler.staticInt94 - var11;
											var15.anInt285 = MouseHandler.staticInt88 - var14;
											var15.anObjectArray2 = var9.anObjectArray9;
											Client.staticClass39_10.method198(var15);
										}
									}

									if (var9.anObjectArray16 != null) {
										var15 = new NodeSub16();
										var15.aWidget1 = var9;
										var15.anObjectArray2 = var9.anObjectArray16;
										Client.staticClass39_9.method198(var15);
									}

									NodeSub16 var26;
									if (var9.anObjectArray13 != null && Client.staticInt275 > var9.anInt356) {
										if (var9.anIntArray74 != null && Client.staticInt275 - var9.anInt356 <= 32) {
											label517: for (var33 = var9.anInt356; var33 < Client.staticInt275; var33++) {
												var16 = Client.staticIntArray104[var33 & 0x1f];

												for (var23 = 0; var23 < var9.anIntArray74.length; var23++) {
													if (var16 == var9.anIntArray74[var23]) {
														var26 = new NodeSub16();
														var26.aWidget1 = var9;
														var26.anObjectArray2 = var9.anObjectArray13;
														Client.staticClass39_8.method198(var26);
														break label517;
													}
												}
											}
										} else {
											var15 = new NodeSub16();
											var15.aWidget1 = var9;
											var15.anObjectArray2 = var9.anObjectArray13;
											Client.staticClass39_8.method198(var15);
										}

										var9.anInt356 = Client.staticInt275;
									}

									if (var9.anObjectArray14 != null && Client.staticInt276 > var9.anInt357) {
										if (var9.anIntArray69 != null && Client.staticInt276 - var9.anInt357 <= 32) {
											label493: for (var33 = var9.anInt357; var33 < Client.staticInt276; var33++) {
												var16 = Client.staticIntArray86[var33 & 0x1f];

												for (var23 = 0; var23 < var9.anIntArray69.length; var23++) {
													if (var9.anIntArray69[var23] == var16) {
														var26 = new NodeSub16();
														var26.aWidget1 = var9;
														var26.anObjectArray2 = var9.anObjectArray14;
														Client.staticClass39_8.method198(var26);
														break label493;
													}
												}
											}
										} else {
											var15 = new NodeSub16();
											var15.aWidget1 = var9;
											var15.anObjectArray2 = var9.anObjectArray14;
											Client.staticClass39_8.method198(var15);
										}

										var9.anInt357 = Client.staticInt276;
									}

									if (var9.anObjectArray15 != null && Client.staticInt278 > var9.anInt358) {
										if (var9.anIntArray71 != null && Client.staticInt278 - var9.anInt358 <= 32) {
											label469: for (var33 = var9.anInt358; var33 < Client.staticInt278; var33++) {
												var16 = Client.staticIntArray105[var33 & 0x1f];

												for (var23 = 0; var23 < var9.anIntArray71.length; var23++) {
													if (var16 == var9.anIntArray71[var23]) {
														var26 = new NodeSub16();
														var26.aWidget1 = var9;
														var26.anObjectArray2 = var9.anObjectArray15;
														Client.staticClass39_8.method198(var26);
														break label469;
													}
												}
											}
										} else {
											var15 = new NodeSub16();
											var15.aWidget1 = var9;
											var15.anObjectArray2 = var9.anObjectArray15;
											Client.staticClass39_8.method198(var15);
										}

										var9.anInt358 = Client.staticInt278;
									}

									if (Client.staticInt279 > var9.anInt355 && var9.anObjectArray18 != null) {
										var15 = new NodeSub16();
										var15.aWidget1 = var9;
										var15.anObjectArray2 = var9.anObjectArray18;
										Client.staticClass39_8.method198(var15);
									}

									if (Client.staticInt280 * 1604201655 > var9.anInt355
											&& var9.anObjectArray20 != null) {
										var15 = new NodeSub16();
										var15.aWidget1 = var9;
										var15.anObjectArray2 = var9.anObjectArray20;
										Client.staticClass39_8.method198(var15);
									}

									if (Client.staticInt281 * 1604201655 > var9.anInt355
											&& var9.anObjectArray21 != null) {
										var15 = new NodeSub16();
										var15.aWidget1 = var9;
										var15.anObjectArray2 = var9.anObjectArray21;
										Client.staticClass39_8.method198(var15);
									}

									if (Client.staticInt295 * 1604201655 > var9.anInt355
											&& var9.anObjectArray26 != null) {
										var15 = new NodeSub16();
										var15.aWidget1 = var9;
										var15.anObjectArray2 = var9.anObjectArray26;
										Client.staticClass39_8.method198(var15);
									}

									if (Client.staticInt282 * 1604201655 > var9.anInt355
											&& var9.anObjectArray27 != null) {
										var15 = new NodeSub16();
										var15.aWidget1 = var9;
										var15.anObjectArray2 = var9.anObjectArray27;
										Client.staticClass39_8.method198(var15);
									}

									if (Client.staticInt283 * 1604201655 > var9.anInt355
											&& var9.anObjectArray22 != null) {
										var15 = new NodeSub16();
										var15.aWidget1 = var9;
										var15.anObjectArray2 = var9.anObjectArray22;
										Client.staticClass39_8.method198(var15);
									}

									var9.anInt355 = Client.staticInt274 * -2038739763;
									if (var9.anObjectArray19 != null) {
										for (var33 = 0; var33 < Client.staticInt264; var33++) {
											NodeSub16 var31 = new NodeSub16();
											var31.aWidget1 = var9;
											var31.anInt288 = Client.staticIntArray111[var33];
											var31.anInt287 = Client.staticIntArray110[var33];
											var31.anObjectArray2 = var9.anObjectArray19;
											Client.staticClass39_8.method198(var31);
										}
									}
								}
							}

							if (!var9.aBool42 && Client.staticWidget7 == null && NodeSub3.staticWidget5 == null
									&& !Client.staticBool30) {
								if ((var9.anInt310 >= 0 || var9.anInt321 != 0) && MouseHandler.staticInt94 >= var21
										&& MouseHandler.staticInt88 >= var22 && MouseHandler.staticInt94 < var10
										&& MouseHandler.staticInt88 < var17) {
									if (var9.anInt310 >= 0) {
										Class56.staticWidget4 = var0[var9.anInt310];
									} else {
										Class56.staticWidget4 = var9;
									}
								}

								if (var9.anInt296 == 8 && MouseHandler.staticInt94 >= var21
										&& MouseHandler.staticInt88 >= var22 && MouseHandler.staticInt94 < var10
										&& MouseHandler.staticInt88 < var17) {
									FloorUnderlayDef.staticWidget12 = var9;
								}

								if (var9.anInt361 > var9.anInt351) {
									staticMethod469(var9, var9.anInt307 + var11, var14, var9.anInt351, var9.anInt361,
											MouseHandler.staticInt94, MouseHandler.staticInt88);
								}
							}
						}
					}
				}
			}
		}

	}

	static void staticMethod27(Widget var0) {
		Widget var1 = var0.anInt342 == -1 ? null : staticMethod8(var0.anInt342);
		int var2;
		int var3;
		if (var1 == null) {
			var2 = gameWidth;
			var3 = Class47.gameHeight;
		} else {
			var2 = var1.anInt307;
			var3 = var1.anInt351;
		}

		staticMethod175(var0, var2, var3, false);
		staticMethod72(var0, var2, var3);
	}

	static final void staticMethod93(boolean var0) {
		int var1 = Client.staticInt263;
		int var2 = gameWidth;
		int var3 = Class47.gameHeight;
		if (staticMethod4(var1)) {
			staticMethod215(Widget.staticWidgetArrayArray1[var1], -1, var2, var3, var0);
		}

	}

	static void staticMethod94(Player var0, int var1, int var2) {
		if (var1 == var0.anInt612 && var1 != -1) {
			int var3 = staticMethod210(var1).anInt568;
			if (var3 == 1) {
				var0.anInt613 = 0;
				var0.anInt614 = 0;
				var0.anInt615 = var2;
				var0.anInt593 = 0;
			}

			if (var3 == 2) {
				var0.anInt593 = 0;
			}
		} else if (var1 == -1 || var0.anInt612 == -1
				|| staticMethod210(var1).anInt563 >= staticMethod210(var0.anInt612).anInt563) {
			var0.anInt612 = var1;
			var0.anInt613 = 0;
			var0.anInt614 = 0;
			var0.anInt615 = var2;
			var0.anInt593 = 0;
			var0.anInt599 = var0.anInt632;
		}

	}

	static void staticMethod95() {
		staticMethod344(Class38.staticCanvas1);
		staticMethod302(Class38.staticCanvas1);
		if (Class29.staticAbstractClass1_1 != null) {
			Class29.staticAbstractClass1_1.method167(Class38.staticCanvas1);
		}

		Client.staticGame1.method201();
		Class38.staticCanvas1.setBackground(Color.black);
		Canvas var0 = Class38.staticCanvas1;
		var0.setFocusTraversalKeysEnabled(false);
		var0.addKeyListener(KeyboardHandler.staticKeyboardHandler1);
		var0.addFocusListener(KeyboardHandler.staticKeyboardHandler1);
		Canvas var1 = Class38.staticCanvas1;
		var1.addMouseListener(MouseHandler.staticMouseHandler1);
		var1.addMouseMotionListener(MouseHandler.staticMouseHandler1);
		var1.addFocusListener(MouseHandler.staticMouseHandler1);
		if (Class29.staticAbstractClass1_1 != null) {
			Class29.staticAbstractClass1_1.method166(Class38.staticCanvas1);
		}

		if (Client.staticInt263 != -1) {
			staticMethod93(false);
		}

		GameShell.staticBool15 = true;
	}

	public static int staticMethod96(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var1 + var0;
	}

	static final String staticMethod97(int var0) {
		return var0 < 100000 ? "<col=ffff00>" + var0 + "</col>"
				: var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>"
						: "<col=00ff80>" + var0 / 1000000 + "M" + "</col>";
	}

	public static int staticMethod98(int var0, int var1, int var2, AbstractClass2 var3, Class38 var4, boolean var5,
			int[] var6, int[] var7) {
		int var11;
		for (int var10 = 0; var10 < 128; var10++) {
			for (var11 = 0; var11 < 128; var11++) {
				staticIntArrayArray6[var10][var11] = 0;
				staticIntArrayArray5[var10][var11] = 99999999;
			}
		}

		int var12;
		int var13;
		int var14;
		int var16;
		int var17;
		int var18;
		int var21;
		int var22;
		boolean var27;
		int var28;
		int var29;
		int var32;
		byte var31;
		byte var291;
		if (var2 == 1) {
			var27 = staticMethod330(var0, var1, var3, var4);
		} else if (var2 == 2) {
			var22 = var0;
			var16 = var1;
			var31 = 64;
			var291 = 64;
			var17 = var0 - var31;
			var18 = var1 - var291;
			staticIntArrayArray6[var31][var291] = 99;
			staticIntArrayArray5[var31][var291] = 0;
			byte var33 = 0;
			var13 = 0;
			staticIntArray49[var33] = var0;
			var32 = var33 + 1;
			staticIntArray50[var33] = var1;
			int[][] var23 = var4.anIntArrayArray5;

			boolean var24;
			label237: {
				while (var13 != var32) {
					var22 = staticIntArray49[var13];
					var16 = staticIntArray50[var13];
					var13 = 1 + var13 & 0xfff;
					var28 = var22 - var17;
					var29 = var16 - var18;
					var14 = var22 - var4.anInt156;
					var21 = var16 - var4.anInt157;
					if (var3.method172(2, var22, var16, var4)) {
						staticInt110 = var22;
						Js5CacheWriteRequest.staticInt315 = var16;
						var24 = true;
						break label237;
					}

					var12 = staticIntArrayArray5[var28][var29] + 1;
					if (var28 > 0 && staticIntArrayArray6[var28 - 1][var29] == 0
							&& (var23[var14 - 1][var21] & 0x124010e) == 0
							&& (var23[var14 - 1][1 + var21] & 0x1240138) == 0) {
						staticIntArray49[var32] = var22 - 1;
						staticIntArray50[var32] = var16;
						var32 = 1 + var32 & 0xfff;
						staticIntArrayArray6[var28 - 1][var29] = 2;
						staticIntArrayArray5[var28 - 1][var29] = var12;
					}

					if (var28 < 126 && staticIntArrayArray6[var28 + 1][var29] == 0
							&& (var23[var14 + 2][var21] & 0x1240183) == 0
							&& (var23[var14 + 2][1 + var21] & 0x12401e0) == 0) {
						staticIntArray49[var32] = 1 + var22;
						staticIntArray50[var32] = var16;
						var32 = 1 + var32 & 0xfff;
						staticIntArrayArray6[var28 + 1][var29] = 8;
						staticIntArrayArray5[var28 + 1][var29] = var12;
					}

					if (var29 > 0 && staticIntArrayArray6[var28][var29 - 1] == 0
							&& (var23[var14][var21 - 1] & 0x124010e) == 0
							&& (var23[var14 + 1][var21 - 1] & 0x1240183) == 0) {
						staticIntArray49[var32] = var22;
						staticIntArray50[var32] = var16 - 1;
						var32 = var32 + 1 & 0xfff;
						staticIntArrayArray6[var28][var29 - 1] = 1;
						staticIntArrayArray5[var28][var29 - 1] = var12;
					}

					if (var29 < 126 && staticIntArrayArray6[var28][var29 + 1] == 0
							&& (var23[var14][var21 + 2] & 0x1240138) == 0
							&& (var23[1 + var14][2 + var21] & 0x12401e0) == 0) {
						staticIntArray49[var32] = var22;
						staticIntArray50[var32] = 1 + var16;
						var32 = var32 + 1 & 0xfff;
						staticIntArrayArray6[var28][1 + var29] = 4;
						staticIntArrayArray5[var28][1 + var29] = var12;
					}

					if (var28 > 0 && var29 > 0 && staticIntArrayArray6[var28 - 1][var29 - 1] == 0
							&& (var23[var14 - 1][var21] & 0x124013e) == 0
							&& (var23[var14 - 1][var21 - 1] & 0x124010e) == 0
							&& (var23[var14][var21 - 1] & 0x124018f) == 0) {
						staticIntArray49[var32] = var22 - 1;
						staticIntArray50[var32] = var16 - 1;
						var32 = 1 + var32 & 0xfff;
						staticIntArrayArray6[var28 - 1][var29 - 1] = 3;
						staticIntArrayArray5[var28 - 1][var29 - 1] = var12;
					}

					if (var28 < 126 && var29 > 0 && staticIntArrayArray6[var28 + 1][var29 - 1] == 0
							&& (var23[1 + var14][var21 - 1] & 0x124018f) == 0
							&& (var23[2 + var14][var21 - 1] & 0x1240183) == 0
							&& (var23[var14 + 2][var21] & 0x12401e3) == 0) {
						staticIntArray49[var32] = var22 + 1;
						staticIntArray50[var32] = var16 - 1;
						var32 = 1 + var32 & 0xfff;
						staticIntArrayArray6[var28 + 1][var29 - 1] = 9;
						staticIntArrayArray5[1 + var28][var29 - 1] = var12;
					}

					if (var28 > 0 && var29 < 126 && staticIntArrayArray6[var28 - 1][var29 + 1] == 0
							&& (var23[var14 - 1][var21 + 1] & 0x124013e) == 0
							&& (var23[var14 - 1][2 + var21] & 0x1240138) == 0
							&& (var23[var14][var21 + 2] & 0x12401f8) == 0) {
						staticIntArray49[var32] = var22 - 1;
						staticIntArray50[var32] = var16 + 1;
						var32 = 1 + var32 & 0xfff;
						staticIntArrayArray6[var28 - 1][var29 + 1] = 6;
						staticIntArrayArray5[var28 - 1][var29 + 1] = var12;
					}

					if (var28 < 126 && var29 < 126 && staticIntArrayArray6[1 + var28][var29 + 1] == 0
							&& (var23[1 + var14][2 + var21] & 0x12401f8) == 0
							&& (var23[2 + var14][2 + var21] & 0x12401e0) == 0
							&& (var23[2 + var14][1 + var21] & 0x12401e3) == 0) {
						staticIntArray49[var32] = 1 + var22;
						staticIntArray50[var32] = var16 + 1;
						var32 = var32 + 1 & 0xfff;
						staticIntArrayArray6[var28 + 1][1 + var29] = 12;
						staticIntArrayArray5[1 + var28][1 + var29] = var12;
					}
				}

				staticInt110 = var22;
				Js5CacheWriteRequest.staticInt315 = var16;
				var24 = false;
			}

			var27 = var24;
		} else {
			var27 = staticMethod376(var0, var1, var2, var3, var4);
		}

		var11 = var0 - 64;
		var22 = var1 - 64;
		var16 = staticInt110;
		var28 = Js5CacheWriteRequest.staticInt315;
		if (!var27) {
			if (!var5) {
				return -1;
			}

			var29 = Integer.MAX_VALUE;
			var17 = Integer.MAX_VALUE;
			var31 = 10;
			var32 = var3.anInt153;
			var13 = var3.anInt152;
			int var30 = var3.anInt154;
			var14 = var3.anInt155;

			for (var21 = var32 - var31; var21 <= var31 + var32; var21++) {
				for (var12 = var13 - var31; var12 <= var31 + var13; var12++) {
					int var311 = var21 - var11;
					int var321 = var12 - var22;
					if (var311 >= 0 && var321 >= 0 && var311 < 128 && var321 < 128
							&& staticIntArrayArray5[var311][var321] < 100) {
						int var19 = 0;
						if (var21 < var32) {
							var19 = var32 - var21;
						} else if (var21 > var30 + var32 - 1) {
							var19 = var21 - (var32 + var30 - 1);
						}

						int var15 = 0;
						if (var12 < var13) {
							var15 = var13 - var12;
						} else if (var12 > var14 + var13 - 1) {
							var15 = var12 - (var13 + var14 - 1);
						}

						int var26 = var15 * var15 + var19 * var19;
						if (var26 < var29 || var29 == var26 && staticIntArrayArray5[var311][var321] < var17) {
							var29 = var26;
							var17 = staticIntArrayArray5[var311][var321];
							var16 = var21;
							var28 = var12;
						}
					}
				}
			}

			if (var29 == Integer.MAX_VALUE) {
				return -1;
			}
		}

		if (var16 == var0 && var1 == var28) {
			return 0;
		} else {
			var291 = 0;
			staticIntArray49[var291] = var16;
			var29 = var291 + 1;
			staticIntArray50[var291] = var28;

			for (var17 = var18 = staticIntArrayArray6[var16 - var11][var28 - var22]; var0 != var16
					|| var1 != var28; var17 = staticIntArrayArray6[var16 - var11][var28 - var22]) {
				if (var17 != var18) {
					var18 = var17;
					staticIntArray49[var29] = var16;
					staticIntArray50[var29++] = var28;
				}

				if ((var17 & 0x2) != 0) {
					++var16;
				} else if ((var17 & 0x8) != 0) {
					--var16;
				}

				if ((var17 & 0x1) != 0) {
					++var28;
				} else if ((var17 & 0x4) != 0) {
					--var28;
				}
			}

			var32 = 0;

			while (var29-- > 0) {
				var6[var32] = staticIntArray49[var29];
				var7[var32++] = staticIntArray50[var29];
				if (var32 >= var6.length) {
					break;
				}
			}

			return var32;
		}
	}

	static final void staticMethod99(Scene var0, Class38[] var1) {
		int var2;
		int var6;
		int var7;
		int var9;
		for (var2 = 0; var2 < 4; var2++) {
			for (var6 = 0; var6 < 104; var6++) {
				for (var7 = 0; var7 < 104; var7++) {
					if ((staticByteArrayArrayArray4[var2][var6][var7] & 0x1) == 1) {
						var9 = var2;
						if ((staticByteArrayArrayArray4[1][var6][var7] & 0x2) == 2) {
							var9 = var2 - 1;
						}

						if (var9 >= 0) {
							var1[var9].method183(var6, var7);
						}
					}
				}
			}
		}

		staticInt111 += (int) (Math.random() * 5.0D) - 2;
		if (staticInt111 < -8) {
			staticInt111 = -8;
		}

		if (staticInt111 > 8) {
			staticInt111 = 8;
		}

		staticInt113 += (int) (Math.random() * 5.0D) - 2;
		if (staticInt113 < -16) {
			staticInt113 = -16;
		}

		if (staticInt113 > 16) {
			staticInt113 = 16;
		}

		int var3;
		int var4;
		int var15;
		int var16;
		int var17;
		int var18;
		int var20;
		int var22;
		int var25;
		int var26;
		int var5;
		int var11;
		for (var2 = 0; var2 < 4; var2++) {
			byte[][] var27 = staticByteArrayArrayArray2[var2];
			var17 = (int) Math.sqrt(5100.0D);
			var25 = var17 * 768 >> 8;

			for (var3 = 1; var3 < 103; var3++) {
				for (var16 = 1; var16 < 103; var16++) {
					var4 = staticIntArrayArrayArray1[var2][1 + var16][var3]
							- staticIntArrayArrayArray1[var2][var16 - 1][var3];
					var20 = staticIntArrayArrayArray1[var2][var16][1 + var3]
							- staticIntArrayArrayArray1[var2][var16][var3 - 1];
					var15 = (int) Math.sqrt(var20 * var20 + 65536 + var4 * var4);
					var18 = (var4 << 8) / var15;
					var26 = 65536 / var15;
					var22 = (var20 << 8) / var15;
					var11 = (var22 * -50 + var26 * -10 + var18 * -50) / var25 + 96;
					var5 = (var27[var16][var3] >> 1) + (var27[var16][var3 - 1] >> 2) + (var27[1 + var16][var3] >> 3)
							+ (var27[var16 - 1][var3] >> 2) + (var27[var16][1 + var3] >> 3);
					staticIntArrayArray7[var16][var3] = var11 - var5;
				}
			}

			for (var3 = 0; var3 < 104; var3++) {
				staticIntArray55[var3] = 0;
				ClientScriptMap.staticIntArray129[var3] = 0;
				CacheableSub2.staticIntArray127[var3] = 0;
				Class60.staticIntArray76[var3] = 0;
				staticIntArray51[var3] = 0;
			}

			for (var3 = -5; var3 < 109; var3++) {
				for (var16 = 0; var16 < 104; var16++) {
					var4 = 5 + var3;
					FloorUnderlayDef var46;
					if (var4 >= 0 && var4 < 104) {
						var20 = staticByteArrayArrayArray1[var2][var4][var16] & 0xff;
						if (var20 > 0) {
							var46 = staticMethod338(var20 - 1);
							staticIntArray55[var16] += var46.anInt512;
							ClientScriptMap.staticIntArray129[var16] += var46.anInt510;
							CacheableSub2.staticIntArray127[var16] += var46.anInt509;
							Class60.staticIntArray76[var16] += var46.anInt511;
							++staticIntArray51[var16];
						}
					}

					var20 = var3 - 5;
					if (var20 >= 0 && var20 < 104) {
						var15 = staticByteArrayArrayArray1[var2][var20][var16] & 0xff;
						if (var15 > 0) {
							var46 = staticMethod338(var15 - 1);
							staticIntArray55[var16] -= var46.anInt512;
							ClientScriptMap.staticIntArray129[var16] -= var46.anInt510;
							CacheableSub2.staticIntArray127[var16] -= var46.anInt509;
							Class60.staticIntArray76[var16] -= var46.anInt511;
							--staticIntArray51[var16];
						}
					}
				}

				if (var3 >= 1 && var3 < 103) {
					var16 = 0;
					var4 = 0;
					var20 = 0;
					var15 = 0;
					var18 = 0;

					for (var26 = -5; var26 < 109; var26++) {
						var22 = 5 + var26;
						if (var22 >= 0 && var22 < 104) {
							var16 += staticIntArray55[var22];
							var4 += ClientScriptMap.staticIntArray129[var22];
							var20 += CacheableSub2.staticIntArray127[var22];
							var15 += Class60.staticIntArray76[var22];
							var18 += staticIntArray51[var22];
						}

						var11 = var26 - 5;
						if (var11 >= 0 && var11 < 104) {
							var16 -= staticIntArray55[var11];
							var4 -= ClientScriptMap.staticIntArray129[var11];
							var20 -= CacheableSub2.staticIntArray127[var11];
							var15 -= Class60.staticIntArray76[var11];
							var18 -= staticIntArray51[var11];
						}

						if (var26 >= 1 && var26 < 103
								&& (!Client.lowMemory || (staticByteArrayArrayArray4[0][var3][var26] & 0x2) != 0
										|| (staticByteArrayArrayArray4[var2][var3][var26] & 0x10) == 0)) {
							if (var2 < staticInt112) {
								staticInt112 = var2;
							}

							var5 = staticByteArrayArrayArray1[var2][var3][var26] & 0xff;
							int var411 = staticByteArrayArrayArray5[var2][var3][var26] & 0xff;
							if (var5 > 0 || var411 > 0) {
								int var38 = staticIntArrayArrayArray1[var2][var3][var26];
								int var37 = staticIntArrayArrayArray1[var2][1 + var3][var26];
								int var39 = staticIntArrayArrayArray1[var2][1 + var3][1 + var26];
								int var28 = staticIntArrayArrayArray1[var2][var3][1 + var26];
								int var29 = staticIntArrayArray7[var3][var26];
								int var30 = staticIntArrayArray7[1 + var3][var26];
								int var31 = staticIntArrayArray7[var3 + 1][var26 + 1];
								int var32 = staticIntArrayArray7[var3][1 + var26];
								int var35 = -1;
								int var36 = -1;
								int var33;
								int var34;
								if (var5 > 0) {
									var33 = var16 * 256 / var15;
									var34 = var4 / var18;
									int var45 = var20 / var18;
									var35 = staticMethod206(var33, var34, var45);
									var33 = staticInt111 + var33 & 0xff;
									var45 += staticInt113;
									if (var45 < 0) {
										var45 = 0;
									} else if (var45 > 255) {
										var45 = 255;
									}

									var36 = staticMethod206(var33, var34, var45);
								}

								if (var2 > 0) {
									boolean var43 = true;
									if (var5 == 0 && staticByteArrayArrayArray3[var2][var3][var26] != 0) {
										var43 = false;
									}

									if (var411 > 0 && !staticMethod308(var411 - 1).aBool66) {
										var43 = false;
									}

									if (var43 && var37 == var38 && var39 == var38 && var28 == var38) {
										NodeSub1.staticIntArrayArrayArray2[var2][var3][var26] |= 2340;
									}
								}

								var33 = 0;
								if (var36 != -1) {
									var33 = Rasterizer2DSub1.staticIntArray155[staticMethod10(var36, 96)];
								}

								if (var411 == 0) {
									var0.method99(var2, var3, var26, 0, 0, -1, var38, var37, var39, var28,
											staticMethod10(var35, var29), staticMethod10(var35, var30),
											staticMethod10(var35, var31), staticMethod10(var35, var32), 0, 0, 0, 0,
											var33, 0);
								} else {
									var34 = staticByteArrayArrayArray3[var2][var3][var26] + 1;
									byte var44 = staticByteArrayArrayArray6[var2][var3][var26];
									FloorOverlayDef var10 = staticMethod308(var411 - 1);
									int var21 = var10.anInt528;
									int var12;
									int var13;
									int var14;
									int var40;
									if (var21 >= 0) {
										var14 = Rasterizer2DSub1.staticInterface2_1.method34(var21);
										var40 = -1;
									} else if (var10.anInt527 == 16711935) {
										var40 = -2;
										var21 = -1;
										var14 = -2;
									} else {
										var40 = staticMethod206(var10.anInt530, var10.anInt531, var10.anInt532);
										var13 = var10.anInt530 + staticInt111 & 0xff;
										var12 = staticInt113 + var10.anInt532;
										if (var12 < 0) {
											var12 = 0;
										} else if (var12 > 255) {
											var12 = 255;
										}

										var14 = staticMethod206(var13, var10.anInt531, var12);
									}

									var13 = 0;
									if (var14 != -2) {
										var13 = Rasterizer2DSub1.staticIntArray155[staticMethod430(var14, 96)];
									}

									if (var10.anInt529 != -1) {
										var12 = staticInt111 + var10.anInt533 * 756915205 & 0xff;
										int var41 = staticInt113 + var10.anInt526 * -120931921;
										if (var41 < 0) {
											var41 = 0;
										} else if (var41 > 255) {
											var41 = 255;
										}

										var14 = staticMethod206(var12, var10.anInt534 * -1278520375, var41);
										var13 = Rasterizer2DSub1.staticIntArray155[staticMethod430(var14, 96)];
									}

									var0.method99(var2, var3, var26, var34, var44, var21, var38, var37, var39, var28,
											staticMethod10(var35, var29), staticMethod10(var35, var30),
											staticMethod10(var35, var31), staticMethod10(var35, var32),
											staticMethod430(var40, var29), staticMethod430(var40, var30),
											staticMethod430(var40, var31), staticMethod430(var40, var32), var33, var13);
								}
							}
						}
					}
				}
			}

			for (var3 = 1; var3 < 103; var3++) {
				for (var16 = 1; var16 < 103; var16++) {
					if ((staticByteArrayArrayArray4[var2][var16][var3] & 0x8) != 0) {
						var26 = 0;
					} else if (var2 > 0 && (staticByteArrayArrayArray4[1][var16][var3] & 0x2) != 0) {
						var26 = var2 - 1;
					} else {
						var26 = var2;
					}

					var0.method98(var2, var16, var3, var26);
				}
			}

			staticByteArrayArrayArray1[var2] = null;
			staticByteArrayArrayArray5[var2] = null;
			staticByteArrayArrayArray3[var2] = null;
			staticByteArrayArrayArray6[var2] = null;
			staticByteArrayArrayArray2[var2] = null;
		}

		var0.method126(-50, -10, -50);

		for (var2 = 0; var2 < 104; var2++) {
			for (var6 = 0; var6 < 104; var6++) {
				if ((staticByteArrayArrayArray4[1][var2][var6] & 0x2) == 2) {
					var0.method114(var2, var6);
				}
			}
		}

		var2 = 1;
		var6 = 2;
		var7 = 4;

		for (var9 = 0; var9 < 4; var9++) {
			if (var9 > 0) {
				var2 <<= 3;
				var6 <<= 3;
				var7 <<= 3;
			}

			for (int var401 = 0; var401 <= var9; var401++) {
				for (var5 = 0; var5 <= 104; var5++) {
					for (var11 = 0; var11 <= 104; var11++) {
						short var42;
						if ((NodeSub1.staticIntArrayArrayArray2[var401][var11][var5] & var2) != 0) {
							var17 = var5;
							var25 = var5;
							var3 = var401;

							for (var16 = var401; var17 > 0
									&& (NodeSub1.staticIntArrayArrayArray2[var401][var11][var17 - 1]
											& var2) != 0; --var17) {
								;
							}

							while (var25 < 104
									&& (NodeSub1.staticIntArrayArrayArray2[var401][var11][1 + var25] & var2) != 0) {
								++var25;
							}

							label351: while (var3 > 0) {
								for (var4 = var17; var4 <= var25; var4++) {
									if ((NodeSub1.staticIntArrayArrayArray2[var3 - 1][var11][var4] & var2) == 0) {
										break label351;
									}
								}

								--var3;
							}

							label340: while (var16 < var9) {
								for (var4 = var17; var4 <= var25; var4++) {
									if ((NodeSub1.staticIntArrayArrayArray2[var16 + 1][var11][var4] & var2) == 0) {
										break label340;
									}
								}

								++var16;
							}

							var4 = (1 + var25 - var17) * (1 + var16 - var3);
							if (var4 >= 8) {
								var42 = 240;
								var15 = staticIntArrayArrayArray1[var16][var11][var17] - var42;
								var18 = staticIntArrayArrayArray1[var3][var11][var17];
								staticMethod75(var9, 1, var11 * 128, var11 * 128, var17 * 128, var25 * 128 + 128, var15,
										var18);

								for (var26 = var3; var26 <= var16; var26++) {
									for (var22 = var17; var22 <= var25; var22++) {
										NodeSub1.staticIntArrayArrayArray2[var26][var11][var22] &= ~var2;
									}
								}
							}
						}

						if ((NodeSub1.staticIntArrayArrayArray2[var401][var11][var5] & var6) != 0) {
							var17 = var11;
							var25 = var11;
							var3 = var401;

							for (var16 = var401; var17 > 0
									&& (NodeSub1.staticIntArrayArrayArray2[var401][var17 - 1][var5]
											& var6) != 0; --var17) {
								;
							}

							while (var25 < 104
									&& (NodeSub1.staticIntArrayArrayArray2[var401][1 + var25][var5] & var6) != 0) {
								++var25;
							}

							label404: while (var3 > 0) {
								for (var4 = var17; var4 <= var25; var4++) {
									if ((NodeSub1.staticIntArrayArrayArray2[var3 - 1][var4][var5] & var6) == 0) {
										break label404;
									}
								}

								--var3;
							}

							label393: while (var16 < var9) {
								for (var4 = var17; var4 <= var25; var4++) {
									if ((NodeSub1.staticIntArrayArrayArray2[var16 + 1][var4][var5] & var6) == 0) {
										break label393;
									}
								}

								++var16;
							}

							var4 = (var16 + 1 - var3) * (1 + var25 - var17);
							if (var4 >= 8) {
								var42 = 240;
								var15 = staticIntArrayArrayArray1[var16][var17][var5] - var42;
								var18 = staticIntArrayArrayArray1[var3][var17][var5];
								staticMethod75(var9, 2, var17 * 128, var25 * 128 + 128, var5 * 128, var5 * 128, var15,
										var18);

								for (var26 = var3; var26 <= var16; var26++) {
									for (var22 = var17; var22 <= var25; var22++) {
										NodeSub1.staticIntArrayArrayArray2[var26][var22][var5] &= ~var6;
									}
								}
							}
						}

						if ((NodeSub1.staticIntArrayArrayArray2[var401][var11][var5] & var7) != 0) {
							var17 = var11;
							var25 = var11;
							var3 = var5;

							for (var16 = var5; var3 > 0 && (NodeSub1.staticIntArrayArrayArray2[var401][var11][var3 - 1]
									& var7) != 0; --var3) {
								;
							}

							while (var16 < 104
									&& (NodeSub1.staticIntArrayArrayArray2[var401][var11][var16 + 1] & var7) != 0) {
								++var16;
							}

							label457: while (var17 > 0) {
								for (var4 = var3; var4 <= var16; var4++) {
									if ((NodeSub1.staticIntArrayArrayArray2[var401][var17 - 1][var4] & var7) == 0) {
										break label457;
									}
								}

								--var17;
							}

							label446: while (var25 < 104) {
								for (var4 = var3; var4 <= var16; var4++) {
									if ((NodeSub1.staticIntArrayArrayArray2[var401][var25 + 1][var4] & var7) == 0) {
										break label446;
									}
								}

								++var25;
							}

							if ((var25 - var17 + 1) * (var16 - var3 + 1) >= 4) {
								var4 = staticIntArrayArrayArray1[var401][var17][var3];
								staticMethod75(var9, 4, var17 * 128, var25 * 128 + 128, var3 * 128, var16 * 128 + 128,
										var4, var4);

								for (var20 = var17; var20 <= var25; var20++) {
									for (var15 = var3; var15 <= var16; var15++) {
										NodeSub1.staticIntArrayArrayArray2[var401][var20][var15] &= ~var7;
									}
								}
							}
						}
					}
				}
			}
		}

	}

	public static int staticMethod100() {
		return KeyboardHandler.staticInt82;
	}

	public static final boolean staticMethod106() {
		synchronized (KeyboardHandler.staticKeyboardHandler1) {
			if (KeyboardHandler.staticInt79 == KeyboardHandler.staticInt81) {
				return false;
			} else {
				FileOnDisk.staticInt38 = KeyboardHandler.staticIntArray45[KeyboardHandler.staticInt79];
				staticChar1 = KeyboardHandler.staticCharArray1[KeyboardHandler.staticInt79];
				KeyboardHandler.staticInt79 = KeyboardHandler.staticInt79 + 1 & 0x7f;
				return true;
			}
		}
	}

	public static File staticMethod107(String var0) {
		if (!staticBool10) {
			throw new RuntimeException("");
		} else {
			File var1 = (File) staticHashtable1.get(var0);
			if (var1 != null) {
				return var1;
			} else {
				File var2 = new File(staticFile2, var0);
				RandomAccessFile var3 = null;

				try {
					File var7 = new File(var2.getParent());
					if (!var7.exists()) {
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw");
						int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						staticHashtable1.put(var0, var2);
						return var2;
					}
				} catch (Exception var71) {
					try {
						if (var3 != null) {
							var3.close();
							var3 = null;
						}
					} catch (Exception var6) {
						;
					}

					throw new RuntimeException();
				}
			}
		}
	}

	public static void staticMethod108(int var0) {
		staticInt118 = 1;
		staticJs5Index3 = null;
		staticInt119 = -1;
		staticInt127 = -1;
		Class7.staticInt32 = 0;
		staticBool16 = false;
		NodeSub1.staticInt151 = var0;
	}

	static String staticMethod109(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://";
		if (Client.staticInt207 == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.staticInt207 == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.staticInt207 == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.staticInt207 == 5) {
			var0 = var0 + "-wti";
		} else if (Client.staticInt207 == 4) {
			var0 = "local";
		}

		String var4 = "";
		if (BuildType.staticString27 != null) {
			var4 = "/p=" + BuildType.staticString27;
		}

		String var3 = "runescape.com";
		return var2 + var0 + "." + var3 + "/l=" + Client.staticInt231 + "/a=" + Client.staticInt164 + var4 + "/";
	}

	static final void staticMethod110(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8) {
		NodeSub19 var9 = null;

		for (NodeSub19 var10 = (NodeSub19) Client.staticClass39_7
				.method195(); var10 != null; var10 = (NodeSub19) Client.staticClass39_7.method193()) {
			if (var0 == var10.anInt389 && var10.anInt388 == var1 && var2 == var10.anInt390 && var10.anInt387 == var3) {
				var9 = var10;
				break;
			}
		}

		if (var9 == null) {
			var9 = new NodeSub19();
			var9.anInt389 = var0;
			var9.anInt387 = var3;
			var9.anInt388 = var1;
			var9.anInt390 = var2;
			staticMethod284(var9);
			Client.staticClass39_7.method198(var9);
		}

		var9.anInt397 = var4;
		var9.anInt395 = var5;
		var9.anInt393 = var6;
		var9.anInt396 = var7;
		var9.anInt386 = var8;
	}

	public static String staticMethod111(CharSequence var0, Class53 var1) {
		if (var0 == null) {
			return null;
		} else {
			int var4 = 0;

			int var2;
			char var3;
			boolean var5;
			for (var2 = var0.length(); var4 < var2; var4++) {
				var3 = var0.charAt(var4);
				var5 = var3 == 160 || var3 == 32 || var3 == 95 || var3 == 45;
				if (!var5) {
					break;
				}
			}

			while (var2 > var4) {
				var3 = var0.charAt(var2 - 1);
				var5 = var3 == 160 || var3 == 32 || var3 == 95 || var3 == 45;
				if (!var5) {
					break;
				}

				--var2;
			}

			int var13 = var2 - var4;
			if (var13 >= 1) {
				byte var10;
				if (var1 == null) {
					var10 = 12;
				} else {
					switch (var1.anInt202) {
					case 0:
						var10 = 20;
						break;
					default:
						var10 = 12;
					}
				}

				if (var13 <= var10) {
					StringBuilder var12 = new StringBuilder(var13);

					for (int var15 = var4; var15 < var2; var15++) {
						char var11 = var0.charAt(var15);
						boolean var8;
						if (Character.isISOControl(var11)) {
							var8 = false;
						} else if (staticMethod428(var11)) {
							var8 = true;
						} else {
							label137: {
								char[] var14 = staticCharArray4;

								int var6;
								char var9;
								for (var6 = 0; var6 < var14.length; var6++) {
									var9 = var14[var6];
									if (var11 == var9) {
										var8 = true;
										break label137;
									}
								}

								var14 = staticCharArray5;

								for (var6 = 0; var6 < var14.length; var6++) {
									var9 = var14[var6];
									if (var11 == var9) {
										var8 = true;
										break label137;
									}
								}

								var8 = false;
							}
						}

						if (var8) {
							char var151 = staticMethod103(var11);
							if (var151 != 0) {
								var12.append(var151);
							}
						}
					}

					if (var12.length() == 0) {
						return null;
					}

					return var12.toString();
				}
			}

			return null;
		}
	}

	static int staticMethod112(Class2 var0, Class2 var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.anInt5;
			int var5 = var1.anInt5;
			if (!var3) {
				if (var4 == -1) {
					var4 = 2001;
				}

				if (var5 == -1) {
					var5 = 2001;
				}
			}

			return var4 - var5;
		} else {
			return var2 == 2 ? var0.anInt6 - var1.anInt6
					: var2 == 3
							? var0.aString2.equals("-") ? var1.aString2.equals("-") ? 0 : var3 ? -1 : 1
									: var1.aString2.equals("-") ? var3 ? 1 : -1 : var0.aString2.compareTo(var1.aString2)
							: var2 == 4 ? var0.method8() ? var1.method8() ? 0 : 1 : var1.method8() ? -1 : 0
									: var2 == 5 ? var0.method5() ? var1.method5() ? 0 : 1 : var1.method5() ? -1 : 0
											: var2 == 6
													? var0.method7() ? var1.method7() ? 0 : 1 : var1.method7() ? -1 : 0
													: var2 == 7
															? var0.method10() ? var1.method10() ? 0 : 1
																	: var1.method10() ? -1 : 0
															: var0.anInt4 - var1.anInt4;
		}
	}

	public static void staticMethod122(Node var0, Node var1) {
		if (var0.prev != null) {
			var0.method174();
		}

		var0.prev = var1;
		var0.next = var1.next;
		var0.prev.next = var0;
		var0.next.prev = var0;
	}

	static final void staticMethod136(int var0, int var1, int var2, int var3, int var4) {
		Class33.staticRasterizer2DSub3Array2[0].method655(var0, var1);
		Class33.staticRasterizer2DSub3Array2[1].method655(var0, var3 + var1 - 16);
		staticMethod418(var0, 16 + var1, 16, var3 - 32, Client.staticInt216);
		int var6 = (var3 - 32) * var3 / var4;
		if (var6 < 8) {
			var6 = 8;
		}

		int var5 = (var3 - 32 - var6) * var2 / (var4 - var3);
		staticMethod418(var0, var5 + 16 + var1, 16, var6, Client.staticInt234);
		staticMethod415(var0, var5 + var1 + 16, var6, Client.staticInt218);
		staticMethod415(var0 + 1, var1 + 16 + var5, var6, Client.staticInt218);
		staticMethod413(var0, var5 + var1 + 16, 16, Client.staticInt218);
		staticMethod413(var0, var5 + var1 + 17, 16, Client.staticInt218);
		staticMethod415(var0 + 15, var1 + 16 + var5, var6, Client.staticInt235);
		staticMethod415(var0 + 14, var1 + 17 + var5, var6 - 1, Client.staticInt235);
		staticMethod413(var0, var6 + var5 + 15 + var1, 16, Client.staticInt235);
		staticMethod413(var0 + 1, var6 + var5 + 14 + var1, 15, Client.staticInt235);
	}

	static Class2 staticMethod137() {
		return Class2.staticInt3 < Class2.staticInt2 ? Class2.staticClass2Array1[++Class2.staticInt3 - 1] : null;
	}

	public static void staticMethod138(Node var0, Node var1) {
		if (var0.prev != null) {
			var0.method174();
		}

		var0.prev = var1.prev;
		var0.next = var1;
		var0.prev.next = var0;
		var0.next.prev = var0;
	}

	public static void staticMethod30(Js5Index var0, int var1, int var2, int var3, boolean var4) {
		staticInt118 = 1;
		staticJs5Index3 = var0;
		staticInt119 = var1;
		staticInt127 = var2;
		Class7.staticInt32 = var3;
		staticBool16 = var4;
		NodeSub1.staticInt151 = 10000;
	}

	static final void staticMethod31(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var7 = var3 - 334;
		if (var7 < 0) {
			var7 = 0;
		} else if (var7 > 100) {
			var7 = 100;
		}

		int var12 = var7 * (Client.staticShort4 - Client.staticShort3) / 100 + Client.staticShort3;
		int var6 = var12 * var3 * 512 / (var2 * 334);
		int var5;
		int var13;
		short var15;
		if (var6 < Client.staticShort7) {
			var15 = Client.staticShort7;
			var12 = var2 * var15 * 334 / (var3 * 512);
			if (var12 > Client.staticShort6) {
				var12 = Client.staticShort6;
				var13 = var12 * var3 * 512 / (var15 * 334);
				var5 = (var2 - var13) / 2;
				if (var4) {
					staticMethod401();
					staticMethod418(var0, var1, var5, var3, -16777216);
					staticMethod418(var2 + var0 - var5, var1, var5, var3, -16777216);
				}

				var0 += var5;
				var2 -= var5 * 2;
			}
		} else if (var6 > Client.staticShort8) {
			var15 = Client.staticShort8;
			var12 = var15 * var2 * 334 / (var3 * 512);
			if (var12 < Client.staticShort1) {
				var12 = Client.staticShort1;
				var13 = var2 * var15 * 334 / (var12 * 512);
				var5 = (var3 - var13) / 2;
				if (var4) {
					staticMethod401();
					staticMethod418(var0, var1, var2, var5, -16777216);
					staticMethod418(var0, var1 + var3 - var5, var2, var5, -16777216);
				}

				var1 += var5;
				var3 -= var5 * 2;
			}
		}

		var13 = (Client.staticShort2 - Client.staticShort5) * var7 / 100 + Client.staticShort5;
		Client.staticInt307 = var12 * var3 * var13 / 85504 << 1;
		if (Client.staticInt305 != var2 || Client.staticInt306 != var3) {
			int[] var14 = new int[9];

			for (int var8 = 0; var8 < 9; var8++) {
				int var11 = 143 + var8 * 32;
				int var10 = 600 + var11 * 3;
				int var9 = Rasterizer2DSub1.staticIntArray154[var11];
				var14[var8] = var9 * var10 >> 16;
			}

			staticMethod77(var14, 500, 800, var2, var3);
		}

		Client.staticInt304 = var0;
		Client.staticInt254 = var1;
		Client.staticInt305 = var2;
		Client.staticInt306 = var3;
	}

	public static Widget staticMethod32(int var0, int var1) {
		Widget var2 = staticMethod8(var0);
		return var1 == -1 ? var2
				: var2 != null && var2.aWidgetArray1 != null && var1 < var2.aWidgetArray1.length
						? var2.aWidgetArray1[var1] : null;
	}

	public static void staticMethod163(Connection var0, boolean var1) {
		if (staticConnection2 != null) {
			try {
				staticConnection2.shutdown();
			} catch (Exception var7) {
				;
			}

			staticConnection2 = null;
		}

		staticConnection2 = var0;
		staticMethod1(var1);
		staticStream3.position = 0;
		FloorUnderlayDef.staticCacheableSub4_1 = null;
		BufferedFile.staticStream2 = null;
		staticInt134 = 0;

		while (true) {
			CacheableSub4 var2 = (CacheableSub4) staticHashTable2.method146();
			if (var2 == null) {
				while (true) {
					var2 = (CacheableSub4) staticHashTable3.method146();
					if (var2 == null) {
						if (staticByte2 != 0) {
							try {
								ByteBuf var5 = new ByteBuf(4);
								var5.writeByte(4);
								var5.writeByte(staticByte2);
								var5.writeShort(0);
								staticConnection2.write(var5.buf, 0, 4);
							} catch (IOException var6) {
								try {
									staticConnection2.shutdown();
								} catch (Exception var51) {
									;
								}

								++staticInt135;
								staticConnection2 = null;
							}
						}

						staticInt129 = 0;
						staticLong8 = staticMethod297();
						return;
					}

					staticQueue1.method188(var2);
					staticHashTable4.method148(var2, var2.id);
					++staticInt132;
					--staticInt133;
				}
			}

			staticHashTable1.method148(var2, var2.id);
			++staticInt130;
			--staticInt136;
		}
	}

	public static void staticMethod164(Js5Index var0) {
		staticJs5Index8 = var0;
	}

	static final int staticMethod165() {
		return Client.staticInt252 <= 0 ? -1
				: Client.staticBool39 && KeyboardHandler.staticBoolArray2[81] && Client.staticInt217 != -1
						? Client.staticInt217 : Client.staticInt252 - 1;
	}

	static final void staticMethod209(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.method565()) {
			if (var0 instanceof Npc) {
				NpcDefinition var79 = ((Npc) var0).aNpcDef1;
				if (var79.anIntArray116 != null) {
					var79 = var79.method544();
				}

				if (var79 == null) {
					return;
				}
			}

			int var751 = staticInt24;
			int[] var14 = staticIntArray7;
			int var15 = 3;
			int var23;
			int var27;
			int var31;
			int var53;
			int var46;
			if (!var0.aClass36_3.method162()) {
				staticMethod186(var0, var0.anInt609 + 15);

				for (NodeSub3 var78 = (NodeSub3) var0.aClass36_3
						.method160(); var78 != null; var78 = (NodeSub3) var0.aClass36_3.method164()) {
					NodeSub2 var80 = var78.method293(Client.staticInt166);
					if (var80 == null) {
						if (var78.method294()) {
							var78.method174();
						}
					} else {
						CacheableSub6 var81 = var78.aCacheableSub6_1;
						Sprite var82 = var81.method529();
						Sprite var83 = var81.method528();
						int var84 = 0;
						if (var82 != null && var83 != null) {
							if (var81.anInt521 * 2 < var83.anInt672) {
								var84 = var81.anInt521;
							}

							var23 = var83.anInt672 - var84 * 2;
						} else {
							var23 = var81.anInt522;
						}

						int var87 = 255;
						int var86 = Client.staticInt166 - var80.anInt220;
						int var75 = var23 * var80.anInt218 / var81.anInt522;
						if (var80.anInt221 > var86) {
							var53 = var81.anInt517 == 0 ? 0 : var86 / var81.anInt517 * var81.anInt517;
							var27 = var80.anInt219 * var23 / var81.anInt522;
							var46 = var27 + var53 * (var75 - var27) / var80.anInt221;
						} else {
							var46 = var75;
							var53 = var81.anInt513 + var80.anInt221 - var86;
							if (var81.anInt516 >= 0) {
								var87 = (var53 << 8) / (var81.anInt513 - var81.anInt516);
							}
						}

						if (var80.anInt218 > 0 && var46 < 1) {
							var46 = 1;
						}

						var53 = var2 + Client.staticInt189 - (var23 >> 1);
						var27 = var3 + Client.staticInt180 - var15;
						if (var82 != null && var83 != null) {
							var53 -= var84;
							if (var46 == var23) {
								var46 += var84 * 2;
							} else {
								var46 += var84;
							}

							var31 = var82.anInt671;
							var15 += var31;
							if (var87 >= 0 && var87 < 255) {
								var82.method646(var53, var27, var87);
								staticMethod402(var53, var27, var46 + var53, var31 + var27);
								var83.method646(var53, var27, var87);
							} else {
								var82.method637(var53, var27);
								staticMethod402(var53, var27, var46 + var53, var31 + var27);
								var83.method637(var53, var27);
							}

							staticMethod416(var2, var3, var4 + var2, var5 + var3);
							var15 += 2;
						} else {
							if (Client.staticInt189 > -1) {
								staticMethod418(var53, var27, var46, 5, '\uff00');
								staticMethod418(var53 + var46, var27, var23 - var46, 5, 16711680);
							}

							var15 += 7;
						}
					}
				}
			}

			if (var15 < 30) {
				var15 = 30;
			}

			if (var1 < var751) {
				Player var781 = (Player) var0;
				if (var781.aBool81) {
					return;
				}

				if (var781.anInt683 != -1 || var781.anInt684 != -1) {
					staticMethod186(var0, var0.anInt609 + 15);
					if (Client.staticInt189 > -1) {
						if (var781.anInt683 != -1) {
							Class59.staticSpriteArray7[var781.anInt683].method637(Client.staticInt189 + var2 - 12,
									var3 + Client.staticInt180 - var15);
							var15 += 25;
						}

						if (var781.anInt684 != -1) {
							staticSpriteArray3[var781.anInt684].method637(var2 + Client.staticInt189 - 12,
									var3 + Client.staticInt180 - var15);
							var15 += 25;
						}
					}
				}

				if (var1 >= 0 && Client.staticInt255 == 10 && Client.staticInt193 == var14[var1]) {
					staticMethod186(var0, var0.anInt609 + 15);
					if (Client.staticInt189 > -1) {
						Class59.staticSpriteArray6[1].method637(var2 + Client.staticInt189 - 12,
								Client.staticInt180 + var3 - var15);
					}
				}
			} else {
				NpcDefinition var76 = ((Npc) var0).aNpcDef1;
				if (var76.anIntArray116 != null) {
					var76 = var76.method544();
				}

				if (var76.anInt548 >= 0 && var76.anInt548 < staticSpriteArray3.length) {
					staticMethod186(var0, 15 + var0.anInt609);
					if (Client.staticInt189 > -1) {
						staticSpriteArray3[var76.anInt548].method637(Client.staticInt189 + var2 - 12,
								Client.staticInt180 + var3 - 30);
					}
				}

				if (Client.staticInt255 == 1 && Client.staticIntArray121[var1 - var751] == Client.staticInt172
						&& Client.staticInt166 % 20 < 10) {
					staticMethod186(var0, var0.anInt609 + 15);
					if (Client.staticInt189 > -1) {
						Class59.staticSpriteArray6[0].method637(var2 + Client.staticInt189 - 12,
								Client.staticInt180 + var3 - 28);
					}
				}
			}

			if (var0.aString39 != null && (var1 >= var751 || !var0.aBool77
					&& (Client.staticInt160 == 4 || !var0.aBool75 && (Client.staticInt160 == 0 || Client.staticInt160 == 3
							|| Client.staticInt160 == 1 && staticMethod422(((Player) var0).aString40, false))))) {
				staticMethod186(var0, var0.anInt609);
				if (Client.staticInt189 > -1 && Client.staticInt187 < Client.staticInt169) {
					Client.staticIntArray85[Client.staticInt187] = GraphicsBuffer.staticRasterizer2DSub2Sub1_1
							.method613(var0.aString39) / 2;
					Client.staticIntArray87[Client.staticInt187] = GraphicsBuffer.staticRasterizer2DSub2Sub1_1.anInt669;
					Client.staticIntArray101[Client.staticInt187] = Client.staticInt189;
					Client.staticIntArray102[Client.staticInt187] = Client.staticInt180;
					Client.staticIntArray89[Client.staticInt187] = var0.anInt602;
					Client.staticIntArray90[Client.staticInt187] = var0.anInt603;
					Client.staticIntArray99[Client.staticInt187] = var0.anInt601;
					Client.staticStringArray10[Client.staticInt187] = var0.aString39;
					++Client.staticInt187;
				}
			}

			for (int var791 = 0; var791 < 4; var791++) {
				int var77 = var0.anIntArray126[var791];
				int var801 = var0.anIntArray123[var791];
				CacheableSub5 var811 = null;
				int var821 = 0;
				if (var801 >= 0) {
					if (var77 <= Client.staticInt166) {
						continue;
					}

					var811 = staticMethod197(var0.anIntArray123[var791]);
					var821 = var811.anInt473;
					if (var811 != null && var811.anIntArray107 != null) {
						var811 = var811.method501();
						if (var811 == null) {
							var0.anIntArray126[var791] = -1;
							continue;
						}
					}
				} else if (var77 < 0) {
					continue;
				}

				var23 = var0.anIntArray128[var791];
				CacheableSub5 var831 = null;
				if (var23 >= 0) {
					var831 = staticMethod197(var23);
					if (var831 != null && var831.anIntArray107 != null) {
						var831 = var831.method501();
					}
				}

				if (var77 - var821 <= Client.staticInt166) {
					if (var811 == null) {
						var0.anIntArray126[var791] = -1;
					} else {
						staticMethod186(var0, var0.anInt609 / 2);
						if (Client.staticInt189 > -1) {
							if (var791 == 1) {
								Client.staticInt180 -= 20;
							}

							if (var791 == 2) {
								Client.staticInt189 -= 15;
								Client.staticInt180 -= 10;
							}

							if (var791 == 3) {
								Client.staticInt189 += 15;
								Client.staticInt180 -= 10;
							}

							Sprite var841 = null;
							Sprite var85 = null;
							Sprite var861 = null;
							Sprite var871 = null;
							var27 = 0;
							var31 = 0;
							var53 = 0;
							var46 = 0;
							int var48 = 0;
							int var61 = 0;
							int var62 = 0;
							int var35 = 0;
							Sprite var28 = null;
							Sprite var20 = null;
							Sprite var44 = null;
							Sprite var32 = null;
							int var29 = 0;
							int var21 = 0;
							int var42 = 0;
							int var56 = 0;
							int var45 = 0;
							int var63 = 0;
							int var57 = 0;
							int var58 = 0;
							int var39 = 0;
							var841 = var811.method507();
							int var50;
							if (var841 != null) {
								var27 = var841.anInt672;
								var50 = var841.anInt671;
								if (var50 > var39) {
									var39 = var50;
								}

								var48 = var841.anInt675;
							}

							var85 = var811.method503();
							if (var85 != null) {
								var31 = var85.anInt672;
								var50 = var85.anInt671;
								if (var50 > var39) {
									var39 = var50;
								}

								var61 = var85.anInt675;
							}

							var861 = var811.method504();
							if (var861 != null) {
								var53 = var861.anInt672;
								var50 = var861.anInt671;
								if (var50 > var39) {
									var39 = var50;
								}

								var62 = var861.anInt675;
							}

							var871 = var811.method505();
							if (var871 != null) {
								var46 = var871.anInt672;
								var50 = var871.anInt671;
								if (var50 > var39) {
									var39 = var50;
								}

								var35 = var871.anInt675;
							}

							if (var831 != null) {
								var28 = var831.method507();
								if (var28 != null) {
									var29 = var28.anInt672;
									var50 = var28.anInt671;
									if (var50 > var39) {
										var39 = var50;
									}

									var45 = var28.anInt675;
								}

								var20 = var831.method503();
								if (var20 != null) {
									var21 = var20.anInt672;
									var50 = var20.anInt671;
									if (var50 > var39) {
										var39 = var50;
									}

									var63 = var20.anInt675;
								}

								var44 = var831.method504();
								if (var44 != null) {
									var42 = var44.anInt672;
									var50 = var44.anInt671;
									if (var50 > var39) {
										var39 = var50;
									}

									var57 = var44.anInt675;
								}

								var32 = var831.method505();
								if (var32 != null) {
									var56 = var32.anInt672;
									var50 = var32.anInt671;
									if (var50 > var39) {
										var39 = var50;
									}

									var58 = var32.anInt675;
								}
							}

							Rasterizer2DSub2Sub1 var89 = var811.method506();
							if (var89 == null) {
								var89 = NodeSub4.staticRasterizer2DSub2Sub1_3;
							}

							Rasterizer2DSub2Sub1 var65;
							if (var831 != null) {
								var65 = var831.method506();
								if (var65 == null) {
									var65 = NodeSub4.staticRasterizer2DSub2Sub1_3;
								}
							} else {
								var65 = NodeSub4.staticRasterizer2DSub2Sub1_3;
							}

							String var51 = null;
							String var13 = null;
							int var67 = 0;
							var51 = var811.method502(var0.anIntArray124[var791]);
							int var88 = var89.method613(var51);
							if (var831 != null) {
								var13 = var831.method502(var0.anIntArray125[var791]);
								var67 = var65.method613(var13);
							}

							int var9 = 0;
							int var68 = 0;
							if (var31 > 0) {
								if (var861 == null && var871 == null) {
									var9 = 1;
								} else {
									var9 = 1 + var88 / var31;
								}
							}

							if (var831 != null && var21 > 0) {
								if (var44 == null && var32 == null) {
									var68 = 1;
								} else {
									var68 = 1 + var67 / var21;
								}
							}

							int var11 = 0;
							int var66 = var11;
							if (var27 > 0) {
								var11 += var27;
							}

							var11 += 2;
							int var70 = var11;
							if (var53 > 0) {
								var11 += var53;
							}

							int var73 = var11;
							int var37 = var11;
							int var33;
							if (var31 > 0) {
								var33 = var31 * var9;
								var11 += var33;
								var37 += (var33 - var88) / 2;
							} else {
								var11 += var88;
							}

							var33 = var11;
							if (var46 > 0) {
								var11 += var46;
							}

							int var49 = 0;
							int var24 = 0;
							int var47 = 0;
							int var38 = 0;
							int var60 = 0;
							int var41;
							if (var831 != null) {
								var11 += 2;
								var49 = var11;
								if (var29 > 0) {
									var11 += var29;
								}

								var11 += 2;
								var24 = var11;
								if (var42 > 0) {
									var11 += var42;
								}

								var47 = var11;
								var60 = var11;
								if (var21 > 0) {
									var41 = var21 * var68;
									var11 += var41;
									var60 += (var41 - var67) / 2;
								} else {
									var11 += var67;
								}

								var38 = var11;
								if (var56 > 0) {
									var11 += var56;
								}
							}

							var41 = var0.anIntArray126[var791] - Client.staticInt166;
							int var71 = var811.anInt477 - var811.anInt477 * var41 / var811.anInt473;
							int var72 = -var811.anInt478 + var41 * var811.anInt478 / var811.anInt473;
							int var34 = var2 + Client.staticInt189 - (var11 >> 1) + var71;
							int var36 = var3 + Client.staticInt180 - 12 + var72;
							int var54 = var36;
							int var40 = var39 + var36;
							int var52 = 15 + var36 + var811.anInt480;
							int var59 = var52 - var89.anInt667;
							int var64 = var89.anInt668 + var52;
							if (var59 < var36) {
								var54 = var59;
							}

							if (var64 > var40) {
								var40 = var64;
							}

							int var69 = 0;
							int var6;
							int var30;
							if (var831 != null) {
								var69 = var831.anInt480 + 15 + var36;
								var30 = var69 - var65.anInt667;
								var6 = var69 + var65.anInt668;
								if (var30 < var54) {
									;
								}

								if (var6 > var40) {
									;
								}
							}

							var30 = 255;
							if (var811.anInt471 >= 0) {
								var30 = (var41 << 8) / (var811.anInt473 - var811.anInt471);
							}

							if (var30 >= 0 && var30 < 255) {
								if (var841 != null) {
									var841.method646(var34 + var66 - var48, var36, var30);
								}

								if (var861 != null) {
									var861.method646(var70 + var34 - var62, var36, var30);
								}

								if (var85 != null) {
									for (var6 = 0; var6 < var9; var6++) {
										var85.method646(var31 * var6 + var73 + var34 - var61, var36, var30);
									}
								}

								if (var871 != null) {
									var871.method646(var34 + var33 - var35, var36, var30);
								}

								var89.method617(var51, var37 + var34, var52, var811.anInt472, 0, var30);
								if (var831 != null) {
									if (var28 != null) {
										var28.method646(var49 + var34 - var45, var36, var30);
									}

									if (var44 != null) {
										var44.method646(var34 + var24 - var57, var36, var30);
									}

									if (var20 != null) {
										for (var6 = 0; var6 < var68; var6++) {
											var20.method646(var34 + var47 - var63 + var21 * var6, var36, var30);
										}
									}

									if (var32 != null) {
										var32.method646(var38 + var34 - var58, var36, var30);
									}

									var65.method617(var13, var34 + var60, var69, var831.anInt472, 0, var30);
								}
							} else {
								if (var841 != null) {
									var841.method637(var34 + var66 - var48, var36);
								}

								if (var861 != null) {
									var861.method637(var70 + var34 - var62, var36);
								}

								if (var85 != null) {
									for (var6 = 0; var6 < var9; var6++) {
										var85.method637(var31 * var6 + var73 + var34 - var61, var36);
									}
								}

								if (var871 != null) {
									var871.method637(var33 + var34 - var35, var36);
								}

								var89.method616(var51, var34 + var37, var52, var811.anInt472 | -16777216, 0);
								if (var831 != null) {
									if (var28 != null) {
										var28.method637(var34 + var49 - var45, var36);
									}

									if (var44 != null) {
										var44.method637(var24 + var34 - var57, var36);
									}

									if (var20 != null) {
										for (var6 = 0; var6 < var68; var6++) {
											var20.method637(var21 * var6 + var34 + var47 - var63, var36);
										}
									}

									if (var32 != null) {
										var32.method637(var38 + var34 - var58, var36);
									}

									var65.method616(var13, var60 + var34, var69, var831.anInt472 | -16777216, 0);
								}
							}
						}
					}
				}
			}
		}

	}

	static final void staticMethod33(boolean var0) {
		staticMethod17();
		++Client.staticInt273;
		if (Client.staticInt273 >= 50 || var0) {
			Client.staticInt273 = 0;
			if (!Client.staticBool43 && Class56.gameConnection != null) {
				Client.outBuffer.method471(184);

				try {
					Class56.gameConnection.write(Client.outBuffer.buf, 0,
							Client.outBuffer.position);
					Client.outBuffer.position = 0;
				} catch (IOException var2) {
					Client.staticBool43 = true;
				}
			}
		}

	}

	public static File staticMethod225(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2;
		staticFile1 = new File(Class6.staticString18, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
		String var4 = null;
		String var5 = null;
		boolean var6 = false;
		File var19;
		int var11;
		if (staticFile1.exists()) {
			try {
				FileOnDisk var18 = new FileOnDisk(staticFile1, "rw", 10000L);

				ByteBuf var15;
				int var23;
				for (var15 = new ByteBuf((int) var18.method87()); var15.position < var15.buf.length; var15.position += var23) {
					var23 = var18.method84(var15.buf, var15.position, var15.buf.length - var15.position);
					if (var23 == -1) {
						throw new IOException();
					}
				}

				var15.position = 0;
				var23 = var15.method367();
				if (var23 < 1 || var23 > 3) {
					throw new IOException("" + var23);
				}

				var11 = 0;
				if (var23 > 1) {
					var11 = var15.method367();
				}

				if (var23 <= 2) {
					var4 = var15.method374();
					if (var11 == 1) {
						var5 = var15.method374();
					}
				} else {
					var4 = var15.method340();
					if (var11 == 1) {
						var5 = var15.method340();
					}
				}

				var18.method86();
			} catch (IOException var16) {
				var16.printStackTrace();
			}

			if (var4 != null) {
				var19 = new File(var4);
				if (!var19.exists()) {
					var4 = null;
				}
			}

			if (var4 != null) {
				var19 = new File(var4, "test.dat");
				if (!staticMethod278(var19, true)) {
					var4 = null;
				}
			}
		}

		if (var4 == null && var2 == 0) {
			label103: for (int var17 = 0; var17 < staticStringArray4.length; var17++) {
				for (int var191 = 0; var191 < NodeSub10.staticStringArray6.length; var191++) {
					File var21 = new File(NodeSub10.staticStringArray6[var191] + staticStringArray4[var17]
							+ File.separatorChar + var0 + File.separatorChar);
					if (var21.exists() && staticMethod278(new File(var21, "test.dat"), true)) {
						var4 = var21.toString();
						var6 = true;
						break label103;
					}
				}
			}
		}

		if (var4 == null) {
			var4 = Class6.staticString18 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0
					+ File.separatorChar + var1 + File.separatorChar;
			var6 = true;
		}

		if (var5 != null) {
			File var181 = new File(var5);
			var19 = new File(var4);

			try {
				File[] var20 = var181.listFiles();
				File[] var22 = var20;

				for (var11 = 0; var11 < var22.length; var11++) {
					File var12 = var22[var11];
					File var13 = new File(var19, var12.getName());
					boolean var14 = var12.renameTo(var13);
					if (!var14) {
						throw new IOException();
					}
				}
			} catch (Exception var151) {
				var151.printStackTrace();
			}

			var6 = true;
		}

		if (var6) {
			staticMethod349(new File(var4), (File) null);
		}

		return new File(var4);
	}

	static final int staticMethod232(int var0, int var1) {
		int var2 = staticMethod273(var0 - 1, var1 - 1) + staticMethod273(1 + var0, var1 - 1)
				+ staticMethod273(var0 - 1, var1 + 1) + staticMethod273(var0 + 1, 1 + var1);
		int var3 = staticMethod273(var0 - 1, var1) + staticMethod273(var0 + 1, var1) + staticMethod273(var0, var1 - 1)
				+ staticMethod273(var0, var1 + 1);
		int var4 = staticMethod273(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	public static Interface3 staticMethod233(Interface3[] var0, int var1) {
		Interface3[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; var3++) {
			Interface3 var4 = var2[var3];
			if (var1 == var4.method12()) {
				return var4;
			}
		}

		return null;
	}

	static final int staticMethod234() {
		if (staticClass6_1.aBool3) {
			return NodeSub4.staticInt155;
		} else {
			int var1 = 3;
			if (NodeSub19.staticInt318 < 310) {
				int var0 = Class20.staticInt36 >> 7;
				int var3 = NodeSub3.staticInt153 >> 7;
				int var2 = AbstractClass2Sub1.staticPlayer1.anInt628 >> 7;
				int var6 = AbstractClass2Sub1.staticPlayer1.anInt591 >> 7;
				if (var0 < 0 || var3 < 0 || var0 >= 104 || var3 >= 104) {
					return NodeSub4.staticInt155;
				}

				if ((staticByteArrayArrayArray4[NodeSub4.staticInt155][var0][var3] & 0x4) != 0) {
					var1 = NodeSub4.staticInt155;
				}

				int var4;
				if (var2 > var0) {
					var4 = var2 - var0;
				} else {
					var4 = var0 - var2;
				}

				int var5;
				if (var6 > var3) {
					var5 = var6 - var3;
				} else {
					var5 = var3 - var6;
				}

				int var7;
				int var8;
				if (var4 > var5) {
					var7 = var5 * 65536 / var4;
					var8 = '\u8000';

					while (var0 != var2) {
						if (var0 < var2) {
							++var0;
						} else if (var0 > var2) {
							--var0;
						}

						if ((staticByteArrayArrayArray4[NodeSub4.staticInt155][var0][var3] & 0x4) != 0) {
							var1 = NodeSub4.staticInt155;
						}

						var8 += var7;
						if (var8 >= 65536) {
							var8 -= 65536;
							if (var3 < var6) {
								++var3;
							} else if (var3 > var6) {
								--var3;
							}

							if ((staticByteArrayArrayArray4[NodeSub4.staticInt155][var0][var3] & 0x4) != 0) {
								var1 = NodeSub4.staticInt155;
							}
						}
					}
				} else {
					var7 = var4 * 65536 / var5;
					var8 = '\u8000';

					while (var3 != var6) {
						if (var3 < var6) {
							++var3;
						} else if (var3 > var6) {
							--var3;
						}

						if ((staticByteArrayArrayArray4[NodeSub4.staticInt155][var0][var3] & 0x4) != 0) {
							var1 = NodeSub4.staticInt155;
						}

						var8 += var7;
						if (var8 >= 65536) {
							var8 -= 65536;
							if (var0 < var2) {
								++var0;
							} else if (var0 > var2) {
								--var0;
							}

							if ((staticByteArrayArrayArray4[NodeSub4.staticInt155][var0][var3] & 0x4) != 0) {
								var1 = NodeSub4.staticInt155;
							}
						}
					}
				}
			}

			if (AbstractClass2Sub1.staticPlayer1.anInt628 >= 0 && AbstractClass2Sub1.staticPlayer1.anInt591 >= 0
					&& AbstractClass2Sub1.staticPlayer1.anInt628 < 13312
					&& AbstractClass2Sub1.staticPlayer1.anInt591 < 13312) {
				if ((staticByteArrayArrayArray4[NodeSub4.staticInt155][AbstractClass2Sub1.staticPlayer1.anInt628 >> 7][AbstractClass2Sub1.staticPlayer1.anInt591 >> 7]
						& 0x4) != 0) {
					var1 = NodeSub4.staticInt155;
				}

				return var1;
			} else {
				return NodeSub4.staticInt155;
			}
		}
	}

	static final void staticMethod235(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.staticBool30 && Client.staticInt252 < 500) {
			Client.staticStringArray9[Client.staticInt252] = var0;
			Client.staticStringArray8[Client.staticInt252] = var1;
			Client.staticIntArray98[Client.staticInt252] = var2;
			Client.staticIntArray112[Client.staticInt252] = var3;
			Client.staticIntArray109[Client.staticInt252] = var4;
			Client.staticIntArray97[Client.staticInt252] = var5;
			if (var6) {
				Client.staticInt217 = Client.staticInt252;
			}

			++Client.staticInt252;
		}

	}

	static int staticMethod238(int var0, int var1) {
		NodeSub20 var2 = (NodeSub20) NodeSub20.staticHashTable7.method149(var0);
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var4 = 0;

			for (int var3 = 0; var3 < var2.anIntArray83.length; var3++) {
				if (var1 == var2.anIntArray82[var3]) {
					var4 += var2.anIntArray83[var3];
				}
			}

			return var4;
		}
	}

	static final void staticMethod239() {
		int[] var0 = staticIntArray7;

		int var2;
		for (var2 = 0; var2 < staticInt24; var2++) {
			Player var4 = Client.staticPlayerArray1[var0[var2]];
			if (var4 != null && var4.anInt601 > 0) {
				--var4.anInt601;
				if (var4.anInt601 == 0) {
					var4.aString39 = null;
				}
			}
		}

		for (var2 = 0; var2 < Client.staticInt186; var2++) {
			int var41 = Client.staticIntArray121[var2];
			Npc var1 = Client.staticNpcArray1[var41];
			if (var1 != null && var1.anInt601 > 0) {
				--var1.anInt601;
				if (var1.anInt601 == 0) {
					var1.aString39 = null;
				}
			}
		}

	}

	static final int staticMethod240(int var0, int var1, int var2) {
		int var3 = var0 >> 7;
		int var5 = var1 >> 7;
		if (var3 >= 0 && var5 >= 0 && var3 <= 103 && var5 <= 103) {
			int var6 = var2;
			if (var2 < 3 && (staticByteArrayArrayArray4[1][var3][var5] & 0x2) == 2) {
				var6 = var2 + 1;
			}

			int var4 = var0 & 0x7f;
			int var8 = var1 & 0x7f;
			int var9 = var4 * staticIntArrayArrayArray1[var6][1 + var3][var5]
					+ (128 - var4) * staticIntArrayArrayArray1[var6][var3][var5] >> 7;
			int var7 = staticIntArrayArrayArray1[var6][var3][1 + var5] * (128 - var4)
					+ var4 * staticIntArrayArrayArray1[var6][1 + var3][1 + var5] >> 7;
			return (128 - var8) * var9 + var8 * var7 >> 7;
		} else {
			return 0;
		}
	}

	static final byte[] staticMethod241(byte[] var0) {
		ByteBuf var1 = new ByteBuf(var0);
		int var3 = var1.method367();
		int var2 = var1.readInt();
		if (var2 < 0 || Js5Index.staticInt138 != 0 && var2 > Js5Index.staticInt138) {
			throw new RuntimeException();
		} else if (var3 == 0) {
			byte[] var41 = new byte[var2];
			var1.readBytes(var41, 0, var2);
			return var41;
		} else {
			int var4 = var1.readInt();
			if (var4 < 0 || Js5Index.staticInt138 != 0 && var4 > Js5Index.staticInt138) {
				throw new RuntimeException();
			} else {
				byte[] var5 = new byte[var4];
				if (var3 == 1) {
					staticMethod166(var5, var4, var0, var2, 9);
				} else {
					Js5Index.staticGZipDecompressor1.method238(var1, var5);
				}

				return var5;
			}
		}
	}

	static final void staticMethod242(Widget var0, int var1, int var2) {
		if (Client.staticWidget7 == null && !Client.staticBool30 && var0 != null) {
			Widget var4 = var0;
			int var5 = staticMethod192(var0);
			int var6 = var5 >> 17 & 0x7;
			int var7 = var6;
			Widget var3;
			int var9;
			if (var6 == 0) {
				var3 = null;
			} else {
				label72: {
					for (var9 = 0; var9 < var7; var9++) {
						var4 = staticMethod8(var4.anInt342);
						if (var4 == null) {
							var3 = null;
							break label72;
						}
					}

					var3 = var4;
				}
			}

			Widget var11 = var3;
			if (var3 == null) {
				var11 = var0.aWidget3;
			}

			if (var11 != null) {
				Client.staticWidget7 = var0;
				var4 = var0;
				var5 = staticMethod192(var0);
				var6 = var5 >> 17 & 0x7;
				var7 = var6;
				if (var6 == 0) {
					var3 = null;
				} else {
					label70: {
						for (var9 = 0; var9 < var7; var9++) {
							var4 = staticMethod8(var4.anInt342);
							if (var4 == null) {
								var3 = null;
								break label70;
							}
						}

						var3 = var4;
					}
				}

				var11 = var3;
				if (var3 == null) {
					var11 = var0.aWidget3;
				}

				Client.staticWidget8 = var11;
				Client.staticInt287 = var1;
				Client.staticInt261 = var2;
				Class2.staticInt4 = 0;
				Client.staticBool25 = false;
				int var10 = staticMethod165();
				if (var10 != -1) {
					Class20.staticContextMenuItem1 = new ContextMenuItem();
					Class20.staticContextMenuItem1.anInt7 = Client.staticIntArray109[var10];
					Class20.staticContextMenuItem1.anInt10 = Client.staticIntArray97[var10];
					Class20.staticContextMenuItem1.anInt8 = Client.staticIntArray98[var10];
					Class20.staticContextMenuItem1.anInt9 = Client.staticIntArray112[var10];
					Class20.staticContextMenuItem1.aString3 = Client.staticStringArray9[var10];
				}

				return;
			}
		}

	}

	static final void staticMethod243(Player var0, int var1, int var2, int var3) {
		if (AbstractClass2Sub1.staticPlayer1 != var0 && Client.staticInt252 < 400) {
			String var7;
			if (var0.anInt691 == 0) {
				var7 = var0.aStringArray11[0] + var0.aString40 + var0.aStringArray11[1]
						+ staticMethod211(var0.anInt685, AbstractClass2Sub1.staticPlayer1.anInt685) + " "
						+ staticString10 + "level-" + var0.anInt685 + staticString13
						+ var0.aStringArray11[2];
			} else {
				var7 = var0.aStringArray11[0] + var0.aString40 + var0.aStringArray11[1] + " " + staticString10
						+ "skill-" + var0.anInt691 + staticString13 + var0.aStringArray11[2];
			}

			int var4;
			if (Client.staticInt258 == 1) {
				staticMethod341("Use",
						Client.staticString32 + " " + staticString14 + " " + staticMethod118(16777215) + var7, 14,
						var1, var2, var3);
			} else if (Client.staticBool32) {
				if ((Class57.staticInt144 & 0x8) == 8) {
					staticMethod341(Client.staticString31,
							Client.staticString30 + " " + staticString14 + " " + staticMethod118(16777215) + var7,
							15, var1, var2, var3);
				}
			} else {
				for (var4 = 7; var4 >= 0; --var4) {
					if (Client.staticStringArray7[var4] != null) {
						short var5 = 0;
						if (Client.staticStringArray7[var4].equalsIgnoreCase("Attack")) {
							if (Class4.staticClass4_2 == Client.staticClass4_5) {
								continue;
							}

							if (Class4.staticClass4_1 == Client.staticClass4_5
									|| Class4.staticClass4_4 == Client.staticClass4_5
											&& var0.anInt685 > AbstractClass2Sub1.staticPlayer1.anInt685) {
								var5 = 2000;
							}

							if (AbstractClass2Sub1.staticPlayer1.anInt697 != 0 && var0.anInt697 != 0) {
								if (var0.anInt697 == AbstractClass2Sub1.staticPlayer1.anInt697) {
									var5 = 2000;
								} else {
									var5 = 0;
								}
							}
						} else if (Client.staticBoolArray5[var4]) {
							var5 = 2000;
						}

						int var8 = Client.staticIntArray94[var4] + var5;
						staticMethod341(Client.staticStringArray7[var4], staticMethod118(16777215) + var7, var8, var1,
								var2, var3);
					}
				}
			}

			for (var4 = 0; var4 < Client.staticInt252; var4++) {
				if (Client.staticIntArray98[var4] == 23) {
					Client.staticStringArray8[var4] = staticMethod118(16777215) + var7;
					break;
				}
			}
		}

	}

	static final void staticMethod244(byte[] var0, int var1, int var2, Scene var3, Class38[] var4) {
		ByteBuf var5 = new ByteBuf(var0);
		int var7 = -1;

		while (true) {
			int var8 = var5.method379();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;

			while (true) {
				int var11 = var5.method379();
				if (var11 == 0) {
					break;
				}

				var9 += var11 - 1;
				int var12 = var9 & 0x3f;
				int var13 = var9 >> 6 & 0x3f;
				int var14 = var9 >> 12;
				int var15 = var5.method367();
				int var16 = var15 >> 2;
				int var17 = var15 & 0x3;
				int var6 = var1 + var13;
				int var18 = var2 + var12;
				if (var6 > 0 && var18 > 0 && var6 < 103 && var18 < 103) {
					int var10 = var14;
					if ((staticByteArrayArrayArray4[1][var6][var18] & 0x2) == 2) {
						var10 = var14 - 1;
					}

					Class38 var19 = null;
					if (var10 >= 0) {
						var19 = var4[var10];
					}

					staticMethod46(var14, var6, var18, var7, var17, var16, var3, var19);
				}
			}
		}
	}

	public static boolean staticMethod251(int var0) {
		return (var0 >> 20 & 0x1) != 0;
	}

	static final int staticMethod252(long var0, String var2) {
		Random var3 = new Random();
		ByteBuf var4 = new ByteBuf(128);
		ByteBuf var5 = new ByteBuf(128);
		int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (var0 >> 32), (int) var0 };
		var4.writeByte(10);

		int var7;
		for (var7 = 0; var7 < 4; var7++) {
			var4.writeInt(var3.nextInt());
		}

		var4.writeInt(var6[0]);
		var4.writeInt(var6[1]);
		var4.method344(var0);
		var4.method344(0L);

		for (var7 = 0; var7 < 4; var7++) {
			var4.writeInt(var3.nextInt());
		}

		var4.encryptRSA(staticBigInteger1, staticBigInteger2);
		var5.writeByte(10);

		for (var7 = 0; var7 < 3; var7++) {
			var5.writeInt(var3.nextInt());
		}

		var5.method344(var3.nextLong());
		var5.writeHexByte(var3.nextLong());
		if (Client.staticByteArray6 != null) {
			var5.writeBytes(Client.staticByteArray6, 0, Client.staticByteArray6.length);
		} else {
			byte[] var20 = new byte[24];

			try {
				randomDat.seek(0L);
				randomDat.read(var20);

				int var21;
				for (var21 = 0; var21 < 24 && var20[var21] == 0; var21++) {
					;
				}

				if (var21 >= 24) {
					throw new IOException();
				}
			} catch (Exception var201) {
				for (int var11 = 0; var11 < 24; var11++) {
					var20[var11] = -1;
				}
			}

			var5.writeBytes(var20, 0, var20.length);
		}

		var5.method344(var3.nextLong());
		var5.encryptRSA(staticBigInteger1, staticBigInteger2);
		var7 = staticMethod378(var2);
		if (var7 % 8 != 0) {
			var7 += 8 - var7 % 8;
		}

		ByteBuf var211 = new ByteBuf(var7);
		var211.writeString(var2);
		var211.position = var7;
		var211.method347(var6);
		ByteBuf var221 = new ByteBuf(var211.position + var5.position + 5 + var4.position);
		var221.writeByte(2);
		var221.writeByte(var4.position);
		var221.writeBytes(var4.buf, 0, var4.position);
		var221.writeByte(var5.position);
		var221.writeBytes(var5.buf, 0, var5.position);
		var221.writeShort(var211.position);
		var221.writeBytes(var211.buf, 0, var211.position);
		byte[] var231 = var221.buf;
		String var22 = staticMethod392(var231, 0, var231.length);
		String var12 = var22;

		try {
			URL var18 = new URL(staticMethod109("services", false) + "m=accountappeal/login.ws");
			URLConnection var14 = var18.openConnection();
			var14.setDoInput(true);
			var14.setDoOutput(true);
			var14.setConnectTimeout(5000);
			OutputStreamWriter var15 = new OutputStreamWriter(var14.getOutputStream());
			var15.write("data2=" + staticMethod19(var12) + "&dest=" + staticMethod19("passwordchoice.ws"));
			var15.flush();
			InputStream var16 = var14.getInputStream();
			var221 = new ByteBuf(new byte[1000]);

			do {
				int var17 = var16.read(var221.buf, var221.position, 1000 - var221.position);
				if (var17 == -1) {
					var15.close();
					var16.close();
					String var23 = new String(var221.buf);
					if (var23.startsWith("OFFLINE")) {
						return 4;
					} else if (var23.startsWith("WRONG")) {
						return 7;
					} else if (var23.startsWith("RELOAD")) {
						return 3;
					} else if (var23.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var221.method322(var6);

						while (var221.position > 0 && var221.buf[var221.position - 1] == 0) {
							--var221.position;
						}

						var23 = new String(var221.buf, 0, var221.position);
						if (staticMethod332(var23)) {
							staticMethod125(var23, true, false);
							return 2;
						} else {
							return 5;
						}
					}
				}

				var221.position += var17;
			} while (var221.position < 1000);

			return 5;
		} catch (Throwable var19) {
			var19.printStackTrace();
			return 5;
		}
	}

	static void staticMethod253() {
		for (int var0 = 0; var0 < Client.staticInt252; var0++) {
			if (staticMethod6(Client.staticIntArray98[var0])) {
				if (var0 < Client.staticInt252 - 1) {
					for (int var1 = var0; var1 < Client.staticInt252 - 1; var1++) {
						Client.staticStringArray9[var1] = Client.staticStringArray9[var1 + 1];
						Client.staticStringArray8[var1] = Client.staticStringArray8[1 + var1];
						Client.staticIntArray98[var1] = Client.staticIntArray98[var1 + 1];
						Client.staticIntArray112[var1] = Client.staticIntArray112[1 + var1];
						Client.staticIntArray109[var1] = Client.staticIntArray109[var1 + 1];
						Client.staticIntArray97[var1] = Client.staticIntArray97[var1 + 1];
					}
				}

				--Client.staticInt252;
			}
		}

	}

	public static String staticMethod254(char var0, int var1) {
		char[] var2 = new char[var1];

		for (int var3 = 0; var3 < var1; var3++) {
			var2[var3] = var0;
		}

		return new String(var2);
	}

	public static Class55 staticMethod255(int var0) {
		Class55[] var1 = new Class55[] { Class55.staticClass55_2, Class55.staticClass55_4, Class55.staticClass55_3 };
		Class55[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; var3++) {
			Class55 var4 = var2[var3];
			if (var0 == var4.anInt207) {
				return var4;
			}
		}

		return null;
	}

	static boolean staticMethod256(BitBuf var0, int var1) {
		int var2 = var0.method477(2);
		int var4;
		int var5;
		int var6;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) {
			if (var0.method477(1) != 0) {
				staticMethod256(var0, var1);
			}

			var5 = var0.method477(13);
			var6 = var0.method477(13);
			boolean var11 = var0.method477(1) == 1;
			if (var11) {
				staticIntArray12[++staticInt22 - 1] = var1;
			}

			if (Client.staticPlayerArray1[var1] != null) {
				throw new RuntimeException();
			} else {
				Player var12 = Client.staticPlayerArray1[var1] = new Player();
				var12.anInt686 = var1;
				if (cachedAppearances[var1] != null) {
					var12.decodeAppearance(cachedAppearances[var1]);
				}

				var12.anInt630 = staticIntArray10[var1];
				var12.anInt600 = staticIntArray11[var1];
				var8 = staticIntArray9[var1];
				var4 = var8 >> 28;
				var9 = var8 >> 14 & 0xff;
				var10 = var8 & 0xff;
				var12.aByteArray24[0] = staticByteArray2[var1];
				var12.anInt698 = -1467680121 * (byte) var4;
				var12.method661((var9 << 13) + var5 - NodeSub3.staticInt154,
						var6 + (var10 << 13) - Class34.staticInt75);
				var12.aBool82 = false;
				return true;
			}
		} else if (var2 == 1) {
			var5 = var0.method477(2);
			var6 = staticIntArray9[var1];
			staticIntArray9[var1] = (((var6 >> 28) + var5 & 0x3) << 28) + (var6 & 0xfffffff);
			return false;
		} else {
			int var3;
			int var7;
			if (var2 == 2) {
				var5 = var0.method477(5);
				var6 = var5 >> 3;
				var7 = var5 & 0x7;
				var3 = staticIntArray9[var1];
				var8 = var6 + (var3 >> 28) & 0x3;
				var4 = var3 >> 14 & 0xff;
				var9 = var3 & 0xff;
				if (var7 == 0) {
					--var4;
					--var9;
				}

				if (var7 == 1) {
					--var9;
				}

				if (var7 == 2) {
					++var4;
					--var9;
				}

				if (var7 == 3) {
					--var4;
				}

				if (var7 == 4) {
					++var4;
				}

				if (var7 == 5) {
					--var4;
					++var9;
				}

				if (var7 == 6) {
					++var9;
				}

				if (var7 == 7) {
					++var4;
					++var9;
				}

				staticIntArray9[var1] = var9 + (var8 << 28) + (var4 << 14);
				return false;
			} else {
				var5 = var0.method477(18);
				var6 = var5 >> 16;
				var7 = var5 >> 8 & 0xff;
				var3 = var5 & 0xff;
				var8 = staticIntArray9[var1];
				var4 = var6 + (var8 >> 28) & 0x3;
				var9 = (var8 >> 14) + var7 & 0xff;
				var10 = var3 + var8 & 0xff;
				staticIntArray9[var1] = (var9 << 14) + (var4 << 28) + var10;
				return false;
			}
		}
	}

	static void staticMethod36(int var0, String var1, String var2) {
		staticMethod224(var0, var1, var2, (String) null);
	}

	static final void staticMethod37(int var0, int var1) {
		int var2 = GraphicsBuffer.staticRasterizer2DSub2Sub1_1.method613("Choose Option");

		int var4;
		int var5;
		for (var4 = 0; var4 < Client.staticInt252; var4++) {
			var5 = GraphicsBuffer.staticRasterizer2DSub2Sub1_1.method613(staticMethod473(var4));
			if (var5 > var2) {
				var2 = var5;
			}
		}

		var2 += 8;
		var4 = Client.staticInt252 * 15 + 22;
		var5 = var0 - var2 / 2;
		if (var2 + var5 > gameWidth) {
			var5 = gameWidth - var2;
		}

		if (var5 < 0) {
			var5 = 0;
		}

		int var3 = var1;
		if (var4 + var1 > Class47.gameHeight) {
			var3 = Class47.gameHeight - var4;
		}

		if (var3 < 0) {
			var3 = 0;
		}

		Friend.staticScene1.method121(NodeSub4.staticInt155, var0, var1, false);
		Client.staticBool30 = true;
		Class62.staticInt147 = var5;
		NodeSub20.staticInt320 = var3;
		KeyboardHandler.staticInt84 = var2;
		NpcDefinition.staticInt324 = Client.staticInt252 * 15 + 22;
	}

	static final void staticMethod38(Rasterizer2DSub3 var0) {
		short var1 = 256;

		int var4;
		for (var4 = 0; var4 < staticIntArray6.length; var4++) {
			staticIntArray6[var4] = 0;
		}

		int var5;
		for (var4 = 0; var4 < 5000; var4++) {
			var5 = (int) (Math.random() * 128.0D * var1);
			staticIntArray6[var5] = (int) (Math.random() * 256.0D);
		}

		int var2;
		int var3;
		for (var4 = 0; var4 < 20; var4++) {
			for (var5 = 1; var5 < var1 - 1; var5++) {
				for (var2 = 1; var2 < 127; var2++) {
					var3 = var2 + (var5 << 7);
					staticIntArray5[var3] = (staticIntArray6[var3 + 128]
							+ staticIntArray6[var3 - 128] + staticIntArray6[var3 - 1]
							+ staticIntArray6[var3 + 1]) / 4;
				}
			}

			int[] var6 = staticIntArray6;
			staticIntArray6 = staticIntArray5;
			staticIntArray5 = var6;
		}

		if (var0 != null) {
			var4 = 0;

			for (var5 = 0; var5 < var0.anInt678; var5++) {
				for (var2 = 0; var2 < var0.anInt677; var2++) {
					if (var0.aByteArray35[var4++] != 0) {
						var3 = var2 + 16 + var0.anInt681;
						int var8 = var0.anInt680 + 16 + var5;
						int var7 = (var8 << 7) + var3;
						staticIntArray6[var7] = 0;
					}
				}
			}
		}

	}

	static final int staticMethod259(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var6 = var0 & var2 - 1;
		int var9 = var1 / var2;
		int var8 = var1 & var2 - 1;
		int var10 = staticMethod232(var3, var9);
		int var11 = staticMethod232(var3 + 1, var9);
		int var4 = staticMethod232(var3, 1 + var9);
		int var5 = staticMethod232(1 + var3, var9 + 1);
		int var12 = staticMethod157(var10, var11, var6, var2);
		int var7 = staticMethod157(var4, var5, var6, var2);
		return staticMethod157(var12, var7, var8, var2);
	}

	static final void staticMethod260(Widget var0, int var1, int var2) {
		if (var0.anInt331 == 1) {
			staticMethod341(var0.aString18, "", 24, 0, 0, var0.anInt294);
		}

		String var3;
		int var5;
		int var6;
		if (var0.anInt331 == 2 && !Client.staticBool32) {
			var5 = staticMethod192(var0);
			var6 = var5 >> 11 & 0x3f;
			if (var6 == 0) {
				var3 = null;
			} else if (var0.aString22 != null && var0.aString22.trim().length() != 0) {
				var3 = var0.aString22;
			} else {
				var3 = null;
			}

			if (var3 != null) {
				staticMethod341(var3, staticMethod118('\uff00') + var0.aString23, 25, 0, -1, var0.anInt294);
			}
		}

		if (var0.anInt331 == 3) {
			staticMethod341("Close", "", 26, 0, 0, var0.anInt294);
		}

		if (var0.anInt331 == 4) {
			staticMethod341(var0.aString18, "", 28, 0, 0, var0.anInt294);
		}

		if (var0.anInt331 == 5) {
			staticMethod341(var0.aString18, "", 29, 0, 0, var0.anInt294);
		}

		if (var0.anInt331 == 6 && Client.staticWidget6 == null) {
			staticMethod341(var0.aString18, "", 30, 0, -1, var0.anInt294);
		}

		int var20;
		if (var0.anInt296 == 2) {
			var20 = 0;

			for (var6 = 0; var6 < var0.anInt351; var6++) {
				for (var5 = 0; var5 < var0.anInt307; var5++) {
					int var25 = (var0.anInt297 + 32) * var5;
					int var12 = (var0.anInt333 + 32) * var6;
					if (var20 < 20) {
						var25 += var0.anIntArray75[var20];
						var12 += var0.anIntArray72[var20];
					}

					if (var1 >= var25 && var2 >= var12 && var1 < var25 + 32 && var2 < 32 + var12) {
						Client.staticInt230 = var20;
						Class34.staticWidget3 = var0;
						if (var0.anIntArray76[var20] > 0) {
							label321: {
								ItemDefinition var4 = staticMethod153(var0.anIntArray76[var20] - 1);
								boolean var8;
								int var14;
								if (Client.staticInt258 == 1) {
									var14 = staticMethod192(var0);
									var8 = (var14 >> 30 & 0x1) != 0;
									if (var8) {
										if (var0.anInt294 != GameObject.staticInt332 || staticInt102 != var20) {
											staticMethod341("Use",
													Client.staticString32 + " " + staticString14 + " "
															+ staticMethod118(16748608) + var4.aString31,
													31, var4.anInt437, var20, var0.anInt294);
										}
										break label321;
									}
								}

								if (Client.staticBool32) {
									var14 = staticMethod192(var0);
									var8 = (var14 >> 30 & 0x1) != 0;
									if (var8) {
										if ((Class57.staticInt144 & 0x10) == 16) {
											staticMethod341(Client.staticString31,
													Client.staticString30 + " " + staticString14 + " "
															+ staticMethod118(16748608) + var4.aString31,
													32, var4.anInt437, var20, var0.anInt294);
										}
										break label321;
									}
								}

								String[] var23 = var4.aStringArray6;
								if (Client.staticBool34) {
									var23 = staticMethod425(var23);
								}

								var14 = var4.method499();
								int var16 = staticMethod192(var0);
								boolean var17 = (var16 >> 30 & 0x1) != 0;
								int var22;
								boolean var26;
								if (var17) {
									for (var22 = 4; var22 >= 3; --var22) {
										var26 = var14 == var22;
										if (var23 != null && var23[var22] != null) {
											byte var18;
											if (var22 == 3) {
												var18 = 36;
											} else {
												var18 = 37;
											}

											staticMethod235(var23[var22], staticMethod118(16748608) + var4.aString31,
													var18, var4.anInt437, var20, var0.anInt294, var26);
										} else if (var22 == 4) {
											staticMethod235("Drop", staticMethod118(16748608) + var4.aString31, 37,
													var4.anInt437, var20, var0.anInt294, var26);
										}
									}
								}

								var22 = staticMethod192(var0);
								var26 = (var22 >> 31 & 0x1) != 0;
								if (var26) {
									staticMethod341("Use", staticMethod118(16748608) + var4.aString31, 38,
											var4.anInt437, var20, var0.anInt294);
								}

								int var231 = staticMethod192(var0);
								boolean var27 = (var231 >> 30 & 0x1) != 0;
								int var9;
								if (var27 && var23 != null) {
									for (var9 = 2; var9 >= 0; --var9) {
										boolean var24 = var9 == var14;
										if (var23[var9] != null) {
											byte var19 = 0;
											if (var9 == 0) {
												var19 = 33;
											}

											if (var9 == 1) {
												var19 = 34;
											}

											if (var9 == 2) {
												var19 = 35;
											}

											staticMethod235(var23[var9], staticMethod118(16748608) + var4.aString31,
													var19, var4.anInt437, var20, var0.anInt294, var24);
										}
									}
								}

								var23 = var0.aStringArray3;
								if (Client.staticBool34) {
									var23 = staticMethod425(var23);
								}

								if (var23 != null) {
									for (var9 = 4; var9 >= 0; --var9) {
										if (var23[var9] != null) {
											byte var241 = 0;
											if (var9 == 0) {
												var241 = 39;
											}

											if (var9 == 1) {
												var241 = 40;
											}

											if (var9 == 2) {
												var241 = 41;
											}

											if (var9 == 3) {
												var241 = 42;
											}

											if (var9 == 4) {
												var241 = 43;
											}

											staticMethod341(var23[var9], staticMethod118(16748608) + var4.aString31,
													var241, var4.anInt437, var20, var0.anInt294);
										}
									}
								}

								staticMethod341("Examine", staticMethod118(16748608) + var4.aString31, 1005,
										var4.anInt437, var20, var0.anInt294);
							}
						}
					}

					++var20;
				}
			}
		}

		if (var0.aBool42) {
			if (Client.staticBool32) {
				if (staticMethod272(staticMethod192(var0)) && (Class57.staticInt144 & 0x20) == 32) {
					staticMethod341(Client.staticString31,
							Client.staticString30 + " " + staticString14 + " " + var0.aString21, 58, 0,
							var0.anInt319, var0.anInt294);
				}
			} else {
				String var221;
				for (var20 = 9; var20 >= 5; --var20) {
					var221 = staticMethod374(var0, var20);
					if (var221 != null) {
						staticMethod341(var221, var0.aString21, 1007, var20 + 1, var0.anInt319, var0.anInt294);
					}
				}

				var5 = staticMethod192(var0);
				var6 = var5 >> 11 & 0x3f;
				if (var6 == 0) {
					var3 = null;
				} else if (var0.aString22 != null && var0.aString22.trim().length() != 0) {
					var3 = var0.aString22;
				} else {
					var3 = null;
				}

				if (var3 != null) {
					staticMethod341(var3, var0.aString21, 25, 0, var0.anInt319, var0.anInt294);
				}

				for (var5 = 4; var5 >= 0; --var5) {
					var221 = staticMethod374(var0, var5);
					if (var221 != null) {
						staticMethod341(var221, var0.aString21, 57, var5 + 1, var0.anInt319, var0.anInt294);
					}
				}

				if (staticMethod28(staticMethod192(var0))) {
					staticMethod341("Continue", "", 30, 0, var0.anInt319, var0.anInt294);
				}
			}
		}

	}

	static final void staticMethod261(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; var2++) {
			Widget var3 = var0[var2];
			if (var3 != null && var3.anInt342 == var1 && (!var3.aBool42 || !staticMethod247(var3))) {
				if (var3.anInt296 == 0) {
					if (!var3.aBool42 && staticMethod247(var3) && var3 != Class56.staticWidget4) {
						continue;
					}

					staticMethod261(var0, var3.anInt294);
					if (var3.aWidgetArray1 != null) {
						staticMethod261(var3.aWidgetArray1, var3.anInt294);
					}

					KeyFocusListener var5 = (KeyFocusListener) Client.staticHashTable5.method149(var3.anInt294);
					if (var5 != null) {
						staticMethod14(var5.anInt384);
					}
				}

				if (var3.anInt296 == 6) {
					int var7;
					if (var3.anInt327 != -1 || var3.anInt328 != -1) {
						boolean var8 = staticMethod318(var3);
						if (var8) {
							var7 = var3.anInt328;
						} else {
							var7 = var3.anInt327;
						}

						if (var7 != -1) {
							AnimDef var6 = staticMethod210(var7);

							for (var3.anInt314 += Client.staticInt171; var3.anInt314 > var6.anIntArray119[var3.anInt354]; staticMethod73(
									var3)) {
								var3.anInt314 -= var6.anIntArray119[var3.anInt354];
								++var3.anInt354;
								if (var3.anInt354 >= var6.anIntArray121.length) {
									var3.anInt354 -= var6.anInt562;
									if (var3.anInt354 < 0 || var3.anInt354 >= var6.anIntArray121.length) {
										var3.anInt354 = 0;
									}
								}
							}
						}
					}

					if (var3.anInt336 != 0 && !var3.aBool42) {
						int var81 = var3.anInt336 >> 16;
						var7 = var3.anInt336 << 16 >> 16;
						var81 *= Client.staticInt171;
						var7 *= Client.staticInt171;
						var3.anInt325 = var3.anInt325 + var81 & 0x7ff;
						var3.anInt332 = var7 + var3.anInt332 & 0x7ff;
						staticMethod73(var3);
					}
				}
			}
		}

	}

	static final void staticMethod262(int var0, int var1) {
		Class39 var2 = Client.staticClass39ArrayArrayArray1[NodeSub4.staticInt155][var0][var1];
		if (var2 == null) {
			Friend.staticScene1.method109(NodeSub4.staticInt155, var0, var1);
		} else {
			long var4 = -99999999L;
			Item var3 = null;

			Item var7;
			for (var7 = (Item) var2.method195(); var7 != null; var7 = (Item) var2.method193()) {
				ItemDefinition var12 = staticMethod153(var7.anInt573);
				long var11 = var12.anInt460;
				if (var12.anInt442 == 1) {
					var11 *= var7.anInt574 + 1;
				}

				if (var11 > var4) {
					var4 = var11;
					var3 = var7;
				}
			}

			if (var3 == null) {
				Friend.staticScene1.method109(NodeSub4.staticInt155, var0, var1);
			} else {
				var2.method192(var3);
				Item var121 = null;
				Item var111 = null;

				for (var7 = (Item) var2.method195(); var7 != null; var7 = (Item) var2.method193()) {
					if (var7.anInt573 != var3.anInt573) {
						if (var121 == null) {
							var121 = var7;
						}

						if (var121.anInt573 != var7.anInt573 && var111 == null) {
							var111 = var7;
						}
					}
				}

				int var6 = 1610612736 + var0 + (var1 << 7);
				Friend.staticScene1.method113(NodeSub4.staticInt155, var0, var1,
						staticMethod240(var0 * 128 + 64, 64 + var1 * 128, NodeSub4.staticInt155), var3, var6, var121,
						var111);
			}
		}

	}

	static final void staticMethod263(BitBuf var0) {
		int var1 = 0;
		var0.method475();

		int var2;
		int var3;
		int var4;
		for (var3 = 0; var3 < staticInt24; var3++) {
			var4 = staticIntArray7[var3];
			if ((staticByteArray1[var4] & 0x1) == 0) {
				if (var1 > 0) {
					--var1;
					staticByteArray1[var4] = (byte) (staticByteArray1[var4] | 2);
				} else {
					var2 = var0.method477(1);
					if (var2 == 0) {
						var1 = staticMethod18(var0);
						staticByteArray1[var4] = (byte) (staticByteArray1[var4] | 2);
					} else {
						staticMethod207(var0, var4);
					}
				}
			}
		}

		var0.method474();
		if (var1 != 0) {
			throw new RuntimeException();
		} else {
			var0.method475();

			for (var3 = 0; var3 < staticInt24; var3++) {
				var4 = staticIntArray7[var3];
				if ((staticByteArray1[var4] & 0x1) != 0) {
					if (var1 > 0) {
						--var1;
						staticByteArray1[var4] = (byte) (staticByteArray1[var4] | 2);
					} else {
						var2 = var0.method477(1);
						if (var2 == 0) {
							var1 = staticMethod18(var0);
							staticByteArray1[var4] = (byte) (staticByteArray1[var4] | 2);
						} else {
							staticMethod207(var0, var4);
						}
					}
				}
			}

			var0.method474();
			if (var1 != 0) {
				throw new RuntimeException();
			} else {
				var0.method475();

				for (var3 = 0; var3 < staticInt23; var3++) {
					var4 = staticIntArray8[var3];
					if ((staticByteArray1[var4] & 0x1) != 0) {
						if (var1 > 0) {
							--var1;
							staticByteArray1[var4] = (byte) (staticByteArray1[var4] | 2);
						} else {
							var2 = var0.method477(1);
							if (var2 == 0) {
								var1 = staticMethod18(var0);
								staticByteArray1[var4] = (byte) (staticByteArray1[var4] | 2);
							} else if (staticMethod256(var0, var4)) {
								staticByteArray1[var4] = (byte) (staticByteArray1[var4] | 2);
							}
						}
					}
				}

				var0.method474();
				if (var1 != 0) {
					throw new RuntimeException();
				} else {
					var0.method475();

					for (var3 = 0; var3 < staticInt23; var3++) {
						var4 = staticIntArray8[var3];
						if ((staticByteArray1[var4] & 0x1) == 0) {
							if (var1 > 0) {
								--var1;
								staticByteArray1[var4] = (byte) (staticByteArray1[var4] | 2);
							} else {
								var2 = var0.method477(1);
								if (var2 == 0) {
									var1 = staticMethod18(var0);
									staticByteArray1[var4] = (byte) (staticByteArray1[var4] | 2);
								} else if (staticMethod256(var0, var4)) {
									staticByteArray1[var4] = (byte) (staticByteArray1[var4] | 2);
								}
							}
						}
					}

					var0.method474();
					if (var1 != 0) {
						throw new RuntimeException();
					} else {
						staticInt24 = 0;
						staticInt23 = 0;

						for (var3 = 1; var3 < 2048; var3++) {
							staticByteArray1[var3] = (byte) (staticByteArray1[var3] >> 1);
							Player var5 = Client.staticPlayerArray1[var3];
							if (var5 != null) {
								staticIntArray7[++staticInt24 - 1] = var3;
							} else {
								staticIntArray8[++staticInt23 - 1] = var3;
							}
						}

					}
				}
			}
		}
	}

	public static void staticMethod264(int var0) {
		if (staticInt118 != 0) {
			Class7.staticInt32 = var0;
		} else {
			staticNodeSub8Sub3_1.method457(var0);
		}

	}

	public static String staticMethod265(String var0) {
		int var1 = var0.length();
		char[] var3 = new char[var1];
		byte var4 = 2;

		for (int var5 = 0; var5 < var1; var5++) {
			char var2 = var0.charAt(var5);
			if (var4 == 0) {
				var2 = Character.toLowerCase(var2);
			} else if (var4 == 2 || Character.isUpperCase(var2)) {
				var2 = staticMethod67(var2);
			}

			if (Character.isLetter(var2)) {
				var4 = 0;
			} else if (var2 != 46 && var2 != 63 && var2 != 33) {
				if (Character.isSpaceChar(var2)) {
					if (var4 != 2) {
						var4 = 1;
					}
				} else {
					var4 = 1;
				}
			} else {
				var4 = 2;
			}

			var3[var5] = var2;
		}

		return new String(var3);
	}

	static final void staticMethod266(KeyFocusListener var0, boolean var1) {
		int var2 = var0.anInt384;
		int var4 = (int) var0.id;
		var0.method174();
		int var3;
		if (var1 && var2 != -1 && Npc.staticBoolArray12[var2]) {
			Widget.staticJs5Index10.method265(var2);
			if (Widget.staticWidgetArrayArray1[var2] != null) {
				boolean var6 = true;

				for (var3 = 0; var3 < Widget.staticWidgetArrayArray1[var2].length; var3++) {
					if (Widget.staticWidgetArrayArray1[var2][var3] != null) {
						if (Widget.staticWidgetArrayArray1[var2][var3].anInt296 != 2) {
							Widget.staticWidgetArrayArray1[var2][var3] = null;
						} else {
							var6 = false;
						}
					}
				}

				if (var6) {
					Widget.staticWidgetArrayArray1[var2] = null;
				}

				Npc.staticBoolArray12[var2] = false;
			}
		}

		staticMethod380(var2);
		Widget var61 = staticMethod8(var4);
		if (var61 != null) {
			staticMethod73(var61);
		}

		staticMethod253();
		if (Client.staticInt263 != -1) {
			var3 = Client.staticInt263;
			if (staticMethod4(var3)) {
				staticMethod280(Widget.staticWidgetArrayArray1[var3], 1);
			}
		}

	}

	static void staticMethod267(byte[] var0, int var1) {
		if (Client.staticByteArray6 == null) {
			Client.staticByteArray6 = new byte[24];
		}

		staticMethod217(var0, var1, Client.staticByteArray6, 0, 24);
	}

	public static RuntimeExceptionSub1 staticMethod268(Throwable var0, String var1) {
		RuntimeExceptionSub1 var2;
		if (var0 instanceof RuntimeExceptionSub1) {
			var2 = (RuntimeExceptionSub1) var0;
			var2.aString8 = var2.aString8 + ' ' + var1;
		} else {
			var2 = new RuntimeExceptionSub1(var0, var1);
		}

		return var2;
	}

	static int staticMethod269(int var0, CacheableSub1 var1, boolean var2) {
		if (var0 == 3200) {
			staticInt27 -= 3;
			staticMethod311(staticIntArray16[staticInt27],
					staticIntArray16[staticInt27 + 1], staticIntArray16[staticInt27 + 2]);
			return 1;
		} else {
			int var3;
			if (var0 != 3201) {
				if (var0 == 3202) {
					staticInt27 -= 2;
					var3 = staticIntArray16[staticInt27];
					if (Client.staticInt299 != 0 && var3 != -1) {
						staticMethod30(Class56.staticJs5IndexImpl6, var3, 0, Client.staticInt299, false);
						Client.staticBool38 = true;
					}

					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = staticIntArray16[--staticInt27];
				if (var3 == -1 && !Client.staticBool38) {
					staticNodeSub8Sub3_1.method440();
					staticInt118 = 1;
					staticJs5Index3 = null;
				} else if (var3 != -1 && Client.staticInt249 != var3 && Client.staticInt299 != 0 && !Client.staticBool38) {
					Js5IndexImpl var4 = Class34.staticJs5IndexImpl3;
					int var5 = Client.staticInt299;
					staticInt118 = 1;
					staticJs5Index3 = var4;
					staticInt119 = var3;
					staticInt127 = 0;
					Class7.staticInt32 = var5;
					staticBool16 = false;
					NodeSub1.staticInt151 = 2;
				}

				Client.staticInt249 = var3;
				return 1;
			}
		}
	}

	static void staticMethod270() {
		FileOnDisk var0 = null;

		try {
			var0 = staticMethod70("", KeyFocusListener.staticGameType7.aString9, true);
			ByteBuf var1 = staticClass6_1.method23();
			var0.method88(var1.buf, 0, var1.position);
		} catch (Exception var3) {
			;
		}

		try {
			if (var0 != null) {
				var0.method86();
			}
		} catch (Exception var2) {
			;
		}

	}

	static final void staticMethod271(int var0, int var1, int var2, int var3, int var4) {
		int var5 = Friend.staticScene1.method142(var0, var1, var2);
		int var6;
		int var7;
		int var8;
		int var10;
		int var12;
		int var15;
		Rasterizer2DSub3 var19;
		if (var5 != 0) {
			var7 = Friend.staticScene1.method117(var0, var1, var2, var5);
			var8 = var7 >> 6 & 0x3;
			var15 = var7 & 0x1f;
			var6 = var3;
			if (var5 > 0) {
				var6 = var4;
			}

			int[] var17 = Actor.staticSprite5.anIntArray154;
			var12 = var1 * 4 + 24624 + (103 - var2) * 2048;
			var10 = var5 >> 14 & 0x7fff;
			ObjectDefinition var23 = staticMethod394(var10);
			if (var23.anInt507 != -1) {
				var19 = Class20.staticRasterizer2DSub3Array1[var23.anInt507];
				if (var19 != null) {
					int var14 = (var23.anInt485 * 4 - var19.anInt677) / 2;
					int var16 = (var23.anInt486 * 4 - var19.anInt678) / 2;
					var19.method655(var14 + var1 * 4 + 48, 48 + (104 - var2 - var23.anInt486) * 4 + var16);
				}
			} else {
				if (var15 == 0 || var15 == 2) {
					if (var8 == 0) {
						var17[var12] = var6;
						var17[var12 + 512] = var6;
						var17[1024 + var12] = var6;
						var17[1536 + var12] = var6;
					} else if (var8 == 1) {
						var17[var12] = var6;
						var17[var12 + 1] = var6;
						var17[var12 + 2] = var6;
						var17[3 + var12] = var6;
					} else if (var8 == 2) {
						var17[var12 + 3] = var6;
						var17[512 + var12 + 3] = var6;
						var17[1024 + var12 + 3] = var6;
						var17[3 + var12 + 1536] = var6;
					} else if (var8 == 3) {
						var17[1536 + var12] = var6;
						var17[var12 + 1536 + 1] = var6;
						var17[2 + var12 + 1536] = var6;
						var17[1536 + var12 + 3] = var6;
					}
				}

				if (var15 == 3) {
					if (var8 == 0) {
						var17[var12] = var6;
					} else if (var8 == 1) {
						var17[3 + var12] = var6;
					} else if (var8 == 2) {
						var17[1536 + var12 + 3] = var6;
					} else if (var8 == 3) {
						var17[1536 + var12] = var6;
					}
				}

				if (var15 == 2) {
					if (var8 == 3) {
						var17[var12] = var6;
						var17[512 + var12] = var6;
						var17[1024 + var12] = var6;
						var17[1536 + var12] = var6;
					} else if (var8 == 0) {
						var17[var12] = var6;
						var17[var12 + 1] = var6;
						var17[2 + var12] = var6;
						var17[var12 + 3] = var6;
					} else if (var8 == 1) {
						var17[var12 + 3] = var6;
						var17[515 + var12] = var6;
						var17[1027 + var12] = var6;
						var17[3 + var12 + 1536] = var6;
					} else if (var8 == 2) {
						var17[var12 + 1536] = var6;
						var17[1536 + var12 + 1] = var6;
						var17[1538 + var12] = var6;
						var17[1539 + var12] = var6;
					}
				}
			}
		}

		var5 = Friend.staticScene1.method119(var0, var1, var2);
		ObjectDefinition var171;
		if (var5 != 0) {
			var7 = Friend.staticScene1.method117(var0, var1, var2, var5);
			var8 = var7 >> 6 & 0x3;
			var15 = var7 & 0x1f;
			var6 = var5 >> 14 & 0x7fff;
			var171 = staticMethod394(var6);
			int var231;
			if (var171.anInt507 != -1) {
				var19 = Class20.staticRasterizer2DSub3Array1[var171.anInt507];
				if (var19 != null) {
					var10 = (var171.anInt485 * 4 - var19.anInt677) / 2;
					var231 = (var171.anInt486 * 4 - var19.anInt678) / 2;
					var19.method655(48 + var1 * 4 + var10, (104 - var2 - var171.anInt486) * 4 + 48 + var231);
				}
			} else if (var15 == 9) {
				var12 = 15658734;
				if (var5 > 0) {
					var12 = 15597568;
				}

				int[] var191 = Actor.staticSprite5.anIntArray154;
				var231 = (103 - var2) * 2048 + 24624 + var1 * 4;
				if (var8 != 0 && var8 != 2) {
					var191[var231] = var12;
					var191[513 + var231] = var12;
					var191[2 + var231 + 1024] = var12;
					var191[1536 + var231 + 3] = var12;
				} else {
					var191[var231 + 1536] = var12;
					var191[1025 + var231] = var12;
					var191[var231 + 512 + 2] = var12;
					var191[var231 + 3] = var12;
				}
			}
		}

		var5 = Friend.staticScene1.method116(var0, var1, var2);
		if (var5 != 0) {
			var7 = var5 >> 14 & 0x7fff;
			var171 = staticMethod394(var7);
			if (var171.anInt507 != -1) {
				Rasterizer2DSub3 var232 = Class20.staticRasterizer2DSub3Array1[var171.anInt507];
				if (var232 != null) {
					var6 = (var171.anInt485 * 4 - var232.anInt677) / 2;
					int var192 = (var171.anInt486 * 4 - var232.anInt678) / 2;
					var232.method655(var1 * 4 + 48 + var6, var192 + (104 - var2 - var171.anInt486) * 4 + 48);
				}
			}
		}

	}

	public static boolean staticMethod272(int var0) {
		return (var0 >> 21 & 0x1) != 0;
	}

	static final int staticMethod273(int var0, int var1) {
		int var2 = var0 + var1 * 57;
		var2 ^= var2 << 13;
		int var3 = 1376312589 + (var2 * var2 * 15731 + 789221) * var2 & 0x7fffffff;
		return var3 >> 19 & 0xff;
	}

	public static Rasterizer2DSub3[] staticMethod274(Js5Index var0, String var1, String var2) {
		int var3 = var0.method267(var1);
		int var6 = var0.method268(var3, var2);
		Rasterizer2DSub3[] var7;
		if (!staticMethod65(var0, var3, var6)) {
			var7 = null;
		} else {
			Rasterizer2DSub3[] var4 = new Rasterizer2DSub3[staticInt143];

			for (int var8 = 0; var8 < staticInt143; var8++) {
				Rasterizer2DSub3 var9 = var4[var8] = new Rasterizer2DSub3();
				var9.anInt676 = staticInt139;
				var9.anInt679 = staticInt142;
				var9.anInt681 = NodeSub20.staticIntArray126[var8];
				var9.anInt680 = staticIntArray69[var8];
				var9.anInt677 = staticIntArray72[var8];
				var9.anInt678 = staticIntArray71[var8];
				var9.anIntArray155 = staticIntArray73;
				var9.aByteArray35 = CanvasSub1.staticByteArrayArray2[var8];
			}

			NodeSub20.staticIntArray126 = null;
			staticIntArray69 = null;
			staticIntArray72 = null;
			staticIntArray71 = null;
			staticIntArray73 = null;
			CanvasSub1.staticByteArrayArray2 = null;
			var7 = var4;
		}

		return var7;
	}

	public static String staticMethod49(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var81 = var0[var1];
			return var81 == null ? "null" : var81.toString();
		} else {
			int var6 = var2 + var1;
			int var4 = 0;

			for (int var9 = var1; var9 < var6; var9++) {
				CharSequence var8 = var0[var9];
				if (var8 == null) {
					var4 += 4;
				} else {
					var4 += var8.length();
				}
			}

			StringBuilder var91 = new StringBuilder(var4);

			for (int var10 = var1; var10 < var6; var10++) {
				CharSequence var7 = var0[var10];
				if (var7 == null) {
					var91.append("null");
				} else {
					var91.append(var7);
				}
			}

			return var91.toString();
		}
	}

	static void staticMethod50(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var7 = (var1 + var0) / 2;
			int var6 = var0;
			Class2 var8 = Class2.staticClass2Array1[var7];
			Class2.staticClass2Array1[var7] = Class2.staticClass2Array1[var1];
			Class2.staticClass2Array1[var1] = var8;

			for (int var9 = var0; var9 < var1; var9++) {
				Class2 var11 = Class2.staticClass2Array1[var9];
				int var10 = staticMethod112(var11, var8, var2, var3);
				int var12;
				if (var10 != 0) {
					if (var3) {
						var12 = -var10;
					} else {
						var12 = var10;
					}
				} else if (var4 == -1) {
					var12 = 0;
				} else {
					int var14 = staticMethod112(var11, var8, var4, var5);
					if (var5) {
						var12 = -var14;
					} else {
						var12 = var14;
					}
				}

				if (var12 <= 0) {
					Class2 var141 = Class2.staticClass2Array1[var9];
					Class2.staticClass2Array1[var9] = Class2.staticClass2Array1[var6];
					Class2.staticClass2Array1[var6++] = var141;
				}
			}

			Class2.staticClass2Array1[var1] = Class2.staticClass2Array1[var6];
			Class2.staticClass2Array1[var6] = var8;
			staticMethod50(var0, var6 - 1, var2, var3, var4, var5);
			staticMethod50(var6 + 1, var1, var2, var3, var4, var5);
		}

	}

	public static int staticMethod51(String var0) {
		return var0.length() + 2;
	}

	public static SoundEffect staticMethod52(Js5Index var0, int var1, int var2) {
		byte[] var3 = var0.getFile(var1, var2);
		return var3 == null ? null : new SoundEffect(new ByteBuf(var3));
	}

	static final void staticMethod117(Widget var0, int var1, int var2, int var3) {
		CacheableSub3 var4 = var0.method389(false);
		if (var4 != null) {
			if (Client.staticInt298 < 3) {
				Class59.staticSprite3.method642(var1, var2, var4.anInt426, var4.anInt427, 25, 25, Client.staticInt221,
						256, var4.anIntArray101, var4.anIntArray102);
			} else {
				staticMethod421(var1, var2, 0, var4.anIntArray101, var4.anIntArray102);
			}
		}

	}

	static final void staticMethod14(int var0) {
		if (staticMethod4(var0)) {
			staticMethod261(Widget.staticWidgetArrayArray1[var0], -1);
		}

	}

	static final void staticMethod15(Actor var0) {
		var0.aBool74 = false;
		AnimDef var1;
		if (var0.anInt590 != -1) {
			var1 = staticMethod210(var0.anInt590);
			if (var1 != null && var1.anIntArray121 != null) {
				++var0.anInt611;
				if (var0.anInt610 < var1.anIntArray121.length && var0.anInt611 > var1.anIntArray119[var0.anInt610]) {
					var0.anInt611 = 1;
					++var0.anInt610;
					staticMethod159(var1, var0.anInt610, var0.anInt628, var0.anInt591);
				}

				if (var0.anInt610 >= var1.anIntArray121.length) {
					var0.anInt611 = 0;
					var0.anInt610 = 0;
					staticMethod159(var1, var0.anInt610, var0.anInt628, var0.anInt591);
				}
			} else {
				var0.anInt590 = -1;
			}
		}

		if (var0.anInt596 != -1 && Client.staticInt166 >= var0.anInt619) {
			if (var0.anInt616 < 0) {
				var0.anInt616 = 0;
			}

			int var3 = staticMethod322(var0.anInt596).anInt556;
			if (var3 != -1) {
				AnimDef var2 = staticMethod210(var3);
				if (var2 != null && var2.anIntArray121 != null) {
					++var0.anInt618;
					if (var0.anInt616 < var2.anIntArray121.length
							&& var0.anInt618 > var2.anIntArray119[var0.anInt616]) {
						var0.anInt618 = 1;
						++var0.anInt616;
						staticMethod159(var2, var0.anInt616, var0.anInt628, var0.anInt591);
					}

					if (var0.anInt616 >= var2.anIntArray121.length
							&& (var0.anInt616 < 0 || var0.anInt616 >= var2.anIntArray121.length)) {
						var0.anInt596 = -1;
					}
				} else {
					var0.anInt596 = -1;
				}
			} else {
				var0.anInt596 = -1;
			}
		}

		if (var0.anInt612 != -1 && var0.anInt615 <= 1) {
			var1 = staticMethod210(var0.anInt612);
			if (var1.anInt566 == 1 && var0.anInt599 > 0 && var0.anInt625 <= Client.staticInt166
					&& var0.anInt604 < Client.staticInt166) {
				var0.anInt615 = 1;
				return;
			}
		}

		if (var0.anInt612 != -1 && var0.anInt615 == 0) {
			var1 = staticMethod210(var0.anInt612);
			if (var1 != null && var1.anIntArray121 != null) {
				++var0.anInt614;
				if (var0.anInt613 < var1.anIntArray121.length && var0.anInt614 > var1.anIntArray119[var0.anInt613]) {
					var0.anInt614 = 1;
					++var0.anInt613;
					staticMethod159(var1, var0.anInt613, var0.anInt628, var0.anInt591);
				}

				if (var0.anInt613 >= var1.anIntArray121.length) {
					var0.anInt613 -= var1.anInt562;
					++var0.anInt593;
					if (var0.anInt593 >= var1.anInt561) {
						var0.anInt612 = -1;
					} else if (var0.anInt613 >= 0 && var0.anInt613 < var1.anIntArray121.length) {
						staticMethod159(var1, var0.anInt613, var0.anInt628, var0.anInt591);
					} else {
						var0.anInt612 = -1;
					}
				}

				var0.aBool74 = var1.aBool72;
			} else {
				var0.anInt612 = -1;
			}
		}

		if (var0.anInt615 > 0) {
			--var0.anInt615;
		}

	}

	public static Object staticMethod16(byte[] var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else {
			if (var0.length > 136 && !AbstractClass4.staticBool17) {
				try {
					AbstractClass4Sub1 var3 = new AbstractClass4Sub1();
					var3.method253(var0);
					return var3;
				} catch (Throwable var31) {
					AbstractClass4.staticBool17 = true;
				}
			}

			return var1 ? staticMethod13(var0) : var0;
		}
	}

	static char staticMethod67(char var0) {
		return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
	}

	public static boolean staticMethod257() {
		return staticInt118 != 0 ? true : staticNodeSub8Sub3_1.method441();
	}

	static void staticMethod139(GameShell var0) {
		int var1;
		int var5;
		int var11;
		int var12;
		if (staticBool1) {
			if (MouseHandler.staticInt98 == 1 || !staticBool18 && MouseHandler.staticInt98 == 4) {
				var12 = 280 + staticInt6;
				if (MouseHandler.staticInt99 >= var12 && MouseHandler.staticInt99 <= 14 + var12
						&& MouseHandler.staticInt100 >= 4 && MouseHandler.staticInt100 <= 18) {
					staticMethod64(0, 0);
				} else if (MouseHandler.staticInt99 >= var12 + 15 && MouseHandler.staticInt99 <= 80 + var12
						&& MouseHandler.staticInt100 >= 4 && MouseHandler.staticInt100 <= 18) {
					staticMethod64(0, 1);
				} else {
					var1 = staticInt6 + 390;
					if (MouseHandler.staticInt99 >= var1 && MouseHandler.staticInt99 <= var1 + 14
							&& MouseHandler.staticInt100 >= 4 && MouseHandler.staticInt100 <= 18) {
						staticMethod64(1, 0);
					} else if (MouseHandler.staticInt99 >= 15 + var1 && MouseHandler.staticInt99 <= var1 + 80
							&& MouseHandler.staticInt100 >= 4 && MouseHandler.staticInt100 <= 18) {
						staticMethod64(1, 1);
					} else {
						var5 = 500 + staticInt6;
						if (MouseHandler.staticInt99 >= var5 && MouseHandler.staticInt99 <= var5 + 14
								&& MouseHandler.staticInt100 >= 4 && MouseHandler.staticInt100 <= 18) {
							staticMethod64(2, 0);
						} else if (MouseHandler.staticInt99 >= var5 + 15 && MouseHandler.staticInt99 <= var5 + 80
								&& MouseHandler.staticInt100 >= 4 && MouseHandler.staticInt100 <= 18) {
							staticMethod64(2, 1);
						} else {
							var11 = 610 + staticInt6;
							if (MouseHandler.staticInt99 >= var11 && MouseHandler.staticInt99 <= 14 + var11
									&& MouseHandler.staticInt100 >= 4 && MouseHandler.staticInt100 <= 18) {
								staticMethod64(3, 0);
							} else if (MouseHandler.staticInt99 >= var11 + 15 && MouseHandler.staticInt99 <= var11 + 80
									&& MouseHandler.staticInt100 >= 4 && MouseHandler.staticInt100 <= 18) {
								staticMethod64(3, 1);
							} else if (MouseHandler.staticInt99 >= 708 + staticInt6
									&& MouseHandler.staticInt100 >= 4
									&& MouseHandler.staticInt99 <= 758 + staticInt6
									&& MouseHandler.staticInt100 <= 20) {
								staticBool1 = false;
								staticSprite2.method636(staticInt6, 0);
								staticSprite1.method636(382 + staticInt6, 0);
								Config5.staticRasterizer2DSub3_6.method655(
										staticInt6 + 382 - Config5.staticRasterizer2DSub3_6.anInt677 / 2, 18);
							} else if (staticInt7 != -1) {
								Class2 var6 = Class2.staticClass2Array1[staticInt7];
								staticMethod59(var6);
								staticBool1 = false;
								staticSprite2.method636(staticInt6, 0);
								staticSprite1.method636(382 + staticInt6, 0);
								Config5.staticRasterizer2DSub3_6.method655(
										382 + staticInt6 - Config5.staticRasterizer2DSub3_6.anInt677 / 2, 18);
							}
						}
					}
				}
			}
		} else {
			if ((MouseHandler.staticInt98 == 1 || !staticBool18 && MouseHandler.staticInt98 == 4)
					&& MouseHandler.staticInt99 >= 765 + staticInt6 - 50 && MouseHandler.staticInt100 >= 453) {
				staticClass6_1.aBool2 = !staticClass6_1.aBool2;
				staticMethod270();
				if (!staticClass6_1.aBool2) {
					Js5IndexImpl var111 = Class34.staticJs5IndexImpl3;
					var1 = var111.method267("scape main");
					var5 = var111.method268(var1, "");
					staticMethod30(var111, var1, var5, 255, false);
				} else {
					staticNodeSub8Sub3_1.method440();
					staticInt118 = 1;
					staticJs5Index3 = null;
				}
			}

			if (Client.staticInt165 != 5) {
				++staticInt12;
				if (Client.staticInt165 == 10 || Client.staticInt165 == 11) {
					if (Client.staticInt231 == 0) {
						if (MouseHandler.staticInt98 == 1 || !staticBool18 && MouseHandler.staticInt98 == 4) {
							var12 = 5 + staticInt6;
							short var121 = 463;
							byte var8 = 100;
							byte var16 = 35;
							if (MouseHandler.staticInt99 >= var12 && MouseHandler.staticInt99 <= var8 + var12
									&& MouseHandler.staticInt100 >= var121
									&& MouseHandler.staticInt100 <= var121 + var16) {
								if (staticMethod121()) {
									staticBool1 = true;
								}

								return;
							}
						}

						if (Class2.staticClass3_1 != null) {
							staticMethod113();
						}
					}

					var12 = MouseHandler.staticInt98;
					var1 = MouseHandler.staticInt99;
					var5 = MouseHandler.staticInt100;
					if (!staticBool18 && var12 == 4) {
						var12 = 1;
					}

					int var131;
					short var14;
					if (staticInt13 == 0) {
						boolean var151 = false;

						while (staticMethod106()) {
							if (FileOnDisk.staticInt38 == 84) {
								var151 = true;
							}
						}

						var131 = 180 + staticInt8 - 80;
						var14 = 291;
						if (var12 == 1 && var1 >= var131 - 75 && var1 <= 75 + var131 && var5 >= var14 - 20
								&& var5 <= var14 + 20) {
							staticMethod125(staticMethod109("secure", true)
									+ "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var131 = 180 + staticInt8 + 80;
						if (var12 == 1 && var1 >= var131 - 75 && var1 <= 75 + var131 && var5 >= var14 - 20
								&& var5 <= var14 + 20 || var151) {
							if ((Client.staticInt201 & 0x2000000) != 0) {
								staticString5 = "";
								GPI.staticString4 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								GPI.staticString1 = "Your normal account will not be affected.";
								GPI.staticString6 = "";
								staticInt13 = 1;
								staticInt15 = 0;
							} else if ((Client.staticInt201 & 0x4) != 0) {
								if ((Client.staticInt201 & 0x400) != 0) {
									GPI.staticString4 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
									GPI.staticString1 = "Players can attack each other almost everywhere";
									GPI.staticString6 = "and the Protect Item prayer won\'t work.";
								} else {
									GPI.staticString4 = "This is a <col=ff0000>PvP<col=ffffff> world.";
									GPI.staticString1 = "Players can attack each other";
									GPI.staticString6 = "almost everywhere.";
								}

								staticString5 = "Warning!";
								staticInt13 = 1;
								staticInt15 = 0;
							} else if ((Client.staticInt201 & 0x400) != 0) {
								GPI.staticString4 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								GPI.staticString1 = "The Protect Item prayer will";
								GPI.staticString6 = "not work on this world.";
								staticString5 = "Warning!";
								staticInt13 = 1;
								staticInt15 = 0;
							} else {
								GPI.staticString4 = "";
								GPI.staticString1 = "Enter your username/email & password.";
								GPI.staticString6 = "";
								staticInt13 = 2;
								staticInt15 = 0;
							}
						}
					} else {
						short var161;
						if (staticInt13 != 1) {
							short var13;
							if (staticInt13 == 2) {
								var13 = 231;
								var11 = var13 + 30;
								if (var12 == 1 && var5 >= var11 - 15 && var5 < var11) {
									staticInt15 = 0;
								}

								var11 += 15;
								if (var12 == 1 && var5 >= var11 - 15 && var5 < var11) {
									staticInt15 = 1;
								}

								var11 += 15;
								var13 = 361;
								if (var12 == 1 && var5 >= var13 - 15 && var5 < var13) {
									GPI.staticMethod231("Please enter your username.",
											"If you created your account after November",
											"2010, this will be the creation email address.");
									staticInt13 = 5;
									return;
								}

								var131 = staticInt8 + 180 - 80;
								var14 = 321;
								if (var12 == 1 && var1 >= var131 - 75 && var1 <= 75 + var131 && var5 >= var14 - 20
										&& var5 <= 20 + var14) {
									staticString2 = staticString2.trim();
									if (staticString2.length() == 0) {
										GPI.staticMethod231("", "Please enter your username/email address.", "");
										return;
									}

									if (staticString7.length() == 0) {
										GPI.staticMethod231("", "Please enter your password.", "");
										return;
									}

									GPI.staticMethod231("", "Connecting to server...", "");
									blockType = staticClass6_1.aLinkedHashMap1
											.containsKey(Integer.valueOf(staticMethod149(staticString2)))
													? Class28.staticClass28_2 : Class28.staticClass28_4;
									staticMethod396(20);
									return;
								}

								var131 = staticInt8 + 180 + 80;
								if (var12 == 1 && var1 >= var131 - 75 && var1 <= var131 + 75 && var5 >= var14 - 20
										&& var5 <= 20 + var14) {
									staticInt13 = 0;
									staticString2 = "";
									staticString7 = "";
									NodeSub3.staticInt152 = 0;
									GZipDecompressor.staticString26 = "";
									staticBool3 = true;
								}

								while (true) {
									while (staticMethod106()) {
										boolean var171 = false;

										for (int var18 = 0; var18 < staticString8.length(); var18++) {
											if (staticChar1 == staticString8.charAt(var18)) {
												var171 = true;
												break;
											}
										}

										if (FileOnDisk.staticInt38 == 13) {
											staticInt13 = 0;
											staticString2 = "";
											staticString7 = "";
											NodeSub3.staticInt152 = 0;
											GZipDecompressor.staticString26 = "";
											staticBool3 = true;
										} else if (staticInt15 == 0) {
											if (FileOnDisk.staticInt38 == 85 && staticString2.length() > 0) {
												staticString2 = staticString2.substring(0,
														staticString2.length() - 1);
											}

											if (FileOnDisk.staticInt38 == 84 || FileOnDisk.staticInt38 == 80) {
												staticInt15 = 1;
											}

											if (var171 && staticString2.length() < 320) {
												staticString2 = staticString2 + staticChar1;
											}
										} else if (staticInt15 == 1) {
											if (FileOnDisk.staticInt38 == 85 && staticString7.length() > 0) {
												staticString7 = staticString7.substring(0,
														staticString7.length() - 1);
											}

											if (FileOnDisk.staticInt38 == 84 || FileOnDisk.staticInt38 == 80) {
												staticInt15 = 0;
											}

											if (FileOnDisk.staticInt38 == 84) {
												staticString2 = staticString2.trim();
												if (staticString2.length() == 0) {
													GPI.staticMethod231("", "Please enter your username/email address.",
															"");
													return;
												}

												if (staticString7.length() == 0) {
													GPI.staticMethod231("", "Please enter your password.", "");
													return;
												}

												GPI.staticMethod231("", "Connecting to server...", "");
												blockType = staticClass6_1.aLinkedHashMap1
														.containsKey(
																Integer.valueOf(staticMethod149(staticString2)))
																		? Class28.staticClass28_2
																		: Class28.staticClass28_4;
												staticMethod396(20);
												return;
											}

											if (var171 && staticString7.length() < 20) {
												staticString7 = staticString7 + staticChar1;
											}
										}
									}

									return;
								}
							}

							if (staticInt13 == 3) {
								var11 = staticInt8 + 180;
								var161 = 276;
								if (var12 == 1 && var1 >= var11 - 75 && var1 <= var11 + 75 && var5 >= var161 - 20
										&& var5 <= var161 + 20) {
									GPI.staticString4 = "";
									GPI.staticString1 = "Enter your username/email & password.";
									GPI.staticString6 = "";
									staticInt13 = 2;
									staticInt15 = 0;
								}

								var11 = 180 + staticInt8;
								var161 = 326;
								if (var12 == 1 && var1 >= var11 - 75 && var1 <= var11 + 75 && var5 >= var161 - 20
										&& var5 <= var161 + 20) {
									GPI.staticMethod231("Please enter your username.",
											"If you created your account after November",
											"2010, this will be the creation email address.");
									staticInt13 = 5;
									return;
								}
							} else {
								int var15;
								boolean var17;
								if (staticInt13 == 4) {
									var11 = staticInt8 + 180 - 80;
									var161 = 321;
									if (var12 == 1 && var1 >= var11 - 75 && var1 <= 75 + var11 && var5 >= var161 - 20
											&& var5 <= 20 + var161) {
										GZipDecompressor.staticString26.trim();
										if (GZipDecompressor.staticString26.length() != 6) {
											GPI.staticMethod231("", "Please enter a 6-digit PIN.", "");
											return;
										}

										NodeSub3.staticInt152 = Integer.parseInt(GZipDecompressor.staticString26);
										GZipDecompressor.staticString26 = "";
										blockType = staticBool3 ? Class28.staticClass28_3
												: Class28.staticClass28_5;
										GPI.staticMethod231("", "Connecting to server...", "");
										staticMethod396(20);
										return;
									}

									if (var12 == 1 && var1 >= 180 + staticInt8 - 9
											&& var1 <= 130 + staticInt8 + 180 && var5 >= 263 && var5 <= 296) {
										staticBool3 = !staticBool3;
									}

									if (var12 == 1 && var1 >= staticInt8 + 180 - 34
											&& var1 <= 34 + staticInt8 + 180 && var5 >= 351 && var5 <= 363) {
										staticMethod125(staticMethod109("secure", true)
												+ "m=totp-authenticator/disableTOTPRequest", true, false);
									}

									var11 = 80 + staticInt8 + 180;
									if (var12 == 1 && var1 >= var11 - 75 && var1 <= var11 + 75 && var5 >= var161 - 20
											&& var5 <= 20 + var161) {
										staticInt13 = 0;
										staticString2 = "";
										staticString7 = "";
										NodeSub3.staticInt152 = 0;
										GZipDecompressor.staticString26 = "";
									}

									while (staticMethod106()) {
										var17 = false;

										for (var15 = 0; var15 < staticString9.length(); var15++) {
											if (staticChar1 == staticString9.charAt(var15)) {
												var17 = true;
												break;
											}
										}

										if (FileOnDisk.staticInt38 == 13) {
											staticInt13 = 0;
											staticString2 = "";
											staticString7 = "";
											NodeSub3.staticInt152 = 0;
											GZipDecompressor.staticString26 = "";
										} else {
											if (FileOnDisk.staticInt38 == 85
													&& GZipDecompressor.staticString26.length() > 0) {
												GZipDecompressor.staticString26 = GZipDecompressor.staticString26
														.substring(0, GZipDecompressor.staticString26.length() - 1);
											}

											if (FileOnDisk.staticInt38 == 84) {
												GZipDecompressor.staticString26.trim();
												if (GZipDecompressor.staticString26.length() != 6) {
													GPI.staticMethod231("", "Please enter a 6-digit PIN.", "");
													return;
												}

												NodeSub3.staticInt152 = Integer
														.parseInt(GZipDecompressor.staticString26);
												GZipDecompressor.staticString26 = "";
												blockType = staticBool3 ? Class28.staticClass28_3
														: Class28.staticClass28_5;
												GPI.staticMethod231("", "Connecting to server...", "");
												staticMethod396(20);
												return;
											}

											if (var17 && GZipDecompressor.staticString26.length() < 6) {
												GZipDecompressor.staticString26 = GZipDecompressor.staticString26
														+ staticChar1;
											}
										}
									}
								} else if (staticInt13 == 5) {
									var11 = 180 + staticInt8 - 80;
									var161 = 321;
									if (var12 == 1 && var1 >= var11 - 75 && var1 <= 75 + var11 && var5 >= var161 - 20
											&& var5 <= 20 + var161) {
										staticMethod314();
										return;
									}

									var11 = 180 + staticInt8 + 80;
									if (var12 == 1 && var1 >= var11 - 75 && var1 <= var11 + 75 && var5 >= var161 - 20
											&& var5 <= 20 + var161) {
										GPI.staticString4 = "";
										GPI.staticString1 = "Enter your username/email & password.";
										GPI.staticString6 = "";
										staticInt13 = 2;
										staticInt15 = 0;
										staticString7 = "";
									}

									while (staticMethod106()) {
										var17 = false;

										for (var15 = 0; var15 < staticString8.length(); var15++) {
											if (staticChar1 == staticString8.charAt(var15)) {
												var17 = true;
												break;
											}
										}

										if (FileOnDisk.staticInt38 == 13) {
											GPI.staticString4 = "";
											GPI.staticString1 = "Enter your username/email & password.";
											GPI.staticString6 = "";
											staticInt13 = 2;
											staticInt15 = 0;
											staticString7 = "";
										} else {
											if (FileOnDisk.staticInt38 == 85 && staticString2.length() > 0) {
												staticString2 = staticString2.substring(0,
														staticString2.length() - 1);
											}

											if (FileOnDisk.staticInt38 == 84) {
												staticMethod314();
												return;
											}

											if (var17 && staticString2.length() < 320) {
												staticString2 = staticString2 + staticChar1;
											}
										}
									}
								} else if (staticInt13 == 6) {
									while (true) {
										do {
											if (!staticMethod106()) {
												var13 = 321;
												if (var12 == 1 && var5 >= var13 - 20 && var5 <= var13 + 20) {
													GPI.staticString4 = "";
													GPI.staticString1 = "Enter your username/email & password.";
													GPI.staticString6 = "";
													staticInt13 = 2;
													staticInt15 = 0;
													staticString7 = "";
												}

												return;
											}
										} while (FileOnDisk.staticInt38 != 84 && FileOnDisk.staticInt38 != 13);

										GPI.staticString4 = "";
										GPI.staticString1 = "Enter your username/email & password.";
										GPI.staticString6 = "";
										staticInt13 = 2;
										staticInt15 = 0;
										staticString7 = "";
									}
								}
							}
						} else {
							while (staticMethod106()) {
								if (FileOnDisk.staticInt38 == 84) {
									GPI.staticString4 = "";
									GPI.staticString1 = "Enter your username/email & password.";
									GPI.staticString6 = "";
									staticInt13 = 2;
									staticInt15 = 0;
								} else if (FileOnDisk.staticInt38 == 13) {
									staticInt13 = 0;
								}
							}

							var11 = staticInt8 + 180 - 80;
							var161 = 321;
							if (var12 == 1 && var1 >= var11 - 75 && var1 <= 75 + var11 && var5 >= var161 - 20
									&& var5 <= 20 + var161) {
								GPI.staticString4 = "";
								GPI.staticString1 = "Enter your username/email & password.";
								GPI.staticString6 = "";
								staticInt13 = 2;
								staticInt15 = 0;
							}

							var11 = 180 + staticInt8 + 80;
							if (var12 == 1 && var1 >= var11 - 75 && var1 <= var11 + 75 && var5 >= var161 - 20
									&& var5 <= 20 + var161) {
								staticInt13 = 0;
							}
						}
					}
				}
			}
		}

	}

	public static final Sprite staticMethod140(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) {
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) {
			var4 = 1;
		}

		long var8 = ((long) var2 << 38) + var0 + ((long) var1 << 16) + ((long) var4 << 40) + ((long) var3 << 42);
		Sprite var6;
		if (!var5) {
			var6 = (Sprite) ItemDefinition.staticCache9.get(var8);
			if (var6 != null) {
				return var6;
			}
		}

		ItemDefinition var10 = staticMethod153(var0);
		if (var1 > 1 && var10.anIntArray105 != null) {
			int var19 = -1;

			for (int var20 = 0; var20 < 10; var20++) {
				if (var1 >= var10.anIntArray106[var20] && var10.anIntArray106[var20] != 0) {
					var19 = var10.anIntArray105[var20];
				}
			}

			if (var19 != -1) {
				var10 = staticMethod153(var19);
			}
		}

		Model var191 = var10.method494(1);
		if (var191 == null) {
			return null;
		} else {
			Sprite var201 = null;
			if (var10.anInt457 != -1) {
				var201 = staticMethod140(var10.anInt435, 10, 1, 0, 0, true);
				if (var201 == null) {
					return null;
				}
			} else if (var10.anInt465 != -1) {
				var201 = staticMethod140(var10.anInt464, var1, var2, var3, 0, false);
				if (var201 == null) {
					return null;
				}
			} else if (var10.anInt467 != -1) {
				var201 = staticMethod140(var10.anInt445, var1, 0, 0, 0, false);
				if (var201 == null) {
					return null;
				}
			}

			int[] var17 = Rasterizer2D.staticIntArray130;
			int var18 = Rasterizer2D.staticInt330;
			int var7 = Rasterizer2D.staticInt326;
			int[] var11 = new int[4];
			staticMethod403(var11);
			var6 = new Sprite(36, 32);
			staticMethod400(var6.anIntArray154, 36, 32);
			staticMethod419();
			staticMethod449();
			staticMethod440(16, 16);
			Rasterizer2DSub1.staticBool48 = false;
			if (var10.anInt467 != -1) {
				var201.method637(0, 0);
			}

			int var15 = var10.anInt444;
			if (var5) {
				var15 = (int) (1.5D * var15);
			} else if (var2 == 2) {
				var15 = (int) (1.04D * var15);
			}

			int var13 = Rasterizer2DSub1.staticIntArray154[var10.anInt456] * var15 >> 16;
			int var14 = Rasterizer2DSub1.staticIntArray159[var10.anInt456] * var15 >> 16;
			var191.method592();
			var191.method600(0, var10.anInt466, var10.anInt468, var10.anInt456, var10.anInt436,
					var10.anInt452 + var191.anInt421 / 2 + var13, var10.anInt452 + var14);
			if (var10.anInt465 != -1) {
				var201.method637(0, 0);
			}

			if (var2 >= 1) {
				var6.method652(1);
			}

			if (var2 >= 2) {
				var6.method652(16777215);
			}

			if (var3 != 0) {
				var6.method647(var3);
			}

			staticMethod400(var6.anIntArray154, 36, 32);
			if (var10.anInt457 != -1) {
				var201.method637(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var10.anInt442 == 1) {
				NodeSub19.staticRasterizer2DSub2Sub1_4.method616(staticMethod97(var1), 0, 9, 16776960, 1);
			}

			if (!var5) {
				ItemDefinition.staticCache9.method170(var6, var8);
			}

			staticMethod400(var17, var18, var7);
			staticMethod420(var11);
			staticMethod449();
			Rasterizer2DSub1.staticBool48 = true;
			return var6;
		}
	}

	static boolean staticMethod141(String var0) {
		if (var0 == null) {
			return false;
		} else {
			String var3 = staticMethod111(var0, staticClass53_1);

			for (int var1 = 0; var1 < Client.staticInt310; var1++) {
				Class7 var2 = Client.staticClass7Array1[var1];
				if (var3.equalsIgnoreCase(staticMethod111(var2.aString5, staticClass53_1))) {
					return true;
				}

				if (var3.equalsIgnoreCase(staticMethod111(var2.aString4, staticClass53_1))) {
					return true;
				}
			}

			return false;
		}
	}

	public static void staticMethod142(Applet var0, String var1) {
		staticApplet2 = var0;
		staticString25 = var1;
	}

	static boolean staticMethod185(int var0, int var1) {
		return var0 != 4 || var1 < 8;
	}

	static final void staticMethod186(Actor var0, int var1) {
		rasterize(var0.anInt628, var0.anInt591, var1);
	}

	public static String staticMethod187(int var0) {
		return (var0 >> 24 & 0xff) + "." + (var0 >> 16 & 0xff) + "." + (var0 >> 8 & 0xff) + "." + (var0 & 0xff);
	}

	static String staticMethod118(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	static void staticMethod113() {
		if (staticMethod121()) {
			staticBool1 = true;
		}

	}

	static void staticMethod114(Component var0, Js5Index var1, Js5Index var2, boolean var3, int var4) {
		if (staticBool2) {
			if (var4 == 4) {
				staticInt13 = 4;
			}
		} else {
			staticInt13 = var4;
			staticMethod419();
			byte[] titleData = var1.method269("title.jpg", "");			
			staticSprite2 = new Sprite(titleData, var0);			
			staticSprite1 = staticSprite2.method650();
			if ((Client.staticInt201 & 0x20000000) != 0) {
				Config5.staticRasterizer2DSub3_6 = staticMethod25(var2, "logo_deadman_mode", "");
			} else {
				Config5.staticRasterizer2DSub3_6 = staticMethod25(var2, "logo", "");
			}

			staticRasterizer2DSub3_4 = staticMethod25(var2, "titlebox", "");
			staticRasterizer2DSub3_1 = staticMethod25(var2, "titlebutton", "");
			staticRasterizer2DSub3Array5 = staticMethod274(var2, "runes", "");
			Class33.staticRasterizer2DSub3Array3 = staticMethod274(var2, "title_mute", "");
			staticRasterizer2DSub3_2 = staticMethod25(var2, "options_radio_buttons,0", "");
			staticRasterizer2DSub3_3 = staticMethod25(var2, "options_radio_buttons,2", "");
			staticIntArray67 = new int[256];

			int var5;
			for (var5 = 0; var5 < 64; var5++) {
				staticIntArray67[var5] = var5 * 262144;
			}

			for (var5 = 0; var5 < 64; var5++) {
				staticIntArray67[64 + var5] = var5 * 1024 + 16711680;
			}

			for (var5 = 0; var5 < 64; var5++) {
				staticIntArray67[128 + var5] = 16776960 + var5 * 4;
			}

			for (var5 = 0; var5 < 64; var5++) {
				staticIntArray67[192 + var5] = 16777215;
			}

			staticIntArray61 = new int[256];

			for (var5 = 0; var5 < 64; var5++) {
				staticIntArray61[var5] = var5 * 1024;
			}

			for (var5 = 0; var5 < 64; var5++) {
				staticIntArray61[64 + var5] = var5 * 4 + '\uff00';
			}

			for (var5 = 0; var5 < 64; var5++) {
				staticIntArray61[128 + var5] = '\uffff' + var5 * 262144;
			}

			for (var5 = 0; var5 < 64; var5++) {
				staticIntArray61[192 + var5] = 16777215;
			}

			staticIntArray3 = new int[256];

			for (var5 = 0; var5 < 64; var5++) {
				staticIntArray3[var5] = var5 * 4;
			}

			for (var5 = 0; var5 < 64; var5++) {
				staticIntArray3[64 + var5] = var5 * 262144 + 255;
			}

			for (var5 = 0; var5 < 64; var5++) {
				staticIntArray3[128 + var5] = 16711935 + var5 * 1024;
			}

			for (var5 = 0; var5 < 64; var5++) {
				staticIntArray3[192 + var5] = 16777215;
			}

			Class57.staticIntArray74 = new int[256];
			staticIntArray6 = new int['\u8000'];
			staticIntArray5 = new int['\u8000'];
			staticMethod38((Rasterizer2DSub3) null);
			Class61.staticIntArray77 = new int['\u8000'];
			staticIntArray62 = new int['\u8000'];
			if (var3) {
				staticString2 = "";
				staticString7 = "";
			}

			NodeSub3.staticInt152 = 0;
			GZipDecompressor.staticString26 = "";
			staticBool3 = true;
			staticBool1 = false;
			if (!staticClass6_1.aBool2) {
				Js5IndexImpl var9 = Class34.staticJs5IndexImpl3;
				// TODO play startup song
				int var7 = var9.method267("scape main");
				int var8 = var9.method268(var7, "");
				staticInt118 = 1;
				staticJs5Index3 = var9;
				staticInt119 = var7;
				staticInt127 = var8;
				Class7.staticInt32 = 255;
				staticBool16 = false;
				NodeSub1.staticInt151 = 2;
			} else {
				staticMethod108(2);
			}

			staticMethod1(false);
			staticBool2 = true;
			staticInt6 = (gameWidth - Client.staticInt288) / 2;
			staticInt8 = 202 + staticInt6;
			staticSprite2.method636(staticInt6, 0);
			staticSprite1.method636(staticInt6 + 382, 0);
			Config5.staticRasterizer2DSub3_6
					.method655(staticInt6 + 382 - Config5.staticRasterizer2DSub3_6.anInt677 / 2, 18);
		}

	}

	public static int staticMethod115(int var0, int var1, int var2) {
		var2 &= 3;
		return var2 == 0 ? var0 : var2 == 1 ? var1 : var2 == 2 ? 7 - var0 : 7 - var1;
	}

	static final void staticMethod116(int var0, int var1, int var2, int var3, Sprite var4, CacheableSub3 var5) {
		if (var4 != null) {
			int var8 = Client.staticInt209 + Client.staticInt221 & 0x7ff;
			int var9 = var3 * var3 + var2 * var2;
			if (var9 <= 6400) {
				int var11 = Rasterizer2DSub1.staticIntArray154[var8];
				int var10 = Rasterizer2DSub1.staticIntArray159[var8];
				var11 = var11 * 256 / (Client.staticInt211 + 256);
				var10 = var10 * 256 / (Client.staticInt211 + 256);
				int var6 = var11 * var3 + var2 * var10 >> 16;
				int var7 = var3 * var10 - var11 * var2 >> 16;
				if (var9 > 2500) {
					var4.method641(var6 + var5.anInt426 / 2 - var4.anInt673 / 2,
							var5.anInt427 / 2 - var7 - var4.anInt674 / 2, var0, var1, var5.anInt426, var5.anInt427,
							var5.anIntArray101, var5.anIntArray102);
				} else {
					var4.method637(var6 + var0 + var5.anInt426 / 2 - var4.anInt673 / 2,
							var5.anInt427 / 2 + var1 - var7 - var4.anInt674 / 2);
				}
			}
		}

	}

	public static void staticMethod258() {
		synchronized (MouseHandler.staticMouseHandler1) {
			MouseHandler.staticInt93 = MouseHandler.staticInt90 * -1011501229;
			MouseHandler.staticInt94 = MouseHandler.staticInt91;
			MouseHandler.staticInt88 = MouseHandler.staticInt96;
			MouseHandler.staticInt98 = MouseHandler.staticInt95;
			MouseHandler.staticInt99 = MouseHandler.staticInt92;
			MouseHandler.staticInt100 = MouseHandler.staticInt97;
			MouseHandler.staticLong2 = MouseHandler.staticLong1 * 1793063241075175321L;
			MouseHandler.staticInt95 = 0;
		}
	}

	static final void rasterize(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var5 = staticMethod240(var0, var1, NodeSub4.staticInt155) - var2;
			var0 -= Class20.staticInt36;
			var5 -= staticInt125;
			var1 -= NodeSub3.staticInt153;
			int var8 = Rasterizer2DSub1.staticIntArray154[NodeSub19.staticInt318];
			int var7 = Rasterizer2DSub1.staticIntArray159[NodeSub19.staticInt318];
			int var4 = Rasterizer2DSub1.staticIntArray154[staticInt87];
			int var3 = Rasterizer2DSub1.staticIntArray159[staticInt87];
			int var6 = var3 * var0 + var1 * var4 >> 16;
			var1 = var1 * var3 - var4 * var0 >> 16;
			var0 = var6;
			var6 = var7 * var5 - var1 * var8 >> 16;
			var1 = var1 * var7 + var5 * var8 >> 16;
			if (var1 >= 50) {
				Client.staticInt189 = Client.staticInt305 / 2 + var0 * Client.staticInt307 / var1;
				Client.staticInt180 = Client.staticInt306 / 2 + Client.staticInt307 * var6 / var1;
			} else {
				Client.staticInt189 = -1;
				Client.staticInt180 = -1;
			}
		} else {
			Client.staticInt189 = -1;
			Client.staticInt180 = -1;
		}

	}

	static void staticMethod128() {
		int var1;
		if (Client.staticInt179 == 0) {
			Friend.staticScene1 = new Scene(4, 104, 104, staticIntArrayArrayArray1);

			for (var1 = 0; var1 < 4; var1++) {
				Client.staticClass38Array1[var1] = new Class38(104, 104);
			}

			Actor.staticSprite5 = new Sprite(512, 512);
			staticString3 = "Starting game engine...";
			staticInt14 = 15;
			Client.staticInt179 = 20;
		} else {
			int var0;
			int var5;
			int var17;
			int var21;
			if (Client.staticInt179 == 20) {
				int[] var4 = new int[9];

				for (var17 = 0; var17 < 9; var17++) {
					var21 = 128 + var17 * 32 + 15;
					var0 = 600 + var21 * 3;
					var5 = Rasterizer2DSub1.staticIntArray154[var21];
					var4[var17] = var5 * var0 >> 16;
				}

				staticMethod77(var4, 500, 800, 512, 334);
				staticString3 = "Prepared visibility map";
				staticInt14 = 30;
				Client.staticInt179 = 30;
			} else if (Client.staticInt179 == 30) {
				Client.staticJs5IndexImpl8 = staticMethod202(0, false, true, true);
				FloorUnderlayDef.staticJs5IndexImpl13 = staticMethod202(1, false, true, true);
				Class23.staticJs5IndexImpl2 = staticMethod202(2, true, false, true);
				CanvasSub1.staticJs5IndexImpl5 = staticMethod202(3, false, true, true);
				Config19.staticJs5IndexImpl15 = staticMethod202(4, false, true, true);
				RenderableSub2.staticJs5IndexImpl16 = staticMethod202(5, true, true, true);
				Class34.staticJs5IndexImpl3 = staticMethod202(6, true, true, false);
				ClientScriptMap.staticJs5IndexImpl14 = staticMethod202(7, false, true, true);
				Class62.staticJs5IndexImpl7 = staticMethod202(8, false, true, true);
				IdentityKit.staticJs5IndexImpl12 = staticMethod202(9, false, true, true);
				AbstractClass3Sub1.staticJs5IndexImpl10 = staticMethod202(10, false, true, true);
				Class56.staticJs5IndexImpl6 = staticMethod202(11, false, true, true);
				Connection.staticJs5IndexImpl4 = staticMethod202(12, false, true, true);
				NodeSub12.staticJs5IndexImpl11 = staticMethod202(13, true, false, true);
				staticJs5IndexImpl1 = staticMethod202(14, false, true, false);
				Client.staticJs5IndexImpl9 = staticMethod202(15, false, true, true);
				staticString3 = "Connecting to update server";
				staticInt14 = 60;
				Client.staticInt179 = 40;
			} else if (Client.staticInt179 == 40) {
				byte var20 = 0;
				var1 = var20 + Client.staticJs5IndexImpl8.method395() * 4 / 100;
				var1 += FloorUnderlayDef.staticJs5IndexImpl13.method395() * 4 / 100;
				var1 += Class23.staticJs5IndexImpl2.method395() * 2 / 100;
				var1 += CanvasSub1.staticJs5IndexImpl5.method395() * 2 / 100;
				var1 += Config19.staticJs5IndexImpl15.method395() * 6 / 100;
				var1 += RenderableSub2.staticJs5IndexImpl16.method395() * 4 / 100;
				var1 += Class34.staticJs5IndexImpl3.method395() * 2 / 100;
				var1 += ClientScriptMap.staticJs5IndexImpl14.method395() * 60 / 100;
				var1 += Class62.staticJs5IndexImpl7.method395() * 2 / 100;
				var1 += IdentityKit.staticJs5IndexImpl12.method395() * 2 / 100;
				var1 += AbstractClass3Sub1.staticJs5IndexImpl10.method395() * 2 / 100;
				var1 += Class56.staticJs5IndexImpl6.method395() * 2 / 100;
				var1 += Connection.staticJs5IndexImpl4.method395() * 2 / 100;
				var1 += NodeSub12.staticJs5IndexImpl11.method395() * 2 / 100;
				var1 += staticJs5IndexImpl1.method395() * 2 / 100;
				var1 += Client.staticJs5IndexImpl9.method395() * 2 / 100;
				if (var1 != 100) {
					if (var1 != 0) {
						staticString3 = "Checking for updates - " + var1 + "%";
					}

					staticInt14 = 90;
				} else {
					staticString3 = "Loaded update list";
					staticInt14 = 90;
					Client.staticInt179 = 45;
				}
			} else {
				Js5IndexImpl var22;
				Js5IndexImpl var211;
				if (Client.staticInt179 == 45) {
					boolean var3 = !Client.lowMemory;
					staticInt120 = 22050;
					Class19.staticBool5 = var3;
					Class19.staticInt35 = 2;
					NodeSub8Sub3 var10 = new NodeSub8Sub3();
					var10.method442(9, 128);
					ByteBuf.staticClass19_2 = staticMethod431(BufferedFile.staticTaskManager1, Class38.staticCanvas1, 0,
							22050);
					ByteBuf.staticClass19_2.method77(var10);
					var211 = Client.staticJs5IndexImpl9;
					Js5IndexImpl var15 = staticJs5IndexImpl1;
					var22 = Config19.staticJs5IndexImpl15;
					staticJs5Index6 = var211;
					staticJs5Index4 = var15;
					staticJs5Index5 = var22;
					staticNodeSub8Sub3_1 = var10;
					NodeSub12.staticClass19_1 = staticMethod431(BufferedFile.staticTaskManager1, Class38.staticCanvas1,
							1, 2048);
					ClientScriptMap.staticNodeSub8Sub1_1 = new NodeSub8Sub1();
					NodeSub12.staticClass19_1.method77(ClientScriptMap.staticNodeSub8Sub1_1);
					Class16.staticClass20_1 = new Class20(22050, staticInt120);
					staticString3 = "Prepared sound engine";
					staticInt14 = 105;
					Client.staticInt179 = 50;
				} else if (Client.staticInt179 == 50) {
					var1 = 0;
					if (NodeSub4.staticRasterizer2DSub2Sub1_3 == null) {
						NodeSub4.staticRasterizer2DSub2Sub1_3 = staticMethod386(Class62.staticJs5IndexImpl7,
								NodeSub12.staticJs5IndexImpl11, "p11_full", "");
					} else {
						++var1;
					}

					if (Class59.staticRasterizer2DSub2Sub1_2 == null) {
						Class59.staticRasterizer2DSub2Sub1_2 = staticMethod386(Class62.staticJs5IndexImpl7,
								NodeSub12.staticJs5IndexImpl11, "p12_full", "");
					} else {
						++var1;
					}

					if (GraphicsBuffer.staticRasterizer2DSub2Sub1_1 == null) {
						GraphicsBuffer.staticRasterizer2DSub2Sub1_1 = staticMethod386(Class62.staticJs5IndexImpl7,
								NodeSub12.staticJs5IndexImpl11, "b12_full", "");
					} else {
						++var1;
					}

					if (var1 < 3) {
						staticString3 = "Loading fonts - " + var1 * 100 / 3 + "%";
						staticInt14 = 120;
					} else {
						Class57.staticComputerInfo1 = new ComputerInfo(true);
						staticString3 = "Loaded fonts";
						staticInt14 = 120;
						Client.staticInt179 = 60;
					}
				} else if (Client.staticInt179 == 60) {
					var1 = staticMethod389(AbstractClass3Sub1.staticJs5IndexImpl10, Class62.staticJs5IndexImpl7);
					byte var221 = 9;
					if (var1 < var221) {
						staticString3 = "Loading title screen - " + var1 * 100 / var221 + "%";
						staticInt14 = 150;
					} else {
						staticString3 = "Loaded title screen";
						staticInt14 = 150;
						staticMethod396(5);
						Client.staticInt179 = 70;
					}
				} else if (Client.staticInt179 == 70) {
					if (!Class23.staticJs5IndexImpl2.method259()) {
						staticString3 = "Loading config - " + Class23.staticJs5IndexImpl2.method399() + "%";
						staticInt14 = 180;
					} else {
						staticMethod164(Class23.staticJs5IndexImpl2);
						Js5IndexImpl var23 = Class23.staticJs5IndexImpl2;
						FloorUnderlayDef.staticJs5Index22 = var23;
						staticMethod9(Class23.staticJs5IndexImpl2, ClientScriptMap.staticJs5IndexImpl14);
						Js5IndexImpl var25 = Class23.staticJs5IndexImpl2;
						var211 = ClientScriptMap.staticJs5IndexImpl14;
						boolean var29 = Client.lowMemory;
						ObjectDefinition.staticJs5Index20 = var25;
						ObjectDefinition.staticJs5Index19 = var211;
						ObjectDefinition.staticBool46 = var29;
						staticMethod321(Class23.staticJs5IndexImpl2, ClientScriptMap.staticJs5IndexImpl14);
						staticMethod3(Class23.staticJs5IndexImpl2, ClientScriptMap.staticJs5IndexImpl14,
								Client.staticBool20, NodeSub4.staticRasterizer2DSub2Sub1_3);
						staticMethod88(Class23.staticJs5IndexImpl2, Client.staticJs5IndexImpl8,
								FloorUnderlayDef.staticJs5IndexImpl13);
						staticMethod397(Class23.staticJs5IndexImpl2, ClientScriptMap.staticJs5IndexImpl14);
						staticMethod299(Class23.staticJs5IndexImpl2);
						staticMethod236(Class23.staticJs5IndexImpl2);
						var22 = CanvasSub1.staticJs5IndexImpl5;
						Js5IndexImpl var26 = ClientScriptMap.staticJs5IndexImpl14;
						Js5IndexImpl var2 = Class62.staticJs5IndexImpl7;
						Js5IndexImpl var11 = NodeSub12.staticJs5IndexImpl11;
						Widget.staticJs5Index10 = var22;
						staticJs5Index7 = var26;
						Widget.staticJs5Index9 = var2;
						Class29.staticJs5Index2 = var11;
						Widget.staticWidgetArrayArray1 = new Widget[Widget.staticJs5Index10.method264()][];
						Npc.staticBoolArray12 = new boolean[Widget.staticJs5Index10.method264()];
						staticMethod205(Class23.staticJs5IndexImpl2);
						Js5IndexImpl var12 = Class23.staticJs5IndexImpl2;
						ClientScriptMap.staticJs5Index25 = var12;
						Js5IndexImpl var6 = Class23.staticJs5IndexImpl2;
						Config19.staticJs5Index26 = var6;
						staticMethod320(Class23.staticJs5IndexImpl2);
						Class57.staticClass5_1 = new Class5();
						Js5IndexImpl var8 = Class23.staticJs5IndexImpl2;
						Js5IndexImpl var13 = Class62.staticJs5IndexImpl7;
						Js5IndexImpl var9 = NodeSub12.staticJs5IndexImpl11;
						CacheableSub5.staticJs5Index17 = var8;
						CacheableSub5.staticJs5Index16 = var13;
						CacheableSub5.staticJs5Index18 = var9;
						Js5IndexImpl var7 = Class23.staticJs5IndexImpl2;
						Js5IndexImpl var14 = Class62.staticJs5IndexImpl7;
						CacheableSub6.staticJs5Index24 = var7;
						CacheableSub6.staticJs5Index23 = var14;
						staticString3 = "Loaded config";
						staticInt14 = 180;
						Client.staticInt179 = 80;
					}
				} else if (Client.staticInt179 != 80) {
					if (Client.staticInt179 == 90) {
						if (!IdentityKit.staticJs5IndexImpl12.method259()) {
							staticString3 = "Loading textures - " + IdentityKit.staticJs5IndexImpl12.method399()
									+ "%";
							staticInt14 = 270;
						} else {
							Class11 var24 = new Class11(IdentityKit.staticJs5IndexImpl12, Class62.staticJs5IndexImpl7,
									20, 0.8D, Client.lowMemory ? 64 : 128);
							staticMethod441(var24);
							staticMethod453(0.8D);
							staticString3 = "Loaded textures";
							staticInt14 = 270;
							Client.staticInt179 = 110;
						}
					} else if (Client.staticInt179 == 110) {
						Client.staticMouseCapturer1 = new MouseCapturer();
						BufferedFile.staticTaskManager1.method94(Client.staticMouseCapturer1, 10);
						staticString3 = "Loaded input handler";
						staticInt14 = 282;
						Client.staticInt179 = 120;
					} else if (Client.staticInt179 == 120) {
						if (!AbstractClass3Sub1.staticJs5IndexImpl10.method270("huffman", "")) {
							staticString3 = "Loading wordpack - 0%";
							staticInt14 = 288;
						} else {
							Class47 var261 = new Class47(
									AbstractClass3Sub1.staticJs5IndexImpl10.method269("huffman", ""));
							staticMethod301(var261);
							staticString3 = "Loaded wordpack";
							staticInt14 = 288;
							Client.staticInt179 = 130;
						}
					} else if (Client.staticInt179 == 130) {
						if (!CanvasSub1.staticJs5IndexImpl5.method259()) {
							staticString3 = "Loading interfaces - "
									+ CanvasSub1.staticJs5IndexImpl5.method399() * 4 / 5 + "%";
							staticInt14 = 300;
						} else if (!Connection.staticJs5IndexImpl4.method259()) {
							staticString3 = "Loading interfaces - "
									+ (80 + Connection.staticJs5IndexImpl4.method399() / 6) + "%";
							staticInt14 = 300;
						} else if (!NodeSub12.staticJs5IndexImpl11.method259()) {
							staticString3 = "Loading interfaces - "
									+ (96 + NodeSub12.staticJs5IndexImpl11.method399() / 20) + "%";
							staticInt14 = 300;
						} else {
							staticString3 = "Loaded interfaces";
							staticInt14 = 300;
							Client.staticInt179 = 140;
						}
					} else if (Client.staticInt179 == 140) {
						staticMethod396(10);
					}
				} else {
					var1 = 0;
					Sprite var27;
					if (Class59.staticSprite3 == null) {
						var211 = Class62.staticJs5IndexImpl7;
						var0 = var211.method267("compass");
						var5 = var211.method268(var0, "");
						var27 = staticMethod296(var211, var0, var5);
						Class59.staticSprite3 = var27;
					} else {
						++var1;
					}

					if (CacheableSub2.staticSprite4 == null) {
						var211 = Class62.staticJs5IndexImpl7;
						var0 = var211.method267("mapedge");
						var5 = var211.method268(var0, "");
						var27 = staticMethod296(var211, var0, var5);
						CacheableSub2.staticSprite4 = var27;
					} else {
						++var1;
					}

					if (Class20.staticRasterizer2DSub3Array1 == null) {
						Class20.staticRasterizer2DSub3Array1 = staticMethod274(Class62.staticJs5IndexImpl7, "mapscene",
								"");
					} else {
						++var1;
					}

					if (staticSpriteArray4 == null) {
						staticSpriteArray4 = staticMethod309(Class62.staticJs5IndexImpl7, "mapfunction", "");
					} else {
						++var1;
					}

					if (Class59.staticSpriteArray7 == null) {
						Class59.staticSpriteArray7 = staticMethod309(Class62.staticJs5IndexImpl7, "headicons_pk", "");
					} else {
						++var1;
					}

					if (staticSpriteArray3 == null) {
						staticSpriteArray3 = staticMethod309(Class62.staticJs5IndexImpl7, "headicons_prayer",
								"");
					} else {
						++var1;
					}

					if (Class59.staticSpriteArray6 == null) {
						Class59.staticSpriteArray6 = staticMethod309(Class62.staticJs5IndexImpl7, "headicons_hint", "");
					} else {
						++var1;
					}

					if (staticSpriteArray2 == null) {
						staticSpriteArray2 = staticMethod309(Class62.staticJs5IndexImpl7, "mapmarker", "");
					} else {
						++var1;
					}

					if (Client.staticSpriteArray8 == null) {
						Client.staticSpriteArray8 = staticMethod309(Class62.staticJs5IndexImpl7, "cross", "");
					} else {
						++var1;
					}

					if (Class16.staticSpriteArray1 == null) {
						Class16.staticSpriteArray1 = staticMethod309(Class62.staticJs5IndexImpl7, "mapdots", "");
					} else {
						++var1;
					}

					if (Class33.staticRasterizer2DSub3Array2 == null) {
						Class33.staticRasterizer2DSub3Array2 = staticMethod274(Class62.staticJs5IndexImpl7, "scrollbar",
								"");
					} else {
						++var1;
					}

					if (SpotAnim.staticRasterizer2DSub3Array7 == null) {
						SpotAnim.staticRasterizer2DSub3Array7 = staticMethod274(Class62.staticJs5IndexImpl7,
								"mod_icons", "");
					} else {
						++var1;
					}

					if (var1 < 12) {
						staticString3 = "Loading sprites - " + var1 * 100 / 12 + "%";
						staticInt14 = 210;
					} else {
						Rasterizer2DSub2.staticRasterizer2DSub3Array9 = SpotAnim.staticRasterizer2DSub3Array7;
						CacheableSub2.staticSprite4.method648();
						var17 = (int) (Math.random() * 21.0D) - 10;
						var21 = (int) (Math.random() * 21.0D) - 10;
						var0 = (int) (Math.random() * 21.0D) - 10;
						var5 = (int) (Math.random() * 41.0D) - 20;

						for (int var28 = 0; var28 < staticSpriteArray4.length; var28++) {
							staticSpriteArray4[var28].method651(var5 + var17, var21 + var5, var5 + var0);
						}

						Class20.staticRasterizer2DSub3Array1[0].method654(var5 + var17, var5 + var21, var0 + var5);
						staticString3 = "Loaded sprites";
						staticInt14 = 210;
						Client.staticInt179 = 90;
					}
				}
			}
		}

	}

	static void staticMethod129(Class2[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var9 = var1 - 1;
			int var6 = var2 + 1;
			int var7 = (var2 + var1) / 2;
			Class2 var5 = var0[var7];
			var0[var7] = var0[var1];
			var0[var1] = var5;

			while (var9 < var6) {
				boolean var10 = true;

				int var8;
				int var11;
				int var12;
				do {
					--var6;

					for (var11 = 0; var11 < 4; var11++) {
						if (var3[var11] == 2) {
							var8 = var0[var6].anInt2;
							var12 = var5.anInt2;
						} else if (var3[var11] == 1) {
							var8 = var0[var6].anInt5;
							var12 = var5.anInt5;
							if (var8 == -1 && var4[var11] == 1) {
								var8 = 2001;
							}

							if (var12 == -1 && var4[var11] == 1) {
								var12 = 2001;
							}
						} else if (var3[var11] == 3) {
							var8 = var0[var6].method10() ? 1 : 0;
							var12 = var5.method10() ? 1 : 0;
						} else {
							var8 = var0[var6].anInt4;
							var12 = var5.anInt4;
						}

						if (var12 != var8) {
							if ((var4[var11] != 1 || var8 <= var12) && (var4[var11] != 0 || var8 >= var12)) {
								var10 = false;
							}
							break;
						}

						if (var11 == 3) {
							var10 = false;
						}
					}
				} while (var10);

				var10 = true;

				do {
					++var9;

					for (var11 = 0; var11 < 4; var11++) {
						if (var3[var11] == 2) {
							var8 = var0[var9].anInt2;
							var12 = var5.anInt2;
						} else if (var3[var11] == 1) {
							var8 = var0[var9].anInt5;
							var12 = var5.anInt5;
							if (var8 == -1 && var4[var11] == 1) {
								var8 = 2001;
							}

							if (var12 == -1 && var4[var11] == 1) {
								var12 = 2001;
							}
						} else if (var3[var11] == 3) {
							var8 = var0[var9].method10() ? 1 : 0;
							var12 = var5.method10() ? 1 : 0;
						} else {
							var8 = var0[var9].anInt4;
							var12 = var5.anInt4;
						}

						if (var8 != var12) {
							if ((var4[var11] != 1 || var8 >= var12) && (var4[var11] != 0 || var8 <= var12)) {
								var10 = false;
							}
							break;
						}

						if (var11 == 3) {
							var10 = false;
						}
					}
				} while (var10);

				if (var9 < var6) {
					Class2 var13 = var0[var9];
					var0[var9] = var0[var6];
					var0[var6] = var13;
				}
			}

			staticMethod129(var0, var1, var6, var3, var4);
			staticMethod129(var0, 1 + var6, var2, var3, var4);
		}

	}

	static char staticMethod103(char var0) {
		switch (var0) {
		case ' ':
		case '-':
		case '_':
		case '\u00a0':
			return '_';
		case '#':
		case '[':
		case ']':
			return var0;
		case '\u00c0':
		case '\u00c1':
		case '\u00c2':
		case '\u00c3':
		case '\u00c4':
		case '\u00e0':
		case '\u00e1':
		case '\u00e2':
		case '\u00e3':
		case '\u00e4':
			return 'a';
		case '\u00c7':
		case '\u00e7':
			return 'c';
		case '\u00c8':
		case '\u00c9':
		case '\u00ca':
		case '\u00cb':
		case '\u00e8':
		case '\u00e9':
		case '\u00ea':
		case '\u00eb':
			return 'e';
		case '\u00cd':
		case '\u00ce':
		case '\u00cf':
		case '\u00ed':
		case '\u00ee':
		case '\u00ef':
			return 'i';
		case '\u00d1':
		case '\u00f1':
			return 'n';
		case '\u00d2':
		case '\u00d3':
		case '\u00d4':
		case '\u00d5':
		case '\u00d6':
		case '\u00f2':
		case '\u00f3':
		case '\u00f4':
		case '\u00f5':
		case '\u00f6':
			return 'o';
		case '\u00d9':
		case '\u00da':
		case '\u00db':
		case '\u00dc':
		case '\u00f9':
		case '\u00fa':
		case '\u00fb':
		case '\u00fc':
			return 'u';
		case '\u00df':
			return 'b';
		case '\u00ff':
		case '\u0178':
			return 'y';
		default:
			return Character.toLowerCase(var0);
		}
	}

	static void staticMethod104(int var0, int var1, int var2, int var3) {
		NodeSub20 var4 = (NodeSub20) NodeSub20.staticHashTable7.method149(var0);
		if (var4 == null) {
			var4 = new NodeSub20();
			NodeSub20.staticHashTable7.method148(var4, var0);
		}

		if (var4.anIntArray82.length <= var1) {
			int[] var5 = new int[1 + var1];
			int[] var7 = new int[var1 + 1];

			int var6;
			for (var6 = 0; var6 < var4.anIntArray82.length; var6++) {
				var5[var6] = var4.anIntArray82[var6];
				var7[var6] = var4.anIntArray83[var6];
			}

			for (var6 = var4.anIntArray82.length; var6 < var1; var6++) {
				var5[var6] = -1;
				var7[var6] = 0;
			}

			var4.anIntArray82 = var5;
			var4.anIntArray83 = var7;
		}

		var4.anIntArray82[var1] = var2;
		var4.anIntArray83[var1] = var3;
	}

	static Rasterizer2DSub2Sub1 staticMethod105(byte[] var0) {
		if (var0 == null) {
			return null;
		} else {
			Rasterizer2DSub2Sub1 var1 = new Rasterizer2DSub2Sub1(var0, NodeSub20.staticIntArray126,
					staticIntArray69, staticIntArray72, staticIntArray71, staticIntArray73,
					CanvasSub1.staticByteArrayArray2);
			NodeSub20.staticIntArray126 = null;
			staticIntArray69 = null;
			staticIntArray72 = null;
			staticIntArray71 = null;
			staticIntArray73 = null;
			CanvasSub1.staticByteArrayArray2 = null;
			return var1;
		}
	}

	public static void staticMethod75(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		Class30 var8 = new Class30();
		var8.anInt92 = var2 / 128;
		var8.anInt103 = var3 / 128;
		var8.anInt93 = var4 / 128;
		var8.anInt96 = var5 / 128;
		var8.anInt95 = var1;
		var8.anInt108 = var2;
		var8.anInt94 = var3;
		var8.anInt98 = var4;
		var8.anInt91 = var5;
		var8.anInt100 = var6;
		var8.anInt101 = var7;
		Scene.staticClass30ArrayArray1[var0][Scene.staticIntArray40[var0]++] = var8;
	}

	static boolean staticMethod76(int var0, int var1, int var2) {
		int var3 = var2 * Scene.staticInt61 + var0 * Scene.staticInt49 >> 16;
		int var5 = var2 * Scene.staticInt49 - var0 * Scene.staticInt61 >> 16;
		int var4 = var1 * Scene.staticInt68 + var5 * Scene.staticInt60 >> 16;
		int var7 = var1 * Scene.staticInt60 - var5 * Scene.staticInt68 >> 16;
		if (var4 >= 50 && var4 <= 3500) {
			int var6 = Scene.staticInt64 + var3 * Rasterizer2DSub1.staticInt342 / var4;
			int var8 = Scene.staticInt65 + var7 * Rasterizer2DSub1.staticInt342 / var4;
			return var6 >= Scene.staticInt66 && var6 <= Scene.staticInt51 && var8 >= Scene.staticInt67
					&& var8 <= Scene.staticInt69;
		} else {
			return false;
		}
	}

	public static void staticMethod77(int[] var0, int var1, int var2, int var3, int var4) {
		Scene.staticInt66 = 0;
		Scene.staticInt67 = 0;
		Scene.staticInt51 = var3;
		Scene.staticInt69 = var4;
		Scene.staticInt64 = var3 / 2;
		Scene.staticInt65 = var4 / 2;
		boolean[][][][] var7 = new boolean[9][32][53][53];

		int var6;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		for (var8 = 128; var8 <= 384; var8 += 32) {
			for (var6 = 0; var6 < 2048; var6 += 64) {
				Scene.staticInt68 = Rasterizer2DSub1.staticIntArray154[var8];
				Scene.staticInt60 = Rasterizer2DSub1.staticIntArray159[var8];
				Scene.staticInt61 = Rasterizer2DSub1.staticIntArray154[var6];
				Scene.staticInt49 = Rasterizer2DSub1.staticIntArray159[var6];
				var9 = (var8 - 128) / 32;
				var11 = var6 / 64;

				for (int var16 = -26; var16 <= 26; var16++) {
					for (var10 = -26; var10 <= 26; var10++) {
						var12 = var16 * 128;
						int var13 = var10 * 128;
						boolean var14 = false;

						for (int var15 = -var1; var15 <= var2; var15 += 128) {
							if (staticMethod76(var12, var0[var9] + var15, var13)) {
								var14 = true;
								break;
							}
						}

						var7[var9][var11][var16 + 25 + 1][var10 + 25 + 1] = var14;
					}
				}
			}
		}

		for (var8 = 0; var8 < 8; var8++) {
			for (var6 = 0; var6 < 32; var6++) {
				for (var9 = -25; var9 < 25; var9++) {
					for (var11 = -25; var11 < 25; var11++) {
						boolean var161 = false;

						label76: for (var10 = -1; var10 <= 1; var10++) {
							for (var12 = -1; var12 <= 1; var12++) {
								if (var7[var8][var6][var9 + var10 + 25 + 1][var11 + var12 + 25 + 1]) {
									var161 = true;
									break label76;
								}

								if (var7[var8][(var6 + 1) % 31][var9 + var10 + 25 + 1][var11 + var12 + 25 + 1]) {
									var161 = true;
									break label76;
								}

								if (var7[var8 + 1][var6][var9 + var10 + 25 + 1][var11 + var12 + 25 + 1]) {
									var161 = true;
									break label76;
								}

								if (var7[var8 + 1][(var6 + 1) % 31][var9 + var10 + 25 + 1][var11 + var12 + 25 + 1]) {
									var161 = true;
									break label76;
								}
							}
						}

						Scene.staticBoolArrayArrayArrayArray1[var8][var6][var9 + 25][var11 + 25] = var161;
					}
				}
			}
		}

	}

	public static void staticMethod78() {
		Scene.staticInt57 = -1;
		Scene.staticBool8 = false;
	}

	static final int staticMethod79(int var0, int var1) {
		var1 = var1 * (var0 & 0x7f) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 0xff80) + var1;
	}

	public static boolean staticMethod80() {
		return Scene.staticBool8 && Scene.staticInt57 != -1;
	}

	public static void staticMethod11() {
		ObjectDefinition.staticCache18.method171();
		ObjectDefinition.staticCache15.method171();
		ObjectDefinition.staticCache16.method171();
		ObjectDefinition.staticCache17.method171();
	}

	static final void staticMethod12() {
		for (RenderableSub1 var0 = (RenderableSub1) Client.staticClass39_5
				.method195(); var0 != null; var0 = (RenderableSub1) Client.staticClass39_5.method193()) {
			if (var0.anInt575 == NodeSub4.staticInt155 && Client.staticInt166 <= var0.anInt580) {
				if (Client.staticInt166 >= var0.anInt578) {
					if (var0.anInt583 > 0) {
						Npc var2 = Client.staticNpcArray1[var0.anInt583 - 1];
						if (var2 != null && var2.anInt628 >= 0 && var2.anInt628 < 13312 && var2.anInt591 >= 0
								&& var2.anInt591 < 13312) {
							var0.method562(var2.anInt628, var2.anInt591,
									staticMethod240(var2.anInt628, var2.anInt591, var0.anInt575) - var0.anInt584,
									Client.staticInt166);
						}
					}

					if (var0.anInt583 < 0) {
						int var21 = -var0.anInt583 - 1;
						Player var3;
						if (var21 == Client.myPlayerIndex) {
							var3 = AbstractClass2Sub1.staticPlayer1;
						} else {
							var3 = Client.staticPlayerArray1[var21];
						}

						if (var3 != null && var3.anInt628 >= 0 && var3.anInt628 < 13312 && var3.anInt591 >= 0
								&& var3.anInt591 < 13312) {
							var0.method562(var3.anInt628, var3.anInt591,
									staticMethod240(var3.anInt628, var3.anInt591, var0.anInt575) - var0.anInt584,
									Client.staticInt166);
						}
					}

					var0.method561(Client.staticInt171);
					Friend.staticScene1.method102(NodeSub4.staticInt155, (int) var0.aDouble9, (int) var0.aDouble3,
							(int) var0.aDouble6, 60, var0, var0.anInt577, -1, false);
				}
			} else {
				var0.method174();
			}
		}

	}

	static byte[] staticMethod13(byte[] var0) {
		int var1 = var0.length;
		byte[] var2 = new byte[var1];
		System.arraycopy(var0, 0, var2, 0, var1);
		return var2;
	}

	static final void staticMethod130() {
		if (Client.staticInt170 > 1) {
			--Client.staticInt170;
		}

		if (Client.staticInt196 > 0) {
			--Client.staticInt196;
		}

		if (Client.staticBool43) {
			Client.staticBool43 = false;
			staticMethod329();
		} else {
			if (!Client.staticBool30) {
				Client.staticInt252 = 0;
				Client.staticInt217 = -1;
				Client.staticBool30 = false;
				Client.staticStringArray9[0] = "Cancel";
				Client.staticStringArray8[0] = "";
				Client.staticIntArray98[0] = 1006;
				Client.staticInt252 = 1;
			}

			int var0;
			for (var0 = 0; var0 < 100 && staticMethod310(); var0++) {
				;
			}

			if (Client.staticInt165 == 30) {
				while (true) {
					NodeSub17 var1 = (NodeSub17) staticClass36_1.method160();
					boolean var24;
					if (var1 == null) {
						var24 = false;
					} else {
						var24 = true;
					}

					int var25;
					if (!var24) {
						int var2;
						int var3;
						int var4;
						int var5;
						int var6;
						int var7;
						int var8;
						synchronized (Client.staticMouseCapturer1.anObject3) {
							if (!Client.staticBool42) {
								Client.staticMouseCapturer1.anInt211 = 0;
							} else if (MouseHandler.staticInt98 != 0 || Client.staticMouseCapturer1.anInt211 >= 40) {
								Client.outBuffer.method471(252);
								Client.outBuffer.writeByte(0);
								var25 = Client.outBuffer.position;
								var2 = 0;

								for (var3 = 0; var3 < Client.staticMouseCapturer1.anInt211
										&& Client.outBuffer.position - var25 < 240; var3++) {
									++var2;
									var4 = Client.staticMouseCapturer1.anIntArray58[var3];
									if (var4 < 0) {
										var4 = 0;
									} else if (var4 > 502) {
										var4 = 502;
									}

									var5 = Client.staticMouseCapturer1.anIntArray57[var3];
									if (var5 < 0) {
										var5 = 0;
									} else if (var5 > 764) {
										var5 = 764;
									}

									var6 = var5 + var4 * 765;
									if (Client.staticMouseCapturer1.anIntArray58[var3] == -1
											&& Client.staticMouseCapturer1.anIntArray57[var3] == -1) {
										var5 = -1;
										var4 = -1;
										var6 = 524287;
									}

									if (Client.staticInt167 == var5 && var4 == Client.staticInt168) {
										if (Client.staticInt163 < 2047) {
											++Client.staticInt163;
										}
									} else {
										var7 = var5 - Client.staticInt167;
										Client.staticInt167 = var5;
										var8 = var4 - Client.staticInt168;
										Client.staticInt168 = var4;
										if (Client.staticInt163 < 8 && var7 >= -32 && var7 <= 31 && var8 >= -32
												&& var8 <= 31) {
											var7 += 32;
											var8 += 32;
											Client.outBuffer
													.writeShort(var8 + (Client.staticInt163 << 12) + (var7 << 6));
											Client.staticInt163 = 0;
										} else if (Client.staticInt163 < 8) {
											Client.outBuffer
													.writeTriByte(8388608 + (Client.staticInt163 << 19) + var6);
											Client.staticInt163 = 0;
										} else {
											Client.outBuffer
													.writeInt(-1073741824 + (Client.staticInt163 << 19) + var6);
											Client.staticInt163 = 0;
										}
									}
								}

								Client.outBuffer.method327(Client.outBuffer.position - var25);
								if (var2 >= Client.staticMouseCapturer1.anInt211) {
									Client.staticMouseCapturer1.anInt211 = 0;
								} else {
									Client.staticMouseCapturer1.anInt211 -= var2;

									for (var3 = 0; var3 < Client.staticMouseCapturer1.anInt211; var3++) {
										Client.staticMouseCapturer1.anIntArray57[var3] = Client.staticMouseCapturer1.anIntArray57[var3
												+ var2];
										Client.staticMouseCapturer1.anIntArray58[var3] = Client.staticMouseCapturer1.anIntArray58[var2
												+ var3];
									}
								}
							}
						}

						long var261;
						if (MouseHandler.staticInt98 == 1 || !staticBool18 && MouseHandler.staticInt98 == 4
								|| MouseHandler.staticInt98 == 2) {
							var261 = (MouseHandler.staticLong2 * 1586812740019762345L - -Client.staticLong10) / 50L;
							if (var261 > 4095L) {
								var261 = 4095L;
							}

							Client.staticLong10 = MouseHandler.staticLong2 * -1586812740019762345L;
							var2 = MouseHandler.staticInt100;
							if (var2 < 0) {
								var2 = 0;
							} else if (var2 > Class47.gameHeight) {
								var2 = Class47.gameHeight;
							}

							var3 = MouseHandler.staticInt99;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > gameWidth) {
								var3 = gameWidth;
							}

							var4 = (int) var261;
							Client.outBuffer.method471(152);
							Client.outBuffer
									.writeShort((MouseHandler.staticInt98 == 2 ? 1 : 0) + (var4 << 1));
							Client.outBuffer.writeShort(var3);
							Client.outBuffer.writeShort(var2);
						}

						if (KeyboardHandler.staticInt76 > 0) {
							Client.outBuffer.method471(217);
							Client.outBuffer.writeShort(0);
							var0 = Client.outBuffer.position;
							var261 = staticMethod297();

							for (var3 = 0; var3 < KeyboardHandler.staticInt76; var3++) {
								long var30 = var261 - Client.staticLong13;
								if (var30 > 16777215L) {
									var30 = 16777215L;
								}

								Client.staticLong13 = var261;
								Client.outBuffer.method357((int) var30);
								Client.outBuffer.writeByte(KeyboardHandler.staticIntArray48[var3]);
							}

							Client.outBuffer.method371(Client.outBuffer.position - var0);
						}

						if (Client.staticInt226 > 0) {
							--Client.staticInt226;
						}

						if (KeyboardHandler.staticBoolArray2[96] || KeyboardHandler.staticBoolArray2[97]
								|| KeyboardHandler.staticBoolArray2[98] || KeyboardHandler.staticBoolArray2[99]) {
							Client.staticBool26 = true;
						}

						if (Client.staticBool26 && Client.staticInt226 <= 0) {
							Client.staticInt226 = 20;
							Client.staticBool26 = false;
							Client.outBuffer.method471(213);
							Client.outBuffer.method369(Client.staticInt220);
							Client.outBuffer.method369(Client.staticInt221);
						}

						if (RuntimeExceptionSub1.staticBool9 && !Client.staticBool41) {
							Client.staticBool41 = true;
							Client.outBuffer.method471(124);
							Client.outBuffer.writeByte(1);
						}

						if (!RuntimeExceptionSub1.staticBool9 && Client.staticBool41) {
							Client.staticBool41 = false;
							Client.outBuffer.method471(124);
							Client.outBuffer.writeByte(0);
						}

						int var16;
						int var27;
						if (NodeSub4.staticInt155 != -Client.staticInt294) {
							Client.staticInt294 = -NodeSub4.staticInt155;
							var0 = NodeSub4.staticInt155;
							int[] var281 = Actor.staticSprite5.anIntArray154;
							var2 = var281.length;

							for (var3 = 0; var3 < var2; var3++) {
								var281[var3] = 0;
							}

							for (var3 = 1; var3 < 103; var3++) {
								var4 = 24628 + (103 - var3) * 2048;

								for (var5 = 1; var5 < 103; var5++) {
									if ((staticByteArrayArrayArray4[var0][var5][var3] & 0x18) == 0) {
										Friend.staticScene1.method134(var281, var4, 512, var0, var5, var3);
									}

									if (var0 < 3
											&& (staticByteArrayArrayArray4[1 + var0][var5][var3] & 0x8) != 0) {
										Friend.staticScene1.method134(var281, var4, 512, var0 + 1, var5, var3);
									}

									var4 += 4;
								}
							}

							var3 = (238 + (int) (Math.random() * 20.0D) - 10 << 16)
									+ (238 + (int) (Math.random() * 20.0D) - 10 << 8) + 238
									+ (int) (Math.random() * 20.0D) - 10;
							var4 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
							Actor.staticSprite5.method633();

							for (var5 = 1; var5 < 103; var5++) {
								for (var6 = 1; var6 < 103; var6++) {
									if ((staticByteArrayArrayArray4[var0][var6][var5] & 0x18) == 0) {
										staticMethod271(var0, var6, var5, var3, var4);
									}

									if (var0 < 3
											&& (staticByteArrayArrayArray4[var0 + 1][var6][var5] & 0x8) != 0) {
										staticMethod271(var0 + 1, var6, var5, var3, var4);
									}
								}
							}

							Client.staticInt311 = 0;

							for (var5 = 0; var5 < 104; var5++) {
								for (var6 = 0; var6 < 104; var6++) {
									var7 = Friend.staticScene1.method116(NodeSub4.staticInt155, var5, var6);
									if (var7 != 0) {
										var7 = var7 >> 14 & 0x7fff;
										var8 = staticMethod394(var7).anInt494;
										if (var8 >= 0) {
											var27 = var5;
											var16 = var6;
											if (var8 != 22 && var8 != 29 && var8 != 34 && var8 != 36 && var8 != 46
													&& var8 != 47 && var8 != 48) {
												int[][] var28 = Client.staticClass38Array1[NodeSub4.staticInt155].anIntArrayArray5;

												for (int var31 = 0; var31 < 10; var31++) {
													int var36 = (int) (Math.random() * 4.0D);
													if (var36 == 0 && var27 > 0 && var27 > var5 - 3
															&& (var28[var27 - 1][var16] & 0x1240108) == 0) {
														--var27;
													}

													if (var36 == 1 && var27 < 103 && var27 < var5 + 3
															&& (var28[var27 + 1][var16] & 0x1240180) == 0) {
														++var27;
													}

													if (var36 == 2 && var16 > 0 && var16 > var6 - 3
															&& (var28[var27][var16 - 1] & 0x1240102) == 0) {
														--var16;
													}

													if (var36 == 3 && var16 < 103 && var16 < 3 + var6
															&& (var28[var27][var16 + 1] & 0x1240120) == 0) {
														++var16;
													}
												}
											}

											Client.staticSpriteArray9[Client.staticInt311] = staticSpriteArray4[var8];
											Client.staticIntArray113[Client.staticInt311] = var27;
											Client.staticIntArray103[Client.staticInt311] = var16;
											++Client.staticInt311;
										}
									}
								}
							}

							CacheableSub2.staticGraphicsBuffer1.method281();
						}

						if (Client.staticInt165 != 30) {
							return;
						}

						for (NodeSub19 var29 = (NodeSub19) Client.staticClass39_7
								.method195(); var29 != null; var29 = (NodeSub19) Client.staticClass39_7.method193()) {
							if (var29.anInt386 > 0) {
								--var29.anInt386;
							}

							if (var29.anInt386 == 0) {
								if (var29.anInt394 < 0 || staticMethod146(var29.anInt394, var29.anInt392)) {
									staticMethod276(var29.anInt389, var29.anInt387, var29.anInt388, var29.anInt390,
											var29.anInt394, var29.anInt391, var29.anInt392);
									var29.method174();
								}
							} else {
								if (var29.anInt396 > 0) {
									--var29.anInt396;
								}

								if (var29.anInt396 == 0 && var29.anInt388 >= 1 && var29.anInt390 >= 1
										&& var29.anInt388 <= 102 && var29.anInt390 <= 102
										&& (var29.anInt397 < 0 || staticMethod146(var29.anInt397, var29.anInt395))) {
									staticMethod276(var29.anInt389, var29.anInt387, var29.anInt388, var29.anInt390,
											var29.anInt397, var29.anInt393, var29.anInt395);
									var29.anInt396 = -1;
									if (var29.anInt394 == var29.anInt397 && var29.anInt394 == -1) {
										var29.method174();
									} else if (var29.anInt397 == var29.anInt394 && var29.anInt393 == var29.anInt391
											&& var29.anInt392 == var29.anInt395) {
										var29.method174();
									}
								}
							}
						}

						staticMethod29();
						++Client.staticInt192;
						if (Client.staticInt192 > 750) {
							staticMethod329();
							return;
						}

						staticMethod203();
						staticMethod384();
						staticMethod239();
						++Client.staticInt171;
						if (Client.staticInt239 != 0) {
							Client.staticInt297 += 20;
							if (Client.staticInt297 >= 400) {
								Client.staticInt239 = 0;
							}
						}

						if (Tile.staticWidget11 != null) {
							++Client.staticInt241;
							if (Client.staticInt241 >= 15) {
								staticMethod73(Tile.staticWidget11);
								Tile.staticWidget11 = null;
							}
						}

						Widget var311 = Class56.staticWidget4;
						Widget var301 = FloorUnderlayDef.staticWidget12;
						Class56.staticWidget4 = null;
						FloorUnderlayDef.staticWidget12 = null;
						Client.staticWidget9 = null;
						Client.staticBool29 = false;
						Client.staticBool35 = false;
						Client.staticInt264 = 0;

						while (staticMethod106() && Client.staticInt264 < 128) {
							if (Client.myRights >= 2 && KeyboardHandler.staticBoolArray2[82]
									&& FileOnDisk.staticInt38 == 66) {
								String var321 = "";

								ChatMessage var34;
								for (Iterator var38 = staticClass35_1.iterator(); var38
										.hasNext(); var321 = var321 + var34.aString36 + ':' + var34.aString37 + '\n') {
									var34 = (ChatMessage) var38.next();
								}

								NodeSub19.staticClipboard1.setContents(new StringSelection(var321),
										(ClipboardOwner) null);
							} else {
								Client.staticIntArray111[Client.staticInt264] = FileOnDisk.staticInt38;
								Client.staticIntArray110[Client.staticInt264] = staticChar1;
								++Client.staticInt264;
							}
						}

						if (Client.staticInt263 != -1) {
							var2 = Client.staticInt263;
							var3 = gameWidth;
							var4 = Class47.gameHeight;
							if (staticMethod4(var2)) {
								staticMethod26(Widget.staticWidgetArrayArray1[var2], -1, 0, 0, var3, var4, 0, 0);
							}
						}

						Client.staticInt274 += 502628357;

						while (true) {
							NodeSub16 var33;
							Widget var35;
							Widget var361;
							do {
								var33 = (NodeSub16) Client.staticClass39_9.method194();
								if (var33 == null) {
									while (true) {
										do {
											var33 = (NodeSub16) Client.staticClass39_10.method194();
											if (var33 == null) {
												while (true) {
													do {
														var33 = (NodeSub16) Client.staticClass39_8.method194();
														if (var33 == null) {
															boolean var32 = false;

															String var22;
															while (!var32) {
																var32 = true;

																for (var3 = 0; var3 < Client.staticInt252 - 1; var3++) {
																	if (Client.staticIntArray98[var3] < 1000
																			&& Client.staticIntArray98[1 + var3] > 1000) {
																		String var20 = Client.staticStringArray8[var3];
																		Client.staticStringArray8[var3] = Client.staticStringArray8[var3
																				+ 1];
																		Client.staticStringArray8[var3 + 1] = var20;
																		var22 = Client.staticStringArray9[var3];
																		Client.staticStringArray9[var3] = Client.staticStringArray9[1
																				+ var3];
																		Client.staticStringArray9[1 + var3] = var22;
																		var6 = Client.staticIntArray98[var3];
																		Client.staticIntArray98[var3] = Client.staticIntArray98[1
																				+ var3];
																		Client.staticIntArray98[var3 + 1] = var6;
																		var6 = Client.staticIntArray109[var3];
																		Client.staticIntArray109[var3] = Client.staticIntArray109[var3
																				+ 1];
																		Client.staticIntArray109[1 + var3] = var6;
																		var6 = Client.staticIntArray97[var3];
																		Client.staticIntArray97[var3] = Client.staticIntArray97[var3
																				+ 1];
																		Client.staticIntArray97[1 + var3] = var6;
																		var6 = Client.staticIntArray112[var3];
																		Client.staticIntArray112[var3] = Client.staticIntArray112[1
																				+ var3];
																		Client.staticIntArray112[1 + var3] = var6;
																		if (Client.staticInt217 != -1) {
																			if (Client.staticInt217 == var3) {
																				Client.staticInt217 = var3 + 1;
																			} else if (var3 + 1 == Client.staticInt217) {
																				Client.staticInt217 = var3;
																			}
																		}

																		var32 = false;
																	}
																}
															}

															int var37;
															Widget var39;
															boolean var40;
															if (NodeSub3.staticWidget5 == null
																	&& Client.staticWidget7 == null) {
																var2 = MouseHandler.staticInt98;
																String var46;
																if (Client.staticBool30) {
																	if (var2 != 1
																			&& (staticBool18 || var2 != 4)) {
																		var3 = MouseHandler.staticInt94;
																		var4 = MouseHandler.staticInt88;
																		if (var3 < Class62.staticInt147 - 10
																				|| var3 > Class62.staticInt147
																						+ KeyboardHandler.staticInt84
																						+ 10
																				|| var4 < NodeSub20.staticInt320 - 10
																				|| var4 > 10 + NpcDefinition.staticInt324
																						+ NodeSub20.staticInt320) {
																			Client.staticBool30 = false;
																			staticMethod327(Class62.staticInt147,
																					NodeSub20.staticInt320,
																					KeyboardHandler.staticInt84,
																					NpcDefinition.staticInt324);
																		}
																	}

																	if (var2 == 1
																			|| !staticBool18 && var2 == 4) {
																		var3 = Class62.staticInt147;
																		var4 = NodeSub20.staticInt320;
																		var5 = KeyboardHandler.staticInt84;
																		var6 = MouseHandler.staticInt99;
																		var7 = MouseHandler.staticInt100;
																		var8 = -1;

																		for (var27 = 0; var27 < Client.staticInt252; var27++) {
																			var16 = (Client.staticInt252 - 1 - var27) * 15
																					+ var4 + 31;
																			if (var6 > var3 && var6 < var5 + var3
																					&& var7 > var16 - 13
																					&& var7 < 3 + var16) {
																				var8 = var27;
																			}
																		}

																		if (var8 != -1 && var8 >= 0) {
																			var27 = Client.staticIntArray109[var8];
																			var16 = Client.staticIntArray97[var8];
																			var37 = Client.staticIntArray98[var8];
																			int var381 = Client.staticIntArray112[var8];
																			var46 = Client.staticStringArray9[var8];
																			String var49 = Client.staticStringArray8[var8];
																			staticMethod66(var27, var16, var37, var381,
																					var46, var49,
																					MouseHandler.staticInt99,
																					MouseHandler.staticInt100);
																		}

																		Client.staticBool30 = false;
																		staticMethod327(Class62.staticInt147,
																				NodeSub20.staticInt320,
																				KeyboardHandler.staticInt84,
																				NpcDefinition.staticInt324);
																	}
																} else {
																	label1268: {
																		var3 = staticMethod165();
																		if ((var2 == 1
																				|| !staticBool18 && var2 == 4)
																				&& var3 >= 0) {
																			var4 = Client.staticIntArray98[var3];
																			if (var4 == 39 || var4 == 40 || var4 == 41
																					|| var4 == 42 || var4 == 43
																					|| var4 == 33 || var4 == 34
																					|| var4 == 35 || var4 == 36
																					|| var4 == 37 || var4 == 38
																					|| var4 == 1005) {
																				var5 = Client.staticIntArray109[var3];
																				var6 = Client.staticIntArray97[var3];
																				var39 = staticMethod8(var6);
																				if (staticMethod379(
																						staticMethod192(var39))
																						|| staticMethod133(
																								staticMethod192(
																										var39))) {
																					if (NodeSub3.staticWidget5 != null
																							&& !Client.staticBool31) {
																						var8 = staticMethod165();
																						if (Client.staticInt214 != 1
																								&& !staticMethod475(
																										var8)
																								&& Client.staticInt252 > 0) {
																							staticMethod371(
																									Client.staticInt242,
																									Client.staticInt243);
																						}
																					}

																					Client.staticBool31 = false;
																					Client.staticInt244 = 0;
																					if (NodeSub3.staticWidget5 != null) {
																						staticMethod73(
																								NodeSub3.staticWidget5);
																					}

																					NodeSub3.staticWidget5 = staticMethod8(
																							var6);
																					Client.staticInt161 = var5;
																					Client.staticInt242 = MouseHandler.staticInt99;
																					Client.staticInt243 = MouseHandler.staticInt100;
																					if (var3 >= 0) {
																						Class20.staticContextMenuItem1 = new ContextMenuItem();
																						Class20.staticContextMenuItem1.anInt7 = Client.staticIntArray109[var3];
																						Class20.staticContextMenuItem1.anInt10 = Client.staticIntArray97[var3];
																						Class20.staticContextMenuItem1.anInt8 = Client.staticIntArray98[var3];
																						Class20.staticContextMenuItem1.anInt9 = Client.staticIntArray112[var3];
																						Class20.staticContextMenuItem1.aString3 = Client.staticStringArray9[var3];
																					}

																					staticMethod73(
																							NodeSub3.staticWidget5);
																					break label1268;
																				}
																			}
																		}

																		if (var2 == 1
																				|| !staticBool18 && var2 == 4) {
																			label1261: {
																				label869: {
																					if (Client.staticInt214 == 1
																							&& Client.staticInt252 > 2) {
																						if (Client.staticInt252 <= 0) {
																							var40 = false;
																						} else if (Client.staticBool39
																								&& KeyboardHandler.staticBoolArray2[81]
																								&& Client.staticInt217 != -1) {
																							var40 = true;
																						} else {
																							var40 = false;
																						}

																						if (!var40) {
																							break label869;
																						}
																					}

																					if (!staticMethod475(var3)) {
																						break label1261;
																					}
																				}

																				var2 = 2;
																			}
																		}

																		if ((var2 == 1
																				|| !staticBool18 && var2 == 4)
																				&& Client.staticInt252 > 0 && var3 >= 0) {
																			var4 = Client.staticIntArray109[var3];
																			var5 = Client.staticIntArray97[var3];
																			var6 = Client.staticIntArray98[var3];
																			var7 = Client.staticIntArray112[var3];
																			var22 = Client.staticStringArray9[var3];
																			var46 = Client.staticStringArray8[var3];
																			staticMethod66(var4, var5, var6, var7,
																					var22, var46,
																					MouseHandler.staticInt99,
																					MouseHandler.staticInt100);
																		}

																		if (var2 == 2 && Client.staticInt252 > 0) {
																			staticMethod37(MouseHandler.staticInt99,
																					MouseHandler.staticInt100);
																		}
																	}
																}
															}

															if (Client.staticWidget7 != null) {
																staticMethod20();
															}

															if (NodeSub3.staticWidget5 != null) {
																staticMethod73(NodeSub3.staticWidget5);
																++Client.staticInt244;
																if (MouseHandler.staticInt93 == 0) {
																	if (Client.staticBool31) {
																		if (Class34.staticWidget3 == NodeSub3.staticWidget5
																				&& Client.staticInt161 != Client.staticInt230) {
																			var39 = NodeSub3.staticWidget5;
																			byte var41 = 0;
																			if (Client.staticInt266 == 1
																					&& var39.anInt298 == 206) {
																				var41 = 1;
																			}

																			if (var39.anIntArray76[Client.staticInt230] <= 0) {
																				var41 = 0;
																			}

																			if (staticMethod133(
																					staticMethod192(var39))) {
																				var4 = Client.staticInt161;
																				var5 = Client.staticInt230;
																				var39.anIntArray76[var5] = var39.anIntArray76[var4];
																				var39.anIntArray77[var5] = var39.anIntArray77[var4];
																				var39.anIntArray76[var4] = -1;
																				var39.anIntArray77[var4] = 0;
																			} else if (var41 == 1) {
																				var4 = Client.staticInt161;
																				var5 = Client.staticInt230;

																				while (var4 != var5) {
																					if (var4 > var5) {
																						var39.method386(var4 - 1, var4);
																						--var4;
																					} else if (var4 < var5) {
																						var39.method386(1 + var4, var4);
																						++var4;
																					}
																				}
																			} else {
																				var39.method386(Client.staticInt230,
																						Client.staticInt161);
																			}

																			Client.outBuffer.method471(151);
																			Client.outBuffer
																					.method351(Client.staticInt161);
																			Client.outBuffer
																					.writeShort(Client.staticInt230);
																			Client.outBuffer
																					.writeByte(var41);
																			Client.outBuffer.method360(
																					NodeSub3.staticWidget5.anInt294);
																		}
																	} else {
																		label1226: {
																			label1244: {
																				var2 = staticMethod165();
																				if (Client.staticInt252 > 2) {
																					if (Client.staticInt214 == 1) {
																						if (Client.staticInt252 <= 0) {
																							var40 = false;
																						} else if (Client.staticBool39
																								&& KeyboardHandler.staticBoolArray2[81]
																								&& Client.staticInt217 != -1) {
																							var40 = true;
																						} else {
																							var40 = false;
																						}

																						if (!var40) {
																							break label1244;
																						}
																					}

																					if (staticMethod475(var2)) {
																						break label1244;
																					}
																				}

																				if (Client.staticInt252 > 0) {
																					staticMethod371(Client.staticInt242,
																							Client.staticInt243);
																				}
																				break label1226;
																			}

																			staticMethod37(Client.staticInt242,
																					Client.staticInt243);
																		}
																	}

																	Client.staticInt241 = 10;
																	MouseHandler.staticInt98 = 0;
																	NodeSub3.staticWidget5 = null;
																} else if (Client.staticInt244 >= 5
																		&& (MouseHandler.staticInt94 > Client.staticInt242
																				+ 5
																				|| MouseHandler.staticInt94 < Client.staticInt242
																						- 5
																				|| MouseHandler.staticInt88 > 5
																						+ Client.staticInt243
																				|| MouseHandler.staticInt88 < Client.staticInt243
																						- 5)) {
																	Client.staticBool31 = true;
																}
															}

															if (staticMethod80()) {
																var2 = Scene.staticInt57;
																var3 = Scene.staticInt58;
																Client.outBuffer.method471(147);
																Client.outBuffer.writeByte(5);
																Client.outBuffer
																		.method343(KeyboardHandler.staticBoolArray2[82]
																				? KeyboardHandler.staticBoolArray2[81]
																						? 2 : 1
																				: 0);
																Client.outBuffer
																		.method369(var3 + Class34.staticInt75);
																Client.outBuffer
																		.method369(var2 + NodeSub3.staticInt154);
																staticMethod78();
																Client.staticInt238 = MouseHandler.staticInt99;
																Client.staticInt237 = MouseHandler.staticInt100;
																Client.staticInt239 = 1;
																Client.staticInt297 = 0;
																Client.staticInt296 = var2;
																Client.staticInt240 = var3;
															}

															if (Class56.staticWidget4 != var311) {
																if (var311 != null) {
																	staticMethod73(var311);
																}

																if (Class56.staticWidget4 != null) {
																	staticMethod73(Class56.staticWidget4);
																}
															}

															if (FloorUnderlayDef.staticWidget12 != var301
																	&& Client.staticInt257 == Client.staticInt185) {
																if (var301 != null) {
																	staticMethod73(var301);
																}

																if (FloorUnderlayDef.staticWidget12 != null) {
																	staticMethod73(FloorUnderlayDef.staticWidget12);
																}
															}

															if (FloorUnderlayDef.staticWidget12 != null) {
																if (Client.staticInt185 < Client.staticInt257) {
																	++Client.staticInt185;
																	if (Client.staticInt185 == Client.staticInt257) {
																		staticMethod73(FloorUnderlayDef.staticWidget12);
																	}
																}
															} else if (Client.staticInt185 > 0) {
																--Client.staticInt185;
															}

															var2 = Client.staticInt203
																	+ AbstractClass2Sub1.staticPlayer1.anInt628;
															var3 = AbstractClass2Sub1.staticPlayer1.anInt591
																	+ Client.staticInt233;
															if (GraphicsBufferSub1.staticInt316 - var2 < -500
																	|| GraphicsBufferSub1.staticInt316 - var2 > 500
																	|| Class4.staticInt21 - var3 < -500
																	|| Class4.staticInt21 - var3 > 500) {
																GraphicsBufferSub1.staticInt316 = var2;
																Class4.staticInt21 = var3;
															}

															if (var2 != GraphicsBufferSub1.staticInt316) {
																GraphicsBufferSub1.staticInt316 += (var2
																		- GraphicsBufferSub1.staticInt316) / 16;
															}

															if (Class4.staticInt21 != var3) {
																Class4.staticInt21 += (var3 - Class4.staticInt21) / 16;
															}

															if (MouseHandler.staticInt93 == 4 && staticBool18) {
																var4 = MouseHandler.staticInt88
																		- Client.staticInt224 * -211836111;
																Client.staticInt222 = var4 * 2;
																Client.staticInt224 = (var4 != -1 && var4 != 1
																		? (MouseHandler.staticInt88
																				+ Client.staticInt224 * -211836111) / 2
																		: MouseHandler.staticInt88) * -1922771503;
																var5 = Client.staticInt223 * -2117374245
																		- MouseHandler.staticInt94;
																Client.staticInt251 = var5 * 2;
																Client.staticInt223 = -1198989997 * (var5 != -1
																		&& var5 != 1
																				? (MouseHandler.staticInt94
																						+ Client.staticInt223
																								* -2117374245)
																						/ 2
																				: MouseHandler.staticInt94);
															} else {
																if (KeyboardHandler.staticBoolArray2[96]) {
																	Client.staticInt251 += (-24 - Client.staticInt251) / 2;
																} else if (KeyboardHandler.staticBoolArray2[97]) {
																	Client.staticInt251 += (24 - Client.staticInt251) / 2;
																} else {
																	Client.staticInt251 /= 2;
																}

																if (KeyboardHandler.staticBoolArray2[98]) {
																	Client.staticInt222 += (12 - Client.staticInt222) / 2;
																} else if (KeyboardHandler.staticBoolArray2[99]) {
																	Client.staticInt222 += (-12 - Client.staticInt222) / 2;
																} else {
																	Client.staticInt222 /= 2;
																}

																Client.staticInt224 = MouseHandler.staticInt88
																		* -1922771503;
																Client.staticInt223 = MouseHandler.staticInt94
																		* -1198989997;
															}

															Client.staticInt221 = Client.staticInt221
																	+ Client.staticInt251 / 2 & 0x7ff;
															Client.staticInt220 += Client.staticInt222 / 2;
															if (Client.staticInt220 < 128) {
																Client.staticInt220 = 128;
															}

															if (Client.staticInt220 > 383) {
																Client.staticInt220 = 383;
															}

															var4 = GraphicsBufferSub1.staticInt316 >> 7;
															var5 = Class4.staticInt21 >> 7;
															var6 = staticMethod240(GraphicsBufferSub1.staticInt316,
																	Class4.staticInt21, NodeSub4.staticInt155);
															var7 = 0;
															if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
																for (var8 = var4 - 4; var8 <= 4 + var4; var8++) {
																	for (var27 = var5 - 4; var27 <= 4 + var5; var27++) {
																		var16 = NodeSub4.staticInt155;
																		if (var16 < 3
																				&& (staticByteArrayArrayArray4[1][var8][var27]
																						& 0x2) == 2) {
																			++var16;
																		}

																		var37 = var6
																				- staticIntArrayArrayArray1[var16][var8][var27];
																		if (var37 > var7) {
																			var7 = var37;
																		}
																	}
																}
															}

															var8 = var7 * 192;
															if (var8 > 98048) {
																var8 = 98048;
															}

															if (var8 < '\u8000') {
																var8 = '\u8000';
															}

															if (var8 > Client.staticInt277) {
																Client.staticInt277 += (var8 - Client.staticInt277) / 24;
															} else if (var8 < Client.staticInt277) {
																Client.staticInt277 += (var8 - Client.staticInt277) / 80;
															}

															if (Client.staticBool28) {
																staticMethod45();
															}

															for (var2 = 0; var2 < 5; var2++) {
																++Client.staticIntArray120[var2];
															}

															Class57.staticClass5_1.method20();
															var2 = staticMethod304();
															var3 = staticMethod100();
															if (var2 > 15000 && var3 > 15000) {
																Client.staticInt196 = 250;
																MouseHandler.staticInt89 = 14500;
																Client.outBuffer.method471(255);
															}

															++Client.staticInt208;
															if (Client.staticInt208 > 500) {
																Client.staticInt208 = 0;
																var4 = (int) (Math.random() * 8.0D);
																if ((var4 & 0x1) == 1) {
																	Client.staticInt203 += Client.staticInt204
																			* -1212882327;
																}

																if ((var4 & 0x2) == 2) {
																	Client.staticInt233 += Client.staticInt205 * 5647881;
																}

																if ((var4 & 0x4) == 4) {
																	Client.staticInt206 += Client.staticInt248;
																}
															}

															if (Client.staticInt203 < -50) {
																Client.staticInt204 = -1487037518;
															}

															if (Client.staticInt203 > 50) {
																Client.staticInt204 = 1487037518;
															}

															if (Client.staticInt233 < -55) {
																Client.staticInt205 = -1803321230;
															}

															if (Client.staticInt233 > 55) {
																Client.staticInt205 = 1803321230;
															}

															if (Client.staticInt206 < -40) {
																Client.staticInt248 = 1;
															}

															if (Client.staticInt206 > 40) {
																Client.staticInt248 = -1;
															}

															++Client.staticInt213;
															if (Client.staticInt213 > 500) {
																Client.staticInt213 = 0;
																var4 = (int) (Math.random() * 8.0D);
																if ((var4 & 0x1) == 1) {
																	Client.staticInt209 += Client.staticInt210 * 362425261;
																}

																if ((var4 & 0x2) == 2) {
																	Client.staticInt211 += Client.staticInt212;
																}
															}

															if (Client.staticInt209 < -60) {
																Client.staticInt210 = 790159434;
															}

															if (Client.staticInt209 > 60) {
																Client.staticInt210 = -790159434;
															}

															if (Client.staticInt211 < -20) {
																Client.staticInt212 = 1;
															}

															if (Client.staticInt211 > 10) {
																Client.staticInt212 = -1;
															}

															for (Class40Sub1 var42 = (Class40Sub1) Client.staticClass41_1
																	.method217(); var42 != null; var42 = (Class40Sub1) Client.staticClass41_1
																			.method219()) {
																if (var42.anInt385 < staticMethod297() / 1000L - 5L) {
																	if (var42.aShort1 > 0) {
																		staticMethod36(5, "",
																				var42.aString30 + " has logged in.");
																	}

																	if (var42.aShort1 == 0) {
																		staticMethod36(5, "",
																				var42.aString30 + " has logged out.");
																	}

																	var42.method216();
																}
															}

															++Client.staticInt273;
															if (Client.staticInt273 > 50) {
																Client.outBuffer.method471(184);
															}

															try {
																if (Class56.gameConnection != null
																		&& Client.outBuffer.position > 0) {
																	Class56.gameConnection.write(
																			Client.outBuffer.buf, 0,
																			Client.outBuffer.position);
																	Client.outBuffer.position = 0;
																	Client.staticInt273 = 0;
																}
															} catch (IOException var241) {
																staticMethod329();
															}

															return;
														}

														var361 = var33.aWidget1;
														if (var361.anInt319 < 0) {
															break;
														}

														var35 = staticMethod8(var361.anInt342);
													} while (var35 == null || var35.aWidgetArray1 == null
															|| var361.anInt319 >= var35.aWidgetArray1.length
															|| var361 != var35.aWidgetArray1[var361.anInt319]);

													staticMethod375(var33);
												}
											}

											var361 = var33.aWidget1;
											if (var361.anInt319 < 0) {
												break;
											}

											var35 = staticMethod8(var361.anInt342);
										} while (var35 == null || var35.aWidgetArray1 == null
												|| var361.anInt319 >= var35.aWidgetArray1.length
												|| var361 != var35.aWidgetArray1[var361.anInt319]);

										staticMethod375(var33);
									}
								}

								var361 = var33.aWidget1;
								if (var361.anInt319 < 0) {
									break;
								}

								var35 = staticMethod8(var361.anInt342);
							} while (var35 == null || var35.aWidgetArray1 == null
									|| var361.anInt319 >= var35.aWidgetArray1.length
									|| var35.aWidgetArray1[var361.anInt319] != var361);

							staticMethod375(var33);
						}
					}

					Client.outBuffer.method471(52);
					Client.outBuffer.writeByte(0);
					var25 = Client.outBuffer.position;
					staticMethod348(Client.outBuffer);
					Client.outBuffer.method327(Client.outBuffer.position - var25);
				}
			}
		}

	}

	static ChatMessage staticMethod131(int var0) {
		return (ChatMessage) staticClass35_1.method159(var0);
	}

	static void staticMethod134(Rasterizer2DSub2Sub1 var0, Rasterizer2DSub2Sub1 var1, Rasterizer2DSub2Sub1 var2,
			boolean var3) {
		if (var3) {
			staticInt6 = (gameWidth - Client.staticInt288) / 2;
			staticInt8 = 202 + staticInt6;
		}

		byte var4;
		int var5;
		int var11;
		int var25;
		int var28;
		int var31;
		int var33;
		int var34;
		int var35;
		int var38;
		int var39;
		Graphics var41;
		if (staticBool1) {
			if (staticSpriteArray5 == null) {
				staticSpriteArray5 = staticMethod309(Class62.staticJs5IndexImpl7, "sl_back", "");
			}

			if (staticRasterizer2DSub3Array4 == null) {
				staticRasterizer2DSub3Array4 = staticMethod274(Class62.staticJs5IndexImpl7, "sl_flags", "");
			}

			if (AbstractClass3Sub1.staticRasterizer2DSub3Array6 == null) {
				AbstractClass3Sub1.staticRasterizer2DSub3Array6 = staticMethod274(Class62.staticJs5IndexImpl7,
						"sl_arrows", "");
			}

			if (RenderableSub2.staticRasterizer2DSub3Array8 == null) {
				RenderableSub2.staticRasterizer2DSub3Array8 = staticMethod274(Class62.staticJs5IndexImpl7, "sl_stars",
						"");
			}

			staticMethod418(staticInt6, 23, 765, 480, 0);
			staticMethod410(staticInt6, 0, 125, 23, 12425273, 9135624);
			staticMethod410(staticInt6 + 125, 0, 640, 23, 5197647, 2697513);
			var0.method630("Select a world", 62 + staticInt6, 15, 0, -1);
			if (RenderableSub2.staticRasterizer2DSub3Array8 != null) {
				RenderableSub2.staticRasterizer2DSub3Array8[1].method655(staticInt6 + 140, 1);
				var1.method616("Members only world", staticInt6 + 152, 10, 16777215, -1);
				RenderableSub2.staticRasterizer2DSub3Array8[0].method655(140 + staticInt6, 12);
				var1.method616("Free world", 152 + staticInt6, 21, 16777215, -1);
			}

			if (AbstractClass3Sub1.staticRasterizer2DSub3Array6 != null) {
				var25 = 280 + staticInt6;
				if (Class2.staticIntArray1[0] == 0 && Class2.staticIntArray2[0] == 0) {
					AbstractClass3Sub1.staticRasterizer2DSub3Array6[2].method655(var25, 4);
				} else {
					AbstractClass3Sub1.staticRasterizer2DSub3Array6[0].method655(var25, 4);
				}

				if (Class2.staticIntArray1[0] == 0 && Class2.staticIntArray2[0] == 1) {
					AbstractClass3Sub1.staticRasterizer2DSub3Array6[3].method655(15 + var25, 4);
				} else {
					AbstractClass3Sub1.staticRasterizer2DSub3Array6[1].method655(var25 + 15, 4);
				}

				var0.method616("World", 32 + var25, 17, 16777215, -1);
				var5 = 390 + staticInt6;
				if (Class2.staticIntArray1[0] == 1 && Class2.staticIntArray2[0] == 0) {
					AbstractClass3Sub1.staticRasterizer2DSub3Array6[2].method655(var5, 4);
				} else {
					AbstractClass3Sub1.staticRasterizer2DSub3Array6[0].method655(var5, 4);
				}

				if (Class2.staticIntArray1[0] == 1 && Class2.staticIntArray2[0] == 1) {
					AbstractClass3Sub1.staticRasterizer2DSub3Array6[3].method655(var5 + 15, 4);
				} else {
					AbstractClass3Sub1.staticRasterizer2DSub3Array6[1].method655(var5 + 15, 4);
				}

				var0.method616("Players", var5 + 32, 17, 16777215, -1);
				var34 = staticInt6 + 500;
				if (Class2.staticIntArray1[0] == 2 && Class2.staticIntArray2[0] == 0) {
					AbstractClass3Sub1.staticRasterizer2DSub3Array6[2].method655(var34, 4);
				} else {
					AbstractClass3Sub1.staticRasterizer2DSub3Array6[0].method655(var34, 4);
				}

				if (Class2.staticIntArray1[0] == 2 && Class2.staticIntArray2[0] == 1) {
					AbstractClass3Sub1.staticRasterizer2DSub3Array6[3].method655(var34 + 15, 4);
				} else {
					AbstractClass3Sub1.staticRasterizer2DSub3Array6[1].method655(var34 + 15, 4);
				}

				var0.method616("Location", var34 + 32, 17, 16777215, -1);
				var28 = staticInt6 + 610;
				if (Class2.staticIntArray1[0] == 3 && Class2.staticIntArray2[0] == 0) {
					AbstractClass3Sub1.staticRasterizer2DSub3Array6[2].method655(var28, 4);
				} else {
					AbstractClass3Sub1.staticRasterizer2DSub3Array6[0].method655(var28, 4);
				}

				if (Class2.staticIntArray1[0] == 3 && Class2.staticIntArray2[0] == 1) {
					AbstractClass3Sub1.staticRasterizer2DSub3Array6[3].method655(15 + var28, 4);
				} else {
					AbstractClass3Sub1.staticRasterizer2DSub3Array6[1].method655(15 + var28, 4);
				}

				var0.method616("Type", var28 + 32, 17, 16777215, -1);
			}

			staticMethod418(staticInt6 + 708, 4, 50, 16, 0);
			var1.method630("Cancel", 25 + staticInt6 + 708, 16, 16777215, -1);
			staticInt7 = -1;
			if (staticSpriteArray5 != null) {
				var4 = 88;
				byte var6 = 19;
				var34 = 765 / (1 + var4);
				var28 = 480 / (1 + var6);

				while (true) {
					var31 = var28;
					var33 = var34;
					if ((var34 - 1) * var28 >= Class2.staticInt2) {
						--var34;
					}

					if ((var28 - 1) * var34 >= Class2.staticInt2) {
						--var28;
					}

					if (var34 * (var28 - 1) >= Class2.staticInt2) {
						--var28;
					}

					if (var31 == var28 && var34 == var33) {
						var31 = (765 - var4 * var34) / (1 + var34);
						if (var31 > 5) {
							var31 = 5;
						}

						var33 = (480 - var6 * var28) / (var28 + 1);
						if (var33 > 5) {
							var33 = 5;
						}

						var35 = (765 - var4 * var34 - (var34 - 1) * var31) / 2;
						var11 = (480 - var6 * var28 - var33 * (var28 - 1)) / 2;
						var38 = 23 + var11;
						var39 = staticInt6 + var35;
						int var8 = 0;
						boolean var9 = false;

						int var10;
						for (var10 = 0; var10 < Class2.staticInt2; var10++) {
							Class2 var24 = Class2.staticClass2Array1[var10];
							boolean var26 = true;
							String var23 = Integer.toString(var24.anInt5);
							if (var24.anInt5 == -1) {
								var23 = "OFF";
								var26 = false;
							} else if (var24.anInt5 > 1980) {
								var23 = "FULL";
								var26 = false;
							}

							int var29 = 0;
							byte var37;
							if (var24.method6()) {
								if (var24.method10()) {
									var37 = 7;
								} else {
									var37 = 6;
								}
							} else if (var24.method9()) {
								var29 = 16711680;
								if (var24.method10()) {
									var37 = 5;
								} else {
									var37 = 4;
								}
							} else if (var24.method7()) {
								if (var24.method10()) {
									var37 = 3;
								} else {
									var37 = 2;
								}
							} else if (var24.method10()) {
								var37 = 1;
							} else {
								var37 = 0;
							}

							if (MouseHandler.staticInt94 >= var39 && MouseHandler.staticInt88 >= var38
									&& MouseHandler.staticInt94 < var4 + var39
									&& MouseHandler.staticInt88 < var6 + var38 && var26) {
								staticInt7 = var10;
								staticSpriteArray5[var37].method639(var39, var38, 128, 16777215);
								var9 = true;
							} else {
								staticSpriteArray5[var37].method636(var39, var38);
							}

							if (staticRasterizer2DSub3Array4 != null) {
								staticRasterizer2DSub3Array4[(var24.method10() ? 8 : 0) + var24.anInt6]
										.method655(var39 + 29, var38);
							}

							var0.method630(Integer.toString(var24.anInt4), 15 + var39, 5 + var6 / 2 + var38, var29, -1);
							var1.method630(var23, 60 + var39, 5 + var6 / 2 + var38, 268435455, -1);
							var38 += var6 + var33;
							++var8;
							if (var8 >= var28) {
								var38 = var11 + 23;
								var39 += var4 + var31;
								var8 = 0;
							}
						}

						if (var9) {
							var10 = var1.method613(Class2.staticClass2Array1[staticInt7].aString2) + 6;
							int var32 = 8 + var1.anInt669;
							staticMethod418(MouseHandler.staticInt94 - var10 / 2, 20 + MouseHandler.staticInt88 + 5,
									var10, var32, 16777120);
							staticMethod411(MouseHandler.staticInt94 - var10 / 2, 5 + MouseHandler.staticInt88 + 20,
									var10, var32, 0);
							var1.method630(Class2.staticClass2Array1[staticInt7].aString2,
									MouseHandler.staticInt94, 9 + MouseHandler.staticInt88 + 20 + var1.anInt669, 0, -1);
						}
						break;
					}
				}
			}

			try {
				var41 = Class38.staticCanvas1.getGraphics();
				CacheableSub2.staticGraphicsBuffer1.method279(var41, 0, 0);
			} catch (Exception var27) {
				Class38.staticCanvas1.repaint();
			}
		} else {
			if (var3) {
				staticSprite2.method636(staticInt6, 0);
				staticSprite1.method636(382 + staticInt6, 0);
				Config5.staticRasterizer2DSub3_6
						.method655(staticInt6 + 382 - Config5.staticRasterizer2DSub3_6.anInt677 / 2, 18);
			}

			if (Client.staticInt165 == 0 || Client.staticInt165 == 5) {
				var4 = 20;
				var0.method630("RuneScape is loading - please wait...", staticInt8 + 180, 245 - var4, 16777215,
						-1);
				var5 = 253 - var4;
				staticMethod411(staticInt8 + 180 - 152, var5, 304, 34, 9179409);
				staticMethod411(staticInt8 + 180 - 151, var5 + 1, 302, 32, 0);
				staticMethod418(180 + staticInt8 - 150, var5 + 2, staticInt14, 30, 9179409);
				staticMethod418(180 + staticInt8 - 150 + staticInt14, 2 + var5, 300 - staticInt14,
						30, 0);
				var0.method630(staticString3, staticInt8 + 180, 276 - var4, 16777215, -1);
			}

			String var281;
			String var291;
			String var30;
			String var311;
			short var331;
			short var341;
			if (Client.staticInt165 == 20) {
				staticRasterizer2DSub3_4.method655(
						staticInt8 + 180 - staticRasterizer2DSub3_4.anInt677 / 2,
						271 - staticRasterizer2DSub3_4.anInt678 / 2);
				var331 = 211;
				var0.method630(GPI.staticString4, 180 + staticInt8, var331, 16776960, 0);
				var25 = var331 + 15;
				var0.method630(GPI.staticString1, staticInt8 + 180, var25, 16776960, 0);
				var25 += 15;
				var0.method630(GPI.staticString6, staticInt8 + 180, var25, 16776960, 0);
				var25 += 15;
				var25 += 10;
				if (staticInt13 != 4) {
					var0.method616("Login: ", staticInt8 + 180 - 110, var25, 16777215, 0);
					var341 = 200;

					for (var281 = staticString2; var0.method613(var281) > var341; var281 = var281.substring(0,
							var281.length() - 1)) {
						;
					}

					var0.method616(staticMethod456(var281), staticInt8 + 180 - 70, var25, 16777215, 0);
					var25 += 15;
					var291 = "Password: ";
					var311 = staticString7;
					var30 = staticMethod254('*', var311.length());
					var0.method616(var291 + var30, staticInt8 + 180 - 108, var25, 16777215, 0);
					var25 += 15;
				}
			}

			if (Client.staticInt165 == 10 || Client.staticInt165 == 11) {
				staticRasterizer2DSub3_4.method655(staticInt8, 171);
				short var351;
				if (staticInt13 == 0) {
					var331 = 251;
					var0.method630("Welcome to OSRS Deob #0", 180 + staticInt8, var331, 16776960, 0);
					var25 = var331 + 30;
					var5 = staticInt8 + 180 - 80;
					var351 = 291;
					staticRasterizer2DSub3_1.method655(var5 - 73, var351 - 20);
					var0.method624("New User", var5 - 73, var351 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var5 = 180 + staticInt8 + 80;
					staticRasterizer2DSub3_1.method655(var5 - 73, var351 - 20);
					var0.method624("Existing User", var5 - 73, var351 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (staticInt13 == 1) {
					var0.method630(staticString5, staticInt8 + 180, 211, 16776960, 0);
					var331 = 236;
					var0.method630(GPI.staticString4, staticInt8 + 180, var331, 16777215, 0);
					var25 = var331 + 15;
					var0.method630(GPI.staticString1, staticInt8 + 180, var25, 16777215, 0);
					var25 += 15;
					var0.method630(GPI.staticString6, staticInt8 + 180, var25, 16777215, 0);
					var25 += 15;
					var5 = staticInt8 + 180 - 80;
					var351 = 321;
					staticRasterizer2DSub3_1.method655(var5 - 73, var351 - 20);
					var0.method630("Continue", var5, 5 + var351, 16777215, 0);
					var5 = 80 + staticInt8 + 180;
					staticRasterizer2DSub3_1.method655(var5 - 73, var351 - 20);
					var0.method630("Cancel", var5, var351 + 5, 16777215, 0);
				} else {
					short var36;
					if (staticInt13 == 2) {
						var331 = 211;
						var0.method630(GPI.staticString4, staticInt8 + 180, var331, 16776960, 0);
						var25 = var331 + 15;
						var0.method630(GPI.staticString1, 180 + staticInt8, var25, 16776960, 0);
						var25 += 15;
						var0.method630(GPI.staticString6, staticInt8 + 180, var25, 16776960, 0);
						var25 += 15;
						var25 += 10;
						var0.method616("Login: ", 180 + staticInt8 - 110, var25, 16777215, 0);
						var341 = 200;

						for (var281 = staticString2; var0.method613(var281) > var341; var281 = var281
								.substring(1)) {
							;
						}

						var0.method616(
								staticMethod456(var281) + (staticInt15 == 0 & Client.staticInt166 % 40 < 20
										? staticMethod118(16776960) + staticString15 : ""),
								180 + staticInt8 - 70, var25, 16777215, 0);
						var25 += 15;
						var291 = "Password: ";
						var311 = staticString7;
						var30 = staticMethod254('*', var311.length());
						var0.method616(
								var291 + var30
										+ (staticInt15 == 1 & Client.staticInt166 % 40 < 20
												? staticMethod118(16776960) + staticString15 : ""),
								staticInt8 + 180 - 108, var25, 16777215, 0);
						var25 += 15;
						var11 = staticInt8 + 180 - 80;
						var36 = 321;
						staticRasterizer2DSub3_1.method655(var11 - 73, var36 - 20);
						var0.method630("Login", var11, 5 + var36, 16777215, 0);
						var11 = 260 + staticInt8;
						staticRasterizer2DSub3_1.method655(var11 - 73, var36 - 20);
						var0.method630("Cancel", var11, 5 + var36, 16777215, 0);
						var331 = 357;
						var1.method630("Forgotten your password? <col=ffffff>Click here.", 180 + staticInt8,
								var331, 16776960, 0);
					} else if (staticInt13 == 3) {
						var331 = 201;
						var0.method630("Invalid username or password.", staticInt8 + 180, var331, 16776960, 0);
						var25 = var331 + 20;
						var1.method630("For accounts created after 24th November 2010, please use your",
								staticInt8 + 180, var25, 16776960, 0);
						var25 += 15;
						var1.method630("email address to login. Otherwise please login with your username.",
								staticInt8 + 180, var25, 16776960, 0);
						var25 += 15;
						var5 = staticInt8 + 180;
						var351 = 276;
						staticRasterizer2DSub3_1.method655(var5 - 73, var351 - 20);
						var2.method630("Try again", var5, 5 + var351, 16777215, 0);
						var5 = 180 + staticInt8;
						var351 = 326;
						staticRasterizer2DSub3_1.method655(var5 - 73, var351 - 20);
						var2.method630("Forgotten password?", var5, var351 + 5, 16777215, 0);
					} else if (staticInt13 == 4) {
						var0.method630("Authenticator", staticInt8 + 180, 211, 16776960, 0);
						var331 = 236;
						var0.method630(GPI.staticString4, 180 + staticInt8, var331, 16777215, 0);
						var25 = var331 + 15;
						var0.method630(GPI.staticString1, staticInt8 + 180, var25, 16777215, 0);
						var25 += 15;
						var0.method630(GPI.staticString6, 180 + staticInt8, var25, 16777215, 0);
						var25 += 15;
						var281 = "PIN: ";
						var291 = GZipDecompressor.staticString26;
						String var371 = staticMethod254('*', var291.length());
						var0.method616(
								var281 + var371
										+ (Client.staticInt166 % 40 < 20
												? staticMethod118(16776960) + staticString15 : ""),
								staticInt8 + 180 - 108, var25, 16777215, 0);
						var25 -= 8;
						var0.method616("Trust this computer", 180 + staticInt8 - 9, var25, 16776960, 0);
						var25 += 15;
						var0.method616("for 30 days: ", 180 + staticInt8 - 9, var25, 16776960, 0);
						var33 = staticInt8 + 180 - 9 + var0.method613("for 30 days: ") + 15;
						var35 = var25 - var0.anInt669;
						Rasterizer2DSub3 var40;
						if (staticBool3) {
							var40 = staticRasterizer2DSub3_3;
						} else {
							var40 = staticRasterizer2DSub3_2;
						}

						var40.method655(var33, var35);
						var25 += 15;
						var38 = 180 + staticInt8 - 80;
						short var13 = 321;
						staticRasterizer2DSub3_1.method655(var38 - 73, var13 - 20);
						var0.method630("Continue", var38, var13 + 5, 16777215, 0);
						var38 = staticInt8 + 180 + 80;
						staticRasterizer2DSub3_1.method655(var38 - 73, var13 - 20);
						var0.method630("Cancel", var38, 5 + var13, 16777215, 0);
						var1.method630("<u=ff>Can\'t Log In?</u>", staticInt8 + 180, 36 + var13, 255, 0);
					} else if (staticInt13 != 5) {
						if (staticInt13 == 6) {
							var331 = 211;
							var0.method630(GPI.staticString4, staticInt8 + 180, var331, 16776960, 0);
							var25 = var331 + 15;
							var0.method630(GPI.staticString1, 180 + staticInt8, var25, 16776960, 0);
							var25 += 15;
							var0.method630(GPI.staticString6, 180 + staticInt8, var25, 16776960, 0);
							var25 += 15;
							var5 = staticInt8 + 180;
							var351 = 321;
							staticRasterizer2DSub3_1.method655(var5 - 73, var351 - 20);
							var0.method630("Back", var5, var351 + 5, 16777215, 0);
						}
					} else {
						var0.method630("Forgotten your password?", 180 + staticInt8, 201, 16776960, 0);
						var331 = 221;
						var2.method630(GPI.staticString4, 180 + staticInt8, var331, 16776960, 0);
						var25 = var331 + 15;
						var2.method630(GPI.staticString1, staticInt8 + 180, var25, 16776960, 0);
						var25 += 15;
						var2.method630(GPI.staticString6, 180 + staticInt8, var25, 16776960, 0);
						var25 += 15;
						var25 += 14;
						var0.method616("Username/email: ", 180 + staticInt8 - 145, var25, 16777215, 0);
						var341 = 174;

						for (var281 = staticString2; var0.method613(var281) > var341; var281 = var281
								.substring(1)) {
							;
						}

						var0.method616(
								staticMethod456(var281) + (Client.staticInt166 % 40 < 20
										? staticMethod118(16776960) + staticString15 : ""),
								180 + staticInt8 - 34, var25, 16777215, 0);
						var25 += 15;
						var28 = staticInt8 + 180 - 80;
						var36 = 321;
						staticRasterizer2DSub3_1.method655(var28 - 73, var36 - 20);
						var0.method630("Recover", var28, var36 + 5, 16777215, 0);
						var28 = staticInt8 + 180 + 80;
						staticRasterizer2DSub3_1.method655(var28 - 73, var36 - 20);
						var0.method630("Back", var28, 5 + var36, 16777215, 0);
					}
				}
			}

			if (staticInt12 > 0) {
				var25 = staticInt12;
				var341 = 256;
				staticInt10 += var25 * 128;
				if (staticInt10 > staticIntArray6.length) {
					staticInt10 -= staticIntArray6.length;
					var34 = (int) (Math.random() * 12.0D);
					staticMethod38(staticRasterizer2DSub3Array5[var34]);
				}

				var34 = 0;
				var28 = var25 * 128;
				var31 = (var341 - var25) * 128;

				for (var33 = 0; var33 < var31; var33++) {
					var35 = Class61.staticIntArray77[var34 + var28] - var25
							* staticIntArray6[staticInt10 + var34 & staticIntArray6.length - 1]
							/ 6;
					if (var35 < 0) {
						var35 = 0;
					}

					Class61.staticIntArray77[var34++] = var35;
				}

				var33 = var341 - var25;

				while (true) {
					if (var33 >= var341) {
						if (staticInt9 > 0) {
							staticInt9 -= var25 * 4;
						}

						if (staticInt5 > 0) {
							staticInt5 -= var25 * 4;
						}

						if (staticInt9 == 0 && staticInt5 == 0) {
							var33 = (int) (Math.random() * (2000 / var25));
							if (var33 == 0) {
								staticInt9 = 1024;
							}

							if (var33 == 1) {
								staticInt5 = 1024;
							}
						}

						for (var33 = 0; var33 < var341 - var25; var33++) {
							staticIntArray4[var33] = staticIntArray4[var25 + var33];
						}

						for (var33 = var341 - var25; var33 < var341; var33++) {
							staticIntArray4[var33] = (int) (Math.sin(staticInt11 / 14.0D) * 16.0D
									+ Math.sin(staticInt11 / 15.0D) * 14.0D
									+ Math.sin(staticInt11 / 16.0D) * 12.0D);
							++staticInt11;
						}

						staticInt16 += var25;
						var33 = (var25 + (Client.staticInt166 & 0x1)) / 2;
						if (var33 > 0) {
							for (var35 = 0; var35 < staticInt16 * 100; var35++) {
								var11 = (int) (Math.random() * 124.0D) + 2;
								var38 = (int) (Math.random() * 128.0D) + 128;
								Class61.staticIntArray77[var11 + (var38 << 7)] = 192;
							}

							staticInt16 = 0;

							for (var35 = 0; var35 < var341; var35++) {
								var11 = 0;
								var38 = var35 * 128;

								for (var39 = -var33; var39 < 128; var39++) {
									if (var39 + var33 < 128) {
										var11 += Class61.staticIntArray77[var39 + var38 + var33];
									}

									if (var39 - (var33 + 1) >= 0) {
										var11 -= Class61.staticIntArray77[var39 + var38 - (1 + var33)];
									}

									if (var39 >= 0) {
										staticIntArray62[var38 + var39] = var11 / (1 + var33 * 2);
									}
								}
							}

							for (var35 = 0; var35 < 128; var35++) {
								var11 = 0;

								for (var38 = -var33; var38 < var341; var38++) {
									var39 = var38 * 128;
									if (var33 + var38 < var341) {
										var11 += staticIntArray62[var35 + var39 + var33 * 128];
									}

									if (var38 - (1 + var33) >= 0) {
										var11 -= staticIntArray62[var39 + var35 - (var33 + 1) * 128];
									}

									if (var38 >= 0) {
										Class61.staticIntArray77[var35 + var39] = var11 / (var33 * 2 + 1);
									}
								}
							}
						}

						staticInt12 = 0;
						break;
					}

					var35 = var33 * 128;

					for (var11 = 0; var11 < 128; var11++) {
						var38 = (int) (Math.random() * 100.0D);
						if (var38 < 50 && var11 > 10 && var11 < 118) {
							Class61.staticIntArray77[var11 + var35] = 255;
						} else {
							Class61.staticIntArray77[var35 + var11] = 0;
						}
					}

					++var33;
				}
			}

			staticMethod196();
			Class33.staticRasterizer2DSub3Array3[staticClass6_1.aBool2 ? 1 : 0]
					.method655(staticInt6 + 765 - 40, 463);
			if (Client.staticInt165 > 5 && Client.staticInt231 == 0) {
				if (Client.staticRasterizer2DSub3_5 != null) {
					var25 = 5 + staticInt6;
					var341 = 463;
					byte var381 = 100;
					byte var391 = 35;
					Client.staticRasterizer2DSub3_5.method655(var25, var341);
					var0.method630("World " + Client.staticInt309, var25 + var381 / 2, var391 / 2 + var341 - 2, 16777215,
							0);
					if (Class2.staticClass3_1 != null) {
						var1.method630("Loading...", var25 + var381 / 2, var391 / 2 + var341 + 12, 16777215, 0);
					} else {
						var1.method630("Click to switch", var25 + var381 / 2, var341 + var391 / 2 + 12, 16777215, 0);
					}
				} else {
					Client.staticRasterizer2DSub3_5 = staticMethod25(Class62.staticJs5IndexImpl7, "sl_button", "");
				}
			}

			try {
				var41 = Class38.staticCanvas1.getGraphics();
				CacheableSub2.staticGraphicsBuffer1.method279(var41, 0, 0);
			} catch (Exception var261) {
				Class38.staticCanvas1.repaint();
			}
		}

	}

	static void staticMethod135(Widget[] var0, Widget var1, boolean var2) {
		int var5 = var1.anInt344 != 0 ? var1.anInt344 : var1.anInt307;
		int var6 = var1.anInt361 != 0 ? var1.anInt361 : var1.anInt351;
		staticMethod215(var0, var1.anInt294, var5, var6, var2);
		if (var1.aWidgetArray1 != null) {
			staticMethod215(var1.aWidgetArray1, var1.anInt294, var5, var6, var2);
		}

		KeyFocusListener var3 = (KeyFocusListener) Client.staticHashTable5.method149(var1.anInt294);
		if (var3 != null) {
			int var4 = var3.anInt384;
			if (staticMethod4(var4)) {
				staticMethod215(Widget.staticWidgetArrayArray1[var4], -1, var5, var6, var2);
			}
		}

		if (var1.anInt298 == 1337) {
			;
		}

	}

	static int staticMethod144(int var0, CacheableSub1 var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = staticMethod8(staticIntArray16[--staticInt27]);
		} else {
			var3 = var2 ? Class3.staticWidget1 : staticWidget2;
		}

		if (var0 == 1927) {
			if (staticInt29 * 1671809951 >= 10) {
				throw new RuntimeException();
			} else if (var3.anObjectArray25 == null) {
				return 0;
			} else {
				NodeSub16 var4 = new NodeSub16();
				var4.aWidget1 = var3;
				var4.anObjectArray2 = var3.anObjectArray25;
				var4.anInt289 = staticInt29 * 972573517 + 223297939;
				Client.staticClass39_8.method198(var4);
				return 1;
			}
		} else {
			return 2;
		}
	}

	static void staticMethod145() {
		NodeSub20.staticHashTable7 = new HashTable(32);
	}

	static final boolean staticMethod146(int var0, int var1) {
		ObjectDefinition var2 = staticMethod394(var0);
		if (var1 == 11) {
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4;
		}

		return var2.method511(var1);
	}

	static void staticMethod150() {
		Client.staticLong10 = 1L;
		Client.staticInt163 = -1;
		Client.staticMouseCapturer1.anInt211 = 0;
		RuntimeExceptionSub1.staticBool9 = true;
		Client.staticBool41 = true;
		Client.staticLong13 = -1L;
		staticMethod63();
		Client.outBuffer.position = 0;
		Client.inBuffer.position = 0;
		Client.staticInt191 = -1;
		Client.staticInt270 = 1;
		Client.staticInt194 = 1;
		Client.staticInt195 = 1;
		Client.staticInt192 = 0;
		Client.staticInt170 = 0;
		Client.staticInt196 = 0;
		Client.staticInt255 = 0;
		Client.staticInt252 = 0;
		Client.staticInt217 = -1;
		Client.staticBool30 = false;
		MouseHandler.staticInt89 = 0;
		staticMap1.clear();
		staticClass35_1.method158();
		staticClass45_1.method221();
		staticInt18 = 0;
		Client.staticInt258 = 0;
		Client.staticBool32 = false;
		Client.staticInt236 = 0;
		Client.staticInt203 = (int) (Math.random() * 100.0D) - 50;
		Client.staticInt233 = (int) (Math.random() * 110.0D) - 55;
		Client.staticInt206 = (int) (Math.random() * 80.0D) - 40;
		Client.staticInt209 = (int) (Math.random() * 120.0D) - 60;
		Client.staticInt211 = (int) (Math.random() * 30.0D) - 20;
		Client.staticInt221 = (int) (Math.random() * 20.0D) - 10 & 0x7ff;
		Client.staticInt298 = 0;
		Client.staticInt294 = 1;
		Client.staticInt296 = 0;
		Client.staticInt240 = 0;
		Client.staticClass4_5 = Class4.staticClass4_2;
		Client.staticClass4_6 = Class4.staticClass4_2;
		Client.staticInt186 = 0;
		staticMethod398();

		int var0;
		for (var0 = 0; var0 < 2048; var0++) {
			Client.staticPlayerArray1[var0] = null;
		}

		for (var0 = 0; var0 < '\u8000'; var0++) {
			Client.staticNpcArray1[var0] = null;
		}

		Client.staticInt229 = -1;
		Client.staticClass39_5.method191();
		Client.staticClass39_6.method191();

		int var1;
		for (var0 = 0; var0 < 4; var0++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (var1 = 0; var1 < 104; var1++) {
					Client.staticClass39ArrayArrayArray1[var0][var4][var1] = null;
				}
			}
		}

		Client.staticClass39_7 = new Class39();
		Client.staticInt202 = 0;
		Client.staticInt308 = 0;
		Client.staticInt310 = 0;

		for (var0 = 0; var0 < Varp.staticInt323; var0++) {
			Varp var3 = staticMethod119(var0);
			if (var3 != null) {
				staticIntArray63[var0] = 0;
				staticIntArray64[var0] = 0;
			}
		}

		Class57.staticClass5_1.method19();
		Client.staticInt269 = 1;
		if (Client.staticInt263 != -1) {
			var0 = Client.staticInt263;
			if (var0 != -1 && Npc.staticBoolArray12[var0]) {
				Widget.staticJs5Index10.method265(var0);
				if (Widget.staticWidgetArrayArray1[var0] != null) {
					boolean var41 = true;

					for (var1 = 0; var1 < Widget.staticWidgetArrayArray1[var0].length; var1++) {
						if (Widget.staticWidgetArrayArray1[var0][var1] != null) {
							if (Widget.staticWidgetArrayArray1[var0][var1].anInt296 != 2) {
								Widget.staticWidgetArrayArray1[var0][var1] = null;
							} else {
								var41 = false;
							}
						}
					}

					if (var41) {
						Widget.staticWidgetArrayArray1[var0] = null;
					}

					Npc.staticBoolArray12[var0] = false;
				}
			}
		}

		for (KeyFocusListener var5 = (KeyFocusListener) Client.staticHashTable5
				.method146(); var5 != null; var5 = (KeyFocusListener) Client.staticHashTable5.method147()) {
			staticMethod266(var5, true);
		}

		Client.staticInt263 = -1;
		Client.staticHashTable5 = new HashTable(8);
		Client.staticWidget6 = null;
		Client.staticInt252 = 0;
		Client.staticInt217 = -1;
		Client.staticBool30 = false;
		Client.staticClass49_1.method252((int[]) null, new int[5], false, -1);

		for (var0 = 0; var0 < 8; var0++) {
			Client.staticStringArray7[var0] = null;
			Client.staticBoolArray5[var0] = false;
		}

		staticMethod145();
		Client.staticBool21 = true;

		for (var0 = 0; var0 < 100; var0++) {
			Client.staticBoolArray8[var0] = true;
		}

		staticMethod34();
		Client.staticString34 = null;
		staticInt149 = 0;
		Class43.staticNodeSub1Array1 = null;

		for (var0 = 0; var0 < 8; var0++) {
			Client.staticClass61Array1[var0] = new Class61();
		}

		staticClass56_1 = null;
	}

	static synchronized byte[] staticMethod151(int var0) {
		byte[] var1;
		if (var0 == 100 && staticInt117 > 0) {
			var1 = staticByteArrayArray3[--staticInt117];
			staticByteArrayArray3[staticInt117] = null;
			return var1;
		} else if (var0 == 5000 && staticInt116 > 0) {
			var1 = staticByteArrayArray5[--staticInt116];
			staticByteArrayArray5[staticInt116] = null;
			return var1;
		} else if (var0 == 30000 && staticInt115 > 0) {
			var1 = staticByteArrayArray4[--staticInt115];
			staticByteArrayArray4[staticInt115] = null;
			return var1;
		} else {
			return new byte[var0];
		}
	}

	static final void staticMethod152(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7,
			Scene var8, Class38[] var9) {
		ByteBuf var10 = new ByteBuf(var0);
		int var14 = -1;

		while (true) {
			int var15 = var10.method379();
			if (var15 == 0) {
				return;
			}

			var14 += var15;
			int var11 = 0;

			while (true) {
				int var19 = var10.method379();
				if (var19 == 0) {
					break;
				}

				var11 += var19 - 1;
				int var30 = var11 & 0x3f;
				int var13 = var11 >> 6 & 0x3f;
				int var12 = var11 >> 12;
				int var24 = var10.method367();
				int var25 = var24 >> 2;
				int var26 = var24 & 0x3;
				if (var12 == var4 && var13 >= var5 && var13 < 8 + var5 && var30 >= var6 && var30 < var6 + 8) {
					ObjectDefinition var28 = staticMethod394(var14);
					int var29 = var13 & 0x7;
					int var16 = var30 & 0x7;
					int var23 = var28.anInt485;
					int var17 = var28.anInt486;
					int var22;
					if ((var26 & 0x1) == 1) {
						var22 = var23;
						var23 = var17;
						var17 = var22;
					}

					int var31 = var7 & 0x3;
					int var18;
					if (var31 == 0) {
						var18 = var29;
					} else if (var31 == 1) {
						var18 = var16;
					} else if (var31 == 2) {
						var18 = 7 - var29 - (var23 - 1);
					} else {
						var18 = 7 - var16 - (var17 - 1);
					}

					var22 = var2 + var18;
					int var37 = var13 & 0x7;
					int var33 = var30 & 0x7;
					int var20 = var28.anInt485;
					int var34 = var28.anInt486;
					int var21;
					if ((var26 & 0x1) == 1) {
						var21 = var20;
						var20 = var34;
						var34 = var21;
					}

					int var38 = var7 & 0x3;
					int var35;
					if (var38 == 0) {
						var35 = var33;
					} else if (var38 == 1) {
						var35 = 7 - var37 - (var20 - 1);
					} else if (var38 == 2) {
						var35 = 7 - var33 - (var34 - 1);
					} else {
						var35 = var37;
					}

					var21 = var35 + var3;
					if (var22 > 0 && var21 > 0 && var22 < 103 && var21 < 103) {
						int var39 = var1;
						if ((staticByteArrayArrayArray4[1][var22][var21] & 0x2) == 2) {
							var39 = var1 - 1;
						}

						Class38 var32 = null;
						if (var39 >= 0) {
							var32 = var9[var39];
						}

						staticMethod46(var1, var22, var21, var14, var26 + var7 & 0x3, var25, var8, var32);
					}
				}
			}
		}
	}

	public static ItemDefinition staticMethod153(int var0) {
		ItemDefinition var1 = (ItemDefinition) ItemDefinition.staticCache10.get(var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ItemDefinition.staticJs5Index15.getFile(10, var0);
			var1 = new ItemDefinition();
			var1.anInt437 = var0;
			if (var2 != null) {
				var1.method498(new ByteBuf(var2));
			}

			var1.method486();
			if (var1.anInt457 != -1) {
				var1.method489(staticMethod153(var1.anInt457), staticMethod153(var1.anInt435));
			}

			if (var1.anInt465 != -1) {
				var1.method490(staticMethod153(var1.anInt465), staticMethod153(var1.anInt464));
			}

			if (var1.anInt467 != -1) {
				var1.method497(staticMethod153(var1.anInt467), staticMethod153(var1.anInt445));
			}

			if (!staticBool4 && var1.aBool55) {
				var1.aString31 = "Members object";
				var1.aBool56 = false;
				var1.aStringArray7 = null;
				var1.aStringArray6 = null;
				var1.anInt443 = -1;
				var1.anInt463 = 0;
			}

			ItemDefinition.staticCache10.method170(var1, var0);
			return var1;
		}
	}

	static final boolean staticMethod154(byte[] var0, int var1, int var2) {
		boolean var3 = true;
		ByteBuf var6 = new ByteBuf(var0);
		int var5 = -1;

		label56: while (true) {
			int var7 = var6.method379();
			if (var7 == 0) {
				return var3;
			}

			var5 += var7;
			int var10 = 0;
			boolean var9 = false;

			while (true) {
				int var12;
				while (!var9) {
					var12 = var6.method379();
					if (var12 == 0) {
						continue label56;
					}

					var10 += var12 - 1;
					int var11 = var10 & 0x3f;
					int var15 = var10 >> 6 & 0x3f;
					int var14 = var6.method367() >> 2;
					int var8 = var15 + var1;
					int var13 = var2 + var11;
					if (var8 > 0 && var13 > 0 && var8 < 103 && var13 < 103) {
						ObjectDefinition var4 = staticMethod394(var5);
						if (var14 != 22 || !Client.lowMemory || var4.anInt489 != 0 || var4.anInt487 == 1
								|| var4.aBool63) {
							if (!var4.method513()) {
								++Client.staticInt199;
								var3 = false;
							}

							var9 = true;
						}
					}
				}

				var12 = var6.method379();
				if (var12 == 0) {
					break;
				}

				var6.method367();
			}
		}
	}

	// TODO player updating?
	static final void staticMethod155(BitBuf var0, int var1, Player player, int var3) {		
		byte var4 = -1;
		int var7;
		if ((var3 & 0x80) != 0) {
			var7 = var0.method367();
			byte[] var15 = new byte[var7];
			ByteBuf var11 = new ByteBuf(var15);
			var0.readBytes(var15, 0, var7);
			cachedAppearances[var1] = var11;
			player.decodeAppearance(var11);
		}

		int var151;
		if ((var3 & 0x8) != 0) {
			var7 = var0.method370();
			if (var7 == '\uffff') {
				var7 = -1;
			}

			var151 = var0.method367();
			staticMethod94(player, var7, var151);
		}

		if ((var3 & 0x10) != 0) {
			player.anInt600 = var0.method370();
			if (player.anInt600 == '\uffff') {
				player.anInt600 = -1;
			}
		}

		if ((var3 & 0x2) != 0) {
			player.aString39 = var0.readString();
			if (player.aString39.charAt(0) == 126) {
				player.aString39 = player.aString39.substring(1);
				staticMethod36(2, player.aString40, player.aString39);
			} else if (player == AbstractClass2Sub1.staticPlayer1) {
				staticMethod36(2, player.aString40, player.aString39);
			}

			player.aBool75 = false;
			player.anInt602 = 0;
			player.anInt603 = 0;
			player.anInt601 = 150;
		}

		int var12;
		int var161;
		if ((var3 & 0x20) != 0) {
			var7 = var0.method367();
			int var19;
			int var16;
			int var20;
			if (var7 > 0) {
				for (var151 = 0; var151 < var7; var151++) {
					var16 = -1;
					var161 = -1;
					var12 = -1;
					var20 = var0.method379();
					if (var20 == 32767) {
						var20 = var0.method379();
						var161 = var0.method379();
						var16 = var0.method379();
						var12 = var0.method379();
					} else if (var20 != 32766) {
						var161 = var0.method379();
					} else {
						var20 = -1;
					}

					var19 = var0.method379();
					player.method566(var20, var161, var16, var12, Client.staticInt166, var19);
				}
			}

			var151 = var0.method367();
			if (var151 > 0) {
				for (var20 = 0; var20 < var151; var20++) {
					var16 = var0.method379();
					var161 = var0.method379();
					if (var161 != 32767) {
						var12 = var0.method379();
						var19 = var0.method367();
						int var18 = var161 > 0 ? var0.method367() : var19;
						player.method564(var16, Client.staticInt166, var161, var12, var19, var18);
					} else {
						player.method563(var16);
					}
				}
			}
		}

		if ((var3 & 0x1) != 0) {
			player.anInt608 = var0.method370();
			if (player.anInt632 == 0) {
				player.anInt630 = player.anInt608;
				player.anInt608 = -1;
			}
		}

		if ((var3 & 0x4) != 0) {
			var7 = var0.method370();
			Class48[] var17 = new Class48[] { Class48.staticClass48_4, Class48.staticClass48_6, Class48.staticClass48_2,
					Class48.staticClass48_1, Class48.staticClass48_5, Class48.staticClass48_3 };
			Class48 var191 = (Class48) staticMethod233(var17, var0.method367());
			boolean var211 = var0.method367() == 1;
			var161 = var0.method367();
			var12 = var0.position;
			if (player.aString40 != null && player.aClass49_1 != null) {
				boolean var201 = false;
				if (var191.aBool14 && staticMethod141(player.aString40)) {
					var201 = true;
				}

				if (!var201 && Client.staticInt245 == 0 && !player.aBool81) {
					staticStream1.position = 0;
					var0.readBytes(staticStream1.buf, 0, var161);
					staticStream1.position = 0;
					String var21 = staticMethod456(staticMethod265(staticMethod191(staticStream1)));
					player.aString39 = var21.trim();
					player.anInt602 = var7 >> 8;
					player.anInt603 = var7 & 0xff;
					player.anInt601 = 150;
					player.aBool75 = var211;
					player.aBool77 = AbstractClass2Sub1.staticPlayer1 != player && var191.aBool14
							&& Client.staticString33 != "" && var21.toLowerCase().indexOf(Client.staticString33) == -1;
					int var9;
					if (var191.aBool15) {
						var9 = var211 ? 91 : 1;
					} else {
						var9 = var211 ? 90 : 2;
					}

					if (var191.anInt192 != -1) {
						staticMethod36(var9, staticMethod123(var191.anInt192) + player.aString40, var21);
					} else {
						staticMethod36(var9, player.aString40, var21);
					}
				}
			}

			var0.position = var12 + var161;
		}

		if ((var3 & 0x200) != 0) {
			player.anInt596 = var0.method370();
			var7 = var0.readInt();
			player.anInt620 = var7 >> 16;
			player.anInt619 = Client.staticInt166 + (var7 & 0xffff);
			player.anInt616 = 0;
			player.anInt618 = 0;
			if (player.anInt619 > Client.staticInt166) {
				player.anInt616 = -1;
			}

			if (player.anInt596 == '\uffff') {
				player.anInt596 = -1;
			}
		}
		
		//gfx
		if ((var3 & 0x400) != 0) {
			player.anInt606 = var0.readByte();
			player.anInt623 = var0.readByte();
			player.anInt617 = var0.readByte();
			player.anInt624 = var0.readByte();
			player.anInt625 = var0.method370() + Client.staticInt166;
			player.anInt604 = var0.method370() + Client.staticInt166;
			player.anInt627 = var0.method370() * -1576115929;
			if (player.aBool82) {
				player.anInt606 += player.anInt700;
				player.anInt623 += player.anInt692;
				player.anInt617 += player.anInt700;
				player.anInt624 += player.anInt692;
				player.anInt632 = 0;
			} else {
				player.anInt606 += player.anIntArray127[0];
				player.anInt623 += player.anIntArray122[0];
				player.anInt617 += player.anIntArray127[0];
				player.anInt624 += player.anIntArray122[0];
				player.anInt632 = 1;
			}

			player.anInt599 = 0;
		}

		if ((var3 & 0x1000) != 0) {
			staticByteArray2[var1] = var0.readByte();
		}

		if ((var3 & 0x100) != 0) {
			var4 = var0.readByte();
		}

		if ((var3 & 0x800) != 0) {
			for (var7 = 0; var7 < 3; var7++) {
				player.aStringArray11[var7] = var0.readString();
			}
		}

		if (player.aBool82) {
			if (var4 == 127) {
				player.method661(player.anInt700, player.anInt692);
			} else {
				byte var181;
				if (var4 != -1) {
					var181 = var4;
				} else {
					var181 = staticByteArray2[var1];
				}

				player.method660(player.anInt700, player.anInt692, var181);
			}
		}

	}

	static void staticMethod156(int var0, Js5DiskCache var1, Js5IndexImpl var2) {
		byte[] var3 = null;
		synchronized (FileRequestTask.staticClass39_3) {
			for (Js5CacheWriteRequest var5 = (Js5CacheWriteRequest) FileRequestTask.staticClass39_3
					.method195(); var5 != null; var5 = (Js5CacheWriteRequest) FileRequestTask.staticClass39_3.method193()) {
				if (var5.id == var0 && var1 == var5.aJs5DiskCache1 && var5.anInt290 == 0) {
					var3 = var5.aByteArray22;
					break;
				}
			}
		}

		if (var3 != null) {
			var2.method394(var1, var0, var3, true);
		} else {
			byte[] var81 = var1.method155(var0);
			var2.method394(var1, var0, var81, true);
		}

	}

	static final int staticMethod157(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer2DSub1.staticIntArray159[var2 * 1024 / var3] >> 1;
		return (var1 * var4 >> 16) + ((65536 - var4) * var0 >> 16);
	}

	static String staticMethod158(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) {
			int var2;
			for (var2 = 1; var2 <= 5; var2++) {
				while (true) {
					int var7 = var0.indexOf("%" + var2);
					if (var7 == -1) {
						break;
					}

					String var5 = var0.substring(0, var7);
					int var4 = staticMethod42(var1, var2 - 1);
					String var6;
					if (var4 < 999999999) {
						var6 = Integer.toString(var4);
					} else {
						var6 = "*";
					}

					var0 = var5 + var6 + var0.substring(2 + var7);
				}
			}

			while (true) {
				var2 = var0.indexOf("%dns");
				if (var2 == -1) {
					break;
				}

				String var71 = "";
				if (KeyboardHandler.staticTask2 != null) {
					var71 = staticMethod187(KeyboardHandler.staticTask2.anInt85);
					if (KeyboardHandler.staticTask2.anObject2 != null) {
						var71 = (String) KeyboardHandler.staticTask2.anObject2;
					}
				}

				var0 = var0.substring(0, var2) + var71 + var0.substring(var2 + 4);
			}
		}

		return var0;
	}

	static void staticMethod159(AnimDef var0, int var1, int var2, int var3) {
		if (Client.staticInt236 < 50 && Client.staticInt301 != 0 && var0.anIntArray120 != null
				&& var1 < var0.anIntArray120.length) {
			int var7 = var0.anIntArray120[var1];
			if (var7 != 0) {
				int var8 = var7 >> 8;
				int var9 = var7 >> 4 & 0x7;
				int var4 = var7 & 0xf;
				Client.staticIntArray114[Client.staticInt236] = var8;
				Client.staticIntArray115[Client.staticInt236] = var9;
				Client.staticIntArray116[Client.staticInt236] = 0;
				Client.staticClass9Array1[Client.staticInt236] = null;
				int var5 = (var2 - 64) / 128;
				int var6 = (var3 - 64) / 128;
				Client.staticIntArray117[Client.staticInt236] = var4 + (var5 << 16) + (var6 << 8);
				++Client.staticInt236;
			}
		}

	}

	static final void staticMethod160() {
		FloorOverlayDef.staticCache26.method171();
		FloorUnderlayDef.staticCache20.method171();
		staticMethod305();
		staticMethod11();
		staticMethod424();
		staticMethod39();
		staticMethod334();
		SpotAnim.staticCache30.method171();
		SpotAnim.staticCache29.method171();
		Varbit.staticCache7.method171();
		Varp.staticCache25.method171();
		CacheableSub5.staticCache12.method171();
		CacheableSub5.staticCache14.method171();
		CacheableSub5.staticCache13.method171();
		staticMethod189();
		Class49.staticCache1.method171();
		Widget.staticCache2.method171();
		Widget.staticCache5.method171();
		Widget.staticCache3.method171();
		Widget.staticCache4.method171();
		((Class11) Rasterizer2DSub1.staticInterface2_1).method35();
		CacheableSub1.staticCache6.method171();
		Client.staticJs5IndexImpl8.method272();
		FloorUnderlayDef.staticJs5IndexImpl13.method272();
		CanvasSub1.staticJs5IndexImpl5.method272();
		Config19.staticJs5IndexImpl15.method272();
		RenderableSub2.staticJs5IndexImpl16.method272();
		Class34.staticJs5IndexImpl3.method272();
		ClientScriptMap.staticJs5IndexImpl14.method272();
		Class62.staticJs5IndexImpl7.method272();
		IdentityKit.staticJs5IndexImpl12.method272();
		AbstractClass3Sub1.staticJs5IndexImpl10.method272();
		Class56.staticJs5IndexImpl6.method272();
		Connection.staticJs5IndexImpl4.method272();
	}

	static int staticMethod161(int var0, CacheableSub1 var1, boolean var2) {
		int var5;
		int var6;
		Widget var7;
		if (var0 == 100) {
			staticInt27 -= 3;
			var5 = staticIntArray16[staticInt27];
			var6 = staticIntArray16[1 + staticInt27];
			int var91 = staticIntArray16[staticInt27 + 2];
			if (var6 == 0) {
				throw new RuntimeException();
			} else {
				var7 = staticMethod8(var5);
				if (var7.aWidgetArray1 == null) {
					var7.aWidgetArray1 = new Widget[1 + var91];
				}

				if (var7.aWidgetArray1.length <= var91) {
					Widget[] var9 = new Widget[var91 + 1];

					for (int var8 = 0; var8 < var7.aWidgetArray1.length; var8++) {
						var9[var8] = var7.aWidgetArray1[var8];
					}

					var7.aWidgetArray1 = var9;
				}

				if (var91 > 0 && var7.aWidgetArray1[var91 - 1] == null) {
					throw new RuntimeException("" + (var91 - 1));
				} else {
					Widget var101 = new Widget();
					var101.anInt296 = var6;
					var101.anInt342 = var101.anInt294 = var7.anInt294 * 1;
					var101.anInt319 = var91;
					var101.aBool42 = true;
					var7.aWidgetArray1[var91] = var101;
					if (var2) {
						Class3.staticWidget1 = var101;
					} else {
						staticWidget2 = var101;
					}

					staticMethod73(var7);
					return 1;
				}
			}
		} else {
			Widget var10;
			if (var0 == 101) {
				var10 = var2 ? Class3.staticWidget1 : staticWidget2;
				var7 = staticMethod8(var10.anInt294);
				var7.aWidgetArray1[var10.anInt319] = null;
				staticMethod73(var7);
				return 1;
			} else if (var0 == 102) {
				var10 = staticMethod8(staticIntArray16[--staticInt27]);
				var10.aWidgetArray1 = null;
				staticMethod73(var10);
				return 1;
			} else if (var0 != 200) {
				if (var0 == 201) {
					var10 = staticMethod8(staticIntArray16[--staticInt27]);
					if (var10 != null) {
						staticIntArray16[++staticInt27 - 1] = 1;
						if (var2) {
							Class3.staticWidget1 = var10;
						} else {
							staticWidget2 = var10;
						}
					} else {
						staticIntArray16[++staticInt27 - 1] = 0;
					}

					return 1;
				} else {
					return 2;
				}
			} else {
				staticInt27 -= 2;
				var5 = staticIntArray16[staticInt27];
				var6 = staticIntArray16[staticInt27 + 1];
				var7 = staticMethod32(var5, var6);
				if (var7 != null && var6 != -1) {
					staticIntArray16[++staticInt27 - 1] = 1;
					if (var2) {
						Class3.staticWidget1 = var7;
					} else {
						staticWidget2 = var7;
					}
				} else {
					staticIntArray16[++staticInt27 - 1] = 0;
				}

				return 1;
			}
		}
	}

	static void staticMethod162(int var0) {
		NodeSub20 var1 = (NodeSub20) NodeSub20.staticHashTable7.method149(var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.anIntArray82.length; var2++) {
				var1.anIntArray82[var2] = -1;
				var1.anIntArray83[var2] = 0;
			}
		}

	}

	static final void staticMethod17() {
		if (NodeSub12.staticClass19_1 != null) {
			NodeSub12.staticClass19_1.method66();
		}

		if (ByteBuf.staticClass19_2 != null) {
			ByteBuf.staticClass19_2.method66();
		}

	}

	static int staticMethod18(BitBuf var0) {
		int var1 = var0.method477(2);
		int var2;
		if (var1 == 0) {
			var2 = 0;
		} else if (var1 == 1) {
			var2 = var0.method477(5);
		} else if (var1 == 2) {
			var2 = var0.method477(8);
		} else {
			var2 = var0.method477(11);
		}

		return var2;
	}

	public static String staticMethod19(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var3 = new StringBuilder(var1);

		for (int var5 = 0; var5 < var1; var5++) {
			char var2 = var0.charAt(var5);
			if ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 46
					&& var2 != 45 && var2 != 42 && var2 != 95) {
				if (var2 == 32) {
					var3.append('+');
				} else {
					byte var6 = staticMethod319(var2);
					var3.append('%');
					int var4 = var6 >> 4 & 0xf;
					if (var4 >= 10) {
						var3.append((char) (var4 + 55));
					} else {
						var3.append((char) (var4 + 48));
					}

					var4 = var6 & 0xf;
					if (var4 >= 10) {
						var3.append((char) (var4 + 55));
					} else {
						var3.append((char) (48 + var4));
					}
				}
			} else {
				var3.append(var2);
			}
		}

		return var3.toString();
	}

	static final void staticMethod20() {
		staticMethod73(Client.staticWidget7);
		++Class2.staticInt4;
		if (Client.staticBool29 && Client.staticBool35) {
			int var1 = MouseHandler.staticInt94;
			int var3 = MouseHandler.staticInt88;
			var1 -= Client.staticInt287;
			var3 -= Client.staticInt261;
			if (var1 < Client.staticInt183) {
				var1 = Client.staticInt183;
			}

			if (Client.staticWidget7.anInt307 + var1 > Client.staticWidget8.anInt307 + Client.staticInt183) {
				var1 = Client.staticWidget8.anInt307 + Client.staticInt183 - Client.staticWidget7.anInt307;
			}

			if (var3 < Client.staticInt313) {
				var3 = Client.staticInt313;
			}

			if (Client.staticWidget7.anInt351 + var3 > Client.staticWidget8.anInt351 + Client.staticInt313) {
				var3 = Client.staticWidget8.anInt351 + Client.staticInt313 - Client.staticWidget7.anInt351;
			}

			int var4 = var1 - Client.staticInt272;
			int var6 = var3 - Client.staticInt290;
			int var5 = Client.staticWidget7.anInt345;
			if (Class2.staticInt4 > Client.staticWidget7.anInt316
					&& (var4 > var5 || var4 < -var5 || var6 > var5 || var6 < -var5)) {
				Client.staticBool25 = true;
			}

			int var7 = Client.staticWidget8.anInt335 + var1 - Client.staticInt183;
			int var9 = var3 - Client.staticInt313 + Client.staticWidget8.anInt312;
			NodeSub16 var0;
			if (Client.staticWidget7.anObjectArray10 != null && Client.staticBool25) {
				var0 = new NodeSub16();
				var0.aWidget1 = Client.staticWidget7;
				var0.anInt284 = var7;
				var0.anInt285 = var9;
				var0.anObjectArray2 = Client.staticWidget7.anObjectArray10;
				staticMethod375(var0);
			}

			if (MouseHandler.staticInt93 == 0) {
				if (Client.staticBool25) {
					if (Client.staticWidget7.anObjectArray28 != null) {
						var0 = new NodeSub16();
						var0.aWidget1 = Client.staticWidget7;
						var0.anInt284 = var7;
						var0.anInt285 = var9;
						var0.aWidget2 = Client.staticWidget9;
						var0.anObjectArray2 = Client.staticWidget7.anObjectArray28;
						staticMethod375(var0);
					}

					if (Client.staticWidget9 != null) {
						Widget var141 = Client.staticWidget7;
						int var15 = staticMethod192(var141);
						int var10 = var15 >> 17 & 0x7;
						int var11 = var10;
						Widget var14;
						if (var10 == 0) {
							var14 = null;
						} else {
							label130: {
								for (int var12 = 0; var12 < var11; var12++) {
									var141 = staticMethod8(var141.anInt342);
									if (var141 == null) {
										var14 = null;
										break label130;
									}
								}

								var14 = var141;
							}
						}

						if (var14 != null) {
							Client.outBuffer.method471(157);
							Client.outBuffer.method351(Client.staticWidget9.anInt352);
							Client.outBuffer.method351(Client.staticWidget7.anInt319);
							Client.outBuffer.method352(Client.staticWidget9.anInt319);
							Client.outBuffer.method369(Client.staticWidget7.anInt352);
							Client.outBuffer.method359(Client.staticWidget9.anInt294);
							Client.outBuffer.writeInt(Client.staticWidget7.anInt294);
						}
					}
				} else {
					label135: {
						label141: {
							int var13 = staticMethod165();
							if (Client.staticInt252 > 2) {
								if (Client.staticInt214 == 1) {
									boolean var2;
									if (Client.staticInt252 <= 0) {
										var2 = false;
									} else if (Client.staticBool39 && KeyboardHandler.staticBoolArray2[81]
											&& Client.staticInt217 != -1) {
										var2 = true;
									} else {
										var2 = false;
									}

									if (!var2) {
										break label141;
									}
								}

								if (staticMethod475(var13)) {
									break label141;
								}
							}

							if (Client.staticInt252 > 0) {
								staticMethod371(Client.staticInt287 + Client.staticInt272,
										Client.staticInt261 + Client.staticInt290);
							}
							break label135;
						}

						staticMethod37(Client.staticInt287 + Client.staticInt272, Client.staticInt290 + Client.staticInt261);
					}
				}

				Client.staticWidget7 = null;
			}
		} else if (Class2.staticInt4 > 1) {
			Client.staticWidget7 = null;
		}

	}

	//TODO process login
	static final void processLogin() {		
		try {
			if (Client.loginStage == 0) {
				if (Class56.gameConnection != null) {
					Class56.gameConnection.shutdown();
					Class56.gameConnection = null;
				}

				KeyFocusListener.socket = null;
				Client.staticBool43 = false;
				Client.staticInt262 = 0;
				Client.loginStage = 1;
			}

			if (Client.loginStage == 1) {
				if (KeyFocusListener.socket == null) {
					KeyFocusListener.socket = BufferedFile.staticTaskManager1.method93(Class31.staticString21,
							Class32.staticInt73 * 462737933);
				}

				if (KeyFocusListener.socket.anInt86 == 2) {
					throw new IOException();
				}

				if (KeyFocusListener.socket.anInt86 == 1) {
					Class56.gameConnection = new Connection((Socket) KeyFocusListener.socket.anObject2,
							BufferedFile.staticTaskManager1);
					KeyFocusListener.socket = null;
					Client.loginStage = 2;
				}
			}

			if (Client.loginStage == 2) {
				Client.outBuffer.position = 0;
				Client.outBuffer.writeByte(14);
				Class56.gameConnection.write(Client.outBuffer.buf, 0, 1);
				Client.inBuffer.position = 0;
				Client.loginStage = 3;
			}

			int var10;
			if (Client.loginStage == 3) {
				if (ByteBuf.staticClass19_2 != null) {
					ByteBuf.staticClass19_2.method67();
				}

				if (NodeSub12.staticClass19_1 != null) {
					NodeSub12.staticClass19_1.method67();
				}

				var10 = Class56.gameConnection.read();
				if (ByteBuf.staticClass19_2 != null) {
					ByteBuf.staticClass19_2.method67();
				}

				if (NodeSub12.staticClass19_1 != null) {
					NodeSub12.staticClass19_1.method67();
				}

				if (var10 != 0) {
					staticMethod220(var10);
					return;
				}

				Client.inBuffer.position = 0;
				Client.loginStage = 4;
			}

			if (Client.loginStage == 4) {
				if (Client.inBuffer.position < 8) {
					var10 = Class56.gameConnection.available();
					if (var10 > 8 - Client.inBuffer.position) {
						var10 = 8 - Client.inBuffer.position;
					}

					if (var10 > 0) {
						Class56.gameConnection.read(Client.inBuffer.buf,
								Client.inBuffer.position, var10);
						Client.inBuffer.position += var10;
					}
				}

				if (Client.inBuffer.position == 8) {
					Client.inBuffer.position = 0;
					KeyFocusListener.staticLong15 = Client.inBuffer.readLong();
					Client.loginStage = 5;
				}
			}

			int varStart;			
			int xteaStart;			
			if (Client.loginStage == 5) {
				int[] var19 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D),
						(int) (KeyFocusListener.staticLong15 >> 32), (int) (KeyFocusListener.staticLong15 & 0xffffffffffffffffL) };
				Client.outBuffer.position = 0;
				Client.outBuffer.writeByte(1);
				Client.outBuffer.writeByte(blockType.method12());
				Client.outBuffer.writeInt(var19[0]);
				Client.outBuffer.writeInt(var19[1]);
				Client.outBuffer.writeInt(var19[2]);
				Client.outBuffer.writeInt(var19[3]);
				switch (blockType.type) {
				case 0:
					Client.outBuffer.writeInt(((Integer) staticClass6_1.aLinkedHashMap1
							.get(Integer.valueOf(staticMethod149(staticString2)))).intValue());
					Client.outBuffer.position += 4;
					break;
				case 1:
				case 2:
					Client.outBuffer.writeTriByte(NodeSub3.staticInt152);
					Client.outBuffer.position += 5;
					break;
				case 3:
					Client.outBuffer.position += 8;
				}

				Client.outBuffer.writeString(staticString7);
				//TODO RSA
				Client.outBuffer.encryptRSA(staticBigInteger3, staticBigInteger4);
				Client.loginBuffer.position = 0;
				
				//TODO connection type
				if (Client.staticInt165 == 40) {
					Client.loginBuffer.writeByte(18);
				} else {
					Client.loginBuffer.writeByte(16);
				}

				Client.loginBuffer.writeShort(0);
				varStart = Client.loginBuffer.position;
				
				// client version
				Client.loginBuffer.writeInt(138);
				Client.loginBuffer.writeBytes(Client.outBuffer.buf, 0,
						Client.outBuffer.position);
				xteaStart = Client.loginBuffer.position;
				Client.loginBuffer.writeString(staticString2);
				Client.loginBuffer.writeByte((Client.resizable ? 1 : 0) << 1 | (Client.lowMemory ? 1 : 0));
				Client.loginBuffer.writeShort(gameWidth);
				Client.loginBuffer.writeShort(Class47.gameHeight);
				BitBuf var16 = Client.loginBuffer;
				int var20;
				if (Client.staticByteArray6 != null) {
					var16.writeBytes(Client.staticByteArray6, 0, Client.staticByteArray6.length);
				} else {
					byte[] var17 = new byte[24];

					try {
						randomDat.seek(0L);						
						randomDat.read(var17);

						for (var20 = 0; var20 < 24 && var17[var20] == 0; var20++) {
							;
						}

						if (var20 >= 24) {
							throw new IOException();
						}
					} catch (Exception var9) {
						for (int var6 = 0; var6 < 24; var6++) {
							var17[var6] = -1;
						}
					}

					var16.writeBytes(var17, 0, var17.length);
				}

				Client.loginBuffer.writeString(BuildType.staticString27);
				Client.loginBuffer.writeInt(Client.staticInt164);
				ByteBuf var161 = new ByteBuf(Class57.staticComputerInfo1.method404());
				Class57.staticComputerInfo1.method403(var161);
				Client.loginBuffer.writeBytes(var161.buf, 0, var161.buf.length);
				Client.loginBuffer.writeByte(NodeSub19.sessionId);
				Client.loginBuffer.writeInt(0);
				Client.loginBuffer.writeInt(Client.staticJs5IndexImpl8.anInt201);
				Client.loginBuffer.writeInt(FloorUnderlayDef.staticJs5IndexImpl13.anInt201);
				Client.loginBuffer.writeInt(Class23.staticJs5IndexImpl2.anInt201);
				Client.loginBuffer.writeInt(CanvasSub1.staticJs5IndexImpl5.anInt201);
				Client.loginBuffer.writeInt(Config19.staticJs5IndexImpl15.anInt201);
				Client.loginBuffer.writeInt(RenderableSub2.staticJs5IndexImpl16.anInt201);
				Client.loginBuffer.writeInt(Class34.staticJs5IndexImpl3.anInt201);
				Client.loginBuffer.writeInt(ClientScriptMap.staticJs5IndexImpl14.anInt201);
				Client.loginBuffer.writeInt(Class62.staticJs5IndexImpl7.anInt201);
				Client.loginBuffer.writeInt(IdentityKit.staticJs5IndexImpl12.anInt201);
				Client.loginBuffer.writeInt(AbstractClass3Sub1.staticJs5IndexImpl10.anInt201);
				Client.loginBuffer.writeInt(Class56.staticJs5IndexImpl6.anInt201);
				Client.loginBuffer.writeInt(Connection.staticJs5IndexImpl4.anInt201);
				Client.loginBuffer.writeInt(NodeSub12.staticJs5IndexImpl11.anInt201);
				Client.loginBuffer.writeInt(staticJs5IndexImpl1.anInt201);
				Client.loginBuffer.writeInt(Client.staticJs5IndexImpl9.anInt201);
				Client.loginBuffer.encryptXTEA(var19, xteaStart, Client.loginBuffer.position);
				Client.loginBuffer.method371(Client.loginBuffer.position - varStart);
				Class56.gameConnection.write(Client.loginBuffer.buf, 0,
						Client.loginBuffer.position);
				Client.outBuffer.setRandom(var19);

				for (var20 = 0; var20 < 4; var20++) {
					var19[var20] += 50;
				}

				Client.inBuffer.setRandom(var19);
				Client.loginStage = 6;
			}

			if (Client.loginStage == 6 && Class56.gameConnection.available() > 0) {
				var10 = Class56.gameConnection.read();
				if (var10 == 21 && Client.staticInt165 == 20) {
					Client.loginStage = 7;
				} else if (var10 == 2) {
					Client.loginStage = 9;
				} else if (var10 == 15 && Client.staticInt165 == 40) {
					Client.staticInt190 = -1;
					Client.loginStage = 13;
				} else if (var10 == 23 && Client.staticInt302 < 1) {
					++Client.staticInt302;
					Client.loginStage = 0;
				} else {
					if (var10 != 29) {
						staticMethod220(var10);
						return;
					}

					Client.loginStage = 11;
				}
			}

			if (Client.loginStage == 7 && Class56.gameConnection.available() > 0) {
				Client.transferTime = (Class56.gameConnection.read() + 3) * 60;
				Client.loginStage = 8;
			}

			if (Client.loginStage == 8) {
				Client.staticInt262 = 0;
				GPI.staticMethod231("You have only just left another world.", "Your profile will be transferred in:",
						Client.transferTime / 60 + " seconds.");
				if (--Client.transferTime <= 0) {
					Client.loginStage = 0;
				}
			} else {
				if (Client.loginStage == 9 && Class56.gameConnection.available() >= 13) {
					boolean var11 = Class56.gameConnection.read() == 1;
					Class56.gameConnection.read(Client.inBuffer.buf, 0, 4);
					Client.inBuffer.position = 0;
					if (var11) {
						varStart = Client.inBuffer.method472() << 24;
						varStart |= Client.inBuffer.method472() << 16;
						varStart |= Client.inBuffer.method472() << 8;
						varStart |= Client.inBuffer.method472();
						xteaStart = staticMethod149(staticString2);
						if (staticClass6_1.aLinkedHashMap1.size() >= 10
								&& !staticClass6_1.aLinkedHashMap1.containsKey(Integer.valueOf(xteaStart))) {
							Iterator var171 = staticClass6_1.aLinkedHashMap1.entrySet().iterator();
							var171.next();
							var171.remove();
						}

						staticClass6_1.aLinkedHashMap1.put(Integer.valueOf(xteaStart), Integer.valueOf(varStart));
						staticMethod270();
					}

					Client.myRights = Class56.gameConnection.read();
					Client.staticBool33 = Class56.gameConnection.read() == 1;
					Client.myPlayerIndex = Class56.gameConnection.read();
					Client.myPlayerIndex <<= 8;
					Client.myPlayerIndex += Class56.gameConnection.read();
					Client.staticInt289 = Class56.gameConnection.read();
					Class56.gameConnection.read(Client.inBuffer.buf, 0, 1);
					Client.inBuffer.position = 0;
					Client.staticInt191 = Client.inBuffer.method472();
					Class56.gameConnection.read(Client.inBuffer.buf, 0, 2);
					Client.inBuffer.position = 0;
					Client.staticInt190 = Client.inBuffer.method370();

					try {
						Client var18 = Client.staticGame1;
						JSObject.getWindow(var18).call("zap", (Object[]) null);
					} catch (Throwable var8) {
						;
					}

					Client.loginStage = 10;
				}

				if (Client.loginStage == 10) {
					if (Class56.gameConnection.available() >= Client.staticInt190) {
						Client.inBuffer.position = 0;
						Class56.gameConnection.read(Client.inBuffer.buf, 0, Client.staticInt190);
						staticMethod150();
						GPI.initializeGPI(Client.inBuffer);
						FileOnDisk.staticInt39 = -1;
						decodeMapRegion(false);
						Client.staticInt191 = -1;
					}
				} else {
					if (Client.loginStage == 11 && Class56.gameConnection.available() >= 2) {
						Client.inBuffer.position = 0;
						Class56.gameConnection.read(Client.inBuffer.buf, 0, 2);
						Client.inBuffer.position = 0;
						FileOnDisk.staticInt37 = Client.inBuffer.method370();
						Client.loginStage = 12;
					}

					if (Client.loginStage == 12 && Class56.gameConnection.available() >= FileOnDisk.staticInt37) {
						Client.inBuffer.position = 0;
						Class56.gameConnection.read(Client.inBuffer.buf, 0, FileOnDisk.staticInt37);
						Client.inBuffer.position = 0;
						String var12 = Client.inBuffer.readString();
						String var15 = Client.inBuffer.readString();
						String var191 = Client.inBuffer.readString();
						GPI.staticMethod231(var12, var15, var191);
						staticMethod396(10);
					}

					if (Client.loginStage != 13) {
						++Client.staticInt262;
						if (Client.staticInt262 > 2000) {
							if (Client.staticInt302 < 1) {
								if (Class32.staticInt73 * 462737933 == Class7.staticInt30 * 462737933) {
									Class32.staticInt73 = Client.staticInt250 * 1584772929;
								} else {
									Class32.staticInt73 = Class7.staticInt30;
								}

								++Client.staticInt302;
								Client.loginStage = 0;
							} else {
								staticMethod220(-3);
							}
						}
					} else {
						if (Client.staticInt190 == -1) {
							if (Class56.gameConnection.available() < 2) {
								return;
							}

							Class56.gameConnection.read(Client.inBuffer.buf, 0, 2);
							Client.inBuffer.position = 0;
							Client.staticInt190 = Client.inBuffer.method370();
						}

						if (Class56.gameConnection.available() >= Client.staticInt190) {
							Class56.gameConnection.read(Client.inBuffer.buf, 0, Client.staticInt190);
							Client.inBuffer.position = 0;
							var10 = Client.staticInt190;
							Client.outBuffer.position = 0;
							Client.inBuffer.position = 0;
							Client.staticInt191 = -1;
							Client.staticInt270 = 1;
							Client.staticInt194 = 1;
							Client.staticInt195 = 1;
							Client.staticInt190 = 0;
							Client.staticInt192 = 0;
							Client.staticInt170 = 0;
							Client.staticInt252 = 0;
							Client.staticInt217 = -1;
							Client.staticBool30 = false;
							Client.staticInt298 = 0;
							Client.staticInt296 = 0;

							for (varStart = 0; varStart < 2048; varStart++) {
								Client.staticPlayerArray1[varStart] = null;
							}

							AbstractClass2Sub1.staticPlayer1 = null;

							for (varStart = 0; varStart < Client.staticNpcArray1.length; varStart++) {
								Npc var13 = Client.staticNpcArray1[varStart];
								if (var13 != null) {
									var13.anInt600 = -1;
									var13.aBool76 = false;
								}
							}

							staticMethod145();
							staticMethod396(30);

							for (varStart = 0; varStart < 100; varStart++) {
								Client.staticBoolArray8[varStart] = true;
							}

							staticMethod34();
							GPI.initializeGPI(Client.inBuffer);
							if (var10 != Client.inBuffer.position) {
								throw new RuntimeException();
							}
						}
					}
				}
			}
		} catch (IOException var101) {
			if (Client.staticInt302 < 1) {
				if (Class7.staticInt30 * 462737933 == Class32.staticInt73 * 462737933) {
					Class32.staticInt73 = Client.staticInt250 * 1584772929;
				} else {
					Class32.staticInt73 = Class7.staticInt30;
				}

				++Client.staticInt302;
				Client.loginStage = 0;
			} else {
				staticMethod220(-2);
			}
		}

	}

	static final void staticMethod22() {
		for (RenderableSub2 var0 = (RenderableSub2) Client.staticClass39_6
				.method195(); var0 != null; var0 = (RenderableSub2) Client.staticClass39_6.method193()) {
			if (var0.anInt637 == NodeSub4.staticInt155 && !var0.aBool78) {
				if (Client.staticInt166 >= var0.anInt636) {
					var0.method568(Client.staticInt171);
					if (var0.aBool78) {
						var0.method174();
					} else {
						Friend.staticScene1.method102(var0.anInt637, var0.anInt638, var0.anInt639, var0.anInt642, 60,
								var0, 0, -1, false);
					}
				}
			} else {
				var0.method174();
			}
		}

	}

	static final void staticMethod174(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; var3++) {
			for (int var4 = 0; var4 < 8; var4++) {
				staticIntArrayArrayArray1[var0][var3 + var1][var4 + var2] = 0;
			}
		}

		if (var1 > 0) {
			for (var3 = 1; var3 < 8; var3++) {
				staticIntArrayArrayArray1[var0][var1][var2
						+ var3] = staticIntArrayArrayArray1[var0][var1 - 1][var2 + var3];
			}
		}

		if (var2 > 0) {
			for (var3 = 1; var3 < 8; var3++) {
				staticIntArrayArrayArray1[var0][var1 + var3][var2] = staticIntArrayArrayArray1[var0][var1
						+ var3][var2 - 1];
			}
		}

		if (var1 > 0 && staticIntArrayArrayArray1[var0][var1 - 1][var2] != 0) {
			staticIntArrayArrayArray1[var0][var1][var2] = staticIntArrayArrayArray1[var0][var1 - 1][var2];
		} else if (var2 > 0 && staticIntArrayArrayArray1[var0][var1][var2 - 1] != 0) {
			staticIntArrayArrayArray1[var0][var1][var2] = staticIntArrayArrayArray1[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && staticIntArrayArrayArray1[var0][var1 - 1][var2 - 1] != 0) {
			staticIntArrayArrayArray1[var0][var1][var2] = staticIntArrayArrayArray1[var0][var1 - 1][var2
					- 1];
		}

	}

	static void staticMethod175(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.anInt307;
		int var5 = var0.anInt351;
		if (var0.anInt293 == 0) {
			var0.anInt307 = var0.anInt304;
		} else if (var0.anInt293 == 1) {
			var0.anInt307 = var1 - var0.anInt304;
		} else if (var0.anInt293 == 2) {
			var0.anInt307 = var0.anInt304 * var1 >> 14;
		}

		if (var0.anInt311 == 0) {
			var0.anInt351 = var0.anInt305;
		} else if (var0.anInt311 == 1) {
			var0.anInt351 = var2 - var0.anInt305;
		} else if (var0.anInt311 == 2) {
			var0.anInt351 = var2 * var0.anInt305 >> 14;
		}

		if (var0.anInt293 == 4) {
			var0.anInt307 = var0.anInt351 * var0.anInt309 / var0.anInt346;
		}

		if (var0.anInt311 == 4) {
			var0.anInt351 = var0.anInt307 * var0.anInt346 / var0.anInt309;
		}

		if (Client.staticBool40 && var0.anInt296 == 0) {
			if (var0.anInt351 < 5 && var0.anInt307 < 5) {
				var0.anInt351 = 5;
				var0.anInt307 = 5;
			} else {
				if (var0.anInt351 <= 0) {
					var0.anInt351 = 5;
				}

				if (var0.anInt307 <= 0) {
					var0.anInt307 = 5;
				}
			}
		}

		if (var0.anInt298 == 1337) {
			Client.staticWidget10 = var0;
		}

		if (var3 && var0.anObjectArray25 != null && (var4 != var0.anInt307 || var5 != var0.anInt351)) {
			NodeSub16 var6 = new NodeSub16();
			var6.aWidget1 = var0;
			var6.anObjectArray2 = var0.anObjectArray25;
			Client.staticClass39_8.method198(var6);
		}

	}

	public static String staticMethod176(long var0) {
		staticCalendar2.setTime(new Date(var0));
		int var3 = staticCalendar2.get(7);
		int var2 = staticCalendar2.get(5);
		int var7 = staticCalendar2.get(2);
		int var5 = staticCalendar2.get(1);
		int var4 = staticCalendar2.get(11);
		int var6 = staticCalendar2.get(12);
		int var8 = staticCalendar2.get(13);
		return staticStringArray3[var3 - 1] + ", " + var2 / 10 + var2 % 10 + "-"
				+ staticStringArrayArray1[0][var7] + "-" + var5 + " " + var4 / 10 + var4 % 10 + ":" + var6 / 10
				+ var6 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
	}

	static int staticMethod177(int var0, CacheableSub1 var1, boolean var2) {
		if (var0 == 3600) {
			if (Client.staticInt202 == 0) {
				staticIntArray16[++staticInt27 - 1] = -2;
			} else if (Client.staticInt202 == 1) {
				staticIntArray16[++staticInt27 - 1] = -1;
			} else {
				staticIntArray16[++staticInt27 - 1] = Client.staticInt308;
			}

			return 1;
		} else {
			int var5;
			if (var0 == 3601) {
				var5 = staticIntArray16[--staticInt27];
				if (Client.staticInt202 == 2 && var5 < Client.staticInt308) {
					staticStringArray1[++staticInt148 - 1] = Client.staticFriendArray1[var5].aString14;
					staticStringArray1[++staticInt148 - 1] = Client.staticFriendArray1[var5].aString13;
				} else {
					staticStringArray1[++staticInt148 - 1] = "";
					staticStringArray1[++staticInt148 - 1] = "";
				}

				return 1;
			} else if (var0 == 3602) {
				var5 = staticIntArray16[--staticInt27];
				if (Client.staticInt202 == 2 && var5 < Client.staticInt308) {
					staticIntArray16[++staticInt27 - 1] = Client.staticFriendArray1[var5].anInt210;
				} else {
					staticIntArray16[++staticInt27 - 1] = 0;
				}

				return 1;
			} else if (var0 == 3603) {
				var5 = staticIntArray16[--staticInt27];
				if (Client.staticInt202 == 2 && var5 < Client.staticInt308) {
					staticIntArray16[++staticInt27 - 1] = Client.staticFriendArray1[var5].anInt209;
				} else {
					staticIntArray16[++staticInt27 - 1] = 0;
				}

				return 1;
			} else {
				String var14;
				if (var0 == 3604) {
					var14 = staticStringArray1[--staticInt148];
					int var151 = staticIntArray16[--staticInt27];
					Client.outBuffer.method471(22);
					Client.outBuffer.writeByte(staticMethod378(var14) + 1);
					Client.outBuffer.method345(var151);
					Client.outBuffer.writeString(var14);
					return 1;
				} else {
					String var8;
					int var11;
					String var12;
					Class7 var15;
					Friend var16;
					String var17;
					if (var0 == 3605) {
						var14 = staticStringArray1[--staticInt148];
						if (var14 != null) {
							if ((Client.staticInt308 < 200 || Client.staticInt289 == 1) && Client.staticInt308 < 400) {
								var12 = staticMethod111(var14, staticClass53_1);
								if (var12 != null) {
									var11 = 0;

									while (true) {
										if (var11 >= Client.staticInt308) {
											for (var11 = 0; var11 < Client.staticInt310; var11++) {
												var15 = Client.staticClass7Array1[var11];
												var17 = staticMethod111(var15.aString5, staticClass53_1);
												if (var17 != null && var17.equals(var12)) {
													staticMethod36(30, "",
															"Please remove " + var14 + " from your ignore list first");
													return 1;
												}

												if (var15.aString4 != null) {
													var8 = staticMethod111(var15.aString4, staticClass53_1);
													if (var8 != null && var8.equals(var12)) {
														staticMethod36(30, "", "Please remove " + var14
																+ " from your ignore list first");
														return 1;
													}
												}
											}

											if (staticMethod111(AbstractClass2Sub1.staticPlayer1.aString40,
													staticClass53_1).equals(var12)) {
												staticMethod36(30, "",
														"You can\'t add yourself to your own friend list");
											} else {
												Client.outBuffer.method471(36);
												Client.outBuffer.writeByte(staticMethod378(var14));
												Client.outBuffer.writeString(var14);
											}
											break;
										}

										var16 = Client.staticFriendArray1[var11];
										var17 = staticMethod111(var16.aString14, staticClass53_1);
										if (var17 != null && var17.equals(var12)) {
											staticMethod36(30, "", var14 + " is already on your friend list");
											break;
										}

										if (var16.aString13 != null) {
											var8 = staticMethod111(var16.aString13, staticClass53_1);
											if (var8 != null && var8.equals(var12)) {
												staticMethod36(30, "", var14 + " is already on your friend list");
												break;
											}
										}

										++var11;
									}
								}
							} else {
								staticMethod36(30, "",
										"Your friend list is full. Max of 200 for free users, and 400 for members");
							}
						}

						return 1;
					} else if (var0 == 3606) {
						var14 = staticStringArray1[--staticInt148];
						if (var14 != null) {
							var12 = staticMethod111(var14, staticClass53_1);
							if (var12 != null) {
								for (var11 = 0; var11 < Client.staticInt308; var11++) {
									var16 = Client.staticFriendArray1[var11];
									var17 = var16.aString14;
									var8 = staticMethod111(var17, staticClass53_1);
									boolean var161;
									if (var14 != null && var17 != null) {
										if (!var14.startsWith("#") && !var17.startsWith("#")) {
											var161 = var12.equals(var8);
										} else {
											var161 = var14.equals(var17);
										}
									} else {
										var161 = false;
									}

									if (var161) {
										--Client.staticInt308;

										for (int var171 = var11; var171 < Client.staticInt308; var171++) {
											Client.staticFriendArray1[var171] = Client.staticFriendArray1[var171 + 1];
										}

										Client.staticInt280 = Client.staticInt274 * 2073400987;
										Client.outBuffer.method471(196);
										Client.outBuffer.writeByte(staticMethod378(var14));
										Client.outBuffer.writeString(var14);
										break;
									}
								}
							}
						}

						return 1;
					} else if (var0 == 3607) {
						var14 = staticStringArray1[--staticInt148];
						if (var14 != null) {
							if ((Client.staticInt310 < 100 || Client.staticInt289 == 1) && Client.staticInt310 < 400) {
								var12 = staticMethod111(var14, staticClass53_1);
								if (var12 != null) {
									var11 = 0;

									while (true) {
										if (var11 >= Client.staticInt310) {
											for (var11 = 0; var11 < Client.staticInt308; var11++) {
												var16 = Client.staticFriendArray1[var11];
												var17 = staticMethod111(var16.aString14, staticClass53_1);
												if (var17 != null && var17.equals(var12)) {
													staticMethod36(31, "",
															"Please remove " + var14 + " from your friend list first");
													return 1;
												}

												if (var16.aString13 != null) {
													var8 = staticMethod111(var16.aString13, staticClass53_1);
													if (var8 != null && var8.equals(var12)) {
														staticMethod36(31, "", "Please remove " + var14
																+ " from your friend list first");
														return 1;
													}
												}
											}

											if (staticMethod111(AbstractClass2Sub1.staticPlayer1.aString40,
													staticClass53_1).equals(var12)) {
												staticMethod36(31, "",
														"You can\'t add yourself to your own ignore list");
											} else {
												Client.outBuffer.method471(190);
												Client.outBuffer.writeByte(staticMethod378(var14));
												Client.outBuffer.writeString(var14);
											}
											break;
										}

										var15 = Client.staticClass7Array1[var11];
										var17 = staticMethod111(var15.aString5, staticClass53_1);
										if (var17 != null && var17.equals(var12)) {
											staticMethod36(31, "", var14 + " is already on your ignore list");
											break;
										}

										if (var15.aString4 != null) {
											var8 = staticMethod111(var15.aString4, staticClass53_1);
											if (var8 != null && var8.equals(var12)) {
												staticMethod36(31, "", var14 + " is already on your ignore list");
												break;
											}
										}

										++var11;
									}
								}
							} else {
								staticMethod36(31, "",
										"Your ignore list is full. Max of 100 for free users, and 400 for members");
							}
						}

						return 1;
					} else if (var0 == 3608) {
						var14 = staticStringArray1[--staticInt148];
						staticMethod323(var14);
						return 1;
					} else if (var0 == 3609) {
						var14 = staticStringArray1[--staticInt148];
						Class48[] var4 = new Class48[] { Class48.staticClass48_4, Class48.staticClass48_6,
								Class48.staticClass48_2, Class48.staticClass48_1, Class48.staticClass48_5,
								Class48.staticClass48_3 };
						Class48[] var3 = var4;

						for (int var6 = 0; var6 < var3.length; var6++) {
							Class48 var7 = var3[var6];
							if (var7.anInt192 != -1 && var14.startsWith(staticMethod123(var7.anInt192))) {
								var14 = var14.substring(6 + Integer.toString(var7.anInt192).length());
								break;
							}
						}

						staticIntArray16[++staticInt27 - 1] = staticMethod422(var14, false) ? 1 : 0;
						return 1;
					} else if (var0 == 3611) {
						if (Client.staticString34 != null) {
							staticStringArray1[++staticInt148 - 1] = staticMethod91(Client.staticString34);
						} else {
							staticStringArray1[++staticInt148 - 1] = "";
						}

						return 1;
					} else if (var0 == 3612) {
						if (Client.staticString34 != null) {
							staticIntArray16[++staticInt27 - 1] = staticInt149;
						} else {
							staticIntArray16[++staticInt27 - 1] = 0;
						}

						return 1;
					} else if (var0 == 3613) {
						var5 = staticIntArray16[--staticInt27];
						if (Client.staticString34 != null && var5 < staticInt149) {
							staticStringArray1[++staticInt148
									- 1] = Class43.staticNodeSub1Array1[var5].aString15;
						} else {
							staticStringArray1[++staticInt148 - 1] = "";
						}

						return 1;
					} else if (var0 == 3614) {
						var5 = staticIntArray16[--staticInt27];
						if (Client.staticString34 != null && var5 < staticInt149) {
							staticIntArray16[++staticInt27
									- 1] = Class43.staticNodeSub1Array1[var5].anInt217;
						} else {
							staticIntArray16[++staticInt27 - 1] = 0;
						}

						return 1;
					} else if (var0 == 3615) {
						var5 = staticIntArray16[--staticInt27];
						if (Client.staticString34 != null && var5 < staticInt149) {
							staticIntArray16[++staticInt27
									- 1] = Class43.staticNodeSub1Array1[var5].aByte3;
						} else {
							staticIntArray16[++staticInt27 - 1] = 0;
						}

						return 1;
					} else if (var0 == 3616) {
						staticIntArray16[++staticInt27 - 1] = staticByte1;
						return 1;
					} else if (var0 == 3617) {
						var14 = staticStringArray1[--staticInt148];
						staticMethod316(var14);
						return 1;
					} else if (var0 == 3618) {
						staticIntArray16[++staticInt27 - 1] = staticByte3;
						return 1;
					} else if (var0 == 3619) {
						var14 = staticStringArray1[--staticInt148];
						staticMethod279(var14);
						return 1;
					} else if (var0 == 3620) {
						Client.outBuffer.method471(164);
						Client.outBuffer.writeByte(0);
						return 1;
					} else if (var0 == 3621) {
						if (Client.staticInt202 == 0) {
							staticIntArray16[++staticInt27 - 1] = -1;
						} else {
							staticIntArray16[++staticInt27 - 1] = Client.staticInt310;
						}

						return 1;
					} else if (var0 == 3622) {
						var5 = staticIntArray16[--staticInt27];
						if (Client.staticInt202 != 0 && var5 < Client.staticInt310) {
							staticStringArray1[++staticInt148
									- 1] = Client.staticClass7Array1[var5].aString5;
							staticStringArray1[++staticInt148
									- 1] = Client.staticClass7Array1[var5].aString4;
						} else {
							staticStringArray1[++staticInt148 - 1] = "";
							staticStringArray1[++staticInt148 - 1] = "";
						}

						return 1;
					} else if (var0 == 3623) {
						var14 = staticStringArray1[--staticInt148];
						if (var14.startsWith(staticMethod123(0)) || var14.startsWith(staticMethod123(1))) {
							var14 = var14.substring(7);
						}

						staticIntArray16[++staticInt27 - 1] = staticMethod141(var14) ? 1 : 0;
						return 1;
					} else if (var0 != 3624) {
						if (var0 == 3625) {
							if (Client.staticString29 != null) {
								staticStringArray1[++staticInt148 - 1] = staticMethod91(
										Client.staticString29);
							} else {
								staticStringArray1[++staticInt148 - 1] = "";
							}

							return 1;
						} else {
							return 2;
						}
					} else {
						var5 = staticIntArray16[--staticInt27];
						if (Class43.staticNodeSub1Array1 != null && var5 < staticInt149
								&& Class43.staticNodeSub1Array1[var5].aString15
										.equalsIgnoreCase(AbstractClass2Sub1.staticPlayer1.aString40)) {
							staticIntArray16[++staticInt27 - 1] = 1;
						} else {
							staticIntArray16[++staticInt27 - 1] = 0;
						}

						return 1;
					}
				}
			}
		}
	}

	static boolean staticMethod178(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!staticString25.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var121 = 0; var121 < var0.length(); var121++) {
						if (var11.indexOf(var0.charAt(var121)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var101) {
				return false;
			}
		} else {
			Applet var10;
			if (var1 == 1) {
				try {
					var10 = staticApplet2;
					Object[] var5 = new Object[] { new URL(staticApplet2.getCodeBase(), var0).toString() };
					Object var12 = JSObject.getWindow(var10).call(var2, var5);
					return var12 != null;
				} catch (Throwable var6) {
					return false;
				}
			} else if (var1 == 2) {
				try {
					staticApplet2.getAppletContext()
							.showDocument(new URL(staticApplet2.getCodeBase(), var0), "_blank");
					return true;
				} catch (Exception var7) {
					return false;
				}
			} else if (var1 == 3) {
				try {
					var10 = staticApplet2;
					JSObject.getWindow(var10).call("loggedout", (Object[]) null);
				} catch (Throwable var9) {
					;
				}

				try {
					staticApplet2.getAppletContext()
							.showDocument(new URL(staticApplet2.getCodeBase(), var0), "_top");
					return true;
				} catch (Exception var8) {
					return false;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	static Sprite[] staticMethod179(Js5Index var0, int var1, int var2) {
		if (!staticMethod65(var0, var1, var2)) {
			return null;
		} else {
			Sprite[] var7 = new Sprite[staticInt143];

			for (int var3 = 0; var3 < staticInt143; var3++) {
				Sprite var4 = var7[var3] = new Sprite();
				var4.anInt673 = staticInt139;
				var4.anInt674 = staticInt142;
				var4.anInt675 = NodeSub20.staticIntArray126[var3];
				var4.anInt670 = staticIntArray69[var3];
				var4.anInt672 = staticIntArray72[var3];
				var4.anInt671 = staticIntArray71[var3];
				int var5 = var4.anInt672 * var4.anInt671;
				byte[] var6 = CanvasSub1.staticByteArrayArray2[var3];
				var4.anIntArray154 = new int[var5];

				for (int var8 = 0; var8 < var5; var8++) {
					var4.anIntArray154[var8] = staticIntArray73[var6[var8] & 0xff];
				}
			}

			NodeSub20.staticIntArray126 = null;
			staticIntArray69 = null;
			staticIntArray72 = null;
			staticIntArray71 = null;
			staticIntArray73 = null;
			CanvasSub1.staticByteArrayArray2 = null;
			return var7;
		}
	}

	static void staticMethod180() {
		staticByteArrayArrayArray1 = null;
		staticByteArrayArrayArray5 = null;
		staticByteArrayArrayArray3 = null;
		staticByteArrayArrayArray6 = null;
		NodeSub1.staticIntArrayArrayArray2 = null;
		staticByteArrayArrayArray2 = null;
		staticIntArrayArray7 = null;
		staticIntArray55 = null;
		ClientScriptMap.staticIntArray129 = null;
		CacheableSub2.staticIntArray127 = null;
		Class60.staticIntArray76 = null;
		staticIntArray51 = null;
	}

	public static Varbit staticMethod181(int var0) {
		Varbit var1 = (Varbit) Varbit.staticCache7.get(var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = Varbit.staticJs5Index11.getFile(14, var0);
			var1 = new Varbit();
			if (var2 != null) {
				var1.method478(new ByteBuf(var2));
			}

			Varbit.staticCache7.method170(var1, var0);
			return var1;
		}
	}

	public static String staticMethod182(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; var3 != 0L; var3 /= 37L) {
					++var2;
				}

				char var7;
				StringBuilder var81;
				for (var81 = new StringBuilder(var2); var0 != 0L; var81.append(var7)) {
					long var8 = var0;
					var0 /= 37L;
					var7 = staticCharArray6[(int) (var8 - var0 * 37L)];
					if (var7 == 95) {
						int var4 = var81.length() - 1;
						var81.setCharAt(var4, Character.toUpperCase(var81.charAt(var4)));
						var7 = 160;
					}
				}

				var81.reverse();
				var81.setCharAt(0, Character.toUpperCase(var81.charAt(0)));
				return var81.toString();
			}
		} else {
			return null;
		}
	}

	static Class2 staticMethod183() {
		Class2.staticInt3 = 0;
		return staticMethod137();
	}

	static final void staticMethod184(NodeSub8 var0) {
		var0.aBool24 = false;
		if (var0.aNodeSub6_1 != null) {
			var0.aNodeSub6_1.anInt241 = 0;
		}

		for (NodeSub8 var1 = var0.method302(); var1 != null; var1 = var0.method303()) {
			staticMethod184(var1);
		}

	}

	public static int staticMethod188(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var8 = false;
			boolean var4 = false;
			int var3 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; var7++) {
				char var5 = var0.charAt(var7);
				if (var7 == 0) {
					if (var5 == 45) {
						var8 = true;
						continue;
					}

					if (var5 == 43 && var2) {
						continue;
					}
				}

				int var10;
				if (var5 >= 48 && var5 <= 57) {
					var10 = var5 - 48;
				} else if (var5 >= 65 && var5 <= 90) {
					var10 = var5 - 55;
				} else {
					if (var5 < 97 || var5 > 122) {
						throw new NumberFormatException();
					}

					var10 = var5 - 87;
				}

				if (var10 >= var1) {
					throw new NumberFormatException();
				}

				if (var8) {
					var10 = -var10;
				}

				int var9 = var10 + var3 * var1;
				if (var9 / var1 != var3) {
					throw new NumberFormatException();
				}

				var3 = var9;
				var4 = true;
			}

			if (!var4) {
				throw new NumberFormatException();
			} else {
				return var3;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	public static void staticMethod189() {
		CacheableSub6.staticCache21.method171();
		CacheableSub6.staticCache22.method171();
	}

	static int staticMethod190(int var0, CacheableSub1 var1, boolean var2) {
		if (var0 == 6200) {
			staticInt27 -= 2;
			Client.staticShort3 = (short) staticIntArray16[staticInt27];
			if (Client.staticShort3 <= 0) {
				Client.staticShort3 = 256;
			}

			Client.staticShort4 = (short) staticIntArray16[staticInt27 + 1];
			if (Client.staticShort4 <= 0) {
				Client.staticShort4 = 205;
			}

			return 1;
		} else if (var0 == 6201) {
			staticInt27 -= 2;
			Client.staticShort5 = (short) staticIntArray16[staticInt27];
			if (Client.staticShort5 <= 0) {
				Client.staticShort5 = 256;
			}

			Client.staticShort2 = (short) staticIntArray16[1 + staticInt27];
			if (Client.staticShort2 <= 0) {
				Client.staticShort2 = 320;
			}

			return 1;
		} else if (var0 == 6202) {
			staticInt27 -= 4;
			Client.staticShort1 = (short) staticIntArray16[staticInt27];
			if (Client.staticShort1 <= 0) {
				Client.staticShort1 = 1;
			}

			Client.staticShort6 = (short) staticIntArray16[1 + staticInt27];
			if (Client.staticShort6 <= 0) {
				Client.staticShort6 = 32767;
			} else if (Client.staticShort6 < Client.staticShort1) {
				Client.staticShort6 = Client.staticShort1;
			}

			Client.staticShort7 = (short) staticIntArray16[staticInt27 + 2];
			if (Client.staticShort7 <= 0) {
				Client.staticShort7 = 1;
			}

			Client.staticShort8 = (short) staticIntArray16[3 + staticInt27];
			if (Client.staticShort8 <= 0) {
				Client.staticShort8 = 32767;
			} else if (Client.staticShort8 < Client.staticShort7) {
				Client.staticShort8 = Client.staticShort7;
			}

			return 1;
		} else if (var0 == 6203) {
			if (Client.staticWidget10 != null) {
				staticMethod31(0, 0, Client.staticWidget10.anInt307, Client.staticWidget10.anInt351, false);
				staticIntArray16[++staticInt27 - 1] = Client.staticInt305;
				staticIntArray16[++staticInt27 - 1] = Client.staticInt306;
			} else {
				staticIntArray16[++staticInt27 - 1] = -1;
				staticIntArray16[++staticInt27 - 1] = -1;
			}

			return 1;
		} else if (var0 == 6204) {
			staticIntArray16[++staticInt27 - 1] = Client.staticShort5;
			staticIntArray16[++staticInt27 - 1] = Client.staticShort2;
			return 1;
		} else if (var0 == 6205) {
			staticIntArray16[++staticInt27 - 1] = Client.staticShort3;
			staticIntArray16[++staticInt27 - 1] = Client.staticShort4;
			return 1;
		} else {
			return 2;
		}
	}

	public static String staticMethod191(ByteBuf var0) {
		return staticMethod283(var0, 32767);
	}

	static int staticMethod192(Widget var0) {
		NodeSub15 var1 = (NodeSub15) Client.staticHashTable6.method149(((long) var0.anInt294 << 32) + var0.anInt319);
		return var1 != null ? var1.anInt283 : var0.anInt343;
	}

	public static Rasterizer2DSub3 staticMethod193(Js5Index var0, int var1) {
		byte[] var2 = var0.method260(var1);
		boolean var4;
		if (var2 == null) {
			var4 = false;
		} else {
			staticMethod385(var2);
			var4 = true;
		}

		if (!var4) {
			return null;
		} else {
			Rasterizer2DSub3 var3 = new Rasterizer2DSub3();
			var3.anInt676 = staticInt139;
			var3.anInt679 = staticInt142;
			var3.anInt681 = NodeSub20.staticIntArray126[0];
			var3.anInt680 = staticIntArray69[0];
			var3.anInt677 = staticIntArray72[0];
			var3.anInt678 = staticIntArray71[0];
			var3.anIntArray155 = staticIntArray73;
			var3.aByteArray35 = CanvasSub1.staticByteArrayArray2[0];
			NodeSub20.staticIntArray126 = null;
			staticIntArray69 = null;
			staticIntArray72 = null;
			staticIntArray71 = null;
			staticIntArray73 = null;
			CanvasSub1.staticByteArrayArray2 = null;
			return var3;
		}
	}

	static final void staticMethod194(ByteBuf var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			staticByteArrayArrayArray4[var1][var2][var3] = 0;

			while (true) {
				var7 = var0.method367();
				if (var7 == 0) {
					if (var1 == 0) {
						staticIntArrayArrayArray1[0][var2][var3] = -staticMethod230(var4 + 932731 + var2,
								var3 + 556238 + var5) * 8;
					} else {
						staticIntArrayArrayArray1[var1][var2][var3] = staticIntArrayArrayArray1[var1
								- 1][var2][var3] - 240;
					}
					break;
				}

				if (var7 == 1) {
					int var8 = var0.method367();
					if (var8 == 1) {
						var8 = 0;
					}

					if (var1 == 0) {
						staticIntArrayArrayArray1[0][var2][var3] = 8 * -var8;
					} else {
						staticIntArrayArrayArray1[var1][var2][var3] = staticIntArrayArrayArray1[var1
								- 1][var2][var3] - var8 * 8;
					}
					break;
				}

				if (var7 <= 49) {
					staticByteArrayArrayArray5[var1][var2][var3] = var0.readByte();
					staticByteArrayArrayArray3[var1][var2][var3] = (byte) ((var7 - 2) / 4);
					staticByteArrayArrayArray6[var1][var2][var3] = (byte) (var6 + var7 - 2 & 0x3);
				} else if (var7 <= 81) {
					staticByteArrayArrayArray4[var1][var2][var3] = (byte) (var7 - 49);
				} else {
					staticByteArrayArrayArray1[var1][var2][var3] = (byte) (var7 - 81);
				}
			}
		} else {
			while (true) {
				var7 = var0.method367();
				if (var7 == 0) {
					break;
				}

				if (var7 == 1) {
					var0.method367();
					break;
				}

				if (var7 <= 49) {
					var0.method367();
				}
			}
		}

	}

	static final void staticMethod195(int var0, int var1) {
		if (var0 != FileOnDisk.staticInt39 || Class27.staticInt70 != var1) {
			FileOnDisk.staticInt39 = var0;
			Class27.staticInt70 = var1;
			staticMethod396(25);
			staticMethod337("Loading - please wait.", true);
			int var6 = NodeSub3.staticInt154;
			int var7 = Class34.staticInt75;
			NodeSub3.staticInt154 = (var0 - 6) * 8;
			Class34.staticInt75 = (var1 - 6) * 8;
			int var11 = NodeSub3.staticInt154 - var6;
			int var9 = Class34.staticInt75 - var7;
			var6 = NodeSub3.staticInt154;
			var7 = Class34.staticInt75;

			int var5;
			int var10;
			for (var10 = 0; var10 < '\u8000'; var10++) {
				Npc var20 = Client.staticNpcArray1[var10];
				if (var20 != null) {
					for (var5 = 0; var5 < 10; var5++) {
						var20.anIntArray127[var5] -= var11;
						var20.anIntArray122[var5] -= var9;
					}

					var20.anInt628 -= var11 * 128;
					var20.anInt591 -= var9 * 128;
				}
			}

			for (var10 = 0; var10 < 2048; var10++) {
				Player var191 = Client.staticPlayerArray1[var10];
				if (var191 != null) {
					for (var5 = 0; var5 < 10; var5++) {
						var191.anIntArray127[var5] -= var11;
						var191.anIntArray122[var5] -= var9;
					}

					var191.anInt628 -= var11 * 128;
					var191.anInt591 -= var9 * 128;
				}
			}

			byte var201 = 0;
			byte var19 = 104;
			byte var17 = 1;
			if (var11 < 0) {
				var201 = 103;
				var19 = -1;
				var17 = -1;
			}

			byte var4 = 0;
			byte var13 = 104;
			byte var3 = 1;
			if (var9 < 0) {
				var4 = 103;
				var13 = -1;
				var3 = -1;
			}

			int var2;
			for (int var21 = var201; var19 != var21; var21 += var17) {
				for (var2 = var4; var13 != var2; var2 += var3) {
					int var15 = var21 + var11;
					int var12 = var2 + var9;

					for (int var16 = 0; var16 < 4; var16++) {
						if (var15 >= 0 && var12 >= 0 && var15 < 104 && var12 < 104) {
							Client.staticClass39ArrayArrayArray1[var16][var21][var2] = Client.staticClass39ArrayArrayArray1[var16][var15][var12];
						} else {
							Client.staticClass39ArrayArrayArray1[var16][var21][var2] = null;
						}
					}
				}
			}

			for (NodeSub19 var211 = (NodeSub19) Client.staticClass39_7
					.method195(); var211 != null; var211 = (NodeSub19) Client.staticClass39_7.method193()) {
				var211.anInt388 -= var11;
				var211.anInt390 -= var9;
				if (var211.anInt388 < 0 || var211.anInt390 < 0 || var211.anInt388 >= 104 || var211.anInt390 >= 104) {
					var211.method174();
				}
			}

			if (Client.staticInt296 != 0) {
				Client.staticInt296 -= var11;
				Client.staticInt240 -= var9;
			}

			Client.staticInt236 = 0;
			Client.staticBool28 = false;
			Client.staticInt294 = 1;
			Client.staticClass39_6.method191();
			Client.staticClass39_5.method191();

			for (var2 = 0; var2 < 4; var2++) {
				Client.staticClass38Array1[var2].method182();
			}
		}

	}

	static final void staticMethod196() {
		short var0 = 256;
		int var2;
		if (staticInt9 > 0) {
			for (var2 = 0; var2 < 256; var2++) {
				if (staticInt9 > 768) {
					Class57.staticIntArray74[var2] = staticMethod47(staticIntArray67[var2],
							staticIntArray61[var2], 1024 - staticInt9);
				} else if (staticInt9 > 256) {
					Class57.staticIntArray74[var2] = staticIntArray61[var2];
				} else {
					Class57.staticIntArray74[var2] = staticMethod47(staticIntArray61[var2],
							staticIntArray67[var2], 256 - staticInt9);
				}
			}
		} else if (staticInt5 > 0) {
			for (var2 = 0; var2 < 256; var2++) {
				if (staticInt5 > 768) {
					Class57.staticIntArray74[var2] = staticMethod47(staticIntArray67[var2],
							staticIntArray3[var2], 1024 - staticInt5);
				} else if (staticInt5 > 256) {
					Class57.staticIntArray74[var2] = staticIntArray3[var2];
				} else {
					Class57.staticIntArray74[var2] = staticMethod47(staticIntArray3[var2],
							staticIntArray67[var2], 256 - staticInt5);
				}
			}
		} else {
			for (var2 = 0; var2 < 256; var2++) {
				Class57.staticIntArray74[var2] = staticIntArray67[var2];
			}
		}

		staticMethod416(staticInt6, 9, 128 + staticInt6, 7 + var0);
		staticSprite2.method636(staticInt6, 0);
		staticMethod401();
		var2 = 0;
		int var4 = CacheableSub2.staticGraphicsBuffer1.anInt203 * 9 + staticInt6;

		int var1;
		int var3;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var9 = 1; var9 < var0 - 1; var9++) {
			var10 = staticIntArray4[var9] * (var0 - var9) / var0;
			var1 = var10 + 22;
			if (var1 < 0) {
				var1 = 0;
			}

			var2 += var1;

			for (var8 = var1; var8 < 128; var8++) {
				var3 = Class61.staticIntArray77[var2++];
				if (var3 != 0) {
					var5 = var3;
					var6 = 256 - var3;
					var3 = Class57.staticIntArray74[var3];
					var7 = CacheableSub2.staticGraphicsBuffer1.anIntArray55[var4];
					CacheableSub2.staticGraphicsBuffer1.anIntArray55[var4++] = ((var7 & 0xff00ff) * var6
							+ var5 * (var3 & 0xff00ff) & 0xff00ff00)
							+ ((var7 & 0xff00) * var6 + (var3 & 0xff00) * var5 & 0xff0000) >> 8;
				} else {
					++var4;
				}
			}

			var4 += var1 + CacheableSub2.staticGraphicsBuffer1.anInt203 - 128;
		}

		staticMethod416(765 + staticInt6 - 128, 9, 765 + staticInt6, 7 + var0);
		staticSprite1.method636(staticInt6 + 382, 0);
		staticMethod401();
		var2 = 0;
		var4 = 661 + CacheableSub2.staticGraphicsBuffer1.anInt203 * 9 + staticInt6;

		for (var9 = 1; var9 < var0 - 1; var9++) {
			var10 = (var0 - var9) * staticIntArray4[var9] / var0;
			var1 = 103 - var10;
			var4 += var10;

			for (var8 = 0; var8 < var1; var8++) {
				var3 = Class61.staticIntArray77[var2++];
				if (var3 != 0) {
					var5 = var3;
					var6 = 256 - var3;
					var3 = Class57.staticIntArray74[var3];
					var7 = CacheableSub2.staticGraphicsBuffer1.anIntArray55[var4];
					CacheableSub2.staticGraphicsBuffer1.anIntArray55[var4++] = (var5 * (var3 & 0xff00ff)
							+ var6 * (var7 & 0xff00ff) & 0xff00ff00)
							+ (var5 * (var3 & 0xff00) + var6 * (var7 & 0xff00) & 0xff0000) >> 8;
				} else {
					++var4;
				}
			}

			var2 += 128 - var1;
			var4 += CacheableSub2.staticGraphicsBuffer1.anInt203 - var1 - var10;
		}

	}

	public static CacheableSub5 staticMethod197(int var0) {
		CacheableSub5 var1 = (CacheableSub5) CacheableSub5.staticCache12.get(var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = CacheableSub5.staticJs5Index17.getFile(32, var0);
			var1 = new CacheableSub5();
			if (var2 != null) {
				var1.method500(new ByteBuf(var2));
			}

			CacheableSub5.staticCache12.method170(var1, var0);
			return var1;
		}
	}

	static void staticMethod198(String var0, boolean var1, String var2, boolean var3) {
		if (var1) {
			if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var5) {
					;
				}
			}

			if (staticString25.startsWith("win") && !var3) {
				staticMethod178(var0, 0, "openjs");
				return;
			}

			if (staticString25.startsWith("mac")) {
				staticMethod178(var0, 1, var2);
				return;
			}

			staticMethod178(var0, 2, "openjs");
		} else {
			staticMethod178(var0, 3, "openjs");
		}

	}

	static int staticMethod199() {
		return ++staticInt18 - 1;
	}

	public static boolean staticMethod200(char var0) {
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			if (var0 != 0) {
				char[] var1 = staticCharArray7;

				for (int var2 = 0; var2 < var1.length; var2++) {
					char var3 = var1[var2];
					if (var3 == var0) {
						return true;
					}
				}
			}

			return false;
		}
	}

	static BuildType[] staticMethod201() {
		return new BuildType[] { BuildType.staticBuildType2, BuildType.staticBuildType3, BuildType.staticBuildType1,
				BuildType.staticBuildType4 };
	}

	static Js5IndexImpl staticMethod202(int var0, boolean var1, boolean var2, boolean var3) {
		Js5DiskCache var4 = null;
		if (staticBufferedFile3 != null) {
			var4 = new Js5DiskCache(var0, staticBufferedFile3, staticBufferedFileArray1[var0], 1000000);
		}

		return new Js5IndexImpl(var4, Class59.staticJs5DiskCache1, var0, var1, var2, var3);
	}

	static final void staticMethod203() {
		int var0 = staticInt24;
		int[] var3 = staticIntArray7;

		for (int var1 = 0; var1 < var0; var1++) {
			Player var2 = Client.staticPlayerArray1[var3[var1]];
			if (var2 != null) {
				staticMethod324(var2, 1);
			}
		}

	}

	static int staticMethod204(int var0, CacheableSub1 var1, boolean var2) {
		int var24;
		String var26;
		if (var0 == 4100) {
			var26 = staticStringArray1[--staticInt148];
			var24 = staticIntArray16[--staticInt27];
			staticStringArray1[++staticInt148 - 1] = var26 + var24;
			return 1;
		} else {
			String var23;
			if (var0 == 4101) {
				staticInt148 -= 2;
				var26 = staticStringArray1[staticInt148];
				var23 = staticStringArray1[1 + staticInt148];
				staticStringArray1[++staticInt148 - 1] = var26 + var23;
				return 1;
			} else if (var0 == 4102) {
				var26 = staticStringArray1[--staticInt148];
				var24 = staticIntArray16[--staticInt27];
				staticStringArray1[++staticInt148 - 1] = var26 + staticMethod132(var24, true);
				return 1;
			} else if (var0 == 4103) {
				var26 = staticStringArray1[--staticInt148];
				staticStringArray1[++staticInt148 - 1] = var26.toLowerCase();
				return 1;
			} else {
				int var4;
				int var29;
				int var28;
				if (var0 == 4104) {
					var4 = staticIntArray16[--staticInt27];
					long var251 = (var4 + 11745L) * 86400000L;
					staticCalendar1.setTime(new Date(var251));
					var29 = staticCalendar1.get(5);
					int var27 = staticCalendar1.get(2);
					var28 = staticCalendar1.get(1);
					staticStringArray1[++staticInt148 - 1] = var29 + "-"
							+ staticStringArray2[var27] + "-" + var28;
					return 1;
				} else if (var0 == 4105) {
					staticInt148 -= 2;
					var26 = staticStringArray1[staticInt148];
					var23 = staticStringArray1[1 + staticInt148];
					if (AbstractClass2Sub1.staticPlayer1.aClass49_1 != null
							&& AbstractClass2Sub1.staticPlayer1.aClass49_1.aBool16) {
						staticStringArray1[++staticInt148 - 1] = var23;
					} else {
						staticStringArray1[++staticInt148 - 1] = var26;
					}

					return 1;
				} else if (var0 == 4106) {
					var4 = staticIntArray16[--staticInt27];
					staticStringArray1[++staticInt148 - 1] = Integer.toString(var4);
					return 1;
				} else if (var0 == 4107) {
					staticInt148 -= 2;
					int[] var241 = staticIntArray16;
					var24 = ++staticInt27 - 1;
					String var231 = staticStringArray1[staticInt148];
					String var261 = staticStringArray1[staticInt148 + 1];
					var28 = Client.staticInt231;
					int var291 = var231.length();
					int var30 = var261.length();
					int var31 = 0;
					int var321 = 0;
					byte var16 = 0;
					byte var18 = 0;

					label258: while (true) {
						char var33;
						if (var31 - var16 >= var291 && var321 - var18 >= var30) {
							int var341 = Math.min(var291, var30);

							int var37;
							for (var37 = 0; var37 < var341; var37++) {
								char var38 = var231.charAt(var37);
								var33 = var261.charAt(var37);
								if (var38 != var33 && Character.toUpperCase(var38) != Character.toUpperCase(var33)) {
									var38 = Character.toLowerCase(var38);
									var33 = Character.toLowerCase(var33);
									if (var33 != var38) {
										var29 = staticMethod399(var38, var28) - staticMethod399(var33, var28);
										break label258;
									}
								}
							}

							var37 = var291 - var30;
							if (var37 != 0) {
								var29 = var37;
							} else {
								for (int var39 = 0; var39 < var341; var39++) {
									var33 = var231.charAt(var39);
									char var22 = var261.charAt(var39);
									if (var22 != var33) {
										var29 = staticMethod399(var33, var28) - staticMethod399(var22, var28);
										break label258;
									}
								}

								var29 = 0;
							}
							break;
						}

						if (var31 - var16 >= var291) {
							var29 = -1;
							break;
						}

						if (var321 - var18 >= var30) {
							var29 = 1;
							break;
						}

						char var42;
						if (var16 != 0) {
							var42 = (char) var16;
						} else {
							var42 = var231.charAt(var31++);
						}

						if (var18 != 0) {
							var33 = (char) var18;
						} else {
							var33 = var261.charAt(var321++);
						}

						byte var36;
						if (var42 == 198) {
							var36 = 69;
						} else if (var42 == 230) {
							var36 = 101;
						} else if (var42 == 223) {
							var36 = 115;
						} else if (var42 == 338) {
							var36 = 69;
						} else if (var42 == 339) {
							var36 = 101;
						} else {
							var36 = 0;
						}

						var16 = var36;
						byte var14;
						if (var33 == 198) {
							var14 = 69;
						} else if (var33 == 230) {
							var14 = 101;
						} else if (var33 == 223) {
							var14 = 115;
						} else if (var33 == 338) {
							var14 = 69;
						} else if (var33 == 339) {
							var14 = 101;
						} else {
							var14 = 0;
						}

						var18 = var14;
						var42 = staticMethod277(var42, var28);
						var33 = staticMethod277(var33, var28);
						if (var42 != var33 && Character.toUpperCase(var42) != Character.toUpperCase(var33)) {
							var42 = Character.toLowerCase(var42);
							var33 = Character.toLowerCase(var33);
							if (var42 != var33) {
								var29 = staticMethod399(var42, var28) - staticMethod399(var33, var28);
								break;
							}
						}
					}

					byte var35;
					if (var29 > 0) {
						var35 = 1;
					} else if (var29 < 0) {
						var35 = -1;
					} else {
						var35 = 0;
					}

					var241[var24] = var35;
					return 1;
				} else {
					int var21;
					byte[] var32;
					Rasterizer2DSub2Sub1 var34;
					if (var0 == 4108) {
						var26 = staticStringArray1[--staticInt148];
						staticInt27 -= 2;
						var24 = staticIntArray16[staticInt27];
						var21 = staticIntArray16[staticInt27 + 1];
						var32 = NodeSub12.staticJs5IndexImpl11.getFile(var21, 0);
						var34 = new Rasterizer2DSub2Sub1(var32);
						staticIntArray16[++staticInt27 - 1] = var34.method615(var26, var24);
						return 1;
					} else if (var0 == 4109) {
						var26 = staticStringArray1[--staticInt148];
						staticInt27 -= 2;
						var24 = staticIntArray16[staticInt27];
						var21 = staticIntArray16[1 + staticInt27];
						var32 = NodeSub12.staticJs5IndexImpl11.getFile(var21, 0);
						var34 = new Rasterizer2DSub2Sub1(var32);
						staticIntArray16[++staticInt27 - 1] = var34.method628(var26, var24);
						return 1;
					} else if (var0 == 4110) {
						staticInt148 -= 2;
						var26 = staticStringArray1[staticInt148];
						var23 = staticStringArray1[1 + staticInt148];
						if (staticIntArray16[--staticInt27] == 1) {
							staticStringArray1[++staticInt148 - 1] = var26;
						} else {
							staticStringArray1[++staticInt148 - 1] = var23;
						}

						return 1;
					} else if (var0 == 4111) {
						var26 = staticStringArray1[--staticInt148];
						staticStringArray1[++staticInt148 - 1] = staticMethod456(var26);
						return 1;
					} else if (var0 == 4112) {
						var26 = staticStringArray1[--staticInt148];
						var24 = staticIntArray16[--staticInt27];
						staticStringArray1[++staticInt148 - 1] = var26 + (char) var24;
						return 1;
					} else {
						int[] var3;
						boolean var8;
						char var11;
						if (var0 == 4113) {
							var4 = staticIntArray16[--staticInt27];
							var3 = staticIntArray16;
							var21 = ++staticInt27 - 1;
							var11 = (char) var4;
							if (var11 >= 32 && var11 <= 126) {
								var8 = true;
							} else if (var11 >= 160 && var11 <= 255) {
								var8 = true;
							} else if (var11 != 8364 && var11 != 338 && var11 != 8212 && var11 != 339 && var11 != 376) {
								var8 = false;
							} else {
								var8 = true;
							}

							var3[var21] = var8 ? 1 : 0;
							return 1;
						} else if (var0 == 4114) {
							var4 = staticIntArray16[--staticInt27];
							staticIntArray16[++staticInt27 - 1] = staticMethod428((char) var4) ? 1 : 0;
							return 1;
						} else if (var0 == 4115) {
							var4 = staticIntArray16[--staticInt27];
							var3 = staticIntArray16;
							var21 = ++staticInt27 - 1;
							var11 = (char) var4;
							var8 = var11 >= 65 && var11 <= 90 || var11 >= 97 && var11 <= 122;
							var3[var21] = var8 ? 1 : 0;
							return 1;
						} else if (var0 != 4116) {
							if (var0 == 4117) {
								var26 = staticStringArray1[--staticInt148];
								if (var26 != null) {
									staticIntArray16[++staticInt27 - 1] = var26.length();
								} else {
									staticIntArray16[++staticInt27 - 1] = 0;
								}

								return 1;
							} else if (var0 == 4118) {
								var26 = staticStringArray1[--staticInt148];
								staticInt27 -= 2;
								var24 = staticIntArray16[staticInt27];
								var21 = staticIntArray16[staticInt27 + 1];
								staticStringArray1[++staticInt148 - 1] = var26.substring(var24, var21);
								return 1;
							} else if (var0 == 4119) {
								var26 = staticStringArray1[--staticInt148];
								StringBuilder var25 = new StringBuilder(var26.length());
								boolean var41 = false;

								for (var29 = 0; var29 < var26.length(); var29++) {
									var11 = var26.charAt(var29);
									if (var11 == 60) {
										var41 = true;
									} else if (var11 == 62) {
										var41 = false;
									} else if (!var41) {
										var25.append(var11);
									}
								}

								staticStringArray1[++staticInt148 - 1] = var25.toString();
								return 1;
							} else if (var0 == 4120) {
								var26 = staticStringArray1[--staticInt148];
								var24 = staticIntArray16[--staticInt27];
								staticIntArray16[++staticInt27 - 1] = var26.indexOf(var24);
								return 1;
							} else if (var0 == 4121) {
								staticInt148 -= 2;
								var26 = staticStringArray1[staticInt148];
								var23 = staticStringArray1[1 + staticInt148];
								var21 = staticIntArray16[--staticInt27];
								staticIntArray16[++staticInt27 - 1] = var26.indexOf(var23, var21);
								return 1;
							} else {
								return 2;
							}
						} else {
							var4 = staticIntArray16[--staticInt27];
							var3 = staticIntArray16;
							var21 = ++staticInt27 - 1;
							var11 = (char) var4;
							var8 = var11 >= 48 && var11 <= 57;
							var3[var21] = var8 ? 1 : 0;
							return 1;
						}
					}
				}
			}
		}
	}

	public static void staticMethod205(Js5Index var0) {
		Config5.staticJs5Index34 = var0;
	}

	public static int staticMethod23(byte[] var0, int var1) {
		int var2 = -1;

		for (int var4 = 0; var4 < var1; var4++) {
			var2 = var2 >>> 8 ^ ByteBuf.staticIntArray124[(var2 ^ var0[var4]) & 0xff];
		}

		var2 = ~var2;
		return var2;
	}

	static int staticMethod24(int var0, CacheableSub1 var1, boolean var2) {
		if (var0 == 3300) {
			staticIntArray16[++staticInt27 - 1] = Client.staticInt166;
			return 1;
		} else {
			int var3;
			int[] var4;
			NodeSub20 var5;
			int var6;
			int var7;
			int var8;
			if (var0 == 3301) {
				staticInt27 -= 2;
				var3 = staticIntArray16[staticInt27];
				var6 = staticIntArray16[staticInt27 + 1];
				var4 = staticIntArray16;
				var7 = ++staticInt27 - 1;
				var5 = (NodeSub20) NodeSub20.staticHashTable7.method149(var3);
				if (var5 == null) {
					var8 = -1;
				} else if (var6 >= 0 && var6 < var5.anIntArray82.length) {
					var8 = var5.anIntArray82[var6];
				} else {
					var8 = -1;
				}

				var4[var7] = var8;
				return 1;
			} else if (var0 == 3302) {
				staticInt27 -= 2;
				var3 = staticIntArray16[staticInt27];
				var6 = staticIntArray16[staticInt27 + 1];
				var4 = staticIntArray16;
				var7 = ++staticInt27 - 1;
				var5 = (NodeSub20) NodeSub20.staticHashTable7.method149(var3);
				if (var5 == null) {
					var8 = 0;
				} else if (var6 >= 0 && var6 < var5.anIntArray83.length) {
					var8 = var5.anIntArray83[var6];
				} else {
					var8 = 0;
				}

				var4[var7] = var8;
				return 1;
			} else if (var0 == 3303) {
				staticInt27 -= 2;
				var3 = staticIntArray16[staticInt27];
				var6 = staticIntArray16[staticInt27 + 1];
				staticIntArray16[++staticInt27 - 1] = staticMethod238(var3, var6);
				return 1;
			} else if (var0 == 3304) {
				var3 = staticIntArray16[--staticInt27];
				staticIntArray16[++staticInt27 - 1] = staticMethod147(var3).anInt569;
				return 1;
			} else if (var0 == 3305) {
				var3 = staticIntArray16[--staticInt27];
				staticIntArray16[++staticInt27 - 1] = Client.staticIntArray91[var3];
				return 1;
			} else if (var0 == 3306) {
				var3 = staticIntArray16[--staticInt27];
				staticIntArray16[++staticInt27 - 1] = Client.staticIntArray96[var3];
				return 1;
			} else if (var0 == 3307) {
				var3 = staticIntArray16[--staticInt27];
				staticIntArray16[++staticInt27 - 1] = Client.staticIntArray108[var3];
				return 1;
			} else if (var0 == 3308) {
				var3 = NodeSub4.staticInt155;
				var6 = (AbstractClass2Sub1.staticPlayer1.anInt628 >> 7) + NodeSub3.staticInt154;
				int var9 = (AbstractClass2Sub1.staticPlayer1.anInt591 >> 7) + Class34.staticInt75;
				staticIntArray16[++staticInt27 - 1] = (var3 << 28) + (var6 << 14) + var9;
				return 1;
			} else if (var0 == 3309) {
				var3 = staticIntArray16[--staticInt27];
				staticIntArray16[++staticInt27 - 1] = var3 >> 14 & 0x3fff;
				return 1;
			} else if (var0 == 3310) {
				var3 = staticIntArray16[--staticInt27];
				staticIntArray16[++staticInt27 - 1] = var3 >> 28;
				return 1;
			} else if (var0 == 3311) {
				var3 = staticIntArray16[--staticInt27];
				staticIntArray16[++staticInt27 - 1] = var3 & 0x3fff;
				return 1;
			} else if (var0 == 3312) {
				staticIntArray16[++staticInt27 - 1] = Client.staticBool20 ? 1 : 0;
				return 1;
			} else if (var0 == 3313) {
				staticInt27 -= 2;
				var3 = '\u8000' + staticIntArray16[staticInt27];
				var6 = staticIntArray16[staticInt27 + 1];
				var4 = staticIntArray16;
				var7 = ++staticInt27 - 1;
				var5 = (NodeSub20) NodeSub20.staticHashTable7.method149(var3);
				if (var5 == null) {
					var8 = -1;
				} else if (var6 >= 0 && var6 < var5.anIntArray82.length) {
					var8 = var5.anIntArray82[var6];
				} else {
					var8 = -1;
				}

				var4[var7] = var8;
				return 1;
			} else if (var0 != 3314) {
				if (var0 == 3315) {
					staticInt27 -= 2;
					var3 = staticIntArray16[staticInt27] + '\u8000';
					var6 = staticIntArray16[1 + staticInt27];
					staticIntArray16[++staticInt27 - 1] = staticMethod238(var3, var6);
					return 1;
				} else if (var0 == 3316) {
					if (Client.myRights >= 2) {
						staticIntArray16[++staticInt27 - 1] = Client.myRights;
					} else {
						staticIntArray16[++staticInt27 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3317) {
					staticIntArray16[++staticInt27 - 1] = Client.staticInt170;
					return 1;
				} else if (var0 == 3318) {
					staticIntArray16[++staticInt27 - 1] = Client.staticInt309;
					return 1;
				} else if (var0 == 3321) {
					staticIntArray16[++staticInt27 - 1] = Client.staticInt267;
					return 1;
				} else if (var0 == 3322) {
					staticIntArray16[++staticInt27 - 1] = Client.staticInt232;
					return 1;
				} else if (var0 == 3323) {
					if (Client.staticBool33) {
						staticIntArray16[++staticInt27 - 1] = 1;
					} else {
						staticIntArray16[++staticInt27 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3324) {
					staticIntArray16[++staticInt27 - 1] = Client.staticInt201;
					return 1;
				} else {
					return 2;
				}
			} else {
				staticInt27 -= 2;
				var3 = '\u8000' + staticIntArray16[staticInt27];
				var6 = staticIntArray16[staticInt27 + 1];
				var4 = staticIntArray16;
				var7 = ++staticInt27 - 1;
				var5 = (NodeSub20) NodeSub20.staticHashTable7.method149(var3);
				if (var5 == null) {
					var8 = 0;
				} else if (var6 >= 0 && var6 < var5.anIntArray83.length) {
					var8 = var5.anIntArray83[var6];
				} else {
					var8 = 0;
				}

				var4[var7] = var8;
				return 1;
			}
		}
	}

	static final int staticMethod206(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = var2 / 2 + (var1 / 32 << 7) + (var0 / 4 << 10);
		return var3;
	}

	static void staticMethod207(BitBuf var0, int var1) {
		boolean var3 = var0.method477(1) == 1;
		if (var3) {
			staticIntArray12[++staticInt22 - 1] = var1;
		}

		int var4 = var0.method477(2);
		Player var6 = Client.staticPlayerArray1[var1];
		if (var4 == 0) {
			if (var3) {
				var6.aBool82 = false;
			} else {
				if (var1 == Client.myPlayerIndex) {
					throw new RuntimeException();
				}

				staticIntArray9[var1] = (Class34.staticInt75 + var6.anIntArray122[0] >> 13)
						+ (var6.anIntArray127[0] + NodeSub3.staticInt154 >> 13 << 14) + (var6.anInt698 << 28);
				if (var6.anInt608 != -1) {
					staticIntArray10[var1] = var6.anInt608;
				} else {
					staticIntArray10[var1] = var6.anInt630;
				}

				staticIntArray11[var1] = var6.anInt600;
				Client.staticPlayerArray1[var1] = null;
				if (var0.method477(1) != 0) {
					staticMethod256(var0, var1);
				}
			}
		} else {
			int var2;
			int var5;
			int var7;
			if (var4 == 1) {
				var2 = var0.method477(3);
				var7 = var6.anIntArray127[0];
				var5 = var6.anIntArray122[0];
				if (var2 == 0) {
					--var7;
					--var5;
				} else if (var2 == 1) {
					--var5;
				} else if (var2 == 2) {
					++var7;
					--var5;
				} else if (var2 == 3) {
					--var7;
				} else if (var2 == 4) {
					++var7;
				} else if (var2 == 5) {
					--var7;
					++var5;
				} else if (var2 == 6) {
					++var5;
				} else if (var2 == 7) {
					++var7;
					++var5;
				}

				if (var1 != Client.myPlayerIndex || var6.anInt628 >= 1536 && var6.anInt591 >= 1536 && var6.anInt628 < 11776
						&& var6.anInt591 < 11776) {
					if (var3) {
						var6.aBool82 = true;
						var6.anInt700 = var7;
						var6.anInt692 = var5;
					} else {
						var6.aBool82 = false;
						var6.method660(var7, var5, staticByteArray2[var1]);
					}
				} else {
					var6.method661(var7, var5);
					var6.aBool82 = false;
				}
			} else if (var4 == 2) {
				var2 = var0.method477(4);
				var7 = var6.anIntArray127[0];
				var5 = var6.anIntArray122[0];
				if (var2 == 0) {
					var7 -= 2;
					var5 -= 2;
				} else if (var2 == 1) {
					--var7;
					var5 -= 2;
				} else if (var2 == 2) {
					var5 -= 2;
				} else if (var2 == 3) {
					++var7;
					var5 -= 2;
				} else if (var2 == 4) {
					var7 += 2;
					var5 -= 2;
				} else if (var2 == 5) {
					var7 -= 2;
					--var5;
				} else if (var2 == 6) {
					var7 += 2;
					--var5;
				} else if (var2 == 7) {
					var7 -= 2;
				} else if (var2 == 8) {
					var7 += 2;
				} else if (var2 == 9) {
					var7 -= 2;
					++var5;
				} else if (var2 == 10) {
					var7 += 2;
					++var5;
				} else if (var2 == 11) {
					var7 -= 2;
					var5 += 2;
				} else if (var2 == 12) {
					--var7;
					var5 += 2;
				} else if (var2 == 13) {
					var5 += 2;
				} else if (var2 == 14) {
					++var7;
					var5 += 2;
				} else if (var2 == 15) {
					var7 += 2;
					var5 += 2;
				}

				if (Client.myPlayerIndex != var1 || var6.anInt628 >= 1536 && var6.anInt591 >= 1536 && var6.anInt628 < 11776
						&& var6.anInt591 < 11776) {
					if (var3) {
						var6.aBool82 = true;
						var6.anInt700 = var7;
						var6.anInt692 = var5;
					} else {
						var6.aBool82 = false;
						var6.method660(var7, var5, staticByteArray2[var1]);
					}
				} else {
					var6.method661(var7, var5);
					var6.aBool82 = false;
				}
			} else {
				var2 = var0.method477(1);
				int var8;
				int var9;
				int var10;
				int var11;
				if (var2 == 0) {
					var7 = var0.method477(12);
					var5 = var7 >> 10;
					var9 = var7 >> 5 & 0x1f;
					if (var9 > 15) {
						var9 -= 32;
					}

					var10 = var7 & 0x1f;
					if (var10 > 15) {
						var10 -= 32;
					}

					var11 = var6.anIntArray127[0] + var9;
					var8 = var10 + var6.anIntArray122[0];
					if (var1 == Client.myPlayerIndex && (var6.anInt628 < 1536 || var6.anInt591 < 1536
							|| var6.anInt628 >= 11776 || var6.anInt591 >= 11776)) {
						var6.method661(var11, var8);
						var6.aBool82 = false;
					} else if (var3) {
						var6.aBool82 = true;
						var6.anInt700 = var11;
						var6.anInt692 = var8;
					} else {
						var6.aBool82 = false;
						var6.method660(var11, var8, staticByteArray2[var1]);
					}

					var6.anInt698 = (byte) (var6.anInt698 + var5 & 0x3);
					if (var1 == Client.myPlayerIndex) {
						NodeSub4.staticInt155 = var6.anInt698;
					}
				} else {
					var7 = var0.method477(30);
					var5 = var7 >> 28;
					var9 = var7 >> 14 & 0x3fff;
					var10 = var7 & 0x3fff;
					var11 = (var6.anIntArray127[0] + NodeSub3.staticInt154 + var9 & 0x3fff) - NodeSub3.staticInt154;
					var8 = (var10 + var6.anIntArray122[0] + Class34.staticInt75 & 0x3fff) - Class34.staticInt75;
					if (Client.myPlayerIndex == var1 && (var6.anInt628 < 1536 || var6.anInt591 < 1536
							|| var6.anInt628 >= 11776 || var6.anInt591 >= 11776)) {
						var6.method661(var11, var8);
						var6.aBool82 = false;
					} else if (var3) {
						var6.aBool82 = true;
						var6.anInt700 = var11;
						var6.anInt692 = var8;
					} else {
						var6.aBool82 = false;
						var6.method660(var11, var8, staticByteArray2[var1]);
					}

					var6.anInt698 = -1467680121 * (byte) (var6.anInt698 + var5 & 0x3);
					if (var1 == Client.myPlayerIndex) {
						NodeSub4.staticInt155 = var6.anInt698;
					}
				}
			}
		}

	}

	static void staticMethod208() {
		if (Client.staticBool32) {
			Widget var1 = staticMethod32(Class3.staticInt19, Client.staticInt260);
			if (var1 != null && var1.anObjectArray12 != null) {
				NodeSub16 var0 = new NodeSub16();
				var0.aWidget1 = var1;
				var0.anObjectArray2 = var1.anObjectArray12;
				staticMethod375(var0);
			}

			Client.staticBool32 = false;
			staticMethod73(var1);
		}

	}

	public static AnimDef staticMethod210(int var0) {
		AnimDef var1 = (AnimDef) AnimDef.staticCache32.get(var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = AnimDef.staticJs5Index33.getFile(12, var0);
			var1 = new AnimDef();
			if (var2 != null) {
				var1.method550(new ByteBuf(var2));
			}

			var1.method555();
			AnimDef.staticCache32.method170(var1, var0);
			return var1;
		}
	}

	static final String staticMethod211(int var0, int var1) {
		int var2 = var1 - var0;
		return var2 < -9 ? staticMethod118(16711680)
				: var2 < -6 ? staticMethod118(16723968)
						: var2 < -3 ? staticMethod118(16740352)
								: var2 < 0 ? staticMethod118(16756736)
										: var2 > 9 ? staticMethod118('\uff00')
												: var2 > 6 ? staticMethod118(4259584)
														: var2 > 3 ? staticMethod118(8453888)
																: var2 > 0 ? staticMethod118(12648192)
																		: staticMethod118(16776960);
	}

	public static void staticMethod217(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				--var4;
				var1 += var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				for (var4 -= 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					;
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		for (var4 += 7; var1 < var4; var2[var3++] = var0[var1++]) {
			;
		}

	}

	public static void staticMethod218(int[] var0, int var1, int var2) {
		for (var2 = var1 + var2 - 7; var1 < var2; var0[var1++] = 0) {
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
		}

		for (var2 += 7; var1 < var2; var0[var1++] = 0) {
			;
		}

	}

	static int staticMethod219(int var0, CacheableSub1 var1, boolean var2) {
		Widget var3 = staticMethod8(staticIntArray16[--staticInt27]);
		if (var0 == 2600) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt335;
			return 1;
		} else if (var0 == 2601) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt312;
			return 1;
		} else if (var0 == 2602) {
			staticStringArray1[++staticInt148 - 1] = var3.aString20;
			return 1;
		} else if (var0 == 2603) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt344;
			return 1;
		} else if (var0 == 2604) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt361;
			return 1;
		} else if (var0 == 2605) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt334;
			return 1;
		} else if (var0 == 2606) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt325;
			return 1;
		} else if (var0 == 2607) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt324;
			return 1;
		} else if (var0 == 2608) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt332;
			return 1;
		} else if (var0 == 2609) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt317;
			return 1;
		} else if (var0 == 2610) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt318;
			return 1;
		} else if (var0 == 2611) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt360;
			return 1;
		} else if (var0 == 2612) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt313;
			return 1;
		} else if (var0 == 2613) {
			staticIntArray16[++staticInt27 - 1] = var3.aClass54_1.method12();
			return 1;
		} else {
			return 2;
		}
	}

	static void staticMethod220(int var0) {
		if (var0 == -3) {
			GPI.staticMethod231("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			GPI.staticMethod231("", "Error connecting to server.", "");
		} else if (var0 == -1) {
			GPI.staticMethod231("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			staticInt13 = 3;
		} else if (var0 == 4) {
			GPI.staticMethod231("Your account has been disabled.", "Please check your message-centre for details.", "");
		} else if (var0 == 5) {
			GPI.staticMethod231("Your account has not logged out from its last",
					"session or the server is too busy right now.", "Please try again in a few minutes.");
		} else if (var0 == 6) {
			GPI.staticMethod231("RuneScape has been updated!", "Please reload this page.", "");
		} else if (var0 == 7) {
			GPI.staticMethod231("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			GPI.staticMethod231("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			GPI.staticMethod231("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			GPI.staticMethod231("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			GPI.staticMethod231("We suspect someone knows your password.", "Press \'change your password\' on front page.",
					"");
		} else if (var0 == 12) {
			GPI.staticMethod231("You need a members account to login to this world.",
					"Please subscribe, or use a different world.", "");
		} else if (var0 == 13) {
			GPI.staticMethod231("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			GPI.staticMethod231("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) {
			GPI.staticMethod231("Too many login attempts.", "Please wait a few minutes before trying again.", "");
		} else if (var0 == 17) {
			GPI.staticMethod231("You are standing in a members-only area.",
					"To play on this world move to a free area first", "");
		} else if (var0 == 18) {
			GPI.staticMethod231("Account locked as we suspect it has been stolen.",
					"Press \'recover a locked account\' on front page.", "");
		} else if (var0 == 19) {
			GPI.staticMethod231("This world is running a closed Beta.", "Sorry invited players only.",
					"Please use a different world.");
		} else if (var0 == 20) {
			GPI.staticMethod231("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			GPI.staticMethod231("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			GPI.staticMethod231("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			GPI.staticMethod231("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			GPI.staticMethod231("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			GPI.staticMethod231("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			GPI.staticMethod231("", "Service unavailable.", "");
		} else if (var0 == 31) {
			GPI.staticMethod231("Your account must have a displayname set", "in order to play the game.  Please set it",
					"via the website, or the main game.");
		} else if (var0 == 32) {
			GPI.staticMethod231("Your attempt to log into your account was", "unsuccessful.  Don\'t worry, you can sort",
					"this out by visiting the billing system.");
		} else if (var0 == 37) {
			GPI.staticMethod231("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			GPI.staticMethod231("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) {
			GPI.staticMethod231("Sorry, but your account is not eligible to", "play this version of the game.  Please try",
					"playing the main game instead!");
		} else {
			if (var0 == 56) {
				GPI.staticMethod231("Enter the 6-digit code generated by your", "authenticator app.", "");
				staticMethod396(11);
				return;
			}

			if (var0 == 57) {
				GPI.staticMethod231("The code you entered was incorrect.", "Please try again.", "");
				staticMethod396(11);
				return;
			}

			GPI.staticMethod231("Unexpected server response", "Please try using a different world.", "");
		}

		staticMethod396(10);
	}

	static int staticMethod221(int var0, CacheableSub1 var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = staticMethod8(staticIntArray16[--staticInt27]);
		} else {
			var3 = var2 ? Class3.staticWidget1 : staticWidget2;
		}

		staticMethod73(var3);
		if (var0 != 1200 && var0 != 1205 && var0 != 1212) {
			if (var0 == 1201) {
				var3.anInt348 = 2;
				var3.anInt295 = staticIntArray16[--staticInt27];
				return 1;
			} else if (var0 == 1202) {
				var3.anInt348 = 3;
				var3.anInt295 = AbstractClass2Sub1.staticPlayer1.aClass49_1.method250();
				return 1;
			} else {
				return 2;
			}
		} else {
			staticInt27 -= 2;
			int var5 = staticIntArray16[staticInt27];
			int var6 = staticIntArray16[1 + staticInt27];
			var3.anInt352 = var5;
			var3.anInt353 = var6;
			ItemDefinition var4 = staticMethod153(var5);
			var3.anInt325 = var4.anInt456;
			var3.anInt332 = var4.anInt466;
			var3.anInt324 = var4.anInt468;
			var3.anInt329 = var4.anInt436;
			var3.anInt330 = var4.anInt452;
			var3.anInt334 = var4.anInt444;
			if (var0 == 1205) {
				var3.anInt337 = 0;
			} else if (var0 == 1212 | var4.anInt442 == 1) {
				var3.anInt337 = 1;
			} else {
				var3.anInt337 = 2;
			}

			if (var3.anInt291 > 0) {
				var3.anInt334 = var3.anInt334 * 32 / var3.anInt291;
			} else if (var3.anInt304 > 0) {
				var3.anInt334 = var3.anInt334 * 32 / var3.anInt304;
			}

			return 1;
		}
	}

	static long staticMethod222() {
		try {
			URL var8 = new URL(staticMethod109("services", false) + "m=accountappeal/login.ws");
			URLConnection var1 = var8.openConnection();
			var1.setRequestProperty("connection", "close");
			var1.setDoInput(true);
			var1.setDoOutput(true);
			var1.setConnectTimeout(5000);
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
			var2.write("data1=req");
			var2.flush();
			InputStream var3 = var1.getInputStream();
			ByteBuf var4 = new ByteBuf(new byte[1000]);

			do {
				int var5 = var3.read(var4.buf, var4.position, 1000 - var4.position);
				if (var5 == -1) {
					var4.position = 0;
					long var6 = var4.readLong();
					return var6;
				}

				var4.position += var5;
			} while (var4.position < 1000);

			return 0L;
		} catch (Exception var81) {
			return 0L;
		}
	}

	static int staticMethod223(int var0) {
		ChatLog var1 = (ChatLog) staticMap1.get(Integer.valueOf(var0));
		return var1 == null ? 0 : var1.method4();
	}

	static void staticMethod224(int var0, String var1, String var2, String var3) {
		ChatLog var4 = (ChatLog) staticMap1.get(Integer.valueOf(var0));
		if (var4 == null) {
			var4 = new ChatLog();
			staticMap1.put(Integer.valueOf(var0), var4);
		}

		ChatMessage var5 = var4.method2(var0, var1, var2, var3);
		staticClass35_1.method157(var5, var5.anInt571);
		staticClass45_1.method222(var5);
		Client.staticInt279 = Client.staticInt274 * -2038739763;
	}

	static final void staticMethod226(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (staticMethod4(var0)) {
			Class11.staticWidgetArray1 = null;
			staticMethod92(Widget.staticWidgetArrayArray1[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (Class11.staticWidgetArray1 != null) {
				staticMethod92(Class11.staticWidgetArray1, -1412584499, var1, var2, var3, var4, staticInt26,
						staticInt141, var7);
				Class11.staticWidgetArray1 = null;
			}
		} else if (var7 != -1) {
			Client.staticBoolArray8[var7] = true;
		} else {
			for (int var8 = 0; var8 < 100; var8++) {
				Client.staticBoolArray8[var8] = true;
			}
		}

	}

	public static String staticMethod227(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var7 = 0;

		for (int var4 = 0; var4 < var2; var4++) {
			int var5 = var0[var1 + var4] & 0xff;
			if (var5 != 0) {
				if (var5 >= 128 && var5 < 160) {
					char var6 = staticCharArray7[var5 - 128];
					if (var6 == 0) {
						var6 = 63;
					}

					var5 = var6;
				}

				var3[var7++] = (char) var5;
			}
		}

		return new String(var3, 0, var7);
	}

	public static GameType[] staticMethod228() {
		return new GameType[] { GameType.staticGameType5, GameType.staticGameType1, GameType.staticGameType4,
				GameType.staticGameType3, GameType.staticGameType6, GameType.staticGameType2 };
	}

	public static boolean staticMethod28(int var0) {
		return (var0 & 0x1) != 0;
	}

	static final void staticMethod29() {
		for (int var0 = 0; var0 < Client.staticInt236; var0++) {
			--Client.staticIntArray116[var0];
			if (Client.staticIntArray116[var0] >= -10) {
				SoundEffect var91 = Client.staticClass9Array1[var0];
				if (var91 == null) {
					var91 = staticMethod52(Config19.staticJs5IndexImpl15, Client.staticIntArray114[var0], 0);
					if (var91 == null) {
						continue;
					}

					Client.staticIntArray116[var0] += var91.method26();
					Client.staticClass9Array1[var0] = var91;
				}

				if (Client.staticIntArray116[var0] < 0) {
					int var10;
					if (Client.staticIntArray117[var0] != 0) {
						int var9 = (Client.staticIntArray117[var0] & 0xff) * 128;
						int var11 = Client.staticIntArray117[var0] >> 16 & 0xff;
						int var5 = 64 + var11 * 128 - AbstractClass2Sub1.staticPlayer1.anInt628;
						if (var5 < 0) {
							var5 = -var5;
						}

						int var6 = Client.staticIntArray117[var0] >> 8 & 0xff;
						int var7 = 64 + var6 * 128 - AbstractClass2Sub1.staticPlayer1.anInt591;
						if (var7 < 0) {
							var7 = -var7;
						}

						int var1 = var7 + var5 - 128;
						if (var1 > var9) {
							Client.staticIntArray116[var0] = -100;
							continue;
						}

						if (var1 < 0) {
							var1 = 0;
						}

						var10 = Client.staticInt301 * (var9 - var1) / var9;
					} else {
						var10 = Client.staticInt300 * 127;
					}

					if (var10 > 0) {
						NodeSub6Sub1 var111 = var91.method25().method433(Class16.staticClass20_1);
						NodeSub8Sub2 var12 = staticMethod352(var111, 100, var10);
						var12.method430(Client.staticIntArray115[var0] - 1);
						ClientScriptMap.staticNodeSub8Sub1_1.method408(var12);
					}

					Client.staticIntArray116[var0] = -100;
				}
			} else {
				--Client.staticInt236;

				for (int var3 = var0; var3 < Client.staticInt236; var3++) {
					Client.staticIntArray114[var3] = Client.staticIntArray114[1 + var3];
					Client.staticClass9Array1[var3] = Client.staticClass9Array1[var3 + 1];
					Client.staticIntArray115[var3] = Client.staticIntArray115[1 + var3];
					Client.staticIntArray116[var3] = Client.staticIntArray116[var3 + 1];
					Client.staticIntArray117[var3] = Client.staticIntArray117[1 + var3];
				}

				--var0;
			}
		}

		if (Client.staticBool38 && !staticMethod257()) {
			if (Client.staticInt299 != 0 && Client.staticInt249 != -1) {
				staticMethod30(Class34.staticJs5IndexImpl3, Client.staticInt249, 0, Client.staticInt299, false);
			}

			Client.staticBool38 = false;
		}

	}

	static final void staticMethod229(NpcDefinition var0, int var1, int var2, int var3) {
		if (Client.staticInt252 < 400) {
			if (var0.anIntArray116 != null) {
				var0 = var0.method544();
			}

			if (var0 != null && var0.aBool69 && (!var0.aBool71 || var1 == -Client.staticInt269)) {
				String var8 = var0.aString35;
				if (var0.anInt544 != 0) {
					var8 = var8 + staticMethod211(var0.anInt544, AbstractClass2Sub1.staticPlayer1.anInt685) + " "
							+ staticString10 + "level-" + var0.anInt544 + staticString13;
				}

				if (var0.aBool71 && Client.staticBool22) {
					staticMethod341("Examine", staticMethod118(16776960) + var8, 1003, var1, var2, var3);
				}

				if (Client.staticInt258 == 1) {
					staticMethod341("Use",
							Client.staticString32 + " " + staticString14 + " " + staticMethod118(16776960) + var8,
							7, var1, var2, var3);
				} else if (Client.staticBool32) {
					if ((Class57.staticInt144 & 0x2) == 2) {
						staticMethod341(Client.staticString31, Client.staticString30 + " " + staticString14 + " "
								+ staticMethod118(16776960) + var8, 8, var1, var2, var3);
					}
				} else {
					int var6 = var0.aBool71 && Client.staticBool22 ? 2000 : 0;
					String[] var4 = var0.aStringArray10;
					if (Client.staticBool34) {
						var4 = staticMethod425(var4);
					}

					int var5;
					int var7;
					if (var4 != null) {
						for (var5 = 4; var5 >= 0; --var5) {
							if (var4[var5] != null && !var4[var5].equalsIgnoreCase("Attack")) {
								var7 = 0;
								if (var5 == 0) {
									var7 = var6 + 9;
								}

								if (var5 == 1) {
									var7 = 10 + var6;
								}

								if (var5 == 2) {
									var7 = var6 + 11;
								}

								if (var5 == 3) {
									var7 = var6 + 12;
								}

								if (var5 == 4) {
									var7 = 13 + var6;
								}

								staticMethod341(var4[var5], staticMethod118(16776960) + var8, var7, var1, var2, var3);
							}
						}
					}

					if (var4 != null) {
						for (var5 = 4; var5 >= 0; --var5) {
							if (var4[var5] != null && var4[var5].equalsIgnoreCase("Attack")) {
								short var9 = 0;
								if (Client.staticClass4_6 != Class4.staticClass4_2) {
									if (Class4.staticClass4_1 == Client.staticClass4_6
											|| Class4.staticClass4_4 == Client.staticClass4_6
													&& var0.anInt544 > AbstractClass2Sub1.staticPlayer1.anInt685) {
										var9 = 2000;
									}

									var7 = 0;
									if (var5 == 0) {
										var7 = var9 + 9;
									}

									if (var5 == 1) {
										var7 = 10 + var9;
									}

									if (var5 == 2) {
										var7 = 11 + var9;
									}

									if (var5 == 3) {
										var7 = 12 + var9;
									}

									if (var5 == 4) {
										var7 = var9 + 13;
									}

									staticMethod341(var4[var5], staticMethod118(16776960) + var8, var7, var1, var2,
											var3);
								}
							}
						}
					}

					if (!var0.aBool71 || !Client.staticBool22) {
						staticMethod341("Examine", staticMethod118(16776960) + var8, 1003, var1, var2, var3);
					}
				}
			}
		}

	}

	static final int staticMethod230(int var0, int var1) {
		int var2 = staticMethod259(var0 + '\ub135', var1 + 91923, 4) - 128
				+ (staticMethod259(var0 + 10294, '\u93bd' + var1, 2) - 128 >> 1)
				+ (staticMethod259(var0, var1, 1) - 128 >> 2);
		var2 = (int) (0.3D * var2) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	public static void staticMethod236(Js5Index var0) {
		Varp.staticJs5Index27 = var0;
		Varp.staticInt323 = Varp.staticJs5Index27.method263(16);
	}

	static ChatMessage staticMethod237(int var0, int var1) {
		ChatLog var2 = (ChatLog) staticMap1.get(Integer.valueOf(var0));
		return var2.method3(var1);
	}

	static void staticMethod34() {
		Client.outBuffer.method471(230);
		Client.outBuffer.writeByte(staticMethod248());
		Client.outBuffer.writeShort(gameWidth);
		Client.outBuffer.writeShort(Class47.gameHeight);
	}

	static final void staticMethod35(boolean var0) {
		for (int var1 = 0; var1 < Client.staticInt186; var1++) {
			Npc var2 = Client.staticNpcArray1[Client.staticIntArray121[var1]];
			int var5 = 536870912 + (Client.staticIntArray121[var1] << 14);
			if (var2 != null && var2.method565() && var0 == var2.aNpcDef1.aBool68 && var2.aNpcDef1.method543()) {
				int var3 = var2.anInt628 >> 7;
				int var4 = var2.anInt591 >> 7;
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
					if (var2.anInt626 == 1 && (var2.anInt628 & 0x7f) == 64 && (var2.anInt591 & 0x7f) == 64) {
						if (Client.staticInt292 == Client.staticIntArrayArray9[var3][var4]) {
							continue;
						}

						Client.staticIntArrayArray9[var3][var4] = Client.staticInt292;
					}

					if (!var2.aNpcDef1.aBool69) {
						var5 += Integer.MIN_VALUE;
					}

					Friend.staticScene1.method102(NodeSub4.staticInt155, var2.anInt628, var2.anInt591,
							staticMethod240(var2.anInt626 * 64 - 64 + var2.anInt628,
									var2.anInt591 + var2.anInt626 * 64 - 64, NodeSub4.staticInt155),
							var2.anInt626 * 64 - 64 + 60, var2, var2.anInt592, var5, var2.aBool74);
				}
			}
		}

	}

	static int staticMethod245(int var0, CacheableSub1 var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = staticIntArray16[--staticInt27];
			var4 = staticMethod8(var3);
		} else {
			var4 = var2 ? Class3.staticWidget1 : staticWidget2;
		}

		if (var0 == 1000) {
			staticInt27 -= 4;
			var4.anInt302 = staticIntArray16[staticInt27];
			var4.anInt303 = staticIntArray16[staticInt27 + 1];
			var4.anInt299 = staticIntArray16[staticInt27 + 2];
			var4.anInt300 = staticIntArray16[3 + staticInt27];
			staticMethod73(var4);
			staticMethod27(var4);
			if (var3 != -1 && var4.anInt296 == 0) {
				staticMethod135(Widget.staticWidgetArrayArray1[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == 1001) {
			staticInt27 -= 4;
			var4.anInt304 = staticIntArray16[staticInt27];
			var4.anInt305 = staticIntArray16[staticInt27 + 1];
			var4.anInt293 = staticIntArray16[2 + staticInt27];
			var4.anInt311 = staticIntArray16[3 + staticInt27];
			staticMethod73(var4);
			staticMethod27(var4);
			if (var3 != -1 && var4.anInt296 == 0) {
				staticMethod135(Widget.staticWidgetArrayArray1[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == 1003) {
			boolean var5 = staticIntArray16[--staticInt27] == 1;
			if (var5 != var4.aBool32) {
				var4.aBool32 = var5;
				staticMethod73(var4);
			}

			return 1;
		} else if (var0 == 1005) {
			var4.aBool43 = staticIntArray16[--staticInt27] == 1;
			return 1;
		} else if (var0 == 1006) {
			var4.aBool38 = staticIntArray16[--staticInt27] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	static void staticMethod246(int var0, int var1, int var2, ObjectDefinition var3, int var4) {
		NodeSub4 var5 = new NodeSub4();
		var5.anInt222 = var0;
		var5.anInt224 = var1 * 128;
		var5.anInt223 = var2 * 128;
		int var7 = var3.anInt485;
		int var6 = var3.anInt486;
		if (var4 == 1 || var4 == 3) {
			var7 = var3.anInt486;
			var6 = var3.anInt485;
		}

		var5.anInt231 = (var7 + var1) * 128;
		var5.anInt225 = (var6 + var2) * 128;
		var5.anInt227 = var3.anInt504;
		var5.anInt226 = var3.anInt505 * 128;
		var5.anInt228 = var3.anInt495 * 1973803733;
		var5.anInt229 = var3.anInt506 * 1048704065;
		var5.anIntArray59 = var3.anIntArray109;
		if (var3.anIntArray111 != null) {
			var5.anObjectDef1 = var3;
			var5.method295();
		}

		NodeSub4.staticClass39_4.method198(var5);
		if (var5.anIntArray59 != null) {
			var5.anInt230 = var5.anInt228 + (int) (Math.random() * (var5.anInt229 * -1409853411 - var5.anInt228));
		}

	}

	static boolean staticMethod247(Widget var0) {
		if (Client.staticBool40) {
			if (staticMethod192(var0) != 0) {
				return false;
			}

			if (var0.anInt296 == 0) {
				return false;
			}
		}

		return var0.aBool32;
	}

	static int staticMethod248() {
		return Client.resizable ? 2 : 1;
	}

	static final void staticMethod249(int var0, int var1, int var2, int var3) {
		if (Client.staticInt258 == 0 && !Client.staticBool32) {
			staticMethod341("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		int var12 = -1;
		int var13 = -1;

		int var8;
		int var14;
		for (var14 = 0; var14 < Model.staticInt339; var14++) {
			var8 = Model.staticIntArray153[var14];
			int var26 = var8 & 0x7f;
			int var10 = var8 >> 7 & 0x7f;
			int var15 = var8 >> 29 & 0x3;
			int var16 = var8 >> 14 & 0x7fff;
			if (var13 != var8) {
				var13 = var8;
				if (var15 == 2 && Friend.staticScene1.method117(NodeSub4.staticInt155, var26, var10, var8) >= 0) {
					ObjectDefinition var11 = staticMethod394(var16);
					if (var11.anIntArray111 != null) {
						var11 = var11.method516();
					}

					if (var11 == null) {
						continue;
					}

					if (Client.staticInt258 == 1) {
						staticMethod341("Use", Client.staticString32 + " " + staticString14 + " "
								+ staticMethod118('\uffff') + var11.aString33, 1, var8, var26, var10);
					} else if (Client.staticBool32) {
						if ((Class57.staticInt144 & 0x4) == 4) {
							staticMethod341(Client.staticString31, Client.staticString30 + " " + staticString14 + " "
									+ staticMethod118('\uffff') + var11.aString33, 2, var8, var26, var10);
						}
					} else {
						String[] var18 = var11.aStringArray8;
						if (Client.staticBool34) {
							var18 = staticMethod425(var18);
						}

						if (var18 != null) {
							for (int var19 = 4; var19 >= 0; --var19) {
								if (var18[var19] != null) {
									short var20 = 0;
									if (var19 == 0) {
										var20 = 3;
									}

									if (var19 == 1) {
										var20 = 4;
									}

									if (var19 == 2) {
										var20 = 5;
									}

									if (var19 == 3) {
										var20 = 6;
									}

									if (var19 == 4) {
										var20 = 1001;
									}

									staticMethod341(var18[var19], staticMethod118('\uffff') + var11.aString33, var20,
											var8, var26, var10);
								}
							}
						}

						staticMethod341("Examine", staticMethod118('\uffff') + var11.aString33, 1002,
								var11.anInt483 << 14, var26, var10);
					}
				}

				int var27;
				Player var24;
				int var251;
				Npc var261;
				int[] var281;
				if (var15 == 1) {
					Npc var25 = Client.staticNpcArray1[var16];
					if (var25 == null) {
						continue;
					}

					if (var25.aNpcDef1.anInt538 == 1 && (var25.anInt628 & 0x7f) == 64
							&& (var25.anInt591 & 0x7f) == 64) {
						for (var251 = 0; var251 < Client.staticInt186; var251++) {
							var261 = Client.staticNpcArray1[Client.staticIntArray121[var251]];
							if (var261 != null && var261 != var25 && var261.aNpcDef1.anInt538 == 1
									&& var25.anInt628 == var261.anInt628 && var25.anInt591 == var261.anInt591) {
								staticMethod229(var261.aNpcDef1, Client.staticIntArray121[var251], var26, var10);
							}
						}

						var251 = staticInt24;
						var281 = staticIntArray7;

						for (var27 = 0; var27 < var251; var27++) {
							var24 = Client.staticPlayerArray1[var281[var27]];
							if (var24 != null && var24.anInt628 == var25.anInt628 && var24.anInt591 == var25.anInt591) {
								staticMethod243(var24, var281[var27], var26, var10);
							}
						}
					}

					staticMethod229(var25.aNpcDef1, var16, var26, var10);
				}

				if (var15 == 0) {
					Player var271 = Client.staticPlayerArray1[var16];
					if (var271 == null) {
						continue;
					}

					if ((var271.anInt628 & 0x7f) == 64 && (var271.anInt591 & 0x7f) == 64) {
						for (var251 = 0; var251 < Client.staticInt186; var251++) {
							var261 = Client.staticNpcArray1[Client.staticIntArray121[var251]];
							if (var261 != null && var261.aNpcDef1.anInt538 == 1 && var261.anInt628 == var271.anInt628
									&& var271.anInt591 == var261.anInt591) {
								staticMethod229(var261.aNpcDef1, Client.staticIntArray121[var251], var26, var10);
							}
						}

						var251 = staticInt24;
						var281 = staticIntArray7;

						for (var27 = 0; var27 < var251; var27++) {
							var24 = Client.staticPlayerArray1[var281[var27]];
							if (var24 != null && var24 != var271 && var24.anInt628 == var271.anInt628
									&& var24.anInt591 == var271.anInt591) {
								staticMethod243(var24, var281[var27], var26, var10);
							}
						}
					}

					if (Client.staticInt229 != var16) {
						staticMethod243(var271, var16, var26, var10);
					} else {
						var12 = var8;
					}
				}

				if (var15 == 3) {
					Class39 var291 = Client.staticClass39ArrayArrayArray1[NodeSub4.staticInt155][var26][var10];
					if (var291 != null) {
						for (Item var22 = (Item) var291.method196(); var22 != null; var22 = (Item) var291.method197()) {
							ItemDefinition var23 = staticMethod153(var22.anInt573);
							if (Client.staticInt258 == 1) {
								staticMethod341("Use",
										Client.staticString32 + " " + staticString14 + " "
												+ staticMethod118(16748608) + var23.aString31,
										16, var22.anInt573, var26, var10);
							} else if (Client.staticBool32) {
								if ((Class57.staticInt144 & 0x1) == 1) {
									staticMethod341(Client.staticString31,
											Client.staticString30 + " " + staticString14 + " "
													+ staticMethod118(16748608) + var23.aString31,
											17, var22.anInt573, var26, var10);
								}
							} else {
								String[] var28 = var23.aStringArray7;
								if (Client.staticBool34) {
									var28 = staticMethod425(var28);
								}

								for (int var29 = 4; var29 >= 0; --var29) {
									if (var28 != null && var28[var29] != null) {
										byte var17 = 0;
										if (var29 == 0) {
											var17 = 18;
										}

										if (var29 == 1) {
											var17 = 19;
										}

										if (var29 == 2) {
											var17 = 20;
										}

										if (var29 == 3) {
											var17 = 21;
										}

										if (var29 == 4) {
											var17 = 22;
										}

										staticMethod341(var28[var29], staticMethod118(16748608) + var23.aString31,
												var17, var22.anInt573, var26, var10);
									} else if (var29 == 2) {
										staticMethod341("Take", staticMethod118(16748608) + var23.aString31, 20,
												var22.anInt573, var26, var10);
									}
								}

								staticMethod341("Examine", staticMethod118(16748608) + var23.aString31, 1004,
										var22.anInt573, var26, var10);
							}
						}
					}
				}
			}
		}

		if (var12 != -1) {
			var14 = var12 & 0x7f;
			var8 = var12 >> 7 & 0x7f;
			Player var231 = Client.staticPlayerArray1[Client.staticInt229];
			staticMethod243(var231, Client.staticInt229, var14, var8);
		}

	}

	static void staticMethod250() {
		for (KeyFocusListener var0 = (KeyFocusListener) Client.staticHashTable5
				.method146(); var0 != null; var0 = (KeyFocusListener) Client.staticHashTable5.method147()) {
			int var2 = var0.anInt384;
			if (staticMethod4(var2)) {
				boolean var1 = true;
				Widget[] var4 = Widget.staticWidgetArrayArray1[var2];

				int var3;
				for (var3 = 0; var3 < var4.length; var3++) {
					if (var4[var3] != null) {
						var1 = var4[var3].aBool42;
						break;
					}
				}

				if (!var1) {
					var3 = (int) var0.id;
					Widget var5 = staticMethod8(var3);
					if (var5 != null) {
						staticMethod73(var5);
					}
				}
			}
		}

	}

	public static void staticMethod39() {
		ItemDefinition.staticCache10.method171();
		ItemDefinition.staticCache11.method171();
		ItemDefinition.staticCache9.method171();
	}

	static final void staticMethod40(byte[] var0, int var1, int var2, int var3, int var4, Class38[] var5) {
		int var7;
		int var8;
		for (int var10 = 0; var10 < 4; var10++) {
			for (var8 = 0; var8 < 64; var8++) {
				for (var7 = 0; var7 < 64; var7++) {
					if (var8 + var1 > 0 && var1 + var8 < 103 && var2 + var7 > 0 && var7 + var2 < 103) {
						var5[var10].anIntArrayArray5[var1 + var8][var7 + var2] &= -16777217;
					}
				}
			}
		}

		ByteBuf var101 = new ByteBuf(var0);

		for (var8 = 0; var8 < 4; var8++) {
			for (var7 = 0; var7 < 64; var7++) {
				for (int var9 = 0; var9 < 64; var9++) {
					staticMethod194(var101, var8, var7 + var1, var2 + var9, var3, var4, 0);
				}
			}
		}

	}

	static int staticMethod41(int var0, CacheableSub1 var1, boolean var2) {
		Widget var3 = var2 ? Class3.staticWidget1 : staticWidget2;
		if (var0 == 1700) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt352;
			return 1;
		} else if (var0 == 1701) {
			if (var3.anInt352 != -1) {
				staticIntArray16[++staticInt27 - 1] = var3.anInt353;
			} else {
				staticIntArray16[++staticInt27 - 1] = 0;
			}

			return 1;
		} else if (var0 == 1702) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt319;
			return 1;
		} else {
			return 2;
		}
	}

	static final int staticMethod42(Widget var0, int var1) {
		if (var0.anIntArrayArray12 != null && var1 < var0.anIntArrayArray12.length) {
			try {
				int[] var13 = var0.anIntArrayArray12[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;

				while (true) {
					int var6 = var13[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0) {
						return var3;
					}

					if (var6 == 1) {
						var7 = Client.staticIntArray91[var13[var4++]];
					}

					if (var6 == 2) {
						var7 = Client.staticIntArray96[var13[var4++]];
					}

					if (var6 == 3) {
						var7 = Client.staticIntArray108[var13[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var13[var4++] << 16;
						var9 += var13[var4++];
						var10 = staticMethod8(var9);
						var11 = var13[var4++];
						if (var11 != -1 && (!staticMethod153(var11).aBool55 || Client.staticBool20)) {
							for (var12 = 0; var12 < var10.anIntArray76.length; var12++) {
								if (var11 + 1 == var10.anIntArray76[var12]) {
									var7 += var10.anIntArray77[var12];
								}
							}
						}
					}

					if (var6 == 5) {
						var7 = staticIntArray64[var13[var4++]];
					}

					if (var6 == 6) {
						var7 = staticIntArray60[Client.staticIntArray96[var13[var4++]] - 1];
					}

					if (var6 == 7) {
						var7 = staticIntArray64[var13[var4++]] * 100 / '\ub71b';
					}

					if (var6 == 8) {
						var7 = AbstractClass2Sub1.staticPlayer1.anInt685;
					}

					if (var6 == 9) {
						for (var9 = 0; var9 < 25; var9++) {
							if (staticBoolArray3[var9]) {
								var7 += Client.staticIntArray96[var9];
							}
						}
					}

					if (var6 == 10) {
						var9 = var13[var4++] << 16;
						var9 += var13[var4++];
						var10 = staticMethod8(var9);
						var11 = var13[var4++];
						if (var11 != -1 && (!staticMethod153(var11).aBool55 || Client.staticBool20)) {
							for (var12 = 0; var12 < var10.anIntArray76.length; var12++) {
								if (var10.anIntArray76[var12] == 1 + var11) {
									var7 = 999999999;
									break;
								}
							}
						}
					}

					if (var6 == 11) {
						var7 = Client.staticInt267;
					}

					if (var6 == 12) {
						var7 = Client.staticInt232;
					}

					if (var6 == 13) {
						var9 = staticIntArray64[var13[var4++]];
						int var14 = var13[var4++];
						var7 = (var9 & 1 << var14) != 0 ? 1 : 0;
					}

					if (var6 == 14) {
						var9 = var13[var4++];
						var7 = staticMethod82(var9);
					}

					if (var6 == 15) {
						var8 = 1;
					}

					if (var6 == 16) {
						var8 = 2;
					}

					if (var6 == 17) {
						var8 = 3;
					}

					if (var6 == 18) {
						var7 = NodeSub3.staticInt154 + (AbstractClass2Sub1.staticPlayer1.anInt628 >> 7);
					}

					if (var6 == 19) {
						var7 = (AbstractClass2Sub1.staticPlayer1.anInt591 >> 7) + Class34.staticInt75;
					}

					if (var6 == 20) {
						var7 = var13[var4++];
					}

					if (var8 == 0) {
						if (var5 == 0) {
							var3 += var7;
						}

						if (var5 == 1) {
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) {
							var3 /= var7;
						}

						if (var5 == 3) {
							var3 *= var7;
						}

						var5 = 0;
					} else {
						var5 = var8;
					}
				}
			} catch (Exception var141) {
				return -1;
			}
		} else {
			return -2;
		}
	}

	static int staticMethod43(int var0, CacheableSub1 var1, boolean var2) {
		int var3;
		if (var0 == 3903) {
			var3 = staticIntArray16[--staticInt27];
			staticIntArray16[++staticInt27 - 1] = Client.staticClass61Array1[var3].method286();
			return 1;
		} else if (var0 == 3904) {
			var3 = staticIntArray16[--staticInt27];
			staticIntArray16[++staticInt27 - 1] = Client.staticClass61Array1[var3].anInt212;
			return 1;
		} else if (var0 == 3905) {
			var3 = staticIntArray16[--staticInt27];
			staticIntArray16[++staticInt27 - 1] = Client.staticClass61Array1[var3].anInt213;
			return 1;
		} else if (var0 == 3906) {
			var3 = staticIntArray16[--staticInt27];
			staticIntArray16[++staticInt27 - 1] = Client.staticClass61Array1[var3].anInt214;
			return 1;
		} else if (var0 == 3907) {
			var3 = staticIntArray16[--staticInt27];
			staticIntArray16[++staticInt27 - 1] = Client.staticClass61Array1[var3].anInt215;
			return 1;
		} else if (var0 == 3908) {
			var3 = staticIntArray16[--staticInt27];
			staticIntArray16[++staticInt27 - 1] = Client.staticClass61Array1[var3].anInt216;
			return 1;
		} else {
			int var13;
			if (var0 == 3910) {
				var3 = staticIntArray16[--staticInt27];
				var13 = Client.staticClass61Array1[var3].method289();
				staticIntArray16[++staticInt27 - 1] = var13 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == 3911) {
				var3 = staticIntArray16[--staticInt27];
				var13 = Client.staticClass61Array1[var3].method289();
				staticIntArray16[++staticInt27 - 1] = var13 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == 3912) {
				var3 = staticIntArray16[--staticInt27];
				var13 = Client.staticClass61Array1[var3].method289();
				staticIntArray16[++staticInt27 - 1] = var13 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == 3913) {
				var3 = staticIntArray16[--staticInt27];
				var13 = Client.staticClass61Array1[var3].method289();
				staticIntArray16[++staticInt27 - 1] = var13 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var11;
				if (var0 == 3914) {
					var11 = staticIntArray16[--staticInt27] == 1;
					if (staticClass56_1 != null) {
						staticClass56_1.method282(Class56.staticComparator3, var11);
					}

					return 1;
				} else if (var0 == 3915) {
					var11 = staticIntArray16[--staticInt27] == 1;
					if (staticClass56_1 != null) {
						staticClass56_1.method282(Class56.staticComparator4, var11);
					}

					return 1;
				} else if (var0 == 3916) {
					staticInt27 -= 2;
					var11 = staticIntArray16[staticInt27] == 1;
					boolean var131 = staticIntArray16[1 + staticInt27] == 1;
					if (staticClass56_1 != null) {
						staticClass56_1.method282(new Class1(var131), var11);
					}

					return 1;
				} else if (var0 == 3917) {
					var11 = staticIntArray16[--staticInt27] == 1;
					if (staticClass56_1 != null) {
						staticClass56_1.method282(Class56.staticComparator1, var11);
					}

					return 1;
				} else if (var0 == 3918) {
					var11 = staticIntArray16[--staticInt27] == 1;
					if (staticClass56_1 != null) {
						staticClass56_1.method282(Class56.staticComparator2, var11);
					}

					return 1;
				} else if (var0 == 3919) {
					staticIntArray16[++staticInt27 - 1] = staticClass56_1 == null ? 0
							: staticClass56_1.aList1.size();
					return 1;
				} else {
					Class23 var4;
					if (var0 == 3920) {
						var3 = staticIntArray16[--staticInt27];
						var4 = (Class23) staticClass56_1.aList1.get(var3);
						staticIntArray16[++staticInt27 - 1] = var4.anInt66;
						return 1;
					} else if (var0 == 3921) {
						var3 = staticIntArray16[--staticInt27];
						var4 = (Class23) staticClass56_1.aList1.get(var3);
						staticStringArray1[++staticInt148 - 1] = var4.method89();
						return 1;
					} else if (var0 == 3922) {
						var3 = staticIntArray16[--staticInt27];
						var4 = (Class23) staticClass56_1.aList1.get(var3);
						staticStringArray1[++staticInt148 - 1] = var4.method90();
						return 1;
					} else if (var0 == 3923) {
						var3 = staticIntArray16[--staticInt27];
						var4 = (Class23) staticClass56_1.aList1.get(var3);
						long var5 = staticMethod297() - Class48.staticLong7 - var4.aLong14;
						int var7 = (int) (var5 / 3600000L);
						int var8 = (int) ((var5 - var7 * 3600000) / 60000L);
						int var9 = (int) ((var5 - var7 * 3600000 - var8 * '\uea60') / 1000L);
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
						staticStringArray1[++staticInt148 - 1] = var10;
						return 1;
					} else if (var0 == 3924) {
						var3 = staticIntArray16[--staticInt27];
						var4 = (Class23) staticClass56_1.aList1.get(var3);
						staticIntArray16[++staticInt27 - 1] = var4.aClass61_1.anInt214;
						return 1;
					} else if (var0 == 3925) {
						var3 = staticIntArray16[--staticInt27];
						var4 = (Class23) staticClass56_1.aList1.get(var3);
						staticIntArray16[++staticInt27 - 1] = var4.aClass61_1.anInt213;
						return 1;
					} else if (var0 == 3926) {
						var3 = staticIntArray16[--staticInt27];
						var4 = (Class23) staticClass56_1.aList1.get(var3);
						staticIntArray16[++staticInt27 - 1] = var4.aClass61_1.anInt212;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	static final void staticMethod44(BitBuf var0) {
		for (int var1 = 0; var1 < staticInt22; var1++) {
			int var3 = staticIntArray12[var1];
			Player var4 = Client.staticPlayerArray1[var3];
			int var2 = var0.method367();
			if ((var2 & 0x40) != 0) {
				var2 += var0.method367() << 8;
			}

			staticMethod155(var0, var3, var4, var2);
		}

	}

	static final void staticMethod45() {
		int var0 = TaskManager.staticInt40 * 128 + 64;
		int var1 = 64 + staticInt137 * 128;
		int var2 = staticMethod240(var0, var1, NodeSub4.staticInt155) - ObjectDefinition.staticInt322;
		if (Class20.staticInt36 < var0) {
			Class20.staticInt36 += staticInt17 + (var0 - Class20.staticInt36) * staticInt150 / 1000;
			if (Class20.staticInt36 > var0) {
				Class20.staticInt36 = var0;
			}
		}

		if (Class20.staticInt36 > var0) {
			Class20.staticInt36 -= staticInt150 * (Class20.staticInt36 - var0) / 1000 + staticInt17;
			if (Class20.staticInt36 < var0) {
				Class20.staticInt36 = var0;
			}
		}

		if (staticInt125 < var2) {
			staticInt125 += staticInt150 * (var2 - staticInt125) / 1000 + staticInt17;
			if (staticInt125 > var2) {
				staticInt125 = var2;
			}
		}

		if (staticInt125 > var2) {
			staticInt125 -= staticInt150 * (staticInt125 - var2) / 1000 + staticInt17;
			if (staticInt125 < var2) {
				staticInt125 = var2;
			}
		}

		if (NodeSub3.staticInt153 < var1) {
			NodeSub3.staticInt153 += (var1 - NodeSub3.staticInt153) * staticInt150 / 1000 + staticInt17;
			if (NodeSub3.staticInt153 > var1) {
				NodeSub3.staticInt153 = var1;
			}
		}

		if (NodeSub3.staticInt153 > var1) {
			NodeSub3.staticInt153 -= staticInt17 + staticInt150 * (NodeSub3.staticInt153 - var1) / 1000;
			if (NodeSub3.staticInt153 < var1) {
				NodeSub3.staticInt153 = var1;
			}
		}

		var0 = staticInt101 * 128 + 64;
		var1 = Class29.staticInt72 * 128 + 64;
		var2 = staticMethod240(var0, var1, NodeSub4.staticInt155) - Class7.staticInt31;
		int var8 = var0 - Class20.staticInt36;
		int var4 = var2 - staticInt125;
		int var9 = var1 - NodeSub3.staticInt153;
		int var5 = (int) Math.sqrt(var8 * var8 + var9 * var9);
		int var6 = (int) (Math.atan2(var4, var5) * 325.949D) & 0x7ff;
		int var10 = (int) (Math.atan2(var8, var9) * -325.949D) & 0x7ff;
		if (var6 < 128) {
			var6 = 128;
		}

		if (var6 > 383) {
			var6 = 383;
		}

		if (NodeSub19.staticInt318 < var6) {
			NodeSub19.staticInt318 += (var6 - NodeSub19.staticInt318) * Class61.staticInt146 / 1000
					+ Class28.staticInt71;
			if (NodeSub19.staticInt318 > var6) {
				NodeSub19.staticInt318 = var6;
			}
		}

		if (NodeSub19.staticInt318 > var6) {
			NodeSub19.staticInt318 -= Class28.staticInt71
					+ (NodeSub19.staticInt318 - var6) * Class61.staticInt146 / 1000;
			if (NodeSub19.staticInt318 < var6) {
				NodeSub19.staticInt318 = var6;
			}
		}

		int var3 = var10 - staticInt87;
		if (var3 > 1024) {
			var3 -= 2048;
		}

		if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 > 0) {
			staticInt87 += var3 * Class61.staticInt146 / 1000 + Class28.staticInt71;
			staticInt87 &= 2047;
		}

		if (var3 < 0) {
			staticInt87 -= -var3 * Class61.staticInt146 / 1000 + Class28.staticInt71;
			staticInt87 &= 2047;
		}

		int var7 = var10 - staticInt87;
		if (var7 > 1024) {
			var7 -= 2048;
		}

		if (var7 < -1024) {
			var7 += 2048;
		}

		if (var7 < 0 && var3 > 0 || var7 > 0 && var3 < 0) {
			staticInt87 = var10;
		}

	}

	static final void staticMethod46(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6,
			Class38 var7) {
		if (!Client.lowMemory || (staticByteArrayArrayArray4[0][var1][var2] & 0x2) != 0
				|| (staticByteArrayArrayArray4[var0][var1][var2] & 0x10) == 0) {
			if (var0 < staticInt112) {
				staticInt112 = var0;
			}

			ObjectDefinition var8 = staticMethod394(var3);
			int var15;
			int var16;
			if (var4 != 1 && var4 != 3) {
				var15 = var8.anInt485;
				var16 = var8.anInt486;
			} else {
				var15 = var8.anInt486;
				var16 = var8.anInt485;
			}

			int var19;
			int var20;
			if (var15 + var1 <= 104) {
				var19 = var1 + (var15 >> 1);
				var20 = var1 + (1 + var15 >> 1);
			} else {
				var19 = var1;
				var20 = var1 + 1;
			}

			int var21;
			int var22;
			if (var2 + var16 <= 104) {
				var22 = var2 + (var16 >> 1);
				var21 = var2 + (1 + var16 >> 1);
			} else {
				var22 = var2;
				var21 = 1 + var2;
			}

			int[][] var9 = staticIntArrayArrayArray1[var0];
			int var11 = var9[var20][var22] + var9[var19][var22] + var9[var19][var21] + var9[var20][var21] >> 2;
			int var10 = (var15 << 6) + (var1 << 7);
			int var12 = (var2 << 7) + (var16 << 6);
			int var17 = var1 + (var2 << 7) + (var3 << 14) + 1073741824;
			if (var8.anInt489 == 0) {
				var17 += Integer.MIN_VALUE;
			}

			int var18 = var5 + (var4 << 6);
			if (var8.anInt493 * 582900199 == 1) {
				var18 += 256;
			}

			if (var8.method517()) {
				staticMethod246(var0, var1, var2, var8, var4);
			}

			Object var13;
			if (var5 == 22) {
				if (!Client.lowMemory || var8.anInt489 != 0 || var8.anInt487 == 1 || var8.aBool63) {
					if (var8.anInt491 == -1 && var8.anIntArray111 == null) {
						var13 = var8.method514(22, var4, var9, var10, var11, var12);
					} else {
						var13 = new GameObject(var3, 22, var4, var0, var1, var2, var8.anInt491, true,
								(Renderable) null);
					}

					var6.method140(var0, var1, var2, var11, (Renderable) var13, var17, var18);
					if (var8.anInt487 == 1 && var7 != null) {
						var7.method185(var1, var2);
					}
				}
			} else {
				int var23;
				int var14;
				if (var5 != 10 && var5 != 11) {
					if (var5 >= 12) {
						if (var8.anInt491 == -1 && var8.anIntArray111 == null) {
							var13 = var8.method514(var5, var4, var9, var10, var11, var12);
						} else {
							var13 = new GameObject(var3, var5, var4, var0, var1, var2, var8.anInt491, true,
									(Renderable) null);
						}

						var6.method131(var0, var1, var2, var11, 1, 1, (Renderable) var13, 0, var17, var18);
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
							NodeSub1.staticIntArrayArrayArray2[var0][var1][var2] |= 2340;
						}

						if (var8.anInt487 != 0 && var7 != null) {
							var7.method177(var1, var2, var15, var16, var8.aBool60);
						}
					} else if (var5 == 0) {
						if (var8.anInt491 == -1 && var8.anIntArray111 == null) {
							var13 = var8.method514(0, var4, var9, var10, var11, var12);
						} else {
							var13 = new GameObject(var3, 0, var4, var0, var1, var2, var8.anInt491, true,
									(Renderable) null);
						}

						var6.method101(var0, var1, var2, var11, (Renderable) var13, (Renderable) null,
								staticIntArray58[var4], 0, var17, var18);
						if (var4 == 0) {
							if (var8.aBool62) {
								staticByteArrayArrayArray2[var0][var1][var2] = 50;
								staticByteArrayArrayArray2[var0][var1][var2 + 1] = 50;
							}

							if (var8.aBool59) {
								NodeSub1.staticIntArrayArrayArray2[var0][var1][var2] |= 585;
							}
						} else if (var4 == 1) {
							if (var8.aBool62) {
								staticByteArrayArrayArray2[var0][var1][var2 + 1] = 50;
								staticByteArrayArrayArray2[var0][var1 + 1][1 + var2] = 50;
							}

							if (var8.aBool59) {
								NodeSub1.staticIntArrayArrayArray2[var0][var1][1 + var2] |= 1170;
							}
						} else if (var4 == 2) {
							if (var8.aBool62) {
								staticByteArrayArrayArray2[var0][1 + var1][var2] = 50;
								staticByteArrayArrayArray2[var0][var1 + 1][1 + var2] = 50;
							}

							if (var8.aBool59) {
								NodeSub1.staticIntArrayArrayArray2[var0][var1 + 1][var2] |= 585;
							}
						} else if (var4 == 3) {
							if (var8.aBool62) {
								staticByteArrayArrayArray2[var0][var1][var2] = 50;
								staticByteArrayArrayArray2[var0][var1 + 1][var2] = 50;
							}

							if (var8.aBool59) {
								NodeSub1.staticIntArrayArrayArray2[var0][var1][var2] |= 1170;
							}
						}

						if (var8.anInt487 != 0 && var7 != null) {
							var7.method176(var1, var2, var5, var4, var8.aBool60);
						}

						if (var8.anInt492 != 16) {
							var6.method135(var0, var1, var2, var8.anInt492);
						}
					} else if (var5 == 1) {
						if (var8.anInt491 == -1 && var8.anIntArray111 == null) {
							var13 = var8.method514(1, var4, var9, var10, var11, var12);
						} else {
							var13 = new GameObject(var3, 1, var4, var0, var1, var2, var8.anInt491, true,
									(Renderable) null);
						}

						var6.method101(var0, var1, var2, var11, (Renderable) var13, (Renderable) null,
								staticIntArray53[var4], 0, var17, var18);
						if (var8.aBool62) {
							if (var4 == 0) {
								staticByteArrayArrayArray2[var0][var1][1 + var2] = 50;
							} else if (var4 == 1) {
								staticByteArrayArrayArray2[var0][1 + var1][1 + var2] = 50;
							} else if (var4 == 2) {
								staticByteArrayArrayArray2[var0][1 + var1][var2] = 50;
							} else if (var4 == 3) {
								staticByteArrayArrayArray2[var0][var1][var2] = 50;
							}
						}

						if (var8.anInt487 != 0 && var7 != null) {
							var7.method176(var1, var2, var5, var4, var8.aBool60);
						}
					} else {
						Object var27;
						if (var5 == 2) {
							var14 = 1 + var4 & 0x3;
							Object var25;
							if (var8.anInt491 == -1 && var8.anIntArray111 == null) {
								var25 = var8.method514(2, var4 + 4, var9, var10, var11, var12);
								var27 = var8.method514(2, var14, var9, var10, var11, var12);
							} else {
								var25 = new GameObject(var3, 2, 4 + var4, var0, var1, var2, var8.anInt491, true,
										(Renderable) null);
								var27 = new GameObject(var3, 2, var14, var0, var1, var2, var8.anInt491, true,
										(Renderable) null);
							}

							var6.method101(var0, var1, var2, var11, (Renderable) var25, (Renderable) var27,
									staticIntArray58[var4], staticIntArray58[var14], var17, var18);
							if (var8.aBool59) {
								if (var4 == 0) {
									NodeSub1.staticIntArrayArrayArray2[var0][var1][var2] |= 585;
									NodeSub1.staticIntArrayArrayArray2[var0][var1][1 + var2] |= 1170;
								} else if (var4 == 1) {
									NodeSub1.staticIntArrayArrayArray2[var0][var1][1 + var2] |= 1170;
									NodeSub1.staticIntArrayArrayArray2[var0][1 + var1][var2] |= 585;
								} else if (var4 == 2) {
									NodeSub1.staticIntArrayArrayArray2[var0][var1 + 1][var2] |= 585;
									NodeSub1.staticIntArrayArrayArray2[var0][var1][var2] |= 1170;
								} else if (var4 == 3) {
									NodeSub1.staticIntArrayArrayArray2[var0][var1][var2] |= 1170;
									NodeSub1.staticIntArrayArrayArray2[var0][var1][var2] |= 585;
								}
							}

							if (var8.anInt487 != 0 && var7 != null) {
								var7.method176(var1, var2, var5, var4, var8.aBool60);
							}

							if (var8.anInt492 != 16) {
								var6.method135(var0, var1, var2, var8.anInt492);
							}
						} else if (var5 == 3) {
							if (var8.anInt491 == -1 && var8.anIntArray111 == null) {
								var13 = var8.method514(3, var4, var9, var10, var11, var12);
							} else {
								var13 = new GameObject(var3, 3, var4, var0, var1, var2, var8.anInt491, true,
										(Renderable) null);
							}

							var6.method101(var0, var1, var2, var11, (Renderable) var13, (Renderable) null,
									staticIntArray53[var4], 0, var17, var18);
							if (var8.aBool62) {
								if (var4 == 0) {
									staticByteArrayArrayArray2[var0][var1][1 + var2] = 50;
								} else if (var4 == 1) {
									staticByteArrayArrayArray2[var0][1 + var1][1 + var2] = 50;
								} else if (var4 == 2) {
									staticByteArrayArrayArray2[var0][1 + var1][var2] = 50;
								} else if (var4 == 3) {
									staticByteArrayArrayArray2[var0][var1][var2] = 50;
								}
							}

							if (var8.anInt487 != 0 && var7 != null) {
								var7.method176(var1, var2, var5, var4, var8.aBool60);
							}
						} else if (var5 == 9) {
							if (var8.anInt491 == -1 && var8.anIntArray111 == null) {
								var13 = var8.method514(var5, var4, var9, var10, var11, var12);
							} else {
								var13 = new GameObject(var3, var5, var4, var0, var1, var2, var8.anInt491, true,
										(Renderable) null);
							}

							var6.method131(var0, var1, var2, var11, 1, 1, (Renderable) var13, 0, var17, var18);
							if (var8.anInt487 != 0 && var7 != null) {
								var7.method177(var1, var2, var15, var16, var8.aBool60);
							}

							if (var8.anInt492 != 16) {
								var6.method135(var0, var1, var2, var8.anInt492);
							}
						} else if (var5 == 4) {
							if (var8.anInt491 == -1 && var8.anIntArray111 == null) {
								var13 = var8.method514(4, var4, var9, var10, var11, var12);
							} else {
								var13 = new GameObject(var3, 4, var4, var0, var1, var2, var8.anInt491, true,
										(Renderable) null);
							}

							var6.method132(var0, var1, var2, var11, (Renderable) var13, (Renderable) null,
									staticIntArray58[var4], 0, 0, 0, var17, var18);
						} else if (var5 == 5) {
							var14 = 16;
							var23 = var6.method142(var0, var1, var2);
							if (var23 != 0) {
								var14 = staticMethod394(var23 >> 14 & 0x7fff).anInt492;
							}

							if (var8.anInt491 == -1 && var8.anIntArray111 == null) {
								var27 = var8.method514(4, var4, var9, var10, var11, var12);
							} else {
								var27 = new GameObject(var3, 4, var4, var0, var1, var2, var8.anInt491, true,
										(Renderable) null);
							}

							var6.method132(var0, var1, var2, var11, (Renderable) var27, (Renderable) null,
									staticIntArray58[var4], 0, staticIntArray54[var4] * var14,
									staticIntArray57[var4] * var14, var17, var18);
						} else if (var5 == 6) {
							var14 = 8;
							var23 = var6.method142(var0, var1, var2);
							if (var23 != 0) {
								var14 = staticMethod394(var23 >> 14 & 0x7fff).anInt492 / 2;
							}

							if (var8.anInt491 == -1 && var8.anIntArray111 == null) {
								var27 = var8.method514(4, 4 + var4, var9, var10, var11, var12);
							} else {
								var27 = new GameObject(var3, 4, var4 + 4, var0, var1, var2, var8.anInt491, true,
										(Renderable) null);
							}

							var6.method132(var0, var1, var2, var11, (Renderable) var27, (Renderable) null, 256, var4,
									staticIntArray56[var4] * var14, var14 * staticIntArray52[var4], var17,
									var18);
						} else if (var5 == 7) {
							var23 = var4 + 2 & 0x3;
							if (var8.anInt491 == -1 && var8.anIntArray111 == null) {
								var13 = var8.method514(4, var23 + 4, var9, var10, var11, var12);
							} else {
								var13 = new GameObject(var3, 4, var23 + 4, var0, var1, var2, var8.anInt491, true,
										(Renderable) null);
							}

							var6.method132(var0, var1, var2, var11, (Renderable) var13, (Renderable) null, 256, var23,
									0, 0, var17, var18);
						} else if (var5 == 8) {
							var14 = 8;
							var23 = var6.method142(var0, var1, var2);
							if (var23 != 0) {
								var14 = staticMethod394(var23 >> 14 & 0x7fff).anInt492 / 2;
							}

							int var281 = var4 + 2 & 0x3;
							Object var28;
							if (var8.anInt491 == -1 && var8.anIntArray111 == null) {
								var27 = var8.method514(4, var4 + 4, var9, var10, var11, var12);
								var28 = var8.method514(4, var281 + 4, var9, var10, var11, var12);
							} else {
								var27 = new GameObject(var3, 4, var4 + 4, var0, var1, var2, var8.anInt491, true,
										(Renderable) null);
								var28 = new GameObject(var3, 4, 4 + var281, var0, var1, var2, var8.anInt491, true,
										(Renderable) null);
							}

							var6.method132(var0, var1, var2, var11, (Renderable) var27, (Renderable) var28, 256, var4,
									staticIntArray56[var4] * var14, var14 * staticIntArray52[var4], var17,
									var18);
						}
					}
				} else {
					if (var8.anInt491 == -1 && var8.anIntArray111 == null) {
						var13 = var8.method514(10, var4, var9, var10, var11, var12);
					} else {
						var13 = new GameObject(var3, 10, var4, var0, var1, var2, var8.anInt491, true,
								(Renderable) null);
					}

					if (var13 != null && var6.method131(var0, var1, var2, var11, var15, var16, (Renderable) var13,
							var5 == 11 ? 256 : 0, var17, var18) && var8.aBool62) {
						var23 = 15;
						if (var13 instanceof Model) {
							var23 = ((Model) var13).method594() / 4;
							if (var23 > 30) {
								var23 = 30;
							}
						}

						for (var14 = 0; var14 <= var15; var14++) {
							for (int var24 = 0; var24 <= var16; var24++) {
								if (var23 > staticByteArrayArrayArray2[var0][var14 + var1][var2 + var24]) {
									staticByteArrayArrayArray2[var0][var1 + var14][var2 + var24] = (byte) var23;
								}
							}
						}
					}

					if (var8.anInt487 != 0 && var7 != null) {
						var7.method177(var1, var2, var15, var16, var8.aBool60);
					}
				}
			}
		}

	}

	static final int staticMethod47(int var0, int var1, int var2) {
		int var3 = 256 - var2;
		return ((var0 & 0xff00) * var3 + var2 * (var1 & 0xff00) & 0xff0000)
				+ (var3 * (var0 & 0xff00ff) + var2 * (var1 & 0xff00ff) & 0xff00ff00) >> 8;
	}

	public static void staticMethod102(Applet var0, String var1) throws Throwable {
		JSObject.getWindow(var0).eval(var1);
	}

	public static Varp staticMethod119(int var0) {
		Varp var1 = (Varp) Varp.staticCache25.get(var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = Varp.staticJs5Index27.getFile(16, var0);
			var1 = new Varp();
			if (var2 != null) {
				var1.method534(new ByteBuf(var2));
			}

			Varp.staticCache25.method170(var1, var0);
			return var1;
		}
	}

	static final void staticMethod120() {
		Client.outBuffer.method471(66);

		for (KeyFocusListener var0 = (KeyFocusListener) Client.staticHashTable5
				.method146(); var0 != null; var0 = (KeyFocusListener) Client.staticHashTable5.method147()) {
			if (var0.anInt383 == 0 || var0.anInt383 == 3) {
				staticMethod266(var0, true);
			}
		}

		if (Client.staticWidget6 != null) {
			staticMethod73(Client.staticWidget6);
			Client.staticWidget6 = null;
		}

	}

	static boolean staticMethod121() {
		try {
			if (Class2.staticClass3_1 == null) {
				Class2.staticClass3_1 = new Class3(BufferedFile.staticTaskManager1, new URL(Class34.staticString23));
			} else {
				byte[] var4 = Class2.staticClass3_1.method11();
				if (var4 != null) {
					ByteBuf var1 = new ByteBuf(var4);
					Class2.staticInt2 = var1.method370();
					Class2.staticClass2Array1 = new Class2[Class2.staticInt2];

					Class2 var3;
					for (int var2 = 0; var2 < Class2.staticInt2; var3.anInt2 = var2++) {
						var3 = Class2.staticClass2Array1[var2] = new Class2();
						var3.anInt4 = var1.method370();
						var3.anInt3 = var1.readInt();
						var3.aString1 = var1.readString();
						var3.aString2 = var1.readString();
						var3.anInt6 = var1.method367();
						var3.anInt5 = var1.method364();
					}

					staticMethod129(Class2.staticClass2Array1, 0, Class2.staticClass2Array1.length - 1,
							Class2.staticIntArray1, Class2.staticIntArray2);
					Class2.staticClass3_1 = null;
					return true;
				}
			}
		} catch (Exception var41) {
			var41.printStackTrace();
			Class2.staticClass3_1 = null;
		}

		return false;
	}

	protected static final void staticMethod74() {
		staticAbstractClass3_1.method214();

		int var0;
		for (var0 = 0; var0 < 32; var0++) {
			GameShell.staticLongArray1[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; var0++) {
			GameShell.staticLongArray2[var0] = 0L;
		}

		Class16.staticInt33 = 0;
	}

	public static int staticMethod101(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) {
			var2 = var2 << 1 | var0 & 0x1;
			var0 >>>= 1;
		}

		return var2;
	}

	public static void staticMethod334() {
		AnimDef.staticCache32.method171();
		AnimDef.staticCache31.method171();
	}

	static void staticMethod335() {
		synchronized (Client.staticGame1) {
			Container var11 = Client.staticGame1.method207();
			if (var11 != null) {
				Class40Sub1.staticInt317 = Math.max(var11.getSize().width, staticInt123 * 179870289);
				BuildType.staticInt124 = Math.max(var11.getSize().height, KeyboardHandler.staticInt83 * 1562169393);
				Insets var2;
				if (Class40Sub1.staticFrame1 == var11) {
					var2 = Class40Sub1.staticFrame1.getInsets();
					Class40Sub1.staticInt317 -= var2.right + var2.left;
					BuildType.staticInt124 -= var2.top + var2.bottom;
				}

				if (Class40Sub1.staticInt317 <= 0) {
					Class40Sub1.staticInt317 = 1;
				}

				if (BuildType.staticInt124 <= 0) {
					BuildType.staticInt124 = 1;
				}

				if (staticMethod248() == 1) {
					gameWidth = Client.staticInt288;
					Class47.gameHeight = Client.staticInt173 * 503;
				} else {
					gameWidth = Math.min(Class40Sub1.staticInt317, 7680);
					Class47.gameHeight = Math.min(BuildType.staticInt124, 2160);
				}

				GameShell.staticInt106 = (Class40Sub1.staticInt317 - gameWidth) / 2;
				GameShell.staticInt109 = 0;
				Class38.staticCanvas1.setSize(gameWidth, Class47.gameHeight);
				CacheableSub2.staticGraphicsBuffer1 = staticMethod390(gameWidth, Class47.gameHeight,
						Class38.staticCanvas1);
				if (Class40Sub1.staticFrame1 == var11) {
					var2 = Class40Sub1.staticFrame1.getInsets();
					Class38.staticCanvas1.setLocation(var2.left + GameShell.staticInt106,
							GameShell.staticInt109 + var2.top);
				} else {
					Class38.staticCanvas1.setLocation(GameShell.staticInt106, GameShell.staticInt109);
				}

				staticMethod395();
				if (Client.staticInt263 != -1) {
					staticMethod93(true);
				}

				staticMethod53();
			}

		}
	}

	static void staticMethod336(ByteBuf var0, int var1) {
		staticMethod267(var0.buf, var1);
		if (randomDat != null) {
			try {
				randomDat.seek(0L);
				randomDat.method55(var0.buf, var1, 24);
			} catch (Exception var3) {
				;
			}
		}

	}

	static final void staticMethod337(String var0, boolean var1) {
		byte var2 = 4;
		int var3 = 6 + var2;
		int var4 = var2 + 6;
		int var5 = Class59.staticRasterizer2DSub2Sub1_2.method628(var0, 250);
		int var6 = Class59.staticRasterizer2DSub2Sub1_2.method615(var0, 250) * 13;
		staticMethod418(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 0);
		staticMethod411(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 16777215);
		Class59.staticRasterizer2DSub2Sub1_2.method624(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
		staticMethod327(var3 - var2, var4 - var2, var2 + var5 + var2, var6 + var2 + var2);
		if (var1) {
			try {
				Graphics var13 = Class38.staticCanvas1.getGraphics();
				CacheableSub2.staticGraphicsBuffer1.method279(var13, 0, 0);
			} catch (Exception var12) {
				Class38.staticCanvas1.repaint();
			}
		} else {
			int var131 = var3;
			int var8 = var4;
			int var9 = var5;
			int var10 = var6;

			for (int var11 = 0; var11 < Client.staticInt162; var11++) {
				if (Client.staticIntArray82[var11] + Client.staticIntArray107[var11] > var131
						&& Client.staticIntArray82[var11] < var9 + var131
						&& Client.staticIntArray88[var11] + Client.staticIntArray106[var11] > var8
						&& Client.staticIntArray88[var11] < var10 + var8) {
					Client.staticBoolArray6[var11] = true;
				}
			}
		}

	}

	public static FloorUnderlayDef staticMethod338(int var0) {
		FloorUnderlayDef var1 = (FloorUnderlayDef) FloorUnderlayDef.staticCache20.get(var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDef.staticJs5Index22.getFile(1, var0);
			var1 = new FloorUnderlayDef();
			if (var2 != null) {
				var1.method523(new ByteBuf(var2), var0);
			}

			var1.method522();
			FloorUnderlayDef.staticCache20.method170(var1, var0);
			return var1;
		}
	}

	static int staticMethod339(int var0, CacheableSub1 var1, boolean var2) {
		Widget var3 = var2 ? Class3.staticWidget1 : staticWidget2;
		if (var0 == 1500) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt341;
			return 1;
		} else if (var0 == 1501) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt306;
			return 1;
		} else if (var0 == 1502) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt307;
			return 1;
		} else if (var0 == 1503) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt351;
			return 1;
		} else if (var0 == 1504) {
			staticIntArray16[++staticInt27 - 1] = var3.aBool32 ? 1 : 0;
			return 1;
		} else if (var0 == 1505) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt342;
			return 1;
		} else {
			return 2;
		}
	}

	public static byte[] staticMethod340(CharSequence var0) {
		int var1 = var0.length();
		byte[] var2 = new byte[var1];

		for (int var4 = 0; var4 < var1; var4++) {
			char var3 = var0.charAt(var4);
			if ((var3 <= 0 || var3 >= 128) && (var3 < 160 || var3 > 255)) {
				if (var3 == 8364) {
					var2[var4] = -128;
				} else if (var3 == 8218) {
					var2[var4] = -126;
				} else if (var3 == 402) {
					var2[var4] = -125;
				} else if (var3 == 8222) {
					var2[var4] = -124;
				} else if (var3 == 8230) {
					var2[var4] = -123;
				} else if (var3 == 8224) {
					var2[var4] = -122;
				} else if (var3 == 8225) {
					var2[var4] = -121;
				} else if (var3 == 710) {
					var2[var4] = -120;
				} else if (var3 == 8240) {
					var2[var4] = -119;
				} else if (var3 == 352) {
					var2[var4] = -118;
				} else if (var3 == 8249) {
					var2[var4] = -117;
				} else if (var3 == 338) {
					var2[var4] = -116;
				} else if (var3 == 381) {
					var2[var4] = -114;
				} else if (var3 == 8216) {
					var2[var4] = -111;
				} else if (var3 == 8217) {
					var2[var4] = -110;
				} else if (var3 == 8220) {
					var2[var4] = -109;
				} else if (var3 == 8221) {
					var2[var4] = -108;
				} else if (var3 == 8226) {
					var2[var4] = -107;
				} else if (var3 == 8211) {
					var2[var4] = -106;
				} else if (var3 == 8212) {
					var2[var4] = -105;
				} else if (var3 == 732) {
					var2[var4] = -104;
				} else if (var3 == 8482) {
					var2[var4] = -103;
				} else if (var3 == 353) {
					var2[var4] = -102;
				} else if (var3 == 8250) {
					var2[var4] = -101;
				} else if (var3 == 339) {
					var2[var4] = -100;
				} else if (var3 == 382) {
					var2[var4] = -98;
				} else if (var3 == 376) {
					var2[var4] = -97;
				} else {
					var2[var4] = 63;
				}
			} else {
				var2[var4] = (byte) var3;
			}
		}

		return var2;
	}

	static final void staticMethod341(String var0, String var1, int var2, int var3, int var4, int var5) {
		staticMethod235(var0, var1, var2, var3, var4, var5, false);
	}

	public static Sprite staticMethod296(Js5Index var0, int var1, int var2) {
		return !staticMethod65(var0, var1, var2) ? null : staticMethod429();
	}

	public static synchronized long staticMethod297() {
		long var0 = System.currentTimeMillis();
		if (var0 < staticLong5) {
			staticLong6 += staticLong5 - var0;
		}

		staticLong5 = var0;
		return var0 + staticLong6;
	}

	static void staticMethod298() {
		synchronized (FileRequestTask.staticObject1) {
			if (FileRequestTask.staticInt128 == 0) {
				BufferedFile.staticTaskManager1.method94(new FileRequestTask(), 5);
			}

			FileRequestTask.staticInt128 = 600;
		}
	}

	public static void staticMethod299(Js5Index var0) {
		Varbit.staticJs5Index11 = var0;
	}

	static int staticMethod328(int var0, CacheableSub1 var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == 4000) {
			staticInt27 -= 2;
			var3 = staticIntArray16[staticInt27];
			var4 = staticIntArray16[staticInt27 + 1];
			staticIntArray16[++staticInt27 - 1] = var3 + var4;
			return 1;
		} else if (var0 == 4001) {
			staticInt27 -= 2;
			var3 = staticIntArray16[staticInt27];
			var4 = staticIntArray16[1 + staticInt27];
			staticIntArray16[++staticInt27 - 1] = var3 - var4;
			return 1;
		} else if (var0 == 4002) {
			staticInt27 -= 2;
			var3 = staticIntArray16[staticInt27];
			var4 = staticIntArray16[staticInt27 + 1];
			staticIntArray16[++staticInt27 - 1] = var4 * var3;
			return 1;
		} else if (var0 == 4003) {
			staticInt27 -= 2;
			var3 = staticIntArray16[staticInt27];
			var4 = staticIntArray16[1 + staticInt27];
			staticIntArray16[++staticInt27 - 1] = var3 / var4;
			return 1;
		} else if (var0 == 4004) {
			var3 = staticIntArray16[--staticInt27];
			staticIntArray16[++staticInt27 - 1] = (int) (Math.random() * var3);
			return 1;
		} else if (var0 == 4005) {
			var3 = staticIntArray16[--staticInt27];
			staticIntArray16[++staticInt27 - 1] = (int) (Math.random() * (1 + var3));
			return 1;
		} else if (var0 == 4006) {
			staticInt27 -= 5;
			var3 = staticIntArray16[staticInt27];
			var4 = staticIntArray16[staticInt27 + 1];
			int var11 = staticIntArray16[2 + staticInt27];
			int var6 = staticIntArray16[3 + staticInt27];
			int var121 = staticIntArray16[staticInt27 + 4];
			staticIntArray16[++staticInt27 - 1] = var3
					+ (var121 - var11) * (var4 - var3) / (var6 - var11);
			return 1;
		} else if (var0 == 4007) {
			staticInt27 -= 2;
			var3 = staticIntArray16[staticInt27];
			var4 = staticIntArray16[1 + staticInt27];
			staticIntArray16[++staticInt27 - 1] = var4 * var3 / 100 + var3;
			return 1;
		} else if (var0 == 4008) {
			staticInt27 -= 2;
			var3 = staticIntArray16[staticInt27];
			var4 = staticIntArray16[staticInt27 + 1];
			staticIntArray16[++staticInt27 - 1] = var3 | 1 << var4;
			return 1;
		} else if (var0 == 4009) {
			staticInt27 -= 2;
			var3 = staticIntArray16[staticInt27];
			var4 = staticIntArray16[staticInt27 + 1];
			staticIntArray16[++staticInt27 - 1] = var3 & -1 - (1 << var4);
			return 1;
		} else if (var0 == 4010) {
			staticInt27 -= 2;
			var3 = staticIntArray16[staticInt27];
			var4 = staticIntArray16[1 + staticInt27];
			staticIntArray16[++staticInt27 - 1] = (var3 & 1 << var4) != 0 ? 1 : 0;
			return 1;
		} else if (var0 == 4011) {
			staticInt27 -= 2;
			var3 = staticIntArray16[staticInt27];
			var4 = staticIntArray16[1 + staticInt27];
			staticIntArray16[++staticInt27 - 1] = var3 % var4;
			return 1;
		} else if (var0 == 4012) {
			staticInt27 -= 2;
			var3 = staticIntArray16[staticInt27];
			var4 = staticIntArray16[1 + staticInt27];
			if (var3 == 0) {
				staticIntArray16[++staticInt27 - 1] = 0;
			} else {
				staticIntArray16[++staticInt27 - 1] = (int) Math.pow(var3, var4);
			}

			return 1;
		} else if (var0 == 4013) {
			staticInt27 -= 2;
			var3 = staticIntArray16[staticInt27];
			var4 = staticIntArray16[staticInt27 + 1];
			if (var3 == 0) {
				staticIntArray16[++staticInt27 - 1] = 0;
			} else if (var4 == 0) {
				staticIntArray16[++staticInt27 - 1] = Integer.MAX_VALUE;
			} else {
				staticIntArray16[++staticInt27 - 1] = (int) Math.pow(var3, 1.0D / var4);
			}

			return 1;
		} else if (var0 == 4014) {
			staticInt27 -= 2;
			var3 = staticIntArray16[staticInt27];
			var4 = staticIntArray16[1 + staticInt27];
			staticIntArray16[++staticInt27 - 1] = var3 & var4;
			return 1;
		} else if (var0 == 4015) {
			staticInt27 -= 2;
			var3 = staticIntArray16[staticInt27];
			var4 = staticIntArray16[1 + staticInt27];
			staticIntArray16[++staticInt27 - 1] = var3 | var4;
			return 1;
		} else if (var0 == 4018) {
			staticInt27 -= 3;
			long var12 = staticIntArray16[staticInt27];
			long var8 = staticIntArray16[staticInt27 + 1];
			long var10 = staticIntArray16[2 + staticInt27];
			staticIntArray16[++staticInt27 - 1] = (int) (var10 * var12 / var8);
			return 1;
		} else {
			return 2;
		}
	}

	static final void staticMethod329() {
		if (Client.staticInt196 > 0) {
			staticMethod87();
		} else {
			staticMethod396(40);
			staticConnection1 = Class56.gameConnection;
			Class56.gameConnection = null;
		}

	}

	static final boolean staticMethod330(int var0, int var1, AbstractClass2 var2, Class38 var3) {
		int var4 = var0;
		int var8 = var1;
		byte var5 = 64;
		byte var6 = 64;
		int var13 = var0 - var5;
		int var11 = var1 - var6;
		staticIntArrayArray6[var5][var6] = 99;
		staticIntArrayArray5[var5][var6] = 0;
		byte var9 = 0;
		int var7 = 0;
		staticIntArray49[var9] = var0;
		int var18 = var9 + 1;
		staticIntArray50[var9] = var1;
		int[][] var12 = var3.anIntArrayArray5;

		while (var18 != var7) {
			var4 = staticIntArray49[var7];
			var8 = staticIntArray50[var7];
			var7 = 1 + var7 & 0xfff;
			int var16 = var4 - var13;
			int var17 = var8 - var11;
			int var14 = var4 - var3.anInt156;
			int var15 = var8 - var3.anInt157;
			if (var2.method172(1, var4, var8, var3)) {
				staticInt110 = var4;
				Js5CacheWriteRequest.staticInt315 = var8;
				return true;
			}

			int var10 = 1 + staticIntArrayArray5[var16][var17];
			if (var16 > 0 && staticIntArrayArray6[var16 - 1][var17] == 0
					&& (var12[var14 - 1][var15] & 0x1240108) == 0) {
				staticIntArray49[var18] = var4 - 1;
				staticIntArray50[var18] = var8;
				var18 = var18 + 1 & 0xfff;
				staticIntArrayArray6[var16 - 1][var17] = 2;
				staticIntArrayArray5[var16 - 1][var17] = var10;
			}

			if (var16 < 127 && staticIntArrayArray6[1 + var16][var17] == 0
					&& (var12[var14 + 1][var15] & 0x1240180) == 0) {
				staticIntArray49[var18] = var4 + 1;
				staticIntArray50[var18] = var8;
				var18 = 1 + var18 & 0xfff;
				staticIntArrayArray6[1 + var16][var17] = 8;
				staticIntArrayArray5[var16 + 1][var17] = var10;
			}

			if (var17 > 0 && staticIntArrayArray6[var16][var17 - 1] == 0
					&& (var12[var14][var15 - 1] & 0x1240102) == 0) {
				staticIntArray49[var18] = var4;
				staticIntArray50[var18] = var8 - 1;
				var18 = 1 + var18 & 0xfff;
				staticIntArrayArray6[var16][var17 - 1] = 1;
				staticIntArrayArray5[var16][var17 - 1] = var10;
			}

			if (var17 < 127 && staticIntArrayArray6[var16][var17 + 1] == 0
					&& (var12[var14][var15 + 1] & 0x1240120) == 0) {
				staticIntArray49[var18] = var4;
				staticIntArray50[var18] = 1 + var8;
				var18 = var18 + 1 & 0xfff;
				staticIntArrayArray6[var16][var17 + 1] = 4;
				staticIntArrayArray5[var16][1 + var17] = var10;
			}

			if (var16 > 0 && var17 > 0 && staticIntArrayArray6[var16 - 1][var17 - 1] == 0
					&& (var12[var14 - 1][var15 - 1] & 0x124010e) == 0 && (var12[var14 - 1][var15] & 0x1240108) == 0
					&& (var12[var14][var15 - 1] & 0x1240102) == 0) {
				staticIntArray49[var18] = var4 - 1;
				staticIntArray50[var18] = var8 - 1;
				var18 = var18 + 1 & 0xfff;
				staticIntArrayArray6[var16 - 1][var17 - 1] = 3;
				staticIntArrayArray5[var16 - 1][var17 - 1] = var10;
			}

			if (var16 < 127 && var17 > 0 && staticIntArrayArray6[var16 + 1][var17 - 1] == 0
					&& (var12[var14 + 1][var15 - 1] & 0x1240183) == 0 && (var12[var14 + 1][var15] & 0x1240180) == 0
					&& (var12[var14][var15 - 1] & 0x1240102) == 0) {
				staticIntArray49[var18] = 1 + var4;
				staticIntArray50[var18] = var8 - 1;
				var18 = var18 + 1 & 0xfff;
				staticIntArrayArray6[1 + var16][var17 - 1] = 9;
				staticIntArrayArray5[var16 + 1][var17 - 1] = var10;
			}

			if (var16 > 0 && var17 < 127 && staticIntArrayArray6[var16 - 1][var17 + 1] == 0
					&& (var12[var14 - 1][var15 + 1] & 0x1240138) == 0 && (var12[var14 - 1][var15] & 0x1240108) == 0
					&& (var12[var14][1 + var15] & 0x1240120) == 0) {
				staticIntArray49[var18] = var4 - 1;
				staticIntArray50[var18] = 1 + var8;
				var18 = var18 + 1 & 0xfff;
				staticIntArrayArray6[var16 - 1][1 + var17] = 6;
				staticIntArrayArray5[var16 - 1][var17 + 1] = var10;
			}

			if (var16 < 127 && var17 < 127 && staticIntArrayArray6[1 + var16][var17 + 1] == 0
					&& (var12[var14 + 1][1 + var15] & 0x12401e0) == 0 && (var12[1 + var14][var15] & 0x1240180) == 0
					&& (var12[var14][var15 + 1] & 0x1240120) == 0) {
				staticIntArray49[var18] = 1 + var4;
				staticIntArray50[var18] = var8 + 1;
				var18 = var18 + 1 & 0xfff;
				staticIntArrayArray6[1 + var16][1 + var17] = 12;
				staticIntArrayArray5[1 + var16][var17 + 1] = var10;
			}
		}

		staticInt110 = var4;
		Js5CacheWriteRequest.staticInt315 = var8;
		return false;
	}

	public static void staticMethod320(Js5Index var0) {
		Config15.staticJs5Index21 = var0;
	}

	public static void staticMethod321(Js5Index var0, Js5Index var1) {
		NpcDefinition.staticJs5Index28 = var0;
		NpcDefinition.staticJs5Index29 = var1;
	}

	static final void staticMethod323(String var0) {
		if (var0 != null) {
			String var1 = staticMethod111(var0, staticClass53_1);
			if (var1 != null) {
				for (int var3 = 0; var3 < Client.staticInt310; var3++) {
					Class7 var4 = Client.staticClass7Array1[var3];
					String var5 = var4.aString5;
					String var6 = staticMethod111(var5, staticClass53_1);
					boolean var2;
					if (var0 != null && var5 != null) {
						if (!var0.startsWith("#") && !var5.startsWith("#")) {
							var2 = var1.equals(var6);
						} else {
							var2 = var0.equals(var5);
						}
					} else {
						var2 = false;
					}

					if (var2) {
						--Client.staticInt310;

						for (int var7 = var3; var7 < Client.staticInt310; var7++) {
							Client.staticClass7Array1[var7] = Client.staticClass7Array1[1 + var7];
						}

						Client.staticInt280 = Client.staticInt274 * 2073400987;
						Client.outBuffer.method471(237);
						Client.outBuffer.writeByte(staticMethod378(var0));
						Client.outBuffer.writeString(var0);
						break;
					}
				}
			}
		}

	}

	static void staticMethod275(int var0, byte[] var1, Js5DiskCache var2) {
		Js5CacheWriteRequest var3 = new Js5CacheWriteRequest();
		var3.anInt290 = 0;
		var3.id = var0;
		var3.aByteArray22 = var1;
		var3.aJs5DiskCache1 = var2;
		synchronized (FileRequestTask.staticClass39_3) {
			FileRequestTask.staticClass39_3.method198(var3);
		}

		staticMethod298();
	}

	static final void staticMethod276(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (Client.lowMemory && var0 != NodeSub4.staticInt155) {
				return;
			}

			int var11 = 0;
			if (var1 == 0) {
				var11 = Friend.staticScene1.method142(var0, var2, var3);
			}

			if (var1 == 1) {
				var11 = Friend.staticScene1.method143(var0, var2, var3);
			}

			if (var1 == 2) {
				var11 = Friend.staticScene1.method119(var0, var2, var3);
			}

			if (var1 == 3) {
				var11 = Friend.staticScene1.method116(var0, var2, var3);
			}

			int var15;
			if (var11 != 0) {
				var15 = Friend.staticScene1.method117(var0, var2, var3, var11);
				int var37 = var11 >> 14 & 0x7fff;
				int var7 = var15 & 0x1f;
				int var10 = var15 >> 6 & 0x3;
				ObjectDefinition var8;
				if (var1 == 0) {
					Friend.staticScene1.method106(var0, var2, var3);
					var8 = staticMethod394(var37);
					if (var8.anInt487 != 0) {
						Client.staticClass38Array1[var0].method179(var2, var3, var7, var10, var8.aBool60);
					}
				}

				if (var1 == 1) {
					Friend.staticScene1.method107(var0, var2, var3);
				}

				if (var1 == 2) {
					Friend.staticScene1.method108(var0, var2, var3);
					var8 = staticMethod394(var37);
					if (var8.anInt485 + var2 > 103 || var8.anInt485 + var3 > 103 || var8.anInt486 + var2 > 103
							|| var8.anInt486 + var3 > 103) {
						return;
					}

					if (var8.anInt487 != 0) {
						Client.staticClass38Array1[var0].method178(var2, var3, var8.anInt485, var8.anInt486, var10,
								var8.aBool60);
					}
				}

				if (var1 == 3) {
					Friend.staticScene1.method118(var0, var2, var3);
					var8 = staticMethod394(var37);
					if (var8.anInt487 == 1) {
						Client.staticClass38Array1[var0].method181(var2, var3);
					}
				}
			}

			if (var4 >= 0) {
				var15 = var0;
				if (var0 < 3 && (staticByteArrayArrayArray4[1][var2][var3] & 0x2) == 2) {
					var15 = var0 + 1;
				}

				Scene var371 = Friend.staticScene1;
				Class38 var71 = Client.staticClass38Array1[var0];
				ObjectDefinition var101 = staticMethod394(var4);
				int var9;
				int var81;
				if (var5 != 1 && var5 != 3) {
					var81 = var101.anInt485;
					var9 = var101.anInt486;
				} else {
					var81 = var101.anInt486;
					var9 = var101.anInt485;
				}

				int var25;
				int var27;
				if (var81 + var2 <= 104) {
					var27 = (var81 >> 1) + var2;
					var25 = (1 + var81 >> 1) + var2;
				} else {
					var27 = var2;
					var25 = var2 + 1;
				}

				int var23;
				int var26;
				if (var3 + var9 <= 104) {
					var23 = (var9 >> 1) + var3;
					var26 = (var9 + 1 >> 1) + var3;
				} else {
					var23 = var3;
					var26 = var3 + 1;
				}

				int[][] var18 = staticIntArrayArrayArray1[var15];
				int var20 = var18[var25][var26] + var18[var25][var23] + var18[var27][var23] + var18[var27][var26] >> 2;
				int var19 = (var2 << 7) + (var81 << 6);
				int var21 = (var9 << 6) + (var3 << 7);
				int var28 = (var4 << 14) + var2 + (var3 << 7) + 1073741824;
				if (var101.anInt489 == 0) {
					var28 += Integer.MIN_VALUE;
				}

				int var29 = var6 + (var5 << 6);
				if (var101.anInt493 * 582900199 == 1) {
					var29 += 256;
				}

				Object var17;
				if (var6 == 22) {
					if (var101.anInt491 == -1 && var101.anIntArray111 == null) {
						var17 = var101.method519(22, var5, var18, var19, var20, var21);
					} else {
						var17 = new GameObject(var4, 22, var5, var15, var2, var3, var101.anInt491, true,
								(Renderable) null);
					}

					var371.method140(var0, var2, var3, var20, (Renderable) var17, var28, var29);
					if (var101.anInt487 == 1) {
						var71.method185(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) {
					if (var6 >= 12) {
						if (var101.anInt491 == -1 && var101.anIntArray111 == null) {
							var17 = var101.method519(var6, var5, var18, var19, var20, var21);
						} else {
							var17 = new GameObject(var4, var6, var5, var15, var2, var3, var101.anInt491, true,
									(Renderable) null);
						}

						var371.method131(var0, var2, var3, var20, 1, 1, (Renderable) var17, 0, var28, var29);
						if (var101.anInt487 != 0) {
							var71.method177(var2, var3, var81, var9, var101.aBool60);
						}
					} else if (var6 == 0) {
						if (var101.anInt491 == -1 && var101.anIntArray111 == null) {
							var17 = var101.method519(0, var5, var18, var19, var20, var21);
						} else {
							var17 = new GameObject(var4, 0, var5, var15, var2, var3, var101.anInt491, true,
									(Renderable) null);
						}

						var371.method101(var0, var2, var3, var20, (Renderable) var17, (Renderable) null,
								staticIntArray58[var5], 0, var28, var29);
						if (var101.anInt487 != 0) {
							var71.method176(var2, var3, var6, var5, var101.aBool60);
						}
					} else if (var6 == 1) {
						if (var101.anInt491 == -1 && var101.anIntArray111 == null) {
							var17 = var101.method519(1, var5, var18, var19, var20, var21);
						} else {
							var17 = new GameObject(var4, 1, var5, var15, var2, var3, var101.anInt491, true,
									(Renderable) null);
						}

						var371.method101(var0, var2, var3, var20, (Renderable) var17, (Renderable) null,
								staticIntArray53[var5], 0, var28, var29);
						if (var101.anInt487 != 0) {
							var71.method176(var2, var3, var6, var5, var101.aBool60);
						}
					} else {
						Object var22;
						int var36;
						if (var6 == 2) {
							var36 = 1 + var5 & 0x3;
							Object var35;
							if (var101.anInt491 == -1 && var101.anIntArray111 == null) {
								var35 = var101.method519(2, var5 + 4, var18, var19, var20, var21);
								var22 = var101.method519(2, var36, var18, var19, var20, var21);
							} else {
								var35 = new GameObject(var4, 2, var5 + 4, var15, var2, var3, var101.anInt491, true,
										(Renderable) null);
								var22 = new GameObject(var4, 2, var36, var15, var2, var3, var101.anInt491, true,
										(Renderable) null);
							}

							var371.method101(var0, var2, var3, var20, (Renderable) var35, (Renderable) var22,
									staticIntArray58[var5], staticIntArray58[var36], var28, var29);
							if (var101.anInt487 != 0) {
								var71.method176(var2, var3, var6, var5, var101.aBool60);
							}
						} else if (var6 == 3) {
							if (var101.anInt491 == -1 && var101.anIntArray111 == null) {
								var17 = var101.method519(3, var5, var18, var19, var20, var21);
							} else {
								var17 = new GameObject(var4, 3, var5, var15, var2, var3, var101.anInt491, true,
										(Renderable) null);
							}

							var371.method101(var0, var2, var3, var20, (Renderable) var17, (Renderable) null,
									staticIntArray53[var5], 0, var28, var29);
							if (var101.anInt487 != 0) {
								var71.method176(var2, var3, var6, var5, var101.aBool60);
							}
						} else if (var6 == 9) {
							if (var101.anInt491 == -1 && var101.anIntArray111 == null) {
								var17 = var101.method519(var6, var5, var18, var19, var20, var21);
							} else {
								var17 = new GameObject(var4, var6, var5, var15, var2, var3, var101.anInt491, true,
										(Renderable) null);
							}

							var371.method131(var0, var2, var3, var20, 1, 1, (Renderable) var17, 0, var28, var29);
							if (var101.anInt487 != 0) {
								var71.method177(var2, var3, var81, var9, var101.aBool60);
							}
						} else if (var6 == 4) {
							if (var101.anInt491 == -1 && var101.anIntArray111 == null) {
								var17 = var101.method519(4, var5, var18, var19, var20, var21);
							} else {
								var17 = new GameObject(var4, 4, var5, var15, var2, var3, var101.anInt491, true,
										(Renderable) null);
							}

							var371.method132(var0, var2, var3, var20, (Renderable) var17, (Renderable) null,
									staticIntArray58[var5], 0, 0, 0, var28, var29);
						} else {
							int var351;
							if (var6 == 5) {
								var36 = 16;
								var351 = var371.method142(var0, var2, var3);
								if (var351 != 0) {
									var36 = staticMethod394(var351 >> 14 & 0x7fff).anInt492;
								}

								if (var101.anInt491 == -1 && var101.anIntArray111 == null) {
									var22 = var101.method519(4, var5, var18, var19, var20, var21);
								} else {
									var22 = new GameObject(var4, 4, var5, var15, var2, var3, var101.anInt491, true,
											(Renderable) null);
								}

								var371.method132(var0, var2, var3, var20, (Renderable) var22, (Renderable) null,
										staticIntArray58[var5], 0, var36 * staticIntArray54[var5],
										staticIntArray57[var5] * var36, var28, var29);
							} else if (var6 == 6) {
								var36 = 8;
								var351 = var371.method142(var0, var2, var3);
								if (var351 != 0) {
									var36 = staticMethod394(var351 >> 14 & 0x7fff).anInt492 / 2;
								}

								if (var101.anInt491 == -1 && var101.anIntArray111 == null) {
									var22 = var101.method519(4, var5 + 4, var18, var19, var20, var21);
								} else {
									var22 = new GameObject(var4, 4, 4 + var5, var15, var2, var3, var101.anInt491, true,
											(Renderable) null);
								}

								var371.method132(var0, var2, var3, var20, (Renderable) var22, (Renderable) null, 256,
										var5, staticIntArray56[var5] * var36,
										var36 * staticIntArray52[var5], var28, var29);
							} else if (var6 == 7) {
								var351 = var5 + 2 & 0x3;
								if (var101.anInt491 == -1 && var101.anIntArray111 == null) {
									var17 = var101.method519(4, var351 + 4, var18, var19, var20, var21);
								} else {
									var17 = new GameObject(var4, 4, var351 + 4, var15, var2, var3, var101.anInt491,
											true, (Renderable) null);
								}

								var371.method132(var0, var2, var3, var20, (Renderable) var17, (Renderable) null, 256,
										var351, 0, 0, var28, var29);
							} else if (var6 == 8) {
								var36 = 8;
								var351 = var371.method142(var0, var2, var3);
								if (var351 != 0) {
									var36 = staticMethod394(var351 >> 14 & 0x7fff).anInt492 / 2;
								}

								int var30 = var5 + 2 & 0x3;
								Object var31;
								if (var101.anInt491 == -1 && var101.anIntArray111 == null) {
									var22 = var101.method519(4, 4 + var5, var18, var19, var20, var21);
									var31 = var101.method519(4, 4 + var30, var18, var19, var20, var21);
								} else {
									var22 = new GameObject(var4, 4, 4 + var5, var15, var2, var3, var101.anInt491, true,
											(Renderable) null);
									var31 = new GameObject(var4, 4, var30 + 4, var15, var2, var3, var101.anInt491, true,
											(Renderable) null);
								}

								var371.method132(var0, var2, var3, var20, (Renderable) var22, (Renderable) var31, 256,
										var5, staticIntArray56[var5] * var36,
										staticIntArray52[var5] * var36, var28, var29);
							}
						}
					}
				} else {
					if (var101.anInt491 == -1 && var101.anIntArray111 == null) {
						var17 = var101.method519(10, var5, var18, var19, var20, var21);
					} else {
						var17 = new GameObject(var4, 10, var5, var15, var2, var3, var101.anInt491, true,
								(Renderable) null);
					}

					if (var17 != null) {
						var371.method131(var0, var2, var3, var20, var81, var9, (Renderable) var17, var6 == 11 ? 256 : 0,
								var28, var29);
					}

					if (var101.anInt487 != 0) {
						var71.method177(var2, var3, var81, var9, var101.aBool60);
					}
				}
			}
		}

	}

	public static char staticMethod277(char var0, int var1) {
		if (var0 >= 192 && var0 <= 255) {
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}

			if (var0 == 199) {
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}

			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}

			if (var0 == 221) {
				return 'Y';
			}

			if (var0 == 223) {
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) {
				return 'a';
			}

			if (var0 == 231) {
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}

			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}

			if (var0 == 253 || var0 == 255) {
				return 'y';
			}
		}

		if (var0 == 338) {
			return 'O';
		} else if (var0 == 339) {
			return 'o';
		} else if (var0 == 376) {
			return 'Y';
		} else {
			return var0;
		}
	}

	public static boolean staticMethod278(File var0, boolean var1) {
		try {
			RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
			int var3 = var4.read();
			var4.seek(0L);
			var4.write(var3);
			var4.seek(0L);
			var4.close();
			if (var1) {
				var0.delete();
			}

			return true;
		} catch (Exception var41) {
			return false;
		}
	}

	static final void decodeMapRegion(boolean var0) {		
		Client.staticBool37 = var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var8;
		if (!Client.staticBool37) {
			var3 = Client.inBuffer.method372();
			var5 = Client.inBuffer.method355();
			var2 = Client.inBuffer.method370();
			Class61.staticIntArrayArray8 = new int[var2][4];

			for (var1 = 0; var1 < var2; var1++) {
				for (var4 = 0; var4 < 4; var4++) {
					Class61.staticIntArrayArray8[var1][var4] = Client.inBuffer.readInt();
				}
			}

			Class6.staticIntArray13 = new int[var2];
			AbstractClass2Sub1.staticIntArray125 = new int[var2];
			Class60.staticIntArray75 = new int[var2];
			Class7.staticByteArrayArray1 = new byte[var2][];
			Class47.staticByteArrayArray6 = new byte[var2][];
			boolean var11 = false;
			if ((var5 / 8 == 48 || var5 / 8 == 49) && var3 / 8 == 48) {
				var11 = true;
			}

			if (var5 / 8 == 48 && var3 / 8 == 148) {
				var11 = true;
			}

			var2 = 0;

			for (var4 = (var5 - 6) / 8; var4 <= (var5 + 6) / 8; var4++) {
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; var6++) {
					var8 = var6 + (var4 << 8);
					if (!var11
							|| var6 != 49 && var6 != 149 && var6 != 147 && var4 != 50 && (var4 != 49 || var6 != 47)) {
						Class6.staticIntArray13[var2] = var8;
						AbstractClass2Sub1.staticIntArray125[var2] = RenderableSub2.staticJs5IndexImpl16
								.method267("m" + var4 + "_" + var6);
						Class60.staticIntArray75[var2] = RenderableSub2.staticJs5IndexImpl16
								.method267("l" + var4 + "_" + var6);
						++var2;
					}
				}
			}

			staticMethod195(var5, var3);
		} else {
			var3 = Client.inBuffer.method355();
			var5 = Client.inBuffer.method370();
			var2 = Client.inBuffer.method370();
			Client.inBuffer.method475();

			for (var1 = 0; var1 < 4; var1++) {
				for (var4 = 0; var4 < 13; var4++) {
					for (var6 = 0; var6 < 13; var6++) {
						var8 = Client.inBuffer.method477(1);
						if (var8 == 1) {
							Client.staticIntArrayArrayArray3[var1][var4][var6] = Client.inBuffer
									.method477(26);
						} else {
							Client.staticIntArrayArrayArray3[var1][var4][var6] = -1;
						}
					}
				}
			}

			Client.inBuffer.method474();
			Class61.staticIntArrayArray8 = new int[var2][4];

			for (var1 = 0; var1 < var2; var1++) {
				for (var4 = 0; var4 < 4; var4++) {
					Class61.staticIntArrayArray8[var1][var4] = Client.inBuffer.readInt();
				}
			}

			Class6.staticIntArray13 = new int[var2];
			AbstractClass2Sub1.staticIntArray125 = new int[var2];
			Class60.staticIntArray75 = new int[var2];
			Class7.staticByteArrayArray1 = new byte[var2][];
			Class47.staticByteArrayArray6 = new byte[var2][];
			var2 = 0;

			for (var1 = 0; var1 < 4; var1++) {
				for (var4 = 0; var4 < 13; var4++) {
					for (var6 = 0; var6 < 13; var6++) {
						var8 = Client.staticIntArrayArrayArray3[var1][var4][var6];
						if (var8 != -1) {
							int var13 = var8 >> 14 & 0x3ff;
							int var12 = var8 >> 3 & 0x7ff;
							int var7 = var12 / 8 + (var13 / 8 << 8);

							int var9;
							for (var9 = 0; var9 < var2; var9++) {
								if (Class6.staticIntArray13[var9] == var7) {
									var7 = -1;
									break;
								}
							}

							if (var7 != -1) {
								Class6.staticIntArray13[var2] = var7;
								var9 = var7 >> 8 & 0xff;
								int var10 = var7 & 0xff;
								AbstractClass2Sub1.staticIntArray125[var2] = RenderableSub2.staticJs5IndexImpl16
										.method267("m" + var9 + "_" + var10);
								Class60.staticIntArray75[var2] = RenderableSub2.staticJs5IndexImpl16
										.method267("l" + var9 + "_" + var10);
								++var2;
							}
						}
					}
				}
			}

			staticMethod195(var3, var5);
		}

	}

	public static int staticMethod295(CharSequence var0) {
		int var1 = var0.length();
		int var3 = 0;

		for (int var2 = 0; var2 < var1; var2++) {
			var3 = (var3 << 5) - var3 + staticMethod319(var0.charAt(var2));
		}

		return var3;
	}

	static NodeSub11 staticMethod300(Js5Index var0, int var1, int var2) {
		byte[] var3 = var0.getFile(var1, var2);
		return var3 == null ? null : new NodeSub11(new ByteBuf(var3));
	}

	public static void staticMethod301(Class47 var0) {
		staticClass47_1 = var0;
	}

	public static void staticMethod302(Component var0) {
		var0.removeMouseListener(MouseHandler.staticMouseHandler1);
		var0.removeMouseMotionListener(MouseHandler.staticMouseHandler1);
		var0.removeFocusListener(MouseHandler.staticMouseHandler1);
		MouseHandler.staticInt90 = 0;
	}

	public static final void staticMethod303(long var0) {
		if (var0 > 0L) {
			if (var0 % 10L == 0L) {
				staticMethod432(var0 - 1L);
				staticMethod432(1L);
			} else {
				staticMethod432(var0);
			}
		}

	}

	public static FloorOverlayDef staticMethod308(int var0) {
		FloorOverlayDef var1 = (FloorOverlayDef) FloorOverlayDef.staticCache26.get(var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = staticJs5Index8.getFile(4, var0);
			var1 = new FloorOverlayDef();
			if (var2 != null) {
				var1.method539(new ByteBuf(var2), var0);
			}

			var1.method536();
			FloorOverlayDef.staticCache26.method170(var1, var0);
			return var1;
		}
	}

	public static Sprite[] staticMethod309(Js5Index var0, String var1, String var2) {
		int var3 = var0.method267(var1);
		int var4 = var0.method268(var3, var2);
		return staticMethod179(var0, var3, var4);
	}

	static final boolean staticMethod310() {
		if (Class56.gameConnection == null) {
			return false;
		} else {
			String var1;
			int var2;
			try {
				int var44 = Class56.gameConnection.available();
				if (var44 == 0) {
					return false;
				}

				if (Client.staticInt191 == -1) {
					Class56.gameConnection.read(Client.inBuffer.buf, 0, 1);
					Client.inBuffer.position = 0;
					Client.staticInt191 = Client.inBuffer.method472();
					Client.staticInt190 = staticIntArray70[Client.staticInt191];
					--var44;
				}

				if (Client.staticInt190 == -1) {
					if (var44 <= 0) {
						return false;
					}

					Class56.gameConnection.read(Client.inBuffer.buf, 0, 1);
					Client.staticInt190 = Client.inBuffer.buf[0] & 0xff;
					--var44;
				}

				if (Client.staticInt190 == -2) {
					if (var44 <= 1) {
						return false;
					}

					Class56.gameConnection.read(Client.inBuffer.buf, 0, 2);
					Client.inBuffer.position = 0;
					Client.staticInt190 = Client.inBuffer.method370();
					var44 -= 2;
				}

				if (var44 < Client.staticInt190) {
					return false;
				}

				Client.inBuffer.position = 0;
				Class56.gameConnection.read(Client.inBuffer.buf, 0, Client.staticInt190);
				Client.staticInt192 = 0;
				Client.staticInt195 = Client.staticInt194;
				Client.staticInt194 = Client.staticInt270;
				Client.staticInt270 = -Client.staticInt191;
				if (Client.staticInt191 == 209) {
					ChatMessage.staticInt331 = Client.inBuffer.method348();
					staticInt122 = Client.inBuffer.method348();
					Client.staticInt191 = -1;
					return true;
				}

				int var45;
				Widget var47;
				if (Client.staticInt191 == 21) {
					var45 = Client.inBuffer.method378();
					var2 = Client.inBuffer.method355();
					var47 = staticMethod8(var45);
					if (var47.anInt348 != 1 || var47.anInt295 != var2) {
						var47.anInt348 = 1;
						var47.anInt295 = var2;
						staticMethod73(var47);
					}

					Client.staticInt191 = -1;
					return true;
				}

				int var3;
				int var5;
				int var6;
				int var48;
				int var58;
				if (Client.staticInt191 == 25) {
					Client.staticBool28 = true;
					staticInt101 = Client.inBuffer.method367();
					Class29.staticInt72 = Client.inBuffer.method367();
					Class7.staticInt31 = Client.inBuffer.method370();
					Class28.staticInt71 = Client.inBuffer.method367();
					Class61.staticInt146 = Client.inBuffer.method367();
					if (Class61.staticInt146 >= 100) {
						var45 = 64 + staticInt101 * 128;
						var2 = Class29.staticInt72 * 128 + 64;
						var3 = staticMethod240(var45, var2, NodeSub4.staticInt155) - Class7.staticInt31;
						var48 = var45 - Class20.staticInt36;
						var5 = var3 - staticInt125;
						var6 = var2 - NodeSub3.staticInt153;
						var58 = (int) Math.sqrt(var48 * var48 + var6 * var6);
						NodeSub19.staticInt318 = (int) (Math.atan2(var5, var58) * 325.949D) & 0x7ff;
						staticInt87 = (int) (Math.atan2(var48, var6) * -325.949D) & 0x7ff;
						if (NodeSub19.staticInt318 < 128) {
							NodeSub19.staticInt318 = 128;
						}

						if (NodeSub19.staticInt318 > 383) {
							NodeSub19.staticInt318 = 383;
						}
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 88) {
					var45 = Client.inBuffer.method370();
					var2 = Client.inBuffer.method367();
					var3 = Client.inBuffer.method370();
					staticMethod311(var45, var2, var3);
					Client.staticInt191 = -1;
					return true;
				}

				boolean var109;
				if (Client.staticInt191 == 80) {
					var109 = Client.inBuffer.method367() == 1;
					if (var109) {
						Class48.staticLong7 = staticMethod297() - Client.inBuffer.readLong();
						staticClass56_1 = new Class56(Client.inBuffer, true);
					} else {
						staticClass56_1 = null;
					}

					Client.staticInt282 = Client.staticInt274 * 2073400987;
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 41) {
					var45 = Client.inBuffer.method353();
					var2 = Client.inBuffer.readInt();
					staticIntArray63[var45] = var2;
					if (staticIntArray64[var45] != var2) {
						staticIntArray64[var45] = var2;
					}

					staticMethod471(var45);
					Client.staticIntArray104[++Client.staticInt275 - 1 & 0x1f] = var45;
					Client.staticInt191 = -1;
					return true;
				}

				Widget var4;
				if (Client.staticInt191 == 68) {
					var45 = Client.inBuffer.method370();
					var2 = Client.inBuffer.method370();
					var3 = Client.inBuffer.method378();
					var4 = staticMethod8(var3);
					var4.anInt336 = var45 + (var2 << 16);
					Client.staticInt191 = -1;
					return true;
				}

				int var8;
				KeyFocusListener var53;
				if (Client.staticInt191 == 24) {
					var45 = Client.staticInt190 + Client.inBuffer.position;
					var2 = Client.inBuffer.method370();
					var3 = Client.inBuffer.method370();
					if (var2 != Client.staticInt263) {
						Client.staticInt263 = var2;
						staticMethod93(false);
						staticMethod393(Client.staticInt263);
						staticMethod2(Client.staticInt263);

						for (var48 = 0; var48 < 100; var48++) {
							Client.staticBoolArray8[var48] = true;
						}
					}

					KeyFocusListener var60;
					for (; var3-- > 0; var60.aBool50 = true) {
						var48 = Client.inBuffer.readInt();
						var5 = Client.inBuffer.method370();
						var6 = Client.inBuffer.method367();
						var60 = (KeyFocusListener) Client.staticHashTable5.method149(var48);
						if (var60 != null && var60.anInt384 != var5) {
							staticMethod266(var60, true);
							var60 = null;
						}

						if (var60 == null) {
							var60 = staticMethod315(var48, var5, var6);
						}
					}

					for (var53 = (KeyFocusListener) Client.staticHashTable5
							.method146(); var53 != null; var53 = (KeyFocusListener) Client.staticHashTable5.method147()) {
						if (var53.aBool50) {
							var53.aBool50 = false;
						} else {
							staticMethod266(var53, true);
						}
					}

					Client.staticHashTable6 = new HashTable(512);

					while (Client.inBuffer.position < var45) {
						var48 = Client.inBuffer.readInt();
						var5 = Client.inBuffer.method370();
						var6 = Client.inBuffer.method370();
						var58 = Client.inBuffer.readInt();

						for (var8 = var5; var8 <= var6; var8++) {
							long var591 = var8 + ((long) var48 << 32);
							Client.staticHashTable6.method148(new NodeSub15(var58), var591);
						}
					}

					Client.staticInt191 = -1;
					return true;
				}

				boolean var49;
				Npc var78;
				int var82;
				Npc var93;
				if (Client.staticInt191 == 210) {
					Client.staticInt247 = 0;
					Client.staticInt188 = 0;
					Client.inBuffer.method475();
					var45 = Client.inBuffer.method477(8);
					if (var45 < Client.staticInt186) {
						for (var2 = var45; var2 < Client.staticInt186; var2++) {
							Client.staticIntArray93[++Client.staticInt247 - 1] = Client.staticIntArray121[var2];
						}
					}

					if (var45 > Client.staticInt186) {
						throw new RuntimeException("");
					}

					Client.staticInt186 = 0;

					for (var2 = 0; var2 < var45; var2++) {
						var3 = Client.staticIntArray121[var2];
						var78 = Client.staticNpcArray1[var3];
						var5 = Client.inBuffer.method477(1);
						if (var5 == 0) {
							Client.staticIntArray121[++Client.staticInt186 - 1] = var3;
							var78.anInt605 = Client.staticInt166 * 1142679911;
						} else {
							var6 = Client.inBuffer.method477(2);
							if (var6 == 0) {
								Client.staticIntArray121[++Client.staticInt186 - 1] = var3;
								var78.anInt605 = Client.staticInt166 * 1142679911;
								Client.staticIntArray92[++Client.staticInt188 - 1] = var3;
							} else if (var6 == 1) {
								Client.staticIntArray121[++Client.staticInt186 - 1] = var3;
								var78.anInt605 = Client.staticInt166 * 1142679911;
								var58 = Client.inBuffer.method477(3);
								var78.method656(var58, (byte) 1);
								var8 = Client.inBuffer.method477(1);
								if (var8 == 1) {
									Client.staticIntArray92[++Client.staticInt188 - 1] = var3;
								}
							} else if (var6 == 2) {
								Client.staticIntArray121[++Client.staticInt186 - 1] = var3;
								var78.anInt605 = Client.staticInt166 * 1142679911;
								var58 = Client.inBuffer.method477(3);
								var78.method656(var58, (byte) 2);
								var8 = Client.inBuffer.method477(3);
								var78.method656(var8, (byte) 2);
								var82 = Client.inBuffer.method477(1);
								if (var82 == 1) {
									Client.staticIntArray92[++Client.staticInt188 - 1] = var3;
								}
							} else if (var6 == 3) {
								Client.staticIntArray93[++Client.staticInt247 - 1] = var3;
							}
						}
					}

					while (Client.inBuffer.method473(Client.staticInt190) >= 27) {
						var45 = Client.inBuffer.method477(15);
						if (var45 == 32767) {
							break;
						}

						var49 = false;
						if (Client.staticNpcArray1[var45] == null) {
							Client.staticNpcArray1[var45] = new Npc();
							var49 = true;
						}

						var93 = Client.staticNpcArray1[var45];
						Client.staticIntArray121[++Client.staticInt186 - 1] = var45;
						var93.anInt605 = Client.staticInt166 * 1142679911;
						var48 = Client.inBuffer.method477(5);
						if (var48 > 15) {
							var48 -= 32;
						}

						var5 = Client.staticIntArray95[Client.inBuffer.method477(3)];
						if (var49) {
							var93.anInt630 = var93.anInt592 = var5;
						}

						var93.aNpcDef1 = staticMethod85(Client.inBuffer.method477(14));
						var6 = Client.inBuffer.method477(5);
						if (var6 > 15) {
							var6 -= 32;
						}

						var58 = Client.inBuffer.method477(1);
						if (var58 == 1) {
							Client.staticIntArray92[++Client.staticInt188 - 1] = var45;
						}

						var8 = Client.inBuffer.method477(1);
						var93.anInt626 = var93.aNpcDef1.anInt538;
						var93.anInt631 = var93.aNpcDef1.anInt549 * 494637525;
						if (var93.anInt631 == 0) {
							var93.anInt592 = 0;
						}

						var93.anInt621 = var93.aNpcDef1.anInt550;
						var93.anInt597 = var93.aNpcDef1.anInt540;
						var93.anInt598 = var93.aNpcDef1.anInt536;
						var93.anInt622 = -var93.aNpcDef1.anInt542;
						var93.anInt594 = -var93.aNpcDef1.anInt539;
						var93.anInt634 = var93.aNpcDef1.anInt552;
						var93.anInt595 = var93.aNpcDef1.anInt543;
						var93.method657(var48 + AbstractClass2Sub1.staticPlayer1.anIntArray127[0],
								AbstractClass2Sub1.staticPlayer1.anIntArray122[0] + var6, var8 == 1);
					}

					Client.inBuffer.method474();
					staticMethod391();

					for (var45 = 0; var45 < Client.staticInt247; var45++) {
						var2 = Client.staticIntArray93[var45];
						if (Client.staticInt166 != Client.staticNpcArray1[var2].anInt605 * 1205609047) {
							Client.staticNpcArray1[var2].aNpcDef1 = null;
							Client.staticNpcArray1[var2] = null;
						}
					}

					if (Client.staticInt190 != Client.inBuffer.position) {
						throw new RuntimeException(
								Client.inBuffer.position + staticString11 + Client.staticInt190);
					}

					for (var45 = 0; var45 < Client.staticInt186; var45++) {
						if (Client.staticNpcArray1[Client.staticIntArray121[var45]] == null) {
							throw new RuntimeException(var45 + staticString11 + Client.staticInt186);
						}
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 118) {
					Client.inBuffer.position += 28;
					if (Client.inBuffer.method363()) {
						staticMethod336(Client.inBuffer, Client.inBuffer.position - 28);
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 14) {
					Client.staticInt298 = Client.inBuffer.method367();
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 223) {
					staticMethod250();
					Client.staticInt232 = Client.inBuffer.method364();
					Client.staticInt283 = Client.staticInt274 * 2073400987;
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 156) {
					var45 = Client.inBuffer.readInt();
					var2 = Client.inBuffer.method370();
					if (var45 < -70000) {
						var2 += '\u8000';
					}

					if (var45 >= 0) {
						var47 = staticMethod8(var45);
					} else {
						var47 = null;
					}

					if (var47 != null) {
						for (var48 = 0; var48 < var47.anIntArray76.length; var48++) {
							var47.anIntArray76[var48] = 0;
							var47.anIntArray77[var48] = 0;
						}
					}

					staticMethod162(var2);
					var48 = Client.inBuffer.method370();

					for (var5 = 0; var5 < var48; var5++) {
						var6 = Client.inBuffer.method346();
						if (var6 == 255) {
							var6 = Client.inBuffer.readInt();
						}

						var58 = Client.inBuffer.method353();
						if (var47 != null && var5 < var47.anIntArray76.length) {
							var47.anIntArray76[var5] = var58;
							var47.anIntArray77[var5] = var6;
						}

						staticMethod104(var2, var5, var58 - 1, var6);
					}

					if (var47 != null) {
						staticMethod73(var47);
					}

					staticMethod250();
					Client.staticIntArray86[++Client.staticInt276 - 1 & 0x1f] = var2 & 0x7fff;
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 47) {
					var45 = Client.inBuffer.method355();
					staticMethod281(var45);
					Client.staticIntArray86[++Client.staticInt276 - 1 & 0x1f] = var45 & 0x7fff;
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 106) {
					for (var45 = 0; var45 < staticIntArray64.length; var45++) {
						if (staticIntArray63[var45] != staticIntArray64[var45]) {
							staticIntArray64[var45] = staticIntArray63[var45];
							staticMethod471(var45);
							Client.staticIntArray104[++Client.staticInt275 - 1 & 0x1f] = var45;
						}
					}

					Client.staticInt191 = -1;
					return true;
				}

				long var12;
				long var14;
				long var16;
				boolean var66;
				if (Client.staticInt191 == 237) {
					var1 = Client.inBuffer.readString();
					var12 = Client.inBuffer.method370();
					var14 = Client.inBuffer.readTriByte();
					Class48[] var611 = new Class48[] { Class48.staticClass48_4, Class48.staticClass48_6,
							Class48.staticClass48_2, Class48.staticClass48_1, Class48.staticClass48_5,
							Class48.staticClass48_3 };
					Class48 var621 = (Class48) staticMethod233(var611, Client.inBuffer.method367());
					var16 = var14 + (var12 << 32);
					var66 = false;

					for (int var69 = 0; var69 < 100; var69++) {
						if (var16 == Client.staticLongArray3[var69]) {
							var66 = true;
							break;
						}
					}

					if (staticMethod141(var1)) {
						var66 = true;
					}

					if (!var66 && Client.staticInt245 == 0) {
						Client.staticLongArray3[Client.staticInt293] = var16;
						Client.staticInt293 = (Client.staticInt293 + 1) % 100;
						String var72 = staticMethod456(staticMethod265(staticMethod191(Client.inBuffer)));
						byte var73;
						if (var621.aBool15) {
							var73 = 7;
						} else {
							var73 = 3;
						}

						if (var621.anInt192 != -1) {
							staticMethod36(var73, staticMethod123(var621.anInt192) + var1, var72);
						} else {
							staticMethod36(var73, var1, var72);
						}
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 201) {
					var45 = Client.inBuffer.method370();
					var2 = Client.inBuffer.method378();
					var47 = staticMethod8(var2);
					if (var47 != null && var47.anInt296 == 0) {
						if (var45 > var47.anInt361 - var47.anInt351) {
							var45 = var47.anInt361 - var47.anInt351;
						}

						if (var45 < 0) {
							var45 = 0;
						}

						if (var47.anInt312 != var45) {
							var47.anInt312 = var45;
							staticMethod73(var47);
						}
					}

					Client.staticInt191 = -1;
					return true;
				}

				String var57;
				String var62;
				boolean var54;
				if (Client.staticInt191 == 221) {
					Friend var821;
					while (Client.inBuffer.position < Client.staticInt190) {
						var109 = Client.inBuffer.method367() == 1;
						var62 = Client.inBuffer.readString();
						var57 = Client.inBuffer.readString();
						var48 = Client.inBuffer.method370();
						var5 = Client.inBuffer.method367();
						var6 = Client.inBuffer.method367();
						boolean var661 = (var6 & 0x2) != 0;
						var54 = (var6 & 0x1) != 0;
						if (var48 > 0) {
							Client.inBuffer.readString();
							Client.inBuffer.method367();
							Client.inBuffer.readInt();
						}

						Client.inBuffer.readString();

						for (var82 = 0; var82 < Client.staticInt308; var82++) {
							var821 = Client.staticFriendArray1[var82];
							if (!var109) {
								if (var62.equals(var821.aString14)) {
									if (var48 != var821.anInt210) {
										boolean var781 = true;

										for (Class40Sub1 var80 = (Class40Sub1) Client.staticClass41_1
												.method217(); var80 != null; var80 = (Class40Sub1) Client.staticClass41_1
														.method219()) {
											if (var80.aString30.equals(var62)) {
												if (var48 != 0 && var80.aShort1 == 0) {
													var80.method216();
													var781 = false;
												} else if (var48 == 0 && var80.aShort1 != 0) {
													var80.method216();
													var781 = false;
												}
											}
										}

										if (var781) {
											Client.staticClass41_1.method218(new Class40Sub1(var62, var48));
										}

										var821.anInt210 = var48;
									}

									var821.aString13 = var57;
									var821.anInt209 = var5;
									var821.aBool20 = var661;
									var821.aBool19 = var54;
									var62 = null;
									break;
								}
							} else if (var57.equals(var821.aString14)) {
								var821.aString14 = var62;
								var821.aString13 = var57;
								var62 = null;
								break;
							}
						}

						if (var62 != null && Client.staticInt308 < 400) {
							var821 = new Friend();
							Client.staticFriendArray1[Client.staticInt308] = var821;
							var821.aString14 = var62;
							var821.aString13 = var57;
							var821.anInt210 = var48;
							var821.anInt209 = var5;
							var821.aBool20 = var661;
							var821.aBool19 = var54;
							++Client.staticInt308;
						}
					}

					Client.staticInt202 = 2;
					Client.staticInt280 = Client.staticInt274 * 2073400987;
					var109 = false;
					var2 = Client.staticInt308;

					while (var2 > 0) {
						var109 = true;
						--var2;

						for (var3 = 0; var3 < var2; var3++) {
							var66 = false;
							Friend var67 = Client.staticFriendArray1[var3];
							Friend var701 = Client.staticFriendArray1[var3 + 1];
							if (var67.anInt210 != Client.staticInt309 && Client.staticInt309 == var701.anInt210) {
								var66 = true;
							}

							if (!var66 && var67.anInt210 == 0 && var701.anInt210 != 0) {
								var66 = true;
							}

							if (!var66 && !var67.aBool20 && var701.aBool20) {
								var66 = true;
							}

							if (!var66 && !var67.aBool19 && var701.aBool19) {
								var66 = true;
							}

							if (var66) {
								var821 = Client.staticFriendArray1[var3];
								Client.staticFriendArray1[var3] = Client.staticFriendArray1[var3 + 1];
								Client.staticFriendArray1[1 + var3] = var821;
								var109 = false;
							}
						}

						if (var109) {
							break;
						}
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 208) {
					Class2 var65 = new Class2();
					var65.aString1 = Client.inBuffer.readString();
					var65.anInt4 = Client.inBuffer.method370();
					var2 = Client.inBuffer.readInt();
					var65.anInt3 = var2;
					staticMethod396(45);
					Class56.gameConnection.shutdown();
					Class56.gameConnection = null;
					staticMethod59(var65);
					Client.staticInt191 = -1;
					return false;
				}

				if (Client.staticInt191 == 49) {
					Client.staticInt160 = Client.inBuffer.method367();
					Client.staticInt291 = Client.inBuffer.method367();
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 28) {
					var45 = Client.inBuffer.method370();
					Client.staticInt263 = var45;
					staticMethod93(false);
					staticMethod393(var45);
					staticMethod2(Client.staticInt263);

					for (var2 = 0; var2 < 100; var2++) {
						Client.staticBoolArray8[var2] = true;
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 206) {
					Client.staticBool28 = false;

					for (var45 = 0; var45 < 5; var45++) {
						Client.staticBoolArray7[var45] = false;
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 92) {
					var2 = Client.inBuffer.method367();
					Class55[] var64 = new Class55[] { Class55.staticClass55_2, Class55.staticClass55_4,
							Class55.staticClass55_3 };
					Class55[] var68 = var64;
					var5 = 0;

					Class55 var81;
					while (true) {
						if (var5 >= var68.length) {
							var81 = null;
							break;
						}

						Class55 var76 = var68[var5];
						if (var2 == var76.anInt207) {
							var81 = var76;
							break;
						}

						++var5;
					}

					staticClass55_1 = var81;
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 195) {
					var45 = Client.inBuffer.method353();
					if (var45 == '\uffff') {
						var45 = -1;
					}

					if (var45 == -1 && !Client.staticBool38) {
						staticNodeSub8Sub3_1.method440();
						staticInt118 = 1;
						staticJs5Index3 = null;
					} else if (var45 != -1 && Client.staticInt249 != var45 && Client.staticInt299 != 0
							&& !Client.staticBool38) {
						Js5IndexImpl var63 = Class34.staticJs5IndexImpl3;
						var3 = Client.staticInt299;
						staticInt118 = 1;
						staticJs5Index3 = var63;
						staticInt119 = var45;
						staticInt127 = 0;
						Class7.staticInt32 = var3;
						staticBool16 = false;
						NodeSub1.staticInt151 = 2;
					}

					Client.staticInt249 = var45;
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 60) {
					var45 = Client.inBuffer.method358();
					var2 = Client.inBuffer.method370();
					if (var2 == '\uffff') {
						var2 = -1;
					}

					if (Client.staticInt299 != 0 && var2 != -1) {
						staticMethod30(Class56.staticJs5IndexImpl6, var2, 0, Client.staticInt299, false);
						Client.staticBool38 = true;
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 168 || Client.staticInt191 == 23 || Client.staticInt191 == 97
						|| Client.staticInt191 == 232 || Client.staticInt191 == 73 || Client.staticInt191 == 251
						|| Client.staticInt191 == 143 || Client.staticInt191 == 29 || Client.staticInt191 == 186
						|| Client.staticInt191 == 117) {
					staticMethod345();
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 61) {
					var45 = Client.inBuffer.method377();
					var62 = Client.inBuffer.readString();
					var3 = Client.inBuffer.method367();
					if (var3 >= 1 && var3 <= 8) {
						if (var62.equalsIgnoreCase("null")) {
							var62 = null;
						}

						Client.staticStringArray7[var3 - 1] = var62;
						Client.staticBoolArray5[var3 - 1] = var45 == 0;
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 129) {
					Client.staticBool28 = true;
					TaskManager.staticInt40 = Client.inBuffer.method367();
					staticInt137 = Client.inBuffer.method367();
					ObjectDefinition.staticInt322 = Client.inBuffer.method370();
					staticInt17 = Client.inBuffer.method367();
					staticInt150 = Client.inBuffer.method367();
					if (staticInt150 >= 100) {
						Class20.staticInt36 = 64 + TaskManager.staticInt40 * 128;
						NodeSub3.staticInt153 = staticInt137 * 128 + 64;
						staticInt125 = staticMethod240(Class20.staticInt36, NodeSub3.staticInt153,
								NodeSub4.staticInt155) - ObjectDefinition.staticInt322;
					}

					Client.staticInt191 = -1;
					return true;
				}

				Widget var70;
				if (Client.staticInt191 == 217) {
					var45 = Client.inBuffer.method355();
					var2 = Client.inBuffer.method355();
					var3 = Client.inBuffer.method353();
					var48 = Client.inBuffer.method362();
					var70 = staticMethod8(var48);
					if (var70.anInt325 != var45 || var70.anInt332 != var2 || var70.anInt334 != var3) {
						var70.anInt325 = var45;
						var70.anInt332 = var2;
						var70.anInt334 = var3;
						staticMethod73(var70);
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 43) {
					Client.staticInt247 = 0;
					Client.staticInt188 = 0;
					Client.inBuffer.method475();
					var45 = Client.inBuffer.method477(8);
					if (var45 < Client.staticInt186) {
						for (var2 = var45; var2 < Client.staticInt186; var2++) {
							Client.staticIntArray93[++Client.staticInt247 - 1] = Client.staticIntArray121[var2];
						}
					}

					if (var45 > Client.staticInt186) {
						throw new RuntimeException("");
					}

					Client.staticInt186 = 0;

					for (var2 = 0; var2 < var45; var2++) {
						var3 = Client.staticIntArray121[var2];
						var78 = Client.staticNpcArray1[var3];
						var5 = Client.inBuffer.method477(1);
						if (var5 == 0) {
							Client.staticIntArray121[++Client.staticInt186 - 1] = var3;
							var78.anInt605 = Client.staticInt166 * 1142679911;
						} else {
							var6 = Client.inBuffer.method477(2);
							if (var6 == 0) {
								Client.staticIntArray121[++Client.staticInt186 - 1] = var3;
								var78.anInt605 = Client.staticInt166 * 1142679911;
								Client.staticIntArray92[++Client.staticInt188 - 1] = var3;
							} else if (var6 == 1) {
								Client.staticIntArray121[++Client.staticInt186 - 1] = var3;
								var78.anInt605 = Client.staticInt166 * 1142679911;
								var58 = Client.inBuffer.method477(3);
								var78.method656(var58, (byte) 1);
								var8 = Client.inBuffer.method477(1);
								if (var8 == 1) {
									Client.staticIntArray92[++Client.staticInt188 - 1] = var3;
								}
							} else if (var6 == 2) {
								Client.staticIntArray121[++Client.staticInt186 - 1] = var3;
								var78.anInt605 = Client.staticInt166 * 1142679911;
								var58 = Client.inBuffer.method477(3);
								var78.method656(var58, (byte) 2);
								var8 = Client.inBuffer.method477(3);
								var78.method656(var8, (byte) 2);
								var82 = Client.inBuffer.method477(1);
								if (var82 == 1) {
									Client.staticIntArray92[++Client.staticInt188 - 1] = var3;
								}
							} else if (var6 == 3) {
								Client.staticIntArray93[++Client.staticInt247 - 1] = var3;
							}
						}
					}

					while (Client.inBuffer.method473(Client.staticInt190) >= 27) {
						var45 = Client.inBuffer.method477(15);
						if (var45 == 32767) {
							break;
						}

						var49 = false;
						if (Client.staticNpcArray1[var45] == null) {
							Client.staticNpcArray1[var45] = new Npc();
							var49 = true;
						}

						var93 = Client.staticNpcArray1[var45];
						Client.staticIntArray121[++Client.staticInt186 - 1] = var45;
						var93.anInt605 = Client.staticInt166 * 1142679911;
						var48 = Client.inBuffer.method477(8);
						if (var48 > 127) {
							var48 -= 256;
						}

						var5 = Client.staticIntArray95[Client.inBuffer.method477(3)];
						if (var49) {
							var93.anInt630 = var93.anInt592 = var5;
						}

						var93.aNpcDef1 = staticMethod85(Client.inBuffer.method477(14));
						var6 = Client.inBuffer.method477(8);
						if (var6 > 127) {
							var6 -= 256;
						}

						var58 = Client.inBuffer.method477(1);
						if (var58 == 1) {
							Client.staticIntArray92[++Client.staticInt188 - 1] = var45;
						}

						var8 = Client.inBuffer.method477(1);
						var93.anInt626 = var93.aNpcDef1.anInt538;
						var93.anInt631 = var93.aNpcDef1.anInt549 * 494637525;
						if (var93.anInt631 == 0) {
							var93.anInt592 = 0;
						}

						var93.anInt621 = var93.aNpcDef1.anInt550;
						var93.anInt597 = var93.aNpcDef1.anInt540;
						var93.anInt598 = var93.aNpcDef1.anInt536;
						var93.anInt622 = -var93.aNpcDef1.anInt542;
						var93.anInt594 = -var93.aNpcDef1.anInt539;
						var93.anInt634 = var93.aNpcDef1.anInt552;
						var93.anInt595 = var93.aNpcDef1.anInt543;
						var93.method657(AbstractClass2Sub1.staticPlayer1.anIntArray127[0] + var48,
								AbstractClass2Sub1.staticPlayer1.anIntArray122[0] + var6, var8 == 1);
					}

					Client.inBuffer.method474();
					staticMethod391();

					for (var45 = 0; var45 < Client.staticInt247; var45++) {
						var2 = Client.staticIntArray93[var45];
						if (Client.staticInt166 != Client.staticNpcArray1[var2].anInt605 * 1205609047) {
							Client.staticNpcArray1[var2].aNpcDef1 = null;
							Client.staticNpcArray1[var2] = null;
						}
					}

					if (Client.inBuffer.position != Client.staticInt190) {
						throw new RuntimeException(
								Client.inBuffer.position + staticString11 + Client.staticInt190);
					}

					for (var45 = 0; var45 < Client.staticInt186; var45++) {
						if (Client.staticNpcArray1[Client.staticIntArray121[var45]] == null) {
							throw new RuntimeException(var45 + staticString11 + Client.staticInt186);
						}
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 202) {
					var45 = Client.inBuffer.method367();
					var2 = Client.inBuffer.method367();
					var3 = Client.inBuffer.method367();
					var48 = Client.inBuffer.method367();
					Client.staticBoolArray7[var45] = true;
					Client.staticIntArray118[var45] = var2;
					Client.staticIntArray119[var45] = var3;
					Client.staticIntArray83[var45] = var48;
					Client.staticIntArray120[var45] = 0;
					Client.staticInt191 = -1;
					return true;
				}

				byte var75;
				if (Client.staticInt191 == 155) {
					var1 = Client.inBuffer.readString();
					var2 = Client.inBuffer.method370();
					var75 = Client.inBuffer.readByte();
					var66 = false;
					if (var75 == -128) {
						var66 = true;
					}

					if (var66) {
						if (staticInt149 == 0) {
							Client.staticInt191 = -1;
							return true;
						}

						var54 = false;

						for (var5 = 0; var5 < staticInt149
								&& (!Class43.staticNodeSub1Array1[var5].aString15.equals(var1)
										|| Class43.staticNodeSub1Array1[var5].anInt217 != var2); var5++) {
							;
						}

						if (var5 < staticInt149) {
							while (var5 < staticInt149 - 1) {
								Class43.staticNodeSub1Array1[var5] = Class43.staticNodeSub1Array1[1 + var5];
								++var5;
							}

							--staticInt149;
							Class43.staticNodeSub1Array1[staticInt149] = null;
						}
					} else {
						Client.inBuffer.readString();
						NodeSub1 var74 = new NodeSub1();
						var74.aString15 = var1;
						var74.aString16 = staticMethod111(var74.aString15, staticClass53_1);
						var74.anInt217 = var2;
						var74.aByte3 = var75;

						for (var6 = staticInt149 - 1; var6 >= 0; --var6) {
							var58 = Class43.staticNodeSub1Array1[var6].aString16.compareTo(var74.aString16);
							if (var58 == 0) {
								Class43.staticNodeSub1Array1[var6].anInt217 = var2;
								Class43.staticNodeSub1Array1[var6].aByte3 = var75;
								if (var1.equals(AbstractClass2Sub1.staticPlayer1.aString40)) {
									staticByte3 = var75;
								}

								Client.staticInt281 = Client.staticInt274 * 2073400987;
								Client.staticInt191 = -1;
								return true;
							}

							if (var58 < 0) {
								break;
							}
						}

						if (staticInt149 >= Class43.staticNodeSub1Array1.length) {
							Client.staticInt191 = -1;
							return true;
						}

						for (var58 = staticInt149 - 1; var58 > var6; --var58) {
							Class43.staticNodeSub1Array1[var58 + 1] = Class43.staticNodeSub1Array1[var58];
						}

						if (staticInt149 == 0) {
							Class43.staticNodeSub1Array1 = new NodeSub1[100];
						}

						Class43.staticNodeSub1Array1[1 + var6] = var74;
						++staticInt149;
						if (var1.equals(AbstractClass2Sub1.staticPlayer1.aString40)) {
							staticByte3 = var75;
						}
					}

					Client.staticInt281 = Client.staticInt274 * 2073400987;
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 121) {
					staticMethod87();
					Client.staticInt191 = -1;
					return false;
				}

				if (Client.staticInt191 == 170) {
					staticInt122 = Client.inBuffer.method367();
					ChatMessage.staticInt331 = Client.inBuffer.method367();

					for (var45 = staticInt122; var45 < 8 + staticInt122; var45++) {
						for (var2 = ChatMessage.staticInt331; var2 < ChatMessage.staticInt331 + 8; var2++) {
							if (Client.staticClass39ArrayArrayArray1[NodeSub4.staticInt155][var45][var2] != null) {
								Client.staticClass39ArrayArrayArray1[NodeSub4.staticInt155][var45][var2] = null;
								staticMethod262(var45, var2);
							}
						}
					}

					for (NodeSub19 var79 = (NodeSub19) Client.staticClass39_7
							.method195(); var79 != null; var79 = (NodeSub19) Client.staticClass39_7.method193()) {
						if (var79.anInt388 >= staticInt122 && var79.anInt388 < 8 + staticInt122
								&& var79.anInt390 >= ChatMessage.staticInt331
								&& var79.anInt390 < 8 + ChatMessage.staticInt331
								&& var79.anInt389 == NodeSub4.staticInt155) {
							var79.anInt386 = 0;
						}
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 247) {
					var1 = Client.inBuffer.readString();
					Object[] var77 = new Object[var1.length() + 1];

					for (var3 = var1.length() - 1; var3 >= 0; --var3) {
						if (var1.charAt(var3) == 115) {
							var77[1 + var3] = Client.inBuffer.readString();
						} else {
							var77[var3 + 1] = new Integer(Client.inBuffer.readInt());
						}
					}

					var77[0] = new Integer(Client.inBuffer.readInt());
					NodeSub16 var89 = new NodeSub16();
					var89.anObjectArray2 = var77;
					staticMethod375(var89);
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 122) {
					var45 = Client.inBuffer.method353();
					var75 = Client.inBuffer.method368();
					staticIntArray63[var45] = var75;
					if (var75 != staticIntArray64[var45]) {
						staticIntArray64[var45] = var75;
					}

					staticMethod471(var45);
					Client.staticIntArray104[++Client.staticInt275 - 1 & 0x1f] = var45;
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 179) {
					var45 = Client.inBuffer.method379();
					var49 = Client.inBuffer.method367() == 1;
					var57 = "";
					var66 = false;
					if (var49) {
						var57 = Client.inBuffer.readString();
						if (staticMethod141(var57)) {
							var66 = true;
						}
					}

					String var71 = Client.inBuffer.readString();
					if (!var66) {
						staticMethod36(var45, var57, var71);
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 72) {
					var1 = Client.inBuffer.readString();
					var62 = staticMethod456(staticMethod265(staticMethod191(Client.inBuffer)));
					staticMethod36(6, var1, var62);
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 242) {
					var45 = Client.inBuffer.method354();
					var2 = Client.inBuffer.method356();
					var47 = staticMethod8(var45);
					if (var47.anInt327 != var2 || var2 == -1) {
						var47.anInt327 = var2;
						var47.anInt354 = 0;
						var47.anInt314 = 0;
						staticMethod73(var47);
					}

					Client.staticInt191 = -1;
					return true;
				}

				long var23;
				long var25;
				if (Client.staticInt191 == 65) {
					var45 = Client.inBuffer.readInt();
					var2 = Client.inBuffer.readInt();
					if (staticGarbageCollectorMXBean1 == null
							|| !staticGarbageCollectorMXBean1.isValid()) {
						try {
							Iterator var85 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

							while (var85.hasNext()) {
								GarbageCollectorMXBean var90 = (GarbageCollectorMXBean) var85.next();
								if (var90.isValid()) {
									staticGarbageCollectorMXBean1 = var90;
									Client.staticLong14 = -1L;
									Client.staticLong12 = -1L;
								}
							}
						} catch (Throwable var56) {
							;
						}
					}

					long var86 = staticMethod297();
					var5 = -1;
					if (staticGarbageCollectorMXBean1 != null) {
						var23 = staticGarbageCollectorMXBean1.getCollectionTime();
						if (Client.staticLong12 != -1L) {
							var16 = var23 - Client.staticLong12;
							var25 = var86 - Client.staticLong14;
							if (var25 != 0L) {
								var5 = (int) (var16 * 100L / var25);
							}
						}

						Client.staticLong12 = var23;
						Client.staticLong14 = var86;
					}

					Client.outBuffer.method471(178);
					Client.outBuffer.writeInt(var45);
					Client.outBuffer.method360(var2);
					Client.outBuffer.method373(GameShell.staticInt107);
					Client.outBuffer.method373(var5);
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 226) {
					for (var45 = 0; var45 < Client.staticPlayerArray1.length; var45++) {
						if (Client.staticPlayerArray1[var45] != null) {
							Client.staticPlayerArray1[var45].anInt612 = -1;
						}
					}

					for (var45 = 0; var45 < Client.staticNpcArray1.length; var45++) {
						if (Client.staticNpcArray1[var45] != null) {
							Client.staticNpcArray1[var45].anInt612 = -1;
						}
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 167) {
					decodeMapRegion(false);
					Client.inBuffer.method472();
					var45 = Client.inBuffer.method370();
					staticMethod313(Client.inBuffer, var45);
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 119) {
					var45 = Client.inBuffer.readInt();
					var2 = Client.inBuffer.method378();
					KeyFocusListener var84 = (KeyFocusListener) Client.staticHashTable5.method149(var2);
					var53 = (KeyFocusListener) Client.staticHashTable5.method149(var45);
					if (var53 != null) {
						staticMethod266(var53, var84 == null || var53.anInt384 != var84.anInt384);
					}

					if (var84 != null) {
						var84.method174();
						Client.staticHashTable5.method148(var84, var45);
					}

					var70 = staticMethod8(var2);
					if (var70 != null) {
						staticMethod73(var70);
					}

					var70 = staticMethod8(var45);
					if (var70 != null) {
						staticMethod73(var70);
						staticMethod135(Widget.staticWidgetArrayArray1[var70.anInt294 >>> 16], var70, true);
					}

					if (Client.staticInt263 != -1) {
						var6 = Client.staticInt263;
						if (staticMethod4(var6)) {
							staticMethod280(Widget.staticWidgetArrayArray1[var6], 1);
						}
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 81) {
					for (var45 = 0; var45 < Varp.staticInt323; var45++) {
						Varp var83 = staticMethod119(var45);
						if (var83 != null) {
							staticIntArray63[var45] = 0;
							staticIntArray64[var45] = 0;
						}
					}

					staticMethod250();
					Client.staticInt275 += 32;
					Client.staticInt191 = -1;
					return true;
				}

				Widget var61;
				if (Client.staticInt191 == 133) {
					var45 = Client.inBuffer.readInt();
					var61 = staticMethod8(var45);

					for (var3 = 0; var3 < var61.anIntArray76.length; var3++) {
						var61.anIntArray76[var3] = -1;
						var61.anIntArray76[var3] = 0;
					}

					staticMethod73(var61);
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 86) {
					var45 = Client.inBuffer.method367();
					if (Client.inBuffer.method367() == 0) {
						Client.staticClass61Array1[var45] = new Class61();
						Client.inBuffer.position += 18;
					} else {
						--Client.inBuffer.position;
						Client.staticClass61Array1[var45] = new Class61(Client.inBuffer, false);
					}

					Client.staticInt295 = Client.staticInt274 * 2073400987;
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 151) {
					staticMethod250();
					Client.staticInt267 = Client.inBuffer.method367();
					Client.staticInt283 = Client.staticInt274 * 2073400987;
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 35) {
					staticMethod398();

					for (var45 = 0; var45 < 2048; var45++) {
						Client.staticPlayerArray1[var45] = null;
					}

					GPI.initializeGPI(Client.inBuffer);
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 166) {
					while (Client.inBuffer.position < Client.staticInt190) {
						var45 = Client.inBuffer.method367();
						var49 = (var45 & 0x1) == 1;
						var57 = Client.inBuffer.readString();
						String var88 = Client.inBuffer.readString();
						Client.inBuffer.readString();

						Class7 var96;
						for (var5 = 0; var5 < Client.staticInt310; var5++) {
							var96 = Client.staticClass7Array1[var5];
							if (var49) {
								if (var88.equals(var96.aString5)) {
									var96.aString5 = var57;
									var96.aString4 = var88;
									var57 = null;
									break;
								}
							} else if (var57.equals(var96.aString5)) {
								var96.aString5 = var57;
								var96.aString4 = var88;
								var57 = null;
								break;
							}
						}

						if (var57 != null && Client.staticInt310 < 400) {
							var96 = new Class7();
							Client.staticClass7Array1[Client.staticInt310] = var96;
							var96.aString5 = var57;
							var96.aString4 = var88;
							++Client.staticInt310;
						}
					}

					Client.staticInt280 = Client.staticInt274 * 2073400987;
					Client.staticInt191 = -1;
					return true;
				}

				int var27;
				String var59;
				if (Client.staticInt191 == 238) {
					var1 = Client.inBuffer.readString();
					var12 = Client.inBuffer.readLong();
					var14 = Client.inBuffer.method370();
					var23 = Client.inBuffer.readTriByte();
					Class48[] var95 = new Class48[] { Class48.staticClass48_4, Class48.staticClass48_6,
							Class48.staticClass48_2, Class48.staticClass48_1, Class48.staticClass48_5,
							Class48.staticClass48_3 };
					Class48 var91 = (Class48) staticMethod233(var95, Client.inBuffer.method367());
					var25 = (var14 << 32) + var23;
					boolean var981 = false;

					for (var27 = 0; var27 < 100; var27++) {
						if (Client.staticLongArray3[var27] == var25) {
							var981 = true;
							break;
						}
					}

					if (var91.aBool14 && staticMethod141(var1)) {
						var981 = true;
					}

					if (!var981 && Client.staticInt245 == 0) {
						Client.staticLongArray3[Client.staticInt293] = var25;
						Client.staticInt293 = (Client.staticInt293 + 1) % 100;
						var59 = staticMethod456(staticMethod265(staticMethod191(Client.inBuffer)));
						if (var91.anInt192 != -1) {
							staticMethod224(9, staticMethod123(var91.anInt192) + var1, var59, staticMethod182(var12));
						} else {
							staticMethod224(9, var1, var59, staticMethod182(var12));
						}
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 51) {
					var45 = Client.inBuffer.method354();
					var62 = Client.inBuffer.readString();
					var47 = staticMethod8(var45);
					if (!var62.equals(var47.aString20)) {
						var47.aString20 = var62;
						staticMethod73(var47);
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 204) {
					var45 = Client.inBuffer.method362();
					var61 = staticMethod8(var45);
					var61.anInt348 = 3;
					var61.anInt295 = AbstractClass2Sub1.staticPlayer1.aClass49_1.method250();
					staticMethod73(var61);
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 140) {
					var45 = Client.inBuffer.method353();
					if (var45 == '\uffff') {
						var45 = -1;
					}

					var2 = Client.inBuffer.method362();
					var3 = Client.inBuffer.readInt();
					var48 = Client.inBuffer.method370();
					if (var48 == '\uffff') {
						var48 = -1;
					}

					for (var5 = var48; var5 <= var45; var5++) {
						var23 = ((long) var2 << 32) + var5;
						Node var94 = Client.staticHashTable6.method149(var23);
						if (var94 != null) {
							var94.method174();
						}

						Client.staticHashTable6.method148(new NodeSub15(var3), var23);
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 77) {
					decodeMapRegion(true);
					Client.inBuffer.method472();
					var45 = Client.inBuffer.method370();
					staticMethod313(Client.inBuffer, var45);
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 176) {
					var45 = Client.inBuffer.readInt();
					KeyFocusListener var931 = (KeyFocusListener) Client.staticHashTable5.method149(var45);
					if (var931 != null) {
						staticMethod266(var931, true);
					}

					if (Client.staticWidget6 != null) {
						staticMethod73(Client.staticWidget6);
						Client.staticWidget6 = null;
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 32) {
					Client.staticInt202 = 1;
					Client.staticInt280 = Client.staticInt274 * 2073400987;
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 99) {
					Client.staticInt296 = Client.inBuffer.method367();
					if (Client.staticInt296 == 255) {
						Client.staticInt296 = 0;
					}

					Client.staticInt240 = Client.inBuffer.method367();
					if (Client.staticInt240 == 255) {
						Client.staticInt240 = 0;
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 190) {
					staticMethod250();
					var45 = Client.inBuffer.method378();
					var2 = Client.inBuffer.method348();
					var3 = Client.inBuffer.method346();
					Client.staticIntArray108[var3] = var45;
					Client.staticIntArray91[var3] = var2;
					Client.staticIntArray96[var3] = 1;

					for (var48 = 0; var48 < 98; var48++) {
						if (var45 >= staticIntArray60[var48]) {
							Client.staticIntArray96[var3] = var48 + 2;
						}
					}

					Client.staticIntArray105[++Client.staticInt278 - 1 & 0x1f] = var3;
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 76) {
					var45 = Client.inBuffer.method370();
					var2 = Client.inBuffer.method367();
					var3 = Client.inBuffer.method354();
					var53 = (KeyFocusListener) Client.staticHashTable5.method149(var3);
					if (var53 != null) {
						staticMethod266(var53, var53.anInt384 != var45);
					}

					staticMethod315(var3, var45, var2);
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 136) {
					Client.staticInt281 = Client.staticInt274 * 2073400987;
					if (Client.staticInt190 == 0) {
						Client.staticString34 = null;
						Client.staticString29 = null;
						staticInt149 = 0;
						Class43.staticNodeSub1Array1 = null;
						Client.staticInt191 = -1;
						return true;
					}

					Client.staticString29 = Client.inBuffer.readString();
					long var92 = Client.inBuffer.readLong();
					Client.staticString34 = staticMethod5(var92);
					staticByte1 = Client.inBuffer.readByte();
					var3 = Client.inBuffer.method367();
					if (var3 == 255) {
						Client.staticInt191 = -1;
						return true;
					}

					staticInt149 = var3;
					NodeSub1[] var97 = new NodeSub1[100];

					for (var5 = 0; var5 < staticInt149; var5++) {
						var97[var5] = new NodeSub1();
						var97[var5].aString15 = Client.inBuffer.readString();
						var97[var5].aString16 = staticMethod111(var97[var5].aString15, staticClass53_1);
						var97[var5].anInt217 = Client.inBuffer.method370();
						var97[var5].aByte3 = Client.inBuffer.readByte();
						Client.inBuffer.readString();
						if (var97[var5].aString15.equals(AbstractClass2Sub1.staticPlayer1.aString40)) {
							staticByte3 = var97[var5].aByte3;
						}
					}

					var54 = false;
					var58 = staticInt149;

					while (var58 > 0) {
						var54 = true;
						--var58;

						for (var8 = 0; var8 < var58; var8++) {
							if (var97[var8].aString16.compareTo(var97[1 + var8].aString16) > 0) {
								NodeSub1 var99 = var97[var8];
								var97[var8] = var97[var8 + 1];
								var97[var8 + 1] = var99;
								var54 = false;
							}
						}

						if (var54) {
							break;
						}
					}

					Class43.staticNodeSub1Array1 = var97;
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 8) {
					staticInt122 = Client.inBuffer.method348();
					ChatMessage.staticInt331 = Client.inBuffer.method346();

					while (Client.inBuffer.position < Client.staticInt190) {
						Client.staticInt191 = Client.inBuffer.method367();
						staticMethod345();
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 89) {
					staticMethod313(Client.inBuffer, Client.staticInt190);
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 132) {
					var45 = Client.inBuffer.method372();
					var2 = Client.inBuffer.method362();
					var47 = staticMethod8(var2);
					if (var47.anInt348 != 2 || var47.anInt295 != var45) {
						var47.anInt348 = 2;
						var47.anInt295 = var45;
						staticMethod73(var47);
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 127) {
					staticMethod476(Client.inBuffer.readString());
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 161) {
					Client.staticInt255 = Client.inBuffer.method367();
					if (Client.staticInt255 == 1) {
						Client.staticInt172 = Client.inBuffer.method370();
					}

					if (Client.staticInt255 >= 2 && Client.staticInt255 <= 6) {
						if (Client.staticInt255 == 2) {
							Client.staticInt177 = 64;
							Client.staticInt178 = 64;
						}

						if (Client.staticInt255 == 3) {
							Client.staticInt177 = 0;
							Client.staticInt178 = 64;
						}

						if (Client.staticInt255 == 4) {
							Client.staticInt177 = 128;
							Client.staticInt178 = 64;
						}

						if (Client.staticInt255 == 5) {
							Client.staticInt177 = 64;
							Client.staticInt178 = 0;
						}

						if (Client.staticInt255 == 6) {
							Client.staticInt177 = 64;
							Client.staticInt178 = 128;
						}

						Client.staticInt255 = 2;
						Client.staticInt174 = Client.inBuffer.method370();
						Client.staticInt175 = Client.inBuffer.method370();
						Client.staticInt176 = Client.inBuffer.method367();
					}

					if (Client.staticInt255 == 10) {
						Client.staticInt193 = Client.inBuffer.method370();
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 178) {
					var45 = Client.inBuffer.method354();
					KeyboardHandler.staticTask2 = BufferedFile.staticTaskManager1.method95(var45);
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 2) {
					var45 = Client.inBuffer.method354();
					var2 = Client.inBuffer.method353();
					if (var2 == '\uffff') {
						var2 = -1;
					}

					var3 = Client.inBuffer.method378();
					var4 = staticMethod8(var45);
					ItemDefinition var891;
					if (!var4.aBool42) {
						if (var2 == -1) {
							var4.anInt348 = 0;
							Client.staticInt191 = -1;
							return true;
						}

						var891 = staticMethod153(var2);
						var4.anInt348 = 4;
						var4.anInt295 = var2;
						var4.anInt325 = var891.anInt456;
						var4.anInt332 = var891.anInt466;
						var4.anInt334 = var891.anInt444 * 100 / var3;
						staticMethod73(var4);
					} else {
						var4.anInt352 = var2;
						var4.anInt353 = var3;
						var891 = staticMethod153(var2);
						var4.anInt325 = var891.anInt456;
						var4.anInt332 = var891.anInt466;
						var4.anInt324 = var891.anInt468;
						var4.anInt329 = var891.anInt436;
						var4.anInt330 = var891.anInt452;
						var4.anInt334 = var891.anInt444;
						if (var891.anInt442 == 1) {
							var4.anInt337 = 1;
						} else {
							var4.anInt337 = 2;
						}

						if (var4.anInt291 > 0) {
							var4.anInt334 = var4.anInt334 * 32 / var4.anInt291;
						} else if (var4.anInt304 > 0) {
							var4.anInt334 = var4.anInt334 * 32 / var4.anInt304;
						}

						staticMethod73(var4);
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 124) {
					if (Client.staticInt263 != -1) {
						var45 = Client.staticInt263;
						if (staticMethod4(var45)) {
							staticMethod280(Widget.staticWidgetArrayArray1[var45], 0);
						}
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 158) {
					BitBuf var87 = Client.inBuffer;
					var2 = Client.staticInt190;
					NodeSub17 var50 = new NodeSub17();
					var50.anInt367 = var87.method367();
					var50.anInt366 = var87.readInt();
					var50.anIntArray78 = new int[var50.anInt367];
					var50.anIntArray79 = new int[var50.anInt367];
					var50.aFieldArray1 = new Field[var50.anInt367];
					var50.anIntArray80 = new int[var50.anInt367];
					var50.aMethodArray1 = new Method[var50.anInt367];
					var50.aByteArrayArrayArray1 = new byte[var50.anInt367][][];

					for (var48 = 0; var48 < var50.anInt367; var48++) {
						try {
							var5 = var87.method367();
							String var41;
							if (var5 != 0 && var5 != 1 && var5 != 2) {
								if (var5 == 3 || var5 == 4) {
									var59 = var87.readString();
									var41 = var87.readString();
									var8 = var87.method367();
									String[] var11 = new String[var8];

									for (int var98 = 0; var98 < var8; var98++) {
										var11[var98] = var87.readString();
									}

									String var100 = var87.readString();
									byte[][] var19 = new byte[var8][];
									if (var5 == 3) {
										for (int var104 = 0; var104 < var8; var104++) {
											var27 = var87.readInt();
											var19[var104] = new byte[var27];
											var87.readBytes(var19[var104], 0, var27);
										}
									}

									var50.anIntArray78[var48] = var5;
									Class[] var101 = new Class[var8];

									for (var27 = 0; var27 < var8; var27++) {
										var101[var27] = staticMethod377(var11[var27]);
									}

									Class var111 = staticMethod377(var100);
									if (staticMethod377(var59).getClassLoader() == null) {
										throw new SecurityException();
									}

									Method[] var30 = staticMethod377(var59).getDeclaredMethods();
									Method[] var31 = var30;

									for (int var32 = 0; var32 < var31.length; var32++) {
										Method var33 = var31[var32];
										if (var33.getName().equals(var41)) {
											Class[] var34 = var33.getParameterTypes();
											if (var101.length == var34.length) {
												boolean var35 = true;

												for (int var36 = 0; var36 < var101.length; var36++) {
													if (var34[var36] != var101[var36]) {
														var35 = false;
														break;
													}
												}

												if (var35 && var111 == var33.getReturnType()) {
													var50.aMethodArray1[var48] = var33;
												}
											}
										}
									}

									var50.aByteArrayArrayArray1[var48] = var19;
								}
							} else {
								var59 = var87.readString();
								var41 = var87.readString();
								var8 = 0;
								if (var5 == 1) {
									var8 = var87.readInt();
								}

								var50.anIntArray78[var48] = var5;
								var50.anIntArray80[var48] = var8;
								if (staticMethod377(var59).getClassLoader() == null) {
									throw new SecurityException();
								}

								var50.aFieldArray1[var48] = staticMethod377(var59).getDeclaredField(var41);
							}
						} catch (ClassNotFoundException var51) {
							var50.anIntArray79[var48] = -1;
						} catch (SecurityException var52) {
							var50.anIntArray79[var48] = -2;
						} catch (NullPointerException var531) {
							var50.anIntArray79[var48] = -3;
						} catch (Exception var541) {
							var50.anIntArray79[var48] = -4;
						} catch (Throwable var55) {
							var50.anIntArray79[var48] = -5;
						}
					}

					staticClass36_1.method165(var50);
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 31) {
					Client.staticInt170 = Client.inBuffer.method370() * 30;
					Client.staticInt283 = Client.staticInt274 * 2073400987;
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 194) {
					var45 = Client.inBuffer.method378();
					var49 = Client.inBuffer.method377() == 1;
					var47 = staticMethod8(var45);
					if (var49 != var47.aBool32) {
						var47.aBool32 = var49;
						staticMethod73(var47);
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 123) {
					var45 = Client.inBuffer.readInt();
					var2 = Client.inBuffer.method355();
					var3 = var2 >> 10 & 0x1f;
					var48 = var2 >> 5 & 0x1f;
					var5 = var2 & 0x1f;
					var6 = (var5 << 3) + (var48 << 11) + (var3 << 19);
					Widget var7 = staticMethod8(var45);
					if (var7.anInt360 != var6) {
						var7.anInt360 = var6;
						staticMethod73(var7);
					}

					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 79) {
					var45 = Client.inBuffer.readInt();
					var2 = Client.inBuffer.method370();
					if (var45 < -70000) {
						var2 += '\u8000';
					}

					if (var45 >= 0) {
						var47 = staticMethod8(var45);
					} else {
						var47 = null;
					}

					for (; Client.inBuffer.position < Client.staticInt190; staticMethod104(var2, var48, var5 - 1,
							var6)) {
						var48 = Client.inBuffer.method379();
						var5 = Client.inBuffer.method370();
						var6 = 0;
						if (var5 != 0) {
							var6 = Client.inBuffer.method367();
							if (var6 == 255) {
								var6 = Client.inBuffer.readInt();
							}
						}

						if (var47 != null && var48 >= 0 && var48 < var47.anIntArray76.length) {
							var47.anIntArray76[var48] = var5;
							var47.anIntArray77[var48] = var6;
						}
					}

					if (var47 != null) {
						staticMethod73(var47);
					}

					staticMethod250();
					Client.staticIntArray86[++Client.staticInt276 - 1 & 0x1f] = var2 & 0x7fff;
					Client.staticInt191 = -1;
					return true;
				}

				if (Client.staticInt191 == 56) {
					var45 = Client.inBuffer.method354();
					var2 = Client.inBuffer.method364();
					var3 = Client.inBuffer.method364();
					var4 = staticMethod8(var45);
					if (var4.anInt302 != var3 || var4.anInt303 != var2 || var4.anInt299 != 0 || var4.anInt300 != 0) {
						var4.anInt302 = var3;
						var4.anInt303 = var2;
						var4.anInt299 = 0;
						var4.anInt300 = 0;
						staticMethod73(var4);
						staticMethod27(var4);
						if (var4.anInt296 == 0) {
							staticMethod135(Widget.staticWidgetArrayArray1[var45 >> 16], var4, false);
						}
					}

					Client.staticInt191 = -1;
					return true;
				}

				staticMethod285(Client.staticInt191 + staticString11 + -Client.staticInt194 + staticString11
						+ -Client.staticInt195 + staticString11 + Client.staticInt190, (Throwable) null);
				staticMethod87();
			} catch (IOException var571) {
				staticMethod329();
			} catch (Exception var581) {
				var1 = Client.staticInt191 + staticString11 + -Client.staticInt194 + staticString11
						+ -Client.staticInt195 + staticString11 + Client.staticInt190 + staticString11
						+ (AbstractClass2Sub1.staticPlayer1.anIntArray127[0] + NodeSub3.staticInt154)
						+ staticString11
						+ (Class34.staticInt75 + AbstractClass2Sub1.staticPlayer1.anIntArray122[0])
						+ staticString11;

				for (var2 = 0; var2 < Client.staticInt190 && var2 < 50; var2++) {
					var1 = var1 + Client.inBuffer.buf[var2] + staticString11;
				}

				staticMethod285(var1, var581);
				staticMethod87();
			}

			return true;
		}
	}

	static void staticMethod311(int var0, int var1, int var2) {
		if (Client.staticInt300 * 127 != 0 && var1 != 0 && Client.staticInt236 < 50) {
			Client.staticIntArray114[Client.staticInt236] = var0;
			Client.staticIntArray115[Client.staticInt236] = var1;
			Client.staticIntArray116[Client.staticInt236] = var2;
			Client.staticClass9Array1[Client.staticInt236] = null;
			Client.staticIntArray117[Client.staticInt236] = 0;
			++Client.staticInt236;
		}

	}

	static final void staticMethod312(Class59 var0) {
		if (Client.staticInt296 == AbstractClass2Sub1.staticPlayer1.anInt628 >> 7
				&& Client.staticInt240 == AbstractClass2Sub1.staticPlayer1.anInt591 >> 7) {
			Client.staticInt296 = 0;
		}

		int var4 = staticInt24;
		int[] var1 = staticIntArray7;
		int var5 = var4;
		if (var0 == Class59.staticClass59_1 || var0 == Class59.staticClass59_3) {
			var5 = 1;
		}

		for (int var2 = 0; var2 < var5; var2++) {
			int var3;
			Player var6;
			if (Class59.staticClass59_1 == var0) {
				var6 = AbstractClass2Sub1.staticPlayer1;
				var3 = AbstractClass2Sub1.staticPlayer1.anInt686 << 14;
			} else if (Class59.staticClass59_3 == var0) {
				var6 = Client.staticPlayerArray1[Client.staticInt229];
				var3 = Client.staticInt229 << 14;
			} else {
				var6 = Client.staticPlayerArray1[var1[var2]];
				var3 = var1[var2] << 14;
				if (var0 == Class59.staticClass59_4 && Client.staticInt229 == var1[var2]) {
					continue;
				}
			}

			if (var6 != null && var6.method565() && !var6.aBool81) {
				var6.aBool83 = false;
				if ((Client.lowMemory && var4 > 50 || var4 > 200) && Class59.staticClass59_1 != var0
						&& var6.anInt594 == var6.anInt590) {
					var6.aBool83 = true;
				}

				int var7 = var6.anInt628 >> 7;
				int var8 = var6.anInt591 >> 7;
				if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
					if (var6.aModel1 != null && Client.staticInt166 >= var6.anInt688
							&& Client.staticInt166 < var6.anInt699) {
						var6.aBool83 = false;
						var6.anInt687 = staticMethod240(var6.anInt628, var6.anInt591, NodeSub4.staticInt155);
						Friend.staticScene1.method133(NodeSub4.staticInt155, var6.anInt628, var6.anInt591,
								var6.anInt687, 60, var6, var6.anInt592, var3, var6.anInt682, var6.anInt693,
								var6.anInt694, var6.anInt695);
					} else {
						if ((var6.anInt628 & 0x7f) == 64 && (var6.anInt591 & 0x7f) == 64) {
							if (Client.staticInt292 == Client.staticIntArrayArray9[var7][var8]) {
								continue;
							}

							Client.staticIntArrayArray9[var7][var8] = Client.staticInt292;
						}

						var6.anInt687 = staticMethod240(var6.anInt628, var6.anInt591, NodeSub4.staticInt155);
						Friend.staticScene1.method102(NodeSub4.staticInt155, var6.anInt628, var6.anInt591,
								var6.anInt687, 60, var6, var6.anInt592, var3, var6.aBool74);
					}
				}
			}
		}

	}

	static final void staticMethod313(BitBuf var0, int var1) {
		int var2 = var0.position;
		staticInt22 = 0;
		staticMethod263(var0);
		staticMethod44(var0);
		if (var1 != var0.position - var2) {
			throw new RuntimeException(var0.position - var2 + " " + var1);
		}
	}

	static void staticMethod314() {
		staticString2 = staticString2.trim();
		if (staticString2.length() == 0) {
			GPI.staticMethod231("Please enter your username.", "If you created your account after November",
					"2010, this will be the creation email address.");
		} else {
			long var1 = staticMethod222();
			int var0;
			if (var1 == 0L) {
				var0 = 5;
			} else {
				var0 = staticMethod252(var1, staticString2);
			}

			switch (var0) {
			case 2:
				GPI.staticMethod231("", "Page has opened in a new window.", "(Please check your popup blocker.)");
				staticInt13 = 6;
				break;
			case 3:
				GPI.staticMethod231("", "Error connecting to server.", "");
				break;
			case 4:
				GPI.staticMethod231("The part of the website you are trying", "to connect to is offline at the moment.",
						"Please try again later.");
				break;
			case 5:
				GPI.staticMethod231("Sorry, there was an error trying to", "log you in to this part of the website.",
						"Please try again later.");
				break;
			case 6:
				GPI.staticMethod231("", "Error connecting to server.", "");
				break;
			case 7:
				GPI.staticMethod231("You must enter a valid login to proceed. For accounts",
						"created after 24th November 2010, please use your",
						"email address. Otherwise please use your username.");
			}
		}

	}

	static final KeyFocusListener staticMethod315(int var0, int var1, int var2) {
		KeyFocusListener var3 = new KeyFocusListener();
		var3.anInt384 = var1;
		var3.anInt383 = var2;
		Client.staticHashTable5.method148(var3, var0);
		staticMethod393(var1);
		Widget var4 = staticMethod8(var0);
		staticMethod73(var4);
		if (Client.staticWidget6 != null) {
			staticMethod73(Client.staticWidget6);
			Client.staticWidget6 = null;
		}

		staticMethod253();
		staticMethod135(Widget.staticWidgetArrayArray1[var0 >> 16], var4, false);
		staticMethod2(var1);
		if (Client.staticInt263 != -1) {
			int var5 = Client.staticInt263;
			if (staticMethod4(var5)) {
				staticMethod280(Widget.staticWidgetArrayArray1[var5], 1);
			}
		}

		return var3;
	}

	static final void staticMethod316(String var0) {
		if (Class43.staticNodeSub1Array1 != null) {
			Client.outBuffer.method471(214);
			Client.outBuffer.writeByte(staticMethod378(var0));
			Client.outBuffer.writeString(var0);
		}

	}

	static void staticMethod317() {
		if (staticBool2) {
			staticRasterizer2DSub3_4 = null;
			staticRasterizer2DSub3_1 = null;
			staticRasterizer2DSub3Array5 = null;
			staticSprite2 = null;
			staticSprite1 = null;
			Config5.staticRasterizer2DSub3_6 = null;
			Class33.staticRasterizer2DSub3Array3 = null;
			staticRasterizer2DSub3_2 = null;
			staticRasterizer2DSub3_3 = null;
			staticSpriteArray5 = null;
			staticRasterizer2DSub3Array4 = null;
			AbstractClass3Sub1.staticRasterizer2DSub3Array6 = null;
			RenderableSub2.staticRasterizer2DSub3Array8 = null;
			Client.staticRasterizer2DSub3_5 = null;
			staticIntArray67 = null;
			staticIntArray61 = null;
			staticIntArray3 = null;
			Class57.staticIntArray74 = null;
			staticIntArray6 = null;
			staticIntArray5 = null;
			Class61.staticIntArray77 = null;
			staticIntArray62 = null;
			staticMethod108(2);
			staticMethod1(true);
			staticBool2 = false;
		}

	}

	static final boolean staticMethod318(Widget var0) {
		if (var0.anIntArray73 == null) {
			return false;
		} else {
			for (int var1 = 0; var1 < var0.anIntArray73.length; var1++) {
				int var2 = staticMethod42(var0, var1);
				int var3 = var0.anIntArray70[var1];
				if (var0.anIntArray73[var1] == 2) {
					if (var2 >= var3) {
						return false;
					}
				} else if (var0.anIntArray73[var1] == 3) {
					if (var2 <= var3) {
						return false;
					}
				} else if (var0.anIntArray73[var1] == 4) {
					if (var3 == var2) {
						return false;
					}
				} else if (var3 != var2) {
					return false;
				}
			}

			return true;
		}
	}

	public static byte staticMethod319(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
			var1 = (byte) var0;
		} else if (var0 == 8364) {
			var1 = -128;
		} else if (var0 == 8218) {
			var1 = -126;
		} else if (var0 == 402) {
			var1 = -125;
		} else if (var0 == 8222) {
			var1 = -124;
		} else if (var0 == 8230) {
			var1 = -123;
		} else if (var0 == 8224) {
			var1 = -122;
		} else if (var0 == 8225) {
			var1 = -121;
		} else if (var0 == 710) {
			var1 = -120;
		} else if (var0 == 8240) {
			var1 = -119;
		} else if (var0 == 352) {
			var1 = -118;
		} else if (var0 == 8249) {
			var1 = -117;
		} else if (var0 == 338) {
			var1 = -116;
		} else if (var0 == 381) {
			var1 = -114;
		} else if (var0 == 8216) {
			var1 = -111;
		} else if (var0 == 8217) {
			var1 = -110;
		} else if (var0 == 8220) {
			var1 = -109;
		} else if (var0 == 8221) {
			var1 = -108;
		} else if (var0 == 8226) {
			var1 = -107;
		} else if (var0 == 8211) {
			var1 = -106;
		} else if (var0 == 8212) {
			var1 = -105;
		} else if (var0 == 732) {
			var1 = -104;
		} else if (var0 == 8482) {
			var1 = -103;
		} else if (var0 == 353) {
			var1 = -102;
		} else if (var0 == 8250) {
			var1 = -101;
		} else if (var0 == 339) {
			var1 = -100;
		} else if (var0 == 382) {
			var1 = -98;
		} else if (var0 == 376) {
			var1 = -97;
		} else {
			var1 = 63;
		}

		return var1;
	}

	static final void staticMethod324(Actor var0, int var1) {
		if (var0.anInt625 > Client.staticInt166) {
			staticMethod81(var0);
		} else if (var0.anInt604 >= Client.staticInt166) {
			staticMethod126(var0);
		} else {
			staticMethod472(var0);
		}

		if (var0.anInt628 < 128 || var0.anInt591 < 128 || var0.anInt628 >= 13184 || var0.anInt591 >= 13184) {
			var0.anInt612 = -1;
			var0.anInt596 = -1;
			var0.anInt625 = 0;
			var0.anInt604 = 0;
			var0.anInt628 = var0.anIntArray127[0] * 128 + var0.anInt626 * 64;
			var0.anInt591 = var0.anIntArray122[0] * 128 + var0.anInt626 * 64;
			var0.method567();
		}

		if (var0 == AbstractClass2Sub1.staticPlayer1
				&& (var0.anInt628 < 1536 || var0.anInt591 < 1536 || var0.anInt628 >= 11776 || var0.anInt591 >= 11776)) {
			var0.anInt612 = -1;
			var0.anInt596 = -1;
			var0.anInt625 = 0;
			var0.anInt604 = 0;
			var0.anInt628 = var0.anInt626 * 64 + var0.anIntArray127[0] * 128;
			var0.anInt591 = var0.anInt626 * 64 + var0.anIntArray122[0] * 128;
			var0.method567();
		}

		if (var0.anInt631 != 0) {
			if (var0.anInt600 != -1) {
				Object var5 = null;
				if (var0.anInt600 < '\u8000') {
					var5 = Client.staticNpcArray1[var0.anInt600];
				} else if (var0.anInt600 >= '\u8000') {
					var5 = Client.staticPlayerArray1[var0.anInt600 - '\u8000'];
				}

				if (var5 != null) {
					int var6 = var0.anInt628 - ((Actor) var5).anInt628;
					int var4 = var0.anInt591 - ((Actor) var5).anInt591;
					if (var6 != 0 || var4 != 0) {
						var0.anInt630 = (int) (Math.atan2(var6, var4) * 325.949D) & 0x7ff;
					}
				} else if (var0.aBool76) {
					var0.anInt600 = -1;
					var0.aBool76 = false;
				}
			}

			if (var0.anInt608 != -1 && (var0.anInt632 == 0 || var0.anInt633 > 0)) {
				var0.anInt630 = var0.anInt608;
				var0.anInt608 = -1;
			}

			int var51 = var0.anInt630 - var0.anInt592 & 0x7ff;
			if (var51 == 0 && var0.aBool76) {
				var0.anInt600 = -1;
				var0.aBool76 = false;
			}

			if (var51 != 0) {
				++var0.anInt629;
				boolean var61;
				if (var51 > 1024) {
					var0.anInt592 -= var0.anInt631;
					var61 = true;
					if (var51 < var0.anInt631 || var51 > 2048 - var0.anInt631) {
						var0.anInt592 = var0.anInt630;
						var61 = false;
					}

					if (var0.anInt594 == var0.anInt590 && (var0.anInt629 > 25 || var61)) {
						if (var0.anInt634 != -1) {
							var0.anInt590 = var0.anInt634;
						} else {
							var0.anInt590 = var0.anInt621;
						}
					}
				} else {
					var0.anInt592 += var0.anInt631;
					var61 = true;
					if (var51 < var0.anInt631 || var51 > 2048 - var0.anInt631) {
						var0.anInt592 = var0.anInt630;
						var61 = false;
					}

					if (var0.anInt594 == var0.anInt590 && (var0.anInt629 > 25 || var61)) {
						if (-var0.anInt595 != -1) {
							var0.anInt590 = -var0.anInt595;
						} else {
							var0.anInt590 = var0.anInt621;
						}
					}
				}

				var0.anInt592 &= 2047;
			} else {
				var0.anInt629 = 0;
			}
		}

		staticMethod15(var0);
	}

	static int staticMethod325(int var0, CacheableSub1 var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = staticMethod8(staticIntArray16[--staticInt27]);
		} else {
			var3 = var2 ? Class3.staticWidget1 : staticWidget2;
		}

		String var5 = staticStringArray1[--staticInt148];
		int[] var6 = null;
		if (var5.length() > 0 && var5.charAt(var5.length() - 1) == 89) {
			int var8 = staticIntArray16[--staticInt27];
			if (var8 > 0) {
				for (var6 = new int[var8]; var8-- > 0; var6[var8] = staticIntArray16[--staticInt27]) {
					;
				}
			}

			var5 = var5.substring(0, var5.length() - 1);
		}

		Object[] var81 = new Object[var5.length() + 1];

		int var7;
		for (var7 = var81.length - 1; var7 >= 1; --var7) {
			if (var5.charAt(var7 - 1) == 115) {
				var81[var7] = staticStringArray1[--staticInt148];
			} else {
				var81[var7] = new Integer(staticIntArray16[--staticInt27]);
			}
		}

		var7 = staticIntArray16[--staticInt27];
		if (var7 != -1) {
			var81[0] = new Integer(var7);
		} else {
			var81 = null;
		}

		if (var0 == 1400) {
			var3.anObjectArray5 = var81;
		} else if (var0 == 1401) {
			var3.anObjectArray6 = var81;
		} else if (var0 == 1402) {
			var3.anObjectArray29 = var81;
		} else if (var0 == 1403) {
			var3.anObjectArray7 = var81;
		} else if (var0 == 1404) {
			var3.anObjectArray9 = var81;
		} else if (var0 == 1405) {
			var3.anObjectArray10 = var81;
		} else if (var0 == 1406) {
			var3.anObjectArray12 = var81;
		} else if (var0 == 1407) {
			var3.anObjectArray13 = var81;
			var3.anIntArray74 = var6;
		} else if (var0 == 1408) {
			var3.anObjectArray16 = var81;
		} else if (var0 == 1409) {
			var3.anObjectArray17 = var81;
		} else if (var0 == 1410) {
			var3.anObjectArray28 = var81;
		} else if (var0 == 1411) {
			var3.anObjectArray3 = var81;
		} else if (var0 == 1412) {
			var3.anObjectArray8 = var81;
		} else if (var0 == 1414) {
			var3.anObjectArray14 = var81;
			var3.anIntArray69 = var6;
		} else if (var0 == 1415) {
			var3.anObjectArray15 = var81;
			var3.anIntArray71 = var6;
		} else if (var0 == 1416) {
			var3.anObjectArray11 = var81;
		} else if (var0 == 1417) {
			var3.anObjectArray30 = var81;
		} else if (var0 == 1418) {
			var3.anObjectArray18 = var81;
		} else if (var0 == 1419) {
			var3.anObjectArray19 = var81;
		} else if (var0 == 1420) {
			var3.anObjectArray20 = var81;
		} else if (var0 == 1421) {
			var3.anObjectArray21 = var81;
		} else if (var0 == 1422) {
			var3.anObjectArray22 = var81;
		} else if (var0 == 1423) {
			var3.anObjectArray23 = var81;
		} else if (var0 == 1424) {
			var3.anObjectArray24 = var81;
		} else if (var0 == 1425) {
			var3.anObjectArray26 = var81;
		} else if (var0 == 1426) {
			var3.anObjectArray27 = var81;
		} else {
			if (var0 != 1427) {
				return 2;
			}

			var3.anObjectArray25 = var81;
		}

		var3.aBool31 = true;
		return 1;
	}

	public static void staticMethod326() {
		synchronized (FileRequestTask.staticObject1) {
			if (FileRequestTask.staticInt128 != 0) {
				FileRequestTask.staticInt128 = 1;

				try {
					FileRequestTask.staticObject1.wait();
				} catch (InterruptedException var3) {
					;
				}
			}

		}
	}

	static final void staticMethod327(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.staticInt162; var4++) {
			if (Client.staticIntArray107[var4] + Client.staticIntArray82[var4] > var0
					&& Client.staticIntArray82[var4] < var0 + var2
					&& Client.staticIntArray88[var4] + Client.staticIntArray106[var4] > var1
					&& Client.staticIntArray88[var4] < var1 + var3) {
				Client.staticBoolArray8[var4] = true;
			}
		}

	}

	static int staticMethod331(int var0, CacheableSub1 var1, boolean var2) {
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = staticMethod8(staticIntArray16[--staticInt27]);
		} else {
			var4 = var2 ? Class3.staticWidget1 : staticWidget2;
		}

		int var3;
		if (var0 == 1300) {
			var3 = staticIntArray16[--staticInt27] - 1;
			if (var3 >= 0 && var3 <= 9) {
				var4.method393(var3, staticStringArray1[--staticInt148]);
				return 1;
			} else {
				--staticInt148;
				return 1;
			}
		} else if (var0 == 1301) {
			staticInt27 -= 2;
			var3 = staticIntArray16[staticInt27];
			int var5 = staticIntArray16[staticInt27 + 1];
			var4.aWidget3 = staticMethod32(var3, var5);
			return 1;
		} else if (var0 == 1302) {
			var4.aBool41 = staticIntArray16[--staticInt27] == 1;
			return 1;
		} else if (var0 == 1303) {
			var4.anInt345 = staticIntArray16[--staticInt27];
			return 1;
		} else if (var0 == 1304) {
			var4.anInt316 = staticIntArray16[--staticInt27];
			return 1;
		} else if (var0 == 1305) {
			var4.aString21 = staticStringArray1[--staticInt148];
			return 1;
		} else if (var0 == 1306) {
			var4.aString22 = staticStringArray1[--staticInt148];
			return 1;
		} else if (var0 == 1307) {
			var4.aStringArray4 = null;
			return 1;
		} else {
			return 2;
		}
	}

	static boolean staticMethod332(String var0) {
		if (var0 == null) {
			return false;
		} else {
			try {
				new URL(var0);
				return true;
			} catch (MalformedURLException var2) {
				return false;
			}
		}
	}

	static final void staticMethod333(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var1 + var3; var4++) {
			for (int var5 = var0; var5 <= var2 + var0; var5++) {
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
					staticByteArrayArrayArray2[0][var5][var4] = 127;
					if (var5 == var0 && var5 > 0) {
						staticIntArrayArrayArray1[0][var5][var4] = staticIntArrayArrayArray1[0][var5
								- 1][var4];
					}

					if (var2 + var0 == var5 && var5 < 103) {
						staticIntArrayArrayArray1[0][var5][var4] = staticIntArrayArrayArray1[0][1
								+ var5][var4];
					}

					if (var4 == var1 && var4 > 0) {
						staticIntArrayArrayArray1[0][var5][var4] = staticIntArrayArrayArray1[0][var5][var4
								- 1];
					}

					if (var4 == var1 + var3 && var4 < 103) {
						staticIntArrayArrayArray1[0][var5][var4] = staticIntArrayArrayArray1[0][var5][1
								+ var4];
					}
				}
			}
		}

	}

	static final void staticMethod279(String var0) {
		if (!var0.equals("")) {
			Client.outBuffer.method471(164);
			Client.outBuffer.writeByte(staticMethod378(var0));
			Client.outBuffer.writeString(var0);
		}

	}

	static final void staticMethod280(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; var2++) {
			Widget var3 = var0[var2];
			if (var3 != null) {
				if (var3.anInt296 == 0) {
					if (var3.aWidgetArray1 != null) {
						staticMethod280(var3.aWidgetArray1, var1);
					}

					KeyFocusListener var6 = (KeyFocusListener) Client.staticHashTable5.method149(var3.anInt294);
					if (var6 != null) {
						int var7 = var6.anInt384;
						if (staticMethod4(var7)) {
							staticMethod280(Widget.staticWidgetArrayArray1[var7], var1);
						}
					}
				}

				NodeSub16 var61;
				if (var1 == 0 && var3.anObjectArray23 != null) {
					var61 = new NodeSub16();
					var61.aWidget1 = var3;
					var61.anObjectArray2 = var3.anObjectArray23;
					staticMethod375(var61);
				}

				if (var1 == 1 && var3.anObjectArray24 != null) {
					if (var3.anInt319 >= 0) {
						Widget var71 = staticMethod8(var3.anInt294);
						if (var71 == null || var71.aWidgetArray1 == null || var3.anInt319 >= var71.aWidgetArray1.length
								|| var71.aWidgetArray1[var3.anInt319] != var3) {
							continue;
						}
					}

					var61 = new NodeSub16();
					var61.aWidget1 = var3;
					var61.anObjectArray2 = var3.anObjectArray24;
					staticMethod375(var61);
				}
			}
		}

	}

	static void staticMethod342(int var0, String var1) {
		int var2 = staticInt24;
		int[] var5 = staticIntArray7;
		boolean var6 = false;

		for (int var4 = 0; var4 < var2; var4++) {
			Player var3 = Client.staticPlayerArray1[var5[var4]];
			if (var3 != null && var3 != AbstractClass2Sub1.staticPlayer1 && var3.aString40 != null
					&& var3.aString40.equalsIgnoreCase(var1)) {
				if (var0 == 1) {
					Client.outBuffer.method471(197);
					Client.outBuffer.method351(var5[var4]);
					Client.outBuffer.method343(0);
				} else if (var0 == 4) {
					Client.outBuffer.method471(98);
					Client.outBuffer.method343(0);
					Client.outBuffer.method369(var5[var4]);
				} else if (var0 == 6) {
					Client.outBuffer.method471(240);
					Client.outBuffer.method343(0);
					Client.outBuffer.method351(var5[var4]);
				} else if (var0 == 7) {
					Client.outBuffer.method471(101);
					Client.outBuffer.method351(var5[var4]);
					Client.outBuffer.writeByte(0);
				}

				var6 = true;
				break;
			}
		}

		if (!var6) {
			staticMethod36(4, "", "Unable to find " + var1);
		}

	}

	static CacheableSub2 staticMethod343(int var0) {
		CacheableSub2 var1 = (CacheableSub2) AnimDef.staticCache31.get(var0);
		if (var1 != null) {
			return var1;
		} else {
			var1 = staticMethod216(AnimDef.staticJs5Index32, AnimDef.staticJs5Index31, var0, false);
			if (var1 != null) {
				AnimDef.staticCache31.method170(var1, var0);
			}

			return var1;
		}
	}

	public static void staticMethod344(Component var0) {
		var0.removeKeyListener(KeyboardHandler.staticKeyboardHandler1);
		var0.removeFocusListener(KeyboardHandler.staticKeyboardHandler1);
		KeyboardHandler.staticInt78 = -1;
	}

	static final void staticMethod345() {
		int var2;
		int var3;
		int var4;
		int var8;
		int var9;
		int var10;
		int var14;
		int var15;
		int var18;
		if (Client.staticInt191 == 97) {
			var14 = Client.inBuffer.method355();
			var2 = Client.inBuffer.method353();
			var3 = Client.inBuffer.method370();
			byte var29 = Client.inBuffer.method350();
			var4 = Client.inBuffer.method353();
			byte var31 = Client.inBuffer.method368();
			byte var35 = Client.inBuffer.method368();
			byte var37 = Client.inBuffer.method349();
			var10 = Client.inBuffer.method346();
			var15 = staticInt122 + (var10 >> 4 & 0x7);
			var18 = (var10 & 0x7) + ChatMessage.staticInt331;
			var8 = Client.inBuffer.method377();
			var9 = var8 >> 2;
			int var36 = var8 & 0x3;
			int var34 = Client.staticIntArray84[var9];
			Player var7;
			if (Client.myPlayerIndex == var2) {
				var7 = AbstractClass2Sub1.staticPlayer1;
			} else {
				var7 = Client.staticPlayerArray1[var2];
			}

			if (var7 != null) {
				ObjectDefinition var12 = staticMethod394(var3);
				int var13;
				int var19;
				if (var36 != 1 && var36 != 3) {
					var13 = var12.anInt485;
					var19 = var12.anInt486;
				} else {
					var13 = var12.anInt486;
					var19 = var12.anInt485;
				}

				int var16 = (var13 >> 1) + var15;
				int var17 = (var13 + 1 >> 1) + var15;
				int var28 = (var19 >> 1) + var18;
				int var20 = var18 + (var19 + 1 >> 1);
				int[][] var24 = staticIntArrayArrayArray1[NodeSub4.staticInt155];
				int var25 = var24[var17][var28] + var24[var16][var28] + var24[var16][var20] + var24[var17][var20] >> 2;
				int var21 = (var15 << 7) + (var13 << 6);
				int var22 = (var19 << 6) + (var18 << 7);
				Model var26 = var12.method519(var9, var36, var24, var21, var25, var22);
				if (var26 != null) {
					staticMethod110(NodeSub4.staticInt155, var15, var18, var34, -1, 0, 0, 1 + var4, 1 + var14);
					var7.anInt688 = var4 + Client.staticInt166;
					var7.anInt699 = Client.staticInt166 + var14;
					var7.aModel1 = var26;
					var7.anInt690 = var15 * 128 + var13 * 64;
					var7.anInt696 = var19 * 64 + var18 * 128;
					var7.anInt689 = var25;
					byte var27;
					if (var35 > var37) {
						var27 = var35;
						var35 = var37;
						var37 = var27;
					}

					if (var31 > var29) {
						var27 = var31;
						var31 = var29;
						var29 = var27;
					}

					var7.anInt682 = var15 + var35;
					var7.anInt694 = var15 + var37;
					var7.anInt693 = var18 + var31;
					var7.anInt695 = var29 + var18;
				}
			}
		}

		int var291;
		int var30;
		int var311;
		int var32;
		if (Client.staticInt191 == 29) {
			var14 = Client.inBuffer.method353();
			var2 = Client.inBuffer.method367();
			var3 = var2 >> 2;
			var32 = var2 & 0x3;
			var4 = Client.staticIntArray84[var3];
			var311 = Client.inBuffer.method367();
			var291 = (var311 >> 4 & 0x7) + staticInt122;
			var30 = ChatMessage.staticInt331 + (var311 & 0x7);
			if (var291 >= 0 && var30 >= 0 && var291 < 103 && var30 < 103) {
				if (var4 == 0) {
					Class31 var33 = Friend.staticScene1.method100(NodeSub4.staticInt155, var291, var30);
					if (var33 != null) {
						var15 = var33.anInt114 >> 14 & 0x7fff;
						if (var3 == 2) {
							var33.aRenderable5 = new GameObject(var15, 2, 4 + var32, NodeSub4.staticInt155, var291,
									var30, var14, false, var33.aRenderable5);
							var33.aRenderable4 = new GameObject(var15, 2, 1 + var32 & 0x3, NodeSub4.staticInt155,
									var291, var30, var14, false, var33.aRenderable4);
						} else {
							var33.aRenderable5 = new GameObject(var15, var3, var32, NodeSub4.staticInt155, var291,
									var30, var14, false, var33.aRenderable5);
						}
					}
				}

				if (var4 == 1) {
					WallObject var341 = Friend.staticScene1.method110(NodeSub4.staticInt155, var291, var30);
					if (var341 != null) {
						var15 = var341.anInt135 >> 14 & 0x7fff;
						if (var3 != 4 && var3 != 5) {
							if (var3 == 6) {
								var341.aRenderable8 = new GameObject(var15, 4, 4 + var32, NodeSub4.staticInt155, var291,
										var30, var14, false, var341.aRenderable8);
							} else if (var3 == 7) {
								var341.aRenderable8 = new GameObject(var15, 4, 4 + (var32 + 2 & 0x3),
										NodeSub4.staticInt155, var291, var30, var14, false, var341.aRenderable8);
							} else if (var3 == 8) {
								var341.aRenderable8 = new GameObject(var15, 4, 4 + var32, NodeSub4.staticInt155, var291,
										var30, var14, false, var341.aRenderable8);
								var341.aRenderable7 = new GameObject(var15, 4, (2 + var32 & 0x3) + 4,
										NodeSub4.staticInt155, var291, var30, var14, false, var341.aRenderable7);
							}
						} else {
							var341.aRenderable8 = new GameObject(var15, 4, var32, NodeSub4.staticInt155, var291, var30,
									var14, false, var341.aRenderable8);
						}
					}
				}

				if (var4 == 2) {
					Class32 var351 = Friend.staticScene1.method111(NodeSub4.staticInt155, var291, var30);
					if (var3 == 11) {
						var3 = 10;
					}

					if (var351 != null) {
						var351.aRenderable6 = new GameObject(var351.anInt127 >> 14 & 0x7fff, var3, var32,
								NodeSub4.staticInt155, var291, var30, var14, false, var351.aRenderable6);
					}
				}

				if (var4 == 3) {
					Class33 var371 = Friend.staticScene1.method112(NodeSub4.staticInt155, var291, var30);
					if (var371 != null) {
						var371.aRenderable9 = new GameObject(var371.anInt140 >> 14 & 0x7fff, 22, var32,
								NodeSub4.staticInt155, var291, var30, var14, false, var371.aRenderable9);
					}
				}
			}
		} else if (Client.staticInt191 == 23) {
			var14 = Client.inBuffer.method367();
			var2 = staticInt122 + (var14 >> 4 & 0x7);
			var3 = ChatMessage.staticInt331 + (var14 & 0x7);
			var32 = Client.inBuffer.method370();
			var4 = Client.inBuffer.method370();
			var311 = Client.inBuffer.method370();
			if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
				Class39 var38 = Client.staticClass39ArrayArrayArray1[NodeSub4.staticInt155][var2][var3];
				if (var38 != null) {
					for (Item var361 = (Item) var38.method195(); var361 != null; var361 = (Item) var38.method193()) {
						if ((var32 & 0x7fff) == var361.anInt573 && var4 == var361.anInt574) {
							var361.anInt574 = var311;
							break;
						}
					}

					staticMethod262(var2, var3);
				}
			}
		} else if (Client.staticInt191 == 73) {
			var14 = Client.inBuffer.method367();
			var2 = (var14 >> 4 & 0x7) + staticInt122;
			var3 = (var14 & 0x7) + ChatMessage.staticInt331;
			var32 = var2 + Client.inBuffer.readByte();
			var4 = var3 + Client.inBuffer.readByte();
			var311 = Client.inBuffer.method364();
			var291 = Client.inBuffer.method370();
			var30 = Client.inBuffer.method367() * 4;
			var10 = Client.inBuffer.method367() * 4;
			var15 = Client.inBuffer.method370();
			var18 = Client.inBuffer.method370();
			var8 = Client.inBuffer.method367();
			var9 = Client.inBuffer.method367();
			if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104 && var32 >= 0 && var4 >= 0 && var32 < 104
					&& var4 < 104 && var291 != '\uffff') {
				var2 = var2 * 128 + 64;
				var3 = var3 * 128 + 64;
				var32 = var32 * 128 + 64;
				var4 = 64 + var4 * 128;
				RenderableSub1 var39 = new RenderableSub1(var291, NodeSub4.staticInt155, var2, var3,
						staticMethod240(var2, var3, NodeSub4.staticInt155) - var30, Client.staticInt166 + var15,
						var18 + Client.staticInt166, var8, var9, var311, var10);
				var39.method562(var32, var4, staticMethod240(var32, var4, NodeSub4.staticInt155) - var10,
						var15 + Client.staticInt166);
				Client.staticClass39_5.method198(var39);
			}
		} else {
			Item var41;
			if (Client.staticInt191 == 143) {
				var14 = Client.inBuffer.method353();
				var2 = Client.inBuffer.method355();
				var3 = Client.inBuffer.method377();
				var32 = (var3 >> 4 & 0x7) + staticInt122;
				var4 = (var3 & 0x7) + ChatMessage.staticInt331;
				if (var32 >= 0 && var4 >= 0 && var32 < 104 && var4 < 104) {
					var41 = new Item();
					var41.anInt573 = var14;
					var41.anInt574 = var2;
					if (Client.staticClass39ArrayArrayArray1[NodeSub4.staticInt155][var32][var4] == null) {
						Client.staticClass39ArrayArrayArray1[NodeSub4.staticInt155][var32][var4] = new Class39();
					}

					Client.staticClass39ArrayArrayArray1[NodeSub4.staticInt155][var32][var4].method198(var41);
					staticMethod262(var32, var4);
				}
			} else if (Client.staticInt191 == 117) {
				var14 = Client.inBuffer.method377();
				var2 = var14 >> 2;
				var3 = var14 & 0x3;
				var32 = Client.staticIntArray84[var2];
				var4 = Client.inBuffer.method355();
				var311 = Client.inBuffer.method377();
				var291 = (var311 >> 4 & 0x7) + staticInt122;
				var30 = ChatMessage.staticInt331 + (var311 & 0x7);
				if (var291 >= 0 && var30 >= 0 && var291 < 104 && var30 < 104) {
					staticMethod110(NodeSub4.staticInt155, var291, var30, var32, var4, var2, var3, 0, -1);
				}
			} else {
				if (Client.staticInt191 == 168) {
					var14 = Client.inBuffer.method367();
					var2 = staticInt122 + (var14 >> 4 & 0x7);
					var3 = ChatMessage.staticInt331 + (var14 & 0x7);
					var32 = Client.inBuffer.method370();
					var4 = Client.inBuffer.method367();
					var311 = var4 >> 4 & 0xf;
					var291 = var4 & 0x7;
					var30 = Client.inBuffer.method367();
					if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
						var10 = 1 + var311;
						if (AbstractClass2Sub1.staticPlayer1.anIntArray127[0] >= var2 - var10
								&& AbstractClass2Sub1.staticPlayer1.anIntArray127[0] <= var10 + var2
								&& AbstractClass2Sub1.staticPlayer1.anIntArray122[0] >= var3 - var10
								&& AbstractClass2Sub1.staticPlayer1.anIntArray122[0] <= var10 + var3
								&& Client.staticInt301 != 0 && var291 > 0 && Client.staticInt236 < 50) {
							Client.staticIntArray114[Client.staticInt236] = var32;
							Client.staticIntArray115[Client.staticInt236] = var291;
							Client.staticIntArray116[Client.staticInt236] = var30;
							Client.staticClass9Array1[Client.staticInt236] = null;
							Client.staticIntArray117[Client.staticInt236] = (var2 << 16) + (var3 << 8) + var311;
							++Client.staticInt236;
						}
					}
				}

				if (Client.staticInt191 != 251) {
					if (Client.staticInt191 == 232) {
						var14 = Client.inBuffer.method367();
						var2 = staticInt122 + (var14 >> 4 & 0x7);
						var3 = ChatMessage.staticInt331 + (var14 & 0x7);
						var32 = Client.inBuffer.method370();
						var4 = Client.inBuffer.method367();
						var311 = Client.inBuffer.method370();
						if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
							var2 = 64 + var2 * 128;
							var3 = var3 * 128 + 64;
							RenderableSub2 var40 = new RenderableSub2(var32, NodeSub4.staticInt155, var2, var3,
									staticMethod240(var2, var3, NodeSub4.staticInt155) - var4, var311,
									Client.staticInt166);
							Client.staticClass39_6.method198(var40);
						}
					} else if (Client.staticInt191 == 186) {
						var14 = Client.inBuffer.method377();
						var2 = staticInt122 + (var14 >> 4 & 0x7);
						var3 = (var14 & 0x7) + ChatMessage.staticInt331;
						var32 = Client.inBuffer.method377();
						var4 = var32 >> 2;
						var311 = var32 & 0x3;
						var291 = Client.staticIntArray84[var4];
						if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
							staticMethod110(NodeSub4.staticInt155, var2, var3, var291, -1, var4, var311, 0, -1);
						}
					}
				} else {
					var14 = Client.inBuffer.method348();
					var2 = staticInt122 + (var14 >> 4 & 0x7);
					var3 = (var14 & 0x7) + ChatMessage.staticInt331;
					var32 = Client.inBuffer.method353();
					if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
						Class39 var42 = Client.staticClass39ArrayArrayArray1[NodeSub4.staticInt155][var2][var3];
						if (var42 != null) {
							for (var41 = (Item) var42.method195(); var41 != null; var41 = (Item) var42.method193()) {
								if ((var32 & 0x7fff) == var41.anInt573) {
									var41.method174();
									break;
								}
							}

							if (var42.method195() == null) {
								Client.staticClass39ArrayArrayArray1[NodeSub4.staticInt155][var2][var3] = null;
							}

							staticMethod262(var2, var3);
						}
					}
				}
			}
		}

	}

	static void staticMethod346(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = staticMethod32(var1, var2);
		if (var5 != null) {
			if (var5.anObjectArray17 != null) {
				NodeSub16 var7 = new NodeSub16();
				var7.aWidget1 = var5;
				var7.anInt286 = var0;
				var7.aString17 = var4;
				var7.anObjectArray2 = var5.anObjectArray17;
				staticMethod375(var7);
			}

			boolean var71 = true;
			if (var5.anInt298 > 0) {
				var71 = staticMethod282(var5);
			}

			if (var71 && staticMethod89(staticMethod192(var5), var0 - 1)) {
				if (var0 == 1) {
					Client.outBuffer.method471(168);
					Client.outBuffer.writeInt(var1);
					Client.outBuffer.writeShort(var2);
					Client.outBuffer.writeShort(var3);
				}

				if (var0 == 2) {
					Client.outBuffer.method471(34);
					Client.outBuffer.writeInt(var1);
					Client.outBuffer.writeShort(var2);
					Client.outBuffer.writeShort(var3);
				}

				if (var0 == 3) {
					Client.outBuffer.method471(86);
					Client.outBuffer.writeInt(var1);
					Client.outBuffer.writeShort(var2);
					Client.outBuffer.writeShort(var3);
				}

				if (var0 == 4) {
					Client.outBuffer.method471(186);
					Client.outBuffer.writeInt(var1);
					Client.outBuffer.writeShort(var2);
					Client.outBuffer.writeShort(var3);
				}

				if (var0 == 5) {
					Client.outBuffer.method471(103);
					Client.outBuffer.writeInt(var1);
					Client.outBuffer.writeShort(var2);
					Client.outBuffer.writeShort(var3);
				}

				if (var0 == 6) {
					Client.outBuffer.method471(76);
					Client.outBuffer.writeInt(var1);
					Client.outBuffer.writeShort(var2);
					Client.outBuffer.writeShort(var3);
				}

				if (var0 == 7) {
					Client.outBuffer.method471(185);
					Client.outBuffer.writeInt(var1);
					Client.outBuffer.writeShort(var2);
					Client.outBuffer.writeShort(var3);
				}

				if (var0 == 8) {
					Client.outBuffer.method471(63);
					Client.outBuffer.writeInt(var1);
					Client.outBuffer.writeShort(var2);
					Client.outBuffer.writeShort(var3);
				}

				if (var0 == 9) {
					Client.outBuffer.method471(148);
					Client.outBuffer.writeInt(var1);
					Client.outBuffer.writeShort(var2);
					Client.outBuffer.writeShort(var3);
				}

				if (var0 == 10) {
					Client.outBuffer.method471(204);
					Client.outBuffer.writeInt(var1);
					Client.outBuffer.writeShort(var2);
					Client.outBuffer.writeShort(var3);
				}
			}
		}

	}

	static Rasterizer2DSub3 staticMethod347(Js5Index var0, int var1, int var2) {
		if (!staticMethod65(var0, var1, var2)) {
			return null;
		} else {
			Rasterizer2DSub3 var3 = new Rasterizer2DSub3();
			var3.anInt676 = staticInt139;
			var3.anInt679 = staticInt142;
			var3.anInt681 = NodeSub20.staticIntArray126[0];
			var3.anInt680 = staticIntArray69[0];
			var3.anInt677 = staticIntArray72[0];
			var3.anInt678 = staticIntArray71[0];
			var3.anIntArray155 = staticIntArray73;
			var3.aByteArray35 = CanvasSub1.staticByteArrayArray2[0];
			NodeSub20.staticIntArray126 = null;
			staticIntArray69 = null;
			staticIntArray72 = null;
			staticIntArray71 = null;
			staticIntArray73 = null;
			CanvasSub1.staticByteArrayArray2 = null;
			return var3;
		}
	}

	static void staticMethod281(int var0) {
		NodeSub20 var1 = (NodeSub20) NodeSub20.staticHashTable7.method149(var0);
		if (var1 != null) {
			var1.method174();
		}

	}

	static final boolean staticMethod282(Widget var0) {
		int var1 = var0.anInt298;
		if (var1 == 205) {
			Client.staticInt196 = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 0x1;
				Client.staticClass49_1.method244(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 0x1;
				Client.staticClass49_1.method245(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.staticClass49_1.method246(false);
			}

			if (var1 == 325) {
				Client.staticClass49_1.method246(true);
			}

			if (var1 == 326) {
				Client.outBuffer.method471(23);
				Client.staticClass49_1.method251(Client.outBuffer);
				return true;
			} else {
				return false;
			}
		}
	}

	static String staticMethod283(ByteBuf var0, int var1) {
		try {
			int var5 = var0.method379();
			if (var5 > var1) {
				var5 = var1;
			}

			byte[] var3 = new byte[var5];
			var0.position += staticClass47_1.method240(var0.buf, var0.position, var3, 0, var5);
			String var4 = staticMethod227(var3, 0, var5);
			return var4;
		} catch (Exception var51) {
			return "Cabbage";
		}
	}

	static final void staticMethod284(NodeSub19 var0) {
		int var1 = 0;
		int var3 = -1;
		int var2 = 0;
		int var4 = 0;
		if (var0.anInt387 == 0) {
			var1 = Friend.staticScene1.method142(var0.anInt389, var0.anInt388, var0.anInt390);
		}

		if (var0.anInt387 == 1) {
			var1 = Friend.staticScene1.method143(var0.anInt389, var0.anInt388, var0.anInt390);
		}

		if (var0.anInt387 == 2) {
			var1 = Friend.staticScene1.method119(var0.anInt389, var0.anInt388, var0.anInt390);
		}

		if (var0.anInt387 == 3) {
			var1 = Friend.staticScene1.method116(var0.anInt389, var0.anInt388, var0.anInt390);
		}

		if (var1 != 0) {
			int var5 = Friend.staticScene1.method117(var0.anInt389, var0.anInt388, var0.anInt390, var1);
			var3 = var1 >> 14 & 0x7fff;
			var2 = var5 & 0x1f;
			var4 = var5 >> 6 & 0x3;
		}

		var0.anInt394 = var3;
		var0.anInt392 = var2;
		var0.anInt391 = var4;
	}

	public static void staticMethod285(String var0, Throwable var1) {
		try {
			String var2 = "";
			if (var1 != null) {
				Throwable var15 = var1;
				String var17;
				if (var1 instanceof RuntimeExceptionSub1) {
					RuntimeExceptionSub1 var18 = (RuntimeExceptionSub1) var1;
					var17 = var18.aString8 + " | ";
					var15 = var18.aThrowable1;
				} else {
					var17 = "";
				}

				StringWriter var181 = new StringWriter();
				PrintWriter var6 = new PrintWriter(var181);
				var15.printStackTrace(var6);
				var6.close();
				String var7 = var181.toString();
				BufferedReader var8 = new BufferedReader(new StringReader(var7));
				String var9 = var8.readLine();

				while (true) {
					String var10 = var8.readLine();
					if (var10 == null) {
						var17 = var17 + "| " + var9;
						var2 = var17;
						break;
					}

					int var11 = var10.indexOf(40);
					int var12 = var10.indexOf(41, var11 + 1);
					if (var11 >= 0 && var12 >= 0) {
						String var13 = var10.substring(var11 + 1, var12);
						int var14 = var13.indexOf(".java:");
						if (var14 >= 0) {
							var13 = var13.substring(0, var14) + var13.substring(5 + var14);
							var17 = var17 + var13 + ' ';
							continue;
						}

						var10 = var10.substring(0, var11);
					}

					var10 = var10.trim();
					var10 = var10.substring(var10.lastIndexOf(32) + 1);
					var10 = var10.substring(var10.lastIndexOf(9) + 1);
					var17 = var17 + var10 + ' ';
				}
			}

			if (var0 != null) {
				if (var1 != null) {
					var2 = var2 + " | ";
				}

				var2 = var2 + var0;
			}

			System.out.println("Error: " + var2);
			var2 = var2.replace(':', '.');
			var2 = var2.replace('@', '_');
			var2 = var2.replace('&', '_');
			var2 = var2.replace('#', '_');
			if (RuntimeExceptionSub1.staticApplet1 == null) {
				return;
			}

			URL var152 = new URL(RuntimeExceptionSub1.staticApplet1.getCodeBase(),
					"clienterror.ws?c=" + RuntimeExceptionSub1.staticInt74 + "&u=" + RuntimeExceptionSub1.staticString22
							+ "&v1=" + TaskManager.staticString19 + "&v2=" + TaskManager.staticString20 + "&e=" + var2);
			DataInputStream var171 = new DataInputStream(var152.openStream());
			var171.read();
			var171.close();
		} catch (Exception var151) {
			;
		}

	}

	static void staticMethod286(Js5IndexImpl var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (var1 << 16) + var2;
		CacheableSub4 var8 = (CacheableSub4) staticHashTable1.method149(var6);
		if (var8 == null) {
			var8 = (CacheableSub4) staticHashTable2.method149(var6);
			if (var8 == null) {
				var8 = (CacheableSub4) staticHashTable4.method149(var6);
				if (var8 != null) {
					if (var5) {
						var8.method314();
						staticHashTable1.method148(var8, var6);
						--staticInt132;
						++staticInt130;
					}
				} else {
					if (!var5) {
						var8 = (CacheableSub4) staticHashTable3.method149(var6);
						if (var8 != null) {
							return;
						}
					}

					var8 = new CacheableSub4();
					var8.aJs5IndexImpl2 = var0;
					var8.anInt429 = var3;
					var8.aByte4 = var4;
					if (var5) {
						staticHashTable1.method148(var8, var6);
						++staticInt130;
					} else {
						staticQueue1.method187(var8);
						staticHashTable4.method148(var8, var6);
						++staticInt132;
					}
				}
			}
		}

	}

	static int staticMethod287() {
		int var0 = NodeSub5.staticByteArray5[NodeSub5.staticInt156] >> NodeSub5.staticInt159 & 0x1;
		++NodeSub5.staticInt159;
		NodeSub5.staticInt156 += NodeSub5.staticInt159 >> 3;
		NodeSub5.staticInt159 &= 7;
		return var0;
	}

	static int staticMethod288(int var0) {
		int var1 = 0;

		int var2;
		int var4;
		for (var4 = 0; var0 >= 8 - NodeSub5.staticInt159; var0 -= var2) {
			var2 = 8 - NodeSub5.staticInt159;
			int var3 = (1 << var2) - 1;
			var1 += (NodeSub5.staticByteArray5[NodeSub5.staticInt156] >> NodeSub5.staticInt159 & var3) << var4;
			NodeSub5.staticInt159 = 0;
			++NodeSub5.staticInt156;
			var4 += var2;
		}

		if (var0 > 0) {
			var2 = (1 << var0) - 1;
			var1 += (NodeSub5.staticByteArray5[NodeSub5.staticInt156] >> NodeSub5.staticInt159 & var2) << var4;
			NodeSub5.staticInt159 += var0;
		}

		return var1;
	}

	static void staticMethod289(byte[] var0) {
		staticMethod293(var0, 0);
		NodeSub5.staticInt157 = 1 << staticMethod288(4);
		NodeSub5.staticInt158 = 1 << staticMethod288(4);
		NodeSub5.staticFloatArray2 = new float[NodeSub5.staticInt158];

		int var2;
		int var5;
		int var6;
		int var7;
		int var8;
		for (var2 = 0; var2 < 2; var2++) {
			var5 = var2 != 0 ? NodeSub5.staticInt158 : NodeSub5.staticInt157;
			var7 = var5 >> 1;
			var6 = var5 >> 2;
			var8 = var5 >> 3;
			float[] var15 = new float[var7];

			for (int var13 = 0; var13 < var6; var13++) {
				var15[var13 * 2] = (float) Math.cos(var13 * 4 * 3.141592653589793D / var5);
				var15[var13 * 2 + 1] = -((float) Math.sin(var13 * 4 * 3.141592653589793D / var5));
			}

			float[] var131 = new float[var7];

			for (int var14 = 0; var14 < var6; var14++) {
				var131[var14 * 2] = (float) Math.cos((var14 * 2 + 1) * 3.141592653589793D / (var5 * 2));
				var131[var14 * 2 + 1] = (float) Math.sin((var14 * 2 + 1) * 3.141592653589793D / (var5 * 2));
			}

			float[] var141 = new float[var6];

			for (int var12 = 0; var12 < var8; var12++) {
				var141[var12 * 2] = (float) Math.cos((var12 * 4 + 2) * 3.141592653589793D / var5);
				var141[var12 * 2 + 1] = -((float) Math.sin((var12 * 4 + 2) * 3.141592653589793D / var5));
			}

			int[] var151 = new int[var8];
			int var10 = staticMethod96(var8 - 1);

			for (int var11 = 0; var11 < var8; var11++) {
				var151[var11] = staticMethod101(var11, var10);
			}

			if (var2 != 0) {
				NodeSub5.staticFloatArray6 = var15;
				NodeSub5.staticFloatArray7 = var131;
				NodeSub5.staticFloatArray8 = var141;
				NodeSub5.staticIntArray80 = var151;
			} else {
				NodeSub5.staticFloatArray3 = var15;
				NodeSub5.staticFloatArray4 = var131;
				NodeSub5.staticFloatArray5 = var141;
				NodeSub5.staticIntArray79 = var151;
			}
		}

		var2 = staticMethod288(8) + 1;
		NodeSub5.staticClass12Array1 = new Class12[var2];

		for (var5 = 0; var5 < var2; var5++) {
			NodeSub5.staticClass12Array1[var5] = new Class12();
		}

		var5 = staticMethod288(6) + 1;

		for (var7 = 0; var7 < var5; var7++) {
			staticMethod288(16);
		}

		var5 = staticMethod288(6) + 1;
		NodeSub5.staticClass13Array1 = new Class13[var5];

		for (var7 = 0; var7 < var5; var7++) {
			NodeSub5.staticClass13Array1[var7] = new Class13();
		}

		var7 = staticMethod288(6) + 1;
		NodeSub5.staticClass22Array1 = new Class22[var7];

		for (var6 = 0; var6 < var7; var6++) {
			NodeSub5.staticClass22Array1[var6] = new Class22();
		}

		var6 = staticMethod288(6) + 1;
		NodeSub5.staticClass21Array1 = new Class21[var6];

		for (var8 = 0; var8 < var6; var8++) {
			NodeSub5.staticClass21Array1[var8] = new Class21();
		}

		var8 = staticMethod288(6) + 1;
		NodeSub5.staticBoolArray4 = new boolean[var8];
		NodeSub5.staticIntArray78 = new int[var8];

		for (int var121 = 0; var121 < var8; var121++) {
			NodeSub5.staticBoolArray4[var121] = staticMethod287() != 0;
			staticMethod288(16);
			staticMethod288(16);
			NodeSub5.staticIntArray78[var121] = staticMethod288(8);
		}

	}

	static boolean staticMethod290(Js5Index var0) {
		if (!NodeSub5.staticBool19) {
			byte[] var1 = var0.getFile(0, 0);
			if (var1 == null) {
				return false;
			}

			staticMethod289(var1);
			NodeSub5.staticBool19 = true;
		}

		return true;
	}

	static NodeSub5 staticMethod291(Js5Index var0, int var1, int var2) {
		if (!staticMethod290(var0)) {
			var0.method276(var1, var2);
			return null;
		} else {
			byte[] var3 = var0.getFile(var1, var2);
			return var3 == null ? null : new NodeSub5(var3);
		}
	}

	static float staticMethod292(int var0) {
		int var1 = var0 & 0x1fffff;
		int var3 = var0 & 0x80000000;
		int var2 = (var0 & 0x7fe00000) >> 21;
		if (var3 != 0) {
			var1 = -var1;
		}

		return (float) (var1 * Math.pow(2.0D, var2 - 788));
	}

	static void staticMethod293(byte[] var0, int var1) {
		NodeSub5.staticByteArray5 = var0;
		NodeSub5.staticInt156 = var1;
		NodeSub5.staticInt159 = 0;
	}

	public static int staticMethod304() {
		return ++MouseHandler.staticInt89 - 1;
	}

	public static void staticMethod305() {
		IdentityKit.staticCache8.method171();
	}

	public static boolean staticMethod306(CharSequence var0) {
		boolean var1 = false;
		boolean var6 = false;
		int var3 = 0;
		int var8 = var0.length();
		int var5 = 0;

		boolean var7;
		while (true) {
			if (var5 >= var8) {
				var7 = var6;
				break;
			}

			label73: {
				char var4 = var0.charAt(var5);
				if (var5 == 0) {
					if (var4 == 45) {
						var1 = true;
						break label73;
					}

					if (var4 == 43) {
						break label73;
					}
				}

				int var9;
				if (var4 >= 48 && var4 <= 57) {
					var9 = var4 - 48;
				} else if (var4 >= 65 && var4 <= 90) {
					var9 = var4 - 55;
				} else {
					if (var4 < 97 || var4 > 122) {
						var7 = false;
						break;
					}

					var9 = var4 - 87;
				}

				if (var9 >= 10) {
					var7 = false;
					break;
				}

				if (var1) {
					var9 = -var9;
				}

				int var2 = var3 * 10 + var9;
				if (var3 != var2 / 10) {
					var7 = false;
					break;
				}

				var3 = var2;
				var6 = true;
			}

			++var5;
		}

		return var7;
	}

	public static BuildType staticMethod307(int var0) {
		BuildType[] var1 = staticMethod201();

		for (int var2 = 0; var2 < var1.length; var2++) {
			BuildType var3 = var1[var2];
			if (var3.anInt199 == var0) {
				return var3;
			}
		}

		return null;
	}

	public static SpotAnim staticMethod322(int var0) {
		SpotAnim var1 = (SpotAnim) SpotAnim.staticCache30.get(var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = Class25.staticJs5Index1.getFile(13, var0);
			var1 = new SpotAnim();
			var1.anInt554 = var0;
			if (var2 != null) {
				var1.method547(new ByteBuf(var2));
			}

			SpotAnim.staticCache30.method170(var1, var0);
			return var1;
		}
	}

	public static void staticMethod348(BitBuf var0) {
		NodeSub17 var1 = (NodeSub17) staticClass36_1.method160();
		if (var1 != null) {
			int var2 = var0.position;
			var0.writeInt(var1.anInt366);

			for (int var3 = 0; var3 < var1.anInt367; var3++) {
				if (var1.anIntArray79[var3] != 0) {
					var0.writeByte(var1.anIntArray79[var3]);
				} else {
					try {
						int var21 = var1.anIntArray78[var3];
						Field var5;
						int var6;
						if (var21 == 0) {
							var5 = var1.aFieldArray1[var3];
							var6 = var5.getInt((Object) null);
							var0.writeByte(0);
							var0.writeInt(var6);
						} else if (var21 == 1) {
							var5 = var1.aFieldArray1[var3];
							var5.setInt((Object) null, var1.anIntArray80[var3]);
							var0.writeByte(0);
						} else if (var21 == 2) {
							var5 = var1.aFieldArray1[var3];
							var6 = var5.getModifiers();
							var0.writeByte(0);
							var0.writeInt(var6);
						}

						Method var22;
						if (var21 != 3) {
							if (var21 == 4) {
								var22 = var1.aMethodArray1[var3];
								var6 = var22.getModifiers();
								var0.writeByte(0);
								var0.writeInt(var6);
							}
						} else {
							var22 = var1.aMethodArray1[var3];
							byte[][] var23 = var1.aByteArrayArrayArray1[var3];
							Object[] var7 = new Object[var23.length];

							for (int var24 = 0; var24 < var23.length; var24++) {
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var23[var24]));
								var7[var24] = var9.readObject();
							}

							Object var241 = var22.invoke((Object) null, var7);
							if (var241 == null) {
								var0.writeByte(0);
							} else if (var241 instanceof Number) {
								var0.writeByte(1);
								var0.method344(((Number) var241).longValue());
							} else if (var241 instanceof String) {
								var0.writeByte(2);
								var0.writeString((String) var241);
							} else {
								var0.writeByte(4);
							}
						}
					} catch (ClassNotFoundException var12) {
						var0.writeByte(-10);
					} catch (InvalidClassException var13) {
						var0.writeByte(-11);
					} catch (StreamCorruptedException var14) {
						var0.writeByte(-12);
					} catch (OptionalDataException var15) {
						var0.writeByte(-13);
					} catch (IllegalAccessException var16) {
						var0.writeByte(-14);
					} catch (IllegalArgumentException var17) {
						var0.writeByte(-15);
					} catch (InvocationTargetException var18) {
						var0.writeByte(-16);
					} catch (SecurityException var19) {
						var0.writeByte(-17);
					} catch (IOException var20) {
						var0.writeByte(-18);
					} catch (NullPointerException var211) {
						var0.writeByte(-19);
					} catch (Exception var221) {
						var0.writeByte(-20);
					} catch (Throwable var231) {
						var0.writeByte(-21);
					}
				}
			}

			var0.method376(var2);
			var1.method174();
		}

	}

	static void staticMethod349(File var0, File var1) {
		try {
			FileOnDisk var4 = new FileOnDisk(staticFile1, "rw", 10000L);
			ByteBuf var3 = new ByteBuf(500);
			var3.writeByte(3);
			var3.writeByte(var1 != null ? 1 : 0);
			var3.method325(var0.getPath());
			if (var1 != null) {
				var3.method325(var1.getPath());
			}

			var4.method88(var3.buf, 0, var3.position);
			var4.method86();
		} catch (IOException var41) {
			var41.printStackTrace();
		}

	}

	static AbstractClass3 staticMethod350() {
		try {
			return new AbstractClass3Sub2();
		} catch (Throwable var1) {
			return new AbstractClass3Sub1();
		}
	}

	static String staticMethod374(Widget var0, int var1) {
		return !staticMethod89(staticMethod192(var0), var1)
				&& var0.anObjectArray17 == null
						? null
						: var0.aStringArray4 != null && var0.aStringArray4.length > var1
								&& var0.aStringArray4[var1] != null && var0.aStringArray4[var1].trim().length() != 0
										? var0.aStringArray4[var1] : null;
	}

	static void staticMethod375(NodeSub16 var0) {
		staticMethod474(var0, 200000);
	}

	public static int staticMethod378(String var0) {
		return var0.length() + 1;
	}

	public static boolean staticMethod379(int var0) {
		return (var0 >> 28 & 0x1) != 0;
	}

	public static IdentityKit staticMethod382(int var0) {
		IdentityKit var1 = (IdentityKit) IdentityKit.staticCache8.get(var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = IdentityKit.staticJs5Index12.getFile(3, var0);
			var1 = new IdentityKit();
			if (var2 != null) {
				var1.method480(new ByteBuf(var2));
			}

			IdentityKit.staticCache8.method170(var1, var0);
			return var1;
		}
	}

	static void staticMethod383(int var0, int var1, int var2, int var3) {
		for (NodeSub4 var4 = (NodeSub4) NodeSub4.staticClass39_4
				.method195(); var4 != null; var4 = (NodeSub4) NodeSub4.staticClass39_4.method193()) {
			if (var4.anInt227 != -1 || var4.anIntArray59 != null) {
				int var5 = 0;
				if (var1 > var4.anInt231) {
					var5 += var1 - var4.anInt231;
				} else if (var1 < var4.anInt224) {
					var5 += var4.anInt224 - var1;
				}

				if (var2 > var4.anInt225) {
					var5 += var2 - var4.anInt225;
				} else if (var2 < var4.anInt223) {
					var5 += var4.anInt223 - var2;
				}

				if (var5 - 64 <= var4.anInt226 && Client.staticInt301 != 0 && var0 == var4.anInt222) {
					var5 -= 64;
					if (var5 < 0) {
						var5 = 0;
					}

					int var9 = Client.staticInt301 * (var4.anInt226 - var5) / var4.anInt226;
					if (var4.aNodeSub8Sub2_1 == null) {
						if (var4.anInt227 >= 0) {
							SoundEffect var11 = staticMethod52(Config19.staticJs5IndexImpl15, var4.anInt227, 0);
							if (var11 != null) {
								NodeSub6Sub1 var12 = var11.method25().method433(Class16.staticClass20_1);
								NodeSub8Sub2 var13 = staticMethod352(var12, 100, var9);
								var13.method430(-1);
								ClientScriptMap.staticNodeSub8Sub1_1.method408(var13);
								var4.aNodeSub8Sub2_1 = var13;
							}
						}
					} else {
						var4.aNodeSub8Sub2_1.method420(var9);
					}

					if (var4.aNodeSub8Sub2_2 == null) {
						if (var4.anIntArray59 != null && (var4.anInt230 -= var3) <= 0) {
							int var111 = (int) (Math.random() * var4.anIntArray59.length);
							SoundEffect var121 = staticMethod52(Config19.staticJs5IndexImpl15, var4.anIntArray59[var111], 0);
							if (var121 != null) {
								NodeSub6Sub1 var131 = var121.method25().method433(Class16.staticClass20_1);
								NodeSub8Sub2 var6 = staticMethod352(var131, 100, var9);
								var6.method430(0);
								ClientScriptMap.staticNodeSub8Sub1_1.method408(var6);
								var4.aNodeSub8Sub2_2 = var6;
								var4.anInt230 = var4.anInt228
										+ (int) (Math.random() * (var4.anInt229 * -1409853411 - var4.anInt228));
							}
						}
					} else {
						var4.aNodeSub8Sub2_2.method420(var9);
						if (!var4.aNodeSub8Sub2_2.method175()) {
							var4.aNodeSub8Sub2_2 = null;
						}
					}
				} else {
					if (var4.aNodeSub8Sub2_1 != null) {
						ClientScriptMap.staticNodeSub8Sub1_1.method406(var4.aNodeSub8Sub2_1);
						var4.aNodeSub8Sub2_1 = null;
					}

					if (var4.aNodeSub8Sub2_2 != null) {
						ClientScriptMap.staticNodeSub8Sub1_1.method406(var4.aNodeSub8Sub2_2);
						var4.aNodeSub8Sub2_2 = null;
					}
				}
			}
		}

	}

	static final void staticMethod384() {
		for (int var0 = 0; var0 < Client.staticInt186; var0++) {
			int var2 = Client.staticIntArray121[var0];
			Npc var1 = Client.staticNpcArray1[var2];
			if (var1 != null) {
				staticMethod324(var1, var1.aNpcDef1.anInt538);
			}
		}

	}

	public static int staticMethod388(CharSequence var0) {
		return staticMethod188(var0, 10, true);
	}

	public static GraphicsBuffer staticMethod390(int var0, int var1, Component var2) {
		try {
			GraphicsBufferSub2 var5 = new GraphicsBufferSub2();
			var5.method278(var0, var1, var2);
			return var5;
		} catch (Throwable var51) {
			GraphicsBufferSub1 var4 = new GraphicsBufferSub1();
			var4.method278(var0, var1, var2);
			return var4;
		}
	}

	// TODO npc updating?
	static final void staticMethod391() {
		for (int var0 = 0; var0 < Client.staticInt188; var0++) {
			int var3 = Client.staticIntArray92[var0];
			Npc var1 = Client.staticNpcArray1[var3];
			int var5 = Client.inBuffer.method367();
			int var6;
			if ((var5 & 0x20) != 0) {
				var1.anInt596 = Client.inBuffer.method355();
				var6 = Client.inBuffer.method362();
				var1.anInt620 = var6 >> 16;
				var1.anInt619 = Client.staticInt166 + (var6 & 0xffff);
				var1.anInt616 = 0;
				var1.anInt618 = 0;
				if (var1.anInt619 > Client.staticInt166) {
					var1.anInt616 = -1;
				}

				if (var1.anInt596 == '\uffff') {
					var1.anInt596 = -1;
				}
			}

			int var2;
			int var4;
			int var8;
			
			// overhead text
			if ((var5 & 0x4) != 0) {
				var6 = Client.inBuffer.method348();
				int var7;
				int var9;
				int var10;
				if (var6 > 0) {
					for (var8 = 0; var8 < var6; var8++) {
						var4 = -1;
						var9 = -1;
						var10 = -1;
						var2 = Client.inBuffer.method379();
						if (var2 == 32767) {
							var2 = Client.inBuffer.method379();
							var9 = Client.inBuffer.method379();
							var4 = Client.inBuffer.method379();
							var10 = Client.inBuffer.method379();
						} else if (var2 != 32766) {
							var9 = Client.inBuffer.method379();
						} else {
							var2 = -1;
						}

						var7 = Client.inBuffer.method379();
						var1.method566(var2, var9, var4, var10, Client.staticInt166, var7);
					}
				}

				var8 = Client.inBuffer.method348();
				if (var8 > 0) {
					for (var2 = 0; var2 < var8; var2++) {
						var4 = Client.inBuffer.method379();
						var9 = Client.inBuffer.method379();
						if (var9 != 32767) {
							var10 = Client.inBuffer.method379();
							var7 = Client.inBuffer.method367();
							int var11 = var9 > 0 ? Client.inBuffer.method346() : var7;
							var1.method564(var4, Client.staticInt166, var9, var10, var7, var11);
						} else {
							var1.method563(var4);
						}
					}
				}
			}

			if ((var5 & 0x1) != 0) {
				var1.aNpcDef1 = staticMethod85(Client.inBuffer.method372());
				var1.anInt626 = var1.aNpcDef1.anInt538;
				var1.anInt631 = var1.aNpcDef1.anInt549 * 494637525;
				var1.anInt621 = var1.aNpcDef1.anInt550;
				var1.anInt597 = var1.aNpcDef1.anInt540;
				var1.anInt598 = var1.aNpcDef1.anInt536;
				var1.anInt622 = -var1.aNpcDef1.anInt542;
				var1.anInt594 = -var1.aNpcDef1.anInt539;
				var1.anInt634 = var1.aNpcDef1.anInt552;
				var1.anInt595 = var1.aNpcDef1.anInt543;
			}

			if ((var5 & 0x40) != 0) {
				var6 = Client.inBuffer.method355();
				if (var6 == '\uffff') {
					var6 = -1;
				}

				var8 = Client.inBuffer.method377();
				if (var1.anInt612 == var6 && var6 != -1) {
					var2 = staticMethod210(var6).anInt568;
					if (var2 == 1) {
						var1.anInt613 = 0;
						var1.anInt614 = 0;
						var1.anInt615 = var8;
						var1.anInt593 = 0;
					}

					if (var2 == 2) {
						var1.anInt593 = 0;
					}
				} else if (var6 == -1 || var1.anInt612 == -1
						|| staticMethod210(var6).anInt563 >= staticMethod210(var1.anInt612).anInt563) {
					var1.anInt612 = var6;
					var1.anInt613 = 0;
					var1.anInt614 = 0;
					var1.anInt615 = var8;
					var1.anInt593 = 0;
					var1.anInt599 = var1.anInt632;
				}
			}

			if ((var5 & 0x2) != 0) {
				var6 = Client.inBuffer.method355();
				var8 = Client.inBuffer.method355();
				var2 = var1.anInt628 - (var6 - NodeSub3.staticInt154 - NodeSub3.staticInt154) * 64;
				var4 = var1.anInt591 - (var8 - Class34.staticInt75 - Class34.staticInt75) * 64;
				if (var2 != 0 || var4 != 0) {
					var1.anInt608 = (int) (Math.atan2(var2, var4) * 325.949D) & 0x7ff;
				}
			}

			if ((var5 & 0x10) != 0) {
				var1.anInt600 = Client.inBuffer.method370();
				if (var1.anInt600 == '\uffff') {
					var1.anInt600 = -1;
				}
			}

			if ((var5 & 0x8) != 0) {
				var1.aString39 = Client.inBuffer.readString();
				var1.anInt601 = 100;
			}
		}

	}

	static boolean staticMethod422(String var0, boolean var1) {
		if (var0 == null) {
			return false;
		} else {
			String var2 = staticMethod111(var0, staticClass53_1);

			for (int var3 = 0; var3 < Client.staticInt308; var3++) {
				if (var2.equalsIgnoreCase(
						staticMethod111(Client.staticFriendArray1[var3].aString14, staticClass53_1))
						&& (!var1 || Client.staticFriendArray1[var3].anInt210 != 0)) {
					return true;
				}
			}

			if (var2.equalsIgnoreCase(
					staticMethod111(AbstractClass2Sub1.staticPlayer1.aString40, staticClass53_1))) {
				return true;
			} else {
				return false;
			}
		}
	}

	static int staticMethod423(int var0, CacheableSub1 var1, boolean var2) {
		if (var0 < 1000) {
			return staticMethod161(var0, var1, var2);
		} else if (var0 < 1100) {
			return staticMethod245(var0, var1, var2);
		} else if (var0 < 1200) {
			return staticMethod68(var0, var1, var2);
		} else if (var0 < 1300) {
			return staticMethod221(var0, var1, var2);
		} else if (var0 < 1400) {
			return staticMethod331(var0, var1, var2);
		} else if (var0 < 1500) {
			return staticMethod325(var0, var1, var2);
		} else if (var0 < 1600) {
			return staticMethod339(var0, var1, var2);
		} else if (var0 < 1700) {
			return staticMethod470(var0, var1, var2);
		} else if (var0 < 1800) {
			return staticMethod41(var0, var1, var2);
		} else {
			int var4;
			byte var8;
			int var19;
			int[] var26;
			int var30;
			int var43;
			Widget var46;
			if (var0 < 1900) {
				var46 = var2 ? Class3.staticWidget1 : staticWidget2;
				if (var0 == 1800) {
					var26 = staticIntArray16;
					var4 = ++staticInt27 - 1;
					var30 = staticMethod192(var46);
					var43 = var30 >> 11 & 0x3f;
					var26[var4] = var43;
					var8 = 1;
				} else if (var0 == 1801) {
					var19 = staticIntArray16[--staticInt27];
					--var19;
					if (var46.aStringArray4 != null && var19 < var46.aStringArray4.length
							&& var46.aStringArray4[var19] != null) {
						staticStringArray1[++staticInt148 - 1] = var46.aStringArray4[var19];
					} else {
						staticStringArray1[++staticInt148 - 1] = "";
					}

					var8 = 1;
				} else if (var0 == 1802) {
					if (var46.aString21 == null) {
						staticStringArray1[++staticInt148 - 1] = "";
					} else {
						staticStringArray1[++staticInt148 - 1] = var46.aString21;
					}

					var8 = 1;
				} else {
					var8 = 2;
				}

				return var8;
			} else if (var0 < 2000) {
				return staticMethod144(var0, var1, var2);
			} else if (var0 < 2100) {
				return staticMethod245(var0, var1, var2);
			} else if (var0 < 2200) {
				return staticMethod68(var0, var1, var2);
			} else if (var0 < 2300) {
				return staticMethod221(var0, var1, var2);
			} else if (var0 < 2400) {
				return staticMethod331(var0, var1, var2);
			} else if (var0 < 2500) {
				return staticMethod325(var0, var1, var2);
			} else if (var0 < 2600) {
				var46 = staticMethod8(staticIntArray16[--staticInt27]);
				if (var0 == 2500) {
					staticIntArray16[++staticInt27 - 1] = var46.anInt341;
					var8 = 1;
				} else if (var0 == 2501) {
					staticIntArray16[++staticInt27 - 1] = var46.anInt306;
					var8 = 1;
				} else if (var0 == 2502) {
					staticIntArray16[++staticInt27 - 1] = var46.anInt307;
					var8 = 1;
				} else if (var0 == 2503) {
					staticIntArray16[++staticInt27 - 1] = var46.anInt351;
					var8 = 1;
				} else if (var0 == 2504) {
					staticIntArray16[++staticInt27 - 1] = var46.aBool32 ? 1 : 0;
					var8 = 1;
				} else if (var0 == 2505) {
					staticIntArray16[++staticInt27 - 1] = var46.anInt342;
					var8 = 1;
				} else {
					var8 = 2;
				}

				return var8;
			} else if (var0 < 2700) {
				return staticMethod219(var0, var1, var2);
			} else {
				int var14;
				if (var0 < 2800) {
					if (var0 == 2700) {
						var46 = staticMethod8(staticIntArray16[--staticInt27]);
						staticIntArray16[++staticInt27 - 1] = var46.anInt352;
						var8 = 1;
					} else if (var0 == 2701) {
						var46 = staticMethod8(staticIntArray16[--staticInt27]);
						if (var46.anInt352 != -1) {
							staticIntArray16[++staticInt27 - 1] = var46.anInt353;
						} else {
							staticIntArray16[++staticInt27 - 1] = 0;
						}

						var8 = 1;
					} else if (var0 == 2702) {
						var14 = staticIntArray16[--staticInt27];
						KeyFocusListener var37 = (KeyFocusListener) Client.staticHashTable5.method149(var14);
						if (var37 != null) {
							staticIntArray16[++staticInt27 - 1] = 1;
						} else {
							staticIntArray16[++staticInt27 - 1] = 0;
						}

						var8 = 1;
					} else if (var0 == 2706) {
						staticIntArray16[++staticInt27 - 1] = Client.staticInt263;
						var8 = 1;
					} else {
						var8 = 2;
					}

					return var8;
				} else if (var0 < 2900) {
					var46 = staticMethod8(staticIntArray16[--staticInt27]);
					if (var0 == 2800) {
						var26 = staticIntArray16;
						var4 = ++staticInt27 - 1;
						var30 = staticMethod192(var46);
						var43 = var30 >> 11 & 0x3f;
						var26[var4] = var43;
						var8 = 1;
					} else if (var0 == 2801) {
						var19 = staticIntArray16[--staticInt27];
						--var19;
						if (var46.aStringArray4 != null && var19 < var46.aStringArray4.length
								&& var46.aStringArray4[var19] != null) {
							staticStringArray1[++staticInt148 - 1] = var46.aStringArray4[var19];
						} else {
							staticStringArray1[++staticInt148 - 1] = "";
						}

						var8 = 1;
					} else if (var0 == 2802) {
						if (var46.aString21 == null) {
							staticStringArray1[++staticInt148 - 1] = "";
						} else {
							staticStringArray1[++staticInt148 - 1] = var46.aString21;
						}

						var8 = 1;
					} else {
						var8 = 2;
					}

					return var8;
				} else if (var0 < 3000) {
					return staticMethod144(var0, var1, var2);
				} else {
					String var15;
					String var17;
					boolean var18;
					String var23;
					if (var0 < 3200) {
						if (var0 == 3100) {
							var15 = staticStringArray1[--staticInt148];
							staticMethod36(0, "", var15);
							var8 = 1;
						} else if (var0 == 3101) {
							staticInt27 -= 2;
							staticMethod94(AbstractClass2Sub1.staticPlayer1,
									staticIntArray16[staticInt27],
									staticIntArray16[staticInt27 + 1]);
							var8 = 1;
						} else if (var0 == 3103) {
							staticMethod120();
							var8 = 1;
						} else if (var0 == 3104) {
							var15 = staticStringArray1[--staticInt148];
							var19 = 0;
							if (staticMethod306(var15)) {
								var19 = staticMethod388(var15);
							}

							Client.outBuffer.method471(189);
							Client.outBuffer.writeInt(var19);
							var8 = 1;
						} else if (var0 == 3105) {
							var15 = staticStringArray1[--staticInt148];
							Client.outBuffer.method471(37);
							Client.outBuffer.writeByte(var15.length() + 1);
							Client.outBuffer.writeString(var15);
							var8 = 1;
						} else if (var0 == 3106) {
							var15 = staticStringArray1[--staticInt148];
							Client.outBuffer.method471(128);
							Client.outBuffer.writeByte(var15.length() + 1);
							Client.outBuffer.writeString(var15);
							var8 = 1;
						} else if (var0 == 3107) {
							var14 = staticIntArray16[--staticInt27];
							var23 = staticStringArray1[--staticInt148];
							staticMethod342(var14, var23);
							var8 = 1;
						} else {
							Widget var25;
							if (var0 == 3108) {
								staticInt27 -= 3;
								var14 = staticIntArray16[staticInt27];
								var19 = staticIntArray16[staticInt27 + 1];
								var4 = staticIntArray16[2 + staticInt27];
								var25 = staticMethod8(var4);
								staticMethod242(var25, var14, var19);
								var8 = 1;
							} else if (var0 == 3109) {
								staticInt27 -= 2;
								var14 = staticIntArray16[staticInt27];
								var19 = staticIntArray16[1 + staticInt27];
								var25 = var2 ? Class3.staticWidget1 : staticWidget2;
								staticMethod242(var25, var14, var19);
								var8 = 1;
							} else if (var0 == 3110) {
								staticBool18 = staticIntArray16[--staticInt27] == 1;
								var8 = 1;
							} else if (var0 == 3111) {
								staticIntArray16[++staticInt27 - 1] = staticClass6_1.aBool3 ? 1
										: 0;
								var8 = 1;
							} else if (var0 == 3112) {
								staticClass6_1.aBool3 = staticIntArray16[--staticInt27] == 1;
								staticMethod270();
								var8 = 1;
							} else if (var0 == 3113) {
								var15 = staticStringArray1[--staticInt148];
								var18 = staticIntArray16[--staticInt27] == 1;
								staticMethod125(var15, var18, false);
								var8 = 1;
							} else if (var0 == 3115) {
								var14 = staticIntArray16[--staticInt27];
								Client.outBuffer.method471(92);
								Client.outBuffer.writeShort(var14);
								var8 = 1;
							} else if (var0 == 3116) {
								var14 = staticIntArray16[--staticInt27];
								staticInt148 -= 2;
								var23 = staticStringArray1[staticInt148];
								var17 = staticStringArray1[1 + staticInt148];
								if (var23.length() > 500) {
									var8 = 1;
								} else if (var17.length() > 500) {
									var8 = 1;
								} else {
									Client.outBuffer.method471(136);
									Client.outBuffer
											.writeShort(1 + staticMethod378(var23) + staticMethod378(var17));
									Client.outBuffer.writeString(var17);
									Client.outBuffer.method343(var14);
									Client.outBuffer.writeString(var23);
									var8 = 1;
								}
							} else if (var0 == 3117) {
								Client.staticBool39 = staticIntArray16[--staticInt27] == 1;
								var8 = 1;
							} else {
								var8 = 2;
							}
						}

						return var8;
					} else if (var0 < 3300) {
						return staticMethod269(var0, var1, var2);
					} else if (var0 < 3400) {
						return staticMethod24(var0, var1, var2);
					} else {
						int var31;
						if (var0 < 3500) {
							ClientScriptMap var261;
							ClientScriptMap var27;
							byte[] var28;
							if (var0 == 3400) {
								staticInt27 -= 2;
								var14 = staticIntArray16[staticInt27];
								var19 = staticIntArray16[1 + staticInt27];
								var261 = (ClientScriptMap) ClientScriptMap.staticCache23.get(var14);
								if (var261 != null) {
									var27 = var261;
								} else {
									var28 = ClientScriptMap.staticJs5Index25.getFile(8, var14);
									var261 = new ClientScriptMap();
									if (var28 != null) {
										var261.method531(new ByteBuf(var28));
									}

									ClientScriptMap.staticCache23.method170(var261, var14);
									var27 = var261;
								}

								var261 = var27;
								if (var27.aChar2 != 115) {
									;
								}

								for (var30 = 0; var30 < var261.anInt524; var30++) {
									if (var19 == var261.anIntArray112[var30]) {
										staticStringArray1[++staticInt148
												- 1] = var261.aStringArray9[var30];
										var261 = null;
										break;
									}
								}

								if (var261 != null) {
									staticStringArray1[++staticInt148 - 1] = var261.aString34;
								}

								var8 = 1;
							} else if (var0 == 3408) {
								staticInt27 -= 4;
								var14 = staticIntArray16[staticInt27];
								var19 = staticIntArray16[staticInt27 + 1];
								var4 = staticIntArray16[staticInt27 + 2];
								var43 = staticIntArray16[staticInt27 + 3];
								var261 = (ClientScriptMap) ClientScriptMap.staticCache23.get(var4);
								if (var261 != null) {
									var27 = var261;
								} else {
									var28 = ClientScriptMap.staticJs5Index25.getFile(8, var4);
									var261 = new ClientScriptMap();
									if (var28 != null) {
										var261.method531(new ByteBuf(var28));
									}

									ClientScriptMap.staticCache23.method170(var261, var4);
									var27 = var261;
								}

								var261 = var27;
								if (var27.aChar1 == var14 && var19 == var27.aChar2) {
									for (var31 = 0; var31 < var261.anInt524; var31++) {
										if (var261.anIntArray112[var31] == var43) {
											if (var19 == 115) {
												staticStringArray1[++staticInt148
														- 1] = var261.aStringArray9[var31];
											} else {
												staticIntArray16[++staticInt27
														- 1] = var261.anIntArray113[var31];
											}

											var261 = null;
											break;
										}
									}

									if (var261 != null) {
										if (var19 == 115) {
											staticStringArray1[++staticInt148 - 1] = var261.aString34;
										} else {
											staticIntArray16[++staticInt27 - 1] = var261.anInt523;
										}
									}

									var8 = 1;
								} else {
									if (var19 == 115) {
										staticStringArray1[++staticInt148 - 1] = "null";
									} else {
										staticIntArray16[++staticInt27 - 1] = 0;
									}

									var8 = 1;
								}
							} else {
								var8 = 2;
							}

							return var8;
						} else if (var0 < 3700) {
							return staticMethod177(var0, var1, var2);
						} else if (var0 < 4000) {
							return staticMethod43(var0, var1, var2);
						} else if (var0 < 4100) {
							return staticMethod328(var0, var1, var2);
						} else if (var0 < 4200) {
							return staticMethod204(var0, var1, var2);
						} else {
							int var7;
							boolean var9;
							int var11;
							if (var0 < 4300) {
								if (var0 == 4200) {
									var14 = staticIntArray16[--staticInt27];
									staticStringArray1[++staticInt148
											- 1] = staticMethod153(var14).aString31;
									var8 = 1;
								} else {
									ItemDefinition var391;
									if (var0 == 4201) {
										staticInt27 -= 2;
										var14 = staticIntArray16[staticInt27];
										var19 = staticIntArray16[1 + staticInt27];
										var391 = staticMethod153(var14);
										if (var19 >= 1 && var19 <= 5 && var391.aStringArray7[var19 - 1] != null) {
											staticStringArray1[++staticInt148
													- 1] = var391.aStringArray7[var19 - 1];
										} else {
											staticStringArray1[++staticInt148 - 1] = "";
										}

										var8 = 1;
									} else if (var0 == 4202) {
										staticInt27 -= 2;
										var14 = staticIntArray16[staticInt27];
										var19 = staticIntArray16[1 + staticInt27];
										var391 = staticMethod153(var14);
										if (var19 >= 1 && var19 <= 5 && var391.aStringArray6[var19 - 1] != null) {
											staticStringArray1[++staticInt148
													- 1] = var391.aStringArray6[var19 - 1];
										} else {
											staticStringArray1[++staticInt148 - 1] = "";
										}

										var8 = 1;
									} else if (var0 == 4203) {
										var14 = staticIntArray16[--staticInt27];
										staticIntArray16[++staticInt27
												- 1] = staticMethod153(var14).anInt460;
										var8 = 1;
									} else if (var0 == 4204) {
										var14 = staticIntArray16[--staticInt27];
										staticIntArray16[++staticInt27
												- 1] = staticMethod153(var14).anInt442 == 1 ? 1 : 0;
										var8 = 1;
									} else {
										ItemDefinition var36;
										if (var0 == 4205) {
											var14 = staticIntArray16[--staticInt27];
											var36 = staticMethod153(var14);
											if (var36.anInt457 == -1 && var36.anInt435 >= 0) {
												staticIntArray16[++staticInt27 - 1] = var36.anInt435;
											} else {
												staticIntArray16[++staticInt27 - 1] = var14;
											}

											var8 = 1;
										} else if (var0 == 4206) {
											var14 = staticIntArray16[--staticInt27];
											var36 = staticMethod153(var14);
											if (var36.anInt457 >= 0 && var36.anInt435 >= 0) {
												staticIntArray16[++staticInt27 - 1] = var36.anInt435;
											} else {
												staticIntArray16[++staticInt27 - 1] = var14;
											}

											var8 = 1;
										} else if (var0 == 4207) {
											var14 = staticIntArray16[--staticInt27];
											staticIntArray16[++staticInt27
													- 1] = staticMethod153(var14).aBool55 ? 1 : 0;
											var8 = 1;
										} else if (var0 == 4208) {
											var14 = staticIntArray16[--staticInt27];
											var36 = staticMethod153(var14);
											if (var36.anInt467 == -1 && var36.anInt445 >= 0) {
												staticIntArray16[++staticInt27 - 1] = var36.anInt445;
											} else {
												staticIntArray16[++staticInt27 - 1] = var14;
											}

											var8 = 1;
										} else if (var0 == 4209) {
											var14 = staticIntArray16[--staticInt27];
											var36 = staticMethod153(var14);
											if (var36.anInt467 >= 0 && var36.anInt445 >= 0) {
												staticIntArray16[++staticInt27 - 1] = var36.anInt445;
											} else {
												staticIntArray16[++staticInt27 - 1] = var14;
											}

											var8 = 1;
										} else if (var0 == 4210) {
											var15 = staticStringArray1[--staticInt148];
											var19 = staticIntArray16[--staticInt27];
											var9 = var19 == 1;
											var17 = var15.toLowerCase();
											short[] var32 = new short[16];
											var7 = 0;
											var31 = 0;

											while (true) {
												short[] var39;
												if (var31 >= KeyboardHandler.staticInt85) {
													Class4.staticShortArray1 = var32;
													staticInt20 = 0;
													staticInt114 = var7;
													String[] var34 = new String[staticInt114];

													for (var11 = 0; var11 < staticInt114; var11++) {
														var34[var11] = staticMethod153(var32[var11]).aString31;
													}

													var39 = Class4.staticShortArray1;
													staticMethod61(var34, var39, 0, var34.length - 1);
													break;
												}

												ItemDefinition var33 = staticMethod153(var31);
												if ((!var9 || var33.aBool56) && var33.anInt457 == -1
														&& var33.aString31.toLowerCase().indexOf(var17) != -1) {
													if (var7 >= 250) {
														staticInt114 = -1;
														Class4.staticShortArray1 = null;
														break;
													}

													if (var7 >= var32.length) {
														var39 = new short[var32.length * 2];

														for (int var13 = 0; var13 < var7; var13++) {
															var39[var13] = var32[var13];
														}

														var32 = var39;
													}

													var32[var7++] = (short) var31;
												}

												++var31;
											}

											staticIntArray16[++staticInt27 - 1] = staticInt114;
											var8 = 1;
										} else if (var0 == 4211) {
											if (Class4.staticShortArray1 != null
													&& staticInt20 < staticInt114) {
												staticIntArray16[++staticInt27
														- 1] = Class4.staticShortArray1[++staticInt20 - 1]
																& 0xffff;
											} else {
												staticIntArray16[++staticInt27 - 1] = -1;
											}

											var8 = 1;
										} else if (var0 == 4212) {
											staticInt20 = 0;
											var8 = 1;
										} else {
											var8 = 2;
										}
									}
								}

								return var8;
							} else if (var0 < 5100) {
								if (var0 == 5000) {
									staticIntArray16[++staticInt27 - 1] = Client.staticInt160;
									var8 = 1;
								} else if (var0 == 5001) {
									staticInt27 -= 3;
									Client.staticInt160 = staticIntArray16[staticInt27];
									staticClass55_1 = staticMethod255(
											staticIntArray16[staticInt27 + 1]);
									if (staticClass55_1 == null) {
										staticClass55_1 = Class55.staticClass55_2;
									}

									Client.staticInt291 = staticIntArray16[2 + staticInt27];
									Client.outBuffer.method471(2);
									Client.outBuffer.writeByte(Client.staticInt160);
									Client.outBuffer.writeByte(staticClass55_1.anInt207);
									Client.outBuffer.writeByte(Client.staticInt291);
									var8 = 1;
								} else if (var0 == 5002) {
									var15 = staticStringArray1[--staticInt148];
									staticInt27 -= 2;
									var19 = staticIntArray16[staticInt27];
									var4 = staticIntArray16[staticInt27 + 1];
									Client.outBuffer.method471(195);
									Client.outBuffer.writeByte(staticMethod378(var15) + 2);
									Client.outBuffer.writeString(var15);
									Client.outBuffer.writeByte(var19 - 1);
									Client.outBuffer.writeByte(var4);
									var8 = 1;
								} else {
									ChatMessage var29;
									if (var0 == 5003) {
										staticInt27 -= 2;
										var14 = staticIntArray16[staticInt27];
										var19 = staticIntArray16[staticInt27 + 1];
										var29 = staticMethod237(var14, var19);
										if (var29 != null) {
											staticIntArray16[++staticInt27 - 1] = var29.anInt571;
											staticIntArray16[++staticInt27 - 1] = var29.anInt570;
											staticStringArray1[++staticInt148
													- 1] = var29.aString36 != null ? var29.aString36 : "";
											staticStringArray1[++staticInt148
													- 1] = var29.aString38 != null ? var29.aString38 : "";
											staticStringArray1[++staticInt148
													- 1] = var29.aString37 != null ? var29.aString37 : "";
										} else {
											staticIntArray16[++staticInt27 - 1] = -1;
											staticIntArray16[++staticInt27 - 1] = 0;
											staticStringArray1[++staticInt148 - 1] = "";
											staticStringArray1[++staticInt148 - 1] = "";
											staticStringArray1[++staticInt148 - 1] = "";
										}

										var8 = 1;
									} else if (var0 == 5004) {
										var14 = staticIntArray16[--staticInt27];
										var29 = staticMethod131(var14);
										if (var29 != null) {
											staticIntArray16[++staticInt27 - 1] = var29.anInt572;
											staticIntArray16[++staticInt27 - 1] = var29.anInt570;
											staticStringArray1[++staticInt148
													- 1] = var29.aString36 != null ? var29.aString36 : "";
											staticStringArray1[++staticInt148
													- 1] = var29.aString38 != null ? var29.aString38 : "";
											staticStringArray1[++staticInt148
													- 1] = var29.aString37 != null ? var29.aString37 : "";
										} else {
											staticIntArray16[++staticInt27 - 1] = -1;
											staticIntArray16[++staticInt27 - 1] = 0;
											staticStringArray1[++staticInt148 - 1] = "";
											staticStringArray1[++staticInt148 - 1] = "";
											staticStringArray1[++staticInt148 - 1] = "";
										}

										var8 = 1;
									} else if (var0 == 5005) {
										if (staticClass55_1 == null) {
											staticIntArray16[++staticInt27 - 1] = -1;
										} else {
											staticIntArray16[++staticInt27
													- 1] = staticClass55_1.anInt207;
										}

										var8 = 1;
									} else if (var0 == 5008) {
										var15 = staticStringArray1[--staticInt148];
										var19 = staticIntArray16[--staticInt27];
										var17 = var15.toLowerCase();
										byte var301 = 0;
										if (var17.startsWith("yellow:")) {
											var301 = 0;
											var15 = var15.substring("yellow:".length());
										} else if (var17.startsWith("red:")) {
											var301 = 1;
											var15 = var15.substring("red:".length());
										} else if (var17.startsWith("green:")) {
											var301 = 2;
											var15 = var15.substring("green:".length());
										} else if (var17.startsWith("cyan:")) {
											var301 = 3;
											var15 = var15.substring("cyan:".length());
										} else if (var17.startsWith("purple:")) {
											var301 = 4;
											var15 = var15.substring("purple:".length());
										} else if (var17.startsWith("white:")) {
											var301 = 5;
											var15 = var15.substring("white:".length());
										} else if (var17.startsWith("flash1:")) {
											var301 = 6;
											var15 = var15.substring("flash1:".length());
										} else if (var17.startsWith("flash2:")) {
											var301 = 7;
											var15 = var15.substring("flash2:".length());
										} else if (var17.startsWith("flash3:")) {
											var301 = 8;
											var15 = var15.substring("flash3:".length());
										} else if (var17.startsWith("glow1:")) {
											var301 = 9;
											var15 = var15.substring("glow1:".length());
										} else if (var17.startsWith("glow2:")) {
											var301 = 10;
											var15 = var15.substring("glow2:".length());
										} else if (var17.startsWith("glow3:")) {
											var301 = 11;
											var15 = var15.substring("glow3:".length());
										} else if (Client.staticInt231 != 0) {
											if (var17.startsWith("yellow:")) {
												var301 = 0;
												var15 = var15.substring("yellow:".length());
											} else if (var17.startsWith("red:")) {
												var301 = 1;
												var15 = var15.substring("red:".length());
											} else if (var17.startsWith("green:")) {
												var301 = 2;
												var15 = var15.substring("green:".length());
											} else if (var17.startsWith("cyan:")) {
												var301 = 3;
												var15 = var15.substring("cyan:".length());
											} else if (var17.startsWith("purple:")) {
												var301 = 4;
												var15 = var15.substring("purple:".length());
											} else if (var17.startsWith("white:")) {
												var301 = 5;
												var15 = var15.substring("white:".length());
											} else if (var17.startsWith("flash1:")) {
												var301 = 6;
												var15 = var15.substring("flash1:".length());
											} else if (var17.startsWith("flash2:")) {
												var301 = 7;
												var15 = var15.substring("flash2:".length());
											} else if (var17.startsWith("flash3:")) {
												var301 = 8;
												var15 = var15.substring("flash3:".length());
											} else if (var17.startsWith("glow1:")) {
												var301 = 9;
												var15 = var15.substring("glow1:".length());
											} else if (var17.startsWith("glow2:")) {
												var301 = 10;
												var15 = var15.substring("glow2:".length());
											} else if (var17.startsWith("glow3:")) {
												var301 = 11;
												var15 = var15.substring("glow3:".length());
											}
										}

										var17 = var15.toLowerCase();
										byte var311 = 0;
										if (var17.startsWith("wave:")) {
											var311 = 1;
											var15 = var15.substring("wave:".length());
										} else if (var17.startsWith("wave2:")) {
											var311 = 2;
											var15 = var15.substring("wave2:".length());
										} else if (var17.startsWith("shake:")) {
											var311 = 3;
											var15 = var15.substring("shake:".length());
										} else if (var17.startsWith("scroll:")) {
											var311 = 4;
											var15 = var15.substring("scroll:".length());
										} else if (var17.startsWith("slide:")) {
											var311 = 5;
											var15 = var15.substring("slide:".length());
										} else if (Client.staticInt231 != 0) {
											if (var17.startsWith("wave:")) {
												var311 = 1;
												var15 = var15.substring("wave:".length());
											} else if (var17.startsWith("wave2:")) {
												var311 = 2;
												var15 = var15.substring("wave2:".length());
											} else if (var17.startsWith("shake:")) {
												var311 = 3;
												var15 = var15.substring("shake:".length());
											} else if (var17.startsWith("scroll:")) {
												var311 = 4;
												var15 = var15.substring("scroll:".length());
											} else if (var17.startsWith("slide:")) {
												var311 = 5;
												var15 = var15.substring("slide:".length());
											}
										}

										Client.outBuffer.method471(79);
										Client.outBuffer.writeByte(0);
										var7 = Client.outBuffer.position;
										Client.outBuffer.writeByte(var19);
										Client.outBuffer.writeByte(var301);
										Client.outBuffer.writeByte(var311);
										BitBuf var10 = Client.outBuffer;
										var11 = var10.position;
										byte[] var12 = staticMethod340(var15);
										var10.method328(var12.length);
										var10.position += staticClass47_1.method239(var12, 0, var12.length, var10.buf,
												var10.position);
										Client.outBuffer.method327(Client.outBuffer.position - var7);
										var8 = 1;
									} else if (var0 == 5009) {
										staticInt148 -= 2;
										var15 = staticStringArray1[staticInt148];
										var23 = staticStringArray1[staticInt148 + 1];
										Client.outBuffer.method471(169);
										Client.outBuffer.writeShort(0);
										var4 = Client.outBuffer.position;
										Client.outBuffer.writeString(var15);
										BitBuf var38 = Client.outBuffer;
										var30 = var38.position;
										byte[] var35 = staticMethod340(var23);
										var38.method328(var35.length);
										var38.position += staticClass47_1.method239(var35, 0, var35.length, var38.buf,
												var38.position);
										Client.outBuffer.method371(Client.outBuffer.position - var4);
										var8 = 1;
									} else if (var0 == 5015) {
										if (AbstractClass2Sub1.staticPlayer1 != null
												&& AbstractClass2Sub1.staticPlayer1.aString40 != null) {
											var15 = AbstractClass2Sub1.staticPlayer1.aString40;
										} else {
											var15 = "";
										}

										staticStringArray1[++staticInt148 - 1] = var15;
										var8 = 1;
									} else if (var0 == 5016) {
										staticIntArray16[++staticInt27 - 1] = Client.staticInt291;
										var8 = 1;
									} else if (var0 == 5017) {
										var14 = staticIntArray16[--staticInt27];
										staticIntArray16[++staticInt27 - 1] = staticMethod223(var14);
										var8 = 1;
									} else if (var0 == 5018) {
										var14 = staticIntArray16[--staticInt27];
										var26 = staticIntArray16;
										var4 = ++staticInt27 - 1;
										var29 = (ChatMessage) staticClass35_1.method159(var14);
										if (var29 == null) {
											var43 = -1;
										} else if (var29.aCacheable6 == staticClass45_1.aCacheable5) {
											var43 = -1;
										} else {
											var43 = ((ChatMessage) var29.aCacheable6).anInt571;
										}

										var26[var4] = var43;
										var8 = 1;
									} else if (var0 == 5019) {
										var14 = staticIntArray16[--staticInt27];
										var26 = staticIntArray16;
										var4 = ++staticInt27 - 1;
										var29 = (ChatMessage) staticClass35_1.method159(var14);
										if (var29 == null) {
											var43 = -1;
										} else if (staticClass45_1.aCacheable5 == var29.aCacheable7) {
											var43 = -1;
										} else {
											var43 = ((ChatMessage) var29.aCacheable7).anInt571;
										}

										var26[var4] = var43;
										var8 = 1;
									} else if (var0 == 5020) {
										var15 = staticStringArray1[--staticInt148];
										staticMethod127(var15);
										var8 = 1;
									} else if (var0 == 5021) {
										Client.staticString33 = staticStringArray1[--staticInt148]
												.toLowerCase().trim();
										var8 = 1;
									} else if (var0 == 5022) {
										staticStringArray1[++staticInt148 - 1] = Client.staticString33;
										var8 = 1;
									} else {
										var8 = 2;
									}
								}

								return var8;
							} else if (var0 < 5400) {
								if (var0 == 5306) {
									staticIntArray16[++staticInt27 - 1] = staticMethod248();
									var8 = 1;
								} else if (var0 == 5307) {
									var14 = staticIntArray16[--staticInt27];
									if (var14 == 1 || var14 == 2) {
										Client.staticLong11 = 0L;
										if (var14 >= 2) {
											Client.resizable = true;
										} else {
											Client.resizable = false;
										}

										staticMethod335();
										if (Client.staticInt165 >= 25) {
											staticMethod34();
										}

										GameShell.staticBool14 = true;
									}

									var8 = 1;
								} else if (var0 == 5308) {
									staticIntArray16[++staticInt27 - 1] = staticClass6_1.anInt15;
									var8 = 1;
								} else if (var0 == 5309) {
									var14 = staticIntArray16[--staticInt27];
									if (var14 == 1 || var14 == 2) {
										staticClass6_1.anInt15 = var14;
										staticMethod270();
									}

									var8 = 1;
								} else {
									var8 = 2;
								}

								return var8;
							} else if (var0 < 5600) {
								return staticMethod60(var0, var1, var2);
							} else if (var0 < 5700) {
								if (var0 == 5630) {
									Client.staticInt196 = 250;
									var8 = 1;
								} else {
									var8 = 2;
								}

								return var8;
							} else if (var0 < 6300) {
								return staticMethod190(var0, var1, var2);
							} else if (var0 >= 6600) {
								return 2;
							} else {
								if (var0 == 6500) {
									staticIntArray16[++staticInt27 - 1] = staticMethod121() ? 1 : 0;
									var8 = 1;
								} else {
									Class2 var3;
									if (var0 == 6501) {
										var3 = staticMethod183();
										if (var3 != null) {
											staticIntArray16[++staticInt27 - 1] = var3.anInt4;
											staticIntArray16[++staticInt27 - 1] = var3.anInt3;
											staticStringArray1[++staticInt148 - 1] = var3.aString2;
											staticIntArray16[++staticInt27 - 1] = var3.anInt6;
											staticIntArray16[++staticInt27 - 1] = var3.anInt5;
											staticStringArray1[++staticInt148 - 1] = var3.aString1;
										} else {
											staticIntArray16[++staticInt27 - 1] = -1;
											staticIntArray16[++staticInt27 - 1] = 0;
											staticStringArray1[++staticInt148 - 1] = "";
											staticIntArray16[++staticInt27 - 1] = 0;
											staticIntArray16[++staticInt27 - 1] = 0;
											staticStringArray1[++staticInt148 - 1] = "";
										}

										var8 = 1;
									} else if (var0 == 6502) {
										var3 = staticMethod137();
										if (var3 != null) {
											staticIntArray16[++staticInt27 - 1] = var3.anInt4;
											staticIntArray16[++staticInt27 - 1] = var3.anInt3;
											staticStringArray1[++staticInt148 - 1] = var3.aString2;
											staticIntArray16[++staticInt27 - 1] = var3.anInt6;
											staticIntArray16[++staticInt27 - 1] = var3.anInt5;
											staticStringArray1[++staticInt148 - 1] = var3.aString1;
										} else {
											staticIntArray16[++staticInt27 - 1] = -1;
											staticIntArray16[++staticInt27 - 1] = 0;
											staticStringArray1[++staticInt148 - 1] = "";
											staticIntArray16[++staticInt27 - 1] = 0;
											staticIntArray16[++staticInt27 - 1] = 0;
											staticStringArray1[++staticInt148 - 1] = "";
										}

										var8 = 1;
									} else {
										Class2 var5;
										if (var0 == 6506) {
											var14 = staticIntArray16[--staticInt27];
											var5 = null;

											for (var4 = 0; var4 < Class2.staticInt2; var4++) {
												if (Class2.staticClass2Array1[var4].anInt4 == var14) {
													var5 = Class2.staticClass2Array1[var4];
													break;
												}
											}

											if (var5 != null) {
												staticIntArray16[++staticInt27 - 1] = var5.anInt4;
												staticIntArray16[++staticInt27 - 1] = var5.anInt3;
												staticStringArray1[++staticInt148 - 1] = var5.aString2;
												staticIntArray16[++staticInt27 - 1] = var5.anInt6;
												staticIntArray16[++staticInt27 - 1] = var5.anInt5;
												staticStringArray1[++staticInt148 - 1] = var5.aString1;
											} else {
												staticIntArray16[++staticInt27 - 1] = -1;
												staticIntArray16[++staticInt27 - 1] = 0;
												staticStringArray1[++staticInt148 - 1] = "";
												staticIntArray16[++staticInt27 - 1] = 0;
												staticIntArray16[++staticInt27 - 1] = 0;
												staticStringArray1[++staticInt148 - 1] = "";
											}

											var8 = 1;
										} else if (var0 == 6507) {
											staticInt27 -= 4;
											var14 = staticIntArray16[staticInt27];
											var18 = staticIntArray16[staticInt27 + 1] == 1;
											var4 = staticIntArray16[2 + staticInt27];
											var9 = staticIntArray16[staticInt27 + 3] == 1;
											if (Class2.staticClass2Array1 != null) {
												staticMethod50(0, Class2.staticClass2Array1.length - 1, var14, var18,
														var4, var9);
											}

											var8 = 1;
										} else if (var0 == 6511) {
											var14 = staticIntArray16[--staticInt27];
											if (var14 >= 0 && var14 < Class2.staticInt2) {
												var5 = Class2.staticClass2Array1[var14];
												staticIntArray16[++staticInt27 - 1] = var5.anInt4;
												staticIntArray16[++staticInt27 - 1] = var5.anInt3;
												staticStringArray1[++staticInt148 - 1] = var5.aString2;
												staticIntArray16[++staticInt27 - 1] = var5.anInt6;
												staticIntArray16[++staticInt27 - 1] = var5.anInt5;
												staticStringArray1[++staticInt148 - 1] = var5.aString1;
											} else {
												staticIntArray16[++staticInt27 - 1] = -1;
												staticIntArray16[++staticInt27 - 1] = 0;
												staticStringArray1[++staticInt148 - 1] = "";
												staticIntArray16[++staticInt27 - 1] = 0;
												staticIntArray16[++staticInt27 - 1] = 0;
												staticStringArray1[++staticInt148 - 1] = "";
											}

											var8 = 1;
										} else if (var0 == 6512) {
											Client.staticBool22 = staticIntArray16[--staticInt27] == 1;
											var8 = 1;
										} else {
											var8 = 2;
										}
									}
								}

								return var8;
							}
						}
					}
				}
			}
		}
	}

	public static void staticMethod424() {
		NpcDefinition.staticCache28.method171();
		NpcDefinition.staticCache27.method171();
	}

	public static String staticMethod392(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder();

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) {
			int var5 = var0[var4] & 0xff;
			var3.append(staticCharArray3[var5 >>> 2]);
			if (var4 < var2 - 1) {
				int var6 = var0[var4 + 1] & 0xff;
				var3.append(staticCharArray3[(var5 & 0x3) << 4 | var6 >>> 4]);
				if (var4 < var2 - 2) {
					int var7 = var0[var4 + 2] & 0xff;
					var3.append(staticCharArray3[(var6 & 0xf) << 2 | var7 >>> 6])
							.append(staticCharArray3[var7 & 0x3f]);
				} else {
					var3.append(staticCharArray3[(var6 & 0xf) << 2]).append("=");
				}
			} else {
				var3.append(staticCharArray3[(var5 & 0x3) << 4]).append("==");
			}
		}

		return var3.toString();
	}

	static final void staticMethod393(int var0) {
		if (staticMethod4(var0)) {
			Widget[] var1 = Widget.staticWidgetArrayArray1[var0];

			for (int var2 = 0; var2 < var1.length; var2++) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.anInt354 = 0;
					var3.anInt314 = 0;
				}
			}
		}

	}

	public static ObjectDefinition staticMethod394(int var0) {
		ObjectDefinition var1 = (ObjectDefinition) ObjectDefinition.staticCache18.get(var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ObjectDefinition.staticJs5Index20.getFile(6, var0);
			var1 = new ObjectDefinition();
			var1.anInt483 = var0;
			if (var2 != null) {
				var1.method518(new ByteBuf(var2));
			}

			var1.method510();
			if (var1.aBool57) {
				var1.anInt487 = 0;
				var1.aBool60 = false;
			}

			ObjectDefinition.staticCache18.method170(var1, var0);
			return var1;
		}
	}

	static int staticMethod389(Js5Index var0, Js5Index var1) {
		int var2 = 0;
		if (var0.method270("title.jpg", "")) {
			++var2;
		}

		if (var1.method270("logo", "")) {
			++var2;
		}

		if (var1.method270("logo_deadman_mode", "")) {
			++var2;
		}

		if (var1.method270("titlebox", "")) {
			++var2;
		}

		if (var1.method270("titlebutton", "")) {
			++var2;
		}

		if (var1.method270("runes", "")) {
			++var2;
		}

		if (var1.method270("title_mute", "")) {
			++var2;
		}

		if (var1.method271("options_radio_buttons,0")) {
			++var2;
		}

		if (var1.method271("options_radio_buttons,2")) {
			++var2;
		}

		var1.method270("sl_back", "");
		var1.method270("sl_flags", "");
		var1.method270("sl_arrows", "");
		var1.method270("sl_stars", "");
		var1.method270("sl_button", "");
		return var2;
	}

	static void staticMethod395() {
		int var0 = gameWidth;
		int var1 = Class47.gameHeight;
		if (Class40Sub1.staticInt317 < var0) {
			var0 = Class40Sub1.staticInt317;
		}

		if (BuildType.staticInt124 < var1) {
			var1 = BuildType.staticInt124;
		}

		if (staticClass6_1 != null) {
			try {
				Client var2 = Client.staticGame1;
				Object[] var3 = new Object[] { Integer.valueOf(staticMethod248()) };
				JSObject.getWindow(var2).call("resize", var3);
			} catch (Throwable var4) {
				;
			}
		}

	}

	public static int staticMethod399(char var0, int var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		return var2;
	}

	static void staticMethod380(int var0) {
		for (NodeSub15 var1 = (NodeSub15) Client.staticHashTable6
				.method146(); var1 != null; var1 = (NodeSub15) Client.staticHashTable6.method147()) {
			if (var0 == (var1.id >> 48 & 0xffff)) {
				var1.method174();
			}
		}

	}

	public static Config15 staticMethod381(int var0) {
		Config15 var1 = (Config15) Config15.staticCache19.get(var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = Config15.staticJs5Index21.getFile(15, var0);
			var1 = new Config15();
			if (var2 != null) {
				var1.method520(new ByteBuf(var2));
			}

			Config15.staticCache19.method170(var1, var0);
			return var1;
		}
	}

	public static CacheableSub6 staticMethod387(int var0) {
		CacheableSub6 var1 = (CacheableSub6) CacheableSub6.staticCache21.get(var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = CacheableSub6.staticJs5Index24.getFile(33, var0);
			var1 = new CacheableSub6();
			if (var2 != null) {
				var1.method526(new ByteBuf(var2));
			}

			CacheableSub6.staticCache21.method170(var1, var0);
			return var1;
		}
	}

	public static NodeSub8Sub2 staticMethod351(NodeSub6Sub1 var0, int var1, int var2, int var3) {
		return var0.aByteArray23 != null && var0.aByteArray23.length != 0 ? new NodeSub8Sub2(var0, var1, var2, var3)
				: null;
	}

	public static NodeSub8Sub2 staticMethod352(NodeSub6Sub1 var0, int var1, int var2) {
		return var0.aByteArray23 != null && var0.aByteArray23.length != 0
				? new NodeSub8Sub2(var0, (int) (var0.anInt420 * 256L * var1 / (staticInt120 * 100)), var2 << 6)
				: null;
	}

	static int staticMethod353(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7,
			NodeSub8Sub2 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var7 - var2) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
		}

		var8.anInt410 = var2 << 8;
		return var3;
	}

	static int staticMethod354(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7,
			int var8, int var9, NodeSub8Sub2 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var9 - var3) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.anInt410 = var3 << 8;
		return var4 >> 1;
	}

	static int staticMethod355(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7,
			NodeSub8Sub2 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
		}

		var8.anInt410 = var2 << 8;
		return var3;
	}

	static int staticMethod356(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7,
			int var8, int var9, int var10, NodeSub8Sub2 var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 0xff);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + (var1 - var14) * (var4 & 0xff);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.anInt410 = var4;
		return var5 >> 1;
	}

	static int staticMethod357(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7,
			int var8, int var9, int var10, NodeSub8Sub2 var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 0xff);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 0xff);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.anInt410 = var4;
		return var5 >> 1;
	}

	static int staticMethod358(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7,
			int var8, int var9, NodeSub8Sub2 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.anInt410 = var3 << 8;
		return var4 >> 1;
	}

	static int staticMethod359(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7,
			int var8, int var9, int var10, int var11, NodeSub8Sub2 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var4 + var11 - var3) > var10) {
			var9 = var10;
		}

		var12.anInt408 += var12.anInt409 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.anInt406 = var5 >> 2;
		var12.anInt404 = var6 >> 2;
		var12.anInt410 = var3 << 8;
		return var4 >> 1;
	}

	static int staticMethod360(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8, NodeSub8Sub2 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.anInt406 += var9.anInt416 * (var6 - var3);
		var9.anInt404 += var9.anInt417 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		var9.anInt408 = var4 >> 2;
		var9.anInt410 = var2 << 8;
		return var3;
	}

	static int staticMethod361(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7,
			int var8, int var9, int var10, int var11, NodeSub8Sub2 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.anInt408 += var12.anInt409 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.anInt406 = var5 >> 2;
		var12.anInt404 = var6 >> 2;
		var12.anInt410 = var3 << 8;
		return var4 >> 1;
	}

	static int staticMethod362(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7,
			int var8, int var9, int var10, NodeSub8Sub2 var11, int var12, int var13) {
		var11.anInt406 -= var11.anInt416 * var5;
		var11.anInt404 -= var11.anInt417 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 0xff)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 0xff)) * var6 >> 6;
			var6 += var7;
		}

		var11.anInt406 += var11.anInt416 * var5;
		var11.anInt404 += var11.anInt417 * var5;
		var11.anInt408 = var6;
		var11.anInt410 = var4;
		return var5;
	}

	static int staticMethod363(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7,
			int var8, int var9, int var10, int var11, int var12, NodeSub8Sub2 var13, int var14, int var15) {
		var13.anInt408 -= var13.anInt409 * var5;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 0xff);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + (var1 - var16) * (var4 & 0xff);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.anInt408 += var13.anInt409 * var5;
		var13.anInt406 = var6;
		var13.anInt404 = var7;
		var13.anInt410 = var4;
		return var5;
	}

	static int staticMethod364(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7,
			int var8, int var9, int var10, NodeSub8Sub2 var11, int var12, int var13) {
		var11.anInt406 -= var11.anInt416 * var5;
		var11.anInt404 -= var11.anInt417 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 0xff)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var0 = var13;

		for (var1 = var12; var5 < var8; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 0xff)) * var6 >> 6;
			var6 += var7;
		}

		var11.anInt406 += var11.anInt416 * var5;
		var11.anInt404 += var11.anInt417 * var5;
		var11.anInt408 = var6;
		var11.anInt410 = var4;
		return var5;
	}

	static int staticMethod365(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7,
			int var8, int var9, int var10, int var11, int var12, NodeSub8Sub2 var13, int var14, int var15) {
		var13.anInt408 -= var13.anInt409 * var5;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			byte var16 = var2[var1 - 1];
			var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 0xff);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 0xff);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.anInt408 += var13.anInt409 * var5;
		var13.anInt406 = var6;
		var13.anInt404 = var7;
		var13.anInt410 = var4;
		return var5;
	}

	static int staticMethod366(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7,
			int var8, int var9, NodeSub8Sub2 var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
			var7 = var8;
		}

		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 0xff)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
			var7 = var8;
		}

		for (var1 = var12; var5 < var7; var4 += var11) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 0xff)) * var6 >> 6;
		}

		var10.anInt410 = var4;
		return var5;
	}

	static int staticMethod367(int var0, int var1) {
		return var1 < 0 ? var0 : (int) (var0 * Math.sqrt((16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	static int staticMethod368(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7,
			int var8, int var9, NodeSub8Sub2 var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
			var7 = var8;
		}

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 0xff)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
			var7 = var8;
		}

		var0 = var12;

		for (var1 = var11; var5 < var7; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 0xff)) * var6 >> 6;
		}

		var10.anInt410 = var4;
		return var5;
	}

	static int staticMethod369(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8, NodeSub8Sub2 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.anInt406 += var9.anInt416 * (var6 - var3);
		var9.anInt404 += var9.anInt417 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		var9.anInt408 = var4 >> 2;
		var9.anInt410 = var2 << 8;
		return var3;
	}

	static int staticMethod370(int var0, int var1) {
		return var1 < 0 ? -var0 : (int) (var0 * Math.sqrt(var1 * 1.220703125E-4D) + 0.5D);
	}

	static final boolean staticMethod376(int var0, int var1, int var2, AbstractClass2 var3, Class38 var4) {
		int var5 = var0;
		int var13 = var1;
		byte var7 = 64;
		byte var8 = 64;
		int var9 = var0 - var7;
		int var17 = var1 - var8;
		staticIntArrayArray6[var7][var8] = 99;
		staticIntArrayArray5[var7][var8] = 0;
		byte var11 = 0;
		int var12 = 0;
		staticIntArray49[var11] = var0;
		int var20 = var11 + 1;
		staticIntArray50[var11] = var1;
		int[][] var6 = var4.anIntArrayArray5;

		label204: while (var20 != var12) {
			var5 = staticIntArray49[var12];
			var13 = staticIntArray50[var12];
			var12 = var12 + 1 & 0xfff;
			int var18 = var5 - var9;
			int var19 = var13 - var17;
			int var14 = var5 - var4.anInt156;
			int var15 = var13 - var4.anInt157;
			if (var3.method172(var2, var5, var13, var4)) {
				staticInt110 = var5;
				Js5CacheWriteRequest.staticInt315 = var13;
				return true;
			}

			int var16 = staticIntArrayArray5[var18][var19] + 1;
			int var10;
			if (var18 > 0 && staticIntArrayArray6[var18 - 1][var19] == 0
					&& (var6[var14 - 1][var15] & 0x124010e) == 0
					&& (var6[var14 - 1][var2 + var15 - 1] & 0x1240138) == 0) {
				var10 = 1;

				while (true) {
					if (var10 >= var2 - 1) {
						staticIntArray49[var20] = var5 - 1;
						staticIntArray50[var20] = var13;
						var20 = 1 + var20 & 0xfff;
						staticIntArrayArray6[var18 - 1][var19] = 2;
						staticIntArrayArray5[var18 - 1][var19] = var16;
						break;
					}

					if ((var6[var14 - 1][var10 + var15] & 0x124013e) != 0) {
						break;
					}

					++var10;
				}
			}

			if (var18 < 128 - var2 && staticIntArrayArray6[1 + var18][var19] == 0
					&& (var6[var14 + var2][var15] & 0x1240183) == 0
					&& (var6[var14 + var2][var2 + var15 - 1] & 0x12401e0) == 0) {
				var10 = 1;

				while (true) {
					if (var10 >= var2 - 1) {
						staticIntArray49[var20] = var5 + 1;
						staticIntArray50[var20] = var13;
						var20 = 1 + var20 & 0xfff;
						staticIntArrayArray6[var18 + 1][var19] = 8;
						staticIntArrayArray5[var18 + 1][var19] = var16;
						break;
					}

					if ((var6[var2 + var14][var10 + var15] & 0x12401e3) != 0) {
						break;
					}

					++var10;
				}
			}

			if (var19 > 0 && staticIntArrayArray6[var18][var19 - 1] == 0
					&& (var6[var14][var15 - 1] & 0x124010e) == 0
					&& (var6[var14 + var2 - 1][var15 - 1] & 0x1240183) == 0) {
				var10 = 1;

				while (true) {
					if (var10 >= var2 - 1) {
						staticIntArray49[var20] = var5;
						staticIntArray50[var20] = var13 - 1;
						var20 = var20 + 1 & 0xfff;
						staticIntArrayArray6[var18][var19 - 1] = 1;
						staticIntArrayArray5[var18][var19 - 1] = var16;
						break;
					}

					if ((var6[var14 + var10][var15 - 1] & 0x124018f) != 0) {
						break;
					}

					++var10;
				}
			}

			if (var19 < 128 - var2 && staticIntArrayArray6[var18][var19 + 1] == 0
					&& (var6[var14][var15 + var2] & 0x1240138) == 0
					&& (var6[var14 + var2 - 1][var15 + var2] & 0x12401e0) == 0) {
				var10 = 1;

				while (true) {
					if (var10 >= var2 - 1) {
						staticIntArray49[var20] = var5;
						staticIntArray50[var20] = var13 + 1;
						var20 = var20 + 1 & 0xfff;
						staticIntArrayArray6[var18][var19 + 1] = 4;
						staticIntArrayArray5[var18][1 + var19] = var16;
						break;
					}

					if ((var6[var14 + var10][var15 + var2] & 0x12401f8) != 0) {
						break;
					}

					++var10;
				}
			}

			if (var18 > 0 && var19 > 0 && staticIntArrayArray6[var18 - 1][var19 - 1] == 0
					&& (var6[var14 - 1][var15 - 1] & 0x124010e) == 0) {
				var10 = 1;

				while (true) {
					if (var10 >= var2) {
						staticIntArray49[var20] = var5 - 1;
						staticIntArray50[var20] = var13 - 1;
						var20 = 1 + var20 & 0xfff;
						staticIntArrayArray6[var18 - 1][var19 - 1] = 3;
						staticIntArrayArray5[var18 - 1][var19 - 1] = var16;
						break;
					}

					if ((var6[var14 - 1][var10 + var15 - 1] & 0x124013e) != 0
							|| (var6[var14 - 1 + var10][var15 - 1] & 0x124018f) != 0) {
						break;
					}

					++var10;
				}
			}

			if (var18 < 128 - var2 && var19 > 0 && staticIntArrayArray6[var18 + 1][var19 - 1] == 0
					&& (var6[var2 + var14][var15 - 1] & 0x1240183) == 0) {
				var10 = 1;

				while (true) {
					if (var10 >= var2) {
						staticIntArray49[var20] = var5 + 1;
						staticIntArray50[var20] = var13 - 1;
						var20 = var20 + 1 & 0xfff;
						staticIntArrayArray6[1 + var18][var19 - 1] = 9;
						staticIntArrayArray5[1 + var18][var19 - 1] = var16;
						break;
					}

					if ((var6[var2 + var14][var15 - 1 + var10] & 0x12401e3) != 0
							|| (var6[var10 + var14][var15 - 1] & 0x124018f) != 0) {
						break;
					}

					++var10;
				}
			}

			if (var18 > 0 && var19 < 128 - var2 && staticIntArrayArray6[var18 - 1][var19 + 1] == 0
					&& (var6[var14 - 1][var15 + var2] & 0x1240138) == 0) {
				var10 = 1;

				while (true) {
					if (var10 >= var2) {
						staticIntArray49[var20] = var5 - 1;
						staticIntArray50[var20] = 1 + var13;
						var20 = 1 + var20 & 0xfff;
						staticIntArrayArray6[var18 - 1][1 + var19] = 6;
						staticIntArrayArray5[var18 - 1][var19 + 1] = var16;
						break;
					}

					if ((var6[var14 - 1][var10 + var15] & 0x124013e) != 0
							|| (var6[var10 + var14 - 1][var2 + var15] & 0x12401f8) != 0) {
						break;
					}

					++var10;
				}
			}

			if (var18 < 128 - var2 && var19 < 128 - var2 && staticIntArrayArray6[var18 + 1][var19 + 1] == 0
					&& (var6[var14 + var2][var15 + var2] & 0x12401e0) == 0) {
				for (var10 = 1; var10 < var2; var10++) {
					if ((var6[var14 + var10][var2 + var15] & 0x12401f8) != 0
							|| (var6[var14 + var2][var15 + var10] & 0x12401e3) != 0) {
						continue label204;
					}
				}

				staticIntArray49[var20] = 1 + var5;
				staticIntArray50[var20] = 1 + var13;
				var20 = var20 + 1 & 0xfff;
				staticIntArrayArray6[1 + var18][var19 + 1] = 12;
				staticIntArrayArray5[var18 + 1][var19 + 1] = var16;
			}
		}

		staticInt110 = var5;
		Js5CacheWriteRequest.staticInt315 = var13;
		return false;
	}

	public static Class staticMethod377(String var0) throws ClassNotFoundException {
		return var0.equals("B") ? Byte.TYPE
				: var0.equals("I") ? Integer.TYPE
						: var0.equals("S") ? Short.TYPE
								: var0.equals("J") ? Long.TYPE
										: var0.equals("Z") ? Boolean.TYPE
												: var0.equals("F") ? Float.TYPE
														: var0.equals("D") ? Double.TYPE
																: var0.equals("C") ? Character.TYPE
																		: var0.equals("void") ? Void.TYPE
																				: Class.forName(var0);
	}

	public static void staticMethod397(Js5Index var0, Js5Index var1) {
		Class25.staticJs5Index1 = var0;
		SpotAnim.staticJs5Index30 = var1;
	}

	public static void staticMethod400(int[] var0, int var1, int var2) {
		Rasterizer2D.staticIntArray130 = var0;
		Rasterizer2D.staticInt330 = var1;
		Rasterizer2D.staticInt326 = var2;
		staticMethod416(0, 0, var1, var2);
	}

	public static void staticMethod401() {
		Rasterizer2D.staticInt329 = 0;
		Rasterizer2D.staticInt328 = 0;
		Rasterizer2D.staticInt327 = Rasterizer2D.staticInt330;
		Rasterizer2D.staticInt325 = Rasterizer2D.staticInt326;
	}

	public static void staticMethod402(int var0, int var1, int var2, int var3) {
		if (Rasterizer2D.staticInt329 < var0) {
			Rasterizer2D.staticInt329 = var0;
		}

		if (Rasterizer2D.staticInt328 < var1) {
			Rasterizer2D.staticInt328 = var1;
		}

		if (Rasterizer2D.staticInt327 > var2) {
			Rasterizer2D.staticInt327 = var2;
		}

		if (Rasterizer2D.staticInt325 > var3) {
			Rasterizer2D.staticInt325 = var3;
		}

	}

	public static void staticMethod403(int[] var0) {
		var0[0] = Rasterizer2D.staticInt329;
		var0[1] = Rasterizer2D.staticInt328;
		var0[2] = Rasterizer2D.staticInt327;
		var0[3] = Rasterizer2D.staticInt325;
	}

	static void staticMethod404(int var0, int var1, int var2, int var3, int var4) {
		if (var0 >= Rasterizer2D.staticInt329 && var0 < Rasterizer2D.staticInt327) {
			if (var1 < Rasterizer2D.staticInt328) {
				var2 -= Rasterizer2D.staticInt328 - var1;
				var1 = Rasterizer2D.staticInt328;
			}

			if (var1 + var2 > Rasterizer2D.staticInt325) {
				var2 = Rasterizer2D.staticInt325 - var1;
			}

			int var7 = 256 - var4;
			int var8 = (var3 >> 16 & 0xff) * var4;
			int var9 = (var3 >> 8 & 0xff) * var4;
			int var13 = (var3 & 0xff) * var4;
			int var6 = var0 + var1 * Rasterizer2D.staticInt330;

			for (int var5 = 0; var5 < var2; var5++) {
				int var10 = (Rasterizer2D.staticIntArray130[var6] >> 16 & 0xff) * var7;
				int var11 = (Rasterizer2D.staticIntArray130[var6] >> 8 & 0xff) * var7;
				int var12 = (Rasterizer2D.staticIntArray130[var6] & 0xff) * var7;
				int var14 = (var8 + var10 >> 8 << 16) + (var9 + var11 >> 8 << 8) + (var13 + var12 >> 8);
				Rasterizer2D.staticIntArray130[var6] = var14;
				var6 += Rasterizer2D.staticInt330;
			}
		}

	}

	public static void staticMethod405(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 < Rasterizer2D.staticInt329) {
			var2 -= Rasterizer2D.staticInt329 - var0;
			var0 = Rasterizer2D.staticInt329;
		}

		if (var1 < Rasterizer2D.staticInt328) {
			var3 -= Rasterizer2D.staticInt328 - var1;
			var1 = Rasterizer2D.staticInt328;
		}

		if (var0 + var2 > Rasterizer2D.staticInt327) {
			var2 = Rasterizer2D.staticInt327 - var0;
		}

		if (var1 + var3 > Rasterizer2D.staticInt325) {
			var3 = Rasterizer2D.staticInt325 - var1;
		}

		var4 = ((var4 & 0xff00ff) * var5 >> 8 & 0xff00ff) + ((var4 & 0xff00) * var5 >> 8 & 0xff00);
		int var8 = 256 - var5;
		int var9 = Rasterizer2D.staticInt330 - var2;
		int var6 = var0 + var1 * Rasterizer2D.staticInt330;

		for (int var10 = 0; var10 < var3; var10++) {
			for (int var11 = -var2; var11 < 0; var11++) {
				int var7 = Rasterizer2D.staticIntArray130[var6];
				var7 = ((var7 & 0xff00ff) * var8 >> 8 & 0xff00ff) + ((var7 & 0xff00) * var8 >> 8 & 0xff00);
				Rasterizer2D.staticIntArray130[var6++] = var4 + var7;
			}

			var6 += var9;
		}

	}

	public static void staticMethod406(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = 0;
		int var17 = var4 == var5 && var6 == var7 ? -1 : 65536 / var3;
		int var12 = var6;
		int var13 = 256 - var6;
		int var15 = var4;
		if (var0 < Rasterizer2D.staticInt329) {
			var2 -= Rasterizer2D.staticInt329 - var0;
			var0 = Rasterizer2D.staticInt329;
		}

		if (var1 < Rasterizer2D.staticInt328) {
			var8 += (Rasterizer2D.staticInt328 - var1) * var17;
			var3 -= Rasterizer2D.staticInt328 - var1;
			var1 = Rasterizer2D.staticInt328;
		}

		if (var0 + var2 > Rasterizer2D.staticInt327) {
			var2 = Rasterizer2D.staticInt327 - var0;
		}

		if (var1 + var3 > Rasterizer2D.staticInt325) {
			var3 = Rasterizer2D.staticInt325 - var1;
		}

		int var18 = Rasterizer2D.staticInt330 - var2;
		int var19 = var0 + var1 * Rasterizer2D.staticInt330;

		for (int var14 = -var3; var14 < 0; var14++) {
			int var16;
			int var20;
			for (var16 = -var2; var16 < 0; var16++) {
				var20 = Rasterizer2D.staticIntArray130[var19];
				int var10 = var15 + var20;
				int var9 = (var15 & 0xff00ff) + (var20 & 0xff00ff);
				int var11 = (var9 & 0x1000100) + (var10 - var9 & 0x10000);
				if (var13 == 0) {
					Rasterizer2D.staticIntArray130[var19++] = var10 - var11 | var11 - (var11 >>> 8);
				} else {
					int var21 = var10 - var11 | var11 - (var11 >>> 8);
					Rasterizer2D.staticIntArray130[var19++] = ((var21 & 0xff00ff) * var12 >> 8 & 0xff00ff)
							+ ((var21 & 0xff00) * var12 >> 8 & 0xff00) + ((var20 & 0xff00ff) * var13 >> 8 & 0xff00ff)
							+ ((var20 & 0xff00) * var13 >> 8 & 0xff00);
				}
			}

			if (var17 > 0) {
				var8 += var17;
				var16 = 65536 - var8 >> 8;
				var20 = var8 >> 8;
				if (var6 != var7) {
					var12 = var6 * (65536 - var8) + var7 * var8 >> 16;
					var13 = 256 - var12;
				}

				if (var4 != var5) {
					var15 = ((var4 & 0xff00ff) * var16 + (var5 & 0xff00ff) * var20 & 0xff00ff00)
							+ ((var4 & 0xff00) * var16 + (var5 & 0xff00) * var20 & 0xff0000) >>> 8;
				}
			}

			var19 += var18;
		}

	}

	public static void staticMethod407(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = 0;
		int var15 = var4 == var5 && var6 == var7 ? -1 : 65536 / var3;
		int var9 = var6;
		int var12 = 256 - var6;
		if (var0 < Rasterizer2D.staticInt329) {
			var2 -= Rasterizer2D.staticInt329 - var0;
			var0 = Rasterizer2D.staticInt329;
		}

		if (var1 < Rasterizer2D.staticInt328) {
			var8 += (Rasterizer2D.staticInt328 - var1) * var15;
			var3 -= Rasterizer2D.staticInt328 - var1;
			var1 = Rasterizer2D.staticInt328;
		}

		if (var0 + var2 > Rasterizer2D.staticInt327) {
			var2 = Rasterizer2D.staticInt327 - var0;
		}

		if (var1 + var3 > Rasterizer2D.staticInt325) {
			var3 = Rasterizer2D.staticInt325 - var1;
		}

		int var10 = var4 >> 16;
		int var17 = (var4 & 0xff00) >> 8;
		int var18 = var4 & 0xff;
		int var19 = Rasterizer2D.staticInt330 - var2;
		int var20 = var0 + var1 * Rasterizer2D.staticInt330;

		for (int var21 = 0; var21 < var3; var21++) {
			int var11;
			int var13;
			int var22;
			for (var22 = -var2; var22 < 0; var22++) {
				var13 = Rasterizer2D.staticIntArray130[var20];
				var11 = var13 >> 16;
				int var14 = (var13 & 0xff00) >> 8;
				int var23 = var13 & 0xff;
				int var16;
				int var24;
				int var25;
				if (var12 == 0) {
					var24 = var11 < 127 ? var10 * var11 >> 7 : 255 - ((255 - var10) * (255 - var11) >> 7);
					var25 = var14 < 127 ? var17 * var14 >> 7 : 255 - ((255 - var17) * (255 - var14) >> 7);
					var16 = var23 < 127 ? var18 * var23 >> 7 : 255 - ((255 - var18) * (255 - var23) >> 7);
				} else {
					var24 = var11 < 127 ? (var10 * var11 * var9 >> 7) + var11 * var12 >> 8
							: (255 - ((255 - var10) * (255 - var11) >> 7)) * var9 + var11 * var12 >> 8;
					var25 = var14 < 127 ? (var17 * var14 * var9 >> 7) + var14 * var12 >> 8
							: (255 - ((255 - var17) * (255 - var14) >> 7)) * var9 + var14 * var12 >> 8;
					var16 = var23 < 127 ? (var18 * var23 * var9 >> 7) + var23 * var12 >> 8
							: (255 - ((255 - var18) * (255 - var23) >> 7)) * var9 + var23 * var12 >> 8;
				}

				Rasterizer2D.staticIntArray130[var20++] = (var24 << 16) + (var25 << 8) + var16;
			}

			if (var15 > 0) {
				var8 += var15;
				var22 = 65536 - var8 >> 8;
				var13 = var8 >> 8;
				if (var6 != var7) {
					var9 = var6 * (65536 - var8) + var7 * var8 >> 16;
					var12 = 256 - var9;
				}

				if (var4 != var5) {
					var11 = ((var4 & 0xff00ff) * var22 + (var5 & 0xff00ff) * var13 & 0xff00ff00)
							+ ((var4 & 0xff00) * var22 + (var5 & 0xff00) * var13 & 0xff0000) >>> 8;
					var10 = var11 >> 16;
					var17 = (var11 & 0xff00) >> 8;
					var18 = var11 & 0xff;
				}
			}

			var20 += var19;
		}

	}

	public static void staticMethod408(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = 0;
		int var24 = 65536 / var3;
		int var10 = var6;
		int var11 = 256 - var6;
		if (var0 < Rasterizer2D.staticInt329) {
			var2 -= Rasterizer2D.staticInt329 - var0;
			var0 = Rasterizer2D.staticInt329;
		}

		if (var1 < Rasterizer2D.staticInt328) {
			var8 += (Rasterizer2D.staticInt328 - var1) * var24;
			var3 -= Rasterizer2D.staticInt328 - var1;
			var1 = Rasterizer2D.staticInt328;
		}

		if (var0 + var2 > Rasterizer2D.staticInt327) {
			var2 = Rasterizer2D.staticInt327 - var0;
		}

		if (var1 + var3 > Rasterizer2D.staticInt325) {
			var3 = Rasterizer2D.staticInt325 - var1;
		}

		int var13 = var4 & 0xff0000;
		int var17 = var4 & 0xff00;
		int var14 = var4 & 0xff;
		int var16 = var13 * var6 >> 8;
		int var18 = var17 * var6 >> 8;
		int var15 = var14 * var6 >> 8;
		int var21 = Rasterizer2D.staticInt330 - var2;
		int var19 = var0 + var1 * Rasterizer2D.staticInt330;

		for (int var20 = 0; var20 < var3; var20++) {
			int var9;
			int var12;
			int var22;
			for (var9 = -var2; var9 < 0; var9++) {
				var22 = Rasterizer2D.staticIntArray130[var19];
				var12 = var22 & 0xff0000;
				int var28 = var12 <= var13 ? var12 : var11 == 0 ? var13 : var16 + (var12 * var11 >> 8) & 0xff0000;
				int var25 = var22 & 0xff00;
				int var26 = var25 <= var17 ? var25 : var11 == 0 ? var17 : var18 + (var25 * var11 >> 8) & 0xff00;
				int var23 = var22 & 0xff;
				int var27 = var23 <= var14 ? var23 : var11 == 0 ? var14 : var15 + (var23 * var11 >> 8);
				Rasterizer2D.staticIntArray130[var19++] = var28 + var26 + var27;
			}

			if (var24 > 0) {
				var8 += var24;
				var9 = 65536 - var8 >> 8;
				var22 = var8 >> 8;
				if (var6 != var7) {
					var10 = var6 * (65536 - var8) + var7 * var8 >> 16;
					var11 = 256 - var10;
				}

				if (var4 != var5) {
					var12 = ((var4 & 0xff00ff) * var9 + (var5 & 0xff00ff) * var22 & 0xff00ff00)
							+ ((var4 & 0xff00) * var9 + (var5 & 0xff00) * var22 & 0xff0000) >>> 8;
					var13 = var12 & 0xff0000;
					var17 = var12 & 0xff00;
					var14 = var12 & 0xff;
					var16 = var13 * var10 >> 8;
					var18 = var17 * var10 >> 8;
					var15 = var14 * var10 >> 8;
				}
			}

			var19 += var21;
		}

	}

	public static void staticMethod409(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = 0;
		int var14 = 65536 / var3;
		int var10 = var6;
		int var13 = 256 - var6;
		if (var0 < Rasterizer2D.staticInt329) {
			var2 -= Rasterizer2D.staticInt329 - var0;
			var0 = Rasterizer2D.staticInt329;
		}

		if (var1 < Rasterizer2D.staticInt328) {
			var8 += (Rasterizer2D.staticInt328 - var1) * var14;
			var3 -= Rasterizer2D.staticInt328 - var1;
			var1 = Rasterizer2D.staticInt328;
		}

		if (var0 + var2 > Rasterizer2D.staticInt327) {
			var2 = Rasterizer2D.staticInt327 - var0;
		}

		if (var1 + var3 > Rasterizer2D.staticInt325) {
			var3 = Rasterizer2D.staticInt325 - var1;
		}

		int var16 = var4 & 0xff0000;
		int var19 = var4 & 0xff00;
		int var20 = var4 & 0xff;
		int var21 = var16 * var6 >> 8;
		int var11 = var19 * var6 >> 8;
		int var24 = var20 * var6 >> 8;
		int var22 = Rasterizer2D.staticInt330 - var2;
		int var9 = var0 + var1 * Rasterizer2D.staticInt330;

		for (int var23 = 0; var23 < var3; var23++) {
			int var15;
			int var17;
			int var18;
			for (var18 = -var2; var18 < 0; var18++) {
				var17 = Rasterizer2D.staticIntArray130[var9];
				var15 = var17 & 0xff0000;
				int var26 = var15 >= var16 ? var15 : var13 == 0 ? var16 : var21 + (var15 * var13 >> 8) & 0xff0000;
				int var12 = var17 & 0xff00;
				int var27 = var12 >= var19 ? var12 : var13 == 0 ? var19 : var11 + (var12 * var13 >> 8) & 0xff00;
				int var25 = var17 & 0xff;
				int var28 = var25 >= var20 ? var25 : var13 == 0 ? var20 : var24 + (var25 * var13 >> 8);
				Rasterizer2D.staticIntArray130[var9++] = var26 + var27 + var28;
			}

			if (var14 > 0) {
				var8 += var14;
				var18 = 65536 - var8 >> 8;
				var17 = var8 >> 8;
				if (var6 != var7) {
					var10 = var6 * (65536 - var8) + var7 * var8 >> 16;
					var13 = 256 - var10;
				}

				if (var4 != var5) {
					var15 = ((var4 & 0xff00ff) * var18 + (var5 & 0xff00ff) * var17 & 0xff00ff00)
							+ ((var4 & 0xff00) * var18 + (var5 & 0xff00) * var17 & 0xff0000) >>> 8;
					var16 = var15 & 0xff0000;
					var19 = var15 & 0xff00;
					var20 = var15 & 0xff;
					var21 = var16 * var10 >> 8;
					var11 = var19 * var10 >> 8;
					var24 = var20 * var10 >> 8;
				}
			}

			var9 += var22;
		}

	}

	public static void staticMethod410(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = 0;
		int var8 = 65536 / var3;
		if (var0 < Rasterizer2D.staticInt329) {
			var2 -= Rasterizer2D.staticInt329 - var0;
			var0 = Rasterizer2D.staticInt329;
		}

		if (var1 < Rasterizer2D.staticInt328) {
			var6 += (Rasterizer2D.staticInt328 - var1) * var8;
			var3 -= Rasterizer2D.staticInt328 - var1;
			var1 = Rasterizer2D.staticInt328;
		}

		if (var0 + var2 > Rasterizer2D.staticInt327) {
			var2 = Rasterizer2D.staticInt327 - var0;
		}

		if (var1 + var3 > Rasterizer2D.staticInt325) {
			var3 = Rasterizer2D.staticInt325 - var1;
		}

		int var10 = Rasterizer2D.staticInt330 - var2;
		int var9 = var0 + var1 * Rasterizer2D.staticInt330;

		for (int var7 = -var3; var7 < 0; var7++) {
			int var12 = 65536 - var6 >> 8;
			int var11 = var6 >> 8;
			int var13 = ((var4 & 0xff00ff) * var12 + (var5 & 0xff00ff) * var11 & 0xff00ff00)
					+ ((var4 & 0xff00) * var12 + (var5 & 0xff00) * var11 & 0xff0000) >>> 8;

			for (int var14 = -var2; var14 < 0; var14++) {
				Rasterizer2D.staticIntArray130[var9++] = var13;
			}

			var9 += var10;
			var6 += var8;
		}

	}

	public static void staticMethod411(int var0, int var1, int var2, int var3, int var4) {
		staticMethod413(var0, var1, var2, var4);
		staticMethod413(var0, var1 + var3 - 1, var2, var4);
		staticMethod415(var0, var1, var3, var4);
		staticMethod415(var0 + var2 - 1, var1, var3, var4);
	}

	public static void staticMethod412(int var0, int var1, int var2, int var3, int var4, int var5) {
		staticMethod414(var0, var1, var2, var4, var5);
		staticMethod414(var0, var1 + var3 - 1, var2, var4, var5);
		if (var3 >= 3) {
			staticMethod404(var0, var1 + 1, var3 - 2, var4, var5);
			staticMethod404(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
		}

	}

	public static void staticMethod413(int var0, int var1, int var2, int var3) {
		if (var1 >= Rasterizer2D.staticInt328 && var1 < Rasterizer2D.staticInt325) {
			if (var0 < Rasterizer2D.staticInt329) {
				var2 -= Rasterizer2D.staticInt329 - var0;
				var0 = Rasterizer2D.staticInt329;
			}

			if (var0 + var2 > Rasterizer2D.staticInt327) {
				var2 = Rasterizer2D.staticInt327 - var0;
			}

			int var5 = var0 + var1 * Rasterizer2D.staticInt330;

			for (int var4 = 0; var4 < var2; var4++) {
				Rasterizer2D.staticIntArray130[var5 + var4] = var3;
			}
		}

	}

	static void staticMethod414(int var0, int var1, int var2, int var3, int var4) {
		if (var1 >= Rasterizer2D.staticInt328 && var1 < Rasterizer2D.staticInt325) {
			if (var0 < Rasterizer2D.staticInt329) {
				var2 -= Rasterizer2D.staticInt329 - var0;
				var0 = Rasterizer2D.staticInt329;
			}

			if (var0 + var2 > Rasterizer2D.staticInt327) {
				var2 = Rasterizer2D.staticInt327 - var0;
			}

			int var6 = 256 - var4;
			int var8 = (var3 >> 16 & 0xff) * var4;
			int var9 = (var3 >> 8 & 0xff) * var4;
			int var10 = (var3 & 0xff) * var4;
			int var5 = var0 + var1 * Rasterizer2D.staticInt330;

			for (int var11 = 0; var11 < var2; var11++) {
				int var12 = (Rasterizer2D.staticIntArray130[var5] >> 16 & 0xff) * var6;
				int var13 = (Rasterizer2D.staticIntArray130[var5] >> 8 & 0xff) * var6;
				int var7 = (Rasterizer2D.staticIntArray130[var5] & 0xff) * var6;
				int var14 = (var8 + var12 >> 8 << 16) + (var9 + var13 >> 8 << 8) + (var10 + var7 >> 8);
				Rasterizer2D.staticIntArray130[var5++] = var14;
			}
		}

	}

	public static void staticMethod415(int var0, int var1, int var2, int var3) {
		if (var0 >= Rasterizer2D.staticInt329 && var0 < Rasterizer2D.staticInt327) {
			if (var1 < Rasterizer2D.staticInt328) {
				var2 -= Rasterizer2D.staticInt328 - var1;
				var1 = Rasterizer2D.staticInt328;
			}

			if (var1 + var2 > Rasterizer2D.staticInt325) {
				var2 = Rasterizer2D.staticInt325 - var1;
			}

			int var5 = var0 + var1 * Rasterizer2D.staticInt330;

			for (int var4 = 0; var4 < var2; var4++) {
				Rasterizer2D.staticIntArray130[var5 + var4 * Rasterizer2D.staticInt330] = var3;
			}
		}

	}

	public static void staticMethod416(int var0, int var1, int var2, int var3) {
		if (var0 < 0) {
			var0 = 0;
		}

		if (var1 < 0) {
			var1 = 0;
		}

		if (var2 > Rasterizer2D.staticInt330) {
			var2 = Rasterizer2D.staticInt330;
		}

		if (var3 > Rasterizer2D.staticInt326) {
			var3 = Rasterizer2D.staticInt326;
		}

		Rasterizer2D.staticInt329 = var0;
		Rasterizer2D.staticInt328 = var1;
		Rasterizer2D.staticInt327 = var2;
		Rasterizer2D.staticInt325 = var3;
	}

	public static void staticMethod417(int var0, int var1, int var2, int var3, int var4) {
		var2 -= var0;
		var3 -= var1;
		if (var3 == 0) {
			if (var2 >= 0) {
				staticMethod413(var0, var1, var2 + 1, var4);
			} else {
				staticMethod413(var0 + var2, var1, -var2 + 1, var4);
			}
		} else if (var2 == 0) {
			if (var3 >= 0) {
				staticMethod415(var0, var1, var3 + 1, var4);
			} else {
				staticMethod415(var0, var1 + var3, -var3 + 1, var4);
			}
		} else {
			if (var2 + var3 < 0) {
				var0 += var2;
				var2 = -var2;
				var1 += var3;
				var3 = -var3;
			}

			int var5;
			int var6;
			if (var2 > var3) {
				var1 <<= 16;
				var1 += '\u8000';
				var3 <<= 16;
				var5 = (int) Math.floor((double) var3 / (double) var2 + 0.5D);
				var2 += var0;
				if (var0 < Rasterizer2D.staticInt329) {
					var1 += var5 * (Rasterizer2D.staticInt329 - var0);
					var0 = Rasterizer2D.staticInt329;
				}

				if (var2 >= Rasterizer2D.staticInt327) {
					var2 = Rasterizer2D.staticInt327 - 1;
				}

				while (var0 <= var2) {
					var6 = var1 >> 16;
					if (var6 >= Rasterizer2D.staticInt328 && var6 < Rasterizer2D.staticInt325) {
						Rasterizer2D.staticIntArray130[var0 + var6 * Rasterizer2D.staticInt330] = var4;
					}

					var1 += var5;
					++var0;
				}
			} else {
				var0 <<= 16;
				var0 += '\u8000';
				var2 <<= 16;
				var5 = (int) Math.floor((double) var2 / (double) var3 + 0.5D);
				var3 += var1;
				if (var1 < Rasterizer2D.staticInt328) {
					var0 += var5 * (Rasterizer2D.staticInt328 - var1);
					var1 = Rasterizer2D.staticInt328;
				}

				if (var3 >= Rasterizer2D.staticInt325) {
					var3 = Rasterizer2D.staticInt325 - 1;
				}

				while (var1 <= var3) {
					var6 = var0 >> 16;
					if (var6 >= Rasterizer2D.staticInt329 && var6 < Rasterizer2D.staticInt327) {
						Rasterizer2D.staticIntArray130[var6 + var1 * Rasterizer2D.staticInt330] = var4;
					}

					var0 += var5;
					++var1;
				}
			}
		}

	}

	public static void staticMethod418(int var0, int var1, int var2, int var3, int var4) {
		if (var0 < Rasterizer2D.staticInt329) {
			var2 -= Rasterizer2D.staticInt329 - var0;
			var0 = Rasterizer2D.staticInt329;
		}

		if (var1 < Rasterizer2D.staticInt328) {
			var3 -= Rasterizer2D.staticInt328 - var1;
			var1 = Rasterizer2D.staticInt328;
		}

		if (var0 + var2 > Rasterizer2D.staticInt327) {
			var2 = Rasterizer2D.staticInt327 - var0;
		}

		if (var1 + var3 > Rasterizer2D.staticInt325) {
			var3 = Rasterizer2D.staticInt325 - var1;
		}

		int var6 = Rasterizer2D.staticInt330 - var2;
		int var7 = var0 + var1 * Rasterizer2D.staticInt330;

		for (int var8 = -var3; var8 < 0; var8++) {
			for (int var5 = -var2; var5 < 0; var5++) {
				Rasterizer2D.staticIntArray130[var7++] = var4;
			}

			var7 += var6;
		}

	}

	public static void staticMethod419() {
		int var0 = 0;

		int var1;
		for (var1 = Rasterizer2D.staticInt330 * Rasterizer2D.staticInt326
				- 7; var0 < var1; Rasterizer2D.staticIntArray130[var0++] = 0) {
			Rasterizer2D.staticIntArray130[var0++] = 0;
			Rasterizer2D.staticIntArray130[var0++] = 0;
			Rasterizer2D.staticIntArray130[var0++] = 0;
			Rasterizer2D.staticIntArray130[var0++] = 0;
			Rasterizer2D.staticIntArray130[var0++] = 0;
			Rasterizer2D.staticIntArray130[var0++] = 0;
			Rasterizer2D.staticIntArray130[var0++] = 0;
		}

		for (var1 += 7; var0 < var1; Rasterizer2D.staticIntArray130[var0++] = 0) {
			;
		}

	}

	public static void staticMethod420(int[] var0) {
		Rasterizer2D.staticInt329 = var0[0];
		Rasterizer2D.staticInt328 = var0[1];
		Rasterizer2D.staticInt327 = var0[2];
		Rasterizer2D.staticInt325 = var0[3];
	}

	public static void staticMethod421(int var0, int var1, int var2, int[] var3, int[] var4) {
		int var5 = var0 + var1 * Rasterizer2D.staticInt330;

		for (var1 = 0; var1 < var3.length; var1++) {
			int var6 = var5 + var3[var1];

			for (var0 = -var4[var1]; var0 < 0; var0++) {
				Rasterizer2D.staticIntArray130[var6++] = var2;
			}

			var5 += Rasterizer2D.staticInt330;
		}

	}

	static void staticMethod371(int var0, int var1) {
		ContextMenuItem var2 = Class20.staticContextMenuItem1;
		staticMethod66(var2.anInt7, var2.anInt10, var2.anInt8, var2.anInt9, var2.aString3, var2.aString3, var0, var1);
		Class20.staticContextMenuItem1 = null;
	}

	public static void staticMethod372() {
		if (TaskManager.staticString19.toLowerCase().indexOf("microsoft") != -1) {
			KeyboardHandler.staticIntArray47[186] = 57;
			KeyboardHandler.staticIntArray47[187] = 27;
			KeyboardHandler.staticIntArray47[188] = 71;
			KeyboardHandler.staticIntArray47[189] = 26;
			KeyboardHandler.staticIntArray47[190] = 72;
			KeyboardHandler.staticIntArray47[191] = 73;
			KeyboardHandler.staticIntArray47[192] = 58;
			KeyboardHandler.staticIntArray47[219] = 42;
			KeyboardHandler.staticIntArray47[220] = 74;
			KeyboardHandler.staticIntArray47[221] = 43;
			KeyboardHandler.staticIntArray47[222] = 59;
			KeyboardHandler.staticIntArray47[223] = 28;
		} else {
			KeyboardHandler.staticIntArray47[44] = 71;
			KeyboardHandler.staticIntArray47[45] = 26;
			KeyboardHandler.staticIntArray47[46] = 72;
			KeyboardHandler.staticIntArray47[47] = 73;
			KeyboardHandler.staticIntArray47[59] = 57;
			KeyboardHandler.staticIntArray47[61] = 27;
			KeyboardHandler.staticIntArray47[91] = 42;
			KeyboardHandler.staticIntArray47[92] = 74;
			KeyboardHandler.staticIntArray47[93] = 43;
			KeyboardHandler.staticIntArray47[192] = 28;
			KeyboardHandler.staticIntArray47[222] = 58;
			KeyboardHandler.staticIntArray47[520] = 59;
		}

	}

	static void staticMethod373(Js5IndexImpl var0, int var1) {
		if (Class55.staticStream4 != null) {
			Class55.staticStream4.position = 5 + var1 * 8;
			int var3 = Class55.staticStream4.readInt();
			int var2 = Class55.staticStream4.readInt();
			var0.method396(var3, var2);
		} else {
			staticMethod286((Js5IndexImpl) null, 255, 255, 0, (byte) 0, true);
			staticJs5IndexImplArray1[var1] = var0;
		}

	}

	static void staticMethod398() {
		staticInt24 = 0;

		for (int var0 = 0; var0 < 2048; var0++) {
			cachedAppearances[var0] = null;
			staticByteArray2[var0] = 1;
		}

	}

	static void staticMethod385(byte[] var0) {
		ByteBuf var1 = new ByteBuf(var0);
		var1.position = var0.length - 2;
		staticInt143 = var1.method370();
		NodeSub20.staticIntArray126 = new int[staticInt143];
		staticIntArray69 = new int[staticInt143];
		staticIntArray72 = new int[staticInt143];
		staticIntArray71 = new int[staticInt143];
		CanvasSub1.staticByteArrayArray2 = new byte[staticInt143][];
		var1.position = var0.length - 7 - staticInt143 * 8;
		staticInt139 = var1.method370();
		staticInt142 = var1.method370();
		int var7 = (var1.method367() & 0xff) + 1;

		int var3;
		for (var3 = 0; var3 < staticInt143; var3++) {
			NodeSub20.staticIntArray126[var3] = var1.method370();
		}

		for (var3 = 0; var3 < staticInt143; var3++) {
			staticIntArray69[var3] = var1.method370();
		}

		for (var3 = 0; var3 < staticInt143; var3++) {
			staticIntArray72[var3] = var1.method370();
		}

		for (var3 = 0; var3 < staticInt143; var3++) {
			staticIntArray71[var3] = var1.method370();
		}

		var1.position = var0.length - 7 - staticInt143 * 8 - (var7 - 1) * 3;
		staticIntArray73 = new int[var7];

		for (var3 = 1; var3 < var7; var3++) {
			staticIntArray73[var3] = var1.readTriByte();
			if (staticIntArray73[var3] == 0) {
				staticIntArray73[var3] = 1;
			}
		}

		var1.position = 0;

		for (var3 = 0; var3 < staticInt143; var3++) {
			int var5 = staticIntArray72[var3];
			int var8 = staticIntArray71[var3];
			int var9 = var8 * var5;
			byte[] var6 = new byte[var9];
			CanvasSub1.staticByteArrayArray2[var3] = var6;
			int var10 = var1.method367();
			int var4;
			if (var10 == 0) {
				for (var4 = 0; var4 < var9; var4++) {
					var6[var4] = var1.readByte();
				}
			} else if (var10 == 1) {
				for (var4 = 0; var4 < var5; var4++) {
					for (int var2 = 0; var2 < var8; var2++) {
						var6[var5 * var2 + var4] = var1.readByte();
					}
				}
			}
		}

	}

	public static Rasterizer2DSub2Sub1 staticMethod386(Js5Index var0, Js5Index var1, String var2, String var3) {
		int var4 = var0.method267(var2);
		int var5 = var0.method268(var4, var3);
		return staticMethod54(var0, var1, var4, var5);
	}

	static void staticMethod396(int var0) {
		if (var0 != Client.staticInt165) {
			if (Client.staticInt165 == 0) {
				staticImage1 = null;
				Class28.staticFont1 = null;
				Class26.staticFontMetrics1 = null;
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) {
				Client.loginStage = 0;
				Client.staticInt262 = 0;
				Client.staticInt302 = 0;
			}

			if (var0 != 20 && var0 != 40 && staticConnection1 != null) {
				staticConnection1.shutdown();
				staticConnection1 = null;
			}

			if (Client.staticInt165 == 25) {
				Client.staticInt200 = 0;
				Client.staticInt215 = 0;
				Client.staticInt198 = 1;
				Client.staticInt199 = 0;
				Client.staticInt253 = 1;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					staticMethod114(Class38.staticCanvas1, AbstractClass3Sub1.staticJs5IndexImpl10,
							Class62.staticJs5IndexImpl7, true, Client.staticInt165 == 11 ? 4 : 0);
				} else if (var0 == 11) {
					staticMethod114(Class38.staticCanvas1, AbstractClass3Sub1.staticJs5IndexImpl10,
							Class62.staticJs5IndexImpl7, false, 4);
				} else {
					staticMethod317();
				}
			} else {
				staticMethod114(Class38.staticCanvas1, AbstractClass3Sub1.staticJs5IndexImpl10,
						Class62.staticJs5IndexImpl7, true, 0);
			}

			Client.staticInt165 = var0;
		}

	}

	static Sprite staticMethod429() {
		Sprite var0 = new Sprite();
		var0.anInt673 = staticInt139;
		var0.anInt674 = staticInt142;
		var0.anInt675 = NodeSub20.staticIntArray126[0];
		var0.anInt670 = staticIntArray69[0];
		var0.anInt672 = staticIntArray72[0];
		var0.anInt671 = staticIntArray71[0];
		int var1 = var0.anInt671 * var0.anInt672;
		byte[] var2 = CanvasSub1.staticByteArrayArray2[0];
		var0.anIntArray154 = new int[var1];

		for (int var3 = 0; var3 < var1; var3++) {
			var0.anIntArray154[var3] = staticIntArray73[var2[var3] & 0xff];
		}

		NodeSub20.staticIntArray126 = null;
		staticIntArray69 = null;
		staticIntArray72 = null;
		staticIntArray71 = null;
		staticIntArray73 = null;
		CanvasSub1.staticByteArrayArray2 = null;
		return var0;
	}

	static final int staticMethod430(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 0x7f) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1 + (var0 & 0xff80);
		}
	}

	static final void staticMethod433() {
		Client.staticInt245 = 0;
		int var1 = NodeSub3.staticInt154 + (AbstractClass2Sub1.staticPlayer1.anInt628 >> 7);
		int var0 = (AbstractClass2Sub1.staticPlayer1.anInt591 >> 7) + Class34.staticInt75;
		if (var1 >= 3053 && var1 <= 3156 && var0 >= 3056 && var0 <= 3136) {
			Client.staticInt245 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var0 >= 9492 && var0 <= 9535) {
			Client.staticInt245 = 1;
		}

		if (Client.staticInt245 == 1 && var1 >= 3139 && var1 <= 3199 && var0 >= 3008 && var0 <= 3062) {
			Client.staticInt245 = 0;
		}

	}

	static final String[] staticMethod425(String[] var0) {
		String[] var1 = new String[5];

		for (int var2 = 0; var2 < 5; var2++) {
			var1[var2] = var2 + ": ";
			if (var0 != null && var0[var2] != null) {
				var1[var2] = var1[var2] + var0[var2];
			}
		}

		return var1;
	}

	public static boolean staticMethod426() {
		try {
			if (staticInt118 == 2) {
				if (GameType.staticNodeSub11_1 == null) {
					GameType.staticNodeSub11_1 = staticMethod300(staticJs5Index3, staticInt119,
							staticInt127);
					if (GameType.staticNodeSub11_1 == null) {
						return false;
					}
				}

				if (Class6.staticClass10_1 == null) {
					Class6.staticClass10_1 = new Class10(staticJs5Index5, staticJs5Index4);
				}

				if (staticNodeSub8Sub3_1.method460(GameType.staticNodeSub11_1, staticJs5Index6,
						Class6.staticClass10_1, 22050)) {
					staticNodeSub8Sub3_1.method439();
					staticNodeSub8Sub3_1.method457(Class7.staticInt32);
					staticNodeSub8Sub3_1.method450(GameType.staticNodeSub11_1, staticBool16);
					staticInt118 = 0;
					GameType.staticNodeSub11_1 = null;
					Class6.staticClass10_1 = null;
					staticJs5Index3 = null;
					return true;
				}
			}
		} catch (Exception var1) {
			var1.printStackTrace();
			staticNodeSub8Sub3_1.method440();
			staticInt118 = 0;
			GameType.staticNodeSub11_1 = null;
			Class6.staticClass10_1 = null;
			staticJs5Index3 = null;
		}

		return false;
	}

	static final void staticMethod438(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6,
			int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (Rasterizer2DSub1.staticBool51) {
			if (var6 > Rasterizer2DSub1.staticInt343) {
				var6 = Rasterizer2DSub1.staticInt343;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var4 += var5;
			var7 += var8 * var5;
			int var17 = var6 - var5;
			int var15;
			int var16;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (Rasterizer2DSub1.staticBool50) {
				var22 = var5 - Rasterizer2DSub1.staticInt344;
				var9 += (var12 >> 3) * var22;
				var10 += (var13 >> 3) * var22;
				var11 += (var14 >> 3) * var22;
				var16 = var11 >> 12;
				if (var16 != 0) {
					var18 = var9 / var16;
					var20 = var10 / var16;
					if (var18 < 0) {
						var18 = 0;
					} else if (var18 > 4032) {
						var18 = 4032;
					}
				} else {
					var18 = 0;
					var20 = 0;
				}

				var9 += var12;
				var10 += var13;
				var11 += var14;
				var16 = var11 >> 12;
				if (var16 != 0) {
					var15 = var9 / var16;
					var19 = var10 / var16;
					if (var15 < 0) {
						var15 = 0;
					} else if (var15 > 4032) {
						var15 = 4032;
					}
				} else {
					var15 = 0;
					var19 = 0;
				}

				var2 = (var18 << 20) + var20;
				var21 = (var15 - var18 >> 3 << 20) + (var19 - var20 >> 3);
				var17 >>= 3;
				var8 <<= 3;
				var23 = var7 >> 8;
				if (Rasterizer2DSub1.staticBool49) {
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
									+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							var2 += var21;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
									+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							var2 += var21;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
									+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							var2 += var21;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
									+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							var2 += var21;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
									+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							var2 += var21;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
									+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							var2 += var21;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
									+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							var2 += var21;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
									+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							var18 = var15;
							var20 = var19;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var16 = var11 >> 12;
							if (var16 != 0) {
								var15 = var9 / var16;
								var19 = var10 / var16;
								if (var15 < 0) {
									var15 = 0;
								} else if (var15 > 4032) {
									var15 = 4032;
								}
							} else {
								var15 = 0;
								var19 = 0;
							}

							var2 = (var18 << 20) + var20;
							var21 = (var15 - var18 >> 3 << 20) + (var19 - var20 >> 3);
							var7 += var8;
							var23 = var7 >> 8;
							--var17;
						} while (var17 > 0);
					}

					var17 = var6 - var5 & 0x7;
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
									+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							var2 += var21;
							--var17;
						} while (var17 > 0);
					}
				} else {
					if (var17 > 0) {
						do {
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
										+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var21;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
										+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var21;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
										+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var21;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
										+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var21;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
										+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var21;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
										+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var21;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
										+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var21;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
										+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							}

							++var4;
							var18 = var15;
							var20 = var19;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var16 = var11 >> 12;
							if (var16 != 0) {
								var15 = var9 / var16;
								var19 = var10 / var16;
								if (var15 < 0) {
									var15 = 0;
								} else if (var15 > 4032) {
									var15 = 4032;
								}
							} else {
								var15 = 0;
								var19 = 0;
							}

							var2 = (var18 << 20) + var20;
							var21 = (var15 - var18 >> 3 << 20) + (var19 - var20 >> 3);
							var7 += var8;
							var23 = var7 >> 8;
							--var17;
						} while (var17 > 0);
					}

					var17 = var6 - var5 & 0x7;
					if (var17 > 0) {
						do {
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
										+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var21;
							--var17;
						} while (var17 > 0);
					}
				}
			} else {
				var22 = var5 - Rasterizer2DSub1.staticInt344;
				var9 += (var12 >> 3) * var22;
				var10 += (var13 >> 3) * var22;
				var11 += (var14 >> 3) * var22;
				var16 = var11 >> 14;
				if (var16 != 0) {
					var18 = var9 / var16;
					var20 = var10 / var16;
					if (var18 < 0) {
						var18 = 0;
					} else if (var18 > 16256) {
						var18 = 16256;
					}
				} else {
					var18 = 0;
					var20 = 0;
				}

				var9 += var12;
				var10 += var13;
				var11 += var14;
				var16 = var11 >> 14;
				if (var16 != 0) {
					var15 = var9 / var16;
					var19 = var10 / var16;
					if (var15 < 0) {
						var15 = 0;
					} else if (var15 > 16256) {
						var15 = 16256;
					}
				} else {
					var15 = 0;
					var19 = 0;
				}

				var2 = (var18 << 18) + var20;
				var21 = (var15 - var18 >> 3 << 18) + (var19 - var20 >> 3);
				var17 >>= 3;
				var8 <<= 3;
				var23 = var7 >> 8;
				if (Rasterizer2DSub1.staticBool49) {
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
									+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							var2 += var21;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
									+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							var2 += var21;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
									+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							var2 += var21;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
									+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							var2 += var21;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
									+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							var2 += var21;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
									+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							var2 += var21;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
									+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							var2 += var21;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
									+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							var18 = var15;
							var20 = var19;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var16 = var11 >> 14;
							if (var16 != 0) {
								var15 = var9 / var16;
								var19 = var10 / var16;
								if (var15 < 0) {
									var15 = 0;
								} else if (var15 > 16256) {
									var15 = 16256;
								}
							} else {
								var15 = 0;
								var19 = 0;
							}

							var2 = (var18 << 18) + var20;
							var21 = (var15 - var18 >> 3 << 18) + (var19 - var20 >> 3);
							var7 += var8;
							var23 = var7 >> 8;
							--var17;
						} while (var17 > 0);
					}

					var17 = var6 - var5 & 0x7;
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
									+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							var2 += var21;
							--var17;
						} while (var17 > 0);
					}
				} else {
					if (var17 > 0) {
						do {
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
										+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var21;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
										+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var21;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
										+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var21;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
										+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var21;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
										+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var21;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
										+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var21;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
										+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var21;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
										+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							}

							++var4;
							var18 = var15;
							var20 = var19;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var16 = var11 >> 14;
							if (var16 != 0) {
								var15 = var9 / var16;
								var19 = var10 / var16;
								if (var15 < 0) {
									var15 = 0;
								} else if (var15 > 16256) {
									var15 = 16256;
								}
							} else {
								var15 = 0;
								var19 = 0;
							}

							var2 = (var18 << 18) + var20;
							var21 = (var15 - var18 >> 3 << 18) + (var19 - var20 >> 3);
							var7 += var8;
							var23 = var7 >> 8;
							--var17;
						} while (var17 > 0);
					}

					var17 = var6 - var5 & 0x7;
					if (var17 > 0) {
						do {
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var23 & 0xff00ff00)
										+ ((var3 & 0xff00) * var23 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var21;
							--var17;
						} while (var17 > 0);
					}
				}
			}
		}

	}

	public static final void staticMethod439() {
		Rasterizer2DSub1.staticInt344 = Rasterizer2DSub1.staticInt343 / 2;
		Rasterizer2DSub1.staticInt349 = Rasterizer2DSub1.staticInt348 / 2;
		Rasterizer2DSub1.staticInt345 = -Rasterizer2DSub1.staticInt344;
		Rasterizer2DSub1.staticInt341 = Rasterizer2DSub1.staticInt343 - Rasterizer2DSub1.staticInt344;
		Rasterizer2DSub1.staticInt346 = -Rasterizer2DSub1.staticInt349;
		Rasterizer2DSub1.staticInt347 = Rasterizer2DSub1.staticInt348 - Rasterizer2DSub1.staticInt349;
	}

	public static final void staticMethod440(int var0, int var1) {
		int var2 = Rasterizer2DSub1.staticIntArray158[0];
		int var3 = var2 / Rasterizer2D.staticInt330;
		int var4 = var2 - var3 * Rasterizer2D.staticInt330;
		Rasterizer2DSub1.staticInt344 = var0 - var4;
		Rasterizer2DSub1.staticInt349 = var1 - var3;
		Rasterizer2DSub1.staticInt345 = -Rasterizer2DSub1.staticInt344;
		Rasterizer2DSub1.staticInt341 = Rasterizer2DSub1.staticInt343 - Rasterizer2DSub1.staticInt344;
		Rasterizer2DSub1.staticInt346 = -Rasterizer2DSub1.staticInt349;
		Rasterizer2DSub1.staticInt347 = Rasterizer2DSub1.staticInt348 - Rasterizer2DSub1.staticInt349;
	}

	public static final void staticMethod441(Interface2 var0) {
		Rasterizer2DSub1.staticInterface2_1 = var0;
	}

	static final void staticMethod442(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6,
			int var7) {
		if (Rasterizer2DSub1.staticBool51) {
			if (var5 > Rasterizer2DSub1.staticInt343) {
				var5 = Rasterizer2DSub1.staticInt343;
			}

			if (var4 < 0) {
				var4 = 0;
			}
		}

		if (var4 < var5) {
			var1 += var4;
			var6 += var7 * var4;
			int var8;
			int var9;
			int var10;
			if (Rasterizer2DSub1.staticBool48) {
				var3 = var5 - var4 >> 2;
				var7 <<= 2;
				if (Rasterizer2DSub1.staticInt340 == 0) {
					if (var3 > 0) {
						do {
							var2 = Rasterizer2DSub1.staticIntArray155[var6 >> 8];
							var6 += var7;
							var0[var1++] = var2;
							var0[var1++] = var2;
							var0[var1++] = var2;
							var0[var1++] = var2;
							--var3;
						} while (var3 > 0);
					}

					var3 = var5 - var4 & 0x3;
					if (var3 > 0) {
						var2 = Rasterizer2DSub1.staticIntArray155[var6 >> 8];

						do {
							var0[var1++] = var2;
							--var3;
						} while (var3 > 0);
					}
				} else {
					var9 = Rasterizer2DSub1.staticInt340;
					var10 = 256 - Rasterizer2DSub1.staticInt340;
					if (var3 > 0) {
						do {
							var2 = Rasterizer2DSub1.staticIntArray155[var6 >> 8];
							var6 += var7;
							var2 = ((var2 & 0xff00ff) * var10 >> 8 & 0xff00ff)
									+ ((var2 & 0xff00) * var10 >> 8 & 0xff00);
							var8 = var0[var1];
							var0[var1++] = var2 + ((var8 & 0xff00ff) * var9 >> 8 & 0xff00ff)
									+ ((var8 & 0xff00) * var9 >> 8 & 0xff00);
							var8 = var0[var1];
							var0[var1++] = var2 + ((var8 & 0xff00ff) * var9 >> 8 & 0xff00ff)
									+ ((var8 & 0xff00) * var9 >> 8 & 0xff00);
							var8 = var0[var1];
							var0[var1++] = var2 + ((var8 & 0xff00ff) * var9 >> 8 & 0xff00ff)
									+ ((var8 & 0xff00) * var9 >> 8 & 0xff00);
							var8 = var0[var1];
							var0[var1++] = var2 + ((var8 & 0xff00ff) * var9 >> 8 & 0xff00ff)
									+ ((var8 & 0xff00) * var9 >> 8 & 0xff00);
							--var3;
						} while (var3 > 0);
					}

					var3 = var5 - var4 & 0x3;
					if (var3 > 0) {
						var2 = Rasterizer2DSub1.staticIntArray155[var6 >> 8];
						var2 = ((var2 & 0xff00ff) * var10 >> 8 & 0xff00ff) + ((var2 & 0xff00) * var10 >> 8 & 0xff00);

						do {
							var8 = var0[var1];
							var0[var1++] = var2 + ((var8 & 0xff00ff) * var9 >> 8 & 0xff00ff)
									+ ((var8 & 0xff00) * var9 >> 8 & 0xff00);
							--var3;
						} while (var3 > 0);
					}
				}
			} else {
				var3 = var5 - var4;
				if (Rasterizer2DSub1.staticInt340 == 0) {
					do {
						var0[var1++] = Rasterizer2DSub1.staticIntArray155[var6 >> 8];
						var6 += var7;
						--var3;
					} while (var3 > 0);
				} else {
					var9 = Rasterizer2DSub1.staticInt340;
					var10 = 256 - Rasterizer2DSub1.staticInt340;

					do {
						var2 = Rasterizer2DSub1.staticIntArray155[var6 >> 8];
						var6 += var7;
						var2 = ((var2 & 0xff00ff) * var10 >> 8 & 0xff00ff) + ((var2 & 0xff00) * var10 >> 8 & 0xff00);
						var8 = var0[var1];
						var0[var1++] = var2 + ((var8 & 0xff00ff) * var9 >> 8 & 0xff00ff)
								+ ((var8 & 0xff00) * var9 >> 8 & 0xff00);
						--var3;
					} while (var3 > 0);
				}
			}
		}

	}

	static final void staticMethod443(double var0, int var2, int var3) {
		var0 += Math.random() * 0.03D - 0.015D;
		int var32 = var2 * 128;

		for (int var4 = var2; var4 < var3; var4++) {
			double var18 = (var4 >> 3) / 64.0D + 0.0078125D;
			double var7 = (var4 & 0x7) / 8.0D + 0.0625D;

			for (int var9 = 0; var9 < 128; var9++) {
				double var10 = var9 / 128.0D;
				double var12 = var10;
				double var14 = var10;
				double var16 = var10;
				if (var7 != 0.0D) {
					double var29;
					if (var10 < 0.5D) {
						var29 = var10 * (1.0D + var7);
					} else {
						var29 = var10 + var7 - var10 * var7;
					}

					double var26 = 2.0D * var10 - var29;
					double var5 = var18 + 0.3333333333333333D;
					if (var5 > 1.0D) {
						--var5;
					}

					double var20 = var18 - 0.3333333333333333D;
					if (var20 < 0.0D) {
						++var20;
					}

					if (6.0D * var5 < 1.0D) {
						var12 = var26 + (var29 - var26) * 6.0D * var5;
					} else if (2.0D * var5 < 1.0D) {
						var12 = var29;
					} else if (3.0D * var5 < 2.0D) {
						var12 = var26 + (var29 - var26) * (0.6666666666666666D - var5) * 6.0D;
					} else {
						var12 = var26;
					}

					if (6.0D * var18 < 1.0D) {
						var14 = var26 + (var29 - var26) * 6.0D * var18;
					} else if (2.0D * var18 < 1.0D) {
						var14 = var29;
					} else if (3.0D * var18 < 2.0D) {
						var14 = var26 + (var29 - var26) * (0.6666666666666666D - var18) * 6.0D;
					} else {
						var14 = var26;
					}

					if (6.0D * var20 < 1.0D) {
						var16 = var26 + (var29 - var26) * 6.0D * var20;
					} else if (2.0D * var20 < 1.0D) {
						var16 = var29;
					} else if (3.0D * var20 < 2.0D) {
						var16 = var26 + (var29 - var26) * (0.6666666666666666D - var20) * 6.0D;
					} else {
						var16 = var26;
					}
				}

				int var28 = (int) (var12 * 256.0D);
				int var31 = (int) (var14 * 256.0D);
				int var27 = (int) (var16 * 256.0D);
				int var30 = (var28 << 16) + (var31 << 8) + var27;
				var30 = staticMethod447(var30, var0);
				if (var30 == 0) {
					var30 = 1;
				}

				Rasterizer2DSub1.staticIntArray155[var32++] = var30;
			}
		}

	}

	static final void staticMethod444(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8) {
		int var9 = var4 - var3;
		int var16 = var1 - var0;
		int var15 = var5 - var3;
		int var10 = var2 - var0;
		int var11 = var7 - var6;
		int var18 = var8 - var6;
		int var13;
		if (var2 != var1) {
			var13 = (var5 - var4 << 14) / (var2 - var1);
		} else {
			var13 = 0;
		}

		int var12;
		if (var1 != var0) {
			var12 = (var9 << 14) / var16;
		} else {
			var12 = 0;
		}

		int var14;
		if (var2 != var0) {
			var14 = (var15 << 14) / var10;
		} else {
			var14 = 0;
		}

		int var17 = var9 * var10 - var15 * var16;
		if (var17 != 0) {
			int var19 = (var11 * var10 - var18 * var16 << 8) / var17;
			int var20 = (var18 * var9 - var11 * var15 << 8) / var17;
			if (var0 <= var1 && var0 <= var2) {
				if (var0 < Rasterizer2DSub1.staticInt348) {
					if (var1 > Rasterizer2DSub1.staticInt348) {
						var1 = Rasterizer2DSub1.staticInt348;
					}

					if (var2 > Rasterizer2DSub1.staticInt348) {
						var2 = Rasterizer2DSub1.staticInt348;
					}

					var6 = (var6 << 8) - var19 * var3 + var19;
					if (var1 < var2) {
						var5 = var3 <<= 14;
						if (var0 < 0) {
							var5 -= var14 * var0;
							var3 -= var12 * var0;
							var6 -= var20 * var0;
							var0 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var13 * var1;
							var1 = 0;
						}

						if (var0 != var1 && var14 < var12 || var0 == var1 && var14 > var13) {
							var2 -= var1;
							var1 -= var0;
							var0 = Rasterizer2DSub1.staticIntArray158[var0];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										staticMethod442(Rasterizer2D.staticIntArray130, var0, 0, 0, var5 >> 14,
												var4 >> 14, var6, var19);
										var5 += var14;
										var4 += var13;
										var6 += var20;
										var0 += Rasterizer2D.staticInt330;
									}
								}

								staticMethod442(Rasterizer2D.staticIntArray130, var0, 0, 0, var5 >> 14, var3 >> 14,
										var6, var19);
								var5 += var14;
								var3 += var12;
								var6 += var20;
								var0 += Rasterizer2D.staticInt330;
							}
						}

						var2 -= var1;
						var1 -= var0;
						var0 = Rasterizer2DSub1.staticIntArray158[var0];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									staticMethod442(Rasterizer2D.staticIntArray130, var0, 0, 0, var4 >> 14, var5 >> 14,
											var6, var19);
									var5 += var14;
									var4 += var13;
									var6 += var20;
									var0 += Rasterizer2D.staticInt330;
								}
							}

							staticMethod442(Rasterizer2D.staticIntArray130, var0, 0, 0, var3 >> 14, var5 >> 14, var6,
									var19);
							var5 += var14;
							var3 += var12;
							var6 += var20;
							var0 += Rasterizer2D.staticInt330;
						}
					}

					var4 = var3 <<= 14;
					if (var0 < 0) {
						var4 -= var14 * var0;
						var3 -= var12 * var0;
						var6 -= var20 * var0;
						var0 = 0;
					}

					var5 <<= 14;
					if (var2 < 0) {
						var5 -= var13 * var2;
						var2 = 0;
					}

					if ((var0 == var2 || var14 >= var12) && (var0 != var2 || var13 <= var12)) {
						var1 -= var2;
						var2 -= var0;
						var0 = Rasterizer2DSub1.staticIntArray158[var0];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									staticMethod442(Rasterizer2D.staticIntArray130, var0, 0, 0, var3 >> 14, var5 >> 14,
											var6, var19);
									var5 += var13;
									var3 += var12;
									var6 += var20;
									var0 += Rasterizer2D.staticInt330;
								}
							}

							staticMethod442(Rasterizer2D.staticIntArray130, var0, 0, 0, var3 >> 14, var4 >> 14, var6,
									var19);
							var4 += var14;
							var3 += var12;
							var6 += var20;
							var0 += Rasterizer2D.staticInt330;
						}
					}

					var1 -= var2;
					var2 -= var0;
					var0 = Rasterizer2DSub1.staticIntArray158[var0];

					while (true) {
						--var2;
						if (var2 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								staticMethod442(Rasterizer2D.staticIntArray130, var0, 0, 0, var5 >> 14, var3 >> 14,
										var6, var19);
								var5 += var13;
								var3 += var12;
								var6 += var20;
								var0 += Rasterizer2D.staticInt330;
							}
						}

						staticMethod442(Rasterizer2D.staticIntArray130, var0, 0, 0, var4 >> 14, var3 >> 14, var6,
								var19);
						var4 += var14;
						var3 += var12;
						var6 += var20;
						var0 += Rasterizer2D.staticInt330;
					}
				}
			} else if (var1 <= var2) {
				if (var1 < Rasterizer2DSub1.staticInt348) {
					if (var2 > Rasterizer2DSub1.staticInt348) {
						var2 = Rasterizer2DSub1.staticInt348;
					}

					if (var0 > Rasterizer2DSub1.staticInt348) {
						var0 = Rasterizer2DSub1.staticInt348;
					}

					var7 = (var7 << 8) - var19 * var4 + var19;
					if (var2 < var0) {
						var3 = var4 <<= 14;
						if (var1 < 0) {
							var3 -= var12 * var1;
							var4 -= var13 * var1;
							var7 -= var20 * var1;
							var1 = 0;
						}

						var5 <<= 14;
						if (var2 < 0) {
							var5 -= var14 * var2;
							var2 = 0;
						}

						if (var1 != var2 && var12 < var13 || var1 == var2 && var12 > var14) {
							var0 -= var2;
							var2 -= var1;
							var1 = Rasterizer2DSub1.staticIntArray158[var1];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										staticMethod442(Rasterizer2D.staticIntArray130, var1, 0, 0, var3 >> 14,
												var5 >> 14, var7, var19);
										var3 += var12;
										var5 += var14;
										var7 += var20;
										var1 += Rasterizer2D.staticInt330;
									}
								}

								staticMethod442(Rasterizer2D.staticIntArray130, var1, 0, 0, var3 >> 14, var4 >> 14,
										var7, var19);
								var3 += var12;
								var4 += var13;
								var7 += var20;
								var1 += Rasterizer2D.staticInt330;
							}
						}

						var0 -= var2;
						var2 -= var1;
						var1 = Rasterizer2DSub1.staticIntArray158[var1];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									staticMethod442(Rasterizer2D.staticIntArray130, var1, 0, 0, var5 >> 14, var3 >> 14,
											var7, var19);
									var3 += var12;
									var5 += var14;
									var7 += var20;
									var1 += Rasterizer2D.staticInt330;
								}
							}

							staticMethod442(Rasterizer2D.staticIntArray130, var1, 0, 0, var4 >> 14, var3 >> 14, var7,
									var19);
							var3 += var12;
							var4 += var13;
							var7 += var20;
							var1 += Rasterizer2D.staticInt330;
						}
					}

					var5 = var4 <<= 14;
					if (var1 < 0) {
						var5 -= var12 * var1;
						var4 -= var13 * var1;
						var7 -= var20 * var1;
						var1 = 0;
					}

					var3 <<= 14;
					if (var0 < 0) {
						var3 -= var14 * var0;
						var0 = 0;
					}

					if (var12 < var13) {
						var2 -= var0;
						var0 -= var1;
						var1 = Rasterizer2DSub1.staticIntArray158[var1];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									staticMethod442(Rasterizer2D.staticIntArray130, var1, 0, 0, var3 >> 14, var4 >> 14,
											var7, var19);
									var3 += var14;
									var4 += var13;
									var7 += var20;
									var1 += Rasterizer2D.staticInt330;
								}
							}

							staticMethod442(Rasterizer2D.staticIntArray130, var1, 0, 0, var5 >> 14, var4 >> 14, var7,
									var19);
							var5 += var12;
							var4 += var13;
							var7 += var20;
							var1 += Rasterizer2D.staticInt330;
						}
					}

					var2 -= var0;
					var0 -= var1;
					var1 = Rasterizer2DSub1.staticIntArray158[var1];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var2;
								if (var2 < 0) {
									return;
								}

								staticMethod442(Rasterizer2D.staticIntArray130, var1, 0, 0, var4 >> 14, var3 >> 14,
										var7, var19);
								var3 += var14;
								var4 += var13;
								var7 += var20;
								var1 += Rasterizer2D.staticInt330;
							}
						}

						staticMethod442(Rasterizer2D.staticIntArray130, var1, 0, 0, var4 >> 14, var5 >> 14, var7,
								var19);
						var5 += var12;
						var4 += var13;
						var7 += var20;
						var1 += Rasterizer2D.staticInt330;
					}
				}
			} else if (var2 < Rasterizer2DSub1.staticInt348) {
				if (var0 > Rasterizer2DSub1.staticInt348) {
					var0 = Rasterizer2DSub1.staticInt348;
				}

				if (var1 > Rasterizer2DSub1.staticInt348) {
					var1 = Rasterizer2DSub1.staticInt348;
				}

				var8 = (var8 << 8) - var19 * var5 + var19;
				if (var0 < var1) {
					var4 = var5 <<= 14;
					if (var2 < 0) {
						var4 -= var13 * var2;
						var5 -= var14 * var2;
						var8 -= var20 * var2;
						var2 = 0;
					}

					var3 <<= 14;
					if (var0 < 0) {
						var3 -= var12 * var0;
						var0 = 0;
					}

					if (var13 < var14) {
						var1 -= var0;
						var0 -= var2;
						var2 = Rasterizer2DSub1.staticIntArray158[var2];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									staticMethod442(Rasterizer2D.staticIntArray130, var2, 0, 0, var4 >> 14, var3 >> 14,
											var8, var19);
									var4 += var13;
									var3 += var12;
									var8 += var20;
									var2 += Rasterizer2D.staticInt330;
								}
							}

							staticMethod442(Rasterizer2D.staticIntArray130, var2, 0, 0, var4 >> 14, var5 >> 14, var8,
									var19);
							var4 += var13;
							var5 += var14;
							var8 += var20;
							var2 += Rasterizer2D.staticInt330;
						}
					}

					var1 -= var0;
					var0 -= var2;
					var2 = Rasterizer2DSub1.staticIntArray158[var2];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								staticMethod442(Rasterizer2D.staticIntArray130, var2, 0, 0, var3 >> 14, var4 >> 14,
										var8, var19);
								var4 += var13;
								var3 += var12;
								var8 += var20;
								var2 += Rasterizer2D.staticInt330;
							}
						}

						staticMethod442(Rasterizer2D.staticIntArray130, var2, 0, 0, var5 >> 14, var4 >> 14, var8,
								var19);
						var4 += var13;
						var5 += var14;
						var8 += var20;
						var2 += Rasterizer2D.staticInt330;
					}
				}

				var3 = var5 <<= 14;
				if (var2 < 0) {
					var3 -= var13 * var2;
					var5 -= var14 * var2;
					var8 -= var20 * var2;
					var2 = 0;
				}

				var4 <<= 14;
				if (var1 < 0) {
					var4 -= var12 * var1;
					var1 = 0;
				}

				if (var13 < var14) {
					var0 -= var1;
					var1 -= var2;
					var2 = Rasterizer2DSub1.staticIntArray158[var2];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								staticMethod442(Rasterizer2D.staticIntArray130, var2, 0, 0, var4 >> 14, var5 >> 14,
										var8, var19);
								var4 += var12;
								var5 += var14;
								var8 += var20;
								var2 += Rasterizer2D.staticInt330;
							}
						}

						staticMethod442(Rasterizer2D.staticIntArray130, var2, 0, 0, var3 >> 14, var5 >> 14, var8,
								var19);
						var3 += var13;
						var5 += var14;
						var8 += var20;
						var2 += Rasterizer2D.staticInt330;
					}
				}

				var0 -= var1;
				var1 -= var2;
				var2 = Rasterizer2DSub1.staticIntArray158[var2];

				while (true) {
					--var1;
					if (var1 < 0) {
						while (true) {
							--var0;
							if (var0 < 0) {
								return;
							}

							staticMethod442(Rasterizer2D.staticIntArray130, var2, 0, 0, var5 >> 14, var4 >> 14, var8,
									var19);
							var4 += var12;
							var5 += var14;
							var8 += var20;
							var2 += Rasterizer2D.staticInt330;
						}
					}

					staticMethod442(Rasterizer2D.staticIntArray130, var2, 0, 0, var5 >> 14, var3 >> 14, var8, var19);
					var3 += var13;
					var5 += var14;
					var8 += var20;
					var2 += Rasterizer2D.staticInt330;
				}
			}
		}

	}

	public static void staticMethod445(int var0, int var1, int var2) {
		Rasterizer2DSub1.staticBool51 = var0 < 0 || var0 > Rasterizer2DSub1.staticInt343 || var1 < 0
				|| var1 > Rasterizer2DSub1.staticInt343 || var2 < 0 || var2 > Rasterizer2DSub1.staticInt343;
	}

	static final void staticMethod446(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17,
			int var18) {
		int[] var19 = Rasterizer2DSub1.staticInterface2_1.method32(var18);
		int var20;
		if (var19 == null) {
			var20 = Rasterizer2DSub1.staticInterface2_1.method34(var18);
			staticMethod444(var0, var1, var2, var3, var4, var5, staticMethod452(var20, var6),
					staticMethod452(var20, var7), staticMethod452(var20, var8));
		} else {
			Rasterizer2DSub1.staticBool50 = Rasterizer2DSub1.staticInterface2_1.method38(var18);
			Rasterizer2DSub1.staticBool49 = Rasterizer2DSub1.staticInterface2_1.method37(var18);
			var20 = var4 - var3;
			int var24 = var1 - var0;
			int var32 = var5 - var3;
			int var26 = var2 - var0;
			int var41 = var7 - var6;
			int var28 = var8 - var6;
			int var29 = 0;
			if (var1 != var0) {
				var29 = (var4 - var3 << 14) / (var1 - var0);
			}

			int var30 = 0;
			if (var2 != var1) {
				var30 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var27 = 0;
			if (var2 != var0) {
				var27 = (var3 - var5 << 14) / (var0 - var2);
			}

			int var33 = var20 * var26 - var32 * var24;
			if (var33 != 0) {
				int var36 = (var41 * var26 - var28 * var24 << 9) / var33;
				int var31 = (var28 * var20 - var41 * var32 << 9) / var33;
				var10 = var9 - var10;
				var13 = var12 - var13;
				var16 = var15 - var16;
				var11 -= var9;
				var14 -= var12;
				var17 -= var15;
				int var34 = var11 * var12 - var14 * var9 << 14;
				int var37 = (int) (((long) (var14 * var15 - var17 * var12) << 3 << 14) / Rasterizer2DSub1.staticInt342);
				int var35 = (int) (((long) (var17 * var9 - var11 * var15) << 14) / Rasterizer2DSub1.staticInt342);
				int var21 = var10 * var12 - var13 * var9 << 14;
				int var39 = (int) (((long) (var13 * var15 - var16 * var12) << 3 << 14) / Rasterizer2DSub1.staticInt342);
				int var22 = (int) (((long) (var16 * var9 - var10 * var15) << 14) / Rasterizer2DSub1.staticInt342);
				int var25 = var13 * var11 - var10 * var14 << 14;
				int var40 = (int) (((long) (var16 * var14 - var13 * var17) << 3 << 14) / Rasterizer2DSub1.staticInt342);
				int var38 = (int) (((long) (var10 * var17 - var16 * var11) << 14) / Rasterizer2DSub1.staticInt342);
				int var23;
				if (var0 <= var1 && var0 <= var2) {
					if (var0 < Rasterizer2DSub1.staticInt348) {
						if (var1 > Rasterizer2DSub1.staticInt348) {
							var1 = Rasterizer2DSub1.staticInt348;
						}

						if (var2 > Rasterizer2DSub1.staticInt348) {
							var2 = Rasterizer2DSub1.staticInt348;
						}

						var6 = (var6 << 9) - var36 * var3 + var36;
						if (var1 < var2) {
							var5 = var3 <<= 14;
							if (var0 < 0) {
								var5 -= var27 * var0;
								var3 -= var29 * var0;
								var6 -= var31 * var0;
								var0 = 0;
							}

							var4 <<= 14;
							if (var1 < 0) {
								var4 -= var30 * var1;
								var1 = 0;
							}

							var23 = var0 - Rasterizer2DSub1.staticInt349;
							var34 += var35 * var23;
							var21 += var22 * var23;
							var25 += var38 * var23;
							if (var0 != var1 && var27 < var29 || var0 == var1 && var27 > var30) {
								var2 -= var1;
								var1 -= var0;
								var0 = Rasterizer2DSub1.staticIntArray158[var0];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											staticMethod438(Rasterizer2D.staticIntArray130, var19, 0, 0, var0,
													var5 >> 14, var4 >> 14, var6, var36, var34, var21, var25, var37,
													var39, var40);
											var5 += var27;
											var4 += var30;
											var6 += var31;
											var0 += Rasterizer2D.staticInt330;
											var34 += var35;
											var21 += var22;
											var25 += var38;
										}
									}

									staticMethod438(Rasterizer2D.staticIntArray130, var19, 0, 0, var0, var5 >> 14,
											var3 >> 14, var6, var36, var34, var21, var25, var37, var39, var40);
									var5 += var27;
									var3 += var29;
									var6 += var31;
									var0 += Rasterizer2D.staticInt330;
									var34 += var35;
									var21 += var22;
									var25 += var38;
								}
							}

							var2 -= var1;
							var1 -= var0;
							var0 = Rasterizer2DSub1.staticIntArray158[var0];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										staticMethod438(Rasterizer2D.staticIntArray130, var19, 0, 0, var0, var4 >> 14,
												var5 >> 14, var6, var36, var34, var21, var25, var37, var39, var40);
										var5 += var27;
										var4 += var30;
										var6 += var31;
										var0 += Rasterizer2D.staticInt330;
										var34 += var35;
										var21 += var22;
										var25 += var38;
									}
								}

								staticMethod438(Rasterizer2D.staticIntArray130, var19, 0, 0, var0, var3 >> 14,
										var5 >> 14, var6, var36, var34, var21, var25, var37, var39, var40);
								var5 += var27;
								var3 += var29;
								var6 += var31;
								var0 += Rasterizer2D.staticInt330;
								var34 += var35;
								var21 += var22;
								var25 += var38;
							}
						}

						var4 = var3 <<= 14;
						if (var0 < 0) {
							var4 -= var27 * var0;
							var3 -= var29 * var0;
							var6 -= var31 * var0;
							var0 = 0;
						}

						var5 <<= 14;
						if (var2 < 0) {
							var5 -= var30 * var2;
							var2 = 0;
						}

						var23 = var0 - Rasterizer2DSub1.staticInt349;
						var34 += var35 * var23;
						var21 += var22 * var23;
						var25 += var38 * var23;
						if (var0 != var2 && var27 < var29 || var0 == var2 && var30 > var29) {
							var1 -= var2;
							var2 -= var0;
							var0 = Rasterizer2DSub1.staticIntArray158[var0];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										staticMethod438(Rasterizer2D.staticIntArray130, var19, 0, 0, var0, var5 >> 14,
												var3 >> 14, var6, var36, var34, var21, var25, var37, var39, var40);
										var5 += var30;
										var3 += var29;
										var6 += var31;
										var0 += Rasterizer2D.staticInt330;
										var34 += var35;
										var21 += var22;
										var25 += var38;
									}
								}

								staticMethod438(Rasterizer2D.staticIntArray130, var19, 0, 0, var0, var4 >> 14,
										var3 >> 14, var6, var36, var34, var21, var25, var37, var39, var40);
								var4 += var27;
								var3 += var29;
								var6 += var31;
								var0 += Rasterizer2D.staticInt330;
								var34 += var35;
								var21 += var22;
								var25 += var38;
							}
						}

						var1 -= var2;
						var2 -= var0;
						var0 = Rasterizer2DSub1.staticIntArray158[var0];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									staticMethod438(Rasterizer2D.staticIntArray130, var19, 0, 0, var0, var3 >> 14,
											var5 >> 14, var6, var36, var34, var21, var25, var37, var39, var40);
									var5 += var30;
									var3 += var29;
									var6 += var31;
									var0 += Rasterizer2D.staticInt330;
									var34 += var35;
									var21 += var22;
									var25 += var38;
								}
							}

							staticMethod438(Rasterizer2D.staticIntArray130, var19, 0, 0, var0, var3 >> 14, var4 >> 14,
									var6, var36, var34, var21, var25, var37, var39, var40);
							var4 += var27;
							var3 += var29;
							var6 += var31;
							var0 += Rasterizer2D.staticInt330;
							var34 += var35;
							var21 += var22;
							var25 += var38;
						}
					}
				} else if (var1 <= var2) {
					if (var1 < Rasterizer2DSub1.staticInt348) {
						if (var2 > Rasterizer2DSub1.staticInt348) {
							var2 = Rasterizer2DSub1.staticInt348;
						}

						if (var0 > Rasterizer2DSub1.staticInt348) {
							var0 = Rasterizer2DSub1.staticInt348;
						}

						var7 = (var7 << 9) - var36 * var4 + var36;
						if (var2 < var0) {
							var3 = var4 <<= 14;
							if (var1 < 0) {
								var3 -= var29 * var1;
								var4 -= var30 * var1;
								var7 -= var31 * var1;
								var1 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var27 * var2;
								var2 = 0;
							}

							var23 = var1 - Rasterizer2DSub1.staticInt349;
							var34 += var35 * var23;
							var21 += var22 * var23;
							var25 += var38 * var23;
							if (var1 != var2 && var29 < var30 || var1 == var2 && var29 > var27) {
								var0 -= var2;
								var2 -= var1;
								var1 = Rasterizer2DSub1.staticIntArray158[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}

											staticMethod438(Rasterizer2D.staticIntArray130, var19, 0, 0, var1,
													var3 >> 14, var5 >> 14, var7, var36, var34, var21, var25, var37,
													var39, var40);
											var3 += var29;
											var5 += var27;
											var7 += var31;
											var1 += Rasterizer2D.staticInt330;
											var34 += var35;
											var21 += var22;
											var25 += var38;
										}
									}

									staticMethod438(Rasterizer2D.staticIntArray130, var19, 0, 0, var1, var3 >> 14,
											var4 >> 14, var7, var36, var34, var21, var25, var37, var39, var40);
									var3 += var29;
									var4 += var30;
									var7 += var31;
									var1 += Rasterizer2D.staticInt330;
									var34 += var35;
									var21 += var22;
									var25 += var38;
								}
							}

							var0 -= var2;
							var2 -= var1;
							var1 = Rasterizer2DSub1.staticIntArray158[var1];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										staticMethod438(Rasterizer2D.staticIntArray130, var19, 0, 0, var1, var5 >> 14,
												var3 >> 14, var7, var36, var34, var21, var25, var37, var39, var40);
										var3 += var29;
										var5 += var27;
										var7 += var31;
										var1 += Rasterizer2D.staticInt330;
										var34 += var35;
										var21 += var22;
										var25 += var38;
									}
								}

								staticMethod438(Rasterizer2D.staticIntArray130, var19, 0, 0, var1, var4 >> 14,
										var3 >> 14, var7, var36, var34, var21, var25, var37, var39, var40);
								var3 += var29;
								var4 += var30;
								var7 += var31;
								var1 += Rasterizer2D.staticInt330;
								var34 += var35;
								var21 += var22;
								var25 += var38;
							}
						}

						var5 = var4 <<= 14;
						if (var1 < 0) {
							var5 -= var29 * var1;
							var4 -= var30 * var1;
							var7 -= var31 * var1;
							var1 = 0;
						}

						var3 <<= 14;
						if (var0 < 0) {
							var3 -= var27 * var0;
							var0 = 0;
						}

						var23 = var1 - Rasterizer2DSub1.staticInt349;
						var34 += var35 * var23;
						var21 += var22 * var23;
						var25 += var38 * var23;
						if (var29 < var30) {
							var2 -= var0;
							var0 -= var1;
							var1 = Rasterizer2DSub1.staticIntArray158[var1];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										staticMethod438(Rasterizer2D.staticIntArray130, var19, 0, 0, var1, var3 >> 14,
												var4 >> 14, var7, var36, var34, var21, var25, var37, var39, var40);
										var3 += var27;
										var4 += var30;
										var7 += var31;
										var1 += Rasterizer2D.staticInt330;
										var34 += var35;
										var21 += var22;
										var25 += var38;
									}
								}

								staticMethod438(Rasterizer2D.staticIntArray130, var19, 0, 0, var1, var5 >> 14,
										var4 >> 14, var7, var36, var34, var21, var25, var37, var39, var40);
								var5 += var29;
								var4 += var30;
								var7 += var31;
								var1 += Rasterizer2D.staticInt330;
								var34 += var35;
								var21 += var22;
								var25 += var38;
							}
						}

						var2 -= var0;
						var0 -= var1;
						var1 = Rasterizer2DSub1.staticIntArray158[var1];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									staticMethod438(Rasterizer2D.staticIntArray130, var19, 0, 0, var1, var4 >> 14,
											var3 >> 14, var7, var36, var34, var21, var25, var37, var39, var40);
									var3 += var27;
									var4 += var30;
									var7 += var31;
									var1 += Rasterizer2D.staticInt330;
									var34 += var35;
									var21 += var22;
									var25 += var38;
								}
							}

							staticMethod438(Rasterizer2D.staticIntArray130, var19, 0, 0, var1, var4 >> 14, var5 >> 14,
									var7, var36, var34, var21, var25, var37, var39, var40);
							var5 += var29;
							var4 += var30;
							var7 += var31;
							var1 += Rasterizer2D.staticInt330;
							var34 += var35;
							var21 += var22;
							var25 += var38;
						}
					}
				} else if (var2 < Rasterizer2DSub1.staticInt348) {
					if (var0 > Rasterizer2DSub1.staticInt348) {
						var0 = Rasterizer2DSub1.staticInt348;
					}

					if (var1 > Rasterizer2DSub1.staticInt348) {
						var1 = Rasterizer2DSub1.staticInt348;
					}

					var8 = (var8 << 9) - var36 * var5 + var36;
					if (var0 < var1) {
						var4 = var5 <<= 14;
						if (var2 < 0) {
							var4 -= var30 * var2;
							var5 -= var27 * var2;
							var8 -= var31 * var2;
							var2 = 0;
						}

						var3 <<= 14;
						if (var0 < 0) {
							var3 -= var29 * var0;
							var0 = 0;
						}

						var23 = var2 - Rasterizer2DSub1.staticInt349;
						var34 += var35 * var23;
						var21 += var22 * var23;
						var25 += var38 * var23;
						if (var30 < var27) {
							var1 -= var0;
							var0 -= var2;
							var2 = Rasterizer2DSub1.staticIntArray158[var2];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										staticMethod438(Rasterizer2D.staticIntArray130, var19, 0, 0, var2, var4 >> 14,
												var3 >> 14, var8, var36, var34, var21, var25, var37, var39, var40);
										var4 += var30;
										var3 += var29;
										var8 += var31;
										var2 += Rasterizer2D.staticInt330;
										var34 += var35;
										var21 += var22;
										var25 += var38;
									}
								}

								staticMethod438(Rasterizer2D.staticIntArray130, var19, 0, 0, var2, var4 >> 14,
										var5 >> 14, var8, var36, var34, var21, var25, var37, var39, var40);
								var4 += var30;
								var5 += var27;
								var8 += var31;
								var2 += Rasterizer2D.staticInt330;
								var34 += var35;
								var21 += var22;
								var25 += var38;
							}
						}

						var1 -= var0;
						var0 -= var2;
						var2 = Rasterizer2DSub1.staticIntArray158[var2];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									staticMethod438(Rasterizer2D.staticIntArray130, var19, 0, 0, var2, var3 >> 14,
											var4 >> 14, var8, var36, var34, var21, var25, var37, var39, var40);
									var4 += var30;
									var3 += var29;
									var8 += var31;
									var2 += Rasterizer2D.staticInt330;
									var34 += var35;
									var21 += var22;
									var25 += var38;
								}
							}

							staticMethod438(Rasterizer2D.staticIntArray130, var19, 0, 0, var2, var5 >> 14, var4 >> 14,
									var8, var36, var34, var21, var25, var37, var39, var40);
							var4 += var30;
							var5 += var27;
							var8 += var31;
							var2 += Rasterizer2D.staticInt330;
							var34 += var35;
							var21 += var22;
							var25 += var38;
						}
					}

					var3 = var5 <<= 14;
					if (var2 < 0) {
						var3 -= var30 * var2;
						var5 -= var27 * var2;
						var8 -= var31 * var2;
						var2 = 0;
					}

					var4 <<= 14;
					if (var1 < 0) {
						var4 -= var29 * var1;
						var1 = 0;
					}

					var23 = var2 - Rasterizer2DSub1.staticInt349;
					var34 += var35 * var23;
					var21 += var22 * var23;
					var25 += var38 * var23;
					if (var30 < var27) {
						var0 -= var1;
						var1 -= var2;
						var2 = Rasterizer2DSub1.staticIntArray158[var2];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									staticMethod438(Rasterizer2D.staticIntArray130, var19, 0, 0, var2, var4 >> 14,
											var5 >> 14, var8, var36, var34, var21, var25, var37, var39, var40);
									var4 += var29;
									var5 += var27;
									var8 += var31;
									var2 += Rasterizer2D.staticInt330;
									var34 += var35;
									var21 += var22;
									var25 += var38;
								}
							}

							staticMethod438(Rasterizer2D.staticIntArray130, var19, 0, 0, var2, var3 >> 14, var5 >> 14,
									var8, var36, var34, var21, var25, var37, var39, var40);
							var3 += var30;
							var5 += var27;
							var8 += var31;
							var2 += Rasterizer2D.staticInt330;
							var34 += var35;
							var21 += var22;
							var25 += var38;
						}
					}

					var0 -= var1;
					var1 -= var2;
					var2 = Rasterizer2DSub1.staticIntArray158[var2];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								staticMethod438(Rasterizer2D.staticIntArray130, var19, 0, 0, var2, var5 >> 14,
										var4 >> 14, var8, var36, var34, var21, var25, var37, var39, var40);
								var4 += var29;
								var5 += var27;
								var8 += var31;
								var2 += Rasterizer2D.staticInt330;
								var34 += var35;
								var21 += var22;
								var25 += var38;
							}
						}

						staticMethod438(Rasterizer2D.staticIntArray130, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8,
								var36, var34, var21, var25, var37, var39, var40);
						var3 += var30;
						var5 += var27;
						var8 += var31;
						var2 += Rasterizer2D.staticInt330;
						var34 += var35;
						var21 += var22;
						var25 += var38;
					}
				}
			}
		}

	}

	static int staticMethod447(int var0, double var1) {
		double var3 = (var0 >> 16) / 256.0D;
		double var10 = (var0 >> 8 & 0xff) / 256.0D;
		double var8 = (var0 & 0xff) / 256.0D;
		var3 = Math.pow(var3, var1);
		var10 = Math.pow(var10, var1);
		var8 = Math.pow(var8, var1);
		int var5 = (int) (var3 * 256.0D);
		int var6 = (int) (var10 * 256.0D);
		int var7 = (int) (var8 * 256.0D);
		return (var5 << 16) + (var6 << 8) + var7;
	}

	static final void staticMethod448(int[] var0, int var1, int var2, int var3, int var4, int var5) {
		if (Rasterizer2DSub1.staticBool51) {
			if (var5 > Rasterizer2DSub1.staticInt343) {
				var5 = Rasterizer2DSub1.staticInt343;
			}

			if (var4 < 0) {
				var4 = 0;
			}
		}

		if (var4 < var5) {
			var1 += var4;
			var3 = var5 - var4 >> 2;
			if (Rasterizer2DSub1.staticInt340 != 0) {
				if (Rasterizer2DSub1.staticInt340 == 254) {
					while (true) {
						--var3;
						if (var3 < 0) {
							var3 = var5 - var4 & 0x3;

							while (true) {
								--var3;
								if (var3 < 0) {
									return;
								}

								var0[var1++] = var0[var1];
							}
						}

						var0[var1++] = var0[var1];
						var0[var1++] = var0[var1];
						var0[var1++] = var0[var1];
						var0[var1++] = var0[var1];
					}
				} else {
					int var7 = Rasterizer2DSub1.staticInt340;
					int var8 = 256 - Rasterizer2DSub1.staticInt340;
					var2 = ((var2 & 0xff00ff) * var8 >> 8 & 0xff00ff) + ((var2 & 0xff00) * var8 >> 8 & 0xff00);

					while (true) {
						--var3;
						int var6;
						if (var3 < 0) {
							var3 = var5 - var4 & 0x3;

							while (true) {
								--var3;
								if (var3 < 0) {
									return;
								}

								var6 = var0[var1];
								var0[var1++] = var2 + ((var6 & 0xff00ff) * var7 >> 8 & 0xff00ff)
										+ ((var6 & 0xff00) * var7 >> 8 & 0xff00);
							}
						}

						var6 = var0[var1];
						var0[var1++] = var2 + ((var6 & 0xff00ff) * var7 >> 8 & 0xff00ff)
								+ ((var6 & 0xff00) * var7 >> 8 & 0xff00);
						var6 = var0[var1];
						var0[var1++] = var2 + ((var6 & 0xff00ff) * var7 >> 8 & 0xff00ff)
								+ ((var6 & 0xff00) * var7 >> 8 & 0xff00);
						var6 = var0[var1];
						var0[var1++] = var2 + ((var6 & 0xff00ff) * var7 >> 8 & 0xff00ff)
								+ ((var6 & 0xff00) * var7 >> 8 & 0xff00);
						var6 = var0[var1];
						var0[var1++] = var2 + ((var6 & 0xff00ff) * var7 >> 8 & 0xff00ff)
								+ ((var6 & 0xff00) * var7 >> 8 & 0xff00);
					}
				}
			} else {
				while (true) {
					--var3;
					if (var3 < 0) {
						var3 = var5 - var4 & 0x3;

						while (true) {
							--var3;
							if (var3 < 0) {
								return;
							}

							var0[var1++] = var2;
						}
					}

					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
				}
			}
		}
	}

	public static final void staticMethod449() {
		staticMethod454(Rasterizer2D.staticInt329, Rasterizer2D.staticInt328, Rasterizer2D.staticInt327,
				Rasterizer2D.staticInt325);
	}

	static final void staticMethod450(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17,
			int var18) {
		int[] var19 = Rasterizer2DSub1.staticInterface2_1.method32(var18);
		int var21;
		if (var19 == null) {
			var21 = Rasterizer2DSub1.staticInterface2_1.method34(var18);
			staticMethod444(var0, var1, var2, var3, var4, var5, staticMethod452(var21, var6),
					staticMethod452(var21, var7), staticMethod452(var21, var8));
		} else {
			Rasterizer2DSub1.staticBool50 = Rasterizer2DSub1.staticInterface2_1.method38(var18);
			Rasterizer2DSub1.staticBool49 = Rasterizer2DSub1.staticInterface2_1.method37(var18);
			var21 = var4 - var3;
			int var25 = var1 - var0;
			int var26 = var5 - var3;
			int var41 = var2 - var0;
			int var27 = var7 - var6;
			int var28 = var8 - var6;
			int var29 = 0;
			if (var1 != var0) {
				var29 = (var4 - var3 << 14) / (var1 - var0);
			}

			int var33 = 0;
			if (var2 != var1) {
				var33 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var30 = 0;
			if (var2 != var0) {
				var30 = (var3 - var5 << 14) / (var0 - var2);
			}

			int var32 = var21 * var41 - var26 * var25;
			if (var32 != 0) {
				int var39 = (var27 * var41 - var28 * var25 << 9) / var32;
				int var31 = (var28 * var21 - var27 * var26 << 9) / var32;
				var10 = var9 - var10;
				var13 = var12 - var13;
				var16 = var15 - var16;
				var11 -= var9;
				var14 -= var12;
				var17 -= var15;
				int var22 = var11 * var12 - var14 * var9 << 14;
				int var34 = (int) (((long) (var14 * var15 - var17 * var12) << 14) / Rasterizer2DSub1.staticInt342);
				int var23 = (int) (((long) (var17 * var9 - var11 * var15) << 14) / Rasterizer2DSub1.staticInt342);
				int var35 = var10 * var12 - var13 * var9 << 14;
				int var20 = (int) (((long) (var13 * var15 - var16 * var12) << 14) / Rasterizer2DSub1.staticInt342);
				int var36 = (int) (((long) (var16 * var9 - var10 * var15) << 14) / Rasterizer2DSub1.staticInt342);
				int var37 = var13 * var11 - var10 * var14 << 14;
				int var38 = (int) (((long) (var16 * var14 - var13 * var17) << 14) / Rasterizer2DSub1.staticInt342);
				int var40 = (int) (((long) (var10 * var17 - var16 * var11) << 14) / Rasterizer2DSub1.staticInt342);
				int var24;
				if (var0 <= var1 && var0 <= var2) {
					if (var0 < Rasterizer2DSub1.staticInt348) {
						if (var1 > Rasterizer2DSub1.staticInt348) {
							var1 = Rasterizer2DSub1.staticInt348;
						}

						if (var2 > Rasterizer2DSub1.staticInt348) {
							var2 = Rasterizer2DSub1.staticInt348;
						}

						var6 = (var6 << 9) - var39 * var3 + var39;
						if (var1 < var2) {
							var5 = var3 <<= 14;
							if (var0 < 0) {
								var5 -= var30 * var0;
								var3 -= var29 * var0;
								var6 -= var31 * var0;
								var0 = 0;
							}

							var4 <<= 14;
							if (var1 < 0) {
								var4 -= var33 * var1;
								var1 = 0;
							}

							var24 = var0 - Rasterizer2DSub1.staticInt349;
							var22 += var23 * var24;
							var35 += var36 * var24;
							var37 += var40 * var24;
							if (var0 != var1 && var30 < var29 || var0 == var1 && var30 > var33) {
								var2 -= var1;
								var1 -= var0;
								var0 = Rasterizer2DSub1.staticIntArray158[var0];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											staticMethod451(Rasterizer2D.staticIntArray130, var19, 0, 0, var0,
													var5 >> 14, var4 >> 14, var6, var39, var22, var35, var37, var34,
													var20, var38);
											var5 += var30;
											var4 += var33;
											var6 += var31;
											var0 += Rasterizer2D.staticInt330;
											var22 += var23;
											var35 += var36;
											var37 += var40;
										}
									}

									staticMethod451(Rasterizer2D.staticIntArray130, var19, 0, 0, var0, var5 >> 14,
											var3 >> 14, var6, var39, var22, var35, var37, var34, var20, var38);
									var5 += var30;
									var3 += var29;
									var6 += var31;
									var0 += Rasterizer2D.staticInt330;
									var22 += var23;
									var35 += var36;
									var37 += var40;
								}
							}

							var2 -= var1;
							var1 -= var0;
							var0 = Rasterizer2DSub1.staticIntArray158[var0];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										staticMethod451(Rasterizer2D.staticIntArray130, var19, 0, 0, var0, var4 >> 14,
												var5 >> 14, var6, var39, var22, var35, var37, var34, var20, var38);
										var5 += var30;
										var4 += var33;
										var6 += var31;
										var0 += Rasterizer2D.staticInt330;
										var22 += var23;
										var35 += var36;
										var37 += var40;
									}
								}

								staticMethod451(Rasterizer2D.staticIntArray130, var19, 0, 0, var0, var3 >> 14,
										var5 >> 14, var6, var39, var22, var35, var37, var34, var20, var38);
								var5 += var30;
								var3 += var29;
								var6 += var31;
								var0 += Rasterizer2D.staticInt330;
								var22 += var23;
								var35 += var36;
								var37 += var40;
							}
						}

						var4 = var3 <<= 14;
						if (var0 < 0) {
							var4 -= var30 * var0;
							var3 -= var29 * var0;
							var6 -= var31 * var0;
							var0 = 0;
						}

						var5 <<= 14;
						if (var2 < 0) {
							var5 -= var33 * var2;
							var2 = 0;
						}

						var24 = var0 - Rasterizer2DSub1.staticInt349;
						var22 += var23 * var24;
						var35 += var36 * var24;
						var37 += var40 * var24;
						if (var0 != var2 && var30 < var29 || var0 == var2 && var33 > var29) {
							var1 -= var2;
							var2 -= var0;
							var0 = Rasterizer2DSub1.staticIntArray158[var0];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										staticMethod451(Rasterizer2D.staticIntArray130, var19, 0, 0, var0, var5 >> 14,
												var3 >> 14, var6, var39, var22, var35, var37, var34, var20, var38);
										var5 += var33;
										var3 += var29;
										var6 += var31;
										var0 += Rasterizer2D.staticInt330;
										var22 += var23;
										var35 += var36;
										var37 += var40;
									}
								}

								staticMethod451(Rasterizer2D.staticIntArray130, var19, 0, 0, var0, var4 >> 14,
										var3 >> 14, var6, var39, var22, var35, var37, var34, var20, var38);
								var4 += var30;
								var3 += var29;
								var6 += var31;
								var0 += Rasterizer2D.staticInt330;
								var22 += var23;
								var35 += var36;
								var37 += var40;
							}
						}

						var1 -= var2;
						var2 -= var0;
						var0 = Rasterizer2DSub1.staticIntArray158[var0];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									staticMethod451(Rasterizer2D.staticIntArray130, var19, 0, 0, var0, var3 >> 14,
											var5 >> 14, var6, var39, var22, var35, var37, var34, var20, var38);
									var5 += var33;
									var3 += var29;
									var6 += var31;
									var0 += Rasterizer2D.staticInt330;
									var22 += var23;
									var35 += var36;
									var37 += var40;
								}
							}

							staticMethod451(Rasterizer2D.staticIntArray130, var19, 0, 0, var0, var3 >> 14, var4 >> 14,
									var6, var39, var22, var35, var37, var34, var20, var38);
							var4 += var30;
							var3 += var29;
							var6 += var31;
							var0 += Rasterizer2D.staticInt330;
							var22 += var23;
							var35 += var36;
							var37 += var40;
						}
					}
				} else if (var1 <= var2) {
					if (var1 < Rasterizer2DSub1.staticInt348) {
						if (var2 > Rasterizer2DSub1.staticInt348) {
							var2 = Rasterizer2DSub1.staticInt348;
						}

						if (var0 > Rasterizer2DSub1.staticInt348) {
							var0 = Rasterizer2DSub1.staticInt348;
						}

						var7 = (var7 << 9) - var39 * var4 + var39;
						if (var2 < var0) {
							var3 = var4 <<= 14;
							if (var1 < 0) {
								var3 -= var29 * var1;
								var4 -= var33 * var1;
								var7 -= var31 * var1;
								var1 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var30 * var2;
								var2 = 0;
							}

							var24 = var1 - Rasterizer2DSub1.staticInt349;
							var22 += var23 * var24;
							var35 += var36 * var24;
							var37 += var40 * var24;
							if (var1 != var2 && var29 < var33 || var1 == var2 && var29 > var30) {
								var0 -= var2;
								var2 -= var1;
								var1 = Rasterizer2DSub1.staticIntArray158[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}

											staticMethod451(Rasterizer2D.staticIntArray130, var19, 0, 0, var1,
													var3 >> 14, var5 >> 14, var7, var39, var22, var35, var37, var34,
													var20, var38);
											var3 += var29;
											var5 += var30;
											var7 += var31;
											var1 += Rasterizer2D.staticInt330;
											var22 += var23;
											var35 += var36;
											var37 += var40;
										}
									}

									staticMethod451(Rasterizer2D.staticIntArray130, var19, 0, 0, var1, var3 >> 14,
											var4 >> 14, var7, var39, var22, var35, var37, var34, var20, var38);
									var3 += var29;
									var4 += var33;
									var7 += var31;
									var1 += Rasterizer2D.staticInt330;
									var22 += var23;
									var35 += var36;
									var37 += var40;
								}
							}

							var0 -= var2;
							var2 -= var1;
							var1 = Rasterizer2DSub1.staticIntArray158[var1];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										staticMethod451(Rasterizer2D.staticIntArray130, var19, 0, 0, var1, var5 >> 14,
												var3 >> 14, var7, var39, var22, var35, var37, var34, var20, var38);
										var3 += var29;
										var5 += var30;
										var7 += var31;
										var1 += Rasterizer2D.staticInt330;
										var22 += var23;
										var35 += var36;
										var37 += var40;
									}
								}

								staticMethod451(Rasterizer2D.staticIntArray130, var19, 0, 0, var1, var4 >> 14,
										var3 >> 14, var7, var39, var22, var35, var37, var34, var20, var38);
								var3 += var29;
								var4 += var33;
								var7 += var31;
								var1 += Rasterizer2D.staticInt330;
								var22 += var23;
								var35 += var36;
								var37 += var40;
							}
						}

						var5 = var4 <<= 14;
						if (var1 < 0) {
							var5 -= var29 * var1;
							var4 -= var33 * var1;
							var7 -= var31 * var1;
							var1 = 0;
						}

						var3 <<= 14;
						if (var0 < 0) {
							var3 -= var30 * var0;
							var0 = 0;
						}

						var24 = var1 - Rasterizer2DSub1.staticInt349;
						var22 += var23 * var24;
						var35 += var36 * var24;
						var37 += var40 * var24;
						if (var29 < var33) {
							var2 -= var0;
							var0 -= var1;
							var1 = Rasterizer2DSub1.staticIntArray158[var1];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										staticMethod451(Rasterizer2D.staticIntArray130, var19, 0, 0, var1, var3 >> 14,
												var4 >> 14, var7, var39, var22, var35, var37, var34, var20, var38);
										var3 += var30;
										var4 += var33;
										var7 += var31;
										var1 += Rasterizer2D.staticInt330;
										var22 += var23;
										var35 += var36;
										var37 += var40;
									}
								}

								staticMethod451(Rasterizer2D.staticIntArray130, var19, 0, 0, var1, var5 >> 14,
										var4 >> 14, var7, var39, var22, var35, var37, var34, var20, var38);
								var5 += var29;
								var4 += var33;
								var7 += var31;
								var1 += Rasterizer2D.staticInt330;
								var22 += var23;
								var35 += var36;
								var37 += var40;
							}
						}

						var2 -= var0;
						var0 -= var1;
						var1 = Rasterizer2DSub1.staticIntArray158[var1];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									staticMethod451(Rasterizer2D.staticIntArray130, var19, 0, 0, var1, var4 >> 14,
											var3 >> 14, var7, var39, var22, var35, var37, var34, var20, var38);
									var3 += var30;
									var4 += var33;
									var7 += var31;
									var1 += Rasterizer2D.staticInt330;
									var22 += var23;
									var35 += var36;
									var37 += var40;
								}
							}

							staticMethod451(Rasterizer2D.staticIntArray130, var19, 0, 0, var1, var4 >> 14, var5 >> 14,
									var7, var39, var22, var35, var37, var34, var20, var38);
							var5 += var29;
							var4 += var33;
							var7 += var31;
							var1 += Rasterizer2D.staticInt330;
							var22 += var23;
							var35 += var36;
							var37 += var40;
						}
					}
				} else if (var2 < Rasterizer2DSub1.staticInt348) {
					if (var0 > Rasterizer2DSub1.staticInt348) {
						var0 = Rasterizer2DSub1.staticInt348;
					}

					if (var1 > Rasterizer2DSub1.staticInt348) {
						var1 = Rasterizer2DSub1.staticInt348;
					}

					var8 = (var8 << 9) - var39 * var5 + var39;
					if (var0 < var1) {
						var4 = var5 <<= 14;
						if (var2 < 0) {
							var4 -= var33 * var2;
							var5 -= var30 * var2;
							var8 -= var31 * var2;
							var2 = 0;
						}

						var3 <<= 14;
						if (var0 < 0) {
							var3 -= var29 * var0;
							var0 = 0;
						}

						var24 = var2 - Rasterizer2DSub1.staticInt349;
						var22 += var23 * var24;
						var35 += var36 * var24;
						var37 += var40 * var24;
						if (var33 < var30) {
							var1 -= var0;
							var0 -= var2;
							var2 = Rasterizer2DSub1.staticIntArray158[var2];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										staticMethod451(Rasterizer2D.staticIntArray130, var19, 0, 0, var2, var4 >> 14,
												var3 >> 14, var8, var39, var22, var35, var37, var34, var20, var38);
										var4 += var33;
										var3 += var29;
										var8 += var31;
										var2 += Rasterizer2D.staticInt330;
										var22 += var23;
										var35 += var36;
										var37 += var40;
									}
								}

								staticMethod451(Rasterizer2D.staticIntArray130, var19, 0, 0, var2, var4 >> 14,
										var5 >> 14, var8, var39, var22, var35, var37, var34, var20, var38);
								var4 += var33;
								var5 += var30;
								var8 += var31;
								var2 += Rasterizer2D.staticInt330;
								var22 += var23;
								var35 += var36;
								var37 += var40;
							}
						}

						var1 -= var0;
						var0 -= var2;
						var2 = Rasterizer2DSub1.staticIntArray158[var2];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									staticMethod451(Rasterizer2D.staticIntArray130, var19, 0, 0, var2, var3 >> 14,
											var4 >> 14, var8, var39, var22, var35, var37, var34, var20, var38);
									var4 += var33;
									var3 += var29;
									var8 += var31;
									var2 += Rasterizer2D.staticInt330;
									var22 += var23;
									var35 += var36;
									var37 += var40;
								}
							}

							staticMethod451(Rasterizer2D.staticIntArray130, var19, 0, 0, var2, var5 >> 14, var4 >> 14,
									var8, var39, var22, var35, var37, var34, var20, var38);
							var4 += var33;
							var5 += var30;
							var8 += var31;
							var2 += Rasterizer2D.staticInt330;
							var22 += var23;
							var35 += var36;
							var37 += var40;
						}
					}

					var3 = var5 <<= 14;
					if (var2 < 0) {
						var3 -= var33 * var2;
						var5 -= var30 * var2;
						var8 -= var31 * var2;
						var2 = 0;
					}

					var4 <<= 14;
					if (var1 < 0) {
						var4 -= var29 * var1;
						var1 = 0;
					}

					var24 = var2 - Rasterizer2DSub1.staticInt349;
					var22 += var23 * var24;
					var35 += var36 * var24;
					var37 += var40 * var24;
					if (var33 < var30) {
						var0 -= var1;
						var1 -= var2;
						var2 = Rasterizer2DSub1.staticIntArray158[var2];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									staticMethod451(Rasterizer2D.staticIntArray130, var19, 0, 0, var2, var4 >> 14,
											var5 >> 14, var8, var39, var22, var35, var37, var34, var20, var38);
									var4 += var29;
									var5 += var30;
									var8 += var31;
									var2 += Rasterizer2D.staticInt330;
									var22 += var23;
									var35 += var36;
									var37 += var40;
								}
							}

							staticMethod451(Rasterizer2D.staticIntArray130, var19, 0, 0, var2, var3 >> 14, var5 >> 14,
									var8, var39, var22, var35, var37, var34, var20, var38);
							var3 += var33;
							var5 += var30;
							var8 += var31;
							var2 += Rasterizer2D.staticInt330;
							var22 += var23;
							var35 += var36;
							var37 += var40;
						}
					}

					var0 -= var1;
					var1 -= var2;
					var2 = Rasterizer2DSub1.staticIntArray158[var2];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								staticMethod451(Rasterizer2D.staticIntArray130, var19, 0, 0, var2, var5 >> 14,
										var4 >> 14, var8, var39, var22, var35, var37, var34, var20, var38);
								var4 += var29;
								var5 += var30;
								var8 += var31;
								var2 += Rasterizer2D.staticInt330;
								var22 += var23;
								var35 += var36;
								var37 += var40;
							}
						}

						staticMethod451(Rasterizer2D.staticIntArray130, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8,
								var39, var22, var35, var37, var34, var20, var38);
						var3 += var33;
						var5 += var30;
						var8 += var31;
						var2 += Rasterizer2D.staticInt330;
						var22 += var23;
						var35 += var36;
						var37 += var40;
					}
				}
			}
		}

	}

	static final void staticMethod451(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6,
			int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (Rasterizer2DSub1.staticBool51) {
			if (var6 > Rasterizer2DSub1.staticInt343) {
				var6 = Rasterizer2DSub1.staticInt343;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var4 += var5;
			var7 += var8 * var5;
			int var17 = var6 - var5;
			int var15;
			int var16;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (Rasterizer2DSub1.staticBool50) {
				var18 = var5 - Rasterizer2DSub1.staticInt344;
				var9 += var12 * var18;
				var10 += var13 * var18;
				var11 += var14 * var18;
				var19 = var11 >> 12;
				if (var19 != 0) {
					var20 = var9 / var19;
					var21 = var10 / var19;
				} else {
					var20 = 0;
					var21 = 0;
				}

				var9 += var12 * var17;
				var10 += var13 * var17;
				var11 += var14 * var17;
				var19 = var11 >> 12;
				if (var19 != 0) {
					var22 = var9 / var19;
					var23 = var10 / var19;
				} else {
					var22 = 0;
					var23 = 0;
				}

				var2 = (var20 << 20) + var21;
				var16 = ((var22 - var20) / var17 << 20) + (var23 - var21) / var17;
				var17 >>= 3;
				var8 <<= 3;
				var15 = var7 >> 8;
				if (Rasterizer2DSub1.staticBool49) {
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
									+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
									+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
									+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
									+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
									+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
									+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
									+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
									+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							var2 += var16;
							var7 += var8;
							var15 = var7 >> 8;
							--var17;
						} while (var17 > 0);
					}

					var17 = var6 - var5 & 0x7;
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
									+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							var2 += var16;
							--var17;
						} while (var17 > 0);
					}
				} else {
					if (var17 > 0) {
						do {
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
										+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
										+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
										+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
										+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
										+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
										+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
										+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
										+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var16;
							var7 += var8;
							var15 = var7 >> 8;
							--var17;
						} while (var17 > 0);
					}

					var17 = var6 - var5 & 0x7;
					if (var17 > 0) {
						do {
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
										+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var16;
							--var17;
						} while (var17 > 0);
					}
				}
			} else {
				var18 = var5 - Rasterizer2DSub1.staticInt344;
				var9 += var12 * var18;
				var10 += var13 * var18;
				var11 += var14 * var18;
				var19 = var11 >> 14;
				if (var19 != 0) {
					var20 = var9 / var19;
					var21 = var10 / var19;
				} else {
					var20 = 0;
					var21 = 0;
				}

				var9 += var12 * var17;
				var10 += var13 * var17;
				var11 += var14 * var17;
				var19 = var11 >> 14;
				if (var19 != 0) {
					var22 = var9 / var19;
					var23 = var10 / var19;
				} else {
					var22 = 0;
					var23 = 0;
				}

				var2 = (var20 << 18) + var21;
				var16 = ((var22 - var20) / var17 << 18) + (var23 - var21) / var17;
				var17 >>= 3;
				var8 <<= 3;
				var15 = var7 >> 8;
				if (Rasterizer2DSub1.staticBool49) {
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
									+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
									+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
									+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
									+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
									+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
									+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
									+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
									+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							var2 += var16;
							var7 += var8;
							var15 = var7 >> 8;
							--var17;
						} while (var17 > 0);
					}

					var17 = var6 - var5 & 0x7;
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
									+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							var2 += var16;
							--var17;
						} while (var17 > 0);
					}
				} else {
					if (var17 > 0) {
						do {
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
										+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
										+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
										+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
										+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
										+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
										+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
										+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
										+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var16;
							var7 += var8;
							var15 = var7 >> 8;
							--var17;
						} while (var17 > 0);
					}

					var17 = var6 - var5 & 0x7;
					if (var17 > 0) {
						do {
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var15 & 0xff00ff00)
										+ ((var3 & 0xff00) * var15 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var16;
							--var17;
						} while (var17 > 0);
					}
				}
			}
		}

	}

	static final int staticMethod452(int var0, int var1) {
		var1 = var1 * (var0 & 0x7f) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 0xff80) + var1;
	}

	public static final void staticMethod453(double var0) {
		staticMethod443(var0, 0, 512);
	}

	static final void staticMethod454(int var0, int var1, int var2, int var3) {
		Rasterizer2DSub1.staticInt343 = var2 - var0;
		Rasterizer2DSub1.staticInt348 = var3 - var1;
		staticMethod439();
		int var4;
		int var5;
		if (Rasterizer2DSub1.staticIntArray158.length < Rasterizer2DSub1.staticInt348) {
			var4 = Rasterizer2DSub1.staticInt348;
			--var4;
			var4 |= var4 >>> 1;
			var4 |= var4 >>> 2;
			var4 |= var4 >>> 4;
			var4 |= var4 >>> 8;
			var4 |= var4 >>> 16;
			var5 = var4 + 1;
			Rasterizer2DSub1.staticIntArray158 = new int[var5];
		}

		var5 = var1 * Rasterizer2D.staticInt330 + var0;

		for (var4 = 0; var4 < Rasterizer2DSub1.staticInt348; var4++) {
			Rasterizer2DSub1.staticIntArray158[var4] = var5;
			var5 += Rasterizer2D.staticInt330;
		}

	}

	public static final void staticMethod455(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = 0;
		if (var1 != var0) {
			var7 = (var4 - var3 << 14) / (var1 - var0);
		}

		int var8 = 0;
		if (var2 != var1) {
			var8 = (var5 - var4 << 14) / (var2 - var1);
		}

		int var9 = 0;
		if (var2 != var0) {
			var9 = (var3 - var5 << 14) / (var0 - var2);
		}

		if (var0 <= var1 && var0 <= var2) {
			if (var0 < Rasterizer2DSub1.staticInt348) {
				if (var1 > Rasterizer2DSub1.staticInt348) {
					var1 = Rasterizer2DSub1.staticInt348;
				}

				if (var2 > Rasterizer2DSub1.staticInt348) {
					var2 = Rasterizer2DSub1.staticInt348;
				}

				if (var1 < var2) {
					var5 = var3 <<= 14;
					if (var0 < 0) {
						var5 -= var9 * var0;
						var3 -= var7 * var0;
						var0 = 0;
					}

					var4 <<= 14;
					if (var1 < 0) {
						var4 -= var8 * var1;
						var1 = 0;
					}

					if ((var0 == var1 || var9 >= var7) && (var0 != var1 || var9 <= var8)) {
						var2 -= var1;
						var1 -= var0;
						var0 = Rasterizer2DSub1.staticIntArray158[var0];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									staticMethod448(Rasterizer2D.staticIntArray130, var0, var6, 0, var4 >> 14,
											var5 >> 14);
									var5 += var9;
									var4 += var8;
									var0 += Rasterizer2D.staticInt330;
								}
							}

							staticMethod448(Rasterizer2D.staticIntArray130, var0, var6, 0, var3 >> 14, var5 >> 14);
							var5 += var9;
							var3 += var7;
							var0 += Rasterizer2D.staticInt330;
						}
					}

					var2 -= var1;
					var1 -= var0;
					var0 = Rasterizer2DSub1.staticIntArray158[var0];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var2;
								if (var2 < 0) {
									return;
								}

								staticMethod448(Rasterizer2D.staticIntArray130, var0, var6, 0, var5 >> 14, var4 >> 14);
								var5 += var9;
								var4 += var8;
								var0 += Rasterizer2D.staticInt330;
							}
						}

						staticMethod448(Rasterizer2D.staticIntArray130, var0, var6, 0, var5 >> 14, var3 >> 14);
						var5 += var9;
						var3 += var7;
						var0 += Rasterizer2D.staticInt330;
					}
				}

				var4 = var3 <<= 14;
				if (var0 < 0) {
					var4 -= var9 * var0;
					var3 -= var7 * var0;
					var0 = 0;
				}

				var5 <<= 14;
				if (var2 < 0) {
					var5 -= var8 * var2;
					var2 = 0;
				}

				if (var0 != var2 && var9 < var7 || var0 == var2 && var8 > var7) {
					var1 -= var2;
					var2 -= var0;
					var0 = Rasterizer2DSub1.staticIntArray158[var0];

					while (true) {
						--var2;
						if (var2 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								staticMethod448(Rasterizer2D.staticIntArray130, var0, var6, 0, var5 >> 14, var3 >> 14);
								var5 += var8;
								var3 += var7;
								var0 += Rasterizer2D.staticInt330;
							}
						}

						staticMethod448(Rasterizer2D.staticIntArray130, var0, var6, 0, var4 >> 14, var3 >> 14);
						var4 += var9;
						var3 += var7;
						var0 += Rasterizer2D.staticInt330;
					}
				}

				var1 -= var2;
				var2 -= var0;
				var0 = Rasterizer2DSub1.staticIntArray158[var0];

				while (true) {
					--var2;
					if (var2 < 0) {
						while (true) {
							--var1;
							if (var1 < 0) {
								return;
							}

							staticMethod448(Rasterizer2D.staticIntArray130, var0, var6, 0, var3 >> 14, var5 >> 14);
							var5 += var8;
							var3 += var7;
							var0 += Rasterizer2D.staticInt330;
						}
					}

					staticMethod448(Rasterizer2D.staticIntArray130, var0, var6, 0, var3 >> 14, var4 >> 14);
					var4 += var9;
					var3 += var7;
					var0 += Rasterizer2D.staticInt330;
				}
			}
		} else if (var1 <= var2) {
			if (var1 < Rasterizer2DSub1.staticInt348) {
				if (var2 > Rasterizer2DSub1.staticInt348) {
					var2 = Rasterizer2DSub1.staticInt348;
				}

				if (var0 > Rasterizer2DSub1.staticInt348) {
					var0 = Rasterizer2DSub1.staticInt348;
				}

				if (var2 < var0) {
					var3 = var4 <<= 14;
					if (var1 < 0) {
						var3 -= var7 * var1;
						var4 -= var8 * var1;
						var1 = 0;
					}

					var5 <<= 14;
					if (var2 < 0) {
						var5 -= var9 * var2;
						var2 = 0;
					}

					if ((var1 == var2 || var7 >= var8) && (var1 != var2 || var7 <= var9)) {
						var0 -= var2;
						var2 -= var1;
						var1 = Rasterizer2DSub1.staticIntArray158[var1];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									staticMethod448(Rasterizer2D.staticIntArray130, var1, var6, 0, var5 >> 14,
											var3 >> 14);
									var3 += var7;
									var5 += var9;
									var1 += Rasterizer2D.staticInt330;
								}
							}

							staticMethod448(Rasterizer2D.staticIntArray130, var1, var6, 0, var4 >> 14, var3 >> 14);
							var3 += var7;
							var4 += var8;
							var1 += Rasterizer2D.staticInt330;
						}
					}

					var0 -= var2;
					var2 -= var1;
					var1 = Rasterizer2DSub1.staticIntArray158[var1];

					while (true) {
						--var2;
						if (var2 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								staticMethod448(Rasterizer2D.staticIntArray130, var1, var6, 0, var3 >> 14, var5 >> 14);
								var3 += var7;
								var5 += var9;
								var1 += Rasterizer2D.staticInt330;
							}
						}

						staticMethod448(Rasterizer2D.staticIntArray130, var1, var6, 0, var3 >> 14, var4 >> 14);
						var3 += var7;
						var4 += var8;
						var1 += Rasterizer2D.staticInt330;
					}
				}

				var5 = var4 <<= 14;
				if (var1 < 0) {
					var5 -= var7 * var1;
					var4 -= var8 * var1;
					var1 = 0;
				}

				var3 <<= 14;
				if (var0 < 0) {
					var3 -= var9 * var0;
					var0 = 0;
				}

				if (var7 < var8) {
					var2 -= var0;
					var0 -= var1;
					var1 = Rasterizer2DSub1.staticIntArray158[var1];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var2;
								if (var2 < 0) {
									return;
								}

								staticMethod448(Rasterizer2D.staticIntArray130, var1, var6, 0, var3 >> 14, var4 >> 14);
								var3 += var9;
								var4 += var8;
								var1 += Rasterizer2D.staticInt330;
							}
						}

						staticMethod448(Rasterizer2D.staticIntArray130, var1, var6, 0, var5 >> 14, var4 >> 14);
						var5 += var7;
						var4 += var8;
						var1 += Rasterizer2D.staticInt330;
					}
				}

				var2 -= var0;
				var0 -= var1;
				var1 = Rasterizer2DSub1.staticIntArray158[var1];

				while (true) {
					--var0;
					if (var0 < 0) {
						while (true) {
							--var2;
							if (var2 < 0) {
								return;
							}

							staticMethod448(Rasterizer2D.staticIntArray130, var1, var6, 0, var4 >> 14, var3 >> 14);
							var3 += var9;
							var4 += var8;
							var1 += Rasterizer2D.staticInt330;
						}
					}

					staticMethod448(Rasterizer2D.staticIntArray130, var1, var6, 0, var4 >> 14, var5 >> 14);
					var5 += var7;
					var4 += var8;
					var1 += Rasterizer2D.staticInt330;
				}
			}
		} else if (var2 < Rasterizer2DSub1.staticInt348) {
			if (var0 > Rasterizer2DSub1.staticInt348) {
				var0 = Rasterizer2DSub1.staticInt348;
			}

			if (var1 > Rasterizer2DSub1.staticInt348) {
				var1 = Rasterizer2DSub1.staticInt348;
			}

			if (var0 < var1) {
				var4 = var5 <<= 14;
				if (var2 < 0) {
					var4 -= var8 * var2;
					var5 -= var9 * var2;
					var2 = 0;
				}

				var3 <<= 14;
				if (var0 < 0) {
					var3 -= var7 * var0;
					var0 = 0;
				}

				if (var8 < var9) {
					var1 -= var0;
					var0 -= var2;
					var2 = Rasterizer2DSub1.staticIntArray158[var2];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								staticMethod448(Rasterizer2D.staticIntArray130, var2, var6, 0, var4 >> 14, var3 >> 14);
								var4 += var8;
								var3 += var7;
								var2 += Rasterizer2D.staticInt330;
							}
						}

						staticMethod448(Rasterizer2D.staticIntArray130, var2, var6, 0, var4 >> 14, var5 >> 14);
						var4 += var8;
						var5 += var9;
						var2 += Rasterizer2D.staticInt330;
					}
				}

				var1 -= var0;
				var0 -= var2;
				var2 = Rasterizer2DSub1.staticIntArray158[var2];

				while (true) {
					--var0;
					if (var0 < 0) {
						while (true) {
							--var1;
							if (var1 < 0) {
								return;
							}

							staticMethod448(Rasterizer2D.staticIntArray130, var2, var6, 0, var3 >> 14, var4 >> 14);
							var4 += var8;
							var3 += var7;
							var2 += Rasterizer2D.staticInt330;
						}
					}

					staticMethod448(Rasterizer2D.staticIntArray130, var2, var6, 0, var5 >> 14, var4 >> 14);
					var4 += var8;
					var5 += var9;
					var2 += Rasterizer2D.staticInt330;
				}
			}

			var3 = var5 <<= 14;
			if (var2 < 0) {
				var3 -= var8 * var2;
				var5 -= var9 * var2;
				var2 = 0;
			}

			var4 <<= 14;
			if (var1 < 0) {
				var4 -= var7 * var1;
				var1 = 0;
			}

			if (var8 < var9) {
				var0 -= var1;
				var1 -= var2;
				var2 = Rasterizer2DSub1.staticIntArray158[var2];

				while (true) {
					--var1;
					if (var1 < 0) {
						while (true) {
							--var0;
							if (var0 < 0) {
								return;
							}

							staticMethod448(Rasterizer2D.staticIntArray130, var2, var6, 0, var4 >> 14, var5 >> 14);
							var4 += var7;
							var5 += var9;
							var2 += Rasterizer2D.staticInt330;
						}
					}

					staticMethod448(Rasterizer2D.staticIntArray130, var2, var6, 0, var3 >> 14, var5 >> 14);
					var3 += var8;
					var5 += var9;
					var2 += Rasterizer2D.staticInt330;
				}
			}

			var0 -= var1;
			var1 -= var2;
			var2 = Rasterizer2DSub1.staticIntArray158[var2];

			while (true) {
				--var1;
				if (var1 < 0) {
					while (true) {
						--var0;
						if (var0 < 0) {
							return;
						}

						staticMethod448(Rasterizer2D.staticIntArray130, var2, var6, 0, var5 >> 14, var4 >> 14);
						var4 += var7;
						var5 += var9;
						var2 += Rasterizer2D.staticInt330;
					}
				}

				staticMethod448(Rasterizer2D.staticIntArray130, var2, var6, 0, var5 >> 14, var3 >> 14);
				var3 += var8;
				var5 += var9;
				var2 += Rasterizer2D.staticInt330;
			}
		}

	}

	public static String staticMethod456(String var0) {
		int var1 = var0.length();
		int var5 = 0;

		for (int var6 = 0; var6 < var1; var6++) {
			char var7 = var0.charAt(var6);
			if (var7 == 60 || var7 == 62) {
				var5 += 3;
			}
		}

		StringBuilder var61 = new StringBuilder(var1 + var5);

		for (int var71 = 0; var71 < var1; var71++) {
			char var2 = var0.charAt(var71);
			if (var2 == 60) {
				var61.append("<lt>");
			} else if (var2 == 62) {
				var61.append("<gt>");
			} else {
				var61.append(var2);
			}
		}

		return var61.toString();
	}

	static void staticMethod457(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var1 + var2 * Rasterizer2D.staticInt330;
		int var9 = Rasterizer2D.staticInt330 - var3;
		int var10 = 0;
		int var8 = 0;
		int var7;
		if (var2 < Rasterizer2D.staticInt328) {
			var7 = Rasterizer2D.staticInt328 - var2;
			var4 -= var7;
			var2 = Rasterizer2D.staticInt328;
			var8 += var7 * var3;
			var6 += var7 * Rasterizer2D.staticInt330;
		}

		if (var2 + var4 > Rasterizer2D.staticInt325) {
			var4 -= var2 + var4 - Rasterizer2D.staticInt325;
		}

		if (var1 < Rasterizer2D.staticInt329) {
			var7 = Rasterizer2D.staticInt329 - var1;
			var3 -= var7;
			var1 = Rasterizer2D.staticInt329;
			var8 += var7;
			var6 += var7;
			var10 += var7;
			var9 += var7;
		}

		if (var1 + var3 > Rasterizer2D.staticInt327) {
			var7 = var1 + var3 - Rasterizer2D.staticInt327;
			var3 -= var7;
			var10 += var7;
			var9 += var7;
		}

		if (var3 > 0 && var4 > 0) {
			staticMethod458(Rasterizer2D.staticIntArray130, var0, var5, var8, var6, var3, var4, var9, var10);
		}

	}

	static void staticMethod458(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 0x3);

		for (int var11 = -var6; var11 < 0; var11++) {
			int var10;
			for (var10 = var9; var10 < 0; var10++) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			for (var10 = var5; var10 < 0; var10++) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	static void staticMethod459(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var1 + var2 * Rasterizer2D.staticInt330;
		int var11 = Rasterizer2D.staticInt330 - var3;
		int var10 = 0;
		int var9 = 0;
		int var8;
		if (var2 < Rasterizer2D.staticInt328) {
			var8 = Rasterizer2D.staticInt328 - var2;
			var4 -= var8;
			var2 = Rasterizer2D.staticInt328;
			var9 += var8 * var3;
			var7 += var8 * Rasterizer2D.staticInt330;
		}

		if (var2 + var4 > Rasterizer2D.staticInt325) {
			var4 -= var2 + var4 - Rasterizer2D.staticInt325;
		}

		if (var1 < Rasterizer2D.staticInt329) {
			var8 = Rasterizer2D.staticInt329 - var1;
			var3 -= var8;
			var1 = Rasterizer2D.staticInt329;
			var9 += var8;
			var7 += var8;
			var10 += var8;
			var11 += var8;
		}

		if (var1 + var3 > Rasterizer2D.staticInt327) {
			var8 = var1 + var3 - Rasterizer2D.staticInt327;
			var3 -= var8;
			var10 += var8;
			var11 += var8;
		}

		if (var3 > 0 && var4 > 0) {
			staticMethod460(Rasterizer2D.staticIntArray130, var0, var5, var9, var7, var3, var4, var11, var10, var6);
		}

	}

	static void staticMethod460(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8, int var9) {
		var2 = ((var2 & 0xff00ff) * var9 & 0xff00ff00) + ((var2 & 0xff00) * var9 & 0xff0000) >> 8;
		var9 = 256 - var9;

		for (int var10 = -var6; var10 < 0; var10++) {
			for (int var11 = -var5; var11 < 0; var11++) {
				if (var1[var3++] != 0) {
					int var12 = var0[var4];
					var0[var4++] = (((var12 & 0xff00ff) * var9 & 0xff00ff00)
							+ ((var12 & 0xff00) * var9 & 0xff0000) >> 8) + var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	static int staticMethod461(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
		int var7 = var2[var5];
		int var14 = var7 + var4[var5];
		int var11 = var2[var6];
		int var13 = var11 + var4[var6];
		int var10 = var7;
		if (var11 > var7) {
			var10 = var11;
		}

		int var15 = var14;
		if (var13 < var14) {
			var15 = var13;
		}

		int var9 = var3[var5];
		if (var3[var6] < var9) {
			var9 = var3[var6];
		}

		byte[] var16 = var1[var5];
		byte[] var18 = var0[var6];
		int var17 = var10 - var7;
		int var12 = var10 - var11;

		for (int var19 = var10; var19 < var15; var19++) {
			int var8 = var16[var17++] + var18[var12++];
			if (var8 < var9) {
				var9 = var8;
			}
		}

		return -var9;
	}

	static void staticMethod468(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7,
			int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 0x3);

		for (int var11 = -var6; var11 < 0; var11++) {
			byte var10;
			int var12;
			for (var12 = var9; var12 < 0; var12++) {
				var10 = var1[var3++];
				if (var10 != 0) {
					var0[var4++] = var2[var10 & 0xff];
				} else {
					++var4;
				}

				var10 = var1[var3++];
				if (var10 != 0) {
					var0[var4++] = var2[var10 & 0xff];
				} else {
					++var4;
				}

				var10 = var1[var3++];
				if (var10 != 0) {
					var0[var4++] = var2[var10 & 0xff];
				} else {
					++var4;
				}

				var10 = var1[var3++];
				if (var10 != 0) {
					var0[var4++] = var2[var10 & 0xff];
				} else {
					++var4;
				}
			}

			for (var12 = var5; var12 < 0; var12++) {
				var10 = var1[var3++];
				if (var10 != 0) {
					var0[var4++] = var2[var10 & 0xff];
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public static void staticMethod427() {
		while (true) {
			Js5CacheWriteRequest var1;
			synchronized (FileRequestTask.staticClass39_3) {
				var1 = (Js5CacheWriteRequest) FileRequestTask.staticClass39_2.method194();
			}

			if (var1 == null) {
				return;
			}

			var1.aJs5IndexImpl1.method394(var1.aJs5DiskCache1, (int) var1.id, var1.aByteArray22, false);
		}
	}

	public static boolean staticMethod428(char var0) {
		return var0 >= 48 && var0 <= 57 || var0 >= 65 && var0 <= 90 || var0 >= 97 && var0 <= 122;
	}

	public static final Class19 staticMethod431(TaskManager var0, Component var1, int var2, int var3) {
		if (staticInt120 == 0) {
			throw new IllegalStateException();
		} else if (var2 >= 0 && var2 < 2) {
			if (var3 < 256) {
				var3 = 256;
			}

			try {
				Class19Sub1 var5 = new Class19Sub1();
				var5.anIntArray27 = new int[(Class19.staticBool5 ? 2 : 1) * 256];
				var5.anInt51 = var3;
				var5.method71(var1);
				var5.anInt50 = 1024 + (var3 & 0xfffffc00);
				if (var5.anInt50 > 16384) {
					var5.anInt50 = 16384;
				}

				var5.method79(var5.anInt50);
				if (Class19.staticInt35 > 0 && Class19.staticClass15_1 == null) {
					Class19.staticClass15_1 = new Class15();
					Class19.staticClass15_1.aTaskManager1 = var0;
					var0.method94(Class19.staticClass15_1, Class19.staticInt35);
				}

				if (Class19.staticClass15_1 != null) {
					if (Class19.staticClass15_1.aClass19Array1[var2] != null) {
						throw new IllegalArgumentException();
					}

					Class19.staticClass15_1.aClass19Array1[var2] = var5;
				}

				return var5;
			} catch (Throwable var51) {
				return new Class19();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	static final void staticMethod432(long var0) {
		try {
			Thread.sleep(var0);
		} catch (InterruptedException var3) {
			;
		}

	}

	public static RenderableSub3 staticMethod434(Js5Index var0, int var1, int var2) {
		byte[] var3 = var0.getFile(var1, var2);
		return var3 == null ? null : new RenderableSub3(var3);
	}

	static final int staticMethod435(int var0, int var1) {
		var1 = var1 * (var0 & 0x7f) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 0xff80) + var1;
	}

	static void staticMethod436(RenderableSub3 var0, RenderableSub3 var1, int var2, int var3, int var4, boolean var5) {
		var0.method582();
		var0.method586();
		var1.method582();
		var1.method586();
		++RenderableSub3.staticInt333;
		int var8 = 0;
		int[] var9 = var1.anIntArray133;
		int var10 = var1.anInt651;

		int var12;
		for (var12 = 0; var12 < var0.anInt651; var12++) {
			Class27 var11 = var0.aClass27Array2[var12];
			if (var11.anInt82 != 0) {
				int var13 = var0.anIntArray129[var12] - var3;
				if (var13 <= var1.anInt655) {
					int var14 = var0.anIntArray133[var12] - var2;
					if (var14 >= var1.anInt656 && var14 <= var1.anInt654) {
						int var15 = var0.anIntArray136[var12] - var4;
						if (var15 >= var1.anInt658 && var15 <= var1.anInt657) {
							for (int var16 = 0; var16 < var10; var16++) {
								Class27 var7 = var1.aClass27Array2[var16];
								if (var14 == var9[var16] && var15 == var1.anIntArray136[var16]
										&& var13 == var1.anIntArray129[var16] && var7.anInt82 != 0) {
									if (var0.aClass27Array1 == null) {
										var0.aClass27Array1 = new Class27[var0.anInt651];
									}

									if (var1.aClass27Array1 == null) {
										var1.aClass27Array1 = new Class27[var10];
									}

									Class27 var6 = var0.aClass27Array1[var12];
									if (var6 == null) {
										var6 = var0.aClass27Array1[var12] = new Class27(var11);
									}

									Class27 var17 = var1.aClass27Array1[var16];
									if (var17 == null) {
										var17 = var1.aClass27Array1[var16] = new Class27(var7);
									}

									var6.anInt79 += var7.anInt79 * 1;
									var6.anInt80 += var7.anInt80 * 1;
									var6.anInt81 += var7.anInt81 * 1;
									var6.anInt82 += var7.anInt82 * 1;
									var17.anInt79 += var11.anInt79 * 1;
									var17.anInt80 += var11.anInt80 * 1;
									var17.anInt81 += var11.anInt81 * 1;
									var17.anInt82 += var11.anInt82 * 1;
									++var8;
									RenderableSub3.staticIntArray132[var12] = RenderableSub3.staticInt333;
									RenderableSub3.staticIntArray133[var16] = RenderableSub3.staticInt333;
								}
							}
						}
					}
				}
			}
		}

		if (var8 >= 3 && var5) {
			for (var12 = 0; var12 < var0.anInt653; var12++) {
				if (RenderableSub3.staticIntArray132[var0.anIntArray135[var12]] == RenderableSub3.staticInt333
						&& RenderableSub3.staticIntArray132[var0.anIntArray131[var12]] == RenderableSub3.staticInt333
						&& RenderableSub3.staticIntArray132[var0.anIntArray132[var12]] == RenderableSub3.staticInt333) {
					if (var0.aByteArray26 == null) {
						var0.aByteArray26 = new byte[var0.anInt653];
					}

					var0.aByteArray26[var12] = 2;
				}
			}

			for (var12 = 0; var12 < var1.anInt653; var12++) {
				if (RenderableSub3.staticIntArray133[var1.anIntArray135[var12]] == RenderableSub3.staticInt333
						&& RenderableSub3.staticIntArray133[var1.anIntArray131[var12]] == RenderableSub3.staticInt333
						&& RenderableSub3.staticIntArray133[var1.anIntArray132[var12]] == RenderableSub3.staticInt333) {
					if (var1.aByteArray26 == null) {
						var1.aByteArray26 = new byte[var1.anInt653];
					}

					var1.aByteArray26[var12] = 2;
				}
			}
		}

	}

	static final int staticMethod437(int var0) {
		if (var0 < 2) {
			var0 = 2;
		} else if (var0 > 126) {
			var0 = 126;
		}

		return var0;
	}

	static void staticMethod462(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = -var5; var8 < 0; var8++) {
			int var9;
			for (var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
				var0[var3++] = var1[var2++];
				var0[var3++] = var1[var2++];
				var0[var3++] = var1[var2++];
			}

			for (var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) {
				;
			}

			var3 += var6;
			var2 += var7;
		}

	}

	static void staticMethod463(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 0x3);

		for (int var10 = -var6; var10 < 0; var10++) {
			int var11;
			for (var11 = var9; var11 < 0; var11++) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			for (var11 = var5; var11 < 0; var11++) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	static void staticMethod464(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8, int var9, int var10, int var11) {
		int var12 = var3;

		for (int var13 = -var8; var13 < 0; var13++) {
			int var14 = (var4 >> 16) * var11;

			for (int var15 = -var7; var15 < 0; var15++) {
				var2 = var1[(var3 >> 16) + var14];
				if (var2 != 0) {
					var0[var5++] = var2;
				} else {
					++var5;
				}

				var3 += var9;
			}

			var4 += var10;
			var3 = var12;
			var5 += var6;
		}

	}

	static void staticMethod465(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8, int var9, int var10) {
		int var11 = 256 - var9;
		int var14 = (var10 & 0xff00ff) * var11 & 0xff00ff00;
		int var13 = (var10 & 0xff00) * var11 & 0xff0000;
		var10 = (var14 | var13) >>> 8;

		for (int var15 = -var6; var15 < 0; var15++) {
			for (int var12 = -var5; var12 < 0; var12++) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var14 = (var2 & 0xff00ff) * var9 & 0xff00ff00;
					var13 = (var2 & 0xff00) * var9 & 0xff0000;
					var0[var4++] = ((var14 | var13) >>> 8) + var10;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	static void staticMethod466(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8, int var9) {
		int var10 = 256 - var9;

		for (int var11 = -var6; var11 < 0; var11++) {
			for (int var13 = -var5; var13 < 0; var13++) {
				var2 = var1[var3++];
				if (var2 != 0) {
					int var12 = var0[var4];
					var0[var4++] = ((var2 & 0xff00ff) * var9 + (var12 & 0xff00ff) * var10 & 0xff00ff00)
							+ ((var2 & 0xff00) * var9 + (var12 & 0xff00) * var10 & 0xff0000) >> 8;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	static void staticMethod467(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8, int var9, int var10, int var11, int var12) {
		int var13 = 256 - var12;
		int var18 = var3;

		for (int var15 = -var8; var15 < 0; var15++) {
			int var16 = (var4 >> 16) * var11;

			for (int var17 = -var7; var17 < 0; var17++) {
				var2 = var1[(var3 >> 16) + var16];
				if (var2 != 0) {
					int var14 = var0[var5];
					var0[var5++] = ((var2 & 0xff00ff) * var12 + (var14 & 0xff00ff) * var13 & 0xff00ff00)
							+ ((var2 & 0xff00) * var12 + (var14 & 0xff00) * var13 & 0xff0000) >> 8;
				} else {
					++var5;
				}

				var3 += var9;
			}

			var4 += var10;
			var3 = var18;
			var5 += var6;
		}

	}

	static final void staticMethod469(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.staticBool24) {
			Client.staticInt219 = 32;
		} else {
			Client.staticInt219 = 0;
		}

		Client.staticBool24 = false;
		int var7;
		if (MouseHandler.staticInt93 == 1 || !staticBool18 && MouseHandler.staticInt93 == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < 16 + var2) {
				var0.anInt312 -= 4;
				staticMethod73(var0);
			} else if (var5 >= var1 && var5 < 16 + var1 && var6 >= var3 + var2 - 16 && var6 < var2 + var3) {
				var0.anInt312 += 4;
				staticMethod73(var0);
			} else if (var5 >= var1 - Client.staticInt219 && var5 < 16 + var1 + Client.staticInt219 && var6 >= 16 + var2
					&& var6 < var2 + var3 - 16) {
				var7 = (var3 - 32) * var3 / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.anInt312 = (var4 - var3) * var8 / var9;
				staticMethod73(var0);
				Client.staticBool24 = true;
			}
		}

		if (Client.staticInt284 != 0) {
			var7 = var0.anInt307;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < 16 + var1 && var6 <= var2 + var3) {
				var0.anInt312 += Client.staticInt284 * 45;
				staticMethod73(var0);
			}
		}

	}

	static int staticMethod470(int var0, CacheableSub1 var1, boolean var2) {
		Widget var3 = var2 ? Class3.staticWidget1 : staticWidget2;
		if (var0 == 1600) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt335;
			return 1;
		} else if (var0 == 1601) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt312;
			return 1;
		} else if (var0 == 1602) {
			staticStringArray1[++staticInt148 - 1] = var3.aString20;
			return 1;
		} else if (var0 == 1603) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt344;
			return 1;
		} else if (var0 == 1604) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt361;
			return 1;
		} else if (var0 == 1605) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt334;
			return 1;
		} else if (var0 == 1606) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt325;
			return 1;
		} else if (var0 == 1607) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt324;
			return 1;
		} else if (var0 == 1608) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt332;
			return 1;
		} else if (var0 == 1609) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt317;
			return 1;
		} else if (var0 == 1610) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt318;
			return 1;
		} else if (var0 == 1611) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt360;
			return 1;
		} else if (var0 == 1612) {
			staticIntArray16[++staticInt27 - 1] = var3.anInt313;
			return 1;
		} else if (var0 == 1613) {
			staticIntArray16[++staticInt27 - 1] = var3.aClass54_1.method12();
			return 1;
		} else {
			return 2;
		}
	}

	static final void staticMethod471(int var0) {
		staticMethod250();

		for (NodeSub4 var4 = (NodeSub4) NodeSub4.staticClass39_4
				.method195(); var4 != null; var4 = (NodeSub4) NodeSub4.staticClass39_4.method193()) {
			if (var4.anObjectDef1 != null) {
				var4.method295();
			}
		}

		int var41 = staticMethod119(var0).anInt525;
		if (var41 != 0) {
			int var1 = staticIntArray64[var0];
			if (var41 == 1) {
				if (var1 == 1) {
					staticMethod453(0.9D);
					((Class11) Rasterizer2DSub1.staticInterface2_1).method33(0.9D);
				}

				if (var1 == 2) {
					staticMethod453(0.8D);
					((Class11) Rasterizer2DSub1.staticInterface2_1).method33(0.8D);
				}

				if (var1 == 3) {
					staticMethod453(0.7D);
					((Class11) Rasterizer2DSub1.staticInterface2_1).method33(0.7D);
				}

				if (var1 == 4) {
					staticMethod453(0.6D);
					((Class11) Rasterizer2DSub1.staticInterface2_1).method33(0.6D);
				}

				ItemDefinition.staticCache9.method171();
			}

			if (var41 == 3) {
				short var5 = 0;
				if (var1 == 0) {
					var5 = 255;
				}

				if (var1 == 1) {
					var5 = 192;
				}

				if (var1 == 2) {
					var5 = 128;
				}

				if (var1 == 3) {
					var5 = 64;
				}

				if (var1 == 4) {
					var5 = 0;
				}

				if (Client.staticInt299 != var5) {
					if (Client.staticInt299 == 0 && Client.staticInt249 != -1) {
						staticMethod30(Class34.staticJs5IndexImpl3, Client.staticInt249, 0, var5, false);
						Client.staticBool38 = false;
					} else if (var5 == 0) {
						staticNodeSub8Sub3_1.method440();
						staticInt118 = 1;
						staticJs5Index3 = null;
						Client.staticBool38 = false;
					} else {
						staticMethod264(var5);
					}

					Client.staticInt299 = var5;
				}
			}

			if (var41 == 4) {
				if (var1 == 0) {
					Client.staticInt300 = 1;
				}

				if (var1 == 1) {
					Client.staticInt300 = -202911840;
				}

				if (var1 == 2) {
					Client.staticInt300 = -135274560;
				}

				if (var1 == 3) {
					Client.staticInt300 = -67637280;
				}

				if (var1 == 4) {
					Client.staticInt300 = 0;
				}
			}

			if (var41 == 5) {
				Client.staticInt214 = var1;
			}

			if (var41 == 6) {
				Client.staticInt265 = var1;
			}

			if (var41 == 9) {
				Client.staticInt266 = var1;
			}

			if (var41 == 10) {
				if (var1 == 0) {
					Client.staticInt301 = 127;
				}

				if (var1 == 1) {
					Client.staticInt301 = 96;
				}

				if (var1 == 2) {
					Client.staticInt301 = 64;
				}

				if (var1 == 3) {
					Client.staticInt301 = 32;
				}

				if (var1 == 4) {
					Client.staticInt301 = 0;
				}
			}

			if (var41 == 17) {
				Client.staticInt269 = -(var1 & 0xffff);
			}

			Class4[] var51;
			if (var41 == 18) {
				var51 = new Class4[] { Class4.staticClass4_4, Class4.staticClass4_3, Class4.staticClass4_1,
						Class4.staticClass4_2 };
				Client.staticClass4_5 = (Class4) staticMethod233(var51, var1);
				if (Client.staticClass4_5 == null) {
					Client.staticClass4_5 = Class4.staticClass4_4;
				}
			}

			if (var41 == 19) {
				if (var1 == -1) {
					Client.staticInt229 = -1;
				} else {
					Client.staticInt229 = var1 & 0x7ff;
				}
			}

			if (var41 == 22) {
				var51 = new Class4[] { Class4.staticClass4_4, Class4.staticClass4_3, Class4.staticClass4_1,
						Class4.staticClass4_2 };
				Client.staticClass4_6 = (Class4) staticMethod233(var51, var1);
				if (Client.staticClass4_6 == null) {
					Client.staticClass4_6 = Class4.staticClass4_4;
				}
			}
		}

	}

	static final void staticMethod472(Actor var0) {
		var0.anInt590 = var0.anInt594;
		if (var0.anInt632 == 0) {
			var0.anInt633 = 0;
		} else {
			if (var0.anInt612 != -1 && var0.anInt615 == 0) {
				AnimDef var10 = staticMethod210(var0.anInt612);
				if (var0.anInt599 > 0 && var10.anInt566 == 0) {
					++var0.anInt633;
					return;
				}

				if (var0.anInt599 <= 0 && var10.anInt567 == 0) {
					++var0.anInt633;
					return;
				}
			}

			int var101 = var0.anInt628;
			int var7 = var0.anInt591;
			int var3 = var0.anInt626 * 64 + var0.anIntArray127[var0.anInt632 - 1] * 128;
			int var1 = var0.anInt626 * 64 + var0.anIntArray122[var0.anInt632 - 1] * 128;
			if (var101 < var3) {
				if (var7 < var1) {
					var0.anInt630 = 1280;
				} else if (var7 > var1) {
					var0.anInt630 = 1792;
				} else {
					var0.anInt630 = 1536;
				}
			} else if (var101 > var3) {
				if (var7 < var1) {
					var0.anInt630 = 768;
				} else if (var7 > var1) {
					var0.anInt630 = 256;
				} else {
					var0.anInt630 = 512;
				}
			} else if (var7 < var1) {
				var0.anInt630 = 1024;
			} else if (var7 > var1) {
				var0.anInt630 = 0;
			}

			byte var5 = var0.aByteArray24[var0.anInt632 - 1];
			if (var3 - var101 <= 256 && var3 - var101 >= -256 && var1 - var7 <= 256 && var1 - var7 >= -256) {
				int var8 = var0.anInt630 - var0.anInt592 & 0x7ff;
				if (var8 > 1024) {
					var8 -= 2048;
				}

				int var9 = var0.anInt597;
				if (var8 >= -256 && var8 <= 256) {
					var9 = var0.anInt621;
				} else if (var8 >= 256 && var8 < 768) {
					var9 = var0.anInt622;
				} else if (var8 >= -768 && var8 <= -256) {
					var9 = var0.anInt598;
				}

				if (var9 == -1) {
					var9 = var0.anInt621;
				}

				var0.anInt590 = var9;
				int var2 = 4;
				boolean var6 = true;
				if (var0 instanceof Npc) {
					var6 = ((Npc) var0).aNpcDef1.aBool70;
				}

				if (var6) {
					if (var0.anInt630 != var0.anInt592 && var0.anInt600 == -1 && var0.anInt631 != 0) {
						var2 = 2;
					}

					if (var0.anInt632 > 2) {
						var2 = 6;
					}

					if (var0.anInt632 > 3) {
						var2 = 8;
					}

					if (var0.anInt633 > 0 && var0.anInt632 > 1) {
						var2 = 8;
						--var0.anInt633;
					}
				} else {
					if (var0.anInt632 > 1) {
						var2 = 6;
					}

					if (var0.anInt632 > 2) {
						var2 = 8;
					}

					if (var0.anInt633 > 0 && var0.anInt632 > 1) {
						var2 = 8;
						--var0.anInt633;
					}
				}

				if (var5 == 2) {
					var2 <<= 1;
				}

				if (var2 >= 8 && var0.anInt621 == var0.anInt590 && var0.anInt607 != -1) {
					var0.anInt590 = var0.anInt607;
				}

				if (var101 != var3 || var7 != var1) {
					if (var101 < var3) {
						var0.anInt628 += var2;
						if (var0.anInt628 > var3) {
							var0.anInt628 = var3;
						}
					} else if (var101 > var3) {
						var0.anInt628 -= var2;
						if (var0.anInt628 < var3) {
							var0.anInt628 = var3;
						}
					}

					if (var7 < var1) {
						var0.anInt591 += var2;
						if (var0.anInt591 > var1) {
							var0.anInt591 = var1;
						}
					} else if (var7 > var1) {
						var0.anInt591 -= var2;
						if (var0.anInt591 < var1) {
							var0.anInt591 = var1;
						}
					}
				}

				if (var0.anInt628 == var3 && var1 == var0.anInt591) {
					--var0.anInt632;
					if (var0.anInt599 > 0) {
						--var0.anInt599;
					}
				}
			} else {
				var0.anInt628 = var3;
				var0.anInt591 = var1;
				--var0.anInt632;
				if (var0.anInt599 > 0) {
					--var0.anInt599;
				}
			}
		}

	}

	static String staticMethod473(int var0) {
		return var0 < 0 ? ""
				: Client.staticStringArray8[var0].length() > 0
						? Client.staticStringArray9[var0] + " " + Client.staticStringArray8[var0]
						: Client.staticStringArray9[var0];
	}

	static void staticMethod474(NodeSub16 var0, int var1) {
		Object[] var2 = var0.anObjectArray2;
		int var3 = ((Integer) var2[0]).intValue();
		CacheableSub1 var4 = staticMethod148(var3);
		if (var4 != null) {
			staticInt27 = 0;
			staticInt148 = 0;
			int var5 = -1;
			int[] var6 = var4.anIntArray84;
			int[] var7 = var4.anIntArray85;
			byte var8 = -1;
			staticInt28 = 0;

			int var11;
			try {
				staticIntArray14 = new int[var4.anInt398];
				int var19 = 0;
				staticStringArray5 = new String[var4.anInt399];
				int var22 = 0;

				int var12;
				String var29;
				for (var11 = 1; var11 < var2.length; var11++) {
					if (var2[var11] instanceof Integer) {
						var12 = ((Integer) var2[var11]).intValue();
						if (var12 == -2147483647) {
							var12 = var0.anInt284;
						}

						if (var12 == -2147483646) {
							var12 = var0.anInt285;
						}

						if (var12 == -2147483645) {
							var12 = var0.aWidget1 != null ? var0.aWidget1.anInt294 : -1;
						}

						if (var12 == -2147483644) {
							var12 = var0.anInt286;
						}

						if (var12 == -2147483643) {
							var12 = var0.aWidget1 != null ? var0.aWidget1.anInt319 : -1;
						}

						if (var12 == -2147483642) {
							var12 = var0.aWidget2 != null ? var0.aWidget2.anInt294 : -1;
						}

						if (var12 == -2147483641) {
							var12 = var0.aWidget2 != null ? var0.aWidget2.anInt319 : -1;
						}

						if (var12 == -2147483640) {
							var12 = var0.anInt288;
						}

						if (var12 == -2147483639) {
							var12 = var0.anInt287;
						}

						staticIntArray14[var19++] = var12;
					} else if (var2[var11] instanceof String) {
						var29 = (String) var2[var11];
						if (var29.equals("event_opbase")) {
							var29 = var0.aString17;
						}

						staticStringArray5[var22++] = var29;
					}
				}

				var11 = 0;
				staticInt29 = var0.anInt289 * -860232315;

				while (true) {
					while (true) {
						while (true) {
							while (true) {
								while (true) {
									while (true) {
										while (true) {
											while (true) {
												while (true) {
													while (true) {
														while (true) {
															while (true) {
																while (true) {
																	while (true) {
																		while (true) {
																			while (true) {
																				while (true) {
																					while (true) {
																						while (true) {
																							while (true) {
																								while (true) {
																									while (true) {
																										while (true) {
																											while (true) {
																												while (true) {
																													label219: while (true) {
																														++var11;
																														if (var11 > var1) {
																															throw new RuntimeException();
																														}

																														++var5;
																														int var20 = var6[var5];
																														int var13;
																														if (var20 < 100) {
																															if (var20 != 0) {
																																if (var20 != 1) {
																																	if (var20 != 2) {
																																		if (var20 != 3) {
																																			if (var20 != 6) {
																																				if (var20 != 7) {
																																					if (var20 != 8) {
																																						if (var20 != 9) {
																																							if (var20 != 10) {
																																								if (var20 != 21) {
																																									if (var20 != 25) {
																																										int var24;
																																										if (var20 != 27) {
																																											if (var20 != 31) {
																																												if (var20 != 32) {
																																													if (var20 != 33) {
																																														if (var20 != 34) {
																																															if (var20 != 35) {
																																																if (var20 != 36) {
																																																	if (var20 != 37) {
																																																		if (var20 != 38) {
																																																			if (var20 != 39) {
																																																				if (var20 != 40) {
																																																					if (var20 != 42) {
																																																						if (var20 != 43) {
																																																							if (var20 == 44) {
																																																								var12 = var7[var5] >> 16;
																																																								var13 = var7[var5]
																																																										& 0xffff;
																																																								int var27 = staticIntArray16[--staticInt27];
																																																								if (var27 >= 0
																																																										&& var27 <= 5000) {
																																																									staticIntArray15[var12] = var27;
																																																									byte var291 = -1;
																																																									if (var13 == 105) {
																																																										var291 = 0;
																																																									}

																																																									var24 = 0;

																																																									while (true) {
																																																										if (var24 >= var27) {
																																																											continue label219;
																																																										}

																																																										staticIntArrayArray1[var12][var24] = var291;
																																																										++var24;
																																																									}
																																																								}

																																																								throw new RuntimeException();
																																																							} else if (var20 == 45) {
																																																								var12 = var7[var5];
																																																								var13 = staticIntArray16[--staticInt27];
																																																								if (var13 < 0
																																																										|| var13 >= staticIntArray15[var12]) {
																																																									throw new RuntimeException();
																																																								}

																																																								staticIntArray16[++staticInt27
																																																										- 1] = staticIntArrayArray1[var12][var13];
																																																							} else if (var20 == 46) {
																																																								var12 = var7[var5];
																																																								staticInt27 -= 2;
																																																								var13 = staticIntArray16[staticInt27];
																																																								if (var13 < 0
																																																										|| var13 >= staticIntArray15[var12]) {
																																																									throw new RuntimeException();
																																																								}

																																																								staticIntArrayArray1[var12][var13] = staticIntArray16[staticInt27
																																																										+ 1];
																																																							} else if (var20 == 47) {
																																																								var29 = Class57.staticClass5_1
																																																										.method16(
																																																												var7[var5]);
																																																								if (var29 == null) {
																																																									var29 = "null";
																																																								}

																																																								staticStringArray1[++staticInt148
																																																										- 1] = var29;
																																																							} else {
																																																								if (var20 != 48) {
																																																									throw new IllegalStateException();
																																																								}

																																																								Class57.staticClass5_1
																																																										.method15(
																																																												var7[var5],
																																																												staticStringArray1[--staticInt148]);
																																																							}
																																																						} else {
																																																							Class57.staticClass5_1
																																																									.method13(
																																																											var7[var5],
																																																											staticIntArray16[--staticInt27]);
																																																						}
																																																					} else {
																																																						staticIntArray16[++staticInt27
																																																								- 1] = Class57.staticClass5_1
																																																										.method14(
																																																												var7[var5]);
																																																					}
																																																				} else {
																																																					var12 = var7[var5];
																																																					CacheableSub1 var26 = staticMethod148(
																																																							var12);
																																																					int[] var28 = new int[var26.anInt398];
																																																					String[] var301 = new String[var26.anInt399];

																																																					for (var24 = 0; var24 < var26.anInt401; var24++) {
																																																						var28[var24] = staticIntArray16[staticInt27
																																																								- var26.anInt401
																																																								+ var24];
																																																					}

																																																					for (var24 = 0; var24 < var26.anInt400; var24++) {
																																																						var301[var24] = staticStringArray1[var24
																																																								+ staticInt148
																																																								- var26.anInt400];
																																																					}

																																																					staticInt27 -= var26.anInt401;
																																																					staticInt148 -= var26.anInt400;
																																																					Class58 var31 = new Class58();
																																																					var31.aCacheableSub1_1 = var4;
																																																					var31.anInt208 = var5;
																																																					var31.anIntArray56 = staticIntArray14;
																																																					var31.aStringArray2 = staticStringArray5;
																																																					staticClass58Array1[++staticInt28
																																																							- 1] = var31;
																																																					var4 = var26;
																																																					var6 = var26.anIntArray84;
																																																					var7 = var26.anIntArray85;
																																																					var5 = -1;
																																																					staticIntArray14 = var28;
																																																					staticStringArray5 = var301;
																																																				}
																																																			} else {
																																																				--staticInt148;
																																																			}
																																																		} else {
																																																			--staticInt27;
																																																		}
																																																	} else {
																																																		var12 = var7[var5];
																																																		staticInt148 -= var12;
																																																		String var25 = staticMethod49(
																																																				staticStringArray1,
																																																				staticInt148,
																																																				var12);
																																																		staticStringArray1[++staticInt148
																																																				- 1] = var25;
																																																	}
																																																} else {
																																																	staticStringArray5[var7[var5]] = staticStringArray1[--staticInt148];
																																																}
																																															} else {
																																																staticStringArray1[++staticInt148
																																																		- 1] = staticStringArray5[var7[var5]];
																																															}
																																														} else {
																																															staticIntArray14[var7[var5]] = staticIntArray16[--staticInt27];
																																														}
																																													} else {
																																														staticIntArray16[++staticInt27
																																																- 1] = staticIntArray14[var7[var5]];
																																													}
																																												} else {
																																													staticInt27 -= 2;
																																													if (staticIntArray16[staticInt27] >= staticIntArray16[staticInt27
																																															+ 1]) {
																																														var5 += var7[var5];
																																													}
																																												}
																																											} else {
																																												staticInt27 -= 2;
																																												if (staticIntArray16[staticInt27] <= staticIntArray16[1
																																														+ staticInt27]) {
																																													var5 += var7[var5];
																																												}
																																											}
																																										} else {
																																											var12 = var7[var5];
																																											var13 = staticIntArray16[--staticInt27];
																																											Varbit var14 = staticMethod181(
																																													var12);
																																											int var15 = var14.anInt430;
																																											var24 = var14.anInt431;
																																											int var17 = var14.anInt432;
																																											int var18 = staticIntArray65[var17
																																													- var24];
																																											if (var13 < 0
																																													|| var13 > var18) {
																																												var13 = 0;
																																											}

																																											var18 <<= var24;
																																											staticIntArray64[var15] = staticIntArray64[var15]
																																													& ~var18
																																													| var13 << var24
																																															& var18;
																																										}
																																									} else {
																																										var12 = var7[var5];
																																										staticIntArray16[++staticInt27
																																												- 1] = staticMethod82(
																																														var12);
																																									}
																																								} else {
																																									if (staticInt28 == 0) {
																																										return;
																																									}

																																									Class58 var23 = staticClass58Array1[--staticInt28];
																																									var4 = var23.aCacheableSub1_1;
																																									var6 = var4.anIntArray84;
																																									var7 = var4.anIntArray85;
																																									var5 = var23.anInt208;
																																									staticIntArray14 = var23.anIntArray56;
																																									staticStringArray5 = var23.aStringArray2;
																																								}
																																							} else {
																																								staticInt27 -= 2;
																																								if (staticIntArray16[staticInt27] > staticIntArray16[staticInt27
																																										+ 1]) {
																																									var5 += var7[var5];
																																								}
																																							}
																																						} else {
																																							staticInt27 -= 2;
																																							if (staticIntArray16[staticInt27] < staticIntArray16[staticInt27
																																									+ 1]) {
																																								var5 += var7[var5];
																																							}
																																						}
																																					} else {
																																						staticInt27 -= 2;
																																						if (staticIntArray16[staticInt27] == staticIntArray16[staticInt27
																																								+ 1]) {
																																							var5 += var7[var5];
																																						}
																																					}
																																				} else {
																																					staticInt27 -= 2;
																																					if (staticIntArray16[staticInt27
																																							+ 1] != staticIntArray16[staticInt27]) {
																																						var5 += var7[var5];
																																					}
																																				}
																																			} else {
																																				var5 += var7[var5];
																																			}
																																		} else {
																																			staticStringArray1[++staticInt148
																																					- 1] = var4.aStringArray5[var5];
																																		}
																																	} else {
																																		var12 = var7[var5];
																																		staticIntArray64[var12] = staticIntArray16[--staticInt27];
																																		staticMethod471(
																																				var12);
																																	}
																																} else {
																																	var12 = var7[var5];
																																	staticIntArray16[++staticInt27
																																			- 1] = staticIntArray64[var12];
																																}
																															} else {
																																staticIntArray16[++staticInt27
																																		- 1] = var7[var5];
																															}
																														} else {
																															boolean var30;
																															if (var4.anIntArray85[var5] == 1) {
																																var30 = true;
																															} else {
																																var30 = false;
																															}

																															var13 = staticMethod423(
																																	var20,
																																	var4,
																																	var30);
																															switch (var13) {
																															case 0:
																																return;
																															case 1:
																															default:
																																break;
																															case 2:
																																throw new IllegalStateException();
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} catch (Exception var21) {
				StringBuilder var10 = new StringBuilder(30);
				var10.append("").append(var4.id).append(" ");

				for (var11 = staticInt28 - 1; var11 >= 0; --var11) {
					var10.append("").append(staticClass58Array1[var11].aCacheableSub1_1.id).append(" ");
				}

				var10.append("").append(var8);
				staticMethod285(var10.toString(), var21);
			}
		}

	}

	static final boolean staticMethod475(int var0) {
		if (var0 < 0) {
			return false;
		} else {
			int var1 = Client.staticIntArray98[var0];
			if (var1 >= 2000) {
				var1 -= 2000;
			}

			return var1 == 1007;
		}
	}

	static void staticMethod476(String var0) {
		BuildType.staticString27 = var0;

		try {
			String var1 = Client.staticGame1.getParameter(Class52.staticClass52_11.aString11);
			String var2 = Client.staticGame1.getParameter(Class52.staticClass52_12.aString11);
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + staticMethod176(staticMethod297() + 94608000000L) + "; Max-Age="
						+ 94608000L;
			}

			staticMethod102(Client.staticGame1, "document.cookie=\"" + var3 + "\"");
		} catch (Throwable var4) {
			;
		}

	}

	static int staticInt87;
	public static int gameWidth;	
	static BZip2DState staticBZip2DState1 = new BZip2DState();
	static Rasterizer2DSub3 staticRasterizer2DSub3_1;
	static Sprite staticSprite1;
	static Rasterizer2DSub3 staticRasterizer2DSub3_2;
	static Rasterizer2DSub3 staticRasterizer2DSub3_3;
	static int[] staticIntArray5;
	static int[] staticIntArray3;
	static boolean staticBool2;
	static Sprite staticSprite2;
	static int staticInt6 = 0;
	static Rasterizer2DSub3 staticRasterizer2DSub3_4;
	static int staticInt8;
	static int[] staticIntArray4;
	static int staticInt9;
	static int staticInt5;
	static int staticInt10;
	static int staticInt16;
	static int staticInt11;
	static int staticInt12;
	static int staticInt14;
	static String staticString3;
	static int staticInt13;
	static String staticString5;

	
	
	static String staticString7;
	static String staticString2;
	static Class28 blockType;	
	static int staticInt15;
	static boolean staticBool3;
	static String staticString8;
	static String staticString9;
	static boolean staticBool1;
	static int staticInt7;
	public static String staticString24;
	static File staticFile1;
	public static BufferedFile[] staticBufferedFileArray1;
	static int staticInt101;
	static Class56 staticClass56_1;
	public static BufferedFile randomDat = null;
	public static BufferedFile staticBufferedFile3 = null;
	public static BufferedFile staticBufferedFile1 = null;
	static Applet staticApplet2 = null;
	static String staticString25 = null;
	static Class55 staticClass55_1;
	public static File staticFile2;
	static int staticInt102;
	static byte staticByte1;
	public static boolean staticBool10 = false;
	static Hashtable staticHashtable1 = new Hashtable(16);
	static int staticInt110;
	static int[] staticIntArray49 = new int[4096];
	static int[] staticIntArray50 = new int[4096];
	static Rasterizer2DSub3[] staticRasterizer2DSub3Array4;
	static int[][] staticIntArrayArray6 = new int[128][128];
	static int[][] staticIntArrayArray5 = new int[128][128];
	static int[] staticIntArray51;
	static byte[][][] staticByteArrayArrayArray1;
	static byte[][][] staticByteArrayArrayArray2;
	static int[][] staticIntArrayArray7;
	static byte[][][] staticByteArrayArrayArray3;
	static int[] staticIntArray55;
	static int staticInt114;
	static byte[][][] staticByteArrayArrayArray5;
	static Sprite[] staticSpriteArray2;
	static int[][][] staticIntArrayArrayArray1 = new int[4][105][105];
	static byte[][][] staticByteArrayArrayArray4 = new byte[4][104][104];
	static int staticInt112 = 99;
	static final int[] staticIntArray58 = new int[] { 1, 2, 4, 8 };
	static final int[] staticIntArray53 = new int[] { 16, 32, 64, 128 };
	static final int[] staticIntArray54 = new int[] { 1, 0, -1, 0 };
	static final int[] staticIntArray57 = new int[] { 0, -1, 0, 1 };
	static final int[] staticIntArray56 = new int[] { 1, -1, -1, 1 };
	static final int[] staticIntArray52 = new int[] { -1, -1, 1, 1 };
	static int staticInt111 = (int) (Math.random() * 17.0D) - 8;
	static int staticInt113 = (int) (Math.random() * 33.0D) - 16;
	static int staticInt117 = 0;
	static int staticInt116 = 0;
	static int staticInt115 = 0;
	static byte[][] staticByteArrayArray3 = new byte[1000][];
	static byte[][] staticByteArrayArray5 = new byte[250][];
	static byte[][] staticByteArrayArray4 = new byte[50][];
	public static Js5Index staticJs5Index3;
	public static Js5Index staticJs5Index4;
	public static Js5Index staticJs5Index5;
	public static NodeSub8Sub3 staticNodeSub8Sub3_1;
	public static short[][] staticShortArrayArray1;
	public static int staticInt119;
	public static boolean staticBool16;
	public static Js5Index staticJs5Index6;
	public static int staticInt118 = 0;
	public static int staticInt120;
	static Sprite[] staticSpriteArray3;
	static long staticLong5;
	static long staticLong6;
	static int staticInt17;
	public static boolean staticBool4;
	static final Map staticMap1 = new HashMap();
	static final Class35 staticClass35_1 = new Class35(1024);
	static final Class45 staticClass45_1 = new Class45();
	static int staticInt18 = 0;
	protected static Image staticImage1;
	public static final short[] staticShortArray2 = new short[] { (short) 6798, (short) 8741, (short) 25238,
			(short) 4626, (short) 4550 };
	public static final short[][] staticShortArrayArray2 = new short[][] {
			{ (short) 6798, (short) 107, (short) 10283, (short) 16, (short) 4797, (short) 7744, (short) 5799,
					(short) 4634, (short) -31839, (short) 22433, (short) 2983, (short) -11343, (short) 8, (short) 5281,
					(short) 10438, (short) 3650, (short) -27322, (short) -21845, (short) 200, (short) 571, (short) 908,
					(short) 21830, (short) 28946, (short) -15701, (short) -14010 },
			{ (short) 8741, (short) 12, (short) -1506, (short) -22374, (short) 7735, (short) 8404, (short) 1701,
					(short) -27106, (short) 24094, (short) 10153, (short) -8915, (short) 4783, (short) 1341,
					(short) 16578, (short) -30533, (short) 25239, (short) 8, (short) 5281, (short) 10438, (short) 3650,
					(short) -27322, (short) -21845, (short) 200, (short) 571, (short) 908, (short) 21830, (short) 28946,
					(short) -15701, (short) -14010 },
			{ (short) 25238, (short) 8742, (short) 12, (short) -1506, (short) -22374, (short) 7735, (short) 8404,
					(short) 1701, (short) -27106, (short) 24094, (short) 10153, (short) -8915, (short) 4783,
					(short) 1341, (short) 16578, (short) -30533, (short) 8, (short) 5281, (short) 10438, (short) 3650,
					(short) -27322, (short) -21845, (short) 200, (short) 571, (short) 908, (short) 21830, (short) 28946,
					(short) -15701, (short) -14010 },
			{ (short) 4626, (short) 11146, (short) 6439, (short) 12, (short) 4758, (short) 10270 },
			{ (short) 4550, (short) 4537, (short) 5681, (short) 5673, (short) 5790, (short) 6806, (short) 8076,
					(short) 4574, (short) 17050, (short) 0, (short) 127 } };
	public static final short[] staticShortArray3 = new short[] { (short) -10304, (short) 9104, (short) -1, (short) -1,
			(short) -1 };
	public static final short[][] staticShortArrayArray3 = new short[][] {
			{ (short) 6554, (short) 115, (short) 10304, (short) 28, (short) 5702, (short) 7756, (short) 5681,
					(short) 4510, (short) -31835, (short) 22437, (short) 2859, (short) -11339, (short) 16, (short) 5157,
					(short) 10446, (short) 3658, (short) -27314, (short) -21965, (short) 472, (short) 580, (short) 784,
					(short) 21966, (short) 28950, (short) -15697, (short) -14002 },
			{ (short) 9104, (short) 10275, (short) 7595, (short) 3610, (short) 7975, (short) 8526, (short) 918,
					(short) -26734, (short) 24466, (short) 10145, (short) -6882, (short) 5027, (short) 1457,
					(short) 16565, (short) -30545, (short) 25486, (short) 24, (short) 5392, (short) 10429, (short) 3673,
					(short) -27335, (short) -21957, (short) 192, (short) 687, (short) 412, (short) 21821, (short) 28835,
					(short) -15460, (short) -14019 },
			new short[0], new short[0], new short[0] };
	static byte[][][] staticByteArrayArrayArray6;
	static Sprite[] staticSpriteArray4;
	static int staticInt122;
	protected static int staticInt123;
	public static final boolean[] staticBoolArray3 = new boolean[] { true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };
	public static int[] staticIntArray60 = new int[99];
	static int[] staticIntArray61;
	public static char staticChar1;
	protected static AbstractClass3 staticAbstractClass3_1;
	static int[] staticIntArray62;
	static Js5IndexImpl staticJs5IndexImpl1;
	static String staticString12 = "true";
	static String staticString11 = ",";
	static String staticString15 = "|";
	static String staticString10 = " (";
	static String staticString13 = ")";
	static String staticString14 = "->";
	static String staticString17 = "<br>";
	static String staticString16 = "</col>";
	static final String[][] staticStringArrayArray1 = new String[][] {
			{ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" },
			{ "Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };
	static final String[] staticStringArray3 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
	static Calendar staticCalendar2;
	static Class53 staticClass53_1;
	public static int[] staticIntArray65 = new int[32];
	public static int[] staticIntArray63;
	public static int[] staticIntArray64;
	static Sprite[] staticSpriteArray5;
	static int staticInt125;
	static int staticInt126;
	static int[] staticIntArray67;
	static Class6 staticClass6_1;
	public static int staticInt127;
	static Connection staticConnection1;
	public static Js5Index staticJs5Index7;
	public static String[] staticStringArray4;
	static char[] staticCharArray3 = new char[64];
	static char[] staticCharArray2;
	static int[] staticIntArray68;
	public static long staticLong8;
	public static Connection staticConnection2;
	public static int staticInt129 = 0;
	public static HashTable staticHashTable1 = new HashTable(4096);
	public static int staticInt130 = 0;
	public static HashTable staticHashTable2 = new HashTable(32);
	public static int staticInt136 = 0;
	public static Queue staticQueue1 = new Queue();
	static HashTable staticHashTable4 = new HashTable(4096);
	public static int staticInt132 = 0;
	public static HashTable staticHashTable3 = new HashTable(4096);
	public static int staticInt133 = 0;
	public static ByteBuf staticStream3 = new ByteBuf(8);
	public static int staticInt134 = 0;
	public static CRC32 staticCRC32_1 = new CRC32();
	public static Js5IndexImpl[] staticJs5IndexImplArray1 = new Js5IndexImpl[256];
	public static byte staticByte2 = 0;
	public static int staticInt131 = 0;
	public static int staticInt135 = 0;
	static boolean staticBool18;
	static int staticInt137;
	static final char[] staticCharArray4 = new char[] { ' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4',
			'\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb',
			'\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf',
			'\u00f2', '\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5',
			'\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7', '\u00c7',
			'\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df' };
	static final char[] staticCharArray5 = new char[] { '[', ']', '#' };
	static int staticInt20;
	static int[] staticIntArray6;
	static final BigInteger staticBigInteger1 = new BigInteger(
			"80782894952180643741752986186714059433953886149239752893425047584684715842049");
	static final BigInteger staticBigInteger2 = new BigInteger(
			"7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	static Rasterizer2DSub3[] staticRasterizer2DSub3Array5;
	static final char[] staticCharArray6 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
			'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6',
			'7', '8', '9' };
	static int staticInt139;
	static int[] staticIntArray69;
	static final char[] staticCharArray7 = new char[] { '\u20ac', '\u0000', '\u201a', '\u0192', '\u201e', '\u2026',
			'\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\u0000', '\u017d', '\u0000',
			'\u0000', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122',
			'\u0161', '\u203a', '\u0153', '\u0000', '\u017e', '\u0178' };
	static String[] staticStringArray5;
	public static Class36 staticClass36_1 = new Class36();
	public static final int[] staticIntArray70 = new int[] { 0, 0, 10, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0,
			0, 0, 6, 0, 7, -2, 6, 0, 0, 2, 4, 0, 2, 0, 0, 0, -2, 0, 0, 0, 0, 0, 6, 0, -2, 0, 0, 0, 2, 0, 2, 6, -2, 0, 0,
			0, 0, 8, 0, 0, 0, 5, -1, 0, 0, 0, 8, 0, 0, 8, 0, 0, 0, -2, 15, 0, 0, 7, -2, 0, -2, -2, 0, 0, 0, 0, 0, 20, 0,
			5, -2, 0, 0, 1, 0, 0, 0, 0, 14, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 28, 8, 0, 0, 3,
			6, 0, 0, 0, -1, 0, 6, 0, 0, 6, 4, 0, 0, -2, 0, 0, 0, 12, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, -1, -2,
			0, -2, 0, 0, 6, 0, 0, 0, 0, -2, -2, 5, 0, 2, 0, 0, 0, 0, 0, 4, 0, 4, -1, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 6, 0,
			0, 0, 5, 2, 0, 0, 0, 0, 0, 6, 4, 0, 4, 0, 0, 0, -1, 2, -2, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, -2, 0, 2, 0, 0, 0,
			0, 0, 0, 0, 0, 6, 0, 0, 0, 0, -2, -1, 0, 0, 0, 6, 0, 0, 0, 0, -2, 0, 0, 0, 3, 0, 0, 0, 0 };
	static int staticInt141;
	public static Class47 staticClass47_1;
	static byte[] staticByteArray1 = new byte[2048];
	static byte[] staticByteArray2 = new byte[2048];
	static ByteBuf[] cachedAppearances = new ByteBuf[2048];	
	static int staticInt24 = 0;
	static int[] staticIntArray7 = new int[2048];
	static int staticInt23 = 0;
	static int[] staticIntArray8 = new int[2048];
	static int[] staticIntArray9 = new int[2048];
	static int[] staticIntArray10 = new int[2048];
	static int[] staticIntArray11 = new int[2048];
	static int staticInt22 = 0;
	static int[] staticIntArray12 = new int[2048];
	static ByteBuf staticStream1 = new ByteBuf(new byte[5000]);
	static int[] staticIntArray71;
	static int staticInt142;
	static int[] staticIntArray72;
	static int staticInt143;
	static int[] staticIntArray73;
	public static File staticFile3;
	static Js5Index staticJs5Index8;
	static int staticInt148;
	static int staticInt149;
	static int staticInt150;
	static byte staticByte3;
	static GarbageCollectorMXBean staticGarbageCollectorMXBean1;
	static final BigInteger staticBigInteger3 = new BigInteger("10001", 16);
	static final BigInteger staticBigInteger4 = new BigInteger(
			"8e31d9b794fd40e15cc4550d5db4e2e1990dd5a4247573b111cc8f43aad6eed5960126c8885b4c2786ed6fedcfe675e521a626d833041921375f9ef40517a441c3a0845500be55e2543681e29b63276ed14ce4d6b1a5e76ca2f154cf8f7341253112d0e602f6143e2aabe042f2107459cb8f494a88b1ee4041f5038c54085a73",
			16);
	static int[] staticIntArray14;
	static int staticInt26;
	static int staticInt27;
	static Widget staticWidget2;
	static int[] staticIntArray15 = new int[5];
	static int[][] staticIntArrayArray1 = new int[5][5000];
	static int[] staticIntArray16 = new int[1000];
	static String[] staticStringArray1 = new String[1000];
	static int staticInt28 = 0;
	static Class58[] staticClass58Array1 = new Class58[50];
	static Calendar staticCalendar1 = Calendar.getInstance();
	static final String[] staticStringArray2 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug",
			"Sep", "Oct", "Nov", "Dec" };
	static int staticInt29 = 0;

	static {
		int var2 = 0;

		for (int var0 = 0; var0 < 99; var0++) {
			int var1 = var0 + 1;
			int var3 = (int) (var1 + 300.0D * Math.pow(2.0D, var1 / 7.0D));
			var2 += var3;
			staticIntArray60[var0] = var2 / 4;
		}
		Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
		staticCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

		int var1 = 2;

		for (int var0 = 0; var0 < 32; var0++) {
			staticIntArray65[var0] = var1 - 1;
			var1 += var1;
		}

		int var0;
		for (var0 = 0; var0 < 26; var0++) {
			staticCharArray3[var0] = (char) (65 + var0);
		}

		for (var0 = 26; var0 < 52; var0++) {
			staticCharArray3[var0] = (char) (var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; var0++) {
			staticCharArray3[var0] = (char) (48 + var0 - 52);
		}

		staticCharArray3[62] = 43;
		staticCharArray3[63] = 47;
		staticCharArray2 = new char[64];

		for (var0 = 0; var0 < 26; var0++) {
			staticCharArray2[var0] = (char) (var0 + 65);
		}

		for (var0 = 26; var0 < 52; var0++) {
			staticCharArray2[var0] = (char) (97 + var0 - 26);
		}

		for (var0 = 52; var0 < 62; var0++) {
			staticCharArray2[var0] = (char) (var0 + 48 - 52);
		}

		staticCharArray2[62] = 42;
		staticCharArray2[63] = 45;
		staticIntArray68 = new int[128];

		for (var0 = 0; var0 < staticIntArray68.length; var0++) {
			staticIntArray68[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; var0++) {
			staticIntArray68[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; var0++) {
			staticIntArray68[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; var0++) {
			staticIntArray68[var0] = 52 + var0 - 48;
		}

		int[] var3 = staticIntArray68;
		staticIntArray68[43] = 62;
		var3[42] = 62;
		int[] var4 = staticIntArray68;
		staticIntArray68[47] = 63;
		var4[45] = 63;

		staticIntArray63 = new int[2000];
		staticIntArray64 = new int[2000];

		staticInt8 = 202 + staticInt6;
		staticIntArray4 = new int[256];
		staticInt9 = 0;
		staticInt5 = 0;
		staticInt10 = 0;
		staticInt16 = 0;
		staticInt12 = 0;
		staticInt11 = 0;
		staticInt14 = 30;
		staticString3 = "";
		staticInt13 = 0;
		staticString5 = "";
		GPI.staticString4 = "";
		GPI.staticString1 = "";
		GPI.staticString6 = "";
		staticString2 = "";
		staticString7 = "";
		blockType = Class28.staticClass28_4;
		staticBool3 = true;
		staticInt15 = 0;
		staticString8 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ";
		staticString9 = "1234567890";
		staticBool1 = false;
		staticInt7 = -1;
	}

}
