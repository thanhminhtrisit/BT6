package pojo;


import java.util.List;

public class HocSinh {
	private String ten;
    private int tuoi;
    private List<Double> diem;

    public HocSinh(String ten, int tuoi, List<Double> diem) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diem = diem;
    }

    public void inThongTin() {
        System.out.println("Tên: " + ten + ", Tuổi: " + tuoi + ", Điểm: " + diem);
    }

    public double tinhDiemTrungBinh() {
        double tongDiem = 0;
        for (double d : diem) {
            tongDiem += d;
        }
        return tongDiem / diem.size();
    }
}
