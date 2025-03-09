public class Travel {
    private int kilometers;
    private int hours;

    // Constructor with no parameters
    public Travel() {
        this.kilometers = 0;
        this.hours = 0;
    }

    // Function to input values
    public void get(int kilometers, int hours) {
        this.kilometers = kilometers;
        this.hours = hours;
    }

    // Function to display values
    public void show() {
        System.out.println("Kilometers: " + kilometers);
        System.out.println("Hours: " + hours);
    }

    // Function to add kilometers and hours of another Travel object
    public void add(Travel other) {
        this.kilometers += other.kilometers;
        this.hours += other.hours;
    }

    public static void main(String[] args) {
        Travel travel1 = new Travel();
        Travel travel2 = new Travel();

        travel1.get(100, 2);
        travel2.get(150, 3);

        //Adding parameters of travel2 to travel1 by callinf add method
        travel1.add(travel2);

        travel1.show(); // Should display Kilometers: 250, Hours: 5


        travel1.get(120, 5);
        travel2.get(200, 7);

        //Adding parameters of travel2 to travel1 by callinf add method
        travel1.add(travel2);

        travel1.show(); 
    }
}
