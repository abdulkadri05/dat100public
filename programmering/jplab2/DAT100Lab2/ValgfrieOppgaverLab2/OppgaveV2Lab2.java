package ValgfrieOppgaverLab2;

import easygraphics.EasyGraphics;

public class OppgaveV2Lab2 extends EasyGraphics {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void run() {
        int windowWidth = 600;
        int windowHeight = 400;
        makeWindow("Kjønnsfordeling i Skoleklasser", windowWidth, windowHeight);

        // Klasse A
        int percentA = 28; // Prosentandel av gutter
        int greenWidthA = (windowWidth * percentA) / 100;
        int redWidthA = windowWidth - greenWidthA;

        setColor(0, 255, 0); // Grønn farge for gutter
        fillRectangle(50, 50, greenWidthA, 100); // Tegn grønt rektangel

        setColor(255, 0, 0); // Rød farge for jenter
        fillRectangle(50 + greenWidthA, 50, redWidthA, 100); // Tegn rødt rektangel

        setColor(0, 0, 0); // Sort farge for ramme
        drawRectangle(50, 50, windowWidth, 100); // Tegn ramme rundt

        // Klasse B
        int percentB = 38; // Prosentandel av gutter
        int greenWidthB = (windowWidth * percentB) / 100;
        int redWidthB = windowWidth - greenWidthB;

        setColor(0, 255, 0); // Grønn farge for gutter
        fillRectangle(50, 180, greenWidthB, 100); // Tegn grønt rektangel

        setColor(255, 0, 0); // Rød farge for jenter
        fillRectangle(50 + greenWidthB, 180, redWidthB, 100); // Tegn rødt rektangel

        setColor(0, 0, 0); // Sort farge for ramme
        drawRectangle(50, 180, windowWidth, 100); // Tegn ramme rundt

        // Klasse C
        int percentC = 46; // Prosentandel av gutter
        int greenWidthC = (windowWidth * percentC) / 100;
        int redWidthC = windowWidth - greenWidthC;

        setColor(0, 255, 0); // Grønn farge for gutter
        fillRectangle(50, 310, greenWidthC, 100); // Tegn grønt rektangel

        setColor(255, 0, 0); // Rød farge for jenter
        fillRectangle(50 + greenWidthC, 310, redWidthC, 100); // Tegn rødt rektangel

        setColor(0, 0, 0); // Sort farge for ramme
        drawRectangle(50, 310, windowWidth, 100); // Tegn ramme rundt
    }
}
