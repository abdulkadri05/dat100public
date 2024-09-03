package BasisOppgaverLab2;

public class OppgaveB3Lab2 {
    public static void main(String[] args) {

        // a)
        int n = 32;
        int tall = 1;

        for (int i = 0; i <= n; i++) {
            System.out.println(tall);
            tall *= 2;
        }

        // Vi gikk over grensen til int


        // b)
        int n2 = 5;
        double fraVenstre = 0;
        double fraHoyre = 0;

        for (int i = 1; i <= n2; i++) {
            fraVenstre += (1.0 / i);
        }
        System.out.println(fraVenstre);

        for (int i = n2; i >= 1; i--) {
            fraVenstre += (1.0 / i);
        }
        System.out.println(fraVenstre);

    }
}
