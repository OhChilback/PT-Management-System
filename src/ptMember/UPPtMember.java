package ptMember;

import java.util.Scanner;

//새로운 추상 클래스 생성
//PtMember가 부모 클래스

public abstract  class UPPtMember extends PtMember {

	public UPPtMember(PtMemberType type) {
		super(type);
	}
	@Override
	public abstract void getUserScan(Scanner scan);

	@Override
	public void viewPrint(){
		String stype = getTypeString(); //새로운 메소드 추가, 코드 옮김
		System.out.println();
		System.out.println("type:" + stype + " name:"+name+" id:"+id+" height:"+height+" weight:"+weight);
		System.out.println("age:"+age+" birthday:"+birthday+" gender:"+gender+" phoneNumber:"+phoneNumber+" address:"+address);
		System.out.println("recommand Calories:" + calories );
		System.out.println();
	}
	
	//적정칼로리 출력여부 묻는 메소드 추가
	//타입별 활동지수가 다르게 파라미터 하나 추가
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
