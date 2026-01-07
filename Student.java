package day5_inherritant;

public class Student extends People {
	
	public double GPA;
	public void diHoc()
	{
	  System.out.println("Sinh viên đi học từ t2 đến t7");
	}
	
	@Override
	public void diChoi()
	{
		System.out.println("Sinh viên đi chơi khi GPA đạt: " + GPA);
	}

}
