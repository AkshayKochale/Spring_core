package springdemoJavaAnnotaton;

import org.springframework.beans.factory.annotation.Value;

public class company implements work{

    private String cname;
    private String location;

    public company() {
    }

    public company(String cname, String location) {
        this.cname = cname;
        this.location = location;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "company{" + "cname=" + cname + ", location=" + location + '}';
    }

    @Override
    public void work() {
        System.out.println("company is working");
    
    }
    
    
}
