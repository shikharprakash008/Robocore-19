package surfer.example.surfer.robobore.Model;

public class Register {

    String teamName;
    String email;
    String member1,member2,member3,member4;
    String phone_no;
    String collage_usn;

    public Register(){

    }

    public Register(String teamName,String email,String member1,String member2,String member3,String member4,String phone_no,String collage_usn){
        this.teamName=teamName;

        this.email=email;
        this.member1=member1;
        this.member2=member2;
        this.member3=member3;
        this.member4=member4;
        this.phone_no=phone_no;
        this.collage_usn=collage_usn;

    }
    public String getTeamName(){
        return teamName;
    }
    public String setTeamName(){
        return teamName;
    }


    public String getEmail(){
        return email;
    }
    public String setEmail(){
        return email;
    }
    public String getMember1(){
        return member1;
    }
    public String setMember1(){
        return member2;

    }
    public String getMember2()
    {
    return member2;
    }
    public String setMember2(){
        return member3;
    }
    public String getMember3(){
        return member3;
    }
    public String setMember3(){
        return member3;
    }
    public String getMember4(){
        return member4;
    }
    public String setMember4(){
        return member4;
    }
    public String getPhone_no(){
        return phone_no;
    }
    public String setPhone_no(){
        return phone_no;
    }
    public String getCollage_usn(){
        return collage_usn;

    }
    public String setCollage_usn(){
        return collage_usn;
    }
}
