
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
	
}
