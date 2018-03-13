import java.util.Scanner;

public class MemberMenu {
    private Scanner sc = new Scanner(System.in);
    private MemberManager mManager = new MemberManager();
    private Member member = new Member();

    public void MemberMenu(){

    }

    public void mainMenu(){
        System.out.print("Maximum Member Count : " + MemberManager.SIZE + "\n");
        System.out.print("******Member Manager******" + "\n");
        System.out.print("1.New Member" + "\n");
        System.out.print("2.Search Member" + "\n");
        System.out.print("3.Modify Member" + "\n");
        System.out.print("4.Sort Member" + "\n");
        System.out.print("5.Delete Member" + "\n");
        System.out.print("6.Show All Member" + "\n");
        System.out.print("9.Exit Menu" + "\n");
        System.out.print("Select Menu : ");

        int num = sc.nextInt();
        switch (num) {
            case 1:
                mManager.memberInput();
                mainMenu();
                break;
            case 2:
                searchMenu();
                mainMenu();
                break;
            case 3:
                modifyMenu();
                mainMenu();
                break;
            case 4:
                sortMenu();
                mainMenu();
                break;
            case 5:
                mManager.deleteMember();
                mainMenu();
                break;
            case 6:
                mManager.printAllMember();
                mainMenu();
                break;
            case 9:
                break;
        }
    }
    public void searchMenu(){

        System.out.print("********Search Member*********" + "\n");
        System.out.print("1.Search for Id" + "\n");
        System.out.print("2.Search for Name" + "\n");
        System.out.print("3.Search for E-mail" + "\n");
        System.out.print("9.Back to Main Menu" + "\n");
        System.out.print("Select Menu : ");

        int sNum = sc.nextInt();

        switch (sNum) {
            case 1:
                System.out.print("Insert Search Id : ");
                String id = sc.next();
                mManager.searchMemberId(id);
                searchMenu();
                break;
            case 2:
                System.out.print("Insert Search Name : ");
                String name = sc.next();
                mManager.searchMemberName(name);
                searchMenu();
                break;
            case 3:
                System.out.print("Insert Search E-mail : ");
                String email = sc.next();
                mManager.searchMemberEmail(email);
                searchMenu();
                break;
            case 9:
                mainMenu();
                break;
        }

    }
    public void sortMenu(){
        System.out.print("********Show Member Sort*********" + "\n");
        System.out.print("1.Sort Id for Asc" + "\n");
        System.out.print("2.Sort Id for Des" + "\n");
        System.out.print("3.Sort Age for Asc" + "\n");
        System.out.print("4.Sort Age for Des" + "\n");
        System.out.print("5.Sort Gender(Men)" + "\n");
        System.out.print("9.Back to Menu" + "\n");
        System.out.print("Select Menu : ");

        int soNum = sc.nextInt();

        switch (soNum) {
            case 1:
                mManager.sortIDAsc();
                sortMenu();
                break;
            case 2:
                mManager.sortIDDes();
                sortMenu();
                break;
            case 3:
                mManager.sortAgeAsc();
                sortMenu();
                break;
            case 4:
                mManager.sortAgeDes();
                sortMenu();
                break;
            case 5:
                mManager.sortGenderDes();
                sortMenu();
                break;
            case 9:
                mainMenu();
                break;
        }


    }
    public void modifyMenu(){
        System.out.print("********Modify Member*********" + "\n");
        System.out.print("1.Change Password" + "\n");
        System.out.print("2.Change E-Mail" + "\n");
        System.out.print("3.Change Age" + "\n");
        System.out.print("9.Back to Menu" + "\n");
        System.out.print("Select Menu : ");

        int mNum = sc.nextInt();

        switch (mNum) {
            case 1:
                System.out.print("Insert New Password : ");
                String nPassword = sc.next();
                member.setPassword(nPassword);
                System.out.print("Password Changed!!");
                modifyMenu();
                break;
            case 2:
                System.out.print("Insert New E-mail : ");
                String nEmail = sc.next();
                member.setEmail(nEmail);
                System.out.print("Email Changed!!");
                modifyMenu();
                break;
            case 3:
                System.out.print("Insert New Age : ");
                int nAge = sc.nextInt();
                member.setAge(nAge);
                System.out.print("Age Changed!!");
                modifyMenu();
                break;
            case 9:
                mainMenu();
                break;
        }


    }
    public Member findMember(int index){

        return null;
    }


}
