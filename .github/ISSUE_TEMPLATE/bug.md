name: Fehlerbericht
about: Ein Fehler im Verhalten des Service
labels: bug

Titel: Die Suche ohne Parameter title liefert 500 statt 400.
Schritte: 1. Service starten (BackendApplication).
2. Im Browser http://localhost:8080/api/games/search öffnen, ohne ?title=.
3. In den Entwicklertools (F12, Netzwerk) den Statuscode ansehen.
Erwartet: Statuscode 400 (Bad Request)
Tatsächlich: Statuscode 500 (Internal Server Error). Die Antwort ist etwa 371 Bytes gross, wie mein Screenshot (Aufgabe4Teil1) zeigt.
Umgebung: Service games-service, Port 8080, Commit-ID aus git log -1 --oneline, Java 26.0.2.1, Spring Boot 4.1.0.
Schweregrad: Mittel weil jeder User einen 500er Error bekommt und es eigentlich kein Server Error ist.
