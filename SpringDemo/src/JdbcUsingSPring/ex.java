package JdbcUsingSPring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ex {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        



            ApplicationContext acon= new ClassPathXmlApplicationContext("resource/Beans.xml");
            jdbcConnector jcon= acon.getBean("jcon",jdbcConnector.class);
            
        
        
        Class.forName(jcon.getClName());
        System.out.println("class loaded");
        Connection con = DriverManager.getConnection(jcon.getUrl(),jcon.getUsername(),jcon.getPassword());

        Statement st = con.createStatement();
        PreparedStatement ps = con.prepareStatement("Select * from emp where eid=?");
        ps.setObject(1, 3);

        ResultSet r = st.executeQuery("select * from emp");
        ResultSet r1 = ps.executeQuery();
//           ResultSetMetaData rs= r1.getMetaData();
//           System.out.println(""+rs);
//           System.out.println("ex working fine");
        while (r1.next()) {
            System.out.println(r1.getInt(1) + " " + r1.getString(2));
        }

    }

}
