package com.rajatigor.bangundatar.pbo.uts;

import java.util.*;
public class Segitiga extends Bangundatar {
    public void Segitiga(){
        double luasSegitiga, alasSegitiga, tinggiSegitiga, sisiMiringSegitiga, kelilingSegitiga;
        Scanner a = new Scanner(System.in);
        System.out.println("SEGITIGA SEMBARANG");
        System.out.println("========");
        System.out.println("Masukkan alas : ");
        alasSegitiga = a.nextDouble();
        System.out.println("Masukkan tinggi :");
        tinggiSegitiga = a.nextDouble();
        System.out.println("Masukkan sisi miring : ");
        sisiMiringSegitiga = a.nextDouble();
        luasSegitiga = (alasSegitiga * tinggiSegitiga) / 2;
        kelilingSegitiga = sisiMiringSegitiga + alasSegitiga + tinggiSegitiga;
        System.out.println("Luas Segitiga adalah : " +luasSegitiga);
        System.out.println("Keliling Segitiga adalah : " +kelilingSegitiga);
    }
}