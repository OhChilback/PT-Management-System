package menuManager;
import java.util.Scanner;
import java.util.ArrayList;
public class MenuManager {

	public static void main(String[] args) {
		int num;
		
		Scanner scan = new Scanner(System.in);
		PtMemberManager memberManager = new PtMemberManager(scan);
		PtMember ptmember = new PtMember(scan);
		AccountManager account = new AccountManager(scan);
		
		while(true) {
		System.out.println("1. Add PT-Members");
		System.out.println("2. Delete PT-Members");//id목록을 전체 출력하고 id 입력하고 바로 삭제
		System.out.println("3. Accounting Menu");
		System.out.println("4. Edit PT-Members");//ID를 골라서 원하는 정보를 수정
		System.out.println("5. View PT-Members");//ID를 입력 받아서  1번 리스트를 전체 출력
		System.out.println("6. Exit");
		System.out.println();
		System.out.print("Select Menu Number: ");
		num = scan.nextInt();
		if(num == 1) {
			String i = ptmember.back();
			if( i == null)
				continue;
			else if( i == "o")
				memberManager.addmembers();
			else if( i == "c")
				return;
		
		}
		if(num == 2) {
			String i = ptmember.back();
			if( i == null)
				continue;
			else if( i == "o")
				memberManager.deletemembers();
			else if( i == "c")
				return;
		}
		if(num == 3) {
			String i = ptmember.back();
			if( i == null)
				continue;
			else if( i == "o")
				memberManager.accountingmenu();
			else if( i == "c")
				return;
		}
		if(num == 4) {
			String i = ptmember.back();
			if( i == null)
				continue;
			else if( i == "o")
				memberManager.editmembers();
			else if( i == "c")
				return;
		}
		if(num == 5) {
			String i = ptmember.back();
			if( i == null)
				continue;
			else if( i == "o")
				memberManager.viewmembers();
			else if( i == "c")
				return;
		}
		if(num == 6 ) {
			break;//While문을 벗어남
		}
		
		}
		
	}
	
	
}