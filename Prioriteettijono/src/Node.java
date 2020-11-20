
public class Node {
	private int[] Heap;
	private int size;
	private int maxsize;

	private static final int FRONT = 1;

	public Node(int maxsize) {
		this.maxsize = maxsize;
		this.size = 0;
		Heap = new int[this.maxsize + 1];
		Heap[0] = Integer.MIN_VALUE;

	}

	/**
	 * return the position of parent for the node currently at pos
	 * 
	 * @param pos
	 * @return
	 */
	private int parent(int pos) {
		return pos / 2;
	}

	/**
	 * return left child
	 * 
	 * @param pos
	 * @return
	 */
	private int leftChild(int pos) {
		return (2 * pos);
	}

	/**
	 * return right child
	 * 
	 * @param pos
	 * @return
	 */
	private int rightChild(int pos) {
		return (2 * pos) + 1;
	}

	// return true if the passed
	// node is a leaf node
	private boolean isLeaf(int pos) {
		if (pos >= (size / 2) && pos <= size) {
			return true;
		}
		return false;
	}

	// swap two nodes of the heap
	private void swap(int fpos, int spos) {
		int tmp;
		tmp = Heap[fpos];
		Heap[fpos] = Heap[spos];
		Heap[spos] = tmp;
	}

	// heapify the node at pos
	private void minHeapify(int pos) {

		// If the node is a non-leaf node and greater
		// than any of its child
		if (!isLeaf(pos)) {
			if (Heap[pos] > Heap[rightChild(pos)] || Heap[pos] > Heap[rightChild(pos)]) {
				// Swap with the left child and heapify
				// the left child
				if (Heap[leftChild(pos)] < Heap[rightChild(pos)]) {
					swap(pos, leftChild(pos));
					minHeapify(leftChild(pos));
				} else {
					swap(pos, rightChild(pos)); // the right child
					minHeapify(rightChild(pos));
				}
			}
		}
	}

	// print the contents of the heap
	public void print() {
		for (int i = 1; i <= size / 2; i++) {
			System.out.print(
					" PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[2 * i] + " RIGHT CHILD :" + Heap[2 * i + 1]);
			System.out.println();
		}
	}

	// build the min heap using
	// the minHeapify
	public void minHeap() {
		for (int pos = (size / 2); pos >= 1; pos--) {
			minHeapify(pos);
		}
	}

	// insert a node into the heap
	public void insert(int element) {
		if (size >= maxsize) {
			return;
		}
		Heap[++size] = element;
		int current = size;

		while (Heap[current] < Heap[parent(current)]) {
			swap(current, parent(current));
			current = parent(current);
		}
	}

	// remove and return the minimum
	// element from the heap
	public int deleteMin() {
		int popped = Heap[FRONT];
		Heap[FRONT] = Heap[size--];
		minHeapify(FRONT);
		return popped;
	}

}
