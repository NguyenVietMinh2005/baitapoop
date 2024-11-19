package bai5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salary;

        System.out.println("Nhập lương của người (nhập -1 để kết thúc):");

        while (true) {
            System.out.print("Lương: ");
            salary = scanner.nextDouble();

            if (salary == -1) {
                break; // Kết thúc chương trình khi người dùng nhập -1
            }

            try {
                checkSalary(salary);
                System.out.println("Lương hợp lệ: " + salary + " triệu đồng.");
            } catch (OutOfRangeException e) {
                System.out.println("Lỗi: " + e.getMessage());
                // Chương trình sẽ tiếp tục cho phép nhập lương khác
            }
        }

        scanner.close();
    }

    private static void checkSalary(double salary) throws OutOfRangeException {
        if (salary < 5 || salary > 20) {
            throw new OutOfRangeException("Lương phải nằm trong khoảng từ 5 triệu đến 20 triệu đồng.");
        }
    }
}
