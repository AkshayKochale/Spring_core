package JdbcUsingSPring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("jcon")
public class jdbcConnector {

    @Value("root")
    private String username;
    @Value("jdbc:mysql://localhost:3306/test?useSSL=false")
    private String url;
    @Value("12345")
    private String password;
    @Value("com.mysql.jdbc.Driver")
    private String clName;

    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getClName() {
        return clName;
    }

    public void setClName(String clName) {
        this.clName = clName;
    }

    @Override
    public String toString() {
        return "jdbcConnector{" + "username=" + username + ", url=" + url + ", password=" + password + ", clName=" + clName + '}';
    }
    
    
    
    
}
