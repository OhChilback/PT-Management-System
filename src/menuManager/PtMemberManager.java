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
import java.util.InputMismatchException;

public class PtMemberManager 
{
	ArrayList<UserScan> ptMembers = new ArrayList<UserScan>();
	Scanner scan;
	PtMemberManager(Scanner scan){
		this.scan = scan;
	}
	
	

public void addMembers() {
			 
			int type = 0;
			UserScan userScan;
			while(type != 1 && type != 2 && type != 3 && type != 4) {
				
				//try catch문 추가 
				try {
			    System.out.println("1 is Diet type");
			    System.out.println("2 is Bulk up type");
			    System.out.println("3 is Leanmassup type");
			    System.out.println("4 is Balance type"); 
			    System.out.print("Select PtMember Type 1 ~ 4:");
			    type = scan.nextInt();
			    if(type == 1) {
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
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 ~ 4!");
				if(scan.hasNext()){
					scan.next();
				}
				type = -1;
			}
	}
			
			
	}

	public void deleteMembers() {
		
		System.out.print("client ID: ");
		int id = scan.nextInt();
		int index = findIndex(id);
		removefromPtMember(index, id);//
	}
	

	public int findIndex(int id) {
		int index = -1;
		for(int i = 0 ; i<ptMembers.size(); i++) {
			if(ptMembers.get(i).getId() == id) {
				index = i;
				break;
			}
		}
		return index;
	}
	

	public int removefromPtMember(int index, int id) {
		if(index >= 0){
			ptMembers.remove(index);
			System.out.println("the ptMember " + id + " is deleted");
			return 1;
		}
		else {
			System.out.println("the ptMember has not been registered");
			return -1;
		}
	}
	
	public void editMembers() {
		
		System.out.print("edited ID: ");
		int ptMemberId = scan.nextInt();
		
		for (int i = 0; i < ptMembers.size(); i++){
			UserScan user = ptMembers.get(i);
			if(ptMembers.get(i).getId() == ptMemberId) { 
				int num = -1;
				while(num != 10) {
					showEditMenu();
					num = scan.nextInt();
					
					switch(num) {
					case 1:
						user.setPtMemberID(scan);
						break;
					case 2:
						user.setPtMemberName(scan);
						break;
					case 3:
						user.setPtMemberHeight(scan);
						break;
					case 4:
						user.setPtMemberWeight(scan);
						break;
					case 5:
						user.setPtMemberAge(scan);
						break;
					case 6:
						user.setPtMemberBirthday(scan);
						break;
					case 7:
						user.setPtMemberGender(scan);
						break;
					case 8:
						user.setPtMemberAddress(scan);
						break;
					case 9:
						user.setPtMemberPhoneNumber(scan);
						break;
					default:
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
	
	public void showEditMenu() {
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
	}
	
}