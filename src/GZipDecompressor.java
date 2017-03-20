import java.util.zip.Inflater;

public class GZipDecompressor {

	static String staticString26;
	Inflater anInflater1;

	public GZipDecompressor() {
		this(-1, 1000000);
	}

	public void method238(Stream var1, byte[] var2) {
		if (var1.buf[var1.off] == 31 && var1.buf[var1.off + 1] == -117) {
			if (anInflater1 == null) {
				anInflater1 = new Inflater(true);
			}

			try {
				anInflater1.setInput(var1.buf, var1.off + 10, var1.buf.length - (10 + var1.off + 8));
				anInflater1.inflate(var2);
			} catch (Exception var4) {
				anInflater1.reset();
				throw new RuntimeException("");
			}

			anInflater1.reset();
		} else {
			throw new RuntimeException("");
		}
	}

	GZipDecompressor(int var1, int var2) {
	}

}
