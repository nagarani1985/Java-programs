package info.java;

public class Staticblock {
	static {
		System.out.println("Static block is executed");
	}

	public static void main(String[] args) {
		Staticblock sb=new Staticblock();
		sb.m();
		sb.main(args);
	}
public static void m() {
	System.out.println("Static method is executed");
}
}
