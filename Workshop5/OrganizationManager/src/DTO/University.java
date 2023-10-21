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
public class University extends Organization{
    protected String name;

    public University() {
        super();
    }

    public University(String name, int size) {
        super(size);
        this.name = name;
    }

    
    
    @Override
    public void communicateByTool(){
        System.out.println("In the university, people communicate by voice");
    }
    
    public void enroll(){
        System.out.println("The registration for enrollment is only valid when the University has received all enrollment documents and enrollment fees");
    }
    public void educate(){
        System.out.println("Provide education at university standard");
    }
    @Override
    public String toString() {
        return "Encourage the advancement and development of knowledge" ;
    }
    
}
