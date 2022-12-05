package java.modeling.ch01.aggregation;

public class Main {

	public static void main(String[] args) {		
		/*
		 * 합성 관계
		 * 컴퓨터객체를 생성하면 컴퓨터 부품들이 다 생성된다.
		 * 컴퓨터객체가 사라지면 부품들도 사라진다.
		 */	
		Computer com = new Computer(); 
		com = null;
		
		/*
		 * 집약 관계
		 * 컴퓨터객체와 부품객체를 모두 생성
		 * 컴퓨터가 사라져도 부품들은 사라지지 않는다.
		 */	
		MainBord mb = new MainBord();
		CPU c = new CPU();
		Memory m = new Memory();
		PowerSupply ps = new PowerSupply();
		
		Computer2 com2 = new Computer2(mb, c, m, ps);
		com2 = null; 
		
	}

}
