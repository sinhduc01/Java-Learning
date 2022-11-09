import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectMysqlExample {
    private static String DB_URL = "jdbc:mysql://127.0.0.1/testconnector";
    private static String USER_NAME = "root";
    private static String PASSWORD = "";

    /**
     * main
     * 
     * @author viettuts.vn
     * @param args
     */
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // connnect to database 'testdb'
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            // crate statement
            Statement stmt = conn.createStatement();
            // get data from table 'student'
            // ResultSet rs = stmt.executeQuery("select * from student");

            String sql = "select * from student";
            String sql1 = "insert into student(id,name,address) values(5,'Tai','Quang Binh')";
            String sql2 = "update student set name='Duc' where id=1";
            String sql3 = "delete from student where id=3";
            String sql4 = "insert into student(id,name,address) values(6,'Thang','Lao')";
            String sql5 = "insert into student(id,name,address) values(7,'Phong','Trung Quoc')";
            stmt.executeUpdate(sql1);
            stmt.executeUpdate(sql2);
            stmt.executeUpdate(sql3);
            stmt.executeUpdate(sql4);
            stmt.executeUpdate(sql5);
            PreparedStatement pr = conn.prepareStatement(sql);
            ResultSet r1 = pr.executeQuery();
            while (r1.next()) {
                System.out.print(r1.getInt("id") + "-");
                System.out.print(r1.getString("name") + "-");
                System.out.print(r1.getString("address") + "\n");
            }
            // show data
            // while (rs.next()) {
            // System.out.println(rs.getInt(1) + " " + rs.getString(2)
            // + " " + rs.getString(3));
            // }
            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * create connection
     * 
     * @author viettuts.vn
     * @param dbURL:    database's url
     * @param userName: username is used to login
     * @param password: password is used to login
     * @return connection
     */
    public static Connection getConnection(String dbURL, String userName,
            String password) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
}