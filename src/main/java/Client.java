import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan(basePackages = { "spring_lessons\\src\\main\\java" })
public class Client {
    public static void main(String[] args) {
 //       ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        Registry registry = context.getBean("Registry",Registry.class );
        registry.issue_direction();
    }
}
