package bai3;

import java.util.Scanner;

public class Test {
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		String input;
		
		System.out.println("nhap chuoi (nhap 'DONE' de ket thuc):");
		
		while(true) {
			input = sc.nextLine();
			if(input.equals("DONE")) {
				break;
			}
			
			try {
				checkStringLength(input);
				System.out.println("chuoi hop le: "+ input);
			}
			catch(StringTooLongException e) {
				System.out.println("loi: "+e.getMessage());
				break;//ket thuc chuong trinh khi gap loi
			}
		}
		
		sc.close();
		
	}
	
	private static void checkStringLength(String str) throws StringTooLongException {
		if(str.length() > 30) {
			throw new StringTooLongException("chuoi khong duoc vuot qua 30 ky tu.");
		}
	}

}
