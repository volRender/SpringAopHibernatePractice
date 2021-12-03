package hibernate_test_associations;

import hibernate_test_associations.entity.Detail;
import hibernate_test_associations.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure()
                .addAnnotatedClass(hibernate_test_associations.entity.Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try {
           session = sessionFactory.getCurrentSession();

            //save(add)
//            Employee employee = new Employee("Masha", "Zaharova", "Sales", 100);
//            Detail detail = new Detail("SPB", "4893984893", "pataskana@gmail.com");
//
//            employee.setEmpDetail(detail);
//
            session.beginTransaction();
//
//            session.save(employee);
//

            //get

            Employee emp = session.get(Employee.class, 1);
            System.out.println(emp.getEmpDetail());


            //delete
            session.delete(emp);
            session.getTransaction().commit();

        }
        finally {
            sessionFactory.close();
            session.close();
        }

    }
}
