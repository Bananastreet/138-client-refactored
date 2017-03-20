public class NodeSub8Sub1 extends NodeSub8 {

	int anInt403 = -1;
	int anInt402 = 0;
	Class39 aClass39_2 = new Class39();
	Class39 aClass39_3 = new Class39();

	public final synchronized void method406(NodeSub8 var1) {
		var1.method174();
	}

	void method407(Node var1, NodeSub7 var2) {
		while (var1 != aClass39_3.aNode9 && ((NodeSub7) var1).anInt242 <= var2.anInt242) {
			var1 = var1.next;
		}

		Static.staticMethod138(var2, var1);
		anInt403 = ((NodeSub7) aClass39_3.aNode9.next).anInt242;
	}

	protected NodeSub8 method302() {
		return (NodeSub8) aClass39_2.method195();
	}

	protected NodeSub8 method303() {
		return (NodeSub8) aClass39_2.method193();
	}

	protected int method304() {
		return 0;
	}

	public final synchronized void method306(int[] var1, int var2, int var3) {
		do {
			if (anInt403 < 0) {
				method410(var1, var2, var3);
				return;
			}

			if (anInt402 + var3 < anInt403) {
				anInt402 += var3;
				method410(var1, var2, var3);
				return;
			}

			int var4 = anInt403 - anInt402;
			method410(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			anInt402 += var4;
			method412();
			NodeSub7 var5 = (NodeSub7) aClass39_3.method195();
			synchronized (var5) {
				int var7 = var5.method299(this);
				if (var7 < 0) {
					var5.anInt242 = 0;
					method411(var5);
				} else {
					var5.anInt242 = var7;
					method407(var5.next, var5);
				}
			}
		} while (var3 != 0);

	}

	public final synchronized void method408(NodeSub8 var1) {
		aClass39_2.method192(var1);
	}

	public final synchronized void method305(int var1) {
		do {
			if (anInt403 < 0) {
				method409(var1);
				return;
			}

			if (anInt402 + var1 < anInt403) {
				anInt402 += var1;
				method409(var1);
				return;
			}

			int var2 = anInt403 - anInt402;
			method409(var2);
			var1 -= var2;
			anInt402 += var2;
			method412();
			NodeSub7 var3 = (NodeSub7) aClass39_3.method195();
			synchronized (var3) {
				int var5 = var3.method299(this);
				if (var5 < 0) {
					var3.anInt242 = 0;
					method411(var3);
				} else {
					var3.anInt242 = var5;
					method407(var3.next, var3);
				}
			}
		} while (var1 != 0);

	}

	void method409(int var1) {
		for (NodeSub8 var2 = (NodeSub8) aClass39_2.method195(); var2 != null; var2 = (NodeSub8) aClass39_2
				.method193()) {
			var2.method305(var1);
		}

	}

	void method410(int[] var1, int var2, int var3) {
		for (NodeSub8 var4 = (NodeSub8) aClass39_2.method195(); var4 != null; var4 = (NodeSub8) aClass39_2
				.method193()) {
			var4.method307(var1, var2, var3);
		}

	}

	void method411(NodeSub7 var1) {
		var1.method174();
		var1.method300();
		Node var2 = aClass39_3.aNode9.next;
		if (var2 == aClass39_3.aNode9) {
			anInt403 = -1;
		} else {
			anInt403 = ((NodeSub7) var2).anInt242;
		}

	}

	void method412() {
		if (anInt402 > 0) {
			for (NodeSub7 var1 = (NodeSub7) aClass39_3.method195(); var1 != null; var1 = (NodeSub7) aClass39_3
					.method193()) {
				var1.anInt242 -= anInt402;
			}

			anInt403 -= anInt402;
			anInt402 = 0;
		}

	}

}
