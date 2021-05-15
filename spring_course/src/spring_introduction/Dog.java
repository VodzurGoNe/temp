package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component("myDog")
@Scope("prototype")
public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destoy this Dog prototype");
    }
}
