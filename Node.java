/**
* Day 6 Ex: 8, 9
*/
public class Node {
	private int value;
	private Node next = null;
	private Node previous = null;
	
	public Node(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public Node getPrevious() {
		return this.previous;
	}
	
	public void setNext(Node node) {
		this.next = node;
	}
	
	public void setPrevious(Node node) {
		this.previous = node;
	}
	
	public void add(int value) {
		if (this.next == null) {
			this.next = new Node(value);
			this.next.previous = this;
		}
		else {
			this.next.add(value);
		}
	}
	
	public void sortedAdd(int value) {
		if (value < this.value) {
			if (this.previous == null) {
				this.previous = new Node(value);
				this.previous.next = this;
			}
			else { //Unnecessary - head moves back one with every lower value.
				System.out.println("CHECKPOINT: head reversion not working!");
				this.previous.sortedAdd(value);
			}
		}
		else {
			if (this.next == null) {
				this.next = new Node(value);
				this.next.previous = this;
			}
			else if (value <= this.next.value) {
				Node newNode = new Node(value);
				this.next.previous = newNode;
				newNode.next = this.next;
				newNode.previous = this;
				this.next = newNode;
			}
			else  {
				this.next.sortedAdd(value);
			}
		}
	}
			
			
	
}