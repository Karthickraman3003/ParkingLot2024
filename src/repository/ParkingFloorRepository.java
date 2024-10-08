package repository;

import Exceptions.ParkingFloorNotFoundException;
import models.ParkingFloor;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepository {

    private Map<Integer, ParkingFloor> parkingFloorMap;

    public ParkingFloorRepository()
    {
        parkingFloorMap=new HashMap<>();
    }

    public ParkingFloor get(int parkingFloorId)
    {
        ParkingFloor parkingFloor=parkingFloorMap.get(parkingFloorId);

        if (parkingFloor==null)
        {
            throw new ParkingFloorNotFoundException("Parking Floor Not Found for id: "+parkingFloorId);
        }
        return parkingFloor;
    }

    public void put(ParkingFloor parkingFloor)
    {
        parkingFloorMap.put(parkingFloor.getId(),parkingFloor);
        System.out.println("Parking Floor has been added successfully");
    }

}
