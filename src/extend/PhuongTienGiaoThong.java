package extend;

public class PhuongTienGiaoThong {
	protected String hangSanXuat;
	protected String mauSac;
	protected int namSanXuat;

	public PhuongTienGiaoThong(String hangSanXuat, String mauSac, int namSanXuat) {
		this.hangSanXuat = hangSanXuat;
		this.mauSac = mauSac;
		this.namSanXuat = namSanXuat;
	}

	public void hienThiThongTin() {
		System.out.println("Hãng sản xuất: " + hangSanXuat + ", Màu sắc: " + mauSac + ", Năm sản xuất: " + namSanXuat);
	}
}
