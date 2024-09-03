package BasisOppgaverLab1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveB2 {
    public static void main(String[] args) {
        // Valgsetninger
        String brukernavn = showInputDialog("Brukernavn :");

        String passord = showInputDialog("Passord :");

        String username = "abdul";
        String password = "0000";
        if (brukernavn.equals(username) && passord.equals(password)) {
            showMessageDialog(null, "You are logged in");
        }
        else {
            showMessageDialog(null, "You are not logged in");
        }

        System.out.println(brukernavn);
        System.out.println(passord);

    }
}
