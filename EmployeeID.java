public class EmployeeID {

	private String[] employeeArray; 
	private int[] idArray;
	
	public EmployeeID() {
		employeeArray = new String[10];
		idArray = new int[10];
	}
	
	
	public void assignEmployee(String emp, int counterS) { //takes counter from groovy
			employeeArray[counterS] = emp;
	}
	public void assignID(int id, int counterI) {	
			idArray[counterI] = id;
	}
}

//looks like there is a problem with your loops here - reassignment of String/int needs to be inside loop, not outside! - loop with methods inside? Think about how you do loops where you want multiple entries.
		











