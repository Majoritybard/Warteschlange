public class Kunde {
    private String name;
    private boolean hatErhalten;
    private int Geld;
    private String Wunschgetraenk;

    public Kunde(String pName,String pWunschgetraenk){
        this.name = pName;
    }


    public void setName(String pName){
        name= pName;
    }

    public String getName(){
        return name;
    }

}
