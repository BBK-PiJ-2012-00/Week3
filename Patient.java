public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient = null;
	private Patient previousPatient = null;
	private static int patientCount = 0;  
	//private static Patient = listManager.patientListStart -- possible workaround to change patient at head and tail of list
	
	public Patient(String name, int age, String illness) {
		patientCount++;
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		this.previousPatient = null;
	}
	
	public static int getCount() {
		return patientCount;
	}
	
	public static int decrementCounter(int counter) {
		return patientCount--;
	}
	
	public Patient getNext() {
		return nextPatient;
	}
	
	public void setNext(Patient patient) {
		this.nextPatient = patient; //sets the nextPatient of this one to whatever is in the parameter.
	}
	
	public Patient getPrevious() {
		return previousPatient;
	}
	
	public void setPrevious(Patient patient) {
		this.previousPatient = patient;
	}
	
	public String getName() { //to access private fields above from another class
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getIllness() {
		return illness;
	}
	
	public void addPatient(Patient newPatient) {
		if (this.nextPatient == null) {
			//last Patient in list
			this.nextPatient = newPatient;
		}
		else {
			this.nextPatient.addPatient(newPatient);
		}
		if (newPatient.previousPatient == null) {
			newPatient.previousPatient = this;
		}
	}
		
		
	/**public boolean deletePatient(Patient patient) {
		if (this.name.equals(patient.name)) { 
			if (this.previousPatient == null) { //this means user is requesting deletion of first patient
				listManager.setListStart(this.nextPatient); //setter required! //listmanager responsible for null exception?
				this.nextPatient.previousPatient = null;
				patientCount--;
				return true;
			}
			else if (this.nextPatient == null) { //this means user is requesting deletion of last patient
				listManager.setListEnd(this.previousPatient); //re-routes pointer of list tail
				this.previousPatient.nextPatient = null;
				patientCount--;
				return true;
			}
		}			
		else if (this.nextPatient.name.equals(patient.name)) {
			this.nextPatient = nextPatient.nextPatient;
			this.previousPatient = previousPatient.previousPatient;
			patientCount--;
			return true;
		}
		 
		return this.nextPatient.deletePatient(patient);
	
	*/	
		
	 
}
	
	


		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	