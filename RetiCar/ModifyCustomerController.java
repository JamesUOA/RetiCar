package RetiCar;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ModifyCustomerController {

    @FXML
    private Button _confirm;

    @FXML
    private Button _cancel;

    @FXML
    private TextField _name;
    public void confirmButtonPressed(){
        if(!_name.getText().equals("")) {
            Singleton.getInstance().getManageCustomerController().modifyElement();
            Stage currentStage = (Stage) _confirm.getScene().getWindow();
            currentStage.close();
        }else{
            Stage primaryStage = new Stage();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("NameBlankWarning.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            primaryStage.setTitle("Blank Name");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();

        }
    }

    public void cancelButtonPressed(){
        Stage currentStage = (Stage) _confirm.getScene().getWindow();
        currentStage.close();
    }
}
