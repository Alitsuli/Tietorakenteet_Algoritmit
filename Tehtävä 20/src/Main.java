import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		ArrayList<TrafficCard> korttikayttajat = new ArrayList<TrafficCard>();
		RandomString rString = new RandomString(10);
		float genBalance;
		TrafficCard minunKortti;
		Random r = new Random();
		int i;
		for (i = 0; i < 10; i++) {
			genBalance = ((float) r.nextInt(1000) / 10);
			minunKortti = new TrafficCard(r.nextInt(100), rString.nextString(), genBalance);
			korttikayttajat.add(minunKortti);
		}

		korttikayttajat.sort(new NumeroComparator());

		for (TrafficCard kayttaja : korttikayttajat) {
			System.out.println(kayttaja);
		}

		System.out.println("---------------------------------------------");

		korttikayttajat.sort(new SaldoComparator());
		for (TrafficCard korttikayttaja : korttikayttajat) {
			System.out.println(korttikayttaja);
		}

	}

}
