package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here





        System.out.println("Hello");
        System.out.println("Szilard");

        int x = 6;
        double y = 3.5;
        double rez = x * y ;
        System.out.println(" rezultat suma = " + rez);
        System.out.println("rezultat impartire = " + (x/y));

        /* a. -5 + 8 * 6

b. (55+9) % 9

c. 20 + -3*5 / 8

d. 5 + 15 / 3 * 2 - 8 % 3  */

        double q = 5;

        double w = 8;

        double z= q/w;




        int a = -5+8*6;
        System.out.println("a= " + a);

        double b = (55+9)%9;
        System.out.println("b= " + b);

        double c = 20+(-3*z);
        /* recunosc, ca am fost ajutat sa imi iasa valoarea cu zecimale. in prima faza am scris
        toata formula fara a mai folosi variabilele q w si z:  double c = 20+(-3*5/8) si mi s-a parut suspect rezultatul
        fiind 19.0.  Eu am facut ceva programare in pascal si de acolo eram cu ideea ca trbuie declarate toate initil
        si dupa facute restul dar am vazut ca merge la primele si am continuat asa :))
        poate imi explicati de nu i-a atribuit valoarea cu zecimale lui c din moment ce l-am declarat ca fiind doulbe
         daca exista o explicatie pentru asta
         multumesc.
         */

        System.out.println("c= " + c);

        double d = 5+15/3*2-(8%3);
        System.out.println("d= " + d);







    }
}
