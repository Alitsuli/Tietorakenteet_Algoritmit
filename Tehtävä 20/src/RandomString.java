import java.util.Random;

public class RandomString {
	private static final char[] symboleja;

	static {
		StringBuilder tmp = new StringBuilder();
		for (char ch = '0'; ch <= '9'; ++ch)
			tmp.append(ch);
		for (char ch = 'a'; ch <= 'z'; ++ch)
			tmp.append(ch);
		symboleja = tmp.toString().toCharArray();
	}

	private final Random random = new Random();
	private final char[] buf;

	public RandomString(int pituus) {
		if (pituus < 1)
			throw new IllegalArgumentException("Pituus < 1: " + pituus);
		buf = new char[pituus];
	}

	public String nextString() {

		for (int idx = 0; idx < buf.length; ++idx)
			buf[idx] = symboleja[random.nextInt(symboleja.length)];
		return new String(buf);
	}

}
