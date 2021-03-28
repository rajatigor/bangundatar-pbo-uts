package com.rajatigor.bangundatar.pbo.uts;

import java.util.Scanner;
public class Persegipanjang extends Bangundatar {
    public void Persegipanjang(){
        double panjangPersegiPanjang, lebarPersegiPanjang, luasPersegiPanjang, kelilingPersegiPanjang;
        Scanner d = new Scanner(System.in);
        System.out.println("PERSEGI PANJANG");
        System.out.println("===============");
        System.out.println("Masukkan Panjang : ");
        panjangPersegiPanjang = d.nextDouble();
        System.out.println("Masukkan Lebar : ");
        lebarPersegiPanjang = d.nextDouble();
        luasPersegiPanjang = panjangPersegiPanjang * lebarPersegiPanjang;
        kelilingPersegiPanjang = (2 * panjangPersegiPanjang) + (2 * lebarPersegiPanjang);
        System.out.println("Luas Persegi Panjang adalah : " +luasPersegiPanjang);
        System.out.println("Keliling Persegi Panjang adalah : " +kelilingPersegiPanjang);
    }
}