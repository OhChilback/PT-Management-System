package ptMember;
import java.util.Scanner;
public class PtMember {

	protected PtMemberType type = PtMemberType.DIET; 
	protected int id;
	protected String name;
	protected double height;
	protected double weight;
	protected int age;
	protected int birthday;
	protected String gender;
	protected String address;
	protected int phoneNumber;
	//적정칼로리 추가
	protected double calories;

	public PtMember()
	{
		
	}
	//type만 생성자 추가
	public PtMember(PtMemberType type) {
		this.type = type;
	}
	
	public PtMember(String name,int id)
	{
		this.name = name;
		this.id= id;
	}	
	//type 포함 생성자 추가 + 칼로리, bmi 생성자 추가
	public PtMember(PtMemberType type, int id, String name, double height,double weight, 
			int age, int birthday, String gender, String address, int phoneNumber, double calories, double bmi)
	{
		this.type = type;
		this.name = name;
		this.id= id;
		this.height =height;
		this.weight = weight;
		this.age = age;
		this.birthday =birthday;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.calories = calories;
	}
	// 칼로리, bmi 생성자 추가
	public PtMember( int id, String name, double height,double weight, 
			int age, int birthday, String gender, String address, int phoneNumber, double carlories)
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
		this.calories = carlories;

		
	}
	
	
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
	
	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}
	
	//switch문 추가해서 enum별로 string 변수에 저장
	public void viewPrint(){
		String stype = "xxx";
		switch(this.type){
			case DIET:
				stype = "Diet";
				break;
			case BULKUP:
				stype = "Bulkup";
				break;
			case LEANMASSUP:
				stype = "Leanmassup";
				break;
			case BALANCE:
				stype = "Balance";
				break;
			default:
			
		}
		System.out.println();
		//type 문 추가
		System.out.println("type:" + stype + "name:"+name+" id:"+id+" height:"+height+" weight:"+weight);
		System.out.println("age:"+age+" birthday:"+birthday+" gender:"+gender+" phoneNumber:"+phoneNumber+" address:"+address);
		System.out.println("recommand Calories:" + calories );
		System.out.println();
	}
	
	public void getUserScan(Scanner scan) {
		System.out.print("ID :");
		
		int id = scan.nextInt();
		this.setId(id);
		scan.nextLine();//넘어가기 방지
		
		System.out.print("Name: ");
		String name = scan.nextLine();
		this.setName(name);
		
		System.out.print("Height: ");
		double height = scan.nextDouble();
		this.setHeight(height);
		
		System.out.print("Weight: ");
		double weight = scan.nextDouble();
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
