package com.run;

import com.hamburgerManager.Controller;

public class Application {



    public static void main(String[] args) {



         /*버거메뉴
        * 치즈버거(5000)
        * 불고기버거(6000)
        * 새우버거(7000)
        * 핫크리스피버거(8000)
        * 한우버거(9000)
        *
        * <음료>
        * 콜라,사이다,제로콜라,환타, 선택안함
        *
        * <사이드>
        치즈스틱, 양념감자, 코우슬로, 웨지포테이토, 통오징어링, 선택안함
        *
        * [세트]
        * 음료,사이드를 다 선택하면 세트로 넘어감
        * 할인적용후 결제
        *
        * [단품]
        * 바로 결제로 넘어가는것 회원일시 바로 쿠폰적용, 비회원일때 가입여부(가입하고 결제 / 바로 결제) 묻기
        *
        * [결제]
        * 회원번호입력, 맞으면 회원으로 넘어가서 바로 쿠폰 적용
        * 비회원 일때 가입여부 묻기
        * 비회원일때, 회원가입창으로 바로 넘어가기*/
        Controller controllermenu = new Controller();
        controllermenu.mainMenu();
    }

}
