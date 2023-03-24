import java.util.Scanner;
public class MenuManager {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		
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
			System.out.print("ID :");
			int ID = scan.nextInt();
			System.out.print("Name: ");
			String name = scan.nextLine();
			scan.nextLine();//넘어가기 방지
			System.out.print("Height: ");
			int height = scan.nextInt();
			System.out.print("Weight: ");
			int weight = scan.nextInt();
			System.out.print("Age: ");
			int age = scan.nextInt();
			System.out.print("Birthday: ");
			int birthday= scan.nextInt();
			scan.nextLine();
			System.out.print("Gender: ");
			String gender = scan.nextLine();			
			System.out.print("address: ");
			String address = scan.nextLine();
			System.out.print("Phone Number: ");
			int phoneNumber = scan.nextInt();
			
		}
		if(num == 2) {
			System.out.println("client ID list");//전체 ID 리스트(추후 수정)
			System.out.print("client ID: ");
			int ID = scan.nextInt();
		}
		if(num == 3) {
			System.out.print("Select ID: ");//ID 접속시 밑에 정보 추가
			int ID = scan.nextInt();
			System.out.print("Start day:");//추후 수정
			int start = scan.nextInt();
			System.out.print("Finish day:");
			int finish = scan.nextInt();
			System.out.print("Price : ");
			int price = scan.nextInt();
			System.out.print("Start Pt-time  :");
			int startPT = scan.nextInt();
			System.out.print("Finish Pt-time  :");
			int finishPT = scan.nextInt();
		}
		if(num == 4) {
			System.out.print("select ID: ");
			int ID = scan.nextInt();
		}
		if(num == 5) {
			System.out.print("select ID: ");
			int ID = scan.nextInt();
		}
		if(num == 6 ) {
			break;
		}
		
		}
	}

}
