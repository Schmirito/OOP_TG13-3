# Threads mithilfe eines Interrupts beenden

## Weshalb Interrupts?
Ein Thread kann, beziehungsweise sollte, nicht mit der methode "stop()" beendet werden, da hierdurch Daten verloren gehen könnten.

Neue verwendung:

** Bild von "t.interrupt()" einfügen**
## Wie Funktioniert es?

1. Zuerst muss eine Klasse erstellt werden, welche Threads implementiert oder von der oberklasse "Thread" erbt. Hier wird festgelegt was der Thread wärend seiner lebzeit tun soll.
2. Danach wird eine Klasse mit einer main-Methode erstellt, welche ein Objekt der Threadklasse erstellt.
3. 