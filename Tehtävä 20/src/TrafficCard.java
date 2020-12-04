
public class TrafficCard {
	int mMatkustajaNumero;
	String mOmistajaNimi;
	float mSaldo;

	public TrafficCard(int tNumero, String oNimi, float saldo) {
		mMatkustajaNumero = tNumero;
		mOmistajaNimi = oNimi;
		mSaldo = saldo;
	}

	public float getmSaldo() {
		return mSaldo;
	}

	public String getmOmistajaNimi() {
		return mOmistajaNimi;
	}

	public int getmMatkustajaNumero() {
		return mMatkustajaNumero;
	}

	@Override
	public String toString() {
		return "Omistaja: " + mOmistajaNimi + ", Numero: " + mMatkustajaNumero + ", saldo: " + mSaldo;
	}

}
