package jdbc.connection;

import jdbc.connection.insert.Insert;

import java.sql.SQLException;

public class DatabaseMain {
    public static void main(String[] args) throws SQLException {
        DatabaseConnection databaseConnection =new DatabaseConnection();
        Insert insert = new Insert();
//        if(databaseConnection.attemptConnection()){
//            System.out.println("Connected OK");
//        }
        insert.addDetails(databaseConnection.attemptConnection());
    }
}
