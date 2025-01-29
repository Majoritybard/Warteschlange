import java.util.Scanner;

public class Verwaltung {

    private Scanner scanner;

    public static void main(String[] args) {

        new Verwaltung();
        System.out.println("Herzlich willkommen zu Zeichenketten verschluesselerer!");

    }
    public Verwaltung(){
        scanner = new Scanner(System.in);
        Warteschlange warteschlange= new Warteschlange();

        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1]Hinzufuegen");
            System.out.println("[2]Entfernen");
            System.out.println("[3]ZeigeInhalt");
            int option = scanner.nextInt();
            if(option==1) {

                System.out.println("Wie viele willst du hinzufuegen?");
                option = scanner.nextInt();
                for (int i=0;i<option;i++){
                   Kunde Speicher= new Kunde(""+i);
                    warteschlange.einfuegen(Speicher);

                }
            }else if (option==2){
                warteschlange.entfernen();
            }
            else if (option==3){
                Kunde hilfe = (Kunde) warteschlange.gibErsten();
                System.out.println(hilfe.getName());}

        }
    }
}
