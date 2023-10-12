
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My Computer
 */
public class A implements Comparable{
    String name;
    int sal;

    public A() {
    }

    public A(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }
    public boolean equals(Object x){
        A y = (A) x;
        return (sal==y.sal);
    }
    public int compareTo(Object x){
        A y = (A) x;
        if (sal<y.sal) return(-1);
        else if (sal==y.sal) return(0);
        else return (1);
    }
    public String toString(){
        return (name + " " + sal);
    }
    class MySet extends TreeSet{
        public boolean isEmpty(){
            return (super.isEmpty());
        }
        void add(A x){
            super.add(x);
        }
        void addMany(String[]a,int[]p,int n){
            A x;
            for (int i=0;i<n;i++){
                x= new A(a[i],p[i]);
                add(x);
            }
        }
        void display(){
            System.out.println("The elements of the list: ");
            Iterator h = iterator();
            while (h.hasNext())
                System.out.println(h.next());
        }
    }
}
