public final class HashTable {

	Node aNode1;
	Node aNode2;
	int anInt143 = 0;
	int anInt144;
	Node[] aNodeArray1;

	void method145() {
		for (int var1 = 0; var1 < anInt144; var1++) {
			Node var2 = aNodeArray1[var1];

			while (true) {
				Node var3 = var2.next;
				if (var3 == var2) {
					break;
				}

				var3.method174();
			}
		}

		aNode1 = null;
		aNode2 = null;
	}

	public Node method146() {
		anInt143 = 0;
		return method147();
	}

	public Node method147() {
		Node var1;
		if (anInt143 > 0 && aNode2 != aNodeArray1[anInt143 - 1]) {
			var1 = aNode2;
			aNode2 = var1.next;
			return var1;
		} else {
			while (anInt143 < anInt144) {
				var1 = aNodeArray1[anInt143++].next;
				if (var1 != aNodeArray1[anInt143 - 1]) {
					aNode2 = var1.next;
					return var1;
				}
			}

			return null;
		}
	}

	public HashTable(int var1) {
		anInt144 = var1;
		aNodeArray1 = new Node[var1];

		for (int var2 = 0; var2 < var1; var2++) {
			Node var3 = aNodeArray1[var2] = new Node();
			var3.next = var3;
			var3.prev = var3;
		}

	}

	public void method148(Node var1, long var2) {
		if (var1.prev != null) {
			var1.method174();
		}

		Node var4 = aNodeArray1[(int) (var2 & anInt144 - 1)];
		var1.prev = var4.prev;
		var1.next = var4;
		var1.prev.next = var1;
		var1.next.prev = var1;
		var1.id = var2;
	}

	public Node method149(long var1) {
		Node var3 = aNodeArray1[(int) (var1 & anInt144 - 1)];

		for (aNode1 = var3.next; aNode1 != var3; aNode1 = aNode1.next) {
			if (aNode1.id == var1) {
				Node var4 = aNode1;
				aNode1 = aNode1.next;
				return var4;
			}
		}

		aNode1 = null;
		return null;
	}

}
