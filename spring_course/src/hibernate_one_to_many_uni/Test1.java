package hibernate_one_to_many_uni;


import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {
/*
            Department dep = new Department("HR", 1200, 100);

            Employee emp1 = new Employee("Elena", "Anele", 110);

            Employee emp2 = new Employee("Olga", "Anele", 110);

            dep.addEmployeeToDepartment(emp1);
            dep.addEmployeeToDepartment(emp2);
*/
            session.beginTransaction();

            Department dep = session.get(Department.class, 2L);

            session.delete(dep);
//            session.save(dep);

            //Department dep = session.get(Department.class, 1L);

//            Employee emp = session.get(Employee.class, 2L);

//            session.delete(emp);

            session.getTransaction().commit();
            System.out.println("Done!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
