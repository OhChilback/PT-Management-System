package ptMember;

import java.util.Scanner;

public interface UserScan {
	
	// 인터페이스 추가 (menu manager 에서 Scanner 쓰이는 형태)
	
	//menu manager 에서 쓰이는 method 형태 선언

	public void getUserScan(Scanner scan);
	
	public int getId();
	

	public void setId(int id);


	public void setName(String name);


	public void setHeight(double height);

	public void setWeight(double weight);


	public void setAge(int age);


	public void setBirthday(int birthday);


	public void setGender(String gender);


	public void setPhoneNumber(int phoneNumber);


	public void setAddress(String address);
	
	public void viewPrint();
}

