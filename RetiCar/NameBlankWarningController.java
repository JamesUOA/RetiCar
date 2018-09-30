package RetiCar;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class NameBlankWarningController {

    @FXML
    private Button _Ok;

    public void okButtonPressed(){
       Stage currentStage = (Stage) _Ok.getScene().getWindow();
       currentStage.close();
    }
}
