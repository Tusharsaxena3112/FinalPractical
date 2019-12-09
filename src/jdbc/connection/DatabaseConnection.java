package jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection connection = null;
    public static Connection getConnection(){
        return connection;
    }
    public Connection attemptConnection() throws SQLException {
        boolean isConnected = false;
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Stock?serverTimezone=UTC","root","");
        if(connection!=null){
            isConnected = true;
        }
        return connection;
    }

    public boolean closeConnection() throws SQLException {
        boolean isConnectionClosed =false;
        if(getConnection()!=null){
            connection.close();
            isConnectionClosed=true;
        }
        return isConnectionClosed;
    }
}
