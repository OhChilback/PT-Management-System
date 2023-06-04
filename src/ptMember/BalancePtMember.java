package ptMember;

import java.util.Scanner;

public class BalancePtMember extends UPPtMember {
	
	public BalancePtMember(PtMemberType type) {
			super(type);
		}
	
	public void getUserScan(Scanner scan) {
	
		setPtMemberID(scan);
		setPtMemberName(scan);
		setPtMemberHeight(scan);
		setPtMemberWeight(scan);
		setPtMemberCalorieswithYN(scan, 30);
		setPtMemberAge(scan);
		setPtMemberBirthday(scan);
		setPtMemberGender(scan);
		setPtMemberPhoneNumber(scan);
		
		setPtMemberAddress(scan);
		
	}
	
	
	
	
		
}