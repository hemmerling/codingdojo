package gameoflife;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by smile on 13.11.15.
 */
public class MainTest {

    @Test
    public void lebendeZelleMit0NachbarnStirbt() throws Exception {
        int anzahlDerNachbarn = 0;
        Zelle myZelle = new Zelle(anzahlDerNachbarn);
        assertTrue ("Zelle Mit 0 Nachbarn Stirbt", !myZelle.zelleUeberlebt());
    }

    @Test
    public void lebendeZelleMit3NachbarnLebt() throws Exception {
        int anzahlDerNachbarn = 3;
        Zelle myZelle = new Zelle(anzahlDerNachbarn);
        assertTrue ("Zelle Mit 3 Nachbarn Lebt", myZelle.zelleUeberlebt());
    }
    @Test
    public void lebendeZelleMit2NachbarnLebt() throws Exception {
        int anzahlDerNachbarn = 2;
        Zelle myZelle = new Zelle(anzahlDerNachbarn);
        assertTrue ("Zelle Mit 2 Nachbarn Lebt", myZelle.zelleUeberlebt());
    }
    @Test
    public void toteZelleMit3NachbarnLebt() throws Exception {
        int anzahlDerNachbarn = 3;
        Zelle myZelle = new Zelle(anzahlDerNachbarn);
        myZelle.istLebendig = false;
        assertTrue ("Tote Zelle Mit 3 Nachbarn Lebt", myZelle.zelleUeberlebt());
    }
    @Test
    public void ueberfluessigerTest() throws Exception {
        int anzahlDerNachbarn = 4;
        Zelle myZelle = new Zelle(anzahlDerNachbarn);
        //myZelle.istLebendig = true;
        assertTrue ("Zelle Mit 4 Nachbarn Stirbt", !myZelle.zelleUeberlebt());
    }

    @Test
    public void toteZelleMit3NachbarnLebt2() throws Exception {
        int anzahlDerNachbarn = 3;
        boolean istLebendig = false;
        Zelle myZelle = new Zelle(istLebendig,anzahlDerNachbarn);
        assertTrue ("Tote Zelle Mit 3 Nachbarn Lebt", myZelle.zelleUeberlebt());
    }

}
