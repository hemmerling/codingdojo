package com.hemmerling.javatest.coderetreat01;

import java.util.ArrayList;

import junit.framework.Assert;

import org.junit.Test;

public class TestForGameOfLiveSpecificGameConfigurations {

	
	@Test
	public void testEinfache3ZelleSpiel_alleZellenSollenInDerNechteRundeTotSein() throws Exception {
		
		// GIVEN
		SpielKonfiguration ersteRundeZustand = SpielKonfiguration.createTestKonfiguration();
		SpielKonfiguration zweiteRundeZustand = new SpielKonfiguration();
		
		Spiel spiel = new Spiel();
		
		// WHEN
		zweiteRundeZustand = spiel.bestimmeZustandInDerNechsteRunde(ersteRundeZustand);
		
		// THEN
		Assert.assertEquals(true, spiel.sindAlleZellenTot());
	}
	
}
