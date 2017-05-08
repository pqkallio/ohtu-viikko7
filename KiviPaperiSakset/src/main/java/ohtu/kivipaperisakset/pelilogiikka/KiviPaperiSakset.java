/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset.pelilogiikka;

import java.util.HashMap;
import java.util.Map;
import ohtu.kivipaperisakset.pelilogiikka.pelityypit.KPSPelityyppi;
import ohtu.kivipaperisakset.UI.UI;

/**
 *
 * @author pqkallio
 */
public class KiviPaperiSakset {
    private final UI ui;
    private final Map<Character, KPSPelityyppi> pelityypit;

    public KiviPaperiSakset(UI ui) {
        this.ui = ui;
        this.pelityypit = alustaPelityypit();
    }
    
    public void run() {
        while (true) {
            KPSPelityyppi peli = valitsePeli();
            
            if (peli == null) {
                break;
            }
            
            ui.tulostaPeliOhje();
            peli.pelaa();
        }
    }

    private Map<Character, KPSPelityyppi> alustaPelityypit() {
        Map<Character, KPSPelityyppi> tyypit = new HashMap<>();
        tyypit.put('a', KPSPelityyppi.luoPelaajaVastaanPelaajaPelityyppi(ui));
        tyypit.put('b', KPSPelityyppi.luoPelaajaVastaanTekoalyPelityyppi(ui));
        tyypit.put('c', KPSPelityyppi.luoPelaajaVastaanParannettuTekoalyPelityyppi(ui));
        return tyypit;
    }

    private KPSPelityyppi valitsePeli() {
        ui.tulostaValikko();
        String vastaus = ui.pyydaValinta().trim();
        if (vastaus.length() == 0) {
            return null;
        }
        char valinta = vastaus.charAt(vastaus.length() - 1);
        return pelityypit.get(valinta);
    }
}
