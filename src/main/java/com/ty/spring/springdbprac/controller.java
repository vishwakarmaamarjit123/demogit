package com.ty.spring.springdbprac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class controller {
    @Autowired
    private StudentRepo studentRepo;

    @PostMapping
    public String save(@RequestBody Student student) {
        studentRepo.save(student);
        return student.toString();
    }

    @PutMapping
    public String update(@RequestBody Student student) {
        studentRepo.save(student);
        return student.toString();
    }

    @GetMapping
    public List<Student> find(@RequestParam double d) {
        return studentRepo.findByPrice(d);
    }

    @DeleteMapping
    public String deleteById(@RequestParam int id) {
        Optional<Student> optional = studentRepo.findById(id);
        if (optional != null) {
            studentRepo.deleteById(id);
            return optional.get().toString();
        }
        return "can't delete";
    }

}
