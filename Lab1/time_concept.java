package Lab1;

class Time {
    // Data Members
    private int hours;
    private int minutes;
    private int seconds;

    // Setter Method to set time
    public void setTime(int h, int m, int s) {
    if (h >= 0 && h < 24) {
        this.hours = h;
    }else{ 
        System.out.println("Invalid Hours!");
    }

    if (m >= 0 && m < 60){
         this.minutes = m;
    }else{
        System.out.println("Invalid Minutes!");
    }

    if (s >= 0 && s < 60) {
        this.seconds = s;
    }else{ System.out.println("Invalid Seconds!");
    }
}

    // Getter Methods
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    // Display Time in 24-hour format
    public void displayTime24Hr() {
        System.out.printf("Time (24-Hour Format): %02d:%02d:%02d\n", hours, minutes, seconds);
    }

    // Display Time in 12-hour format
    public void displayTime12Hr() {
        String period = (hours >= 12) ? "PM" : "AM";
        int displayHour = (hours % 12 == 0) ? 12 : hours % 12;
        System.out.printf("Time (12-Hour Format): %02d:%02d:%02d %s\n", displayHour, minutes, seconds, period);
    }

    //methods of time-class: incrementTime, decrementTime, isMidnight, isNoon, compareTime
    // Increment Time by 1 second
    public void incrementTime() {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hours = (hours + 1) % 24;
            }
        }
    }

    // Decrement Time by 1 second
    public void decrementTime() {
        seconds--;
        if (seconds < 0) {
            seconds = 59;
            minutes--;
            if (minutes < 0) {
                minutes = 59;
                hours = (hours == 0) ? 23 : hours - 1;
            }
        }
    }

    // Check if Time is Midnight (00:00:00)
    public boolean isMidnight() {
        return hours == 0 && minutes == 0 && seconds == 0;
    }

    // Check if Time is Noon (12:00:00)
    public boolean isNoon() {
        return hours == 12 && minutes == 0 && seconds == 0;
    }

    // Compare Two Time Objects
    public String compareTime(Time t2) {
        if (this.hours == t2.hours && this.minutes == t2.minutes && this.seconds == t2.seconds) {
            return "Times are equal.";
        } else if (this.hours < t2.hours || 
                  (this.hours == t2.hours && this.minutes < t2.minutes) ||
                  (this.hours == t2.hours && this.minutes == t2.minutes && this.seconds < t2.seconds)) {
            return "First time is earlier.";
        } else {
            return "First time is later.";
        }
    }
}

// Main Class
public class time_concept {
    public static void main(String[] args) {
        // Creating Time Object
        Time time1 = new Time();
        time1.setTime(23, 59, 59);

        // Display Time in Different Formats
        time1.displayTime24Hr();
        time1.displayTime12Hr();

        // Increment Time and Show Updated Time
        time1.incrementTime();
        time1.displayTime24Hr();

        // Checking Special Cases
        System.out.println("Is it Midnight? " + time1.isMidnight());
        System.out.println("Is it Noon? " + time1.isNoon());

        // Comparing Two Time Objects
        Time time2 = new Time();
        time2.setTime(12, 0, 0);
        System.out.println(time1.compareTime(time2));
    }
}
