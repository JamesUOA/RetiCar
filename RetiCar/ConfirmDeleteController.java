package RetiCar;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ConfirmDeleteController {

    @FXML
    private Button _yes;
    @FXML
    private Button _no;


    public void yesButtonPressed(){
        Singleton.getInstance().getManageRentalsController().deleteElement();
        Stage currentStage = (Stage) _yes.getScene().getWindow();
        currentStage.close();
    }

    public void noButtonPressed(){
        Stage currentStage = (Stage) _no.getScene().getWindow();
        currentStage.close();
    }
}
