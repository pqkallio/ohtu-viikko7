/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset.Pelaajat;

/**
 *
 * @author pqkallio
 */
public class TekoalyTehdas {
    public static Pelaaja luoPerustekoaly() {
        return new PerusTekoaly();
    }
    
    public static Pelaaja luoParannettuTekoaly() {
        return new TekoalyParannettu(20);
    }
}
