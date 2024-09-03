package BasisOppgaverLab1;

import easygraphics.EasyGraphics;

public class OppgaveB4 extends EasyGraphics {

    public static void main(String[] args) {
        launch(args); // Launch the EasyGraphics application
    }

    @Override
    public void run() {
        makeWindow("Det tyske flagget");


        setColor(0, 0, 0);
        fillRectangle(50, 50, 300, 60);


        setColor(255, 0, 0);
        fillRectangle(50, 110, 300, 60);


        setColor(255, 204, 0);
        fillRectangle(50, 170, 300, 60);

        setColor(255, 255, 255);
        drawRectangle(50, 50, 300, 180);
    }
}
