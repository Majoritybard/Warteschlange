public class Warteschlange <T> {
    private Knoten erster;
    private Knoten letzter;

    public Warteschlange(){

    }

    public T gibErsten(){
        return (T) erster.getKontent();
    }

    public void entfernen() {
        Knoten aktuellerKunde = erster ;
        if( erster!= null){
            erster = aktuellerKunde.getNachfolger();
        }
    }

    public void einfuegen(T pKontent){
        Knoten ContentType=erster;

        if (erster == null){
            erster = new Knoten<>(pKontent);
            letzter=erster;
        }
        else{
            while(ContentType.getNachfolger() != null) {
                ContentType = ContentType.getNachfolger();
            }
            ContentType.setNachfolger(new Knoten<>(pKontent));
            letzter=ContentType;
        }
    }
}
