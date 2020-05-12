package com.company;

public class MainTema4 {

    // Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100,
    // pornind de la numarul primit ca si parametru.
    // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public static void main(String[] args) {

        logicalOperations op = new logicalOperations();

        int x = 59;
        op.onHundred(x);


        // Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
// Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea
// (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
        logicalOperations fs = new logicalOperations();

        int first = 69;
        int second = 102;

        fs.firstSecond(first, second);


        // 2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
        // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
        // pornind de la numarul primit ca si parametru.
        // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.


        logicalOperations minus = new logicalOperations();

        x = -50;
        minus.onHundredMinus(x);

        // Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
// Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
// si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
// (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,
// atunci numaratoarea sa fie de la y la x).
//
//
//Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
//
//Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

        logicalOperations mM = new logicalOperations();

        int w = 69;
        int y = 99;
        mM.micMare(w, y);

        //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

        logicalOperations par1 = new logicalOperations();

        par1.par();


        logicalOperations impar = new logicalOperations();

        impar.impar();
// 7 Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
//  Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
//  iar la final sa returneze rezultatul. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

        logicalOperations summ = new logicalOperations();
        System.out.println(summ.sum100(98));

//8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
// Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru, si sa calculeze media numerelor.
// La final, metoda sa returneze media.
// Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
        logicalOperations avrg1 = new logicalOperations();
        System.out.println(avrg1.avrg(97));


        //   String  steluta;
        {

            //   String st = "*";
            //     for (int i = 1; i <= 7; i++) {

            //     String q = st + st;
            //   System.out.println(q);
        }
        //   for (int i=7; i>=0; i--){


//reati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
// Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100,
// pornind de la numarul primit ca si parametru.
// Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

        logicalOperations while1= new logicalOperations();
           while1.numerWhile(99);


           //Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
        // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
        // pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
        // deoarece metoda afiseaza, nu returneaza.

         logicalOperations whileMinus=new logicalOperations();
         whileMinus.numerWhileMinus(-98);


       // Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
        // Metoda sa afiseze o numaratoare intre cele doua numere primite,
        // pornind de la primul parametru primit, pana la cel de-al doilea
        // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
        //
        //Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
          logicalOperations oneToAnotherWhile= new logicalOperations();
          oneToAnotherWhile.oneToAnother(4,7);


      //Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
        // Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
        // si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
        // (ex: daca int x e primul parametru iar int y  este cel de-al doilea,
        // daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
        //
        //Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

           logicalOperations crescarot1= new logicalOperations();
           crescarot1.crescator(2, 5);


           // Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

         logicalOperations hundred= new logicalOperations();
         hundred.oneHundredWhile();
         //Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
        logicalOperations hundredPair=new logicalOperations();
        hundredPair.onePair();
     /// Creati o metoda care sa adune toate numerele din intervalul 111 si 8899.
        // Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval.
        // Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval
        // . Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
        logicalOperations oneoneone= new logicalOperations();
        oneoneone.countWhile();

        //Creati o metoda care sa primeasca doi parametrii de tip numar,
        // si sa returneze media numerelor divizibile cu 7, din acel interval.
        // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
         logicalOperations avaradgeWhile= new logicalOperations();
        System.out.println(avaradgeWhile.avrgWhile(7,27));

       //
        //Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.
        logicalOperations fibonacci= new logicalOperations();
        fibonacci.fibo();

        
        //CozaLozaWoza
        logicalOperations coza=new logicalOperations();
         coza.cozaLozaWoza();
    }


}



