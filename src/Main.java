

public class Main {

    public static void main(String[] args) {

        double poundToEuro = 1 + (Math.random() * 0.2);
        double pounds = 10000.0;
        int days = 0;

        while (pounds > 0) {

            poundToEuro = 1 + (Math.random() * 0.2);

            if (poundToEuro >1.15) {

                pounds -=1000;
            }
            days++;
        }
        System.out.println("Giorni necessari per vendere tutto: " + days);
    }
}
