public final class Queue {

	Cacheable aCacheable2 = new Cacheable();

	public Cacheable method186() {
		Cacheable var1 = aCacheable2.aCacheable6;
		return var1 == aCacheable2 ? null : var1;
	}

	public void method187(Cacheable var1) {
		if (var1.aCacheable7 != null) {
			var1.method314();
		}

		var1.aCacheable7 = aCacheable2.aCacheable7;
		var1.aCacheable6 = aCacheable2;
		var1.aCacheable7.aCacheable6 = var1;
		var1.aCacheable6.aCacheable7 = var1;
	}

	public void method188(Cacheable var1) {
		if (var1.aCacheable7 != null) {
			var1.method314();
		}

		var1.aCacheable7 = aCacheable2;
		var1.aCacheable6 = aCacheable2.aCacheable6;
		var1.aCacheable7.aCacheable6 = var1;
		var1.aCacheable6.aCacheable7 = var1;
	}

	Cacheable method189() {
		Cacheable var1 = aCacheable2.aCacheable6;
		if (var1 == aCacheable2) {
			return null;
		} else {
			var1.method314();
			return var1;
		}
	}

	public Queue() {
		aCacheable2.aCacheable6 = aCacheable2;
		aCacheable2.aCacheable7 = aCacheable2;
	}

	void method190() {
		while (true) {
			Cacheable var1 = aCacheable2.aCacheable6;
			if (var1 == aCacheable2) {
				return;
			}

			var1.method314();
		}
	}

}
