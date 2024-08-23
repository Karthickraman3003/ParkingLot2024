package models;

import models.enums.PaymentMode;

import java.time.LocalDateTime;

public class Payment extends BaseModel{

    private double amount;
    private String transactionRefNumber;
    private PaymentMode paymentMode;
    private Bill bill;
    private PaymnetStatus paymnetStatus;
    private LocalDateTime paymentTime;


    public Payment() {
    }

    public Payment(double amount, String transactionRefNumber, PaymentMode paymentMode, Bill bill, PaymnetStatus paymnetStatus, LocalDateTime paymentTime) {
        this.amount = amount;
        this.transactionRefNumber = transactionRefNumber;
        this.paymentMode = paymentMode;
        this.bill = bill;
        this.paymnetStatus = paymnetStatus;
        this.paymentTime = paymentTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionRefNumber() {
        return transactionRefNumber;
    }

    public void setTransactionRefNumber(String transactionRefNumber) {
        this.transactionRefNumber = transactionRefNumber;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }


    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public PaymnetStatus getPaymnetStatus() {
        return paymnetStatus;
    }


    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }
}
