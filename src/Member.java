public class Member {
    private String id;

    public Member() {

    }

    public String getId(){

        return id;
    }

    public void setId(String id){

        this.id = id;
    }
    private String name;

    public String getName(){

        return name;
    }

    public void setName(String name){

        this.name = name;
    }
    private String password;

    public String getPassword(){

        return password;
    }

    public void setPassword(String password){

        this.password = password;
    }
    private String email;

    public String getEmail(){

        return email;
    }

    public void setEmail(String email){

        this.email = email;
    }
    private String gender;

    public String getGender(){

        return gender;
    }

    public void setGender(String gender){

        this.gender = gender;
    }
    private int age;

    public int getAge(){

        return age;
    }

    public void setAge(int age){

        this.age = age;
    }



    public Member(String id, String name, String password, String email, String gender, int age){
        this.age = age;
        this.email = email;
        this.id = id;
        this.gender = gender;
        this.name = name;
        this.password = password;
    }
    public String memberInfo(){
        return "ID : " + id + "\t" + "Name :" + name + "\t" + "Pass : " + password + "\t" + "E-Mail : " + email + "\t" +
                "Gender : " + gender + "\t" + "Age : " + age + "\n";
    }

}

