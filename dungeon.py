energie = 10 # Start Energie

import random # Zufallsmodul einleiten
print() # Enter
print("*************************") # Enter
print("Willkommen im Dungeon ! *") # Begrüßung
print("*************************)"
while energie > 0: # Solange der Spieler noch Energie hat
    print("---------------------") # Enter
    print("Energie: " , energie) # Energie anzeigen
    print("---------------------") # Enter

    wahl = input("Welche Tür nimmst du links oder rechts?").lower() # Spieler wird gefragt welche Tür er nehmen soll
    effekt =random.randint(-2 , 2) # Zufallsefekt für die Energie

    if wahl == "links": # wenn Spieler links nimmt
        energie += effekt  # Spieler Erhält oder Verliert Energie

        print("Du hast Links genommen du Kriegst" , effekt ,"Energie",) # Für links entschieden kriegt oder verliert Energie


    elif wahl.lower() == "rechts": # Sonst wenn Spieler rechts nimmt
        energie += effekt # Spieler Erhält oder Verliert Energie
        print("Du hast Rechts genommen du kriegst" , effekt ,"Energie",) # Für rechts entschieden kriegt oder verliert Energie


    else:
        print("Du hast gezögert du verliert 1 Energie",) # Tippfehler oder Falsche Eingabe
        energie -= 1 # Man verliert 1 Energie es kommt eine Warnung

    if energie <= 0: # Wenn Energie gleich 0
        break # dann hört die schleife auf Game over
print() # Enter
print("Game Over") # Spiel Vorbei
print("***************************") # Enter
print("Danke fürs Ausprobieren ! * ") # Schlusstext
print("***************************") # Enter




