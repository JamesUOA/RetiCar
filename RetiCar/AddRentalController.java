package RetiCar;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class AddRentalController {

    @FXML
    private Button _cancelButton;

    @FXML
    private Button _addButton;


    public void cancelButtonPressed(){
        Stage currentstage = (Stage)_cancelButton.getScene().getWindow();
        currentstage.close();
    }

    public void addButtonPressed(){
        Singleton.getInstance().getManageRentalsController().addElement();
        Stage currentStage = (Stage)_addButton.getScene().getWindow();
        currentStage.close();
    }


}
