package RetiCar;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

public class ManageRentalsController implements Initializable {

    @FXML
    private ListView<String> _listView;

    @FXML
    private Button _backButton;

    @FXML
    private Button _addButton;

    @FXML
    private Button _delete;

    @FXML
    private Button _searchButton;



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        _listView.getItems().addAll("Jackie Chan: Nissan 350z", "Elon Musk: Tesla Model X", "Jimmy Gao: Nissan GTR","Andrew Hu: Hu wagon","Casey Wong: Yeet Machine","Fred Dagg: Nissan 370z");

    }

    public void deleteButtonPressed(){
        Stage primaryStage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("ConfirmDeleteView.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage.setTitle("Delete");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    public void addButtonPressed(){
        Stage primaryStage = new Stage();
        Parent root = null;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddRentalView.fxml"));
        try {
            root = (Parent)loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage.setTitle("Add Rental");
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

    public void searchButtonPressed(){
        Stage primaryStage = new Stage();
        Parent root = null;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SearchRentalView.fxml"));
        try {
            root = (Parent)loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage.setTitle("Search Rental");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public void clearSearchPressed(){
        _listView.getItems().clear();
        _listView.getItems().addAll("Jackie Chan: Nissan 350z", "Elon Musk: Tesla Model X", "Jimmy Gao: Nissan GTR","Andrew Hu: Hu wagon","Casey Wong: Yeet Machine","Fred Dagg: Nissan 370z");
    }

    public void addElement(){

        _listView.getItems().add("Bill Gates:Toyota Supra");

    }

    public void searchNissan(){
        _listView.getItems().clear();
        _listView.getItems().addAll("Jackie Chan: Nissan 350z", "Jimmy Gao: Nissan GTR","Fred Dagg: Nissan 370z");
    }

    public void deleteElement(){
        _listView.getItems().remove(_listView.getSelectionModel().getSelectedItem());
    }



}
