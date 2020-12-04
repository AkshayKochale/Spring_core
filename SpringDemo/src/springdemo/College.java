package springdemo;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component("college")
public class College {

      private String collegeName;
      private String principal;
      private int date;
      private List teacher;
      private String[] arr;
      private Map map;

    public void setMap(Map map) {
        this.map = map;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public void setTeacher(List teacher) {
        this.teacher = teacher;
    }

    public College() {
    }

    public College(String collegeName, String principal, int date) {
        this.collegeName = collegeName;
        this.principal = principal;
        this.date = date;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void show()
    {
        System.out.println("Welcome to college");
    }

//    @Override
//    public String toString() {
//        return "College{" + "collegeName=" + collegeName + ", principal=" + principal + ", date=" + date + '}';
//    }
    
    
    
    @Override
    public String toString() {
        return "College{" + "collegeName=" + collegeName + ", principal=" + principal + ", date=" + date + ",teacherName = "+teacher+",ArrayOfINTEGER="+arr+" MAPVALUE="+map+'}';
    }
      
    public void leInit()
    {
         System.out.println("le init called");
    }
    
    public void leDes()
    {
        System.out.println("le destroy called");
    }
    
}

