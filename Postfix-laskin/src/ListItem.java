
public class ListItem {
	private String mData;
	private ListItem mNext;

	public ListItem() {
		mData = null;
		mNext = null;
	}

	public ListItem(String mData, ListItem mNext) {
		this.mData = mData;
		this.mNext = mNext;
	}

	public String getmData() {
		return mData;
	}

	public void setmData(String mData) {
		this.mData = mData;
	}

	public ListItem getmNext() {
		return mNext;
	}

	public void setmNext(ListItem mNext) {
		this.mNext = mNext;
	}

}
