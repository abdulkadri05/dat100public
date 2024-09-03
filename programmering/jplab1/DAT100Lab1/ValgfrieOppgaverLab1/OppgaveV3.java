package ValgfrieOppgaverLab1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveV3 {
    public static void main(String[] args) {
        // Les input fra brukeren
        String nummer1 = showInputDialog("Tast inn et tall for nummer1: ");
        String nummer2 = showInputDialog("Tast inn et tall for nummer2: ");
        String nummer3 = showInputDialog("Tast inn et tall for nummer3: ");

        int n1 = Integer.parseInt(nummer1);
        int n2 = Integer.parseInt(nummer2);
        int n3 = Integer.parseInt(nummer3);

        // Sortering ved kun bruk av if-setninger
        if (n1 <= n2 && n1 <= n3) {
            if (n2 <= n3) {
                showMessageDialog(null, "Sortert rekkefølge: " + n1 + ", " + n2 + ", " + n3);
            } else {
                showMessageDialog(null, "Sortert rekkefølge: " + n1 + ", " + n3 + ", " + n2);
            }
        }

        if (n2 <= n1 && n2 <= n3) {
            if (n1 <= n3) {
                showMessageDialog(null, "Sortert rekkefølge: " + n2 + ", " + n1 + ", " + n3);
            } else {
                showMessageDialog(null, "Sortert rekkefølge: " + n2 + ", " + n3 + ", " + n1);
            }
        }

        if (n3 <= n1 && n3 <= n2) {
            if (n1 <= n2) {
                showMessageDialog(null, "Sortert rekkefølge: " + n3 + ", " + n1 + ", " + n2);
            } else {
                showMessageDialog(null, "Sortert rekkefølge: " + n3 + ", " + n2 + ", " + n1);
            }
        }


        // Sortering ved bruk av if-else-setninger
        if (n1 <= n2 && n1 <= n3) {
            if (n2 <= n3) {
                showMessageDialog(null, "Sortert rekkefølge: " + n1 + ", " + n2 + ", " + n3);
            } else {
                showMessageDialog(null, "Sortert rekkefølge: " + n1 + ", " + n3 + ", " + n2);
            }
        } else if (n2 <= n1 && n2 <= n3) {
            if (n1 <= n3) {
                showMessageDialog(null, "Sortert rekkefølge: " + n2 + ", " + n1 + ", " + n3);
            } else {
                showMessageDialog(null, "Sortert rekkefølge: " + n2 + ", " + n3 + ", " + n1);
            }
        } else {
            if (n1 <= n2) {
                showMessageDialog(null, "Sortert rekkefølge: " + n3 + ", " + n1 + ", " + n2);
            } else {
                showMessageDialog(null, "Sortert rekkefølge: " + n3 + ", " + n2 + ", " + n1);
            }
        }
    }
}
