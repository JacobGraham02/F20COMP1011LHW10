import Models.Customer;
import Utilities.DBUtility;

import java.util.ArrayList;

public class StreamExperiments {
    public static void main(String[] args) {
        ArrayList<Customer> customers = DBUtility.getCustomers();
        System.out.println(customers.size());

        //count the number of males in the collection
        System.out.println("Number of males: "+
                customers.stream()
                         .filter(customer -> customer.getGender().equalsIgnoreCase("male"))
                         .count());
    }
}
