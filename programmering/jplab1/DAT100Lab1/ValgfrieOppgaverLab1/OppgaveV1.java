package ValgfrieOppgaverLab1;

import easygraphics.EasyGraphics; // Import EasyGraphics

import static java.lang.Integer.parseInt;

public class OppgaveV1 extends EasyGraphics { // Extend EasyGraphics to use its methods

    public static void main(String[] args) {
        /*
        // A)
        String brukernavn = null;
        String passord = null;

        Scanner input = new Scanner(System.in);

        String funksjonTxt = "Velg funksjon\n a) - opprette konto\n b) - endre passord\n c) - slette konto\n d) - login";

        System.out.println(funksjonTxt);
        System.out.print(">");

        String valgTxt = input.nextLine();

        if (valgTxt.equals("a")) {
            System.out.print("Opprett konto\nBrukernavn:");
            brukernavn = input.nextLine();
            System.out.print("Passord:");
            passord = input.nextLine();
        } else if (valgTxt.equals("b")) {
            System.out.print("Endre passord\nGammelt passord:");
            passord = input.nextLine();
            System.out.print("Nytt passord:");
            passord = input.nextLine();
        } else if (valgTxt.equals("c")) {
            System.out.print("Slette bruker\nBrukernavn:");
            brukernavn = input.nextLine();
            System.out.print("Passord:");
            passord = input.nextLine();
        } else if (valgTxt.equals("d")) {
            System.out.print("Login\nBrukernavn:");
            brukernavn = input.nextLine();
            System.out.print("Passord:");
            passord = input.nextLine();
        } else {
            System.out.println("Ingen funksjon valgt");
        }

        System.out.println("Brukernavn: " + brukernavn);
        System.out.println("Passord: " + passord);

        input.close();
         */

        // Launch the EasyGraphics application
        launch(args);
    }

    public void run() {

        makeWindow("CO-2 nivå indikator");

        int co2 = parseInt(getText("PPM: "));


        int co2Range;

        if (co2 < 500) {
            co2Range = 0;
        } else if (co2 >= 500 && co2 <= 700) {
            co2Range = 1;
        } else {
            co2Range = 2;
        }

        switch (co2Range) {
            case 0:
                setColor(0, 255, 0); // Green
                break;
            case 1:
                setColor(255, 255, 0); // Yellow
                break;
            case 2:
                setColor(255, 0, 0); // Red
                break;
            default:
                setColor(255, 255, 255);
                break;
        }

        fillCircle(100, 160, 60);
    }
}
