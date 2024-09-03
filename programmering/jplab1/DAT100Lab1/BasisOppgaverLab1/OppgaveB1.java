package BasisOppgaverLab1;

import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Math.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveB1 {
    public static void main(String[] args) {
        // Henter radius fra brukerinput
        String radiusStr = showInputDialog(null, "Enter radius: ");
        int r = Integer.parseInt(radiusStr);

        // Beregner volumet av en kule
        double volume = (4.0 / 3.0) * PI * pow(r, 3);

        // Viser resultatet til brukeren
        showMessageDialog(null, "Volume of the sphere: " + volume);
    }
}
