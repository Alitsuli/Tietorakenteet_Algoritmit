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
			System.out.println("\n\t\t\t1. Lisää avain.");
			System.out.println("\t\t\t2. Etsi avaimella.");
			System.out.println("\t\t\t3. Käy puu läpi sisäjärjestyksessä.");
			System.out.println("\t\t\t4. Käy puu läpi esijärjestyksessä.");
			System.out.println("\t\t\t5. lopetus ");
			System.out.print("\n\n"); // tehdään tyhjiä rivejä
			select = Lue.merkki();
			switch (select) {
			case '1':
				System.out.println("Anna uusi avain (kokonaisluku)");
				data = new String(Lue.rivi());
				tree.add(Integer.parseInt(data));
				break;
			case '2':
				System.out.println("Anna etsittävä avain (kokonaisluku)");
				data = Lue.rivi();
				if (tree.contains(Integer.parseInt(data))) {
					System.out.println("Avain löytyi.");
				} else {
					System.out.println("Avainta ei löytynyt.");
				}
				break;
			case '3':
				Iterator<Integer> itr = tree.iterator();
				while (itr.hasNext()) {
					System.out.println(itr.next());
				}
				char h = Lue.merkki(); // pysäytetään kontrolli
				break;
			case '4':
				System.out.println("Ei onnistu");
				char k = Lue.merkki(); // pysäytetään kontrolli
				break;
			case '5':
				break;
			}

		} while (select != '5');

	}

}
