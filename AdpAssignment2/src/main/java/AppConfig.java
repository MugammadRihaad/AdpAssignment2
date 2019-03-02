import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name="area")
    public AreaInterface getService(){
        return new ArearServiceImpl();    }

}
