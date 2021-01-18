package thuchanh;

import myPackage.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Khoi tao doi tuong mang;
        Student [] students = new Student[3];

        // Nhap phan tu vao mang;
        Scanner scanner = new Scanner(System.in);

        // Vong lap cac thanh phan;
        for (int i = 0; i < students.length; i++) {
            System.out.println("Nhap ten :");
            String name = scanner.nextLine();

            System.out.println("Nhap dia chi :");
            String index = scanner.nextLine();

            System.out.println("Nhap tuoi :");
            int age = scanner.nextInt();

            // Thanh phan cua Obj;
            students[i] = new Student(name, index, age);

            // Xoa bo nho dem cua ban phim nhap;
            scanner.nextLine();
        }

        // Duyet lan luot cac phan tu trong mang;
        for (Student nv : students) {
            System.out.println("Index :" + nv.getIndex() + "\n"
                    + "Name : " + nv.getName() + "\n"
                    + "Age : " + nv.getAge());
        }
    }
}
