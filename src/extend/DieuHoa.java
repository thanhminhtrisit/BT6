package extend;

public class DieuHoa extends ThietBiDien {

	public DieuHoa(int congSuat, String chucNang) {
		super(congSuat, chucNang);
		// TODO Auto-generated constructor stub
	}

	public void lamLanh() {
		if (chucNang.contains("làm lạnh")) {
			System.out.println("Điều hòa đang làm lạnh.");
		} else {
			System.out.println("Điều hòa không có chức năng làm lạnh.");
		}
	}

	public void lamNong() {
		if (chucNang.contains("làm nóng")) {
			System.out.println("Điều hòa đang làm nóng.");
		} else {
			System.out.println("Điều hòa không có chức năng làm nóng.");
		}
	}
}
