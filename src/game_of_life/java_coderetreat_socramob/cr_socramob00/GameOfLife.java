
public class GameOfLife {

	private boolean istLebendig = false;
	private int anzahlNachbarn = 0;
	
	GameOfLife(int anzahlNachbarn, boolean istLebendig) {
	this.istLebendig = istLebendig;
	this.anzahlNachbarn = anzahlNachbarn;
	}
	
	public boolean istLebendigInNaechsterRunde() {
		return ( this.istLebendig && (this.anzahlNachbarn >=2 && this.anzahlNachbarn<= 3 ));
	}
}
