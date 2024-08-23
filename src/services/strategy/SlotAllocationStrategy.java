package services.strategy;

import models.ParkingSpot;
import models.Vehicle;

public interface SlotAllocationStrategy {

    ParkingSpot getSpotForVehicle(Vehicle vehicle);
}
