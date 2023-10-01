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
public class testBottle {
     public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String xMaker;
        int xVolume, xVolume2, tc;
        xVolume2 = 0;

        System.out.println();
        System.out.print("Enter maker: ");
        xMaker = sc.nextLine();
        System.out.print("Enter volume: ");
        xVolume = sc.nextInt();
        sc.nextLine();

        System.out.println("1. Test getMaker()");
        System.out.println("2. Test setVolume()");

        System.out.print("Enter TC (1 or 2): ");
        tc = sc.nextInt();
        sc.nextLine();

        Bottle b = new Bottle(xMaker, xVolume);
        if (tc == 2) {
            System.out.print("Enter new Volume:");
            xVolume2 = sc.nextInt();
            sc.nextLine();
            b.setVolume(xVolume2);
        }
        System.out.println("output: ");
        switch (tc) {
            case 1:
                String maker = b.getMaker();
                System.out.printf("%s\r\n", maker);
                break;
            case 2:
                int volume = b.getVolume();
                System.out.printf("%d\r\n", volume);
                break;
            default:
                return;
        }
        System.out.println();
    }
}

