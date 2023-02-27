package ma.gescolar.school.services;

import ma.gescolar.school.models.Student;

import java.util.List;

public interface StudentService {
    Student add(Student student);
    List<Student> addAll(List<Student> students);
    List<Student> getStudents();
    Student getStudentById(int matricule);
    Student update(Student student);
    String delete(int matricule);
}
