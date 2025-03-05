package theory;

public class Date {
    //attributes of date
    private int day;
    private String month;
    private int year;

    //no-argument constuctor
    //for default values
    Date(){
        day=0;
        month=null;
        year=0;
    }
    //parameterized constructor
    Date(int d, String m, int y){
        day=d;
        month=m;
        year=y;
    }
    //method to display date
    public void displayDate(){
        System.out.println("Date is:"+ day+" "+month+" "+year);
    }

    public static void main(String[] args) {
        //1st object feb of Date class
        Date feb = new Date(14,"Feb",2022);
        feb.displayDate();//displays dat passed in feb object 

        //2nd object march of date class
        Date march = new Date();
        march.displayDate(); //displays default date(null and 0)

        //setting values of march object
        march.day=12;
        march.month="March";
        march.year=2022;
        march.displayDate();//displays the new values set in march object
    }

}
