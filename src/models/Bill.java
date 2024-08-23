package models;

import models.enums.BillStatus;

import java.time.LocalDateTime;

public class Bill extends BaseModel {

    private Ticket ticket;
    private LocalDateTime exitTime;
    private Gate exitGate;
    private double amount;
    private BillStatus billStatus;


    public Bill() {
    }

    public Bill(Ticket ticket, LocalDateTime exitTime, Gate exitGate, double amount, BillStatus billStatus) {
        this.ticket = ticket;
        this.exitTime = exitTime;
        this.exitGate = exitGate;
        this.amount = amount;
        this.billStatus = billStatus;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

}
