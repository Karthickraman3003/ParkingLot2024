package Exceptions;

public class ParkingLotNotFoundException extends RuntimeException{

    public ParkingLotNotFoundException()
    {

    }

    public ParkingLotNotFoundException(String msg)
    {
        super(msg);
    }
}
