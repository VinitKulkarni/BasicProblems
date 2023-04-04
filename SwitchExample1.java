package com.bridgelabz.BasicProblems;

public class SwitchExample1 {
    public static void main(String[] args) {
        //1. Write a Program to Check Vowel or Consonant

        char characterValue = 'Z';
        switch(characterValue){
            case 'A':
                System.out.println(characterValue + " is vowel");
                break;
            case 'E':
                System.out.println(characterValue + " is vowel");
                break;
            case 'I':
                System.out.println(characterValue + " is vowel");
                break;
            case 'O':
                System.out.println(characterValue + " is vowel");
                break;
            case 'U':
                System.out.println(characterValue + " is vowel");
                break;
            default:
                System.out.println(characterValue + " is consonants");
                break;
        }
    }
}
