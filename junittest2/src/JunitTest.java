
public class JunitTest {	
		public int add(int a, int b) {
			return a + b;
		}
		
		public int subtract(int a, int b) {
			return a-b;
		}
		
		public int multiply(int a, int b) {
			return a * b;
		}
		
		public int devide(int a, int b) {
			if (b == 0) {
				throw new IllegalArgumentException("Divisor cannnot be zero");
			}
			return a / b;
		}
		
		System.out.println("프로젝트를 수정해 보았습니다.")
	
}
