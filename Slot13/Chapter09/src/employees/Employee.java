/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

import java.lang.Comparable;
public class Employee implements Comparable{
    private String code;
    private String name;
    private int salary;

    public Employee(String c, String n, int s) {
        this.code = c;
        this.name = n;
        this.salary = s;
    }
    // print details to the screen
    public void print(){
       
    }

    @Override
    public String toString() {
        return "Employee{" + "code=" + code + ", name=" + name + ", salary=" + salary + '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int comparareTo(Object emp){
        return this.getCode().compareTo(((Employee)emp).getCode());
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
