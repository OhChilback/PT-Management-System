package menuManager;
import java.util.Scanner;
import java.util.ArrayList;
public class MenuManager {

	public static void main(String[] args) {
		int num;
		
		Scanner scan = new Scanner(System.in);
		PtMemberManager memberManager = new PtMemberManager(scan);
		
		while(true) {
		System.out.println("1. Add PT-Members");
		System.out.println("2. Delete PT-Members");//id목록을 전체 출력하고 id 입력하고 바로 삭제
		//accounting menu 삭제
		System.out.println("3. Edit PT-Members");//ID를 골라서 원하는 정보를 수정
		System.out.println("4. View PT-Members");//ID를 입력 받아서  1번 리스트를 전체 출력
		System.out.println("5. Exit");
		System.out.println();
		System.out.print("Select Menu Number: ");
		num = scan.nextInt();
		if(num == 1) {//추가 
			String i = memberManager.back();
			if( i == null)
				continue;
			else if( i == "o")
				memberManager.addMembers();
			else if( i == "c")
				return;
		
		}
		if(num == 2) {
			String i = memberManager.back();
			if( i == null)
				continue;
			else if( i == "o")
				memberManager.deleteMembers();
			else if( i == "c")
				return;
		}
		
		if(num == 3) {
			String i = memberManager.back();
			if( i == null)
				continue;
			else if( i == "o")
				memberManager.editMembers();
			else if( i == "c")
				return;
		}
		if(num == 4) {
			String i = memberManager.back();
			if( i == null)
				continue;
			else if( i == "o")
				memberManager.viewMembers();
			else if( i == "c")
				return;
		}
		if(num == 5 ) {
			break;//While문을 벗어남
		}
		
		}
		
	}
	
	
}