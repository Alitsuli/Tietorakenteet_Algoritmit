import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class UsingJCAPI {
	public static void main(String[] args) {
		ArrayList<TrafficCard> cardUsers = new ArrayList<TrafficCard>();
		RandomString rString = new RandomString(10);
		float genBalance;
		TrafficCard myCard;
		Random r = new Random();
		int i;

		for (i = 0; i < 10; i++) {
			genBalance = ((float) r.nextInt(1000) / 10);
			myCard = new TrafficCard(r.nextInt(100), rString.nextString(), genBalance);
			cardUsers.add(myCard);
		}

		// Järjestetään numeron mukaan
		Collections.sort(cardUsers);

		Iterator itr = cardUsers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
