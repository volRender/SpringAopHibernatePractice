package hibernate_test_associations_OneToMany_uni;


import hibernate_test_associations_OneToMany_uni.entity.*;
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

            //uni-directional
            //save(add)
//            Department department = new Department("H&M", 700, 200);
//            Employee employee = new Employee("Alexey", "Bogdanov", 600);
//            Employee employee2 = new Employee("Nikita", "Milov", 650);
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
//             session.beginTransaction();
//
//             Department department = session.get(Department.class, 4);
//             System.out.println(department);
//             System.out.println(department.getEmps());
//
//             session.getTransaction().commit();


            //delete
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//            session.delete(employee);
//
//            Department department = session.get(Department.class, 4);
//            session.delete(department);
//
//            session.getTransaction().commit();

        }
        finally {
            sessionFactory.close();
            session.close();
        }

    }
}
