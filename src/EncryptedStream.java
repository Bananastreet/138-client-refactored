public final class EncryptedStream extends Stream {

	static int staticInt321;
	static final int[] staticIntArray128 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191,
			16383, 32767, '\uffff', 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431,
			67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
	int anInt428;
	Isaac anIsaac1;

	public void method471(int var1) {
		buf[++position - 1] = (byte) (var1 + anIsaac1.method241());
	}

	public int method472() {
		return buf[++position - 1] - anIsaac1.method241() & 0xff;
	}

	public int method473(int var1) {
		return var1 * 8 - anInt428;
	}

	public void method474() {
		position = (7 + anInt428) / 8;
	}

	public void method475() {
		anInt428 = position * 8;
	}

	public void method476(int[] var1) {
		anIsaac1 = new Isaac(var1);
	}

	public int method477(int var1) {
		int var2 = anInt428 >> 3;
		int var3 = 8 - (anInt428 & 0x7);
		int var4 = 0;

		for (anInt428 += var1; var1 > var3; var3 = 8) {
			var4 += (buf[var2++] & staticIntArray128[var3]) << var1 - var3;
			var1 -= var3;
		}

		if (var1 == var3) {
			var4 += buf[var2] & staticIntArray128[var3];
		} else {
			var4 += buf[var2] >> var3 - var1 & staticIntArray128[var1];
		}

		return var4;
	}

	public EncryptedStream(int var1) {
		super(var1);
	}

}
