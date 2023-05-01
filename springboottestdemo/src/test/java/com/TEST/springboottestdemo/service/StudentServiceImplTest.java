package com.TEST.springboottestdemo.service;

import com.TEST.springboottestdemo.entity.Student;
import com.TEST.springboottestdemo.exceptions.StudentNotFoundException;
import com.TEST.springboottestdemo.repository.StudentRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class StudentServiceImplTest {

    @Mock
    private StudentRepo mockStudentRepo;

    @InjectMocks
    private StudentServiceImpl studentServiceImplUnderTest;

    @Test
    void testAddStudent() {
        // Setup
        final Student student = new Student(0, "name", "address", "rollNo");
        final Student expectedResult = new Student(0, "name", "address", "rollNo");

        // Configure StudentRepo.save(...).
        final Student student1 = new Student(0, "name", "address", "rollNo");
        when(mockStudentRepo.save(new Student(0, "name", "address", "rollNo"))).thenReturn(student1);

        // Run the test
        final Student result = studentServiceImplUnderTest.addStudent(student);

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetAllStudent() {
        // Setup
        final List<Student> expectedResult = List.of(new Student(0, "name", "address", "rollNo"));

        // Configure StudentRepo.findAll(...).
        final List<Student> students = List.of(new Student(0, "name", "address", "rollNo"));
        when(mockStudentRepo.findAll()).thenReturn(students);

        // Run the test
        final List<Student> result = studentServiceImplUnderTest.getAllStudent();

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetAllStudent_StudentRepoReturnsNoItems() {
        // Setup
        when(mockStudentRepo.findAll()).thenReturn(Collections.emptyList());

        // Run the test
        final List<Student> result = studentServiceImplUnderTest.getAllStudent();

        // Verify the results
        assertThat(result).isEqualTo(Collections.emptyList());
    }

    @Test
    void testGetStudentById() {
        // Setup
        final Student expectedResult = new Student(0, "name", "address", "rollNo");

        // Configure StudentRepo.findById(...).
        final Optional<Student> student = Optional.of(new Student(0, "name", "address", "rollNo"));
        when(mockStudentRepo.findById(0)).thenReturn(student);

        // Run the test
        final Student result = studentServiceImplUnderTest.getStudentById(0);

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetStudentById_StudentRepoReturnsAbsent() {
        // Setup
        when(mockStudentRepo.findById(0)).thenReturn(Optional.empty());

        // Run the test
        assertThatThrownBy(() -> studentServiceImplUnderTest.getStudentById(0))
                .isInstanceOf(StudentNotFoundException.class);
    }

    @Test
    void testDeleteStudentById() {
        // Setup
        // Configure StudentRepo.findById(...).
        final Optional<Student> student = Optional.of(new Student(0, "name", "address", "rollNo"));
        when(mockStudentRepo.findById(0)).thenReturn(student);

        // Run the test
        final Student result = studentServiceImplUnderTest.deleteStudentById(0);

        // Verify the results
        assertThat(result).isNull();
        verify(mockStudentRepo).delete(new Student(0, "name", "address", "rollNo"));
    }

    @Test
    void testDeleteStudentById_StudentRepoFindByIdReturnsAbsent() {
        // Setup
        when(mockStudentRepo.findById(0)).thenReturn(Optional.empty());

        // Run the test
        assertThatThrownBy(() -> studentServiceImplUnderTest.deleteStudentById(0))
                .isInstanceOf(StudentNotFoundException.class);
    }

    @Test
    void testGetStudentByName() {
        // Setup
        final List<Student> expectedResult = List.of(new Student(0, "name", "address", "rollNo"));

        // Configure StudentRepo.findByName(...).
        final List<Student> students = List.of(new Student(0, "name", "address", "rollNo"));
        when(mockStudentRepo.findByName("name")).thenReturn(students);

        // Run the test
        final List<Student> result = studentServiceImplUnderTest.getStudentByName("name");

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetStudentByName_StudentRepoReturnsNoItems() {
        // Setup
        when(mockStudentRepo.findByName("name")).thenReturn(Collections.emptyList());

        // Run the test
        final List<Student> result = studentServiceImplUnderTest.getStudentByName("name");

        // Verify the results
        assertThat(result).isEqualTo(Collections.emptyList());
    }
}
