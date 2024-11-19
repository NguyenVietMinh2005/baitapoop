package chuong4;

public class ThoiGian {
	private int ngay;
    private int thang;
    private int nam;
	
	
	
    public ThoiGian(int ngay, int thang, int nam) throws InvalidDateException {
        if (ngay < 1 || thang < 1 || nam < 0) {
            throw new InvalidDateException("Ngày, tháng, năm không được là số âm hoặc bằng 0.");
        }
        if (thang > 12) {
            throw new InvalidDateException("Tháng không được lớn hơn 12.");
        }
        if (ngay > 31) {
            throw new InvalidDateException("Ngày không được lớn hơn 31.");
        }
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    @Override
    public String toString() {
        return ngay + "/" + thang + "/" + nam;
    }
}
