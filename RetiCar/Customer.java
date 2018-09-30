package RetiCar;

import javafx.beans.property.SimpleStringProperty;

public class Customer {

    private SimpleStringProperty name;
    private SimpleStringProperty phoneNumber;
    private SimpleStringProperty address;

    public Customer(String name, String phoneNumber, String address) {
        this.name = new SimpleStringProperty(name);
        this.phoneNumber = new SimpleStringProperty(phoneNumber);
        this.address = new SimpleStringProperty(address);
    }

    public String getName() {
        return name.get();
    }
    public void setName(String fName) {
        name.set(fName);
    }

    public String getPhoneNumber() {
        return phoneNumber.get();
    }
    public void setPhoneNumber(String fName) {
        phoneNumber.set(fName);
    }

    public String getAddress() {
        return address.get();
    }
    public void setAddress(String fName) {
        address.set(fName);
    }
}
