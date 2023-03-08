package demo;

public class Nhanvien {
	
	String manv;
	String tennv;
	String chucvu;
	double luong;
	
	public Nhanvien() {
		// TODO Auto-generated constructor stub
	}

	public Nhanvien(String manv, String tennv, String chucvu, double luong) {
		this.manv = manv;
		this.tennv = tennv;
		this.chucvu = chucvu;
		this.luong = luong;
	}

	public String getManv() {
		return manv;
	}

	public void setManv(String manv) {
		this.manv = manv;
	}

	public String getTennv() {
		return tennv;
	}

	public void setTennv(String tennv) {
		this.tennv = tennv;
	}

	public String getChucvu() {
		return chucvu;
	}

	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}
	
	
	
}
