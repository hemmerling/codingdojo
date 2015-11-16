package gameoflife;

public class Zelle {
    int nachbarn;

    public boolean istLebendig = true;

    public Zelle(int anzahlNachbarn){
        nachbarn = anzahlNachbarn;
    }

    public Zelle(boolean istLebendig, int anzahlNachbarn){
        this.istLebendig = istLebendig;
        nachbarn = anzahlNachbarn;
    }

    public boolean zelleUeberlebt_veraltet() {
        boolean returnValue = false;
        if (istLebendig) {
            if (nachbarn == 3 || nachbarn == 2) {
                returnValue = true;
            }
        } else {
            if (nachbarn == 3) {
                returnValue = true;
            }
        }
        return returnValue;
    }

    public boolean zelleUeberlebt() {
        if (nachbarn == 3) return true;
        return istLebendig ? (nachbarn == 2 ? true : false) : false;
    }

}
