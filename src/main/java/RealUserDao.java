import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RealUserDao extends UserDao {

    public RealUserDao(IConnectionUserDao icon, int i) {
        super(icon, i);
    }

    //C  --> insert
    public void Insert(UserDo user) throws SQLException {
        Connection con = iconnection.getConnection();

        PreparedStatement ps =
                con.prepareStatement(
                        "insert into users(id, password, name)" +
                            "values (?,?,?)");

        ps.setString(1, user.getId());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getName());
        ps.executeUpdate();

        ps.close();
        con.close();
    }

    //R
    public UserDo Select(String id) throws SQLException {
        Connection con = iconnection.getConnection();

        PreparedStatement ps =
                con.prepareStatement(
                        "select * from users where id = ? ");
        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();

        UserDo user = null;
        while(rs.next()){
            user = new UserDo();
            user.setId(rs.getString(1));
            user.setPassword(rs.getString(2));
            user.setName(rs.getString(3));
        }

        rs.close();
        ps.close();
        con.close();

        return user;
    }

    //U
    public void UpdateName(String id, String name) throws SQLException {
        Connection con = iconnection.getConnection();

        //"update users set name= name where id = 'yslim' "
        PreparedStatement ps =
                con.prepareStatement(
                        "update users set name = ? where id = ?");
        ps.setString(1, name);
        ps.setString(2, id);
        ps.executeUpdate();

        ps.close();
        con.close();
    }

    //D
    public void Delete(String id) throws SQLException {
        Connection con = iconnection.getConnection();

        PreparedStatement ps =
                con.prepareStatement(
                        "delete from users where id = ?");

        ps.setString(1, id);
        ps.executeUpdate();

        ps.close();
        con.close();
    }
}
