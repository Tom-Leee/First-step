package first;

public class Loop_Iteration {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
			
		//����� ����
		//int idx = 1;
		//while(idx < 4) { //or (idx < 3) //-������ {
			//System.out.println("Java" + idx);
			//�߰��� ������ ����
			//idx = idx + 1;
		//System.out.println("============");
		
		//int idx = 1;
		//while(idx < 5) { //or (idx < 3) //-������ {
			//System.out.println("Image" + idx + ".png");
			//�߰��� ������ ����
			//idx = idx + 1;
		//}
		//idx = 1;
		//while(idx < 5) { //or (idx < 3) //-������ {
				//System.out.println("Image" + idx + ".png");
				//�߰��� ������ ����
				//idx = idx + 1;
		//}
		int idx = 0;
		while(idx < 9) { //or (idx < 3) //-������ {
		
				System.out.println("Image" + (idx%4) + ".pngg");
				//�߰��� ������ ����			
				idx = idx + 1;
		}
			sc.close();
		}
	}

