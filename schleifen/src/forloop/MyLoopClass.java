package forloop;

public class MyLoopClass {

	public static void main(String[] args) {
		new MyLoopClass().loopBasic();
	}
	
	
	/*
	 * Die Forschleife wird meist mit einem Startwert und einer Endbedingung genutzt.
	 * Die Anzahl der Schleifendurchgänge ist meist schon fix bekannt.
	 * 
	 * Sektion 1: Initialisierung der variable i mit zugewiesenem Wert (Startwert), hier 0
	 * Sektion 2: Bedingung, wie oft die Schleife durchlaufen werden soll.
	 * Sektion 3: Ausführung nach jedem Schleifendurchlauf, meist Hochzählung der Zählvariable
	 */
	public void loopBasic() {
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
	}

}
