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
public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWaterColour;
    private boolean isFramed;

    public Painting() {
    }

    public Painting(int height, int width, boolean isWaterColour, boolean isFramed, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWaterColour = isWaterColour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWaterColour() {
        return isWaterColour;
    }

    public void setIsWaterColour(boolean isWaterColour) {
        this.isWaterColour = isWaterColour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    public void outputPainting(){
        output();
        System.out.println("Height: "+height);
        System.out.println("Width: "+width);
        System.out.println("IsWatercolour: " + isWaterColour);
        System.out.println("IsFramed: " + isFramed);
    }
    public void inputPainting(){
        Scanner input = new Scanner(System.in);
        input();
        do {
            try {
                System.out.println("Enter height: ");
                height = input.nextInt();input.nextLine();
                if (height<=0) throw new Exception();
            }catch (Exception e ){
                System.out.println("Height must greater than 0");
            }
        }while (height <=0);
        do {
            try {
                System.out.println("Enter height: ");
                width = input.nextInt();input.nextLine();
                if (width<=0) throw new Exception();
            }catch (Exception e ){
                System.out.println("Width must greater than 0");
            }
        }while (width <=0);
        boolean count = true;
        do {
            try{
                System.out.println("Enter Water colour: ");
                isWaterColour = input.nextBoolean();input.nextLine();
                if (isWaterColour != true ||
                    isWaterColour != false) throw new Exception();
                count= false;
            }catch(Exception e ){
                System.out.println("Water colour must be true or false");
                count = true;
            }
        }while(count);
        do {
            try{
                System.out.println("Enter Frame: ");
                isFramed = input.nextBoolean();
                if (isFramed != false ||
                    isFramed != true) throw new Exception();
                count= false;
            }catch(Exception e ){
                System.out.println("Frame must be true or false");
                count = true;
            }
        }while(count);
        }
}
   

