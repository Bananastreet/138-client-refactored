import java.nio.ByteBuffer;

public class AbstractClass4Sub1 extends AbstractByteBuffer {

	ByteBuffer aByteBuffer1;

	void method253(byte[] var1) {
		aByteBuffer1 = ByteBuffer.allocateDirect(var1.length);
		aByteBuffer1.position(0);
		aByteBuffer1.put(var1);
	}

	byte[] method254() {
		byte[] var1 = new byte[aByteBuffer1.capacity()];
		aByteBuffer1.position(0);
		aByteBuffer1.get(var1);
		return var1;
	}

}
