package day5_inherritant;

public class Application {

	public static void main(String[] args) {
		Student sv1 = new Student();
		sv1.setHoTen("Jasmine Mai");
		sv1.setDiaChi("Nam Định");
		sv1.setNgaySinh("19/07/2000");
		sv1.GPA = 4.5;
		System.out.println(sv1.getHoTen() + ", " + sv1.getDiaChi() + ", " + sv1.getNgaySinh());
		sv1.diChoi();
		sv1.diHoc();
		
		System.out.println();
		Teacher gv1 = new Teacher();
		gv1.setHoTen("Seila");
		gv1.setDiaChi("Yemen");
		gv1.setNgaySinh("12/2/1970");
		System.out.println(gv1.getHoTen() + ", " + gv1.getDiaChi() + ", " + gv1.getNgaySinh());
		gv1.diChoi();
		gv1.diDay();
		
	}

}
