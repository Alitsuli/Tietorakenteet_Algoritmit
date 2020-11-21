import java.util.Arrays;

public class SuljettuHajautus {
	private int size;
	private int[] index;
	private int j = 0;
	private String[] data;

	public SuljettuHajautus(int size) {
		this.size = size;
		this.data = new String[size];
		this.index = new int[size];
	}

	public void add(int index, String input) {
		if (!isFull()) {
			if (!indexUsed(index)) {
				this.index[j] = index;
				j++;
				int hashIndex = index % size;
				for (int i = 0; i < size; i++) {
					if (data[hashIndex] == null) {
						data[hashIndex] = input;
						break;
					}
					hashIndex = (hashIndex + 1) % size;
				}
			} else {
				System.out.println("indeksi on käytetty!");
			}
		} else {
			System.out.println("Taulu on taynna");
		}
	}

	public String find(int index) {
		return data[index % size];
	}

	public String delete(int index) {
		String delete = data[index % size];
		data[index % size] = null;
		return delete;
	}

	public void deleteAll() {
		Arrays.fill(data, null);
	}

	public void printAll() {
		for (String string : data) {
			System.out.println(string);
		}
	}

	private boolean isFull() {
		boolean isFull = true;
		for (int i = 0; i < size; i++) {
			if (data[i] == null) {
				isFull = false;
				break;
			}
		}
		return false;
	}

	private boolean indexUsed(int index) {
		for (int i = 0; i < size; i++) {
			if (this.index[i] == index) {
				return true;
			}
		}
		return false;
	}

}
