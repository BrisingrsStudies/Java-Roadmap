package l02;

// Lektion 2, Ü1: Steckbrief für einen Lauf
public class RunProfile {
    public static void main(String[] args) {
        // Text, also String
        String routeName = "Rheinufer";
        // Kommazahl, also double
        double distanceKm = 7.4;
        // ganze Minuten, also int
        int durationMinutes = 42;
        // über 2,1 Milliarden passt nicht in int, also long
        long totalSteps = 3_250_000_000L;
        // genau ein Buchstabe, also char
        char rating = 'B';
        // ja oder nein, also boolean
        boolean wasRaining = false;

        System.out.println("Strecke: " + routeName);
        System.out.println("Distanz in km: " + distanceKm);
        System.out.println("Dauer in Minuten: " + durationMinutes);
        System.out.println("Schritte gesamt: " + totalSteps);
        System.out.println("Bewertung: " + rating);
        System.out.println("Hat es geregnet? " + wasRaining);
    }
}