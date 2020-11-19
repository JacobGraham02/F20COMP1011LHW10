import Models.Customer;
import Utilities.DBUtility;

import java.util.ArrayList;

public class StreamExperiments {
    public static void main(String[] args) {
        ArrayList<Customer> customers = DBUtility.getCustomers();
        System.out.println(customers.size());
    }
}
