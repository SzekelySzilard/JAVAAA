package com.company;

import org.w3c.dom.ls.LSOutput;

public class TemaLab2pct1 {

    public static void main(String[] args) {
        myName();
        System.out.println(a(-5, 8, 6)) ;
        System.out.println(b());
        System.out.println(c());
        System.out.println(d());
    }

    public static void myName() {
        System.out.println(" Szilard ");
    }
    //* -5 + 8 * 6*//
    public static int a(int x, int y, int z) {

        int b = y * z;
        int a1 = x + b;
        int rez = a1;
        return rez;
    }
    //* (55+9) % 9 *//

    public static int b()  {
        int x =55;
        int y= 9;
        int z=9;
        int rez1= x+y;
        int rezfin= rez1%z;
        return rezfin;
    }
    public static double c() {

        double q = 5;
        double w = 8;
        double z= q/w;
        double  rezfin = 20+(-3*z);
        return rezfin;
    }
     public static int d() {
     int rezfin = 5+15/3*2-(8%3);
     return rezfin;
}

}
