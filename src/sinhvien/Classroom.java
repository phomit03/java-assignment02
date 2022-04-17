package seasion2.sinhvien;

import java.util.Scanner;

public class Classroom {
    String nameClass;    //tên lớp
    String room;    //tên phòng học
    String schoolName;  //tên trường

    public Classroom() {
        //yêu cầu nhập thông tin từ bàn phím:
        System.out.println("Please enter information from the keyboard: ");
    }

    void inputClassroom(){ //khởi tạo đối tượng (nhập vào từ bàn phím)
        Scanner sc = new Scanner(System.in);
        this.nameClass = sc.nextLine();
        this.room = sc.nextLine();
        this.schoolName = sc.nextLine();
    }
    void outputClassroom(){
        //yêu cầu nhập thông tin từ bàn phím:
        System.out.println("Enter class name: ");
        this.inputClassroom();
        System.out.println("Enter classroom name: ");
        this.inputClassroom();
        System.out.println("Enter school name: ");
        this.inputClassroom();

    }

    public void opening() {
        System.out.println("Opening...");
    }

    public void endOfCourse() {
        System.out.println("End of course...");
    }

    public void end() {
        System.out.println("End...");
    }

}
