/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset.UI;

import ohtu.kivipaperisakset.pelilogiikka.Tuomari;

/**
 *
 * @author pqkallio
 */
public interface UI {
    public String pyydaValinta();
    public void tulosta(String string);
    public void ilmoitaEnsimmaisenPelaajanSiirto();
    public void ilmoitaToisenPelaajanSiirto();
    public void ilmoitaTietokoneenSiirto();
    public void tulostaValikko();
    public void tulostaPeliOhje();
    public void tulostaTilanne(Tuomari tuomari);
    public void peliPaattyi(Tuomari tuomari);
}
