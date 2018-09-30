package RetiCar;

public class Singleton {

    private ManageRentalsController _manageRentalsController;
    private ManageCustomerController _manageCustomerController;
    private static Singleton instance;

    private Singleton(){
    }


    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }

    public ManageCustomerController getManageCustomerController() {
        return _manageCustomerController;
    }

    public ManageRentalsController getManageRentalsController() {
        return _manageRentalsController;
    }

    public void set_manageRentalsController(ManageRentalsController _manageRentalsController) {
        this._manageRentalsController = _manageRentalsController;
    }

    public void set_manageCustomerController(ManageCustomerController _manageCustomerController) {
        this._manageCustomerController = _manageCustomerController;
    }
}
