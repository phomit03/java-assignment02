package seasion2.fraction;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Fraction fr1 = new Fraction();
        Fraction fr2 = new Fraction();
        Scanner sc = new Scanner(System.in);

        //Nhập vào 2 phân số
        System.out.println("1) Enter the first seasion2.fraction.");
        fr1.enterFrac(sc);
        System.out.println("\nEnter second seasion2.fraction.");
        fr2.enterFrac(sc);

        //in 2 phân số
        System.out.println("\n2) The first seasion2.fraction is: ");
        fr1.display();
        System.out.println("Second seasion2.fraction is: ");
        fr2.display();

        //rút gọn phân số
        System.out.println("\n3) The first seasion2.fraction is reduced to: ");
        fr1.compactFraction();
        System.out.println("The second seasion2.fraction is reduced to: ");
        fr2.compactFraction();

        //nghịch đảo phân số
        System.out.println("\n4) The inverse of the first seasion2.fraction is: ");
        fr1.inverseFraction();
        System.out.println("The inverse of the second seasion2.fraction is: ");
        fr2.inverseFraction();

        Fraction fr3 = new Fraction();
        //tính tổng 2 phân số
        System.out.println("\n5) The sum of 2 fractions is: ");
        fr1.add(fr2).compactFraction(); //tính tổng và rút gọn

        //tính hiệu 2 phân số
        System.out.println("\n6) The difference of 2 fractions is: ");
        fr1.sub(fr2).compactFraction(); //tính hiệu và rút gọn

        //tính tích 2 phân số
        System.out.println("\n7) The product of 2 fractions is: ");
        fr1.mul(fr2).compactFraction(); //tính tích và rút gọn

        //tính thương 2 phân số
        System.out.println("\n8) The quotient of 2 fractions is: ");
        fr1.div(fr2).compactFraction(); //tính thương và rút gọn

    }


}

