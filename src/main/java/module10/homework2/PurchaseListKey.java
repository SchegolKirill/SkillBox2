package module10.homework2;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;

public class PurchaseListKey implements Serializable {

    static final long serialVersionUID = 1L;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "course_name")
    private String courseName;

    public PurchaseListKey() {
    }

    public PurchaseListKey(String studentName, String courseName) {
        this.studentName = studentName;
        this.courseName = courseName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseListKey that = (PurchaseListKey) o;
        return studentName.equals(that.studentName) && courseName.equals(that.courseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, courseName);
    }
}
