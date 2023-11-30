# HashSet
## Was ist ein HashSet?
- Bei einem HashSet handelt es sich um eine Sammlung von einzigartigen Werten (D.h. Das es nicht 2, oder mehrmals, den selben Wert gibt).

## Wie funktioniert ein HashSet im Code?
### Welche Befehle gibt es?
````java
//Ein neues HashSet erstellen
HashSet<String> autos = new HashSet<String>();

//Ein neuer Wert wird mithilfe von ".add()" hinzugefügt
//Obwohl "BMW" hier 2-mal genannt ist, wird es in der Ausgabe später nur 1-mal angezeigt.
autos.add("Volvo");
autos.add("BMW");
autos.add("Ford");
autos.add("BMW");
autos.add("Mazda");

//Mit ".contains()" überprüft man ob es einen gewissen Wert schon in der Liste gibt
autos.contains("Mazda");

//Durch ".remove()" entfernt man einen bestimmten Wert.
autos.remove("Volvo");

//Mithilfe von ".clear()" entfern man alle Werte aus dem HastSet
autos.clear();

//Die größe eines HashSets kann man mit ".size()" bestimmen
autos.size();
````
### Wie gibt man ein HashSet aus?
````java
//Die Ausgabe kann über einen normalen "System.out.print()" oder eine for-each Schleife erfolgen

//Der normale System.out.print ist sinnvoll wenn man die "Liste" nur ausgeben möchte.
System.out.println(autos);

//Die for-each Schleife ist sinnvoll sobald man mit den einzelnen Werten innerhalb des HashSets interargieren möchte.
for (String i : autos) {
  System.out.println(i);
}
````