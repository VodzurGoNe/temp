package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    private String surname;
    private int age;
    private Pet pet;

    @Autowired
    public Person(@Qualifier("catBean") Pet pet) {
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    @Value("${person.surname}")
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    @Value("${person.age}")
    public void setAge(int age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

//    @Autowired
//    @Qualifier("catBean")
    public void setPet(Pet pet) {
        System.out.println("Назначили пета через сеттер - " + pet.toString());
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello shertinoy!");
        pet.say();
    }
}
