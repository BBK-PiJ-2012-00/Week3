/**
* Day 6 Ex: 8
*/
public class ListControl { //A script class.

	public static void main(String[] args) {
	
		ListControl lc = new ListControl();
		lc.launch();
		
	}
	
	private void launch() {
	
		int[] array3 = new int[10];
		array3[0] = 10;
		array3[1] = 20;
		array3[2] = 30;
		array3[3] = 40;
		array3[4] = 50;
		array3[5] = 60;
		array3[6] = 70;
		array3[7] = 80;
		array3[8] = 90;
		array3[9] = 100;
		
	/**
	* Direct call to ListUtilities class. The List class calls it from one of its own methods.
	*/
		List list3 = ListUtilities.converter(array3);
		
		list3.print();
		System.out.println(list3.getHead().getNext().getValue());
		
		int[] array4 = {21, 22, 23, 24, 25};
		List list4 = ListUtilities.converter(array4);
		list4.print();
		System.out.println(list4.getHead().getNext().getValue());
	
	}
}