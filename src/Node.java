public class Node {

	public long id;
	public Node next;
	Node prev;

	public void method174() {
		if (prev != null) {
			prev.next = next;
			next.prev = prev;
			next = null;
			prev = null;
		}

	}

	public boolean method175() {
		return prev != null;
	}

}
