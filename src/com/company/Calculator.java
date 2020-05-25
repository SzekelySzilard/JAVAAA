package com.company;

public class Calculator {


    public  int sum(int x, int y) {
        int rezfin = x+y;
        return rezfin;
    }

    public  double sum(double x, int y) {
        double rezfin = x+y;
        return rezfin;
    }

    public  int sum(int x, int y, int z) {
        int rezfin = x+y+z;
        return rezfin;
    }


    public  int sub(int x, int y) {
        int rezfin = x-y;
        return rezfin;
    }

    public  int sub(int x, int y , int z) {
        int rezfin = x-y-z;
        return rezfin;
    }

    public  double sub(double x, double y) {
        double rezfin = x-y;
        return rezfin;
    }


    public  int add(int x, int y) {
        int rezfin=x*y;
        return rezfin;
    }

    public  double add(double x, double y) {
        double rezfin=x*y;
        return rezfin;
    }

    public  int add(int x, int y, int z) {
        int rezfin=x*y*z;
        return rezfin;
    }



    public  double div(double x, double y ) {
        double rezfin = x / y;
        return rezfin;
    }

    public  double div(double x, double y, double z ) {
        double rezfin = (x / y)/z;
        return rezfin;
    }
}
