package com.company;

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

    public void  micMare(int x, int y) {
        if (x < y) {

            for (int i = x; i <= y; i++) {
                System.out.println(i);

            }
        } else {

             for (int  i=y; i>=x; i-- ){
                 System.out.println(i);
             }

        }
    }
    //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

    public void par(){
        for( int i=0; i<= 100; i++){
            double y = i % 2;

            if (  y==0  ){
                System.out.println(i);
            }
        }
    }
    //  6. Creti o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

    public void impar(){
        for( int i=0; i<= 100; i++){
            double y = i % 2;

            if (  y!=0 ){
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


   public double avrg(int x){

       int sum1 = 0;

       int y=x;

       for (int i = x; i <= 100; i++) {
           sum1 = sum1 + i;
       }

       double coun= 0.0 ;
       for (int i =y; i<=100; i++){

           coun = coun+1;
       }
       double avrg2= sum1/coun;

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

    //public String  steluta;{

      //     String st="*";
      //    for (int i = 1; i<=7;i++) {

        //
       // }
     //   for (int j=7; i>=0; j--){


    ////reati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
    //// Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100,
    //// pornind de la numarul primit ca si parametru.
    //// Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.


    public void  numerWhile( int x){

        int i=x;
        while( i<=100){

            System.out.println(i);

            i++;

        }
    }


    //Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
    // pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
    // deoarece metoda afiseaza, nu returneaza.


    public void  numerWhileMinus( int x){

        int i=x;
        while( i>=-100){

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

    public void oneToAnother( int x,  int y ){

        int i=x;
        int j=y;

        while(i<=j){

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

    public void crescator( int x, int y){
        int i=x;
        int j=y;

        if (i<=j) {
            do {
                System.out.println(i);
                i++;
            } while (i <= j);
        }
        else {
            while (j <= i) {
                System.out.println(j);
                j++;
            }

        }
    }

  //  Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.//

    public void oneHundredWhile(){

       int i=1;
       while (i<=100){

           System.out.println(i);
           i++;
       }
    }
    //Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void onePair(){

        int i=0;
        while (i<=100){
            i++;
            double k= i%2;
            if ( k==0 ) {
            System.out.println(i);

        }
        }

    }
///// Creati o metoda care sa adune toate numerele din intervalul 111 si 8899.
//        // Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval.
//        // Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval
//        // . Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
//


    public void countWhile(){
        int x=111;
        long y=8899L;
        long sum=0L;
        int count=0;

     while (x<=y ) {
         sum=sum+x;
         x++;
         count++;
     }
        System.out.println(sum);

        System.out.println(sum/count);

    }

    //Creati o metoda care sa primeasca doi parametrii de tip numar,
    // si sa returneze media numerelor divizibile cu 7, din acel interval.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public double avrgWhile( int x, int y) {

        double sum = 0.0;
        int count = 0;
        double avrg;

       do {

            if (x % 7 == 0) {
                sum = sum + x;
                count++;
                x++;
            } else x++;

        } while ( x<=y);

        avrg = sum / count;
        return avrg;

    }

//Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.

public void  fibo() {
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

          int i=0;
     while(i<=110){

       if (i%11==0){    //nu inteleg de ce scrie cate 9 pe linie :)) //
           System.out.println(" ");
       }
         if (i%3==0 && i%5==0 && i%7==0 ) {
             System.out.print("CozaLozaWoza ");
         }else if (i%3==0 && i%5==0 ) {
             System.out.print("CozaLoza");
         } else if (i%3==0 && i%7==0 ){
             System.out.print("CozaWoza");
         } else if (i%5==0 && i%7==0 ){
             System.out.print("LozaWoza");
         } else if (i%3==0){
             System.out.print("Coza");
         }else if (i%5==0){
             System.out.print("Loza");
         }else if (i%7==0){
             System.out.print("Woza");
         }else System.out.print(i + " ");

         i++;
    }

}



}
















