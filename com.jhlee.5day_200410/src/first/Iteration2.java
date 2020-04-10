package first;

public class Iteration2 {

	public static void main(String[] args) {
		//image1.png, image2.png, imgae3.png를 번갈아가면서 3번씩 출력
		//▼시작점
		//int idx = 0;
		//while(idx < 12) {//-종료점
			//	System.out.println("Image" + (4-(idx % 3 + 1)) + ".png");
				//중간에 수행할 내용
			//idx = idx + 1;
		
		int [] ar = {700, 600, 500, 430};
		int idx = 0;
		int sum = 0;
		do {
			//반복할 내용
			sum = sum + ar[idx];
			idx = idx + 1;
			}while(idx<5);
		System.out.println("합계: " + sum);
	
	}
}