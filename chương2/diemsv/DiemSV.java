package diemsv;
import java.util.Scanner;
import java.util.Arrays;


public class DiemSV {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// nhap danh sach diem tieng anh cho n sinh vien
			System.out.println("Nhap so sinh vien: ");
			int n = sc.nextInt();
			int[] ds = new int[n];
			System.out.println("Nhap danh sach diem cho " + n + " sinh vien (thang diem 100) : ");
			for (int i = 0; i < n; i++) {
				System.out.print("Nhap diem sinh vien thu " + (i + 1) + " :");
				ds[i] = sc.nextInt();
			}
			System.out.println("Danh sach diem : " + Arrays.toString(ds));// hien thi mang theo Arrays
			// for(int i:ds) {
			// System.out.print(i + " ");
			// }
			// nhap diem so bat ky
			System.out.println("\nNhap diem muon tim : ");
			int diem = sc.nextInt();

			// tim kiem theo method Arrays.binarySearch() : tra ve index neu co, neu khong
			// thi tra ve -1
			Arrays.sort(ds);
			int check = Arrays.binarySearch(ds, diem);
			if (check >= 0) {
				System.out.println("Trong danh sach co diem can tim");
			} else
				System.out.println("Trong danh sach khong co diem can tim");
		}

		;

	}
	
}
