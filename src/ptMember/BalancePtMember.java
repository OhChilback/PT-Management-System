package ptMember;

import java.util.Scanner;
//인터페이스 상속
public class BalancePtMember extends PtMember implements UserScan{
	
	
		public BalancePtMember(PtMemberType type) {
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
		
		char answer = 'x';
		
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			
			System.out.print("Do you want to show Balance recommand calories? (Y/N)");
			answer = scan.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				double calories = this.getWeight()* 30;
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
		
		scan.nextLine();
		
		System.out.print("Gender: ");
		String gender = scan.nextLine();
		this.setGender(gender);
		
		
		
		
		System.out.print("Phone Number: ");
		int phoneNumber = scan.nextInt();
		this.setPhoneNumber(phoneNumber);
		
		scan.nextLine();
		
		System.out.print("address: ");
		String address = scan.nextLine();
		this.setAddress(address);
	}
	//칼로리출력 specific method
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
		System.out.println("recommand Calories:" + calories );
		System.out.println();
	}
	
	
}