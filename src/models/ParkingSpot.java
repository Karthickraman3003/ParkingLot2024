package models;

import models.enums.ParkingSpotStatus;
import models.enums.VehicleType;

public class ParkingSpot extends BaseModel{

    private VehicleType vehicleType;
    private Vehicle vehicle;
    private int number;
    private ParkingSpotStatus parkingSpotStatus;


    public ParkingSpot(VehicleType vehicleType, Vehicle vehicle, int number, ParkingSpotStatus parkingSpotStatus)
    {
        this.vehicleType=vehicleType;
        this.vehicle=vehicle;
        this.number=number;
        this.parkingSpotStatus=parkingSpotStatus;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }
}
