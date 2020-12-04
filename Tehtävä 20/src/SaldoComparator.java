import java.util.Comparator;

public class SaldoComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		TrafficCard a1 = (TrafficCard) o1;
		TrafficCard a2 = (TrafficCard) o2;
		return Float.compare(a1.getmSaldo(), a2.getmSaldo());
	}

}
