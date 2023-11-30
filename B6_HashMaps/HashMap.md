# HashMap

## Was ist eine HashMap?
- Bei einer HashMap handelt es sich um eine art Liste welche 2 Werte (Key/value) speichern kann.

- Bei den beiden Werten kann es sich auch um verschiedene Datentypen handeln.

- Der sogenannte "key" hat immer einen zugeteilten "value".

- Über den "key" kann man das dazugehörigen "value" abfragen.

Man kann es sich quasi wie einen Raum vorstellen in dem sich viele Türen befinden. Sobald man jetzt mit einem seiner Schlüssel eine Tür öffnet sieht man was sich dahinter verbirgt (also der value).

## Wie funktioniert die HashMap im Code?
### Welche Befehle gibt es?
````java
//Eine neue HashMap wird erstellt.
//     ("key" , "value")
HashMap<String, String> namen = new HashMap<String, String>();

//Mithilfe von ".put()" kann man neue Werte der HashMap hinzufügen.
namen.put("Elias","Damerow");
namen.put("Joe","Mama");

//Um jetzt den Nachnamen von "Elias" zu bekommen verwendet man ".get()" und verweißt auf den key
namen.get("Elias");

//Einen Key mitsamt seines values löscht man mit ".remove()" und verweißt auf den key
namen.remove("Joe");

//Mit ".clear()" wird die gesamte HashMap gecleared
namen.clear();

//Durch ".size()" kann man herausfinden wie viele Plätze die HashMap besitzt
namen.size();
````
### Wie gibt man eine HashMap aus?
````java
//Die Ausgabe erfolgt in einer for-each Schleife

//Für die Ausgabe der keys verwendet man ".keySet()"
for (String i : namen.keySet()) {
  System.out.println(i);
}

//Für die Ausgabe der values verwendet man ".values()"
for (String i : namen.values()) {
  System.out.println(i);
}

//Die Ausgabe von key und value gleichzeitig sieht so aus:
for (String i : namen.keySet()) {
  System.out.println("key: " + i + " value: " + namen.get(i));
}
````

http://www.scalingbits.com/index.php/java/javakurs2/programmieren2/collection/maps
