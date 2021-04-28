package java15.ref_type.com.lec206.ex99_exercise;
//작성자 : GunSmoke1992
//작성일자 : 2021-04-28

						//sorted부분에서 객체필드값 비교를 위해 참조추가했음.
public class Student implements Comparable<Student> {
	
	//필수필드 : 이름 , 과목점수*3
	public String name;
	public int mathScores;
	public int engScores;
	public int korScores;
	
	//다른 메서드를 이용하여 출력할수 있을거 같은 필드 : total, average, rank 
	public int total;
	public double average;
	
	//반복문에서 사용되고 순위출력시 마다 1씩 늘어나야 해서 static으로 지정
	public static int rank=0;

	
	//처음에는 점수를 다 받으면서 했지만, Sorted의 동작여부 확인을 위해 과목점수3개를 랜덤정수를 받는 메서드로 교체
	public Student(String name) {
		this.name = name;
		this.mathScores = (int)randomScore();
		this.engScores = (int)randomScore();
		this.korScores = (int)randomScore();
		this.total = korScores+engScores+mathScores;
		this.average = this.total;

	}
	
	public Student(String name, int math, int kor, int eng) {
		this.name = name;
		this.mathScores = math;
		this.engScores = eng;
		this.korScores = kor;
		this.total = korScores+engScores+mathScores;
		this.average = this.total;

	}
	
	

	
	//점수를 램덤하게 생성!
		double randomScore() {
		return Math.floor(Math.random() * 100) + 1;
	}
		
		

		//정보 출력을 위한 get부분
		
	public String getName() {return name;}
	
	//아래의 주석부분 질문하기!
	public int getMathScores() {
//			if(mathScores < 10) {
//				System.out.print(" ");
//				return mathScores;
//			}
		return mathScores;}

	public int getEngScores() {
//		if(engScores < 10) {
//			System.out.print(" ");
//			return engScores;
//		}
		return engScores;}
	
	public int getKorScores() {
//		if(korScores < 10) {
//			System.out.print(" ");
//			return korScores;
//		}
		return korScores;}
		
	public int getTotal() {return korScores+engScores+mathScores;}
	
	//현제 average의 값 = total -> total/3 으로 평균을 구한뒤 Math.round함수로 소수점 첫번째 자리까지 표시(포트폴리오 출력문 기준)
	public double getAverage() { 
		average = average/3;
		;
		return Math.round(average); }
	
	
	





		
		//순위비교를 위해 사용한 값 : total(총점수) 
		//내림차순으로 정렬하기 위해 1과 -1의 위치를 교체해줬음.
		@Override
		public int compareTo(Student o) {
			if(this.total < o.total) {return 1;
			}else if(this.total == o.total) return 0;
			return -1;
			}





}
