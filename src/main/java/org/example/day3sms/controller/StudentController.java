package org.example.day3sms.controller;

import org.example.day3sms.model.StudentModel;
import org.example.day3sms.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

      private final StudentService service;

      public StudentController(StudentService service){
          this.service = service;
      }

      // create function API
      @PostMapping("add-student/")
          public StudentModel addStudent(@RequestBody StudentModel student){
              return service.addStudent(student);
          }
      }


