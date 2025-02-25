import java.util.Scanner;

public class Verwaltung {

    private Scanner scanner;

    public static void main(String[] args) {
        new Verwaltung();
        System.out.println("Wilkommen zu Bucksstar!");
    }

    public Verwaltung() {
        scanner = new Scanner(System.in);

        // Instanzierung der Warteschlange, des Stacks und der Liste
        Warteschlange<Kunde> warteschlange = new Warteschlange<>();
        Stack<Kunde> stack = new Stack<>();
        Liste<Kunde> liste = new Liste<>();

        while (true) {
            System.out.println("[1] Bestellen");
            System.out.println("[2] Kaffeliste anzeigen");
            System.out.println("[3] Kaffeliste auffüllen");
            System.out.println("[4] Beenden");
            int hauptOption = scanner.nextInt();
            scanner.nextLine(); // Scanner leeren

            switch (hauptOption) {
                case 1:
                    verwalteWarteschlange(warteschlange);
                    break;
                case 2:
                    ;
                case 3:
                    String Kaffee = "";
                    for (int i=0; i<4;i++){

                        if (i == 0){
                        Kaffee="Iced Caramell";
                        }

                        liste.append(Kaffee);
                    }
                case 4:
                    System.out.println("Programm beendet.");
                    return; // Programm beenden
                default:
                    System.out.println("Ungültige Auswahl, bitte versuche es erneut.");
                    break;
            }
        }
    }

    // Warteschlangen-Optionen
    private void verwalteWarteschlange(Warteschlange<Kunde> warteschlange) {
        while (true) {
            System.out.println("Namen Angeben");
            String name = scanner.nextLine();
            scanner.nextLine(); // Scanner leeren
            System.out.println("Welches Getränk möchtest du?");

            }
        }
    }

    // Stack-Optionen
    private void verwalteStack(Stack<Kunde> stack) {
        while (true) {
            System.out.println("== STACK MENÜ ==");
            System.out.println("[1] Hinzufügen zum Stack");
            System.out.println("[2] Entfernen aus dem Stack");
            System.out.println("[3] Zeige Inhalt des Stacks");
            System.out.println("[4] Zurück zum Hauptmenü");
            int option = scanner.nextInt();
            scanner.nextLine(); // Scanner leeren

            switch (option) {
                case 1:
                    System.out.println("Namen des Kunden angeben, der zum Stack hinzugefügt werden soll:");
                    String stackName = scanner.nextLine();
                    Kunde stackKunde = new Kunde(stackName);
                    stack.add(stackKunde);
                    break;
                case 2:
                    stack.remove();
                    break;
                case 3:
                    Kunde hilfeStack = stack.getContent();
                    if (hilfeStack != null) {
                        System.out.println("Oberster Kunde im Stack: " + hilfeStack.getName());
                    } else {
                        System.out.println("Der Stack ist leer.");
                    }
                    break;
                case 4:
                    return; // Zurück zum Hauptmenü
                default:
                    System.out.println("Ungültige Auswahl, bitte versuche es erneut.");
                    break;
            }
        }
    }

    // Liste-Optionen
    private void verwalteListe(Liste<Kunde> liste) {
        while (true) {

            switch (option) {
                case 1:
                    System.out.println("Namen des Kunden angeben, der zur Liste hinzugefügt werden soll:");
                    String listeName = scanner.nextLine();
                    Kunde listeKunde = new Kunde(listeName);
                    liste.append(listeKunde);
                    break;
                case 2:
                    System.out.println("Namen des Kunden angeben, der an der aktuellen Position eingefügt werden soll:");
                    String insertName = scanner.nextLine();
                    Kunde insertKunde = new Kunde(insertName);
                    liste.insert(insertKunde);
                    break;
                case 3:
                    liste.remove();
                    break;
                case 4:
                    if (liste.isEmpty()) {
                        System.out.println("Die Liste ist leer.");
                    } else {
                        if (liste.g.getNachfolger() == null) {
                            System.out.println("Erster Kunde in der Liste: " + liste.Erster.getContent().getName());
                        } else {
                            while (liste.Aktueller != null) {
                                System.out.println("Kunde: " + liste.Aktueller.getContent().getName());
                                liste.Aktueller = liste.Aktueller.getNachfolger();
                            }
                            if (liste.Aktueller == null) {
                                liste.Aktueller = liste.Erster;
                            }
                        }
                    }
                    break;
                case 5:
                    return; // Zurück zum Hauptmenü
                default:
                    System.out.println("Ungültige Auswahl, bitte versuche es erneut.");
                    break;
            }
        }
    }
}
