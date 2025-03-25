package linkedTask.linkedStudentService;

import linkedTask.models.LinkedStudent;

import java.util.List;

public interface StudentService {
    String addStudent(LinkedStudent student);

    List<LinkedStudent> getAllStudents();

    LinkedStudent getStudentByName(String studentName);

    LinkedStudent updateStudent(String studentName, LinkedStudent student);

    String deleteStudent(String studentName);

    String sortableStudentByName(String studentName);

    String sortableStudentByPoint(double point);

    String sortableStudentByGroup(String group);
}
