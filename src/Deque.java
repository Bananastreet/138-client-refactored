public class Deque {

	Node aNode8;
	public Node aNode9 = new Node();

	public void method191() {
		while (true) {
			Node var1 = aNode9.next;
			if (var1 == aNode9) {
				aNode8 = null;
				return;
			}

			var1.method174();
		}
	}

	public void method192(Node var1) {
		if (var1.prev != null) {
			var1.method174();
		}

		var1.prev = aNode9;
		var1.next = aNode9.next;
		var1.prev.next = var1;
		var1.next.prev = var1;
	}

	public Node method193() {
		Node var1 = aNode8;
		if (var1 == aNode9) {
			aNode8 = null;
			return null;
		} else {
			aNode8 = var1.next;
			return var1;
		}
	}

	public Node method194() {
		Node var1 = aNode9.next;
		if (var1 == aNode9) {
			return null;
		} else {
			var1.method174();
			return var1;
		}
	}

	public Node method195() {
		Node var1 = aNode9.next;
		if (var1 == aNode9) {
			aNode8 = null;
			return null;
		} else {
			aNode8 = var1.next;
			return var1;
		}
	}

	public Node method196() {
		Node var1 = aNode9.prev;
		if (var1 == aNode9) {
			aNode8 = null;
			return null;
		} else {
			aNode8 = var1.prev;
			return var1;
		}
	}

	public Node method197() {
		Node var1 = aNode8;
		if (var1 == aNode9) {
			aNode8 = null;
			return null;
		} else {
			aNode8 = var1.prev;
			return var1;
		}
	}

	public void method198(Node var1) {
		if (var1.prev != null) {
			var1.method174();
		}

		var1.prev = aNode9.prev;
		var1.next = aNode9;
		var1.prev.next = var1;
		var1.next.prev = var1;
	}

	public Node method199() {
		Node var1 = aNode9.prev;
		if (var1 == aNode9) {
			return null;
		} else {
			var1.method174();
			return var1;
		}
	}

	public Deque() {
		aNode9.next = aNode9;
		aNode9.prev = aNode9;
	}

}
