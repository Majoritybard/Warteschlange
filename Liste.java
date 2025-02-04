public class Liste <T> {

    public  KnotenListe <T> Erster;
    public  KnotenListe <T> Letzter;
    public  KnotenListe <T> Aktueller;


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
        }
        else{
            while(ContentType.getNachfolger() != null) {
                ContentType = ContentType.getNachfolger();
            }
            ContentType.setNachfolger(new KnotenListe(pKontent));
        }
    }
    public void insert(T pContent){


    }


    public void next(){
  Aktueller=
 }
}
