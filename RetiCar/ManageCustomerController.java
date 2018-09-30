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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
    private TableView _tableView;

    private ObservableList<Customer> data;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        _tableView.setEditable(true);
        TableColumn name = new TableColumn("Name");
        name.setMinWidth(200);
        TableColumn phoneNumber = new TableColumn("Phone Number");
        phoneNumber.setMinWidth(200);
        TableColumn address = new TableColumn("Address");
        address.setMinWidth(200);
        _tableView.getColumns().addAll(name, phoneNumber, address);



        data = FXCollections.observableArrayList(
                new Customer("Andrew Hu", "0219929310", "jacob.smith@example.com"),
                new Customer("Isabella", "0219929310", "isabella.johnson@example.com"),
                new Customer("Ethan", "0219929310", "ethan.williams@example.com"),
                new Customer("Emma", "0219929310", "emma.jones@example.com"),
                new Customer("Michael", "0219929310", "michael.brown@example.com")
        );
        name.setCellValueFactory(
                new PropertyValueFactory<Customer,String>("Name")
        );
        phoneNumber.setCellValueFactory(
                new PropertyValueFactory<Customer,String>("phoneNumber")
        );
        address.setCellValueFactory(
                new PropertyValueFactory<Customer,String>("Address")
        );

        _tableView.setItems(data);

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
//        _listView.getItems().add("Kevin Love");
        data.add(new Customer("Elon Musk","223221312321","hello world"));
    }


    public void modifyElement(){
        if(_tableView.getSelectionModel().getSelectedIndex()!=-1) {
            data.remove(_tableView.getSelectionModel().getSelectedIndex());
            data.add(new Customer("Jeff Bezos", "785169322", " 999 Amazon Street"));
        }
    }
}
