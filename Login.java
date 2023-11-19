/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cse.oop2.project_hms;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManagerLogin manager = new ManagerLogin();
        CsrLogin csr = new CsrLogin();
        Scanner sc = new Scanner(System.in);
        String managerID = "manager";
        String managerPW = "1234";
        String csrID = "csr", csrPW = "5678";

        while (true) {
            System.out.println("---호텔 매니저 프로그램 로그인 페이지입니다.---");
            System.out.print("ID: ");
            String id = sc.nextLine(); //아이디 입력
            System.out.print("PW: ");
            String pw = sc.nextLine(); //비밀번호 입력 
            if (managerID.equals(id) || csrID.equals(id) == true) { //관리자 아이디와 같으면
                if (managerPW.equals(pw) == true) { // 관리자 비번이 입력되면
                    System.out.println("관리자로 로그인되었습니다.");
                    manager.managerpage();//관리자 로그인 메소드 호출
                    return;
                } else if (csrPW.equals(pw) == true) { //담당자 비번이 입력되면
                    System.out.println("고객서비스 담당자로 로그인되었습니다.");
                    csr.csrpage();  //담당자 로그인 메소드 호출
                    return;
                } else {
                    System.out.println("비밀번호가 틀렸습니다.");
                }
            } else {
                System.out.println("아이디가 틀렸습니다.");
            }
        }
        //만약 id가 manager이고 비밀번호가 1234라면 관리자 메소드로 이동 틀리면 로그인 실패 문구 출력
        //만약 id가 scr이고 비밀번호가 1234라면 담당자 메소드로 이동 클리면 실패문구 출력 
    }

}
