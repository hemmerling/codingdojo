package com.hemmerling.javatest.coderetreat01;

import junit.framework.Assert;

import org.junit.Test;

public class TestsForGameOfLiveRules {

	@Test
	public void eineTote_Zelle_Mit_Genau_Drei_Lebenden_Nachbarn_Wird_In_Der_Folgegeneration_Neu_Geboren() {
		
		// GIVEN
		Zustand meinZustand = Zustand.TOT;
		int anzahlVonLebendenNachbarn =3;
		Zelle zelle = new Zelle(meinZustand, anzahlVonLebendenNachbarn);

		// WHEN
		Zustand zustandInDerNechsteRunde = zelle.getZustandInDerNechsteRunde();
		
		// THEN
		Assert.assertEquals(zustandInDerNechsteRunde, Zustand.LEBENDIG);
	}
	
	@Test
	public void lebende_Zellen_mit_wenigerals_2lebenden_Nachbarn_sterben() {
		
		// GIVEN
		Zustand meinZustand = Zustand.LEBENDIG;
		int anzahlVonLebendenNachbarn =1;
		Zelle zelle = new Zelle(meinZustand, anzahlVonLebendenNachbarn);

		// WHEN
		Zustand zustandInDerNechsteRunde = zelle.getZustandInDerNechsteRunde();
		
		// THEN
		Assert.assertEquals(zustandInDerNechsteRunde, Zustand.TOT);
	}
	
	@Test
	public void lebendeZelle_mit_3_lebendenNachbarn_bleibtLebend() {
		
		// GIVEN
		Zustand meinZustand = Zustand.LEBENDIG;
		int anzahlVonLebendenNachbarn =3;
		Zelle zelle = new Zelle(meinZustand, anzahlVonLebendenNachbarn);

		// WHEN
		Zustand zustandInDerNechsteRunde = zelle.getZustandInDerNechsteRunde();
		
		// THEN
		Assert.assertEquals(zustandInDerNechsteRunde, Zustand.LEBENDIG);
	}	
	
	@Test
	public void lebendeZelle_mit_2_lebendenNachbarn_bleibtLebend() {
		
		// GIVEN
		Zustand meinZustand = Zustand.LEBENDIG;
		int anzahlVonLebendenNachbarn =2;
		Zelle zelle = new Zelle(meinZustand, anzahlVonLebendenNachbarn);

		// WHEN
		Zustand zustandInDerNechsteRunde = zelle.getZustandInDerNechsteRunde();
		
		// THEN
		Assert.assertEquals(zustandInDerNechsteRunde, Zustand.LEBENDIG);
	}
	
	@Test
	public void lebendeZelle_mit4_lebendenNachbarn_stirbt() {
		
		// GIVEN
		Zustand meinZustand = Zustand.LEBENDIG;
		
		int anzahlVonLebendenNachbarn =4;
		Zelle zelle = new Zelle(meinZustand, anzahlVonLebendenNachbarn);

		// WHEN
		Zustand zustandInDerNechsteRunde = zelle.getZustandInDerNechsteRunde();
		
		// THEN
		Assert.assertEquals(zustandInDerNechsteRunde, Zustand.TOT);
	}	
	
	@Test
	public void toteZelle_mit4_lebendenNachbarn_bleibt_tot() {
		
		// GIVEN
		Zustand meinZustand = Zustand.TOT;
		int anzahlVonLebendenNachbarn =4;
		Zelle zelle = new Zelle(meinZustand, anzahlVonLebendenNachbarn);

		// WHEN
		Zustand zustandInDerNechsteRunde = zelle.getZustandInDerNechsteRunde();
		
		// THEN
		Assert.assertEquals(zustandInDerNechsteRunde, Zustand.TOT);
	}
	
	

}
