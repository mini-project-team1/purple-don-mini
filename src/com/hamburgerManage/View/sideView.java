package com.hamburgerManage.View;

import com.hamburgerManager.Pay;

import java.util.Scanner;

public class sideView {
    Pay pay = new Pay();

    public void sideview() {

        Scanner sc = new Scanner(System.in);
        System.out.println("1. 치즈스틱");
        System.out.println("2. 양념감자");
        System.out.println("3. 코울슬로");
        System.out.println("4. 웨지포테이토");
        System.out.println("5. 오징어링");
        System.out.println("사이드 메뉴를 선택해주세요 : ");
        int c = sc.nextInt();
        sc.nextLine();

        switch (c){

            case 1 :
                Pay.price += 1300;
                System.out.println("치즈스틱를 선택하셨습니다.");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                pay.SIDENAME("치즈스틱");
                break;

            case 2 : Pay.price += 3000;
                System.out.println("양념감자를 선택하셨습니다.");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                pay.SIDENAME("양념감자");
                break;

            case 3 : Pay.price += 3800;
                System.out.println("코울슬로를 선택하셨습니다.");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                pay.SIDENAME("코울슬로");
                break;
            case 4 : Pay.price += 3400;
                System.out.println("웨지포테이토를 선택하셨습니다.");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                pay.SIDENAME("웨지포테이토");
                break;
            case 5 : Pay.price += 1500;
                System.out.println("오징어릴을 선택하셨습니다.");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                pay.SIDENAME("오징어링");
                break;
            default:
                System.out.println("알맞은 메뉴를 선택해주세요 : "); break;

        }





    }
}
