package com.hamburgerManager;

public class Pay {
    private String burgername;
    public static int price = 0;

    Member member = new Member();

    public void BURGERNAME(String burgername, boolean single) {
        this.burgername =burgername;

        if(single == true){
                member.chooseList();
                singleNoMemberPay();






        }else{



        }





    }
    public void DRINKNAME(String drinkname) {





    }

    public void SIDENAME(String sidename) {





    }

    public void singleNoMemberPay(){
        System.out.println("총금액은" +price + "원 입니다.");
        price=0;
        System.out.println("최종 결제 완료되었습니다.");

    }

    public void singleMemberPay(){
        int coupon =(int) (Math.random()*6 + 5);
        System.out.println("총금액은" + ( price /100 *(100-coupon))  + "원 입니다.");
        price=0;
        System.out.println("최종 결제 완료되었습니다.");

    }

}
