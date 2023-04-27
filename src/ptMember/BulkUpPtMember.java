package ptMember;

import java.util.Scanner;

public class BulkUpPtMember extends PtMember {
	//getUserScan을 그대로 가져오고 address에 새로운 구문 추가
	public void getUserScan(Scanner scan) {
		System.out.print("ID :");
		int id = scan.nextInt();
		this.setId(id);
		
		scan.nextLine();//넘어가기 방지
		
		System.out.print("Name: ");
		String name = scan.nextLine();
		this.setName(name);
		
		System.out.print("Height: ");
		Double height = scan.nextDouble();
		this.setHeight(height);
		
		System.out.print("Weight: ");
		Double weight = scan.nextDouble();
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
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Do you have home address? (Y/N)");
			answer = scan.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("address: ");
				String address = scan.nextLine();
				this.setAddress(address);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setAddress("");
				break;
			}
			else {
				
			}
		}
		
		System.out.print("Phone Number: ");
		int phoneNumber = scan.nextInt();
		this.setPhoneNumber(phoneNumber);
	}

}
