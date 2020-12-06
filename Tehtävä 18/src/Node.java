
public class Node {
	private Integer data;
	private BinaryTree left;
	private BinaryTree right;

	public Node(Integer value) {
		data = new Integer(value);
		left = right = null;
	}

	public Node(String value, BinaryTree left, BinaryTree right) {
		data = new Integer(value);
		this.left = left;
		this.right = right;
	}

	public Integer getData() {
		return data;
	}

	public BinaryTree left() {
		return left;
	}

	public BinaryTree right() {
		return right;
	}

	public void setLeft(BinaryTree tree) {
		left = tree;
	}

	public void setRight(BinaryTree tree) {
		right = tree;
	}

}
