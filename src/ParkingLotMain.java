import controllers.InitController;
import models.ParkingLot;
import repository.GateRepository;
import repository.ParkingFloorRepository;
import repository.ParkingLotRespository;
import repository.ParkingSpotRepository;
import services.InitialisationService;

public class ParkingLotMain {
    public static void main(String[] args) {

        ParkingLotRespository parkingLotRespository=new ParkingLotRespository();
        ParkingFloorRepository parkingFloorRepository=new ParkingFloorRepository();
        ParkingSpotRepository parkingSpotRepository=new ParkingSpotRepository();
        GateRepository gateRepository=new GateRepository();


        InitialisationService initialisationService=new InitialisationService(parkingLotRespository,parkingFloorRepository,parkingSpotRepository,gateRepository);

        InitController initController=new InitController(initialisationService);
        ParkingLot parkingLot= initController.init();


        System.out.println("END");


    }
}
