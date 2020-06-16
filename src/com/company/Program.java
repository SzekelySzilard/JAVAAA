package com.company;

import java.util.ArrayList;
import java.util.List;

public class Program {

    private Read read=new Read();
      private Calculator calc=new Calculator();
      private logicalOperations op= new logicalOperations();


    public void startProgram(){
        boolean repeatProgram;
           do {
               repeatProgram = executeProgram();
           }while(repeatProgram);
       }

        private boolean executeProgram() {

            printMenu();
            int number = read.getInt();

            switch (number) {
                case 1:
                    doSum();
                    break;
                case 2:
                    doSub();
                    break;
                case 3:
                    doAdd();
                    break;
                case 4:
                    doDiv();
                    break;
                case 5:
                    biggestNumber();
                     break;
                case 6:
                    comperrisonTo3();
                    break;
                case 7:
                    even();
                    break;
                case 8:
                    eligible();
                    break;
                case 9:
                    positionFromArray();
                    break;
                case 10:
                    listFromNumber();
                    break;
                case 11:
                    biggestFromList();
                    break;






                case 0:
                    return false;
            }
            return true;
        }


    public void printMenu(){
        System.out.println(
                "Hello!\n"+
                        "Choose an option\n" +
                        "1.sum\n"+
                        "2.substraction\n" +
                        "3.add\n" +
                        "4.divide\n"+
                        "5.biggest number\n" +
                        "6.comparison to 3\n" +
                        "7.number even/not\n"+
                        "8.eligible to vote\n"+
                        "9.position from array\n"+
                        "10.list from number\n"+
                        "11.biggest from list\n"+
                        "0.Exit\n"
        );
    }

    private void doSum(){
        System.out.println("enter the two numbers");
        int first=read.getInt();
        int second=read.getInt();
        System.out.println("the result is: ");
        System.out.println(calc.sum(first, second));
    }

    private void doSub(){
        System.out.println("enter the two numbers");
        int first=read.getInt();
        int second=read.getInt();
        System.out.println("the result is: ");
        System.out.println(calc.sub(first, second));
    }
    private void doAdd(){
        System.out.println("enter the two numbers");
        int first=read.getInt();
        int second=read.getInt();
        System.out.println("the result is: ");
        System.out.println(calc.add(first, second));

    }
    private void doDiv(){
        System.out.println("enter the two numbers");
        int first=read.getInt();
        int second=read.getInt();
        System.out.println("the result is: ");
        System.out.println(calc.div(first, second));
    }

    private void biggestNumber(){
        System.out.println("enter the two numbers");
        int first=read.getInt();
        int second=read.getInt();
        System.out.println("the result is: ");
        System.out.println(op.biggerNumber(first, second));

    }

    private void comperrisonTo3(){
        System.out.println("enter the number");
        int first=read.getInt();
        System.out.println("the result is: ");
        System.out.println(op.pct7(first));

    }
private void even(){
    System.out.println("enter the number");
    int first=read.getInt();
    System.out.println("the result is: ");
    System.out.println(op.isNumberEven(first));

}
private void eligible(){
    System.out.println("enter the age");
    int first=read.getInt();
    System.out.println(op.isEligibleToVote(first));
}
private void positionFromArray(){
    System.out.println("enter the position from array");
    int first=read.getInt();
    System.out.println("the result is: ");
    System.out.println(op.pozitie(first));
}

private void listFromNumber(){
    System.out.println("enter the number");
    int first=read.getInt();
    System.out.println("the result is: ");
    op.fromNumber(op.szar(), first);
}
private void biggestFromList(){
    System.out.println("the result is: ");
    op.celMaiMare(op.szar());

}



    }

