/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproject1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author M Guntur Nugraha
 */

public class Helper implements Input {

    static Scanner scanner = new Scanner(System.in);

    static Player player;
    
    static Netizonk netizonk;

    public static boolean isRunning;
    
    // method untuk memulai game
    public void start() throws IOException {
        boolean konfirmasiNama = false;
        String namaPlayer;
        int level = 1;

        // print judul
        clear();
        System.out.println("========================================");
        System.out.println("");
        System.out.println("ALIP REDEMPTION");
        System.out.println("BY YESHA, DANGIANG, GUNTUR");
        System.out.println("");
        System.out.println("========================================");
        System.out.println("");
        // panggil rules
        mainRules();
        
        // get nama player
        do {
            System.out.println("");
            System.out.println("========================================");
            System.out.println("");
            printHeading("Silahkan masukkan nama kamu : ");
            namaPlayer = scanner.next();
            // mengkonfirmasi kepada player apakah nama sudah sesuai
            clear();
            System.out.println("========================================");
            System.out.println("");
            printHeading("Nama kamu adalah " + namaPlayer + ".\nApakah sudah benar?");
            System.out.println("1. Yoii, kamu masih bertenye-tenye");
            System.out.println("2. Salahhhh, bentar mau diganti dulu hehe");
            int input = bacaInput("Kamu milih apa?", 2);
            if (input == 1) {
                konfirmasiNama = true;
            }
        } while (!konfirmasiNama);

        // membuat object player baru
        player = new Player(namaPlayer);
        
        // membuat object netizonk baru
        netizonk = new Netizonk();

        // set isRunning true
        isRunning = true;
        
        // print an intro in games
        JalanCerita.intro();
        System.in.read();
        
        // start game loop
        do{
            netizonk.setSocialCredit(100);
            JalanCerita.levelIntro(level);
            System.in.read();
            gameLoop(level);
            if(level == 4){
                JalanCerita.endGame(player);
            }else{
                JalanCerita.levelOutro(level);
            }
            System.in.read();
            level++;
        }while(level < 5);
        
    }

    // method to print a rules
    public void mainRules() {
        System.out.println("KAMU BERTENYE-TENYE CARA BERMAINNYA???");
        System.out.println("SINI AKU KASIH TAUU");
        System.out.println("-> Kamu harus masukin nama kamu dulu yak rawwr");
        System.out.println("-> Kamu harus milih skill yang bakalan ngebantu kamu buat nyelesain game nya rawwr");
        System.out.println("-> Game ini terdapat 4 Level yang masing-masing level mempunyai kesulitan masing-masing rawwr");
        System.out.println("-> Kamu dinyatakan berhasil menyelesaikan game jika kamu sudah melewati tiap Level dengan baik rawwr");
        System.out.println("-> Perhatikan dengan baik instruksi yang ada dalam game rawwr");
        System.out.println("");
        System.out.println("========================================");
        System.out.println("");
        System.out.println("Kamu setuju dengan rules-nya??");
        System.out.println("1. Yaaa");
        System.out.println("2. Gaaa");

        int input = bacaInput("Kamu milih apa?", 2);
        if (input == 2) {
            System.out.println("Rawwrr kamu anaknya tidak support");
            System.exit(0);
        }
        clear();
    }
    
    // method untuk print mid menu
    public static void midMenu() {
        printHeading("MID MENU");
        System.out.println("Kamu milih apa?");
        System.out.println("1. Serang Netizonk");
        System.out.println("2. Info Karakter");
        System.out.println("3. Keluar Dari Game");
    }
    
    // method to playing a game
    public void gameLoop(int level) {
        while (netizonk.getSocialCredit() > 0) {
            clear();
            infoKarakter();
            System.out.println("");
            System.out.println("========================================");
            System.out.println("");
            midMenu();
            int input = bacaInput("Kamu milih apa?", 3);
            if (input == 1) {
                player.attack(5);
                switch(level){
                    case 1:
                        netizonk.attack(25 + player.getBuff());
                        break;
                    case 2:
                        netizonk.attack(20 + player.getBuff());
                        break;
                    case 3:
                        netizonk.attack(15 + player.getBuff());
                        break;
                    case 4:
                        netizonk.attack(10 + player.getBuff());
                        break;
                    case 5:
                        netizonk.attack(5 + player.getBuff());
                        break;
                    default:
                        break;
                }
            } else if (input == 2) {
                infoKarakter();
                System.out.println("");
                System.out.println("========================================");
                System.out.println("");
            } else if (input == 3) {
                clear();
                System.out.println("========================================");
                System.out.println("");
                System.out.println("Kamu berhasil keluar game!!");
                System.out.println("Sampai jumpa kembali!!");
                System.out.println("");
                System.out.println("========================================");
                System.exit(0);
            }
            else{
                System.out.println("sdfsd");
            }
        }
    }
    
    // method to print info character
    public static void infoKarakter() {
        clear();
        System.out.println("========================================");
        System.out.println("");
        printHeading("INFO PEMAIN");
        System.out.println("Nama Player : " +player.getNamaPlayer());
        System.out.println("Netizonk Social Credit : " + netizonk.getSocialCredit());
        System.out.println("Poin Player: " + player.getPoin());
    }
    
    
    
    // method untuk mengkonfirmasi inputan dari user
    // implement interface Input
    // Exception Handling
    @Override
    public int bacaInput(String teks, int pilihan) {
        int input;
        do {
            System.out.println(teks);
            try {
                input = scanner.nextInt();
            } catch (Exception e) {
                input = -1;
                System.out.println("Masukkan Angka: ");
            }
        } while (input < 1 || input > pilihan);
        return input;
    }

    // method to simulate clearing out the console
    public static void clear() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    // method untuk menghentikan game sampai player meng-enter angka 1
    public static void toContinue() {
        System.out.println("Press Enter Key to Continue!");
        scanner.nextLine();
    }

    //method to print a heading
    public static void printHeading(String title) {
        System.out.println(title);
    }
}
