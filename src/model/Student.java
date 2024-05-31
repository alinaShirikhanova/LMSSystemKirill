package model;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
    private long id;
    private static long lastId = 1;
    private String name;
    private String lastName;
    private String surname;
    private LocalDate birthdate;

    public Student(String name, String lastName, String surname, LocalDate birthdate) {
        this.id = lastId++;
        this.name = name;
        this.lastName = lastName;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public Student() {
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
        Student.lastId = lastId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

