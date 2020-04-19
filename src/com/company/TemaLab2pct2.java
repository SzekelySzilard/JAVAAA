package com.company;

public class TemaLab2pct2 {

    public static void main(String[] args) {
        System.out.println( sum(2,3)) ;
        System.out.println( sub( 3,-7));
        System.out.println( add(3, 5));
        System.out.println( div(4,3));

    }

    public static int sum(int x, int y) {
        int rezfin = x+y;
        return rezfin;
    }
    public static int sub(int x, int y) {
        int rezfin = x-y;
        return rezfin;
    }
    public static int add(int x, int y) {
        int rezfin=x*y;
        return rezfin;
    }
    public static double div(double x, double y ) {
        double rezfin=x/y;
        return rezfin;
    }
}
