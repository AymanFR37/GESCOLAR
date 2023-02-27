package ma.gescolar.school.services;

import ma.gescolar.school.models.Student;
import ma.gescolar.school.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student add(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> addAll(List<Student> students) {
        return studentRepository.saveAll(students);
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(int matricule) {
        return studentRepository.findById(matricule).orElse(null);
    }

    @Override
    public Student update(Student student) {
        Student existingStudent = studentRepository.findById(student.getMatricule()).orElse(null);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        return     studentRepository.save(existingStudent);
    }

    @Override
    public String delete(int matricule) {
        studentRepository.deleteById(matricule);
        return "Student deleted succesfully !";
    }
}
