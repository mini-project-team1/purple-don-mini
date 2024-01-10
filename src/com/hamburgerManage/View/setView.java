package com.hamburgerManage.View;

import com.hamburgerManager.Pay;

import java.util.Scanner;

public class setView {
        Pay pay = new Pay();
    private String burgername;
    private String drinkname;
    private String sidename;

    public void burgurviewset() {

        Scanner sc = new Scanner(System.in);
        System.out.println("1. 치즈버거");
        System.out.println("2. 불고기버거");
        System.out.println("3. 새우버거");
        System.out.println("4. 핫크리스피버거");
        System.out.println("5. 한우버거");
        System.out.println("햄버거를 선택해주세요 : ");
        int c = sc.nextInt();
        sc.nextLine();

        switch (c){
            case 1 :
                Pay.price += 5000;
                System.out.println("치즈버거를 선택하셨습니다.");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                this.burgername = "치즈버거";

                break;
            case 2 : Pay.price += 6000;
                System.out.println("불고기버거");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                this.burgername = "불고기버거";
                break;
            case 3 : Pay.price += 7000;
                System.out.println("새우버거");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                this.burgername = "새우버거";
                break;
            case 4 : Pay.price += 8000;
                System.out.println("핫크리스피버거");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                this.burgername = "핫크리스피버거";
                break;
            case 5 : Pay.price += 9000;
                System.out.println("한우버거");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                this.burgername = "한우 버거,";
                break;
            default:
                System.out.println("알맞은 메뉴를 선택해주세요 : "); break;
        }

    }

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
                this.sidename = "치즈스틱";
                break;

            case 2 : Pay.price += 3000;
                System.out.println("양념감자를 선택하셨습니다.");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                this.sidename = "양념감자";
                break;

            case 3 : Pay.price += 3800;
                System.out.println("코울슬로를 선택하셨습니다.");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                this.sidename = "코울슬로";
                break;
            case 4 : Pay.price += 3400;
                System.out.println("웨지포테이토를 선택하셨습니다.");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                this.sidename = "웨지포테이토";
                break;
            case 5 : Pay.price += 1500;
                System.out.println("오징어릴을 선택하셨습니다.");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                this.sidename = "오징어링";
                break;
            default:
                System.out.println("알맞은 메뉴를 선택해주세요 : "); break;

        }





    }

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
                this.drinkname = "콜라";

                break;
            case 2 : Pay.price += 2100;
                System.out.println("사이다");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                this.drinkname = "사이다";
                break;
            case 3 : Pay.price += 2500;
                System.out.println("제로콜라");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                this.drinkname = "제로콜라";
                break;
            case 4 : Pay.price += 2300;
                System.out.println("환타");
                System.out.println("현재 가격은 " + Pay.price + "원 입니다.");
                this.drinkname = "환타";
                break;

            default:
                System.out.println("알맞은 메뉴를 선택해주세요 : "); break;

        }





    }


    public String setInformation (){


        return "선택하신 메뉴는"+this.burgername+", "+this.drinkname+", "+this.sidename+"입니다.";

    }









}









