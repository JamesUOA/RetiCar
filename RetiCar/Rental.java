package RetiCar;

import javafx.beans.property.SimpleStringProperty;

public class Rental {


    private SimpleStringProperty customer;
    private SimpleStringProperty Car;
    private SimpleStringProperty StartDate;
    private SimpleStringProperty EndDate;
    private SimpleStringProperty rate;

    public Rental(String customer, String Car, String StartDate,String EndDate,String rate) {
        this.customer = new SimpleStringProperty(customer);
        this.Car = new SimpleStringProperty(Car);
        this.StartDate = new SimpleStringProperty(StartDate);
        this.EndDate = new SimpleStringProperty(EndDate);
        this.rate = new SimpleStringProperty(rate);
    }

    public String getCustomer() {
        return customer.get();
    }
    public void setCustomer(String fName) {
        customer.set(fName);
    }

    public String getCar() {
        return Car.get();
    }
    public void setCar(String fName) {
        Car.set(fName);
    }

    public String getStartDate() {
        return StartDate.get();
    }
    public void setStartDate(String fName) {
        StartDate.set(fName);
    }

    public String getEndDate() {
        return EndDate.get();
    }

    public String getRate() {
        return rate.get();
    }

}
