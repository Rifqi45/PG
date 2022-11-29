/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lingkaran;

/**
 *
 * @author Kii
 */
public class Lingkaran {
    private final int jari;
    
    public Lingkaran(int jari) {
        this.jari = jari;

    }
    
    public double luas() {
        return ( Math.PI * jari * jari) / 2 ;
    }
}
