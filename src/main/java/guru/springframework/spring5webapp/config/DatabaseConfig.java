package guru.springframework.spring5webapp.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    //@Value("${spring.datasource.url}")
    private String dbUrl;

    //@Bean
    public DataSource dataSource() {


        String dbUrl = System.getenv("spring.datasource.url");
        String username = System.getenv("JDBC_DATABASE_USERNAME");
        String password = System.getenv("JDBC_DATABASE_PASSWORD");




        if(dbUrl!=null && !dbUrl.isEmpty()) {
            final HikariConfig config = new HikariConfig();
            config.setJdbcUrl(dbUrl);
            return new HikariDataSource(config);
        }
        else {
            System.out.println("spring.datasource.url is empty");
            return null;
        }
    }
}