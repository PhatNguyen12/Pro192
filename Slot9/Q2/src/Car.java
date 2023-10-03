/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My Computer
 */
public class Car {
    String maker;
    int price;

    public Car() {
    }

    public Car(String maker, int price) {
        this.maker = maker;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public int getPrice() {
        return price;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    

    @Override
    public String toString() {
        return "Car{" + "maker=" + maker + ", price=" + price + '}';
    }
    
}
