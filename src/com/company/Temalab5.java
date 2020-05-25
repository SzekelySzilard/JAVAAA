package com.company;

public class Temalab5 {

    public static void main(String[] args) {
//In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii,
// valorile de la 1 la 100. Sa se afiseze progresul in consola pe tot parcursul.
// Apelati metoda in main() pentru a verifica daca functioneaza.


        logicalOperations op = new logicalOperations();

        int[] myarray = op.getarray();

        op.printarray(myarray);

        //   int[] parArray1=op.parArray();
        //  op.printarray(parArray1);

        op.avrgArray();

////Creati o metoda care sa primeasca un parametru de tip array de string-uri,
//    // populat cu valori, si un parametru de tip String. Metoda sa verifice daca valoarea string-ului primit
//    // se regaseste in array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false.
//    // Apelati metoda in main() pentru a verifica daca functioneaza.


        op.tf1();
        System.out.println(op.tf1());


        //Creati o metoda care sa primeasca un parametru de tip array de numere,
        // populat cu valori, si un parametru de tip numar.
        // Metoda sa verifice daca numarul primit se afla in array-ul primit, si daca da,
        // atunci sa returneze pozitia pe care se afla numarul.
        // Apelati metoda in main() pentru a verifica daca functioneaza.

      op.pozitie();
        System.out.println(op.pozitie());


        op.lini();

        op.faraNumar();

        op.mic2();
        op.doi();


    }

}
