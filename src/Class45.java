import java.util.Iterator;

public class Class45 implements Iterable {

	public Cacheable aCacheable5 = new Cacheable();

	public void method221() {
		while (aCacheable5.aCacheable6 != aCacheable5) {
			aCacheable5.aCacheable6.method314();
		}

	}

	public void method222(Cacheable var1) {
		if (var1.aCacheable7 != null) {
			var1.method314();
		}

		var1.aCacheable7 = aCacheable5.aCacheable7;
		var1.aCacheable6 = aCacheable5;
		var1.aCacheable7.aCacheable6 = var1;
		var1.aCacheable6.aCacheable7 = var1;
	}

	public Iterator iterator() {
		return new Class42(this);
	}

	public Class45() {
		aCacheable5.aCacheable6 = aCacheable5;
		aCacheable5.aCacheable7 = aCacheable5;
	}

}
