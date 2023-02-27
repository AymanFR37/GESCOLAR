package ma.gescolar.school.controllers;

import ma.gescolar.school.models.Student;
import ma.gescolar.school.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Students")
//@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public Student add(@RequestBody Student student) {
        return studentService.add(student);
    }

    @PostMapping("/addAll")
    public List<Student> addAll(List<Student> students) {
        return studentService.addAll(students);
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/id/{matricule}")
    public Student getStudentById(@PathVariable int matricule) {
        return studentService.getStudentById(matricule);
    }

    @PutMapping("/update")
    public Student update(Student student) {
        return studentService.update(student);
    }

    @DeleteMapping("/delete")
    public String delete(int matricule) {
        return studentService.delete(matricule);
    }
}
