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

public class Part3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] list = new String[10];
        
        // Input student names
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            list[i] = input.nextLine();
        }
        
        // Convert and print student names in uppercase
        System.out.println("Uppercase student names:");
        for (String name : list) {
            String uppercaseName = name.toUpperCase();
            System.out.println(uppercaseName);
        }
    }
}


