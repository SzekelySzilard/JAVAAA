package com.company;

public class TemaLab2pct678 {

    public static void main(String[] args) {

        System.out.println( grade(1));//* in graba am facut din C in Faranheit prima data :))) *//
        System.out.println( grade1(100));
        System.out.println( inch(120));
        double KMH= km(1000, 0.5,29,60);
        System.out.println("rezultat in Km/H= " + KMH);
        double MpS= KMH*3.6;
        System.out.println("rezultatul in M/S= " +MpS);
        double MPH= KMH/1.609;
        System.out.println("rezultatul in MPH= " + MPH);
     }
    public static double grade(double C) {
//* C = 5/9 * (F -32) *//
        double f=( 9*C + 160 )/5;
        return f;
    }
public static double grade1(double F) {
        int x=5;
        int y=32;
        double rez1= x*F - x*32 ;
        double rezfin= rez1/9;
        return rezfin;
    }

    public static double inch(double I) {
        double x=I*0.0254 ;
        return x;
    }

    public static double km(double D, double H, double M, double S){

        double sinH=S*0.000277;
        double minH=M*0.016666;
        double  rez1= sinH+minH+H;
        double kmh= (rez1*D)/1000;
        return kmh;

    }
}

