package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {


        private int rollNO;
        private String name;
        private String branch;
        @Autowired
        private College col1;

        public Student(){}
        
    public Student(int rollNO, String name, String branch ,College col1) {
        this.rollNO = rollNO;
        this.name = name;
        this.branch = branch;
    //    this.col1=col1;
    }

    //    public void setcol1(College col1) {
    //        this.col1 = col1;
    //    }

    public int getRollNO() {
        return rollNO;
    }

    public void setRollNO(int rollNO) {
        this.rollNO = rollNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
//        col1.show();
        return "Student{" + "rollNO=" + rollNO + ", name=" + name + ", branch=" + branch +" "+col1+ '}';
        
    }
     
        
}
