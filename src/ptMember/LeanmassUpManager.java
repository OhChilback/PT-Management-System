package ptMember;

import java.util.Scanner;

public class LeanmassUpManager extends UPPtMember {
	
	
		public LeanmassUpManager(PtMemberType type) {
			super(type);
		}
		
	
	public void getUserScan(Scanner scan) {
		
		setPtMemberID(scan);
		setPtMemberName(scan);
		setPtMemberHeight(scan);
		setPtMemberWeight(scan);
		
		setPtMemberCalorieswithYN(scan , 25);
		
		setPtMemberAge(scan);
		setPtMemberBirthday(scan);
		setPtMemberGender(scan);
		setPtMemberPhoneNumber(scan);
		setPtMemberAddress(scan);
	}
	
	public void viewPrint(){
		String stype = getTypeString();		
		System.out.println();
		System.out.println("type:" + stype + " name:"+name+" id:"+id+" height:"+height+" weight:"+weight);
		System.out.println("age:"+age+" birthday:"+birthday+" gender:"+gender+" phoneNumber:"+phoneNumber+" address:"+address);
		System.out.println("recommand Calories:" + calories );
		System.out.println();
	}
	
	
}