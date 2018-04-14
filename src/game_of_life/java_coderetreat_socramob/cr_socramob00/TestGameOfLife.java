import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class TestGameOfLife {

	@Test
	public void einNachbar() {
		// Given
		int anzahlNachbarn = 1;
		boolean istLebendig = true;
		GameOfLife golZelle = new GameOfLife(anzahlNachbarn, istLebendig);
		// When
		boolean istLebendigInNaechterRunde = golZelle.istLebendigInNaechsterRunde();
		// Then
		Assert.assertEquals(istLebendigInNaechterRunde,  false);
	}
	
	@Test
	public void keinNachbar() {
		// Given
		int anzahlNachbarn = 0;
		boolean istLebendig = true;
		GameOfLife golZelle = new GameOfLife(anzahlNachbarn, istLebendig);
		// When
		boolean istLebendigInNaechterRunde = golZelle.istLebendigInNaechsterRunde();
		// Then
		Assert.assertEquals(istLebendigInNaechterRunde,  false);
	}
	
	@Test
	public void zweiNachbarn() {
		// Given
		int anzahlNachbarn = 2;
		boolean istLebendig = true;
		GameOfLife golZelle = new GameOfLife(anzahlNachbarn, istLebendig);
		// When
		boolean istLebendigInNaechterRunde = golZelle.istLebendigInNaechsterRunde();
		// Then
		Assert.assertEquals(istLebendigInNaechterRunde,  true);
	}
	
	@Test
	public void vierNachbarn() {
		// Given
		int anzahlNachbarn = 4;
		boolean istLebendig = true;
		GameOfLife golZelle = new GameOfLife(anzahlNachbarn, istLebendig);
		// When
		boolean istLebendigInNaechterRunde = golZelle.istLebendigInNaechsterRunde();
		// Then
		Assert.assertEquals(istLebendigInNaechterRunde,  false);
	}
	
	@Test
	public void vierNachbarn() {
		// Given
		int anzahlNachbarn = 3;
		boolean istLebendig = false;
		GameOfLife golZelle = new GameOfLife(anzahlNachbarn, istLebendig);
		// When
		boolean istLebendigInNaechterRunde = golZelle.istLebendigInNaechsterRunde();
		// Then
		Assert.assertEquals(istLebendigInNaechterRunde,  true);
	}

}
