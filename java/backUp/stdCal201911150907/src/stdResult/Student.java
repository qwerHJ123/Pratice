package stdResult;
public class Student {
	 private String name;
	 private int std;
	 private int kor;
	 private int math;
	 private int eng;
	 private int sum;
	 private int avg;
	 
	 
//	  this.std = std;
//	  this.kor = kor;
//	  this.math = math;
//	  this.eng = eng;
//	  this.sum = kor + math + eng;
//	  this.avg = sum / 3;
//	 
	 public String toString(){
		 String abc = "학생's name " + name + " 학번은 " + std + " 총점은 " + sum + " 평균은 " + avg +
				    "입니다.";
	  return abc;
	 }
	 
	public String getName(String name) {
		return name;
	}
	public int getStd(int std) {
		return std;
	}
	public int getKor(int kor) {
		return kor;
	}
	public int getEng(int eng) {
		return eng;
	}
	public int getEnMath(int math) {
		return math;
	}
	
	
  	public String setName(String name) {
	 this.name = name;
	 return this.name;
  	}
	 public int setStd(int std) {
		 this.std = std;
		 return this.std;
	 }
	 
	 public int setSum(int avr) {
		 avr = (kor+eng+math)/3;
		 return avr;
	 }
}