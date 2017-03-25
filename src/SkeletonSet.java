public class SkeletonSet extends Cacheable {

	public static AbstractGraphicsBuffer staticGraphicsBuffer1;
	static int[] staticIntArray127;
	static Sprite staticSprite4;
	AnimationSkeleton[] aClass24Array1;

	public boolean method436(int var1) {
		return aClass24Array1[var1].aBool9;
	}

	SkeletonSet(AbstractFileStore var1, AbstractFileStore var2, int var3, boolean var4) {
		Deque var13 = new Deque();
		int var9 = var1.method263(var3);
		aClass24Array1 = new AnimationSkeleton[var9];
		int[] var5 = var1.method262(var3);

		for (int var6 = 0; var6 < var5.length; var6++) {
			byte[] var7 = var1.getFile(var3, var5[var6]);
			AnimationSkin var8 = null;
			int var10 = (var7[0] & 0xff) << 8 | var7[1] & 0xff;

			for (AnimationSkin var11 = (AnimationSkin) var13.method195(); var11 != null; var11 = (AnimationSkin) var13
					.method193()) {
				if (var10 == var11.anInt248) {
					var8 = var11;
					break;
				}
			}

			if (var8 == null) {
				byte[] var131;
				if (var4) {
					var131 = var2.method261(0, var10);
				} else {
					var131 = var2.method261(var10, 0);
				}

				var8 = new AnimationSkin(var10, var131);
				var13.method198(var8);
			}

			aClass24Array1[var5[var6]] = new AnimationSkeleton(var7, var8);
		}

	}

}
