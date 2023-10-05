/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author My Computer
 */
import java.util.Scanner;
public class Vase extends Item{
    private int height;
    private String material;

    public Vase() {
        super();
    }
    
    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public void outputVase(){
        output();
        System.out.println("Height: "+height);
        System.out.println("Material: "+material);
    }
    public void inputVase(){
        input();
        Scanner input = new Scanner (System.in);
        do {
            try{
                System.out.println("Enter height: ");
                height = input.nextInt();input.nextLine();
                if (height<=0)throw new Exception();
            }catch (Exception e ){
                System.out.println("height must greater than 0");
            }
        }while (height<=0);
        
        do {
            try{
                System.out.println("Enter meterial: ");
                material = input.nextLine();
                if (material.isEmpty()) throw new Exception ();
            }catch (Exception e ){
                System.out.println("Material is empty");
            }
        }while (material.isEmpty());
    }
}
