package com.hamburgerManager;

public class Pay {

    private String burgername;
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





    }

    public void SIDENAME(String sidename) {





    }


}
