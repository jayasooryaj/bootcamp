package day7;

public class OpenClosed {

    public static void main(String arg[]){

    }

    public class VehicleInfo {
        public double vehicleNumber() {
            //functionality
        }
    }

    public class Car extends VehicleInfo {
        public double vehicleNumber() {
            return this.getValue();
        }
    }

    //can be extended for other vehicle without modifying the VechicleInfo class

    public class Truck extends VehicleInfo {
        public double vehicleNumber() {
            return this.getValue();
        }
    }
}