public final class Rasterizer2DSub2Sub1 extends Rasterizer2DSub2 {

	public Rasterizer2DSub2Sub1(byte[] var1) {
		super(var1);
	}

	final void method627(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var2 + var3 * staticInt330;
		int var9 = staticInt330 - var4;
		int var10 = 0;
		int var11 = 0;
		int var8;
		if (var3 < staticInt328) {
			var8 = staticInt328 - var3;
			var5 -= var8;
			var3 = staticInt328;
			var11 += var8 * var4;
			var7 += var8 * staticInt330;
		}

		if (var3 + var5 > staticInt325) {
			var5 -= var3 + var5 - staticInt325;
		}

		if (var2 < staticInt329) {
			var8 = staticInt329 - var2;
			var4 -= var8;
			var2 = staticInt329;
			var11 += var8;
			var7 += var8;
			var10 += var8;
			var9 += var8;
		}

		if (var2 + var4 > staticInt327) {
			var8 = var2 + var4 - staticInt327;
			var4 -= var8;
			var10 += var8;
			var9 += var8;
		}

		if (var4 > 0 && var5 > 0) {
			Static.staticMethod458(staticIntArray130, var1, var6, var11, var7, var4, var5, var9, var10);
		}

	}

	final void method623(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var2 + var3 * staticInt330;
		int var9 = staticInt330 - var4;
		int var11 = 0;
		int var12 = 0;
		int var10;
		if (var3 < staticInt328) {
			var10 = staticInt328 - var3;
			var5 -= var10;
			var3 = staticInt328;
			var12 += var10 * var4;
			var8 += var10 * staticInt330;
		}

		if (var3 + var5 > staticInt325) {
			var5 -= var3 + var5 - staticInt325;
		}

		if (var2 < staticInt329) {
			var10 = staticInt329 - var2;
			var4 -= var10;
			var2 = staticInt329;
			var12 += var10;
			var8 += var10;
			var11 += var10;
			var9 += var10;
		}

		if (var2 + var4 > staticInt327) {
			var10 = var2 + var4 - staticInt327;
			var4 -= var10;
			var11 += var10;
			var9 += var10;
		}

		if (var4 > 0 && var5 > 0) {
			Static.staticMethod460(staticIntArray130, var1, var6, var12, var8, var4, var5, var9, var11, var7);
		}

	}

	public Rasterizer2DSub2Sub1(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6,
			byte[][] var7) {
		super(var1, var2, var3, var4, var5, var6, var7);
	}

}
