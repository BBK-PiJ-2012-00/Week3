/**
* Day 6 Ex: 8, 9
*/
public class List {
	private Node head = null;
	private Node tail = null;
	private Node traverse = null;
	
	public Node getHead() {
		return head;
	}
	
	public void add(int value) {
		if (head == null) {
			head = new Node(value);
		}
		else {
			head.add(value);
		}
	}
	
	public List convertArray(int[] intArray) {
		return ListUtilities.converter(intArray);
	}
	
	public void print() {
		traverse = head;
		while (traverse != null) {
			System.out.println(traverse.getValue());
			traverse = traverse.getNext();
		}
	}
	
	public void sortedAdd(int value) {
		if (head == null) {
			head = new Node(value);
		}
		else {
			head.sortedAdd(value);
		}
		if (value < head.getValue()) {
			head = head.getPrevious();
		}
		
	}
	
	public static void main(String[] args) {
		List list = new List();
		list.launch();
		
	}
	
	private void launch() {
		
		sortedAdd(5);
		sortedAdd(3);
		sortedAdd(7);
		sortedAdd(6);
		sortedAdd(2);
		sortedAdd(4);
		sortedAdd(1);
		sortedAdd(12);
		sortedAdd(9);
		sortedAdd(8);
		sortedAdd(11);
		sortedAdd(10);
		sortedAdd(6);
		
		print();
	}
		
		
		
	
	
	/**
	public static void main(String[] args) {
		List list = new List();
		list.launch();
		
	}
	
	
	private void launch() {
		
		int[] array = new int[10];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		array[5] = 6;
		array[6] = 7;
		array[7] = 8;
		array[8] = 9;
		array[9] = 10;
		
		List list1 = convertArray(array);
		
		list1.print();
		System.out.println(list1.head.getNext().getValue());
		
		int[] array2 = {21, 22, 23, 24, 25};
		List list2 = convertArray(array2);
		list2.print();
		System.out.println(list2.head.getNext().getValue());
	}
	*/
}
		
			
			
			
			