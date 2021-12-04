package hibernate_test_associations_OneToOne;

import hibernate_test_associations_OneToOne.entity.Detail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure()
                .addAnnotatedClass(hibernate_test_associations_OneToOne.entity.Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try {
           session = sessionFactory.getCurrentSession();

            //uni-directional
            //save(add)
//            Employee employee = new Employee("Masha", "Zaharova", "Sales", 100);
//            Detail detail = new Detail("SPB", "4893984893", "pataskana@gmail.com");
//
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//

            //get

//            Employee emp = session.get(Employee.class, 1);
//            System.out.println(emp.getEmpDetail());


            //delete
//            session.delete(emp);
//            session.getTransaction().commit();



            //bi-directional
            //save(add)
//            Employee employee = new Employee("Vlad", "Varakin", "IT", 1000);
//            Detail detail = new Detail("SPB", "42342342", "vlad@gmail.com");
//            session.beginTransaction();
//
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);
//            session.save(detail);
//
//            session.getTransaction().commit();


            //get
//            session.beginTransaction();
//
//            Detail detail = session.get(Detail.class, 4);
//            System.out.println(detail);
//
//            session.getTransaction().commit();


            //delete
//            session.beginTransaction();
//
//            Detail detail = session.get(Detail.class, 2);
//            session.delete(detail);
//
//            session.getTransaction().commit();


            //delete detail-info only
//            session.beginTransaction();
//
//            Detail detail = session.get(Detail.class, 4);
//            detail.getEmployee().setEmpDetail(null);
//            session.delete(detail);
//
//            session.getTransaction().commit();

        }
        finally {
            sessionFactory.close();
            session.close();
        }

    }
}
