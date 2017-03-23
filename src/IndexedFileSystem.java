import java.io.EOFException;
import java.io.IOException;

public final class IndexedFileSystem {

	static byte[] staticByteArray3 = new byte[520];
	BufferedFile aBufferedFile1 = null;
	BufferedFile aBufferedFile2 = null;
	int anInt148 = '\ufde8';
	int anInt147;

	boolean method154(int var1, byte[] var2, int var3, boolean var4) {
		synchronized (aBufferedFile1) {
			try {
				int var15;
				boolean var10000;
				boolean var100001;
				if (var4) {
					if (aBufferedFile2.method57() < 6 + var1 * 6) {
						var10000 = false;
						var100001 = var10000;
						return var100001;
					}

					aBufferedFile2.seek(var1 * 6);
					aBufferedFile2.method58(staticByteArray3, 0, 6);
					var15 = (staticByteArray3[5] & 0xff) + ((staticByteArray3[4] & 0xff) << 8)
							+ ((staticByteArray3[3] & 0xff) << 16);
					if (var15 <= 0 || var15 > aBufferedFile1.method57() / 520L) {
						var10000 = false;
						var100001 = var10000;
						return var100001;
					}
				} else {
					var15 = (int) ((aBufferedFile1.method57() + 519L) / 520L);
					if (var15 == 0) {
						var15 = 1;
					}
				}

				staticByteArray3[0] = (byte) (var3 >> 16);
				staticByteArray3[1] = (byte) (var3 >> 8);
				staticByteArray3[2] = (byte) var3;
				staticByteArray3[3] = (byte) (var15 >> 16);
				staticByteArray3[4] = (byte) (var15 >> 8);
				staticByteArray3[5] = (byte) var15;
				aBufferedFile2.seek(var1 * 6);
				aBufferedFile2.method55(staticByteArray3, 0, 6);
				int var7 = 0;
				int var8 = 0;

				while (true) {
					if (var7 < var3) {
						label129: {
							int var9 = 0;
							int var10;
							if (var4) {
								aBufferedFile1.seek(var15 * 520);

								try {
									aBufferedFile1.method58(staticByteArray3, 0, 8);
								} catch (EOFException var151) {
									break label129;
								}

								var10 = ((staticByteArray3[0] & 0xff) << 8) + (staticByteArray3[1] & 0xff);
								int var11 = ((staticByteArray3[2] & 0xff) << 8) + (staticByteArray3[3] & 0xff);
								var9 = ((staticByteArray3[5] & 0xff) << 8) + ((staticByteArray3[4] & 0xff) << 16)
										+ (staticByteArray3[6] & 0xff);
								int var12 = staticByteArray3[7] & 0xff;
								if (var10 != var1 || var8 != var11 || var12 != anInt147) {
									var10000 = false;
									var100001 = var10000;
									return var100001;
								}

								if (var9 < 0 || var9 > aBufferedFile1.method57() / 520L) {
									var10000 = false;
									var100001 = var10000;
									return var100001;
								}
							}

							if (var9 == 0) {
								var4 = false;
								var9 = (int) ((aBufferedFile1.method57() + 519L) / 520L);
								if (var9 == 0) {
									++var9;
								}

								if (var15 == var9) {
									++var9;
								}
							}

							if (var3 - var7 <= 512) {
								var9 = 0;
							}

							staticByteArray3[0] = (byte) (var1 >> 8);
							staticByteArray3[1] = (byte) var1;
							staticByteArray3[2] = (byte) (var8 >> 8);
							staticByteArray3[3] = (byte) var8;
							staticByteArray3[4] = (byte) (var9 >> 16);
							staticByteArray3[5] = (byte) (var9 >> 8);
							staticByteArray3[6] = (byte) var9;
							staticByteArray3[7] = (byte) anInt147;
							aBufferedFile1.seek(var15 * 520);
							aBufferedFile1.method55(staticByteArray3, 0, 8);
							var10 = var3 - var7;
							if (var10 > 512) {
								var10 = 512;
							}

							aBufferedFile1.method55(var2, var7, var10);
							var7 += var10;
							var15 = var9;
							++var8;
							continue;
						}
					}

					var10000 = true;
					var100001 = var10000;
					return var100001;
				}
			} catch (IOException var16) {
				return false;
			}
		}
	}

	public byte[] method155(int var1) {
		synchronized (aBufferedFile1) {
			byte[] var10000;
			try {
				Object var15;
				if (aBufferedFile2.method57() < var1 * 6 + 6) {
					var15 = null;
					var10000 = (byte[]) var15;
					return var10000;
				}

				aBufferedFile2.seek(var1 * 6);
				aBufferedFile2.method58(staticByteArray3, 0, 6);
				int var31 = (staticByteArray3[2] & 0xff) + ((staticByteArray3[1] & 0xff) << 8)
						+ ((staticByteArray3[0] & 0xff) << 16);
				int var4 = ((staticByteArray3[4] & 0xff) << 8) + ((staticByteArray3[3] & 0xff) << 16)
						+ (staticByteArray3[5] & 0xff);
				if (var31 < 0 || var31 > anInt148) {
					var15 = null;
					var10000 = (byte[]) var15;
					return var10000;
				}

				if (var4 > 0 && var4 <= aBufferedFile1.method57() / 520L) {
					byte[] var5 = new byte[var31];
					int var6 = 0;
					int var7 = 0;

					while (var6 < var31) {
						if (var4 == 0) {
							var15 = null;
							var10000 = (byte[]) var15;
							return var10000;
						}

						aBufferedFile1.seek(var4 * 520);
						int var17 = var31 - var6;
						if (var17 > 512) {
							var17 = 512;
						}

						aBufferedFile1.method58(staticByteArray3, 0, var17 + 8);
						int var9 = ((staticByteArray3[0] & 0xff) << 8) + (staticByteArray3[1] & 0xff);
						int var10 = ((staticByteArray3[2] & 0xff) << 8) + (staticByteArray3[3] & 0xff);
						int var11 = ((staticByteArray3[5] & 0xff) << 8) + ((staticByteArray3[4] & 0xff) << 16)
								+ (staticByteArray3[6] & 0xff);
						int var12 = staticByteArray3[7] & 0xff;
						if (var9 == var1 && var10 == var7 && anInt147 == var12) {
							if (var11 >= 0 && var11 <= aBufferedFile1.method57() / 520L) {
								for (int var13 = 0; var13 < var17; var13++) {
									var5[var6++] = staticByteArray3[8 + var13];
								}

								var4 = var11;
								++var7;
								continue;
							}

							var15 = null;
							var10000 = (byte[]) var15;
							return var10000;
						}

						var15 = null;
						var10000 = (byte[]) var15;
						return var10000;
					}

					var10000 = var5;
					return var10000;
				}

				var15 = null;
				var10000 = (byte[]) var15;
			} catch (IOException var16) {
				return null;
			}

			return var10000;
		}
	}

	public boolean method156(int var1, byte[] var2, int var3) {
		synchronized (aBufferedFile1) {
			if (var3 >= 0 && var3 <= anInt148) {
				boolean var51 = method154(var1, var2, var3, true);
				if (!var51) {
					var51 = method154(var1, var2, var3, false);
				}

				return var51;
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	public IndexedFileSystem(int var1, BufferedFile var2, BufferedFile var3, int var4) {
		anInt147 = var1;
		aBufferedFile1 = var2;
		aBufferedFile2 = var3;
		anInt148 = var4;
	}

}
