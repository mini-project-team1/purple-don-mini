package com.hamburgerManager;


import com.hamburgerManage.View.burgerView;

import java.util.Scanner;

public class Controller {
    burgerView BURGERVIEW = new burgerView();

    public void mainMenu() {
        int c;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("======롯데리아에 오신것을 환영합니다=======");
            System.out.println(" 1. 햄버거 단품 선택"); // 일단 멤버프로그램 돌리려고 여기에 멤버조회 넣어놨어요!!
            System.out.println(" 2. 세트메뉴 선택");
            System.out.println(" 9. 프로그램 종료");
            System.out.print("메뉴번호를 입력하세요 : ");
            c = sc.nextInt();
            switch (c){
                case 1 : BURGERVIEW.burgurview(); break;
                //

//                case 2 : BURGERVIEW.burgurview(); break;

                case 9 : System.out.println("프로그램 종료"); break;
                default: System.out.println("다시 입력해주세요");
            }

        }while(c != 9);

    }
