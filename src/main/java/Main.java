import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

//        System.out.println("Hello!!!");
//        Connection con = null;
//        con = DriverManager.getConnection(
//                "jdbc:mysql://localhost:3306",
//                "root",
//                "password");
//
//        Statement st = null;
//        ResultSet rs = null;
//
//        st = con.createStatement();
//        rs = st.executeQuery("show databases");
//        rs = st.getResultSet();
//
//        while(rs.next()){
//            String result = rs.getString(1);
//            System.out.println(result);
//        }
//
//        con.close();

//        UserDao api = new UserDao();

//        UserDo user = new UserDo();
//        user.setId("KOREATECH1");
//        user.setPassword("kut");
//        user.setName("PLLAB");

//        api.Insert(user);
//        UserDo selected_user = api.Select("KOREATECH1");
//        System.out.println(selected_user);
//
//        api.UpdateName("KOREATECH1","AAAAAAA");
//
//        selected_user= api.Select("KOREATECH1");
//        System.out.println(selected_user);
//        api.Delete("KOREATECH1");
//

//        TestUserDao d = UserDAOFactory.getINSTANCE().getTestUserDao();
//        UserDo user = d.Select("jylee");
//
//        System.out.println(user);
//
//        RealUserDao d2 = UserDAOFactory.getINSTANCE().getRealUserDao();
//        System.out.println(d2.Select("yslim"));

        UserDao d = UserDAOFactory.getINSTANCE().getUserDao("TEST");
        UserDo user = d.Select("jylee");

//        TestUserDao d = UserDAOFactory.getINSTANCE().getTestUserDao();
//        UserDo user = d.Select("jylee");


        System.out.println(user);

        UserDao d2 = UserDAOFactory.getINSTANCE().getUserDao("REAL");
        System.out.println(d2.Select("yslim"));



    }
}
