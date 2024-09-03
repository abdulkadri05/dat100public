package BasisOppgaverLab2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveB5Lab2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            String inputUser = showInputDialog("Skriv inn poengsummen for student " + i + ": ");

                int poengsum = Integer.parseInt(inputUser);

                if (poengsum < 0 || poengsum > 100) {
                    showMessageDialog(null, "Poengsum må være mellom 0 og 100.");
                    i--;
                } else {
                    switch (poengsum / 10) {
                        case 10: // Dekker poengsum 100
                        case 9:
                            showMessageDialog(null, "Karakter: A");
                            break;
                        case 8:
                            showMessageDialog(null, "Karakter: B");
                            break;
                        case 7:
                        case 6:
                            showMessageDialog(null, "Karakter: C");
                            break;
                        case 5:
                            showMessageDialog(null, "Karakter: D");
                            break;
                        case 4:
                            showMessageDialog(null, "Karakter: E");
                            break;
                        default:
                            showMessageDialog(null, "Karakter: F");
                            break;
                    }
                }
        }
    }
}
