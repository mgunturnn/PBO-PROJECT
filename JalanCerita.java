/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproject1;

/**
 *
 * @author M Guntur Nugraha
 */
public class JalanCerita {
    
    public static void intro() {
        Helper.clear();
        System.out.println("==============================================");
        System.out.println("");
        System.out.println("=========== ALIP REDEMPTION GAME =============");
        System.out.println("");
        System.out.println("Pada suatu hari, terdapat seorang content creator bernama Alip");
        System.out.println("Di dalam konten tiktok-nya, Alip selalu mengatakan (KAMU NENYEE)");
        System.out.println("Inilah yang membuat sebagian oknum netizonk terganggu dan menyerang alip dengan hujatan-hujatan");
        System.out.println("");
        System.out.println("==============================================");
        System.out.println("Press Enter to Continue...");
    }
    
    public static void levelIntro(int level) {
        Helper.clear();
        System.out.println("");
        System.out.println("=============== INTRO ========================");
        System.out.println("=============== LEVEL "+level+" ======================");
        System.out.println("");
        System.out.println("Bantu Alip untuk menyerang Netizonk sampai mati!!");
        System.out.println("Gunakan skill attack dengan bijak!");
        System.out.println("");
        System.out.println("==============================================");
        System.out.println("");
        System.out.println("Press Enter To Continue.....");
    }

    public static void levelOutro(int level) {
        Helper.clear();
        System.out.println("");
        System.out.println("=============== OUTRO ========================");
        System.out.println("=============== LEVEL "+level+" ======================");
        System.out.println("Selamat, kamu berhasil melewati rintangan Level ini");
        System.out.println("Netizonk Level ini berhasil dibunuh, bersiaplah karena Netizonk Level selanjutnya akan lebih sulit dibunuh daripada Level ini");
        System.out.println("Oiya, kamu juga diperkenankan buat keluar dari game jika kamu sudah menyerah");
        System.out.println("Tapi kalau masih semangat, yukk gasss lanjutin ke Level ini");
        System.out.println("");
        System.out.println("==============================================");
        System.out.println("");
        System.out.println("Press Enter To Continue.....");
    }

    public static void endGame(Player player) {
        Helper.clear();
        System.out.println("==============================================");
        System.out.println("");
        System.out.println("Selamat, " + player.getNamaPlayer() + ", Kamu berhasil menamatkan game dan menyelamatkan mental alip, semoga harimu bahagia terus yakk ><");
        System.out.println("");
        System.out.println("==============================================");
        System.out.println("Press Enter to exit the game...");
    }
}
