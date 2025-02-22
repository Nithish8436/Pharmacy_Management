import java.util.ArrayList;
import java.util.List;

class Drug {
    private int id;
    private String name;
    private double price;

    public Drug(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class PharmacyManager {
    private List<Drug> drugInventory;

    public PharmacyManager() {
        this.drugInventory = new ArrayList<>();
    }

    public void addDrug(int id, String name, double price) {
        Drug newDrug = new Drug(id, name, price);
        drugInventory.add(newDrug);
        System.out.println("Drug added to inventory: " + newDrug.getName());
    }

    public void updateDrug(int id, String newName, double newPrice) {
        for (Drug drug : drugInventory) {
            if (drug.getId() == id) {
                drug.setName(newName);
                drug.setPrice(newPrice);
                System.out.println("Drug updated: " + drug.getName());
                return;
            }
        }
        System.out.println("Drug not found with ID: " + id);
    }

    public void displayInventory() {
        System.out.println("Drug Inventory:");
        for (Drug drug : drugInventory) {
            System.out.println("ID: " + drug.getId() + ", Name: " + drug.getName() + ", Price: $" + drug.getPrice());
        }
    }
}

public class PharmacyManagementSystem {
    public static void main(String[] args) {
        PharmacyManager pharmacyManager = new PharmacyManager();

        pharmacyManager.addDrug(1, "Paracetamol", 5.99);
        pharmacyManager.addDrug(2, "Aspirin", 3.99);

        pharmacyManager.displayInventory();

        pharmacyManager.updateDrug(1, "Acetaminophen", 6.99);

        pharmacyManager.displayInventory();
    }
}
