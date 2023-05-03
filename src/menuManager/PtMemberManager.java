package menuManager;
import java.util.Scanner;

import ptMember.BalancePtMember;
import ptMember.BulkUpPtMember;
import ptMember.LeanmassUpManager;
import ptMember.PtMember;
import ptMember.PtMemberType;

import java.util.ArrayList;
public class PtMemberManager 
{
	ArrayList<PtMember> ptMembers = new ArrayList<PtMember>();
	Scanner scan;
	PtMemberManager(Scanner scan){
		this.scan = scan;
	}
	
	

public void addMembers() {
			 
			int type = 0;
			PtMember ptMember;
			while(type != 1 && type != 2 && type != 3 && type != 4) {
		    System.out.println("1 is Diet type");
		    System.out.println("2 is Bulk up type");
		    System.out.println("3 is Leanmassup type"); //leanmassup 추가
		    System.out.println("4 is Balance type"); //balance 추가
		    System.out.print("Select PtMember Type 1 ~ 4:");
		    type = scan.nextInt();
		    //type 추가로 인한 생성자 변경
		    if(type == 1) {
		    	ptMember = new PtMember(PtMemberType.DIET);
		    	ptMember.getUserScan(scan);
		    	ptMembers.add(ptMember);
		    	break;
		    }
		    else if(type == 2) {
		    	ptMember = new BulkUpPtMember(PtMemberType.BULKUP);
		    	ptMember.getUserScan(scan);
		    	ptMembers.add(ptMember);
		    	break;
		    }
		    else if(type == 3) {
		    	ptMember = new LeanmassUpManager(PtMemberType.LEANMASSUP);
		    	ptMember.getUserScan(scan);
		    	ptMembers.add(ptMember);
		    	break;
		    }
		    
		    else if(type == 4) {
		    	ptMember = new BalancePtMember(PtMemberType.BALANCE);
		    	ptMember.getUserScan(scan);
		    	ptMembers.add(ptMember);
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
			PtMember ptMember = ptMembers.get(i);
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
						ptMember.setId(id); 
					}
					else if(num == 2) {
						System.out.print("Name: ");
						String name = scan.next();
						ptMember.setName(name);
					}
					else if(num == 3) {
						System.out.print("Height: ");
						double height = scan.nextDouble();
						ptMember.setHeight(height);
					}
					else if(num == 4) {
						System.out.print("Weight: ");
						double weight = scan.nextDouble();
						ptMember.setWeight(weight);
					}
					else if(num == 5) {
						System.out.print("Age: ");
						int age = scan.nextInt();
						ptMember.setAge(age);
					}
					else if(num == 6) {
						System.out.print("Birthday: ");
						int birthday = scan.nextInt();
						ptMember.setBirthday(birthday);
					}
					else if(num == 7) {
						System.out.print("Gender: ");
						String gender = scan.next();
						ptMember.setGender(gender);
					}
					else if(num == 8) {
						System.out.print("Address: ");
						String address = scan.next();
						ptMember.setAddress(address);
					}
					else if(num == 9) {
						System.out.print("PhoneNumber: ");
						int phoneNumber = scan.nextInt();
						ptMember.setPhoneNumber(phoneNumber);
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

