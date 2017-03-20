import java.util.Iterator;

public final class Class35 implements Iterable {

	int anInt149;
	Node[] aNodeArray2;
	Node aNode3;

	public Class35(int var1) {
		anInt149 = var1;
		aNodeArray2 = new Node[var1];

		for (int var2 = 0; var2 < var1; var2++) {
			Node var3 = aNodeArray2[var2] = new Node();
			var3.next = var3;
			var3.prev = var3;
		}

	}

	public void method157(Node var1, long var2) {
		if (var1.prev != null) {
			var1.method174();
		}

		Node var4 = aNodeArray2[(int) (var2 & anInt149 - 1)];
		var1.prev = var4.prev;
		var1.next = var4;
		var1.prev.next = var1;
		var1.next.prev = var1;
		var1.id = var2;
	}

	public void method158() {
		for (int var1 = 0; var1 < anInt149; var1++) {
			Node var2 = aNodeArray2[var1];

			while (true) {
				Node var3 = var2.next;
				if (var3 == var2) {
					break;
				}

				var3.method174();
			}
		}

		aNode3 = null;
	}

	public Iterator iterator() {
		return new Class44(this);
	}

	public Node method159(long var1) {
		Node var3 = aNodeArray2[(int) (var1 & anInt149 - 1)];

		for (aNode3 = var3.next; aNode3 != var3; aNode3 = aNode3.next) {
			if (aNode3.id == var1) {
				Node var4 = aNode3;
				aNode3 = aNode3.next;
				return var4;
			}
		}

		aNode3 = null;
		return null;
	}

}
