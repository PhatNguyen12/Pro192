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
public class testBrick {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int color, price;
        String place;

        System.out.print("Enter place: ");
        place = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextInt();
        System.out.print("Enter color: ");
        color = sc.nextInt();

        SpecBrick specBrick = new SpecBrick(color, place, price);
        specBrick.setData();
        int value = specBrick.getValue();

        System.out.println("Brick Details: " + specBrick);
        System.out.println("Brick Value: " + value);
    }
}

