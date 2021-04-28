package java15.ref_type.com.lec206.ex99_exercise;

import java.util.Random;
import java.util.stream.IntStream;

public class Lotto {

	public static void main(String[] args) {
		//Stream Lotto Ver1. 중복숫자가 생성됨
//		IntStream lotto = new Random().ints(6,1,45);
//		lotto.forEach(a->System.out.print(a+ " "));
		
		//Stream Lotto Ver2. 중복숫자가 생성되서 distinct추가.
//		IntStream lotto = new Random().ints(6,1,45).distinct();
//		lotto.forEach(a->System.out.print(a+ " "));
		
		//Stream Lotto Ver3. 중복숫자가 제거될경우 출력객체가 줄어듬(distinct위치를 바꿔도 같음 = 생성하고 삭제하는거니까.)
		IntStream lotto = new Random().ints(6,1,45);
		lotto.distinct().forEach(a->System.out.print(a+ " "));
		
		//해결방안1 lotto를 배열로 생성해서 peek()안에서 (Random)값을 주면서 (distinct를 동시에 처리 하고 나가기)
		//해결방안2 (Math :: random)사용이 가능한가?

	}

}
