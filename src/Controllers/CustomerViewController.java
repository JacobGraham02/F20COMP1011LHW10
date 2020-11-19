package Controllers;

import Models.Customer;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class CustomerViewController implements Initializable {


    @FXML
    private TableView<Customer> tableView;

    @FXML
    private TableColumn<Customer, Integer> idColumn;

    @FXML
    private TableColumn<Customer, String> firstNameColumn;

    @FXML
    private TableColumn<Customer, String> lastNameColumn;

    @FXML
    private TableColumn<Customer, Integer> ageColumn;

    @FXML
    private TableColumn<Customer, String> genderColumn;

    @FXML
    private TableColumn<Customer, String> provinceColumn;

    @FXML
    private TableColumn<Customer, String> bloodTypeColumn;

    @FXML
    private TextField searchTextField;

    @FXML
    private Label rowSelectedLabel;

    @FXML
    private Label malePercentLabel;

    @FXML
    private Label femalePercentLabel;

    @FXML
    private Label averageAgeLabel;

    @FXML
    private CheckBox abCheckBox;

    @FXML
    private CheckBox mbCheckBox;

    @FXML
    private CheckBox bcCheckBox;

    @FXML
    private CheckBox nbCheckBox;

    @FXML
    private CheckBox nlCheckBox;

    @FXML
    private CheckBox nsCheckBox;

    @FXML
    private CheckBox ntCheckBox;

    @FXML
    private CheckBox onCheckBox;

    @FXML
    private CheckBox qcCheckBox;

    @FXML
    private CheckBox skCheckBox;

    private ArrayList<Customer> allCustomers;
    private ArrayList<CheckBox> checkBoxes;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        
        //This set's up the checkbox objects to filter by province
        //and puts them all in an ArrayList<CheckBox> called
        //checkBoxes.  This way you can loop over the CheckBox objects
        configureCheckBoxes();

        //configure the table columns
        configureTableColumns();

        //add a listener to the search TextField.  When ever there is a change in the
        //TextField, it will call the method setNameSearchTextField() - add your filtering
        //code in there
        searchTextField.textProperty().addListener((obs, oldValue, searchString)->
                search(searchString));
    }


    /**
     * This method adds the checkboxes to an ArrayList
     * and set's their initial state to selected
     */
    private void configureCheckBoxes()
    {
        //Add the CheckBox object to an ArrayList
        checkBoxes = new ArrayList<>();
        checkBoxes.addAll(Arrays.asList(abCheckBox,bcCheckBox,mbCheckBox,
                nbCheckBox,nlCheckBox,nsCheckBox,ntCheckBox,onCheckBox,qcCheckBox,skCheckBox));
    }


    /**
     * This method configures the table columns with value factories
     */
    private void configureTableColumns()
    {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        genderColumn.setCellValueFactory(new PropertyValueFactory<>("gender"));
        provinceColumn.setCellValueFactory(new PropertyValueFactory<>("province"));
        bloodTypeColumn.setCellValueFactory(new PropertyValueFactory<>("bloodType"));
    }

    /**
     * This method is called whenever someone enters or removes a character from the search
     * textField
     * @param searchString
     */
    @FXML
    private void search(String searchString){
        System.out.println("setNameSearchTextField() called");
    }

    /**
     * This method is called whenever one of the checkboxes is selected or
     * deselected.  The TableView's ObservableList should be updated to match
     * the provinces selected.  Be sure to update all the labels for
     * male %, female % and average Age
     */
    @FXML private void checkBoxChanged()
    {

    }
}

