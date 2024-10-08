package repository;

import Exceptions.ParkingSpotNotFoundExcpetion;
import models.ParkingLot;
import models.ParkingSpot;

import java.util.HashMap;
import java.util.Map;

public class ParkingSpotRepository {

    private Map<Integer, ParkingSpot> parkingSpotMap;

    public ParkingSpotRepository()
    {
        parkingSpotMap=new HashMap<>();
    }

    public ParkingSpot get(int parkingSpotId)
    {
        ParkingSpot parkingSpot=parkingSpotMap.get(parkingSpotId);

        if (parkingSpot==null)
        {
            throw  new ParkingSpotNotFoundExcpetion("Parkig Spot not found for id: "+parkingSpotId);
        }

        return parkingSpot;
    }

    public void put(ParkingSpot parkingSpot)
    {
        parkingSpotMap.put(parkingSpot.getId(), parkingSpot);
        System.out.println("Parking Spot has been added successfully");
    }
}
