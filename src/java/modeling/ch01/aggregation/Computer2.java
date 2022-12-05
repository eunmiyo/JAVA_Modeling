package java.modeling.ch01.aggregation;

/*
 * 집약 관계
 * 부분 객체를 여러 객체가 공유할 수 있다.
 * 메모리에서 전체가 사라져도 부분은 사라지지 않는다.
 */
public class Computer2 {
	private MainBord mb;
	private CPU c;
	private Memory m;
	private PowerSupply ps;
	
	public Computer2(MainBord mb, CPU c, Memory m, PowerSupply ps) {
		this.mb = mb;
		this.c = c;
		this.m = m;
		this.ps = ps;
	}
}
