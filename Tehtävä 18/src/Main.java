import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		long start, elapsedTime;
		double elapsedTimeInSeconds;
		Random rand = new Random();
		int amount = 100_000;

		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i <= amount; i++) {
			int randomNumber = rand.nextInt(1000);
			numbers.add(randomNumber);
		}
		System.out.print("Arvotut numerot: ");
		System.out.println(numbers);

		TreeSetVersion treeSetVersion = new TreeSetVersion();
		// Start the clock
		start = System.nanoTime();

		for (int i = 1; i <= amount; i++) {
			treeSetVersion.insert(numbers.get(i - 1));
		}
		System.out.print("TreeSet on ");
		treeSetVersion.inOrder();
		// Stop the clock
		elapsedTime = System.nanoTime() - start;
		elapsedTimeInSeconds = (double) elapsedTime / 1_000_000_000;
		System.out.println("TreeSetVersionin aika: " + elapsedTimeInSeconds + " sekuntia");

		BinaryTree bTreeVersion = new BinaryTree();
		// Start the clock
		start = System.nanoTime();
		for (int i = 1; i <= amount; i++) {
			bTreeVersion.insert(numbers.get(i - 1));
		}

		System.out.print("BinaryTree on ");
		bTreeVersion.inOrder();
		// Stop the clock
		elapsedTime = System.nanoTime() - start;
		elapsedTimeInSeconds = (double) elapsedTime / 1_000_000_000;
		System.out.println();
		System.out.println("BinaryTreen aika: " + elapsedTimeInSeconds + " sekuntia");

	}
}
