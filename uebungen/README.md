# Übungen

Ein Package pro Lektion, darin die Übungen dieser Lektion:

```
uebungen/
└── src/
    ├── l01/
    │   └── Main.java
    ├── l02/
    │   ├── Main.java
    │   └── Calculator.java
    └── …
```

Neue Lektion in IntelliJ: Rechtsklick auf `src` → **New → Package** → `l05`.
IntelliJ schreibt dann `package l05;` oben in jede Datei darin. Diese Zeile sagt nur,
in welchem Ordner die Klasse liegt. Packages kommen später im Kurs noch genauer dran.

Am Ende der Lektion:

```
git add uebungen/src/l05
git commit -m "L05: Übungen zu Operatoren"
git push
```
