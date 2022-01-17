package project1.pac2;
import java.util.Scanner;
public class Mainclass {
	public static void main(String[] args) {
		System.out.println('\n'+"-----------------<숫자 맞추기 게임>--------------------------");
		System.out.println("규칙1. 컴퓨터가 1~100까지 숫자 중 하나를 고르면 맞추면 최대 상금 천만원을 받습니다.");
		System.out.println("규칙2. 힌트는 총 2번이고 힌트 사용시 300만원 차감됩니다.");
		System.out.println("규칙3. 한번 시도 할 때마다 50만원씩 차감됩니다.");
		System.out.println("시작 <1> , 종료<0>");
		System.out.println("---------------------------------------------------------");
		System.out.print(">");
		Scanner sc = new Scanner(System.in);
		int on_off= -1;
		while(true) {
			on_off = sc.nextInt();
			if(on_off == 1) {
				for(int i = 0; i < 30; i++) {
					System.out.println();
				}
				break;
			}
			else if(on_off == 0) {
				System.out.println("게임을 종료합니다.");
				return;
			}
			else {
				System.out.print("다시 입력하세요>");
			}
		}
		
		int computer_random = (int) (Math.random()*100 +1);
		int total_money = 10000000;
		int hint_1 = (int)(Math.log10(computer_random) +1); // 몇자리 수인지 알려주는 변수입니다.
		int hint_2; // 마지막 자리수를 알여루는 변수입니다.
		if(hint_1 ==1 ) {
			hint_2 = computer_random;
		}
		else if(hint_1 ==2) {
			hint_2 = computer_random % 10;
		}
		else {
			hint_2 = 0;
		}
		
		int userinput;
		int hint_user_input=-1;
		int hint_1_on_off =0 , hint_2_on_off = 0;
		
		while(true) {
			outer_loop: //
			while(true) {
				System.out.print("전체 자리수 힌트 <1> , 제일 끝자리수 힌트 <2> , 힌트 사용 안함<3>  입력 >>");
				while(true) {
					hint_user_input = sc.nextInt();
					sc.nextLine();
						
					if(hint_user_input == 1 || hint_user_input == 2 || hint_user_input ==3) {
						if(hint_user_input == 1) {
							if(hint_1_on_off ==0) {
								System.out.println("전체 자리수는 " + hint_1+ "자리입니다.");
								total_money -= 3000000;
								hint_1_on_off = 1;
								break outer_loop;
							}
							if (hint_1_on_off == 1) {
								System.out.print("힌트1 사용함 다시 입렵>>");
								continue;
							}
							
						}
							
						else if (hint_user_input == 2) {
							if(hint_2_on_off ==0) {
								System.out.println("제일 끝자리수는 " + hint_2+ "입니다.");
								total_money -= 3000000;
								hint_2_on_off = 1;
								break outer_loop;
							}
							if (hint_2_on_off == 1) {
								System.out.print("힌트2 사용함 다시 입렵>>");
								continue;
							}
						}
						
						else { 
							break outer_loop;
						}
						
					}
					else {
						System.out.print("다시 입력 >>");
					}
				}
					
			}
			//
		
			System.out.println("현재 상금:" + total_money + "만원");
			System.out.print("정답을 추측하여 보세요 입력>>");
			userinput = sc.nextInt();
			sc.nextLine(); // 엔터값 버퍼를 지워주는 부분입니다.
			
			if(computer_random == userinput) {
				System.out.println('\n');
				System.out.println("축하합니다. 상금 : " + total_money +"만원 입니다!");
				break;
			}
			else {
				if(userinput  - computer_random < 0) {
					System.out.println("HIGH" + '\n');
				}
				else {
					System.out.println("LOW"+ '\n');
				}
				total_money -= 500000;
			}
			
			if(total_money <= 0) {
				System.out.println("끝났습니다. ");
				break;
			}
		
		}
	}
}