/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.oop2.project_hms;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class CsrLogin {

    //호출해야할 메소드의 객체 넣기
    //담당자 로그인 메소드를 만들자.
    void csrpage() {
        while (true) {
            System.out.println(" ");
            System.out.println("고객 서비스 담당자 페이지");
            System.out.println("------메뉴를 선택하세요-------");
            System.out.println("1.예약 2.음식 9.프로그램 종료");

            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();

            switch (choice) {                   
                case "1"://예약 메소드 호출                   
                    break;
                case "2"://음식 메소드 호출 
                    
                    break;
                case "9"://프로그램 종료 
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("1~3번 중에 선택하세요.");
                    break;
                    
            }
        }
    }
}
