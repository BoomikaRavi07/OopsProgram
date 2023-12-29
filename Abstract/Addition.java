package Abstract;

public class Addition {
	int num1 = 10;
	int num2 = 20;
	int num3 = 40;
	
	public int test1() {
		return num1+num2;
	}
	public int test2() {
		return num1+num2+num3;
	}
	public class Subraction extends Addition{
		
		public int test3() {
			return num1-num2;
		}
		public int test4() {
			return num3-num2;
		}
		
	}

}
