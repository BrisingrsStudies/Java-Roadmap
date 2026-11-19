# Git-Fahrplan

Git lernst du nebenbei, im Takt des Kurses. Jede Zeile bringt ein paar neue Befehle,
die du ab dann immer benutzt. Die Befehle selbst stehen im [Spickzettel](GIT-SPICKZETTEL.md).

| Wann | Neu dazu | Was du damit machst |
| --- | --- | --- |
| Einrichtung | `init`, `add`, `commit`, `remote`, `push` | Start-Paket hochladen |
| Startwoche bis Woche 2 (L01–L12) | `status`, `diff`, `log --oneline` | Vor jedem Commit anschauen, was sich geändert hat |
| P1 Pace-Rechner | Issue, `switch -c`, `push -u`, Pull Request, `pull`, Branch löschen | Erster kompletter Durchlauf mit Branch und Pull Request |
| P2 Wochenauswertung | kleine Commits, `restore`, `#1` im Commit | Mehrere Commits pro Etappe, misslungene Änderung verwerfen |
| P3 Klasse Run | Bild im Repo, `commit --amend` | UML-Diagramm als Bild einchecken, letzten Commit korrigieren |
| P4 Laufarten | Merge-Konflikt | Absichtlich einen Konflikt erzeugen und von Hand lösen |
| P5 Robuste Eingabe | `revert`, Bug-Issue | Einen fehlerhaften Commit sauber rückgängig machen |
| P6 Lauftagebuch | `stash` | Halbfertige Arbeit kurz parken |
| P7 Filtern und Sortieren | `log --graph`, `blame` | Verlauf und Branches als Graph lesen |
| P8 Speichern | `.gitignore` prüfen, `rm --cached` | Sicherstellen, dass Laufdaten nicht ins Repo gehen |
| P9 Fertigstellung | `tag`, GitHub-Release | Version 1.0 markieren und veröffentlichen |

## Ablauf pro Lektion

1. Übungen in `uebungen/src/lXX/` schreiben.
2. `git status` und `git diff`: Was hat sich geändert?
3. `git add uebungen/src/lXX`
4. `git commit -m "LXX: Übungen zu <Thema>"`
5. `git push`

## Ablauf pro Etappe

1. Auf GitHub ein Issue mit der Vorlage „Etappe“ anlegen. Es bekommt eine Nummer, zum Beispiel `#1`.
2. `git switch main` und `git pull`: `main` auf den neuesten Stand bringen.
3. `git switch -c etappe/p1-pace-rechner`: neuen Branch anlegen und dorthin wechseln.
4. Arbeiten und in kleinen Schritten committen: `P1: Eingabe von Distanz und Zeit`.
5. `git push -u origin etappe/p1-pace-rechner`: Branch zu GitHub schicken.
6. Auf GitHub einen Pull Request öffnen. In die Beschreibung `Closes #1` schreiben.
7. Pull Request durchlesen, dann **Merge pull request**. Das Issue schließt sich von selbst.
8. Zurück auf dem PC: `git switch main`, `git pull`, `git branch -d etappe/p1-pace-rechner`.
9. In der README die Etappe auf „fertig“ setzen und committen.
