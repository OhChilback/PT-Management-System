package menuManager;
import java.util.Scanner;
public class PtMemberManager 
{
	AccountManager account = new AccountManager();
	Scanner scan;
	PtMemberManager(Scanner scan){
		this.scan = scan;
	}
	PtMember ptMember;
	

public void addmembers() {
		ptMember = new PtMember();
		
			System.out.print("ID :");
			ptMember.id = scan.nextInt();//추후 ArrayList를 이용
			scan.nextLine();
			System.out.print("Name: ");
			ptMember.name = scan.nextLine();
			System.out.print("Height: ");
			ptMember.height = scan.nextInt();
			System.out.print("Weight: ");
			ptMember.weight = scan.nextInt();
			System.out.print("Age: ");
			ptMember.age = scan.nextInt();
			System.out.print("Birthday: ");
			ptMember.birth= scan.nextInt();
			scan.nextLine();//넘어가기 방지
			System.out.print("Gender: ");
			ptMember.gender = scan.nextLine();			
			System.out.print("address: ");
			ptMember.address = scan.nextLine();
			System.out.print("Phone Number: ");
			ptMember.phone = scan.nextInt();
	}
	public void deletemembers() {
		
		System.out.println("All client ID list:");//전체 ID 리스트(추후 수정) -> System.out.prinln(idList), 함수안 리턴값 추후 문제해결
		System.out.print("client ID: ");
		int id = scan.nextInt();
		if(ptMember == null)
		{
			System.out.println("the ptMember has not been registered");
			return;
		}
		if(ptMember.id == id) {
			ptMember = null ;
			System.out.println("the ptMember is deleted");
		}
		}
	public void accountingmenu() {
		
		//ID 접속시 밑에 정보 추가 추후 수정
		 
		System.out.print("Start day:");//추후 수정
		account.start = scan.nextInt();
		System.out.print("Finish day:");
		account.finish = scan.nextInt();
		System.out.print("Price : ");
		account.price = scan.nextInt();
		System.out.print("Start Pt-time  :");
		account.startPT = scan.nextInt();
		System.out.print("Finish Pt-time  :");
		account.finishPT = scan.nextInt();
	}
	public void editmembers() {
		
		System.out.print("edited ID: ");
		int id = scan.nextInt();
		if (ptMember.id == id ) {
			System.out.println("the PtMember to be edited is " + id);
		}
	}
	public void viewmembers() {
	
		System.out.print("select ID: ");
		int id = scan.nextInt();
		if (ptMember.id == id ) {
			ptMember.viewPrint();
			account.view2Print();
		}
	}
	
}

//해야할것: accountingmenu, arraylist로 여러 id 저장하기-> 전체 id리스트, 여러 id중 선택하기(우선순위 맨 마지막)