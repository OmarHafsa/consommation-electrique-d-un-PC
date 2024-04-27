/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pc;


class PC {
    UC uc;
    Peripherique[] peripheriques;

    public PC(UC uc, Peripherique[] peripheriques) {
        this.uc = uc;
        this.peripheriques = peripheriques;
    }

    public PC(PC pc) {
        this.uc = pc.uc;
        this.peripheriques = pc.peripheriques;
    }
    public double PuissanceTotalePer() {
        double puissanceTotale = 0;
        for (Peripherique p : peripheriques) {
            puissanceTotale += p.calculerPuissance();
        }
        return puissanceTotale;
    }
    public double calConsoElec(int duree) throws ConsoException {
        double puissanceTotale=PuissanceTotalePer();
        double puiss = uc.calculerPuissance()+puissanceTotale;
        double consommation = puiss * duree;
        if (consommation > 1000) {
            throw new ConsoException("La consommation a dépassé 1000 watts.");
        } else {
            return consommation;
        }
    }
}

