package first;

public class Switch {

	public static void main(String[] args) {

		// ���α׷��� �б� ���� ���� ���ؼ� ��� ����
		final String PD = "PD";
		final String �Ƴ�� = "�Ƴ��";
		final String ���_���� = "���_����";

		// Ű���� �Է� ��ü �����
		java.util.Scanner sc = new java.util.Scanner(System.in);
		// �޴��Է¹ޱ�
		System.out.println("�̸� �Է�: ");
		String str = sc.nextLine();
		if (str.equals("������")) {
			System.out.println("������");
		} else {
			System.out.println("���� �̸��Դϴ�.");
			return;
			// �ǵ����°�
			// System.exit(0); - ���α׷� ����
		}
		System.out.println("�����о�(PD, �Ƴ��, ���_����): ");
		String job = sc.nextLine();

		// switch�� �̿��� ó��
		switch (job) {
		case PD:
			System.out.println("PD-001");
			break;
		case �Ƴ��:
			System.out.println("�Ƴ��-002");
			break;
		case ���_����:
			System.out.println("���_����-003");
			break;
		default:
			System.out.println("�߸��� �Է�");
			System.exit(0);

		}
		System.out.println("�������� �Է�(0~990):");
		int score = sc.nextInt();
		// �Է����� �����

		if (score >= 700 && score <= 990) {
			System.out.println("����: 5.0");
		} else if (score >= 500 && score <= 699) {
			System.out.println("����: 4.5");
		} else if (score >= 300 && score <= 499) {
			System.out.println("����: 4.0");
		} else if (score >= 100 && score <= 299) {
			System.out.println("����: 3.5");
		} else if (score >= 0 && score <= 99) {
			System.out.println("����: 3");
		} else {
			System.out.println("�߸��� �Է�");
			System.exit(0);
		}
		sc.close();
	}
}
