package menuManager;
import java.util.Scanner;
import java.util.ArrayList;
public class PtMemberManager 
{
	ArrayList<PtMember> ptMembers = new ArrayList<PtMember>();
	Scanner scan;
	PtMemberManager(Scanner scan){
		this.scan = scan;
	}
	
	

public void addMembers() {
		PtMember ptMember = new PtMember();
		
			System.out.print("ID :");
			ptMember.id = scan.nextInt();//추후 ArrayList를 이용
			scan.nextLine();//넘어가기 방지
			System.out.print("Name: ");
			ptMember.name = scan.nextLine();
			System.out.print("Height: ");
			ptMember.height = scan.nextDouble();
			System.out.print("Weight: ");
			ptMember.weight = scan.nextDouble();
			System.out.print("Age: ");
			ptMember.age = scan.nextInt();
			System.out.print("Birthday: ");
			ptMember.birthday= scan.nextInt();
			scan.nextLine();//넘어가기 방지
			System.out.print("Gender: ");
			ptMember.gender = scan.nextLine();			
			System.out.print("address: ");
			ptMember.address = scan.nextLine();
			System.out.print("Phone Number: ");
			ptMember.phoneNumber = scan.nextInt();
			ptMembers.add(ptMember);
	}

	public void deleteMembers() {
		
	//	System.out.println("All client ID list:");//전체 ID 리스트(추후 수정) -> System.out.prinln(idList), 함수안 리턴값 추후 문제해결
		
		System.out.print("client ID: ");
		int id = scan.nextInt();
		int index = -1;
		for(int i = 0 ; i<ptMembers.size(); i++) {
			if(ptMembers.get(i).id == id) {
				index = i;
				break;
			}
		}
		if(index >= 0){
			ptMembers.remove(index);
			System.out.println("the student " + id + " is deleted");
		}
		else {
			System.out.println("the ptMember has not been registered");
			return;
		}
	}
	
	public void editMembers() {
		System.out.print("edited ID: ");
		int id = scan.nextInt();
		for (int i = 0; i < ptMembers.size(); i++){
			PtMember ptMember = ptMembers.get(i);
			if(ptMembers.get(i).id == id) {
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
						System.out.println("ID:");
						ptMember.id = scan.nextInt();
					}
					else if(num == 2) {
						System.out.println("Name: ");
						ptMember.name = scan.next();
					}
					else if(num == 3) {
						System.out.println("Height: ");
						ptMember.height = scan.nextDouble();
					}
					else if(num == 4) {
						System.out.println("Weight: ");
						ptMember.weight = scan.nextDouble();
					}
					else if(num == 5) {
						System.out.println("Age: ");
						ptMember.age = scan.nextInt();
					}
					else if(num == 6) {
						System.out.println("Birthday: ");
						ptMember.birthday = scan.nextInt();
					}
					else if(num == 7) {
						System.out.println("Gender: ");
						ptMember.gender = scan.next();
					}
					else if(num == 8) {
						System.out.println("Address: ");
						ptMember.address = scan.next();
					}
					else if(num == 9) {
						System.out.println("PhoneNumber: ");
						ptMember.phoneNumber = scan.nextInt();
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
		for(int i = 0; i<ptMembers.size(); i++) {
			ptMembers.get(i).viewPrint();
		}
	}
	//뒤로가기 함수 추가
		public String back() {
		    System.out.print("Please type Y or N: ");
		    String back = scan.next();
		    if (back.equals("Y")) {
		        return null;
		    } 
		    else if (back.equals("N"))
		    {
		    	return "o";
		    }
		    else
		    {
		    	System.out.println("잘못입력하셨습니다. 다시 실행하세요.");
		    	return "c";
		    }
		}
}

//해야할것: arraylist로 여러 id 저장하기-> 전체 id리스트, 여러 id중 선택하기(우선순위 맨 마지막)