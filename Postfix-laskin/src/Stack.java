
public class Stack {
	private ListItem mTop;
	private int mSize;

	public Stack() {
		mTop = null;
		mSize = 0;
	}

	public Stack(ListItem mTop, int mSize) {
		this.mTop = mTop;
		this.mSize = mSize;
	}

	public ListItem getmTop() {
		return mTop;
	}

	public void setmTop(ListItem mTop) {
		this.mTop = mTop;
	}

	public int getmSize() {
		return mSize;
	}

	public void setmSize(int mSize) {
		this.mSize = mSize;
	}

	public void push(String aData) {
		ListItem newmTop = new ListItem();
		newmTop.setmData(aData);
		newmTop.setmNext(mTop);
		mTop = newmTop;
		mSize++;
	}

	public ListItem pop() {
		if (mSize == 0) {
			return null;
		} else {
			ListItem tempTop = mTop;
			mTop = mTop.getmNext();
			mSize--;
			return tempTop;
		}
	}

	public String getString() {
		String sana = "";
		ListItem a = mTop;
		for (int i = 0; i < getmSize(); i++) {
			sana += a.getmData() + " ";
			a = a.getmNext();
		}
		return sana;
	}

	@Override
	public String toString() {
		String sana = "";
		ListItem a = mTop;
		for (int i = 0; i < getmSize(); i++) {
			sana += a.getmData() + " ";
			a = a.getmNext();
		}
		return sana;
	}

}
