package com.bridgelabz.BasicProblems;

import java.util.Scanner;

public class Day1Problems {
    static byte byteVariable;
    static short shortVariable;
    static int intVariable;
    static long longVariable;
    static float floatVariable;
    static double doubleVariable;
    static boolean booleanVariable;
    static char charVariable;

    static void demoMethod(){
        System.out.println("-----------");
        System.out.println("byte default value " +byteVariable);
        System.out.println("short default value " +shortVariable);
        System.out.println("int default value " +intVariable);
        System.out.println("long default value " +longVariable);
        System.out.println("float default value " +floatVariable);
        System.out.println("double default value " +doubleVariable);
        System.out.println("boolean default value " +booleanVariable);
        System.out.println("char default value " +charVariable);
        System.out.println("-----------");
    }

    static int calculateSum(int x,int y,int z){
        int sum = x+y+z;
        return sum;
    }

    public static void main(String[] args) {
        //displaying the default values of primitive data type
        demoMethod();

        //welcome message
        System.out.println("Java Program");

        //string comparing
        String str1 = "java";
        String str2 = "java";

        if(str1 == str2){
            System.out.println("Both strings are same");
        }else{
            System.out.println("Strings are different");
        }

        //reading input from command-line
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1:");
        int num1 = sc.nextInt();
        System.out.print("Enter the number2:");
        int num2 = sc.nextInt();
        System.out.print("Enter the number3:");
        int num3 = sc.nextInt();

        //calculating sum of command-line inputs
        int sumResult = calculateSum(num1,num2,num3);
        System.out.println("RESULT = " + sumResult);

        //reading string value from command-line input
        System.out.print("Enter the name:");
        String name = sc.next();
        System.out.println("name is " +name);
    }
}
