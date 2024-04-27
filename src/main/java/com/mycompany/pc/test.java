/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pc;

public class test {
    public static void main(String[] args) {
        UC uc = new UC(10.2, 8, 10);
        Clavier clavier = new Clavier(1, "Clavier", 102, 5);
        Moniteur moniteur = new Moniteur(2, "Moniteur", 2, 18, 1700);
        Peripherique[] peripheriques = {clavier, moniteur};
        PC pc0 = new PC(uc, peripheriques);
        try {
            double consommation = pc0.calConsoElec(5);
            System.out.println("La consommation électrique pour PC0 est de " + consommation + " watts.");
        } catch (ConsoException e) {
            System.out.println(e.getMessage());
        }
    }
}