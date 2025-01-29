public class Knoten <T> {
    private T Kontent;
    private Knoten nachfolger;

    public Knoten(T pKontent){
    Kontent=pKontent;
    nachfolger=null;
    }
    public void setNachfolger(Knoten pKnoten) {
        this.nachfolger = pKnoten;
    }

    public Knoten getNachfolger() {
        return nachfolger;
    }

    public T getKontent(){return Kontent;}
}
