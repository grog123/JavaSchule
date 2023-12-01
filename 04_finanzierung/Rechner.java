import java.util.Scanner;

public class Rechner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("anschaffungspreis");
        double anschaffungspreis = scanner.nextDouble();
        System.out.println("anzahlung");
        double anzahlung = scanner.nextDouble();
        System.out.println("effektiver_jahreszins");
        double effektiver_jahreszins = scanner.nextDouble();
        System.out.println("laufzeit");
        double laufzeit = scanner.nextDouble();
      // System.out.println("eingabe " + eingabe);

        double darlehensbetrag = anschaffungspreis - anzahlung;
        double kreditkosten = darlehensbetrag * (effektiver_jahreszins/100);
        double monatlicheRate = (darlehensbetrag + kreditkosten) / laufzeit;
        double gesamtkosten = kreditkosten + anschaffungspreis;
        

        System.out.println("darlehensbetrag: " + darlehensbetrag + "  kreditkosten: " + kreditkosten + "  gesamtkosten: " + gesamtkosten + "  monatlicheRate: " + monatlicheRate);

    }
}