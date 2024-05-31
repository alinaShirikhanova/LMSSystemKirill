package repository;

import model.Student;

import javax.swing.text.DefaultTextUI;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private static String username = "postgres";
    private static String password = "123";
    private static String url = "jdbc:postgresql://localhost:5432/postgres";

    public List<Student> getAllStudents()  {
        List<Student> students = new ArrayList<>();
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM lms.student");
            while (resultSet.next()){
                long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String lastname = resultSet.getString("lastname");
                String surname = resultSet.getString("surname");
                String birthdate = resultSet.getString("date");
                students.add(new Student(name, lastname, surname, LocalDate.now()));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return students;

    }





}
