package springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

    public static void main(String[] args) {

//        Resource re= new ClassPathResource("resource/Beans.xml");
//         BeanFactory bf= new ClassPathXmlApplicationContext("resource/Beans.xml");
//        
//         Student s1= bf.getBean("stu1",Student.class);
        ApplicationContext con = new ClassPathXmlApplicationContext("resource/NewBeans.xml");

        Student s = con.getBean("student", Student.class);
        College c= con.getBean("college",College.class);
        System.out.println(s);
        System.out.println(c);
    
        ((ClassPathXmlApplicationContext)con).close();
        
  
    }

}
