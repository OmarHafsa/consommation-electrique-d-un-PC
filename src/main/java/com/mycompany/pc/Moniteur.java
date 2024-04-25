/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pc;

/**
 *
 * @author FAROUK
 */
public class Moniteur extends type{
    
     double classeConsommation;
     int dimension;
     int resolutionMax;

    public Moniteur(int id, String modele, int classeConsommation, int dimension, int resolutionMax) {
        super(id, modele);
        this.classeConsommation = classeConsommation;
        this.dimension = dimension;
        this.resolutionMax = resolutionMax;
    }
    public double calculerPuissance() {
        return (classeConsommation * dimension + resolutionMax * 0.015);
    }
}
