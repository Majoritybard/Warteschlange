public class Kunde {
    private String name;
    private boolean hatErhalten;
    private int Geld;
    private String Wunschgetraenk;
    private Getraenk getraenk;
    private Rechnung rechnung;

    public Kunde(String pName,String pWunschgetraenk){
        this.name = pName;
        this.Wunschgetraenk=pWunschgetraenk;
    }


    public void setName(String pName){
        name= pName;
    }
    public String getName(){
        return name;
    }
    public boolean getHatErhalten() {return hatErhalten;}
    public void setHatErhalten(boolean hatErhalten) {this.hatErhalten = hatErhalten;}
    public int getGeld() {return Geld;}
    public void setGeld(int geld) {Geld = geld;}
    public String getWunschgetraenk() {return Wunschgetraenk;}
    public Getraenk getGetraenk(){return getraenk;}
    public Rechnung getRechnung(){return  rechnung;}
    public void setGetraenk(Getraenk pGetraenk){this.getraenk=pGetraenk;}
    public void setRechnung(Rechnung pRechnung){this.rechnung=pRechnung;}
}
