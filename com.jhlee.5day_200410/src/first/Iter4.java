package first;

public class Iter4 {

	public static void main(String[] args) {
		int [] ar = { 700, 600, 500, 430 };
		//���� �������� ����� ���ϴµ�
		//10�� �ڸ����� �ݿø��Ͻÿ�.
		//���� 600 - �հ� 2230, ��� 557
		int sum = 0;
		int idx = 0;
		do {
			// ar�� �����͸� ������� sum�� �߰�
			sum = sum + ar[idx];
			idx = idx + 1;
		} while (idx < 4);
			System.out.println("�հ�: " + sum);
			//�հ� ���ϱ�
		double avg = sum / 4.0;
			System.out.println("���: " + avg);
			//��� ���ϱ�(�հ� ������ ����)
		avg = avg / 100 + 0.5;
		avg = (int)avg*100;

		//double imsi = avg / 100 + 0.5;
		//imsi = (int)(imsi + 0.5);
		//avg = (int)imsi * 100;
			System.out.println("���: " + avg);
			//�ݿø��ϱ�
			//�ٽ� �ǵ����� + �Ҽ��� ������
	}

}
