package Lab2;

class Marks {
    public int a1;
    public int a2;
    public int a3;

    // No-argument constructor
    Marks() {
        a1 = 0;
        a2 = 0;
        a3 = 0;
    }

    // Parameterized constructor
    Marks(int a1, int a2, int a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    // Method to calculate sum using instance variables
    public int sumCalculate() {
        int sum = a1 + a2 + a3;
        return sum;
    }
}

public class Task4 {
    public static void main(String[] args) {
        Marks m1 = new Marks(4, 5, 3);
        int total = m1.sumCalculate();
        System.out.println("Sum of marks: " + total);
    }
}
