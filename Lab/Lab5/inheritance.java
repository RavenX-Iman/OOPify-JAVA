package Lab5;
class Parent {
    Parent(){
        System.out.println("parent");
    }
    Parent(String c){
        System.out.println("Parent! "+c);

    }
    public void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    Child(){
        System.out.println("Child");
    }
    Child(String c,String p){
        super(c);
        System.out.println("Child! "+c+" "+p);
    }
    public void display() {
        System.out.println("This is the child class.");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Parent parent = new Parent("Ali2");
        Child child = new Child("Ali","Sp24");

        parent.display();
        child.display();
    }
}