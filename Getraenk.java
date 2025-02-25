public class Getraenk {
    private String name;
    private int preis;

    public Getraenk(String pName, int pPreis){
        this.name=pName;
        this.preis=pPreis;
    }

    public int getPreis() {
        return preis;
    }
    public String getName() {
        return name;
    }
}
