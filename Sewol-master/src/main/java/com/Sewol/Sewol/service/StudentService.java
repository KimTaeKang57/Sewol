package com.Sewol.Sewol.service;

import com.Sewol.Sewol.entity.Student;
import com.Sewol.Sewol.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    // 모든 학생 조회
    public List<Student> findAllStudent() {
        return studentRepository.findAllStudent();
    }

    // 정확히 일치하는 이름으로 조회
    public List<Student> findStudentExact(String studentName) {
        return studentRepository.findStudentExact(studentName);
    }

    // 이름을 포함하는 결과 조회
    public List<Student> findStudentInclude(String studentName) {
        return studentRepository.findStudentInclude(studentName);
    }

    // 해당 학년 결과 조회
    public List<Student> findStudentByGrade(String grade) {
        return studentRepository.findByGrade(grade);
    }

    // 해당 반에 결과 조회
    public List<Student> findStudentByClass(String classNumber) {
        return studentRepository.findByClassNumber(classNumber);
    }

    /**
    // 모든 학생 조회
    public Page<Student> findAllStudent(Pageable pageable) {
        return studentRepository.findAllStudent(pageable);
    }

    // 정확히 일치하는 이름으로 조회
    public Page<Student> findStudentExact(String studentName, Pageable pageable) {
        return studentRepository.findStudentExact(studentName, pageable);
    }

    // 이름을 포함하는 결과 조회
    public Page<Student> findStudentInclude(String studentName, Pageable pageable) {
        return studentRepository.findStudentInclude(studentName, pageable);
    }

    // 해당 학년 결과 조회
    public Page<Student> findStudentByGrade(String grade, Pageable pageable) {
        return studentRepository.findByGrade(grade, pageable);
    }

    // 해당 반에 결과 조회
    public Page<Student> findStudentByClass(String classNumber, Pageable pageable) {
        return studentRepository.findByClassNumber(classNumber, pageable);
    }
     */
}
