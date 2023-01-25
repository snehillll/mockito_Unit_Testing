package abc;

public class Addition {
	
	private AdditionService service;
	
	public Addition() {}
	
	public Addition(AdditionService service) {
		this.service=service;
	}
	
	public int addition(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	public int add(int a, int b) {
		return a+b;
	}
}
