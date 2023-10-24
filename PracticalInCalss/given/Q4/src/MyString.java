/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *f1: Count and return number of prime digits in str.
 f2: Reverse order of all words in str (word = a string without space).
 * @author My Computer
 */

public class MyString implements IString {
    
    private boolean IsPrimeDigit(int digit){
        if(digit<2){
            return false;
        }
        for (int i =2;i<=Math.sqrt(digit);i++){
            if(digit % i == 0){
                return false;
            }
        }
        return true;
    }
    @Override
    public int f1(String str){
       int count = 0;
       for (char c : str.toCharArray()){
           if (IsPrimeDigit(c - '0')){
               count++;
           }
       }
       return count;
    }
    @Override
    public String f2(String str){
       String[] words = str.split(" ");
       StringBuilder reversedStr = new StringBuilder();
       for (int i = words.length - 1; i>= 0; i--){
           reversedStr.append(words[i]);
           if (i > 0){
               reversedStr.append(" ");
           }
       }
       return reversedStr.toString();
    }
}
