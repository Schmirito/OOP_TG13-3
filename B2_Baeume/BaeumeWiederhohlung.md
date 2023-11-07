# Wiederhohlung Bäume

### 1. Welche Elemente gibt es in der Datenstruktur Baum?
- Wurzelknoten, innere Knoten, Blätter, Kindknoten, Vaterknoten

### 2. Was ist das besondere an einem Binärbaum?
- Ein Vaterknoten kann maximal 2 Kindknoten haben.

### 3. Welche Traversierungsmöglichkeiten von Bäumen kennen Sie?

    - Pre-Order  -> v - l - r
    - In-Order   -> l - v - r
    - Post-Order -> l - r - v

### 4. Beschreiben Sie einen Suchbaum:
- Er ist ein Binärbaum mit festgelegten Regeln.

Beispiel:

    - einzufügender Wert ist <= Vater, wird links eingefügt
    - einzufügender Wert ist > Vater, wird rechts eingefügt

### 5.Löschen von Knoten
    - Blattknoten und Elternknoten mit einem Kind (hierbei rutscht das Kind auf den Platz des Vaters) können direkt gelöscht werden.
    - Bei Knoten die 2 Kinder haben gilt:
        + im rechten Teilbaum den Knoten ganz links
        oder im linken Teilbaum ganz rechts wählen. 
