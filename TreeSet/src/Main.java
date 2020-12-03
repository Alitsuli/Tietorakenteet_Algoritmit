import java.util.Iterator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		printMenu();

	}

	private static void printMenu() {
		char select;
		TreeSet<Integer> tree = new TreeSet<Integer>();
		String data;

		do {
			System.out.println("\n\t\t\t1. Lis�� avain.");
			System.out.println("\t\t\t2. Etsi avaimella.");
			System.out.println("\t\t\t3. K�y puu l�pi sis�j�rjestyksess�.");
			System.out.println("\t\t\t4. K�y puu l�pi esij�rjestyksess�.");
			System.out.println("\t\t\t5. lopetus ");
			System.out.print("\n\n"); // tehd��n tyhji� rivej�
			select = Lue.merkki();
			switch (select) {
			case '1':
				System.out.println("Anna uusi avain (kokonaisluku)");
				data = new String(Lue.rivi());
				tree.add(Integer.parseInt(data));
				break;
			case '2':
				System.out.println("Anna etsitt�v� avain (kokonaisluku)");
				data = Lue.rivi();
				if (tree.contains(Integer.parseInt(data))) {
					System.out.println("Avain l�ytyi.");
				} else {
					System.out.println("Avainta ei l�ytynyt.");
				}
				break;
			case '3':
				Iterator<Integer> itr = tree.iterator();
				while (itr.hasNext()) {
					System.out.println(itr.next());
				}
				char h = Lue.merkki(); // pys�ytet��n kontrolli
				break;
			case '4':
				System.out.println("Ei onnistu");
				char k = Lue.merkki(); // pys�ytet��n kontrolli
				break;
			case '5':
				break;
			}

		} while (select != '5');

	}

}
