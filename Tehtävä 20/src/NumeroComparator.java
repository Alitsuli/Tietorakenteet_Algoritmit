import java.util.Comparator;

public class NumeroComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		TrafficCard a1 = (TrafficCard) o1;
		TrafficCard a2 = (TrafficCard) o2;
		return Integer.compare(a1.getmMatkustajaNumero(), a2.getmMatkustajaNumero());
	}

}
