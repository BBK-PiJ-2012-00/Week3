public class EmployeeID {

	private String emp0, emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9; 
	private int id0, id1, id2, id3, id4, id5, id6, id7, id8, id9;
	
	public EmployeeID(String s, int i) {
		this.s = s;
		this.i = i;
	} 
	
	public void assignEmployee(String emp, int id) {
		String[] employeeArray;
		employeeArray = new String[10];
		employeeArray[0] = "";
		employeeArray[1] = "";
		employeeArray[2] = "";
		employeeArray[3] = "";
		employeeArray[4] = "";
		employeeArray[5] = "";
		employeeArray[6] = "";
		employeeArray[7] = "";
		employeeArray[8] = "";
		employeeArray[9] = "";
	
		int[] idArray;
		idArray = new int[10];
		idArray[0] = 0;
		idArray[1] = 0;
		idArray[2] = 0;
		idArray[3] = 0;
		idArray[4] = 0;
		idArray[5] = 0;
		idArray[6] = 0;
		idArray[7] = 0;
		idArray[8] = 0;
		idArray[9] = 0;
		
		int counter = 0;
		for (counter = 0; counter < 10; counter++) {		
			employeeArray[counter] = emp;
			idArray[counter] = id;
		}
		int printCounter = 0;
		for (printCounter = 0; counter < 10; counter++) {
			System.out.println("The " + printCounter + " employee's name is " + employeeArray[printCounter] + ", ID: " + idArray[printCounter] + ".");
		}
}
}
		
