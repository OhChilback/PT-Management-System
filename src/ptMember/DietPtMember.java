package ptMember;

import java.util.Scanner;

//Diet Class (default class) 생성 및, PtMember 상속, 인터페이스 상속
public class DietPtMember extends PtMember implements UserScan{
	
	public DietPtMember(PtMemberType type) {
		super(type);
	}
	
	public void getUserScan(Scanner scan) {
		System.out.print("ID :");
		
		int id = scan.nextInt();
		this.setId(id);
		scan.nextLine();
		
		System.out.print("Name: ");
		String name = scan.nextLine();
		this.setName(name);
		
		System.out.print("Height: ");
		double height = scan.nextDouble();
		this.setHeight(height);
		
		System.out.print("Weight: ");
		double weight = scan.nextDouble();
		this.setWeight(weight);
		
		System.out.print("Age: ");
		int age = scan.nextInt();
		this.setAge(age);
		
		System.out.print("Birthday: ");
		int birthday= scan.nextInt();
		this.setBirthday(birthday);
		scan.nextLine();//넘어가기 방지
		
		System.out.print("Gender: ");
		String gender = scan.nextLine();
		this.setGender(gender);
		
		System.out.print("address: ");
		String address = scan.nextLine();
		this.setAddress(address);
		
		System.out.print("Phone Number: ");
		int phoneNumber = scan.nextInt();
		this.setPhoneNumber(phoneNumber);
		
	}
	//diet 는 default 형태(칼로리출력 x)
	public void viewPrint(){
		String stype = "xxx";
		switch(this.type){
			case DIET:
				stype = "Diet";
				break;
			case BULKUP:
				stype = "Bulkup";
				break;
			case LEANMASSUP:
				stype = "Leanmassup";
				break;
			case BALANCE:
				stype = "Balance";
				break;
			default:
			
		} 
		System.out.println();
		System.out.println("type:" + stype + " name:"+name+" id:"+id+" height:"+height+" weight:"+weight);
		System.out.println("age:"+age+" birthday:"+birthday+" gender:"+gender+" phoneNumber:"+phoneNumber+" address:"+address);
		System.out.println();
	}

	
}