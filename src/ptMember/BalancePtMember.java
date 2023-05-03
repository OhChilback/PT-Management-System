package ptMember;

import java.util.Scanner;

public class BalancePtMember extends PtMember {
	
	//type만 생성자 추가
		public BalancePtMember(PtMemberType type) {
			super(type);
		}
		
	//오버라이딩 
	public void getUserScan(Scanner scan) {
		System.out.print("ID :");
		int id = scan.nextInt();
		this.setId(id);
		
		scan.nextLine();//넘어가기 방지
		
		System.out.print("Name: ");
		String name = scan.nextLine();
		this.setName(name);
		
		System.out.print("Height: ");
		double height = scan.nextDouble();
		this.setHeight(height);
		
		System.out.print("Weight: ");
		double weight = scan.nextDouble();
		this.setWeight(weight);
		
		char answer = 'x';
		
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			//문장 변경
			System.out.print("Do you want to show Leanmassup recommand calories? (Y/N)");
			answer = scan.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				double calories = this.getWeight()* 30; //숫자 변경
				this.setCalories(calories);
				
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setCalories(0);
				break;
			}
			else {
				
			}
		}
		
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
		
		
		
		
		System.out.print("Phone Number: ");
		int phoneNumber = scan.nextInt();
		this.setPhoneNumber(phoneNumber);
		
		scan.nextLine();//넘어가기 방지
		
		System.out.print("address: ");
		String address = scan.nextLine();
		this.setAddress(address);
	}
	
	//오버라이딩 
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
		//type 문 추가
		System.out.println("type:" + stype + "name:"+name+" id:"+id+" height:"+height+" weight:"+weight);
		//오버라이딩으로 전화번호 , 칼로리 변경
		System.out.println("age:"+age+" birthday:"+birthday+" gender:"+gender
				+"phoneNumber:"+phoneNumber+"address:"+ address);
		System.out.println("recmmand calories:" + calories);
		System.out.println();
	}
}
