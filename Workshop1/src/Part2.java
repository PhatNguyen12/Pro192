/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My Computer
 */
import java.util.Scanner;
public class Part2 {
    public static void main (String[] args ){
        Scanner input = new Scanner (System.in);
        String op;
        System.out.println("Enter the first number: ");
        float num1 = input.nextFloat();
        System.out.println("Enter the second number: ");
        float num2 = input.nextFloat(); 
        System.out.println("Enter the operator(+-*/): ");
        input = new Scanner(System.in);
        op = input.nextLine();
        if (op.equals("+")){
            System.out.println("The result of " + num1 + op + num2 + "=" + (num1+num2));
        }
        else if (op.equals("-")){
            System.out.println("The result of " + num1 + op + num2 + "=" + (num1-num2));
        }
        else if (op.equals("*")){
            System.out.println("The result of " + num1 + op + num2 + "=" + (num1*num2));
        }
        else if (op.equals("/")){
            if (num2 !=0){
            System.out.println("The result of " + num1 + op + num2 + "=" + (num1/num2));
            }else System.out.println("Can not divide by 0!");
        }
        else System.out.println("Invalid operator!");
    }
}
