/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pc;

public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UC uc = new UC(10.2, 8, 120); 

        Clavier clavier1 = new Clavier(1, "Clavier sans fil", 102, 5); 
        Moniteur moniteur1 = new Moniteur(2, "Moniteur Full HD", 2, 18, 1700); 
        Peripherique peripheriques = new Peripherique(2); 
        peripheriques.addPeripherique(clavier1);
        peripheriques.addPeripherique(moniteur1);
        PC pc0 = new PC(uc, peripheriques);
        try {
            double consommation = pc0.calConsoElec(5);
            System.out.println("La consommation electrique pour PC0 est de " + consommation + " watts");
        } catch (ConsoException e) {
            System.out.println(e.getMessage());
        }
   
    }}

