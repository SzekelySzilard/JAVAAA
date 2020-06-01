package com.company;


import java.util.ArrayList;
import java.util.List;

public class temaLab6 {

    public static void main(String[] args) {

       List<Integer> listLab= new ArrayList();
        listLab.add(1);
        listLab.add(8);
       listLab.add(3);
        listLab.add(4);


        logicalOperations op= new logicalOperations();

        op.prinlin(listLab);

        op.addToList(listLab, 6);
        System.out.println(listLab);

         op.fromNumber(listLab, 2);

         op.invers(listLab);

        System.out.println(" ");

        List<String> stList= new ArrayList();
        stList.add("i");
        stList.add("o");
        stList.add("u");
        stList.add("a");


        op.numberString(stList, 2, "i");
        System.out.println(stList);
      op.pePrima(listLab, 6);

        System.out.println(listLab);
         op.pozPlusValoare(listLab);

         op.celMaiMare(listLab);

    }



    }

