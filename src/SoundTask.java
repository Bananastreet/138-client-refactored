import java.awt.event.ActionEvent;

public class SoundTask implements Runnable {

	TaskManager aTaskManager1;
	volatile boolean aBool6 = false;
	volatile SoundSystem[] aClass19Array1 = new SoundSystem[2];
	volatile boolean aBool5 = false;

	public void run() {
		aBool6 = true;

		try {
			while (!aBool5) {
				SoundSystem var7;
				for (int var9 = 0; var9 < 2; var9++) {
					var7 = aClass19Array1[var9];
					if (var7 != null) {
						var7.method66();
					}
				}

				Static.staticMethod303(10L);
				TaskManager var91 = aTaskManager1;
				var7 = null;
				if (var91.anEventQueue1 != null) {
					for (int var3 = 0; var3 < 50 && var91.anEventQueue1.peekEvent() != null; var3++) {
						Static.staticMethod303(1L);
					}

					if (var7 != null) {
						var91.anEventQueue1.postEvent(new ActionEvent(var7, 1001, "dummy"));
					}
				}
			}
		} catch (Exception var71) {
			Static.staticMethod285((String) null, var71);
		} finally {
			aBool6 = false;
		}

	}

}
