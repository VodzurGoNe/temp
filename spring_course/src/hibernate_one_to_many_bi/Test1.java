package hibernate_one_to_many_bi;


import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
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
            Department dep = new Department("Sales", 2000, 100);

            Employee emp1 = new Employee("Unit1", "FaUnit", 105);
            Employee emp2 = new Employee("Unit2", "FaUnit", 102);
            Employee emp3 = new Employee("Unit3", "FaUnit", 103);
            Employee emp4 = new Employee("Unit4", "FaUnit", 104);

            dep.addEmployeeToDepartment(emp1);
            dep.addEmployeeToDepartment(emp2);
            dep.addEmployeeToDepartment(emp3);
            dep.addEmployeeToDepartment(emp4);
*/
            session.beginTransaction();

//            session.save(dep);
            System.out.println("Get department");
            Department dep = session.get(Department.class, 3L);

            System.out.println("Show department");
            System.out.println(dep);
            System.out.println("Show employees of the department");
            System.out.println(dep.getEmps());

//            Employee emp = session.get(Employee.class, 2L);

//            session.delete(emp);

            session.getTransaction().commit();
            System.out.println("Done!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
