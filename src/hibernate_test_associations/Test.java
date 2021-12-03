package hibernate_test_associations;

import hibernate_test.entity.Employee;
import hibernate_test_associations.entity.Detail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try {
//           session = factory.getCurrentSession();
//
//            //save (add)
//            Employee emp = new Employee("Masha", "Zaharova", "Sales", 1200);
//            Detail detail = new Detail("Otradnoe", "84343843", "lit@mail.ru");
//
//            session.beginTransaction();
//
//
//
//            session.save(emp);

            //get
//            int myId = emp.getId();
//            Employee employee = session.get(Employee.class, myId);
//            System.out.println(employee);
//            List<Employee> employeeList = session.createQuery("from Employee where name = 'Masha'").getResultList();
//            for(Employee em: employeeList) {
//                System.out.println(em);
//            }

            //delete
//            Employee emp = session.get(Emplo
//            yee.class, 1);
//            session.delete(emp);

//            session.createQuery("delete from Employee where name = 'Masha'").executeUpdate();
//
//            session.getTransaction().commit();
        }
        finally {
            factory.close();
            session.close();
        }

    }
}
