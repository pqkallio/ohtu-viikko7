
package ohtu.kivipaperisakset.UI;

import ohtu.kivipaperisakset.IO.*;
import ohtu.kivipaperisakset.pelilogiikka.Tuomari;

/**
 *
 * @author pqkallio
 */
public class ConsoleUI implements UI {
    private final IO io;

    public ConsoleUI() {
        this.io = new ConsoleIO();
    }

    @Override
    public String pyydaValinta() {
        return io.inputString();
    }
    
    @Override
    public void tulosta(String string) {
        io.outputString(string);
    }

    @Override
    public void ilmoitaEnsimmaisenPelaajanSiirto() {
        tulosta("Ensimmäisen pelaajan siirto: ");
    }

    @Override
    public void ilmoitaToisenPelaajanSiirto() {
        tulosta("Toisen pelaajan siirto: ");
    }

    @Override
    public void ilmoitaTietokoneenSiirto() {
        tulosta("Tietokone valitsi: ");
    }

    @Override
    public void tulostaValikko() {
        tulosta("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");
    }

    @Override
    public void tulostaPeliOhje() {
        tulosta("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
    }

    @Override
    public void tulostaTilanne(Tuomari tuomari) {
        tulosta(tuomari.toString() + "\n");
    }

    @Override
    public void peliPaattyi(Tuomari tuomari) {
        tulosta("\n" + "Kiitos!");
        tulosta(tuomari.toString());
    }
}
