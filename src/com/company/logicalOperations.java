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

    public void  caseNr(int x){
        switch(x) {
            case 1 :
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
                break ;
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
            case 9 :
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

       public String  isNumberEven(int x ){
       double y = x%2 ;
        if (y==0 ) {
            return "true" ;

        }else {
            return "false" ;
        }

        }

        // Creati o metoda care sa se numeasca isEligibleToVote.
    // Metoda sa primeasca ca si parametru un numar, care sa reprezinte varsta,
    // iar metoda sa iti zica daca daca persoana are drept de vot.
    // Daca varsta e peste 18, sa se returneze true iar daca nu, sa returneze false.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public String isEligibleToVote(int x) {
        if (x<18) {
            return "false";
        } else {
            return "true";
        }
        }

      // . Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public int threeNumbers( int a, int b, int c) {

        logicalOperations op= new logicalOperations();

        int biggest=op.biggerNumber(a, b);

        int biggest1=op.biggerNumber(biggest,c);

        return biggest1;

        // e bine daca am facut asa? //





    }



    }









