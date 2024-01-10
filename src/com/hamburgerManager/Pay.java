package com.hamburgerManager;

public class Pay {

    private String burgername;
    private String drinkname;
    private String sidename;


    public static int price = 0;

    Member member = new Member();

    public void BURGERNAME(String burgername, boolean single) {
        this.burgername =burgername;

        if(single == true){
            member.chooseListSingle();

        }else{
            member.chooseListSet();
        }
    }
  
    public void DRINKNAME(String drinkname) {
        this.drinkname = drinkname;


    }

    public void SIDENAME(String sidename) {
        this.sidename= sidename;


    }

    public String setInformation (){


        return "선택하신 메뉴는"+this.burgername+this.drinkname+this.sidename+"입니다.";

    }


}
