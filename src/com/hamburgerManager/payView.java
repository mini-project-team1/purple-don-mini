package com.hamburgerManager;

import static com.hamburgerManager.Pay.price;

public class payView {
    public void singleMemberPay(){
        int coupon =(int) (Math.random()*6 + 5);
        System.out.println("⭐ 1주년 오픈 이벤트로 5%~10% 회원쿠폰 적용되었습니다. ⭐");
        System.out.println("이벤트 쿠폰" + coupon + " % 쿠폰 할인 적용되어 총 금액은 " + ( price /100 *(100-coupon))  + "원 입니다.");
        price=0;
        System.out.println("최종 결제 완료되었습니다. 👌😁");
    }

    public void setMemberPay(){
        int coupon =(int) (Math.random()*6 + 5);
        int setFinalPay = ( price /100 *(100-coupon));
        System.out.println("⭐ 1주년 오픈 이벤트로 5%~10% 회원쿠폰 적용되었습니다. ⭐");
        System.out.println("이벤트 쿠폰" + coupon + " % 쿠폰 할인 적용되어 " + setFinalPay + " 원 입니다.");
        System.out.println("🙌 세트 할인 1000원이 적용되었습니다. 🙌");
        System.out.println("총 금액은 " + (setFinalPay-1000)  + "원 입니다.");
        price=0;
        System.out.println("최종 결제 완료되었습니다. 👌😁");
    }

}