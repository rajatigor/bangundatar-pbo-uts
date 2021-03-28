package com.rajatigor.bangundatar.pbo.uts;

import java.util.*;
public class Bangundatar {
    public static void main(String[] args) {
        int pilihan, counter = 0;
        boolean running = true;
        String jawab;
        Lingkaran L = new Lingkaran();
        Segitiga S = new Segitiga();
        Persegi P = new Persegi();
        Persegipanjang Pp = new Persegipanjang();
        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        while (running) {
            System.out.println("=================================================");
            System.out.println("PROGRAM MENGHITUNG LUAS DAN KELILING BANGUN DATAR");
            System.out.println("=================================================");
            System.out.println("                    MENU");
            System.out.println("=================================================");
            System.out.println("1. Lingkaran");
            System.out.println("2. Segitiga");
            System.out.println("3. Persegi");
            System.out.println("4. Persegi Panjang");
            System.out.println("=================================================");
            System.out.print("Masukkan Pilihan : ");
            pilihan = input.nextInt();
            if (pilihan == 1) {
                L.Lingkaran();
            } else if (pilihan == 2) {
                S.Segitiga();
            } else if (pilihan == 3) {
                P.Persegi();
            } else if (pilihan == 4) {
                Pp.Persegipanjang();
            } else {
                System.out.println("Pilihan yang Anda masukkan salah");
            }

            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [ya/tidak]> ");

            jawab = scan.nextLine();

            if( jawab.equalsIgnoreCase("ya") ){
                running = false;
            }

            counter++;
        }
    }
}