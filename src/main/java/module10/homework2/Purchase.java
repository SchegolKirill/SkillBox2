package module10.homework2;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "purchaselist")
public class Purchase {


//    @Column(name = "student_name")
//    private String studentName;
//
//    @Column(name = "course_name")
//    private String courseName;

    @EmbeddedId
    private PurchaseListKey purchaseListKey;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_name", insertable = false, updatable = false)
    private Student student;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_name", insertable = false, updatable = false)
    private Course course;

    private Integer price;

    @Column(name = "subscription_date")
    private Date subscriptionDate;

    public Purchase() {
    }

    public Purchase(Student student, Course course, Integer price, Date subscriptionDate) {
        this.student = student;
        this.course = course;
        this.price = price;
        this.subscriptionDate = subscriptionDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(Date subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "purchaseListKey=" + purchaseListKey +
                ", student=" + student +
                ", course=" + course +
                ", price=" + price +
                ", subscriptionDate=" + subscriptionDate +
                '}';
    }
}
