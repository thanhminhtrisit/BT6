package pojo;

public class TroChoi {
	 private String ten;
	    private int soLuotChoi;
	    private boolean dangChoi;

	    public TroChoi(String ten, int soLuotChoi) {
	        this.ten = ten;
	        this.soLuotChoi = soLuotChoi;
	        this.dangChoi = false;
	    }

	    public void batDau() {
	        dangChoi = true;
	        System.out.println("Bắt đầu trò chơi! ");
	    }

	    public void ketThuc() {
	        dangChoi = false;
	        System.out.println("Kết thúc trò chơi! ");
	    }
}
