/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pc;

/**
 *
 * @author FAROUK
 */
public class PC {
      UC uc;
     Peripherique peripherique;

    public PC(UC uc, Peripherique peripheriques) {
        this.uc = uc;
        this.peripherique = peripheriques;
    }
  
        public double calConsoElec(int Duree) throws ConsoException {
        double puiss;
        double consumation;
        puiss = uc.calculerPuissance() + peripherique.puissance_total();
        consumation = puiss * Duree;
        if (consumation > 1000) {
            throw new ConsoException("la consomation a depassé 1000 watts");
        } else {
            return consumation;
        }
    }
}

