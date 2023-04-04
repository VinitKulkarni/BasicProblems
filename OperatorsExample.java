package com.bridgelabz.BasicProblems;

public class OperatorsExample {
    static void maxCheck(int result1, int result2, int result3, int result4){
        if (result1 > result2 && result1 > result3 && result1 > result4){
            System.out.println("result1 is largest");
        }else if(result2 > result3 && result2 > result4){
            System.out.println("result2 is largest");
        } else if (result3 > result4) {
            System.out.println("result3 is largest");
        }else{
            System.out.println("result4 is largest");
        }
    }

    static void minCheck(int result1, int result2, int result3, int result4){
        if (result1 < result2 && result1 < result3 && result1 < result4){
            System.out.println("result1 is smallest");
        }else if(result2 < result3 && result2 < result4){
            System.out.println("result2 is smallest");
        } else if (result3 < result4) {
            System.out.println("result3 is smallest");
        }else{
            System.out.println("result4 is smallest");
        }
    }


    public static void main(String[] args) {
//        1. Enter two numbers and do the following arithmetic Operations find max and min.
//        i) a+b*c ii) c+a/b
//        iii) a%b+c iV) a*b+c

        int a = 10;
        int b = 5;
        int c = 5;

        int result1 = a+b*c;
        System.out.println("a+b*c = " + result1);

        int result2 = c+a/b;
        System.out.println("c+a/b = " + result2);

        int result3 = a%b+c;
        System.out.println("a%b+c = " + result3);

        int result4 = a*b+c;
        System.out.println("a*b+c = " + result4);

        System.out.println();
        
        //Finding min and max
        maxCheck(result1,result2,result3,result4);
        minCheck(result1,result2,result3,result4);
    }
}
