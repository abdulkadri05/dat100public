package ValgfrieOppgaverLab2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveV1Lab2 {
    public static void main(String[] args) {
        // Henter radius fra brukerinput
        String radiusStr = showInputDialog(null, "Enter radius: ");
        int r = Integer.parseInt(radiusStr);

        // Beregner volumet av en kule
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);

        // Viser resultatet til brukeren
        showMessageDialog(null, "Volume of the sphere: " + volume);
    }
}
