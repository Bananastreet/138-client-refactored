import java.util.Iterator;

public class Class44 implements Iterator {

	Node aNode11;
	Node aNode10 = null;
	int anInt188;
	Class35 aClass35_1;

	public Object next() {
		Node var1;
		if (aNode11 != aClass35_1.aNodeArray2[anInt188 - 1]) {
			var1 = aNode11;
			aNode11 = var1.next;
			aNode10 = var1;
			return var1;
		} else {
			while (anInt188 < aClass35_1.anInt149) {
				var1 = aClass35_1.aNodeArray2[anInt188++].next;
				if (var1 != aClass35_1.aNodeArray2[anInt188 - 1]) {
					aNode11 = var1.next;
					aNode10 = var1;
					return var1;
				}
			}

			return null;
		}
	}

	public void remove() {
		if (aNode10 == null) {
			throw new IllegalStateException();
		} else {
			aNode10.method174();
			aNode10 = null;
		}
	}

	Class44(Class35 var1) {
		aClass35_1 = var1;
		method220();
	}

	public boolean hasNext() {
		if (aNode11 != aClass35_1.aNodeArray2[anInt188 - 1]) {
			return true;
		} else {
			while (anInt188 < aClass35_1.anInt149) {
				if (aClass35_1.aNodeArray2[anInt188++].next != aClass35_1.aNodeArray2[anInt188 - 1]) {
					aNode11 = aClass35_1.aNodeArray2[anInt188 - 1].next;
					return true;
				}

				aNode11 = aClass35_1.aNodeArray2[anInt188 - 1];
			}

			return false;
		}
	}

	void method220() {
		aNode11 = aClass35_1.aNodeArray2[0].next;
		anInt188 = 1;
		aNode10 = null;
	}

}
