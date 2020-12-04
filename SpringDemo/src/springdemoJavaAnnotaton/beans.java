package springdemoJavaAnnotaton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan (basePackages = "springdemoJava")
public class beans {

    @Bean
    public emp emp() {

        System.out.println("third bean");
        return new emp();
    }

    @Bean 
    public faltu a()
    {
        System.out.println("fuck");
    return new faltu();
    }
    
    @Bean
    public work company() {
        System.out.println("first bean");
        company c = new company();
        c.setCname("best IT solution");
        c.setLocation("mumbai");
        return c;
    }

    @Bean
    public work com1() {
        System.out.println("second bean");
        company c = new company();
        c.setCname("IT solution");
        c.setLocation("mumbai");
        return  c;
    }

}
