package day5_inherritant;

public class Teacher extends People {
	public String monHoc;
	
	public void diDay()
	{
		System.out.println("Gv Codestar đi dạy môn " + monHoc + "vào tối t4 và Cn hàng tuần");
	}
	@Override
	public void diChoi()
	{
		System.out.println("Gv đi chơi sau khi dạy xong");
	}

}
