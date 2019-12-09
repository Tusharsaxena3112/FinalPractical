package jdbc.connection.insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {
    public void addDetails(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO cars VALUES (?,?,?,?)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID");
        int id =scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter model");
        String model = scanner.nextLine().trim();
        scanner.nextLine();
        System.out.println("Enter Company");
        String company =scanner.nextLine();
        System.out.println("Enter price");
        double price = scanner.nextDouble();
        preparedStatement.setInt(1,id);
        preparedStatement.setString(3,company);
        preparedStatement.setString(2,model);
        preparedStatement.setDouble(4,price);
        int rows = preparedStatement.executeUpdate();
        if(rows!=0){
            System.out.println("Done");
        }
    }

}
