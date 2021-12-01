package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// Mainly responsible for the business logic.
// In simple words; this will help to transit data between API layer to data access from database layer.
// So basically, it's the service layer.

// Telling that this class has to service as a spring bean.
// @Component works the same but Service is better because of semantics.
@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Muntaha",
                        "muntaha.islam0019@gmail.com",
                        LocalDate.of(1999, Month.JULY, 19),
                        22
                )
        );
    }
}