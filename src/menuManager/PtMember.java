package menuManager;

public class PtMember {
	int id;
	String name;
	double height;
	double weight;
	int age;
	int birthday;
	String gender;
	int phoneNumber;
	String address;

	public PtMember()
	{
		
	}
	
	public PtMember(String name,int id)
	{
		this.name = name;
		this.id= id;
	}	
	
	public PtMember(String name,int id,double height,double weight, 
			int age, int birthday, String gender,int phoneNumber, String address)
	{
		this.name = name;
		this.id= id;
		this.height =height;
		this.weight = weight;
		this.age = age;
		this.birthday =birthday;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.address = address;
		
	}
	
	
	public void viewPrint()
	{
		System.out.println();
		System.out.println("name:"+name+" id:"+id+" height:"+height+" weight:"+weight);
		System.out.println("age:"+age+" birthday:"+birthday+" gender:"+gender+" phoneNumber:"+phoneNumber+" address:"+address);
		System.out.println();
	}
	
	
	
		
	
}
