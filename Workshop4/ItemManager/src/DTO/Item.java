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
public class Item {
    protected int value;
    protected String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    public void output(){
        System.out.println("Value: "+ value);
        System.out.println("Creator: "+creator);
    }
    public void input(){
        Scanner input = new Scanner(System.in);
        do {
            try{
                System.out.println("Enter value: ");
                value = input.nextInt();input.nextLine();
                if (value<=0)throw new Exception();
            }catch (Exception e ){
            System.out.println("Creator must greater than 0");
        }
        }while (value<=0);
        do {
            try {
                System.out.println("Enter creator: ");
                creator = input.nextLine();
                if (creator.isEmpty()) throw new Exception();
            }catch (Exception e){
                System.out.println("Creator is empty");
            }
        }while(creator.isEmpty());
    }
}
