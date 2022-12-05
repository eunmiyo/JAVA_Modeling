package java.modeling.ch01.aggregation;

/*
 * 합성관계
 * 부분 객체를 여러 객체가 공유할 수 없다.
 * 메모리에서 전체가 사라지면 부분도 사라진다.
 */
public class Computer {
	private MainBord mb;
	private CPU c;
	private Memory m;
	private PowerSupply ps;
	
	public Computer() {
		this.mb = new MainBord();
		this.c = new CPU();
		this.m = new Memory();
		this.ps = new PowerSupply();
	}
}
