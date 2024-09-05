package Exceptions;

public class ParkingFloorNotFoundException extends RuntimeException{

    public ParkingFloorNotFoundException()
    {

    }

    public ParkingFloorNotFoundException(String msg)
    {
        super(msg);
    }
}
