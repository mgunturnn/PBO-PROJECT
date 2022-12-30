/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproject1;

/**
 *
 * @author M Guntur Nugraha
 */

public abstract class Character {
    // variabel
    private String namaPlayer;
    private int socialCredit, poin;
    
    // overload contructor
    // constructor empty
    public Character(){
        
    }
    
    // constructor karakter
    public Character(String namaPlayer, int socialCredit, int poin){
        this.namaPlayer = namaPlayer;
        this.socialCredit = socialCredit;
        this.poin = poin;
    }
    
    // konsep encapsulation
    public String getNamaPlayer(){
        return namaPlayer;
    }
    
    public void setNamaPlayer(String namaPlayer) {
        this.namaPlayer = namaPlayer;
    }

    public int getSocialCredit() {
        return socialCredit;
    }

    public void setSocialCredit(int socialCredit) {
        this.socialCredit = socialCredit;
    }

    public int getPoin() {
        return poin;
    }

    public void setPoin(int poin) {
        this.poin = poin;
    }
    
    public abstract void attack(int jumlah);
}
