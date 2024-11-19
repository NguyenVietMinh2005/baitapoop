package chuong4;

public class Test {
	
	public static void main(String[] args) {
        try {
            ThoiGian tg1 = new ThoiGian(29, 2, 2024); // Ngày hợp lệ
            System.out.println("Ngày hợp lệ: " + tg1);
            
            ThoiGian tg2 = new ThoiGian(31, 13, 2024); // Tháng không hợp lệ
            System.out.println("Ngày hợp lệ: " + tg2);
        } catch (InvalidDateException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }

        try {
            ThoiGian tg3 = new ThoiGian(-1, 5, 2024); // Ngày âm
            System.out.println("Ngày hợp lệ: " + tg3);
        } catch (InvalidDateException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
