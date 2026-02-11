import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String Weiter = "Weitergehen";
        String Suchen = "Erforschen";
        String Antwort = "Ja";
        String Antwort2 = "Umgucken";
        String Richtung = "Links";
        String Richtung2 = "Rechts";
        Scanner scanner = new Scanner(System.in);

        // Zum gucken wie der Linke Gang verläuft
        boolean linkerGangBlockiert = false;

        System.out.println("Wie ist dein Name? ");
        String playerinput = scanner.nextLine();
        System.out.println("Hallo " + playerinput + " Wilkommen ! ");

        // Schleife für die Frage (Ja) (Umgucken)
        while (true) {
            System.out.println("Bist du bereit in die Tiefen des Dungeons Einzutreten? (Ja) / (Umgucken) ");
            String playerinput2 = scanner.nextLine().trim();

            if (Antwort.equalsIgnoreCase(playerinput2)) {
                System.out.println(" Gut das Abenteuer Wartet schon ! ");
                break;
            } else if (Antwort2.equalsIgnoreCase(playerinput2)) {
                System.out.println(" Du schaust dich Um ein Dunkler Monströser Wald voller Nebel und Absoluter Stille...");
                System.out.println(" Du siehst nichts außer Totem Wald und Toten Tieren...");
                break;
            } else {
                System.out.println("Du hast gezögert Bitte gib (Ja) oder (Umgucken) ein.");
            }
        }

        System.out.println("Du machst die Türen auf und gehst die Langen Stufen Runter.");
        System.out.println("Nachdem du Unten angekommen bist gibt es einen Linken Weg und einen Rechten");
        System.out.println(" Gehst du Nach (Links) oder (Rechts) ?");

        // Schleife um die Richtung zu Wählen.
        while (true) {
            String playerinput3 = scanner.nextLine().trim();

            // Linker Weg
            if (playerinput3.equalsIgnoreCase(Richtung)) {
                if (!linkerGangBlockiert) {
                    System.out.println("Du gehst den linken Gang entlang, doch plötzlich stürzt er ein!");
                    System.out.println("Du musst zurück zur Treppe...");
                    linkerGangBlockiert = true; // Gang ist blockiert
                    System.out.println("Gehst du Nach (Links) oder (Rechts) ?");
                    continue; // zurück zur Eingabe vom Weg.
                } else {
                    System.out.println("Dieser Gang ist verschüttet, du musst nach Rechts gehen!");
                    System.out.println("Gehst du Nach (Links) oder (Rechts) ?");
                    continue;
                }
            }

            // Rechter Weg.
            else if (playerinput3.equalsIgnoreCase(Richtung2)) {
                System.out.println("Du gehst den dunklen, langen Gang entlang, Schritt für Schritt.");
                System.out.println("Dein Atem hallt leise von den Wänden wieder.");
                System.out.println("Du fühlst etwas vertrautes ein Helles Licht Was ist das?");
                System.out.println("Je näher du dem Licht kommst, desto stärker fühlst du dich als ob etwas in dir erwacht.");
                System.out.println("Du siehst Licht am Ende des Ganges. Willst du das Licht (Erforschen) oder (Weitergehen) ? ");
                String playerinput5 = scanner.nextLine().trim();

                if (playerinput5.equalsIgnoreCase(Suchen)) {
                    System.out.println(" Du gehst näher ans Licht. Du fühlst dich stärker als je zuvor! ");
                    System.out.println(" Das Licht verschwindet und du Absorbierst es ?!");
                    System.out.println(" Als du den Raum verlässt gehst du Selbstsicher weiter den Blick nach vorne gerichtet und Bereit aus diesem Dungeon zu Entkommen! ");
                    System.out.println(" Du siehst eine Tür am ende des Gangs du gehst hinein Selbstsicher und Stark ! ");
                    System.out.println(" Du siehst eine Mysteriöse Gestalt...");
                    System.out.println(" Hinter der Mysteriösen Gestalt ist der Ausgang !!!");
                    System.out.println(" Du stehst vor der Mysteriösen Kreatur ohne auch nur einen Funken angst. ");
                    // Spieler und Gegner Werte
                    int spielerLP = 35;
                    int gegnerLP = 30;
                    int spielerSchaden = 5;
                    int gegnerSchaden = 3;

                    System.out.println("Die Kreatur greift dich an!");

                    // Kampf
                    while (spielerLP > 0 && gegnerLP > 0) {
                        System.out.println("Deine LP: " + spielerLP + " | Gegner LP: " + gegnerLP);
                        System.out.println("Willst du (Angreifen) oder (Abblocken)?");
                        String aktion = scanner.nextLine().trim();

                        if (aktion.equalsIgnoreCase("Angreifen")) {
                            gegnerLP -= spielerSchaden;
                            System.out.println("Du greifst an und verursachst " + spielerSchaden + " Schaden!");

                            if (gegnerLP > 0) {
                                spielerLP -= gegnerSchaden;
                                System.out.println("Die Kreatur greift zurück und verursacht " + gegnerSchaden + " Schaden!");
                            }

                        } else if (aktion.equalsIgnoreCase("Abblocken")) {
                            System.out.println("Du blockst den Angriff und bekommst keinen Schaden!");
                        } else {
                            System.out.println("Ungültige Aktion! Bitte wähle (Angreifen) oder (Abblocken).");
                        }
                    }

                    // Kampf Ende
                    if (spielerLP > 0) {
                        System.out.println("Du hast den Kampf gewonnen!");

                    }

                    System.out.println("Die Kreatur sie verschwindet im Schatten, als hätte sie nie existiert.");
                    System.out.println("Du stehst allein im Raum, ruhig atmend, stärker als zuvor.");
                    System.out.println("Ohne zu zögern gehst du am Ort des Kampfes vorbei und verlässt den Dungeon.");
                    System.out.println("Zum ersten Mal hast du keine Angst vor der Dunkelheit.");
                    System.out.println(" Gutes Ende ");
                    System.out.println(" Danke fürs Ausprobieren ! ");

                    // Das Licht nicht Erforschen
                } else if (playerinput5.equalsIgnoreCase(Weiter)) {
                    System.out.println(" Du verlässt vorsichtig den Raum aber etwas fehlt dir... ");
                    System.out.println(" Du siehst eine Tür am ende des Gangs du gehst hinein unsicher und Ängstlich...");
                    System.out.println(" Du siehst eine Mysteriöse Gestalt...");
                    System.out.println(" Hinter der Mysteriösen Gestalt ist der Ausgang !!!");
                    System.out.println(" Deine Beine Zittern und du bist wie erstarrt von dieser Mysteriösen Kreatur... ");
                    // Spieler und Gegner Werte
                    int spielerLP = 20;
                    int gegnerLP = 30;
                    int spielerSchaden = 4;
                    int gegnerSchaden = 2;


                    System.out.println("Die Kreatur greift dich an!");



                    // Kampf
                    while (spielerLP > 0 && gegnerLP > 0) {
                        System.out.println("Deine LP: " + spielerLP + " | Gegner LP: " + gegnerLP);
                        System.out.println("Willst du (Angreifen) oder (Abblocken)?");
                        String aktion = scanner.nextLine().trim();

                        if (aktion.equalsIgnoreCase("Angreifen")) {
                            gegnerLP -= spielerSchaden;
                            System.out.println("Du greifst an und verursachst " + spielerSchaden + " Schaden!");

                            if (gegnerLP > 0) {
                                spielerLP -= gegnerSchaden;
                                System.out.println("Die Kreatur greift zurück und verursacht " + gegnerSchaden + " Schaden!");
                            }

                        } else if (aktion.equalsIgnoreCase("Abblocken")) {
                            System.out.println("Du blockst den Angriff und bekommst keinen Schaden!");
                        } else {
                            System.out.println("Ungültige Aktion! Bitte wähle (Angreifen) oder (Abblocken).");
                        }
                    }

                    // Kampf Ende
                    if (spielerLP > 0) {
                        System.out.println("Du hast den Kampf gewonnen!");


                        System.out.println(" Mit letzter Kraft gehst du raus aus dem Dungeon und entkommst. ");
                        System.out.println(" Draußen atmest du tief durch, die kalte Luft füllt deine Lungen. ");
                        System.out.println(" Doch ein seltsames, leeres Gefühl bleibt in dir zurück. ");
                        System.out.println(" Etwas fehlt, etwas Entscheidendes, das du vergessen hast. ");
                        System.out.println(" Du gehst weiter aus dem Dungeon, vorsichtig, unsicher, mit der Ahnung, dass diese Nacht dich verändert hat. ");
                        System.out.println(" Schlechtes Ende ");
                        System.out.println(" Danke fürs Ausprobieren !");
                    }
                }
                break; // Spielende
            } else {
                System.out.println("Bitte wähle (Links) oder (Rechts) !");
            }
        }
    }
}

