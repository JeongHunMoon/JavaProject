package project1.pac2;
import java.util.Scanner;
public class Mainclass {
	public static void main(String[] args) {
		System.out.println('\n'+"-----------------<���� ���߱� ����>--------------------------");
		System.out.println("��Ģ1. ��ǻ�Ͱ� 1~100���� ���� �� �ϳ��� ���� ���߸� �ִ� ��� õ������ �޽��ϴ�.");
		System.out.println("��Ģ2. ��Ʈ�� �� 2���̰� ��Ʈ ���� 300���� �����˴ϴ�.");
		System.out.println("��Ģ3. �ѹ� �õ� �� ������ 50������ �����˴ϴ�.");
		System.out.println("���� <1> , ����<0>");
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
				System.out.println("������ �����մϴ�.");
				return;
			}
			else {
				System.out.print("�ٽ� �Է��ϼ���>");
			}
		}
		
		int computer_random = (int) (Math.random()*100 +1);
		int total_money = 10000000;
		int hint_1 = (int)(Math.log10(computer_random) +1); // ���ڸ� ������ �˷��ִ� �����Դϴ�.
		int hint_2; // ������ �ڸ����� �˿���� �����Դϴ�.
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
				System.out.print("��ü �ڸ��� ��Ʈ <1> , ���� ���ڸ��� ��Ʈ <2> , ��Ʈ ��� ����<3>  �Է� >>");
				while(true) {
					hint_user_input = sc.nextInt();
					sc.nextLine();
						
					if(hint_user_input == 1 || hint_user_input == 2 || hint_user_input ==3) {
						if(hint_user_input == 1) {
							if(hint_1_on_off ==0) {
								System.out.println("��ü �ڸ����� " + hint_1+ "�ڸ��Դϴ�.");
								total_money -= 3000000;
								hint_1_on_off = 1;
								break outer_loop;
							}
							if (hint_1_on_off == 1) {
								System.out.print("��Ʈ1 ����� �ٽ� �Է�>>");
								continue;
							}
							
						}
							
						else if (hint_user_input == 2) {
							if(hint_2_on_off ==0) {
								System.out.println("���� ���ڸ����� " + hint_2+ "�Դϴ�.");
								total_money -= 3000000;
								hint_2_on_off = 1;
								break outer_loop;
							}
							if (hint_2_on_off == 1) {
								System.out.print("��Ʈ2 ����� �ٽ� �Է�>>");
								continue;
							}
						}
						
						else { 
							break outer_loop;
						}
						
					}
					else {
						System.out.print("�ٽ� �Է� >>");
					}
				}
					
			}
			//
		
			System.out.println("���� ���:" + total_money + "����");
			System.out.print("������ �����Ͽ� ������ �Է�>>");
			userinput = sc.nextInt();
			sc.nextLine(); // ���Ͱ� ���۸� �����ִ� �κ��Դϴ�.
			
			if(computer_random == userinput) {
				System.out.println('\n');
				System.out.println("�����մϴ�. ��� : " + total_money +"���� �Դϴ�!");
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
				System.out.println("�������ϴ�. ");
				break;
			}
		
		}
	}
}