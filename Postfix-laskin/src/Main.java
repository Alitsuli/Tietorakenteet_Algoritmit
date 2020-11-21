import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		printMenu();
	}

	private static void printMenu() {
		char select;
		Stack s = new Stack(); // pino-olio
		String data; // Pinon data-kentt�

		do {
			System.out.println("\n\t\t\t1. Alkion lis��minen.");
			System.out.println("\t\t\t2. Alkion poistaminen.");
			System.out.println("\t\t\t3. Pinon sis�lt�.");
			System.out.println("\t\t\t4. Alkioiden lukum��r�.");
			System.out.println("\t\t\t5. Laske ");
			System.out.println("\t\t\t6. Lopeta ");
			System.out.print("\n\n"); // tehd��n tyhji� rivej�

			select = Lue.merkki();

			switch (select) {
			case '1':
				System.out.println("Anna alkion sis�lt� (merkkijono)");
				data = new String(Lue.rivi());
				s.push(data);
				break;
			case '2':
				ListItem item = s.pop();
				if (item == null)
					System.out.println("Pino on tyhj�");
				else
					System.out.println("Poistettu alkio: " + item.getmData());
				break;
			case '3':
				System.out.println(s);
				break;
			case '4':
				System.out.println("Lukum��r� = " + s.getmSize());
				break;
			case '5':
				String alkio = s.toString();
				System.out.println("Ensimm�inen alkio: " + count(alkio));
				System.out.println("Test 1: 2 3 * + 4 + =" + count("1 2 3 * + 4 +"));
				System.out.println("Test 2: 5 2 4 * + 7 - =" + count("5 2 4 * + 7 - "));
				System.out.println("Test 3: 8 5 * 7 4 2 + * + = " + count("8 5 * 7 4 2 + * +"));
				break;
			case '6':
				break;

			}
		} while (select != '6');
	}

	public static String count(String exp) {
		Stack stack = new Stack();
		Scanner scanner = new Scanner(exp);

		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				stack.push(scanner.next());
			} else {
				int num1 = Integer.parseInt(stack.pop().getmData());
				int num2 = Integer.parseInt(stack.pop().getmData());

				String scanned = scanner.next();

				switch (scanned) {
				case "+": {
					int number = num1 + num2;
					stack.push(Integer.toString(number));

					break;
				}
				case "-": {
					int number = num1 - num2;
					stack.push(Integer.toString(number));

					break;
				}
				case "*": {
					int number = num1 * num2;
					stack.push(Integer.toString(number));
					break;
				}
				default: {
					int number = num1 / num2;
					stack.push(Integer.toString(number));
					break;
				}
				}
			}
		}
		return stack.pop().getmData();
	}

}
