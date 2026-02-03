print("***********************************") # Enter
print("Willkommen beim IT Berufs Check!  *") # Begrüßung
print("***********************************") # Enter
print() # Enter
alter = input("Wie alt bist du?") # Variable und Spieler wird Frage gestellt

while True: # Wenn Wahr und Schleife
    interesse = input("Bist du interessiert an IT ? (ja/nein)") # Variable und Spieler wird Frage gestellt
    if interesse.lower() == "ja": # Wenn Ja dann Wahr
        print() # Enter
        print("Super IT ist riesig und total vielfältig – da gibt es viele spannende Bereiche, die du entdecken kannst z.B. ") # Bei Ja
        print() # Enter
        print("- Fachinformatiker in Anwendungsentwicklung") # Bei Ja
        print() # Enter
        print("- IT-Systemelektroniker") # Bei Ja
        print() # Enter
        print("- Kaufmann/-frau für Digitalisierungsmanagement  ") # Bei Ja
        break # Schleife abbruch

    elif interesse.lower() == "nein": # Wenn sonst Nein

        print("Das ist kein Problem. IT ist nicht jedermanns Sache, aber vielleicht entdeckst du später etwas, das dir Spaß macht.") # Bei Nein


        break # Schleife abbruch

    else: # Verschrieben
        print("Tut mir leid ich hab das nicht ganz verstanden gib (ja/nein) ein ") # Nicht Ja oder Nein gedrückt
        continue # Schleife geht weiter
print() # Enter
print("du hast angegeben dass du " + alter + " Jahre alt bist. ") # Variable Alter wird eingefügt
print() # Enter
print() # Enter
print("**************************") # Enter
print("Danke fürs Ausprobieren. * ") # Schlusstext
print("**************************") # Enter


