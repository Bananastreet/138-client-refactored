import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;

public final class Client extends GameShell {

	static Js5IndexImpl staticJs5IndexImpl8;
	static Sprite[] staticSpriteArray8;
	static Js5IndexImpl staticJs5IndexImpl9;
	static Rasterizer2DSub3 staticRasterizer2DSub3_5;
	static boolean staticBool23 = false;
	static int staticInt166 = 0;
	static int staticInt165 = 0;
	static boolean staticBool42 = true;
	static int staticInt309 = 1;
	static int staticInt201 = 0;
	static int staticInt207 = 0;
	static boolean staticBool20 = false;
	static boolean lowMemory = false;	
	static int staticInt231 = 0;
	static boolean staticBool21 = true;
	static long staticLong10 = 1L;
	static int staticInt167 = -1;
	static int staticInt168 = -1;
	static int staticInt163 = -1;
	static boolean staticBool41 = true;
	static int staticInt170 = 0;
	static int staticInt255 = 0;
	static int staticInt172 = 0;
	static int staticInt193 = 0;
	static int staticInt174 = 0;
	static int staticInt175 = 0;
	static int staticInt176 = 0;
	static int staticInt177 = 0;
	static int staticInt178 = 0;
	static Class4 staticClass4_5;
	static Class4 staticClass4_6;
	static int staticInt179;
	static int staticInt271;
	static int staticInt181;
	static int staticInt182;
	static int loginStage;	
	static int staticInt262;
	static int staticInt302;
	static int transferTime;	
	static byte[] staticByteArray6;
	static Npc[] staticNpcArray1;
	static int staticInt186;
	static int[] staticIntArray121;
	static int staticInt188;
	static int[] staticIntArray92;
	static BitBuf outBuffer;	
	static BitBuf loginBuffer;	
	static BitBuf inBuffer;	
	static int staticInt190;
	static int staticInt191;
	static int staticInt192;
	static int staticInt273;
	static int staticInt270;
	static int staticInt194;
	static int staticInt195;
	static int staticInt196;
	static boolean staticBool43;
	static int staticInt215;
	static int staticInt198;
	static int staticInt199;
	static int staticInt253;
	static int staticInt200;
	static Class38[] staticClass38Array1;
	static boolean staticBool37;
	static int[][][] staticIntArrayArrayArray3;
	static final int[] staticIntArray84;
	static int staticInt203;
	static int staticInt204;
	static int staticInt233;
	static int staticInt205;
	static int staticInt206;
	static int staticInt248;
	static int staticInt208;
	static int staticInt209;
	static int staticInt210;
	static int staticInt211;
	static int staticInt212;
	static int staticInt213;
	static int staticInt171;
	static int staticInt216;
	static int staticInt234;
	static int staticInt235;
	static int staticInt218;
	static boolean staticBool24;
	static int staticInt219;
	static int staticInt220;
	static int staticInt221;
	static int staticInt251;
	static int staticInt222;
	static int staticInt223;
	static int staticInt224;
	static int staticInt225;
	static int staticInt226;
	static boolean staticBool26;
	static int staticInt277;
	static int staticInt187;
	static int staticInt169;
	static int[] staticIntArray101;
	static int[] staticIntArray102;
	static int[] staticIntArray87;
	static int[] staticIntArray85;
	static int[] staticIntArray89;
	static int[] staticIntArray90;
	static int[] staticIntArray99;
	static String[] staticStringArray10;
	static int[][] staticIntArrayArray9;
	static int staticInt292;
	static int staticInt189;
	static int staticInt180;
	static int staticInt238;
	static int staticInt237;
	static int staticInt297;
	static int staticInt239;
	static int staticInt241;
	static int staticInt228;
	static int staticInt161;
	static int staticInt242;
	static int staticInt243;
	static int staticInt230;
	static boolean staticBool31;
	static int staticInt244;
	static int staticInt245;
	static Player[] staticPlayerArray1;
	static int myPlayerIndex;	
	static int staticInt289;
	static int staticInt247;
	static int[] staticIntArray93;
	static final int[] staticIntArray94;
	static String[] staticStringArray7;
	static boolean[] staticBoolArray5;
	static int[] staticIntArray95;
	static int staticInt229;
	static Class39[][][] staticClass39ArrayArrayArray1;
	static Class39 staticClass39_7;
	static Class39 staticClass39_5;
	static Class39 staticClass39_6;
	static int[] staticIntArray91;
	static int[] staticIntArray96;
	static int[] staticIntArray108;
	static int staticInt214;
	static boolean staticBool30;
	static int staticInt252;
	static int[] staticIntArray109;
	static int[] staticIntArray97;
	static int[] staticIntArray98;
	static int[] staticIntArray112;
	static String[] staticStringArray9;
	static String[] staticStringArray8;
	static boolean staticBool22;
	static int staticInt217;
	static boolean staticBool39;
	static int staticInt256;
	static int staticInt259;
	static int staticInt185;
	static int staticInt257;
	static int staticInt258;
	static String staticString32;
	static boolean staticBool32;
	static int staticInt260;
	static int staticInt227;
	static String staticString31;
	static String staticString30;
	static int staticInt263;
	static HashTable staticHashTable5;
	static int staticInt265;
	static int staticInt266;
	static Widget staticWidget6;
	static int staticInt267;
	static int staticInt232;
	static int myRights;	
	static int staticInt269;
	static boolean staticBool33;
	static boolean staticBool40;
	static boolean staticBool34;
	static Widget staticWidget10;
	static Widget staticWidget7;
	static Widget staticWidget8;
	static int staticInt287;
	static int staticInt261;
	static Widget staticWidget9;
	static boolean staticBool35;
	static int staticInt183;
	static int staticInt313;
	static boolean staticBool29;
	static int staticInt272;
	static int staticInt290;
	static boolean staticBool25;
	static int staticInt274;
	static int[] staticIntArray104;
	static int staticInt275;
	static int[] staticIntArray86;
	static int staticInt276;
	static int[] staticIntArray105;
	static int staticInt278;
	static int staticInt279;
	static int staticInt280;
	static int staticInt281;
	static int staticInt295;
	static int staticInt282;
	static int staticInt283;
	static int staticInt284;
	static Class39 staticClass39_8;
	static Class39 staticClass39_9;
	static Class39 staticClass39_10;
	static HashTable staticHashTable6;
	static int staticInt162;
	static int staticInt285;
	static boolean[] staticBoolArray8;
	static boolean[] staticBoolArray6;
	static boolean[] staticBoolArray9;
	static int[] staticIntArray82;
	static int[] staticIntArray88;
	static int[] staticIntArray107;
	static int[] staticIntArray106;
	static int staticInt286;
	static long staticLong11;
	static boolean resizable;	
	static int staticInt288;
	static int staticInt173;
	static int[] staticIntArray100;
	static int staticInt160;
	static int staticInt291;
	static String staticString33;
	static long[] staticLongArray3;
	static int staticInt293;
	static int staticInt264;
	static int[] staticIntArray110;
	static int[] staticIntArray111;
	static long staticLong13;
	static String staticString34;
	static String staticString29;
	static int staticInt294;
	static int staticInt311;
	static int[] staticIntArray113;
	static int[] staticIntArray103;
	static Sprite[] staticSpriteArray9;
	static int staticInt296;
	static int staticInt240;
	static int staticInt298;
	static int staticInt299;
	static int staticInt249;
	static boolean staticBool38;
	static int staticInt300;
	static int staticInt301;
	static int staticInt236;
	static int[] staticIntArray114;
	static int[] staticIntArray115;
	static int[] staticIntArray116;
	static int[] staticIntArray117;
	static SoundEffect[] staticClass9Array1;
	static boolean staticBool28;
	static boolean[] staticBoolArray7;
	static int[] staticIntArray118;
	static int[] staticIntArray119;
	static int[] staticIntArray83;
	static int[] staticIntArray120;
	static short staticShort3;
	static short staticShort4;
	static short staticShort5;
	static short staticShort2;
	static short staticShort1;
	static short staticShort6;
	static short staticShort7;
	static short staticShort8;
	static int staticInt304;
	static int staticInt254;
	static int staticInt305;
	static int staticInt306;
	static int staticInt307;
	static int staticInt308;
	static int staticInt202;
	static Friend[] staticFriendArray1;
	static Class41 staticClass41_1;
	static int staticInt310;
	static DataClass10[] staticClass7Array1;
	static Class49 staticClass49_1;
	static int staticInt197;
	static int staticInt312;
	static Class61[] staticClass61Array1;
	static long staticLong12;
	static long staticLong14;
	static final AbstractClass2Sub1 staticAbstractClass2Sub1_1;
	static int[] staticIntArray122;
	static int[] staticIntArray123;
	static int staticInt250;
	static MouseCapturer staticMouseCapturer1;
	static int staticInt164;
	static Client staticGame1;

	static {
		staticClass4_5 = Class4.staticClass4_2;
		staticClass4_6 = Class4.staticClass4_2;
		staticInt179 = 0;
		staticInt271 = 0;
		staticInt181 = 0;
		staticInt182 = 0;
		loginStage = 0;
		staticInt262 = 0;
		staticInt302 = 0;
		transferTime = 0;
		staticByteArray6 = null;
		staticNpcArray1 = new Npc['\u8000'];
		staticInt186 = 0;
		staticIntArray121 = new int['\u8000'];
		staticInt188 = 0;
		staticIntArray92 = new int[250];
		outBuffer = new BitBuf(5000);
		loginBuffer = new BitBuf(5000);
		inBuffer = new BitBuf(15000);
		staticInt190 = 0;
		staticInt191 = 0;
		staticInt192 = 0;
		staticInt273 = 0;
		staticInt270 = 0;
		staticInt194 = 0;
		staticInt195 = 0;
		staticInt196 = 0;
		staticBool43 = false;
		staticInt215 = 0;
		staticInt198 = 1;
		staticInt199 = 0;
		staticInt253 = 1;
		staticInt200 = 0;
		staticClass38Array1 = new Class38[4];
		staticBool37 = false;
		staticIntArrayArrayArray3 = new int[4][13][13];
		staticIntArray84 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
		staticInt203 = 0;
		staticInt204 = -1487037518;
		staticInt233 = 0;
		staticInt205 = -1803321230;
		staticInt206 = 0;
		staticInt248 = 1;
		staticInt208 = 0;
		staticInt209 = 0;
		staticInt210 = 790159434;
		staticInt211 = 0;
		staticInt212 = 1;
		staticInt213 = 0;
		staticInt171 = 0;
		staticInt216 = 2301979;
		staticInt234 = 5063219;
		staticInt235 = 3353893;
		staticInt218 = 7759444;
		staticBool24 = false;
		staticInt219 = 0;
		staticInt220 = 128;
		staticInt221 = 0;
		staticInt251 = 0;
		staticInt222 = 0;
		staticInt223 = 0;
		staticInt224 = 0;
		staticInt225 = 50;
		staticInt226 = 0;
		staticBool26 = false;
		staticInt277 = 0;
		staticInt187 = 0;
		staticInt169 = 50;
		staticIntArray101 = new int[staticInt169];
		staticIntArray102 = new int[staticInt169];
		staticIntArray87 = new int[staticInt169];
		staticIntArray85 = new int[staticInt169];
		staticIntArray89 = new int[staticInt169];
		staticIntArray90 = new int[staticInt169];
		staticIntArray99 = new int[staticInt169];
		staticStringArray10 = new String[staticInt169];
		staticIntArrayArray9 = new int[104][104];
		staticInt292 = 0;
		staticInt189 = -1;
		staticInt180 = -1;
		staticInt238 = 0;
		staticInt237 = 0;
		staticInt297 = 0;
		staticInt239 = 0;
		staticInt241 = 0;
		staticInt228 = 0;
		staticInt161 = 0;
		staticInt242 = 0;
		staticInt243 = 0;
		staticInt230 = 0;
		staticBool31 = false;
		staticInt244 = 0;
		staticInt245 = 0;
		staticPlayerArray1 = new Player[2048];
		myPlayerIndex = -1;
		staticInt289 = 0;
		staticInt247 = 0;
		staticIntArray93 = new int[1000];
		staticIntArray94 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
		staticStringArray7 = new String[8];
		staticBoolArray5 = new boolean[8];
		staticIntArray95 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
		staticInt229 = -1;
		staticClass39ArrayArrayArray1 = new Class39[4][104][104];
		staticClass39_7 = new Class39();
		staticClass39_5 = new Class39();
		staticClass39_6 = new Class39();
		staticIntArray91 = new int[25];
		staticIntArray96 = new int[25];
		staticIntArray108 = new int[25];
		staticInt214 = 0;
		staticBool30 = false;
		staticInt252 = 0;
		staticIntArray109 = new int[500];
		staticIntArray97 = new int[500];
		staticIntArray98 = new int[500];
		staticIntArray112 = new int[500];
		staticStringArray9 = new String[500];
		staticStringArray8 = new String[500];
		staticBool22 = false;
		staticInt217 = -1;
		staticBool39 = false;
		staticInt256 = -1;
		staticInt259 = -1;
		staticInt185 = 0;
		staticInt257 = 50;
		staticInt258 = 0;
		staticString32 = null;
		staticBool32 = false;
		staticInt260 = -1;
		staticInt227 = -1;
		staticString31 = null;
		staticString30 = null;
		staticInt263 = -1;
		staticHashTable5 = new HashTable(8);
		staticInt265 = 0;
		staticInt266 = 0;
		staticWidget6 = null;
		staticInt267 = 0;
		staticInt232 = 0;
		myRights = 0;
		staticInt269 = 1;
		staticBool33 = false;
		staticBool40 = false;
		staticBool34 = false;
		staticWidget10 = null;
		staticWidget7 = null;
		staticWidget8 = null;
		staticInt287 = 0;
		staticInt261 = 0;
		staticWidget9 = null;
		staticBool35 = false;
		staticInt183 = -1;
		staticInt313 = -1;
		staticBool29 = false;
		staticInt272 = -1;
		staticInt290 = -1;
		staticBool25 = false;
		staticInt274 = 502628357;
		staticIntArray104 = new int[32];
		staticInt275 = 0;
		staticIntArray86 = new int[32];
		staticInt276 = 0;
		staticIntArray105 = new int[32];
		staticInt278 = 0;
		staticInt279 = 0;
		staticInt280 = 0;
		staticInt281 = 0;
		staticInt295 = 0;
		staticInt282 = 0;
		staticInt283 = 0;
		staticInt284 = 0;
		staticClass39_8 = new Class39();
		staticClass39_9 = new Class39();
		staticClass39_10 = new Class39();
		staticHashTable6 = new HashTable(512);
		staticInt162 = 0;
		staticInt285 = -2;
		staticBoolArray8 = new boolean[100];
		staticBoolArray6 = new boolean[100];
		staticBoolArray9 = new boolean[100];
		staticIntArray82 = new int[100];
		staticIntArray88 = new int[100];
		staticIntArray107 = new int[100];
		staticIntArray106 = new int[100];
		staticInt286 = 0;
		staticLong11 = 0L;
		resizable = true;
		staticInt288 = 765;
		staticInt173 = 1;
		staticIntArray100 = new int[] { 16776960, 16711680, '\uff00', '\uffff', 16711935, 16777215 };
		staticInt160 = 0;
		staticInt291 = 0;
		staticString33 = "";
		staticLongArray3 = new long[100];
		staticInt293 = 0;
		staticInt264 = 0;
		staticIntArray110 = new int[128];
		staticIntArray111 = new int[128];
		staticLong13 = -1L;
		staticString34 = null;
		staticString29 = null;
		staticInt294 = 1;
		staticInt311 = 0;
		staticIntArray113 = new int[1000];
		staticIntArray103 = new int[1000];
		staticSpriteArray9 = new Sprite[1000];
		staticInt296 = 0;
		staticInt240 = 0;
		staticInt298 = 0;
		staticInt299 = 255;
		staticInt249 = -1;
		staticBool38 = false;
		staticInt300 = 1;
		staticInt301 = 127;
		staticInt236 = 0;
		staticIntArray114 = new int[50];
		staticIntArray115 = new int[50];
		staticIntArray116 = new int[50];
		staticIntArray117 = new int[50];
		staticClass9Array1 = new SoundEffect[50];
		staticBool28 = false;
		staticBoolArray7 = new boolean[5];
		staticIntArray118 = new int[5];
		staticIntArray119 = new int[5];
		staticIntArray83 = new int[5];
		staticIntArray120 = new int[5];
		staticShort3 = 256;
		staticShort4 = 205;
		staticShort5 = 256;
		staticShort2 = 320;
		staticShort1 = 1;
		staticShort6 = 32767;
		staticShort7 = 1;
		staticShort8 = 32767;
		staticInt304 = 0;
		staticInt254 = 0;
		staticInt305 = 0;
		staticInt306 = 0;
		staticInt307 = 0;
		staticInt308 = 0;
		staticInt202 = 0;
		staticFriendArray1 = new Friend[400];
		staticClass41_1 = new Class41();
		staticInt310 = 0;
		staticClass7Array1 = new DataClass10[400];
		staticClass49_1 = new Class49();
		staticInt197 = -1;
		staticInt312 = 1073985099;
		staticClass61Array1 = new Class61[8];
		staticLong12 = -1L;
		staticLong14 = -1L;
		staticAbstractClass2Sub1_1 = new AbstractClass2Sub1();
		staticIntArray122 = new int[50];
		staticIntArray123 = new int[50];
	}

	protected final void method213() {
	}

	protected final void method208() {
		DataClass10.staticInt30 = 1568197829 * (staticInt207 == 0 ? '\uaa4a' : '\u9c40' + staticInt309);
		staticInt250 = (staticInt207 == 0 ? 443 : '\uc350' + staticInt309) * 922916997;
		DataClass7.staticInt73 = DataClass10.staticInt30;
		CacheableSub3.staticShortArray5 = Static.staticShortArray2;
		Class60.staticShortArrayArray4 = Static.staticShortArrayArray2;
		DataClass9.staticShortArray4 = Static.staticShortArray3;
		Static.staticShortArrayArray1 = Static.staticShortArrayArray3;
		Static.staticMethod372();
		Canvas var1 = Class38.staticCanvas1;
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(KeyboardHandler.staticKeyboardHandler1);
		var1.addFocusListener(KeyboardHandler.staticKeyboardHandler1);
		Canvas var2 = Class38.staticCanvas1;
		var2.addMouseListener(MouseHandler.staticMouseHandler1);
		var2.addMouseMotionListener(MouseHandler.staticMouseHandler1);
		var2.addFocusListener(MouseHandler.staticMouseHandler1);

		MouseWheelHandler var3;
		try {
			var3 = new MouseWheelHandler();
		} catch (Throwable var10) {
			var3 = null;
		}

		DataClass3.staticAbstractClass1_1 = var3;
		if (DataClass3.staticAbstractClass1_1 != null) {
			DataClass3.staticAbstractClass1_1.method166(Class38.staticCanvas1);
		}

		DataClass9.staticJs5DiskCache1 = new Js5DiskCache(255, Static.staticBufferedFile3, Static.staticBufferedFile1,
				500000);
		FileOnDisk var5 = null;
		Class6 var6 = new Class6();

		try {
			var5 = Static.staticMethod70("", KeyFocusListener.staticGameType7.aString9, false);
			byte[] var13 = new byte[(int) var5.method87()];

			int var9;
			for (int var8 = 0; var8 < var13.length; var8 += var9) {
				var9 = var5.method84(var13, var8, var13.length - var8);
				if (var9 == -1) {
					throw new IOException();
				}
			}

			var6 = new Class6(new ByteBuf(var13));
		} catch (Exception var11) {
			;
		}

		try {
			if (var5 != null) {
				var5.method86();
			}
		} catch (Exception var91) {
			;
		}

		Static.staticClass6_1 = var6;
		NodeSub19.staticClipboard1 = getToolkit().getSystemClipboard();
		Static.staticMethod142(this, RenderableSub2.staticString35);
		if (staticInt207 != 0) {
			staticBool23 = true;
		}

		int var131 = Static.staticClass6_1.anInt15;
		staticLong11 = 0L;
		if (var131 >= 2) {
			resizable = true;
		} else {
			resizable = false;
		}

		Static.staticMethod335();
		if (staticInt165 >= 25) {
			Static.staticMethod34();
		}

		staticBool14 = true;
	}

	protected final void method204() {
		++staticInt166;
		method311();
		Static.staticMethod427();

		int var1;
		try {
			if (Static.staticInt118 == 1) {
				var1 = Static.staticNodeSub8Sub3_1.method437();
				if (var1 > 0 && Static.staticNodeSub8Sub3_1.method441()) {
					var1 -= NodeSub1.staticInt151;
					if (var1 < 0) {
						var1 = 0;
					}

					Static.staticNodeSub8Sub3_1.method457(var1);
				} else {
					Static.staticNodeSub8Sub3_1.method440();
					Static.staticNodeSub8Sub3_1.method462();
					if (Static.staticJs5Index3 != null) {
						Static.staticInt118 = 2;
					} else {
						Static.staticInt118 = 0;
					}

					GameType.staticNodeSub11_1 = null;
					Class6.staticClass10_1 = null;
				}
			}
		} catch (Exception var311) {
			var311.printStackTrace();
			Static.staticNodeSub8Sub3_1.method440();
			Static.staticInt118 = 0;
			GameType.staticNodeSub11_1 = null;
			Class6.staticClass10_1 = null;
			Static.staticJs5Index3 = null;
		}

		Static.staticMethod17();
		Static.staticMethod83();
		Static.staticMethod258();
		if (DataClass3.staticAbstractClass1_1 != null) {
			var1 = DataClass3.staticAbstractClass1_1.method168();
			staticInt284 = var1;
		}

		if (staticInt165 == 0) {
			Static.staticMethod128();
			Static.staticMethod74();
		} else if (staticInt165 == 5) {
			Static.staticMethod139(this);
			Static.staticMethod128();
			Static.staticAbstractClass3_1.method214();

			for (var1 = 0; var1 < 32; var1++) {
				staticLongArray1[var1] = 0L;
			}

			for (var1 = 0; var1 < 32; var1++) {
				staticLongArray2[var1] = 0L;
			}

			DataClass1.staticInt33 = 0;
		} else if (staticInt165 != 10 && staticInt165 != 11) {
			if (staticInt165 == 20) {
				Static.staticMethod139(this);
				Static.processLogin();
			} else if (staticInt165 == 25) {
				Static.staticMethod33(false);
				staticInt215 = 0;
				boolean var34 = true;

				int var2;
				for (var2 = 0; var2 < DataClass10.staticByteArrayArray1.length; var2++) {
					if (AbstractClass2Sub1.staticIntArray125[var2] != -1
							&& DataClass10.staticByteArrayArray1[var2] == null) {
						DataClass10.staticByteArrayArray1[var2] = RenderableSub2.staticJs5IndexImpl16
								.getFile(AbstractClass2Sub1.staticIntArray125[var2], 0);
						if (DataClass10.staticByteArrayArray1[var2] == null) {
							var34 = false;
							++staticInt215;
						}
					}

					if (Class60.staticIntArray75[var2] != -1 && Class47.staticByteArrayArray6[var2] == null) {
						Class47.staticByteArrayArray6[var2] = RenderableSub2.staticJs5IndexImpl16
								.method256(Class60.staticIntArray75[var2], 0, Class61.staticIntArrayArray8[var2]);
						if (Class47.staticByteArrayArray6[var2] == null) {
							var34 = false;
							++staticInt215;
						}
					}
				}

				if (!var34) {
					staticInt200 = 1;
				} else {
					staticInt199 = 0;
					var34 = true;

					int var4;
					int var5;
					for (var2 = 0; var2 < DataClass10.staticByteArrayArray1.length; var2++) {
						byte[] var33 = Class47.staticByteArrayArray6[var2];
						if (var33 != null) {
							var4 = (Class6.staticIntArray13[var2] >> 8) * 64 - NodeSub3.staticInt154;
							var5 = (Class6.staticIntArray13[var2] & 0xff) * 64 - Class34.staticInt75;
							if (staticBool37) {
								var4 = 10;
								var5 = 10;
							}

							var34 &= Static.staticMethod154(var33, var4, var5);
						}
					}

					if (!var34) {
						staticInt200 = 2;
					} else {
						if (staticInt200 != 0) {
							Static.staticMethod337("Loading - please wait." + Static.staticString17
									+ Static.staticString10 + 100 + "%" + Static.staticString13, true);
						}

						Static.staticMethod17();
						Static.staticMethod160();
						Static.staticMethod17();
						Friend.staticScene1.method138();
						Static.staticMethod17();
						System.gc();

						for (var2 = 0; var2 < 4; var2++) {
							staticClass38Array1[var2].method182();
						}

						int var32;
						for (var2 = 0; var2 < 4; var2++) {
							for (var32 = 0; var32 < 104; var32++) {
								for (var4 = 0; var4 < 104; var4++) {
									Static.staticByteArrayArrayArray4[var2][var32][var4] = 0;
								}
							}
						}

						Static.staticMethod17();
						Static.staticMethod212();
						var2 = DataClass10.staticByteArrayArray1.length;
						Static.staticMethod7();
						Static.staticMethod33(true);
						int var36;
						if (!staticBool37) {
							byte[] var7;
							for (var32 = 0; var32 < var2; var32++) {
								var4 = (Class6.staticIntArray13[var32] >> 8) * 64 - NodeSub3.staticInt154;
								var5 = (Class6.staticIntArray13[var32] & 0xff) * 64 - Class34.staticInt75;
								var7 = DataClass10.staticByteArrayArray1[var32];
								if (var7 != null) {
									Static.staticMethod17();
									Static.staticMethod40(var7, var4, var5, FileOnDisk.staticInt39 * 8 - 48,
											DataClass2.staticInt70 * 8 - 48, staticClass38Array1);
								}
							}

							for (var32 = 0; var32 < var2; var32++) {
								var4 = (Class6.staticIntArray13[var32] >> 8) * 64 - NodeSub3.staticInt154;
								var5 = (Class6.staticIntArray13[var32] & 0xff) * 64 - Class34.staticInt75;
								var7 = DataClass10.staticByteArrayArray1[var32];
								if (var7 == null && DataClass2.staticInt70 < 800) {
									Static.staticMethod17();
									Static.staticMethod333(var4, var5, 64, 64);
								}
							}

							Static.staticMethod33(true);

							for (var32 = 0; var32 < var2; var32++) {
								byte[] var8 = Class47.staticByteArrayArray6[var32];
								if (var8 != null) {
									var5 = (Class6.staticIntArray13[var32] >> 8) * 64 - NodeSub3.staticInt154;
									var36 = (Class6.staticIntArray13[var32] & 0xff) * 64 - Class34.staticInt75;
									Static.staticMethod17();
									Static.staticMethod244(var8, var5, var36, Friend.staticScene1, staticClass38Array1);
								}
							}
						}

						int var9;
						int var331;
						int var341;
						if (staticBool37) {
							var32 = 0;

							label401: while (true) {
								int var38;
								int var11;
								int var12;
								if (var32 >= 4) {
									for (var32 = 0; var32 < 13; var32++) {
										for (var4 = 0; var4 < 13; var4++) {
											var5 = staticIntArrayArrayArray3[0][var32][var4];
											if (var5 == -1) {
												Static.staticMethod333(var32 * 8, var4 * 8, 8, 8);
											}
										}
									}

									Static.staticMethod33(true);
									var32 = 0;

									while (true) {
										if (var32 >= 4) {
											break label401;
										}

										Static.staticMethod17();

										for (var4 = 0; var4 < 13; var4++) {
											for (var5 = 0; var5 < 13; var5++) {
												var36 = staticIntArrayArrayArray3[var32][var4][var5];
												if (var36 != -1) {
													var331 = var36 >> 24 & 0x3;
													var341 = var36 >> 1 & 0x3;
													var9 = var36 >> 14 & 0x3ff;
													var38 = var36 >> 3 & 0x7ff;
													var11 = var38 / 8 + (var9 / 8 << 8);

													for (var12 = 0; var12 < Class6.staticIntArray13.length; var12++) {
														if (Class6.staticIntArray13[var12] == var11
																&& Class47.staticByteArrayArray6[var12] != null) {
															Static.staticMethod152(Class47.staticByteArrayArray6[var12],
																	var32, var4 * 8, var5 * 8, var331, (var9 & 0x7) * 8,
																	(var38 & 0x7) * 8, var341, Friend.staticScene1,
																	staticClass38Array1);
															break;
														}
													}
												}
											}
										}

										++var32;
									}
								}

								Static.staticMethod17();

								for (var4 = 0; var4 < 13; var4++) {
									for (var5 = 0; var5 < 13; var5++) {
										boolean var37 = false;
										var331 = staticIntArrayArrayArray3[var32][var4][var5];
										if (var331 != -1) {
											var341 = var331 >> 24 & 0x3;
											var9 = var331 >> 1 & 0x3;
											var38 = var331 >> 14 & 0x3ff;
											var11 = var331 >> 3 & 0x7ff;
											var12 = (var38 / 8 << 8) + var11 / 8;

											for (int var13 = 0; var13 < Class6.staticIntArray13.length; var13++) {
												if (var12 == Class6.staticIntArray13[var13]
														&& DataClass10.staticByteArrayArray1[var13] != null) {
													byte[] var14 = DataClass10.staticByteArrayArray1[var13];
													int var15 = var4 * 8;
													int var16 = var5 * 8;
													int var17 = (var38 & 0x7) * 8;
													int var18 = (var11 & 0x7) * 8;
													Class38[] var19 = staticClass38Array1;

													int var21;
													for (int var39 = 0; var39 < 8; var39++) {
														for (var21 = 0; var21 < 8; var21++) {
															if (var39 + var15 > 0 && var15 + var39 < 103
																	&& var16 + var21 > 0 && var21 + var16 < 103) {
																var19[var32].anIntArrayArray5[var39 + var15][var21
																		+ var16] &= -16777217;
															}
														}
													}

													ByteBuf var361 = new ByteBuf(var14);

													for (var21 = 0; var21 < 4; var21++) {
														for (int var22 = 0; var22 < 64; var22++) {
															for (int var23 = 0; var23 < 64; var23++) {
																if (var21 == var341 && var22 >= var17
																		&& var22 < 8 + var17 && var23 >= var18
																		&& var23 < var18 + 8) {
																	int var26 = var15 + Static.staticMethod115(
																			var22 & 0x7, var23 & 0x7, var9);
																	int var28 = var22 & 0x7;
																	int var29 = var23 & 0x7;
																	int var30 = var9 & 0x3;
																	int var31;
																	if (var30 == 0) {
																		var31 = var29;
																	} else if (var30 == 1) {
																		var31 = 7 - var28;
																	} else if (var30 == 2) {
																		var31 = 7 - var29;
																	} else {
																		var31 = var28;
																	}

																	Static.staticMethod194(var361, var32, var26,
																			var31 + var16, 0, 0, var9);
																} else {
																	Static.staticMethod194(var361, 0, -1, -1, 0, 0, 0);
																}
															}
														}
													}

													var37 = true;
													break;
												}
											}
										}

										if (!var37) {
											Static.staticMethod174(var32, var4 * 8, var5 * 8);
										}
									}
								}

								++var32;
							}
						}

						Static.staticMethod33(true);
						Static.staticMethod160();
						Static.staticMethod17();
						Static.staticMethod99(Friend.staticScene1, staticClass38Array1);
						Static.staticMethod33(true);
						var32 = Static.staticInt112;
						if (var32 > NodeSub4.staticInt155) {
							var32 = NodeSub4.staticInt155;
						}

						if (var32 < NodeSub4.staticInt155 - 1) {
							var32 = NodeSub4.staticInt155 - 1;
						}

						if (lowMemory) {
							Friend.staticScene1.method139(Static.staticInt112);
						} else {
							Friend.staticScene1.method139(0);
						}

						for (var4 = 0; var4 < 104; var4++) {
							for (var5 = 0; var5 < 104; var5++) {
								Static.staticMethod262(var4, var5);
							}
						}

						Static.staticMethod17();

						for (NodeSub19 var35 = (NodeSub19) staticClass39_7
								.method195(); var35 != null; var35 = (NodeSub19) staticClass39_7.method193()) {
							if (var35.anInt386 == -1) {
								var35.anInt396 = 0;
								Static.staticMethod284(var35);
							} else {
								var35.method174();
							}
						}

						ObjectDefinition.staticCache15.method171();
						if (Class40Sub1.staticFrame1 != null) {
							outBuffer.method471(137);
							outBuffer.writeInt(1057001181);
						}

						if (!staticBool37) {
							var4 = (FileOnDisk.staticInt39 - 6) / 8;
							var5 = (6 + FileOnDisk.staticInt39) / 8;
							var36 = (DataClass2.staticInt70 - 6) / 8;
							var331 = (DataClass2.staticInt70 + 6) / 8;

							for (var341 = var4 - 1; var341 <= 1 + var5; var341++) {
								for (var9 = var36 - 1; var9 <= var331 + 1; var9++) {
									if (var341 < var4 || var341 > var5 || var9 < var36 || var9 > var331) {
										RenderableSub2.staticJs5IndexImpl16.method255("m" + var341 + "_" + var9);
										RenderableSub2.staticJs5IndexImpl16.method255("l" + var341 + "_" + var9);
									}
								}
							}
						}

						Static.staticMethod396(30);
						Static.staticMethod17();
						Static.staticMethod180();
						outBuffer.method471(60);
						Static.staticMethod74();
					}
				}
			}
		} else {
			Static.staticMethod139(this);
		}

		if (staticInt165 == 30) {
			Static.staticMethod130();
		} else if (staticInt165 == 40 || staticInt165 == 45) {
			Static.processLogin();
		}

	}

	protected final void method206() {
		if (Class57.staticClass5_1.method22()) {
			Class57.staticClass5_1.method18();
		}

		if (staticMouseCapturer1 != null) {
			staticMouseCapturer1.aBool21 = false;
		}

		staticMouseCapturer1 = null;
		if (Class56.gameConnection != null) {
			Class56.gameConnection.shutdown();
			Class56.gameConnection = null;
		}

		Static.staticMethod55();
		if (MouseHandler.staticMouseHandler1 != null) {
			synchronized (MouseHandler.staticMouseHandler1) {
				MouseHandler.staticMouseHandler1 = null;
			}
		}

		DataClass3.staticAbstractClass1_1 = null;
		if (ByteBuf.staticClass19_2 != null) {
			ByteBuf.staticClass19_2.method69();
		}

		if (NodeSub12.staticClass19_1 != null) {
			NodeSub12.staticClass19_1.method69();
		}

		if (Static.staticConnection2 != null) {
			Static.staticConnection2.shutdown();
		}

		Static.staticMethod326();

		try {
			Static.staticBufferedFile3.method51();

			for (int var51 = 0; var51 < MouseCapturer.staticInt145; var51++) {
				Static.staticBufferedFileArray1[var51].method51();
			}

			Static.staticBufferedFile1.method51();
			Static.randomDat.method51();
		} catch (Exception var4) {
			;
		}

	}

	void method311() {
		if (staticInt165 != 1000) {
			long var1 = Static.staticMethod297();
			int var3 = (int) (var1 - Static.staticLong8);
			Static.staticLong8 = var1;
			if (var3 > 200) {
				var3 = 200;
			}

			Static.staticInt129 += var3;
			boolean var4;
			if (Static.staticInt133 == 0 && Static.staticInt136 == 0 && Static.staticInt132 == 0
					&& Static.staticInt130 == 0) {
				var4 = true;
			} else if (Static.staticConnection2 == null) {
				var4 = false;
			} else {
				try {
					label207: {
						if (Static.staticInt129 > 30000) {
							throw new IOException();
						}

						CacheableSub4 var21;
						ByteBuf var6;
						while (Static.staticInt136 < 20 && Static.staticInt130 > 0) {
							var21 = (CacheableSub4) Static.staticHashTable1.method146();
							var6 = new ByteBuf(4);
							var6.writeByte(1);
							var6.writeTriByte((int) var21.id);
							Static.staticConnection2.write(var6.buf, 0, 4);
							Static.staticHashTable2.method148(var21, var21.id);
							--Static.staticInt130;
							++Static.staticInt136;
						}

						while (Static.staticInt133 < 20 && Static.staticInt132 > 0) {
							var21 = (CacheableSub4) Static.staticQueue1.method186();
							var6 = new ByteBuf(4);
							var6.writeByte(0);
							var6.writeTriByte((int) var21.id);
							Static.staticConnection2.write(var6.buf, 0, 4);
							var21.method314();
							Static.staticHashTable3.method148(var21, var21.id);
							--Static.staticInt132;
							++Static.staticInt133;
						}

						for (int var22 = 0; var22 < 100; var22++) {
							int var23 = Static.staticConnection2.available();
							if (var23 < 0) {
								throw new IOException();
							}

							if (var23 == 0) {
								break;
							}

							Static.staticInt129 = 0;
							byte var7 = 0;
							if (FloorUnderlayDef.staticCacheableSub4_1 == null) {
								var7 = 8;
							} else if (Static.staticInt134 == 0) {
								var7 = 1;
							}

							int var8;
							int var9;
							int var10;
							int var12;
							if (var7 > 0) {
								var8 = var7 - Static.staticStream3.position;
								if (var8 > var23) {
									var8 = var23;
								}

								Static.staticConnection2.read(Static.staticStream3.buf, Static.staticStream3.position,
										var8);
								if (Static.staticByte2 != 0) {
									for (var9 = 0; var9 < var8; var9++) {
										Static.staticStream3.buf[Static.staticStream3.position + var9] ^= Static.staticByte2;
									}
								}

								Static.staticStream3.position += var8;
								if (Static.staticStream3.position < var7) {
									break;
								}

								if (FloorUnderlayDef.staticCacheableSub4_1 == null) {
									Static.staticStream3.position = 0;
									var9 = Static.staticStream3.method367();
									var10 = Static.staticStream3.method370();
									int var24 = Static.staticStream3.method367();
									var12 = Static.staticStream3.readInt();
									long var17 = (var9 << 16) + var10;
									CacheableSub4 var15 = (CacheableSub4) Static.staticHashTable2.method149(var17);
									CacheableSub3.staticBool45 = true;
									if (var15 == null) {
										var15 = (CacheableSub4) Static.staticHashTable3.method149(var17);
										CacheableSub3.staticBool45 = false;
									}

									if (var15 == null) {
										throw new IOException();
									}

									int var16 = var24 == 0 ? 5 : 9;
									FloorUnderlayDef.staticCacheableSub4_1 = var15;
									BufferedFile.staticStream2 = new ByteBuf(
											var16 + var12 + FloorUnderlayDef.staticCacheableSub4_1.aByte4);
									BufferedFile.staticStream2.writeByte(var24);
									BufferedFile.staticStream2.writeInt(var12);
									Static.staticInt134 = 8;
									Static.staticStream3.position = 0;
								} else if (Static.staticInt134 == 0) {
									if (Static.staticStream3.buf[0] == -1) {
										Static.staticInt134 = 1;
										Static.staticStream3.position = 0;
									} else {
										FloorUnderlayDef.staticCacheableSub4_1 = null;
									}
								}
							} else {
								var8 = BufferedFile.staticStream2.buf.length
										- FloorUnderlayDef.staticCacheableSub4_1.aByte4;
								var9 = 512 - Static.staticInt134;
								if (var9 > var8 - BufferedFile.staticStream2.position) {
									var9 = var8 - BufferedFile.staticStream2.position;
								}

								if (var9 > var23) {
									var9 = var23;
								}

								Static.staticConnection2.read(BufferedFile.staticStream2.buf,
										BufferedFile.staticStream2.position, var9);
								if (Static.staticByte2 != 0) {
									for (var10 = 0; var10 < var9; var10++) {
										BufferedFile.staticStream2.buf[BufferedFile.staticStream2.position
												+ var10] ^= Static.staticByte2;
									}
								}

								BufferedFile.staticStream2.position += var9;
								Static.staticInt134 += var9;
								if (var8 == BufferedFile.staticStream2.position) {
									if (FloorUnderlayDef.staticCacheableSub4_1.id == 16711935L) {
										Class55.staticStream4 = BufferedFile.staticStream2;

										for (var10 = 0; var10 < 256; var10++) {
											Js5IndexImpl var221 = Static.staticJs5IndexImplArray1[var10];
											if (var221 != null) {
												Class55.staticStream4.position = var10 * 8 + 5;
												var12 = Class55.staticStream4.readInt();
												int var231 = Class55.staticStream4.readInt();
												var221.method396(var12, var231);
											}
										}
									} else {
										Static.staticCRC32_1.reset();
										Static.staticCRC32_1.update(BufferedFile.staticStream2.buf, 0, var8);
										var10 = (int) Static.staticCRC32_1.getValue();
										if (FloorUnderlayDef.staticCacheableSub4_1.anInt429 != var10) {
											try {
												Static.staticConnection2.shutdown();
											} catch (Exception var20) {
												;
											}

											++Static.staticInt131;
											Static.staticConnection2 = null;
											Static.staticByte2 = (byte) (int) (Math.random() * 255.0D + 1.0D);
											var4 = false;
											break label207;
										}

										Static.staticInt131 = 0;
										Static.staticInt135 = 0;
										FloorUnderlayDef.staticCacheableSub4_1.aJs5IndexImpl2.method397(
												(int) (FloorUnderlayDef.staticCacheableSub4_1.id & 0xffff),
												BufferedFile.staticStream2.buf,
												(FloorUnderlayDef.staticCacheableSub4_1.id & 0xff0000) == 16711680L,
												CacheableSub3.staticBool45);
									}

									FloorUnderlayDef.staticCacheableSub4_1.method174();
									if (CacheableSub3.staticBool45) {
										--Static.staticInt136;
									} else {
										--Static.staticInt133;
									}

									Static.staticInt134 = 0;
									FloorUnderlayDef.staticCacheableSub4_1 = null;
									BufferedFile.staticStream2 = null;
								} else {
									if (Static.staticInt134 != 512) {
										break;
									}

									Static.staticInt134 = 0;
								}
							}
						}

						var4 = true;
					}
				} catch (IOException var211) {
					try {
						Static.staticConnection2.shutdown();
					} catch (Exception var19) {
						;
					}

					++Static.staticInt135;
					Static.staticConnection2 = null;
					var4 = false;
				}
			}

			if (!var4) {
				method313();
			}
		}

	}

	void method312(int var1) {
		FileOnDisk.staticTask1 = null;
		Item.staticConnection4 = null;
		staticInt271 = 0;
		if (DataClass7.staticInt73 * 462737933 == DataClass10.staticInt30 * 462737933) {
			DataClass7.staticInt73 = staticInt250 * 1584772929;
		} else {
			DataClass7.staticInt73 = DataClass10.staticInt30;
		}

		++staticInt182;
		if (staticInt182 < 2 || var1 != 7 && var1 != 9) {
			if (staticInt182 >= 2 && var1 == 6) {
				method205("js5connect_outofdate");
				staticInt165 = 1000;
			} else if (staticInt182 >= 4) {
				if (staticInt165 <= 5) {
					method205("js5connect");
					staticInt165 = 1000;
				} else {
					staticInt181 = 3000;
				}
			}
		} else if (staticInt165 <= 5) {
			method205("js5connect_full");
			staticInt165 = 1000;
		} else {
			staticInt181 = 3000;
		}

	}

	public final void init() {
		if (method202()) {
			Class52[] var1 = new Class52[] { Class52.staticClass52_7, Class52.staticClass52_8, Class52.staticClass52_3,
					Class52.staticClass52_13, Class52.staticClass52_15, Class52.staticClass52_6,
					Class52.staticClass52_10, Class52.staticClass52_5, Class52.staticClass52_12,
					Class52.staticClass52_9, Class52.staticClass52_14, Class52.staticClass52_2, Class52.staticClass52_1,
					Class52.staticClass52_11, Class52.staticClass52_4 };
			Class52[] var2 = var1;

			int var3;
			for (var3 = 0; var3 < var2.length; var3++) {
				Class52 var13 = var2[var3];
				String var14 = getParameter(var13.aString11);
				if (var14 != null) {
					switch (Integer.parseInt(var13.aString11)) {
					case 1:
						NodeSub1.staticBuildType5 = Static.staticMethod307(Integer.parseInt(var14));
						break;
					case 2:
						if (var14.equalsIgnoreCase(Static.staticString12)) {
							;
						}
						break;
					case 3:
						Class34.staticString23 = var14;
						break;
					case 4:
						staticInt231 = Integer.parseInt(var14);
					case 5:
					case 6:
					case 7:
					default:
						break;
					case 8:
						BuildType.staticString27 = var14;
						break;
					case 9:
						staticInt164 = Integer.parseInt(var14);
						break;
					case 10:
						if (var14.equalsIgnoreCase(Static.staticString12)) {
							staticBool20 = true;
						} else {
							staticBool20 = false;
						}
						break;
					case 11:
						staticInt309 = Integer.parseInt(var14);
						break;
					case 12:
						NodeSub19.sessionId = Integer.parseInt(var14);
						break;
					case 13:
						staticInt201 = Integer.parseInt(var14);
						break;
					case 14:
						KeyFocusListener.staticGameType7 = (GameType) Static.staticMethod233(Static.staticMethod228(),
								Integer.parseInt(var14));
						if (KeyFocusListener.staticGameType7 == GameType.staticGameType6) {
							Static.staticClass53_1 = Class53.staticClass53_5;
						} else {
							Static.staticClass53_1 = Class53.staticClass53_7;
						}
						break;
					case 15:
						staticInt207 = Integer.parseInt(var14);
					}
				}
			}

			Static.staticMethod90();
			DataClass5.staticString21 = getCodeBase().getHost();
			String var16 = NodeSub1.staticBuildType5.aString10;
			byte var17 = 0;

			try {
				MouseCapturer.staticInt145 = 16;
				NodeSub16.staticInt314 = var17;

				try {
					NodeSub10.staticString28 = System.getProperty("os.name");
				} catch (Exception var131) {
					NodeSub10.staticString28 = "Unknown";
				}

				Static.staticString24 = NodeSub10.staticString28.toLowerCase();

				try {
					Class6.staticString18 = System.getProperty("user.home");
					if (Class6.staticString18 != null) {
						Class6.staticString18 = Class6.staticString18 + "/";
					}
				} catch (Exception var121) {
					;
				}

				try {
					if (Static.staticString24.startsWith("win")) {
						if (Class6.staticString18 == null) {
							Class6.staticString18 = System.getenv("USERPROFILE");
						}
					} else if (Class6.staticString18 == null) {
						Class6.staticString18 = System.getenv("HOME");
					}

					if (Class6.staticString18 != null) {
						Class6.staticString18 = Class6.staticString18 + "/";
					}
				} catch (Exception var11) {
					;
				}

				if (Class6.staticString18 == null) {
					Class6.staticString18 = "~/";
				}

				NodeSub10.staticStringArray6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/",
						"c:/", Class6.staticString18, "/tmp/", "" };
				Static.staticStringArray4 = new String[] { ".jagex_cache_" + NodeSub16.staticInt314,
						".file_store_" + NodeSub16.staticInt314 };
				var3 = 0;

				int var12;
				File var7;
				label161: while (var3 < 4) {
					Static.staticFile3 = Static.staticMethod225("oldschool", var16, var3);
					if (!Static.staticFile3.exists()) {
						Static.staticFile3.mkdirs();
					}

					File[] var15 = Static.staticFile3.listFiles();
					if (var15 == null) {
						break;
					}

					File[] var18 = var15;
					var12 = 0;

					while (true) {
						if (var12 >= var18.length) {
							break label161;
						}

						var7 = var18[var12];
						if (!Static.staticMethod278(var7, false)) {
							++var3;
							break;
						}

						++var12;
					}
				}

				File var181 = Static.staticFile3;
				Static.staticFile2 = var181;
				if (!Static.staticFile2.exists()) {
					throw new RuntimeException("");
				}

				Static.staticBool10 = true;

				try {
					File var19 = new File(Class6.staticString18, "random.dat");
					if (var19.exists()) {
						Static.randomDat = new BufferedFile(new FileOnDisk(var19, "rw", 25L), 24, 0);
					} else {
						label140: for (int var21 = 0; var21 < Static.staticStringArray4.length; var21++) {
							for (var12 = 0; var12 < NodeSub10.staticStringArray6.length; var12++) {
								var7 = new File(NodeSub10.staticStringArray6[var12] + Static.staticStringArray4[var21]
										+ File.separatorChar + "random.dat");
								if (var7.exists()) {
									Static.randomDat = new BufferedFile(new FileOnDisk(var7, "rw", 25L), 24,
											0);
									break label140;
								}
							}
						}
					}

					if (Static.randomDat == null) {
						RandomAccessFile var211 = new RandomAccessFile(var19, "rw");
						var12 = var211.read();
						var211.seek(0L);
						var211.write(var12);
						var211.seek(0L);
						var211.close();
						Static.randomDat = new BufferedFile(new FileOnDisk(var19, "rw", 25L), 24, 0);
					}
				} catch (IOException var141) {
					;
				}

				Static.staticBufferedFile3 = new BufferedFile(
						new FileOnDisk(Static.staticMethod107("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
				Static.staticBufferedFile1 = new BufferedFile(
						new FileOnDisk(Static.staticMethod107("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
				Static.staticBufferedFileArray1 = new BufferedFile[MouseCapturer.staticInt145];

				for (int var20 = 0; var20 < MouseCapturer.staticInt145; var20++) {
					Static.staticBufferedFileArray1[var20] = new BufferedFile(
							new FileOnDisk(Static.staticMethod107("main_file_cache.idx" + var20), "rw", 1048576L), 6000,
							0);
				}
			} catch (Exception var151) {
				Static.staticMethod285((String) null, var151);
			}

			staticGame1 = this;
			method200(765, 503, 138);
		}

	}

	protected final void method211() {
		boolean var1 = Static.staticMethod426();
		if (var1 && staticBool38 && ByteBuf.staticClass19_2 != null) {
			ByteBuf.staticClass19_2.method68();
		}

		if (staticInt165 == 10 || staticInt165 == 20 || staticInt165 == 30) {
			if (staticLong11 != 0L && Static.staticMethod297() > staticLong11) {
				int var20 = Static.staticMethod248();
				staticLong11 = 0L;
				if (var20 >= 2) {
					resizable = true;
				} else {
					resizable = false;
				}

				Static.staticMethod335();
				if (staticInt165 >= 25) {
					Static.staticMethod34();
				}

				staticBool14 = true;
			} else if (staticBool11) {
				Static.staticMethod95();
			}
		}

		Dimension var201 = method212();
		if (Class40Sub1.staticInt317 != var201.width || BuildType.staticInt124 != var201.height || staticBool15) {
			Static.staticMethod335();
			staticLong11 = Static.staticMethod297() + 500L;
			staticBool15 = false;
		}

		boolean var3 = false;
		int var4;
		if (staticBool14) {
			staticBool14 = false;
			var3 = true;

			for (var4 = 0; var4 < 100; var4++) {
				staticBoolArray8[var4] = true;
			}
		}

		if (var3) {
			Static.staticMethod53();
		}

		int var9;
		int var10;
		int var21;
		if (staticInt165 == 0) {
			var4 = Static.staticInt14 * -1431655765;
			String var24 = Static.staticString3;
			Color var18 = null;

			try {
				Graphics var26 = Class38.staticCanvas1.getGraphics();
				if (Class28.staticFont1 == null) {
					Class28.staticFont1 = new Font("Helvetica", 1, 13);
					Class26.staticFontMetrics1 = Class38.staticCanvas1.getFontMetrics(Class28.staticFont1);
				}

				if (var3) {
					var26.setColor(Color.black);
					var26.fillRect(0, 0, Static.gameWidth, Class47.gameHeight);
				}

				if (var18 == null) {
					var18 = new Color(140, 17, 17);
				}

				try {
					if (Static.staticImage1 == null) {
						Static.staticImage1 = Class38.staticCanvas1.createImage(304, 34);
					}

					Graphics var11 = Static.staticImage1.getGraphics();
					var11.setColor(var18);
					var11.drawRect(0, 0, 303, 33);
					var11.fillRect(2, 2, var4 * 3, 30);
					var11.setColor(Color.black);
					var11.drawRect(1, 1, 301, 31);
					var11.fillRect(2 + var4 * 3, 2, 300 - var4 * 3, 30);
					var11.setFont(Class28.staticFont1);
					var11.setColor(Color.white);
					var11.drawString(var24, (304 - Class26.staticFontMetrics1.stringWidth(var24)) / 2, 22);
					var26.drawImage(Static.staticImage1, Static.gameWidth / 2 - 152, Class47.gameHeight / 2 - 18,
							(ImageObserver) null);
				} catch (Exception var16) {
					var9 = Static.gameWidth / 2 - 152;
					var10 = Class47.gameHeight / 2 - 18;
					var26.setColor(var18);
					var26.drawRect(var9, var10, 303, 33);
					var26.fillRect(var9 + 2, 2 + var10, var4 * 3, 30);
					var26.setColor(Color.black);
					var26.drawRect(var9 + 1, var10 + 1, 301, 31);
					var26.fillRect(2 + var9 + var4 * 3, 2 + var10, 300 - var4 * 3, 30);
					var26.setFont(Class28.staticFont1);
					var26.setColor(Color.white);
					var26.drawString(var24, var9 + (304 - Class26.staticFontMetrics1.stringWidth(var24)) / 2,
							var10 + 22);
				}
			} catch (Exception var17) {
				Class38.staticCanvas1.repaint();
			}
		} else if (staticInt165 == 5) {
			Static.staticMethod134(GraphicsBuffer.staticRasterizer2DSub2Sub1_1, NodeSub4.staticRasterizer2DSub2Sub1_3,
					DataClass9.staticRasterizer2DSub2Sub1_2, var3);
		} else if (staticInt165 != 10 && staticInt165 != 11) {
			if (staticInt165 == 20) {
				Static.staticMethod134(GraphicsBuffer.staticRasterizer2DSub2Sub1_1,
						NodeSub4.staticRasterizer2DSub2Sub1_3, DataClass9.staticRasterizer2DSub2Sub1_2, var3);
			} else if (staticInt165 == 25) {
				if (staticInt200 == 1) {
					if (staticInt215 > staticInt198) {
						staticInt198 = staticInt215;
					}

					var4 = (staticInt198 * 50 - staticInt215 * 50) / staticInt198;
					Static.staticMethod337("Loading - please wait." + Static.staticString17 + Static.staticString10
							+ var4 + "%" + Static.staticString13, false);
				} else if (staticInt200 == 2) {
					if (staticInt199 > staticInt253) {
						staticInt253 = staticInt199;
					}

					var4 = 50 + (staticInt253 * 50 - staticInt199 * 50) / staticInt253;
					Static.staticMethod337("Loading - please wait." + Static.staticString17 + Static.staticString10
							+ var4 + "%" + Static.staticString13, false);
				} else {
					Static.staticMethod337("Loading - please wait.", false);
				}
			} else if (staticInt165 == 30) {
				if (staticInt263 != -1) {
					Static.staticMethod14(staticInt263);
				}

				for (var4 = 0; var4 < staticInt162; var4++) {
					if (staticBoolArray8[var4]) {
						staticBoolArray6[var4] = true;
					}

					staticBoolArray9[var4] = staticBoolArray8[var4];
					staticBoolArray8[var4] = false;
				}

				staticInt285 = staticInt166;
				staticInt256 = -1;
				staticInt259 = -1;
				Class34.staticWidget3 = null;
				if (staticInt263 != -1) {
					staticInt162 = 0;
					Static.staticMethod226(staticInt263, 0, 0, Static.gameWidth, Class47.gameHeight, 0, 0, -1);
				}

				Static.staticMethod401();
				int var211;
				if (!staticBool30) {
					if (staticInt256 != -1) {
						var4 = staticInt256;
						var21 = staticInt259;
						if (staticInt252 >= 2 || staticInt258 != 0 || staticBool32) {
							var211 = Static.staticMethod165();
							String var25;
							if (staticInt258 == 1 && staticInt252 < 2) {
								var25 = "Use " + staticString32 + " " + Static.staticString14;
							} else if (staticBool32 && staticInt252 < 2) {
								var25 = staticString31 + " " + staticString30 + " " + Static.staticString14;
							} else {
								var25 = Static.staticMethod473(var211);
							}

							if (staticInt252 > 2) {
								var25 = var25 + Static.staticMethod118(16777215) + " " + '/' + " " + (staticInt252 - 2)
										+ " more options";
							}

							GraphicsBuffer.staticRasterizer2DSub2Sub1_1.method621(var25, var4 + 4, 15 + var21, 16777215,
									0, staticInt166 / 1000);
						}
					}
				} else {
					var4 = Class62.staticInt147;
					var21 = NodeSub20.staticInt320;
					var211 = KeyboardHandler.staticInt84;
					int var23 = NpcDefinition.staticInt324;
					int var241 = 6116423;
					Static.staticMethod418(var4, var21, var211, var23, var241);
					Static.staticMethod418(1 + var4, 1 + var21, var211 - 2, 16, 0);
					Static.staticMethod411(1 + var4, 18 + var21, var211 - 2, var23 - 19, 0);
					GraphicsBuffer.staticRasterizer2DSub2Sub1_1.method616("Choose Option", 3 + var4, var21 + 14, var241,
							-1);
					var9 = MouseHandler.staticInt94;
					var10 = MouseHandler.staticInt88;

					int var12;
					int var13;
					int var261;
					for (var261 = 0; var261 < staticInt252; var261++) {
						var12 = 31 + var21 + (staticInt252 - 1 - var261) * 15;
						var13 = 16777215;
						if (var9 > var4 && var9 < var211 + var4 && var10 > var12 - 13 && var10 < var12 + 3) {
							var13 = 16776960;
						}

						GraphicsBuffer.staticRasterizer2DSub2Sub1_1.method616(Static.staticMethod473(var261), var4 + 3,
								var12, var13, 0);
					}

					var261 = Class62.staticInt147;
					var12 = NodeSub20.staticInt320;
					var13 = KeyboardHandler.staticInt84;
					int var14 = NpcDefinition.staticInt324;

					for (int var15 = 0; var15 < staticInt162; var15++) {
						if (staticIntArray82[var15] + staticIntArray107[var15] > var261
								&& staticIntArray82[var15] < var13 + var261
								&& staticIntArray106[var15] + staticIntArray88[var15] > var12
								&& staticIntArray88[var15] < var14 + var12) {
							staticBoolArray6[var15] = true;
						}
					}
				}

				if (staticInt286 == 3) {
					for (var4 = 0; var4 < staticInt162; var4++) {
						if (staticBoolArray9[var4]) {
							Static.staticMethod405(staticIntArray82[var4], staticIntArray88[var4],
									staticIntArray107[var4], staticIntArray106[var4], 16711935, 128);
						} else if (staticBoolArray6[var4]) {
							Static.staticMethod405(staticIntArray82[var4], staticIntArray88[var4],
									staticIntArray107[var4], staticIntArray106[var4], 16711680, 128);
						}
					}
				}

				Static.staticMethod383(NodeSub4.staticInt155, AbstractClass2Sub1.staticPlayer1.anInt628,
						AbstractClass2Sub1.staticPlayer1.anInt591, staticInt171);
				staticInt171 = 0;
			} else if (staticInt165 == 40) {
				Static.staticMethod337(
						"Connection lost" + Static.staticString17 + "Please wait - attempting to reestablish", false);
			} else if (staticInt165 == 45) {
				Static.staticMethod337("Please wait...", false);
			}
		} else {
			Static.staticMethod134(GraphicsBuffer.staticRasterizer2DSub2Sub1_1, NodeSub4.staticRasterizer2DSub2Sub1_3,
					DataClass9.staticRasterizer2DSub2Sub1_2, var3);
		}

		Graphics var22;
		if (staticInt165 == 30 && staticInt286 == 0 && !var3) {
			try {
				var22 = Class38.staticCanvas1.getGraphics();

				for (var21 = 0; var21 < staticInt162; var21++) {
					if (staticBoolArray6[var21]) {
						CacheableSub2.staticGraphicsBuffer1.method280(var22, staticIntArray82[var21],
								staticIntArray88[var21], staticIntArray107[var21], staticIntArray106[var21]);
						staticBoolArray6[var21] = false;
					}
				}
			} catch (Exception var19) {
				Class38.staticCanvas1.repaint();
			}
		} else if (staticInt165 > 0) {
			try {
				var22 = Class38.staticCanvas1.getGraphics();
				CacheableSub2.staticGraphicsBuffer1.method279(var22, 0, 0);

				for (var21 = 0; var21 < staticInt162; var21++) {
					staticBoolArray6[var21] = false;
				}
			} catch (Exception var181) {
				Class38.staticCanvas1.repaint();
			}
		}

	}

	void method313() {
		if (Static.staticInt131 >= 4) {
			method205("js5crc");
			staticInt165 = 1000;
		} else {
			if (Static.staticInt135 >= 4) {
				if (staticInt165 <= 5) {
					method205("js5io");
					staticInt165 = 1000;
					return;
				}

				staticInt181 = 3000;
				Static.staticInt135 = 3;
			}

			if (--staticInt181 + 1 <= 0) {
				try {
					if (staticInt271 == 0) {
						FileOnDisk.staticTask1 = BufferedFile.staticTaskManager1.method93(DataClass5.staticString21,
								DataClass7.staticInt73 * 462737933);
						++staticInt271;
					}

					if (staticInt271 == 1) {
						if (FileOnDisk.staticTask1.anInt86 == 2) {
							method312(-1);
							return;
						}

						if (FileOnDisk.staticTask1.anInt86 == 1) {
							++staticInt271;
						}
					}

					if (staticInt271 == 2) {
						Item.staticConnection4 = new Connection((Socket) FileOnDisk.staticTask1.anObject2,
								BufferedFile.staticTaskManager1);
						ByteBuf var2 = new ByteBuf(5);
						var2.writeByte(15);
						var2.writeInt(138);
						Item.staticConnection4.write(var2.buf, 0, 5);
						++staticInt271;
						Class60.staticLong9 = Static.staticMethod297();
					}

					if (staticInt271 == 3) {
						if (staticInt165 > 5 && Item.staticConnection4.available() <= 0) {
							if (Static.staticMethod297() - Class60.staticLong9 > 30000L) {
								method312(-2);
								return;
							}
						} else {
							int var3 = Item.staticConnection4.read();
							if (var3 != 0) {
								method312(var3);
								return;
							}

							++staticInt271;
						}
					}

					if (staticInt271 == 4) {
						Static.staticMethod163(Item.staticConnection4, staticInt165 > 20);
						FileOnDisk.staticTask1 = null;
						Item.staticConnection4 = null;
						staticInt271 = 0;
						staticInt182 = 0;
					}
				} catch (IOException var21) {
					method312(-3);
				}
			}
		}

	}

}
