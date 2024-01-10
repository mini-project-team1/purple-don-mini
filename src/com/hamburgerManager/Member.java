package com.hamburgerManager;

import com.hamburgerManage.Dto.memberDTO;

import java.util.Scanner;

import static com.hamburgerManager.Pay.price;

public class Member {

    payView payview = new payView();
    Scanner sc = new Scanner(System.in);
    memberDTO[] memberList = new memberDTO[30];

    {
        memberList[0] = new memberDTO("김정희", "01011112222");
        memberList[1] = new memberDTO("이후영", "01055556666");
        memberList[2] = new memberDTO("이수민", "01077778888");
        memberList[3] = new memberDTO("우리조", "01099998888");
        memberList[4] = new memberDTO("박수쳐", "01012345678");
    }

    int index = 5;

    public void chooseListSingle() {

        System.out.println("회원검증을 시작합니다.");
        System.out.println("이름을 입력해주세요 ");
        String str = sc.nextLine();
        for (memberDTO marr : memberList){

            if(marr==null){
                System.out.println("일치하는 맴버가 없습니다.");
                regist();
                payview.singleMemberPay();
                return;
            }

            if(marr.getName().equals(str)){
                System.out.println("회원인증에 성공하였습니다.");
                payview.singleMemberPay();
                return;
            }



        }




    }

    public void chooseListSet() {

        System.out.println("회원검증을 시작합니다.");
        System.out.println("이름을 입력해주세요 ");
        String str = sc.nextLine();
        for (memberDTO marr : memberList){

            if(marr==null){
                System.out.println("일치하는 맴버가 없습니다.");
                regist();
                payview.setMemberPay();
                return;
            }

            if(marr.getName().equals(str)){
                System.out.println("회원인증에 성공하였습니다.");
                payview.setMemberPay();
                return;
            }



        }




    }


    public void regist() {

        System.out.println("회원가입을 진행합니다.");

        System.out.print("성함을 입력하세요 : ");
        String newName = sc.nextLine();

        System.out.print("휴대폰 번호를 입력하세요 : ");
        String newPhone = sc.nextLine();

        memberList[index] = new memberDTO(newName, newPhone);
        System.out.println(memberList[index].memberInformation());

        System.out.println(newName + "님, 회원 가입이 완료되었습니다.");

    }



}