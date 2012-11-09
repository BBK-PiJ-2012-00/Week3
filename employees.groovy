println "Please enter the employees' names followed by their ID number: ";
int counter = 0;
String emp;
int id;
EmployeeID empEntry = new EmployeeID(); 
while (counter < 10) {
emp = System.console().readLine();
id = Integer.parseInt(System.console().readLine());
empEntry.assignEmployee(emp, counter);
empEntry.assignID(id, counter);
counter++;
}
int printCounter = 0;
	for (printCounter = 0; printCounter < 10; printCounter++) {
		println "The " + (printCounter + 1) + " employee's name is " + empEntry.employeeArray[printCounter] + ", ID: " + empEntry.idArray[printCounter] + ".";
	}


