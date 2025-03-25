import linkedTask.linkedStudentService.StudentService;
import linkedTask.linkedStudentService.linkedStudentServiceImpl.StudentServiceImpl;
import linkedTask.linked_db.Linked_DB;
import linkedTask.models.LinkedStudent;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        // 1 linked task with methods

//        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Alma", "Almurut", "Alcha", "Abrikos"));
//
//        tasks_with_methods.Linked_List.taskLinkedList(linkedList);


        // CRUD STUDENT
        StudentService studentService = new StudentServiceImpl();
        List<LinkedStudent> students = new LinkedList<>();
        Linked_DB.dbStudents.add(new LinkedStudent(1L, "Chyngyz", "chyngyz@gmail.com", LocalDate.of(2001, 1, 1), 9, "React"));
        Linked_DB.dbStudents.add(new LinkedStudent(2L, "Junusbek", "junusbek@gmail.com", LocalDate.of(2003, 1, 1), 10, "C++"));
        Linked_DB.dbStudents.add(new LinkedStudent(3L, "Sanjar", "sanjar@gmail.com", LocalDate.of(2004, 1, 1), 11, "Angular"));

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                    1 - add student        3 - get student by name      5 - delete student by name
                    2 - get all students   4 - update student by name
                    """);

            switch (scanner.nextInt()) {
                case 1:
                    System.out.println(studentService.addStudent(new LinkedStudent(4L, "Nurtilek", "nurtilek@gmail.com", LocalDate.of(2003, 1, 1), 10, "Java")));
                    break;
                case 2:
                    System.out.println(studentService.getAllStudents());
                    break;
                case 3:
                    System.out.println(studentService.getStudentByName("Chyngyz"));
                    break;
                case 4:
                    System.out.println(studentService.updateStudent("Chyngyz", new LinkedStudent(11L, "Asan", "asan@gmail.com", LocalDate.of(2000, 12, 12), 15.5, "JS")));
                    break;
                case 5:
                    System.out.println(studentService.deleteStudent("asan"));
                    break;
                case 6:
                    System.out.println(studentService.sortableStudentByName("Chyngyz"));
                    break;
                case 7:
                    System.out.println(studentService.sortableStudentByPoint(5));
                    break;
                case 8:
                    System.out.println(studentService.sortableStudentByGroup("Java"));
                    break;
                default:
                    System.out.println("Enter the correct number!!!");
            }
        }
    }
}