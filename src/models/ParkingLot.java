package models;

import models.enums.ParkingLotStatus;
import models.enums.VehicleType;
import services.strategy.BillCalculationStrategy;
import services.strategy.SlotAllocationStrategy;

import java.awt.*;
import java.util.List;

public class  ParkingLot extends BaseModel{

    private String address;
    private String name;
    private List<ParkingFloor> floors;
    private ParkingLotStatus parkingLotStatus;
    private List<VehicleType> vehicleTypeSupported;
    private int capacity;

    private BillCalculationStrategy billCalculationStrategy;
    private SlotAllocationStrategy slotAllocationStrategy;

    public ParkingLot()
    {

    }
    public ParkingLot(String address, String name, List<ParkingFloor> floors, ParkingLotStatus parkingLotStatus, List<VehicleType> vehicleTypeSupported, int capacity, BillCalculationStrategy billCalculationStrategy, SlotAllocationStrategy slotAllocationStrategy) {
        this.address = address;
        this.name = name;
        this.floors = floors;
        this.parkingLotStatus = parkingLotStatus;
        this.vehicleTypeSupported = vehicleTypeSupported;
        this.capacity = capacity;
        this.billCalculationStrategy = billCalculationStrategy;
        this.slotAllocationStrategy = slotAllocationStrategy;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<VehicleType> getVehicleTypeSupported() {
        return vehicleTypeSupported;
    }

    public void setVehicleTypeSupported(List<VehicleType> vehicleTypeSupported) {
        this.vehicleTypeSupported = vehicleTypeSupported;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public BillCalculationStrategy getBillCalculationStrategy() {
        return billCalculationStrategy;
    }

    public void setBillCalculationStrategy(BillCalculationStrategy billCalculationStrategy) {
        this.billCalculationStrategy = billCalculationStrategy;
    }

    public SlotAllocationStrategy getSlotAllocationStrategy() {
        return slotAllocationStrategy;
    }

    public void setSlotAllocationStrategy(SlotAllocationStrategy slotAllocationStrategy) {
        this.slotAllocationStrategy = slotAllocationStrategy;
    }
}
