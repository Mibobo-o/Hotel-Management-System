/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.oop2.project_hms;

/**
 *
 * @author user
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class RoomServiceManager {
    public static void main(String args[]) {
                while(true){
                    int orderNumber = 0; //초기값 지정해야 오류 안생김

                // 사용자에게 서비스 메뉴를 표시
                System.out.println("[룸서비스/레스토랑 페이지]");
                System.out.println("------------메뉴를 선택하세요------------");
                System.out.println("1. 음식 메뉴 설정하기");
                System.out.println("2. 메뉴 보기");
                System.out.println("3. 고객님이 주문한 음식 메뉴 입력하기");
                System.out.println("4. 돌아가기");
                System.out.print(">>> ");

                // 번호 입력 받음
                Scanner sc = new Scanner(System.in);//scanner을 cs로 바꿈
                String serviceNum = sc.nextLine();
                //String serviceNumber = sc.nextInt(); //scanner을 cs로 바꿈
                //System.out.println("");

                // 1 선택시
                switch(serviceNum){
                    case "1":
                        // 룸서비스 메뉴 설정 서비스 호출
                    RoomServiceMenuSet menuSetting = new RoomServiceMenuSet();
                    menuSetting.configureMenu();
                    break; 
                    case "2":
                        // 룸서비스 메뉴 보기 서비스 호출
                    RoomServiceShowMenu showMenu = new RoomServiceShowMenu();
                    showMenu.displayMenu();
                    break;
                    case "3":
                        // 주문 입력 서비스 호출
                    RoomServiceOrder roomOrder = new RoomServiceOrder();
                    roomOrder.displayMenuInfo(orderNumber);
                    while (true) {
                        try {
                            System.out.print("주문하실 메뉴 번호를 입력하세요: ");
                            orderNumber = sc.nextInt();//scanner을 cs로 바꿈
                            break;
                        } catch (InputMismatchException e) {
                            // 입력이 숫자가 아닌 경우 예외 처리
                            System.out.println("숫자를 입력하세요. 다시 시도해주세요.");
                            sc.nextLine(); // 입력 버퍼 비우기//scanner을 cs로 바꿈
                        }
                    }
                    break;
                    case "4":
                        System.out.println("돌아가기");
                        /*Login back = new Login(); //Login 객체 생성
                        back.loginpage(); //Loginpage로 돌아감
                        //TODO 매니저나 csr페이지로 돌아갈 수 있도록 해야할듯? -> */
                        return;
                    default:
                        System.out.println("다시 시도해주세요.");
                        break;
                    }
                }
                
                //2 선택시 
/*                if (serviceNumber == 1) {
                    // 룸서비스 메뉴 설정 서비스 호출
                    RoomServiceMenuSet menuSetting = new RoomServiceMenuSet();
                    menuSetting.configureMenu();
                } else if (serviceNumber == 2) {
                    // 룸서비스 메뉴 보기 서비스 호출
                    RoomServiceShowMenu showMenu = new RoomServiceShowMenu();
                    showMenu.displayMenu();
                } else if (serviceNumber == 3) {
                    // 주문 입력 서비스 호출
                    RoomServiceOrder roomOrder = new RoomServiceOrder();
                    int orderNumber;

                    // 사용자가 숫자를 입력할 때까지 반복
                    while (true) {
                        try {
                            System.out.print("주문하실 메뉴 번호를 입력하세요: ");
                            orderNumber = sc.nextInt();//scanner을 cs로 바꿈
                            break;
                        } catch (InputMismatchException e) {
                            // 입력이 숫자가 아닌 경우 예외 처리
                            System.out.println("숫자를 입력하세요. 다시 시도해주세요.");
                            sc.nextLine(); // 입력 버퍼 비우기//scanner을 cs로 바꿈
                        }
                    }
                
                
                    // 주문 메뉴 정보 표시
                    roomOrder.displayMenuInfo(orderNumber);
                } else if (serviceNumber == 4) {
                    // 프로그램 종료
                    break;
                } else {
                    // 유효하지 않은 서비스 번호인 경우
                    System.out.println("유효하지 않은 서비스 번호입니다. 다시 시도해주세요.");
                }
            } catch (Exception e) {
                // 예외 처리: 입력 오류 메시지 출력
                System.out.println("입력 오류: " + e.getMessage());
                sc.nextLine(); // 입력 버퍼 비우기
            }
        }*/


        // Scanner 닫기
        //sc.close();
    }
}
