package RetiCar;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SearchRentalController {


    @FXML
    private Button _search;
    @FXML
    private Button _cancel;


    public void searchButtonPressed(){
        Singleton.getInstance().getManageRentalsController().searchNissan();
        Stage currentStage = (Stage)_search.getScene().getWindow();
        currentStage.close();
    }

    public void cancelButtonPressed(){
        Stage currentStage = (Stage)_cancel.getScene().getWindow();
        currentStage.close();
    }

}
