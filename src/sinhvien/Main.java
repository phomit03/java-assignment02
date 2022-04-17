package seasion2.sinhvien;

public class Main {
    public static void main(String[] args) {

        SinhVien sv = new SinhVien(); //tạo hàm khởi tạo SinhVien

        sv.age = 20;

        int x;
        x = 10;

//        SinhVien nguyenxuanthao = new SinhVien(); //tạo thêm 1 hàm khởi tạo

        //input khai báo sẵn
//        sv.name = "Nguyễn Văn A";
//        nguyenxuanthao.name = "Nguyễn Xuân Thảo";

        //input nhập từ bàn phím
//        Scanner sc = new Scanner(System.in)
//        sv.name = sc.nextLine();
//        nguyenxuanthao.name = sc.nextLine();

        Classroom c = new Classroom(); //tạo hàm khởi tạo classroom
        sv.myClass = c;
        c.inputClassroom();
        c.outputClassroom();
//        nguyenxuanthao.myClass = c;

        sv.study(); //goi ham study
//        nguyenxuanthao.study();
    }
}
