package model;

import java.util.Objects;

public class Enrollment {
    private long id;
    private static long lastId= 0;
    private Student student;
    private Course course;

    public Enrollment(Student student, Course course) {
        this.id = lastId++;
        this.student = student;
        this.course = course;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static long getLastId() {
        return lastId;
    }

    public static void setLastId(long lastId) {
        Enrollment.lastId = lastId;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enrollment that = (Enrollment) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
