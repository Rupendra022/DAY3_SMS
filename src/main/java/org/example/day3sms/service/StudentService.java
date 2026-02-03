package org.example.day3sms.service;

import org.example.day3sms.controller.dto.StudentRequestDto;
import org.example.day3sms.model.StudentModel;
import org.example.day3sms.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository ;


    public StudentService(StudentRepository repository){

        this.repository = repository;
    }

    // create
    public StudentModel addStudent(StudentModel student){
        return repository.save(student);
    }

    // Display Students
    public List<StudentModel> getStudents(){
        return repository.findAll();

    }

    // update
    public StudentModel updateStudent(String id , StudentModel student){
        StudentModel existingStudent = repository.findById(id).orElseThrow(() -> new RuntimeException("No Student found"));

        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        existingStudent.setEmail(student.getEmail());

        return repository.save(existingStudent);
    }

    public void deleteStudent(String id){
        StudentModel existingStudent = repository.findById(id).orElseThrow(() -> new RuntimeException("No Student found"));
        repository.delete(existingStudent);
    }

    public StudentRequestDto addStudent(StudentRequestDto dto){
        StudentModel.setAge(dto.getAge());
        StudentModel.setEmail(dto.getEmail());
        StudentModel.setName(dto.getName());




}

// services k andr 2 object kyo bnaye jaa rhi h
// 1. for user
// 2 . for database
}


