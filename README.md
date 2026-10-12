# Java User Profile Exercise

Ett litet konsolprogram skrivet i Java som samlar in några uppgifter om användaren och presenterar en enkel profil. Projektet är en nybörjarövning i grundläggande Java och visar hur inmatning, text, tal, villkor, slumpning, datum och arrayer kan användas tillsammans.

## Funktioner

- Frågar efter namn, ålder, favoritfärg och favoritnummer.
- Tar bort inledande och avslutande mellanslag från textinmatning.
- Visar namnet med versaler och räknar dess tecken.
- Jämför favoritfärgen med blå utan att skilja på stora och små bokstäver.
- Jämför favoritnumret med 10 och med ett slumpat tal mellan 1 och 10.
- Visar dagens datum och datumet en vecka senare.
- Skriver ut en lista med aktiviteter och en sammanfattning av profilen.

## Teknik och förkunskaper

- Java 8 eller senare
- JDK (Java Development Kit), inklusive `javac`
- Terminal eller en Java-IDE, till exempel IntelliJ IDEA

Programmet använder endast Java:s standardbibliotek. Ingen extern dependency eller byggverktyg behövs.

## Kom igång

Öppna en terminal i projektets rotmapp och kompilera programmet:

```bash
mkdir -p out
javac -encoding UTF-8 -d out src/Main.java
```

Starta sedan programmet:

```bash
java -cp out Main
```

Följ frågorna i terminalen. Ålder och favoritnummer ska anges som heltal, till exempel `25` och `7`.

I IntelliJ IDEA kan du öppna projektet och köra `Main` med körknappen bredvid `main`-metoden.

## Så fungerar programmet

1. **Startar programmet och importerar verktyg.** `main` är programmets startpunkt. `Scanner` läser in text från terminalen, `Random` används för slumpning och `LocalDate` för datum.
2. **Läser in användarens uppgifter.** `scanner.nextLine()` läser varje svar som en sträng. Namnet och favoritfärgen trimmas med `trim()` så att mellanslag i början och slutet tas bort.
3. **Konverterar text till heltal.** Ålder och favoritnummer sparas först som text. `Integer.parseInt()` omvandlar dem sedan till `int`, som kan användas i taljämförelser.
4. **Bearbetar namnet.** `name.length()` räknar namnets tecken och `name.toUpperCase()` skapar en version med stora bokstäver.
5. **Kontrollerar favoritfärgen.** `equalsIgnoreCase("blå")` jämför färgen utan att ta hänsyn till versaler och gemener. Ett `if`/`else` väljer rätt meddelande.
6. **Jämför favoritnumret med 10.** `Math.max(favoriteNumber, 10)` returnerar det största av talen.
7. **Slumpar ett tal och jämför det.** `random.nextInt(10)` ger ett tal från 0 till 9. När 1 adderas blir intervallet 1–10. Ett villkor kontrollerar om talet är samma som favoritnumret.
8. **Visar datum.** `LocalDate.now()` hämtar dagens datum och `today.plusDays(7)` räknar ut datumet en vecka senare.
9. **Skriver ut aktiviteter.** En array av typen `String[]` innehåller tre aktiviteter. En vanlig `for`-loop går igenom arrayens element.
10. **Bygger en sammanfattning.** `StringBuilder` och flera anrop till `append()` sätter ihop användarens uppgifter till en text.

## Exempel

En körning kan se ut så här. Datumet och det slumpade talet varierar mellan körningar, och turmeddelandet visas bara om det slumpade talet matchar favoritnumret.

```text
Vad heter du? Ada Lovelace
Hur gammal är du? 36
Vilken är din favoritfärg? blå
Vilket är ditt favoritnummer? 7

Ditt namn innehåller 12 tecken.
Ditt namn med stora bokstäver: ADA LOVELACE
Blå är också en fin färg.
Det största talet av ditt favoritnummer och 10 är 10.
Dagens slumpade tal är 4.
Dagens datum är 2026-10-11.
Om en vecka är det 2026-10-18.
Aktiviteter:
- Programmera
- Spela
- Träna
Sammanfattning: Ada Lovelace är 36 år, favoritfärgen är blå och favoritnumret är 7.
```

## Projektstruktur

```text
.
├── README.md
└── src/
    └── Main.java
```

Kompilerade klassfiler sparas i `out/`. Den katalogen är ignorerad av Git och behöver inte checkas in.

## Begränsningar och möjliga nästa steg

Programmet förutsätter att ålder och favoritnummer anges som giltiga heltal. Ogiltig inmatning leder i nuläget till ett konverteringsfel; programmet frågar inte efter värdet igen. Det här är ett avsiktligt enkelt konsolprogram, inte en fullstackapplikation: det har ännu inget gränssnitt i webbläsaren, backend-API eller databas.

Bra nästa steg för att utveckla projektet kan vara att lägga till validering och tester, dela upp logiken i separata klasser och senare bygga ett webbgränssnitt med ett API och beständig lagring.
