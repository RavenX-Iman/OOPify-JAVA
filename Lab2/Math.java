package Lab1;
import java.util.Scanner;
class Math {

    private int x;
    private int y;
    private char op;
    Math(){
        x=0;
        y=0;
    }
    public void setX(int a){
        x= a;
    }
    
    public void setY(int b){
        y=b;
    }
    public void setOP(char o){
        op=o;
    }
    
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for x:");
        x=sc.nextInt();
        System.out.println("Enter a value for y:");
        y=sc.nextInt();
        System.out.println("Enter an operator:");
        op=sc.next().charAt(0);
        sc.close();
    }
    void display(){
        if (op =='+') {
            System.out.println("x+y = "+(x+y));
        }else if(op == '-'){
            System.out.println("x-y = "+(x-y));
        } else if (op == '*') {
            System.out.println("x*y = "+(x*y));
        }
        else if (op == '/') {
            System.out.println("x/y = "+(x/y));
        }
        else {
            System.out.println("Invalid operator");   
        }

    }
    
}