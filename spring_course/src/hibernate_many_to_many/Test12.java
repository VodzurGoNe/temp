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
            Section voleyball = new Section("Voleyball");
            Section chees = new Section("Chees");
            Section math = new Section("Math");

            Child child = new Child("Petya", 7);
/*            Child child2 = new Child("Fenis", 10);
            Child child3 = new Child("Katya", 10);
            football.addChildToSection(child1);
            football.addChildToSection(child2);
            football.addChildToSection(child3); */

            child.addSectionToChild(voleyball);
            child.addSectionToChild(chees);
            child.addSectionToChild(math);

            session.beginTransaction();

            session.save(child);

            session.getTransaction().commit();
            System.out.println("Done!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
