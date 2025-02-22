import java.util.ArrayList;
import java.util.Scanner;

class Medicine {
    private String name;
    private int quantity;
    private double price;

    public Medicine(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void updateQuantity(int quantitySold) {
        if (quantity >= quantitySold) {
            quantity -= quantitySold;
        } else {
            System.out.println("Insufficient stock!");
        }
    }

    @Override
    public String toString() {
        return "Medicine: " + name + ", Quantity: " + quantity + ", Price: $" + price;
    }
}

class Pharmacy {
    private ArrayList<Medicine> medicines;

    public Pharmacy() {
        this.medicines = new ArrayList<>();
    }

    public void addMedicine(String name, int quantity, double price) {
        Medicine medicine = new Medicine(name, quantity, price);
        medicines.add(medicine);
        System.out.println(name + " added to the inventory.");
    }

    public void displayMedicines() {
        System.out.println("\nMedicine Inventory:");
        for (Medicine medicine : medicines) {
            System.out.println(medicine);
        }
    }

    public void sellMedicine(String name, int quantitySold) {
        for (Medicine medicine : medicines) {
            if (medicine.getName().equalsIgnoreCase(name)) {
                medicine.updateQuantity(quantitySold);
                System.out.println("Sold " + quantitySold + " units of " + name + ".");
                return;
            }
        }
        System.out.println(name + " not found in the inventory.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pharmacy pharmacy = new Pharmacy();

        while (true) {
            System.out.println("\nPharmacy Management System Menu:");
            System.out.println("1. Add Medicine");
            System.out.println("2. Display Medicines");
            System.out.println("3. Sell Medicine");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter medicine name: ");
                    String name = scanner.next();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter price per unit: $");
                    double price = scanner.nextDouble();
                    pharmacy.addMedicine(name, quantity, price);
                    break;
                case 2:
                    pharmacy.displayMedicines();
                    break;
                case 3:
                    System.out.print("Enter medicine name to sell: ");
                    String medicineName = scanner.next();
                    System.out.print("Enter quantity to sell: ");
                    int quantitySold = scanner.nextInt();
                    pharmacy.sellMedicine(medicineName, quantitySold);
                    break;
                case 4:
                    System.out.println("Exiting Pharmacy Management System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
