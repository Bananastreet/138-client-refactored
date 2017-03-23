import java.math.BigInteger;

public class Stream extends Node {

	static Class19 staticClass19_2;
	static int[] staticIntArray124 = new int[256];
	static long[] staticLongArray4;
	public byte[] buf;
	public int position;	

	static {
		int var5;
		for (int var3 = 0; var3 < 256; var3++) {
			int var2 = var3;

			for (var5 = 0; var5 < 8; var5++) {
				if ((var2 & 0x1) == 1) {
					var2 = var2 >>> 1 ^ -306674912;
				} else {
					var2 >>>= 1;
				}
			}

			staticIntArray124[var3] = var2;
		}

		staticLongArray4 = new long[256];

		for (var5 = 0; var5 < 256; var5++) {
			long var4 = var5;

			for (int var0 = 0; var0 < 8; var0++) {
				if ((var4 & 0x1) == 1L) {
					var4 = var4 >>> 1 ^ -3932672073523589310L;
				} else {
					var4 >>>= 1;
				}
			}

			staticLongArray4[var5] = var4;
		}

	}

	public Stream(byte[] var1) {
		buf = var1;
		position = 0;
	}

	public void writeShort(int var1) {
		buf[position++] = (byte) (var1 >> 8);
		buf[position++] = (byte) var1;
	}

	public void writeTriByte(int var1) {
		buf[position++] = (byte) (var1 >> 16);
		buf[position++] = (byte) (var1 >> 8);
		buf[position++] = (byte) var1;
	}

	public void writeInt(int var1) {
		buf[position++] = (byte) (var1 >> 24);
		buf[position++] = (byte) (var1 >> 16);
		buf[position++] = (byte) (var1 >> 8);
		buf[position++] = (byte) var1;
	}

	public void writeHexByte(long var1) {
		buf[position++] = (byte) (int) (var1 >> 40);
		buf[position++] = (byte) (int) (var1 >> 32);
		buf[position++] = (byte) (int) (var1 >> 24);
		buf[position++] = (byte) (int) (var1 >> 16);
		buf[position++] = (byte) (int) (var1 >> 8);
		buf[position++] = (byte) (int) var1;
	}

	public void method322(int[] var1) {
		int var2 = position / 8;
		position = 0;

		for (int var3 = 0; var3 < var2; var3++) {
			int var7 = readInt();
			int var6 = readInt();
			int var4 = -957401312;
			int var5 = -1640531527;

			for (int var8 = 32; var8-- > 0; var7 -= (var6 << 4 ^ var6 >>> 5) + var6 ^ var1[var4 & 0x3] + var4) {
				var6 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var4 >>> 11 & 0x3] + var4;
				var4 -= var5;
			}

			position -= 8;
			writeInt(var7);
			writeInt(var6);
		}

	}

	public void method323(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			position += Static.staticMethod214(var1, 0, var1.length(), buf, position);
			buf[position++] = 0;
		}
	}

	public void method324(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			buf[position++] = 0;
			position += Static.staticMethod214(var1, 0, var1.length(), buf, position);
			buf[position++] = 0;
		}
	}

	public void method325(CharSequence var1) {
		int var2 = var1.length();
		int var5 = 0;

		for (int var3 = 0; var3 < var2; var3++) {
			char var4 = var1.charAt(var3);
			if (var4 <= 127) {
				++var5;
			} else if (var4 <= 2047) {
				var5 += 2;
			} else {
				var5 += 3;
			}
		}

		buf[position++] = 0;
		method329(var5);
		position += Static.staticMethod71(buf, position, var1);
	}

	public void writeBytes(byte[] var1, int var2, int var3) {		
		for (int var4 = var2; var4 < var3 + var2; var4++) {
			buf[position++] = var1[var4];
		}

	}

	public void method327(int var1) {
		buf[position - var1 - 1] = (byte) var1;
	}

	public void method328(int var1) {
		if (var1 >= 0 && var1 < 128) {
			writeByte(var1);
		} else {
			if (var1 < 0 || var1 >= '\u8000') {
				throw new IllegalArgumentException();
			}

			writeShort('\u8000' + var1);
		}

	}

	public void method329(int var1) {
		if ((var1 & 0xffffff80) != 0) {
			if ((var1 & 0xffffc000) != 0) {
				if ((var1 & 0xffe00000) != 0) {
					if ((var1 & 0xf0000000) != 0) {
						writeByte(var1 >>> 28 | 128);
					}

					writeByte(var1 >>> 21 | 128);
				}

				writeByte(var1 >>> 14 | 128);
			}

			writeByte(var1 >>> 7 | 128);
		}

		writeByte(var1 & 0x7f);
	}

	public byte readByte() {
		return buf[position++];
	}

	public int readTriByte() {
		position += 3;
		return (buf[position - 1] & 0xff) + ((buf[position - 2] & 0xff) << 8) + ((buf[position - 3] & 0xff) << 16);
	}

	public int readInt() {
		position += 4;
		return ((buf[position - 4] & 0xff) << 24) + ((buf[position - 3] & 0xff) << 16) + ((buf[position - 2] & 0xff) << 8)
				+ (buf[position - 1] & 0xff);
	}

	public long readLong() {
		long var1 = readInt() & 0xffffffffffffffffL;
		long var3 = readInt() & 0xffffffffffffffffL;
		return (var1 << 32) + var3;
	}

	public String method334() {
		if (buf[position] == 0) {
			++position;
			return null;
		} else {
			return method365();
		}
	}

	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; var4++) {
			var1[var4] = buf[position++];
		}

	}

	public void writeByte(int var1) {
		buf[position++] = (byte) var1;
	}

	public int method337() {
		return buf[position] < 0 ? readInt() & 0x7fffffff : method370();
	}

	public int method338() {
		if (buf[position] < 0) {
			return readInt() & 0x7fffffff;
		} else {
			int var1 = method370();
			return var1 == 32767 ? -1 : var1;
		}
	}

	public int method339() {
		byte var1 = buf[position++];

		int var2;
		for (var2 = 0; var1 < 0; var1 = buf[position++]) {
			var2 = (var2 | var1 & 0x7f) << 7;
		}

		return var2 | var1;
	}

	public String method340() {
		byte var1 = buf[position++];
		if (var1 != 0) {
			throw new IllegalStateException("");
		} else {
			int var6 = method339();
			if (position + var6 > buf.length) {
				throw new IllegalStateException("");
			} else {
				byte[] var2 = buf;
				int var7 = position;
				char[] var3 = new char[var6];
				int var4 = 0;
				int var9 = var7;

				int var11;
				for (int var5 = var6 + var7; var9 < var5; var3[var4++] = (char) var11) {
					int var10 = var2[var9++] & 0xff;
					if (var10 < 128) {
						if (var10 == 0) {
							var11 = '\ufffd';
						} else {
							var11 = var10;
						}
					} else if (var10 < 192) {
						var11 = '\ufffd';
					} else if (var10 < 224) {
						if (var9 < var5 && (var2[var9] & 0xc0) == 128) {
							var11 = (var10 & 0x1f) << 6 | var2[var9++] & 0x3f;
							if (var11 < 128) {
								var11 = '\ufffd';
							}
						} else {
							var11 = '\ufffd';
						}
					} else if (var10 < 240) {
						if (1 + var9 < var5 && (var2[var9] & 0xc0) == 128 && (var2[1 + var9] & 0xc0) == 128) {
							var11 = (var10 & 0xf) << 12 | (var2[var9++] & 0x3f) << 6 | var2[var9++] & 0x3f;
							if (var11 < 2048) {
								var11 = '\ufffd';
							}
						} else {
							var11 = '\ufffd';
						}
					} else if (var10 < 248) {
						if (var9 + 2 < var5 && (var2[var9] & 0xc0) == 128 && (var2[var9 + 1] & 0xc0) == 128
								&& (var2[var9 + 2] & 0xc0) == 128) {
							var11 = (var10 & 0x7) << 18 | (var2[var9++] & 0x3f) << 12 | (var2[var9++] & 0x3f) << 6
									| var2[var9++] & 0x3f;
							if (var11 >= 65536 && var11 <= 1114111) {
								var11 = '\ufffd';
							} else {
								var11 = '\ufffd';
							}
						} else {
							var11 = '\ufffd';
						}
					} else {
						var11 = '\ufffd';
					}
				}

				String var111 = new String(var3, 0, var4);
				position += var6;
				return var111;
			}
		}
	}

	public void method341(int[] var1, int var2, int var3) {
		int var4 = position;
		position = var2;
		int var6 = (var3 - var2) / 8;

		for (int var5 = 0; var5 < var6; var5++) {
			int var11 = readInt();
			int var7 = readInt();
			int var8 = 0;
			int var9 = -1640531527;

			for (int var10 = 32; var10-- > 0; var7 += var11 + (var11 << 4 ^ var11 >>> 5)
					^ var1[var8 >>> 11 & 0x3] + var8) {
				var11 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var8 & 0x3] + var8;
				var8 += var9;
			}

			position -= 8;
			writeInt(var11);
			writeInt(var7);
		}

		position = var4;
	}

	public void encryptRSA(BigInteger var1, BigInteger var2) {		
		int var3 = position;
		position = 0;
		byte[] var6 = new byte[var3];
		readBytes(var6, 0, var3);
		BigInteger var4 = new BigInteger(var6);
		BigInteger var5 = var4.modPow(var1, var2);
		byte[] var7 = var5.toByteArray();
		position = 0;
		writeShort(var7.length);
		writeBytes(var7, 0, var7.length);
	}

	public void method343(int var1) {
		buf[position++] = (byte) (128 + var1);
	}

	public void method344(long var1) {
		buf[position++] = (byte) (int) (var1 >> 56);
		buf[position++] = (byte) (int) (var1 >> 48);
		buf[position++] = (byte) (int) (var1 >> 40);
		buf[position++] = (byte) (int) (var1 >> 32);
		buf[position++] = (byte) (int) (var1 >> 24);
		buf[position++] = (byte) (int) (var1 >> 16);
		buf[position++] = (byte) (int) (var1 >> 8);
		buf[position++] = (byte) (int) var1;
	}

	public void method345(int var1) {
		buf[position++] = (byte) (128 - var1);
	}

	public int method346() {
		return buf[position++] - 128 & 0xff;
	}

	public void method347(int[] var1) {
		int var2 = position / 8;
		position = 0;

		for (int var4 = 0; var4 < var2; var4++) {
			int var5 = readInt();
			int var7 = readInt();
			int var3 = 0;
			int var6 = -1640531527;

			for (int var8 = 32; var8-- > 0; var7 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var3 >>> 11 & 0x3] + var3) {
				var5 += (var7 << 4 ^ var7 >>> 5) + var7 ^ var3 + var1[var3 & 0x3];
				var3 += var6;
			}

			position -= 8;
			writeInt(var5);
			writeInt(var7);
		}

	}

	public int method348() {
		return 128 - buf[position++] & 0xff;
	}

	public byte method349() {
		return (byte) (buf[position++] - 128);
	}

	public byte method350() {
		return (byte) (128 - buf[position++]);
	}

	public void method351(int var1) {
		buf[position++] = (byte) var1;
		buf[position++] = (byte) (var1 >> 8);
	}

	public void method352(int var1) {
		buf[position++] = (byte) (var1 >> 8);
		buf[position++] = (byte) (128 + var1);
	}

	public int method353() {
		position += 2;
		return (buf[position - 2] & 0xff) + ((buf[position - 1] & 0xff) << 8);
	}

	public int method354() {
		position += 4;
		return ((buf[position - 3] & 0xff) << 24) + ((buf[position - 4] & 0xff) << 16) + ((buf[position - 1] & 0xff) << 8)
				+ (buf[position - 2] & 0xff);
	}

	public int method355() {
		position += 2;
		return ((buf[position - 1] & 0xff) << 8) + (buf[position - 2] - 128 & 0xff);
	}

	public int method356() {
		position += 2;
		int var1 = ((buf[position - 1] & 0xff) << 8) + (buf[position - 2] - 128 & 0xff);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	public void method357(int var1) {
		buf[position++] = (byte) var1;
		buf[position++] = (byte) (var1 >> 8);
		buf[position++] = (byte) (var1 >> 16);
	}

	public int method358() {
		position += 3;
		return ((buf[position - 3] & 0xff) << 8) + ((buf[position - 2] & 0xff) << 16) + (buf[position - 1] & 0xff);
	}

	public void method359(int var1) {
		buf[position++] = (byte) var1;
		buf[position++] = (byte) (var1 >> 8);
		buf[position++] = (byte) (var1 >> 16);
		buf[position++] = (byte) (var1 >> 24);
	}

	public void method360(int var1) {
		buf[position++] = (byte) (var1 >> 8);
		buf[position++] = (byte) var1;
		buf[position++] = (byte) (var1 >> 24);
		buf[position++] = (byte) (var1 >> 16);
	}

	public void method361(int var1) {
		buf[position++] = (byte) (var1 >> 16);
		buf[position++] = (byte) (var1 >> 24);
		buf[position++] = (byte) var1;
		buf[position++] = (byte) (var1 >> 8);
	}

	public int method362() {
		position += 4;
		return (buf[position - 4] & 0xff) + ((buf[position - 2] & 0xff) << 16) + ((buf[position - 1] & 0xff) << 24)
				+ ((buf[position - 3] & 0xff) << 8);
	}

	public Stream(int var1) {
		buf = Static.staticMethod151(var1);
		position = 0;
	}

	public boolean method363() {
		position -= 4;
		byte[] var2 = buf;
		int var5 = position;
		int var1 = -1;

		int var3;
		for (var3 = 0; var3 < var5; var3++) {
			var1 = var1 >>> 8 ^ staticIntArray124[(var1 ^ var2[var3]) & 0xff];
		}

		var1 = ~var1;
		var3 = readInt();
		return var1 == var3;
	}

	public int method364() {
		position += 2;
		int var1 = ((buf[position - 2] & 0xff) << 8) + (buf[position - 1] & 0xff);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	public String method365() {
		int var1 = position;

		while (buf[position++] != 0) {
			;
		}

		int var2 = position - var1 - 1;
		return var2 == 0 ? "" : Static.staticMethod227(buf, var1, var2);
	}

	public int method366() {
		int var1 = buf[position] & 0xff;
		return var1 < 128 ? method367() - 64 : method370() - '\uc000';
	}

	public int method367() {
		return buf[position++] & 0xff;
	}

	public byte method368() {
		return (byte) (0 - buf[position++]);
	}

	public void method369(int var1) {
		buf[position++] = (byte) (var1 + 128);
		buf[position++] = (byte) (var1 >> 8);
	}

	public int method370() {
		position += 2;
		return ((buf[position - 2] & 0xff) << 8) + (buf[position - 1] & 0xff);
	}

	public void method371(int var1) {
		buf[position - var1 - 2] = (byte) (var1 >> 8);
		buf[position - var1 - 1] = (byte) var1;
	}

	public int method372() {
		position += 2;
		return ((buf[position - 2] & 0xff) << 8) + (buf[position - 1] - 128 & 0xff);
	}

	public void method373(int var1) {
		buf[position++] = (byte) (0 - var1);
	}

	public String method374() {
		byte var1 = buf[position++];
		if (var1 != 0) {
			throw new IllegalStateException("");
		} else {
			int var2 = position;

			while (buf[position++] != 0) {
				;
			}

			int var3 = position - var2 - 1;
			return var3 == 0 ? "" : Static.staticMethod227(buf, var2, var3);
		}
	}

	public void method375(int var1) {
		buf[position - var1 - 4] = (byte) (var1 >> 24);
		buf[position - var1 - 3] = (byte) (var1 >> 16);
		buf[position - var1 - 2] = (byte) (var1 >> 8);
		buf[position - var1 - 1] = (byte) var1;
	}

	public int method376(int var1) {
		byte[] var2 = buf;
		int var5 = position;
		int var4 = -1;

		for (int var3 = var1; var3 < var5; var3++) {
			var4 = var4 >>> 8 ^ staticIntArray124[(var4 ^ var2[var3]) & 0xff];
		}

		var4 = ~var4;
		writeInt(var4);
		return var4;
	}

	public int method377() {
		return 0 - buf[position++] & 0xff;
	}

	public int method378() {
		position += 4;
		return ((buf[position - 4] & 0xff) << 8) + ((buf[position - 2] & 0xff) << 24) + ((buf[position - 1] & 0xff) << 16)
				+ (buf[position - 3] & 0xff);
	}

	public int method379() {
		int var1 = buf[position] & 0xff;
		return var1 < 128 ? method367() : method370() - '\u8000';
	}

	public void method380(int[] var1, int var2, int var3) {
		int var4 = position;
		position = var2;
		int var5 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var5; var6++) {
			int var7 = readInt();
			int var9 = readInt();
			int var8 = -957401312;
			int var11 = -1640531527;

			for (int var10 = 32; var10-- > 0; var7 -= var9 + (var9 << 4 ^ var9 >>> 5) ^ var1[var8 & 0x3] + var8) {
				var9 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var8 + var1[var8 >>> 11 & 0x3];
				var8 -= var11;
			}

			position -= 8;
			writeInt(var7);
			writeInt(var9);
		}

		position = var4;
	}

}
