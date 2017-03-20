public class Class41 {

	Class40 aClass40_3 = new Class40();
	Class40 aClass40_4;

	public Class41() {
		aClass40_3.aClass40_1 = aClass40_3;
		aClass40_3.aClass40_2 = aClass40_3;
	}

	public Class40 method217() {
		Class40 var1 = aClass40_3.aClass40_1;
		if (var1 == aClass40_3) {
			aClass40_4 = null;
			return null;
		} else {
			aClass40_4 = var1.aClass40_1;
			return var1;
		}
	}

	public void method218(Class40 var1) {
		if (var1.aClass40_2 != null) {
			var1.method216();
		}

		var1.aClass40_2 = aClass40_3.aClass40_2;
		var1.aClass40_1 = aClass40_3;
		var1.aClass40_2.aClass40_1 = var1;
		var1.aClass40_1.aClass40_2 = var1;
	}

	public Class40 method219() {
		Class40 var1 = aClass40_4;
		if (var1 == aClass40_3) {
			aClass40_4 = null;
			return null;
		} else {
			aClass40_4 = var1.aClass40_1;
			return var1;
		}
	}

}
