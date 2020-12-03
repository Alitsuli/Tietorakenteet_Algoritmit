public class TrafficCard implements Comparable<Object> {
	int mTravelerNumber;
	String mOwnerName;
	float mBalance;

	public TrafficCard(int tNumber, String oName, float balance) {
		mTravelerNumber = tNumber;
		mOwnerName = oName;
		mBalance = balance;
	}

	public String toString() {
		return "Omistaja: " + mOwnerName + ",numero: " + mTravelerNumber + ", saldo: " + mBalance;
	}

	@Override
	public int compareTo(Object o) {
		TrafficCard tc = (TrafficCard) o;
		if (mTravelerNumber == tc.mTravelerNumber) {
			return 0;
		} else if (mTravelerNumber > tc.mTravelerNumber) {
			return 1;
		} else {
			return -1;
		}
	}

}
