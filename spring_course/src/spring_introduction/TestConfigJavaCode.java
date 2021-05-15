package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfigJavaCode {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);

        person.callYourPet();
        System.out.println(person.getSurname() + " " + person.getAge());

        context.close();
    }
}
