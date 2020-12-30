package doloop;


public class MyLoopClass {

	public static void main(String[] args) {
		new MyLoopClass().loopBasic();
	}

	
	/*
	 * Die Do-Whileschleife nennt sich auch nicht abweisende Schleife, da die Bedingung erst nach dem ersten
	 * Schleifendurchlauf geprüft wird.
	 * 
	 * Somit wird die Schleife einmal oder mehrmals durchlaufen.
	 * 
	 * Sektion: Bedingung, ob eine (weitere) Iteration erfolgen soll.
	 */
	public void loopBasic() {

		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while(i < 10);
		
	}

}
