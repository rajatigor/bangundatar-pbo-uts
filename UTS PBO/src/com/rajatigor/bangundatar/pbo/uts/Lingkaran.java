package com.rajatigor.bangundatar.pbo.uts;

import java.util.Scanner;
public class Lingkaran extends Bangundatar {
    public void Lingkaran(){
        double luasLingkaran, jariJariLingkaran, kelilingLingkaran, phi = 3.14;
        Scanner b = new Scanner(System.in);
        System.out.println("LINGKARAN");
        System.out.println("=========");
        System.out.println("Masukkan jari-jari : ");
        jariJariLingkaran = b.nextDouble();
        luasLingkaran = phi * jariJariLingkaran * jariJariLingkaran;
        kelilingLingkaran = 2 * phi * jariJariLingkaran;
        System.out.println("Luas Lingkaran adalah : " +luasLingkaran);
        System.out.println("Keliling Lingkaran adalah : " +kelilingLingkaran);
    }
}