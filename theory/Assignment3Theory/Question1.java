package theory.Assignment3Theory;
import java.util.ArrayList;
interface SmartDevice{
    //abstract methods / prototypes
    String turnOn();
    String turnOff();
    String getStatus();

    String deviceInfo();
}
//implementing the interface smartdevice
class SmartLight implements SmartDevice{
    // to maintain the state of smartlight on or off
        private boolean isOn = false;
    //method overriding from methods of Smartdrvice class
        @Override
    public String turnOn() {
        isOn = true;
        return "Smart Light is now ON";
    }
        @Override
    public String turnOff() {
        isOn = false;
        return "Smart Light is now OFF";
    }
    @Override
    public String deviceInfo() {
        return "Smart Light";
    }
    @Override
    public String getStatus() {
        return isOn ? "ON" : "OFF";
    }
}

class SmartThermostat implements SmartDevice {
    private boolean isOn = false;

    @Override
    public String turnOn() {
        isOn = true;
        return "Smart Thermostat is now ON - Adjusting temperature";
    }

    @Override
    public String turnOff() {
        isOn = false;
        return "Smart Thermostat is now OFF";
    }

    @Override
    public String getStatus() {
        return isOn ? "ON" : "OFF";
    }

    @Override
    public String deviceInfo() {
        return "Smart Thermostat";
    }
}

class SmartDoorLock implements SmartDevice {
    private boolean isLocked = false;

    @Override
    public String turnOn() {
        isLocked = true;
        return "Smart Door Lock is now LOCKED";
    }

    @Override
    public String turnOff() {
        isLocked = false;
        return "Smart Door Lock is now UNLOCKED";
    }

    @Override
    public String getStatus() {
        return isLocked ? "LOCKED" : "UNLOCKED";
    }

    @Override
    public String deviceInfo() {
        return "Smart Door Lock";
    }
}

//main runner class
public class Question1 {
    public static void main(String[] args) {
        //use arraylist to get data for  10+ devices 
        //arraylist of type Smart devices named devices 
        //this will show polymorphisim
        ArrayList<SmartDevice> devices = new ArrayList<>();
        
        //.add() is adding values to the arraylist made
        devices.add(new SmartLight());
        devices.add(new SmartThermostat());
        devices.add(new SmartDoorLock());

        //polymorphisim only interface matters(as long as the device being added is smartdevice)
        for (SmartDevice device : devices) {
            System.out.println("Device: " + device.deviceInfo());
            System.out.println(device.turnOn());
            System.out.println("Status: " + device.getStatus());
            System.out.println(device.turnOff());
            System.out.println("Status: " + device.getStatus());
        }
    }
}


