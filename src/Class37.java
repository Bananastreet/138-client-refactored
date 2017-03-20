import java.util.Iterator;

public class Class37 implements Iterator {

	Node aNode7 = null;
	Node aNode6;
	Class36 aClass36_1;

	public void remove() {
		if (aNode7 == null) {
			throw new IllegalStateException();
		} else {
			aNode7.method174();
			aNode7 = null;
		}
	}

	public Object next() {
		Node var1 = aNode6;
		if (var1 == aClass36_1.aNode4) {
			var1 = null;
			aNode6 = null;
		} else {
			aNode6 = var1.next;
		}

		aNode7 = var1;
		return var1;
	}

	public boolean hasNext() {
		return aNode6 != aClass36_1.aNode4;
	}

	Class37(Class36 var1) {
		aClass36_1 = var1;
		aNode6 = aClass36_1.aNode4.next;
		aNode7 = null;
	}

}
