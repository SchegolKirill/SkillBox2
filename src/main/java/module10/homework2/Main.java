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
                .addAnnotatedClass(Teacher.class)
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Subscription.class)
                .addAnnotatedClass(LinkedPurchase.class)
                .addAnnotatedClass(Purchase.class)
                .buildSessionFactory();

        Session session = null;
        try {
            //Session session = sessionFactory.openSession();
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();

//            String sql = "CREATE TABLE IF NOT EXISTS linked_purchaselist " +
//                    "(student_id INT UNSIGNED NOT NULL, " +
//                    "course_id INT UNSIGNED NOT NULL, UNIQUE KEY `unq` (`student_id`,`course_id`), " +
//                    "KEY `course_idx` (`course_id`),\n" +
//                    "            CONSTRAINT `course` FOREIGN KEY (`course_id`) REFERENCES `courses` (`id`),\n" +
//                    "            CONSTRAINT `student` FOREIGN KEY (`student_id`) REFERENCES `students` (`id`)\n" +
//                    ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci";
//
//            Query query = session.createSQLQuery(sql).addEntity(LinkedPurchaseList.class);

            //List<Course> courseList = session.createQuery("from Course").getResultList();

//            for(Course course: courseList){
//                System.out.println(course.getName() + " - " + course.getTeacher().getName() + " - "
//                        + course.getStudents().size() + " студентов");
//            }

            List<Purchase> purchaseList = session.createQuery("from Course").getResultList();
//            for(Purchase purchase : purchaseList){
//                System.out.println(purchase);
//            }



            session.getTransaction().commit();
            System.out.println("АУФ");
        }
        finally {
            session.close();
            sessionFactory.close();
        }
    }
}
