
package ohtu.kivipaperisakset.pelilogiikka.pelityypit;

import ohtu.kivipaperisakset.UI.UI;
import ohtu.kivipaperisakset.Pelaajat.Pelaaja;
import ohtu.kivipaperisakset.Pelaajat.TekoalyTehdas;
import ohtu.kivipaperisakset.pelilogiikka.Tuomari;

/**
 *
 * @author pqkallio
 */
public abstract class KPSPelityyppi {
    protected final UI ui;
    protected final Tuomari tuomari;
    protected final Pelaaja pelaaja1;
    protected final Pelaaja pelaaja2;

    public static KPSPelityyppi luoPelaajaVastaanPelaajaPelityyppi(UI ui) {
        return new KPSPelaajaVsPelaaja(ui);
    }
    
    public static KPSPelityyppi luoPelaajaVastaanTekoalyPelityyppi(UI ui) {
        return new KPSTekoaly(ui, TekoalyTehdas.luoPerustekoaly());
    }
    
    public static KPSPelityyppi luoPelaajaVastaanParannettuTekoalyPelityyppi(UI ui) {
        return new KPSTekoaly(ui, TekoalyTehdas.luoParannettuTekoaly());
    }
    
    public KPSPelityyppi(Pelaaja pelaaja1, Pelaaja pelaaja2, UI ui) {
        this.pelaaja1 = pelaaja1;
        this.pelaaja2 = pelaaja2;
        this.ui = ui;
        this.tuomari = new Tuomari();
    }
    
    public abstract boolean kasitteleSiirrot();
    
    public void pelaa() {
        while (true) {
            if (!kasitteleSiirrot()) {
                break;
            }
            
            ui.tulostaTilanne(tuomari);
        }

        ui.peliPaattyi(tuomari);
    }
    
    protected static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
}
