package menuManager;
import java.util.Scanner;
public class AccountManager {
	int start, finish, price, startPT, finishPT;
	Scanner scan;
	public AccountManager() {
	}
	public AccountManager(int start, int finish,
			int price, int startPT, int finishPT) {
		this.start = start;
		this.finish = finish;
		this.price = price;
		this.startPT = startPT;
		this.finishPT = finishPT;
	}
	public AccountManager(Scanner scan){
		this.scan = scan;
	}
	
	public void view2Print()
	{
		
		
		System.out.println();
		System.out.println(" start"+start+" finish:"+finish);
		System.out.println("price:"+price+" startPT:"+ startPT + " finishPT: "+finishPT);
		System.out.println();
		
	}
	
	
}