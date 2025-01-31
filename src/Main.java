import com.anshul.beans.Student;
import com.anshul.factory.StudentServiceFactory;
import com.anshul.service.StudentService;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println("=============STUDENT MANAGEMENT SYSTEM=============");
        try(
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            StudentService studentService = StudentServiceFactory.getStudentService();
            String sid= "", sname = "", saddr = "";
            String status = "";
            Student student = null;
            while (true) {
                System.out.println();
                System.out.println("1. ADD Student");
                System.out.println("2. SEARCH Student");
                System.out.println("3. SEARCH ALL Students");
                System.out.println("4. UPDATE Student");
                System.out.println("5. DELETE Student");
                System.out.println("6. EXIT");
                System.out.print("Your Option  : ");
                int option = Integer.parseInt(br.readLine());
                System.out.println();
                switch (option) {
                    case 1:
                        System.out.println("Welcome To Student ADD Module");
                        System.out.print("Student ID      : ");
                        sid = br.readLine();
                        Student std = studentService.searchStudent(sid);
                        if(std == null) {


                            System.out.print("Student NAME    : ");
                            sname = br.readLine();
                            System.out.print("Student ADDRESS : ");
                            saddr = br.readLine();


                            student = new Student(sid, sname, saddr);
                            status = studentService.addStudent(student);


                            if (status.equalsIgnoreCase("SUCCESS")) {
                                System.out.println("Student Added Successfully");
                            }
                            if (status.equalsIgnoreCase("FAILURE")) {
                                System.out.println("Student Insertion Failed");
                            }


                        }else{
                            System.out.println("Student Already Existed");
                        }
                        break;
                    case 2:
                        System.out.println("Welcome To Student SEARCH Module");
                        System.out.print("Student ID      : ");
                        sid = br.readLine();
                        student = studentService.searchStudent(sid);
                        if(student == null) {
                            System.out.println("Student Does Not Exist");
                        }else{
                            System.out.println("Student Found With the Details");
                            System.out.println("Student ID      : "+student.getSid());
                            System.out.println("Student NAME    : "+student.getSname());
                            System.out.println("Student ADDRESS : "+student.getSaddr());
                        }
                        break;
                    case 3:
                        System.out.println("Welcome To SEARCH-ALL Module");
                        List<Student> students = studentService.searchAllStudent();
                        for(Student stud: students){
                            System.out.println(stud);
                        }
                        break;
                    case 4:
                        System.out.println("Welcome To Student UPDATE Module");
                        System.out.print("Student ID      : ");
                        sid = br.readLine();
                        student = studentService.searchStudent(sid);
                        if(student == null) {
                            System.out.println("Student Does Not Exist");
                        }else {
                            System.out.print("Student Name    : OLD : "+student.getSname()+" NEW : ");
                            sname = br.readLine();
                            if(sname == null || sname.equals("")) {
                                sname = student.getSname();
                            }
                            System.out.print("Student Address : OLD : "+student.getSaddr()+" NEW : ");
                            saddr = br.readLine();
                            if(saddr == null || saddr.equals("")) {
                                saddr = student.getSaddr();
                            }
                            student = new Student(sid, sname, saddr);
                            status = studentService.updateStudent(student);
                            if (status.equalsIgnoreCase("SUCCESS")) {
                                System.out.println("Student Updated Successfully");
                            }else{
                                System.out.println("Student Update Failed");
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Welcome To Student DELETE Module");
                        System.out.print("Student ID      : ");
                        sid = br.readLine();
                        student = studentService.searchStudent(sid);
                        if(student == null) {
                            System.out.println("Student Does Not Exist");
                        }else{
                            status = studentService.deleteStudent(sid);
                            if (status.equalsIgnoreCase("SUCCESS")) {
                                System.out.println("Student Deleted Successfully");
                            }else{
                                System.out.println("Student Delete Failed");
                            }
                        }
                        break;
                    case 6:
                        System.out.println("Thank You for Using Student Management System");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Option, Enter the correct option from 1,2,3,4,5 and 6");
                        break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


