package Bai4;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Nhập chuỗi (nhập 'DONE' để kết thúc):");

        while (true) {
            input = scanner.nextLine();

            if (input.equals("DONE")) {
                break;
            }

            try {
                checkStringLength(input);
                System.out.println("Chuỗi hợp lệ: " + input);
            } catch (StringTooLongException e) {
                System.out.println("Lỗi: " + e.getMessage());
                // Chương trình sẽ tiếp tục cho phép nhập chuỗi khác
            }
        }

        scanner.close();
    }

    private static void checkStringLength(String str) throws StringTooLongException {
        if (str.length() > 20) {
            throw new StringTooLongException("Chuỗi không được vượt quá 20 ký tự.");
        }
    }
}


