package com.company;

public class Main1 {
    public static void main(String[] args) {

        Calculator object=  new Calculator();
        int x =3;
        int y =4;

        int sum= object.sum(x, y);
        System.out.println("rez adunarii = " + sum);

        int sub=object.sub(x, y);
        System.out.println("rez scaderii = " + sub);

        int add=object.add(x, y);
        System.out.println("rez inmultirii = " + add);

        double div=object.div(x, y);
        System.out.println("rez impartirii="+ div);

        //--------------------------------------------//

        logicalOperations op= new logicalOperations();

        int biggest=op.biggerNumber(5,6);
        System.out.println( "the op number is " + biggest);

//----------------------------------------------------------------------//

        System.out.println(op.text());
//-------------------------------------------------------------//

        System.out.println(op.txt("FastTrackIT", 3));

//------------------------------------------------------------//

        System.out.println(op.Nr(8));

 // ----------------------------------------------------//
        String numar=op.pct7(4);


        System.out.println(numar);
//----------------------------------------------//

        op.caseNr(6);

//------------------------------//
        String parInpar=op.isNumberEven(4);
        System.out.println(parInpar);
//-----------------------------------//

        String vote=op.isEligibleToVote(18);
        System.out.println(vote);
//--------------------------//

        int big3=op.threeNumbers(2,5,8);
        System.out.println(big3);
    }








}
