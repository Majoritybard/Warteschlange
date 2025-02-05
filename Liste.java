public class Liste <T> {

    public  KnotenListe <T> Erster;
    public  KnotenListe <T> Letzter;
    public  KnotenListe <T> Aktueller;
    public  KnotenListe     next;

 public Liste(){



  }
    public void remove() {
        KnotenListe aktuellerKunde = Erster ;
        if( Erster!= null){
            Erster = aktuellerKunde.getNachfolger();
        }
    }

    public void append(T pKontent){
        KnotenListe ContentType=Erster;

        if (Erster == null){
            Erster = new KnotenListe<>(pKontent);
            Letzter=Erster;
        }
        else{
            while(ContentType.getNachfolger() != null) {
                ContentType = ContentType.getNachfolger();
            }
            ContentType.setNachfolger(new KnotenListe(pKontent));
            Letzter=ContentType;
        }
    }
    public void insert(T pContent){


    }
   public boolean isEmpty(){
     if (Erster==null){
         return true;
     }
     else {
         return false;
     }
   }

    public void next(){
  Aktueller=Aktueller.getNext();
 }

    public T getNext(){
     return next;

    }
    public void toFirst(){
     Aktueller=Erster;
    }
    public void  toLast(){
     Aktueller=Letzter;
    }
    public T getContent() {
     return T;

    }
    public  T setContent(T pContent){
     this.T=pContent;
    }
}
