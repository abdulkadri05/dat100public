package GrunnleggendeOppgaverLab2;

import static javax.swing.JOptionPane.*;

public class OppgaveG4Lab2 {
    public static void main(String[] args) {
        String lengden = showInputDialog(null, "Lengde: ");
        int lengdeInt = Integer.parseInt(lengden);

        String bredde = showInputDialog(null, "Bredde: ");
        int breddeInt = Integer.parseInt(bredde);

        System.out.println(lengdeInt + breddeInt);

        System.out.println(lengdeInt * breddeInt);
    }
}
