package ptMember;

import java.util.Scanner;

import exception.AddressFormatException;

public interface UserScan {

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

	public void setAddress(String address) throws AddressFormatException;
	
	public void viewPrint();
	
	public void setPtMemberID(Scanner scan);
	
	public void setPtMemberName(Scanner scan);
	
	public void setPtMemberHeight(Scanner scan);
	
	public void setPtMemberWeight(Scanner scan);

	public void setPtMemberAge(Scanner scan);
	
	public void setPtMemberBirthday(Scanner scan);
	
	public void setPtMemberGender(Scanner scan);
	
	public void setPtMemberAddress(Scanner scan);
	
	public void setPtMemberPhoneNumber(Scanner scan);
}

