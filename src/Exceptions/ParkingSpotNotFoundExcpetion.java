package Exceptions;

public class ParkingSpotNotFoundExcpetion extends RuntimeException{

    public ParkingSpotNotFoundExcpetion()
    {

    }

    public ParkingSpotNotFoundExcpetion(String msg)
    {
        super(msg);
    }
}
