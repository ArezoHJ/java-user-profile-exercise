import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vad heter du? ");
        String name = scanner.nextLine().trim();

        System.out.print("Hur gammal är du? ");
        String ageText = scanner.nextLine();
        int age = Integer.parseInt(ageText);

        System.out.print("Vilken är din favoritfärg? ");
        String favoriteColor = scanner.nextLine().trim();

        System.out.print("Vilket är ditt favoritnummer? ");
        String favoriteNumberText = scanner.nextLine();
        int favoriteNumber = Integer.parseInt(favoriteNumberText);

        System.out.println();
        System.out.println("Ditt namn innehåller " + name.length() + " tecken.");
        System.out.println("Ditt namn med stora bokstäver: " + name.toUpperCase());

        if (favoriteColor.equalsIgnoreCase("blå")) {
            System.out.println("Blå är också en fin färg.");
        } else {
            System.out.println("Din favoritfärg är " + favoriteColor + ".");
        }

        int largestNumber = Math.max(favoriteNumber, 10);
        System.out.println("Det största talet av ditt favoritnummer och 10 är " + largestNumber + ".");

        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        System.out.println("Dagens slumpade tal är " + randomNumber + ".");
        if (randomNumber == favoriteNumber) {
            System.out.println("Vilken tur! Det slumpade talet är ditt favoritnummer!");
        }

        LocalDate today = LocalDate.now();
        System.out.println("Dagens datum är " + today + ".");
        System.out.println("Om en vecka är det " + today.plusDays(7) + ".");

        String[] activities = {"Programmera", "Spela", "Träna"};
        System.out.println("Aktiviteter:");
        for (int i = 0; i < activities.length; i++) {
            System.out.println("- " + activities[i]);
        }

        StringBuilder summary = new StringBuilder();
        summary.append("Sammanfattning: ")
                .append(name)
                .append(" är ")
                .append(age)
                .append(" år, favoritfärgen är ")
                .append(favoriteColor)
                .append(" och favoritnumret är ")
                .append(favoriteNumber)
                .append(".");

        System.out.println(summary);
    }
}
