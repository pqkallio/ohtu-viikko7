package ohtu.kivipaperisakset.pelilogiikka.pelityypit;

import ohtu.kivipaperisakset.Pelaajat.Ihminen;
import ohtu.kivipaperisakset.Pelaajat.Pelaaja;
import ohtu.kivipaperisakset.UI.UI;

public class KPSTekoaly extends KPSPelityyppi {
    private String ekanSiirto;
    private String tokanSiirto;
    
    public KPSTekoaly(UI ui, Pelaaja tekoaly) {
        super(new Ihminen(ui), tekoaly, ui);
        this.ekanSiirto = "";
        this.tokanSiirto = "";
    }

    @Override
    public boolean kasitteleSiirrot() {
        if (!pyydaSiirrot()) {
            return false;
        }
        super.ui.ilmoitaTietokoneenSiirto();
        super.ui.tulosta(tokanSiirto);
        super.pelaaja2.asetaSiirto(ekanSiirto);
        super.tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
        return true;
    }
    
    private boolean pyydaSiirrot() {
        super.ui.ilmoitaEnsimmaisenPelaajanSiirto();
        this.ekanSiirto = super.pelaaja1.annaSiirto();
        this.tokanSiirto = super.pelaaja2.annaSiirto();
        return onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto);
    }
}