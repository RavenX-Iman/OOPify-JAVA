package Lab_1;
public class Firstlab{
    public static int sum(int x, int y) {
        return x + y;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = sum(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }
}