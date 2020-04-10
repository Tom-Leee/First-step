package first;

public class Iter4 {

	public static void main(String[] args) {
		int [] ar = { 700, 600, 500, 430 };
		//위의 데이터의 평균을 구하는데
		//10의 자리에서 반올림하시오.
		//답은 600 - 합계 2230, 평균 557
		int sum = 0;
		int idx = 0;
		do {
			// ar의 데이터를 순서대로 sum에 추가
			sum = sum + ar[idx];
			idx = idx + 1;
		} while (idx < 4);
			System.out.println("합계: " + sum);
			//합계 구하기
		double avg = sum / 4.0;
			System.out.println("평균: " + avg);
			//평균 구하기(합계 나누기 개수)
		avg = avg / 100 + 0.5;
		avg = (int)avg*100;

		//double imsi = avg / 100 + 0.5;
		//imsi = (int)(imsi + 0.5);
		//avg = (int)imsi * 100;
			System.out.println("평균: " + avg);
			//반올림하기
			//다시 되돌리기 + 소수점 버리기
	}

}
