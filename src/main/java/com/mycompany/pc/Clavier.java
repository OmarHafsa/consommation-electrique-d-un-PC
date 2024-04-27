/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pc;


class Clavier extends Peripherique {
    int nbTouches;
    double puissance;

    public Clavier(int id, String modele, int nbTouches, double puissance) {
        super(id, modele);
        this.nbTouches = nbTouches;
        this.puissance = puissance;
    }

    public double calculerPuissance() {
        return puissance;
    }
}

