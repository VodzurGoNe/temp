package spring_introduction;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component("catBean")
public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Mew-mazafaka");
    }

    @Override
    public String toString() {
        return "Cat";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destoy this Cat prototype");
    }

}
