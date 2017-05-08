package ohtu.kivipaperisakset;

import ohtu.kivipaperisakset.UI.ConsoleUI;
import ohtu.kivipaperisakset.UI.UI;
import ohtu.kivipaperisakset.pelilogiikka.KiviPaperiSakset;

public class Paaohjelma {
    
    public static void main(String[] args) {
        UI ui = new ConsoleUI();
        KiviPaperiSakset kps = new KiviPaperiSakset(ui);
        kps.run();
    }
}
