/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pc;

/**
 *
 * @author FAROUK
 */
public class Peripherique {
        public type[] peripheriques;
        int taille;
        static int index = 0;

    public Peripherique(int taille) {
        this.taille = taille;
        this.peripheriques = new type[this.taille];
    }

    public void addPeripherique(type tmp) {
            if (index < this.taille) {
                peripheriques[index] = tmp;
                index++;
            } else {
                System.out.println("Le tableau est plein\n");
            }
    }

    public double puissance_total() {
        double somme = 0;
        for (int i = 0; i < taille; i++) {
            somme += peripheriques[i].CalculerPuissance();
        }
        return somme;
    }
}
