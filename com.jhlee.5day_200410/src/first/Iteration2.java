package first;

public class Iteration2 {

	public static void main(String[] args) {
		//image1.png, image2.png, imgae3.png�� �����ư��鼭 3���� ���
		//�������
		//int idx = 0;
		//while(idx < 12) {//-������
			//	System.out.println("Image" + (4-(idx % 3 + 1)) + ".png");
				//�߰��� ������ ����
			//idx = idx + 1;
		
		int [] ar = {700, 600, 500, 430};
		int idx = 0;
		int sum = 0;
		do {
			//�ݺ��� ����
			sum = sum + ar[idx];
			idx = idx + 1;
			}while(idx<5);
		System.out.println("�հ�: " + sum);
	
	}
}