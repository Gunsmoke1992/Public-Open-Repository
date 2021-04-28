package java15.ref_type.com.lec206.ex99_exercise;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FindMax {
	
	/*
		
		findMax 메서드의 리턴타입을 int로 주고 int max = 를 return 하려고 했는데 문제점을 모르겟음	
		
		IntStream에값을 대입함.of(arrint[]배열의 값들을 넣음).max()그중 최대숫자를 구하고.getAsInt()인트값으로 리턴
		
		int max를 제외하고 IntStream부분도 return을 해봣지만 답이 없음
		
	 */

	public static void main(String[] args) {
		
		//호출!
		FindMax.findMax(9);
	
	
	}
	
	static int[] arrint;
	static Scanner scan = new Scanner(System.in);
	
	static void findMax(int num) {
		arrint = new int[num];
		
		//아래의 정수입력받는 부분인 Scanner를 stream안에 대입가능한지의 여부를 확인해보자
			for(int i = 0; i <arrint.length; i++) { 
				System.out.println((i+1)+"번째 정수 입력!"); 
				arrint[i]= scan.nextInt();
				}
			//초안 : int max = Arrays.stream(arrint).max().getAsInt();
			 int max = IntStream.of(arrint).max().getAsInt(); 
			
			 System.out.println("입력하신 정수중 최대숫자 : " +max);
		}
	
}
