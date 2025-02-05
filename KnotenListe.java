public class KnotenListe <T> {
    private T Content;
    private KnotenListe nachfolger;
    private T next;

    public KnotenListe(T pKontent){
        Content=pKontent;
        nachfolger=null;
    }
    public void setNachfolger(KnotenListe pKnoten) {
        this.nachfolger = pKnoten;
    }

    public KnotenListe getNachfolger() {
        return nachfolger;
    }

    public T getContent(){return Content;}


    public void setContent(T content) {
        Content = content;
    }
    public void setNext(T next) {
        this.next = next;
    }

    public T getNext() {
        return next;
    }
}
