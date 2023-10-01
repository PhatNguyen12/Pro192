/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My Computer
 */

 abstract class Car {
    public abstract void stop();
}
  

 class Honda extends Car {
    
     @Override public void stop()
    {
        System.out.println("Honda::Stop");
        System.out.println(
            "Mechanism to stop the car using break");
    }
}
  
public class Main {
    public static void main(String args[])
    {
        Car obj
            = new Honda(); 
        obj.stop(); 
    }
}
  
