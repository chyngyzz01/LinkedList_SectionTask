package linkedTask.linkedStudentService.linkedStudentServiceImpl;

import linkedTask.linked_db.Linked_DB;
import linkedTask.models.LinkedStudent;
import linkedTask.linkedStudentService.StudentService;

import java.util.*;

public class StudentServiceImpl implements StudentService {
    @Override
    public String addStudent(LinkedStudent student) {
        System.out.println(Linked_DB.dbStudents + "students");
        List<LinkedStudent> students = new LinkedList<>();
        students.add(student);
        Linked_DB.dbStudents.addAll(students);
        return "Success full added";
    }

    @Override
    public List<LinkedStudent> getAllStudents() {
        return Linked_DB.dbStudents;
    }

    @Override
    public LinkedStudent getStudentByName(String studentName) {
        LinkedStudent findStudent = new LinkedStudent();
        for (LinkedStudent dbStudent : Linked_DB.dbStudents) {
            if (dbStudent.getFirstName().toUpperCase().equals(studentName.toUpperCase())) {
                findStudent = dbStudent;
            }
        }
        return findStudent;
    }

    @Override
    public LinkedStudent updateStudent(String studentName, LinkedStudent student) {
        LinkedStudent updateStudentByName = new LinkedStudent();
        for (LinkedStudent dbStudent : Linked_DB.dbStudents) {
            if (dbStudent.getFirstName().toUpperCase().equals(studentName.toUpperCase())) {
                dbStudent.setId(student.getId());
                dbStudent.setFirstName(student.getFirstName());
                dbStudent.setEmail(student.getEmail());
                dbStudent.setDateOfBirth(student.getDateOfBirth());
                dbStudent.setPoint(student.getPoint());
                dbStudent.setGroup(student.getGroup());
                updateStudentByName = dbStudent;
            }
        }
        return updateStudentByName;
    }

    @Override
    public String deleteStudent(String studentName) {
        for (LinkedStudent dbStudent : Linked_DB.dbStudents) {
            if (dbStudent.getFirstName().toUpperCase().equals(studentName.toUpperCase())) {
                Linked_DB.dbStudents.remove(dbStudent);
                return "Success full deleted";
            }
        }
        return "Student name is not found";
    }


    @Override
    public String sortableStudentByName(String studentName) {
        Collections.sort(Linked_DB.dbStudents);
        return "Success full sorted";
    }

    @Override
    public String sortableStudentByPoint(double point) {
        Collections.sort(Linked_DB.dbStudents);
        return "Success full sorted";
    }

    @Override
    public String sortableStudentByGroup(String group) {
        Collections.sort(Linked_DB.dbStudents);
        return "Success full sorted";
    }


}
