package RetiCar;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ManageCustomerController implements Initializable {


    @FXML
    private Button _backButton;
    @FXML
    private Button _add;

    @FXML
    private Button _modify;

    @FXML
    private ListView _listView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {


        _listView.getItems().addAll("Jackie Chan", "Elon Musk", "Jimmy Gao","Andrew Hu","Casey Wong","Fred Dagg");
    }

    public void addButtonPressed(){
        Stage primaryStage = new Stage();
        Parent root = null;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddCustomerView.fxml"));
        try {
            root = (Parent)loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage.setTitle("Add/");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public void backButtonPressed(){
        Stage primaryStage = (Stage) _backButton.getScene().getWindow();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("MainMenuView.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage.setTitle("MainMenu");
        primaryStage.setScene(new Scene(root, 1280, 800));
        primaryStage.show();
    }

    public void modifyButtonPressed(){
        Stage primaryStage = new Stage();
        Parent root = null;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ModifyCustomerView.fxml"));
        try {
            root = (Parent)loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage.setTitle("Search Rental");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public void addElement(){
        _listView.getItems().add("Kevin Love");
    }

    public void modifyElement(){
        _listView.getItems().remove("Jackie Chan");
        _listView.getItems().add(0,"Jackie Chen");

    }
}
