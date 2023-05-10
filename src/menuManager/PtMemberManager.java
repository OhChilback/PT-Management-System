package menuManager;
import java.util.Scanner;
import ptMember.UserScan;
import ptMember.BalancePtMember;
import ptMember.BulkUpPtMember;
import ptMember.DietPtMember;
import ptMember.LeanmassUpManager;
import ptMember.PtMember;
import ptMember.PtMemberType;

import java.util.ArrayList;
// UserScan 인터페이스를 활용하여 Scan method 사용
public class PtMemberManager 
{
	//ArrayList 의 받는 형태를 인터페이스 클레스 형태로 변경
	ArrayList<UserScan> ptMembers = new ArrayList<UserScan>();
	Scanner scan;
	PtMemberManager(Scanner scan){
		this.scan = scan;
	}
	
	

public void addMembers() {
			 
			int type = 0;
			//인터페이스 Class 타입의 변수선언
			UserScan userScan;
			while(type != 1 && type != 2 && type != 3 && type != 4) {
		    System.out.println("1 is Diet type");
		    System.out.println("2 is Bulk up type");
		    System.out.println("3 is Leanmassup type");
		    System.out.println("4 is Balance type"); 
		    System.out.print("Select PtMember Type 1 ~ 4:");
		    type = scan.nextInt();
		    if(type == 1) {
		    	//인터페이스 타입의 specific Class 생성
		    	userScan = new DietPtMember(PtMemberType.DIET);
		    	userScan.getUserScan(scan);
		    	ptMembers.add(userScan);
		    	break;
		    }
		    else if(type == 2) {
		    	userScan = new BulkUpPtMember(PtMemberType.BULKUP);
		    	userScan.getUserScan(scan);
		    	ptMembers.add(userScan);
		    	break;
		    }
		    else if(type == 3) {
		    	userScan = new LeanmassUpManager(PtMemberType.LEANMASSUP);
		    	userScan.getUserScan(scan);
		    	ptMembers.add(userScan);
		    	break;
		    }
		    
		    else if(type == 4) {
		    	userScan = new BalancePtMember(PtMemberType.BALANCE);
		    	userScan.getUserScan(scan);
		    	ptMembers.add(userScan);
		    	break;
		    }
		    
		    else {
		    	System.out.print("Wrong number! Try again accuarte number.");
		    }
			}
			
			
	}

	public void deleteMembers() {
		
		System.out.print("client ID: ");
		int id = scan.nextInt();
		int index = -1;
		for(int i = 0 ; i<ptMembers.size(); i++) {
			if(ptMembers.get(i).getId() == id) {
				index = i;
				break;
			}
		}
		if(index >= 0){
			ptMembers.remove(index);
			System.out.println("the ptMember " + id + " is deleted");
		}
		else {
			System.out.println("the ptMember has not been registered");
			return;
		}
	}
	
	public void editMembers() {
		
		System.out.print("edited ID: ");
		int ptMemberId = scan.nextInt();
		
		for (int i = 0; i < ptMembers.size(); i++){
			UserScan userScan = ptMembers.get(i);
			if(ptMembers.get(i).getId() == ptMemberId) { 
				int num = -1;
				while(num != 10) {
					System.out.println("1. Edit ID");
					System.out.println("2. Edit Name");
					System.out.println("3. Edit Height");
					System.out.println("4. Edit Weight");
					System.out.println("5. Edit Age");
					System.out.println("6. Edit Birthday");
					System.out.println("7. Edit Gender");
					System.out.println("8. Edit Address");
					System.out.println("9. Edit Phone");
					System.out.println("10. Exit");
					System.out.print("Select Menu Number: ");
					num = scan.nextInt();
					if(num == 1) { 
						System.out.print("ID:");
						int id = scan.nextInt(); 
						userScan.setId(id); 
					}
					else if(num == 2) {
						System.out.print("Name: ");
						String name = scan.next();
						userScan.setName(name);
					}
					else if(num == 3) {
						System.out.print("Height: ");
						double height = scan.nextDouble();
						userScan.setHeight(height);
					}
					else if(num == 4) {
						System.out.print("Weight: ");
						double weight = scan.nextDouble();
						userScan.setWeight(weight);
					}
					else if(num == 5) {
						System.out.print("Age: ");
						int age = scan.nextInt();
						userScan.setAge(age);
					}
					else if(num == 6) {
						System.out.print("Birthday: ");
						int birthday = scan.nextInt();
						userScan.setBirthday(birthday);
					}
					else if(num == 7) {
						System.out.print("Gender: ");
						String gender = scan.next();
						userScan.setGender(gender);
					}
					else if(num == 8) {
						System.out.print("Address: ");
						String address = scan.next();
						userScan.setAddress(address);
					}
					else if(num == 9) {
						System.out.print("PhoneNumber: ");
						int phoneNumber = scan.nextInt();
						userScan.setPhoneNumber(phoneNumber);
					}
					else {
						 continue;
					}
					
				}
				break;
			}
		}

	}
	
	public void viewMembers() {
		System.out.println("현재 등록된 회원입니다." + ptMembers.size()); 
		for(int i = 0; i<ptMembers.size(); i++) {
			ptMembers.get(i).viewPrint();
		}
	}
	
	
}