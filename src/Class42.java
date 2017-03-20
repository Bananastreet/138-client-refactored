import java.util.Iterator;

public class Class42 implements Iterator {

	Cacheable aCacheable4;
	Cacheable aCacheable3 = null;
	Class45 aClass45_1;

	public Object next() {
		Cacheable var1 = aCacheable4;
		if (var1 == aClass45_1.aCacheable5) {
			var1 = null;
			aCacheable4 = null;
		} else {
			aCacheable4 = var1.aCacheable6;
		}

		aCacheable3 = var1;
		return var1;
	}

	public boolean hasNext() {
		return aCacheable4 != aClass45_1.aCacheable5;
	}

	public void remove() {
		if (aCacheable3 == null) {
			throw new IllegalStateException();
		} else {
			aCacheable3.method314();
			aCacheable3 = null;
		}
	}

	Class42(Class45 var1) {
		aClass45_1 = var1;
		aCacheable4 = aClass45_1.aCacheable5.aCacheable6;
		aCacheable3 = null;
	}

}
