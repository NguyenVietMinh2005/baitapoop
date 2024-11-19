package diemsv;

import java.util.Arrays;
import java.util.Scanner;

public class SapXepDiem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// nhap so sinh vien;
		System.out.println("Nhap so sinh vien :");
		int n = sc.nextInt();
		// nhap diem sinh vien
		int[] diem = new int[n];
		System.out.println("Nhap diem cho " + n + " sinh vien (thang diem 100) : ");
		for (int i = 0; i < n; i++) {
			System.out.print("diem sinh vien thu " + (i + 1) + " :");
			diem[i] = sc.nextInt();
		}
		// sap xep danh sach diem
		Arrays.sort(diem); // sort trong class Arrays de xep cac phan tu tang dan
		System.out.println("Diem cao nhat: " + diem[n - 1]);
		System.out.println("Danh sach diem tang dan : ");
		for (int i : diem) {
			System.out.print(i + " ");
		}

	}


}
