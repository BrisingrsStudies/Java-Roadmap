# Java-Roadmap

Mein Java-Kurs nach [roadmap.sh/java](https://roadmap.sh/java): von Null bis File-I/O,
56 Lektionen vom 19.11.2026 bis 10.02.2027, als Vorbereitung auf die AP1 am 24.02.2027.

Nebenbei lerne ich hier Git: jede Lektion endet mit einem Commit,
jede Etappe des Kursprojekts läuft über Branch, Issue und Pull Request.

## Aufbau

| Ordner | Inhalt |
| --- | --- |
| `uebungen/` | Übungen aus den Lektionen, ein Package pro Lektion (`l01`, `l02`, …) |
| `lauf-tracker/` | Das Kursprojekt: ein Lauf-Tracker, der mit jedem Modul wächst |
| `docs/` | Git-Spickzettel und Git-Fahrplan |
| `.github/` | Vorlagen für Issues und Pull Requests |

`uebungen/` und `lauf-tracker/` sind zwei getrennte IntelliJ-Projekte.
Öffnen in IntelliJ: **File → Open** und den jeweiligen Ordner wählen, nicht den ganzen Repo-Ordner.

## Kursprojekt: Lauf-Tracker

| Etappe | Inhalt | Wochen | Status |
| --- | --- | --- | --- |
| P1 Pace-Rechner | Distanz und Zeit eingeben, Pace in min/km ausgeben, Pulszone bestimmen | W2–W3 | offen |
| P2 Wochenauswertung | Summe, Schnitt und längster Lauf einer Woche, Code in Methoden aufgeteilt | W3–W4 | offen |
| P3 Klasse Run | Ein Lauf als Objekt, vorher als UML-Klassendiagramm entworfen | W5–W6 | offen |
| P4 Laufarten | Dauerlauf und Intervalllauf als Unterklassen, Laufart als Enum | W7–W8 | offen |
| P5 Robuste Eingabe | Ungültige Eingaben mit eigenen Exceptions abfangen, Testfälle entwerfen | W9–W10 | offen |
| P6 Lauftagebuch | Beliebig viele Läufe verwalten, Kilometer pro Monat auswerten | W10–W11 | offen |
| P7 Filtern und Sortieren | Zum Beispiel alle Läufe über 10 km, nach Pace sortiert | W11–W12 | offen |
| P8 Speichern | Läufe als CSV speichern und beim Start wieder laden | W12 | offen |
| P9 Fertigstellung | Aufräumen und README schreiben | W12–W13 | offen |

## Konventionen

- Bezeichner englisch, Kommentare deutsch.
- Commit-Nachrichten deutsch, beginnen mit Lektion oder Etappe:
  `L05: Übungen zu Operatoren` oder `P1: Pace aus Distanz und Zeit berechnen`.
- `main` enthält nur fertige Sachen. Am Kursprojekt wird immer auf einem Branch gearbeitet:
  `etappe/p1-pace-rechner`.
