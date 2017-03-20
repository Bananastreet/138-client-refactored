import java.util.Iterator;

public class Class36 implements Iterable {

	Node aNode5;
	Node aNode4 = new Node();

	public Node method160() {
		return method161((Node) null);
	}

	Node method161(Node var1) {
		Node var2;
		if (var1 == null) {
			var2 = aNode4.next;
		} else {
			var2 = var1;
		}

		if (var2 == aNode4) {
			aNode5 = null;
			return null;
		} else {
			aNode5 = var2.next;
			return var2;
		}
	}

	public boolean method162() {
		return aNode4.next == aNode4;
	}

	public Iterator iterator() {
		return new Class37(this);
	}

	public void method163(Node var1) {
		if (var1.prev != null) {
			var1.method174();
		}

		var1.prev = aNode4;
		var1.next = aNode4.next;
		var1.prev.next = var1;
		var1.next.prev = var1;
	}

	public Class36() {
		aNode4.next = aNode4;
		aNode4.prev = aNode4;
	}

	public Node method164() {
		Node var1 = aNode5;
		if (var1 == aNode4) {
			aNode5 = null;
			return null;
		} else {
			aNode5 = var1.next;
			return var1;
		}
	}

	public void method165(Node var1) {
		if (var1.prev != null) {
			var1.method174();
		}

		var1.prev = aNode4.prev;
		var1.next = aNode4;
		var1.prev.next = var1;
		var1.next.prev = var1;
	}

}
