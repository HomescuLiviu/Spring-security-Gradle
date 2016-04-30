package omegadeveloper; /**
 * Created by liviu on 2/23/2016.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.List;

@ComponentScan
@SpringBootApplication
public class Application {

    @Bean
    public List<String> messages() {
        return new ArrayList<>();
    }

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Application.class, args);
    }
}

