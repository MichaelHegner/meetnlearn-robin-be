package whileloop;

public class MyLoopClass {

	public static void main(String[] args) {
		new MyLoopClass().loopBasic();
	}

	/*
	 * Die Whileschleife nennt sich auch abweisende Schleife, da die Bedingung
	 * zuerst geprüft wird, und abhängig von dessen Ergebnis entschieden wird, ob in
	 * Schleife eingetreten wird oder nicht.
	 * 
	 * Somit wird die Schleife keinmal, einmal oder mehrmals durchlaufen. Die
	 * Zählvariable wird zu Beginn ausserhalb der Schleife definiert und
	 * initialisiert.
	 * 
	 * Sektion: Bedingung, ob eine (weitere) Iteration erfolgen soll.
	 */
	public void loopBasic() {

		int i = 9;
		while (i < 10) {
			System.out.println(i);
			i++;
		}

		System.out.println("ENDE");
	}

}
