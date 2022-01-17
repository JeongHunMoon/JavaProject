package project1.pac4;
import java.util.Scanner;
public class Mainclass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a1, a2, r1, b1, b2 , r2;
		System.out.print("첫 번째 원의 중심과 반지름을 각각 입력하세요[3 5 8]>>");
		a1 = sc.nextInt();
		a2 = sc.nextInt();
		r1 = sc.nextInt();
		
		sc.nextLine();
		System.out.print("두 번째 원의 중심과 반지름을 각각 입력하세요[3 5 8]>>");
		b1 = sc.nextInt();
		b2 = sc.nextInt();
		r2 = sc.nextInt();
		
		double distance = Math.sqrt(Math.pow(a1-b1, 2) + Math.pow(a2-b2, 2));
		double radius_sum = r1 + r2;
		
		
		System.out.println("-----------------------------------");
		if(distance > radius_sum) {
			System.out.println("두 원은 만나지 않습니다.");
		}
		if(distance < radius_sum) {
			System.out.println("두 원은 두 개의 교점을 가집니다.");
		}
		if(distance == radius_sum) {
			System.out.println("두 원은 접합니다.");
		}
		
		System.out.println("첫 번째 원의 방정식: " + "(x-" + a1 +")" + " + (y-"+ a2+") = "+ r1*r1);
		System.out.println("두 번째 원의 방정식: " + "(x-" + b1 +")" + " + (y-"+ b2+") = "+ r2*r2);
		

		
	}
}