package project1.pac4;
import java.util.Scanner;
public class Mainclass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a1, a2, r1, b1, b2 , r2;
		System.out.print("ù ��° ���� �߽ɰ� �������� ���� �Է��ϼ���[3 5 8]>>");
		a1 = sc.nextInt();
		a2 = sc.nextInt();
		r1 = sc.nextInt();
		
		sc.nextLine();
		System.out.print("�� ��° ���� �߽ɰ� �������� ���� �Է��ϼ���[3 5 8]>>");
		b1 = sc.nextInt();
		b2 = sc.nextInt();
		r2 = sc.nextInt();
		
		double distance = Math.sqrt(Math.pow(a1-b1, 2) + Math.pow(a2-b2, 2));
		double radius_sum = r1 + r2;
		
		
		System.out.println("-----------------------------------");
		if(distance > radius_sum) {
			System.out.println("�� ���� ������ �ʽ��ϴ�.");
		}
		if(distance < radius_sum) {
			System.out.println("�� ���� �� ���� ������ �����ϴ�.");
		}
		if(distance == radius_sum) {
			System.out.println("�� ���� ���մϴ�.");
		}
		
		System.out.println("ù ��° ���� ������: " + "(x-" + a1 +")" + " + (y-"+ a2+") = "+ r1*r1);
		System.out.println("�� ��° ���� ������: " + "(x-" + b1 +")" + " + (y-"+ b2+") = "+ r2*r2);
		

		
	}
}