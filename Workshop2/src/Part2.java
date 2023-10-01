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
    public static void main(String[] args){
        boolean cont = false;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Input the string: ");
                String s = input.nextLine();
                String pattern = "SExxx";
                if (  s.matches(pattern))
                    throw new Exception();
                System.out.println("The string is "+ s);
                cont = false;
            }
            catch (Exception e){
                System.out.println("The string is invalid");
                cont = true;
            }
        }while (cont);
    }
}
