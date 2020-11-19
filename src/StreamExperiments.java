import Models.Customer;
import Utilities.DBUtility;

import java.util.ArrayList;
import java.util.OptionalDouble;

public class StreamExperiments {
    public static void main(String[] args) {
        ArrayList<Customer> customers = DBUtility.getCustomers();
        System.out.println(customers.size());

        //count the number of males in the collection
        System.out.println("Number of males: "+
                customers.stream()
                         .filter(customer -> customer.getGender().equalsIgnoreCase("male"))
                         .count());

        //figure out the average age of all customers
        OptionalDouble avgAge = customers.stream()  //stream of Customer objects
                                .mapToDouble(Customer::getAge)  //converts the stream to hold Double objects
                                .average();
        //Optional Double could return a null value, call the isPresent() method
        //to check if there is a number in there
        if (avgAge.isPresent())
        {
            System.out.printf("Average Age: %.1f years old", avgAge.getAsDouble());

        }
    }
}
