package project1.pac3;
import java.util.Scanner;
public class Mainclass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total_subject_number;
		System.out.print("총 과목수를 입력하세요>>");
		total_subject_number = sc.nextInt();
		sc.nextLine();
		
		String[] subject = new String[total_subject_number];
		String[] subject_score = new String[total_subject_number];
		double[] subject_real_score= new double[total_subject_number];
		for(int i = 0; i <total_subject_number; i++) {
			System.out.print(i+1 +"번째 과목명을 입력하세요>>");
			subject[i] = sc.nextLine();
			System.out.print(i+1 + "번째 학점을 대문자로 입력하세요[A+~F]>>");
			subject_score[i] = sc.nextLine();
		}
		
		for(int i =0; i<total_subject_number; i++) {
			switch(subject_score[i]) {
			case "A+" :
				subject_real_score[i] = 4.5;
				break;
			case "A" :
				subject_real_score[i] = 4.0;
				break;
			case "B+" :
				subject_real_score[i] = 3.5;
				break;
			case "B" :
				subject_real_score[i] = 3.0;
				break;
			case "C+" :
				subject_real_score[i] = 2.5;
				break;
			case "C" :
				subject_real_score[i] = 2.0;
				break;
			case "D+" :
				subject_real_score[i] = 1.5;
				break;
			case "D" :
				subject_real_score[i] = 1.0;
				break;
			case "F" :
				subject_real_score[i] = 0;
				break;
			default:
				break;
				
			}
		}
		
		System.out.println('\n'+"-----------------------------------------------");
		double k = 4.5;
		for(int i =0; i<9; i++) {
			for(int j=0;j<total_subject_number;j++) {
				if(subject_real_score[j] == k) {
					System.out.println(subject[j] +": " + subject_score[j]);
				}
			}
			k = k-0.5;
		}
			
		
		double total_scor =0.0;
		for(int i=0; i<total_subject_number; i++) {
			total_scor +=subject_real_score[i];
		}
		total_scor = total_scor / total_subject_number;
		System.out.println("총 학점 평균은 : " + String.format("%3f", total_scor) + "점입니다.");
		
	}
}
