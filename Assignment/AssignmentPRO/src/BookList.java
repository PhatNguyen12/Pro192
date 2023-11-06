
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My Computer
 */
public class BookList {
    List<Book> t;
    public BookList(){
        t = new ArrayList<>();
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        String code;
        while (true){
            System.out.print("Enter code (=0 exit): ");
            code = sc.nextLine().trim();
            if (code.equals("0")) {
                break;
            }
            System.out.print("Enter title: ");
            String title = sc.nextLine().trim();
            
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            
            System.out.print("Enter price: ");
            double price = sc.nextDouble();sc.nextLine();
            
            Book book = new Book (code,title,quantity,price);
            t.add(book);
        }
    }
    public void display(){
        if (t.isEmpty()){
            System.out.println("The list is empty");
        }
        else{
            for (Book book : t){
                System.out.println(book.toString());
            }
        }
    }
    public int search(String code){
        for (int i = 0 ; i<t.size();i++){
            if (t.get(i).getCode().equals(code)){
                return 1;
            }
        }
        return -1;
    }
    public void update(String code, double newPrice){
        boolean bookFound = false;
        for (Book book : t){
            if(book.getCode().equals(code)){
                book.setPrice(newPrice);
                bookFound = true;
                break;
            }
        }
        if (!bookFound) {
            System.out.println("Book with code " + code + " not found. Price update failed.");
        }
    }
    
    public int max(){
        
        double maxPrice = t.get(0).getPrice();
        int maxIndex = 0;

        for (int i = 1; i < t.size(); i++) {
        if (t.get(i).getPrice() > maxPrice) {
            maxPrice = t.get(i).getPrice();
            maxIndex = i;
        }
    }

    return maxIndex;
    }
    boolean isEmpty() {
        if (t.isEmpty()) {
        System.out.println("The List is empty.");
        
    }
        return true;
    }
    public void sortByCode(){
        Collections.sort(t, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book1.getCode().compareTo(book2.getCode());
            }
        });
    }
    public void remove(String code){
        int index = -1;
        for (int i = 0; i < t.size(); i++) {
        if (t.get(i).getCode().equals(code)) {
            index = i;
            break;
        }
    }

        if (index != -1) {
        t.remove(index);
        System.out.println("Book with code " + code + " removed successfully.");
    }   else {
        System.out.println("Book with code " + code + " not found.");
    }
    }
    void loadFile(String fname){
        try (BufferedReader br = new BufferedReader(new FileReader(fname))) {
            String line;
            t.clear(); // clear du lieu truoc khi tai vao file
            while ((line = br.readLine()) != null) {
                String[] bookData = line.split(", ");
                if (bookData.length == 4) {
                    String code = bookData[0];
                    String title = bookData[1];
                    int quantity = Integer.parseInt(bookData[2]);
                    double price = Double.parseDouble(bookData[3]);
                    Book book = new Book(code, title, quantity, price);
                    t.add(book);
                } else {
                    System.out.println("Invalid data format in the file: " + line);
                }
            }
            System.out.println("Data loaded successfully from the file.");
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
    }

