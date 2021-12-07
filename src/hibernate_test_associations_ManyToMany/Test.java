package hibernate_test_associations_ManyToMany;

import hibernate_test_associations_ManyToMany.entity.Child;
import hibernate_test_associations_ManyToMany.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;
        try {
            //save(add)
//            session = factory.getCurrentSession();
//            Section section1 = new Section("Volleyball");
//            Section section2 = new Section("Basketball");
//            Section section3 = new Section("Football");
//            Child child = new Child("Katya", 8);
//
//            session.beginTransaction();
//
//            child.addSectionToChild(section1);
//            child.addSectionToChild(section2);
//            child.addSectionToChild(section3);
//
//            session.persist(child);
//
//            session.getTransaction().commit();

            //get
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//            Child child = session.get(Child.class, 4);
//            System.out.println(child);
//            System.out.println(child.getSections());
//
//            session.getTransaction().commit();


            //delete
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Section section = session.get(Section.class, 1);
//            session.delete(section);
//
//            Child child = session.get(Child.class, 4);
//            session.delete(child);
//
//            session.getTransaction().commit();
        }
        finally
        {
            session.close();
            factory.close();
        }
    }
}
