import java.nio.ByteBuffer;

public class DirectByteBuffer extends AbstractByteBuffer {

	ByteBuffer buffer;	

	void put(byte[] data) {		
		buffer = ByteBuffer.allocateDirect(data.length);
		buffer.position(0);
		buffer.put(data);
	}

	byte[] toByteArray() {
		byte[] var1 = new byte[buffer.capacity()];
		buffer.position(0);
		buffer.get(var1);
		return var1;
	}

}
