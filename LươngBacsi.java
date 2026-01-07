package day5_polypmorphism_tínhlương;

public class LươngBacsi {
//	public String loaiBacsi;
//	public int heSoluong;
//	public double luongCoBan = 10000000;
	
	public double tinhLuong(double _heSoLuong, double _luongCoBan)
	{
		return _heSoLuong*_luongCoBan;
	}
	
	public double tinhLuong(double _heSoLuong, double _luongCoBan, double _soNamKinhNghiem)
	{
		return _heSoLuong*_luongCoBan*_soNamKinhNghiem;
	}
	
	public double tinhLuong(double _heSoLuong, double _luongCoBan, double _soNamKinhNghiem, String loaiBacsi)
	{
		if(loaiBacsi.equals("Chuyên khoa"))
		{
		    return _heSoLuong*_luongCoBan*_soNamKinhNghiem + _luongCoBan*0.2;
		}
		else if(loaiBacsi.equals("Đa khoa"))
		{
			return _heSoLuong*_luongCoBan*_soNamKinhNghiem + _luongCoBan*0.45;
		}
		else
			return _heSoLuong*_luongCoBan*_soNamKinhNghiem;
	}
	

	public static void main(String[] args) {
		LươngBacsi doctor = new LươngBacsi ();
		System.out.println(String.format("%.0f",doctor.tinhLuong(0.5, 10000000, 2, "Chuyên khoa")));
		System.out.println(String.format("%.0f",doctor.tinhLuong(0.5, 10000000, 2, "Đa khoa")));
		System.out.println(String.format("%.0f",doctor.tinhLuong(0.5, 10000000, 2, "Điều dưỡng")));
	}

}
