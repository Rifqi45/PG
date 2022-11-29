/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.persegipanjang;

/**
 *
 * @author Kii
 */
import com.bangundatar.BangunDatar;
public class PersegiPanjang {
    private int panjang;
    private int lebar;
    
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double luas() {
        return panjang * lebar;
    }
}
