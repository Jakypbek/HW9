package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                 applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean.getMessage());

        Cat cat = applicationContext.getBean("cat", Cat.class);

        System.out.println(cat.getName());

        // boolean b = bean == cat; does not work, but should.

        boolean a = bean.equals(cat);

        System.out.println("is equal " + a);
    }
}
