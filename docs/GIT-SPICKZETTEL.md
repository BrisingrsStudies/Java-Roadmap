# Git-Spickzettel

Alle Befehle im Terminal im Repo-Ordner ausführen
(Windows: Git Bash oder das Terminal unten in IntelliJ).

## Einmal pro PC

| Befehl | Was er macht |
| --- | --- |
| `git config --global user.name "Dein Name"` | Name, der in jedem Commit steht |
| `git config --global user.email "…@users.noreply.github.com"` | E-Mail für Commits (die private GitHub-Adresse) |
| `git config --global init.defaultBranch main` | Neue Repos starten mit Branch `main` |
| `git clone <URL>` | Repo von GitHub auf einen neuen PC holen |

## Jeden Tag

| Befehl | Was er macht |
| --- | --- |
| `git status` | Zeigt, welche Dateien geändert, neu oder vorgemerkt sind |
| `git diff` | Zeigt die Änderungen Zeile für Zeile, die noch nicht vorgemerkt sind |
| `git diff --staged` | Zeigt, was mit `add` schon vorgemerkt ist |
| `git add <Pfad>` | Merkt Dateien für den nächsten Commit vor |
| `git commit -m "Nachricht"` | Speichert die vorgemerkten Änderungen als Commit |
| `git push` | Schickt neue Commits zu GitHub |
| `git pull` | Holt neue Commits von GitHub |
| `git log --oneline` | Kurzer Verlauf, ein Commit pro Zeile (`q` beendet die Anzeige) |

## Branches

| Befehl | Was er macht |
| --- | --- |
| `git branch` | Listet die Branches, `*` markiert den aktuellen |
| `git switch -c <name>` | Neuen Branch anlegen und dorthin wechseln |
| `git switch <name>` | Zu einem vorhandenen Branch wechseln |
| `git push -u origin <name>` | Branch das erste Mal zu GitHub schicken |
| `git merge <name>` | Branch in den aktuellen Branch einbauen |
| `git branch -d <name>` | Fertigen Branch löschen |

## Wenn was schiefgeht

| Befehl | Was er macht |
| --- | --- |
| `git restore <Datei>` | Verwirft Änderungen an der Datei seit dem letzten Commit (weg ist weg!) |
| `git restore --staged <Datei>` | Nimmt eine Datei aus dem `add` wieder raus, Änderungen bleiben |
| `git commit --amend` | Ändert den letzten Commit (nur vor dem `push`!) |
| `git revert <Commit-ID>` | Neuer Commit, der einen alten rückgängig macht |
| `git stash` / `git stash pop` | Änderungen kurz parken / zurückholen |

## Merge-Konflikt lösen

1. Git meldet `CONFLICT` und nennt die Datei.
2. In der Datei stehen beide Versionen zwischen `<<<<<<<`, `=======` und `>>>>>>>`.
3. Die richtige Fassung von Hand herstellen und alle drei Markierungszeilen löschen.
4. `git add <Datei>` und `git commit`.
