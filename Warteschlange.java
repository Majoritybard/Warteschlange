public class Warteschlange <T> {
    private Knoten erster;

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
        Knoten ContentType= new Knoten<>(pKontent);

        if (erster == null){
            erster = ContentType;
        }
        else{
            while(ContentType.getNachfolger() != null) {
                ContentType = ContentType.getNachfolger();
            }
            ContentType.setNachfolger(ContentType);
        }
    }
}
