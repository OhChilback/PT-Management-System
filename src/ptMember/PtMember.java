package ptMember;
import java.util.Scanner;
public class PtMember {
	//필드들 전부 encapsulation
	protected PtMemberType type = PtMemberType.Diet; //enum을 통해 pt받는 사람들 유형 추가
	protected int id;
	protected String name;
	protected double height;
	protected double weight;
	protected int age;
	protected int birthday;
	protected String gender;
	protected String address;
	protected int phoneNumber;
	

	public PtMember()
	{
		
	}
	
	public PtMember(String name,int id)
	{
		this.name = name;
		this.id= id;
	}	
	
	public PtMember(int id, String name, double height,double weight, 
			int age, int birthday, String gender, String address, int phoneNumber)
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
	
	//getter, setter 추가
	public PtMemberType getType() {
		return type;
	}

	public void setType(PtMemberType type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void viewPrint(){
		System.out.println();
		System.out.println("name:"+name+" id:"+id+" height:"+height+" weight:"+weight);
		System.out.println("age:"+age+" birthday:"+birthday+" gender:"+gender+" phoneNumber:"+phoneNumber+" address:"+address);
		System.out.println();
	}
	//scan해서 넣는 메소드 추가
	public void getUserScan(Scanner scan) {
		System.out.print("ID :");
		int id = scan.nextInt();
		this.setId(id);
		scan.nextLine();//넘어가기 방지
		System.out.print("Name: ");
		String name = scan.nextLine();
		this.setName(name);
		System.out.print("Height: ");
		Double height = scan.nextDouble();
		this.setHeight(height);
		System.out.print("Weight: ");
		Double weight = scan.nextDouble();
		this.setWeight(weight);
		System.out.print("Age: ");
		int age = scan.nextInt();
		this.setAge(age);
		System.out.print("Birthday: ");
		int birthday= scan.nextInt();
		this.setBirthday(birthday);
		scan.nextLine();//넘어가기 방지
		System.out.print("Gender: ");
		String gender = scan.nextLine();
		this.setGender(gender);
		System.out.print("address: ");
		String address = scan.nextLine();
		this.setAddress(address);
		System.out.print("Phone Number: ");
		int phoneNumber = scan.nextInt();
		this.setPhoneNumber(phoneNumber);
	}
	
	
		
	
}
