package ptMember;

import java.util.Scanner;



public abstract  class UPPtMember extends PtMember {

	public UPPtMember(PtMemberType type) {
		super(type);
	}
	@Override
	public abstract void getUserScan(Scanner scan);

	@Override
	public void viewPrint(){
		String stype = getTypeString(); 
		System.out.println();
		System.out.println("type:" + stype + " name:"+name+" id:"+id+" height:"+height+" weight:"+weight);
		System.out.println("age:"+age+" birthday:"+birthday+" gender:"+gender+" phoneNumber:"+phoneNumber+" address:"+address);
		System.out.println("recommand Calories:" + calories );
		System.out.println();
	}
	
		public void setPtMemberCalorieswithYN(Scanner scan, int index) {
			char answer = 'x';
			
			while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
			{
				
				System.out.print("Do you want to show Balance recommand calories? (Y/N)");
				answer = scan.next().charAt(0);
				if(answer == 'y' || answer == 'Y') {
					double calories = this.getWeight()* index;
					this.setCalories(calories);
					
					break;
				}
				else if(answer == 'n' || answer == 'N') {
					this.setCalories(0);
					break;
				}
				else {
					
				}
			}
			
		}

}
