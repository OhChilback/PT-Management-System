package menuManager;

import java.util.Scanner;
import ptMember.UserScan;
import ptMember.BalancePtMember;
import ptMember.BulkUpPtMember;
import ptMember.DietPtMember;
import ptMember.LeanmassUpManager;
import ptMember.PtMemberType;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class PtMemberManager implements Serializable {

    private static final long serialVersionUID = -3753916804109872456L;

    ArrayList<UserScan> ptMembers = new ArrayList<UserScan>();

    transient Scanner scan;

    public PtMemberManager(Scanner scan) {
        this.scan = scan;
    }

    public void addMembers() {
        int type = 0;
        UserScan userScan;
        while (type < 1 || type > 4) {
            try {
                System.out.println("1 is Diet type");
                System.out.println("2 is Bulk up type");
                System.out.println("3 is Leanmassup type");
                System.out.println("4 is Balance type");
                System.out.print("Select PtMember Type 1 ~ 4:");
                type = scan.nextInt();
                if (type >= 1 && type <= 4) {
                    userScan = createPtMember(type);
                    userScan.getUserScan(scan);
                    ptMembers.add(userScan);
                    break;
                } else {
                    System.out.println("Wrong number! Try again with an accurate number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please input an integer");
                if (scan.hasNext()) {
                    scan.next();
                }
                type = -1;
            }
        }
    }

    private UserScan createPtMember(int type) {
        PtMemberType memberType = null;
        switch (type) {
            case 1:
                memberType = PtMemberType.DIET;
                return new DietPtMember(memberType);
            case 2:
                memberType = PtMemberType.BULKUP;
                return new BulkUpPtMember(memberType);
            case 3:
                memberType = PtMemberType.LEANMASSUP;
                return new LeanmassUpManager(memberType);
            case 4:
                memberType = PtMemberType.BALANCE;
                return new BalancePtMember(memberType);
            default:
                return null;
        }
    }

    public void deleteMembers() {
        System.out.print("Client ID: ");
        int id = scan.nextInt();
        int index = findIndex(id);
        if (index != -1) {
            removeFromPtMember(index, id);
        } else {
            System.out.println("The ptMember has not been registered.");
        }
    }

    public int findIndex(int id) {
        int index = -1;
        for (int i = 0; i < ptMembers.size(); i++) {
            if (ptMembers.get(i).getId() == id) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void removeFromPtMember(int index, int id) {
        ptMembers.remove(index);
        System.out.println("The ptMember " + id + " is deleted.");
    }

    public void editMembers() {
        System.out.print("Edited ID: ");
        int ptMemberId = scan.nextInt();

        for (int i = 0; i < ptMembers.size(); i++) {
            UserScan user = ptMembers.get(i);
            if (user.getId() == ptMemberId) {
                int num = -1;
                while (num != 10) {
                    showEditMenu();
                    num = scan.nextInt();

                    switch (num) {
                        case 1:
                            user.setPtMemberID(scan);
                            break;
                        case 2:
                            user.setPtMemberName(scan);
                            break;
                        case 3:
                            user.setPtMemberHeight(scan);
                            break;
                        case 4:
                            user.setPtMemberWeight(scan);
                            break;
                        case 5:
                            user.setPtMemberAge(scan);
                            break;
                        case 6:
                            user.setPtMemberBirthday(scan);
                            break;
                        case 7:
                            user.setPtMemberGender(scan);
                            break;
                        case 8:
                            user.setPtMemberAddress(scan);
                            break;
                        case 9:
                            user.setPtMemberPhoneNumber(scan);
                            break;
                        default:
                            continue;
                    }

                }
                break;
            }
        }
    }

    public void viewMembers() {
        System.out.println("Currently registered members: " + ptMembers.size());
        for (int i = 0; i < ptMembers.size(); i++) {
            ptMembers.get(i).viewPrint();
        }
    }
    
    //저장된 크기 반환하기
    public int size() {
        return ptMembers.size();
    }
    
    //크기가 얼마인지 구하기
    public UserScan get(int index) {
        if (index >= 0 && index < ptMembers.size()) {
            return ptMembers.get(index);
        } else {
            return null;
        }
    }

    public void showEditMenu() {
        System.out.println("1. Edit ID");
        System.out.println("2. Edit Name");
        System.out.println("3. Edit Height");
        System.out.println("4. Edit Weight");
        System.out.println("5. Edit Age");
        System.out.println("6. Edit Birthday");
        System.out.println("7. Edit Gender");
        System.out.println("8. Edit Address");
        System.out.println("9. Edit Phone");
        System.out.println("10. Exit");
        System.out.print("Select Menu Number: ");
    }

}
