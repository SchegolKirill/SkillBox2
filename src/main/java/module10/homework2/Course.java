package module10.homework2;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "duration")
    private Integer duration;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "enum", name = "type")
    private CourseType courseType;

    @Column(name = "description")
    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @Column(name = "students_count")
    private Integer studentsCount;

    @Column(name = "price")
    private Integer price;

    @Column(name = "price_per_hour")
    private Float pricePerHour;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "course")
    private List<Subscription> subscriptions;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "course")
    private List<Purchase> purchases;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "subscriptions",
    joinColumns = {@JoinColumn(name = "course_id")},
    inverseJoinColumns = {@JoinColumn(name = "student_id")})
    private List<Student> students;

    public Course() {
    }

    public Course(Integer id, String name, Integer duration, CourseType courseType, String description,
                  Teacher teacher, Integer studentsCount, Integer price, Float pricePerHour,
                  List<Subscription> subscriptions, List<Purchase> purchases, List<Student> students) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.courseType = courseType;
        this.description = description;
        this.teacher = teacher;
        this.studentsCount = studentsCount;
        this.price = price;
        this.pricePerHour = pricePerHour;
        this.subscriptions = subscriptions;
        this.purchases = purchases;
        this.students = students;
    }

    public void addSubscriptionToCourse(Subscription subscription){
        if(subscriptions == null){
            subscriptions = new ArrayList<>();
        }
        subscriptions.add(subscription);
    }

    public void addPurchaseToStudent(Purchase purchase){
        if(purchases == null){
            purchases = new ArrayList<>();
        }
        purchases.add(purchase);
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Integer getStudentsCount() {
        return studentsCount;
    }

    public void setStudentsCount(Integer studentsCount) {
        this.studentsCount = studentsCount;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Float getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Float pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", courseType=" + courseType +
                ", description='" + description + '\'' +
                ", teacher=" + teacher +
                ", studentsCount=" + studentsCount +
                ", price=" + price +
                ", pricePerHour=" + pricePerHour +
                '}';
    }
}
