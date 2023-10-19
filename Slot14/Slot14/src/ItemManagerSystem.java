/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My Computer
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Item {
    private String code;
    private String name;
    private double price;

    public Item(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Price: " + price;
    }
}

public class ItemManagerSystem {
    private static ArrayList<Item> items = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static final String FILE_NAME = "items.txt";

    public static void main(String[] args) {
        loadItemsFromFile();

        while (true) {
            System.out.println("Item Management System Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Update Item");
            System.out.println("3. Delete Item");
            System.out.println("4. Save Items to File");
            System.out.println("5. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    updateItem();
                    break;
                case 3:
                    deleteItem();
                    break;
                case 4:
                    saveItemsToFile();
                    break;
                case 5:
                    saveItemsToFile();
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void loadItemsFromFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            String code = null;
            String name = null;
            double price = 0.0;

            String line;
            while ((line = reader.readLine()) != null) {
                if (code == null) {
                    code = line;
                } else if (name == null) {
                    name = line;
                } else {
                    price = Double.parseDouble(line);
                    items.add(new Item(code, name, price));
                    code = null;
                    name = null;
                }
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error loading items from file: " + e.getMessage());
        }
    }

    private static void addItem() {
        System.out.print("Enter item code: ");
        String code = scanner.nextLine();
        
        if (isCodeUnique(code)) {
            System.out.print("Enter item name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter item price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            
            Item newItem = new Item(code, name, price);
            items.add(newItem);
            System.out.println("Item added successfully.");
        } else {
            System.out.println("Item code already exists. Please enter a unique code.");
        }
    }

    private static boolean isCodeUnique(String code) {
        for (Item item : items) {
            if (item.getCode().equalsIgnoreCase(code)) {
                return false;
            }
        }
        return true;
    }

    private static void updateItem() {
        System.out.print("Enter the item code to update: ");
        String code = scanner.nextLine();

        for (Item item : items) {
            if (item.getCode().equalsIgnoreCase(code)) {
                System.out.print("Enter the new price: ");
                double newPrice = scanner.nextDouble();
                scanner.nextLine();
                item.setPrice(newPrice);
                System.out.println("Item updated successfully.");
                return;
            }
        }

        System.out.println("Item with code " + code + " not found.");
    }

    private static void deleteItem() {
        System.out.print("Enter the item code to delete: ");
        String code = scanner.nextLine();

        for (Item item : items) {
            if (item.getCode().equalsIgnoreCase(code)) {
                items.remove(item);
                System.out.println("Item deleted successfully.");
                return;
            }
        }

        System.out.println("Item with code " + code + " not found.");
    }

    private static void saveItemsToFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true));
            for (Item item : items) {
                writer.write(item.getCode());
                writer.newLine();
                writer.write(item.getName());
                writer.newLine();
                writer.write(String.valueOf(item.getPrice()));
                writer.newLine();
            }
            writer.close();
            System.out.println("Items saved to file successfully.");
        } catch (IOException e) {
            System.out.println("Error saving items to file: " + e.getMessage());
        }
    }
}