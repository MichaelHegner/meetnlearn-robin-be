package methoden.primitives;

import java.util.ArrayList;

public class PetClinic {
	public static String CLINIC_NAME = "Pet Clinic";
	
	public String instanceName = "Foo";
	private Waerter waerter = new Waerter("Joe");
	
	
	
	private ArrayList<String> petNames = new ArrayList<>();
	
	
	
	private int yearOfConstruction;
	
	
	public int getYearOfConstruction() {
		return yearOfConstruction;
	}
	
	public void setYearOfConstruction(int year) {
		if (year > 1900 && year < 2021) {
			this.yearOfConstruction = year;
		}
	}

	
	
	public static void greeting() {
		System.out.println("Hello to PetClinic");
	}
	
	public void greetingFromIntance() {
		System.out.println(instanceName);
	}
	
	public void addNewPet(String name) {
		petNames.add(name);
	}
	
	public ArrayList<String> getPetNames() {
		ArrayList<String> result = new ArrayList<>();
		
		for(String name : petNames) {
			result.add(name);
		}
		
		return result;
	}
	
	
	public Waerter getWaerter() {
		return waerter;
	}
	
	public void fillWithNames(ArrayList<String> callersList) {
		for (String name : petNames) {
			callersList.add(name);
		}
	}
	
	
	
	static class Waerter {
		String name;
		
		Waerter(String name) {
			this.name = name;
		}
	}
	
}



