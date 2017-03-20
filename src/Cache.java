public final class Cache {

	int anInt151;
	Cacheable aCacheable1 = new Cacheable();
	Queue aQueue1 = new Queue();
	int anInt150;
	HashTable aHashTable3;

	public Cacheable get(long var1) {
		Cacheable var3 = (Cacheable) aHashTable3.method149(var1);
		if (var3 != null) {
			aQueue1.method187(var3);
		}

		return var3;
	}

	public void method169(long var1) {
		Cacheable var3 = (Cacheable) aHashTable3.method149(var1);
		if (var3 != null) {
			var3.method174();
			var3.method314();
			++anInt151;
		}

	}

	public void method170(Cacheable var1, long var2) {
		if (anInt151 == 0) {
			Cacheable var4 = aQueue1.method189();
			var4.method174();
			var4.method314();
			if (var4 == aCacheable1) {
				var4 = aQueue1.method189();
				var4.method174();
				var4.method314();
			}
		} else {
			--anInt151;
		}

		aHashTable3.method148(var1, var2);
		aQueue1.method187(var1);
	}

	public void method171() {
		aQueue1.method190();
		aHashTable3.method145();
		aCacheable1 = new Cacheable();
		anInt151 = anInt150;
	}

	public Cache(int var1) {
		anInt150 = var1;
		anInt151 = var1;

		int var2;
		for (var2 = 1; var2 + var2 < var1; var2 += var2) {
			;
		}

		aHashTable3 = new HashTable(var2);
	}

}
