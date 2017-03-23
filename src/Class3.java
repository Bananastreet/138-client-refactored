import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

public class Class3 {

	static int staticInt19;
	static Widget staticWidget1;
	int anInt11;
	DataInputStream aDataInputStream1;
	int anInt12;
	byte[] aByteArray1;
	int anInt13;
	byte[] aByteArray2 = new byte[4];
	Task aTask1;
	long aLong1;

	byte[] method11() throws IOException {
		if (Static.staticMethod297() > aLong1) {
			throw new IOException();
		} else {
			if (anInt12 == 0) {
				if (aTask1.anInt86 == 2) {
					throw new IOException();
				}

				if (aTask1.anInt86 == 1) {
					aDataInputStream1 = (DataInputStream) aTask1.anObject2;
					anInt12 = 1;
				}
			}

			if (anInt12 == 1) {
				anInt11 += aDataInputStream1.read(aByteArray2, anInt11, aByteArray2.length - anInt11);
				if (anInt11 == 4) {
					int var1 = new ByteBuf(aByteArray2).readInt();
					aByteArray1 = new byte[var1];
					anInt12 = 2;
				}
			}

			if (anInt12 == 2) {
				anInt13 += aDataInputStream1.read(aByteArray1, anInt13, aByteArray1.length - anInt13);
				if (aByteArray1.length == anInt13) {
					return aByteArray1;
				}
			}

			return null;
		}
	}

	Class3(TaskManager var1, URL var2) {
		aTask1 = var1.method96(var2);
		anInt12 = 0;
		aLong1 = Static.staticMethod297() + 30000L;
	}

}
