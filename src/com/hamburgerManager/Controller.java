package com.hamburgerManager;


import com.hamburgerManage.View.burgerView;
import com.hamburgerManage.View.setView;


import java.util.Scanner;

public class Controller {
   setView SETVIEW= new setView();
    burgerView BURGERVIEW = new burgerView();

    Member member = new Member();




    public void mainMenu() {
        String c;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("🍔🍟🍔🍟 롯데리아에 오신것을 환영합니다 🍔🍟🍔🍟");
            System.out.println(" 1. 🍔 햄버거 단품 선택"); // 일단 멤버프로그램 돌리려고 여기에 멤버조회 넣어놨어요!!
            System.out.println(" 2. 🍔🍟🍹 세트 메뉴 선택");
            System.out.println(" 9. 프로그램 종료");
            System.out.print("메뉴 번호를 입력하세요 : ");
             c = sc.nextLine();
            switch (c) {
                case "1" :
                    BURGERVIEW.burgurview();
                    break;
                case "2" :
                    SETVIEW.burgurviewset();
                    SETVIEW.drinkview();
                    SETVIEW.sideview();
                    System.out.println(SETVIEW.setInformation());
                    member.chooseListSet();



                    break;
                case "9" :
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다, 처음으로 돌아갑니다");
            }

        } while (!c.equals("9"));

    }
}
