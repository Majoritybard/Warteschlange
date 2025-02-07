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
            Aktueller=Letzter;
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

     if (hasAccess()==true){
         String Speicher = Aktueller.toString();
         Aktueller.toFirst
         while (Speicher != Aktueller.getNachfolger()){}
     }

    }
   public boolean isEmpty(){
     if (Erster==null){
         return true;
     }
     else {
         return false;
     }
   }
   public boolean hasAccess(){
     if (Aktueller == null){
         return false;
     } else  {
         return true;
     }
   }

    public void next(){
    Aktueller= Aktueller.getNachfolger();
 }

    public T getNext(){
     return (T) next;

    }
    public void toFirst(){
     Aktueller=Erster;
    }
    public void  toLast(){
     Aktueller=Letzter;
    }

}
