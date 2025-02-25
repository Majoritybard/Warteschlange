public class Rechnung {
    private int Rechungsnr;
    private int Betrag;
    private String Datum;

    public Rechnung (String pDatum,int pRechnungsNr,int pBetrag){
    this.Datum=pDatum;
    this.Rechungsnr=pRechnungsNr;
    this.Betrag=pBetrag;
    }
    public String getDatum() {
        return Datum;
    }
    public int getBetrag() {
        return Betrag;
    }
    public int getRechungsnr() {
        return Rechungsnr;
    }
}
