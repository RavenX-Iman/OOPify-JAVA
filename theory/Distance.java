package theory;
public class Distance{
    private double x;
    private double y;

    Distance(){
        x=0;
        y=0;
    }
    Distance(int x,int y){
        this.x=x;
        this.y=y;
    }
    void calculation(Distance p2){
        System.out.println("Distance: ");
        // double r1=p2.x - this.x;
        // double r2=p2.y - this.y;
        // double result = Math.sqrt((r2*r2) + (r1*r1));
        double r1=(p2.x - this.x)*(p2.x - this.x);
        double r2=(p2.y - this.y)*(p2.y - this.y);
        double result = Math.sqrt(r2 + r1);
        System.out.println(result);
    }

    public static void main(String[] args) {
        Distance p1 = new Distance(2,4);
        Distance p2 = new Distance(4,5);
        p1.calculation(p2);
       
    
    }
}

