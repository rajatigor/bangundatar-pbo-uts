package com.rajatigor.bangundatar.pbo.uts;

import java.util.Scanner;
public class Persegi extends Bangundatar {
    public void Persegi(){
        double sisiPersegi, luasPersegi, kelilingPersegi;
        Scanner c = new Scanner(System.in);
        System.out.println("Persegi");
        System.out.println("=============");
        System.out.println("Masukkan sisi : ");
        sisiPersegi = c.nextDouble();
        luasPersegi = sisiPersegi * sisiPersegi;
        kelilingPersegi = 4 * sisiPersegi;
        System.out.println("Luas Persegi adalah : " +luasPersegi);
        System.out.println("Keliling Persegi adalah : " +kelilingPersegi);
    }
}