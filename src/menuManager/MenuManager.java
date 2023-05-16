package menuManager;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class MenuManager {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		PtMemberManager memberManager = new PtMemberManager(scan);
		
		selectMenu(scan, memberManager);
	}
	
		
	//exception을 포함한 메소드를 호출하는 메소드 구현
	public static void selectMenu(Scanner scan, PtMemberManager memberManager ) {
		int num = -1; //num 초기화
		while(num!=5) {//조건 변경
			try {
			showMenu();
			num = scan.nextInt();
			
			switch(num) {
			case 1:
				memberManager.addMembers();
				break;
			case 2:
				memberManager.deleteMembers();
				break;
			case 3:
				memberManager.editMembers();
				break;
			case 4:
				memberManager.viewMembers();
				break;
			default:
				continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(scan.hasNext()){
					scan.next();
				}
				num = -1;
			}
		
		}
	}
	
	public static void showMenu() {
		System.out.println("1. Add PT-Members");
		System.out.println("2. Delete PT-Members");
		System.out.println("3. Edit PT-Members");
		System.out.println("4. View PT-Members");
		System.out.println("5. Exit");
		System.out.println();
		System.out.print("Select Menu Number: ");
	}
}