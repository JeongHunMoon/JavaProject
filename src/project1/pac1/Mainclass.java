package project1.pac1;

import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputstring; 
		char[] inputchar; 
		char[][] alphabet = new char[2][]; 
		String alphabetstring_1 = "abcdefghijklmnopqrstuvwxyz";
		String alphabetstring_2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		alphabet[0] = alphabetstring_1.toCharArray();
		alphabet[1] = alphabetstring_2.toCharArray();
		
		System.out.print("�ܾ �Է��ϼ���[��ҹ��� ��� �Է� ����]: ");
		inputstring = sc.nextLine();
		inputchar = inputstring.toCharArray();
		
		
		int[] count = new int[26];
		for(int i = 0;  i < inputchar.length; i++) {
			for(int j = 0; j < 26; j++) {
				if(inputchar[i] == alphabet[0][j] || inputchar[i] ==alphabet[1][j] ) {
					count[j]++;
				}
			}
		}
		
		int maxcount=0;
		for(int i = 0; i <26; i++) {
			if(count[i] > maxcount) {
				maxcount = count[i];
			}
		}
		
		System.out.print('\n'+"���� ���� ���� ���ĺ���:");
		for(int i = 0; i <25; i++) {
			if(count[i] == maxcount) {
				System.out.print(" "+alphabet[0][i]);
			}
		}
	}
}