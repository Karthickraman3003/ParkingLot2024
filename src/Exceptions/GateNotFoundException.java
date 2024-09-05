package Exceptions;

public class GateNotFoundException extends RuntimeException
{

    public GateNotFoundException()
    {

    }

    public GateNotFoundException(String msg)
    {
        super(msg);
    }

}
