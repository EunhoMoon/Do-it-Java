package inheritance;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}

	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}

	public void fly() {
		System.out.println("하늘을 날아갑니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {

		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		
	}

	public void moveAnimal(Animal animal) {
		animal.move();

		// 상속관계의 다운 캐스팅에 앞서 인스턴스의 타입을 검사한다.
		// 상속관계에서 해결이 가능하다면 다운 캐스팅하지 않는 것이 좋다.
		if (animal instanceof Human) {
			Human human = (Human)animal;
			human.readBook();
		} else if (animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
			tiger.hunting();
		} else if (animal instanceof Eagle) {
			Eagle eagle = (Eagle)animal;
			eagle.fly();
		} else {
			System.out.println("지원하지 않는 기능입니다.");
		}
	}

}
