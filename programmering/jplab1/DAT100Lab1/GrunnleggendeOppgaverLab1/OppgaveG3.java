package GrunnleggendeOppgaverLab1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveG3 {
    public static void main(String[] args) {
            // Henter brukerinput som en String
            String aNumber = showInputDialog(null, "Enter a number for a: ");
            String bNumber = showInputDialog(null, "Enter a number for b: ");

            // Konverterer input-strengen til en int
            int a = Integer.parseInt(aNumber);
            int b = Integer.parseInt(bNumber);

            if (b != 0) {
                // Utfører deling og viser resultatet
                showMessageDialog(null, "Result: " + (a / b));
            } else {
                // Viser feilmelding hvis b er 0
                System.out.println("B can't be 0");
            }
    }
}
