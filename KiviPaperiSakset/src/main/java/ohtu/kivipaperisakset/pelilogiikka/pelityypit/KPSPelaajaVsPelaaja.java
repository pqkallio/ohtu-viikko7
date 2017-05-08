package ohtu.kivipaperisakset.pelilogiikka.pelityypit;

import ohtu.kivipaperisakset.Pelaajat.Ihminen;
import ohtu.kivipaperisakset.UI.UI;

public class KPSPelaajaVsPelaaja extends KPSPelityyppi {

    public KPSPelaajaVsPelaaja(UI ui) {
        super(new Ihminen(ui), new Ihminen(ui), ui);
    }

    @Override
    public boolean kasitteleSiirrot() {
        super.ui.ilmoitaEnsimmaisenPelaajanSiirto();
        String ekanSiirto = super.ui.pyydaValinta();
        super.ui.ilmoitaToisenPelaajanSiirto();
        String tokanSiirto = super.ui.pyydaValinta();
        
        if (!(onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto))) {
            return false;
        }
        
        super.tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
        return true;
    }
}