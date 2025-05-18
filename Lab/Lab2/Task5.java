package Lab2;

class Time {
    public int hour;
    public int minute;
    public int second;

    // No-argument constructor (default time: 00:00:00)
    Time() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    // Parameterized constructor with validation
    Time(int h, int m, int s) {
        if (h >= 0 && h < 24) {
            hour = h;
        } else {
            hour = 0;
            System.out.println("Invalid hour value! Setting to 0.");
        }

        if (m >= 0 && m < 60) {
            minute = m;
        } else {
            minute = 0;
            System.out.println("Invalid minute value! Setting to 0.");
        }

        if (s >= 0 && s < 60) {
            second = s;
        } else {
            second = 0;
            System.out.println("Invalid second value! Setting to 0.");
        }
    }

    // Method to display time
    public void display() { //formating time to 2 integers 02 instead of 2
        System.out.printf("Time: %02d:%02d:%02d\n", hour, minute, second);
    }
}
// Runner class
public class Task5 {
    public static void main(String[] args) {
        Time t1 = new Time();  // default
        Time t2 = new Time(13, 45, 30);  // valid time
        Time t3 = new Time(25, 70, -10); // invalid time (checks will apply)

        t1.display();  // 00:00:00
        t2.display();  // 13:45:30
        t3.display();  // 00:00:00 (with error messages)
    }
}
