package l02;

//Lektion 2: Datentypen

public class Main {
    public static void main(String[] args) {

        //Ganze Zahlen
        int age = 30;
        long worldPopulation = 8_100_000_000L;

        //Kommazahlen
        double distanceKm = 5.25;
        float temperature = 12.5f;

        //Einzelnes Zeichen und Wahrheitswert
        char grade = 'B';
        boolean isRaining = false;

        //Text: kein primitiver Typ
        String city = "Berlin";


        System.out.println("Alter: " + age);
        System.out.println("Menschen auf der Erde: " + worldPopulation);
        System.out.println("Distanz in km: " + distanceKm);
        System.out.println("Temperatur: " + temperature);
        System.out.println("Note: " + grade);
        System.out.println("Regnet es? " + isRaining);
        System.out.println("Stadt: " + city);
    }
}
