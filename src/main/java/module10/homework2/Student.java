package module10.homework2;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer age;

    @Column(name = "registration_date")
    private Date registrationDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private List<Subscription> subscriptions;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private List<Purchase> purchases;

    public Student() {
    }

    public Student(Integer id, String name, Integer age,
                   Date registrationDate, List<Subscription> subscriptions, List<Purchase> purchases) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.registrationDate = registrationDate;
        this.subscriptions = subscriptions;
        this.purchases = purchases;
    }

    public void addSubscriptionToStudent(Subscription subscription){
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", registrationDate=" + registrationDate +
                '}';
    }
}
