package models;

import models.enums.VehicleType;

public class Vehicle extends BaseModel {


    private VehicleType vehicleType;
    private String vehicleNumber;
    private String color;


    public Vehicle() {
    }

    public Vehicle(VehicleType vehicleType, String vehicleNumber, String color) {

        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
        this.color = color;
    }


    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
