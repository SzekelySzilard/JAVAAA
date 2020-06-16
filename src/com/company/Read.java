package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {
//1. In clasa Read, din programul vostru, creati o metoda tratat, care sa returneze un numar de la tastatura
 //   2. In clasa Read, duplicati metoda de la punctul 1, astfel incat sa aveti mai multe metode,
//   care sa citeasca si sa returneze si alte tipuri de numere (float, int, double, long, etc///
    //
    public int getInt() {
        boolean repeat = true;
        int myInt = 0;
        do {
            try {
                System.out.print("please enter a number");
                Scanner scan = new Scanner(System.in);
                myInt = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("the value entered is incorect");

            }

        }while (repeat == true) ;
        return myInt;

    }


    public long getLong(){

        boolean repeat = true;
        long myLong = 0;
        do {
            try {

                System.out.print("please enter a number");
                Scanner scan = new Scanner(System.in);
                myLong = scan.nextLong();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("the value entered is incorect");

            }

        }while (repeat == true) ;
        return myLong;

    }

    public double getDouble(){
        boolean repeat = true;
        double myDouble = 0;
        do {
            try {
                System.out.print("please enter a number");
                Scanner scan = new Scanner(System.in);
                myDouble = scan.nextDouble();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("the value entered is incorect");

            }

        }while (repeat == true) ;
        return myDouble;


    }

    public float getFloat(){

        boolean repeat = true;
        float myFloat = 0;
        do {
            try {
                System.out.print("please enter a number");
                Scanner scan = new Scanner(System.in);
                myFloat = scan.nextFloat();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("the value entered is incorect");

            }

        }while (repeat == true) ;
        return myFloat;
    }
//3. In clasa Read, creati o metoda care sa returneze un array de numere populat de la tastatura.
// Metoda sa primeasca ca si parametru un numar, care reprezinta cate pozitii are.

    public int[] arrayTastatura(int x){

        int k;
        int[] myArray= new int[x];
        System.out.print("please enter the valoues for the array");
        for (k=0; k<x;  k++){
            Scanner scan= new Scanner(System.in);
            myArray[k]=scan.nextInt();

        }
      return myArray;
    }
//4. In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura.
// Metoda nu v-a primii parametru lungimea. In rezolvarea ei trebuie folosit try-catch.
// (Hint: a se citi de la tastatura atata timp cat valoarea primita e numar, cand nu mai e numar, sa se intrerupa citirea)

    public void listaTastatura() {
        List<Integer> list = new ArrayList<Integer>();
          boolean repeat=true;
        System.out.print("enter the nubers for your list");
        do {
          try {


               Scanner scan = new Scanner(System.in);
               list.add(scan.nextInt());
           }catch (InputMismatchException e){
               repeat=false;

           }

        }while(repeat);
        System.out.println(list);
    }

public String getString(){
        Scanner scan= new Scanner(System.in);
        return scan.next();

}


    }

