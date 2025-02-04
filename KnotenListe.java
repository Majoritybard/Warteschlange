public class KnotenListe <T> {
    private T Kontent;
    private KnotenListe nachfolger;

    public KnotenListe(T pKontent){
        Kontent=pKontent;
        nachfolger=null;
    }
    public void setNachfolger(KnotenListe pKnoten) {
        this.nachfolger = pKnoten;
    }

    public KnotenListe getNachfolger() {
        return nachfolger;
    }

    public T getKontent(){return Kontent;}
}
