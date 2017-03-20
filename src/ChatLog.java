public class ChatLog {

	ChatMessage[] aChatMessageArray1 = new ChatMessage[100];
	int anInt1;

	ChatMessage method2(int var1, String var2, String var3, String var4) {
		ChatMessage var5 = aChatMessageArray1[99];

		for (int var6 = anInt1; var6 > 0; --var6) {
			if (var6 != 100) {
				aChatMessageArray1[var6] = aChatMessageArray1[var6 - 1];
			}
		}

		if (var5 == null) {
			var5 = new ChatMessage(var1, var2, var4, var3);
		} else {
			var5.method174();
			var5.method314();
			var5.method560(var1, var2, var4, var3);
		}

		aChatMessageArray1[0] = var5;
		if (anInt1 < 100) {
			++anInt1;
		}

		return var5;
	}

	ChatMessage method3(int var1) {
		return var1 >= 0 && var1 < anInt1 ? aChatMessageArray1[var1] : null;
	}

	int method4() {
		return anInt1;
	}

}
