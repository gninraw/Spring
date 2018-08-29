import java.sql.Connection;
import java.sql.SQLException;

public interface IConnectionUserDao {
    Connection getConnection() throws SQLException;
}
