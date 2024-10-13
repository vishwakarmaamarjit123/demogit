package com.ty.spring.springdbprac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class controller {
    @Autowired
    private StudentRepo studentRepo;

    @PostMapping
    public String save(@RequestBody Student student){
    studentRepo.save(student);
    return student.toString();
    }

    @PutMapping
    public String update(@RequestBody Student student){
        studentRepo.save(student);
        return student.toString();
    }

    @GetMapping
    public List<Student> find(@RequestParam double d){
       return studentRepo.findByPrice(d);
    }
    


}
