package project1.pac5;
import java.util.Scanner;
public class Mainclass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start=0, end=0;
		do {
			System.out.print("����ϰ� ���� ������ ������ �Է��ϼ���[2��-30��]");
			start = sc.nextInt();
			end = sc.nextInt();
		}
		while(start < 2 || end > 30 || start ==end  || start > end); {
			System.out.println("<" + start + "-" + end + "�� ������ ���!>");
			for(int k = 0; k< 4; k++) {
				System.out.println();
			}
			
		}
			for(int p =1; p<=9;p++) {
				System.out.print(" |   ");
			for(int i =start ; i<=(start+end)/2; i++) {
				if(p*i>=10 && p*i<100) {
					System.out.print(i+" x " + p + " = " + p*i+ "   |  ");
				}
				else if (p*i>=100) {
					System.out.print(i+" x " + p + " = " + p*i+ "  |  ");
				}
				else 
				{
					System.out.print(i+" x " + p + " = " + p*i+ "    |  ");
				}
			}
			System.out.println();
		}
		System.out.println("");
		for(int p =1; p<=9;p++) {
			System.out.print(" |   ");
			for(int i = ((start+end)/2) +1 ; i<=end; i++) {
				if(p*i>=10 && p*i<100) {
					System.out.print(i+" x " + p + " = " + p*i+ "   |  ");
				}
				else if (p*i>=100) {
					System.out.print(i+" x " + p + " = " + p*i+ "  |  ");
				}
				else 
				{
					System.out.print(i+" x " + p + " = " + p*i+ "    |  ");
				}
			}
			System.out.println();
		}	
	}
}