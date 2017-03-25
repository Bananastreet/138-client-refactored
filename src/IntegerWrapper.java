public class IntegerWrapper {

	public static ByteBuf staticStream4;
	public static final IntegerWrapper zero = new IntegerWrapper(0);	
	public static final IntegerWrapper one = new IntegerWrapper(1);
	public static final IntegerWrapper two = new IntegerWrapper(2);
	public final int value;

	IntegerWrapper(int value) {		
		this.value = value;
	}

}
