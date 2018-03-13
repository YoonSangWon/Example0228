import java.util.Scanner;

public class MemberManager {
    public static final int SIZE = 10;
    Scanner sc = new Scanner(System.in);
    private Member[] mArr = new Member[SIZE];


    private int memberCount;

    public int getMemberCount(){

        return memberCount;
    }

    public void setMemberCount(int memberCount){

        this.memberCount = memberCount;
    }

    public void memberInput(){
            if (memberCount < mArr.length) {
                System.out.print("Insert Id : " + "\n");
                String id = sc.next();
                System.out.print("Insert Name : " + "\n");
                String name = sc.next();
                System.out.print("Insert Password : " + "\n");
                String password = sc.next();
                System.out.print("Insert E-mail : " + "\n");
                String email = sc.next();
                System.out.print("Insert Gender : " + "\n");
                String gender = sc.next();
                System.out.print("Insert Age : " + "\n");
                int age = sc.nextInt();

                mArr[memberCount++] = new Member(id, name, password, email, gender, age);
            }else
                System.out.print("Error");
        }

    public void deleteMember(){


    }

    public void printAllMember(){
        for (int i = 0; i < memberCount; i++) {
            System.out.print(mArr[i].memberInfo());
        }
        System.out.print("Now MemberCount : " + memberCount + "\n");
        System.out.print("Can Insert " + (MemberManager.SIZE - memberCount) + " Member" + "\n" + "\n");
    }
    public void MemberManager(){

    }
    public int searchMemberId(String id){

        return 0;
    }
    public int searchMemberName(String name){

        return 0;
    }
    public int searchMemberEmail(String email){

        return 0;
    }
    public void printMember(int index){

    }
    public void sortIDAsc(){


    }
    public void sortIDDes(){

    }
    public void sortAgeAsc(){

    }
    public void sortAgeDes(){

    }
    public void sortGenderDes(){

    }









}

