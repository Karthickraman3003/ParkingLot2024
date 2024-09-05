package repository;

import Exceptions.ParkingLotNotFoundException;
import models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRespository {

    private Map<Integer, ParkingLot> parkingLotMap;

    private static int idCounter=0;

    public ParkingLotRespository()
    {
        parkingLotMap=new HashMap<>();
    }

    public ParkingLot get(int parkingLotId)
    {
        ParkingLot parkingLot=parkingLotMap.get(parkingLotId);

        if (parkingLot==null)
        {
            throw  new ParkingLotNotFoundException("ParkingLot is not found for id: "+parkingLotId);
        }

        return parkingLot;
    }

    public void put(ParkingLot parkingLot)
    {   parkingLot.setId(++idCounter);
        parkingLotMap.put(parkingLot.getId(),parkingLot);
        System.out.println("Parking Lot has been added successfully");
    }
}
