# Ampel mit Threads
## Zustände
### Definition:
Die Nummerierung wird als Zustandsvariable umgestezt (Konstante). Der wechsel der Zustände wird über Switch-while Idion gelöst. Jede Ampel läuft in einem nebenläufigen Thread mit Interface Runnable.

1. Rot
2. Rot-Gelb
3. Grün
4. Gelb

## Benötigte Klassen
- ausführbare Klasse `StarteAmpel.jave`
- Klasse `Ampel.java`

## Ampelbeschreibung
- nach starten einer Ampel ist der Zustand Rot.
- `wartezeit` definiert die Wartezeit der Zustände.
- Die Ampel soll einen Namen besitzen, welcher mit der Variablen `name` festgelegt wird.

## Testszenario
- Es werden 2 Ampeln gestartet
- Es erfolgt die Ausgabe des Namens der Ampel mit zugehörigem Zustand


## Beim nächstenmal:
- Gui fertigstellen
- Anzeige erstellen
- usw...