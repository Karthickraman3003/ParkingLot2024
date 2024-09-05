package services;

import models.*;
import models.enums.*;
import repository.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InitialisationService {

    private ParkingLotRespository parkingLotRespository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingSpotRepository parkingSpotRepository;
    private GateRepository gateRepository;
    private TicketRepository ticketRepository;

    public InitialisationService(ParkingLotRespository parkingLotRespository, ParkingFloorRepository parkingFloorRepository, ParkingSpotRepository parkingSpotRepository, GateRepository gateRepository) {
        this.parkingLotRespository = parkingLotRespository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingSpotRepository = parkingSpotRepository;
        this.gateRepository = gateRepository;
    }

    public ParkingLot init()
    {

        System.out.println("****Starting Initialisation****");
        ParkingLot parkingLot=new ParkingLot();
        parkingLot.setName("Munna Parking Center");
        parkingLot.setAddress("Navratan hatta Purnea");
        parkingLot.setCapacity(100);
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setVehicleTypeSupported(Arrays.asList(VehicleType.EV, VehicleType.LUXURY, VehicleType.FOUR_WHEEL, VehicleType.TWO_WHEEL));

        List<ParkingFloor> floors=new ArrayList<>();
        for(int i=0;i<=10;i++)
        {
                ParkingFloor parkingFloor=new ParkingFloor();
                parkingFloor.setId(i);
                parkingFloor.setFloorNumber(i);
                parkingFloor.setParkingFloorStatus(ParkingFloorStatus.AVAILABLE);

                List<ParkingSpot> spots=new ArrayList<>();

                for (int j=0;j<=10;j++)
                {
                    ParkingSpot parkingSpot=new ParkingSpot();
                    parkingSpot.setId(j);
                    parkingSpot.setNumber((i*100)+j);
                    parkingSpot.setParkingSpotStatus(ParkingSpotStatus.EMPTY);
                    parkingSpot.setVehicleType(VehicleType.FOUR_WHEEL);
                    spots.add(parkingSpot);
                    parkingSpotRepository.put(parkingSpot);
                }

                parkingFloor.setParkingSpots(spots);

                Gate entryGate=new Gate();
                entryGate.setId((i*1000)+1);
                entryGate.setGateNumber((i*1000)+1);
                entryGate.setGateStatus(GateStatus.OPEN);
                entryGate.setGateType(GateType.ENTRY);
                entryGate.setGateOperator("Operator: "+i+1);

                parkingFloor.setEntryGate(entryGate);
                gateRepository.put(entryGate);

                Gate exitGate=new Gate();
                exitGate.setId((i*1000)+1);
                exitGate.setGateNumber((i*1000)+1);
                exitGate.setGateStatus(GateStatus.OPEN);
                exitGate.setGateType(GateType.EXIT);
                exitGate.setGateOperator("Operator: "+i+2);

                parkingFloor.setExitGate(exitGate);
                gateRepository.put(exitGate);

                floors.add(parkingFloor);
                parkingFloorRepository.put(parkingFloor);

        }

        parkingLot.setFloors(floors);
        parkingLotRespository.put(parkingLot);

        return parkingLotRespository.get(1);



    }
}
