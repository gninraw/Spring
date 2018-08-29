import java.sql.*;

public abstract class UserDao {
    protected int index = 0;
    protected IConnectionUserDao iconnection;

    public UserDao(IConnectionUserDao icon, int i)
    {
        index = i;
        iconnection = icon;
    }

    public abstract void Insert(UserDo user) throws SQLException;
    public abstract UserDo Select(String id) throws SQLException;
    public abstract void UpdateName(String id, String name) throws SQLException;
    public abstract void Delete(String id) throws SQLException;
}
