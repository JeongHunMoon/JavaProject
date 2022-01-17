package project1.pac5;
import java.util.Scanner;
public class Mainclass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start=0, end=0;
		do {
			System.out.print("출력하고 싶은 구구단 범위를 입력하세요[2단-30단]");
			start = sc.nextInt();
			end = sc.nextInt();
		}
		while(start < 2 || end > 30 || start ==end  || start > end); {
			System.out.println("<" + start + "-" + end + "단 구구단 출력!>");
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