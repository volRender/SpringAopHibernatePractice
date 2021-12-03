package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();

            //save (add)
//            Employee emp = new Employee("Mama", "Moya", "IT", 1600);
            session.beginTransaction();
//            session.save(emp);

            //get
//            int myId = emp.getId();
//            Employee employee = session.get(Employee.class, myId);
//            System.out.println(employee);
//            List<Employee> employeeList = session.createQuery("from Employee where name = 'Masha'").getResultList();
//            for(Employee em: employeeList) {
//                System.out.println(em);
//            }

              //update
//            Employee emp = session.get(Employee.class, 1);
//            emp.setSalary(1000);

//            session.createQuery("update Employee set salary = 300 where name = 'Masha'").executeUpdate();

            //delete
//            Employee emp = session.get(Employee.class, 1);
//            session.delete(emp);

            session.createQuery("delete from Employee where name = 'Masha'").executeUpdate();

            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }

    }
}
