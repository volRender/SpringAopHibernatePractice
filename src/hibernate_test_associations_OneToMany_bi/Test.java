package hibernate_test_associations_OneToMany_bi;

import hibernate_test_associations_OneToMany_bi.entity.Department;
import hibernate_test_associations_OneToMany_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure()
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try {
           session = sessionFactory.getCurrentSession();

            //bi-directional
            //save(add)
//            Department department = new Department("HR", 650, 300);
//            Employee employee = new Employee("Masha", "Zaharova", 400);
//            Employee employee2 = new Employee("Misha", "Aivazyan", 500);
//            department.addEmpToDepartment(employee);
//            department.addEmpToDepartment(employee2);
//
//            session.beginTransaction();
//
//            session.save(department);
//
//            session.getTransaction().commit();
//

//          //get
//           session.beginTransaction();
//
//             Department department = session.get(Department.class, 3);
//             System.out.println(department);
//             System.out.println(department.getEmps());
//             session.getTransaction().commit();


            //delete
            session.beginTransaction();

//            Employee employee = session.get(Employee.class, 2);
//            session.delete(employee);

            Department department = session.get(Department.class, 1);
            session.delete(department);

            session.getTransaction().commit();

        }
        finally {
            sessionFactory.close();
            session.close();
        }

    }
}
