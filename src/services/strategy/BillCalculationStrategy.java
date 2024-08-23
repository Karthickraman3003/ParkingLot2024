package services.strategy;

import models.Bill;
import models.Ticket;

public interface BillCalculationStrategy {
    Bill generateBill(Ticket ticket);
}
