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
public class Statue extends Item{
    private int weight;
    private String colour;

    public Statue() {
        super ();
    }

    public Statue(int weight, String colour, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public void outputStatue(){
        output();
        System.out.println("Weight: "+weight);
        System.out.println("Colour: "+colour);
    }
    public void inputStatue(){
        input();
        Scanner input = new Scanner(System.in);
        do {
            try{
                System.out.println("Enter weight: ");
                weight = input.nextInt();input.nextLine();
                if (weight<=0) throw new Exception();
            }catch (Exception e ){
                System.out.println("Weight must greater than 0");
            }
        }while (weight<=0);
        do {
            try {
                System.out.println("Enter colour: ");
                colour = input.nextLine();
                if (colour.isEmpty())throw new Exception();
            }catch(Exception e ){
                System.out.println("Color is empty");
            }
        }while (colour.isEmpty());
    }
}
