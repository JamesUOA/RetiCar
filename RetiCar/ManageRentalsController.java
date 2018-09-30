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

public class ManageRentalsController implements Initializable {

    @FXML
    private TableView _tableView;

    @FXML
    private Button _backButton;

    @FXML
    private Button _addButton;

    @FXML
    private Button _delete;

    @FXML
    private Button _searchButton;

    private ObservableList data;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
    data = FXCollections.observableArrayList();
    setUpTable();
    }

    public void setUpTable(){
        _tableView.setEditable(true);
        TableColumn customer = new TableColumn("Customer");
        customer.setMinWidth(200);
        TableColumn car = new TableColumn("Car");
        car.setMinWidth(200);
        TableColumn startDate = new TableColumn("StartDate");
        startDate.setMinWidth(200);
        TableColumn endDate = new TableColumn("EndDate");
        endDate.setMinWidth(200);
        TableColumn rate = new TableColumn("Rate");
        rate.setMinWidth(200);
        _tableView.getColumns().addAll(customer, car, startDate,endDate,rate);


        resetData();

        customer.setCellValueFactory(
                new PropertyValueFactory<Customer,String>("Customer")
        );
        car.setCellValueFactory(
                new PropertyValueFactory<Customer,String>("Car")
        );
        endDate.setCellValueFactory(
                new PropertyValueFactory<Customer,String>("EndDate")
        );
        startDate.setCellValueFactory(
                new PropertyValueFactory<Customer,String>("StartDate")
        );
        rate.setCellValueFactory(
                new PropertyValueFactory<Customer,String>("Rate")
        );

        _tableView.setItems(data);

    }

    public void resetData(){
        data.clear();
        data.addAll(
                new Rental("Jackie Chan", "Nissan 350z", "10/9/18","11/9/18","$200"),
                new Rental("Elon Musk", "Tesla Model X", "10/10/18","15/10/18","$250"),
                new Rental("Jimmy Gao", "Nissan GTR R35", "10/9/18","11/9/18","$400"),
                new Rental("Andrew Hu", "Hu Wagon", "10/9/18","11/9/18","$200"),
                new Rental("Casey Wong", "Yeet Machine", "10/9/18","11/9/18","$200"),
                new Rental("Fred Dagg", "Nissan 370z", "10/9/18","11/9/18","$200")
        );
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
        resetData();
    }

    public void addElement(){

        data.add(new Rental("Bill Gates", "Toyota Supra", "10/9/18","11/9/18","$400"));

    }

    public void searchNissan(){
        data.clear();
        data.addAll(new Rental("Jackie Chan", "Nissan 350z", "10/9/18","11/9/18","$200"),
                new Rental("Fred Dagg", "Nissan 370z", "10/9/18","11/9/18","$200"),
                new Rental("Jimmy Gao", "Nissan GTR R35", "10/9/18","11/9/18","$400"));
    }

    public void deleteElement(){
        if(_tableView.getSelectionModel().getSelectedIndex()!=-1) {
            data.remove(_tableView.getSelectionModel().getSelectedIndex());
        }
    }



}
