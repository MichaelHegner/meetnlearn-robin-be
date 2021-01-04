package methoden.primitives;

import java.util.ArrayList;

import methoden.primitives.PetClinic.Waerter;

public class MethodWithPrimitives {

	public static void main(String... strings) {
		
		// ZUGRIFF IM STATISCHEN CONTEXT, PetClinit.*
		PetClinic.greeting();
//		System.out.println(PetClinic.CLINIC_NAME);
		
		
		PetClinic clinic = new PetClinic();        // Pet Clinic
//		System.out.println(clinic.CLINIC_NAME);    // Pet Clinic
		clinic.CLINIC_NAME = "Other Name";         // Other Name
		
		
		PetClinic clinic2 = new PetClinic();       // Other Name
//		System.out.println(clinic2.CLINIC_NAME);   // Other Name
		
		
		PetClinic clinic3 = new PetClinic();
		clinic3.instanceName = "Bar";
//		System.out.println(clinic.instanceName);  // Foo
//		System.out.println(clinic3.instanceName); // Bar
	
		
		// Methoden
//		clinic.greetingFromIntance();
		clinic.addNewPet("Tom"); // Füge neues Pet in Clinic hinzu
//		System.out.println(clinic.getPetNames());
		
		
		
		ArrayList<String> petNames = clinic.getPetNames();
		petNames.add("Jerry");
//		System.out.println(clinic.getPetNames());
		
		
		
		Waerter waerter = clinic.getWaerter();
		waerter.name = "Jim";
//		System.out.println(clinic.getWaerter().name);	
		
		
		int yearOfConstruction = clinic.getYearOfConstruction();
		yearOfConstruction = 1;
//		System.out.println(clinic.getYearOfConstruction());

		
		
		ArrayList<String> myListToFill = new ArrayList<>();
		clinic.fillWithNames(myListToFill);
		System.out.println(myListToFill);
		
		
		
		
		clinic.setYearOfConstruction(8383883);
		
		
	}
	
	
	
}
