package poly.basic;

public class PolyMain {

	public static void main(String[] args) {

		Child child = new Child();
		Parent parent1 = (Parent) child; //업캐스팅은 생략 가능, 생략 권장
		Parent parent2 = child; //업캐스팅 생략
		parent1.method();
		parent2.method();
	}





}

