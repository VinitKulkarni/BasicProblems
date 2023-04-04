package com.bridgelabz.BasicProblems;

public class IfExample2 {
    public static void main(String[] args) {
        //2. Read a Number 1,10,100,1000 and display unit, ten hundred

        int number = 1991;
        if(number < 10){
            System.out.println("unit");
        }
        else if (number < 99){
            System.out.println("Ten");
        }
        else if (number < 999){
            System.out.println("Hundreds");
        }
        else if (number < 9999){
            System.out.println("Thousands");
        }
        else if (number < 99999){
            System.out.println("Ten Thousands");
        }
        else if (number < 999999){
            System.out.println("Hundred Thousands");
        }
        else {
            System.out.println("You are exceed the limit [Hundred Thousands]");
        }
    }
}
