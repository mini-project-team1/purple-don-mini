package com.hamburgerManager;

import java.util.Scanner;

public class member {
    Scanner sc = new Scanner(System.in);
    MemberDTO[] memberList = new MemberDTO[30];

    {
        memberList[0] = new MemberDTO("김정희", "01011112222");
        memberList[1] = new MemberDTO("이후영", "01055556666");
        memberList[2] = new MemberDTO("이수민", "01077778888");
        memberList[3] = new MemberDTO("우리조", "01099998888");
        memberList[4] = new MemberDTO("박수쳐", "01012345678");
    }

    int index = 5;

    public void chooseList() {
        System.out.print("회원 / 비회원을 조회합니다. 성함을 입력하세요 : ");
        String insertName = sc.nextLine();

        for (MemberDTO mem : memberList) {

            if(mem==null) {
                break;
            }

            if (mem.getName().equals(insertName)) {

                System.out.println(mem.memberInformation());
                System.out.println(mem.getName() + "님, 안녕하세요! 회원 전용 1주년 할인 쿠폰이 발급되었습니다. 결제를 진행해주세요.");
                return;
            }

        }

        System.out.print("등록되지 않은 성함입니다. 현재 회원 전용 1주년 할인 쿠폰 증정이벤트 진행중입니다. 회원 가입 하시겠습니까? : (Y / N) ");
        String str = sc.nextLine().toUpperCase();

        if (str.equals("Y")) {

            regist();

        } else {
            System.out.println("비회원으로 결제를 진행합니다.");

        }

    }


    public void regist() {

        System.out.println("회원가입을 진행합니다.");

        System.out.print("성함을 입력하세요 : ");
        String newName = sc.nextLine();

        System.out.print("휴대폰 번호를 입력하세요 : ");
        String newPhone = sc.nextLine();

        memberList[index] = new MemberDTO(newName, newPhone);
        System.out.println(memberList[index].memberInformation());

        System.out.println(newName + "님, 회원 가입이 완료되었습니다.");

    }



}
