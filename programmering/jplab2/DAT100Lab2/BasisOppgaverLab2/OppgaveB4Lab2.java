package BasisOppgaverLab2;

import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveB4Lab2 {
    public static void main(String[] args) {
        String prisInput = showInputDialog("Skriv inn prisen på varen (hele kroner):");
        int pris = Integer.parseInt(prisInput);

        String betaltInput = showInputDialog("Skriv inn beløpet som er betalt (hele kroner):");
        int betaltBelop = Integer.parseInt(betaltInput);

        int vekslepenger = betaltBelop - pris;

        if (vekslepenger < 0) {
            showMessageDialog(null, "Betalt beløp er mindre enn prisen. Ingen veksel trengs.");
        } else {
            int tiere = vekslepenger / 10;

            int enere = vekslepenger % 10;

            String melding = "Vekslepenger: " + vekslepenger + " kroner\n" +
                    "Antall 10-kroners mynter: " + tiere + "\n" +
                    "Antall 1-kroners mynter: " + enere;
            showMessageDialog(null, melding);
        }
    }
}
