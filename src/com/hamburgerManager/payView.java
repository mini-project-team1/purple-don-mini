package com.hamburgerManager;

import static com.hamburgerManager.Pay.price;

public class payView {

    public void singleNoMemberPay(){
        System.out.println("총금액은" +price+ "원 입니다.");
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
