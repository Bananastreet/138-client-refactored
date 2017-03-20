public class Rasterizer2DSub1 extends Rasterizer2D {

	static int staticInt341;
	static int staticInt343;
	static int staticInt344;
	static int staticInt345;
	static int staticInt346;
	static int staticInt347;
	public static Interface2 staticInterface2_1;
	static int staticInt348;
	static int staticInt349;
	static boolean staticBool51 = false;
	static boolean staticBool49 = false;
	static boolean staticBool50 = false;
	public static boolean staticBool48 = true;
	static int staticInt340 = 0;
	public static int staticInt342 = 512;
	static int[] staticIntArray158 = new int[1024];
	public static int[] staticIntArray155 = new int[65536];
	static int[] staticIntArray156 = new int[512];
	static int[] staticIntArray157 = new int[2048];
	public static int[] staticIntArray154 = new int[2048];
	public static int[] staticIntArray159 = new int[2048];

	static {
		int var0;
		for (var0 = 1; var0 < 512; var0++) {
			staticIntArray156[var0] = '\u8000' / var0;
		}

		for (var0 = 1; var0 < 2048; var0++) {
			staticIntArray157[var0] = 65536 / var0;
		}

		for (var0 = 0; var0 < 2048; var0++) {
			staticIntArray154[var0] = (int) (65536.0D * Math.sin(var0 * 0.0030679615D));
			staticIntArray159[var0] = (int) (65536.0D * Math.cos(var0 * 0.0030679615D));
		}

	}

	Rasterizer2DSub1() throws Throwable {
		throw new Error();
	}

}
