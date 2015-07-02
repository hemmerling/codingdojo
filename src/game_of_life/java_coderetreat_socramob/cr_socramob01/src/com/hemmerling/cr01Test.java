package com.hemmerling;

import static org.junit.Assert.*;

import org.junit.Test;

public class cr01Test {

	boolean tot = false;
	boolean lebendig = true;

	@Test
	public void nurEinNachbarFuehrtZumTod() {
	// Given
	Zeile zeile1 = new Zeile (tot, tot, tot);
	Zeile zeile2 = new Zeile (tot, lebendig, lebendig);
	Zeile zeile3 = new Zeile (tot, tot, tot);
	Feld feld = new Feld(zeile1, zeile2, zeile3);
	Zeile erwarteteZeile1 = new Zeile (tot, tot, tot);
	Zeile erwarteteZeile2 = new Zeile (tot, tot, lebendig);
	Zeile erwarteteZeile3 = new Zeile (tot, tot, tot);
	Feld erwartetesFeld = new Feld(erwarteteZeile1,
			erwarteteZeile2, erwarteteZeile3);
	// When
	Feld berechnetesFeld = feld.iteriere();	
    // Then
	assertEquals(erwartetesFeld, berechnetesFeld);
	}

}
