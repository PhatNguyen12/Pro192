/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My Computer
 */
class Helper {
    static int Multiply (int a, int b){
        return a * b;
    }
}


public class Static {
    public static void main(String[] args){
        System.out.println(Helper.Multiply(3, 44));
    }
}
