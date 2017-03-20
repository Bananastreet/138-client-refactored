import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

public class Class19Sub1 extends Class19 {

	AudioFormat anAudioFormat1;
	byte[] aByteArray16;
	SourceDataLine aSourceDataLine1;
	int anInt240;

	void method71(Component var1) {
		anAudioFormat1 = new AudioFormat(Static.staticInt120, 16, staticBool5 ? 2 : 1, true, false);
		aByteArray16 = new byte[256 << (staticBool5 ? 2 : 1)];
	}

	int method72() {
		return anInt240 - (aSourceDataLine1.available() >> (staticBool5 ? 2 : 1));
	}

	void method79(int var1) throws LineUnavailableException {
		try {
			Info var5 = new Info(SourceDataLine.class, anAudioFormat1, var1 << (staticBool5 ? 2 : 1));
			aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(var5);
			aSourceDataLine1.open();
			aSourceDataLine1.start();
			anInt240 = var1;
		} catch (LineUnavailableException var51) {
			if (Static.staticMethod124(var1) == 1) {
				aSourceDataLine1 = null;
				throw var51;
			}

			int var3 = var1 - 1;
			var3 |= var3 >>> 1;
			var3 |= var3 >>> 2;
			var3 |= var3 >>> 4;
			var3 |= var3 >>> 8;
			var3 |= var3 >>> 16;
			int var4 = var3 + 1;
			method79(var4);
		}

	}

	void method73() {
		int var1 = 256;
		if (staticBool5) {
			var1 <<= 1;
		}

		for (int var2 = 0; var2 < var1; var2++) {
			int var3 = anIntArray27[var2];
			if ((var3 + 8388608 & 0xff000000) != 0) {
				var3 = 8388607 ^ var3 >> 31;
			}

			aByteArray16[var2 * 2] = (byte) (var3 >> 8);
			aByteArray16[var2 * 2 + 1] = (byte) (var3 >> 16);
		}

		aSourceDataLine1.write(aByteArray16, 0, var1 << 1);
	}

	void method74() {
		if (aSourceDataLine1 != null) {
			aSourceDataLine1.close();
			aSourceDataLine1 = null;
		}

	}

	void method75() {
		aSourceDataLine1.flush();
	}

}
