package com.hamburgerManage.View;

import com.hamburgerManager.Pay;

import java.util.Scanner;

public class drinkView {

    Pay pay = new Pay();
    public void drinkview() {

        Scanner sc = new Scanner(System.in);
        System.out.println("1. 콜라");
        System.out.println("2. 사이다");
        System.out.println("3. 제로콜라");
        System.out.println("4. 환타");
        System.out.print("알맞은 메뉴를 골라주세요");

        int c = sc.nextInt();

        sc.nextLine();

        switch (c){

            case 1 :
                Pay.price += 2000;
                System.out.println("콜라를 선택하셨습니다.");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                pay.DRINKNAME("콜라");

                break;
            case 2 : Pay.price += 2100;
                System.out.println("사이다");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                pay.DRINKNAME("사이다");
                break;
            case 3 : Pay.price += 2500;
                System.out.println("제로콜라");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                pay.DRINKNAME("제로콜라");
                break;
            case 4 : Pay.price += 2300;
                System.out.println("환타");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                pay.DRINKNAME("환타");
                break;

            default:
                System.out.println("알맞은 메뉴를 선택해주세요 : "); break;

        }





    }

}
