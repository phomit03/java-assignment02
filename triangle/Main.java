package seasion2.triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle tg = new Triangle();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 3 cạnh của tam giác: ");
        tg.a = sc.nextInt();
        tg.b = sc.nextInt();
        tg.c = sc.nextInt();

        System.out.println("Chu vi của 3 cạnh tam giác là: " + tg.calculatePerimeter());

        System.out.println("Diện tích 3 cạnh của tam giác là: " + tg.calculateArea());
    }
}
