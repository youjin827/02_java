package type.primitive;

/**
 * int : 정수형 타입중 가장 기본/대표 타입
 * ----------------------------------------------
 * int 타입을 테스트하는 클래스이다.
 * 
 *
 */

public class IntTest {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		// 선언할 때 , 한 줄에 변수는 콤마(,)로 나열하여 여러 개 선언 가능
		// 이 때 타입은 맨 앞 한번만 선언하면 된다.
		int num1 = 5 , num2 = 28;
		int num3, num4, num5;
		
		int num6; // 강사님은 한 줄에 하나의 선언을 선호. 가독성 더 좋음.

		// num3, num4, num5 에 대해서 
		// num1, num2 의 연산 결과로 초기화
		num3 = num1 * num2; //곱셈
		num4 = num2 / num1; //나눗셈 몫
		num5 = 25 / num1;   //나눗셈 몫
		
		// 3. 사용 : 변수 값 출력
		System.out.println("5 * 28 = " + num3);
		System.out.println("28 / 5 = " + num4);
		System.out.println("25 / 5 = " + num5);
	}

}
