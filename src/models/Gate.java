package models;

import models.enums.GateStatus;
import models.enums.GateType;

public class Gate extends BaseModel{

    private int gateNumber;
    private GateType gateType;
    private String gateOperator;
    private GateStatus gateStatus;


    public Gate() {
    }

    public Gate(GateType gateType, int gateNumber, String gateOperator, GateStatus gateStatus) {
        this.gateType = gateType;
        this.gateNumber = gateNumber;
        this.gateOperator = gateOperator;
        this.gateStatus = gateStatus;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType)
    {
        this.gateType=gateType;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }
    public void setGateStatus(GateStatus gateStatus)
    {
        this.gateStatus=gateStatus;
    }

    public String getGateOperator() {
        return gateOperator;
    }

    public void setGateOperator(String gateOperator) {
        this.gateOperator = gateOperator;
    }
}
