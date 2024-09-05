package models;

import models.enums.ParkingFloorStatus;

import java.util.List;

public class ParkingFloor extends BaseModel{

    private List<ParkingSpot> parkingSpots;
    private Gate entryGate;
    private Gate exitGate;
    private int floorNumber;
    private ParkingFloorStatus parkingFloorStatus;


    public ParkingFloor() {
    }

    public ParkingFloor(List<ParkingSpot> parkingSpots, Gate entryGate, Gate exitGate, int floorNumber, ParkingFloorStatus parkingFloorStatus) {
        this.parkingSpots = parkingSpots;
        this.entryGate = entryGate;
        this.exitGate = exitGate;
        this.floorNumber = floorNumber;
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

}
