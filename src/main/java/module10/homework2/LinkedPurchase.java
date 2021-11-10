package module10.homework2;

import javax.persistence.*;

@Entity
@Table(name = "linked_purchaselist")
public class LinkedPurchase {

    @EmbeddedId
    private LinkedPurchaseListKey id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id", insertable = false, updatable = false)
    private Student student;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id", insertable = false, updatable = false)
    private Course course;

//    @Column(name = "student_id", insertable = false, updatable = false)
//    private Integer studentId;
//
//    @Column(name = "course_id", insertable = false, updatable = false)
//    private Integer courseId;

    public LinkedPurchase() {
    }

    public LinkedPurchase(LinkedPurchaseListKey id, Student student, Course course) {
        this.id = id;
        this.student = student;
        this.course = course;
    }

    public LinkedPurchaseListKey getId() {
        return id;
    }

    public void setId(LinkedPurchaseListKey id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "LinkedPurchaseList{" +
                "student=" + student +
                ", course=" + course +
                '}';
    }
}
