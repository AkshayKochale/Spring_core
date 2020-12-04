package springJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class test implements RowMapper {

    String ename, location, manager;
    int eid, phone, salary;

    public static void main(String args[]) {
        ApplicationContext cont = new ClassPathXmlApplicationContext("resource/Beans.xml");
        System.out.println("level 1");
        JdbcTemplate temp = cont.getBean("jdbcTemp", JdbcTemplate.class);
        System.out.println("level 2");

        String qu = "Select * from emp";
        String q2="insert into dpt_info values(?,?,?)";
        String q3="delete from dpt_info where dpt_id=?";    
        // Rowmapper is used to fetch results from dataBase
        RowMapper rm = new test();
        List l = temp.query(qu, rm);

//        for (Object j : l) {
//            System.out.println(j);
//        }
//        
       
//           int j= temp.update(q2,5,"Sales","Supriya");
//           System.out.println(j);
    
            int j = temp.update(q3,5);
            System.out.println(j);
    
    
    }

    @Override
    public Object mapRow(ResultSet rs, int i) throws SQLException {

        test obj = new test();
        obj.eid = rs.getInt(1);
        obj.ename = rs.getString(2);
        obj.phone = rs.getInt(3);
        obj.location = rs.getString(4);
        obj.salary = rs.getInt(5);
        obj.manager = rs.getString(6);

        return obj;
    }

    @Override
    public String toString() {
        return " " + ename + " " + location + " " + manager + " " + eid + " " + phone + " " + salary;
    }

}
