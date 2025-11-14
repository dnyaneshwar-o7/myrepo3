import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demoa {
    public static void main(String[] args) throws Exception{
        String sql = "select name from product where id =8";

        String url="jdbc:postgresql:5432//localhost:/telusko";
        String username="postgres";
        String password="0000";
        Connection con= DriverManager.getConnection(url, username, password);
        Statement st= con.createStatement();
        st.executeQuery(sql);


    }
}
