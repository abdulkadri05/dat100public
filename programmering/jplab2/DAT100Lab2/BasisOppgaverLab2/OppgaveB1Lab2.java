package BasisOppgaverLab2;
import static javax.swing.JOptionPane.*;

public class OppgaveB1Lab2 {
    public static void main(String[] args) {
        String dagS = showInputDialog("Dag: ");
        String mondS = showInputDialog("Måned: ");
        String årS = showInputDialog("År: ");

        int dag = Integer.parseInt(dagS);
        int måned = Integer.parseInt(mondS);
        int år = Integer.parseInt(årS);


        showMessageDialog(null, dag + "/" + måned + "/" + år);

    }
}
