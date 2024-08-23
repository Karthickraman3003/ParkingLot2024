package models;

import java.time.LocalDateTime;
import java.util.List;

public class Ticket extends BaseModel{

    private ParkingSpot parkingSpots;
    private LocalDateTime entryTime;
    private Vehicle vehicle;
    private Gate entryGate;


    public Ticket() {
    }

    public Ticket(ParkingSpot parkingSpots, LocalDateTime entryTime, Vehicle vehicle, Gate entryGate) {
        this.parkingSpots = parkingSpots;
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.entryGate = entryGate;
    }

    public ParkingSpot getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(ParkingSpot parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }
}
