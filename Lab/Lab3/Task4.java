package Lab3;
// Encapsulated class HotDogStand
class HotDogStand {

    // Private data members
    private int standID;
    private int hotDogsSold;

    // Constructor to initialize stand ID and hot dogs sold
    public HotDogStand(int id, int initialSold) {
        standID = id;
        hotDogsSold = initialSold;
    }

    // Method to increment the number of hot dogs sold
    public void justSold() {
        hotDogsSold++;
    }

    // Getter for stand ID
    public int getStandID() {
        return standID;
    }

    // Getter for hot dogs sold
    public int getHotDogsSold() {
        return hotDogsSold;
    }
}


    // Runner class to test HotDogStand
public class Task4 {

    public static void main(String[] args) {

        // Creating three hot dog stand objects
        HotDogStand stand1 = new HotDogStand(101, 5);
        HotDogStand stand2 = new HotDogStand(102, 3);
        HotDogStand stand3 = new HotDogStand(103, 7);

        // Simulating sales
        stand1.justSold();
        stand1.justSold();

        stand2.justSold();

        stand3.justSold();
        stand3.justSold();
        stand3.justSold();

        // Displaying sales for each stand
        System.out.println("Stand ID: " + stand1.getStandID() +
                           " | Hot Dogs Sold: " + stand1.getHotDogsSold());

        System.out.println("Stand ID: " + stand2.getStandID() +
                           " | Hot Dogs Sold: " + stand2.getHotDogsSold());

        System.out.println("Stand ID: " + stand3.getStandID() +
                           " | Hot Dogs Sold: " + stand3.getHotDogsSold());
    }
}
