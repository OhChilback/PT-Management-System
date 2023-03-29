import java.util.Scanner;
import java.util.ArrayList;
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
			addmembers();
		}
		if(num == 2) {
			deletemembers();
		}
		if(num == 3) {
			accountingmenu();
		}
		if(num == 4) {
			editmembers();
		}
		if(num == 5) {
			viewmembers();
		}
		if(num == 6 ) {
			break;//While문을 벗어남
		}
		
		}
		
	}
	public static void addmembers() {
		Scanner scan = new Scanner(System.in);
		System.out.print("back(Y or N):");//뒤로가기 기능 추가
		String back=scan.next();
			if(back.equals("Y")) {
				return;
			}
			System.out.print("ID :");
			String ID = scan.nextLine();//추후 ArrayList를 이용
			scan.nextLine();//넘어가기 방지
			System.out.print("Name: ");
			String name = scan.nextLine();
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
	public static void deletemembers() {
		Scanner scan = new Scanner(System.in);
		System.out.print("back(Y or N):");
		String back=scan.next();
			if(back.equals("Y")) {
				return;
			}
		System.out.println("client ID list");//전체 ID 리스트(추후 수정) -> System.out.prinln(idList), 함수안 리턴값 추후 문제해결
		System.out.print("client ID: ");
		String ID = scan.nextLine();
		}
	public static void accountingmenu() {
		Scanner scan = new Scanner(System.in);
		System.out.print("back(Y or N):");
		String back=scan.next();
			if(back.equals("Y")) {
				return;
			}
		System.out.print("Select ID: ");//ID 접속시 밑에 정보 추가
		String ID = scan.nextLine();
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
	public static void editmembers() {
		Scanner scan = new Scanner(System.in);
		System.out.print("back(Y or N):");
		String back=scan.next();
			if(back.equals("Y")) {
				return;
			}
		System.out.print("select ID: ");
		String ID = scan.nextLine();
	}
	public static void viewmembers() {
		Scanner scan = new Scanner(System.in);
		System.out.print("back(Y or N):");
		String back=scan.next();
			if(back.equals("Y")) {
				return;
			}
		System.out.print("select ID: ");
		String ID = scan.nextLine();
	}
	
}
