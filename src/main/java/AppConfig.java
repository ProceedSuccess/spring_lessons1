import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("spring_lessons.src.main.java")
public class AppConfig {
    @Bean(name="Registry")
    public Registry registry(Refferal refferal){
        Registry registry = new Registry();
        registry.setRefferal(refferal);
        return registry;
    }
}

