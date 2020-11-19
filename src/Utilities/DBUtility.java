package Utilities;

import Models.Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBUtility {
    private static String user = "student";
    private static String password = "student";
    private static String connString = "jdbc:mysql://localhost:3306/F20COMP1011";

    public static ArrayList<Customer> getCustomers()
    {
        ArrayList<Customer> customers = new ArrayList<>();

        try (
                Connection conn = DriverManager.getConnection(connString,user,password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM customers");
                )
        {
            //read from the DB and create Customer objects
            while (resultSet.next())
            {
                Customer newCustomer = new Customer(
                        resultSet.getString("gender"),
                        resultSet.getString("firstName"),
                        resultSet.getString("lastName"),
                        resultSet.getString("province"),
                        resultSet.getString("bloodType"),
                        resultSet.getString("birthday"));
                customers.add(newCustomer);
            }

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return customers;
    }

}
