import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat text = (Cat) applicationContext.getBean("Cat");
        Cat text1 = (Cat) applicationContext.getBean("Cat");

        System.out.println(bean.getMessage());
        System.out.println(bean1.getMessage());
        System.out.println(text.getMessage());
        System.out.println(text1.getMessage());
    }
}