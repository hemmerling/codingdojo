package com.hemmerling.gameoflife.coderetreat01;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TestGameOfLife {

	@Test
	public void eineToteZelle_mit3Nachbarn_wirdGeboren() {
      // Given
	  Zelle eineZelle = new Zelle();
	  eineZelle.setLebensStatus(false);
	  eineZelle.setNachbarn(3);
	  // When
	  eineZelle.naechsteGeneration(); 
	  // Then	
	  Assert.assertEquals(true, eineZelle.getLebensStatus());  
		
	}
	@Test
	public void eineLebendeZelle_mit1Nachbarn_wirdSterben() {
      // Given
	  Zelle eineZelle = new Zelle();
	  eineZelle.setLebensStatus(true);
	  eineZelle.setNachbarn(1);
	  // When
	  eineZelle.naechsteGeneration(); 
	  // Then	
	  Assert.assertEquals(false, eineZelle.getLebensStatus());  
		
	}

	@Test
	public void eineLebendeZelle_mit2Nachbarn_wirdLeben() {
      // Given
	  Zelle eineZelle = new Zelle();
	  eineZelle.setLebensStatus(true);
	  eineZelle.setNachbarn(2);
	  // When
	  eineZelle.naechsteGeneration(); 
	  // Then	
	  Assert.assertEquals(true, eineZelle.getLebensStatus());  
		
	}
	@Test
	public void eineLebendeZelle_mit3Nachbarn_wirdLeben() {
      // Given
	  Zelle eineZelle = new Zelle();
	  eineZelle.setLebensStatus(true);
	  eineZelle.setNachbarn(3);
	  // When
	  eineZelle.naechsteGeneration(); 
	  // Then	
	  Assert.assertEquals(true, eineZelle.getLebensStatus());  
		
	}
	@Test
	public void eineLebendeZelle_mit4Nachbarn_wirdSterben() {
      // Given
	  Zelle eineZelle = new Zelle();
	  eineZelle.setLebensStatus(true);
	  eineZelle.setNachbarn(4);
	  // When
	  eineZelle.naechsteGeneration(); 
	  // Then	
	  Assert.assertEquals(false, eineZelle.getLebensStatus());  
		
	}
	@Test
	public void gesetztenNachbarnPruefen(){
		//Given
		Zelle zelle = new Zelle();
		Zelle nachbar = new Zelle();
		//When
		zelle.setNachbar(nachbar);
		//Then
		assertEquals(nachbar , zelle.getNachbar());
		
	}
	
	@Test
	public void zweiNachbarnPruefen(){
		//Given
		Zelle zelle = new Zelle();
		Zelle nachbar = new Zelle();
		Zelle nachbar2 = new Zelle();
		//When
		zelle.setNachbar(nachbar);
		zelle.setNachbar(nachbar2);
		//Then
		assertEquals(2, zelle.anzahlNachbarn());
		
	}
}
