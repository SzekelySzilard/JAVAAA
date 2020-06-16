package com.company;

import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class logicalOperations {

    public int biggerNumber(int x, int y) {


        if (x > y) {
            return x;
        } else {
            return y;
        }

    }

    public String text() {

        String textComparison = "FastTrack";
        String textToCompare = "fas";

        if (textComparison.equals(textToCompare)) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }
    //  Creati o metoda de tip String, care sa primeasca un parametru de tip String, si un parametru de tip int.
//  Daca textul primit ca si parametru este egal cu “FastTrackIT”, si numarul primit ca
//  si parametru este mai mic sau egal cu 3, returnati textul si numarul, in ordinea asta.
//  Daca textul nu este “FastTrackIT”//  si numarul este mai mare sau egal cu 4, returnati numarul si textul, in ordinea asta.
//  Apelati metoda in main() pentru a verifica daca functioneaza.

    public String txt(String q, int w) {
        String testtext = "FastTrackIT";

        if (testtext.equals(q) && w <= 3) {
            String anyad = q + w;

            return anyad;


        } else if (!testtext.equals(q) && w >= 4) {
            String anyad2 = w + q;
            return anyad2;

        } else {
            System.out.println("nothing");
        }

        return testtext;
    }

//Creati o metoda de tip String, care sa primeasca un parametru de tip int.
// Daca numarul primit este mai mare de 8, SAU egal cu 6, atunci sa se returneze “The amount of snow this winter was(cm):
// “ si numarul. Daca nu, sa printeze “The forecast snow is(cm):”
// si numarul. Apelati metoda in main() pentru a verifica daca functioneaza.

    public String Nr(int x) {

        if (x > 8 || x == 6) {
            return "The amunt of snow this winter (cm)" + x;

        } else {
            return "The forcast snow is(cm)" + x;

        }

    }

    // Creati o metoda de tip String, care sa primeasca un parametru de tip numar.
    // Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”.
    // Daca numarul este egal cu 4, returnati “The number is equal to 4”,
    // iar daca numarul este mai mic de 3 returnati “The number is lower than 3”. Apelati metoda in main() pentru a verifica daca functioneaza.

    public String pct7(int x) {
        if (x > 3 && x != 4) {
            return "number is greatert than 3 but not equal to 4";

        } else if (x == 4) {
            return "number is equal to 4";
        } else if (x < 3) {
            return "the number is lower than 3";
        }
        return null;
    }


    // 8. Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
    // Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul "The number is:  x !"
    // unde x trebuie sa reprezinte numarul apasat.
    // Pentru exemplul de fata sa nu se foloseasca concatenarea stringului
    // "The number is:" cu numarul de la parametru, ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz
    // din Switch-Case. Apelati metoda in main() pentru a verifica daca functioneaza.

    public void caseNr(int x) {
        switch (x) {
            case 1:
                System.out.println("the number is 1");
                break;

            case 2:
                System.out.println("the number is 2");
                break;
            case 3:
                System.out.println("the number is 3");
                break;
            case 4:
                System.out.println("the number is 4");
                break;
            case 5:
                System.out.println("the number is 4");
                break;
            case 6:
                System.out.println("the number is 6");
                break;
            case 7:
                System.out.println("the number is 7");
                break;
            case 8:
                System.out.println("the number is 8");
                break;
            case 9:
                System.out.println("the number is 9");
                break;
            case 0:
                System.out.println("the number is 0");
                break;
        }

    }
//Creati o metoda care sa se numeasca isNumberEven. Metoda trebuie sa primeasca ca parametru un numar,
// si sa returneze adevarat sau fals. Daca numarul e par sa returneze true iar daca e impar sa returnese false.
// Apelati metoda in main() pentru a verifica daca functioneaza.

    public String isNumberEven(int x) {
        double y = x % 2;
        if (y == 0) {
            return "true";

        } else {
            return "false";
        }

    }

    // Creati o metoda care sa se numeasca isEligibleToVote.
    // Metoda sa primeasca ca si parametru un numar, care sa reprezinte varsta,
    // iar metoda sa iti zica daca daca persoana are drept de vot.
    // Daca varsta e peste 18, sa se returneze true iar daca nu, sa returneze false.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public String isEligibleToVote(int x) {
        if (x < 18) {
            return "false";
        } else {
            return "true";
        }
    }

    // . Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public int threeNumbers(int a, int b, int c) {

        logicalOperations op = new logicalOperations();

        int biggest = op.biggerNumber(a, b);

        int biggest1 = op.biggerNumber(biggest, c);

        return biggest1;

        // e bine daca am facut asa? //

    }

    public void onHundred(int x) {

        for (int i = x; i <= 100; i++) {
            System.out.println(i);


        }
    }

    public void firstSecond(int first, int second) {

        for (int i = first; i <= second; i++) {
            System.out.println(i);

        }
    }

    public void onHundredMinus(int x) {

        for (int i = x; i >= -100; i--) {
            System.out.println(i);


        }
    }

    public void micMare(int x, int y) {
        if (x < y) {

            for (int i = x; i <= y; i++) {
                System.out.println(i);

            }
        } else {

            for (int i = y; i >= x; i--) {
                System.out.println(i);
            }

        }
    }
    //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

    public void par() {
        for (int i = 0; i <= 100; i++) {
            double y = i % 2;

            if (y == 0) {
                System.out.println(i);
            }
        }
    }
    //  6. Creti o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

    public void impar() {
        for (int i = 0; i <= 100; i++) {
            double y = i % 2;

            if (y != 0) {
                System.out.println(i);
            }
        }
    }

    //  Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
//  Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
//  iar la final sa returneze rezultatul. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public int sum100(int x) {
        int sum = 0;
        for (int i = x; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }

//8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
// Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru, si sa calculeze media numerelor.
// La final, metoda sa returneze media.
// Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.


    public double avrg(int x) {

        int sum1 = 0;

        int y = x;

        for (int i = x; i <= 100; i++) {
            sum1 = sum1 + i;
        }

        double coun = 0.0;
        for (int i = y; i <= 100; i++) {

            coun = coun + 1;
        }
        double avrg2 = sum1 / coun;

        return avrg2;

    }
// Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
//
//
//*******
//
//******
//
//*****
//
//****
//
//***
//
//**
//
//*
//
//Cateva mentiuni:
//- pentru a putea rezolva problema, trebuie folosite doua bucle for. O bucla se va construi in alta bucla.
//
//- prima bucla for se va ocupa de afisarea pe orizontala, si cealalta pe verticala
//
//- semnul asterisk (*) se poate afisa sub forma de string

    public String steluta;

    {
        String st = "*";

        for (int j = 7; j >= 1; j--) {
            System.out.println(" ");
            for (int i = 1; i <= 7; i++) {
                System.out.print(st);
            }
        }
    }

    ////reati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
    //// Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100,
    //// pornind de la numarul primit ca si parametru.
    //// Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.


    public void numerWhile(int x) {

        int i = x;
        while (i <= 100) {

            System.out.println(i);

            i++;

        }
    }


    //Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
    // pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
    // deoarece metoda afiseaza, nu returneaza.


    public void numerWhileMinus(int x) {

        int i = x;
        while (i >= -100) {

            System.out.println(i);

            i--;

        }
    }

    // Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite,
    // pornind de la primul parametru primit, pana la cel de-al doilea
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
    //
    //Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void oneToAnother(int x, int y) {

        int i = x;
        int j = y;

        while (i <= j) {

            System.out.println(i);

            i++;

        }

    }

    //Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
    // si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
    //
    //Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void crescator(int x, int y) {
        int i = x;
        int j = y;

        if (i <= j) {
            do {
                System.out.println(i);
                i++;
            } while (i <= j);
        } else {
            while (j <= i) {
                System.out.println(j);
                j++;
            }

        }
    }

    //  Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.//

    public void oneHundredWhile() {

        int i = 1;
        while (i <= 100) {

            System.out.println(i);
            i++;
        }
    }

    //Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void onePair() {

        int i = 0;
        while (i <= 100) {
            i++;
            double k = i % 2;
            if (k == 0) {
                System.out.println(i);

            }
        }

    }
///// Creati o metoda care sa adune toate numerele din intervalul 111 si 8899.
//        // Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval.
//        // Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval
//        // . Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
//


    public void countWhile() {
        int x = 111;
        long y = 8899L;
        long sum = 0L;
        int count = 0;

        while (x <= y) {
            sum = sum + x;
            x++;
            count++;
        }
        System.out.println(sum);

        System.out.println(sum / count);

    }

    //Creati o metoda care sa primeasca doi parametrii de tip numar,
    // si sa returneze media numerelor divizibile cu 7, din acel interval.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public double avrgWhile(int x, int y) {

        double sum = 0.0;
        int count = 0;
        double avrg;

        do {

            if (x % 7 == 0) {
                sum = sum + x;
                count++;
                x++;
            } else x++;

        } while (x <= y);

        avrg = sum / count;
        return avrg;

    }

//Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.

    public void fibo() {
        int fibo2;
        int count = 1;
        int w = 0;
        int k = 1;
        System.out.println(w);
        System.out.println(k + " ");
        while (count <= 20) {

            fibo2 = w + k;
            count++;

            System.out.println(fibo2 + " ");
            w = k;
            k = fibo2;

        }
//Creati o metoda numita CozaLozaWoza.
//
//Metoda va afisa:
//- numerele de la 1 la 110
//- 11 numere pe linie
//- se va afisa Coza pentru numerele care sunt multiplu de 3 (1 2 Coza 4)
//- se va afisa Loza pentru numerele care sunt multiplu de 5 (2 3 4 Loza 6)
//- se va afisa Woza pentru numerele care sunt multiplu de 7 (4 5 6 Woza 8)
//- se va afisa CozaLoza pentru numerele care sunt multiplu de 3 SI 5
//- se va afisa CozaWoza pentru multiplu de 3 SI 7
//- se va afisa WozaLoza pentru multiplu de 5 SI 7
//- se va afisa CozaLozaWoza pentru multiplu de 3 SI 5 SI 7
//Ar trebui sa arate similar:
//1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11
//Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22
//23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza

//Apelati metoda in main() pentru a verifica daca functioneaza.
    }

    public void cozaLozaWoza() {

        int i = 0;
        while (i <= 110) {

            if (i % 11 == 0) {    //nu inteleg de ce scrie cate 9 pe linie :)) //
                System.out.println(" ");
            }
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.print("CozaLozaWoza ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("CozaWoza");
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print("LozaWoza");
            } else if (i % 3 == 0) {
                System.out.print("Coza");
            } else if (i % 5 == 0) {
                System.out.print("Loza");
            } else if (i % 7 == 0) {
                System.out.print("Woza");
            } else System.out.print(i + " ");

            i++;
        }

    }


    public int[] getarray() {

        int[] array = new int[100];

        for (int i = 0; i < 100; i++) {

            array[i] = i + 1;
        }
        return array;

    }

    public void printarray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i]);
        }
    }


    //Creati o metoda care primeasca un parametru de tip array de numere intregi gol,
    // si sa il returneze populat cu toate valorile pare de la 1 la 100.
    // Apelati metoda in main() pentru a verifica daca functioneaza. Atentie, metoda returneaza un array,
    // deci acesta va trebui surprins si afisat folosind o bucla.

    // public int[] parArray() {


    //    int[] array = new int[50];

    //   for (int j = 1; j < 100; j++) {
    //       int k = j % 2;

    //       if (k == 0) ;


    //     for (int i = 0; i < 50; i++) {

    //       array[i] = j;

    //     }
    /// }

    // }
    // Creati o metoda care sa primeasca un parametru de tip array de numere,
    // si sa fie populat cu valori. Metoda sa calculeze si sa returneze media numerelor din array.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public void avrgArray() {

        int[] myArray = new int[100];
        for (int i = 0; i < 100; i++) {
            myArray[i] = i + 1;
        }
        double sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];

        }

        double avrg = sum / myArray.length;
        System.out.println(avrg);

    }
    //Creati o metoda care sa primeasca un parametru de tip array de string-uri,
    // populat cu valori, si un parametru de tip String. Metoda sa verifice daca valoarea string-ului primit
    // se regaseste in array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false.
    // Apelati metoda in main() pentru a verifica daca functioneaza.


    public static boolean tf1() {

        String[] aa = new String[3];
        aa[0] = "q";
        aa[1] = "w";
        aa[2] = "e";

        String toVerify = "w";
        boolean tf = false;

        for (int i = 0; i < aa.length; i++) {


            if (aa[i].equals(toVerify)) {
                tf = true;
            }
            // return tf;
        }
        return tf;
    }

    public int pozitie(int x) {


        int[] poz = {1, 3, 4, 5, 6, 7, 8, 9,};


        for (int i = 0; i < 8; i++) {
            if (poz[i] == x) {

                x = i;
            }
        }//return i;

        return x;
    }

    public void lini() {

        String[] liniuta = new String[10];
        String x = "- - - - - - - - - -";
        for (int i = 0; i < 10; i++) {
            liniuta[i] = x;

            System.out.println(liniuta[i]);

        }
    }


//Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori,
// si un parametru de tip numar. Metoda sa verifice daca numarul exista in array,
// si daca da, sa returneze array-ul primit, fara acel numar.
// Apelati metoda in main() pentru a verifica daca functioneaza.

    public void faraNumar() {
        int[] numar = {1, 3, 4, 5, 6, 7, 8, 9,};
        int[] fNumar = new int[numar.length - 1];
        int x = 4;

        for (int i = 0; i < 8; i++) {
            if (numar[i] == x) {

                for (int j = i; j < fNumar.length; j++) {
                    fNumar[j] = numar[i + 1];
                }
                for (int k = 0; k < fNumar.length; k++) {

                    System.out.println(fNumar[i]);
                }
            }
        }
        // Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array.
        // Apelati metoda in main()pentru a verifica daca functioneaza.


    }

    public void mic2() {
        int[] mic1 = new int[4];
        mic1[0] = 6;
        mic1[1] = 2;
        mic1[2] = 5;
        mic1[3] = 1;
        int mic = 0;
        for (int k = 1; k < 4; k++) {
            for (int i = 0; i < mic1.length - 1; i++) {
                if (mic1[i + 1] < mic1[i]) {
                    mic = mic1[i + 1];
                    mic1[i + 1] = mic1[i];
                    mic1[i] = mic;
                }
            }
        }
        for (int i = 0; i < mic1.length; i++) {

            System.out.println(mic1[i]);

        }

        System.out.println(mic1[1]);

    }
// Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol.
// Metoda sa copieze toate valorile din primul array,
// parcurgandu-l, in cel de-al doilea. Apelati metoda in main() pentru a verifica daca functioneaza.

    public void doi() {
        int[] unu = new int[4];
        unu[0] = 3;
        unu[1] = 1;
        unu[2] = 6;
        unu[3] = 6;
        int[] doi = new int[4];

        for (int i = 0; i < unu.length; i++) {

                doi[i] = unu[i];
        }
        for (int i = 0; i <doi.length; i++) {

            System.out.println(doi[i]);
        }



    }

    public void prinlin(List<Integer> list) {
        for (int i=0; i< list.size(); i++){

            System.out.println(list.get(i));
        }
    }

//Scrieti o metoda Java, care sa primeasca doi parametrii:
// un parametru sa fie o lista de numere, si celalalt un numar (real sau intreg).
// Metoda sa adauge numarul primit ca si parametru la final de lista.

    public void addToList(List<Integer> list, int x) {
        list.add(x);

    }
    //Scrieti o metoda Java, care sa primeasca doi parametrii:
    // un parametru de tip Lista, iar celalalt un numar intreg.
    // Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista,
    // fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.

    public void fromNumber(List<Integer> list, int x) {

        for (int i=x; i< list.size(); i++ ){
            System.out.println(list.get(i));
        }
    }

  //  Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista,
    //  dar invers(de la capat la inceput).

     public void invers(List<Integer> list){
        for (int i= list.size()-1; i>=0; i--) {
            System.out.print(list.get(i));
        }
     }
     //Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri, unul de tip intreg,
    // si unul de tip String. Metoda sa adauge parametrul de tip String in lista primita,
    // iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.

    public void numberString( List<String> list, int x, String y){

        list.add(x,y);


    }

    // Scrieti o metoda Java, care sa primeasca doi parametrii. Primul dintre ei va fi o Lista,
    // iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.


    public void pePrima(List<Integer> list, int x){
        list.add(0,x);

    }
    //Scrieti o metoda Java care sa primeasca parametru o Lista,
    // si sa afiseze ce valori are lista, si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).

    public void pozPlusValoare( List<Integer> list){
        int x;

        for (int i=0; i<list.size(); i++){
            x=i;
            System.out.println("pe pozitia " + x + "valoarea este"+ list.get(i)  );

        }

      //  Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.

    }


    public void celMaiMare(List<Integer> list){

        int max=0;

        for ( int i=0; i<list.size(); i++){
       if ( list.get(i) >max) {
           max=list.get(i);
       }


        }
        System.out.println("cel mai mare nr este " + max);


    }

//5. In clasa LogicalOp, creati o metoda care sa primeasca un array de numere ca si parametru, si un numar.
// Fara a folosi conditii, si folosind un try-catch, afisati valoarea de pe pozitia numarului primit, iar
// daca valoarea numarului este mai mare decat numarul de pozitii din array, afisati textul: "Inside catch, number too large".

public void  faraIf(  ){
    int[] myArray= new int[3];
        myArray[0]=2;
        myArray[1]=4;
        myArray[2]=6;

        try{
            System.out.println("enter position");
            Scanner scan= new Scanner(System.in);
            int y=scan.nextInt();


            System.out.println(myArray[y]);
        }catch(IndexOutOfBoundsException e){
            System.out.println("inside catch, number too large");
        }catch (InputMismatchException i){
            System.out.println("invali input");
        }

    }

//In clasa LogicalOp, creati o metoda  'wait()'.
// Metoda sa nu returneze nimic, dar sa primeasca un parametru de tip int.
// In interiorul ei, tratati metoda Thread.sleep(),
// astfel incat metoda noastra sa primeasca valoarea in secunde, cat sa astepte. Ex: wait(5) -> asteapta 5 secunde.


public List<Integer> szar() {
    List<Integer> listLab = new ArrayList();

    listLab.add(1);
    listLab.add(8);
    listLab.add(3);
    listLab.add(4);
    return  listLab;


}
}