
interface ParkingCharge {
    double calculateCharge();
    void displayParkingDetails();
}

class Vehicle {
    String vehicleNumber;
    String vehicleType;
    int parkingHours;

    Vehicle(String vehicleNumber, String vehicleType, int parkingHours) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.parkingHours = parkingHours;
    }
}

class TwoWheeler extends Vehicle implements ParkingCharge {
    TwoWheeler(String number, int hours) {
        super(number, "2 Wheeler", hours);
    }

    public double calculateCharge() {
        if (parkingHours <= 2)
            return parkingHours * 20;
        return 2 * 20 + (parkingHours - 2) * 10;
    }

    public void displayParkingDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type : " + vehicleType);
        System.out.println("Parking Hours : " + parkingHours);
        System.out.println("Total Charge : Rs. " + calculateCharge());
        System.out.println("-----------------------------");
    }
}

class FourWheeler extends Vehicle implements ParkingCharge {
    FourWheeler(String number, int hours) {
        super(number, "4 Wheeler", hours);
    }

    public double calculateCharge() {
        if (parkingHours <= 2)
            return parkingHours * 50;
        return 2 * 50 + (parkingHours - 2) * 30;
    }

    public void displayParkingDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type : " + vehicleType);
        System.out.println("Parking Hours : " + parkingHours);
        System.out.println("Total Charge : Rs. " + calculateCharge());
        System.out.println("-----------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        ParkingCharge p;

        p = new TwoWheeler("TN01AB1234", 5);
        p.displayParkingDetails();

        p = new FourWheeler("TN02CD5678", 4);
        p.displayParkingDetails();
    }
}