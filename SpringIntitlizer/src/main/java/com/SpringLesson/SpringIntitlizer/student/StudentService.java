package com.SpringLesson.SpringIntitlizer.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addStudent(Student student) {
        Optional<Student> studentByEmail=studentRepository.findStudentByEmail(student.getEmail());
        if(studentByEmail.isPresent()){
           throw new IllegalStateException("email taken");
        }
        studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
       if(!studentRepository.existsById(id)){
         throw new IllegalStateException("Student with the Id"+id+ " doesnot exists");
       }
       studentRepository.deleteById(id);
    }
    @Transactional
    public void updateStudent(Long id, String name, String email) {
        if(!studentRepository.existsById(id)){
            throw new IllegalStateException("Student with the Id"+id+ " doesnot exists");
        }
        Student student =studentRepository.getById(id);
        Optional<Student> studentByEmail=studentRepository.findStudentByEmail(email);
        if(studentByEmail.isPresent()){
            throw new IllegalStateException("email taken");
        }

        student.setName(name);
        student.setEmail(email);
    }
}
