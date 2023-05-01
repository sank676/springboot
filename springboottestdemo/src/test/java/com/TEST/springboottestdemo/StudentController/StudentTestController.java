package com.TEST.springboottestdemo.StudentController;

import com.TEST.springboottestdemo.entity.Student;
import com.TEST.springboottestdemo.service.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(StudentTestController.class)

public class StudentTestController {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private StudentService studentService;
    private Student student;
    @BeforeEach
    void setup(){
        student=new Student(1,"sankari","kerala","245108");
    }
    @Test
    void testSaveStudent() throws Exception{
        Student student =new Student(1,"sankari","kerala","245108");
        Mockito.when(studentService.addStudent(student)).thenReturn(student);
        mockMvc.perform(MockMvcRequestBuilders.post("/student/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\r\n" +
                                " \"id\" : 1, \r\n" +
                                " \"name\" : \"sankari\", \r\n" +
                                " \"address\" :\"kerala\", \r\n" +
                                " \"rollNo\" : \"245108\" \r\n" + "}"))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }
}
