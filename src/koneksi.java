import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private Connection connection;

    // Method to connect to the database
    public void connect() {
        try {
            // Database connection parameters
            String url = "jdbc:mysql://localhost:3306/gudang"; // Replace with your database name
            String username = "root"; // Replace with your database username
            String password = ""; // Replace with your database password

            // Establishing the connection
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful!");

        } catch (SQLException e) {
            e.printStackTrace(); // Print the stack trace for debugging
            System.out.println("Connection failed: " + e.getMessage());
        }
    }

    // Method to get the connection object
    public Connection getConnection() {
        return connection;
    }

    // Method to close the connection
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Connection closed.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
