import java.util.TreeSet;

public class TreeSetVersion {
	private TreeSet<Integer> treeSet;
	Integer root;

	public TreeSetVersion() {
		treeSet = new TreeSet<Integer>();
	}

	public void insert(Integer integer) {
		treeSet.add(integer);
	}

	public boolean find(Integer integer) {
		if (treeSet.contains(integer)) {
			return true;
		}
		return false;
	}

	public void inOrder() {
		System.out.println(treeSet);
	}

	public void preOrder() {

	}

	public int getSize() {
		return treeSet.size();
	}
}