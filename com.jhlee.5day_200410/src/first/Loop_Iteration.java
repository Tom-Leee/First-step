package first;

public class Loop_Iteration {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
			
		//출발점 생성
		//int idx = 1;
		//while(idx < 4) { //or (idx < 3) //-종료점 {
			//System.out.println("Java" + idx);
			//중간에 수행할 내용
			//idx = idx + 1;
		//System.out.println("============");
		
		//int idx = 1;
		//while(idx < 5) { //or (idx < 3) //-종료점 {
			//System.out.println("Image" + idx + ".png");
			//중간에 수행할 내용
			//idx = idx + 1;
		//}
		//idx = 1;
		//while(idx < 5) { //or (idx < 3) //-종료점 {
				//System.out.println("Image" + idx + ".png");
				//중간에 수행할 내용
				//idx = idx + 1;
		//}
		int idx = 0;
		while(idx < 9) { //or (idx < 3) //-종료점 {
		
				System.out.println("Image" + (idx%4) + ".pngg");
				//중간에 수행할 내용			
				idx = idx + 1;
		}
			sc.close();
		}
	}

