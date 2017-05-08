
package ohtu.kivipaperisakset.Pelaajat;

import ohtu.kivipaperisakset.UI.UI;

/**
 *
 * @author pqkallio
 */
public class Ihminen implements Pelaaja {
    private final UI ui;

    public Ihminen(UI ui) {
        this.ui = ui;
    }
    
    @Override
    public String annaSiirto() {
        return ui.pyydaValinta();
    }

    @Override
    public void asetaSiirto(String siirto) {
        // ei tehdä mitään
    }    
}
