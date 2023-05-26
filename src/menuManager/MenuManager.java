package menuManager;
import java.util.Scanner;
import log.EventLogger;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.io.IOException;
public class MenuManager {
		
	static EventLogger Logger = new EventLogger("log.txt"); //static을 통해 같은 메모리 공유함
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		PtMemberManager memberManager = getObject("membermanager.ser"); //객체를 가져와서 memberManager 변수에 할당
		//객체가 없으면 새로운 객체를 생성한다.
		if (memberManager == null) {
			memberManager = new PtMemberManager(scan);
		}
	
		selectMenu(scan, memberManager);
		putObject(memberManager ,"membermanager.ser"); //memberManager를 "membermanager.ser"에 넣는다.
	}
	
		
	//exception을 포함한 메소드를 호출하는 메소드 구현
	public static void selectMenu(Scanner scan, PtMemberManager memberManager ) {
		int num = -1; //num 초기화
		while(num!=5) {//조건 변경
			try {
				showMenu();
				num = scan.nextInt();
				
				//케이스별 로그 메시지를 추가
				switch(num) {
				case 1:
					memberManager.addMembers();
					Logger.log("add a member");
					break;
				case 2:
					memberManager.deleteMembers();
					Logger.log("delete a member");
					break;
				case 3:
					memberManager.editMembers();
					Logger.log("edit a member");
					break;
				case 4:
					memberManager.viewMembers();
					Logger.log("edit a list of member");
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
	
	//객체를 역직렬화 메소드 생성
	public static PtMemberManager getObject(String filename) {
		PtMemberManager memberManager = null;
		try {
			//파일을 읽는 스트림을 생성하고 객체를 역직렬화해서 읽는다. 
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			//readObject로 객체를 반환하고 PtmemberManger 타입으로 캐스팅하여 memberManager에 할당한다.
			memberManager = (PtMemberManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return memberManager;
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return memberManager;
	}
	
	//객체를 직렬화하는 메소드 생성
	public static void putObject(PtMemberManager memberManager, String filename) {
		 
		try {
			//파일을 쓰는 스트림을 생성하고 객체를 직렬화하여 쓰는 역할을 한다.
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
		    //객체를 직렬화하여 출력한다
			out.writeObject(memberManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}