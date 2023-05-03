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
		System.out.println("2. Delete PT-Members");
		System.out.println("3. Edit PT-Members");
		System.out.println("4. View PT-Members");
		System.out.println("5. Exit");
		System.out.println();
		System.out.print("Select Menu Number: ");
		num = scan.nextInt();
		
		if(num == 1) { 
				memberManager.addMembers();
		}
		if(num == 2) {
				memberManager.deleteMembers();
		}
		
		if(num == 3) {
				memberManager.editMembers();
		}
		if(num == 4) {
				memberManager.viewMembers();
				
		}
		if(num == 5 ) {
			break;//While문을 벗어남
		}
		
		}
		
	}
	
	
}