public class Class10 {

	HashTable aHashTable1 = new HashTable(256);
	HashTable aHashTable2 = new HashTable(256);
	Js5Index aJs5Index2;
	Js5Index aJs5Index1;

	NodeSub6Sub1 method28(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 0xffff | var1 >>> 12);
		var4 |= var1 << 16;
		long var5 = var4;
		NodeSub6Sub1 var7 = (NodeSub6Sub1) aHashTable2.method149(var5);
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			Class9 var8 = Static.staticMethod52(aJs5Index2, var1, var2);
			if (var8 == null) {
				return null;
			} else {
				var7 = var8.method25();
				aHashTable2.method148(var7, var5);
				if (var3 != null) {
					var3[0] -= var7.aByteArray23.length;
				}

				return var7;
			}
		}
	}

	public NodeSub6Sub1 method29(int var1, int[] var2) {
		if (aJs5Index1.method264() == 1) {
			return method31(0, var1, var2);
		} else if (aJs5Index1.method263(var1) == 1) {
			return method31(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	public NodeSub6Sub1 method30(int var1, int[] var2) {
		if (aJs5Index2.method264() == 1) {
			return method28(0, var1, var2);
		} else if (aJs5Index2.method263(var1) == 1) {
			return method28(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	NodeSub6Sub1 method31(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 0xffff | var1 >>> 12);
		var4 |= var1 << 16;
		long var7 = var4 ^ 4294967296L;
		NodeSub6Sub1 var5 = (NodeSub6Sub1) aHashTable2.method149(var7);
		if (var5 != null) {
			return var5;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			NodeSub5 var6 = (NodeSub5) aHashTable1.method149(var7);
			if (var6 == null) {
				var6 = Static.staticMethod291(aJs5Index1, var1, var2);
				if (var6 == null) {
					return null;
				}

				aHashTable1.method148(var6, var7);
			}

			var5 = var6.method298(var3);
			if (var5 == null) {
				return null;
			} else {
				var6.method174();
				aHashTable2.method148(var5, var7);
				return var5;
			}
		}
	}

	public Class10(Js5Index var1, Js5Index var2) {
		aJs5Index2 = var1;
		aJs5Index1 = var2;
	}

}
