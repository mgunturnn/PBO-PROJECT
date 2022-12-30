/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproject1;

/**
 *
 * @author M Guntur Nugraha
 */

public class Netizonk extends Character {
    
    public Netizonk() {
        super("", 100, 0);
    }
    
    // Method Overriding Netizonk
    @Override
    public void attack(int jumlah) {
        setSocialCredit(getSocialCredit()-jumlah);
    }
}