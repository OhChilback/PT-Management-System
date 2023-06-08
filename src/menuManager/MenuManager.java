package menuManager;
import java.util.Scanner;
import gui.WindowFrame; 
import log.EventLogger;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.io.IOException;
public class MenuManager {
		
	static EventLogger Logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		PtMemberManager memberManager = getObject("membermanager.ser"); 
		
		
		if (memberManager == null) {
			memberManager = new PtMemberManager(scan);
		}
		//windowframe과 연결
		WindowFrame frame = new WindowFrame(memberManager);
		selectMenu(scan, memberManager);
		putObject(memberManager ,"membermanager.ser");
		
	}
	
		
	
	public static void selectMenu(Scanner scan, PtMemberManager memberManager ) {
		int num = -1; 
		while(num!=5) {
			try {
				showMenu();
				num = scan.nextInt();
				
				
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
	

	public static PtMemberManager getObject(String filename) {
		PtMemberManager memberManager = null;
		try {
			 
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
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
	
	
	public static void putObject(PtMemberManager memberManager, String filename) {
		 
		try {
			
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
		    
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