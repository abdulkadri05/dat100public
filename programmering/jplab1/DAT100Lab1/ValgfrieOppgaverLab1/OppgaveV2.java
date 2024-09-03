package ValgfrieOppgaverLab1;

import easygraphics.EasyGraphics;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveV2 extends EasyGraphics {
    public static void main(String[] args) {
        launch(args);
    }

    public void run() {
        makeWindow("Det franske flagget");

        String prosent = showInputDialog("Tast in ett tall (mellom 1 og 100): ");
        int intPrecent = Integer.parseInt(prosent);

        if (intPrecent > 0 && intPrecent <= 100) {

            int flagBredde = 300;
            int flagHoyde = 200;

            int flagWidth = (intPrecent * flagBredde) / 100;
            int flagHeight = (intPrecent * flagHoyde) / 100;


            int stripeWidth = flagWidth / 3;

            setColor(0, 0, 255);
            fillRectangle(50, 50, stripeWidth, flagHeight);

            setColor(255, 255, 255);
            fillRectangle(50 + stripeWidth, 50, stripeWidth, flagHeight);

            setColor(255, 0, 0);
            fillRectangle(50 + 2 * stripeWidth, 50, stripeWidth, flagHeight);

            setColor(0, 0, 0);
            drawRectangle(50, 50, flagWidth, flagHeight);
        }
        else {
            showMessageDialog(null, "Invalid percentage. Please enter a value between 0 and 100.");
        }
    }
}
