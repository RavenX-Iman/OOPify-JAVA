package theory;

public class Cellphone {
    private String model;
    private int price;
    private int ram;

    // Default constructor
    Cellphone() {
        model = null;
        price = 0;
        ram = 0;
    }

    // Parameterized constructor
    Cellphone(String model, int price, int ram) {
        this.model = model;
        this.price = price;
        this.ram = ram;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter for price
    public int getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(int price) {
        this.price = price;
    }

    // Getter for ram
    public int getRam() {
        return ram;
    }

    // Setter for ram
    public void setRam(int ram) {
        this.ram = ram;
    }

    // Method to display cellphone details
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("RAM: " + ram + "GB");
    }

    // Method to check if the cellphone is affordable
    public boolean isAffordable(int budget) {
        return price <= budget;
    }

    // Method to compare RAM with another cellphone
    public boolean hasMoreRam(Cellphone other) { //other is another object of cellphone (object passed as parameter)
        return this.ram > other.ram; //other is a temporary object made only in this method
    }
public static void main(String[] args) {
    Cellphone samsung = new Cellphone("Samsung Galaxy S21", 799, 8);//samsung object

    Cellphone iphone = new Cellphone("iPhone 13", 999, 6);//iphone object

    samsung.displayDetails();
    System.out.println();
    iphone.displayDetails();

    System.out.println("\nIs Samsung affordable under $850? " + samsung.isAffordable(850));
    System.out.println("Does Samsung have more RAM than iPhone? " + samsung.hasMoreRam(iphone));

    
    samsung.setPrice(750); // Update Samsung's price
    iphone.setRam(8); // Update iPhone's RAM

    System.out.println("Updated Samsung Price: $" + samsung.getPrice());//display updated price
    System.out.println("Updated iPhone RAM: " + iphone.getRam() + "GB");//display updated ram



    }
}