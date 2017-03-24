public class ExchangeOffer {

	static int staticInt146;
	static int[] staticIntArray77;
	static int[][] staticIntArrayArray8;
	byte status;
	public int itemId;
	public int price;
	public int itemQuantity;	
	public int transferred;
	public int spent;

	public ExchangeOffer(ByteBuf var1, boolean var2) {
		status = var1.readByte();		
		itemId = var1.readUShort();		
		price = var1.readInt();		
		itemQuantity = var1.readInt();
		transferred = var1.readInt();		
		spent = var1.readInt();		
		if (var2) {
			int var3 = 0;
			boolean var5 = false;

			while (true) {
				int var6 = var1.readUByte();
				if (var6 == 255) {
					Integer var71 = var5 ? Integer.valueOf(var3) : null;
					method285(var71);
					break;
				}

				if (var6 != 0) {
					throw new IllegalStateException("");
				}

				while (true) {
					int var7 = var1.readUByte();
					if (var7 == 255) {
						break;
					}

					--var1.position;
					if (var1.readUShort() != 0) {
						throw new IllegalStateException("");
					}

					if (var5) {
						throw new IllegalStateException("");
					}

					var3 = var1.readInt();
					var5 = true;
				}
			}
		}

	}

	void method285(Integer var1) {
	}

	public ExchangeOffer() {
	}

	public int method286() {
		return (status & 0x8) == 8 ? 1 : 0;
	}

	void method287(int var1) {
		status &= -8;
		status = (byte) (status | var1 & 0x7);
	}

	void method288(int var1) {
		status &= -9;
		if (var1 == 1) {
			status = (byte) (status | 8);
		}

	}

	public int method289() {
		return status & 0x7;
	}

}
