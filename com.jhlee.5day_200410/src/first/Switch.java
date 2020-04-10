package first;

public class Switch {

	public static void main(String[] args) {

		// 프로그램을 읽기 좋게 하지 위해서 상수 선언
		final String PD = "PD";
		final String 아나운서 = "아나운서";
		final String 기술_편집 = "기술_편집";

		// 키보드 입력 객체 만들기
		java.util.Scanner sc = new java.util.Scanner(System.in);
		// 메뉴입력받기
		System.out.println("이름 입력: ");
		String str = sc.nextLine();
		if (str.equals("이주형")) {
			System.out.println("이주형");
		} else {
			System.out.println("없는 이름입니다.");
			return;
			// 되돌리는거
			// System.exit(0); - 프로그램 종료
		}
		System.out.println("지원분야(PD, 아나운서, 기술_편집): ");
		String job = sc.nextLine();

		// switch를 이용한 처리
		switch (job) {
		case PD:
			System.out.println("PD-001");
			break;
		case 아나운서:
			System.out.println("아나운서-002");
			break;
		case 기술_편집:
			System.out.println("기술_편집-003");
			break;
		default:
			System.out.println("잘못된 입력");
			System.exit(0);

		}
		System.out.println("토익점수 입력(0~990):");
		int score = sc.nextInt();
		// 입력조건 만들기

		if (score >= 700 && score <= 990) {
			System.out.println("배점: 5.0");
		} else if (score >= 500 && score <= 699) {
			System.out.println("배점: 4.5");
		} else if (score >= 300 && score <= 499) {
			System.out.println("배점: 4.0");
		} else if (score >= 100 && score <= 299) {
			System.out.println("배점: 3.5");
		} else if (score >= 0 && score <= 99) {
			System.out.println("배점: 3");
		} else {
			System.out.println("잘못된 입력");
			System.exit(0);
		}
		sc.close();
	}
}
