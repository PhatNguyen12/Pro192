/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author My Computer
 */
import java.util.Scanner;
public class Menu {
    public static int getChoice(Object[] options){
        for (int i = 0; i< options.length;i++){
            System.out.println((i+1)+"-"+options[i]);
        }
        System.out.println("Choose 1.."+ options.length+":");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }
}
