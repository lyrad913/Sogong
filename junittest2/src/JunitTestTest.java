import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JunitTestTest {
	private JunitTest junit;
	
	@BeforeEach
	void setUp() throws Exception {
		junit = new JunitTest();
		System.out.println("새 Junit 인스턴스 생성");
	}

	@Test
	void testAdd() {
		System.out.println("덧셈 테스트 시작");
		assertEquals(5, junit.add(2, 3), "2 + 3 should equal 5");
		System.out.println("덧셈 테스트 통과 2 + 3 = "+junit.add(2, 3));
	}

	@Test
	void testSubtract() {
		System.out.println("뺄셈 테스트 시작");
		assertEquals(1, junit.subtract(4, 3), "4 - 3 should equal 1");
		System.out.println("뺄셈 테스트 통과 4 - 3 = " + junit.subtract(4, 3));	}

	@Test
	void testMultiply() {
		System.out.println("곱셈 테스트 시작");
		assertEquals(6, junit.multiply(2, 3), "2 * 3 should equal 6");
		System.out.println("곱셈 테스트 통과 2 * 3 = "+junit.multiply(2, 3));	}

	@Test
	void testDevide() {
		System.out.println("나눗셈 테스트 시작");
		assertEquals(2, junit.devide(6, 3), "6 / 3 should equal 2");
		System.out.println("나눗셈 테스트 통과 6 / 3 = " + junit.devide(6, 3));	}
	
	@Test
	void testDevideByZero() {
		System.out.println("0으로 나누기 테스트 시작");
		assertThrows(IllegalArgumentException.class, () -> junit.devide(1, 0), 
				"Divisor cannot be zero");
		System.out.println("0으로 나누기 예외 처리 테스트 통과");
	}
}
