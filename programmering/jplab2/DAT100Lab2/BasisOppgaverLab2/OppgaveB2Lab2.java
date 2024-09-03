package BasisOppgaverLab2;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveB2Lab2 {
    public static void main(String[] args) {


        // a) og b)
        for (int i = 0; i <5; i++) {
            String tallTxt = showInputDialog("Gi et tall:");
            int tall = parseInt(tallTxt);
            System.out.println(tall);

        }
    }
}
