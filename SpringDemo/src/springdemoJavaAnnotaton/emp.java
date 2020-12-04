package springdemoJavaAnnotaton;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class emp implements work{

//    @Value("Akshay")
   private String name;
//    @Value("IT")
   private String dpt;
//    @Value("50000")
    private int salary;

    @Autowired
    @Qualifier("company")
    private work com;

    public void setCom(company com) {
        this.com = com;
    }
    
    public emp() {
    }

    public emp(String name, String dpt, int salary, company com) {
        this.name = name;
        this.dpt = dpt;
        this.salary = salary;
        this.com=com;
        System.out.println("consTructure is calling");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("set is called");
    }

    public void setDpt(String dpt) {
        this.dpt = dpt;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "emp{" + "name=" + name + ", dpt=" + dpt + ", salary=" + salary +" "+com+ '}';
    }

    @Override
    public void work() {
    
        System.out.println("emp is workking");
    }
   
   @PostConstruct
    public void inti()
    {
        System.out.println("init called");
    }
    
    @PreDestroy
    public void dest()
    {
    
        System.out.println("dest called");
    }
    
    
}
