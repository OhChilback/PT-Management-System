package menuManager;
import java.util.Scanner;

public class PtMember {
	Scanner scan;
	
	int id;
	String name;
	double height;
	double weight;
	int age;
	int birth;
	String gender;
	int phone;
	String address;
	
	PtMember(Scanner scan){
		this.scan = scan;
	}
	

	public PtMember()
	{
		
	}
	
	public PtMember(String name,int id)
	{
		this.name = name;
		this.id= id;
	}	
	
	public PtMember(String name,int id,double height,double weight, 
			int age, int birth, String gender,int phone, String address)
	{
		this.name = name;
		this.id= id;
		this.height =height;
		this.weight = weight;
		this.age = age;
		this.birth =birth;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
		
	}
	
	
	public void viewPrint()
	{
		System.out.println();
		System.out.println("name:"+name+" id:"+id+" height:"+height+" weight:"+weight);
		System.out.println("age:"+age+" birthday:"+birth+" gender:"+gender+" phoneNumber:"+phone+" address:"+address);
		System.out.println();
	}
	
	//뒤로가기 함수 추가
	public String back() {
	    System.out.print("back?(type Y or N): ");
	    String back = scan.next();
	    if (back.equals("Y")) {
	        return null;
	    } 
	    else if (back.equals("N"))
	    {
	    	return "o";
	    }
	    else
	    {
	    	System.out.println("잘못입력하셨습니다. 다시 실행하세요.");
	    	return "c";
	    }
	}
	
		
	
}
