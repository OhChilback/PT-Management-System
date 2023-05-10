package ptMember;
import java.util.Scanner;
//PtMember 추상화
public abstract class PtMember {

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
	//type 포함 생성자 추가 + 칼로리
	public PtMember(PtMemberType type, int id, String name, double height,double weight, 
			int age, int birthday, String gender, String address, int phoneNumber, double calories)
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
	// 칼로리
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
	
	//추상method
	 public abstract void viewPrint();
	
	
	
	
		
	
}