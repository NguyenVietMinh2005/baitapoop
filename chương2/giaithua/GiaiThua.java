package giaithua;

import java.util.Scanner;

public class GiaiThua {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = 0;
			do {
				System.out.println("Nhap so nguyen n >= 0 : ");
				n = sc.nextInt();
			} while (n < 0);
			long giaiThua = 1;
			if (n == 0)
				giaiThua = 0;
			else {
				for (int i = 1; i <= n; i++) {
					giaiThua *= i;
				}
			}
			System.out.println("n! = " + giaiThua);
		}
	}

}
