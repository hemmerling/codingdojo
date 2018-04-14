package com.hemmerling.javatest.coderetreat01;

public class Zelle {

	private int anzahlNachbarn;
	private Zustand zustand;

	public Zelle(Zustand meinZustand, int anzahlVonLebendenNachbarn) {
		zustand=meinZustand;
		anzahlNachbarn =anzahlVonLebendenNachbarn;
	}

	public Zustand getZustandInDerNechsteRunde() {
		
		if ( (zustand == Zustand.LEBENDIG ) && ( anzahlNachbarn < 2 ) ) {
			return Zustand.TOT;
		} else 	if ( (zustand == Zustand.LEBENDIG ) && ( anzahlNachbarn >= 4 ) ) {
			return Zustand.TOT;
		} else if(zustand==Zustand.TOT && anzahlNachbarn >3){
			return Zustand.TOT;
		}
		return Zustand.LEBENDIG;
	}

}

