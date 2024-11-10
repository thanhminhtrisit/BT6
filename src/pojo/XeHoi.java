package pojo;

public class XeHoi {
	private String hangSanXuat;
    private String mauSac;
    private int namSanXuat;

    public XeHoi(String hangSanXuat, String mauSac, int namSanXuat) {
        this.hangSanXuat = hangSanXuat;
        this.mauSac = mauSac;
        this.namSanXuat = namSanXuat;
    }

    public void hienThiThongTin() {
        System.out.println("Hãng sản xuất: " + hangSanXuat + ", Màu sắc: " + mauSac + ", Năm sản xuất: " + namSanXuat);
    }
}
