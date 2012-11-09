public class ListManager { 
	private Patient patientListStart = null;
	private Patient patientListEnd = null;
	private Patient patientListTraverse = null;
		//double link requires: patientListEnd
		//keeps record of head and tail
		
	public Patient getListStart() {
		return patientListStart;
	}
	
	public Patient getListEnd() {
		return patientListEnd;
	}
	
	public void setListStart(Patient patient) {
		patientListStart = patient;
	}
	
	public void setListEnd(Patient patient) {
		patientListEnd = patient;
	}	
	
	public boolean deletePatient(Patient patient) { 
		if (patient.equals(patientListStart)) {
			setListStart(patient.getNext());
			patient.getNext().setPrevious(null); //removes pointer from the next one pointing back to head
			Patient.decrementCounter(Patient.getCount());
			return true;
		}
		else if (patient.getName().equals(patientListEnd.getName())) {
			System.out.println("ListEnd match called");
			setListEnd(patient.getPrevious());
			patient.getPrevious().setNext(null); //removes pointer from the previous one pointing to tail
			Patient.decrementCounter(Patient.getCount());
			return true;
		}
		else {
			patient.getPrevious().setNext(patient.getNext());
			patient.getNext().setPrevious(patient.getPrevious());
			Patient.decrementCounter(Patient.getCount());
			return true;
		}
	}
		
	public static void main(String[] args) {
	
		ListManager listManager = new ListManager();
		listManager.launch();
	}
	
	private void launch() {
	
		Patient patientOne = new Patient("Reno", 31, "Hyperchondria");
		patientListStart = patientOne;
		
		
		//ADDING PATIENTS TO LIST
		Patient patientTwo = new Patient("Tseng", 36, "Burnout" );
		patientListStart.addPatient(patientTwo); //must add next patient from first patient
		
		
		
		Patient patientThree = new Patient("Scarlet", 36, "Anger management");
		patientListStart.addPatient(patientThree);
		
		
		Patient patientFour = new Patient("Elena", 25, "Broken Heart");
		patientListStart.addPatient(patientFour);
		
		
		Patient patientFive = new Patient("Rude", 33, "Concussion");
		patientListStart.addPatient(patientFive);
		
		
		Patient patientSix = new Patient("Rufus", 26, "Megalomania");
		patientListStart.addPatient(patientSix);
		
		
		Patient patientSeven = new Patient("Cloud", 23, "Multiple personality disorder");
		patientListStart.addPatient(patientSeven);
		
		
		Patient patientEight = new Patient("Sephiroth", 30, "Clinically insane");
		patientListStart.addPatient(patientEight);
		patientListEnd = patientEight;
		
		System.out.println("There are " + Patient.getCount() + " patients.");
		
		//PRINT LIST FORWARDS
		int counter = 0;
		patientListTraverse = patientListStart;	
		for (counter = 0; counter < Patient.getCount(); counter++) {
			System.out.println(patientListTraverse.getName() + " " + patientListTraverse.getAge() + " " + patientListTraverse.getIllness());
			patientListTraverse = patientListTraverse.getNext();
		}
		
		//PRINT LIST BACKWARDS
		System.out.println("--Reverse List--");
		counter = Patient.getCount();
		patientListTraverse = patientListEnd;
		for (counter = Patient.getCount(); counter > 0; counter--) {
			System.out.println(patientListTraverse.getName() + " " + patientListTraverse.getAge() + " " + patientListTraverse.getIllness());
			patientListTraverse = patientListTraverse.getPrevious();
		}
				
		
		//DELETION
		deletePatient(patientSeven); 
		deletePatient(patientTwo);
		patientListTraverse = patientListStart;	
		System.out.println("--Deleting specified patient--");
		System.out.println("--New List--");
		for (counter = 0; counter < Patient.getCount(); counter++) {
			System.out.println(patientListTraverse.getName() + " " + patientListTraverse.getAge() + " " + patientListTraverse.getIllness());
			patientListTraverse = patientListTraverse.getNext();
		}
		System.out.println("There are now " + Patient.getCount() + " patients.");
		
		//REVERSE LIST AFTER DELETION
		System.out.println("--New Reverse List--");
		counter = Patient.getCount();
		patientListTraverse = patientListEnd;
		for (counter = Patient.getCount(); counter > 0; counter--) {
			System.out.println(patientListTraverse.getName() + " " + patientListTraverse.getAge() + " " + patientListTraverse.getIllness());
			patientListTraverse = patientListTraverse.getPrevious();
		}
		
		
	
	//System.out.println(patientOne.getName() + " " + patientOne.getAge() + " " + patientOne.getIllness() + ".");
	//System.out.println(patientTwo.getName() + " " + patientTwo.getAge() + " " + patientTwo.getIllness() + ".");
	
	}
}