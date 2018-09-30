package RetiCar;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainMenuController {

    @FXML
    private Button _ManageCustomer;

    @FXML
    private Button _ManageRentals;

    private Stage _primaryStage;

    private Parent manageRentalsRoot;

    private Parent manageCustomersRoot;

    public void manageCustomerButtonPressed(){
        _primaryStage = (Stage) _ManageCustomer.getScene().getWindow();


        _primaryStage.setTitle("ManageRental");
        _primaryStage.setScene(new Scene(manageCustomersRoot, 1280, 800));
        _primaryStage.show();
    }

    public void manageRentalsButtonPressed(){

        _primaryStage = (Stage) _ManageRentals.getScene().getWindow();


        _primaryStage.setTitle("ManageRental");
        _primaryStage.setScene(new Scene(manageRentalsRoot, 1280, 800));
        _primaryStage.show();
    }

    public void initialize() {
        if (manageRentalsRoot == null || manageCustomersRoot == null) {
            FXMLLoader ManageRentalsLoader = new FXMLLoader(getClass().getResource("ManageRentalsView.fxml"));
            FXMLLoader ManageCustomerLoader = new FXMLLoader(getClass().getResource("ManageCustomerView.fxml"));
            try {
                manageCustomersRoot = ManageCustomerLoader.load();
                manageRentalsRoot = ManageRentalsLoader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            ManageRentalsController mRController = (ManageRentalsController) ManageRentalsLoader.getController();
            ManageCustomerController mCController = (ManageCustomerController) ManageCustomerLoader.getController();
            Singleton.getInstance().set_manageRentalsController(mRController);
            Singleton.getInstance().set_manageCustomerController(mCController);

        }
    }
}

