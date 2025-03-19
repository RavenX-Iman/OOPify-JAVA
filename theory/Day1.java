package theory;
    class Circle{
        double radius;
        //we can also add these attributes but not necessary in this case 
        // double area;
        // double circf;

    
        //Constructors
        Circle(){
            radius = 1;
        }
    
        Circle(double newradius){
            radius= newradius;
        }
    
        //setfunction
        void setRadius(double newradius) {
            radius = newradius;
        }
        //get functions
        double getArea(){
            return (radius * radius * 3.14);
        }
    
        double getPerimeter(){
            return (radius * 2 * 3.14);
        }
    }
    
    public class Day1 {
        public static void main(String[]args){
            // object creation
            Circle c1 = new Circle();
            System.out.println("Area of the Circle of radius "+ c1.radius + "is" + c1.getArea());
    
            Circle c2 = new Circle();
            System.out.println("Area of the Circle of radius "+ c2.radius + "is" + c2.getArea());
    
            Circle c3 = new Circle();
            System.out.println("Area of the Circle of radius "+ c3.radius +"is" + c1.getPerimeter());
    
            c2.setRadius(100);
            System.out.println("Area of the Circle of radius " + c2.radius + "is" + c2.getArea());
    
        }
    }

