import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RealConnectionMaker implements IConnectionUserDao {
    public Connection getConnection() throws SQLException {
        Connection con = null;
        con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/real_db",
                "root",
                "password");
        return con;
    }
}
