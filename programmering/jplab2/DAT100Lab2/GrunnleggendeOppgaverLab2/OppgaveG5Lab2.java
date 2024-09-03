package GrunnleggendeOppgaverLab2;

import static javax.swing.JOptionPane.*;

public class OppgaveG5Lab2 {
    public static void main(String[] args) {
        String input1 = showInputDialog("Skriv inn første tall:");
        String input2 = showInputDialog("Skriv inn andre tall:");
        String input3 = showInputDialog("Skriv inn tredje tall:");
        String input4 = showInputDialog("Skriv inn fjerde tall:");

        int tall1 = Integer.parseInt(input1);
        int tall2 = Integer.parseInt(input2);
        int tall3 = Integer.parseInt(input3);
        int tall4 = Integer.parseInt(input4);


        int minsteAvToFørste = Math.min(tall1, tall2);
        int minsteAvTreFørste = Math.min(minsteAvToFørste, tall3);
        int minsteAvFire = Math.min(minsteAvTreFørste, tall4);


        showMessageDialog(null, "Det minste tallet er: " + minsteAvFire);

    }
}
