package carrental.model.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CarRental {
    private LocalDate start;
    private LocalDate end;

    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental(LocalDateTime start, LocalDateTime end, Vehicle vehicle) {}

    public CarRental(LocalDate start, LocalDate end, Vehicle vehicle) {
        this.start = start;
        this.end = end;
        this.vehicle = vehicle;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
