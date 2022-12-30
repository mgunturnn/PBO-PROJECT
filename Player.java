/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproject1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author M Guntur Nugraha
 */

public class Player extends Character {

    public int codeAttackSkills;
    public int buff;
    
    // Struktur Data Array List
    public ArrayList<String> attackSkills = new ArrayList<String>();

    // kontruktor player + pilih skill
    public Player(String namaPlayer) throws IOException {
        // setting max social credit awal ke 100, perolehan poin 0
        super(namaPlayer, 100, 0);
        
        // daftar skill yang tersedia
        attackSkills.add("Kamu Nenyee?? (+5 attack damage)");
        attackSkills.add("Anti Hujat (+10 attack damage)");
        attackSkills.add("Rawwrr (+15 attack damage)");

        Random rand = new Random();
        int inputSkill = rand.nextInt(3);
        // player memilih ulti yang akan digunakan
        Helper.clear();
        System.out.println("==============================================");
        System.out.println("");
        System.out.println("Selamat skill " + attackSkills.get(inputSkill) + " telah kamu ambil");
        System.out.println("");
        System.out.println("==============================================");
        System.out.println("Press Enter To Continue.....");
        System.in.read();
        switch (inputSkill) {
            case 0:
                setBuff(5);
                break;
            case 1:
                setBuff(10);
                break;
            case 2:
                setBuff(15);
                break;
            default:
                break;
        }
    }

    public int getBuff() {
        return buff;
    }

    public void setBuff(int buff) {
        this.buff = buff;
    }

    //Method Overriding (Player)
    @Override
    public void attack(int jumlah) {
        setPoin(getPoin() + jumlah);
    }
}
