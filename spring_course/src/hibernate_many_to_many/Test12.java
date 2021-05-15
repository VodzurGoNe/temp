package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test12 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Child.class)
        .addAnnotatedClass(Section.class)
        .buildSessionFactory();

             Session session = factory.getCurrentSession())
        {
            Section dance = new Section("Dance");
/*            Section chees = new Section("Chees");
            Section math = new Section("Math"); */

            Child child1 = new Child("Vasya", 7);
            Child child2 = new Child("Semis", 10);
            Child child3 = new Child("Olga", 10);
            dance.addChildToSection(child1);
            dance.addChildToSection(child2);
            dance.addChildToSection(child3);

            session.beginTransaction();

            session.persist(dance);

//            session.beginTransaction();

//            session.save(child);

            session.getTransaction().commit();
            System.out.println("Done!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
