package ptMember;
import java.io.Serializable;
import java.util.Scanner;

import exception.AddressFormatException;

public abstract class PtMember implements UserScan, Serializable {
	
	private static final long serialVersionUID = -1850378311932806163L;
	
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

	protected double calories;

	public PtMember()
	{
		
	}
	
	public PtMember(PtMemberType type) {
		this.type = type;
	}
	
	public PtMember(String name,int id)
	{
		this.name = name;
		this.id= id;
	}	
	
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
	
	public void setAddress(String address) throws AddressFormatException {
		if(!address.contains("@") && !address.equals("")) {
			throw new AddressFormatException();
		}
		this.address = address;
	}
	
	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}
	
	public abstract void viewPrint();
	
		public void setPtMemberID(Scanner scan) {
			System.out.print("ID:");
			int id = scan.nextInt(); 
			this.setId(id); 
		}
		
		public void setPtMemberName(Scanner scan) {
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.next();
			this.setName(name);
		}
		
		public void setPtMemberHeight( Scanner scan) {
			System.out.print("Height: ");
			double height = scan.nextDouble();
			this.setHeight(height);
		}
		
		public void setPtMemberWeight(Scanner scan) {
			System.out.print("Weight: ");
			double weight = scan.nextDouble();
			this.setWeight(weight);
		}
		
		public void setPtMemberAge(Scanner scan) {
			System.out.print("Age: ");
			int age = scan.nextInt();
			this.setAge(age);
		}
		
		public void setPtMemberBirthday(Scanner scan) {
			System.out.print("Birthday: ");
			scan.nextLine();
			int birthday = scan.nextInt();
			this.setBirthday(birthday);
		}
		
		public void setPtMemberGender(Scanner scan) {
			System.out.print("Gender: ");
			scan.nextLine();
			String gender = scan.next();
			this.setGender(gender);
		}
		
	
		public void setPtMemberAddress(Scanner scan) {
			String  address = "";
			while(!address.contains("@")) {
				System.out.print("Address: ");
				address = scan.next();
				try {
					this.setAddress(address);
				} catch (AddressFormatException e) {
					System.out.println("Incorrect Address Format. put your address that contains @");
				}
			}
		}
		
		public void setPtMemberPhoneNumber(Scanner scan) {
			System.out.print("PhoneNumber: ");
			int phoneNumber = scan.nextInt();
			this.setPhoneNumber(phoneNumber);
		}
		
		
		public String getTypeString() {
			
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
			return stype;
		}
}