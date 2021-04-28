package java15.ref_type.com.lec206.ex99_exercise;

import java.util.Arrays;
//작성자 : GunSmoke1992
//작성일자 : 2021-04-28
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student("성상현"),
										   new Student("박상현"), 
										   new Student("이상현"), 
										   new Student("진상현"), 
										   new Student("오상현"), 
										   new Student("목상현"), 
										   new Student("김상현") 
				);
		
		
		System.out.println("등수 학생이름 국어 영어 수학 총점 평균");
		System.out.println("=======================================");
		studentList.stream().sorted().forEach(a-> System.out.println(" "+(Student.rank += 1)+"   " +a.getName()+"   "+a.getKorScores()+"   "+a.getEngScores()+"   "+a.getMathScores()
																	+"   "+a.getTotal()+"  "+a.getAverage()));
		

		
		
		

	}

}
