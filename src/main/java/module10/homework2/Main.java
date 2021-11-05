package module10.homework2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class Main {
    public static void main(String[] args) {

//        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
//        .configure("hibernate.cfg.xml").build();
//        Metadata metadata = new MetadataSources(registry)
//        .getMetadataBuilder().build();
//        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();

        try {
            //Session session = sessionFactory.openSession();
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            List<Course> courseList = session.createQuery("from Course").getResultList();

            for(Course course: courseList){
                System.out.println(course.getName() + " - " + course.getStudentsCount());
            }

            session.getTransaction().commit();
            System.out.println("АУФ");
        }catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            sessionFactory.close();
        }
    }
}
