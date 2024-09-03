package BasisOppgaverLab1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveB3 {
    public static void main(String[] args) {

        String sekunder = showInputDialog("Sekunder: ");
        double s = Double.parseDouble(sekunder);

        int timer = (int) (s / 3600);
        int minutter = (int) ((s % 3600) / 60);
        int sekund = (int) (s % 60);

        // Display the result
        String result = timer + " timer, " + minutter + " minutter, " + sekund + " sekunder";
        showMessageDialog(null, result);
    }
}
