
public class Main {

	public static void main(String[] args) {

		System.out.println("The Min Heap is ");
		Node minHeap = new Node(15);
		minHeap.insert(1);
		minHeap.insert(5);
		minHeap.insert(20);
		minHeap.insert(14);
		minHeap.insert(88);
		minHeap.insert(12);
		minHeap.insert(5);
		minHeap.insert(50);
		minHeap.insert(5);
		minHeap.minHeap();

		minHeap.print();
		System.out.println("The deleteMin value is " + minHeap.deleteMin());

	}

}
